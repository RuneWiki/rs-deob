import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class93 extends class233 {

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field1204 = 0;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field1205 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)V", line = 7)
    public static void method671(byte arg0) {
        field1205 = null;
        if (arg0 < 34) {
            field1205 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 17)
    public static final void method672(int arg0) {
        if (arg0 < 76) {
            field1204 = -33;
        }
        field1206++;
        class62.field777.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIZ)Ljava/lang/String;", line = 28)
    public static final String method673(int arg0, int arg1, int arg2, boolean arg3) {
        field1207++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg3 && arg0 >= 0) {
            if (arg2 != -1556668830) {
                field1204 = 103;
            }
            int var4 = 2;
            for (int var5 = arg0 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg1;
                int var9 = var8 - (arg0 * arg1);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)V", line = 81)
    public static final void method674(boolean arg0, int arg1) {
        if (arg1 != 6497794) {
            return;
        }
        field1209++;
        if (class58.field739 != arg0) {
            class58.field739 = arg0;
            class143.method1111(-20);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIII)V", line = 108)
    public static final void method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1208++;
        class96.method697((byte) 115, class331.field4902[arg4], arg3, arg2 - arg5, arg2 + arg5);
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg5 * arg5;
        if (arg0 != -593542495) {
            return;
        }
        int var9 = arg1 * arg1;
        int var10 = var8 << 1;
        int var11 = arg1 << 1;
        int var12 = var9 << 1;
        int var13 = var9 - (var11 - 1) * var10;
        int var14 = (1 - var11) * var8 + var12;
        int var15 = var8 << 2;
        int var16 = ((var6 << 1) + 3) * var12;
        int var17 = ((arg1 << 1) - 3) * var10;
        int var18 = var9 << 2;
        int var19 = (var6 + 1) * var18;
        int var20 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var6++;
                    var14 += var16;
                    var13 += var19;
                    var19 += var18;
                    var16 += var18;
                }
            }
            var7--;
            if (var13 < 0) {
                var13 += var19;
                var14 += var16;
                var16 += var18;
                var19 += var18;
                var6++;
            }
            int var21 = arg4 - var7;
            var14 += -var20;
            int var22 = arg2 + var6;
            var20 -= var15;
            int var23 = arg4 + var7;
            var13 += -var17;
            var17 -= var15;
            int var24 = arg2 - var6;
            class96.method697((byte) 115, class331.field4902[var21], arg3, var24, var22);
            class96.method697((byte) 115, class331.field4902[var23], arg3, var24, var22);
        }
    }
}
