import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class165 extends class221 {

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "Z")
    public boolean field2391 = false;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    private int field2381 = 0;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "Z")
    private boolean field2412 = false;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "J")
    private long field2398;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "Lol;")
    public class293 field2401;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "Lbn;")
    public class356 field2397;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "Lks;")
    public class323 field2411;

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "Lgn;")
    public class410 field2415;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "Lgn;")
    public static class410 field2383 = new class410();

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "Llm;")
    public static class31 field2413 = new class31(6, 2);

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public int field2377;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    private int field2380;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    private int field2382;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    private int field2385;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    private int field2387;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    private int field2388;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    private int field2390;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    private int field2392;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    private int field2393;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    private int field2395;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    private int field2399;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    private int field2402;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    private int field2403;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
    private int field2405;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    private int field2406;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    private int field2408;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "I")
    private int field2414;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "[[[Lce;")
    public static class409[][][] field2386;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lhw;I)Ljh;")
    public static final class385 method1036(class208 arg0, int arg1) {
        field2379++;
        class385 var2 = new class385();
        if (arg1 != -24028) {
            field2413 = null;
        }
        var2.field5885 = arg0.method1455(-3387);
        var2.field5891 = class500.field7501.method1849(true, var2.field5885);
        return var2;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIZ)I")
    public static final int method1037(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        field2384++;
        if (!arg3) {
            method1044((byte) -66);
        }
        return (arg2 >> 1) + (arg0 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public final void method1038(byte arg0) {
        field2400++;
        int var2 = -36 % ((87 - arg0) / 38);
        this.field2393 = this.field2401.field4609;
        this.field2403 = this.field2401.field4618;
        this.field2388 = this.field2401.field4611;
        this.field2392 = this.field2401.field4620;
        this.field2414 = this.field2401.field4612;
        this.field2387 = this.field2401.field4616;
        this.field2395 = this.field2401.field4617;
        this.field2385 = this.field2401.field4629;
        this.field2380 = this.field2401.field4615;
        if (this.field2414 == this.field2385 && this.field2395 == this.field2385 && this.field2392 == this.field2388 && this.field2403 == this.field2392 && this.field2393 == this.field2380 && this.field2387 == this.field2380) {
            this.field2412 = true;
            return;
        }
        this.field2412 = false;
        int var3 = (this.field2414 + this.field2385 + this.field2395) / 3;
        int var4 = (this.field2392 + this.field2388 + this.field2403) / 3;
        int var5 = (this.field2393 + this.field2387 + this.field2380) / 3;
        if (this.field2410 == var3 && this.field2377 == var4 && this.field2396 == var5) {
            return;
        }
        this.field2377 = var4;
        this.field2396 = var5;
        this.field2410 = var3;
        int var6 = this.field2385 - this.field2414;
        int var7 = this.field2392 - this.field2388;
        int var8 = this.field2380 - this.field2393;
        int var9 = this.field2395 - this.field2414;
        int var10 = this.field2403 - this.field2388;
        int var11 = this.field2387 - this.field2393;
        this.field2402 = var6 * var10 - (var7 * var9);
        this.field2382 = var7 * var11 - (var8 * var10);
        for (this.field2399 = var8 * var9 - var6 * var11; this.field2382 > 32767 || this.field2399 > 32767 || this.field2402 > 32767 || this.field2382 < -32767 || this.field2399 < -32767 || this.field2402 < -32767; this.field2399 >>= 0x1) {
            this.field2402 >>= 0x1;
            this.field2382 >>= 0x1;
        }
        int var12 = (int) Math.sqrt((double) (this.field2399 * this.field2399 + (this.field2382 * this.field2382 + (this.field2402 * this.field2402))));
        if (var12 <= 0) {
            var12 = 1;
        }
        this.field2402 = this.field2402 * 32767 / var12;
        this.field2382 = this.field2382 * 32767 / var12;
        this.field2399 = this.field2399 * 32767 / var12;
        if (this.field2411.field5036 <= 0 && this.field2411.field5074 <= 0) {
            return;
        }
        int var13 = (int) (Math.atan2((double) this.field2402, (double) this.field2382) * 2607.5945876176133D);
        int var14 = (int) (Math.atan2((double) this.field2399, Math.sqrt((double) (this.field2402 * this.field2402 + this.field2382 * this.field2382))) * 2607.5945876176133D);
        this.field2405 = this.field2411.field5036 - this.field2411.field5071;
        this.field2390 = this.field2411.field5074 - this.field2411.field5081;
        this.field2408 = this.field2411.field5071 + var13 - (this.field2405 >> 1);
        this.field2406 = this.field2411.field5081 + var14 - (this.field2390 >> 1);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IJ)V")
    public final void method1039(int arg0, long arg1) {
        for (class251 var4 = (class251) this.field2415.method2616(255); var4 != null; var4 = (class251) this.field2415.method2619(255)) {
            var4.method1735(arg1);
        }
        field2407++;
        if (arg0 > -47) {
            method1036(null, 98);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBII)I")
    public static final int method1040(int arg0, byte arg1, int arg2, int arg3) {
        field2394++;
        if (arg1 != 120) {
            field2413 = null;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1041(String arg0, byte arg1) {
        field2378++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 != -38) {
            field2413 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 > '߿') {
                var3 += 3;
            } else {
                var3 += 2;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(JLza;IBZ)V")
    public final void method1042(long arg0, class497 arg1, int arg2, byte arg3, boolean arg4) {
        field2404++;
        if (this.field2391) {
            arg4 = false;
        } else if (this.field2411.field5090 > class359.field5567) {
            arg4 = false;
        } else if (class14.field151 > class540.field7898[class359.field5567]) {
            arg4 = false;
        } else if (this.field2412) {
            arg4 = false;
        } else if (this.field2411.field5068 != -1) {
            int var7 = (int) (arg0 - this.field2398);
            if (this.field2411.field5037 || var7 <= this.field2411.field5068) {
                var7 %= this.field2411.field5068;
            } else {
                arg4 = false;
            }
            if (!this.field2411.field5052 && this.field2411.field5060 > var7) {
                arg4 = false;
            }
            if (this.field2411.field5052 && var7 >= this.field2411.field5060) {
                arg4 = false;
            }
        }
        if (arg4) {
            this.field2381 += (int) (((double) this.field2411.field5055 + Math.random() * (double) (this.field2411.field5079 - this.field2411.field5055)) * (double) arg2);
            if (this.field2381 > 63) {
                int var8 = this.field2381 >> 6;
                this.field2381 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field2411.field5036 <= 0 && this.field2411.field5074 <= 0) {
                        var10 = this.field2399;
                        var11 = this.field2382;
                        var12 = this.field2402;
                    } else {
                        int var13 = this.field2408 + (int) (Math.random() * (double) this.field2405);
                        int var14 = var13 & 0x3FFF;
                        int var15 = class147.field1988[var14];
                        int var16 = class147.field1986[var14];
                        int var17 = this.field2406 + (int) (Math.random() * (double) this.field2390);
                        int var18 = var17 & 0x1FFF;
                        int var19 = class147.field1988[var18];
                        int var20 = class147.field1986[var18];
                        byte var21 = 15;
                        var10 = (var20 << 0) * -1;
                        var11 = var16 * var19 >> var21;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var22 = 65535 - var22;
                        var23 = 65535 - var23;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = (int) ((long) this.field2414 * (long) var22 + (long) this.field2395 * (long) var24 + (long) this.field2385 * (long) var23 >> 16);
                    int var26 = (int) ((long) this.field2392 * (long) var23 + ((long) this.field2388 * (long) var22 + ((long) this.field2403 * (long) var24)) >> 16);
                    int var27 = (int) ((long) this.field2380 * (long) var23 + (long) this.field2393 * (long) var22 + (long) this.field2387 * (long) var24 >> 16);
                    int var28 = this.field2411.field5102 + (int) ((double) (this.field2411.field5054 - this.field2411.field5102) * Math.random());
                    int var29 = this.field2411.field5078 + (int) ((double) (this.field2411.field5075 - this.field2411.field5078) * Math.random());
                    int var30 = (int) ((double) (this.field2411.field5085 - this.field2411.field5099) * Math.random()) + this.field2411.field5099;
                    int var33;
                    if (this.field2411.field5094) {
                        double var31 = Math.random();
                        var33 = (int) ((double) this.field2411.field5073 * var31 + (double) this.field2411.field5092) | (int) ((double) this.field2411.field5051 * var31 + (double) this.field2411.field5104) << 8 | (int) ((double) this.field2411.field5096 * var31 + (double) this.field2411.field5098) << 16 | (int) (Math.random() * (double) this.field2411.field5093 + (double) this.field2411.field5041) << 24;
                    } else {
                        var33 = (int) (Math.random() * (double) this.field2411.field5093 + (double) this.field2411.field5041) << 24 | (int) ((double) this.field2411.field5073 * Math.random() + (double) this.field2411.field5092) | (int) (Math.random() * (double) this.field2411.field5096 + (double) this.field2411.field5098) << 16 | (int) (Math.random() * (double) this.field2411.field5051 + (double) this.field2411.field5104) << 8;
                    }
                    int var34 = this.field2411.field5062;
                    if (!arg1.method1318() && !this.field2411.field5088) {
                        var34 = -1;
                    }
                    if (class6.field73 == class196.field3036) {
                        new class251(this, var25, var26, var27, var11, var10, var12, var28, var29, var33, var30, var34, this.field2411.field5064, this.field2411.field5040);
                    } else {
                        class251 var35 = class64.field1006[class6.field73];
                        class6.field73 = class6.field73 + 1 & 0x3FF;
                        var35.method1732(this, var25, var26, var27, var11, var10, var12, var28, var29, var33, var30, var34, this.field2411.field5064, this.field2411.field5040);
                    }
                }
            }
        }
        this.field2409 = 0;
        class251 var37 = (class251) this.field2415.method2616(255);
        if (arg3 < 14) {
            method1036(null, -100);
        }
        while (var37 != null) {
            var37.method1733(arg0, arg2);
            this.field2409++;
            var37 = (class251) this.field2415.method2619(255);
        }
        class537.field7866 += this.field2409;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lec;Lec;IZI)I")
    public static final int method1043(class68 arg0, class68 arg1, int arg2, boolean arg3, int arg4) {
        field2389++;
        if (arg4 == 1) {
            int var5 = arg1.field2444;
            int var6 = arg0.field2444;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class299.method2011(arg0.method486(26).field166, (byte) 66, class12.field131, arg1.method486(-72).field166);
        } else if (arg4 == 3) {
            if (arg1.field1035.equals("-")) {
                if (arg0.field1035.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field1035.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class299.method2011(arg0.field1035, (byte) 66, class12.field131, arg1.field1035);
            }
        } else if (arg4 == 4) {
            if (arg1.method1061((byte) -109)) {
                return arg0.method1061((byte) -109) ? 0 : 1;
            } else if (arg0.method1061((byte) -109)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg1.method1059(arg2 - 247)) {
                return arg0.method1059(-1) ? 0 : 1;
            } else if (arg0.method1059(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg1.method1053((byte) -27)) {
                return arg0.method1053((byte) -27) ? 0 : 1;
            } else if (arg0.method1053((byte) -27)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 7) {
            if (arg1.method1063((byte) -106)) {
                return arg0.method1063((byte) -106) ? 0 : 1;
            } else if (arg0.method1063((byte) -106)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 8) {
            int var7 = arg1.field1034;
            int var8 = arg0.field1034;
            if (arg3) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            if (arg2 != 246) {
                field2383 = null;
            }
            return arg1.field1036 - arg0.field1036;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V")
    public static void method1044(byte arg0) {
        field2413 = null;
        field2386 = null;
        if (arg0 >= -25) {
            method1036(null, 13);
        }
        field2383 = null;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lza;Lol;Lbn;J)V")
    public class165(class497 arg0, class293 arg1, class356 arg2, long arg3) {
        this.field2398 = arg3;
        this.field2401 = arg1;
        this.field2397 = arg2;
        this.field2411 = this.field2401.method1966(-2);
        if (!arg0.method1318() && this.field2411.field5080 != -1) {
            this.field2411 = class439.method2786(-29401, this.field2411.field5080);
        }
        this.field2415 = new class410();
        this.field2381 = (int) ((double) this.field2381 + Math.random() * 64.0D);
        this.method1038((byte) 126);
    }
}
