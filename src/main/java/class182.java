import java.io.IOException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class182 extends class259 {

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public int field2735 = -1;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "Z")
    public boolean field2738 = false;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "Z")
    public boolean field2748 = false;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field2736 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "[I")
    public static int[] field2737 = new int[100];

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field2741 = 0;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field2739 = 0;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public int field2747;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    public int field2750;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "Ltl;")
    public static class232 field2749;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "Lhi;")
    public static class323 field2744;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)V", line = 31)
    public static void method1253(byte arg0) {
        field2749 = null;
        field2744 = null;
        if (arg0 != -90) {
            field2745 = 68;
        }
        field2736 = null;
        field2737 = null;
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V", line = 44)
    public static final void method1254(int arg0) {
        field2752++;
        if (class58.field684 > 1) {
            class58.field684--;
            class13.field134 = class181.field2734;
        }
        if (class227.field3436 > 0) {
            class227.field3436--;
        }
        if (class334.field5338) {
            class334.field5338 = false;
            class194.method1350((byte) 106);
            return;
        }
        for (int var1 = 0; var1 < 100 && class18.method136((byte) 91); var1++) {
        }
        if (client.field4443 != 30) {
            return;
        }
        class291.method2077(180, -23, class328.field5282);
        Object var2 = class142.field2214.field482;
        synchronized (class142.field2214.field482) {
            if (!class148.field2359) {
                class142.field2214.field485 = 0;
            } else if (class251.field3982 != 0 || class142.field2214.field485 >= 40) {
                class328.field5282.method304(165, arg0 ^ 0x4DF6);
                class328.field5282.method1055(0, arg0 ^ 0xE5);
                int var3 = 0;
                int var4 = class328.field5282.field2295;
                class323.field5106++;
                for (int var5 = 0; class142.field2214.field485 > var5 && class328.field5282.field2295 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class142.field2214.field488[var5];
                    int var7 = class142.field2214.field487[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var8 = false;
                    if (class142.field2214.field488[var5] == -1 && class142.field2214.field487[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = true;
                    }
                    if (class304.field4735 != var7 || class156.field2447 != var6) {
                        int var9 = var7 - class304.field4735;
                        class304.field4735 = var7;
                        int var10 = var6 - class156.field2447;
                        class156.field2447 = var6;
                        if (class238.field3659 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class328.field5282.method1003((class238.field3659 << 12) + var10 + (var9 << 6), arg0 ^ 0xFFFFFF7E);
                            class238.field3659 = 0;
                        } else if (class238.field3659 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class328.field5282.method1055(class238.field3659 + 128, 95);
                            var9 += 128;
                            var10 += 128;
                            class328.field5282.method1003((var9 << 8) + var10, arg0 ^ 0xFFFFFF7E);
                            class238.field3659 = 0;
                        } else if (class238.field3659 >= 32) {
                            class328.field5282.method1003(class238.field3659 + 57344, -2);
                            if (var8) {
                                class328.field5282.method1052(Integer.MIN_VALUE, false);
                            } else {
                                class328.field5282.method1052(var6 << 16 | var7, false);
                            }
                            class238.field3659 = 0;
                        } else {
                            class328.field5282.method1055(class238.field3659 + 192, 107);
                            if (var8) {
                                class328.field5282.method1052(Integer.MIN_VALUE, false);
                            } else {
                                class328.field5282.method1052(var7 | var6 << 16, false);
                            }
                            class238.field3659 = 0;
                        }
                    } else if (class238.field3659 < 2047) {
                        class238.field3659++;
                    }
                }
                class328.field5282.method1044(class328.field5282.field2295 - var4, (byte) 120);
                if (var3 < class142.field2214.field485) {
                    class142.field2214.field485 -= var3;
                    for (int var11 = 0; var11 < class142.field2214.field485; var11++) {
                        class142.field2214.field487[var11] = class142.field2214.field487[var3 + var11];
                        class142.field2214.field488[var11] = class142.field2214.field488[var3 + var11];
                    }
                } else {
                    class142.field2214.field485 = 0;
                }
            }
        }
        if (class251.field3982 != 0) {
            long var13 = (class93.field1247 - class131.field1896) / 50L;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            class131.field1896 = class93.field1247;
            int var15 = class19.field223;
            class166.field2568++;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            int var17 = class301.field4694;
            if (class251.field3982 == 2) {
                var16 = 1;
            }
            class328.field5282.method304(172, 19830);
            int var18 = (int) var13;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            class328.field5282.method1007(384539480, var17 | var15 << 16);
            class328.field5282.method1006(arg0 - 223, var18 | var16 << 15);
        }
        if (class80.field1069 > 0) {
            class80.field1069--;
        }
        if (class234.field3560 && class80.field1069 <= 0) {
            class109.field1493++;
            class234.field3560 = false;
            class80.field1069 = 20;
            class328.field5282.method304(132, 19830);
            class328.field5282.method1006(-46, (int) class103.field1423);
            class328.field5282.method1006(95, (int) class190.field2855);
        }
        if (class282.field4500 && !class160.field2464) {
            class160.field2464 = true;
            class328.field5282.method304(236, 19830);
            class328.field5282.method1055(1, 119);
            class352.field5611++;
        }
        if (!class282.field4500 && class160.field2464) {
            class352.field5611++;
            class160.field2464 = false;
            class328.field5282.method304(236, 19830);
            class328.field5282.method1055(0, arg0 ^ 0xDC);
        }
        if (!class250.field3967) {
            class328.field5282.method304(130, 19830);
            class72.field908++;
            class328.field5282.method1041(class325.method2259((byte) -87), 114);
            class250.field3967 = true;
        }
        if (class293.field4625) {
            class293.field4625 = false;
        } else {
            class203.field3089 /= 2.0F;
        }
        if (class50.field571) {
            class50.field571 = false;
        } else {
            class296.field4650 /= 2.0F;
        }
        class237.method1638((byte) 121);
        if (client.field4443 != 30) {
            return;
        }
        class201.method1399((byte) 100);
        class43.method271(-1);
        client.method2020(arg0 - 128);
        class242.field3732++;
        if (class242.field3732 > 750) {
            class194.method1350((byte) 106);
            return;
        }
        class25.method185(arg0 - 129);
        class139.method953(16777216);
        class326.method2263(true);
        for (int var19 = class257.method1815(true, 1); var19 != -1; var19 = class257.method1815(false, 1)) {
            class6.method38(-78, var19);
            class235.field3612[class261.method1840(31, class231.field3490++)] = var19;
        }
        for (class279 var20 = class2.method15((byte) 127); var20 != null; var20 = class2.method15((byte) 123)) {
            int var21 = var20.method1995((byte) -125);
            int var22 = var20.method1991(arg0 + 24322);
            if (var21 == 1) {
                class203.field3091[var22] = var20.field4388;
                class163.field2506[class261.method1840(class218.field3279++, 31)] = var22;
            } else if (var21 == 2) {
                class55.field639[var22] = var20.field4399;
                class31.field363[class261.method1840(class265.field4190++, 31)] = var22;
            } else if (var21 == 3) {
                class323 var43 = class45.method277(-12866, var22);
                if (!var20.field4399.equals(var43.field5098)) {
                    var43.field5098 = var20.field4399;
                    class107.method693(var43, 6);
                }
            } else if (var21 == 4) {
                class323 var23 = class45.method277(arg0 - 12994, var22);
                int var24 = var20.field4388;
                int var25 = var20.field4394;
                int var26 = var20.field4397;
                if (var23.field5161 != var24 || var23.field5020 != var25 || var23.field5139 != var26) {
                    var23.field5139 = var26;
                    var23.field5161 = var24;
                    var23.field5020 = var25;
                    class107.method693(var23, arg0 - 122);
                }
            } else if (var21 == 5) {
                class323 var27 = class45.method277(-12866, var22);
                if (var20.field4388 != var27.field5026 || var20.field4388 == -1) {
                    var27.field5026 = var20.field4388;
                    var27.field5122 = 1;
                    var27.field5064 = 0;
                    var27.field5021 = 0;
                    class107.method693(var27, 6);
                }
            } else if (var21 == 6) {
                int var37 = var20.field4388;
                int var38 = var37 & 0x1F;
                int var39 = (var37 & 0x7C43) >> 10;
                int var40 = (var37 & 0x3F1) >> 5;
                int var41 = (var38 << 3) + (var39 << 19) + (var40 << 11);
                class323 var42 = class45.method277(-12866, var22);
                if (var42.field5060 != var41) {
                    var42.field5060 = var41;
                    class107.method693(var42, 6);
                }
            } else if (var21 == 7) {
                class323 var35 = class45.method277(-12866, var22);
                boolean var36 = var20.field4388 == 1;
                if (var35.field5132 != var36) {
                    var35.field5132 = var36;
                    class107.method693(var35, 6);
                }
            } else if (var21 == 8) {
                class323 var28 = class45.method277(arg0 - 12994, var22);
                if (var20.field4388 != var28.field5032 || var20.field4394 != var28.field5072 || var20.field4397 != var28.field5121) {
                    var28.field5121 = var20.field4397;
                    var28.field5032 = var20.field4388;
                    if (var28.field5195 != -1) {
                        if (var28.field5168 > 0) {
                            var28.field5121 = var28.field5121 * 32 / var28.field5168;
                        } else if (var28.field5095 > 0) {
                            var28.field5121 = var28.field5121 * 32 / var28.field5095;
                        }
                    }
                    var28.field5072 = var20.field4394;
                    class107.method693(var28, arg0 - 122);
                }
            } else if (var21 == 9) {
                class323 var34 = class45.method277(-12866, var22);
                if (var20.field4388 != var34.field5195 || var20.field4394 != var34.field5066) {
                    var34.field5195 = var20.field4388;
                    var34.field5066 = var20.field4394;
                    class107.method693(var34, 6);
                }
            } else if (var21 == 10) {
                class323 var29 = class45.method277(-12866, var22);
                if (var20.field4388 != var29.field5023 || var20.field4394 != var29.field5081 || var20.field4397 != var29.field5091) {
                    var29.field5091 = var20.field4397;
                    var29.field5081 = var20.field4394;
                    var29.field5023 = var20.field4388;
                    class107.method693(var29, 6);
                }
            } else if (var21 == 11) {
                class323 var33 = class45.method277(-12866, var22);
                var33.field5146 = 0;
                var33.field5104 = var33.field5063 = var20.field4394;
                var33.field5029 = var33.field5144 = var20.field4388;
                var33.field5108 = 0;
                class107.method693(var33, arg0 - 122);
            } else if (var21 == 12) {
                class323 var30 = class45.method277(-12866, var22);
                int var31 = var20.field4388;
                if (var30 != null && var30.field5107 == 0) {
                    if (var31 > var30.field5187 - var30.field5174) {
                        var31 = var30.field5187 - var30.field5174;
                    }
                    if (var31 < 0) {
                        var31 = 0;
                    }
                    if (var30.field5188 != var31) {
                        var30.field5188 = var31;
                        class107.method693(var30, 6);
                    }
                }
            } else if (var21 == 13) {
                class323 var32 = class45.method277(-12866, var22);
                var32.field5124 = var20.field4388;
            }
        }
        if (class20.field237 != 0) {
            class7.field90 += 20;
            if (class7.field90 >= 400) {
                class20.field237 = 0;
            }
        }
        class266.field4193++;
        if (class312.field4895 != null) {
            class111.field1534++;
            if (class111.field1534 >= 15) {
                class107.method693(class312.field4895, arg0 ^ 0x86);
                class312.field4895 = null;
            }
        }
        if (class203.field3088 != null) {
            class107.method693(class203.field3088, arg0 ^ 0x86);
            if (class197.field3009 > (class110.field1517 + 5) || class110.field1517 - 5 > class197.field3009 || class128.field1873 > class6.field75 + 5 || class128.field1873 < class6.field75 - 5) {
                class255.field4042 = true;
            }
            class65.field774++;
            if (class312.field4891 == 0) {
                if (class255.field4042 && class65.field774 >= 5) {
                    if (class54.field623 == class203.field3088 && class78.field1028 != class360.field5696) {
                        class256.field4050++;
                        class323 var44 = class203.field3088;
                        byte var45 = 0;
                        if (class322.field5006 == 1 && var44.field5182 == 206) {
                            var45 = 1;
                        }
                        if (var44.field5143[class360.field5696] <= 0) {
                            var45 = 0;
                        }
                        if (client.method2013(var44).method487(0)) {
                            int var48 = class360.field5696;
                            int var49 = class78.field1028;
                            var44.field5143[var48] = var44.field5143[var49];
                            var44.field5153[var48] = var44.field5153[var49];
                            var44.field5143[var49] = -1;
                            var44.field5153[var49] = 0;
                        } else if (var45 == 1) {
                            int var46 = class78.field1028;
                            int var47 = class360.field5696;
                            while (var46 != var47) {
                                if (var46 > var47) {
                                    var44.method2252(var46, (byte) 127, var46 - 1);
                                    var46--;
                                } else if (var46 < var47) {
                                    var44.method2252(var46, (byte) 25, var46 + 1);
                                    var46++;
                                }
                            }
                        } else {
                            var44.method2252(class78.field1028, (byte) 80, class360.field5696);
                        }
                        class328.field5282.method304(74, arg0 + 19702);
                        class328.field5282.method1049(class78.field1028, (byte) -128);
                        class328.field5282.method1055(var45, 104);
                        class328.field5282.method1041(class203.field3088.field5073, 52);
                        class328.field5282.method1049(class360.field5696, (byte) -121);
                    }
                } else if ((class52.field602 == 1 || class89.method562(14, class74.field924 - 1)) && class74.field924 > 2) {
                    class92.method573(-1);
                } else if (class74.field924 > 0) {
                    class65.method393(98);
                }
                class111.field1534 = 10;
                class203.field3088 = null;
                class251.field3982 = 0;
            }
        }
        class148.field2353 = null;
        class295.field4641 = 0;
        class334.field5337 = false;
        class205.field3110 = false;
        class323 var50 = class131.field1888;
        class323 var51 = field2744;
        class131.field1888 = null;
        field2744 = null;
        if (arg0 != 128) {
            return;
        }
        while (class171.method1201(127) && class295.field4641 < 128) {
            class309.field4839[class295.field4641] = class87.field1147;
            class327.field5260[class295.field4641] = class99.field1339;
            class295.field4641++;
        }
        class68.field852 = null;
        if (class345.field5482 != -1) {
            class309.method2182(class345.field5482, 0, class165.field2546, 0, class95.field1307, 0, 0, false);
        }
        class181.field2734++;
        if (class68.field852 != null) {
            class52.method316(arg0 - 128);
        }
        while (true) {
            class185 var52;
            class323 var53;
            class323 var54;
            do {
                var52 = (class185) class349.field5553.method1808(0);
                if (var52 == null) {
                    while (true) {
                        class185 var55;
                        class323 var56;
                        class323 var57;
                        do {
                            var55 = (class185) class154.field2439.method1808(0);
                            if (var55 == null) {
                                while (true) {
                                    class185 var58;
                                    class323 var59;
                                    class323 var60;
                                    do {
                                        var58 = (class185) class282.field4482.method1808(arg0 ^ 0x80);
                                        if (var58 == null) {
                                            if (class68.field852 == null) {
                                                class361.field5711 = 0;
                                            }
                                            if (class147.field2341 != null) {
                                                class259.method1824(27636);
                                            }
                                            if (class100.field1350 > 0 && class276.field4349[82] && class276.field4349[81] && class228.field3468 != 0) {
                                                int var61 = class219.field3290 - class228.field3468;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class123.method793(var61, class16.field160 + class11.field113.field3786[0], -2266, class11.field113.field3747[0] + class322.field4999);
                                            }
                                            if (class100.field1350 > 0 && class276.field4349[82] && class276.field4349[81]) {
                                                if (class179.field2690 != -1) {
                                                    class123.method793(class219.field3290, class347.field5511 + class16.field160, -2266, class322.field4999 + class179.field2690);
                                                }
                                                class162.field2495 = 0;
                                                class292.field4605 = 0;
                                            } else if (class292.field4605 == 2) {
                                                if (class179.field2690 != -1) {
                                                    class328.field5282.method304(235, 19830);
                                                    class88.field1162++;
                                                    class328.field5282.method1049(class347.field5511 + class16.field160, (byte) -116);
                                                    class328.field5282.method1003(class322.field4999 + class179.field2690, -2);
                                                    class328.field5282.method1006(arg0 - 198, class196.field2978);
                                                    class328.field5282.method1052(class225.field3393, false);
                                                    class361.field5717 = class301.field4694;
                                                    class7.field90 = 0;
                                                    class20.field237 = 1;
                                                    class242.field3722 = class19.field223;
                                                }
                                                class292.field4605 = 0;
                                            } else if (class162.field2495 == 2) {
                                                if (class179.field2690 != -1) {
                                                    class328.field5282.method304(212, arg0 ^ 0x4DF6);
                                                    class252.field3994++;
                                                    class328.field5282.method1003(class322.field4999 + class179.field2690, -2);
                                                    class328.field5282.method1049(class347.field5511 + class16.field160, (byte) -87);
                                                    class242.field3722 = class19.field223;
                                                    class7.field90 = 0;
                                                    class361.field5717 = class301.field4694;
                                                    class20.field237 = 1;
                                                }
                                                class162.field2495 = 0;
                                            } else if (class179.field2690 != -1 && class292.field4605 == 0 && class162.field2495 == 0) {
                                                int var62 = (class179.field2690 << 1) + 1 - class11.field113.method412((byte) 86) >> 1;
                                                int var63 = (class347.field5511 << 1) + 1 - class11.field113.method412((byte) 91) >> 1;
                                                class31.method221(var62, 0, var63, -126);
                                                class7.field90 = 0;
                                                class361.field5717 = class301.field4694;
                                                class242.field3722 = class19.field223;
                                                class20.field237 = 1;
                                                class277.method1980(var63, class11.field113.field3747[0], 0, var62, true, 0, class11.field113.field3786[0], 0, 0, 0, 2);
                                            }
                                            class179.field2690 = -1;
                                            class279.method1992(arg0 + 23211);
                                            if (class131.field1888 != var50) {
                                                if (var50 != null) {
                                                    class107.method693(var50, 6);
                                                }
                                                if (class131.field1888 != null) {
                                                    class107.method693(class131.field1888, 6);
                                                }
                                            }
                                            if (field2744 != var51 && class351.field5607 == class16.field172) {
                                                if (var51 != null) {
                                                    class107.method693(var51, arg0 - 122);
                                                }
                                                if (field2744 != null) {
                                                    class107.method693(field2744, arg0 - 122);
                                                }
                                            }
                                            if (field2744 == null) {
                                                if (class16.field172 > 0) {
                                                    class16.field172--;
                                                }
                                            } else if (class351.field5607 > class16.field172) {
                                                class16.field172++;
                                                if (class351.field5607 == class16.field172) {
                                                    class107.method693(field2744, 6);
                                                }
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class110.field1510[var64]++;
                                            }
                                            int var65 = class258.method1821(-10980);
                                            int var66 = class140.method964(arg0 ^ 0xBA);
                                            if (var65 > 15000 && var66 > 15000) {
                                                class227.field3436 = 250;
                                                class174.method1214(23754, 14500);
                                                class328.field5282.method304(103, 19830);
                                                class5.field62++;
                                            }
                                            if (class323.field5159 != null && class323.field5159.field2419 == 1) {
                                                if (class323.field5159.field2421 != null) {
                                                    class180.method1240(class191.field2874, 92, class162.field2490);
                                                }
                                                class191.field2874 = null;
                                                class162.field2490 = false;
                                                class323.field5159 = null;
                                            }
                                            class91.field1200++;
                                            class5.field56++;
                                            class168.field2581++;
                                            if (class5.field56 > 500) {
                                                class5.field56 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x2) == 2) {
                                                    class214.field3246 += class305.field4746;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class64.field772 += class112.field1564;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class10.field106 += class161.field2472;
                                                }
                                            }
                                            if (class214.field3246 < -55) {
                                                class305.field4746 = 2;
                                            }
                                            if (class64.field772 < -40) {
                                                class112.field1564 = 1;
                                            }
                                            if (class10.field106 < -50) {
                                                class161.field2472 = 2;
                                            }
                                            if (class10.field106 > 50) {
                                                class161.field2472 = -2;
                                            }
                                            if (class214.field3246 > 55) {
                                                class305.field4746 = -2;
                                            }
                                            if (class64.field772 > 40) {
                                                class112.field1564 = -1;
                                            }
                                            if (class91.field1200 > 500) {
                                                class91.field1200 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class132.field1912 += class132.field1908;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class67.field831 += class254.field4022;
                                                }
                                            }
                                            if (class67.field831 < -20) {
                                                class254.field4022 = 1;
                                            }
                                            if (class132.field1912 < -60) {
                                                class132.field1908 = 2;
                                            }
                                            if (class67.field831 > 10) {
                                                class254.field4022 = -1;
                                            }
                                            if (class132.field1912 > 60) {
                                                class132.field1908 = -2;
                                            }
                                            if (class168.field2581 > 50) {
                                                class174.field2633++;
                                                class328.field5282.method304(206, arg0 + 19702);
                                            }
                                            if (class92.field1209) {
                                                class77.method493(false);
                                                class92.field1209 = false;
                                            }
                                            try {
                                                if (class147.field2352 != null && class328.field5282.field2295 > 0) {
                                                    class147.field2352.method1532(class328.field5282.field2295, 0, arg0 ^ 0xBF, class328.field5282.field2260);
                                                    class168.field2581 = 0;
                                                    class328.field5282.field2295 = 0;
                                                }
                                            } catch (IOException var70) {
                                                class194.method1350((byte) 106);
                                            }
                                            return;
                                        }
                                        var59 = var58.field2793;
                                        if (var59.field5112 < 0) {
                                            break;
                                        }
                                        var60 = class45.method277(-12866, var59.field5196);
                                    } while (var60 == null || var60.field5036 == null || var60.field5036.length <= var59.field5112 || var60.field5036[var59.field5112] != var59);
                                    class208.method1456(-7155, var58);
                                }
                            }
                            var56 = var55.field2793;
                            if (var56.field5112 < 0) {
                                break;
                            }
                            var57 = class45.method277(-12866, var56.field5196);
                        } while (var57 == null || var57.field5036 == null || var56.field5112 >= var57.field5036.length || var57.field5036[var56.field5112] != var56);
                        class208.method1456(-7155, var55);
                    }
                }
                var53 = var52.field2793;
                if (var53.field5112 < 0) {
                    break;
                }
                var54 = class45.method277(-12866, var53.field5196);
            } while (var54 == null || var54.field5036 == null || var54.field5036.length <= var53.field5112 || var54.field5036[var53.field5112] != var53);
            class208.method1456(-7155, var52);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()V", line = 1046)
    public static final void method1255() {
        GL var0 = class272.field4310;
        var0.glDisableClientState(32886);
        class272.method1941(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class272.method1922();
        for (int var1 = 0; var1 < class62.field748[0].length; var1++) {
            class175 var2 = class62.field748[0][var1];
            if (var2.field2640 >= 0 && class77.method497(class104.field1438.method892(21235, var2.field2640), (byte) 96)) {
                var0.glColor4fv(class160.method1161(var2.field2637, 20523), 0);
                float var3 = 201.5F - (var2.field2657 ? 1.0F : 0.5F);
                var2.method1220(class194.field2947, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class272.method1938();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class272.method1942();
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIZIZIII)V", line = 1083)
    public static final void method1256(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field2743++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                class227.field3428[var11][var12] = 0;
                class171.field2606[var11][var12] = 99999999;
            }
        }
        class227.field3428[arg4][arg6] = 99;
        class171.field2606[arg4][arg6] = 0;
        int var13 = arg4;
        byte var14 = 0;
        class291.field4585[var14] = arg4;
        int var28 = var14 + 1;
        class63.field761[var14] = arg6;
        int var15 = arg6;
        boolean var16 = arg7;
        int var17 = 0;
        int[][] var18 = class247.field3914[class219.field3290].field4156;
        while (var28 != var17) {
            var15 = class63.field761[var17];
            var13 = class291.field4585[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg0 == var13 && arg9 == var15) {
                var16 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class247.field3914[class219.field3290].method1856(2, arg9, var13, arg8 - 1, arg3, (byte) 100, var15, arg0)) {
                    var16 = true;
                    break;
                }
                if (arg8 < 10 && class247.field3914[class219.field3290].method1852(arg8 - 1, arg3, (byte) 97, arg9, var15, 2, var13, arg0)) {
                    var16 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg1 != 0 && class247.field3914[class219.field3290].method1847(arg10, arg9, var13, arg2, var15, arg1, arg0, (byte) -91, 2)) {
                var16 = true;
                break;
            }
            int var19 = class171.field2606[var13][var15] + 1;
            if (var13 > 0 && class227.field3428[var13 - 1][var15] == 0 && (var18[var13 - 1][var15] & 0x2C010E) == 0 && (var18[var13 - 1][var15 + 1] & 0x2C0138) == 0) {
                class291.field4585[var28] = var13 - 1;
                class63.field761[var28] = var15;
                var28 = var28 + 1 & 0xFFF;
                class227.field3428[var13 - 1][var15] = 2;
                class171.field2606[var13 - 1][var15] = var19;
            }
            if (var13 < 102 && class227.field3428[var13 + 1][var15] == 0 && (var18[var13 + 2][var15] & 0x2C0183) == 0 && (var18[var13 + 2][var15 + 1] & 0x2C01E0) == 0) {
                class291.field4585[var28] = var13 + 1;
                class63.field761[var28] = var15;
                class227.field3428[var13 + 1][var15] = 8;
                var28 = var28 + 1 & 0xFFF;
                class171.field2606[var13 + 1][var15] = var19;
            }
            if (var15 > 0 && class227.field3428[var13][var15 - 1] == 0 && (var18[var13][var15 - 1] & 0x2C010E) == 0 && (var18[var13 + 1][var15 - 1] & 0x2C0183) == 0) {
                class291.field4585[var28] = var13;
                class63.field761[var28] = var15 - 1;
                class227.field3428[var13][var15 - 1] = 1;
                var28 = var28 + 1 & 0xFFF;
                class171.field2606[var13][var15 - 1] = var19;
            }
            if (var15 < 102 && class227.field3428[var13][var15 + 1] == 0 && (var18[var13][var15 + 2] & 0x2C0138) == 0 && (var18[var13 + 1][var15 + 2] & 0x2C01E0) == 0) {
                class291.field4585[var28] = var13;
                class63.field761[var28] = var15 + 1;
                var28 = var28 + 1 & 0xFFF;
                class227.field3428[var13][var15 + 1] = 4;
                class171.field2606[var13][var15 + 1] = var19;
            }
            if (var13 > 0 && var15 > 0 && class227.field3428[var13 - 1][var15 - 1] == 0 && (var18[var13 - 1][var15] & 0x2C013E) == 0 && (var18[var13 - 1][var15 - 1] & 0x2C010E) == 0 && (var18[var13][var15 - 1] & 0x2C018F) == 0) {
                class291.field4585[var28] = var13 - 1;
                class63.field761[var28] = var15 - 1;
                var28 = var28 + 1 & 0xFFF;
                class227.field3428[var13 - 1][var15 - 1] = 3;
                class171.field2606[var13 - 1][var15 - 1] = var19;
            }
            if (var13 < 102 && var15 > 0 && class227.field3428[var13 + 1][var15 - 1] == 0 && (var18[var13 + 1][var15 - 1] & 0x2C018F) == 0 && (var18[var13 + 2][var15 - 1] & 0x2C0183) == 0 && (var18[var13 + 2][var15] & 0x2C01E3) == 0) {
                class291.field4585[var28] = var13 + 1;
                class63.field761[var28] = var15 - 1;
                var28 = var28 + 1 & 0xFFF;
                class227.field3428[var13 + 1][var15 - 1] = 9;
                class171.field2606[var13 + 1][var15 - 1] = var19;
            }
            if (var13 > 0 && var15 < 102 && class227.field3428[var13 - 1][var15 + 1] == 0 && (var18[var13 - 1][var15 + 1] & 0x2C013E) == 0 && (var18[var13 - 1][var15 + 2] & 0x2C0138) == 0 && (var18[var13][var15 + 2] & 0x2C01F8) == 0) {
                class291.field4585[var28] = var13 - 1;
                class63.field761[var28] = var15 + 1;
                class227.field3428[var13 - 1][var15 + 1] = 6;
                class171.field2606[var13 - 1][var15 + 1] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var13 < 102 && var15 < 102 && class227.field3428[var13 + 1][var15 + 1] == 0 && (var18[var13 + 1][var15 + 2] & 0x2C01F8) == 0 && (var18[var13 + 2][var15 + 2] & 0x2C01E0) == 0 && (var18[var13 + 2][var15 + 1] & 0x2C01E3) == 0) {
                class291.field4585[var28] = var13 + 1;
                class63.field761[var28] = var15 + 1;
                var28 = var28 + 1 & 0xFFF;
                class227.field3428[var13 + 1][var15 + 1] = 12;
                class171.field2606[var13 + 1][var15 + 1] = var19;
            }
        }
        if (!var16) {
            if (!arg5) {
                return;
            }
            int var20 = 100;
            int var21 = 1000;
            byte var22 = 10;
            for (int var23 = arg0 - var22; var23 <= arg0 + var22; var23++) {
                for (int var24 = arg9 - var22; var24 <= arg9 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class171.field2606[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var24 < arg9) {
                            var25 = arg9 - var24;
                        } else if (var24 > arg1 + arg9 - 1) {
                            var25 = var24 + 1 - arg1 - arg9;
                        }
                        if (var23 < arg0) {
                            var26 = arg0 - var23;
                        } else if (arg0 + arg2 - 1 < var23) {
                            var26 = var23 + 1 - arg0 - arg2;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var21 || var21 == var27 && class171.field2606[var23][var24] < var20) {
                            var20 = class171.field2606[var23][var24];
                            var15 = var24;
                            var21 = var27;
                            var13 = var23;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return;
            }
            if (arg4 == var13 && arg6 == var15) {
                return;
            }
        }
        class5.field57 = var15;
        class237.field3650 = false;
        class309.field4795 = var13;
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V", line = 1424)
    public static final void method1257(byte arg0) {
        class282.field4499.method301(-26380);
        field2742++;
        int var1 = class282.field4499.method307(8, true);
        if (var1 < class296.field4667) {
            for (int var2 = var1; var2 < class296.field4667; var2++) {
                class351.field5608[class44.field492++] = class225.field3392[var2];
            }
        }
        if (class296.field4667 < var1) {
            throw new RuntimeException("gnpov1");
        }
        int var3 = 5 / ((arg0 - 34) / 38);
        class296.field4667 = 0;
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class225.field3392[var4];
            class231 var6 = class251.field3974[var5];
            int var7 = class282.field4499.method307(1, true);
            if (var7 == 0) {
                class225.field3392[class296.field4667++] = var5;
                var6.field3772 = class102.field1381;
            } else {
                int var8 = class282.field4499.method307(2, true);
                if (var8 == 0) {
                    class225.field3392[class296.field4667++] = var5;
                    var6.field3772 = class102.field1381;
                    class127.field1864[class218.field3280++] = var5;
                } else if (var8 == 1) {
                    class225.field3392[class296.field4667++] = var5;
                    var6.field3772 = class102.field1381;
                    int var9 = class282.field4499.method307(3, true);
                    var6.method1710(var9, 1, (byte) -102);
                    int var10 = class282.field4499.method307(1, true);
                    if (var10 == 1) {
                        class127.field1864[class218.field3280++] = var5;
                    }
                } else if (var8 == 2) {
                    class225.field3392[class296.field4667++] = var5;
                    var6.field3772 = class102.field1381;
                    if (class282.field4499.method307(1, true) == 1) {
                        int var12 = class282.field4499.method307(3, true);
                        var6.method1710(var12, 2, (byte) -102);
                        int var13 = class282.field4499.method307(3, true);
                        var6.method1710(var13, 2, (byte) -102);
                    } else {
                        int var11 = class282.field4499.method307(3, true);
                        var6.method1710(var11, 0, (byte) -102);
                    }
                    int var14 = class282.field4499.method307(1, true);
                    if (var14 == 1) {
                        class127.field1864[class218.field3280++] = var5;
                    }
                } else if (var8 == 3) {
                    class351.field5608[class44.field492++] = var5;
                }
            }
        }
    }
}
