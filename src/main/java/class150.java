import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class150 extends class404 {

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    private int field2409 = 0;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    private int field2412 = 2000;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    private int field2416 = 4096;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    private int field2417 = 0;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    private int field2420 = 16;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "[I")
    public static int[] field2418;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "[Lmj;")
    public static class447[] field2421;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "Z")
    public static boolean field2424;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "[Lrn;")
    public static class168[] field2419;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILha;I)V")
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field2408;
        if (arg0 != 0) {
            method974(true, (class227) null);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            this.field2416 = arg1.method254((byte) -123);
                        }
                    } else {
                        this.field2417 = arg1.method254((byte) -42);
                    }
                } else {
                    this.field2420 = arg1.method257((byte) 107);
                }
            } else {
                this.field2412 = arg1.method254((byte) -94);
            }
        } else {
            this.field2409 = arg1.method257((byte) 74);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLkm;)V")
    public static final void method974(boolean arg0, class227 arg1) {
        if (arg0) {
            method976((String) null, 38, (String) null, 87, (String) null, (byte) 54);
        }
        arg1.field3475 = null;
        ++field2411;
        int var2 = arg1.field3476.length;
        for (int var3 = 0; var2 > var3; ++var3) {
            arg1.field3476[var3].field5122 = false;
        }
        class215[] var4 = class377.field5499;
        synchronized (class377.field5499) {
            if (var2 < class377.field5499.length && class220.field3391[var2] < 200) {
                class377.field5499[var2].method1321((byte) 0, arg1);
                int var10002 = class220.field3391[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field2423;
        if (arg0 >= -47) {
            field2424 = false;
        }
        int[] var3 = super.field5870.method372(arg1, (byte) -118);
        if (super.field5870.field810) {
            int var4 = this.field2416 >> 1;
            int[][] var5 = super.field5870.method371(0);
            Random var6 = new Random((long) this.field2409);
            for (int var7 = 0; ~this.field2412 < ~var7; ++var7) {
                int var8 = this.field2416 > 0 ? this.field2417 - (var4 + -class482.method2911((byte) 45, this.field2416, var6)) : this.field2417;
                int var9 = var8 >> 4 & 255;
                int var10 = class482.method2911((byte) 45, class431.field6348, var6);
                int var11 = class482.method2911((byte) 45, class437.field6437, var6);
                int var12 = var10 - -(class251.field3841[var9] * this.field2420 >> 12);
                int var13 = (class486.field7407[var9] * this.field2420 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class482.method2911((byte) 45, 4096, var6) >> 2);
                    int var27 = var13 <= var11 ? -1 : 1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + 1024 + var26;
                        int var30 = var28 & class98.field1757;
                        int var31 = var21 & class435.field6374;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var24 < -1) {
                            var24 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public final void method211(int arg0) {
        if (arg0 == -3) {
            ++field2415;
            class331.method2053(false);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lvl;Lqq;I)V")
    public static final void method975(class11 arg0, class318 arg1, int arg2) {
        ++field2413;
        if (class492.field7467 != null) {
            if (class460.field7088 < 10) {
                if (!class492.field7470.method2710(class492.field7467.field1268, -123)) {
                    class460.field7088 = class232.field3524.method2709(1, class492.field7467.field1268) / 10;
                    return;
                }
                class143.method942(0);
                class460.field7088 = 10;
            }
            if (arg2 > -124) {
                field2422 = 8;
            }
            if (~class460.field7088 == -11) {
                class492.field7494 = class492.field7467.field1285 >> 6 << 6;
                class492.field7497 = class492.field7467.field1276 >> 6 << 6;
                class492.field7500 = (class492.field7467.field1284 >> 6 << 6) + -class492.field7497 + 64;
                class492.field7485 = (class492.field7467.field1270 >> 6 << 6) + (-class492.field7494 - -64);
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class492.field7467.method530((class286.field4329.field3218 >> 7) + class381.field5550, (byte) -90, (class286.field4329.field3222 >> 7) + class320.field4827, var3, class286.field4329.field3217)) {
                    var5 = var3[2] + -class492.field7494;
                    var4 = var3[1] - class492.field7497;
                }
                if (!class247.field3774 && var4 >= 0 && ~class492.field7500 < ~var4 && var5 >= 0 && ~var5 > ~class492.field7485) {
                    int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                    int var7 = var4 + -5 + (int) (Math.random() * 10.0D);
                    class264.field3989 = var6;
                    class466.field7158 = var7;
                } else if (~class23.field292 != 0 && class165.field2570 != -1) {
                    class492.field7467.method531(var3, class23.field292, 6734, class165.field2570);
                    class247.field3774 = false;
                    if (var3 != null) {
                        class264.field3989 = var3[2] - class492.field7494;
                        class466.field7158 = var3[1] + -class492.field7497;
                    }
                    class165.field2570 = -1;
                    class23.field292 = -1;
                } else {
                    class492.field7467.method531(var3, (268429046 & class492.field7467.field1286) >> 14, 6734, class492.field7467.field1286 & 16383);
                    class264.field3989 = var3[2] + -class492.field7494;
                    class466.field7158 = var3[1] + -class492.field7497;
                }
                if (class492.field7467.field1288 != 37) {
                    if (class492.field7467.field1288 != 50) {
                        if (~class492.field7467.field1288 == -76) {
                            class492.field7480 = 6.0F;
                            class492.field7478 = 6.0F;
                        } else if (class492.field7467.field1288 == 100) {
                            class492.field7480 = 8.0F;
                            class492.field7478 = 8.0F;
                        } else if (class492.field7467.field1288 == 200) {
                            class492.field7480 = 16.0F;
                            class492.field7478 = 16.0F;
                        } else {
                            class492.field7480 = 8.0F;
                            class492.field7478 = 8.0F;
                        }
                    } else {
                        class492.field7480 = 4.0F;
                        class492.field7478 = 4.0F;
                    }
                } else {
                    class492.field7480 = 3.0F;
                    class492.field7478 = 3.0F;
                }
                class492.field7481 = (int) class492.field7480 >> 1;
                class492.field7473 = class115.method826(-1, class492.field7481);
                class419.method2454((byte) 122);
                class492.method2968();
                class177.field2772 = new class4();
                class492.field7482 += -2 + (int) (5.0D * Math.random());
                if (class492.field7482 < -8) {
                    class492.field7482 = -8;
                }
                if (~class492.field7482 < -9) {
                    class492.field7482 = 8;
                }
                class492.field7479 += -2 + (int) (5.0D * Math.random());
                if (class492.field7479 < -16) {
                    class492.field7479 = -16;
                }
                if (class492.field7479 > 16) {
                    class492.field7479 = 16;
                }
                class492.method2973(arg0, class492.field7482 >> 2 << 10, class492.field7479 >> 1);
                class492.field7472.method1848(256, -65, 1024);
                class492.field7471.method1032(14379, 256, 256);
                class492.field7464.method922(4096, -117);
                class117.field1962.method1383(256, -337);
                class460.field7088 = 20;
            } else if (class460.field7088 == 20) {
                class377.method2269(true, true);
                class492.method2959(arg1, class492.field7482, class492.field7479);
                class460.field7088 = 60;
                class377.method2269(true, true);
                class469.method2831(-17186);
            } else if (class460.field7088 == 60) {
                if (class492.field7470.method2725(-26362, class492.field7467.field1268 + "_staticelements")) {
                    if (!class492.field7470.method2710(class492.field7467.field1268 + "_staticelements", -101)) {
                        return;
                    }
                    class492.field7474 = class460.method2752(true, class73.field1313, class492.field7467.field1268 + "_staticelements", class492.field7470);
                } else {
                    class492.field7474 = new class230(0);
                }
                class492.method2976();
                class460.field7088 = 70;
                class377.method2269(true, true);
                class469.method2831(-17186);
            } else if (class460.field7088 == 70) {
                class369.field5428 = new class235(arg1, 11, true, class257.field3919);
                class460.field7088 = 73;
                class377.method2269(true, true);
                class469.method2831(-17186);
            } else if (class460.field7088 == 73) {
                class222.field3426 = new class235(arg1, 12, true, class257.field3919);
                class460.field7088 = 76;
                class377.method2269(true, true);
                class469.method2831(-17186);
            } else if (class460.field7088 == 76) {
                class7.field87 = new class235(arg1, 14, true, class257.field3919);
                class460.field7088 = 79;
                class377.method2269(true, true);
                class469.method2831(-17186);
            } else if (~class460.field7088 == -80) {
                class410.field5951 = new class235(arg1, 17, true, class257.field3919);
                class460.field7088 = 82;
                class377.method2269(true, true);
                class469.method2831(-17186);
            } else if (class460.field7088 == 82) {
                class433.field6361 = new class235(arg1, 19, true, class257.field3919);
                class460.field7088 = 85;
                class377.method2269(true, true);
                class469.method2831(-17186);
            } else if (~class460.field7088 == -86) {
                class291.field4413 = new class235(arg1, 22, true, class257.field3919);
                class460.field7088 = 88;
                class377.method2269(true, true);
                class469.method2831(-17186);
            } else if (class460.field7088 == 88) {
                class142.field2312 = new class235(arg1, 26, true, class257.field3919);
                class460.field7088 = 91;
                class377.method2269(true, true);
                class469.method2831(-17186);
            } else {
                class119.field1976 = new class235(arg1, 30, true, class257.field3919);
                class460.field7088 = 100;
                class377.method2269(true, true);
                class469.method2831(-17186);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;B)V")
    public static final void method976(String arg0, int arg1, String arg2, int arg3, String arg4, byte arg5) {
        ++field2410;
        class96.method733(arg0, (byte) -4, -1, (String) null, arg2, arg3, arg1, arg4);
        if (arg5 != -113) {
            field2421 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class150() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "(I)V")
    public static void method977(int arg0) {
        field2419 = null;
        if (arg0 == 99) {
            field2418 = null;
            field2421 = null;
        }
    }

    static {
        new class423(" days.", " Tage.", " jours.", " dias.");
        field2418 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };
        field2421 = new class447[16];
        field2422 = 104;
        field2424 = false;
    }
}
