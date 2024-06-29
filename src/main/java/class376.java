import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class376 {

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "Ler;")
    private class54 field5288 = null;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "Llk;")
    private class351 field5275;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "I")
    public int field5303;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "Z")
    private boolean field5294;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "Liq;")
    public static class362 field5307;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "Lrd;")
    public static class185 field5287;

    @OriginalMember(owner = "client!tq", name = "O", descriptor = "Lgj;")
    public static class381 field5308;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "[I")
    public static int[] field5269;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "[Ljava/lang/Object;")
    private Object[] field5306;

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field5299;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public final void method2404(byte arg0) {
        if (arg0 != -98) {
            field5269 = null;
        }
        field5295++;
        if (this.field5299 != null) {
            for (int var2 = 0; var2 < this.field5299.length; var2++) {
                this.field5299[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method2405(String arg0, byte arg1) {
        field5273++;
        if (arg1 != -65) {
            field5308 = null;
        }
        if (this.method2411(107)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field5288.field637.method2124(class433.method2715(arg1 ^ 0xFFFFFFBE, var3), 102);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(Ljava/lang/String;B)V")
    public final void method2406(String arg0, byte arg1) {
        field5297++;
        if (arg1 <= -70 && this.method2411(115)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field5288.field637.method2124(class433.method2715(1, var3), 91);
            this.method2435(4675, var4);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public static void method2407(int arg0) {
        if (arg0 == 0) {
            field5308 = null;
            field5287 = null;
            field5307 = null;
            field5269 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
    public final byte[] method2408(String arg0, String arg1, int arg2) {
        field5300++;
        if (!this.method2411(111)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field5288.field637.method2124(class433.method2715(1, var4), 45);
        if (!this.method2428(var6, true)) {
            return null;
        }
        if (arg2 > -48) {
            field5269 = null;
        }
        int var7 = this.field5288.field646[var6].method2124(class433.method2715(1, var5), 92);
        return this.method2431((byte) 73, var6, var7);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)V")
    private final void method2409(int arg0, int arg1) {
        field5282++;
        if (this.field5294) {
            this.field5306[arg0] = this.field5275.method2239((byte) 118, arg0);
        } else {
            this.field5306[arg0] = class388.method2487(this.field5275.method2239((byte) 90, arg0), 16293, false);
        }
        int var3 = 17 / ((arg1 - 9) / 52);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method2410(int arg0, String arg1, String arg2) {
        field5270++;
        if (!this.method2411(109)) {
            return false;
        } else if (arg0 == -1) {
            String var4 = arg1.toLowerCase();
            String var5 = arg2.toLowerCase();
            int var6 = this.field5288.field637.method2124(class433.method2715(1, var4), 26);
            if (this.method2428(var6, true)) {
                int var7 = this.field5288.field646[var6].method2124(class433.method2715(1, var5), 22);
                return this.method2426(false, var6, var7);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Z")
    private final boolean method2411(int arg0) {
        field5302++;
        if (this.field5288 == null) {
            this.field5288 = this.field5275.method2240(255);
            if (this.field5288 == null) {
                return false;
            }
            this.field5299 = new Object[this.field5288.field633][];
            this.field5306 = new Object[this.field5288.field633];
        }
        if (arg0 < 94) {
            this.method2424((byte) 28);
        }
        return true;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)Z")
    public final boolean method2412(int arg0, int arg1) {
        field5285++;
        if (!this.method2411(95)) {
            return false;
        } else if (this.field5288.field645.length == 1) {
            return this.method2426(false, 0, arg0);
        } else if (!this.method2428(arg0, true)) {
            return false;
        } else if (this.field5288.field645[arg0] == 1) {
            return this.method2426(false, arg0, 0);
        } else {
            if (arg1 < 120) {
                this.method2413(false, true, 55);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZZI)V")
    public final void method2413(boolean arg0, boolean arg1, int arg2) {
        field5278++;
        if (!this.method2411(arg2 ^ 0x3E36)) {
            return;
        }
        if (arg2 != 15965) {
            field5269 = null;
        }
        if (arg0) {
            this.field5288.field637 = null;
            this.field5288.field644 = null;
        }
        if (arg1) {
            this.field5288.field636 = null;
            this.field5288.field646 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)I")
    public final int method2414(byte arg0) {
        field5277++;
        if (!this.method2411(122)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5306.length; var4++) {
            if (this.field5288.field640[var4] > 0) {
                var2 += 100;
                var3 += this.method2434(var4, (byte) -34);
            }
        }
        if (var2 == 0) {
            return 100;
        }
        int var5 = var3 * 100 / var2;
        if (arg0 <= 97) {
            this.field5306 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)I")
    public final int method2415(int arg0, byte arg1) {
        if (arg1 != 56) {
            this.method2404((byte) -32);
        }
        field5271++;
        return this.method2428(arg0, true) ? this.field5288.field645[arg0] : 0;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(II)V")
    public final void method2416(int arg0, int arg1) {
        field5305++;
        if (!this.method2428(arg0, true)) {
            return;
        }
        if (arg1 != 25930) {
            field5269 = null;
        }
        if (this.field5299 != null) {
            this.field5299[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V")
    public final void method2417(int arg0) {
        if (arg0 != 0) {
            this.method2404((byte) -39);
        }
        if (this.field5306 != null) {
            for (int var2 = 0; var2 < this.field5306.length; var2++) {
                this.field5306[var2] = null;
            }
        }
        field5289++;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(Ljava/lang/String;B)I")
    public final int method2418(String arg0, byte arg1) {
        field5284++;
        if (!this.method2411(103)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field5288.field637.method2124(class433.method2715(1, var3), 126);
        if (arg1 != -23) {
            field5269 = null;
        }
        return this.method2428(var4, true) ? var4 : -1;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)[I")
    public final int[] method2419(byte arg0, int arg1) {
        field5301++;
        if (arg0 != 95) {
            this.method2435(110, -34);
        }
        if (!this.method2428(arg1, true)) {
            return null;
        }
        int[] var3 = this.field5288.field652[arg1];
        if (var3 == null) {
            var3 = new int[this.field5288.field640[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(II)[B")
    public final byte[] method2420(int arg0, int arg1) {
        field5298++;
        if (arg1 != -1) {
            return null;
        } else if (!this.method2411(110)) {
            return null;
        } else if (this.field5288.field645.length == 1) {
            return this.method2431((byte) 123, 0, arg0);
        } else if (!this.method2428(arg0, true)) {
            return null;
        } else if (this.field5288.field645[arg0] == 1) {
            return this.method2431((byte) 86, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Z")
    private final boolean method2421(int arg0, int arg1, int arg2) {
        field5292++;
        if (arg1 != -1) {
            return false;
        } else if (!this.method2411(123)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && arg0 < this.field5288.field645.length && arg2 < this.field5288.field645[arg0]) {
            return true;
        } else if (class429.field6201) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([IIII)[B")
    public final byte[] method2422(int[] arg0, int arg1, int arg2, int arg3) {
        field5281++;
        if (!this.method2421(arg1, -1, arg2)) {
            return null;
        }
        if (this.field5299[arg1] == null || this.field5299[arg1][arg2] == null) {
            boolean var5 = this.method2423(0, arg0, arg2, arg1);
            if (!var5) {
                this.method2409(arg1, -64);
                boolean var6 = this.method2423(0, arg0, arg2, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class167.method1130(false, -35, this.field5299[arg1][arg2]);
        if (arg3 != -18233) {
            this.field5275 = null;
        }
        if (this.field5303 == 1) {
            this.field5299[arg1][arg2] = null;
            if (this.field5288.field645[arg1] == 1) {
                this.field5299[arg1] = null;
            }
        } else if (this.field5303 == 2) {
            this.field5299[arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[III)Z")
    private final boolean method2423(int arg0, int[] arg1, int arg2, int arg3) {
        field5293++;
        if (!this.method2428(arg3, true)) {
            return false;
        } else if (this.field5306[arg3] == null) {
            return false;
        } else {
            int var5 = this.field5288.field640[arg3];
            int[] var6 = this.field5288.field652[arg3];
            if (this.field5299[arg3] == null) {
                this.field5299[arg3] = new Object[this.field5288.field645[arg3]];
            }
            Object[] var7 = this.field5299[arg3];
            boolean var8 = true;
            if (arg0 != 0) {
                this.method2414((byte) 92);
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
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var11 = class167.method1130(true, -32, this.field5306[arg3]);
                class236 var12 = new class236(var11);
                var12.method1576(5, 106, var12.field3364.length, arg1);
            } else {
                var11 = class167.method1130(false, arg0 ^ 0xFFFFFFD9, this.field5306[arg3]);
            }
            byte[] var13;
            try {
                var13 = class19.method135(var11, (byte) -128);
            } catch (RuntimeException var49) {
                throw class382.method2453(var49, "T3 - " + (arg1 != null) + "," + arg3 + "," + var11.length + "," + class25.method174(var11.length, var11, arg0 + 74) + "," + class25.method174(var11.length - 2, var11, 108) + "," + this.field5288.field641[arg3] + "," + this.field5288.field642);
            }
            if (this.field5294) {
                this.field5306[arg3] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field5303 == 0) {
                    var7[var15] = class388.method2487(var13, 16293, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field5303 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * 4 * var33;
                class236 var35 = new class236(var13);
                int var36 = 0;
                var35.field3320 = var34;
                int var37 = 0;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method1597(arg0 + 3641);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg2 == var41) {
                            var37 = var41;
                            var36 += var39;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                int var43 = 0;
                var35.field3320 = var34;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method1597(3641);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg2 == var48) {
                            class316.method2075(var13, var44, var42, var43, var46);
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
                int var18 = var50 - var5 * 4 * var17;
                class236 var19 = new class236(var13);
                int[] var20 = new int[var5];
                var19.field3320 = var18;
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method1597(arg0 + 3641);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field3320 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method1597(arg0 ^ 0xE39);
                        class316.method2075(var13, var26, var24[var29], var20[var29], var28);
                        var20[var29] += var28;
                        var26 += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field5303 == 0) {
                        var7[var31] = class388.method2487(var24[var30], class2.method10(arg0, 16293), false);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)Z")
    public final boolean method2424(byte arg0) {
        field5304++;
        if (!this.method2411(100)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field5288.field639.length; var3++) {
            int var4 = this.field5288.field639[var3];
            if (this.field5306[var4] == null) {
                this.method2409(var4, -48);
                if (this.field5306[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 >= -114) {
            this.method2429((byte) -122, -127);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)I")
    public final int method2425(byte arg0) {
        field5286++;
        int var2 = 121 % ((arg0 - 75) / 47);
        if (!this.method2411(103)) {
            throw new IllegalStateException("");
        }
        return this.field5288.field642;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZII)Z")
    public final boolean method2426(boolean arg0, int arg1, int arg2) {
        field5274++;
        if (arg0) {
            this.method2424((byte) -110);
        }
        if (!this.method2421(arg1, -1, arg2)) {
            return false;
        } else if (this.field5299[arg1] != null && this.field5299[arg1][arg2] != null) {
            return true;
        } else if (this.field5306[arg1] == null) {
            this.method2409(arg1, 101);
            return this.field5306[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method2427(byte arg0, String arg1) {
        field5296++;
        if (!this.method2411(109)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 <= 124) {
            this.method2430((byte) -90, (String) null);
        }
        int var4 = this.field5288.field637.method2124(class433.method2715(1, var3), 98);
        return this.method2429((byte) -75, var4);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZ)Z")
    private final boolean method2428(int arg0, boolean arg1) {
        if (!arg1) {
            this.field5294 = false;
        }
        field5272++;
        if (!this.method2411(103)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field5288.field645.length && this.field5288.field645[arg0] != 0) {
            return true;
        } else if (class429.field6201) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(BI)Z")
    public final boolean method2429(byte arg0, int arg1) {
        field5279++;
        if (!this.method2428(arg1, true)) {
            return false;
        } else if (this.field5306[arg1] == null) {
            if (arg0 != -75) {
                this.method2404((byte) 123);
            }
            this.method2409(arg1, -88);
            return this.field5306[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(BLjava/lang/String;)I")
    public final int method2430(byte arg0, String arg1) {
        field5290++;
        if (!this.method2411(122)) {
            return 0;
        }
        if (arg0 >= -80) {
            this.method2416(-43, -13);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field5288.field637.method2124(class433.method2715(1, var3), 111);
        return this.method2434(var4, (byte) -34);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BII)[B")
    public final byte[] method2431(byte arg0, int arg1, int arg2) {
        if (arg0 < 60) {
            this.field5299 = null;
        }
        field5280++;
        return this.method2422((int[]) null, arg1, arg2, -18233);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)I")
    public final int method2432(boolean arg0) {
        field5276++;
        if (!arg0) {
            this.field5303 = -128;
        }
        return this.method2411(121) ? this.field5288.field645.length : -1;
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(II)I")
    public final int method2433(int arg0, int arg1) {
        field5309++;
        if (!this.method2411(111)) {
            return -1;
        }
        int var3 = this.field5288.field637.method2124(arg0, 34);
        if (arg1 != -1) {
            this.method2433(29, -85);
        }
        return this.method2428(var3, true) ? var3 : -1;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(IB)I")
    private final int method2434(int arg0, byte arg1) {
        field5283++;
        if (!this.method2428(arg0, true)) {
            return 0;
        } else if (arg1 == -34) {
            return this.field5306[arg0] == null ? this.field5275.method2243(arg0, (byte) 1) : 100;
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Llk;ZI)V")
    public class376(class351 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field5275 = arg0;
        this.field5303 = arg2;
        this.field5294 = arg1;
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(II)V")
    private final void method2435(int arg0, int arg1) {
        field5291++;
        this.field5275.method2244(arg1, (byte) 31);
        if (arg0 != 4675) {
            field5307 = null;
        }
    }

    static {
        new class362("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field5307 = new class362("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
    }
}
