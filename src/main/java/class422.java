import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class422 {

    @OriginalMember(owner = "client!la", name = "E", descriptor = "Luj;")
    private class436 field6207 = null;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "Z")
    private boolean field6211;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Luda;")
    private class438 field6178;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    public int field6219;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "Lcn;")
    public static class306 field6216;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "[Ljava/lang/Object;")
    private Object[] field6210;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6217;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)Z")
    public final boolean method2607(int arg0, byte arg1) {
        field6194++;
        if (!this.method2626(arg0, -119)) {
            return false;
        } else if (this.field6210[arg0] == null) {
            this.method2613(0, arg0);
            if (this.field6210[arg0] == null) {
                if (arg1 >= -70) {
                    this.field6211 = true;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method2608(String arg0, boolean arg1) {
        field6186++;
        if (!this.method2641((byte) -49)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field6207.field6362.method2457(11146, class374.method2373(var3, 125));
        if (var4 < 0) {
            return false;
        } else {
            if (arg1) {
                this.method2611((byte) 104);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public final void method2609(int arg0) {
        field6183++;
        if (this.field6210 != null) {
            for (int var2 = 0; var2 < this.field6210.length; var2++) {
                this.field6210[var2] = null;
            }
        }
        if (arg0 <= 62) {
            field6216 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Z")
    public static final boolean method2610(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field6216 = null;
        }
        field6180++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public final void method2611(byte arg0) {
        if (arg0 <= 88) {
            return;
        }
        field6198++;
        if (this.field6217 != null) {
            for (int var2 = 0; var2 < this.field6217.length; var2++) {
                this.field6217[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[III)Z")
    private final boolean method2612(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 != -5385) {
            this.field6207 = null;
        }
        field6191++;
        if (!this.method2626(arg2, arg3 ^ 0x1577)) {
            return false;
        } else if (this.field6210[arg2] == null) {
            return false;
        } else {
            int var5 = this.field6207.field6360[arg2];
            int[] var6 = this.field6207.field6367[arg2];
            if (this.field6217[arg2] == null) {
                this.field6217[arg2] = new Object[this.field6207.field6377[arg2]];
            }
            Object[] var7 = this.field6217[arg2];
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
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var11 = class512.method3076(this.field6210[arg2], 10583, false);
            } else {
                var11 = class512.method3076(this.field6210[arg2], 10583, true);
                class301 var12 = new class301(var11);
                var12.method1949(5, 255, arg1, var12.field4543.length);
            }
            byte[] var13;
            try {
                var13 = class196.method1474(var11, 0);
            } catch (RuntimeException var49) {
                throw class486.method2954(var49, "T3 - " + (arg1 != null) + "," + arg2 + "," + var11.length + "," + class172.method1359(var11.length, false, var11) + "," + class172.method1359(var11.length - 2, false, var11) + "," + this.field6207.field6355[arg2] + "," + this.field6207.field6356);
            }
            if (this.field6211) {
                this.field6210[arg2] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field6219 == 0) {
                    var7[var48] = class48.method481(var13, 117, false);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field6219 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var16 * 4 * var5;
                class301 var18 = new class301(var13);
                int var19 = 0;
                int var20 = 0;
                var18.field4534 = var17;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method1934(-2);
                        int var24;
                        if (var6 == null) {
                            var24 = var23;
                        } else {
                            var24 = var6[var23];
                        }
                        if (arg0 == var24) {
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
                var18.field4534 = var17;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method1934(-2);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg0 == var31) {
                            class571.method3313(var13, var27, var25, var26, var29);
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
                class301 var35 = new class301(var13);
                var35.field4534 = var34;
                int[] var36 = new int[var5];
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method1934(arg3 ^ 0x1509);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field4534 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method1934(-2);
                        class571.method3313(var13, var42, var40[var45], var36[var45], var44);
                        var36[var45] += var44;
                        var42 += var44;
                    }
                }
                for (int var46 = 0; var46 < var5; var46++) {
                    int var47;
                    if (var6 == null) {
                        var47 = var46;
                    } else {
                        var47 = var6[var46];
                    }
                    if (this.field6219 == 0) {
                        var7[var47] = class48.method481(var40[var46], 126, false);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
    private final void method2613(int arg0, int arg1) {
        if (this.field6211) {
            this.field6210[arg1] = this.field6178.method2697(false, arg1);
        } else {
            this.field6210[arg1] = class48.method481(this.field6178.method2697(false, arg1), 117, false);
        }
        field6181++;
        if (arg0 != 0) {
            this.method2619(-88, false);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
    public final void method2614(int arg0, int arg1) {
        field6179++;
        if (arg0 != -32090) {
            this.field6219 = -109;
        }
        if (this.method2626(arg1, -121) && this.field6217 != null) {
            this.field6217[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)I")
    public final int method2615(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method2613(84, -86);
        }
        field6195++;
        return this.method2626(arg1, -114) ? this.field6207.field6377[arg1] : 0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IIII)[B")
    public final byte[] method2616(int[] arg0, int arg1, int arg2, int arg3) {
        field6196++;
        int var5 = -74 / ((arg1 + 36) / 45);
        if (!this.method2617(-1, arg2, arg3)) {
            return null;
        }
        if (this.field6217[arg3] == null || this.field6217[arg3][arg2] == null) {
            boolean var6 = this.method2612(arg2, arg0, arg3, -5385);
            if (!var6) {
                this.method2613(0, arg3);
                boolean var7 = this.method2612(arg2, arg0, arg3, -5385);
                if (!var7) {
                    return null;
                }
            }
        }
        byte[] var8 = class512.method3076(this.field6217[arg3][arg2], 10583, false);
        if (this.field6219 == 1) {
            this.field6217[arg3][arg2] = null;
            if (this.field6207.field6377[arg3] == 1) {
                this.field6217[arg3] = null;
            }
        } else if (this.field6219 == 2) {
            this.field6217[arg3] = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(III)Z")
    private final boolean method2617(int arg0, int arg1, int arg2) {
        field6205++;
        if (arg0 != -1) {
            this.method2636(null, null, -69);
        }
        if (!this.method2641((byte) -60)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && this.field6207.field6377.length > arg2 && arg1 < this.field6207.field6377[arg2]) {
            return true;
        } else if (class277.field4212) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method2618(String arg0, byte arg1) {
        field6185++;
        int var3 = 123 / ((81 - arg1) / 39);
        int var4 = this.method2629("", 10912);
        return var4 == -1 ? this.method2636("", arg0, 255) : this.method2636(arg0, "", 255);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)[I")
    public final int[] method2619(int arg0, boolean arg1) {
        field6202++;
        if (!arg1) {
            this.field6210 = null;
        }
        if (!this.method2626(arg0, -113)) {
            return null;
        }
        int[] var3 = this.field6207.field6367[arg0];
        if (var3 == null) {
            var3 = new int[this.field6207.field6360[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZZZ)V")
    public final void method2620(boolean arg0, boolean arg1, boolean arg2) {
        field6200++;
        if (!arg1 || !this.method2641((byte) -103)) {
            return;
        }
        if (arg0) {
            this.field6207.field6370 = null;
            this.field6207.field6362 = null;
        }
        if (arg2) {
            this.field6207.field6371 = null;
            this.field6207.field6365 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(II)Z")
    public final boolean method2621(int arg0, int arg1) {
        field6182++;
        if (!this.method2641((byte) 116)) {
            return false;
        } else if (this.field6207.field6377.length == 1) {
            return this.method2640(0, arg0, 107);
        } else if (!this.method2626(arg0, -104)) {
            return false;
        } else if (arg1 != -28975) {
            return true;
        } else if (this.field6207.field6377[arg0] == 1) {
            return this.method2640(arg0, 0, 127);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2622(int arg0, String arg1) {
        if (arg0 != 16) {
            this.field6210 = null;
        }
        field6214++;
        if (this.method2641((byte) -57)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field6207.field6362.method2457(11146, class374.method2373(var3, 117));
            this.method2639(5904, var4);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public static void method2623(boolean arg0) {
        if (arg0) {
            field6216 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(III)[B")
    public final byte[] method2624(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field6211 = false;
        }
        field6188++;
        return this.method2616(null, arg0 ^ 0xFFFFFF99, arg2, arg1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)I")
    public final int method2625(byte arg0, int arg1) {
        if (arg0 != 21) {
            this.field6217 = null;
        }
        field6187++;
        if (this.method2641((byte) -57)) {
            int var3 = this.field6207.field6362.method2457(11146, arg1);
            return this.method2626(var3, -105) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(II)Z")
    private final boolean method2626(int arg0, int arg1) {
        field6197++;
        if (!this.method2641((byte) 93)) {
            return false;
        }
        if (arg1 >= -101) {
            this.method2609(-3);
        }
        if (arg0 >= 0 && arg0 < this.field6207.field6377.length && this.field6207.field6377[arg0] != 0) {
            return true;
        } else if (class277.field4212) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IB)I")
    private final int method2627(int arg0, byte arg1) {
        field6212++;
        if (!this.method2626(arg0, -110)) {
            return 0;
        } else if (this.field6210[arg0] == null) {
            int var3 = 70 % ((-arg1 - 59) / 43);
            return this.field6178.method2701(-65, arg0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)I")
    public final int method2628(int arg0) {
        field6213++;
        int var2 = -31 / ((arg0 + 39) / 60);
        return this.method2641((byte) 88) ? this.field6207.field6377.length : -1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method2629(String arg0, int arg1) {
        field6192++;
        if (!this.method2641((byte) 97)) {
            return -1;
        }
        if (arg1 != 10912) {
            field6216 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field6207.field6362.method2457(11146, class374.method2373(var3, 125));
        return this.method2626(var4, -117) ? var4 : -1;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IZ)Z")
    public static final boolean method2630(int arg0, boolean arg1) {
        if (!arg1) {
            field6216 = null;
        }
        field6184++;
        return arg0 == 1 || arg0 == 3 || arg0 == 5;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method2631(int arg0, String arg1) {
        field6199++;
        if (!this.method2641((byte) -57)) {
            return 0;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 == 0) {
            int var4 = this.field6207.field6362.method2457(11146, class374.method2373(var3, 120));
            return this.method2627(var4, (byte) -112);
        } else {
            return 38;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)Z")
    public final boolean method2632(int arg0) {
        field6201++;
        if (!this.method2641((byte) 119)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field6207.field6366.length; var3++) {
            int var4 = this.field6207.field6366[var3];
            if (this.field6210[var4] == null) {
                this.method2613(0, var4);
                if (this.field6210[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)[B")
    public final byte[] method2633(boolean arg0, int arg1) {
        field6193++;
        if (!arg0) {
            this.method2640(-63, -103, 62);
        }
        if (!this.method2641((byte) -110)) {
            return null;
        } else if (this.field6207.field6377.length == 1) {
            return this.method2624(0, 0, arg1);
        } else if (!this.method2626(arg1, -103)) {
            return null;
        } else if (this.field6207.field6377[arg1] == 1) {
            return this.method2624(0, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)I")
    public final int method2634(byte arg0) {
        field6203++;
        if (arg0 != 0) {
            this.method2638(null, 84, null);
        }
        if (!this.method2641((byte) 88)) {
            throw new IllegalStateException("");
        }
        return this.field6207.field6356;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method2635(int arg0, String arg1, String arg2) {
        field6218++;
        int var4 = 61 % ((3 - arg0) / 54);
        if (!this.method2641((byte) 115)) {
            return false;
        }
        String var5 = arg1.toLowerCase();
        String var6 = arg2.toLowerCase();
        int var7 = this.field6207.field6362.method2457(11146, class374.method2373(var5, 122));
        if (var7 < 0) {
            return false;
        } else {
            int var8 = this.field6207.field6365[var7].method2457(11146, class374.method2373(var6, 117));
            return var8 >= 0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    private final boolean method2636(String arg0, String arg1, int arg2) {
        field6215++;
        if (!this.method2641((byte) 96)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        if (arg2 != 255) {
            this.method2620(false, true, false);
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field6207.field6362.method2457(11146, class374.method2373(var4, 118));
        if (this.method2626(var6, -103)) {
            int var7 = this.field6207.field6365[var6].method2457(11146, class374.method2373(var5, arg2 - 135));
            return this.method2640(var6, var7, arg2 ^ 0x89);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)I")
    public final int method2637(int arg0) {
        field6209++;
        if (!this.method2641((byte) 104)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 84 % ((arg0 + 54) / 42);
        for (int var5 = 0; var5 < this.field6210.length; var5++) {
            if (this.field6207.field6360[var5] > 0) {
                var2 += 100;
                var3 += this.method2627(var5, (byte) 104);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
    public final byte[] method2638(String arg0, int arg1, String arg2) {
        field6206++;
        if (!this.method2641((byte) 87)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        if (arg1 < 24) {
            this.method2617(-30, 11, -21);
        }
        int var6 = this.field6207.field6362.method2457(11146, class374.method2373(var4, 122));
        if (this.method2626(var6, -116)) {
            int var7 = this.field6207.field6365[var6].method2457(11146, class374.method2373(var5, 117));
            return this.method2624(0, var6, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(II)V")
    private final void method2639(int arg0, int arg1) {
        this.field6178.method2698(-2, arg1);
        field6189++;
        if (arg0 != 5904) {
            this.method2637(65);
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(III)Z")
    public final boolean method2640(int arg0, int arg1, int arg2) {
        if (arg2 < 95) {
            this.field6217 = null;
        }
        field6190++;
        if (!this.method2617(-1, arg1, arg0)) {
            return false;
        } else if (this.field6217[arg0] != null && this.field6217[arg0][arg1] != null) {
            return true;
        } else if (this.field6210[arg0] == null) {
            this.method2613(0, arg0);
            return this.field6210[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(B)Z")
    private final boolean method2641(byte arg0) {
        int var2 = -63 % ((arg0 - 27) / 56);
        field6208++;
        if (this.field6207 == null) {
            this.field6207 = this.field6178.method2700(true);
            if (this.field6207 == null) {
                return false;
            }
            this.field6210 = new Object[this.field6207.field6373];
            this.field6217 = new Object[this.field6207.field6373][];
        }
        return true;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2642(int arg0, String arg1) {
        if (arg0 != -29983) {
            field6216 = null;
        }
        field6204++;
        if (this.method2641((byte) -121)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field6207.field6362.method2457(11146, class374.method2373(var3, 123));
            return this.method2607(var4, (byte) -119);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Luda;ZI)V")
    public class422(class438 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6211 = arg1;
        this.field6178 = arg0;
        this.field6219 = arg2;
    }
}
