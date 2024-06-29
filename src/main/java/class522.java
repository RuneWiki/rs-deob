import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class522 {

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "Lar;")
    private class634 field7366 = null;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "Lbf;")
    private class496 field7359;

    @OriginalMember(owner = "client!pu", name = "C", descriptor = "I")
    public int field7369;

    @OriginalMember(owner = "client!pu", name = "B", descriptor = "Z")
    private boolean field7368;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "[I")
    public static int[] field7363 = new int[32];

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "[F")
    public static float[] field7376;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!pu", name = "A", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!pu", name = "D", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!pu", name = "E", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!pu", name = "G", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!pu", name = "H", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!pu", name = "N", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!pu", name = "P", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!pu", name = "Q", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!pu", name = "R", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!pu", name = "S", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "[Ljava/lang/Object;")
    private Object[] field7361;

    @OriginalMember(owner = "client!pu", name = "F", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field7372;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field7363[var1] = var0 - 1;
            var0 += var0;
        }
        field7376 = new float[4];
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II[II)[B", line = 5)
    public final byte[] method2973(int arg0, int arg1, int[] arg2, int arg3) {
        field7342++;
        if (!this.method2987(arg0, arg3, (byte) -113)) {
            return null;
        }
        if (this.field7372[arg0] == null || this.field7372[arg0][arg3] == null) {
            boolean var5 = this.method2986(arg2, arg3, arg0, (byte) 42);
            if (!var5) {
                this.method2989(arg0, -2);
                boolean var6 = this.method2986(arg2, arg3, arg0, (byte) 123);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg1 != 0) {
            this.field7369 = -16;
        }
        byte[] var7 = class59.method633(false, false, this.field7372[arg0][arg3]);
        if (this.field7369 == 1) {
            this.field7372[arg0][arg3] = null;
            if (this.field7366.field8967[arg0] == 1) {
                this.field7372[arg0] = null;
            }
        } else if (this.field7369 == 2) {
            this.field7372[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)Z", line = 53)
    private final boolean method2974(int arg0) {
        field7357++;
        if (arg0 != 100) {
            this.method2991(73, 116, (byte) 93);
        }
        if (this.field7366 == null) {
            this.field7366 = this.field7359.method825((byte) 0);
            if (this.field7366 == null) {
                return false;
            }
            this.field7361 = new Object[this.field7366.field8973];
            this.field7372 = new Object[this.field7366.field8973][];
        }
        return true;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)I", line = 77)
    public final int method2975(int arg0, int arg1) {
        field7356++;
        if (arg0 < 31) {
            return -79;
        } else if (this.method2974(100)) {
            int var3 = this.field7366.field8969.method3321(arg1, (byte) 115);
            return this.method2976((byte) 48, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BI)Z", line = 97)
    private final boolean method2976(byte arg0, int arg1) {
        field7378++;
        if (!this.method2974(100)) {
            return false;
        } else if (arg1 >= 0 && this.field7366.field8967.length > arg1 && this.field7366.field8967[arg1] != 0) {
            if (arg0 < 26) {
                this.method2996(null, (byte) 121);
            }
            return true;
        } else if (class30.field458) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)I", line = 133)
    public final int method2977(byte arg0) {
        field7380++;
        if (this.method2974(100)) {
            if (arg0 != -95) {
                this.field7368 = false;
            }
            return this.field7366.field8967.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z", line = 148)
    public final boolean method2978(String arg0, byte arg1, String arg2) {
        field7355++;
        if (!this.method2974(100)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field7366.field8969.method3321(class40.method454((byte) -127, var4), (byte) 101);
        if (var6 < 0) {
            return false;
        }
        if (arg1 > -127) {
            this.method2999((byte) 64);
        }
        int var7 = this.field7366.field8971[var6].method3321(class40.method454((byte) -127, var5), (byte) 84);
        return var7 >= 0;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)I", line = 180)
    public final int method2979(int arg0) {
        field7384++;
        if (arg0 < 95) {
            return -86;
        } else if (this.method2974(100)) {
            return this.field7366.field8964;
        } else {
            throw new IllegalStateException("");
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILjava/lang/String;)I", line = 194)
    public final int method2980(int arg0, String arg1) {
        field7345++;
        if (!this.method2974(100)) {
            return -1;
        } else if (arg0 == -9104) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field7366.field8969.method3321(class40.method454((byte) -127, var3), (byte) 75);
            return this.method2976((byte) 79, var4) ? var4 : -1;
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBI)Z", line = 214)
    public static final boolean method2981(int arg0, byte arg1, int arg2) {
        field7364++;
        int var3 = 93 % ((-arg1 - 4) / 59);
        return class433.method2578(arg0, (byte) 125, arg2) & class588.method3330(arg0, arg2, 22227);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(BI)Z", line = 224)
    public final boolean method2982(byte arg0, int arg1) {
        field7358++;
        if (!this.method2976((byte) 50, arg1)) {
            return false;
        } else if (this.field7361[arg1] == null) {
            this.method2989(arg1, -2);
            if (this.field7361[arg1] == null) {
                return arg0 == 95 ? false : false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z", line = 248)
    private final boolean method2983(String arg0, byte arg1, String arg2) {
        field7365++;
        if (!this.method2974(arg1 + 82)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        if (arg1 != 18) {
            this.method3004(0);
        }
        int var6 = this.field7366.field8969.method3321(class40.method454((byte) -127, var4), (byte) 3);
        if (this.method2976((byte) 123, var6)) {
            int var7 = this.field7366.field8971[var6].method3321(class40.method454((byte) -127, var5), (byte) 92);
            return this.method2991(var6, var7, (byte) 90);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(II)I", line = 279)
    private final int method2984(int arg0, int arg1) {
        field7375++;
        if (!this.method2976((byte) 86, arg1)) {
            return 0;
        } else if (arg0 == 0) {
            return this.field7361[arg1] == null ? this.field7359.method815(arg1, (byte) -9) : 100;
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(II)V", line = 301)
    private final void method2985(int arg0, int arg1) {
        field7381++;
        this.field7359.method824((byte) 57, arg1);
        if (arg0 != 4) {
            this.method2996(null, (byte) -51);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([IIIB)Z", line = 312)
    private final boolean method2986(int[] arg0, int arg1, int arg2, byte arg3) {
        field7341++;
        if (!this.method2976((byte) 29, arg2)) {
            return false;
        } else if (this.field7361[arg2] == null) {
            return false;
        } else {
            int var5 = this.field7366.field8963[arg2];
            int[] var6 = this.field7366.field8965[arg2];
            if (this.field7372[arg2] == null) {
                this.field7372[arg2] = new Object[this.field7366.field8967[arg2]];
            }
            Object[] var7 = this.field7372[arg2];
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
            int var11 = -2 / ((-arg3 - 59) / 57);
            byte[] var12;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var12 = class59.method633(false, false, this.field7361[arg2]);
            } else {
                var12 = class59.method633(false, true, this.field7361[arg2]);
                class695 var13 = new class695(var12);
                var13.method3830(arg0, var13.field9796.length, 5, (byte) 93);
            }
            byte[] var14;
            try {
                var14 = class372.method2248(1, var12);
            } catch (RuntimeException var50) {
                throw class26.method314(var50, "T3 - " + (arg0 != null) + "," + arg2 + "," + var12.length + "," + class686.method3784(-8, var12.length, var12) + "," + class686.method3784(-8, var12.length - 2, var12) + "," + this.field7366.field8961[arg2] + "," + this.field7366.field8964);
            }
            if (this.field7368) {
                this.field7361[arg2] = null;
            }
            if (var5 <= 1) {
                int var49;
                if (var6 == null) {
                    var49 = 0;
                } else {
                    var49 = var6[0];
                }
                if (this.field7369 == 0) {
                    var7[var49] = class62.method647((byte) 52, var14, false);
                } else {
                    var7[var49] = var14;
                }
            } else if (this.field7369 == 2) {
                int var16 = var14.length;
                int var51 = var16 - 1;
                int var17 = var14[var51] & 0xFF;
                int var18 = var51 - var17 * 4 * var5;
                class695 var19 = new class695(var14);
                int var20 = 0;
                int var21 = 0;
                var19.field9761 = var18;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method3880(8);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg1 == var25) {
                            var21 = var25;
                            var20 += var23;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                int var27 = 0;
                var19.field9761 = var18;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method3880(8);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg1 == var32) {
                            class476.method2792(var14, var28, var26, var27, var30);
                            var27 += var30;
                        }
                        var28 += var30;
                    }
                }
                var7[var21] = var26;
            } else {
                int var33 = var14.length;
                int var52 = var33 - 1;
                int var34 = var14[var52] & 0xFF;
                int var35 = var52 - var5 * var34 * 4;
                class695 var36 = new class695(var14);
                int[] var37 = new int[var5];
                var36.field9761 = var35;
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method3880(8);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field9761 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method3880(8);
                        class476.method2792(var14, var43, var41[var46], var37[var46], var45);
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
                    if (this.field7369 == 0) {
                        var7[var48] = class62.method647((byte) 93, var41[var47], false);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIB)Z", line = 597)
    private final boolean method2987(int arg0, int arg1, byte arg2) {
        field7354++;
        if (!this.method2974(100)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field7366.field8967.length && this.field7366.field8967[arg0] > arg1) {
            return arg2 < -81;
        } else if (class30.field458) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(II)I", line = 624)
    public final int method2988(int arg0, int arg1) {
        field7350++;
        if (this.method2976((byte) 93, arg1)) {
            int var3 = 56 % ((34 - arg0) / 34);
            return this.field7366.field8967[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "(II)V", line = 638)
    private final void method2989(int arg0, int arg1) {
        field7348++;
        if (this.field7368) {
            this.field7361[arg0] = this.field7359.method827(arg0, -27961);
        } else {
            this.field7361[arg0] = class62.method647((byte) 54, this.field7359.method827(arg0, class189.method1273(arg1, 27961)), false);
        }
        if (arg1 != -2) {
            this.method2992((byte) 3, null);
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)I", line = 654)
    public final int method2990(int arg0) {
        if (arg0 < 38) {
            return -11;
        }
        field7344++;
        if (!this.method2974(100)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field7361.length; var4++) {
            if (this.field7366.field8963[var4] > 0) {
                var2 += 100;
                var3 += this.method2984(0, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(IIB)Z", line = 694)
    public final boolean method2991(int arg0, int arg1, byte arg2) {
        field7367++;
        if (!this.method2987(arg0, arg1, (byte) -110)) {
            return false;
        } else if (this.field7372[arg0] != null && this.field7372[arg0][arg1] != null) {
            return true;
        } else if (this.field7361[arg0] == null) {
            int var4 = 16 % ((arg2 - 45) / 35);
            this.method2989(arg0, -2);
            return this.field7361[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 719)
    public final boolean method2992(byte arg0, String arg1) {
        field7370++;
        if (!this.method2974(arg0 + 223)) {
            return false;
        } else if (arg0 == -123) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field7366.field8969.method3321(class40.method454((byte) -127, var3), (byte) 89);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)V", line = 745)
    public final void method2993(int arg0) {
        if (this.field7372 != null) {
            for (int var2 = 0; var2 < this.field7372.length; var2++) {
                this.field7372[var2] = null;
            }
        }
        if (arg0 != -1) {
            this.method2995(-21, -41);
        }
        field7382++;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)[B", line = 772)
    public final byte[] method2994(int arg0, byte arg1) {
        field7349++;
        if (!this.method2974(arg1 + 7)) {
            return null;
        } else if (this.field7366.field8967.length == 1) {
            return this.method3007(0, arg0, arg1 - 88);
        } else if (this.method2976((byte) 121, arg0)) {
            if (arg1 != 93) {
                this.method2988(28, 33);
            }
            if (this.field7366.field8967[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method3007(arg0, 0, arg1 - 88);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "(II)V", line = 801)
    public final void method2995(int arg0, int arg1) {
        if (arg1 >= 97) {
            field7383++;
            if (this.method2976((byte) 66, arg0) && this.field7372 != null) {
                this.field7372[arg0] = null;
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 821)
    public final int method2996(String arg0, byte arg1) {
        field7351++;
        if (!this.method2974(100)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 == -80) {
            int var4 = this.field7366.field8969.method3321(class40.method454((byte) -127, var3), (byte) 53);
            return this.method2984(0, var4);
        } else {
            return -48;
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(BI)Z", line = 840)
    public final boolean method2997(byte arg0, int arg1) {
        field7352++;
        if (!this.method2974(100)) {
            return false;
        } else if (this.field7366.field8967.length == 1) {
            return this.method2991(0, arg1, (byte) 3);
        } else if (!this.method2976((byte) 45, arg1)) {
            return false;
        } else if (this.field7366.field8967[arg1] == 1) {
            return this.method2991(arg1, 0, (byte) -99);
        } else {
            if (arg0 != -95) {
                this.field7361 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V", line = 867)
    public static void method2998(byte arg0) {
        field7363 = null;
        int var1 = -113 / ((arg0 - 47) / 43);
        field7376 = null;
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(B)V", line = 882)
    public final void method2999(byte arg0) {
        if (arg0 != 56) {
            this.field7359 = null;
        }
        field7379++;
        if (this.field7361 != null) {
            for (int var2 = 0; var2 < this.field7361.length; var2++) {
                this.field7361[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZZB)V", line = 904)
    public final void method3000(boolean arg0, boolean arg1, byte arg2) {
        field7347++;
        if (!this.method2974(100)) {
            return;
        }
        if (arg2 < 42) {
            this.method2999((byte) -8);
        }
        if (arg0) {
            this.field7366.field8971 = null;
            this.field7366.field8972 = null;
        }
        if (arg1) {
            this.field7366.field8969 = null;
            this.field7366.field8976 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 931)
    public final boolean method3001(String arg0, boolean arg1) {
        field7371++;
        if (!this.method2974(100)) {
            return false;
        } else if (arg1) {
            return false;
        } else {
            String var3 = arg0.toLowerCase();
            int var4 = this.field7366.field8969.method3321(class40.method454((byte) -127, var3), (byte) 115);
            return this.method2982((byte) 95, var4);
        }
    }

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "(II)[I", line = 953)
    public final int[] method3002(int arg0, int arg1) {
        if (arg1 <= 8) {
            return null;
        }
        field7360++;
        if (!this.method2976((byte) 56, arg0)) {
            return null;
        }
        int[] var3 = this.field7366.field8965[arg0];
        if (var3 == null) {
            var3 = new int[this.field7366.field8963[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZIIII)V", line = 983)
    public static final void method3003(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field7353++;
        int var7 = class537.method3051(-10168, arg0, class239.field3747, class520.field7329);
        int var8 = class537.method3051(-10168, arg3, class239.field3747, class520.field7329);
        int var9 = class537.method3051(-10168, arg4, class248.field3859, class15.field153);
        int var10 = class537.method3051(-10168, arg6, class248.field3859, class15.field153);
        int var11 = class537.method3051(-10168, arg0 + arg1, class239.field3747, class520.field7329);
        int var12 = class537.method3051(-10168, arg3 - arg1, class239.field3747, class520.field7329);
        int var13 = var7;
        if (arg2) {
            field7376 = null;
        }
        while (var11 > var13) {
            class58.method623(arg5, var10, 23309, class651.field9125[var13], var9);
            var13++;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class58.method623(arg5, var10, 23309, class651.field9125[var14], var9);
        }
        int var15 = class537.method3051(-10168, arg1 + arg4, class248.field3859, class15.field153);
        int var16 = class537.method3051(-10168, arg6 - arg1, class248.field3859, class15.field153);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class651.field9125[var17];
            class58.method623(arg5, var15, 23309, var18, var9);
            class58.method623(arg5, var10, 23309, var18, var16);
        }
    }

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)Z", line = 1035)
    public final boolean method3004(int arg0) {
        field7343++;
        if (!this.method2974(100)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field7366.field8977.length; var3++) {
            int var4 = this.field7366.field8977[var3];
            if (this.field7361[var4] == null) {
                this.method2989(var4, -2);
                if (this.field7361[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLfr;Lfr;)V", line = 1091)
    public static final void method3005(byte arg0, class375 arg1, class375 arg2) {
        field7374++;
        if (arg1.field5349 != null) {
            arg1.method2258((byte) 118);
        }
        arg1.field5349 = arg2;
        arg1.field5347 = arg2.field5347;
        arg1.field5349.field5347 = arg1;
        arg1.field5347.field5349 = arg1;
        int var3 = 6 % ((arg0 - 10) / 38);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(Ljava/lang/String;B)Z", line = 1110)
    public final boolean method3006(String arg0, byte arg1) {
        field7346++;
        if (arg1 >= -88) {
            return true;
        } else {
            int var3 = this.method2980(-9104, "");
            return var3 == -1 ? this.method2983(arg0, (byte) 18, "") : this.method2983("", (byte) 18, arg0);
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lbf;ZI)V", line = 1134)
    public class522(class496 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field7359 = arg0;
        this.field7369 = arg2;
        this.field7368 = arg1;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)[B", line = 1151)
    public final byte[] method3007(int arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            field7373++;
            return this.method2973(arg0, 0, null, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(BLjava/lang/String;)V", line = 1166)
    public final void method3008(byte arg0, String arg1) {
        field7362++;
        if (this.method2974(100) && arg0 < -105) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field7366.field8969.method3321(class40.method454((byte) -127, var3), (byte) 32);
            this.method2985(4, var4);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B", line = 1184)
    public final byte[] method3009(String arg0, String arg1, int arg2) {
        field7377++;
        if (!this.method2974(arg2 + 100)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field7366.field8969.method3321(class40.method454((byte) -127, var4), (byte) 7);
        if (arg2 != 0) {
            return null;
        } else if (this.method2976((byte) 37, var6)) {
            int var7 = this.field7366.field8971[var6].method3321(class40.method454((byte) -127, var5), (byte) 119);
            return this.method3007(var6, var7, 5);
        } else {
            return null;
        }
    }
}
