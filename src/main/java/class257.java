import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class257 {

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "[I")
    private int[] field3901;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "[I")
    private int[] field3906;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Lcl;")
    private class115 field3903;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lcl;")
    private class115 field3896;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "[Lcl;")
    private class115[] field3904;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "J")
    public static long field3899 = 0L;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field3898 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Lve;")
    public static class233 field3908;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "[Lij;")
    public static class69[] field3902;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= -80) {
            field3898 = -114;
        }
        field3905++;
        if (arg7 < 1 || arg5 < 1 || arg7 > 102 || arg5 > 102) {
            return;
        }
        if (!class202.method1310(false) && (class189.field2684[0][arg7][arg5] & 0x2) == 0) {
            int var8 = arg3;
            if ((class189.field2684[arg3][arg7][arg5] & 0x8) != 0) {
                var8 = 0;
            }
            if (class31.field456 != var8) {
                return;
            }
        }
        int var9 = arg3;
        if (arg3 < 3 && (class189.field2684[1][arg7][arg5] & 0x2) == 2) {
            var9 = arg3 + 1;
        }
        class84.method566(class246.field3681[arg3], -30923, arg7, arg1, arg5, arg3, var9);
        if (arg6 < 0) {
            return;
        }
        boolean var10 = class48.field695;
        class48.field695 = true;
        class67.method458(arg7, arg5, arg2, arg4, false, class246.field3681[arg3], false, 4, arg6, arg3, var9);
        class48.field695 = var10;
        return;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLkl;)V")
    public static final void method1725(byte arg0, class114 arg1) {
        field3900++;
        if (arg0 < 51) {
            method1727(78);
        }
        while (true) {
            while (arg1.field1629.length > arg1.field1673) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method760(false) == 1) {
                    var2 = arg1.method760(false);
                    var3 = true;
                    var4 = arg1.method760(false);
                }
                int var5 = arg1.method760(false);
                int var6 = arg1.method760(false);
                int var7 = var5 * 64 - class212.field3040;
                int var8 = class54.field828 + class63.field1009 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class99.field1482 > var7 + 63 && class63.field1009 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var2 * 8 <= var11 && var2 * 8 + 8 > var11 && var12 >= (var4 * 8) && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg1.method741(3083);
                                if (var13 != 0) {
                                    if (class63.field1014[var9][var10] == null) {
                                        class63.field1014[var9][var10] = new byte[4096];
                                    }
                                    class63.field1014[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method741(3083);
                                    if (class236.field3560[var9][var10] == null) {
                                        class236.field3560[var9][var10] = new byte[4096];
                                    }
                                    class236.field3560[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method741(3083);
                        if (var16 != 0) {
                            arg1.field1673++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLlg;Lve;)Z")
    public final boolean method1726(boolean arg0, class106 arg1, class233 arg2) {
        field3897++;
        if (!arg0) {
            field3908 = null;
        }
        if (class245.field3665 <= 0) {
            for (int var4 = 0; var4 < this.field3906.length; var4++) {
                if (!arg2.method1509(false, this.field3906[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3906.length; var5++) {
                if (!arg2.method1520(false, class245.field3665, this.field3906[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field3901.length; var6++) {
            if (!arg1.method701(this.field3901[var6], (byte) 22)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method1727(int arg0) {
        field3902 = null;
        field3908 = null;
        if (arg0 <= 120) {
            method1724(5, 122, 21, -30, 49, 26, 0, -64);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLlg;ILve;ZDII)[I")
    public final int[] method1728(boolean arg0, class106 arg1, int arg2, class233 arg3, boolean arg4, double arg5, int arg6, int arg7) {
        field3907++;
        int[] var10 = new int[arg2 * arg6];
        class223.method1452(-103, arg5);
        class137.field1989 = arg1;
        class264.field3977 = arg3;
        class142.method941(false, arg6, arg2);
        for (int var11 = 0; var11 < this.field3904.length; var11++) {
            this.field3904[var11].method796(arg2, 255, arg6);
        }
        int var12;
        int var13;
        byte var14;
        if (arg0) {
            var12 = -1;
            var13 = arg6 - 1;
            var14 = -1;
        } else {
            var12 = arg6;
            var13 = 0;
            var14 = 1;
        }
        if (arg7 >= -37) {
            method1727(127);
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg4) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3903.field1713) {
                int[] var18 = this.field3903.method116(242152972, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field3903.method235(-93, var16);
                var19 = var22[1];
                var20 = var22[2];
                var21 = var22[0];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class54.field818[var24];
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class54.field818[var26];
                int var28 = var20[var23] >> 4;
                if (var28 > 255) {
                    var28 = 255;
                }
                if (var28 < 0) {
                    var28 = 0;
                }
                int var29 = class54.field818[var28];
                var10[var15++] = (var25 << 16) + var29 + (var27 << 8);
                if (arg4) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3904.length; var17++) {
            this.field3904[var17].method239((byte) -15);
        }
        return var10;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;III[B)I")
    public static final int method1729(int arg0, String arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        int var6 = -93 % ((arg3 + 6) / 37);
        int var7 = arg4 - arg2;
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(arg2 + var8);
            if (!(var9 <= '\u0000' || var9 >= '\u0080') || !(var9 < ' ' || var9 > 'ÿ')) {
                arg5[arg0 + var8] = (byte) var9;
            } else if (var9 == '€') {
                arg5[arg0 + var8] = -128;
            } else if (var9 == '‚') {
                arg5[arg0 + var8] = -126;
            } else if (var9 == 'ƒ') {
                arg5[arg0 + var8] = -125;
            } else if (var9 == '„') {
                arg5[arg0 + var8] = -124;
            } else if (var9 == '…') {
                arg5[arg0 + var8] = -123;
            } else if (var9 == '†') {
                arg5[arg0 + var8] = -122;
            } else if (var9 == '‡') {
                arg5[arg0 + var8] = -121;
            } else if (var9 == 'ˆ') {
                arg5[arg0 + var8] = -120;
            } else if (var9 == '‰') {
                arg5[arg0 + var8] = -119;
            } else if (var9 == 'Š') {
                arg5[arg0 + var8] = -118;
            } else if (var9 == '‹') {
                arg5[arg0 + var8] = -117;
            } else if (var9 == 'Œ') {
                arg5[arg0 + var8] = -116;
            } else if (var9 == 'Ž') {
                arg5[arg0 + var8] = -114;
            } else if (var9 == '‘') {
                arg5[arg0 + var8] = -111;
            } else if (var9 == '’') {
                arg5[arg0 + var8] = -110;
            } else if (var9 == '“') {
                arg5[arg0 + var8] = -109;
            } else if (var9 == '”') {
                arg5[arg0 + var8] = -108;
            } else if (var9 == '•') {
                arg5[arg0 + var8] = -107;
            } else if (var9 == '–') {
                arg5[arg0 + var8] = -106;
            } else if (var9 == '—') {
                arg5[arg0 + var8] = -105;
            } else if (var9 == '˜') {
                arg5[arg0 + var8] = -104;
            } else if (var9 == '™') {
                arg5[arg0 + var8] = -103;
            } else if (var9 == 'š') {
                arg5[arg0 + var8] = -102;
            } else if (var9 == '›') {
                arg5[arg0 + var8] = -101;
            } else if (var9 == 'œ') {
                arg5[arg0 + var8] = -100;
            } else if (var9 == 'ž') {
                arg5[arg0 + var8] = -98;
            } else if (var9 == 'Ÿ') {
                arg5[arg0 + var8] = -97;
            } else {
                arg5[arg0 + var8] = 63;
            }
        }
        field3895++;
        return var7;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class257() {
        this.field3901 = new int[0];
        this.field3906 = new int[0];
        this.field3903 = new class180();
        this.field3903.field1711 = 1;
        this.field3896 = new class180();
        this.field3904 = new class115[] { this.field3903, this.field3896 };
        this.field3896.field1711 = 1;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lkl;)V")
    public class257(class114 arg0) {
        int var2 = arg0.method760(false);
        this.field3904 = new class115[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class115 var16 = class212.method1351(0, arg0);
            if (var16.method241(94) >= 0) {
                var5++;
            }
            if (var16.method644(-20926) >= 0) {
                var3++;
            }
            int var17 = var16.field1706.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method760(false);
            }
            this.field3904[var6] = var16;
        }
        this.field3901 = new int[var3];
        int var7 = 0;
        this.field3906 = new int[var5];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class115 var11 = this.field3904[var9];
            int var12 = var11.field1706.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1706[var13] = this.field3904[var4[var9][var13]];
            }
            int var14 = var11.method241(52);
            int var15 = var11.method644(-20926);
            if (var14 > 0) {
                this.field3906[var8++] = var14;
            }
            if (var15 > 0) {
                this.field3901[var7++] = var15;
            }
            var4[var9] = null;
        }
        this.field3903 = this.field3904[arg0.method760(false)];
        Object var10 = null;
        this.field3896 = this.field3904[arg0.method760(false)];
    }
}
