import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class32 extends class86 {

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    private int field388 = 0;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "Z")
    public boolean field396 = false;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "Z")
    public boolean field383 = true;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "Lsk;")
    public class238 field375;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "Lne;")
    public class187 field398;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "Lug;")
    public class92 field394;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Lik;")
    public class149 field376;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "J")
    private long field384;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field382 = -1;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)Z", line = 4)
    public static final boolean method199(boolean arg0, int arg1) {
        if (arg1 != 947635216) {
            method202(-68, -21, -101);
        }
        field402++;
        boolean var2 = class46.method337();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class46.method329();
        } else if (!class46.method335() || !class46.method333() || !class46.method327()) {
            arg0 = false;
        }
        class66.field849 = arg0;
        class122.method879(-25299, class157.field2216);
        if (var2 == arg0) {
            return false;
        } else {
            ((class138) class350.field5467).method1042(127);
            return true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 46)
    public static final void method200(byte arg0) {
        field371++;
        class255.field3729.method2258((byte) 86);
        if (arg0 <= 26) {
            method203(7, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I", line = 66)
    public static final int method201(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I", line = 91)
    public static final int method202(int arg0, int arg1, int arg2) {
        field397++;
        int var3 = arg2 * 57 + arg0;
        if (arg1 == 25528) {
            int var4 = var3 << 13 ^ var3;
            int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return (var5 & 0x7FD13C7) >> 19;
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lsk;Lne;J)V", line = 501)
    public class32(class238 arg0, class187 arg1, long arg2) {
        this.field375 = arg0;
        this.field398 = arg1;
        this.field394 = new class92();
        this.field376 = this.field375.field3442;
        this.field384 = arg2;
        this.field388 = (int) ((double) this.field388 + Math.random() * 64.0D);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)Lgl;", line = 110)
    public static final class281 method203(int arg0, byte[] arg1) {
        field391++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == -11537) {
            class281 var2;
            if (class47.field623) {
                var2 = new class39(arg1, class348.field5418, class119.field1578, class251.field3673, class184.field2508, class338.field5276);
            } else {
                var2 = new class230(arg1, class348.field5418, class119.field1578, class251.field3673, class184.field2508, class338.field5276);
            }
            class236.method1685(false);
            return var2;
        } else {
            return (class281) null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Lwg;", line = 137)
    public static final class310 method204(int arg0) {
        if (arg0 != 257238413) {
            method204(-9);
        }
        field389++;
        return class38.field458;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIBI)V", line = 148)
    public static final void method205(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 > -20) {
            return;
        }
        if (arg2 >= arg4) {
            for (int var5 = arg4; var5 < arg2; var5++) {
                class331.field4902[var5][arg0] = arg1;
            }
        } else {
            for (int var6 = arg2; var6 < arg4; var6++) {
                class331.field4902[var6][arg0] = arg1;
            }
        }
        field381++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZIJI)V", line = 186)
    public final void method206(int arg0, int arg1, boolean arg2, int arg3, long arg4, int arg5) {
        field390++;
        if (this.field396) {
            arg2 = false;
        } else if (class187.field2597 < this.field376.field2088) {
            arg2 = false;
        } else if (class74.field980[class187.field2597] < class187.field2560) {
            arg2 = false;
        } else if (this.field401 == this.field399 && this.field401 == this.field378 && this.field386 == this.field379 && this.field386 == this.field368 && this.field395 == this.field369 && this.field404 == this.field369) {
            arg2 = false;
        } else if (this.field376.field2116 != -1) {
            int var8 = (int) (arg4 - this.field384);
            if (this.field376.field2102 || var8 <= this.field376.field2116) {
                var8 %= this.field376.field2116;
            } else {
                arg2 = false;
            }
            if (!this.field376.field2058 && this.field376.field2097 > var8) {
                arg2 = false;
            }
            if (this.field376.field2058 && var8 >= this.field376.field2097) {
                arg2 = false;
            }
        }
        if (arg2) {
            this.field388 += (int) (((double) this.field376.field2111 + (double) (this.field376.field2075 - this.field376.field2111) * Math.random()) * (double) arg0);
            if (this.field388 > 63) {
                int var9 = this.field388 >> 6;
                this.field388 &= 0x3F;
                if (this.field383) {
                    int var10 = this.field401 - this.field399;
                    int var11 = this.field386 - this.field379;
                    int var12 = this.field378 - this.field399;
                    int var13 = this.field368 - this.field379;
                    int var14 = this.field369 - this.field395;
                    this.field392 = var10 * var13 - var11 * var12;
                    int var15 = this.field404 - this.field395;
                    this.field380 = var12 * var14 - (var10 * var15);
                    this.field365 = var11 * var15 - var13 * var14;
                    while (true) {
                        if (this.field365 <= 32767 && this.field380 <= 32767 && this.field392 <= 32767 && this.field365 >= -32767 && this.field380 >= -32767 && this.field392 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field365 * this.field365 + this.field392 * this.field392 + this.field380 * this.field380));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field365 = this.field365 * 32767 / var16;
                            this.field380 = this.field380 * 32767 / var16;
                            this.field392 = this.field392 * 32767 / var16;
                            if (this.field376.field2095 > 0 || this.field376.field2105 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field392, (double) this.field365) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field380, Math.sqrt((double) (this.field392 * this.field392 + this.field365 * this.field365))) * 2047.0D / 6.283185307179586D);
                                this.field403 = this.field376.field2095 - this.field376.field2086;
                                this.field377 = this.field376.field2105 - this.field376.field2101;
                                this.field405 = var19 + this.field376.field2101 - (this.field377 / 2);
                                int var20 = var18 - this.field398.field2586;
                                this.field385 = this.field376.field2086 + var20 - (this.field403 / 2);
                            } else if (this.field398.field2586 != 0) {
                                int var17 = this.field392 * arg1 + (this.field365 * arg3) >> 16;
                                this.field392 = this.field392 * arg3 - (this.field365 * arg1) >> 16;
                                this.field365 = var17;
                            }
                            this.field383 = false;
                            break;
                        }
                        this.field380 >>= 0x1;
                        this.field392 >>= 0x1;
                        this.field365 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field376.field2095 <= 0 && this.field376.field2105 <= 0) {
                        var22 = this.field380;
                        var23 = this.field365;
                        var24 = this.field392;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field403) + this.field385;
                        int var26 = (int) (Math.random() * (double) this.field377) + this.field405;
                        int var27 = var26 & 0x3FF;
                        int var28 = var25 & 0x7FF;
                        int var29 = class350.field5476[var27] >> 1;
                        int var30 = class350.field5474[var28] >> 1;
                        var23 = var29 * var30 >> 15;
                        int var31 = class350.field5476[var28] >> 1;
                        var24 = var29 * var31 >> 15;
                        int var32 = class350.field5474[var27] >> 1;
                        var22 = var32 * -1;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var34) * var33 >> 8;
                    int var36 = 255 - var35 - var34;
                    int var37 = this.field395 * var34 + this.field404 * var36 + this.field369 * var35 >> 8;
                    int var38 = this.field379 * var34 + this.field386 * var35 + this.field368 * var36 >> 8;
                    int var39 = this.field378 * var36 + (this.field399 * var34 + (this.field401 * var35)) >> 8;
                    if (this.field398.field2586 != 0) {
                        int var40 = arg1 * var37 + arg3 * var39 >> 16;
                        var37 = arg3 * var37 - (arg1 * var39) >> 16;
                        var39 = var40;
                    }
                    int var41 = (int) (Math.random() * (double) (this.field376.field2121 - this.field376.field2080)) + this.field376.field2080;
                    int var42 = (int) ((double) (this.field376.field2079 - this.field376.field2098) * Math.random()) + this.field376.field2098;
                    int var43;
                    if (this.field376.field2077) {
                        double var44 = Math.random();
                        var43 = (int) ((double) this.field376.field2119 * var44 + (double) this.field376.field2064) << 24 | (int) ((double) this.field376.field2059 * var44 + (double) this.field376.field2078) << 16 | (int) ((double) this.field376.field2110 * var44 + (double) this.field376.field2066) << 8 | (int) ((double) this.field376.field2063 * var44 + (double) this.field376.field2100);
                    } else {
                        var43 = (int) (Math.random() * (double) this.field376.field2119 + (double) this.field376.field2064) << 24 | (int) (Math.random() * (double) this.field376.field2063 + (double) this.field376.field2100) | (int) ((double) this.field376.field2110 * Math.random() + (double) this.field376.field2066) << 8 | (int) ((double) this.field376.field2078 + Math.random() * (double) this.field376.field2059) << 16;
                    }
                    if (class187.field2563 == class187.field2562) {
                        new class136(this, this.field398.field2588 + var39, this.field398.field2581 - -var38, this.field398.field2577 + var37, var23, var22, var24, var41, var42, var43);
                    } else {
                        class136 var47 = class187.field2559[class187.field2562];
                        class187.field2562 = class187.field2562 + 1 & 0x3FF;
                        var47.method1031(this, this.field398.field2588 + var39, this.field398.field2581 + var38, this.field398.field2577 + var37, var23, var22, var24, var41, var42, var43);
                    }
                }
            }
        }
        this.field387 = 0;
        for (class136 var48 = (class136) this.field394.method668((byte) 56); var48 != null; var48 = (class136) this.field394.method663(-2069)) {
            var48.method1028(arg4, arg0);
            this.field387++;
        }
        int var49 = 79 / ((73 - arg5) / 39);
        class187.field2569 += this.field387;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(JI)V", line = 408)
    public static final void method207(long arg0, int arg1) {
        field400++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class45.field559; var3++) {
            if (class158.field2251[var3] == arg0) {
                class237.field3426++;
                class45.field559--;
                for (int var4 = var3; var4 < class45.field559; var4++) {
                    class65.field814[var4] = class65.field814[var4 + 1];
                    class237.field3431[var4] = class237.field3431[var4 + 1];
                    class340.field5317[var4] = class340.field5317[var4 + 1];
                    class158.field2251[var4] = class158.field2251[var4 + 1];
                    class167.field2333[var4] = class167.field2333[var4 + 1];
                    class130.field1772[var4] = class130.field1772[var4 + 1];
                }
                class180.field2464 = class64.field801;
                class251.field3681.method1309(23, 172);
                class251.field3681.method2049(-19780, arg0);
                break;
            }
        }
        if (arg1 < 43) {
            method201(-21, 22);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIIII)V", line = 462)
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field404 = arg9;
        this.field386 = arg4;
        this.field399 = arg2;
        this.field395 = arg8;
        this.field369 = arg7;
        this.field378 = arg0;
        int var11 = 33 / ((-arg5 - 33) / 34);
        field366++;
        this.field401 = arg6;
        this.field368 = arg3;
        this.field379 = arg1;
        int var12 = (this.field379 + this.field386 + this.field368) / 3 + this.field398.field2581;
        int var13 = (this.field399 + this.field378 + this.field401) / 3 + this.field398.field2588;
        int var14 = (this.field404 + this.field369 + this.field395) / 3 + this.field398.field2577;
        if (this.field367 != var13 || this.field370 != var12 || this.field374 != var14) {
            this.field374 = var14;
            this.field383 = true;
            this.field370 = var12;
            this.field367 = var13;
        }
    }
}
