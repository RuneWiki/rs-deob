import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class245 extends class12 {

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "Z")
    private boolean field3322 = false;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    private int field3326 = 0;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "Z")
    public boolean field3328 = false;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "Lpl;")
    public class389 field3323;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "J")
    private long field3315;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "Lnr;")
    public class35 field3325;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "Lqr;")
    public class41 field3318;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "Lbn;")
    public class257 field3313;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3321 = "green:";

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "[I")
    public static int[] field3332 = new int[2];

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    public static int field3329 = 0;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public int field3300;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public int field3301;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public int field3302;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    private int field3303;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    private int field3305;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    private int field3306;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    private int field3307;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    private int field3308;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    private int field3309;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    private int field3310;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    private int field3311;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    private int field3317;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    private int field3319;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    private int field3324;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    private int field3327;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    private int field3330;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    private int field3331;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    private int field3333;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    private int field3334;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V", line = 7)
    public static void method1545(int arg0) {
        field3321 = null;
        if (arg0 != 65535) {
            field3329 = -34;
        }
        field3332 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IJ)V", line = 20)
    public final void method1546(int arg0, long arg1) {
        if (arg0 == -25502) {
            field3320++;
            for (class258 var4 = (class258) this.field3313.method1604((byte) 51); var4 != null; var4 = (class258) this.field3313.method1612(-1)) {
                var4.method1614(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(JILen;IZ)V", line = 51)
    public final void method1547(long arg0, int arg1, class174 arg2, int arg3, boolean arg4) {
        field3316++;
        if (this.field3328) {
            arg4 = false;
        } else if (this.field3318.field460 > class257.field3507) {
            arg4 = false;
        } else if (class152.field2132 > class290.field4154[class257.field3507]) {
            arg4 = false;
        } else if (this.field3322) {
            arg4 = false;
        } else if (this.field3318.field443 != -1) {
            int var7 = (int) (arg0 - this.field3315);
            if (this.field3318.field491 || var7 <= this.field3318.field443) {
                var7 %= this.field3318.field443;
            } else {
                arg4 = false;
            }
            if (!this.field3318.field486 && this.field3318.field458 > var7) {
                arg4 = false;
            }
            if (this.field3318.field486 && var7 >= this.field3318.field458) {
                arg4 = false;
            }
        }
        if (arg4) {
            this.field3326 += (int) ((double) arg3 * ((double) this.field3318.field462 + Math.random() * (double) (this.field3318.field454 - this.field3318.field462)));
            if (this.field3326 > 63) {
                int var8 = this.field3326 >> 6;
                this.field3326 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field3318.field476 <= 0 && this.field3318.field445 <= 0) {
                        var10 = this.field3319;
                        var11 = this.field3327;
                        var12 = this.field3303;
                    } else {
                        int var13 = this.field3306 + ((int) ((double) this.field3311 * Math.random()));
                        int var14 = var13 & 0x3FFF;
                        int var15 = class286.field4025[var14];
                        int var16 = class286.field4035[var14];
                        int var17 = this.field3308 + ((int) (Math.random() * (double) this.field3317));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class286.field4025[var18];
                        int var20 = class286.field4035[var18];
                        var10 = var16 * var19 >> 15;
                        var11 = var15 * var19 >> 15;
                        var12 = var20 * -1;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if (var21 + var22 > 65535) {
                        var22 = 65535 - var22;
                        var21 = 65535 - var21;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field3310 * var21 + this.field3334 * var23 + this.field3331 * var22 >> 16;
                    int var25 = this.field3333 * var23 + this.field3309 * var22 + this.field3307 * var21 >> 16;
                    int var26 = this.field3330 * var23 + this.field3324 * var22 + this.field3305 * var21 >> 16;
                    int var27 = this.field3318.field507 + (int) (Math.random() * (double) (this.field3318.field479 - this.field3318.field507));
                    int var28 = (int) ((double) (this.field3318.field504 - this.field3318.field446) * Math.random()) + this.field3318.field446;
                    int var29 = this.field3318.field489 + ((int) (Math.random() * (double) (this.field3318.field453 - this.field3318.field489)));
                    int var30;
                    if (this.field3318.field473) {
                        double var31 = Math.random();
                        var30 = (int) ((double) this.field3318.field494 * var31 + (double) this.field3318.field448) | (int) ((double) this.field3318.field506 * var31 + (double) this.field3318.field483) << 8 | (int) ((double) this.field3318.field500 * var31 + (double) this.field3318.field451) << 16 | (int) ((double) this.field3318.field505 * var31 + (double) this.field3318.field442) << 24;
                    } else {
                        var30 = (int) ((double) this.field3318.field442 + (double) this.field3318.field505 * Math.random()) << 24 | (int) ((double) this.field3318.field500 * Math.random() + (double) this.field3318.field451) << 16 | (int) ((double) this.field3318.field483 + Math.random() * (double) this.field3318.field506) << 8 | (int) (Math.random() * (double) this.field3318.field494 + (double) this.field3318.field448);
                    }
                    int var33 = this.field3318.field488;
                    if (!arg2.method974() && !this.field3318.field502) {
                        var33 = -1;
                    }
                    if (class437.field6412 == class404.field5892) {
                        new class258(this, var24, var25, var26, var10, var12, var11, var27, var28, var30, var29, var33, this.field3318.field493);
                    } else {
                        class258 var34 = class402.field5866[class437.field6412];
                        class437.field6412 = class437.field6412 + 1 & 0x3FF;
                        var34.method1616(this, var24, var25, var26, var10, var12, var11, var27, var28, var30, var29, var33, this.field3318.field493);
                    }
                }
            }
        }
        this.field3304 = 0;
        if (arg1 != -24012) {
            return;
        }
        for (class258 var36 = (class258) this.field3313.method1604((byte) -69); var36 != null; var36 = (class258) this.field3313.method1612(-1)) {
            var36.method1615(arg0, arg3);
            this.field3304++;
        }
        class101.field1143 += this.field3304;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)I", line = 214)
    public static final int method1548(boolean arg0) {
        field3298++;
        return arg0 ? -23 : 6;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 226)
    public final void method1549(byte arg0) {
        field3312++;
        this.field3324 = this.field3325.field348;
        this.field3334 = this.field3325.field347;
        this.field3330 = this.field3325.field338;
        this.field3305 = this.field3325.field354;
        this.field3331 = this.field3325.field346;
        this.field3307 = this.field3325.field343;
        this.field3309 = this.field3325.field349;
        this.field3333 = this.field3325.field355;
        this.field3310 = this.field3325.field356;
        if (this.field3331 == this.field3310 && this.field3334 == this.field3331 && this.field3309 == this.field3307 && this.field3333 == this.field3309 && this.field3324 == this.field3305 && this.field3330 == this.field3324) {
            this.field3322 = true;
            return;
        }
        this.field3322 = false;
        if (arg0 < 125) {
            this.method1549((byte) -16);
        }
        int var2 = (this.field3331 + this.field3310 + this.field3334) / 3;
        int var3 = (this.field3333 + this.field3307 + this.field3309) / 3;
        int var4 = (this.field3324 + this.field3305 + this.field3330) / 3;
        if (this.field3302 == var2 && this.field3300 == var3 && this.field3301 == var4) {
            return;
        }
        this.field3300 = var3;
        this.field3301 = var4;
        this.field3302 = var2;
        int var5 = this.field3331 - this.field3310;
        int var6 = this.field3309 - this.field3307;
        int var7 = this.field3324 - this.field3305;
        int var8 = this.field3334 - this.field3310;
        int var9 = this.field3333 - this.field3307;
        int var10 = this.field3330 - this.field3305;
        this.field3319 = var6 * var10 - (var7 * var9);
        this.field3303 = var7 * var8 - (var5 * var10);
        this.field3327 = var5 * var9 - (var6 * var8);
        while (this.field3319 > 32767 || this.field3303 > 32767 || this.field3327 > 32767 || this.field3319 < -32767 || this.field3303 < -32767 || this.field3327 < -32767) {
            this.field3303 >>= 0x1;
            this.field3327 >>= 0x1;
            this.field3319 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field3327 * this.field3327 + (this.field3319 * this.field3319 + (this.field3303 * this.field3303))));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field3327 = this.field3327 * 32767 / var11;
        this.field3319 = this.field3319 * 32767 / var11;
        this.field3303 = this.field3303 * 32767 / var11;
        if (this.field3318.field476 <= 0 && this.field3318.field445 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field3327, (double) this.field3319) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field3303, Math.sqrt((double) (this.field3319 * this.field3319 + (this.field3327 * this.field3327)))) * 2607.5945876176133D);
        this.field3311 = this.field3318.field476 - this.field3318.field437;
        this.field3306 = var12 + this.field3318.field437 - (this.field3311 >> 1);
        this.field3317 = this.field3318.field445 - this.field3318.field447;
        this.field3308 = this.field3318.field447 + var13 - (this.field3317 >> 1);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Len;Lnr;Lpl;J)V", line = 745)
    public class245(class174 arg0, class35 arg1, class389 arg2, long arg3) {
        this.field3323 = arg2;
        this.field3315 = arg3;
        this.field3325 = arg1;
        this.field3318 = class213.method1401(-117, this.field3325.field357);
        if (!arg0.method974() && this.field3318.field478 != -1) {
            this.field3318 = class213.method1401(92, this.field3318.field478);
        }
        this.field3313 = new class257();
        this.field3326 = (int) ((double) this.field3326 + Math.random() * 64.0D);
        this.method1549((byte) 126);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILjf;I)V", line = 341)
    public static final void method1550(int arg0, int arg1, class119 arg2, int arg3) {
        if (arg2.field1521 == 1) {
            class239.field3247++;
            class70.method411(29, arg2.field1511, "", -1, 0, 0, arg2.field1424, 0L);
        }
        field3314++;
        if (arg2.field1521 == 2 && !class271.field3842) {
            String var4 = class181.method1176(arg2, 0);
            if (var4 != null) {
                class70.method411(8, var4, "<col=00ff00>" + arg2.field1476, -1, 0, -1, arg2.field1424, 0L);
                class383.field5616++;
            }
        }
        if (arg2.field1521 == 3) {
            class70.method411(28, class213.field2916, "", -1, 0, 0, arg2.field1424, 0L);
            class143.field2017++;
        }
        if (arg2.field1521 == 4) {
            class70.method411(30, arg2.field1511, "", -1, 0, 0, arg2.field1424, 0L);
            class421.field6051++;
        }
        if (arg2.field1521 == 5) {
            class121.field1611++;
            class70.method411(37, arg2.field1511, "", -1, 0, 0, arg2.field1424, 0L);
        }
        if (arg2.field1521 == 6 && class344.field5061 == null) {
            class70.method411(20, arg2.field1511, "", -1, 0, -1, arg2.field1424, 0L);
            class385.field5639++;
        }
        if (arg3 != -557) {
            return;
        }
        if (arg2.field1535 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field1458; var6++) {
                for (int var7 = 0; var7 < arg2.field1461; var7++) {
                    int var8 = (arg2.field1445 + 32) * var7;
                    int var9 = (arg2.field1421 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field1479[var5];
                        var9 += arg2.field1573[var5];
                    }
                    if (var8 <= arg1 && var9 <= arg0 && arg1 < var8 + 32 && arg0 < (var9 + 32)) {
                        class66.field753 = arg2;
                        class385.field5637 = var5;
                        if (arg2.field1580[var5] > 0) {
                            class3 var10 = client.method1076(arg2);
                            class260 var11 = class392.method2498(arg2.field1580[var5] - 1, -112);
                            if (class423.field6070 == 1 && var10.method24(true)) {
                                if (class3.field49 != arg2.field1424 || class373.field5443 != var5) {
                                    class70.field798++;
                                    class70.method411(47, class179.field2467, class318.field4526 + " -> <col=ff9040>" + var11.field3527, class423.field6069, 0, var5, arg2.field1424, (long) var11.field3519);
                                }
                            } else if (class271.field3842 && var10.method24(true)) {
                                class176 var12 = class43.field535 == -1 ? null : class349.method2223(false, class43.field535);
                                if ((class289.field4103 & 0x10) != 0 && (var12 == null || var11.method1620(class43.field535, 16, var12.field2451) != var12.field2451)) {
                                    class276.field3888++;
                                    class70.method411(60, class110.field1275, class75.field825 + " -> <col=ff9040>" + var11.field3527, class338.field5007, 0, var5, arg2.field1424, (long) var11.field3519);
                                }
                            } else {
                                String[] var13 = var11.field3593;
                                if (var10.method24(true)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            int var15 = -1;
                                            byte var16;
                                            if (var14 == 3) {
                                                var16 = 49;
                                            } else {
                                                var16 = 44;
                                            }
                                            if (var11.field3596 == var14) {
                                                var15 = var11.field3543;
                                            }
                                            if (var11.field3548 == var14) {
                                                var15 = var11.field3567;
                                            }
                                            class70.method411(var16, var13[var14], "<col=ff9040>" + var11.field3527, var15, 0, var5, arg2.field1424, (long) var11.field3519);
                                            class122.field1627++;
                                        }
                                    }
                                }
                                if (var10.method25((byte) 39)) {
                                    class306.field4384++;
                                    class70.method411(41, class179.field2467, "<col=ff9040>" + var11.field3527, class423.field6069, arg3 + 557, var5, arg2.field1424, (long) var11.field3519);
                                }
                                if (var10.method24(true) && var13 != null) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        if (var13[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 26;
                                            }
                                            int var19 = -1;
                                            if (var17 == 1) {
                                                var18 = 34;
                                            }
                                            if (var11.field3596 == var17) {
                                                var19 = var11.field3543;
                                            }
                                            if (var17 == 2) {
                                                var18 = 22;
                                            }
                                            if (var11.field3548 == var17) {
                                                var19 = var11.field3567;
                                            }
                                            class70.method411(var18, var13[var17], "<col=ff9040>" + var11.field3527, var19, 0, var5, arg2.field1424, (long) var11.field3519);
                                            class101.field1146++;
                                        }
                                    }
                                }
                                String[] var20 = arg2.field1515;
                                if (var20 != null) {
                                    for (int var21 = 4; var21 >= 0; var21--) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            int var23 = -1;
                                            if (var21 == 0) {
                                                var22 = 23;
                                            }
                                            if (var21 == 1) {
                                                var22 = 2;
                                            }
                                            if (var21 == 2) {
                                                var22 = 19;
                                            }
                                            if (var21 == 3) {
                                                var22 = 11;
                                            }
                                            if (var11.field3596 == var21) {
                                                var23 = var11.field3543;
                                            }
                                            if (var21 == 4) {
                                                var22 = 57;
                                            }
                                            if (var11.field3548 == var21) {
                                                var23 = var11.field3567;
                                            }
                                            class70.method411(var22, var20[var21], "<col=ff9040>" + var11.field3527, var23, 0, var5, arg2.field1424, (long) var11.field3519);
                                            class112.field1292++;
                                        }
                                    }
                                }
                                class78.field875++;
                                class70.method411(1012, class291.field4175, "<col=ff9040>" + var11.field3527, class438.field6424, arg3 ^ 0xFFFFFDD3, var5, arg2.field1424, (long) var11.field3519);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field1475) {
            return;
        }
        if (class271.field3842) {
            if (!client.method1076(arg2).method29(128) || (class289.field4103 & 0x20) == 0) {
                return;
            }
            class331.field4722++;
            class70.method411(5, class110.field1275, class75.field825 + " -> " + arg2.field1488, class338.field5007, arg3 ^ 0xFFFFFDD3, arg2.field1495, arg2.field1424, 0L);
            return;
        }
        for (int var24 = 9; var24 >= 5; var24--) {
            String var28 = class114.method627(var24, arg2, -102);
            if (var28 != null) {
                class236.field3207++;
                class70.method411(1004, var28, arg2.field1488, class8.method77(var24, arg2, true), 0, arg2.field1495, arg2.field1424, (long) (var24 + 1));
            }
        }
        String var25 = class181.method1176(arg2, 0);
        if (var25 != null) {
            class70.method411(8, var25, arg2.field1488, -1, 0, arg2.field1495, arg2.field1424, 0L);
            class383.field5616++;
        }
        for (int var26 = 4; var26 >= 0; var26--) {
            String var27 = class114.method627(var26, arg2, -128);
            if (var27 != null) {
                class236.field3207++;
                class70.method411(48, var27, arg2.field1488, class8.method77(var26, arg2, true), 0, arg2.field1495, arg2.field1424, (long) (var26 + 1));
            }
        }
        if (!client.method1076(arg2).method22((byte) 119)) {
            return;
        }
        if (arg2.field1528 == null) {
            class70.method411(20, class16.field166, "", -1, 0, arg2.field1495, arg2.field1424, 0L);
        } else {
            class70.method411(20, arg2.field1528, "", -1, arg3 + 557, arg2.field1495, arg2.field1424, 0L);
        }
        class385.field5639++;
        return;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([II)Ljava/lang/String;", line = 687)
    public static final String method1551(int[] arg0, int arg1) {
        if (arg1 != -1) {
            field3329 = 100;
        }
        field3299++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class142.field2000;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class376 var5 = class256.method1602(true, arg0[var4]);
            if (var5.field5494 != -1) {
                class11 var6 = (class11) class410.field5935.method2049(-93, (long) var5.field5494);
                if (var6 == null) {
                    class145 var7 = class145.method854(class92.field1012, var5.field5494, 0);
                    if (var7 != null) {
                        var6 = class218.field2991.method955(var7, true);
                        class410.field5935.method2046((long) var5.field5494, 0, var6);
                    }
                }
                if (var6 != null) {
                    class37.field375[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }
}
