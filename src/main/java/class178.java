import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class178 extends class103 {

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    private int field3268 = 0;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "Ldl;")
    private class31 field3256 = new class31(16);

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "I")
    private int field3280 = 0;

    @OriginalMember(owner = "client!dk", name = "bb", descriptor = "Lfl;")
    private class191 field3281 = new class191();

    @OriginalMember(owner = "client!dk", name = "db", descriptor = "J")
    private long field3283 = 0L;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "Ln;")
    private class242 field3240;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    private int field3261;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "Z")
    private boolean field3277;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "Lfl;")
    private class191 field3278;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "Ln;")
    private class242 field3247;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    private int field3260;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    private int field3245;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Lsh;")
    private class246 field3249;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "Lgj;")
    private class196 field3265;

    @OriginalMember(owner = "client!dk", name = "cb", descriptor = "Z")
    private boolean field3282;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "Lgd;")
    private class266 field3242;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field3251 = -1;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "Lp;")
    public static class82 field3263 = null;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "Lli;")
    public static class185 field3271 = class245.method1649("classement ", -4);

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "Z")
    public static boolean field3262 = true;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "F")
    public static float field3259;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "Lli;")
    public static class185 field3257;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "Lhi;")
    public static class250 field3252;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "Lil;")
    private class46 field3274;

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "Z")
    private boolean field3279;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "[B")
    private byte[] field3254;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "[[[B")
    public static byte[][][] field3253;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public static void method1251(byte arg0) {
        field3263 = null;
        field3257 = null;
        field3253 = null;
        field3271 = null;
        field3252 = null;
        if (arg0 > -116) {
            method1262(116, -66, 104, 6, 57, -65, 124, 106, 79);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)I")
    public final int method723(int arg0, byte arg1) {
        field3275++;
        class266 var3 = (class266) this.field3256.method195(102, (long) arg0);
        if (var3 == null) {
            if (arg1 != 12) {
                method1259((byte) 6);
            }
            return 0;
        } else {
            return var3.method1060((byte) -71);
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)I")
    public final int method1252(int arg0) {
        field3272++;
        if (this.field3274 == null) {
            return 0;
        }
        if (arg0 > -68) {
            method1265(-76L, -106);
        }
        if (this.field3277) {
            class73 var2 = this.field3278.method1375(16259);
            return var2 == null ? 0 : (int) var2.field1278;
        } else {
            return this.field3274.field746;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZII)I")
    public static final int method1253(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return 123;
        }
        field3244++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)I")
    public final int method1254(int arg0) {
        if (arg0 == -20603) {
            field3239++;
            return this.field3268;
        } else {
            return 95;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)I")
    public final int method1255(byte arg0) {
        field3248++;
        if (this.field3274 == null) {
            return 0;
        } else {
            if (arg0 >= -44) {
                this.field3261 = -95;
            }
            return this.field3274.field746;
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)V")
    public final void method1256(int arg0) {
        field3270++;
        if (this.field3278 == null) {
            return;
        }
        if (arg0 != 16601) {
            field3253 = null;
        }
        if (this.method727(8) == null) {
            return;
        }
        for (class73 var2 = this.field3281.method1375(arg0 - 342); var2 != null; var2 = this.field3281.method1377(-19546)) {
            int var3 = (int) var2.field1278;
            if (var3 < 0 || var3 >= this.field3274.field749 || this.field3274.field726[var3] == 0) {
                var2.method476(arg0 - 16717);
            } else {
                if (this.field3254[var3] == 0) {
                    this.method1261(1, -108, var3);
                }
                if (this.field3254[var3] == -1) {
                    this.method1261(2, -125, var3);
                }
                if (this.field3254[var3] == 1) {
                    var2.method476(101);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
    public final void method1257(int arg0) {
        field3264++;
        if (arg0 < -98 && this.field3240 != null) {
            this.field3279 = true;
            if (this.field3278 == null) {
                this.field3278 = new class191();
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Z")
    public static final boolean method1258(int arg0, int arg1) {
        field3243++;
        if (~arg0 > arg1) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V")
    public static final void method1259(byte arg0) {
        if (arg0 != -57) {
            field3252 = null;
        }
        for (class79 var1 = (class79) class246.field4383.method1375(16259); var1 != null; var1 = (class79) class246.field4383.method1377(-19546)) {
            if (var1.field1383 == -1) {
                var1.field1387 = 0;
                class198.method1423(var1, (byte) -115);
            } else {
                var1.method476(-121);
            }
        }
        field3246++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)I")
    public final int method1260(boolean arg0) {
        field3266++;
        if (this.method727(8) == null) {
            return this.field3242 == null ? 0 : this.field3242.method1060((byte) -74);
        } else {
            if (!arg0) {
                this.method1256(79);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Lgd;")
    private final class266 method1261(int arg0, int arg1, int arg2) {
        field3250++;
        class266 var4 = (class266) this.field3256.method195(77, (long) arg2);
        if (var4 != null && arg0 == 0 && !var4.field4706 && var4.field4709) {
            var4.method476(111);
            var4 = null;
        }
        int var5 = -120 / ((-arg1 - 38) / 37);
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field3240 == null || this.field3254[arg2] == -1) {
                    if (this.field3249.method1650((byte) -9)) {
                        return null;
                    }
                    var4 = this.field3249.method1662(-27446, true, (byte) 2, this.field3261, arg2);
                } else {
                    var4 = this.field3265.method1409(true, arg2, this.field3240);
                }
            } else if (arg0 == 1) {
                if (this.field3240 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3265.method1404(this.field3240, arg2, (byte) 11);
            } else if (arg0 == 2) {
                if (this.field3240 == null) {
                    throw new RuntimeException();
                }
                if (this.field3254[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3249.method1651((byte) -127)) {
                    return null;
                }
                var4 = this.field3249.method1662(-27446, false, (byte) 2, this.field3261, arg2);
            } else {
                throw new RuntimeException();
            }
            this.field3256.method190(var4, (byte) -102, (long) arg2);
        }
        if (var4.field4709) {
            return null;
        }
        byte[] var6 = var4.method1059(93);
        if (!var4 instanceof class149) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class194.field3575.reset();
                class194.field3575.update(var6, 0, var6.length - 2);
                int var10 = (int) class194.field3575.getValue();
                if (this.field3274.field730[arg2] != var10) {
                    throw new RuntimeException();
                }
                this.field3249.field4395 = 0;
                this.field3249.field4394 = 0;
            } catch (RuntimeException var13) {
                this.field3249.method1661(56);
                var4.method476(-57);
                if (var4.field4706 && !this.field3249.method1650((byte) -9)) {
                    class223 var11 = this.field3249.method1662(-27446, true, (byte) 2, this.field3261, arg2);
                    this.field3256.method190(var11, (byte) -85, (long) arg2);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field3274.field744[arg2] >>> 8);
            var6[var6.length - 1] = (byte) this.field3274.field744[arg2];
            if (this.field3240 != null) {
                this.field3265.method1401(arg2, this.field3240, var6, 1);
                if (this.field3254[arg2] != 1) {
                    this.field3268++;
                    this.field3254[arg2] = 1;
                }
            }
            if (!var4.field4706) {
                var4.method476(84);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class194.field3575.reset();
            class194.field3575.update(var6, 0, var6.length - 2);
            int var7 = (int) class194.field3575.getValue();
            if (this.field3274.field730[arg2] != var7) {
                throw new RuntimeException();
            }
            int var8 = (var6[var6.length - 2] & 0xFF << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field3274.field744[arg2] & 0xFFFF) != var8) {
                throw new RuntimeException();
            }
            if (this.field3254[arg2] != 1) {
                this.field3268++;
                this.field3254[arg2] = 1;
            }
            if (!var4.field4706) {
                var4.method476(103);
            }
            return var4;
        } catch (Exception var12) {
            this.field3254[arg2] = -1;
            var4.method476(-61);
            if (var4.field4706 && !this.field3249.method1650((byte) -9)) {
                class223 var9 = this.field3249.method1662(-27446, true, (byte) 2, this.field3261, arg2);
                this.field3256.method190(var9, (byte) -100, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(IB)V")
    public final void method730(int arg0, byte arg1) {
        field3241++;
        if (arg1 >= -95) {
            this.method1257(53);
        }
        if (this.field3240 == null) {
            return;
        }
        for (class73 var3 = this.field3281.method1375(16259); var3 != null; var3 = this.field3281.method1377(-19546)) {
            if (((long) arg0) == var3.field1278) {
                return;
            }
        }
        class73 var4 = new class73();
        var4.field1278 = (long) arg0;
        this.field3281.method1382(var4, (byte) -126);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3238++;
        int var9 = arg6 - arg2;
        if (arg7 == 315584518) {
            int var10 = arg3 - arg4;
            int var11 = (arg8 - arg0 << 16) / var9;
            int var12 = (arg5 - arg1 << 16) / var10;
            class264.method1797(var11, 0, arg1, arg2, var12, arg4, arg6, 0, arg0, arg7 - 315569373, arg3);
        }
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)V")
    public final void method1263(int arg0) {
        field3276++;
        if (this.field3278 != null) {
            if (this.method727(8) == null) {
                return;
            }
            if (this.field3277) {
                boolean var6 = true;
                for (class73 var7 = this.field3278.method1375(16259); var7 != null; var7 = this.field3278.method1377(-19546)) {
                    int var9 = (int) var7.field1278;
                    if (this.field3254[var9] == 0) {
                        this.method1261(1, -105, var9);
                    }
                    if (this.field3254[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method476(105);
                    }
                }
                while (this.field3274.field726.length > this.field3280) {
                    if (this.field3274.field726[this.field3280] == 0) {
                        this.field3280++;
                    } else {
                        if (this.field3265.field3606 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3254[this.field3280] == 0) {
                            this.method1261(1, -84, this.field3280);
                        }
                        if (this.field3254[this.field3280] == 0) {
                            class73 var8 = new class73();
                            var6 = false;
                            var8.field1278 = (long) this.field3280;
                            this.field3278.method1382(var8, (byte) -110);
                        }
                        this.field3280++;
                    }
                }
                if (var6) {
                    this.field3280 = 0;
                    this.field3277 = false;
                }
            } else if (this.field3279) {
                boolean var2 = true;
                for (class73 var3 = this.field3278.method1375(16259); var3 != null; var3 = this.field3278.method1377(-19546)) {
                    int var5 = (int) var3.field1278;
                    if (this.field3254[var5] != 1) {
                        this.method1261(2, 72, var5);
                    }
                    if (this.field3254[var5] == 1) {
                        var3.method476(97);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3280 < this.field3274.field726.length) {
                    if (this.field3274.field726[this.field3280] == 0) {
                        this.field3280++;
                    } else {
                        if (this.field3249.method1651((byte) -121)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3254[this.field3280] != 1) {
                            this.method1261(2, -103, this.field3280);
                        }
                        if (this.field3254[this.field3280] != 1) {
                            class73 var4 = new class73();
                            var2 = false;
                            var4.field1278 = (long) this.field3280;
                            this.field3278.method1382(var4, (byte) -48);
                        }
                        this.field3280++;
                    }
                }
                if (var2) {
                    this.field3279 = false;
                    this.field3280 = 0;
                }
            } else {
                this.field3278 = null;
            }
        }
        if (this.field3282 && this.field3283 <= class244.method1644((byte) -65)) {
            for (class266 var10 = (class266) this.field3256.method192(102); var10 != null; var10 = (class266) this.field3256.method189(0)) {
                if (!var10.field4709) {
                    if (var10.field4710) {
                        if (!var10.field4706) {
                            throw new RuntimeException();
                        }
                        var10.method476(-72);
                    } else {
                        var10.field4710 = true;
                    }
                }
            }
            this.field3283 = class244.method1644((byte) -90) + 1000L;
        }
        if (arg0 <= 99) {
            this.field3249 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljd;B)V")
    public static final void method1264(class118 arg0, byte arg1) {
        field3269++;
        if (arg1 <= 93) {
            field3257 = null;
        }
        while (true) {
            while (arg0.field2155 < arg0.field2115.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method867(false) == 1) {
                    var2 = true;
                    var4 = arg0.method867(false);
                    var3 = arg0.method867(false);
                }
                int var5 = arg0.method867(false);
                int var6 = arg0.method867(false);
                int var7 = class125.field2246 - (var6 * 64 - class264.field4679) - 1;
                int var8 = var5 * 64 - class252.field4481;
                if (var8 >= 0 && var7 - 63 >= 0 && class56.field971 > var8 + 63 && class125.field2246 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var4 * 8 <= var11 && var4 * 8 + 8 > var11 && var12 >= (var3 * 8) && var3 * 8 + 8 > var12) {
                                int var13 = arg0.method867(false);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method867(false);
                                        if (class272.field4825[var9][var10] == null) {
                                            class272.field4825[var9][var10] = new byte[4096];
                                        }
                                        class272.field4825[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method827(255);
                                        if (class60.field1081[var9][var10] == null) {
                                            class60.field1081[var9][var10] = new short[4096];
                                        }
                                        class60.field1081[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg0.method867(false) & 0xFF) << 16) + ((arg0.method867(false) & 0xFF) << 8) + (arg0.method867(false) & 0xFF);
                                        if (class232.field4179[var9][var10] == null) {
                                            class232.field4179[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class135 var17 = class184.method1294(var16, -28916);
                                        if (var17.field2502 != null) {
                                            var17 = var17.method964((byte) 105);
                                            if (var17 == null || var17.field2477 == -1) {
                                                continue;
                                            }
                                        }
                                        class232.field4179[var9][var10][(63 - var12 << 6) + var11] = var17.field2527 + 1;
                                        class39 var18 = new class39();
                                        var18.field619 = var8;
                                        var18.field615 = var17.field2477;
                                        var18.field614 = var7;
                                        class152.field2882.method1382(var18, (byte) -49);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method867(false);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field2155++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field2155 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field2155 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IB)[B")
    public final byte[] method728(int arg0, byte arg1) {
        field3258++;
        if (arg1 != -17) {
            return null;
        }
        class266 var3 = this.method1261(0, -96, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1059(arg1 ^ 0x5E);
            var3.method476(-125);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Lil;")
    public final class46 method727(int arg0) {
        field3267++;
        if (this.field3274 != null) {
            return this.field3274;
        }
        if (this.field3242 == null) {
            if (this.field3249.method1650((byte) -9)) {
                return null;
            }
            this.field3242 = this.field3249.method1662(-27446, true, (byte) 0, 255, this.field3261);
        }
        if (this.field3242.field4709) {
            return null;
        }
        byte[] var2 = this.field3242.method1059(-75);
        if (arg0 != 8) {
            return null;
        }
        if (this.field3242 instanceof class149) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3274 = new class46(var2, this.field3260);
                if (this.field3274.field745 != this.field3245) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3274 = null;
                if (this.field3249.method1650((byte) -9)) {
                    this.field3242 = null;
                } else {
                    this.field3242 = this.field3249.method1662(-27446, true, (byte) 0, 255, this.field3261);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3274 = new class46(var2, this.field3260);
            } catch (RuntimeException var4) {
                this.field3249.method1661(112);
                this.field3274 = null;
                if (this.field3249.method1650((byte) -9)) {
                    this.field3242 = null;
                } else {
                    this.field3242 = this.field3249.method1662(-27446, true, (byte) 0, 255, this.field3261);
                }
                return null;
            }
            if (this.field3247 != null) {
                this.field3265.method1401(this.field3261, this.field3247, var2, 1);
            }
        }
        if (this.field3240 != null) {
            this.field3254 = new byte[this.field3274.field749];
            this.field3268 = 0;
        }
        this.field3242 = null;
        return this.field3274;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(JI)V")
    public static final void method1265(long arg0, int arg1) {
        field3273++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 >= -27) {
            field3262 = false;
        }
        class71.field1239++;
        class182.field3349.method577(110, 0);
        class182.field3349.method870(arg0, (byte) 122);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(ILn;Ln;Lsh;Lgj;IIZ)V")
    public class178(int arg0, class242 arg1, class242 arg2, class246 arg3, class196 arg4, int arg5, int arg6, boolean arg7) {
        this.field3240 = arg1;
        this.field3261 = arg0;
        if (this.field3240 == null) {
            this.field3277 = false;
        } else {
            this.field3277 = true;
            this.field3278 = new class191();
        }
        this.field3247 = arg2;
        this.field3260 = arg5;
        this.field3245 = arg6;
        this.field3249 = arg3;
        this.field3265 = arg4;
        this.field3282 = arg7;
        if (this.field3247 != null) {
            this.field3242 = this.field3265.method1409(true, this.field3261, this.field3247);
        }
    }
}
