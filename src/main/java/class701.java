import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class701 {

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lof;")
    private class538 field9828 = null;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "Lnq;")
    private class652 field9853;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "Z")
    private boolean field9854;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public int field9837;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field9833 = new String[100];

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "Z")
    public static boolean field9845 = false;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field9817;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field9823;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field9826;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field9829;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field9830;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field9832;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    public static int field9838;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field9841;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field9847;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field9848;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field9849;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field9851;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field9852;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    public static int field9858;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lr;")
    public static class564 field9813;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "[I")
    public static int[] field9822;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "[Ljava/lang/Object;")
    private Object[] field9824;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field9818;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)Z")
    public final boolean method3849(int arg0, boolean arg1) {
        field9858++;
        if (!this.method3857(-1548)) {
            return false;
        } else if (this.field9828.field7576.length == 1) {
            return this.method3860(arg0, (byte) -99, 0);
        } else if (this.method3879((byte) -95, arg0)) {
            if (arg1) {
                this.field9854 = true;
            }
            if (this.field9828.field7576[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method3860(0, (byte) -99, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZZB)V")
    public final void method3850(boolean arg0, boolean arg1, byte arg2) {
        field9841++;
        if (arg2 < 31 || !this.method3857(-1548)) {
            return;
        }
        if (arg0) {
            this.field9828.field7575 = null;
            this.field9828.field7580 = null;
        }
        if (arg1) {
            this.field9828.field7568 = null;
            this.field9828.field7563 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)I")
    public final int method3851(boolean arg0) {
        if (arg0) {
            this.method3867(false);
        }
        field9831++;
        if (!this.method3857(-1548)) {
            throw new IllegalStateException("");
        }
        return this.field9828.field7569;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[I")
    public final int[] method3852(int arg0, int arg1) {
        field9851++;
        if (!this.method3879((byte) -95, arg1)) {
            return null;
        }
        int[] var3 = this.field9828.field7566[arg1];
        if (var3 == null) {
            var3 = new int[this.field9828.field7570[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        int var5 = 21 % ((-arg0 - 67) / 43);
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public final void method3853(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field9846++;
        if (this.field9824 != null) {
            for (int var2 = 0; var2 < this.field9824.length; var2++) {
                this.field9824[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BII)[B")
    public final byte[] method3854(byte arg0, int arg1, int arg2) {
        field9842++;
        if (arg0 < 20) {
            field9839 = -42;
        }
        return this.method3873(0, arg1, null, arg2);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[II)Z")
    private final boolean method3855(int arg0, int arg1, int[] arg2, int arg3) {
        field9832++;
        if (!this.method3879((byte) -95, arg0)) {
            return false;
        } else if (this.field9824[arg0] == null) {
            return false;
        } else {
            int var5 = this.field9828.field7570[arg0];
            int[] var6 = this.field9828.field7566[arg0];
            if (this.field9818[arg0] == null) {
                this.field9818[arg0] = new Object[this.field9828.field7576[arg0]];
            }
            Object[] var7 = this.field9818[arg0];
            boolean var8 = true;
            if (arg1 < 49) {
                field9845 = false;
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
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var11 = class684.method3787(false, this.field9824[arg0], 68);
            } else {
                var11 = class684.method3787(true, this.field9824[arg0], 78);
                class115 var12 = new class115(var11);
                var12.method648(var12.field1269.length, -2, 5, arg2);
            }
            byte[] var13;
            try {
                var13 = class178.method1086((byte) -110, var11);
            } catch (RuntimeException var49) {
                throw class59.method316(var49, "T3 - " + (arg2 != null) + "," + arg0 + "," + var11.length + "," + class130.method737(var11.length, (byte) -41, var11) + "," + class130.method737(var11.length - 2, (byte) -92, var11) + "," + this.field9828.field7573[arg0] + "," + this.field9828.field7569);
            }
            if (this.field9854) {
                this.field9824[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field9837 == 0) {
                    var7[var15] = class489.method2836(var13, false, true);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field9837 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * 4 * var17;
                class115 var19 = new class115(var13);
                int var20 = 0;
                int var21 = 0;
                var19.field1218 = var18;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method631(false);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg3 == var25) {
                            var20 += var23;
                            var21 = var25;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                int var27 = 0;
                var19.field1218 = var18;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method631(false);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg3 == var32) {
                            class567.method3213(var13, var28, var26, var27, var30);
                            var27 += var30;
                        }
                        var28 += var30;
                    }
                }
                var7[var21] = var26;
            } else {
                int var33 = var13.length;
                int var51 = var33 - 1;
                int var34 = var13[var51] & 0xFF;
                int var35 = var51 - var5 * var34 * 4;
                class115 var36 = new class115(var13);
                int[] var37 = new int[var5];
                var36.field1218 = var35;
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method631(false);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field1218 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method631(false);
                        class567.method3213(var13, var43, var41[var46], var37[var46], var45);
                        var43 += var45;
                        var37[var46] += var45;
                    }
                }
                for (int var47 = 0; var47 < var5; var47++) {
                    int var48;
                    if (var6 == null) {
                        var48 = var47;
                    } else {
                        var48 = var6[var47];
                    }
                    if (this.field9837 == 0) {
                        var7[var48] = class489.method2836(var41[var47], false, true);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method3856(String arg0, boolean arg1) {
        if (!arg1) {
            field9813 = null;
        }
        field9834++;
        if (this.method3857(-1548)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field9828.field7563.method2094(-28135, class19.method85(var3, !arg1));
            this.method3858(var4, -93);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Z")
    private final boolean method3857(int arg0) {
        if (arg0 != -1548) {
            return true;
        }
        field9827++;
        if (this.field9828 == null) {
            this.field9828 = this.field9853.method1154(true);
            if (this.field9828 == null) {
                return false;
            }
            this.field9818 = new Object[this.field9828.field7584][];
            this.field9824 = new Object[this.field9828.field7584];
        }
        return true;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)V")
    private final void method3858(int arg0, int arg1) {
        int var3 = -71 / ((-arg1 - 42) / 38);
        field9848++;
        this.field9853.method1158(64, arg0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)[B")
    public final byte[] method3859(byte arg0, int arg1) {
        field9856++;
        if (!this.method3857(-1548)) {
            return null;
        } else if (this.field9828.field7576.length == 1) {
            return this.method3854((byte) 40, 0, arg1);
        } else if (!this.method3879((byte) -95, arg1)) {
            return null;
        } else if (this.field9828.field7576[arg1] == 1) {
            return this.method3854((byte) 82, arg1, 0);
        } else {
            if (arg0 <= 111) {
                this.method3861((byte) -3);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBI)Z")
    public final boolean method3860(int arg0, byte arg1, int arg2) {
        field9859++;
        if (!this.method3881(107, arg2, arg0)) {
            return false;
        } else if (this.field9818[arg2] != null && this.field9818[arg2][arg0] != null) {
            return true;
        } else if (this.field9824[arg2] == null) {
            this.method3863(arg2, (byte) -119);
            if (arg1 != -99) {
                this.method3880(null, true);
            }
            return this.field9824[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Z")
    public final boolean method3861(byte arg0) {
        field9829++;
        if (!this.method3857(-1548)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field9828.field7581.length; var3++) {
            int var4 = this.field9828.field7581[var3];
            if (this.field9824[var4] == null) {
                this.method3863(var4, (byte) -128);
                if (this.field9824[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 != 14) {
            this.method3870(null, 89);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
    public final byte[] method3862(String arg0, String arg1, byte arg2) {
        field9843++;
        if (!this.method3857(-1548)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        int var5 = 67 / ((arg2 + 21) / 62);
        String var6 = arg0.toLowerCase();
        int var7 = this.field9828.field7563.method2094(-28135, class19.method85(var4, false));
        if (this.method3879((byte) -95, var7)) {
            int var8 = this.field9828.field7580[var7].method2094(-28135, class19.method85(var6, false));
            return this.method3854((byte) 105, var7, var8);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
    private final void method3863(int arg0, byte arg1) {
        if (this.field9854) {
            this.field9824[arg0] = this.field9853.method1161(arg0, (byte) -86);
        } else {
            this.field9824[arg0] = class489.method2836(this.field9853.method1161(arg0, (byte) -90), false, true);
        }
        field9816++;
        int var3 = -114 % ((-arg1 - 39) / 59);
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)I")
    private final int method3864(int arg0, int arg1) {
        if (arg1 > -72) {
            return 100;
        }
        field9850++;
        if (this.method3879((byte) -95, arg0)) {
            return this.field9824[arg0] == null ? this.field9853.method1162(22941, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(BI)I")
    public final int method3865(byte arg0, int arg1) {
        if (arg0 != 66) {
            return 85;
        }
        field9840++;
        if (this.method3857(-1548)) {
            int var3 = this.field9828.field7563.method2094(arg0 - 28201, arg1);
            return this.method3879((byte) -95, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method3866(byte arg0, String arg1) {
        if (arg0 != 1) {
            field9813 = null;
        }
        field9820++;
        int var3 = this.method3875("", (byte) -86);
        return var3 == -1 ? this.method3868((byte) 83, "", arg1) : this.method3868((byte) 83, arg1, "");
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
    public final void method3867(boolean arg0) {
        if (arg0) {
            return;
        }
        field9826++;
        if (this.field9818 != null) {
            for (int var2 = 0; var2 < this.field9818.length; var2++) {
                this.field9818[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
    private final boolean method3868(byte arg0, String arg1, String arg2) {
        field9849++;
        if (!this.method3857(arg0 ^ 0xFFFFF9A7)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        if (arg0 != 83) {
            return true;
        }
        String var5 = arg1.toLowerCase();
        int var6 = this.field9828.field7563.method2094(-28135, class19.method85(var4, false));
        if (this.method3879((byte) -95, var6)) {
            int var7 = this.field9828.field7580[var6].method2094(-28135, class19.method85(var5, false));
            return this.method3860(var7, (byte) -99, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(II)V")
    public static final void method3869(int arg0, int arg1) {
        class499 var2 = class487.field7044[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class499 var4 = class487.field7044[var3][arg0][arg1] = class487.field7044[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class245 var5 = var4.field7215; var5 != null; var5 = var5.field3027) {
                    class613 var6 = var5.field3029;
                    if (var6.field8635 == arg0 && var6.field8627 == arg1) {
                        var6.field5166--;
                    }
                }
                if (var4.field7230 != null) {
                    var4.field7230.field5166--;
                }
                if (var4.field7218 != null) {
                    var4.field7218.field5166--;
                }
                if (var4.field7223 != null) {
                    var4.field7223.field5166--;
                }
                if (var4.field7231 != null) {
                    var4.field7231.field5166--;
                }
                if (var4.field7228 != null) {
                    var4.field7228.field5166--;
                }
            }
        }
        if (class487.field7044[0][arg0][arg1] == null) {
            class487.field7044[0][arg0][arg1] = new class499(0);
            class487.field7044[0][arg0][arg1].field7211 = 1;
        }
        class487.field7044[0][arg0][arg1].field7225 = var2;
        class487.field7044[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method3870(String arg0, int arg1) {
        field9852++;
        if (!this.method3857(-1548)) {
            return false;
        }
        if (arg1 != 8081) {
            this.method3850(true, false, (byte) -102);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field9828.field7563.method2094(arg1 - 36216, class19.method85(var3, false));
        return this.method3882(56, var4);
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public static void method3871(int arg0) {
        field9822 = null;
        field9833 = null;
        if (arg0 == 100) {
            field9813 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)I")
    public static final int method3872(int arg0) {
        if (arg0 == -12973) {
            field9815++;
            return class203.field2404.method3097(false);
        } else {
            return 77;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II[II)[B")
    public final byte[] method3873(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 != 0) {
            this.method3856(null, true);
        }
        field9855++;
        if (!this.method3881(arg0 + 107, arg1, arg3)) {
            return null;
        }
        if (this.field9818[arg1] == null || this.field9818[arg1][arg3] == null) {
            boolean var5 = this.method3855(arg1, 78, arg2, arg3);
            if (!var5) {
                this.method3863(arg1, (byte) -121);
                boolean var6 = this.method3855(arg1, arg0 + 98, arg2, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class684.method3787(false, this.field9818[arg1][arg3], 112);
        if (this.field9837 == 1) {
            this.field9818[arg1][arg3] = null;
            if (this.field9828.field7576[arg1] == 1) {
                this.field9818[arg1] = null;
            }
        } else if (this.field9837 == 2) {
            this.field9818[arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
    public final boolean method3874(String arg0, byte arg1, String arg2) {
        field9835++;
        if (!this.method3857(-1548)) {
            return false;
        }
        int var4 = 73 % ((-arg1 - 78) / 38);
        String var5 = arg2.toLowerCase();
        String var6 = arg0.toLowerCase();
        int var7 = this.field9828.field7563.method2094(-28135, class19.method85(var5, false));
        if (var7 < 0) {
            return false;
        } else {
            int var8 = this.field9828.field7580[var7].method2094(-28135, class19.method85(var6, false));
            return var8 >= 0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method3875(String arg0, byte arg1) {
        field9817++;
        if (!this.method3857(-1548)) {
            return -1;
        }
        if (arg1 >= -66) {
            this.field9824 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field9828.field7563.method2094(-28135, class19.method85(var3, false));
        return this.method3879((byte) -95, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(II)V")
    public final void method3876(int arg0, int arg1) {
        if (arg1 >= 60) {
            field9814++;
            if (this.method3879((byte) -95, arg0) && this.field9818 != null) {
                this.field9818[arg0] = null;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)I")
    public final int method3877(int arg0) {
        field9823++;
        if (arg0 != 100) {
            field9838 = -44;
        }
        return this.method3857(-1548) ? this.field9828.field7576.length : -1;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)I")
    public final int method3878(byte arg0) {
        field9857++;
        if (!this.method3857(-1548)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field9824.length; var4++) {
            if (this.field9828.field7570[var4] > 0) {
                var2 += 100;
                var3 += this.method3864(var4, -90);
            }
        }
        if (var2 == 0) {
            return 100;
        }
        int var5 = var3 * 100 / var2;
        if (arg0 != -1) {
            this.method3858(37, 30);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(BI)Z")
    private final boolean method3879(byte arg0, int arg1) {
        field9847++;
        if (!this.method3857(arg0 ^ 0x655)) {
            return false;
        }
        if (arg0 != -95) {
            this.method3850(true, false, (byte) 73);
        }
        if (arg1 >= 0 && arg1 < this.field9828.field7576.length && this.field9828.field7576[arg1] != 0) {
            return true;
        } else if (class470.field6744) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(Ljava/lang/String;Z)I")
    public final int method3880(String arg0, boolean arg1) {
        field9844++;
        if (!this.method3857(-1548)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1) {
            int var4 = this.field9828.field7563.method2094(-28135, class19.method85(var3, false));
            return this.method3864(var4, -124);
        } else {
            return -76;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)Z")
    private final boolean method3881(int arg0, int arg1, int arg2) {
        field9819++;
        if (arg0 < 95) {
            return false;
        } else if (!this.method3857(-1548)) {
            return false;
        } else if (arg1 >= 0 && arg2 >= 0 && this.field9828.field7576.length > arg1 && this.field9828.field7576[arg1] > arg2) {
            return true;
        } else if (class470.field6744) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lnq;ZI)V")
    public class701(class652 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field9853 = arg0;
        this.field9854 = arg1;
        this.field9837 = arg2;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(II)Z")
    public final boolean method3882(int arg0, int arg1) {
        field9825++;
        if (!this.method3879((byte) -95, arg1)) {
            return false;
        }
        int var3 = -70 / ((-arg0 - 4) / 58);
        if (this.field9824[arg1] == null) {
            this.method3863(arg1, (byte) -121);
            return this.field9824[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "(II)I")
    public final int method3883(int arg0, int arg1) {
        if (arg1 != 0) {
            method3869(-45, 70);
        }
        field9836++;
        return this.method3879((byte) -95, arg0) ? this.field9828.field7576[arg0] : 0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method3884(int arg0, String arg1) {
        field9821++;
        if (arg0 != -23768) {
            return true;
        } else if (this.method3857(-1548)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field9828.field7563.method2094(-28135, class19.method85(var3, false));
            return var4 >= 0;
        } else {
            return false;
        }
    }
}
