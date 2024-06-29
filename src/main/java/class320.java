import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class320 {

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Lss;")
    private class303 field4746 = null;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "Z")
    private boolean field4765;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Lht;")
    private class418 field4755;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public int field4741;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "Ltf;")
    public static class198 field4773 = null;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "[I")
    public static int[] field4775;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "[Ljava/lang/Object;")
    private Object[] field4758;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4774;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[[[I")
    public static int[][][] field4754;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method2012(byte arg0, String arg1) {
        field4767++;
        if (!this.method2024(0)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field4746.field4488.method1751(class388.method2346(var3, 0), 4065);
        if (var4 < 0) {
            return false;
        } else {
            if (arg0 != -1) {
                field4761 = 5;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method2013(int arg0) {
        field4773 = null;
        field4775 = null;
        field4754 = null;
        if (arg0 != 12398) {
            method2013(-22);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III[I)Z")
    private final boolean method2014(int arg0, int arg1, int arg2, int[] arg3) {
        field4753++;
        if (!this.method2026((byte) 71, arg0)) {
            return false;
        } else if (this.field4758[arg0] == null) {
            return false;
        } else {
            int var5 = this.field4746.field4487[arg0];
            if (arg1 != 31118) {
                this.method2031(null, -33);
            }
            int[] var6 = this.field4746.field4501[arg0];
            if (this.field4774[arg0] == null) {
                this.field4774[arg0] = new Object[this.field4746.field4496[arg0]];
            }
            Object[] var7 = this.field4774[arg0];
            boolean var8 = true;
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
            if (arg3 == null || arg3[0] == 0 && arg3[1] == 0 && arg3[2] == 0 && arg3[3] == 0) {
                var11 = class42.method419(false, true, this.field4758[arg0]);
            } else {
                var11 = class42.method419(true, true, this.field4758[arg0]);
                class519 var12 = new class519(var11);
                var12.method3031(var12.field7545.length, 5, 0, arg3);
            }
            byte[] var13;
            try {
                var13 = class377.method2299(var11, 1);
            } catch (RuntimeException var49) {
                throw class181.method1258(var49, "T3 - " + (arg3 != null) + "," + arg0 + "," + var11.length + "," + class252.method1630(var11.length, var11, arg1 - 31191) + "," + class252.method1630(var11.length - 2, var11, 98) + "," + this.field4746.field4499[arg0] + "," + this.field4746.field4498);
            }
            if (this.field4765) {
                this.field4758[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field4741 == 0) {
                    var7[var15] = class92.method674(false, var13, 136);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field4741 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * 4 * var33;
                class519 var35 = new class519(var13);
                int var36 = 0;
                int var37 = 0;
                var35.field7558 = var34;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method3053(-129);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg2 == var41) {
                            var36 += var39;
                            var37 = var41;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                int var43 = 0;
                var35.field7558 = var34;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method3053(-129);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg2 == var48) {
                            class282.method1818(var13, var44, var42, var43, var46);
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
                int var18 = var50 - var5 * var17 * 4;
                class519 var19 = new class519(var13);
                var19.field7558 = var18;
                int[] var20 = new int[var5];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method3053(arg1 - 31247);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field7558 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method3053(-129);
                        class282.method1818(var13, var26, var24[var29], var20[var29], var28);
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
                    if (this.field4741 == 0) {
                        var7[var31] = class92.method674(false, var24[var30], 136);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method2015(String arg0, boolean arg1) {
        if (arg1) {
            field4754 = null;
        }
        field4748++;
        if (this.method2024(0)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4746.field4488.method1751(class388.method2346(var3, 0), 4065);
            this.method2040(var4, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
    public final byte[] method2016(String arg0, int arg1, String arg2) {
        field4764++;
        if (!this.method2024(0)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4746.field4488.method1751(class388.method2346(var4, 0), 4065);
        if (!this.method2026((byte) 71, var6)) {
            return null;
        } else if (arg1 < 56) {
            return null;
        } else {
            int var7 = this.field4746.field4497[var6].method1751(class388.method2346(var5, 0), 4065);
            return this.method2037(var7, (byte) 126, var6);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)I")
    public final int method2017(int arg0) {
        field4772++;
        if (!this.method2024(0)) {
            throw new IllegalStateException("");
        }
        int var2 = 55 % ((14 - arg0) / 53);
        return this.field4746.field4498;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
    private final void method2018(int arg0, int arg1) {
        if (this.field4765) {
            this.field4758[arg1] = this.field4755.method1005(0, arg1);
        } else {
            this.field4758[arg1] = class92.method674(false, this.field4755.method1005(0, arg1), 136);
        }
        if (arg0 > 87) {
            field4743++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Z")
    public final boolean method2019(int arg0, int arg1, int arg2) {
        field4769++;
        if (!this.method2045(arg1, (byte) -77, arg0)) {
            return false;
        } else if (arg2 <= 75) {
            return true;
        } else if (this.field4774[arg0] != null && this.field4774[arg0][arg1] != null) {
            return true;
        } else if (this.field4758[arg0] == null) {
            this.method2018(100, arg0);
            return this.field4758[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)I")
    public final int method2020(int arg0) {
        field4766++;
        if (!this.method2024(0)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4758.length; var4++) {
            if (this.field4746.field4487[var4] > 0) {
                var2 += 100;
                var3 += this.method2036(var4, 0);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            int var5 = -126 / ((arg0 - 27) / 50);
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII[BI)V")
    public static final void method2021(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var6 = 35 % ((51 - arg2) / 62);
        field4768++;
        if (arg3 <= arg1) {
            return;
        }
        int var7 = arg1 + arg5;
        int var8 = arg3 - arg1 >> 2;
        while (true) {
            var8--;
            if (var8 < 0) {
                int var9 = arg3 - arg1 & 0x3;
                while (true) {
                    var9--;
                    if (var9 < 0) {
                        return;
                    }
                    arg4[var7++] = 1;
                }
            }
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)[I")
    public final int[] method2022(byte arg0, int arg1) {
        field4771++;
        if (!this.method2026((byte) 71, arg1)) {
            return null;
        }
        int[] var3 = this.field4746.field4501[arg1];
        if (arg0 != 121) {
            return null;
        }
        if (var3 == null) {
            var3 = new int[this.field4746.field4487[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZIZ)V")
    public final void method2023(boolean arg0, int arg1, boolean arg2) {
        field4747++;
        if (!this.method2024(0)) {
            return;
        }
        int var4 = 10 / ((42 - arg1) / 53);
        if (arg0) {
            this.field4746.field4504 = null;
            this.field4746.field4497 = null;
        }
        if (arg2) {
            this.field4746.field4492 = null;
            this.field4746.field4488 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)Z")
    private final boolean method2024(int arg0) {
        field4770++;
        if (arg0 != 0) {
            this.method2024(-24);
        }
        if (this.field4746 == null) {
            this.field4746 = this.field4755.method1000(arg0 ^ 0x7CE9);
            if (this.field4746 == null) {
                return false;
            }
            this.field4774 = new Object[this.field4746.field4500][];
            this.field4758 = new Object[this.field4746.field4500];
        }
        return true;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V")
    public final void method2025(int arg0, int arg1) {
        if (arg1 != 0) {
            field4761 = 102;
        }
        field4752++;
        if (this.method2026((byte) 71, arg0) && this.field4774 != null) {
            this.field4774[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(BI)Z")
    private final boolean method2026(byte arg0, int arg1) {
        if (arg0 != 71) {
            this.method2028(-85);
        }
        field4745++;
        if (!this.method2024(0)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field4746.field4496.length && this.field4746.field4496[arg1] != 0) {
            return true;
        } else if (class47.field890) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)I")
    public final int method2027(int arg0, byte arg1) {
        int var3 = 127 % ((arg1 + 6) / 60);
        field4776++;
        if (this.method2024(0)) {
            int var4 = this.field4746.field4488.method1751(arg0, 4065);
            return this.method2026((byte) 71, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)Z")
    public final boolean method2028(int arg0) {
        field4783++;
        if (!this.method2024(0)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field4746.field4502.length; var3++) {
            int var4 = this.field4746.field4502[var3];
            if (this.field4758[var4] == null) {
                this.method2018(116, var4);
                if (this.field4758[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)[B")
    public final byte[] method2029(int arg0, boolean arg1) {
        field4784++;
        if (!this.method2024(0)) {
            return null;
        } else if (this.field4746.field4496.length == 1) {
            return this.method2037(arg0, (byte) -106, 0);
        } else {
            if (arg1) {
                this.method2036(56, 116);
            }
            if (!this.method2026((byte) 71, arg0)) {
                return null;
            } else if (this.field4746.field4496[arg0] == 1) {
                return this.method2037(0, (byte) 69, arg0);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)I")
    public final int method2030(int arg0, int arg1) {
        field4762++;
        if (this.method2026((byte) 71, arg1)) {
            if (arg0 != -10914) {
                this.field4774 = null;
            }
            return this.field4746.field4496[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method2031(String arg0, int arg1) {
        field4782++;
        if (!this.method2024(arg1 + 4793)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != -4793) {
            field4754 = null;
        }
        int var4 = this.field4746.field4488.method1751(class388.method2346(var3, 0), 4065);
        return this.method2036(var4, 0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method2032(int arg0, String arg1, String arg2) {
        field4780++;
        if (!this.method2024(0)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field4746.field4488.method1751(class388.method2346(var4, 0), 4065);
        if (!this.method2026((byte) 71, var6)) {
            return false;
        } else if (arg0 > -115) {
            return true;
        } else {
            int var7 = this.field4746.field4497[var6].method1751(class388.method2346(var5, 0), 4065);
            return this.method2019(var6, var7, 104);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)I")
    public final int method2033(byte arg0) {
        if (arg0 == 60) {
            field4781++;
            return this.method2024(0) ? this.field4746.field4496.length : -1;
        } else {
            return -58;
        }
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V")
    public final void method2034(int arg0) {
        field4744++;
        if (arg0 != -1) {
            this.field4755 = null;
        }
        if (this.field4774 != null) {
            for (int var2 = 0; var2 < this.field4774.length; var2++) {
                this.field4774[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(IB)Z")
    public final boolean method2035(int arg0, byte arg1) {
        field4760++;
        if (!this.method2024(0)) {
            return false;
        }
        if (arg1 != -94) {
            this.field4746 = null;
        }
        if (this.field4746.field4496.length == 1) {
            return this.method2019(0, arg0, arg1 ^ 0xFFFFFFC9);
        } else if (!this.method2026((byte) 71, arg0)) {
            return false;
        } else if (this.field4746.field4496[arg0] == 1) {
            return this.method2019(arg0, 0, 91);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(II)I")
    private final int method2036(int arg0, int arg1) {
        field4778++;
        if (this.method2026((byte) 71, arg0)) {
            if (arg1 != 0) {
                this.field4741 = -27;
            }
            return this.field4758[arg0] == null ? this.field4755.method1009(arg0, 0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)[B")
    public final byte[] method2037(int arg0, byte arg1, int arg2) {
        int var4 = 16 % ((-arg1 - 8) / 44);
        field4756++;
        return this.method2039(arg0, null, arg2, (byte) -53);
    }

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)V")
    public static final void method2038(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field4749++;
        class511 var1 = class190.field2779;
        synchronized (class190.field2779) {
            class190.field2779.method2990((byte) -96);
        }
        class511 var2 = class502.field7245;
        synchronized (class502.field7245) {
            class502.field7245.method2990((byte) -107);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[IIB)[B")
    public final byte[] method2039(int arg0, int[] arg1, int arg2, byte arg3) {
        field4750++;
        if (!this.method2045(arg0, (byte) -93, arg2)) {
            return null;
        }
        if (this.field4774[arg2] == null || this.field4774[arg2][arg0] == null) {
            boolean var5 = this.method2014(arg2, 31118, arg0, arg1);
            if (!var5) {
                this.method2018(126, arg2);
                boolean var6 = this.method2014(arg2, 31118, arg0, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class42.method419(false, true, this.field4774[arg2][arg0]);
        if (this.field4741 == 1) {
            this.field4774[arg2][arg0] = null;
            if (this.field4746.field4496[arg2] == 1) {
                this.field4774[arg2] = null;
            }
        } else if (this.field4741 == 2) {
            this.field4774[arg2] = null;
        }
        int var8 = -126 / ((arg3 - 1) / 41);
        return var7;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(IB)V")
    private final void method2040(int arg0, byte arg1) {
        if (arg1 == -92) {
            this.field4755.method1002(false, arg0);
            field4751++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "(I)V")
    public static final void method2041(int arg0) {
        field4742++;
        class275 var1 = class213.method1433((byte) 68, 15, 0);
        if (arg0 > -98) {
            field4754 = null;
        }
        var1.method1774((byte) -87);
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lht;ZI)V")
    public class320(class418 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field4765 = arg1;
        this.field4755 = arg0;
        this.field4741 = arg2;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(II)Z")
    public final boolean method2042(int arg0, int arg1) {
        field4763++;
        if (!this.method2026((byte) 71, arg0)) {
            return false;
        } else if (arg1 <= 57) {
            return true;
        } else if (this.field4758[arg0] == null) {
            this.method2018(94, arg0);
            return this.field4758[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(BLjava/lang/String;)I")
    public final int method2043(byte arg0, String arg1) {
        field4759++;
        if (this.method2024(0)) {
            int var3 = 79 / ((arg0 + 6) / 44);
            String var4 = arg1.toLowerCase();
            int var5 = this.field4746.field4488.method1751(class388.method2346(var4, 0), 4065);
            return this.method2026((byte) 71, var5) ? var5 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V")
    public final void method2044(byte arg0) {
        int var2 = -42 / ((77 - arg0) / 43);
        if (this.field4758 != null) {
            for (int var3 = 0; var3 < this.field4758.length; var3++) {
                this.field4758[var3] = null;
            }
        }
        field4779++;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(IBI)Z")
    private final boolean method2045(int arg0, byte arg1, int arg2) {
        field4777++;
        if (!this.method2024(0)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && arg2 < this.field4746.field4496.length && arg0 < this.field4746.field4496[arg2]) {
            if (arg1 > -46) {
                field4775 = null;
            }
            return true;
        } else if (class47.field890) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2046(String arg0, int arg1) {
        field4757++;
        if (this.method2024(arg1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4746.field4488.method1751(class388.method2346(var3, arg1), 4065);
            return this.method2042(var4, 111);
        } else {
            return false;
        }
    }
}
