import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class102 extends class29 {

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field1742 = 0;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    private int field1747;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "Lck;")
    public static class1 field1738;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "Lph;")
    public class229 field1744;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "Lsl;")
    public static class283 field1736;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "Lsi;")
    public static class66 field1741;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "[[S")
    public static short[][] field1746;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lhb;B)V", line = 4)
    public final void method780(class164 arg0, byte arg1) {
        field1748++;
        while (true) {
            int var3 = arg0.method1178(8);
            if (var3 == 0) {
                if (arg1 > -84) {
                    method781((byte) 66, 118, 51, -85, -125, -105, 84, -75, -78, -52);
                }
                return;
            }
            this.method784(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BIIIIIIIII)V", line = 30)
    public static final void method781(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1743++;
        if (arg0 != 103) {
            method785(-72, -47, 102, 96, 41);
        }
        if (arg7 == arg9 && arg2 == arg4 && arg1 == arg6 && arg5 == arg8) {
            class122.method906(arg8, arg4, -1, arg3, arg7, arg1);
            return;
        }
        int var10 = arg7;
        int var11 = arg4;
        int var12 = arg7 * 3;
        int var13 = arg4 * 3;
        int var14 = arg9 * 3;
        int var15 = arg2 * 3;
        int var16 = arg6 * 3;
        int var17 = var16 + var12 - var14 - var14;
        int var18 = var14 + arg1 - var16 - arg7;
        int var19 = arg5 * 3;
        int var20 = var13 + var19 - var15 - var15;
        int var21 = var15 + arg8 - var19 - arg4;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var17 * var25;
            int var29 = var21 * var26;
            int var30 = var22 * var24;
            int var31 = var20 * var25;
            int var32 = var23 * var24;
            int var33 = (var31 + var32 + var29 >> 12) + arg4;
            int var34 = (var27 + var28 + var30 >> 12) + arg7;
            class122.method906(var33, var11, -1, arg3, var10, var34);
            var10 = var34;
            var11 = var33;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)Z", line = 105)
    public final boolean method782(boolean arg0) {
        if (arg0) {
            this.method780((class164) null, (byte) -48);
        }
        field1735++;
        return this.field1747 == 115;
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)V", line = 124)
    public static void method783(int arg0) {
        field1738 = null;
        if (arg0 != 128) {
            field1738 = (class1) null;
        }
        field1746 = (short[][]) null;
        field1736 = null;
        field1741 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZILhb;)V", line = 141)
    private final void method784(boolean arg0, int arg1, class164 arg2) {
        if (arg1 == 1) {
            this.field1747 = arg2.method1178(8);
        } else if (arg1 == 2) {
            this.field1737 = arg2.method1191(31776);
        } else if (arg1 == 5) {
            this.field1744 = arg2.method1190(0);
        }
        if (!arg0) {
            this.field1737 = -90;
        }
        field1734++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V", line = 168)
    public static final void method785(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class332 var5 = (class332) class75.field1266.method1580((byte) -39); var5 != null; var5 = (class332) class75.field1266.method1579((byte) 28)) {
            class249.method1749(0, arg0, arg4, arg1, var5, arg3);
        }
        for (class332 var6 = (class332) class299.field4866.method1580((byte) -39); var6 != null; var6 = (class332) class299.field4866.method1579((byte) 28)) {
            byte var7 = 1;
            if (var6.field5655.field5153 == var6.field5655.field5115) {
                var7 = 0;
            } else if (var6.field5655.field5115 == var6.field5655.field5101) {
                var7 = 2;
            }
            if (var6.field5659 != var7) {
                int var8 = class94.method701(var6.field5655, false);
                if (var6.field5644 != var8) {
                    if (var6.field5662 != null) {
                        class239.field3949.method2150(var6.field5662);
                        var6.field5662 = null;
                    }
                    var6.field5644 = var8;
                }
                var6.field5659 = var7;
            }
            var6.field5663 = var6.field5655.field5147;
            var6.field5651 = var6.field5655.field5147 + (var6.field5655.method1457(0) * 64);
            var6.field5641 = var6.field5655.field5168;
            var6.field5649 = var6.field5655.field5168 + var6.field5655.method1457(0) * 64;
            class249.method1749(0, arg0, arg4, arg1, var6, arg3);
        }
        class332 var9 = (class332) class122.field2049.method711(0);
        if (arg2 != 1) {
            field1738 = (class1) null;
        }
        while (var9 != null) {
            byte var10 = 1;
            if (var9.field5647.field5153 == var9.field5647.field5115) {
                var10 = 0;
            } else if (var9.field5647.field5115 == var9.field5647.field5101) {
                var10 = 2;
            }
            if (var9.field5659 != var10) {
                int var11 = class301.method2021((byte) 99, var9.field5647);
                if (var9.field5644 != var11) {
                    if (var9.field5662 != null) {
                        class239.field3949.method2150(var9.field5662);
                        var9.field5662 = null;
                    }
                    var9.field5644 = var11;
                }
                var9.field5659 = var10;
            }
            var9.field5663 = var9.field5647.field5147;
            var9.field5651 = var9.field5647.field5147 + var9.field5647.method1457(0) * 64;
            var9.field5641 = var9.field5647.field5168;
            var9.field5649 = var9.field5647.field5168 + (var9.field5647.method1457(0) * 64);
            class249.method1749(0, arg0, arg4, arg1, var9, arg3);
            var9 = (class332) class122.field2049.method718(27263);
        }
        field1739++;
    }
}
