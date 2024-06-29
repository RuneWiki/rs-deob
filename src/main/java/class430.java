import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class430 extends class513 {

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    private int field6179;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "Z")
    private boolean field6174;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    private int field6177;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    private int field6170;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    private int field6181;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    private int field6171;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "Z")
    private boolean field6175;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    private int field6169;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    private int field6164;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    private int field6168;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    private int field6173;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    private int field6178;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "[I")
    public static int[] field6180 = new int[16];

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field6183 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "Lnga;")
    public static class477 field6163;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLun;)V", line = 5)
    public final void method2583(boolean arg0, class389 arg1) {
        field6166++;
        arg1.method2281((byte) 58, 3);
        arg1.method2281((byte) 58, this.field6179);
        arg1.method2281((byte) 58, this.field6174 ? 1 : 0);
        arg1.method2281((byte) 58, this.field6177);
        arg1.method2281((byte) 58, this.field6170);
        if (arg0) {
            this.field6170 = -5;
        }
        arg1.method2281((byte) 58, this.field6181);
        arg1.method2281((byte) 58, this.field6171);
        arg1.method2281((byte) 58, this.field6169);
        arg1.method2281((byte) 58, this.field6175 ? 1 : 0);
        arg1.method2261((byte) 57, this.field6168);
        arg1.method2281((byte) 58, this.field6164);
        arg1.method2217((byte) -42, this.field6173);
        arg1.method2233((byte) 76, this.field6178);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIBZ)V", line = 28)
    public static final void method2584(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field6182++;
        if (class281.field3808 == null) {
            class68.field1045.method1042(arg0, arg3, 1, arg1, -16777216, arg2);
        } else if (class206.field2472.field530 >= 0 && class473.field6604 * 512 > class206.field2472.field530 && class206.field2472.field531 >= 0 && class206.field2472.field531 < (class205.field2465 * 512)) {
            class114.field1478++;
            if (class206.field2472 != null && class206.field2472.field530 + 256 - (class206.field2472.method1284((byte) -124) * 256) >> 9 == class432.field6201 && class206.field2472.field531 + 256 - (class206.field2472.method1284((byte) -124) * 256) >> 9 == class147.field1798) {
                class147.field1798 = -1;
                class432.field6201 = -1;
                class561.method3278(0);
            }
            class28.method383((byte) 119);
            if (!arg5) {
                class280.method1682(96);
            }
            class240.method1472((byte) -95);
            class210.method1256(arg3, arg1, true, arg2, true, arg0);
            int var6 = class158.field1925;
            int var7 = class112.field1435;
            int var8 = class502.field7011;
            if (arg4 < -109) {
                int var9 = class685.field9783;
                if (class586.field8507 == 1) {
                    int var12 = (int) class393.field5309;
                    if (var12 < class499.field6974 >> 8) {
                        var12 = class499.field6974 >> 8;
                    }
                    if (class25.field587[4] && var12 < (class236.field3183[4] + 128)) {
                        var12 = class236.field3183[4] + 128;
                    }
                    int var13 = (int) class115.field1495 + class177.field2180 & 0x3FFF;
                    class375.method2179(var7, class622.field8905, var12, class281.field3814, var13, (var12 >> 3) * 3 + 600 << 2, class589.method3416(class206.field2472.field530, -101, class617.field8853, class206.field2472.field531) - 200, -29441);
                } else if (class586.field8507 == 4) {
                    int var10 = (int) class393.field5309;
                    if (class499.field6974 >> 8 > var10) {
                        var10 = class499.field6974 >> 8;
                    }
                    if (class25.field587[4] && (class236.field3183[4] + 128) > var10) {
                        var10 = class236.field3183[4] + 128;
                    }
                    int var11 = (int) class115.field1495 & 0x3FFF;
                    class375.method2179(var7, class622.field8905, var10, class281.field3814, var11, ((var10 >> 3) * 3) + 600 << 2, class589.method3416(class394.field5560, -90, class617.field8853, class271.field3695) - 200, -29441);
                } else if (class586.field8507 == 5) {
                    class178.method1114(3, var7);
                }
                int var14 = class346.field4550;
                int var15 = class614.field8846;
                int var16 = class627.field8995;
                int var17 = class569.field8329;
                int var18 = class89.field1250;
                for (int var19 = 0; var19 < 5; var19++) {
                    if (class25.field587[var19]) {
                        int var22 = (int) ((double) (-class666.field9425[var19]) + Math.random() * (double) (class666.field9425[var19] * 2 + 1) + Math.sin((double) class368.field4959[var19] / 100.0D * (double) class397.field5621[var19]) * (double) class236.field3183[var19]);
                        if (var19 == 1) {
                            class614.field8846 += var22 << 2;
                        }
                        if (var19 == 2) {
                            class627.field8995 += var22 << 2;
                        }
                        if (var19 == 4) {
                            class569.field8329 += var22;
                            if (class569.field8329 < 1024) {
                                class569.field8329 = 1024;
                            } else if (class569.field8329 > 3072) {
                                class569.field8329 = 3072;
                            }
                        }
                        if (var19 == 3) {
                            class89.field1250 = class89.field1250 + var22 & 0x3FFF;
                        }
                        if (var19 == 0) {
                            class346.field4550 += var22 << 2;
                        }
                    }
                }
                if (class346.field4550 < 0) {
                    class346.field4550 = 0;
                }
                if (class627.field8995 < 0) {
                    class627.field8995 = 0;
                }
                if (((class455.field6393 << 9) - 1) < class346.field4550) {
                    class346.field4550 = (class455.field6393 << 9) - 1;
                }
                if (((class302.field4057 << 9) - 1) < class627.field8995) {
                    class627.field8995 = (class302.field4057 << 9) - 1;
                }
                class336.method1939((byte) -59);
                class197.method1209(699907780);
                class68.field1045.method292(var6, var9, var6 + var8, var7 + var9);
                class68.field1045.method246();
                int var20 = class665.field9420;
                if (class418.field5919 == null) {
                    class68.field1045.method323(var20);
                } else {
                    class418.field5919.method2919(-22269, var7, class54.field869 << 3, class68.field1045, var6, var20, class89.field1250, var9, var8, class569.field8329);
                }
                class317.method1849(-1);
                class230.field2999.method715(class346.field4550, class614.field8846, class627.field8995, -class569.field8329 & 0x3FFF, -class89.field1250 & 0x3FFF, -class377.field5071 & 0x3FFF);
                class68.field1045.method262(class230.field2999);
                class68.field1045.method301(var8 / 2 + var6, var7 / 2 + var9, class522.field7665 << 1, class522.field7665 << 1);
                class14.method154((byte) 11, class522.field7665 << 1, var7 / 2 + var9, var8 / 2 + var6, class522.field7665 << 1);
                class589.method3419((byte) -64, class627.field8995, class614.field8846, -class89.field1250 & 0x3FFF, class346.field4550, -class377.field5071 & 0x3FFF, -class569.field8329 & 0x3FFF);
                byte var21 = class221.field2851.method1757(class375.field5039, true) == 2 ? (byte) class114.field1478 : 1;
                class518.method3064(class543.field7882, class346.field4550, class614.field8846, class627.field8995, class257.field3493, class137.field1736, class368.field4958, class637.field9119, class642.field9170, class608.field8735, class206.field2472.field532 + 1, var21, class206.field2472.field530 >> 9, class206.field2472.field531 >> 9, !class221.field2851.field4136, true);
                class317.method1849(-1);
                if (class114.field1485 == 10) {
                    class253.method1546((byte) -111, var8, 256, var6, var7, 256, var9);
                    class594.method3445(256, var8, var9, 256, (byte) 127, var7, var6);
                    class285.method1704(256, var7, var6, var9, var8, 256, (byte) -111);
                    class581.method3383(var9, var7, var6, (byte) -63, var8);
                }
                class38.method439();
                class627.field8995 = var16;
                class89.field1250 = var18;
                class569.field8329 = var17;
                class346.field4550 = var14;
                class614.field8846 = var15;
                if (class612.field8775 && class33.field673.method958(-87) == 0) {
                    class612.field8775 = false;
                }
                if (class612.field8775) {
                    class68.field1045.method1042(var6, var8, 1, var9, -16777216, var7);
                    class653.method3694(class68.field1045, class657.field9330, false, 0, class417.field5909, class424.field6050.method2561(class370.field4980, 0));
                }
            }
        } else {
            class68.field1045.method1042(arg0, arg3, 1, arg1, -16777216, arg2);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 222)
    public static void method2585(int arg0) {
        field6183 = null;
        if (arg0 == -48) {
            field6180 = null;
            field6163 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBIIIII)V", line = 243)
    public static final void method2586(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6167++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg7 - arg5;
        int var12 = arg4 - arg5;
        int var13 = arg7 * arg7;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        if (arg2 != -18) {
            method2585(-127);
        }
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class678.field9722[arg6];
        class359.method2018(var39, arg1 - var11, -35, arg0, arg1 - arg7);
        class359.method2018(var39, arg1 + var11, 95, arg3, arg1 - var11);
        class359.method2018(var39, arg1 + arg7, -31, arg0, arg1 + var11);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var41 = arg6 - var9;
            int var42 = arg6 + var9;
            int var43 = arg1 + var8;
            int var44 = arg1 - var8;
            if (var40) {
                int var45 = arg1 + var10;
                int var46 = arg1 - var10;
                class359.method2018(class678.field9722[var41], var46, 68, arg0, var44);
                class359.method2018(class678.field9722[var41], var45, arg2 - 72, arg3, var46);
                class359.method2018(class678.field9722[var41], var43, arg2 ^ 0x73, arg0, var45);
                class359.method2018(class678.field9722[var42], var46, -53, arg0, var44);
                class359.method2018(class678.field9722[var42], var45, 119, arg3, var46);
                class359.method2018(class678.field9722[var42], var43, arg2 ^ 0xFFFFFFA4, arg0, var45);
            } else {
                class359.method2018(class678.field9722[var41], var43, 121, arg0, var44);
                class359.method2018(class678.field9722[var42], var43, 71, arg0, var44);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIIILda;)Lsr;", line = 416)
    public static final class229 method2587(byte arg0, int arg1, int arg2, int arg3, class55 arg4) {
        field6176++;
        if (arg4 == null) {
            return null;
        } else {
            if (arg0 != 77) {
                field6163 = null;
            }
            return new class229(arg3, arg1, arg2, arg4.method83(), arg4.method94(), arg4.method115(), arg4.method65(), arg4.method119(), arg4.method79(), arg4.method99());
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(ZLwd;)V", line = 453)
    public class430(boolean arg0, class248 arg1) {
        if (arg0) {
            if (class248.field3420.startsWith("win")) {
                this.field6179 = 1;
            } else if (class248.field3420.startsWith("mac")) {
                this.field6179 = 2;
            } else if (class248.field3420.startsWith("linux")) {
                this.field6179 = 3;
            } else {
                this.field6179 = 4;
            }
            if (class248.field3403.startsWith("amd64") || class248.field3403.startsWith("x86_64")) {
                this.field6174 = true;
            } else {
                this.field6174 = false;
            }
            if (this.field6179 == 1) {
                if (class248.field3410.indexOf("4.0") != -1) {
                    this.field6177 = 1;
                } else if (class248.field3410.indexOf("4.1") != -1) {
                    this.field6177 = 2;
                } else if (class248.field3410.indexOf("4.9") != -1) {
                    this.field6177 = 3;
                } else if (class248.field3410.indexOf("5.0") != -1) {
                    this.field6177 = 4;
                } else if (class248.field3410.indexOf("5.1") != -1) {
                    this.field6177 = 5;
                } else if (class248.field3410.indexOf("6.0") != -1) {
                    this.field6177 = 6;
                } else if (class248.field3410.indexOf("6.1") != -1) {
                    this.field6177 = 7;
                }
            } else if (this.field6179 == 2) {
                if (class248.field3410.indexOf("10.4") != -1) {
                    this.field6177 = 20;
                } else if (class248.field3410.indexOf("10.5") != -1) {
                    this.field6177 = 21;
                } else if (class248.field3410.indexOf("10.6") != -1) {
                    this.field6177 = 22;
                }
            }
            if (class248.field3402.toLowerCase().indexOf("sun") != -1) {
                this.field6170 = 1;
            } else if (class248.field3402.toLowerCase().indexOf("microsoft") != -1) {
                this.field6170 = 2;
            } else if (class248.field3402.toLowerCase().indexOf("apple") == -1) {
                this.field6170 = 4;
            } else {
                this.field6170 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class248.field3398.length() > var3) {
                    char var5 = class248.field3398.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field6181 = var4;
            int var6 = class248.field3398.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (var6 < class248.field3398.length()) {
                    char var8 = class248.field3398.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = -(-var8 - var7 * 10) - 48;
                    var6++;
                }
            } catch (Exception var15) {
            }
            this.field6171 = var7;
            int var9 = class248.field3398.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class248.field3398.length()) {
                    char var11 = class248.field3398.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + var11 - 48;
                    var9++;
                }
            } catch (Exception var14) {
            }
            if (arg1.field3404) {
                this.field6175 = false;
            } else {
                this.field6175 = true;
            }
            this.field6169 = var10;
            if (this.field6181 <= 3) {
                this.field6164 = 0;
            } else {
                this.field6164 = class32.field649;
            }
            this.field6168 = class590.field8558;
            try {
                this.field6173 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var13) {
                this.field6173 = 0;
            }
            try {
                this.field6178 = HardwareInfo.getPackedBasicCPUInfo();
            } catch (Throwable var12) {
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)Z", line = 635)
    public static final boolean method2588(int arg0, int arg1, int arg2) {
        if (arg0 > -93) {
            return true;
        } else {
            field6165++;
            return (arg2 & 0x180) != 0;
        }
    }
}
