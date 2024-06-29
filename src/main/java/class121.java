import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class121 {

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Z")
    public static boolean field1763 = false;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field1761 = 0;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[I")
    public static int[] field1765 = new int[2];

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field1764 = 0;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lhc;")
    public static class229 field1758;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILhi;Lhi;IIIIJ)V")
    public static final void method788(int arg0, int arg1, int arg2, int arg3, class219 arg4, class219 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class264 var12 = new class264();
        var12.field4265 = arg10;
        var12.field4252 = arg1 * 128 + 64;
        var12.field4258 = arg2 * 128 + 64;
        var12.field4248 = arg3;
        var12.field4266 = arg4;
        var12.field4261 = arg5;
        var12.field4253 = arg6;
        var12.field4259 = arg7;
        var12.field4250 = arg8;
        var12.field4262 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class90.field1382[var13][arg1][arg2] == null) {
                class90.field1382[var13][arg1][arg2] = new class49(var13, arg1, arg2);
            }
        }
        class90.field1382[arg0][arg1][arg2].field631 = var12;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method789(byte arg0) {
        field1765 = null;
        field1758 = null;
        int var1 = 45 % ((-arg0 - 15) / 47);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([IB)[I")
    public static final int[] method790(int[] arg0, byte arg1) {
        field1762++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 102) {
            method792(-64, -33, (byte) 92, -28, 126);
        }
        int[] var2 = new int[arg0.length];
        class196.method1354(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
    public static final void method791(int arg0, int arg1, int arg2) {
        field1766++;
        class287 var3 = class261.method1786(arg1, false, arg2);
        var3.method1914((byte) 46);
        var3.field4547 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBII)V")
    public static final void method792(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = 102 / ((-arg2 - 44) / 59);
        int var6 = 0;
        field1760++;
        int var7 = arg1;
        int var8 = -1;
        int var9 = class34.method273(class96.field1484, arg4 + arg1, false, class51.field710);
        int var10 = -arg1;
        int var11 = class34.method273(class96.field1484, arg4 - arg1, false, class51.field710);
        class8.method52(var11, class106.field1637[arg3], var9, arg0, true);
        while (var6 < var7) {
            var8 += 2;
            var10 += var8;
            if (var10 > 0) {
                var7--;
                var10 -= var7 << 1;
                int var12 = arg3 - var7;
                int var13 = arg3 + var7;
                if (var13 >= class110.field1669 && class189.field2984 >= var12) {
                    int var14 = class34.method273(class96.field1484, arg4 + var6, false, class51.field710);
                    int var15 = class34.method273(class96.field1484, arg4 - var6, false, class51.field710);
                    if (var13 <= class189.field2984) {
                        class8.method52(var15, class106.field1637[var13], var14, arg0, true);
                    }
                    if (class110.field1669 <= var12) {
                        class8.method52(var15, class106.field1637[var12], var14, arg0, true);
                    }
                }
            }
            var6++;
            int var16 = arg3 + var6;
            int var17 = arg3 - var6;
            if (class110.field1669 <= var16 && var17 <= class189.field2984) {
                int var18 = class34.method273(class96.field1484, arg4 + var7, false, class51.field710);
                int var19 = class34.method273(class96.field1484, arg4 - var7, false, class51.field710);
                if (var16 <= class189.field2984) {
                    class8.method52(var19, class106.field1637[var16], var18, arg0, true);
                }
                if (var17 >= class110.field1669) {
                    class8.method52(var19, class106.field1637[var17], var18, arg0, true);
                }
            }
        }
    }
}
