import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class148 extends class115 {

    @OriginalMember(owner = "client!on", name = "F", descriptor = "I")
    private int field2418 = 0;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "Lcn;")
    private class37 field2414 = new class37(16);

    @OriginalMember(owner = "client!on", name = "O", descriptor = "I")
    private int field2427 = 0;

    @OriginalMember(owner = "client!on", name = "N", descriptor = "Lfk;")
    private class317 field2426 = new class317();

    @OriginalMember(owner = "client!on", name = "U", descriptor = "J")
    private long field2433 = 0L;

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    private int field2419;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "Lth;")
    private class153 field2415;

    @OriginalMember(owner = "client!on", name = "S", descriptor = "Z")
    private boolean field2431;

    @OriginalMember(owner = "client!on", name = "M", descriptor = "Lfk;")
    private class317 field2425;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    private int field2405;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "Lth;")
    private class153 field2400;

    @OriginalMember(owner = "client!on", name = "D", descriptor = "Luc;")
    private class228 field2416;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    private int field2396;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "Lna;")
    private class279 field2409;

    @OriginalMember(owner = "client!on", name = "V", descriptor = "Z")
    private boolean field2434;

    @OriginalMember(owner = "client!on", name = "J", descriptor = "Lao;")
    private class286 field2422;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "[I")
    public static int[] field2402 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!on", name = "K", descriptor = "Ll;")
    public static class66 field2423 = new class66(4);

    @OriginalMember(owner = "client!on", name = "P", descriptor = "Z")
    public static boolean field2428 = false;

    @OriginalMember(owner = "client!on", name = "T", descriptor = "I")
    public static int field2432 = 0;

    @OriginalMember(owner = "client!on", name = "R", descriptor = "I")
    public static int field2430 = 0;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "Lfd;")
    private class319 field2395;

    @OriginalMember(owner = "client!on", name = "L", descriptor = "Z")
    private boolean field2424;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "[B")
    private byte[] field2412;

    @OriginalMember(owner = "client!on", name = "Q", descriptor = "[Lho;")
    public static class215[] field2429;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)Lao;", line = 5)
    private final class286 method1225(int arg0, int arg1, int arg2) {
        if (arg0 != 16) {
            return (class286) null;
        }
        class286 var4 = (class286) this.field2414.method370((byte) -120, (long) arg2);
        field2407++;
        if (var4 != null && arg1 == 0 && !var4.field4437 && var4.field4435) {
            var4.method1357(arg0 + 947646994);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field2415 == null || this.field2412[arg2] == -1) {
                    if (this.field2416.method1706(44)) {
                        return null;
                    }
                    var4 = this.field2416.method1721(true, this.field2419, arg2, (byte) 2, arg0 + 28359);
                } else {
                    var4 = this.field2409.method2042(this.field2415, arg0 ^ 0xFFFFB237, arg2);
                }
            } else if (arg1 == 1) {
                if (this.field2415 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2409.method2041(this.field2415, arg2, -110);
            } else if (arg1 == 2) {
                if (this.field2415 == null) {
                    throw new RuntimeException();
                }
                if (this.field2412[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2416.method1709(114)) {
                    return null;
                }
                var4 = this.field2416.method1721(false, this.field2419, arg2, (byte) 2, 28375);
            } else {
                throw new RuntimeException();
            }
            this.field2414.method375(var4, (long) arg2, -76);
        }
        if (var4.field4435) {
            return null;
        }
        byte[] var5 = var4.method871((byte) -117);
        if (!var4 instanceof class157) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class343.field5449.reset();
                class343.field5449.update(var5, 0, var5.length - 2);
                int var6 = (int) class343.field5449.getValue();
                if (this.field2395.field4915[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field2416.field3582 = 0;
                this.field2416.field3580 = 0;
            } catch (RuntimeException var14) {
                this.field2416.method1716(arg0 ^ 0x4E);
                var4.method1357(947647010);
                if (var4.field4437 && !this.field2416.method1706(72)) {
                    class99 var8 = this.field2416.method1721(true, this.field2419, arg2, (byte) 2, 28375);
                    this.field2414.method375(var8, (long) arg2, arg0 ^ 0xFFFFFF8A);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2395.field4910[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field2395.field4910[arg2];
            if (this.field2415 != null) {
                this.field2409.method2039(this.field2415, arg2, var5, arg0 ^ 0xFFFFFF9A);
                if (this.field2412[arg2] != 1) {
                    this.field2418++;
                    this.field2412[arg2] = 1;
                }
            }
            if (!var4.field4437) {
                var4.method1357(947647010);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class343.field5449.reset();
            class343.field5449.update(var5, 0, var5.length - 2);
            int var9 = (int) class343.field5449.getValue();
            if (this.field2395.field4915[arg2] != var9) {
                throw new RuntimeException();
            }
            int var10 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2395.field4910[arg2] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field2412[arg2] != 1) {
                if (this.field2412[arg2] != 0) {
                }
                this.field2418++;
                this.field2412[arg2] = 1;
            }
            if (!var4.field4437) {
                var4.method1357(947647010);
            }
            return var4;
        } catch (Exception var13) {
            this.field2412[arg2] = -1;
            var4.method1357(947647010);
            if (var4.field4437 && !this.field2416.method1706(48)) {
                class99 var12 = this.field2416.method1721(true, this.field2419, arg2, (byte) 2, arg0 ^ 0x6EC7);
                this.field2414.method375(var12, (long) arg2, -88);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)V", line = 221)
    public final void method988(int arg0, byte arg1) {
        field2420++;
        if (this.field2415 == null) {
            return;
        }
        for (class172 var3 = this.field2426.method2244((byte) -128); var3 != null; var3 = this.field2426.method2241(-1)) {
            if (((long) arg0) == var3.field2734) {
                return;
            }
        }
        class172 var4 = new class172();
        var4.field2734 = (long) arg0;
        this.field2426.method2245(var4, 31);
        int var5 = 85 % ((arg1 + 2) / 57);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "()V", line = 250)
    public static final void method1226() {
        class262.field4018 = 0;
        label194: for (int var0 = 0; var0 < class304.field4729; var0++) {
            class100 var1 = class4.field57[var0];
            if (class37.field572 != null) {
                for (int var2 = 0; var2 < class37.field572.length; var2++) {
                    if (class37.field572[var2] != -1000000 && (var1.field1502 <= class37.field572[var2] || var1.field1511 <= class37.field572[var2]) && (var1.field1501 <= class243.field3783[var2] || var1.field1500 <= class243.field3783[var2]) && (var1.field1501 >= class149.field2447[var2] || var1.field1500 >= class149.field2447[var2]) && (var1.field1507 <= class191.field3008[var2] || var1.field1505 <= class191.field3008[var2]) && (var1.field1507 >= class210.field3235[var2] || var1.field1505 >= class210.field3235[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field1499 == 1) {
                int var3 = var1.field1516 + class131.field2216 - class4.field46;
                if (var3 >= 0 && var3 <= class131.field2216 + class131.field2216) {
                    int var4 = var1.field1517 + class131.field2216 - class192.field3033;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1504 + class131.field2216 - class192.field3033;
                    if (var5 > class131.field2216 + class131.field2216) {
                        var5 = class131.field2216 + class131.field2216;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class353.field5632[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class205.field3165 - var1.field1501;
                        if (var7 > 32) {
                            var1.field1520 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1520 = 2;
                            var7 = -var7;
                        }
                        var1.field1518 = (var1.field1507 - class190.field2977 << 8) / var7;
                        var1.field1509 = (var1.field1505 - class190.field2977 << 8) / var7;
                        var1.field1508 = (var1.field1502 - class215.field3371 << 8) / var7;
                        var1.field1503 = (var1.field1511 - class215.field3371 << 8) / var7;
                        class134.field2239[class262.field4018++] = var1;
                    }
                }
            } else if (var1.field1499 == 2) {
                int var8 = var1.field1517 + class131.field2216 - class192.field3033;
                if (var8 >= 0 && var8 <= class131.field2216 + class131.field2216) {
                    int var9 = var1.field1516 + class131.field2216 - class4.field46;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1515 + class131.field2216 - class4.field46;
                    if (var10 > class131.field2216 + class131.field2216) {
                        var10 = class131.field2216 + class131.field2216;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class353.field5632[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class190.field2977 - var1.field1507;
                        if (var12 > 32) {
                            var1.field1520 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1520 = 4;
                            var12 = -var12;
                        }
                        var1.field1498 = (var1.field1501 - class205.field3165 << 8) / var12;
                        var1.field1519 = (var1.field1500 - class205.field3165 << 8) / var12;
                        var1.field1508 = (var1.field1502 - class215.field3371 << 8) / var12;
                        var1.field1503 = (var1.field1511 - class215.field3371 << 8) / var12;
                        class134.field2239[class262.field4018++] = var1;
                    }
                }
            } else if (var1.field1499 == 4) {
                int var13 = var1.field1502 - class215.field3371;
                if (var13 > 128) {
                    int var14 = var1.field1517 + class131.field2216 - class192.field3033;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1504 + class131.field2216 - class192.field3033;
                    if (var15 > class131.field2216 + class131.field2216) {
                        var15 = class131.field2216 + class131.field2216;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1516 + class131.field2216 - class4.field46;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1515 + class131.field2216 - class4.field46;
                        if (var17 > class131.field2216 + class131.field2216) {
                            var17 = class131.field2216 + class131.field2216;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class353.field5632[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1520 = 5;
                            var1.field1498 = (var1.field1501 - class205.field3165 << 8) / var13;
                            var1.field1519 = (var1.field1500 - class205.field3165 << 8) / var13;
                            var1.field1518 = (var1.field1507 - class190.field2977 << 8) / var13;
                            var1.field1509 = (var1.field1505 - class190.field2977 << 8) / var13;
                            class134.field2239[class262.field4018++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V", line = 481)
    public final void method1227(int arg0) {
        field2410++;
        if (this.field2425 != null) {
            if (this.method993(108) == null) {
                return;
            }
            if (this.field2431) {
                boolean var6 = true;
                for (class172 var7 = this.field2425.method2244((byte) -128); var7 != null; var7 = this.field2425.method2241(-1)) {
                    int var8 = (int) var7.field2734;
                    if (this.field2412[var8] == 0) {
                        this.method1225(16, 1, var8);
                    }
                    if (this.field2412[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method1357(947647010);
                    }
                }
                while (this.field2427 < this.field2395.field4919.length) {
                    if (this.field2395.field4919[this.field2427] == 0) {
                        this.field2427++;
                    } else {
                        if (this.field2409.field4310 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field2412[this.field2427] == 0) {
                            this.method1225(16, 1, this.field2427);
                        }
                        if (this.field2412[this.field2427] == 0) {
                            var6 = false;
                            class172 var9 = new class172();
                            var9.field2734 = (long) this.field2427;
                            this.field2425.method2245(var9, 46);
                        }
                        this.field2427++;
                    }
                }
                if (var6) {
                    this.field2431 = false;
                    this.field2427 = 0;
                }
            } else if (this.field2424) {
                boolean var2 = true;
                for (class172 var3 = this.field2425.method2244((byte) -126); var3 != null; var3 = this.field2425.method2241(-1)) {
                    int var4 = (int) var3.field2734;
                    if (this.field2412[var4] != 1) {
                        this.method1225(16, 2, var4);
                    }
                    if (this.field2412[var4] == 1) {
                        var3.method1357(947647010);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field2395.field4919.length > this.field2427) {
                    if (this.field2395.field4919[this.field2427] == 0) {
                        this.field2427++;
                    } else {
                        if (this.field2416.method1709(arg0 ^ 0xFFFFFF90)) {
                            var2 = false;
                            break;
                        }
                        if (this.field2412[this.field2427] != 1) {
                            this.method1225(16, 2, this.field2427);
                        }
                        if (this.field2412[this.field2427] != 1) {
                            var2 = false;
                            class172 var5 = new class172();
                            var5.field2734 = (long) this.field2427;
                            this.field2425.method2245(var5, 52);
                        }
                        this.field2427++;
                    }
                }
                if (var2) {
                    this.field2424 = false;
                    this.field2427 = 0;
                }
            } else {
                this.field2425 = null;
            }
        }
        if (this.field2434 && this.field2433 <= class156.method1273((byte) -71)) {
            for (class286 var10 = (class286) this.field2414.method371(arg0 - 19138); var10 != null; var10 = (class286) this.field2414.method378((byte) -87)) {
                if (!var10.field4435) {
                    if (var10.field4444) {
                        if (!var10.field4437) {
                            throw new RuntimeException();
                        }
                        var10.method1357(947647010);
                    } else {
                        var10.field4444 = true;
                    }
                }
            }
            this.field2433 = class156.method1273((byte) -44) + 1000L;
        }
        if (arg0 != -1) {
            field2430 = -9;
        }
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)I", line = 659)
    public final int method1228(int arg0) {
        field2404++;
        if (this.field2395 == null) {
            return 0;
        } else if (!this.field2431) {
            return this.field2395.field4916;
        } else if (arg0 == -2) {
            class172 var2 = this.field2425.method2244((byte) -125);
            return var2 == null ? 0 : (int) var2.field2734;
        } else {
            return -88;
        }
    }

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(I)V", line = 686)
    public static void method1229(int arg0) {
        field2402 = null;
        field2429 = null;
        field2423 = null;
        if (arg0 != 0) {
            method1226();
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)I", line = 700)
    public final int method1230(boolean arg0) {
        field2413++;
        return arg0 ? 42 : this.field2418;
    }

    @OriginalMember(owner = "client!on", name = "f", descriptor = "(I)I", line = 714)
    public final int method1231(int arg0) {
        field2397++;
        if (this.method993(arg0 - 58) == null) {
            return this.field2422 == null ? 0 : this.field2422.method870(false);
        } else {
            if (arg0 != 100) {
                this.method1232(105);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Lfd;", line = 743)
    public final class319 method993(int arg0) {
        field2403++;
        if (this.field2395 != null) {
            return this.field2395;
        }
        if (this.field2422 == null) {
            if (this.field2416.method1706(109)) {
                return null;
            }
            this.field2422 = this.field2416.method1721(true, 255, this.field2419, (byte) 0, 28375);
        }
        int var2 = 103 % ((-arg0 - 43) / 35);
        if (this.field2422.field4435) {
            return null;
        }
        byte[] var3 = this.field2422.method871((byte) -115);
        if (this.field2422 instanceof class157) {
            try {
                if (var3 == null) {
                    throw new RuntimeException();
                }
                this.field2395 = new class319(var3, this.field2396);
                if (this.field2395.field4923 != this.field2405) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var6) {
                this.field2395 = null;
                if (this.field2416.method1706(37)) {
                    this.field2422 = null;
                } else {
                    this.field2422 = this.field2416.method1721(true, 255, this.field2419, (byte) 0, 28375);
                }
                return null;
            }
        } else {
            try {
                if (var3 == null) {
                    throw new RuntimeException();
                }
                this.field2395 = new class319(var3, this.field2396);
            } catch (RuntimeException var7) {
                this.field2416.method1716(107);
                this.field2395 = null;
                if (this.field2416.method1706(95)) {
                    this.field2422 = null;
                } else {
                    this.field2422 = this.field2416.method1721(true, 255, this.field2419, (byte) 0, 28375);
                }
                return null;
            }
            if (this.field2400 != null) {
                this.field2409.method2039(this.field2400, this.field2419, var3, -111);
            }
        }
        if (this.field2415 != null) {
            this.field2418 = 0;
            this.field2412 = new byte[this.field2395.field4925];
        }
        this.field2422 = null;
        return this.field2395;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)I", line = 838)
    public final int method990(int arg0, int arg1) {
        if (arg0 != -13609) {
            this.method1231(5);
        }
        class286 var3 = (class286) this.field2414.method370((byte) -120, (long) arg1);
        field2408++;
        return var3 == null ? 0 : var3.method870(false);
    }

    @OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V", line = 856)
    public final void method1232(int arg0) {
        field2421++;
        if (arg0 == 0 && this.field2415 != null) {
            this.field2424 = true;
            if (this.field2425 == null) {
                this.field2425 = new class317();
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BIIILrk;II)V", line = 878)
    public static final void method1233(byte arg0, int arg1, int arg2, int arg3, class290 arg4, int arg5, int arg6) {
        field2417++;
        long var7 = 0L;
        if (arg5 == 0) {
            var7 = class280.method2045(arg1, arg2, arg6);
        } else if (arg5 == 1) {
            var7 = class252.method1873(arg1, arg2, arg6);
        } else if (arg5 == 2) {
            var7 = class209.method1553(arg1, arg2, arg6);
        } else if (arg5 == 3) {
            var7 = class41.method427(arg1, arg2, arg6);
        }
        boolean var9 = true;
        int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        if (arg0 >= -97) {
            return;
        }
        class212 var11 = class43.method437(63, var10);
        boolean var12 = false;
        int var13 = ((int) var7 & 0x7D02C) >> 14;
        boolean var14 = false;
        if (var11.method1579(false)) {
            class172.method1356(arg1, arg2, -124, var11, arg6);
        }
        int var15 = (int) var7 >> 20 & 0x3;
        if (var7 == 0L) {
            return;
        }
        class64 var16 = null;
        class64 var17 = null;
        if (arg5 == 0) {
            class202 var18 = class181.method1409(arg1, arg2, arg6);
            if (var18 != null) {
                var17 = var18.field3116;
                var16 = var18.field3121;
            }
            if (var11.field3329 != 0) {
                arg4.method2096(arg2, arg6, var13, !var11.field3308, (byte) -102, var15, var11.field3307);
            }
        } else if (arg5 == 1) {
            class280 var21 = class177.method1378(arg1, arg2, arg6);
            if (var21 != null) {
                var17 = var21.field4317;
                var16 = var21.field4319;
            }
        } else if (arg5 == 2) {
            class297 var19 = class113.method974(arg1, arg2, arg6);
            if (var19 != null) {
                var16 = var19.field4605;
            }
            if (var11.field3329 != 0 && (arg2 + var11.field3306) < 104 && (var11.field3306 + arg6) < 104 && (var11.field3250 + arg2) < 104 && (var11.field3250 + arg6) < 104) {
                arg4.method2105(arg6, var11.field3307, var15, var11.field3306, 1, !var11.field3308, arg2, var11.field3250);
            }
        } else if (arg5 == 3) {
            class44 var20 = class163.method1301(arg1, arg2, arg6);
            if (var20 != null) {
                var16 = var20.field714;
            }
            if (var11.field3329 == 1) {
                arg4.method2094(arg6, (byte) 125, arg2);
            }
        }
        if (var11.field3289 != null) {
            var11 = var11.method1568((byte) 112);
        }
        if (!class240.field3737 || var11 == null || !var11.field3258) {
            return;
        }
        if (var13 == 2) {
            if ((var16 instanceof class288)) {
                ((class288) var16).method2085(true);
            } else {
                class126.method1093(arg3, var15 + 4, var13, 1, arg2, 0, var11, 0, arg6);
            }
            if ((var17 instanceof class288)) {
                ((class288) var17).method2085(true);
            } else {
                class126.method1093(arg3, var15 + 1 & 0x3, var13, 1, arg2, 0, var11, 0, arg6);
            }
        } else if (var13 == 5) {
            if ((var16 instanceof class288)) {
                ((class288) var16).method2085(true);
            } else {
                class126.method1093(arg3, var15, 4, 1, arg2, field2402[var15] * 8, var11, class331.field5087[var15] * 8, arg6);
            }
        } else if (var13 == 6) {
            if (var16 instanceof class288) {
                ((class288) var16).method2085(true);
            } else {
                class126.method1093(arg3, var15 + 4, 4, 1, arg2, class190.field2987[var15] * 8, var11, class217.field3404[var15] * 8, arg6);
            }
        } else if (var13 == 7) {
            if ((var16 instanceof class288)) {
                ((class288) var16).method2085(true);
            } else {
                class126.method1093(arg3, (var15 + 2 & 0x3) + 4, 4, 1, arg2, 0, var11, 0, arg6);
            }
        } else if (var13 == 8) {
            if ((var16 instanceof class288)) {
                ((class288) var16).method2085(true);
            } else {
                class126.method1093(arg3, var15 + 4, 4, 1, arg2, class190.field2987[var15] * 8, var11, class217.field3404[var15] * 8, arg6);
            }
            if (var17 instanceof class288) {
                ((class288) var17).method2085(true);
            } else {
                class126.method1093(arg3, (var15 + 2 & 0x3) + 4, 4, 1, arg2, class190.field2987[var15] * 8, var11, class217.field3404[var15] * 8, arg6);
            }
        } else if (var13 == 11) {
            if (var16 instanceof class288) {
                ((class288) var16).method2085(true);
            } else {
                class126.method1093(arg3, var15 + 4, 10, 1, arg2, 0, var11, 0, arg6);
            }
        } else if (var16 instanceof class288) {
            ((class288) var16).method2085(true);
        } else {
            class126.method1093(arg3, var15, var13, 1, arg2, 0, var11, 0, arg6);
        }
    }

    @OriginalMember(owner = "client!on", name = "h", descriptor = "(I)I", line = 1075)
    public final int method1234(int arg0) {
        field2398++;
        if (arg0 < 47) {
            return -19;
        } else if (this.field2395 == null) {
            return 0;
        } else {
            return this.field2395.field4916;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(II)[B", line = 1090)
    public final byte[] method992(int arg0, int arg1) {
        field2401++;
        if (arg1 != 30286) {
            this.method1227(50);
        }
        class286 var3 = this.method1225(arg1 - 30270, 0, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method871((byte) -110);
            var3.method1357(arg1 + 947616724);
            return var4;
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(ILth;Lth;Luc;Lna;IIZ)V", line = 1195)
    public class148(int arg0, class153 arg1, class153 arg2, class228 arg3, class279 arg4, int arg5, int arg6, boolean arg7) {
        this.field2419 = arg0;
        this.field2415 = arg1;
        if (this.field2415 == null) {
            this.field2431 = false;
        } else {
            this.field2431 = true;
            this.field2425 = new class317();
        }
        this.field2405 = arg6;
        this.field2400 = arg2;
        this.field2416 = arg3;
        this.field2396 = arg5;
        this.field2409 = arg4;
        this.field2434 = arg7;
        if (this.field2400 != null) {
            this.field2422 = this.field2409.method2042(this.field2400, -19929, this.field2419);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 1115)
    public final void method1235(byte arg0) {
        field2406++;
        if (this.field2425 == null || this.method993(-84) == null || arg0 < 55) {
            return;
        }
        for (class172 var2 = this.field2426.method2244((byte) -125); var2 != null; var2 = this.field2426.method2241(-1)) {
            int var3 = (int) var2.field2734;
            if (var3 < 0 || this.field2395.field4925 <= var3 || this.field2395.field4919[var3] == 0) {
                var2.method1357(947647010);
            } else {
                if (this.field2412[var3] == 0) {
                    this.method1225(16, 1, var3);
                }
                if (this.field2412[var3] == -1) {
                    this.method1225(16, 2, var3);
                }
                if (this.field2412[var3] == 1) {
                    var2.method1357(947647010);
                }
            }
        }
    }
}
