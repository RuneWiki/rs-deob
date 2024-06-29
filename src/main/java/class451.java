import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class451 {

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "Lms;")
    private class76 field6397 = null;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "Ldg;")
    private class10 field6399;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Z")
    private boolean field6372;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public int field6378;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field6386 = 0;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Lat;")
    public static class412 field6377 = new class412();

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "Lhj;")
    public static class181 field6403;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "Lui;")
    public static class451 field6409;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[Ljava/lang/Object;")
    private Object[] field6368;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6410;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Z", line = 5)
    private final boolean method2657(byte arg0) {
        field6400++;
        if (arg0 < 28) {
            this.method2689(99, 72);
        }
        if (this.field6397 == null) {
            this.field6397 = this.field6399.method110((byte) -117);
            if (this.field6397 == null) {
                return false;
            }
            this.field6410 = new Object[this.field6397.field1077][];
            this.field6368 = new Object[this.field6397.field1077];
        }
        return true;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)I", line = 30)
    public static final int method2658(boolean arg0, int arg1) {
        field6395++;
        if (arg0) {
            method2669((String) null, false, -53, (byte) 109);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 42)
    public final boolean method2659(byte arg0, String arg1) {
        field6389++;
        if (this.method2657((byte) 96)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field6397.field1072.method2176(class83.method679((byte) 107, var3), (byte) 107);
            int var5 = 16 % ((arg0 + 23) / 52);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Z", line = 66)
    public final boolean method2660(int arg0) {
        field6390++;
        if (!this.method2657((byte) 39)) {
            return false;
        }
        if (arg0 != -1) {
            this.field6410 = null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field6397.field1086.length; var3++) {
            int var4 = this.field6397.field1086[var3];
            if (this.field6368[var4] == null) {
                this.method2663((byte) -112, var4);
                if (this.field6368[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)I", line = 105)
    public final int method2661(boolean arg0) {
        field6411++;
        if (!this.method2657((byte) 37)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6368.length; var4++) {
            if (this.field6397.field1084[var4] > 0) {
                var2 += 100;
                var3 += this.method2683(-22441, var4);
            }
        }
        if (!arg0) {
            this.field6399 = null;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)I", line = 148)
    public final int method2662(int arg0, byte arg1) {
        field6404++;
        if (this.method2686(arg0, 0)) {
            return arg1 == -7 ? this.field6397.field1085[arg0] : 73;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)V", line = 162)
    private final void method2663(byte arg0, int arg1) {
        if (this.field6372) {
            this.field6368[arg1] = this.field6399.method108(arg1, (byte) -127);
        } else {
            this.field6368[arg1] = class179.method1241((byte) 121, false, this.field6399.method108(arg1, (byte) -127));
        }
        if (arg0 != -112) {
            this.field6368 = null;
        }
        field6370++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 177)
    public final boolean method2664(String arg0, boolean arg1) {
        field6393++;
        if (!this.method2657((byte) 99)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1) {
            int var4 = this.field6397.field1072.method2176(class83.method679((byte) 116, var3), (byte) 107);
            return this.method2670(var4, (byte) 123);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V", line = 200)
    public final void method2665(int arg0, int arg1) {
        field6375++;
        if (this.method2686(arg1, 0) && arg0 >= 63 && this.field6410 != null) {
            this.field6410[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)I", line = 217)
    public final int method2666(boolean arg0) {
        field6388++;
        if (!this.method2657((byte) 73)) {
            throw new IllegalStateException("");
        }
        if (!arg0) {
            method2679(true);
        }
        return this.field6397.field1079;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(BI)[B", line = 234)
    public final byte[] method2667(byte arg0, int arg1) {
        field6376++;
        if (!this.method2657((byte) 68)) {
            return null;
        } else if (this.field6397.field1085.length == 1) {
            return this.method2691(arg1, 0, 0);
        } else if (!this.method2686(arg1, 0)) {
            return null;
        } else if (arg0 >= -113) {
            return null;
        } else if (this.field6397.field1085[arg1] == 1) {
            return this.method2691(0, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)V", line = 262)
    private final void method2668(int arg0, int arg1) {
        if (arg1 != -22621) {
            this.method2689(-68, 78);
        }
        this.field6399.method106((byte) -128, arg0);
        field6407++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;ZIB)Z", line = 274)
    public static final boolean method2669(String arg0, boolean arg1, int arg2, byte arg3) {
        field6408++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        if (arg3 <= 54) {
            method2669((String) null, true, -111, (byte) -92);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(IB)Z", line = 346)
    public final boolean method2670(int arg0, byte arg1) {
        field6371++;
        if (!this.method2686(arg0, 0)) {
            return false;
        } else if (this.field6368[arg0] == null) {
            if (arg1 < 23) {
                this.method2673(true, 64, true);
            }
            this.method2663((byte) -112, arg0);
            return this.field6368[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)B", line = 379)
    public static final byte method2671(int arg0, int arg1, int arg2) {
        field6391++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == arg2 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)Z", line = 395)
    public final boolean method2672(int arg0, int arg1) {
        field6382++;
        if (!this.method2657((byte) 116)) {
            return false;
        } else if (this.field6397.field1085.length == 1) {
            return this.method2680(arg0, 0, true);
        } else {
            if (arg1 != 23775) {
                field6409 = null;
            }
            if (!this.method2686(arg0, 0)) {
                return false;
            } else if (this.field6397.field1085[arg0] == 1) {
                return this.method2680(0, arg0, true);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIZ)V", line = 424)
    public final void method2673(boolean arg0, int arg1, boolean arg2) {
        field6406++;
        if (!this.method2657((byte) 77)) {
            return;
        }
        if (arg1 != 0) {
            this.method2664((String) null, true);
        }
        if (arg0) {
            this.field6397.field1083 = null;
            this.field6397.field1072 = null;
        }
        if (arg2) {
            this.field6397.field1069 = null;
            this.field6397.field1070 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V", line = 458)
    public final void method2674(byte arg0) {
        if (arg0 != -102) {
            this.field6368 = null;
        }
        if (this.field6410 != null) {
            for (int var2 = 0; var2 < this.field6410.length; var2++) {
                this.field6410[var2] = null;
            }
        }
        field6380++;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(Z)I", line = 481)
    public final int method2675(boolean arg0) {
        if (arg0) {
            this.method2660(54);
        }
        field6392++;
        return this.method2657((byte) 93) ? this.field6397.field1085.length : -1;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 495)
    public final int method2676(String arg0, byte arg1) {
        if (arg1 > -36) {
            return -54;
        }
        field6373++;
        if (this.method2657((byte) 35)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6397.field1072.method2176(class83.method679((byte) -72, var3), (byte) 107);
            return this.method2686(var4, 0) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V", line = 516)
    public static final void method2677(byte arg0) {
        if (arg0 > -46) {
            method2679(true);
        }
        for (int var1 = 0; var1 < class246.field3532.length; var1++) {
            for (int var2 = 0; var2 < class246.field3532[0].length; var2++) {
                for (int var3 = 0; var3 < class246.field3532[0][0].length; var3++) {
                    class246.field3532[var1][var2][var3] = 0;
                }
            }
        }
        field6384++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 551)
    public final boolean method2678(String arg0, int arg1, String arg2) {
        field6394++;
        if (!this.method2657((byte) 44)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field6397.field1072.method2176(class83.method679((byte) 49, var4), (byte) 107);
        if (this.method2686(var6, arg1 ^ arg1)) {
            int var7 = this.field6397.field1069[var6].method2176(class83.method679((byte) -50, var5), (byte) 107);
            return this.method2680(var7, var6, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(Z)V", line = 576)
    public static void method2679(boolean arg0) {
        if (!arg0) {
            field6377 = null;
        }
        field6403 = null;
        field6377 = null;
        field6409 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZ)Z", line = 592)
    public final boolean method2680(int arg0, int arg1, boolean arg2) {
        field6402++;
        if (!arg2) {
            this.method2664((String) null, true);
        }
        if (!this.method2681(0, arg1, arg0)) {
            return false;
        } else if (this.field6410[arg1] != null && this.field6410[arg1][arg0] != null) {
            return true;
        } else if (this.field6368[arg1] == null) {
            this.method2663((byte) -112, arg1);
            return this.field6368[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(III)Z", line = 624)
    private final boolean method2681(int arg0, int arg1, int arg2) {
        field6385++;
        if (!this.method2657((byte) 66)) {
            return false;
        } else if (arg0 != 0) {
            return false;
        } else if (arg1 >= 0 && arg2 >= 0 && arg1 < this.field6397.field1085.length && this.field6397.field1085[arg1] > arg2) {
            return true;
        } else if (class416.field5997) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([IIII)Z", line = 648)
    private final boolean method2682(int[] arg0, int arg1, int arg2, int arg3) {
        field6387++;
        if (!this.method2686(arg2, 0)) {
            return false;
        } else if (this.field6368[arg2] == null) {
            return false;
        } else {
            int var5 = this.field6397.field1084[arg2];
            int[] var6 = this.field6397.field1074[arg2];
            if (this.field6410[arg2] == null) {
                this.field6410[arg2] = new Object[this.field6397.field1085[arg2]];
            }
            Object[] var7 = this.field6410[arg2];
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
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var11 = class225.method1460(true, this.field6368[arg2], (byte) -31);
                class446 var12 = new class446(var11);
                var12.method2583(var12.field6316.length, arg0, 5, arg1 ^ 0x5);
            } else {
                var11 = class225.method1460(false, this.field6368[arg2], (byte) -44);
            }
            byte[] var13;
            try {
                var13 = class229.method1503(var11, arg1);
            } catch (RuntimeException var49) {
                throw class186.method1278(var49, "T3 - " + (arg0 != null) + "," + arg2 + "," + var11.length + "," + class350.method2158(81, var11.length, var11) + "," + class350.method2158(arg1 ^ 0x36, var11.length - 2, var11) + "," + this.field6397.field1081[arg2] + "," + this.field6397.field1079);
            }
            if (this.field6372) {
                this.field6368[arg2] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field6378 == 0) {
                    var7[var15] = class179.method1241((byte) 121, false, var13);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field6378 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * var33 * 4;
                class446 var35 = new class446(var13);
                int var36 = 0;
                var35.field6315 = var34;
                int var37 = 0;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method2604(-125);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg3 == var41) {
                            var37 = var41;
                            var36 += var39;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                var35.field6315 = var34;
                int var43 = 0;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method2604(93);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg3 == var48) {
                            class149.method1007(var13, var44, var42, var43, var46);
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
                class446 var19 = new class446(var13);
                int[] var20 = new int[var5];
                var19.field6315 = var18;
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method2604(87);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field6315 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method2604(-120);
                        class149.method1007(var13, var26, var24[var29], var20[var29], var28);
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
                    if (this.field6378 == 0) {
                        var7[var31] = class179.method1241((byte) 121, false, var24[var30]);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)I", line = 928)
    private final int method2683(int arg0, int arg1) {
        if (arg0 != -22441) {
            this.method2684(98, (int[]) null, 119, -27);
        }
        field6401++;
        if (this.method2686(arg1, 0)) {
            return this.field6368[arg1] == null ? this.field6399.method109(arg1, 0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[III)[B", line = 949)
    public final byte[] method2684(int arg0, int[] arg1, int arg2, int arg3) {
        field6369++;
        if (!this.method2681(arg2, arg0, arg3)) {
            return null;
        }
        if (this.field6410[arg0] == null || this.field6410[arg0][arg3] == null) {
            boolean var5 = this.method2682(arg1, 0, arg0, arg3);
            if (!var5) {
                this.method2663((byte) -112, arg0);
                boolean var6 = this.method2682(arg1, 0, arg0, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class225.method1460(false, this.field6410[arg0][arg3], (byte) -128);
        if (this.field6378 == 1) {
            this.field6410[arg0][arg3] = null;
            if (this.field6397.field1085[arg0] == 1) {
                this.field6410[arg0] = null;
            }
        } else if (this.field6378 == 2) {
            this.field6410[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ldg;ZI)V", line = 1179)
    public class451(class10 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6399 = arg0;
        this.field6372 = arg1;
        this.field6378 = arg2;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(BLjava/lang/String;)V", line = 1002)
    public final void method2685(byte arg0, String arg1) {
        field6383++;
        if (!this.method2657((byte) 43)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field6397.field1072.method2176(class83.method679((byte) -110, var3), (byte) 107);
        this.method2668(var4, -22621);
        if (arg0 <= 79) {
            this.method2685((byte) -46, (String) null);
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(II)Z", line = 1022)
    private final boolean method2686(int arg0, int arg1) {
        field6396++;
        if (!this.method2657((byte) 88)) {
            return false;
        } else if (arg0 >= arg1 && this.field6397.field1085.length > arg0 && this.field6397.field1085[arg0] != 0) {
            return true;
        } else if (class416.field5997) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B", line = 1045)
    public final byte[] method2687(String arg0, int arg1, String arg2) {
        if (arg1 != -31157) {
            this.method2676((String) null, (byte) 126);
        }
        field6398++;
        if (!this.method2657((byte) 122)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field6397.field1072.method2176(class83.method679((byte) -98, var4), (byte) 107);
        if (this.method2686(var6, 0)) {
            int var7 = this.field6397.field1069[var6].method2176(class83.method679((byte) 63, var5), (byte) 107);
            return this.method2691(var7, var6, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(II)I", line = 1070)
    public final int method2688(int arg0, int arg1) {
        field6381++;
        if (!this.method2657((byte) 116)) {
            return -1;
        }
        int var3 = this.field6397.field1072.method2176(arg0, (byte) 107);
        if (this.method2686(var3, 0)) {
            if (arg1 != -7752) {
                this.field6372 = true;
            }
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(II)[I", line = 1094)
    public final int[] method2689(int arg0, int arg1) {
        field6405++;
        if (!this.method2686(arg0, 0)) {
            return null;
        }
        int[] var3 = this.field6397.field1074[arg0];
        int var4 = -113 / ((arg1 - 8) / 50);
        if (var3 == null) {
            var3 = new int[this.field6397.field1084[arg0]];
            int var5 = 0;
            while (var5 < var3.length) {
                var3[var5] = var5++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(Z)V", line = 1123)
    public final void method2690(boolean arg0) {
        if (this.field6368 != null) {
            for (int var2 = 0; var2 < this.field6368.length; var2++) {
                this.field6368[var2] = null;
            }
        }
        if (arg0) {
            this.field6399 = null;
        }
        field6367++;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(III)[B", line = 1145)
    public final byte[] method2691(int arg0, int arg1, int arg2) {
        field6379++;
        return arg2 == 0 ? this.method2684(arg1, (int[]) null, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Ljava/lang/String;B)I", line = 1161)
    public final int method2692(String arg0, byte arg1) {
        if (arg1 != 60) {
            this.field6378 = -26;
        }
        field6374++;
        if (this.method2657((byte) 43)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6397.field1072.method2176(class83.method679((byte) 124, var3), (byte) 107);
            return this.method2683(arg1 ^ 0xFFFFA86B, var4);
        } else {
            return 0;
        }
    }
}
