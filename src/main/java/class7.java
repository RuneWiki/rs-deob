import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class694 {

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    private int field64 = 2048;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    private int field66 = 5;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    private int field70 = 0;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "[B")
    private byte[] field67 = new byte[512];

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    private int field72 = 5;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    private int field65 = 1;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    private int field71 = 2;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "[S")
    private short[] field74 = new short[512];

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "Luc;")
    public static class27 field69 = new class27(5, 4);

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!il", name = "W", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!il", name = "X", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "Lpj;")
    public static class132 field68;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Loa;BLe;)V")
    public static final void method36(class638 arg0, byte arg1, class489 arg2) {
        ++field75;
        if (class148.field2178 != null) {
            if (~class160.field2400 > -11) {
                if (!class148.field2181.method946(class148.field2178.field3126, (byte) 3)) {
                    class160.field2400 = class688.field9672.method923(class148.field2178.field3126, (byte) 68) / 10;
                    return;
                }
                class368.method2165((byte) -59);
                class160.field2400 = 10;
            }
            if (~class160.field2400 == -11) {
                class148.field2206 = class148.field2178.field3111 >> 6 << 6;
                class148.field2208 = class148.field2178.field3108 >> 6 << 6;
                class148.field2213 = (class148.field2178.field3125 >> 6 << 6) + -class148.field2206 - -64;
                class148.field2209 = (class148.field2178.field3121 >> 6 << 6) + -class148.field2208 + 64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class148.field2178.method1396((class253.field3576.field514 >> 9) + class124.field1726, (byte) 81, class253.field3576.field520, var3, class511.field6989 - -(class253.field3576.field509 >> 9))) {
                    var4 = var3[1] + -class148.field2208;
                    var5 = var3[2] + -class148.field2206;
                }
                if (!class305.field4498 && ~var4 <= -1 && class148.field2209 > var4 && var5 >= 0 && class148.field2213 > var5) {
                    int var6 = var5 + (int) (Math.random() * 10.0D) + -5;
                    int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                    class306.field4504 = var7;
                    class480.field6695 = var6;
                } else if (~class192.field2831 != 0 && class359.field5140 != -1) {
                    class148.field2178.method1393(class359.field5140, var3, class192.field2831, (byte) 107);
                    if (var3 != null) {
                        class306.field4504 = var3[1] + -class148.field2208;
                        class480.field6695 = var3[2] + -class148.field2206;
                    }
                    class359.field5140 = -1;
                    class192.field2831 = -1;
                    class305.field4498 = false;
                } else {
                    class148.field2178.method1393(class148.field2178.field3123 & 16383, var3, (class148.field2178.field3123 & 268426683) >> 14, (byte) 107);
                    class306.field4504 = var3[1] - class148.field2208;
                    class480.field6695 = var3[2] - class148.field2206;
                }
                if (class148.field2178.field3109 == 37) {
                    class148.field2195 = 3.0F;
                    class148.field2194 = 3.0F;
                } else if (~class148.field2178.field3109 != -51) {
                    if (~class148.field2178.field3109 == -76) {
                        class148.field2195 = 6.0F;
                        class148.field2194 = 6.0F;
                    } else if (~class148.field2178.field3109 == -101) {
                        class148.field2195 = 8.0F;
                        class148.field2194 = 8.0F;
                    } else if (class148.field2178.field3109 != 200) {
                        class148.field2195 = 8.0F;
                        class148.field2194 = 8.0F;
                    } else {
                        class148.field2195 = 16.0F;
                        class148.field2194 = 16.0F;
                    }
                } else {
                    class148.field2195 = 4.0F;
                    class148.field2194 = 4.0F;
                }
                class148.field2187 = (int) class148.field2195 >> 1;
                class148.field2190 = class442.method2536(class148.field2187, (byte) -105);
                class299.method1863((byte) -102);
                class148.method1025();
                class154.field2325 = new class192();
                class148.field2191 += (int) (5.0D * Math.random()) + -2;
                if (~class148.field2191 > 7) {
                    class148.field2191 = -8;
                }
                if (~class148.field2191 < -9) {
                    class148.field2191 = 8;
                }
                class148.field2189 += (int) (Math.random() * 5.0D) - 2;
                if (class148.field2189 < -16) {
                    class148.field2189 = -16;
                }
                if (class148.field2189 > 16) {
                    class148.field2189 = 16;
                }
                class148.method1039(arg2, class148.field2191 >> 2 << 10, class148.field2189 >> 1);
                class148.field2180.method2867(75, 1024, 256);
                class148.field2184.method597(256, 256, (byte) -122);
                class148.field2185.method2020((byte) 47, 4096);
                class311.field4616.method1194(256, 51);
                class160.field2400 = 20;
            } else if (class160.field2400 == 20) {
                class558.method3062(-23356, true);
                class148.method1041(arg0, class148.field2191, class148.field2189);
                class160.field2400 = 60;
                class558.method3062(-23356, true);
                class456.method2629(true);
            } else {
                if (arg1 <= 110) {
                    method38((class638) null, (byte) -80);
                }
                if (class160.field2400 == 60) {
                    if (class148.field2181.method934(class148.field2178.field3126 + "_staticelements", (byte) -128)) {
                        if (!class148.field2181.method946(class148.field2178.field3126 + "_staticelements", (byte) 3)) {
                            return;
                        }
                        class148.field2188 = class175.method1201(class148.field2178.field3126 + "_staticelements", 2, class192.field2834, class148.field2181);
                    } else {
                        class148.field2188 = new class216(0);
                    }
                    class148.method1032();
                    class160.field2400 = 70;
                    class558.method3062(-23356, true);
                    class456.method2629(true);
                } else if (class160.field2400 == 70) {
                    class577.field7759 = new class616(arg0, 11, true, class105.field1413);
                    class160.field2400 = 73;
                    class558.method3062(-23356, true);
                    class456.method2629(true);
                } else if (~class160.field2400 == -74) {
                    class513.field7017 = new class616(arg0, 12, true, class105.field1413);
                    class160.field2400 = 76;
                    class558.method3062(-23356, true);
                    class456.method2629(true);
                } else if (class160.field2400 == 76) {
                    class117.field1561 = new class616(arg0, 14, true, class105.field1413);
                    class160.field2400 = 79;
                    class558.method3062(-23356, true);
                    class456.method2629(true);
                } else if (class160.field2400 == 79) {
                    class490.field6779 = new class616(arg0, 17, true, class105.field1413);
                    class160.field2400 = 82;
                    class558.method3062(-23356, true);
                    class456.method2629(true);
                } else if (~class160.field2400 == -83) {
                    class201.field2962 = new class616(arg0, 19, true, class105.field1413);
                    class160.field2400 = 85;
                    class558.method3062(-23356, true);
                    class456.method2629(true);
                } else if (~class160.field2400 == -86) {
                    class383.field5370 = new class616(arg0, 22, true, class105.field1413);
                    class160.field2400 = 88;
                    class558.method3062(-23356, true);
                    class456.method2629(true);
                } else if (class160.field2400 == 88) {
                    class44.field664 = new class616(arg0, 26, true, class105.field1413);
                    class160.field2400 = 91;
                    class558.method3062(-23356, true);
                    class456.method2629(true);
                } else {
                    class186.field2755 = new class616(arg0, 30, true, class105.field1413);
                    class160.field2400 = 100;
                    class558.method3062(-23356, true);
                    class456.method2629(true);
                    System.gc();
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field66 = arg1.method718(89);
                                }
                            } else {
                                this.field72 = arg1.method718(-89);
                            }
                        } else {
                            this.field65 = arg1.method718(82);
                        }
                    } else {
                        this.field71 = arg1.method718(-101);
                    }
                } else {
                    this.field64 = arg1.method743((byte) -69);
                }
            } else {
                this.field70 = arg1.method718(-83);
            }
        } else {
            this.field72 = this.field66 = arg1.method718(-68);
        }
        int var5 = -119 % ((arg2 - 58) / 63);
        ++field60;
    }

    @OriginalMember(owner = "client!il", name = "i", descriptor = "(I)V")
    public static void method37(int arg0) {
        field68 = null;
        field69 = null;
        if (arg0 != 8) {
            method38((class638) null, (byte) 9);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Loa;B)V")
    public static final void method38(class638 arg0, byte arg1) {
        ++field73;
        int var2 = class113.field1532;
        int var3 = class174.field2605;
        int var4 = class364.field5200;
        int var5 = class371.field5287;
        int var6 = -10660793;
        arg0.method3558((byte) 57, var3, var6, var4, var5, var2);
        arg0.method3558((byte) 73, var3 - -1, -16777216, var4 + -2, 16, var2 + 1);
        arg0.method3562(-16777216, 1, var5 - 19, var2 + 1, var3 + 18, var4 + -2);
        class548.field7419.method1307(var3 + 14, (byte) 126, -1, var6, class9.field158.method42(class666.field9377, 19572), var2 + 3);
        int var7 = -86 % ((arg1 - -69) / 38);
        int var8 = class46.field686.method70((byte) -80);
        int var9 = class46.field686.method66(74);
        int var10 = 0;
        for (class345 var11 = (class345) class487.field6761.method1270((byte) -25); var11 != null; var11 = (class345) class487.field6761.method1282(0)) {
            int var12 = (-var10 + class315.field4697 - 1) * 16 + (var3 - -31);
            short var13 = -1;
            if (var2 < var8 && ~var8 > ~(var2 + var4) && ~(var12 + -13) > ~var9 && var9 < var12 - -3 && var11.field4989) {
                var13 = -256;
            }
            int[] var14 = null;
            if (class375.method2187(var11.field4983, false)) {
                var14 = class648.field9184.method3064((int) var11.field4979, -16).field3610;
            } else if (~var11.field4980 != 0) {
                var14 = class648.field9184.method3064(var11.field4980, -4).field3610;
            } else if (!class287.method1729(var11.field4983, (byte) 17)) {
                if (class471.method2680(var11.field4983, -14)) {
                    Object var15 = null;
                    class620 var16;
                    if (~var11.field4983 != -1008) {
                        var16 = class164.field2499.method2013((int) (2147483647L & var11.field4979 >>> 32), false);
                    } else {
                        var16 = class164.field2499.method2013((int) var11.field4979, false);
                    }
                    if (var16.field8623 != null) {
                        var16 = var16.method3450(-116, class195.field2888);
                    }
                    if (var16 != null) {
                        var14 = var16.field8572;
                    }
                }
            } else {
                class178 var17 = (class178) class323.field4762.method2061(-17305, (long) ((int) var11.field4979));
                if (var17 != null) {
                    class225 var18 = var17.field2634;
                    class161 var19 = var18.field3245;
                    if (var19.field2409 != null) {
                        var19 = var19.method1114(class195.field2888, 0);
                    }
                    if (var19 != null) {
                        var14 = var19.field2429;
                    }
                }
            }
            String var20 = class172.method1183(var11, 0);
            if (var14 != null) {
                var20 = var20 + class366.method2140(4, var14);
            }
            class548.field7419.method1311(var13, var20, class124.field1721, 0, var12, var2 - -3, class206.field3038, 0);
            ++var10;
            if (var11.field4984) {
                class545.field7386.method2660(var2 + (5 - -class432.field6119.method3314(var20, -78)), var12 + -12);
            }
        }
        class228.method1455(class174.field2605, class364.field5200, class113.field1532, -28440, class371.field5287);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class7() {
        super(0, true);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        if (arg0 <= 112) {
            this.field65 = 85;
        }
        ++field62;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            int var4 = class105.field1409[arg1] * this.field66 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class465.field6544 < ~var7; ++var7) {
                class514.field7023 = Integer.MAX_VALUE;
                class299.field4462 = Integer.MAX_VALUE;
                class132.field1860 = Integer.MAX_VALUE;
                class515.field7037 = Integer.MAX_VALUE;
                int var8 = class346.field4994[var7] * this.field72 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field67[255 & (~var11 > ~this.field66 ? var11 : -this.field66 + var11)] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (this.field67[(~var14 <= ~this.field72 ? -this.field72 + var14 : var14) + var13 & 255] & 255);
                        int var27 = var15 + 1;
                        int var16 = var8 + (-this.field74[var15] - (var14 << 12));
                        int var17 = -this.field74[var27] + var4 + -(var11 << 12);
                        int var18 = this.field65;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = var26 >= var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (~var19 <= ~class515.field7037) {
                            if (~var19 <= ~class132.field1860) {
                                if (var19 >= class299.field4462) {
                                    if (var19 < class514.field7023) {
                                        class514.field7023 = var19;
                                    }
                                } else {
                                    class514.field7023 = class299.field4462;
                                    class299.field4462 = var19;
                                }
                            } else {
                                class514.field7023 = class299.field4462;
                                class299.field4462 = class132.field1860;
                                class132.field1860 = var19;
                            }
                        } else {
                            class514.field7023 = class299.field4462;
                            class299.field4462 = class132.field1860;
                            class132.field1860 = class515.field7037;
                            class515.field7037 = var19;
                        }
                    }
                }
                int var12 = this.field71;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = class132.field1860 - class515.field7037;
                                }
                            } else {
                                var3[var7] = class514.field7023;
                            }
                        } else {
                            var3[var7] = class299.field4462;
                        }
                    } else {
                        var3[var7] = class132.field1860;
                    }
                } else {
                    var3[var7] = class515.field7037;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "g", descriptor = "(I)V")
    public final void method40(int arg0) {
        if (arg0 < 5) {
            this.field65 = -42;
        }
        this.field67 = class356.method2110(this.field70, -98);
        ++field63;
        this.method41(-1);
    }

    @OriginalMember(owner = "client!il", name = "j", descriptor = "(I)V")
    private final void method41(int arg0) {
        ++field61;
        Random var2 = new Random((long) this.field70);
        this.field74 = new short[512];
        if (arg0 > ~this.field64) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field74[var3] = (short) class433.method2492((byte) 0, var2, this.field64);
            }
        }
    }
}
