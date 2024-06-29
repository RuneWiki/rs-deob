import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class131 {

    @OriginalMember(owner = "client!je", name = "e", descriptor = "J")
    public static long field1717 = 0L;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lll;")
    public static class398 field1721 = null;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public int field1716;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field1720;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "[[[I")
    public static int[][][] field1714;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBII)V")
    public static final void method941(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1718++;
        int var6 = -75 % ((arg3 + 17) / 37);
        int var7 = arg1 - arg5;
        int var8 = arg0 - arg2;
        if (var8 == 0) {
            if (var7 != 0) {
                class361.method2378(arg2, arg5, arg4, arg1, -1);
            }
        } else if (var7 == 0) {
            class169.method1130(arg0, arg4, arg5, true, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var8 < 0) {
                var8 = -var8;
            }
            boolean var9 = var7 > var8;
            if (var9) {
                int var10 = arg2;
                arg2 = arg5;
                int var11 = arg0;
                arg0 = arg1;
                arg5 = var10;
                arg1 = var11;
            }
            if (arg2 > arg0) {
                int var12 = arg2;
                arg2 = arg0;
                int var13 = arg5;
                arg0 = var12;
                arg5 = arg1;
                arg1 = var13;
            }
            int var14 = arg5;
            int var15 = arg0 - arg2;
            int var16 = arg1 - arg5;
            int var17 = -(var15 >> 1);
            int var18 = arg5 < arg1 ? 1 : -1;
            if (var16 < 0) {
                var16 = -var16;
            }
            if (var9) {
                for (int var20 = arg2; var20 <= arg0; var20++) {
                    var17 += var16;
                    class444.field6416[var20][var14] = arg4;
                    if (var17 > 0) {
                        var17 -= var15;
                        var14 += var18;
                    }
                }
            } else {
                for (int var19 = arg2; var19 <= arg0; var19++) {
                    var17 += var16;
                    class444.field6416[var14][var19] = arg4;
                    if (var17 > 0) {
                        var14 += var18;
                        var17 -= var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method942(int arg0) {
        field1714 = null;
        if (arg0 != -11602) {
            method941(6, -113, 83, (byte) -64, -103, -10);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)Lhq;")
    public static final class333 method943(int arg0, byte arg1) {
        if (arg1 < 83) {
            return null;
        }
        field1723++;
        class333 var2 = (class333) class125.field1617.method2348(112, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class217.field3026.method1235(0, false, arg0);
        } else {
            var3 = class128.field1669.method1235(0, false, arg0 & 0x7FFF);
        }
        class333 var4 = new class333();
        if (var3 != null) {
            var4.method2178(true, new class341(var3));
        }
        if (arg0 >= 32768) {
            var4.method2173(80);
        }
        class125.field1617.method2350(var4, (long) arg0, -79);
        return var4;
    }
}
