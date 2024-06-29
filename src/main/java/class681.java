import jaggl.OpenGL;
import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class681 extends class682 {

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Lpr;")
    private class445 field9634;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Lpi;")
    private class496 field9632;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "[F")
    private float[] field9629;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "J")
    public static long field9637 = -1L;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "[Ljava/awt/Color;")
    public static Color[] field9644 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "Z")
    public static volatile boolean field9645 = false;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "Ldh;")
    public static class320 field9646 = new class320(63, 0);

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "F")
    private float field9643;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field9630;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field9633;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field9638;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    private int field9640;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field9641;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Lqha;")
    private class102 field9627;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBI)V")
    public final void method289(int arg0, byte arg1, int arg2) {
        ++field9633;
        if (this.field9627 != null) {
            super.field9647.method2545(32886, 1);
            if (~(128 & arg0) == -1) {
                if (~(1 & arg2) != -2) {
                    if (!this.field9634.field6443) {
                        super.field9647.method2621(-2, this.field9634.field6444[0]);
                    } else {
                        super.field9647.method2621(-2, this.field9634.field6452);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (!this.field9634.field6443) {
                    int var4 = super.field9647.field5919 % 4000 * 16 / 4000;
                    super.field9647.method2621(-2, this.field9634.field6444[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    super.field9647.method2621(-2, this.field9634.field6452);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field9643, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field9647.method2621(-2, (class292) null);
            }
            super.field9647.method2545(32886, 0);
            if (~(arg0 & 64) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                class520.field7397[0] = super.field9647.field6058 * super.field9647.field5969;
                class520.field7397[1] = super.field9647.field6058 * super.field9647.field6050;
                class520.field7397[2] = super.field9647.field6058 * super.field9647.field5974;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class520.field7397, 0);
            }
            int var5 = arg0 & 3;
            if (~var5 != -3) {
                if (var5 == 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                }
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
            if (arg1 <= 72) {
                this.method288(-96);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V")
    public final void method287(int arg0, boolean arg1) {
        ++field9631;
        if (arg0 <= 111) {
            this.field9632 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)I")
    public static final int method3859(int arg0) {
        if (arg0 != -51) {
            field9646 = null;
        }
        ++field9636;
        return class504.field7173++;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)I")
    public static final int method3860(int arg0) {
        ++field9641;
        if (arg0 != 1) {
            field9644 = null;
        }
        return class139.field1564;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BZ)V")
    public final void method285(byte arg0, boolean arg1) {
        ++field9628;
        if (this.field9627 != null) {
            this.field9627.method712('\u0000', 1);
            if (arg0 != 52) {
                this.method288(-78);
            }
            super.field9647.method2545(32886, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field9647.field5951.method3579(78), 0);
            OpenGL.glMatrixMode(5888);
            super.field9647.method2545(32886, 0);
            if (super.field9647.field5919 != this.field9640) {
                int var3 = super.field9647.field5919 % 5000 * 128 / 5000;
                for (int var4 = 0; var4 < 64; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field9629, var3);
                    var3 += 2;
                }
                if (this.field9634.field6443) {
                    this.field9643 = (float) (super.field9647.field5919 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field9640 = super.field9647.field5919;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static final void method3861(byte arg0) {
        if (~class122.field1276 < -2) {
            --class122.field1276;
            class187.field2223 = class514.field7334;
        }
        ++field9626;
        if (class236.field2809) {
            class236.field2809 = false;
            class94.method633(-126);
        } else {
            if (!class149.field1652) {
                class228.method1321(arg0 + -127);
            }
            for (int var1 = 0; var1 < 100 && class123.method790(0); ++var1) {
            }
            if (~class392.field5397 == -11) {
                while (class380.method2337(arg0 + -169)) {
                    class249 var2 = class289.method1715(class710.field10000, 114, class41.field470);
                    var2.field3016.method1460(0, arg0 + 24654);
                    int var3 = var2.field3016.field2903;
                    class477.method2863(var2.field3016, -126);
                    var2.field3016.method1434(111, -var3 + var2.field3016.field2903);
                    class510.method3017(var2, 116);
                }
                if (class230.field2690 != null) {
                    if (class230.field2690.field7005 != -1) {
                        class249 var4 = class289.method1715(class391.field5394, 88, class41.field470);
                        var4.field3016.method1446(class230.field2690.field7005, true);
                        class510.method3017(var4, 122);
                        class230.field2690 = null;
                        class99.field1036 = 30000L + class652.method3700(-1);
                    }
                } else if (class652.method3700(-1) >= class99.field1036) {
                    class230.field2690 = class247.field3000.method4107(2, class76.field802.field6430);
                }
                class73 var5 = (class73) class578.field8170.method1719(65280);
                if (var5 != null || class672.field9537 < -2000L + class652.method3700(arg0 + -57)) {
                    class249 var6 = null;
                    int var7 = 0;
                    for (class73 var8 = (class73) class154.field1693.method1719(65280); var8 != null && (var6 == null || var6.field3016.field2903 - var7 < 240); var8 = (class73) class154.field1693.method1723(-20665)) {
                        var8.method864(12983);
                        int var9 = var8.method535((byte) -25);
                        if (~var9 > 0) {
                            var9 = -1;
                        } else if (~var9 < -65535) {
                            var9 = 65534;
                        }
                        int var10 = var8.method530(-1);
                        if (var10 < -1) {
                            var10 = -1;
                        } else if (~var10 < -65535) {
                            var10 = 65534;
                        }
                        if (~class141.field1590 != ~var10 || class315.field3954 != var9) {
                            if (var6 == null) {
                                ++class256.field3127;
                                var6 = class289.method1715(class70.field737, arg0 + 68, class41.field470);
                                var6.field3016.method1460(0, arg0 ^ 24766);
                                var7 = var6.field3016.field2903;
                            }
                            int var11 = -class141.field1590 + var10;
                            class141.field1590 = var10;
                            int var12 = -class315.field3954 + var9;
                            class315.field3954 = var9;
                            int var13 = (int) ((var8.method534(-1) - class672.field9537) / 20L);
                            if (~var13 > -9 && ~var11 <= 31 && ~var11 >= -32 && var12 >= -32 && ~var12 >= -32) {
                                var11 += 32;
                                var12 += 32;
                                var6.field3016.method1446((var13 << 12) - -(var11 << 6) + var12, true);
                            } else if (~var13 > -33 && ~var11 <= 127 && ~var11 >= -128 && var12 >= -128 && var12 <= 127) {
                                var12 += 128;
                                var11 += 128;
                                var6.field3016.method1460(var13 + 128, 24710);
                                var6.field3016.method1446((var11 << 8) + var12, true);
                            } else if (~var13 <= -33) {
                                var6.field3016.method1446(var13 + 57344, true);
                                if (~var10 != -2 && ~var9 != 0) {
                                    var6.field3016.method1421(var10 | var9 << 16, arg0 ^ -20742);
                                } else {
                                    var6.field3016.method1421(Integer.MIN_VALUE, arg0 + -20854);
                                }
                            } else {
                                var6.field3016.method1460(var13 + 192, arg0 ^ 24766);
                                if (~var10 != -2 && ~var9 != 0) {
                                    var6.field3016.method1421(var10 | var9 << 16, -20798);
                                } else {
                                    var6.field3016.method1421(Integer.MIN_VALUE, -20798);
                                }
                            }
                            class672.field9537 = var8.method534(-1);
                        }
                    }
                    if (var6 != null) {
                        var6.field3016.method1434(113, -var7 + var6.field3016.field2903);
                        class510.method3017(var6, 61);
                    }
                }
                if (var5 != null) {
                    long var14 = (var5.method534(-1) - class199.field2354) / 50L;
                    class199.field2354 = var5.method534(-1);
                    if (var14 > 32767L) {
                        var14 = 32767L;
                    }
                    int var16 = var5.method535((byte) -25);
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (~var16 < -65536) {
                        var16 = 65535;
                    }
                    int var17 = var5.method530(-1);
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 65535) {
                        var17 = 65535;
                    }
                    byte var18 = 0;
                    if (~var5.method532(86) == -3) {
                        var18 = 1;
                    }
                    ++class520.field7384;
                    int var19 = (int) var14;
                    class249 var20 = class289.method1715(class628.field9014, arg0 ^ 14, class41.field470);
                    var20.field3016.method1470((byte) -122, var18 << 15 | var19);
                    var20.field3016.method1445(var17 | var16 << 16, true);
                    class510.method3017(var20, arg0 ^ 2);
                }
                if (class757.field10550 > 0) {
                    ++class647.field9244;
                    class249 var21 = class289.method1715(class170.field1980, 106, class41.field470);
                    var21.field3016.method1460(class757.field10550 * 3, 24710);
                    for (int var22 = 0; ~class757.field10550 < ~var22; ++var22) {
                        class426 var23 = class422.field6148[var22];
                        long var24 = (var23.method2516((byte) 47) - class685.field9678) / 50L;
                        if (var24 > 65535L) {
                            var24 = 65535L;
                        }
                        class685.field9678 = var23.method2516((byte) 47);
                        var21.field3016.method1460(var23.method2517(89), 24710);
                        var21.field3016.method1446((int) var24, true);
                    }
                    class510.method3017(var21, arg0 + 29);
                }
                if (~class597.field8413 < -1) {
                    --class597.field8413;
                }
                if (class217.field2521 && class597.field8413 <= 0) {
                    class597.field8413 = 20;
                    ++class317.field4059;
                    class217.field2521 = false;
                    class249 var26 = class289.method1715(class718.field10066, 110, class41.field470);
                    var26.field3016.method1446((int) class308.field3835 >> 3, true);
                    var26.field3016.method1444(1507430696, (int) class227.field2590 >> 3);
                    class510.method3017(var26, 114);
                }
                if (class579.field8197 != class563.field8021) {
                    class563.field8021 = class579.field8197;
                    ++class660.field9418;
                    class249 var27 = class289.method1715(class538.field7772, 59, class41.field470);
                    var27.field3016.method1460(class579.field8197 ? 1 : 0, arg0 ^ 24766);
                    class510.method3017(var27, arg0 ^ 103);
                }
                if (!class361.field4632) {
                    ++class298.field3708;
                    class249 var28 = class289.method1715(class429.field6245, arg0 ^ 99, class41.field470);
                    var28.field3016.method1460(0, 24710);
                    int var29 = var28.field3016.field2903;
                    class244 var30 = class654.field9334.method3935((byte) -85);
                    var28.field3016.method1430(var30.field2903, (byte) 84, 0, var30.field2912);
                    var28.field3016.method1434(arg0 + 70, -var29 + var28.field3016.field2903);
                    class510.method3017(var28, 123);
                    class361.field4632 = true;
                }
                if (class638.field9170 != null) {
                    if (class496.field7014 != 2) {
                        if (class496.field7014 == 3) {
                            class19.method86(false);
                        }
                    } else {
                        class60.method464(71);
                    }
                }
                if (arg0 == 56) {
                    if (class465.field6642) {
                        class465.field6642 = false;
                    } else {
                        class144.field1602 /= 2.0F;
                    }
                    if (!class498.field7026) {
                        class319.field4068 /= 2.0F;
                    } else {
                        class498.field7026 = false;
                    }
                    class674.method3839(0);
                    if (class392.field5397 == 10) {
                        class135.method868(-21176);
                        class22.method99(91);
                        class716.method3997((byte) -8);
                        ++class537.field7759;
                        if (class537.field7759 > 750) {
                            class94.method633(-119);
                        } else {
                            class624.method3578((byte) 40);
                            class62.method468(0);
                            class327.method1952(false);
                            for (int var31 = class722.field10125.method4003(true, 0); ~var31 != 0; var31 = class722.field10125.method4003(false, 0)) {
                                class445.method2761(var31, (byte) -17);
                                class597.field8459[class327.method1956(class314.field3924++, 31)] = var31;
                            }
                            for (class47 var32 = class315.method1882(113); var32 != null; var32 = class315.method1882(90)) {
                                int var33 = var32.method276(arg0 + 65);
                                int var34 = var32.method275((byte) 77);
                                if (var33 != 1) {
                                    if (var33 == 2) {
                                        class615.field8823[var34] = var32.field513;
                                        class204.field2410[class327.method1956(31, class659.field9409++)] = var34;
                                    } else if (~var33 != -4) {
                                        if (~var33 == -5) {
                                            class532 var35 = class269.method1608((byte) -72, var34);
                                            int var36 = var32.field507;
                                            int var37 = var32.field514;
                                            int var38 = var32.field519;
                                            if (~var35.field7685 != ~var36 || var35.field7596 != var37 || ~var35.field7555 != ~var38) {
                                                var35.field7685 = var36;
                                                var35.field7555 = var38;
                                                var35.field7596 = var37;
                                                class11.method50(var35, (byte) -123);
                                            }
                                        } else if (~var33 != -6) {
                                            if (~var33 != -7) {
                                                if (var33 != 7) {
                                                    if (var33 != 8) {
                                                        if (var33 == 9) {
                                                            class532 var39 = class269.method1608((byte) -72, var34);
                                                            if (var32.field507 != var39.field7691 || var32.field514 != var39.field7593) {
                                                                var39.field7593 = var32.field514;
                                                                var39.field7691 = var32.field507;
                                                                class11.method50(var39, (byte) -122);
                                                            }
                                                        } else if (var33 == 10) {
                                                            class532 var40 = class269.method1608((byte) -72, var34);
                                                            if (~var32.field507 != ~var40.field7563 || ~var32.field514 != ~var40.field7607 || ~var32.field519 != ~var40.field7546) {
                                                                var40.field7607 = var32.field514;
                                                                var40.field7546 = var32.field519;
                                                                var40.field7563 = var32.field507;
                                                                class11.method50(var40, (byte) -97);
                                                            }
                                                        } else if (var33 != 11) {
                                                            if (var33 == 12) {
                                                                class532 var41 = class269.method1608((byte) -72, var34);
                                                                int var42 = var32.field507;
                                                                if (var41 != null && var41.field7543 == 0) {
                                                                    if (-var41.field7573 + var41.field7699 < var42) {
                                                                        var42 = -var41.field7573 + var41.field7699;
                                                                    }
                                                                    if (~var42 > -1) {
                                                                        var42 = 0;
                                                                    }
                                                                    if (var41.field7571 != var42) {
                                                                        var41.field7571 = var42;
                                                                        class11.method50(var41, (byte) -108);
                                                                    }
                                                                }
                                                            } else if (var33 == 14) {
                                                                class532 var43 = class269.method1608((byte) -72, var34);
                                                                var43.field7703 = var32.field507;
                                                            } else if (var33 == 15) {
                                                                class75.field796 = var32.field514;
                                                                class115.field1202 = true;
                                                                class471.field6718 = var32.field507;
                                                            } else if (~var33 != -17) {
                                                                if (~var33 == -18) {
                                                                    class532 var44 = class269.method1608((byte) -72, var34);
                                                                    var44.field7687 = var32.field507;
                                                                }
                                                            } else {
                                                                class532 var45 = class269.method1608((byte) -72, var34);
                                                                var45.field7604 = var32.field507;
                                                            }
                                                        } else {
                                                            class532 var46 = class269.method1608((byte) -72, var34);
                                                            var46.field7693 = 0;
                                                            var46.field7641 = var46.field7583 = var32.field514;
                                                            var46.field7615 = var46.field7622 = var32.field507;
                                                            var46.field7582 = 0;
                                                            class11.method50(var46, (byte) -102);
                                                        }
                                                    } else {
                                                        class532 var47 = class269.method1608((byte) -72, var34);
                                                        if (~var32.field507 != ~var47.field7594 || ~var32.field514 != ~var47.field7654 || var32.field519 != var47.field7657) {
                                                            var47.field7654 = var32.field514;
                                                            var47.field7657 = var32.field519;
                                                            var47.field7594 = var32.field507;
                                                            if (~var47.field7691 != 0) {
                                                                if (~var47.field7653 < -1) {
                                                                    var47.field7657 = var47.field7657 * 32 / var47.field7653;
                                                                } else if (~var47.field7572 < -1) {
                                                                    var47.field7657 = var47.field7657 * 32 / var47.field7572;
                                                                }
                                                            }
                                                            class11.method50(var47, (byte) -128);
                                                        }
                                                    }
                                                } else {
                                                    class532 var48 = class269.method1608((byte) -72, var34);
                                                    boolean var49 = var32.field507 == 1;
                                                    if (var48.field7648 != var49) {
                                                        var48.field7648 = var49;
                                                        class11.method50(var48, (byte) -114);
                                                    }
                                                }
                                            } else {
                                                int var50 = var32.field507;
                                                int var51 = var50 >> 10 & 31;
                                                int var52 = (var50 & 1005) >> 5;
                                                int var53 = var50 & 31;
                                                int var54 = (var51 << 19) + (var52 << 11) + (var53 << 3);
                                                class532 var55 = class269.method1608((byte) -72, var34);
                                                if (~var55.field7694 != ~var54) {
                                                    var55.field7694 = var54;
                                                    class11.method50(var55, (byte) -105);
                                                }
                                            }
                                        } else {
                                            class532 var56 = class269.method1608((byte) -72, var34);
                                            if (~var32.field507 != ~var56.field7705 || var32.field507 == -1) {
                                                var56.field7705 = var32.field507;
                                                var56.field7636 = 0;
                                                var56.field7547 = 0;
                                                var56.field7695 = 1;
                                                class25 var57 = ~var56.field7705 == 0 ? null : class637.field9158.method1905(73, var56.field7705);
                                                if (var57 != null) {
                                                    class339.method2014(var57, arg0 ^ 5295, var56.field7547);
                                                }
                                                class11.method50(var56, (byte) -112);
                                            }
                                        }
                                    } else {
                                        class532 var58 = class269.method1608((byte) -72, var34);
                                        if (!var32.field513.equals(var58.field7620)) {
                                            var58.field7620 = var32.field513;
                                            class11.method50(var58, (byte) -109);
                                        }
                                    }
                                } else {
                                    class217.field2518[var34] = var32.field507;
                                    class542.field7815 |= class417.field5905[var34];
                                    class410.field5597[class327.method1956(class176.field2068++, 31)] = var34;
                                }
                            }
                            if (class59.field614 != 0) {
                                class508.field7233 += 20;
                                if (class508.field7233 >= 400) {
                                    class59.field614 = 0;
                                }
                            }
                            ++class721.field10119;
                            if (class217.field2516 != null) {
                                ++class88.field929;
                                if (class88.field929 >= 15) {
                                    class11.method50(class217.field2516, (byte) -114);
                                    class217.field2516 = null;
                                }
                            }
                            class551.field7908 = false;
                            class354.field4540 = null;
                            class520.field7402 = null;
                            class65.field659 = false;
                            class203.method1223(-1, -1, (byte) -104, (class532) null);
                            class446.method2764((class532) null, -1, -1, 0);
                            if (!class568.field8075) {
                                class61.field627 = -1;
                            }
                            class50.method283(true);
                            ++class514.field7334;
                            if (class689.field9720) {
                                ++class134.field1519;
                                class249 var59 = class289.method1715(class107.field1137, arg0 + 2, class41.field470);
                                var59.field3016.method1465(24606, class192.field2268 << 14 | class510.field7278 << 28 | class205.field2429);
                                class510.method3017(var59, arg0 ^ 117);
                                class689.field9720 = false;
                            }
                            while (true) {
                                class622 var60;
                                class532 var61;
                                class532 var62;
                                do {
                                    var60 = (class622) class141.field1587.method1729(662);
                                    if (var60 == null) {
                                        while (true) {
                                            class622 var63;
                                            class532 var64;
                                            class532 var65;
                                            do {
                                                var63 = (class622) class76.field799.method1729(662);
                                                if (var63 == null) {
                                                    while (true) {
                                                        class622 var66;
                                                        class532 var67;
                                                        class532 var68;
                                                        do {
                                                            var66 = (class622) class518.field7374.method1729(arg0 ^ 686);
                                                            if (var66 == null) {
                                                                if (class354.field4540 == null) {
                                                                    class92.field958 = 0;
                                                                }
                                                                if (class344.field4474 != null) {
                                                                    class491.method2950(arg0 + 21);
                                                                }
                                                                if (~class58.field594 < -1 && class375.field4818.method1657(82, (byte) -40) && class375.field4818.method1657(81, (byte) -40) && ~class381.field5214 != -1) {
                                                                    int var69 = -class381.field5214 + class90.field937.field4628;
                                                                    if (~var69 <= -1) {
                                                                        if (~var69 < -4) {
                                                                            var69 = 3;
                                                                        }
                                                                    } else {
                                                                        var69 = 0;
                                                                    }
                                                                    class402.method2451(class90.field937.field7193[0] + class181.field2144, class464.field6624 - -class90.field937.field7187[0], var69, (byte) -112);
                                                                }
                                                                class330.method1974(23125);
                                                                for (int var70 = 0; ~var70 > -6; ++var70) {
                                                                    int var10002 = class745.field10407[var70]++;
                                                                }
                                                                if (class542.field7815 && ~field9637 > ~(-60000L + class652.method3700(-1))) {
                                                                    class523.method3074(false);
                                                                }
                                                                for (class38 var71 = (class38) class289.field3572.method2790(115); var71 != null; var71 = (class38) class289.field3572.method2794(arg0 ^ 6)) {
                                                                    if ((long) var71.field425 < class652.method3700(-1) / 1000L - 5L) {
                                                                        if (~var71.field426 < -1) {
                                                                            class74.method536(var71.field429 + class486.field6923.method2936(class489.field6978, -73), "", 5, 0, (byte) -117, "", "");
                                                                        }
                                                                        if (var71.field426 == 0) {
                                                                            class74.method536(var71.field429 + class486.field6924.method2936(class489.field6978, 67), "", 5, 0, (byte) -72, "", "");
                                                                        }
                                                                        var71.method2401((byte) -57);
                                                                    }
                                                                }
                                                                ++class267.field3323;
                                                                if (~class267.field3323 < -501) {
                                                                    class267.field3323 = 0;
                                                                    int var72 = (int) (Math.random() * 8.0D);
                                                                    if (~(var72 & 1) == -2) {
                                                                        class591.field8338 += class427.field6196;
                                                                    }
                                                                    if ((2 & var72) == 2) {
                                                                        class52.field547 += class206.field2432;
                                                                    }
                                                                    if (~(var72 & 4) == -5) {
                                                                        class641.field9184 += class309.field3850;
                                                                    }
                                                                }
                                                                if (class591.field8338 < -50) {
                                                                    class427.field6196 = 2;
                                                                }
                                                                if (class52.field547 < -55) {
                                                                    class206.field2432 = 2;
                                                                }
                                                                if (class591.field8338 > 50) {
                                                                    class427.field6196 = -2;
                                                                }
                                                                if (class52.field547 > 55) {
                                                                    class206.field2432 = -2;
                                                                }
                                                                if (~class641.field9184 > 39) {
                                                                    class309.field3850 = 1;
                                                                }
                                                                if (~class641.field9184 < -41) {
                                                                    class309.field3850 = -1;
                                                                }
                                                                ++class223.field2564;
                                                                if (~class223.field2564 < -501) {
                                                                    class223.field2564 = 0;
                                                                    int var73 = (int) (Math.random() * 8.0D);
                                                                    if (~(var73 & 1) == -2) {
                                                                        class34.field367 += class219.field2537;
                                                                    }
                                                                    if ((var73 & 2) == 2) {
                                                                        class730.field10216 += class231.field2705;
                                                                    }
                                                                }
                                                                if (class34.field367 < -60) {
                                                                    class219.field2537 = 2;
                                                                }
                                                                if (class34.field367 > 60) {
                                                                    class219.field2537 = -2;
                                                                }
                                                                if (class730.field10216 < -20) {
                                                                    class231.field2705 = 1;
                                                                }
                                                                ++class688.field9717;
                                                                if (class730.field10216 > 10) {
                                                                    class231.field2705 = -1;
                                                                }
                                                                if (~class688.field9717 < -51) {
                                                                    ++class463.field6607;
                                                                    class249 var74 = class289.method1715(class251.field3028, 77, class41.field470);
                                                                    class510.method3017(var74, 55);
                                                                }
                                                                if (class619.field8851) {
                                                                    class43.method254(-32);
                                                                    class619.field8851 = false;
                                                                }
                                                                try {
                                                                    class704.method3953(94);
                                                                    return;
                                                                } catch (IOException var75) {
                                                                    class94.method633(-120);
                                                                    return;
                                                                }
                                                            }
                                                            var67 = var66.field8908;
                                                            if (~var67.field7628 > -1) {
                                                                break;
                                                            }
                                                            var68 = class269.method1608((byte) -72, var67.field7580);
                                                        } while (var68 == null || var68.field7632 == null || var67.field7628 >= var68.field7632.length || var68.field7632[var67.field7628] != var67);
                                                        class133.method859(var66);
                                                    }
                                                }
                                                var64 = var63.field8908;
                                                if (var64.field7628 < 0) {
                                                    break;
                                                }
                                                var65 = class269.method1608((byte) -72, var64.field7580);
                                            } while (var65 == null || var65.field7632 == null || ~var65.field7632.length >= ~var64.field7628 || var65.field7632[var64.field7628] != var64);
                                            class133.method859(var63);
                                        }
                                    }
                                    var61 = var60.field8908;
                                    if (var61.field7628 < 0) {
                                        break;
                                    }
                                    var62 = class269.method1608((byte) -72, var61.field7580);
                                } while (var62 == null || var62.field7632 == null || ~var61.field7628 <= ~var62.field7632.length || var62.field7632[var61.field7628] != var61);
                                class133.method859(var60);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public final void method288(int arg0) {
        ++field9635;
        if (this.field9627 != null) {
            this.field9627.method712('\u0001', 1);
            super.field9647.method2545(32886, 1);
            super.field9647.method2621(-2, (class292) null);
            super.field9647.method2545(32886, arg0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V")
    public static void method3862(int arg0) {
        field9644 = null;
        if (arg0 == 1) {
            field9646 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
    private final void method3863(int arg0) {
        this.field9627 = new class102(super.field9647, 2);
        ++field9639;
        this.field9627.method705(0, (byte) 101);
        super.field9647.method2545(32886, 1);
        super.field9647.method2581((byte) -59, -16777216);
        super.field9647.method2558(260, 0, 7681);
        super.field9647.method2630(arg0 ^ 34420, 0, 770, 34166);
        super.field9647.method2545(32886, 0);
        OpenGL.glBindProgramARB(34336, this.field9632.field7008);
        OpenGL.glEnable(34336);
        this.field9627.method711(22972);
        this.field9627.method705(1, (byte) -57);
        super.field9647.method2545(32886, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field9647.method2573(0, false);
        super.field9647.method2630(34166, 0, arg0, 5890);
        super.field9647.method2545(32886, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field9627.method711(arg0 ^ 23230);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ltha;II)V")
    public final void method292(class292 arg0, int arg1, int arg2) {
        super.field9647.method2621(-2, arg0);
        ++field9638;
        if (arg2 != -16997) {
            field9644 = null;
        }
        super.field9647.method2573(arg1, false);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)Z")
    public final boolean method286(boolean arg0) {
        ++field9630;
        return arg0;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lnv;Lpr;)V")
    public class681(class417 arg0, class445 arg1) {
        super(arg0);
        this.field9634 = arg1;
        if (super.field9647.field5978 && super.field9647.field5963 >= 2) {
            this.field9632 = class65.method487(super.field9647, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336, 17319);
            if (this.field9632 != null) {
                int[][] var3 = class518.method3046((byte) -112, 64, 3, 4, 0, 256, 0.4F, false, 4);
                int[][] var4 = class518.method3046((byte) -86, 64, 3, 4, 8, 256, 0.4F, false, 4);
                int var5 = 0;
                this.field9629 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field9629[var5++] = (float) var7[var9] / 4096.0F;
                        this.field9629[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method3863(770);
            }
        }
    }
}
