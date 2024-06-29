import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class48 {

    @OriginalMember(owner = "client!bt", name = "B", descriptor = "Lkd;")
    private class298 field668 = null;

    @OriginalMember(owner = "client!bt", name = "O", descriptor = "Lhs;")
    private class346 field681;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "Z")
    private boolean field674;

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field648 = -1;

    @OriginalMember(owner = "client!bt", name = "P", descriptor = "Lhj;")
    public static class596 field682 = new class596(98, 3);

    @OriginalMember(owner = "client!bt", name = "S", descriptor = "S")
    public static short field685 = 1;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!bt", name = "y", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!bt", name = "A", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!bt", name = "Q", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!bt", name = "R", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "[Ljava/lang/Object;")
    private Object[] field644;

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field672;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method424(int arg0, String arg1) {
        if (arg0 < 108) {
            this.field674 = false;
        }
        field675++;
        if (this.method452(255)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field668.field3555.method322(class447.method2634((byte) 54, var3), 109);
            this.method456(var4, 11469);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I")
    private final int method425(int arg0, int arg1) {
        field645++;
        if (arg1 > -43) {
            this.field670 = -58;
        }
        if (this.method430(false, arg0)) {
            return this.field644[arg0] == null ? this.field681.method2059(true, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public final void method426(int arg0) {
        field658++;
        if (arg0 != -1) {
            this.method451(null, -6, null);
        }
        if (this.field644 != null) {
            for (int var2 = 0; var2 < this.field644.length; var2++) {
                this.field644[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)I")
    public final int method427(int arg0) {
        field679++;
        if (!this.method452(255)) {
            throw new IllegalStateException("");
        }
        int var2 = 40 / ((-arg0 - 60) / 46);
        return this.field668.field3560;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I[III)[B")
    public final byte[] method428(int arg0, int[] arg1, int arg2, int arg3) {
        field650++;
        if (!this.method442(arg2, arg0, 0)) {
            return null;
        }
        if (this.field672[arg2] == null || this.field672[arg2][arg0] == null) {
            boolean var5 = this.method434(arg2, 0, arg1, arg0);
            if (!var5) {
                this.method438(arg2, -1);
                boolean var6 = this.method434(arg2, 0, arg1, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        int var7 = 97 % ((arg3 - 34) / 35);
        byte[] var8 = class439.method2590(true, this.field672[arg2][arg0], false);
        if (this.field670 == 1) {
            this.field672[arg2][arg0] = null;
            if (this.field668.field3547[arg2] == 1) {
                this.field672[arg2] = null;
            }
        } else if (this.field670 == 2) {
            this.field672[arg2] = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)V")
    public final void method429(int arg0) {
        field655++;
        if (arg0 >= -5) {
            this.method459(null, (byte) 55);
        }
        if (this.field672 != null) {
            for (int var2 = 0; var2 < this.field672.length; var2++) {
                this.field672[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZI)Z")
    private final boolean method430(boolean arg0, int arg1) {
        field683++;
        if (arg0) {
            return false;
        } else if (!this.method452(255)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field668.field3547.length && this.field668.field3547[arg1] != 0) {
            return true;
        } else if (class287.field3405) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)I")
    public final int method431(int arg0, int arg1) {
        if (arg0 == 4) {
            field652++;
            return this.method430(false, arg1) ? this.field668.field3547[arg1] : 0;
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(ZI)Z")
    public final boolean method432(boolean arg0, int arg1) {
        field646++;
        if (!this.method430(arg0, arg1)) {
            return false;
        }
        if (arg0) {
            this.method433((byte) 14, 19);
        }
        if (this.field644[arg1] == null) {
            this.method438(arg1, -1);
            return this.field644[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)Z")
    public final boolean method433(byte arg0, int arg1) {
        field666++;
        if (arg0 > -73) {
            return true;
        } else if (!this.method452(255)) {
            return false;
        } else if (this.field668.field3547.length == 1) {
            return this.method443(arg1, 0, true);
        } else if (!this.method430(false, arg1)) {
            return false;
        } else if (this.field668.field3547[arg1] == 1) {
            return this.method443(0, arg1, true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[II)Z")
    private final boolean method434(int arg0, int arg1, int[] arg2, int arg3) {
        field657++;
        if (!this.method430(false, arg0)) {
            return false;
        } else if (this.field644[arg0] == null) {
            return false;
        } else {
            int var5 = this.field668.field3543[arg0];
            int[] var6 = this.field668.field3545[arg0];
            if (this.field672[arg0] == null) {
                this.field672[arg0] = new Object[this.field668.field3547[arg0]];
            }
            Object[] var7 = this.field672[arg0];
            boolean var8 = true;
            for (int var9 = arg1; var9 < var5; var9++) {
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
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var11 = class439.method2590(true, this.field644[arg0], false);
            } else {
                var11 = class439.method2590(true, this.field644[arg0], true);
                class403 var12 = new class403(var11);
                var12.method2370(arg2, 5, var12.field5275.length, 125);
            }
            byte[] var13;
            try {
                var13 = class50.method471((byte) 21, var11);
            } catch (RuntimeException var49) {
                throw class652.method3687(var49, "T3 - " + (arg2 != null) + "," + arg0 + "," + var11.length + "," + class298.method1739(0, var11, var11.length) + "," + class298.method1739(0, var11, var11.length - 2) + "," + this.field668.field3564[arg0] + "," + this.field668.field3560);
            }
            if (this.field674) {
                this.field644[arg0] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field670 == 0) {
                    var7[var48] = class606.method3447(false, var13, 0);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field670 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * var16 * 4;
                class403 var18 = new class403(var13);
                int var19 = 0;
                int var20 = 0;
                var18.field5262 = var17;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method2381((byte) 101);
                        int var24;
                        if (var6 == null) {
                            var24 = var23;
                        } else {
                            var24 = var6[var23];
                        }
                        if (arg3 == var24) {
                            var19 += var22;
                            var20 = var24;
                        }
                    }
                }
                if (var19 == 0) {
                    return true;
                }
                byte[] var25 = new byte[var19];
                int var26 = 0;
                var18.field5262 = var17;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method2381((byte) 106);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg3 == var31) {
                            class211.method1330(var13, var27, var25, var26, var29);
                            var26 += var29;
                        }
                        var27 += var29;
                    }
                }
                var7[var20] = var25;
            } else {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * 4 * var33;
                class403 var35 = new class403(var13);
                var35.field5262 = var34;
                int[] var36 = new int[var5];
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method2381((byte) 29);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field5262 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method2381((byte) 94);
                        class211.method1330(var13, var42, var40[var45], var36[var45], var44);
                        var42 += var44;
                        var36[var45] += var44;
                    }
                }
                for (int var46 = 0; var46 < var5; var46++) {
                    int var47;
                    if (var6 == null) {
                        var47 = var46;
                    } else {
                        var47 = var6[var46];
                    }
                    if (this.field670 == 0) {
                        var7[var47] = class606.method3447(false, var40[var46], 0);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method435(int arg0, String arg1) {
        field677++;
        if (arg0 != 0) {
            return 86;
        } else if (this.method452(255)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field668.field3555.method322(class447.method2634((byte) 54, var3), 89);
            return this.method425(var4, -124);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
    public final byte[] method436(String arg0, int arg1, String arg2) {
        field641++;
        if (!this.method452(arg1 + 3892)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field668.field3555.method322(class447.method2634((byte) 54, var4), arg1 ^ 0xFFFFF1F1);
        if (arg1 != -3637) {
            this.field681 = null;
        }
        if (this.method430(false, var6)) {
            int var7 = this.field668.field3548[var6].method322(class447.method2634((byte) 54, var5), arg1 + 3753);
            return this.method437(var6, (byte) -48, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IBI)[B")
    public final byte[] method437(int arg0, byte arg1, int arg2) {
        field664++;
        int var4 = -81 / ((arg1 - 30) / 52);
        return this.method428(arg2, null, arg0, 119);
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)V")
    private final void method438(int arg0, int arg1) {
        if (this.field674) {
            this.field644[arg0] = this.field681.method2056((byte) -44, arg0);
        } else {
            this.field644[arg0] = class606.method3447(false, this.field681.method2056((byte) -108, arg0), 0);
        }
        if (arg1 == -1) {
            field671++;
        }
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)I")
    public final int method439(int arg0) {
        field678++;
        if (!this.method452(255)) {
            return 0;
        }
        int var2 = 0;
        if (arg0 != -28929) {
            this.field681 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field644.length; var4++) {
            if (this.field668.field3543[var4] > 0) {
                var3 += this.method425(var4, -85);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method440(String arg0, int arg1) {
        field649++;
        if (!this.method452(255)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field668.field3555.method322(class447.method2634((byte) 54, var3), 80);
        if (arg1 == 162) {
            return var4 >= 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(II)[I")
    public final int[] method441(int arg0, int arg1) {
        field680++;
        if (arg1 >= -19) {
            return null;
        } else if (this.method430(false, arg0)) {
            int[] var3 = this.field668.field3545[arg0];
            if (var3 == null) {
                var3 = new int[this.field668.field3543[arg0]];
                int var4 = 0;
                while (var3.length > var4) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)Z")
    private final boolean method442(int arg0, int arg1, int arg2) {
        field647++;
        if (!this.method452(255)) {
            return false;
        } else if (arg0 >= arg2 && arg1 >= 0 && arg0 < this.field668.field3547.length && arg1 < this.field668.field3547[arg0]) {
            return true;
        } else if (class287.field3405) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIZ)Z")
    public final boolean method443(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return true;
        }
        field662++;
        if (!this.method442(arg1, arg0, 0)) {
            return false;
        } else if (this.field672[arg1] != null && this.field672[arg1][arg0] != null) {
            return true;
        } else if (this.field644[arg1] == null) {
            this.method438(arg1, -1);
            return this.field644[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method444(byte arg0, String arg1) {
        field665++;
        if (!this.method452(arg0 ^ 0xFFFFFF17)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != -24) {
            this.method424(-80, null);
        }
        int var4 = this.field668.field3555.method322(class447.method2634((byte) 54, var3), 101);
        return this.method432(false, var4);
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)I")
    public final int method445(int arg0) {
        int var2 = 13 % ((arg0 + 30) / 43);
        field660++;
        return this.method452(255) ? this.field668.field3547.length : -1;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    private final boolean method446(String arg0, String arg1, int arg2) {
        field643++;
        if (!this.method452(255)) {
            return false;
        }
        if (arg2 != 1) {
            this.method434(-104, -99, null, 49);
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field668.field3555.method322(class447.method2634((byte) 54, var4), arg2 + 118);
        if (this.method430(false, var6)) {
            int var7 = this.field668.field3548[var6].method322(class447.method2634((byte) 54, var5), arg2 + 122);
            return this.method443(var7, var6, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)I")
    public final int method447(int arg0, byte arg1) {
        field651++;
        if (!this.method452(255)) {
            return -1;
        }
        int var3 = this.field668.field3555.method322(arg0, 124);
        if (arg1 <= 84) {
            this.field674 = true;
        }
        return this.method430(false, var3) ? var3 : -1;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(ZI)V")
    public final void method448(boolean arg0, int arg1) {
        field654++;
        if (!this.method430(false, arg1)) {
            return;
        }
        if (this.field672 != null) {
            this.field672[arg1] = null;
        }
        if (!arg0) {
            field682 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIILha;IIII)V")
    public static final void method449(int arg0, int arg1, int arg2, class66 arg3, int arg4, int arg5, int arg6, int arg7) {
        field659++;
        arg3.method600(arg4, arg6, 785580130, arg1, arg2, arg0);
        arg3.method600(arg4 + 1, arg6 - -1, 785580130, arg7, 16, arg0 - 2);
        arg3.method598(arg0 - 2, arg6 - arg5, 124, arg4 + 1, arg2 + -19, arg7);
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(BLjava/lang/String;)I")
    public final int method450(byte arg0, String arg1) {
        field656++;
        if (!this.method452(255)) {
            return -1;
        }
        if (arg0 <= 69) {
            this.method444((byte) 34, null);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field668.field3555.method322(class447.method2634((byte) 54, var3), 107);
        return this.method430(false, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public final boolean method451(String arg0, int arg1, String arg2) {
        field669++;
        if (arg1 != 16) {
            return false;
        } else if (this.method452(255)) {
            String var4 = arg2.toLowerCase();
            String var5 = arg0.toLowerCase();
            int var6 = this.field668.field3555.method322(class447.method2634((byte) 54, var4), arg1 ^ 0x4E);
            if (var6 < 0) {
                return false;
            } else {
                int var7 = this.field668.field3548[var6].method322(class447.method2634((byte) 54, var5), 72);
                return var7 >= 0;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)Z")
    private final boolean method452(int arg0) {
        field661++;
        if (arg0 != 255) {
            return true;
        }
        if (this.field668 == null) {
            this.field668 = this.field681.method2058((byte) -41);
            if (this.field668 == null) {
                return false;
            }
            this.field644 = new Object[this.field668.field3544];
            this.field672 = new Object[this.field668.field3544][];
        }
        return true;
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "(II)[B")
    public final byte[] method453(int arg0, int arg1) {
        field673++;
        if (!this.method452(255)) {
            return null;
        } else if (this.field668.field3547.length == 1) {
            return this.method437(0, (byte) 95, arg0);
        } else if (!this.method430(false, arg0)) {
            return null;
        } else if (this.field668.field3547[arg0] == 1) {
            return this.method437(arg0, (byte) 110, 0);
        } else {
            if (arg1 != 11040) {
                this.method439(106);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "(II)V")
    public static final void method454(int arg0, int arg1) {
        field667++;
        if (class289.field3493 == arg0) {
            return;
        }
        if (arg0 == 13) {
            class603.method3436((byte) 123);
        }
        if (arg0 != 13 && class13.field223 != null) {
            class13.field223.method768(0);
            class13.field223 = null;
        }
        if (arg0 == 3) {
            class656.method3705((byte) -100, class72.field994 != class131.field1615);
        }
        if (arg0 == 7) {
            class429.method2548(class209.field2480 != class131.field1615, arg1 + 1);
        }
        if (arg0 == 5 || arg0 == 12) {
            class404.method2426(arg1 + 19656);
        } else if (arg0 == 6 || arg0 == 9) {
            class603.method3436((byte) 86);
        }
        if (class458.method2776(false, class289.field3493)) {
            class483.field6745.field670 = 2;
            class691.field9407.field670 = 2;
            class392.field5080.field670 = 2;
            class410.field5375.field670 = 2;
            class481.field6728.field670 = 2;
            class53.field720.field670 = 2;
            class277.field3243.field670 = 2;
        }
        if (class458.method2776(false, arg0)) {
            class430.field5666 = 0;
            class427.field5654 = 0;
            class783.field10805 = 0;
            class148.field1850 = 1;
            class55.field741 = 1;
            class402.method2352(-1, true);
            class483.field6745.field670 = 1;
            class691.field9407.field670 = 1;
            class392.field5080.field670 = 1;
            class410.field5375.field670 = 1;
            class481.field6728.field670 = 1;
            class53.field720.field670 = 1;
            class277.field3243.field670 = 1;
        }
        if (arg0 == 11 || arg0 == 3) {
            class669.method3754(false);
        }
        if (arg1 != -1) {
            return;
        }
        boolean var2 = arg0 == 2 || class783.method4341((byte) -81, arg0) || class451.method2741(arg0, 0);
        boolean var3 = class289.field3493 == 2 || class783.method4341((byte) -54, class289.field3493) || class451.method2741(class289.field3493, 0);
        if (var2 != var3) {
            if (var2) {
                class36.field542 = class500.field6981;
                if (class118.field1503.field10651.method1581(~arg1) == 0) {
                    class320.method1910(2, (byte) -54);
                } else {
                    class591.method3386(class599.field8106, false, class500.field6981, 2, true, class118.field1503.field10651.method1581(0), 0);
                    class133.method991(arg1 + 83);
                }
                class182.field2224.method4266(arg1 - 46, false);
            } else {
                class320.method1910(2, (byte) -54);
                class182.field2224.method4266(arg1 - 99, true);
            }
        }
        if (class458.method2776(false, arg0) || arg0 == 13) {
            class363.field4526.method25();
        }
        class289.field3493 = arg0;
    }

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)Z")
    public final boolean method455(int arg0) {
        if (arg0 != -3) {
            return true;
        }
        field676++;
        if (!this.method452(arg0 ^ 0xFFFFFF02)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field668.field3558.length; var3++) {
            int var4 = this.field668.field3558[var3];
            if (this.field644[var4] == null) {
                this.method438(var4, -1);
                if (this.field644[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "(II)V")
    private final void method456(int arg0, int arg1) {
        field663++;
        this.field681.method2060(false, arg0);
        if (arg1 != 11469) {
            this.field644 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZZI)V")
    public final void method457(boolean arg0, boolean arg1, int arg2) {
        field653++;
        if (!this.method452(255)) {
            return;
        }
        if (arg1) {
            this.field668.field3548 = null;
            this.field668.field3565 = null;
        }
        if (arg0) {
            this.field668.field3550 = null;
            this.field668.field3555 = null;
        }
        if (arg2 <= 48) {
            this.method457(false, true, 23);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V")
    public static void method458(byte arg0) {
        field682 = null;
        if (arg0 != -57) {
            field648 = -55;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method459(String arg0, byte arg1) {
        field642++;
        if (arg1 <= 83) {
            return false;
        } else {
            int var3 = this.method450((byte) 80, "");
            return var3 == -1 ? this.method446("", arg0, 1) : this.method446(arg0, "", 1);
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lhs;ZI)V")
    public class48(class346 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field681 = arg0;
        this.field674 = arg1;
        this.field670 = arg2;
    }
}
