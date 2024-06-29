import jaggl.OpenGL;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class186 {

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Lega;")
    public static class473 field2600 = new class473("stellardawn", 1);

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    private static int field2608 = 0;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "[I")
    public static int[] field2609 = new int[14];

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Z")
    public static boolean field2610 = false;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public int field2607;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILmc;)V")
    public final void method1308(int arg0, class234 arg1) {
        if (arg0 != 32) {
            return;
        }
        while (true) {
            int var3 = arg1.method1509(true);
            if (var3 == 0) {
                field2603++;
                return;
            }
            this.method1311(arg1, var3, arg0 - 34);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static final void method1309(int arg0) {
        class571.field7223.method1364(5, 127);
        field2599++;
        class235.field3225.method2665(88, 5);
        class115.field1518.method3697(5, 112);
        class390.field4983.method4290(5, 500);
        class595.field7561.method766(-31655, 5);
        int var1 = -23 / ((45 - arg0) / 40);
        class640.field8189.method700(-51, 5);
        class143.field1864.method4266((byte) 125, 5);
        class62.field819.method561((byte) 31, 5);
        class229.field3089.method228((byte) 111, 5);
        class182.field2489.method2571(5, (byte) 85);
        class451.field5893.method266(5, true);
        class66.field869.method2046(5, (byte) 124);
        class272.field3575.method2325(5, (byte) -115);
        class702.field9289.method2689(false, 5);
        class761.field10377.method4094(5, 12);
        class55.field713.method1805(-19424, 5);
        class55.field708.method3872(22021, 5);
        class526.field6688.method2958(5, -71);
        class736.field9975.method1976(200, 5);
        class542.field6810.method2189((byte) -88, 5);
        class406.field5387.method1720(-19807, 5);
        class111.field1482.method1988(83, 5);
        class406.method2363(-52, 5);
        class633.method3379(50, -116);
        class536.method2927(50, -82);
        class116.method678(5, (byte) 88);
        class270.method1687(5, 5);
        class83.field1191.method2928(true, 5);
        class57.field758.method2928(true, 5);
        class237.field3231.method2928(true, 5);
        class450.field5877.method2928(true, 5);
        class760.field10360.method2928(true, 5);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static void method1310(int arg0) {
        int var1 = -53 / ((40 - arg0) / 48);
        field2609 = null;
        field2600 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lmc;II)V")
    private final void method1311(class234 arg0, int arg1, int arg2) {
        field2606++;
        if (~arg1 == arg2) {
            this.field2607 = arg0.method1553((byte) -122);
            this.field2601 = arg0.method1509(true);
            this.field2604 = arg0.method1509(true);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)[Lgh;")
    public static final class54[] method1312(boolean arg0) {
        if (!arg0) {
            field2608 = 14;
        }
        field2597++;
        return new class54[] { class686.field8835, class640.field8170, class205.field2827, class244.field3351, class41.field474, class409.field5430, class448.field5846, class134.field1776, class583.field7385, class155.field1970, class755.field10287, class602.field7654, class480.field6213, class259.field3481 };
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZILjava/lang/String;)Z")
    public static final boolean method1313(boolean arg0, int arg1, String arg2) {
        field2602++;
        if (class740.field10014.field10571) {
            class379.field4640 = new class246();
            class379.field4640.field3371 = arg1;
            class379.field4640.field3374 = arg2;
            if (class611.field7718 != class290.field3701) {
                class379.field4640.field3379 = class379.field4640.field3371 + 40000;
                class379.field4640.field3366 = class379.field4640.field3371 + 50000;
            }
            for (int var3 = 0; var3 < class21.field199.length; var3++) {
                if (class21.field199[var3].field3102 == arg1) {
                    class600.field7626 = class21.field199[var3].field2472;
                }
            }
            return true;
        }
        String var4 = "";
        if (class611.field7718 != class290.field3701) {
            var4 = ":" + (arg1 + 7000);
        }
        String var5 = "";
        if (!arg0) {
            method1312(false);
        }
        if (class310.field3887 != null) {
            var5 = "/p=" + class310.field3887;
        }
        String var6 = "http://" + arg2 + var4 + "/l=" + class496.field6338 + "/a=" + class517.field6589 + var5 + "/j" + (class87.field1218 ? "1" : "0") + ",o" + (class469.field6110 ? "1" : "0") + ",a2";
        try {
            class102.field1382.getAppletContext().showDocument(new URL(var6), "_self");
            return true;
        } catch (Exception var7) {
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public static final void method1314(int arg0) {
        if (arg0 != 4) {
            method1315(null, 36, 56, -19, -110, -29, -120);
        }
        if (class520.field6618 > 1) {
            class520.field6618--;
            class383.field4791 = class518.field6597;
        }
        field2598++;
        if (class711.field9392) {
            class711.field9392 = false;
            class638.method3447((byte) 67);
            return;
        }
        if (!class525.field6678) {
            class632.method3371(arg0 - 4);
        }
        for (int var1 = 0; var1 < 100 && class272.method1692((byte) 127); var1++) {
        }
        if (class332.field4052 != 10) {
            return;
        }
        while (class340.method1971(0)) {
            class13 var2 = class659.method3587(class68.field909, 98, class25.field216);
            var2.field130.method1491(-129, 0);
            int var3 = var2.field130.field3133;
            class40.method252(var2.field130, true);
            var2.field130.method1532(var2.field130.field3133 - var3, 50);
            class116.method679(var2, 0);
        }
        if (class232.field3124 == null) {
            if (class502.method2786(-7114) >= class278.field3619) {
                class232.field3124 = class129.field1729.method4315(-3, class379.field4640.field3374);
            }
        } else if (class232.field3124.field2820 != -1) {
            class13 var4 = class659.method3587(class68.field909, 98, class252.field3435);
            var4.field130.method1541(374, class232.field3124.field2820);
            class116.method679(var4, 0);
            class232.field3124 = null;
            class278.field3619 = class502.method2786(-7114) + 30000L;
        }
        class793 var5 = (class793) class600.field7629.method3591(0);
        if (var5 != null || class502.method2786(-7114) - 2000L > client.field6076) {
            class13 var6 = null;
            int var7 = 0;
            for (class793 var8 = (class793) class234.field3187.method3591(0); var8 != null && (var6 == null || var6.field130.field3133 - var7 < 240); var8 = (class793) class234.field3187.method3600((byte) 123)) {
                var8.method1946(-10364);
                int var9 = var8.method1591(arg0 + 96);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1592(-19898);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class725.field9521 != var10 || class695.field8908 != var9) {
                    if (var6 == null) {
                        class393.field5183++;
                        var6 = class659.method3587(class68.field909, 98, class84.field1195);
                        var6.field130.method1491(-129, 0);
                        var7 = var6.field130.field3133;
                    }
                    int var11 = var10 - class725.field9521;
                    class725.field9521 = var10;
                    int var12 = var9 - class695.field8908;
                    class695.field8908 = var9;
                    int var13 = (int) ((var8.method1589(14972) - client.field6076) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field130.method1541(arg0 ^ 0x172, (var11 << 6) + (var13 << 12) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var12 += 128;
                        var6.field130.method1491(-129, var13 + 128);
                        var11 += 128;
                        var6.field130.method1541(374, (var11 << 8) + var12);
                    } else if (var13 < 32) {
                        var6.field130.method1491(arg0 ^ 0xFFFFFF7B, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field130.method1496(Integer.MIN_VALUE, (byte) -123);
                        } else {
                            var6.field130.method1496(var9 << 16 | var10, (byte) 73);
                        }
                    } else {
                        var6.field130.method1541(374, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field130.method1496(Integer.MIN_VALUE, (byte) 61);
                        } else {
                            var6.field130.method1496(var9 << 16 | var10, (byte) 15);
                        }
                    }
                    client.field6076 = var8.method1589(14972);
                }
            }
            if (var6 != null) {
                var6.field130.method1532(var6.field130.field3133 - var7, 16);
                class116.method679(var6, arg0 - 4);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1589(14972) - class50.field652) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class50.field652 = var5.method1589(14972);
            int var16 = var5.method1591(arg0 ^ 0x5D);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1592(-19898);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1593(20259) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class361.field4390++;
            class13 var20 = class659.method3587(class68.field909, 98, class66.field866);
            var20.field130.method1541(374, var18 << 15 | var19);
            var20.field130.method1499((byte) -4, var17 | var16 << 16);
            class116.method679(var20, arg0 - 4);
        }
        if (class470.field6129 > 0) {
            class301.field3802++;
            class13 var21 = class659.method3587(class68.field909, 98, class93.field1281);
            var21.field130.method1491(-129, class470.field6129 * 3);
            for (int var22 = 0; var22 < class470.field6129; var22++) {
                class637 var23 = class787.field10782[var22];
                long var24 = (var23.method374((byte) -70) - class731.field9581) / 50L;
                class731.field9581 = var23.method374((byte) -70);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field130.method1491(arg0 ^ 0xFFFFFF7B, var23.method371(false));
                var21.field130.method1541(374, (int) var24);
            }
            class116.method679(var21, 0);
        }
        if (field2608 > 0) {
            field2608--;
        }
        if (class650.field8286 && field2608 <= 0) {
            class643.field8229++;
            field2608 = 20;
            class650.field8286 = false;
            class13 var26 = class659.method3587(class68.field909, 98, class370.field4533);
            var26.field130.method1521((int) class698.field9250 >> 3, true);
            var26.field130.method1502((int) class297.field3762 >> 3, 65280);
            class116.method679(var26, 0);
        }
        if (class703.field9298 != class522.field6651) {
            class574.field7289++;
            class703.field9298 = class522.field6651;
            class13 var27 = class659.method3587(class68.field909, 98, class561.field7130);
            var27.field130.method1491(arg0 - 133, class522.field6651 ? 1 : 0);
            class116.method679(var27, 0);
        }
        if (!class165.field2184) {
            class77.field1073++;
            class13 var28 = class659.method3587(class68.field909, arg0 + 94, class413.field5476);
            var28.field130.method1491(-129, 0);
            int var29 = var28.field130.field3133;
            class234 var30 = class485.field6252.method2989(6654);
            var28.field130.method1530(0, var30.field3133, var30.field3193, 80);
            var28.field130.method1532(var28.field130.field3133 - var29, arg0 + 107);
            class116.method679(var28, 0);
            class165.field2184 = true;
        }
        if (class28.field252 != null) {
            if (class507.field6476 == 2) {
                class184.method1304(-3030);
            } else if (class507.field6476 == 3) {
                class83.method527(arg0 ^ 0x7);
            }
        }
        if (class659.field8609) {
            class659.field8609 = false;
        } else {
            class327.field4010 /= 2.0F;
        }
        if (class783.field10719) {
            class783.field10719 = false;
        } else {
            class436.field5733 /= 2.0F;
        }
        class9.method23((byte) -115);
        if (class332.field4052 != 10) {
            return;
        }
        class599.method3237(583371395);
        class361.method2078(true);
        class640.method3455(false);
        class196.field2716++;
        if (class196.field2716 > 750) {
            class638.method3447((byte) 67);
            return;
        }
        class664.method3615(14722);
        class400.method2314(arg0 ^ 0xFFFFFFAA);
        class414.method2395(105);
        for (int var31 = class381.field4705.method1470((byte) 109, true); var31 != -1; var31 = class381.field4705.method1470((byte) -77, false)) {
            class251.method1637(var31, (byte) -74);
            class703.field9294[class249.method1625(class407.field5406++, 31)] = var31;
        }
        for (class614 var32 = class647.method3498((byte) 30); var32 != null; var32 = class647.method3498((byte) 30)) {
            int var33 = var32.method3284(0);
            long var34 = var32.method3283(1);
            if (var33 == 1) {
                class176.field2317[(int) var34] = var32.field7742;
                class564.field7164 |= class681.field8791[(int) var34];
                class538.field6792[class249.method1625(class106.field1445++, 31)] = (int) var34;
            } else if (var33 == 2) {
                class27.field230[(int) var34] = var32.field7737;
                class335.field4078[class249.method1625(class130.field1733++, 31)] = (int) var34;
            } else if (var33 == 3) {
                class391 var36 = class738.method4006(105, (int) var34);
                if (!var32.field7737.equals(var36.field5141)) {
                    var36.field5141 = var32.field7737;
                    class776.method4255(var36, arg0 - 1011);
                }
            } else if (var33 == 4) {
                class391 var37 = class738.method4006(108, (int) var34);
                int var38 = var32.field7742;
                int var39 = var32.field7746;
                int var40 = var32.field7741;
                if (var37.field5135 != var38 || var37.field5069 != var39 || var37.field5027 != var40) {
                    var37.field5135 = var38;
                    var37.field5027 = var40;
                    var37.field5069 = var39;
                    class776.method4255(var37, -1007);
                }
            } else if (var33 == 5) {
                class391 var41 = class738.method4006(94, (int) var34);
                if (var32.field7742 != var41.field5024 || var32.field7742 == -1) {
                    var41.field5029 = 1;
                    var41.field5113 = 0;
                    var41.field5024 = var32.field7742;
                    var41.field5142 = 0;
                    class11 var42 = var41.field5024 == -1 ? null : class143.field1864.method4265(true, var41.field5024);
                    if (var42 != null) {
                        class216.method1423(var41.field5113, 0, var42);
                    }
                    class776.method4255(var41, arg0 - 1011);
                }
            } else if (var33 == 6) {
                int var58 = var32.field7742;
                int var59 = var58 >> 10 & 0x1F;
                int var60 = var58 >> 5 & 0x1F;
                int var61 = var58 & 0x1F;
                int var62 = (var59 << 19) - (-(var60 << 11) - (var61 << 3));
                class391 var63 = class738.method4006(110, (int) var34);
                if (var63.field5132 != var62) {
                    var63.field5132 = var62;
                    class776.method4255(var63, -1007);
                }
            } else if (var33 == 7) {
                class391 var43 = class738.method4006(86, (int) var34);
                boolean var44 = var32.field7742 == 1;
                if (var43.field4986 != var44) {
                    var43.field4986 = var44;
                    class776.method4255(var43, -1007);
                }
            } else if (var33 == 8) {
                class391 var57 = class738.method4006(42, (int) var34);
                if (var32.field7742 != var57.field5149 || var32.field7746 != var57.field5068 || var32.field7741 != var57.field5150) {
                    var57.field5150 = var32.field7741;
                    var57.field5068 = var32.field7746;
                    var57.field5149 = var32.field7742;
                    if (var57.field5128 != -1) {
                        if (var57.field5090 > 0) {
                            var57.field5150 = var57.field5150 * 32 / var57.field5090;
                        } else if (var57.field5014 > 0) {
                            var57.field5150 = var57.field5150 * 32 / var57.field5014;
                        }
                    }
                    class776.method4255(var57, -1007);
                }
            } else if (var33 == 9) {
                class391 var56 = class738.method4006(115, (int) var34);
                if (var32.field7742 != var56.field5128 || var32.field7746 != var56.field4997) {
                    var56.field4997 = var32.field7746;
                    var56.field5128 = var32.field7742;
                    class776.method4255(var56, arg0 ^ 0xFFFFFC15);
                }
            } else if (var33 == 10) {
                class391 var55 = class738.method4006(114, (int) var34);
                if (var32.field7742 != var55.field4992 || var32.field7746 != var55.field5154 || var32.field7741 != var55.field5088) {
                    var55.field4992 = var32.field7742;
                    var55.field5154 = var32.field7746;
                    var55.field5088 = var32.field7741;
                    class776.method4255(var55, -1007);
                }
            } else if (var33 == 11) {
                class391 var45 = class738.method4006(71, (int) var34);
                var45.field5035 = 0;
                var45.field5085 = 0;
                var45.field5003 = var45.field5114 = var32.field7746;
                var45.field5119 = var45.field4993 = var32.field7742;
                class776.method4255(var45, -1007);
            } else if (var33 == 12) {
                class391 var53 = class738.method4006(26, (int) var34);
                int var54 = var32.field7742;
                if (var53 != null && var53.field5007 == 0) {
                    if ((var53.field5010 - var53.field5031) < var54) {
                        var54 = var53.field5010 - var53.field5031;
                    }
                    if (var54 < 0) {
                        var54 = 0;
                    }
                    if (var53.field4984 != var54) {
                        var53.field4984 = var54;
                        class776.method4255(var53, -1007);
                    }
                }
            } else if (var33 == 14) {
                class391 var46 = class738.method4006(116, (int) var34);
                var46.field5160 = var32.field7742;
            } else if (var33 == 15) {
                class270.field3560 = var32.field7742;
                class102.field1357 = true;
                class167.field2221 = var32.field7746;
            } else if (var33 == 16) {
                class391 var52 = class738.method4006(85, (int) var34);
                var52.field5049 = var32.field7742;
            } else if (var33 == 17) {
                class391 var51 = class738.method4006(16, (int) var34);
                var51.field5051 = var32.field7742;
            } else if (var33 == 18) {
                class391 var49 = class738.method4006(37, (int) var34);
                int var50 = (int) (var34 >> 32);
                var49.method2254(var50, (byte) 8, (short) var32.field7742, (short) var32.field7746);
            } else if (var33 == 19) {
                class391 var47 = class738.method4006(arg0 ^ 0x6D, (int) var34);
                int var48 = (int) (var34 >> 32);
                var47.method2257((short) var32.field7746, arg0 - 5, var48, (short) var32.field7742);
            }
        }
        if (class793.field10872 != 0) {
            class244.field3357 += 20;
            if (class244.field3357 >= 400) {
                class793.field10872 = 0;
            }
        }
        class621.field7858++;
        if (class386.field4934 != null) {
            class376.field4600++;
            if (class376.field4600 >= 15) {
                class776.method4255(class386.field4934, -1007);
                class386.field4934 = null;
            }
        }
        class558.field7088 = null;
        class757.field10331 = false;
        class652.field8356 = null;
        class553.field7004 = false;
        class500.method2774(-1, -26279, -1, null);
        class37.method221((byte) -108, -1, null, -1);
        if (!class47.field549) {
            class20.field185 = -1;
        }
        class307.method1812(-17827);
        class518.field6597++;
        if (class488.field6294) {
            class693.field8895++;
            class13 var64 = class659.method3587(class68.field909, 98, class655.field8445);
            var64.field130.method1499((byte) -4, class740.field10022 << 28 | class283.field3659 << 14 | class376.field4591);
            class116.method679(var64, 0);
            class488.field6294 = false;
        }
        while (true) {
            class244 var65;
            class391 var66;
            class391 var67;
            do {
                var65 = (class244) class191.field2683.method3599(-59);
                if (var65 == null) {
                    while (true) {
                        class244 var68;
                        class391 var69;
                        class391 var70;
                        do {
                            var68 = (class244) class357.field4356.method3599(arg0 - 112);
                            if (var68 == null) {
                                while (true) {
                                    class244 var71;
                                    class391 var72;
                                    class391 var73;
                                    do {
                                        var71 = (class244) class251.field3427.method3599(-124);
                                        if (var71 == null) {
                                            if (class558.field7088 == null) {
                                                class412.field5459 = 0;
                                            }
                                            if (class430.field5649 != null) {
                                                class366.method2102((byte) -113);
                                            }
                                            if (class20.field186 > 0 && class679.field8781.method271((byte) 125, 82) && class679.field8781.method271((byte) 118, 81) && class479.field6200 != 0) {
                                                int var74 = class422.field5564.field2895 - class479.field6200;
                                                if (var74 < 0) {
                                                    var74 = 0;
                                                } else if (var74 > 3) {
                                                    var74 = 3;
                                                }
                                                class119.method710(class422.field5564.field4767[0] + class714.field9407, 0, class422.field5564.field4758[0] + class240.field3293, var74);
                                            }
                                            class470.method2658(arg0 + 29);
                                            for (int var75 = 0; var75 < 5; var75++) {
                                                int var10002 = class15.field155[var75]++;
                                            }
                                            if (class564.field7164 && class502.method2786(-7114) - 60000L > class17.field168) {
                                                class399.method2308((byte) -116);
                                            }
                                            for (class713 var76 = (class713) class414.field5484.method857(-102); var76 != null; var76 = (class713) class414.field5484.method864(true)) {
                                                if ((class502.method2786(-7114) / 1000L - 5L) > ((long) var76.field9398)) {
                                                    if (var76.field9399 > 0) {
                                                        class416.method2405(0, "", "", "", var76.field9401 + class659.field8563.method3589(class496.field6338, -22395), 5, -1);
                                                    }
                                                    if (var76.field9399 == 0) {
                                                        class416.method2405(0, "", "", "", var76.field9401 + class659.field8564.method3589(class496.field6338, -22395), 5, -1);
                                                    }
                                                    var76.method3306(false);
                                                }
                                            }
                                            class362.field4405++;
                                            if (class362.field4405 > 500) {
                                                class362.field4405 = 0;
                                                int var77 = (int) (Math.random() * 8.0D);
                                                if ((var77 & 0x1) == 1) {
                                                    class656.field8457 += class292.field3717;
                                                }
                                                if ((var77 & 0x4) == 4) {
                                                    class181.field2474 += class751.field10240;
                                                }
                                                if ((var77 & 0x2) == 2) {
                                                    class640.field8181 += class500.field6414;
                                                }
                                            }
                                            if (class656.field8457 < -50) {
                                                class292.field3717 = 2;
                                            }
                                            if (class656.field8457 > 50) {
                                                class292.field3717 = -2;
                                            }
                                            if (class640.field8181 < -55) {
                                                class500.field6414 = 2;
                                            }
                                            if (class181.field2474 < -40) {
                                                class751.field10240 = 1;
                                            }
                                            if (class640.field8181 > 55) {
                                                class500.field6414 = -2;
                                            }
                                            class544.field6819++;
                                            if (class181.field2474 > 40) {
                                                class751.field10240 = -1;
                                            }
                                            if (class544.field6819 > 500) {
                                                class544.field6819 = 0;
                                                int var78 = (int) (Math.random() * 8.0D);
                                                if ((var78 & 0x1) == 1) {
                                                    class757.field10329 += class684.field8822;
                                                }
                                                if ((var78 & 0x2) == 2) {
                                                    class718.field9432 += class530.field6732;
                                                }
                                            }
                                            if (class757.field10329 < -60) {
                                                class684.field8822 = 2;
                                            }
                                            if (class757.field10329 > 60) {
                                                class684.field8822 = -2;
                                            }
                                            if (class718.field9432 < -20) {
                                                class530.field6732 = 1;
                                            }
                                            if (class718.field9432 > 10) {
                                                class530.field6732 = -1;
                                            }
                                            class341.field4177++;
                                            if (class341.field4177 > 50) {
                                                class358.field4376++;
                                                class13 var79 = class659.method3587(class68.field909, 98, class230.field3098);
                                                class116.method679(var79, 0);
                                            }
                                            if (class340.field4172) {
                                                class243.method1595(120);
                                                class340.field4172 = false;
                                            }
                                            try {
                                                class610.method3269(120);
                                                return;
                                            } catch (IOException var80) {
                                                class638.method3447((byte) 67);
                                                return;
                                            }
                                        }
                                        var72 = var71.field3350;
                                        if (var72.field5039 < 0) {
                                            break;
                                        }
                                        var73 = class738.method4006(29, var72.field5136);
                                    } while (var73 == null || var73.field5145 == null || var72.field5039 >= var73.field5145.length || var73.field5145[var72.field5039] != var72);
                                    class760.method4148(var71);
                                }
                            }
                            var69 = var68.field3350;
                            if (var69.field5039 < 0) {
                                break;
                            }
                            var70 = class738.method4006(125, var69.field5136);
                        } while (var70 == null || var70.field5145 == null || var69.field5039 >= var70.field5145.length || var70.field5145[var69.field5039] != var69);
                        class760.method4148(var68);
                    }
                }
                var66 = var65.field3350;
                if (var66.field5039 < 0) {
                    break;
                }
                var67 = class738.method4006(72, var66.field5136);
            } while (var67 == null || var67.field5145 == null || var66.field5039 >= var67.field5145.length || var67.field5145[var66.field5039] != var66);
            class760.method4148(var65);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([BIIIIII)V")
    public static final void method1315(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2605++;
        if (arg3 > 0 && !class735.method3997(arg3, (byte) -97)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class735.method3997(arg4, (byte) -87)) {
            int var7 = class20.method87(arg6, arg1 ^ 0x1908);
            int var8 = 0;
            int var9 = arg4 > arg3 ? arg3 : arg4;
            int var10 = arg3 >> 1;
            int var11 = arg4 >> 1;
            if (arg1 == 1) {
                byte[] var12 = arg0;
                byte[] var13 = new byte[var7 * var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Dub(arg5, var8, arg2, arg3, arg4, 0, arg6, 5121, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg3 * var7;
                    byte[] var15 = var13;
                    for (int var16 = 0; var16 < var7; var16++) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var20 < var11; var20++) {
                            for (int var21 = 0; var21 < var10; var21++) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                int var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var19 = var7 + var26;
                                var13[var17] = (byte) (var27 >> 2);
                                var17 += var7;
                            }
                            var18 += var14;
                            var19 += var14;
                        }
                    }
                    var13 = var12;
                    arg4 = var11;
                    var12 = var15;
                    arg3 = var10;
                    var11 >>= 0x1;
                    var10 >>= 0x1;
                    var9 >>= 0x1;
                    var8++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
