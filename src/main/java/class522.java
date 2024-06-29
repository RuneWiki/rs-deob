import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class522 {

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Lte;")
    private class615 field7019 = null;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "Lum;")
    private class525 field7038;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Z")
    private boolean field7015;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    public int field7039;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Lvea;")
    public static class276 field7011 = new class276(13, 0, 1, 0);

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "Lea;")
    public static class547 field7042 = new class547(92, 16);

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "Lmu;")
    public static class303 field7046 = new class303("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "[Ljava/lang/Object;")
    private Object[] field7025;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field7036;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2868(String arg0, int arg1) {
        field7030++;
        if (this.method2878((byte) -123)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field7019.field8618.method3749((byte) -26, class285.method1716(var3, false));
            return arg1 <= var4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([IIBI)Z")
    private final boolean method2869(int[] arg0, int arg1, byte arg2, int arg3) {
        field7012++;
        if (!this.method2898(arg3, false)) {
            return false;
        } else if (this.field7025[arg3] == null) {
            return false;
        } else {
            int var5 = this.field7019.field8623[arg3];
            int[] var6 = this.field7019.field8622[arg3];
            if (this.field7036[arg3] == null) {
                this.field7036[arg3] = new Object[this.field7019.field8624[arg3]];
            }
            Object[] var7 = this.field7036[arg3];
            boolean var8 = true;
            if (arg2 >= -62) {
                this.method2868(null, 43);
            }
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var11 = class688.method3894(false, this.field7025[arg3], false);
            } else {
                var11 = class688.method3894(false, this.field7025[arg3], true);
                class611 var12 = new class611(var11);
                var12.method3414(arg0, 5, var12.field8529.length, (byte) 30);
            }
            byte[] var13;
            try {
                var13 = class294.method1760(var11, (byte) -84);
            } catch (RuntimeException var49) {
                throw class504.method2813(var49, "T3 - " + (arg0 != null) + "," + arg3 + "," + var11.length + "," + class173.method999(var11.length, var11, -30091) + "," + class173.method999(var11.length - 2, var11, -30091) + "," + this.field7019.field8628[arg3] + "," + this.field7019.field8632);
            }
            if (this.field7015) {
                this.field7025[arg3] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field7039 == 0) {
                    var7[var15] = class41.method248(2, var13, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field7039 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var33 * 4 * var5;
                class611 var35 = new class611(var13);
                int var36 = 0;
                var35.field8520 = var34;
                int var37 = 0;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method3418(-2);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg1 == var41) {
                            var36 += var39;
                            var37 = var41;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                var35.field8520 = var34;
                int var43 = 0;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method3418(-2);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg1 == var48) {
                            class373.method2194(var13, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var7[var37] = var42;
            } else {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var17 * 4 * var5;
                class611 var19 = new class611(var13);
                var19.field8520 = var18;
                int[] var20 = new int[var5];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method3418(-2);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field8520 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method3418(-2);
                        class373.method2194(var13, var26, var24[var29], var20[var29], var28);
                        var26 += var28;
                        var20[var29] += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field7039 == 0) {
                        var7[var31] = class41.method248(2, var24[var30], false);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)Z")
    public final boolean method2870(byte arg0) {
        field7033++;
        if (arg0 <= 8) {
            field7044 = 40;
        }
        if (!this.method2878((byte) -127)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field7019.field8616.length; var3++) {
            int var4 = this.field7019.field8616[var3];
            if (this.field7025[var4] == null) {
                this.method2889(var4, 126);
                if (this.field7025[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Z")
    private final boolean method2871(int arg0, int arg1, int arg2) {
        field7006++;
        if (!this.method2878((byte) -124)) {
            return false;
        } else if (arg1 >= arg0 && arg2 >= 0 && arg1 < this.field7019.field8624.length && arg2 < this.field7019.field8624[arg1]) {
            return true;
        } else if (class413.field5844) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    private final void method2872(int arg0, int arg1) {
        field7017++;
        this.field7038.method2912(arg0, false);
        if (arg1 != 32768) {
            field7044 = -87;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)[B")
    public final byte[] method2873(int arg0, int arg1) {
        field7043++;
        if (!this.method2878((byte) -123)) {
            return null;
        }
        int var3 = -91 % ((-arg1 - 59) / 37);
        if (this.field7019.field8624.length == 1) {
            return this.method2885(arg0, 0, false);
        } else if (!this.method2898(arg0, false)) {
            return null;
        } else if (this.field7019.field8624[arg0] == 1) {
            return this.method2885(0, arg0, false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method2874(String arg0, boolean arg1) {
        field7021++;
        if (arg1) {
            this.field7036 = null;
        }
        int var3 = this.method2890((byte) -60, "");
        return var3 == -1 ? this.method2884(arg0, "", 1) : this.method2884("", arg0, 1);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)I")
    public final int method2875(byte arg0) {
        if (arg0 > -2) {
            this.method2871(-36, -101, 7);
        }
        field7010++;
        if (!this.method2878((byte) -124)) {
            throw new IllegalStateException("");
        }
        return this.field7019.field8632;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([IIII)[B")
    public final byte[] method2876(int[] arg0, int arg1, int arg2, int arg3) {
        field7009++;
        if (!this.method2871(0, arg3, arg2)) {
            return null;
        }
        if (this.field7036[arg3] == null || this.field7036[arg3][arg2] == null) {
            boolean var5 = this.method2869(arg0, arg2, (byte) -66, arg3);
            if (!var5) {
                this.method2889(arg3, 103);
                boolean var6 = this.method2869(arg0, arg2, (byte) -95, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class688.method3894(false, this.field7036[arg3][arg2], false);
        if (this.field7039 == 1) {
            this.field7036[arg3][arg2] = null;
            if (this.field7019.field8624[arg3] == 1) {
                this.field7036[arg3] = null;
            }
        } else if (this.field7039 == 2) {
            this.field7036[arg3] = null;
        }
        return arg1 == 5 ? var7 : null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method2877(boolean arg0, String arg1, String arg2) {
        field7018++;
        if (!this.method2878((byte) -127)) {
            return false;
        } else if (arg0) {
            String var4 = arg2.toLowerCase();
            String var5 = arg1.toLowerCase();
            int var6 = this.field7019.field8618.method3749((byte) -26, class285.method1716(var4, !arg0));
            if (var6 < 0) {
                return false;
            } else {
                int var7 = this.field7019.field8627[var6].method3749((byte) -26, class285.method1716(var5, false));
                return var7 >= 0;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)Z")
    private final boolean method2878(byte arg0) {
        field7040++;
        if (arg0 > -122) {
            this.field7025 = null;
        }
        if (this.field7019 == null) {
            this.field7019 = this.field7038.method2911((byte) -124);
            if (this.field7019 == null) {
                return false;
            }
            this.field7036 = new Object[this.field7019.field8621][];
            this.field7025 = new Object[this.field7019.field8621];
        }
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
    public final byte[] method2879(String arg0, String arg1, int arg2) {
        field7016++;
        if (!this.method2878((byte) -124)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field7019.field8618.method3749((byte) -26, class285.method1716(var4, false));
        if (!this.method2898(var6, false)) {
            return null;
        } else if (arg2 == -32734) {
            int var7 = this.field7019.field8627[var6].method3749((byte) -26, class285.method1716(var5, false));
            return this.method2885(var7, var6, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(II)I")
    private final int method2880(int arg0, int arg1) {
        field7028++;
        if (this.method2898(arg1, false)) {
            int var3 = -91 / ((1 - arg0) / 40);
            return this.field7025[arg1] == null ? this.field7038.method2917(arg1, (byte) -106) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2881(String arg0, int arg1) {
        field7020++;
        if (arg1 != 0) {
            this.field7015 = true;
        }
        if (this.method2878((byte) -127)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field7019.field8618.method3749((byte) -26, class285.method1716(var3, false));
            return this.method2896(false, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(II)Z")
    public final boolean method2882(int arg0, int arg1) {
        field7024++;
        if (!this.method2878((byte) -126)) {
            return false;
        } else if (this.field7019.field8624.length == 1) {
            return this.method2891(arg1, 0, -6329);
        } else if (arg0 > -18) {
            return false;
        } else if (!this.method2898(arg1, false)) {
            return false;
        } else if (this.field7019.field8624[arg1] == 1) {
            return this.method2891(0, arg1, -6329);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(II)[I")
    public final int[] method2883(int arg0, int arg1) {
        if (arg1 != 6341) {
            return null;
        }
        field7026++;
        if (!this.method2898(arg0, false)) {
            return null;
        }
        int[] var3 = this.field7019.field8622[arg0];
        if (var3 == null) {
            var3 = new int[this.field7019.field8623[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    private final boolean method2884(String arg0, String arg1, int arg2) {
        field7007++;
        if (!this.method2878((byte) -128)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field7019.field8618.method3749((byte) -26, class285.method1716(var4, false));
        if (!this.method2898(var6, false)) {
            return false;
        }
        int var7 = this.field7019.field8627[var6].method3749((byte) -26, class285.method1716(var5, false));
        if (arg2 != 1) {
            this.method2870((byte) 3);
        }
        return this.method2891(var7, var6, arg2 - 6330);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIZ)[B")
    public final byte[] method2885(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field7011 = null;
        }
        field7035++;
        return this.method2876(null, 5, arg0, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lda;)V")
    public static final void method2886(class61 arg0) {
        class343.field4609 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZZB)V")
    public final void method2887(boolean arg0, boolean arg1, byte arg2) {
        field7031++;
        int var4 = 110 % ((arg2 - 1) / 50);
        if (!this.method2878((byte) -123)) {
            return;
        }
        if (arg0) {
            this.field7019.field8618 = null;
            this.field7019.field8614 = null;
        }
        if (arg1) {
            this.field7019.field8627 = null;
            this.field7019.field8629 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method2888(int arg0, String arg1) {
        field7014++;
        if (!this.method2878((byte) -127)) {
            return 0;
        }
        if (arg0 != 29952) {
            method2905((byte) -43);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field7019.field8618.method3749((byte) -26, class285.method1716(var3, false));
        return this.method2880(117, var4);
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(II)V")
    private final void method2889(int arg0, int arg1) {
        if (this.field7015) {
            this.field7025[arg0] = this.field7038.method2913(arg0, 0);
        } else {
            this.field7025[arg0] = class41.method248(2, this.field7038.method2913(arg0, 0), false);
        }
        int var3 = 80 % ((arg1 - 43) / 59);
        field7045++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method2890(byte arg0, String arg1) {
        field7008++;
        if (!this.method2878((byte) -125)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 > -49) {
            return -53;
        } else {
            int var4 = this.field7019.field8618.method3749((byte) -26, class285.method1716(var3, false));
            return this.method2898(var4, false) ? var4 : -1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)Z")
    public final boolean method2891(int arg0, int arg1, int arg2) {
        field7013++;
        if (!this.method2871(arg2 ^ arg2, arg1, arg0)) {
            return false;
        } else if (this.field7036[arg1] != null && this.field7036[arg1][arg0] != null) {
            return true;
        } else if (this.field7025[arg1] == null) {
            this.method2889(arg1, 103);
            return this.field7025[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)I")
    public final int method2892(byte arg0) {
        field7027++;
        if (this.method2878((byte) -123)) {
            if (arg0 != -11) {
                this.method2891(2, -51, -100);
            }
            return this.field7019.field8624.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIFFFFFF)F")
    public static final float method2893(int arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
        field7002++;
        float var8 = 0.0F;
        if (arg1 != 10665) {
            field7044 = -101;
        }
        float var9 = arg3 - arg7;
        float var10 = arg4 - arg5;
        float var11 = arg6 - arg2;
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = 0.0F;
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg7;
            float var16 = var8 * var10 + arg5;
            float var17 = var8 * var11 + arg2;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (var18 > 0 && var19 > 0 && var18 < class272.field3589 && var19 < class3.field26) {
                int var20 = class653.field9086.field2175;
                if (var20 < 3 && (class114.field1506[1][var18][var19] & 0x2) != 0) {
                    var20++;
                }
                int var21 = class86.field1182[var20].method1683((int) var15, (int) var17, true);
                if (var16 > (float) var21) {
                    if (arg0 >= 2) {
                        return method2893(arg0 - 1, 10665, var14, var15, var16, var13, var17, var12) * 0.1F + (var8 - 0.1F);
                    }
                    return var8;
                }
            }
            var8 += 0.1F;
            var14 = var17;
            var12 = var15;
            var13 = var16;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(II)V")
    public final void method2894(int arg0, int arg1) {
        field7005++;
        if (arg0 <= -6 && this.method2898(arg1, false) && this.field7036 != null) {
            this.field7036[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(Ljava/lang/String;I)V")
    public final void method2895(String arg0, int arg1) {
        field7041++;
        if (arg1 <= -90 && this.method2878((byte) -127)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field7019.field8618.method3749((byte) -26, class285.method1716(var3, false));
            this.method2872(var4, 32768);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)Z")
    public final boolean method2896(boolean arg0, int arg1) {
        field7000++;
        if (!this.method2898(arg1, arg0)) {
            return false;
        } else if (this.field7025[arg1] == null) {
            this.method2889(arg1, 112);
            return this.field7025[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method2897(int arg0) {
        field7042 = null;
        field7011 = null;
        if (arg0 != 1) {
            method2897(51);
        }
        field7046 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)Z")
    private final boolean method2898(int arg0, boolean arg1) {
        field7022++;
        if (!this.method2878((byte) -126)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field7019.field8624.length && this.field7019.field8624[arg0] != 0) {
            if (arg1) {
                field7011 = null;
            }
            return true;
        } else if (class413.field5844) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method2899(boolean arg0, String arg1, byte arg2) {
        field7001++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class511.field6912.field3546 : class511.field6912.field3545);
        if (arg2 <= 51) {
            return;
        }
        for (int var8 = var6; var8 < var7; var8++) {
            class634 var11 = class511.field6912.method1603(var8, 83);
            if (var11.field8811 && var11.method3569(false).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class360.field4769 = -1;
                    class421.field5899 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class360.field4769 = var5;
        class382.field5392 = 0;
        class421.field5899 = var4;
        String[] var9 = new String[class360.field4769];
        for (int var10 = 0; var10 < class360.field4769; var10++) {
            var9[var10] = class511.field6912.method1603(var4[var10], 48).method3569(false);
        }
        class103.method707(true, class421.field5899, var9);
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(B)V")
    public final void method2900(byte arg0) {
        if (arg0 > -114) {
            this.method2881(null, -42);
        }
        field7029++;
        if (this.field7036 != null) {
            for (int var2 = 0; var2 < this.field7036.length; var2++) {
                this.field7036[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lum;ZI)V")
    public class522(class525 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field7038 = arg0;
        this.field7015 = arg1;
        this.field7039 = arg2;
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "(II)I")
    public final int method2901(int arg0, int arg1) {
        field7037++;
        if (this.method2898(arg1, false)) {
            if (arg0 != 0) {
                method2897(-44);
            }
            return this.field7019.field8624[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(B)I")
    public final int method2902(byte arg0) {
        field7032++;
        if (!this.method2878((byte) -126)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field7025.length; var4++) {
            if (this.field7019.field8623[var4] > 0) {
                var3 += this.method2880(-48, var4);
                var2 += 100;
            }
        }
        int var5 = 55 / ((arg0 - 18) / 59);
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "(II)I")
    public final int method2903(int arg0, int arg1) {
        field7034++;
        if (!this.method2878((byte) -126)) {
            return -1;
        }
        int var3 = this.field7019.field8618.method3749((byte) -26, arg1);
        if (this.method2898(var3, false)) {
            if (arg0 <= 35) {
                method2886(null);
            }
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(III)V")
    public static final void method2904(int arg0, int arg1, int arg2) {
        field7003++;
        if (arg2 < -24 && class382.method2244(arg1, 124)) {
            class631.method3547(0, class357.field4742[arg1], arg0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(B)V")
    public static final void method2905(byte arg0) {
        class603.field8409.method367(class545.field7704);
        if (arg0 < 1) {
            field7046 = null;
        }
        field7004++;
        class603.field8409.method354(class671.field9322, class52.field543, class123.field1611, class759.field10575);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public final void method2906(int arg0) {
        if (this.field7025 != null) {
            for (int var2 = 0; var2 < this.field7025.length; var2++) {
                this.field7025[var2] = null;
            }
        }
        if (arg0 != 16) {
            field7042 = null;
        }
        field7023++;
    }
}
