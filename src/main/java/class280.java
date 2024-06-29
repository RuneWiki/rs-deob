import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class280 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lsb;")
    public static class280 field3656 = new class280(1);

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lsb;")
    public static class280 field3660 = new class280(2);

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lsb;")
    public static class280 field3662 = new class280(4);

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Lsb;")
    public static class280 field3663 = new class280(1);

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lsb;")
    public static class280 field3664 = new class280(2);

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lsb;")
    public static class280 field3665 = new class280(4);

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lsb;")
    public static class280 field3666 = new class280(2);

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Lsb;")
    public static class280 field3667 = new class280(4);

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lei;")
    public static class331 field3668 = new class331();

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Z")
    public static boolean field3669 = false;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Lwg;")
    public static class58 field3670 = new class58(8);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
    private class280(int arg0) {
        this.field3654 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3657++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)V")
    public static final void method1747(int arg0, byte arg1) {
        class80.field1091 = arg0;
        class217.field2771 = -1;
        if (arg1 == -67) {
            class124.field1543 = -1;
            field3658++;
            class168.method1000((byte) -27);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
    public static final byte[] method1748(String arg0, boolean arg1) {
        field3661++;
        if (arg1) {
            field3660 = null;
        }
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method1749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field3659++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg0 - arg3;
        int var12 = arg5 - arg3;
        int var13 = arg0 * arg0;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class256.field3173[arg2];
        class373.method2275((byte) -9, arg1 - var11, arg7, arg1 - arg0, var39);
        if (arg6) {
            field3668 = null;
        }
        class373.method2275((byte) -9, arg1 + var11, arg4, arg1 - var11, var39);
        class373.method2275((byte) -9, arg0 + arg1, arg7, arg1 + var11, var39);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var41 = arg2 - var9;
            int var42 = arg2 + var9;
            int var43 = arg1 + var8;
            int var44 = arg1 - var8;
            if (var40) {
                int var45 = arg1 + var10;
                int var46 = arg1 - var10;
                class373.method2275((byte) -9, var46, arg7, var44, class256.field3173[var41]);
                class373.method2275((byte) -9, var45, arg4, var46, class256.field3173[var41]);
                class373.method2275((byte) -9, var43, arg7, var45, class256.field3173[var41]);
                class373.method2275((byte) -9, var46, arg7, var44, class256.field3173[var42]);
                class373.method2275((byte) -9, var45, arg4, var46, class256.field3173[var42]);
                class373.method2275((byte) -9, var43, arg7, var45, class256.field3173[var42]);
            } else {
                class373.method2275((byte) -9, var43, arg7, var44, class256.field3173[var41]);
                class373.method2275((byte) -9, var43, arg7, var44, class256.field3173[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method1750(byte arg0) {
        if (arg0 != -100) {
            return;
        }
        field3668 = null;
        field3665 = null;
        field3662 = null;
        field3656 = null;
        field3670 = null;
        field3667 = null;
        field3663 = null;
        field3666 = null;
        field3664 = null;
        field3660 = null;
    }
}
