import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class177 extends class13 {

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    private int field2523 = 0;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "Ltn;")
    private class109 field2528 = new class109(16);

    @OriginalMember(owner = "client!go", name = "S", descriptor = "I")
    private int field2536 = 0;

    @OriginalMember(owner = "client!go", name = "T", descriptor = "Ljm;")
    private class162 field2537 = new class162();

    @OriginalMember(owner = "client!go", name = "X", descriptor = "J")
    private long field2541 = 0L;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    private int field2505;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "Lnf;")
    private class258 field2502;

    @OriginalMember(owner = "client!go", name = "R", descriptor = "Z")
    private boolean field2535;

    @OriginalMember(owner = "client!go", name = "W", descriptor = "Ljm;")
    private class162 field2540;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "Lpn;")
    private class66 field2511;

    @OriginalMember(owner = "client!go", name = "B", descriptor = "I")
    private int field2519;

    @OriginalMember(owner = "client!go", name = "E", descriptor = "Lee;")
    private class442 field2522;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "I")
    private int field2533;

    @OriginalMember(owner = "client!go", name = "Y", descriptor = "Z")
    private boolean field2542;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "Lnf;")
    private class258 field2512;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "Lec;")
    private class37 field2504;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "I")
    public static int field2531 = 0;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "Lvg;")
    public static class108 field2532;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "F")
    public static float field2503;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!go", name = "v", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!go", name = "w", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!go", name = "y", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!go", name = "z", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!go", name = "A", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!go", name = "C", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!go", name = "G", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!go", name = "D", descriptor = "Lij;")
    public static class316 field2521;

    @OriginalMember(owner = "client!go", name = "U", descriptor = "Lij;")
    public static class316 field2538;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "Ljp;")
    private class404 field2527;

    @OriginalMember(owner = "client!go", name = "V", descriptor = "Z")
    private boolean field2539;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "[B")
    private byte[] field2507;

    @OriginalMember(owner = "client!go", name = "x", descriptor = "[[I")
    public static int[][] field2515;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(BI)I")
    public static final int method1249(byte arg0, int arg1) {
        int var7 = arg1 - 1;
        field2518++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 >= -121) {
            field2515 = null;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZII)Lec;")
    private final class37 method1250(boolean arg0, int arg1, int arg2) {
        field2525++;
        class37 var4 = (class37) this.field2528.method837((byte) -72, (long) arg1);
        if (var4 != null && arg2 == 0 && !var4.field486 && var4.field484) {
            var4.method1884(!arg0);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field2502 == null || this.field2507[arg1] == -1) {
                    if (this.field2511.method529(!arg0)) {
                        return null;
                    }
                    var4 = this.field2511.method537((byte) 2, true, arg1, 49, this.field2505);
                } else {
                    var4 = this.field2522.method2741(34, this.field2502, arg1);
                }
            } else if (arg2 == 1) {
                if (this.field2502 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2522.method2737((byte) 19, this.field2502, arg1);
            } else if (arg2 == 2) {
                if (this.field2502 == null) {
                    throw new RuntimeException();
                }
                if (this.field2507[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2511.method523((byte) 53)) {
                    return null;
                }
                var4 = this.field2511.method537((byte) 2, false, arg1, -107, this.field2505);
            } else {
                throw new RuntimeException();
            }
            this.field2528.method835(4, var4, (long) arg1);
        }
        if (var4.field484) {
            return null;
        }
        byte[] var5 = var4.method154(arg0);
        if (!var4 instanceof class363) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class141.field2053.reset();
                class141.field2053.update(var5, 0, var5.length - 2);
                int var9 = (int) class141.field2053.getValue();
                if (this.field2527.field5586[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field2511.field933 = 0;
                this.field2511.field934 = 0;
            } catch (RuntimeException var12) {
                this.field2511.method526(-100);
                var4.method1884(false);
                if (var4.field486 && !this.field2511.method529(false)) {
                    class25 var10 = this.field2511.method537((byte) 2, true, arg1, -122, this.field2505);
                    this.field2528.method835(4, var10, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2527.field5587[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field2527.field5587[arg1];
            if (this.field2502 != null) {
                this.field2522.method2746(this.field2502, var5, arg1, !arg0);
                if (this.field2507[arg1] != 1) {
                    this.field2523++;
                    this.field2507[arg1] = 1;
                }
            }
            if (!var4.field486) {
                var4.method1884(false);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class141.field2053.reset();
            class141.field2053.update(var5, 0, var5.length - 2);
            int var6 = (int) class141.field2053.getValue();
            if (this.field2527.field5586[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2527.field5587[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field2507[arg1] != 1) {
                this.field2523++;
                this.field2507[arg1] = 1;
            }
            if (!var4.field486) {
                var4.method1884(false);
            }
            return var4;
        } catch (Exception var11) {
            this.field2507[arg1] = -1;
            var4.method1884(false);
            if (var4.field486 && !this.field2511.method529(false)) {
                class25 var8 = this.field2511.method537((byte) 2, true, arg1, -120, this.field2505);
                this.field2528.method835(4, var8, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)I")
    public final int method1251(int arg0) {
        field2508++;
        if (this.field2527 == null) {
            return 0;
        } else if (this.field2535) {
            if (arg0 >= -75) {
                this.field2511 = null;
            }
            class311 var2 = this.field2540.method1173(0);
            return var2 == null ? 0 : (int) var2.field4226;
        } else {
            return this.field2527.field5588;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
    public final void method1252(boolean arg0) {
        field2526++;
        if (this.field2502 != null) {
            this.field2539 = arg0;
            if (this.field2540 == null) {
                this.field2540 = new class162();
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(BI)[B")
    public final byte[] method68(byte arg0, int arg1) {
        field2534++;
        class37 var3 = this.method1250(true, arg1, 0);
        if (var3 == null) {
            return null;
        } else {
            int var4 = 92 / ((arg0 + 7) / 62);
            byte[] var5 = var3.method154(true);
            var3.method1884(false);
            return var5;
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)I")
    public final int method1253(int arg0) {
        field2509++;
        int var2 = 117 / ((arg0 + 55) / 60);
        if (this.method65(10383) == null) {
            return this.field2504 == null ? 0 : this.field2504.method156((byte) 127);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        field2517++;
        if (this.field2502 == null) {
            return;
        }
        class311 var3 = this.field2537.method1173(0);
        if (arg0 >= -22) {
            field2532 = null;
        }
        while (var3 != null) {
            if ((long) arg1 == var3.field4226) {
                return;
            }
            var3 = this.field2537.method1165(true);
        }
        class311 var4 = new class311();
        var4.field4226 = (long) arg1;
        this.field2537.method1162(125, var4);
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(B)I")
    public final int method1254(byte arg0) {
        field2530++;
        if (arg0 != -92) {
            method1258((byte) 35, -21, 22, 75);
        }
        return this.field2527 == null ? 0 : this.field2527.field5588;
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(II)Lo;")
    public static final class394 method1255(int arg0, int arg1) {
        field2529++;
        if (arg1 >= -32) {
            method1249((byte) 90, -95);
        }
        class394 var2 = (class394) class203.field2891.method515(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field2079.method1926(0, class373.method2334(255, arg0), class34.method312((byte) -71, arg0));
        class394 var4 = new class394();
        if (var3 != null) {
            var4.method2443(-79, new class366(var3));
        }
        class203.field2891.method519((long) arg0, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
    public static final int method1256(String arg0, int arg1, String arg2, int arg3) {
        field2506++;
        int var4 = arg0.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var7 - var9 < var5) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var23;
            if (var8 == '\u0000') {
                var23 = arg0.charAt(var6++);
            } else {
                var23 = var8;
                boolean var24 = false;
            }
            char var25;
            if (var9 == '\u0000') {
                var25 = arg2.charAt(var7++);
            } else {
                var25 = var9;
                boolean var26 = false;
            }
            var8 = class62.method502((byte) 79, var23);
            var9 = class62.method502((byte) 115, var25);
            char var27 = class15.method90(arg1, var23, 82);
            char var28 = class15.method90(arg1, var25, 105);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return client.method1641(var29, -56, arg1) - client.method1641(var30, -106, arg1);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        int var11 = 0;
        int var12 = -102 / ((arg3 + 18) / 54);
        while (var11 < var10) {
            int var17;
            int var18;
            if (arg1 == 2) {
                var17 = var5 - var11 - 1;
                var18 = var4 - var11 - 1;
            } else {
                var17 = var11;
                var18 = var11;
            }
            char var19 = arg0.charAt(var18);
            char var20 = arg2.charAt(var17);
            if (var19 != var20 && Character.toUpperCase(var19) != Character.toUpperCase(var20)) {
                char var21 = Character.toLowerCase(var19);
                char var22 = Character.toLowerCase(var20);
                if (var21 != var22) {
                    return client.method1641(var21, -127, arg1) - client.method1641(var22, -49, arg1);
                }
            }
            var11++;
        }
        int var13 = var4 - var5;
        if (var13 != 0) {
            return var13;
        }
        for (int var14 = 0; var14 < var10; var14++) {
            char var15 = arg0.charAt(var14);
            char var16 = arg2.charAt(var14);
            if (var15 != var16) {
                return client.method1641(var15, -62, arg1) - client.method1641(var16, -102, arg1);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I")
    public final int method62(int arg0, int arg1) {
        field2520++;
        if (arg0 == -1001524734) {
            class37 var3 = (class37) this.field2528.method837((byte) -72, (long) arg1);
            return var3 == null ? 0 : var3.method156((byte) 127);
        } else {
            return 106;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Ljp;")
    public final class404 method65(int arg0) {
        field2510++;
        if (this.field2527 != null) {
            return this.field2527;
        }
        if (this.field2504 == null) {
            if (this.field2511.method529(false)) {
                return null;
            }
            this.field2504 = this.field2511.method537((byte) 0, true, this.field2505, 80, 255);
        }
        if (this.field2504.field484) {
            return null;
        }
        byte[] var2 = this.field2504.method154(true);
        if (arg0 != 10383) {
            return null;
        }
        if (this.field2504 instanceof class363) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2527 = new class404(var2, this.field2533);
                if (this.field2527.field5577 != this.field2519) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2527 = null;
                if (this.field2511.method529(false)) {
                    this.field2504 = null;
                } else {
                    this.field2504 = this.field2511.method537((byte) 0, true, this.field2505, -116, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2527 = new class404(var2, this.field2533);
            } catch (RuntimeException var4) {
                this.field2511.method526(arg0 - 10485);
                this.field2527 = null;
                if (this.field2511.method529(false)) {
                    this.field2504 = null;
                } else {
                    this.field2504 = this.field2511.method537((byte) 0, true, this.field2505, 91, 255);
                }
                return null;
            }
            if (this.field2512 != null) {
                this.field2522.method2746(this.field2512, var2, this.field2505, false);
            }
        }
        if (this.field2502 != null) {
            this.field2523 = 0;
            this.field2507 = new byte[this.field2527.field5576];
        }
        this.field2504 = null;
        return this.field2527;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(Z)I")
    public final int method1257(boolean arg0) {
        field2514++;
        return arg0 ? this.field2523 : 108;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BIII)V")
    public static final void method1258(byte arg0, int arg1, int arg2, int arg3) {
        field2513++;
        if (class341.field4617 == null) {
            return;
        }
        long var4 = (long) (arg3 | arg1 << 14 | arg2 << 28);
        int var6 = -57 / ((arg0 + 10) / 34);
        class119 var7 = (class119) class417.field5771.method837((byte) -72, var4);
        if (var7 == null) {
            class432.method2670(arg2, arg3, arg1);
            return;
        }
        class278 var8 = (class278) var7.field1805.method1173(0);
        if (var8 == null) {
            class432.method2670(arg2, arg3, arg1);
            return;
        }
        class241 var9 = (class241) class432.method2670(arg2, arg3, arg1);
        if (var9 == null) {
            var9 = new class241();
        } else {
            var9.field3409 = var9.field3407 = -1;
        }
        var9.field3404 = var8.field3795;
        var9.field3408 = var8.field3793;
        label44: while (true) {
            class278 var10 = (class278) var7.field1805.method1165(true);
            if (var10 == null) {
                break;
            }
            if (var9.field3404 != var10.field3795) {
                var9.field3409 = var10.field3795;
                var9.field3410 = var10.field3793;
                while (true) {
                    class278 var11 = (class278) var7.field1805.method1165(true);
                    if (var11 == null) {
                        break label44;
                    }
                    if (var9.field3404 != var11.field3795 && var9.field3409 != var11.field3795) {
                        var9.field3407 = var11.field3795;
                        var9.field3406 = var11.field3793;
                    }
                }
            }
        }
        int var12 = class50.method408(arg2, (arg3 << 7) + 64, (arg1 << 7) + 64, 16);
        class48.method398(arg2, arg3, arg1, var12, var9);
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(I)V")
    public final void method1259(int arg0) {
        field2524++;
        if (this.field2540 == null || this.method65(10383) == null) {
            return;
        }
        if (arg0 != -1) {
            this.method1253(-98);
        }
        for (class311 var2 = this.field2537.method1173(0); var2 != null; var2 = this.field2537.method1165(true)) {
            int var3 = (int) var2.field4226;
            if (var3 < 0 || this.field2527.field5576 <= var3 || this.field2527.field5580[var3] == 0) {
                var2.method1884(false);
            } else {
                if (this.field2507[var3] == 0) {
                    this.method1250(true, var3, 1);
                }
                if (this.field2507[var3] == -1) {
                    this.method1250(true, var3, 2);
                }
                if (this.field2507[var3] == 1) {
                    var2.method1884(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(Z)V")
    public final void method1260(boolean arg0) {
        field2516++;
        if (this.field2540 != null) {
            if (this.method65(10383) == null) {
                return;
            }
            if (this.field2535) {
                boolean var2 = true;
                for (class311 var3 = this.field2540.method1173(0); var3 != null; var3 = this.field2540.method1165(true)) {
                    int var5 = (int) var3.field4226;
                    if (this.field2507[var5] == 0) {
                        this.method1250(true, var5, 1);
                    }
                    if (this.field2507[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1884(false);
                    }
                }
                while (this.field2536 < this.field2527.field5580.length) {
                    if (this.field2527.field5580[this.field2536] == 0) {
                        this.field2536++;
                    } else {
                        if (this.field2522.field6213 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2507[this.field2536] == 0) {
                            this.method1250(true, this.field2536, 1);
                        }
                        if (this.field2507[this.field2536] == 0) {
                            class311 var4 = new class311();
                            var4.field4226 = (long) this.field2536;
                            this.field2540.method1162(123, var4);
                            var2 = false;
                        }
                        this.field2536++;
                    }
                }
                if (var2) {
                    this.field2536 = 0;
                    this.field2535 = false;
                }
            } else if (this.field2539) {
                boolean var6 = true;
                for (class311 var7 = this.field2540.method1173(0); var7 != null; var7 = this.field2540.method1165(true)) {
                    int var9 = (int) var7.field4226;
                    if (this.field2507[var9] != 1) {
                        this.method1250(arg0, var9, 2);
                    }
                    if (this.field2507[var9] == 1) {
                        var7.method1884(false);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2527.field5580.length > this.field2536) {
                    if (this.field2527.field5580[this.field2536] == 0) {
                        this.field2536++;
                    } else {
                        if (this.field2511.method523((byte) 52)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2507[this.field2536] != 1) {
                            this.method1250(true, this.field2536, 2);
                        }
                        if (this.field2507[this.field2536] != 1) {
                            class311 var8 = new class311();
                            var8.field4226 = (long) this.field2536;
                            this.field2540.method1162(126, var8);
                            var6 = false;
                        }
                        this.field2536++;
                    }
                }
                if (var6) {
                    this.field2536 = 0;
                    this.field2539 = false;
                }
            } else {
                this.field2540 = null;
            }
        }
        if (!arg0 || !this.field2542 || this.field2541 > class199.method1372(30938)) {
            return;
        }
        for (class37 var10 = (class37) this.field2528.method842((byte) -25); var10 != null; var10 = (class37) this.field2528.method836(-112)) {
            if (!var10.field484) {
                if (var10.field482) {
                    if (!var10.field486) {
                        throw new RuntimeException();
                    }
                    var10.method1884(false);
                } else {
                    var10.field482 = true;
                }
            }
        }
        this.field2541 = class199.method1372(30938) + 1000L;
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V")
    public static void method1261(int arg0) {
        if (arg0 != -1657358815) {
            field2532 = null;
        }
        field2515 = null;
        field2521 = null;
        field2538 = null;
        field2532 = null;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(ILnf;Lnf;Lpn;Lee;IIZ)V")
    public class177(int arg0, class258 arg1, class258 arg2, class66 arg3, class442 arg4, int arg5, int arg6, boolean arg7) {
        this.field2505 = arg0;
        this.field2502 = arg1;
        if (this.field2502 == null) {
            this.field2535 = false;
        } else {
            this.field2535 = true;
            this.field2540 = new class162();
        }
        this.field2511 = arg3;
        this.field2519 = arg6;
        this.field2522 = arg4;
        this.field2533 = arg5;
        this.field2542 = arg7;
        this.field2512 = arg2;
        if (this.field2512 != null) {
            this.field2504 = this.field2522.method2741(88, this.field2512, this.field2505);
        }
    }

    static {
        new class368("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field2532 = null;
        new class368("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    }
}
