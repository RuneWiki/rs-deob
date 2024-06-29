import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class250 extends class66 {

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "I")
    private int field3606;

    @OriginalMember(owner = "client!wu", name = "E", descriptor = "I")
    private int field3610;

    @OriginalMember(owner = "client!wu", name = "B", descriptor = "I")
    private int field3607;

    @OriginalMember(owner = "client!wu", name = "L", descriptor = "I")
    private int field3617;

    @OriginalMember(owner = "client!wu", name = "H", descriptor = "J")
    public static volatile long field3613 = 0L;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    private int field3598;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!wu", name = "C", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!wu", name = "D", descriptor = "I")
    private int field3609;

    @OriginalMember(owner = "client!wu", name = "F", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!wu", name = "G", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!wu", name = "J", descriptor = "I")
    private int field3615;

    @OriginalMember(owner = "client!wu", name = "K", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "Lhh;")
    public static class84 field3600;

    @OriginalMember(owner = "client!wu", name = "I", descriptor = "[B")
    private byte[] field3614;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BBI)V", line = 6)
    public void method1589(byte arg0, byte arg1, int arg2) {
        this.field3614[arg2] = arg0;
        int var4 = 40 % ((arg1 - 13) / 63);
        field3599++;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIJII)Ljava/lang/String;", line = 25)
    public static final String method1590(boolean arg0, int arg1, long arg2, int arg3, int arg4) {
        field3602++;
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg3 < 55) {
            method1593(true, -51, -25, -66, (byte) -95, -74);
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg2 < 0L) {
            arg2 = -arg2;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg2 * 10));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIBI)I", line = 106)
    public static final int method1591(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field3616++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            if (arg2 > -65) {
                field3613 = 102L;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)I", line = 131)
    public static final int method1592(int arg0, int arg1) {
        int var2 = 103 % ((-arg1 - 13) / 59);
        field3612++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V", line = 146)
    public final void method576(byte arg0) {
        int var2 = -63 / ((6 - arg0) / 62);
        field3603++;
        this.field3615 = 0;
        this.field3601 = 0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIIIBI)V", line = 157)
    public static final void method1593(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3608++;
        if (class36.field545 == null) {
            class394.field5821.method1175(arg2, 8, arg1, -16777216, arg5, arg3);
        } else if (class95.field1558.field5529 >= 0 && (class237.field3436 * 128) > class95.field1558.field5529 && class95.field1558.field5539 >= 0 && class95.field1558.field5539 < class83.field1366 * 128) {
            class454.field6731++;
            if (class95.field1558 != null && class95.field1558.field5529 - (class95.field1558.method184(1) - 1) * 64 >> 7 == class403.field5926 && (class95.field1558.field5539 - (class95.field1558.method184(1) * 64 - 64) >> 7) == class48.field723) {
                class403.field5926 = -1;
                class48.field723 = -1;
                class91.method740((byte) -87);
            }
            class125.method931(91);
            if (!arg0) {
                class480.method2870((byte) -104);
            }
            class484.method2894(-86);
            class522.method3081(arg3, arg5, true, arg2, (byte) -38, arg1);
            int var6 = class369.field5526;
            int var7 = class134.field2067;
            int var8 = class182.field2749;
            int var9 = class382.field5685;
            if (class403.field5944 == 1) {
                int var10 = (int) class382.field5684;
                if (var10 < class520.field7639 >> 8) {
                    var10 = class520.field7639 >> 8;
                }
                if (class205.field2962[4] && var10 < class57.field823[4] + 128) {
                    var10 = class57.field823[4] + 128;
                }
                int var11 = (int) class66.field1161 + class392.field5801 & 0x3FFF;
                class83.method655(class510.field7532, true, var11, var10, class87.field1460, var9, class259.method1646(class95.field1558.field5539, class95.field1558.field5529, 851701031, class434.field6317) - 50, (var10 >> 3) * 3 + 600 << 0);
            } else if (class403.field5944 == 4) {
                int var12 = (int) class382.field5684;
                if ((class520.field7639 >> 8) > var12) {
                    var12 = class520.field7639 >> 8;
                }
                if (class205.field2962[4] && (class57.field823[4] + 128) > var12) {
                    var12 = class57.field823[4] + 128;
                }
                int var13 = (int) class66.field1161 & 0x3FFF;
                class83.method655(class510.field7532, true, var13, var12, class87.field1460, var9, class259.method1646(class380.field5663, class117.field1850, 851701031, class434.field6317) - 50, (var12 >> 3) * 3 + 600 << 0);
            } else if (class403.field5944 == 5) {
                class249.method1587(var9, 697893576);
            }
            int var14 = class430.field6262;
            int var15 = class207.field2983;
            int var16 = class291.field4175;
            int var17 = class310.field4446;
            int var18 = class320.field4578;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class205.field2962[var19]) {
                    int var22 = (int) ((double) (-class151.field2316[var19]) + (double) (class151.field2316[var19] * 2 + 1) * Math.random() + Math.sin((double) class266.field3845[var19] / 100.0D * (double) class530.field7816[var19]) * (double) class57.field823[var19]);
                    if (var19 == 4) {
                        class310.field4446 += var22;
                        if (class310.field4446 < 1024) {
                            class310.field4446 = 1024;
                        } else if (class310.field4446 > 3072) {
                            class310.field4446 = 3072;
                        }
                    }
                    if (var19 == 3) {
                        class320.field4578 = class320.field4578 + var22 & 0x3FFF;
                    }
                    if (var19 == 2) {
                        class291.field4175 += var22;
                    }
                    if (var19 == 1) {
                        class207.field2983 += var22;
                    }
                    if (var19 == 0) {
                        class430.field6262 += var22;
                    }
                }
            }
            if (class430.field6262 < 0) {
                class430.field6262 = 0;
            }
            if (class291.field4175 < 0) {
                class291.field4175 = 0;
            }
            if (((class246.field3560 << 7) - 1) < class430.field6262) {
                class430.field6262 = (class246.field3560 << 7) - 1;
            }
            if (class291.field4175 > (class254.field3675 << 7) - 1) {
                class291.field4175 = (class254.field3675 << 7) - 1;
            }
            class76.method630(0);
            class206.method1379((byte) -53);
            class394.field5821.method509(var8, var7, var6 + var8, var7 + var9);
            class394.field5821.method506();
            int var20 = class188.field2789;
            if (class118.field1861 == null) {
                class394.field5821.method436(var20);
            } else {
                class118.field1861.method1516(class37.field574 << 3, var6, class394.field5821, class310.field4446, class320.field4578, var8, (byte) 86, var7, var9, var20);
            }
            class292.method1811(true);
            if (arg4 >= 19) {
                class81.field1351.method1000(class430.field6262, class207.field2983, class291.field4175, -class310.field4446 & 0x3FFF, -class320.field4578 & 0x3FFF, -class103.field1642 & 0x3FFF);
                class394.field5821.method497(class81.field1351);
                class394.field5821.method485(var8 + (var6 / 2), var9 / 2 + var7, class147.field2167 << 1, class147.field2167 << 1);
                class48.method357(class147.field2167 << 1, var9 / 2 + var7, class147.field2167 << 1, 25362, var8 + (var6 / 2));
                class111.method823(-class310.field4446 & 0x3FFF, -class320.field4578 & 0x3FFF, class430.field6262, class291.field4175, -class103.field1642 & 0x3FFF, class207.field2983, (byte) -6);
                byte var21 = class397.field5830.method1295(class399.field5865, 0) == 2 ? (byte) class454.field6731 : 1;
                class56.method403(class394.field5821, class180.field2734, class485.field7096, class81.field1351, class430.field6262, class207.field2983, class291.field4175, class275.field3993, class490.field7156, class354.field5355, class366.field5496, class25.field437, class348.field5281, class95.field1558.field5538 + 1, var21, class95.field1558.field5529 >> 7, class95.field1558.field5539 >> 7, !class397.field5830.field133);
                class292.method1811(true);
                if (class17.field266 == 30) {
                    class390.method2447(256, var9, var8, var7, var6, 256, 0);
                    class346.method2249(256, 256, var6, var8, 124, var9, var7);
                    class346.method2245(var8, 256, 39, var6, 256, var9, var7);
                    class251.method1595(var9, var7, var6, var8, 100);
                }
                class122.method922();
                class207.field2983 = var15;
                class291.field4175 = var16;
                class310.field4446 = var17;
                class320.field4578 = var18;
                class430.field6262 = var14;
                if (class467.field6869 && class383.field5691.method1681(true) == 0) {
                    class467.field6869 = false;
                }
                if (class467.field6869) {
                    class394.field5821.method1175(var6, 8, var8, -16777216, var9, var7);
                    class54.method392((byte) 117, false, class239.field3480.method1273(true, class370.field5530), class55.field808);
                }
            }
        } else {
            class394.field5821.method1175(arg2, 8, arg1, -16777216, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(IIIIIFFF)V", line = 352)
    public class250(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3606 = (int) (arg6 * 4096.0F);
        this.field3610 = (int) (arg7 * 4096.0F);
        this.field3617 = this.field3607 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZI)V", line = 363)
    public final void method579(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field3600 = null;
        }
        if (arg2 == 0) {
            this.field3598 = this.field3606 - (arg0 < 0 ? -arg0 : arg0);
            this.field3609 = 4096;
            this.field3598 = this.field3598 * this.field3598 >> 12;
            this.field3615 = this.field3598;
        } else {
            this.field3609 = this.field3610 * this.field3598 >> 12;
            if (this.field3609 < 0) {
                this.field3609 = 0;
            } else if (this.field3609 > 4096) {
                this.field3609 = 4096;
            }
            this.field3598 = this.field3606 - (arg0 >= 0 ? arg0 : -arg0);
            this.field3598 = this.field3598 * this.field3598 >> 12;
            this.field3598 = this.field3609 * this.field3598 >> 12;
            this.field3615 += this.field3617 * this.field3598 >> 12;
            this.field3617 = this.field3617 * this.field3607 >> 12;
        }
        field3611++;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V", line = 398)
    public final void method574(int arg0) {
        this.field3615 >>= 0x4;
        this.field3617 = this.field3607;
        field3604++;
        if (this.field3615 < 0) {
            this.field3615 = 0;
        } else if (this.field3615 > 255) {
            this.field3615 = 255;
        }
        if (arg0 != 28007) {
            this.field3617 = -127;
        }
        this.method1589((byte) this.field3615, (byte) -64, this.field3601++);
        this.field3615 = 0;
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)V", line = 419)
    public static void method1594(int arg0) {
        if (arg0 != 4096) {
            method1593(false, 92, -123, 18, (byte) 35, 99);
        }
        field3600 = null;
    }
}
