import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class53 {

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "Lvv;")
    private class217 field674 = null;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Z")
    private boolean field648;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "Lfi;")
    private class397 field673;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Leh;")
    public static class246 field657 = new class246(15, -1);

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    public static int field683 = -2;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "Lla;")
    public static class319 field682;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "[Ljava/lang/Object;")
    private Object[] field643;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field672;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method418(int arg0, String arg1, String arg2) {
        field671++;
        if (!this.method441(arg0 - 10610)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field674.field3148.method2692(class194.method1228(arg0 - 10810, var4), (byte) -36);
        if (!this.method446((byte) 70, var6)) {
            return null;
        } else if (arg0 == 10701) {
            int var7 = this.field674.field3137[var6].method2692(class194.method1228(arg0 - 10822, var5), (byte) -36);
            return this.method426(var6, (byte) 9, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)[I")
    public final int[] method419(boolean arg0, int arg1) {
        field653++;
        if (!this.method446((byte) 84, arg1)) {
            return null;
        }
        int[] var3 = this.field674.field3140[arg1];
        if (!arg0) {
            method428((byte) 62);
        }
        if (var3 == null) {
            var3 = new int[this.field674.field3142[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BZZ)V")
    public final void method420(byte arg0, boolean arg1, boolean arg2) {
        field664++;
        if (!this.method441(77)) {
            return;
        }
        if (arg1) {
            this.field674.field3134 = null;
            this.field674.field3137 = null;
        }
        if (arg2) {
            this.field674.field3144 = null;
            this.field674.field3148 = null;
        }
        if (arg0 != -45) {
            field675 = 15;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[B")
    public final byte[] method421(int arg0, int arg1) {
        field649++;
        if (!this.method441(73)) {
            return null;
        } else if (this.field674.field3141.length == arg1) {
            return this.method426(0, (byte) 9, arg0);
        } else if (!this.method446((byte) 118, arg0)) {
            return null;
        } else if (this.field674.field3141[arg0] == 1) {
            return this.method426(arg0, (byte) 9, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V")
    private final void method422(int arg0, int arg1) {
        this.field673.method733(arg0, (byte) 50);
        field652++;
        if (arg1 != 0) {
            this.method425(false, -61);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([IIII)[B")
    public final byte[] method423(int[] arg0, int arg1, int arg2, int arg3) {
        field646++;
        if (!this.method431(arg3, arg1, -4915)) {
            return null;
        }
        if (this.field672[arg3] == null || this.field672[arg3][arg1] == null) {
            boolean var5 = this.method432(arg0, arg1, arg3, 32669);
            if (!var5) {
                this.method449(-2411, arg3);
                boolean var6 = this.method432(arg0, arg1, arg3, arg2 ^ 0x7F9C);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class90.method645(this.field672[arg3][arg1], false, false);
        if (arg2 != 1) {
            return null;
        }
        if (this.field662 == 1) {
            this.field672[arg3][arg1] = null;
            if (this.field674.field3141[arg3] == 1) {
                this.field672[arg3] = null;
            }
        } else if (this.field662 == 2) {
            this.field672[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(II)Z")
    public final boolean method424(int arg0, int arg1) {
        field680++;
        if (!this.method441(arg0 ^ 0x30)) {
            return false;
        } else if (this.field674.field3141.length == 1) {
            return this.method448(arg1, 0, 106);
        } else if (!this.method446((byte) 59, arg1)) {
            return false;
        } else if (this.field674.field3141[arg1] == 1) {
            return this.method448(0, arg1, 111);
        } else {
            if (arg0 != 0) {
                this.method448(-82, 37, 102);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(ZI)I")
    public final int method425(boolean arg0, int arg1) {
        field668++;
        if (!this.method441(43)) {
            return -1;
        }
        int var3 = this.field674.field3148.method2692(arg1, (byte) -36);
        if (this.method446((byte) 40, var3)) {
            return arg0 ? var3 : 79;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBI)[B")
    public final byte[] method426(int arg0, byte arg1, int arg2) {
        field656++;
        if (arg1 != 9) {
            field657 = null;
        }
        return this.method423(null, arg2, arg1 - 8, arg0);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method427(int arg0, String arg1, String arg2) {
        field670++;
        if (!this.method441(79)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field674.field3148.method2692(class194.method1228(arg0 - 12146, var4), (byte) -36);
        if (!this.method446((byte) 120, var6)) {
            return false;
        } else if (arg0 == 12035) {
            int var7 = this.field674.field3137[var6].method2692(class194.method1228(-123, var5), (byte) -36);
            return this.method448(var7, var6, 113);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static void method428(byte arg0) {
        field682 = null;
        if (arg0 == 7) {
            field657 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method429(String arg0, int arg1) {
        field681++;
        if (arg1 != -1) {
            return -3;
        } else if (this.method441(arg1 + 88)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field674.field3148.method2692(class194.method1228(-104, var3), (byte) -36);
            return this.method446((byte) 22, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)I")
    private final int method430(int arg0, byte arg1) {
        if (arg1 >= -11) {
            this.method449(4, 36);
        }
        field663++;
        if (this.method446((byte) 34, arg0)) {
            return this.field643[arg0] == null ? this.field673.method744(arg0, (byte) -114) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Z")
    private final boolean method431(int arg0, int arg1, int arg2) {
        field645++;
        if (arg2 != -4915) {
            this.method438((byte) -49);
        }
        if (!this.method441(49)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && this.field674.field3141.length > arg0 && this.field674.field3141[arg0] > arg1) {
            return true;
        } else if (class105.field1393) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "([IIII)Z")
    private final boolean method432(int[] arg0, int arg1, int arg2, int arg3) {
        field659++;
        if (!this.method446((byte) 93, arg2)) {
            return false;
        } else if (this.field643[arg2] == null) {
            return false;
        } else {
            int var5 = this.field674.field3142[arg2];
            int[] var6 = this.field674.field3140[arg2];
            if (this.field672[arg2] == null) {
                this.field672[arg2] = new Object[this.field674.field3141[arg2]];
            }
            Object[] var7 = this.field672[arg2];
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
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var11 = class90.method645(this.field643[arg2], false, false);
            } else {
                var11 = class90.method645(this.field643[arg2], true, false);
                class403 var12 = new class403(var11);
                var12.method2322(arg0, var12.field5663.length, 5, -204278368);
            }
            byte[] var13;
            try {
                var13 = class84.method612(arg3 ^ 0x3A14, var11);
            } catch (RuntimeException var49) {
                throw class97.method687(var49, "T3 - " + (arg0 != null) + "," + arg2 + "," + var11.length + "," + class542.method3182(var11.length, var11, 0) + "," + class542.method3182(var11.length - 2, var11, 0) + "," + this.field674.field3143[arg2] + "," + this.field674.field3135);
            }
            if (arg3 != 32669) {
                return true;
            }
            if (this.field648) {
                this.field643[arg2] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field662 == 0) {
                    var7[var48] = class473.method2736(true, var13, false);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field662 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * var16 * 4;
                class403 var18 = new class403(var13);
                int var19 = 0;
                var18.field5665 = var17;
                int var20 = 0;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method2319((byte) 101);
                        int var24;
                        if (var6 == null) {
                            var24 = var23;
                        } else {
                            var24 = var6[var23];
                        }
                        if (arg1 == var24) {
                            var20 = var24;
                            var19 += var22;
                        }
                    }
                }
                if (var19 == 0) {
                    return true;
                }
                byte[] var25 = new byte[var19];
                int var26 = 0;
                var18.field5665 = var17;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method2319((byte) 86);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg1 == var31) {
                            class182.method1135(var13, var27, var25, var26, var29);
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
                int var34 = var51 - var5 * var33 * 4;
                class403 var35 = new class403(var13);
                int[] var36 = new int[var5];
                var35.field5665 = var34;
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method2319((byte) 118);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field5665 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method2319((byte) 104);
                        class182.method1135(var13, var42, var40[var45], var36[var45], var44);
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
                    if (this.field662 == 0) {
                        var7[var47] = class473.method2736(true, var40[var46], false);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method433(boolean arg0, String arg1) {
        field667++;
        if (!this.method441(51)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field674.field3148.method2692(class194.method1228(-107, var3), (byte) -36);
        if (arg0) {
            this.method422(var4, 0);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)I")
    public final int method434(int arg0) {
        field647++;
        if (arg0 != 26154) {
            this.method433(false, null);
        }
        return this.method441(73) ? this.field674.field3141.length : -1;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(II)I")
    public final int method435(int arg0, int arg1) {
        field676++;
        if (this.method446((byte) 21, arg0)) {
            return arg1 == 0 ? this.field674.field3141[arg0] : 125;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(IB)I")
    public static final int method436(int arg0, byte arg1) {
        field654++;
        if (arg1 != 126) {
            method428((byte) -8);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
    public final void method437(byte arg0) {
        if (this.field643 != null) {
            for (int var2 = 0; var2 < this.field643.length; var2++) {
                this.field643[var2] = null;
            }
        }
        field642++;
        if (arg0 != 75) {
            this.field648 = true;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)I")
    public final int method438(byte arg0) {
        field677++;
        if (arg0 != -50) {
            return 85;
        } else if (this.method441(85)) {
            return this.field674.field3135;
        } else {
            throw new IllegalStateException("");
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method439(String arg0, int arg1) {
        field658++;
        if (this.method441(38)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field674.field3148.method2692(class194.method1228(-98, var3), (byte) -36);
            return var4 >= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)Z")
    public final boolean method440(byte arg0) {
        field669++;
        if (!this.method441(121)) {
            return false;
        } else if (arg0 >= -39) {
            return false;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field674.field3147.length; var3++) {
                int var4 = this.field674.field3147[var3];
                if (this.field643[var4] == null) {
                    this.method449(-2411, var4);
                    if (this.field643[var4] == null) {
                        var2 = false;
                    }
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)Z")
    private final boolean method441(int arg0) {
        if (arg0 < 37) {
            return true;
        }
        field641++;
        if (this.field674 == null) {
            this.field674 = this.field673.method743(65535);
            if (this.field674 == null) {
                return false;
            }
            this.field672 = new Object[this.field674.field3133][];
            this.field643 = new Object[this.field674.field3133];
        }
        return true;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(IB)V")
    public final void method442(int arg0, byte arg1) {
        field655++;
        if (!this.method446((byte) 122, arg0)) {
            return;
        }
        if (this.field672 != null) {
            this.field672[arg0] = null;
        }
        if (arg1 != 93) {
            this.method419(false, -114);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method443(boolean arg0, String arg1) {
        field660++;
        if (!this.method441(106)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0) {
            this.method419(true, -29);
        }
        int var4 = this.field674.field3148.method2692(class194.method1228(-128, var3), (byte) -36);
        return this.method445(var4, (byte) 114);
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)I")
    public final int method444(int arg0) {
        field644++;
        if (!this.method441(39)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -20879) {
            return 55;
        }
        for (int var4 = 0; var4 < this.field643.length; var4++) {
            if (this.field674.field3142[var4] > 0) {
                var3 += this.method430(var4, (byte) -71);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(IB)Z")
    public final boolean method445(int arg0, byte arg1) {
        field678++;
        if (!this.method446((byte) 31, arg0)) {
            return false;
        } else if (this.field643[arg0] == null) {
            this.method449(-2411, arg0);
            if (this.field643[arg0] == null) {
                int var3 = 56 % ((10 - arg1) / 42);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)Z")
    private final boolean method446(byte arg0, int arg1) {
        field684++;
        if (!this.method441(126)) {
            return false;
        }
        if (arg0 < 12) {
            this.method427(-86, null, null);
        }
        if (arg1 >= 0 && arg1 < this.field674.field3141.length && this.field674.field3141[arg1] != 0) {
            return true;
        } else if (class105.field1393) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public final void method447(boolean arg0) {
        field651++;
        if (this.field672 != null) {
            for (int var2 = 0; var2 < this.field672.length; var2++) {
                this.field672[var2] = null;
            }
        }
        if (!arg0) {
            field657 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)Z")
    public final boolean method448(int arg0, int arg1, int arg2) {
        field661++;
        if (arg2 < 74) {
            this.field673 = null;
        }
        if (!this.method431(arg1, arg0, -4915)) {
            return false;
        } else if (this.field672[arg1] != null && this.field672[arg1][arg0] != null) {
            return true;
        } else if (this.field643[arg1] == null) {
            this.method449(-2411, arg1);
            return this.field643[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(II)V")
    private final void method449(int arg0, int arg1) {
        if (this.field648) {
            this.field643[arg1] = this.field673.method736(arg1, true);
        } else {
            this.field643[arg1] = class473.method2736(true, this.field673.method736(arg1, true), false);
        }
        field679++;
        if (arg0 != -2411) {
            field657 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(Ljava/lang/String;I)I")
    public final int method450(String arg0, int arg1) {
        if (arg1 <= 69) {
            this.method433(true, null);
        }
        field650++;
        if (this.method441(120)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field674.field3148.method2692(class194.method1228(-107, var3), (byte) -36);
            return this.method430(var4, (byte) -15);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lfi;ZI)V")
    public class53(class397 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field662 = arg2;
        this.field648 = arg1;
        this.field673 = arg0;
    }
}
