import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class158 {

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public int field2307 = -1;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public int field2302 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public int field2306 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
    public int field2315 = -1;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
    public int field2319 = -1;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
    private int field2318 = -1;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "[Ljava/lang/String;")
    public String[] field2316 = new String[5];

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "Z")
    public boolean field2313 = true;

    @OriginalMember(owner = "client!dt", name = "M", descriptor = "I")
    private int field2334 = -1;

    @OriginalMember(owner = "client!dt", name = "I", descriptor = "Z")
    public boolean field2331 = true;

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
    public int field2329 = -1;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
    public int field2314 = 0;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    public int field2310 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dt", name = "O", descriptor = "I")
    private int field2336 = -1;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "Z")
    public boolean field2312 = true;

    @OriginalMember(owner = "client!dt", name = "Q", descriptor = "I")
    private int field2338 = -1;

    @OriginalMember(owner = "client!dt", name = "S", descriptor = "I")
    private int field2340 = -1;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "Z")
    public boolean field2304 = false;

    @OriginalMember(owner = "client!dt", name = "U", descriptor = "I")
    public int field2342 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "[I")
    public static int[] field2321 = new int[3];

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "Z")
    public static boolean field2298 = false;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    private int field2299;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public int field2305;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    private int field2311;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
    public int field2322;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
    private int field2324;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
    public int field2326;

    @OriginalMember(owner = "client!dt", name = "F", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!dt", name = "J", descriptor = "I")
    public int field2332;

    @OriginalMember(owner = "client!dt", name = "L", descriptor = "I")
    private int field2333;

    @OriginalMember(owner = "client!dt", name = "P", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!dt", name = "T", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "Ltm;")
    public static class264 field2320;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "Lwa;")
    private class433 field2309;

    @OriginalMember(owner = "client!dt", name = "N", descriptor = "Lic;")
    public static class491 field2335;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "Lhc;")
    public class93 field2301;

    @OriginalMember(owner = "client!dt", name = "R", descriptor = "Ljava/lang/String;")
    public String field2339;

    @OriginalMember(owner = "client!dt", name = "V", descriptor = "Ljava/lang/String;")
    public String field2343;

    @OriginalMember(owner = "client!dt", name = "E", descriptor = "[I")
    public int[] field2327;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)I")
    public final int method1002(int arg0, int arg1, int arg2) {
        int var4 = 10 / ((34 - arg0) / 51);
        field2323++;
        if (this.field2309 == null) {
            return arg2;
        } else {
            class427 var5 = (class427) this.field2309.method2605(false, (long) arg1);
            return var5 == null ? arg2 : var5.field6402;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method1003(String arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return null;
        }
        field2308++;
        if (this.field2309 == null) {
            return arg0;
        } else {
            class141 var4 = (class141) this.field2309.method2605(false, (long) arg2);
            return var4 == null ? arg0 : var4.field2110;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
    public final void method1004(byte arg0) {
        if (this.field2327 != null) {
            for (int var2 = 0; var2 < this.field2327.length; var2 += 2) {
                if (this.field2327[var2] < this.field2310) {
                    this.field2310 = this.field2327[var2];
                } else if (this.field2306 < this.field2327[var2]) {
                    this.field2306 = this.field2327[var2];
                }
                if (this.field2327[var2 + 1] < this.field2302) {
                    this.field2302 = this.field2327[var2 + 1];
                } else if (this.field2342 < this.field2327[var2 + 1]) {
                    this.field2342 = this.field2327[var2 + 1];
                }
            }
        }
        if (arg0 > 11) {
            field2325++;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILqa;)Lf;")
    public final class529 method1005(int arg0, class162 arg1) {
        field2303++;
        class529 var3 = (class529) this.field2301.field1392.method1536((long) (arg0 | this.field2338 | arg1.field2371 << 29), 0);
        if (var3 != null) {
            return var3;
        }
        this.field2301.field1389.method2924((byte) -127, this.field2338);
        class408 var4 = class408.method2459(this.field2301.field1389, this.field2338, 0);
        if (var4 != null) {
            var3 = arg1.method1030(var4, true);
            this.field2301.field1392.method1542(var3, (byte) 112, (long) (this.field2338 | 0x20000 | arg1.field2371 << 29));
        }
        return var3;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ldh;II)V")
    private final void method1006(class209 arg0, int arg1, int arg2) {
        field2297++;
        if (arg2 == 1) {
            this.field2315 = arg0.method1450((byte) 68);
        } else if (arg2 == 2) {
            this.field2329 = arg0.method1450((byte) 67);
        } else if (arg2 == 3) {
            this.field2339 = arg0.method1449(87);
        } else if (arg2 == 4) {
            this.field2326 = arg0.method1458((byte) -10);
        } else if (arg2 == 5) {
            this.field2307 = arg0.method1458((byte) -10);
        } else if (arg2 == 6) {
            this.field2314 = arg0.method1428(32122);
        } else if (arg2 == 7) {
            int var4 = arg0.method1428(32122);
            if ((var4 & 0x1) == 0) {
                this.field2331 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field2304 = true;
            }
        } else if (arg2 == 8) {
            this.field2313 = arg0.method1428(32122) == 1;
        } else if (arg2 == 9) {
            this.field2340 = arg0.method1450((byte) 31);
            if (this.field2340 == 65535) {
                this.field2340 = -1;
            }
            this.field2336 = arg0.method1450((byte) 72);
            if (this.field2336 == 65535) {
                this.field2336 = -1;
            }
            this.field2299 = arg0.method1452(65280);
            this.field2324 = arg0.method1452(65280);
        } else if (arg2 >= 10 && arg2 <= 14) {
            this.field2316[arg2 - 10] = arg0.method1449(arg1 + 8114);
        } else if (arg2 == 15) {
            int var5 = arg0.method1428(32122);
            this.field2327 = new int[var5 * 2];
            for (int var6 = 0; var6 < var5 * 2; var6++) {
                this.field2327[var6] = arg0.method1447(29480);
            }
            this.field2341 = arg0.method1452(arg1 ^ 0xFFFF1F83);
            this.field2305 = arg0.method1452(arg1 ^ 0xFFFF1F83);
        } else if (arg2 == 16) {
            this.field2312 = false;
        } else if (arg2 == 17) {
            this.field2343 = arg0.method1449(98);
        } else if (arg2 == 18) {
            this.field2338 = arg0.method1450((byte) 66);
        } else if (arg2 == 19) {
            this.field2319 = arg0.method1450((byte) 105);
        } else if (arg2 == 20) {
            this.field2334 = arg0.method1450((byte) 112);
            if (this.field2334 == 65535) {
                this.field2334 = -1;
            }
            this.field2318 = arg0.method1450((byte) 33);
            if (this.field2318 == 65535) {
                this.field2318 = -1;
            }
            this.field2311 = arg0.method1452(arg1 + 73341);
            this.field2333 = arg0.method1452(65280);
        } else if (arg2 == 21) {
            this.field2332 = arg0.method1452(65280);
        } else if (arg2 == 22) {
            this.field2300 = arg0.method1452(65280);
        } else if (arg2 == 249) {
            int var7 = arg0.method1428(arg1 ^ 0xFFFF9DF9);
            if (this.field2309 == null) {
                int var8 = class476.method2841(var7, true);
                this.field2309 = new class433(var8);
            }
            for (int var9 = 0; var9 < var7; var9++) {
                boolean var10 = arg0.method1428(arg1 + 40183) == 1;
                int var11 = arg0.method1458((byte) -10);
                class337 var12;
                if (var10) {
                    var12 = new class141(arg0.method1449(arg1 ^ 0xFFFFE0B8));
                } else {
                    var12 = new class427(arg0.method1452(arg1 + 73341));
                }
                this.field2309.method2606(var12, (long) var11, 0);
            }
        }
        if (arg1 != -8061) {
            this.field2310 = -9;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lqa;IZ)Lf;")
    public final class529 method1007(class162 arg0, int arg1, boolean arg2) {
        field2328++;
        int var4 = arg2 ? this.field2329 : this.field2315;
        int var5 = arg0.field2371 << 29 | var4;
        class529 var6 = (class529) this.field2301.field1392.method1536((long) var5, 0);
        if (var6 != null) {
            return var6;
        } else if (this.field2301.field1389.method2924((byte) -127, var4)) {
            if (arg1 != -25598) {
                this.method1007(null, -81, false);
            }
            class408 var7 = class408.method2459(this.field2301.field1389, var4, 0);
            if (var7 != null) {
                var6 = arg0.method1030(var7, true);
                this.field2301.field1392.method1542(var6, (byte) 112, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
    public static final void method1008(boolean arg0) {
        if (arg0) {
            class108.field1553 = class508.field7423;
            class86.field1324 = class31.field335;
        } else {
            class108.field1553 = class417.field6246;
            class86.field1324 = class307.field4415;
        }
        class208.field2979 = class108.field1553.length;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ldh;B)V")
    public final void method1009(class209 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1428(32122);
            if (var3 == 0) {
                field2317++;
                int var4 = -98 % ((arg1 - 57) / 33);
                return;
            }
            this.method1006(arg0, -8061, var3);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILdh;)V")
    public static final void method1010(int arg0, class209 arg1) {
        field2337++;
        int var2 = arg1.method1434(16887);
        class178.field2630 = new class145[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class178.field2630[var3] = new class145();
            class178.field2630[var3].field2152 = arg1.method1434(16887);
            class178.field2630[var3].field2154 = arg1.method1421(124);
        }
        if (arg0 != -7) {
            field2320 = null;
        }
        class89.field1355 = arg1.method1434(16887);
        class26.field278 = arg1.method1434(16887);
        class213.field3113 = arg1.method1434(16887);
        class6.field83 = new class412[class26.field278 + 1 - class89.field1355];
        for (int var4 = 0; var4 < class213.field3113; var4++) {
            int var5 = arg1.method1434(16887);
            class412 var6 = class6.field83[var5] = new class412();
            var6.field882 = arg1.method1428(arg0 + 32129);
            var6.field880 = arg1.method1452(arg0 ^ 0xFFFF00F9);
            var6.field6189 = var5 + class89.field1355;
            var6.field6192 = arg1.method1421(arg0 + 114);
            var6.field6193 = arg1.method1421(-94);
        }
        class411.field6176 = arg1.method1452(65280);
        class76.field1131 = true;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILtn;)Z")
    public final boolean method1011(int arg0, class58 arg1) {
        if (arg0 <= 90) {
            return false;
        }
        field2330++;
        int var3;
        if (this.field2336 == -1) {
            if (this.field2340 == -1) {
                return true;
            }
            var3 = arg1.method349(51, this.field2340);
        } else {
            var3 = arg1.method350(this.field2336, (byte) -83);
        }
        if (this.field2299 > var3 || var3 > this.field2324) {
            return false;
        }
        boolean var4 = false;
        int var5;
        if (this.field2318 == -1) {
            if (this.field2334 == -1) {
                return true;
            }
            var5 = arg1.method349(-7, this.field2334);
        } else {
            var5 = arg1.method350(this.field2318, (byte) -83);
        }
        return this.field2311 <= var5 && var5 <= this.field2333;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method1012(int arg0) {
        int var1 = 70 / ((85 - arg0) / 41);
        field2320 = null;
        field2335 = null;
        field2321 = null;
    }
}
