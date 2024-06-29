import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class345 {

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public int field4781 = 8;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "Z")
    public boolean field4788 = false;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "Z")
    public boolean field4790 = true;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public int field4783 = -1;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public int field4786 = -1;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "I")
    public int field4791 = 0;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public int field4782 = 128;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public int field4784 = 1190717;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "Z")
    public boolean field4797 = true;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "I")
    public int field4794 = 127;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public int field4778 = -1;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "I")
    public int field4793 = 16;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "J")
    public static long field4780 = -1L;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!is", name = "t", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "Lkb;")
    public class485 field4779;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Z")
    public static final boolean method2084(int arg0) throws IOException {
        field4787++;
        if (class383.field5635 == null) {
            return false;
        }
        int var1 = class383.field5635.method641(3);
        if (var1 == 0) {
            return false;
        }
        if (class169.field2395 == null) {
            if (class97.field1311) {
                class383.field5635.method639(0, (byte) 113, 1, class85.field1163.field783);
                var1--;
                class97.field1311 = false;
                class57.field668++;
            }
            class85.field1163.field827 = 0;
            if (class85.field1163.method950(-6742)) {
                if (var1 == 0) {
                    return false;
                }
                var1--;
                class383.field5635.method639(1, (byte) 113, 1, class85.field1163.field783);
                class57.field668++;
            }
            class97.field1311 = true;
            class324[] var2 = class67.method652(-4);
            int var3 = class85.field1163.method949(1941438248);
            if (var3 < 0 || var3 >= var2.length) {
                throw new IOException("invo:" + var3 + " ip:" + class85.field1163.field827);
            }
            class169.field2395 = var2[var3];
            class26.field314 = class169.field2395.field4557;
        }
        if (class26.field314 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class383.field5635.method639(0, (byte) 113, 1, class85.field1163.field783);
            var1--;
            class57.field668++;
            class26.field314 = class85.field1163.field783[0] & 0xFF;
        }
        if (~class26.field314 == arg0) {
            if (var1 <= 1) {
                return false;
            }
            class383.field5635.method639(0, (byte) 113, 2, class85.field1163.field783);
            class85.field1163.field827 = 0;
            var1 -= 2;
            class26.field314 = class85.field1163.method623((byte) -62);
            class57.field668 += 2;
        }
        if (var1 < class26.field314) {
            return false;
        }
        class85.field1163.field827 = 0;
        class383.field5635.method639(0, (byte) 113, class26.field314, class85.field1163.field783);
        class393.field5780 = class434.field6366;
        class57.field668 += class26.field314;
        class112.field1578 = 0;
        class434.field6366 = class511.field7543;
        class511.field7543 = class169.field2395;
        if (class427.field6300 == class169.field2395) {
            class444.method2708(75, class213.field3065);
            class169.field2395 = null;
            return true;
        } else if (class250.field3688 == class169.field2395) {
            boolean var4 = class85.field1163.method577(255) == 1;
            String var5 = class85.field1163.method624((byte) -40);
            String var6 = var5;
            if (var4) {
                var6 = class85.field1163.method624((byte) -40);
            }
            int var7 = class85.field1163.method577(arg0 + 254);
            int var8 = class85.field1163.method623((byte) 118);
            boolean var9 = false;
            if (var7 <= 1 && class88.method778(var6, false)) {
                var9 = true;
            }
            if (!var9 && class368.field5478 == 0) {
                String var10 = class95.field1280.method2335(var8, (byte) -99).method3069(class85.field1163, -127);
                if (var7 == 2) {
                    class11.method77((byte) 91, var8, "<img=1>" + var6, var10, null, 0, "<img=1>" + var5, 25);
                } else if (var7 == 1) {
                    class11.method77((byte) 123, var8, "<img=0>" + var6, var10, null, 0, "<img=0>" + var5, 25);
                } else {
                    class11.method77((byte) 95, var8, var6, var10, null, 0, var5, 25);
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class299.field4301 == class169.field2395) {
            int var11 = class85.field1163.method578(-98);
            int var12 = class85.field1163.method623((byte) 125);
            int var13 = class85.field1163.method623((byte) 116);
            if (class397.method2433(var12, -32291)) {
                class101.method865(var11, var13, arg0 + 11);
            }
            class169.field2395 = null;
            return true;
        } else if (class364.field5095 == class169.field2395) {
            int var14 = class85.field1163.method623((byte) -88);
            String var15 = class85.field1163.method624((byte) -40);
            Object[] var16 = new Object[var15.length() + 1];
            for (int var17 = var15.length() - 1; var17 >= 0; var17--) {
                if (var15.charAt(var17) == 's') {
                    var16[var17 + 1] = class85.field1163.method624((byte) -40);
                } else {
                    var16[var17 + 1] = Integer.valueOf(class85.field1163.method616((byte) 89));
                }
            }
            var16[0] = Integer.valueOf(class85.field1163.method616((byte) 88));
            if (class397.method2433(var14, -32291)) {
                class125 var18 = new class125();
                var18.field1833 = var16;
                class41.method409(var18);
            }
            class169.field2395 = null;
            return true;
        } else if (class428.field6309 == class169.field2395) {
            class444.method2708(arg0 ^ 0x48, class523.field7689);
            class169.field2395 = null;
            return true;
        } else if (class73.field998 == class169.field2395) {
            class385.method2346(false);
            class169.field2395 = null;
            return false;
        } else if (class169.field2395 == class151.field2147) {
            int var19 = class85.field1163.method607(27574);
            int var20 = class85.field1163.method577(255);
            int var21 = class85.field1163.method635(arg0 ^ 0x38CD25A1);
            if (var21 == 65535) {
                var21 = -1;
            }
            class481.method2899(var21, 118, var20, var19);
            class169.field2395 = null;
            return true;
        } else if (class88.field1199 == class169.field2395) {
            int var22 = class85.field1163.method580((byte) 29);
            int var23 = class85.field1163.method602((byte) 55);
            if (var23 == 65535) {
                var23 = -1;
            }
            int var24 = class85.field1163.method577(255);
            class373.method2300(var24, 0, var22, var23);
            class169.field2395 = null;
            return true;
        } else if (class169.field2395 == class151.field2132) {
            int var25 = class85.field1163.method576((byte) -14);
            int var26 = class85.field1163.method610(-86);
            int var27 = class85.field1163.method635(952968608);
            if (var27 == 65535) {
                var27 = -1;
            }
            String var28 = class85.field1163.method624((byte) -40);
            if (var25 >= 1 && var25 <= 8) {
                if (var28.equalsIgnoreCase("null")) {
                    var28 = null;
                }
                class2.field5[var25 - 1] = var28;
                class278.field4082[var25 - 1] = var27;
                class255.field3745[var25 - 1] = var26 == 0;
            }
            class169.field2395 = null;
            return true;
        } else if (class305.field4331 == class169.field2395) {
            int var29 = class85.field1163.method577(255);
            int var30 = var29 >> 5;
            int var31 = var29 & 0x1F;
            if (var31 == 0) {
                class133.field1922[var30] = null;
                class169.field2395 = null;
                return true;
            }
            class452 var32 = new class452();
            var32.field6652 = var31;
            var32.field6646 = class85.field1163.method577(255);
            if (var32.field6646 >= 0 && var32.field6646 < class226.field3305.length) {
                if (var32.field6652 == 1 || var32.field6652 == 10) {
                    var32.field6645 = class85.field1163.method623((byte) -41);
                    class85.field1163.field827 += 6;
                } else if (var32.field6652 >= 2 && var32.field6652 <= 6) {
                    if (var32.field6652 == 2) {
                        var32.field6655 = 64;
                        var32.field6653 = 64;
                    }
                    if (var32.field6652 == 3) {
                        var32.field6655 = 64;
                        var32.field6653 = 0;
                    }
                    if (var32.field6652 == 4) {
                        var32.field6655 = 64;
                        var32.field6653 = 128;
                    }
                    if (var32.field6652 == 5) {
                        var32.field6655 = 0;
                        var32.field6653 = 64;
                    }
                    if (var32.field6652 == 6) {
                        var32.field6655 = 128;
                        var32.field6653 = 64;
                    }
                    var32.field6652 = 2;
                    var32.field6647 = class85.field1163.method577(255);
                    var32.field6653 += class85.field1163.method623((byte) 103) - class340.field4713 << 7;
                    var32.field6655 += class85.field1163.method623((byte) -116) - class476.field7013 << 7;
                    var32.field6657 = class85.field1163.method577(255);
                    var32.field6650 = class85.field1163.method623((byte) -50);
                }
                var32.field6649 = class85.field1163.method623((byte) -48);
                if (var32.field6649 == 65535) {
                    var32.field6649 = -1;
                }
                class133.field1922[var30] = var32;
            }
            class169.field2395 = null;
            return true;
        } else if (class490.field7193 == class169.field2395) {
            int var33 = class85.field1163.method623((byte) 104);
            int var34 = class85.field1163.method625(119);
            int var35 = class85.field1163.method635(952968608);
            if (class397.method2433(var33, -32291)) {
                class344.method2081(var35, (byte) -114, var34, 0);
            }
            class169.field2395 = null;
            return true;
        } else if (class200.field2933 == class169.field2395) {
            String var36 = class85.field1163.method624((byte) -40);
            int var37 = class85.field1163.method623((byte) -79);
            String var38 = class95.field1280.method2335(var37, (byte) -99).method3069(class85.field1163, -127);
            class11.method77((byte) 112, var37, var36, var38, null, 0, var36, 19);
            class169.field2395 = null;
            return true;
        } else if (class517.field7614 == class169.field2395) {
            int var39 = class85.field1163.method635(952968608);
            int var40 = class85.field1163.method625(arg0 + 121);
            int var41 = class85.field1163.method598(50);
            if (class397.method2433(var39, -32291)) {
                class393.method2411(1, var40, var41);
            }
            class169.field2395 = null;
            return true;
        } else if (class223.field3276 == class169.field2395) {
            class445.field6585 = class85.field1163.method607(27574);
            class81.field1100 = class85.field1163.method610(-93);
            class169.field2395 = null;
            return true;
        } else if (class322.field4530 == class169.field2395) {
            if (class64.field761 != -1) {
                class389.method2393(class64.field761, arg0 - 2, 0);
            }
            class169.field2395 = null;
            return true;
        } else if (class466.field6845 == class169.field2395) {
            int var42 = class85.field1163.method602((byte) 55);
            int var43 = class85.field1163.method598(50);
            class253.field3739.method2743(var43, var42, 0);
            class169.field2395 = null;
            return true;
        } else if (class91.field1248 == class169.field2395) {
            class531.method3135(arg0 ^ 0xA8D);
            class169.field2395 = null;
            return false;
        } else if (class405.field6033 == class169.field2395) {
            int var44 = class85.field1163.method577(255);
            int var45 = class85.field1163.method610(arg0 - 109);
            if (var44 == 255) {
                var45 = -1;
                var44 = -1;
            }
            class100.method847(arg0 + 131, var44, var45);
            class169.field2395 = null;
            return true;
        } else if (class471.field6961 == class169.field2395) {
            int var46 = class85.field1163.method598(arg0 ^ 0x54);
            int var47 = class85.field1163.method607(27574);
            int var48 = class85.field1163.method576((byte) -90);
            class491.field7199[var47] = var46;
            class391.field5763[var47] = var48;
            class56.field629[var47] = 1;
            int var49 = class282.field4106[var47] - 1;
            for (int var50 = 0; var50 < var49; var50++) {
                if (var46 >= class498.field7401[var50]) {
                    class56.field629[var47] = var50 + 2;
                }
            }
            class33.field387[method2089(31, class506.field7488++)] = var47;
            class169.field2395 = null;
            return true;
        } else if (class34.field394 == class169.field2395) {
            int var51 = class85.field1163.method597(86);
            int var52 = class85.field1163.method623((byte) -46);
            if (class397.method2433(var52, -32291)) {
                class510.method3036(3, -97, var51, -1, -1);
            }
            class169.field2395 = null;
            return true;
        } else if (class530.field7760 == class169.field2395) {
            int var53 = class85.field1163.method577(255);
            int var54 = class85.field1163.method625(arg0 + 117);
            int var55 = class85.field1163.method625(arg0 + 115);
            if (class397.method2433(var54, -32291)) {
                if (var53 == 2) {
                    class195.method1365(98);
                }
                class64.field761 = var55;
                class11.method78(var55, arg0 ^ 0xA5D);
                class351.method2116((byte) -27, false);
                class41.method412(class64.field761);
                for (int var56 = 0; var56 < 100; var56++) {
                    class342.field4736[var56] = true;
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class4.field69 == class169.field2395) {
            int var57 = class85.field1163.method578(-100);
            int var58 = class85.field1163.method616((byte) 74);
            int var59 = class85.field1163.method623((byte) -38);
            int var60 = class85.field1163.method635(952968608);
            if (class397.method2433(var59, arg0 ^ 0xFFFF81DC)) {
                class510.method3036(5, -98, var57, var60, var58);
            }
            class169.field2395 = null;
            return true;
        } else if (class311.field4440 == class169.field2395) {
            int var61 = class85.field1163.method623((byte) -109);
            int var62 = class85.field1163.method623((byte) 96);
            int var63 = class85.field1163.method623((byte) -77);
            int var64 = class85.field1163.method623((byte) -43);
            if (class397.method2433(var61, -32291) && class123.field1803[var62] != null) {
                for (int var65 = var63; var65 < var64; var65++) {
                    int var66 = class85.field1163.method580((byte) 29);
                    if (var65 < class123.field1803[var62].length && class123.field1803[var62][var65] != null) {
                        class123.field1803[var62][var65].field2692 = var66;
                    }
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class29.field359 == class169.field2395) {
            boolean var67 = class85.field1163.method577(255) == 1;
            String var68 = class85.field1163.method624((byte) -40);
            String var69 = var68;
            if (var67) {
                var69 = class85.field1163.method624((byte) -40);
            }
            long var70 = (long) class85.field1163.method623((byte) 82);
            long var72 = (long) class85.field1163.method580((byte) 29);
            int var74 = class85.field1163.method577(arg0 + 254);
            int var75 = class85.field1163.method623((byte) -30);
            long var76 = (var70 << 32) + var72;
            boolean var78 = false;
            int var79 = 0;
            while (true) {
                if (var79 >= 100) {
                    if (var74 <= 1 && class88.method778(var69, false)) {
                        var78 = true;
                    }
                    break;
                }
                if (class339.field4704[var79] == var76) {
                    var78 = true;
                    break;
                }
                var79++;
            }
            if (!var78 && class368.field5478 == 0) {
                class339.field4704[class291.field4188] = var76;
                class291.field4188 = (class291.field4188 + 1) % 100;
                String var80 = class95.field1280.method2335(var75, (byte) -99).method3069(class85.field1163, -127);
                if (var74 == 2) {
                    class11.method77((byte) 70, var75, "<img=1>" + var69, var80, null, 0, "<img=1>" + var68, 18);
                } else if (var74 == 1) {
                    class11.method77((byte) 89, var75, "<img=0>" + var69, var80, null, 0, "<img=0>" + var68, 18);
                } else {
                    class11.method77((byte) 126, var75, var69, var80, null, 0, var68, 18);
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class212.field3053 == class169.field2395) {
            int var81 = class85.field1163.method623((byte) 100);
            int var82 = class85.field1163.method577(255);
            boolean var83 = (var82 & 0x1) == 1;
            while (class26.field314 > class85.field1163.field827) {
                int var84 = class85.field1163.method593((byte) 104);
                int var85 = class85.field1163.method623((byte) 110);
                int var86 = 0;
                if (var85 != 0) {
                    var86 = class85.field1163.method577(255);
                    if (var86 == 255) {
                        var86 = class85.field1163.method616((byte) 124);
                    }
                }
                class215.method1464(var84, var85 - 1, -1, var81, var86, var83);
            }
            class61.field708[method2089(31, class509.field7511++)] = var81;
            class169.field2395 = null;
            return true;
        } else if (class432.field6354 == class169.field2395) {
            if (class149.field2112 != null) {
                class76.method711(class478.field7044.field3347, -1, -1, false, false);
            }
            byte[] var87 = new byte[class26.field314];
            class85.field1163.method941(97, class26.field314, 0, var87);
            String var88 = class81.method733(11783, var87, class26.field314, 0);
            class287.method1823(class498.field7404, var88, class65.field802 == 1, true, 103);
            class169.field2395 = null;
            return true;
        } else if (class515.field7576 == class169.field2395) {
            class444.method2708(arg0 + 58, class354.field4946);
            class169.field2395 = null;
            return true;
        } else if (class446.field6593 == class169.field2395) {
            int var89 = class85.field1163.method578(-128);
            int var90 = class85.field1163.method625(116);
            class253.field3739.method2745(-114, var90, var89);
            class169.field2395 = null;
            return true;
        } else if (class410.field6097 == class169.field2395) {
            int var91 = class85.field1163.method576((byte) -35);
            int var92 = class85.field1163.method635(arg0 + 952968607);
            int var93 = class85.field1163.method616((byte) 98);
            int var94 = class85.field1163.method625(121);
            if (class397.method2433(var92, -32291)) {
                class305 var95 = (class305) class49.field545.method875((long) var93, 124);
                if (var95 != null) {
                    class349.method2103(var95.field4333 != var94, var95, false, arg0 - 118);
                }
                class169.method1185(var94, var91, false, (byte) 125, var93);
            }
            class169.field2395 = null;
            return true;
        } else if (class268.field3950 == class169.field2395) {
            class444.method2708(113, class85.field1157);
            class169.field2395 = null;
            return true;
        } else if (class169.field2395 == class162.field2293) {
            int var96 = class85.field1163.method635(952968608);
            int var97 = class85.field1163.method596((byte) -120);
            int var98 = class85.field1163.method597(29);
            if (class397.method2433(var96, -32291)) {
                class518.method3080(-112, var97, var98);
            }
            class169.field2395 = null;
            return true;
        } else if (class321.field4528 == class169.field2395) {
            int var99 = class85.field1163.method623((byte) -90);
            int var100 = class85.field1163.method576((byte) 125);
            boolean var101 = (var100 & 0x1) == 1;
            class366.method2262(21856, var99, var101);
            class61.field708[method2089(31, class509.field7511++)] = var99;
            class169.field2395 = null;
            return true;
        } else if (class241.field3571 == class169.field2395) {
            boolean var102 = class85.field1163.method577(255) == 1;
            String var103 = class85.field1163.method624((byte) -40);
            String var104 = var103;
            if (var102) {
                var104 = class85.field1163.method624((byte) -40);
            }
            int var105 = class85.field1163.method577(arg0 + 254);
            boolean var106 = false;
            if (var105 <= 1) {
                if (!(!class388.field5741 || class53.field582) || class411.field6107) {
                    var106 = true;
                } else if (var105 <= 1 && class88.method778(var104, false)) {
                    var106 = true;
                }
            }
            if (!var106 && class368.field5478 == 0) {
                String var107 = class450.method2723(class405.method2479(false, class85.field1163), (byte) 116);
                if (var105 == 2) {
                    class11.method77((byte) 89, -1, "<img=1>" + var104, var107, null, 0, "<img=1>" + var103, 24);
                } else if (var105 == 1) {
                    class11.method77((byte) 117, -1, "<img=0>" + var104, var107, null, 0, "<img=0>" + var103, 24);
                } else {
                    class11.method77((byte) 83, -1, var104, var107, null, 0, var103, 24);
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class463.field6812 == class169.field2395) {
            class444.method2708(121, class276.field4069);
            class169.field2395 = null;
            return true;
        } else if (class475.field6998 == class169.field2395) {
            while (class85.field1163.field827 < class26.field314) {
                boolean var118 = class85.field1163.method577(255) == 1;
                String var119 = class85.field1163.method624((byte) -40);
                String var120 = class85.field1163.method624((byte) -40);
                int var121 = class85.field1163.method623((byte) 97);
                int var122 = class85.field1163.method577(arg0 ^ 0xFE);
                String var123 = "";
                boolean var124 = false;
                if (var121 > 0) {
                    var123 = class85.field1163.method624((byte) -40);
                    var124 = class85.field1163.method577(255) == 1;
                }
                for (int var125 = 0; var125 < class91.field1257; var125++) {
                    if (var118) {
                        if (var120.equals(class353.field4943[var125])) {
                            class353.field4943[var125] = var119;
                            var119 = null;
                            class326.field4578[var125] = var120;
                            break;
                        }
                    } else if (var119.equals(class353.field4943[var125])) {
                        if (class45.field508[var125] != var121) {
                            class45.field508[var125] = var121;
                            if (var121 > 0) {
                                class331.method2032(0, 5, var119 + class57.field661.method2031(true, class377.field5585), "", "", true);
                            }
                            if (var121 == 0) {
                                class331.method2032(0, 5, var119 + class165.field2345.method2031(true, class377.field5585), "", "", true);
                            }
                        }
                        class326.field4578[var125] = var120;
                        class198.field2895[var125] = var123;
                        class348.field4831[var125] = var122;
                        var119 = null;
                        class305.field4336[var125] = var124;
                        break;
                    }
                }
                if (var119 != null && class91.field1257 < 200) {
                    class353.field4943[class91.field1257] = var119;
                    class326.field4578[class91.field1257] = var120;
                    class45.field508[class91.field1257] = var121;
                    class198.field2895[class91.field1257] = var123;
                    class348.field4831[class91.field1257] = var122;
                    class305.field4336[class91.field1257] = var124;
                    class91.field1257++;
                }
            }
            class471.field6950 = 2;
            class444.field6577 = class49.field548;
            boolean var108 = false;
            int var109 = class91.field1257;
            while (var109 > 0) {
                var109--;
                boolean var110 = true;
                for (int var111 = 0; var111 < var109; var111++) {
                    if (class45.field508[var111] != class77.field1046 && class45.field508[var111 + 1] == class77.field1046 || class45.field508[var111] == 0 && class45.field508[var111 + 1] != 0) {
                        int var112 = class45.field508[var111];
                        class45.field508[var111] = class45.field508[var111 + 1];
                        class45.field508[var111 + 1] = var112;
                        String var113 = class198.field2895[var111];
                        class198.field2895[var111] = class198.field2895[var111 + 1];
                        class198.field2895[var111 + 1] = var113;
                        String var114 = class353.field4943[var111];
                        class353.field4943[var111] = class353.field4943[var111 + 1];
                        class353.field4943[var111 + 1] = var114;
                        String var115 = class326.field4578[var111];
                        class326.field4578[var111] = class326.field4578[var111 + 1];
                        class326.field4578[var111 + 1] = var115;
                        int var116 = class348.field4831[var111];
                        class348.field4831[var111] = class348.field4831[var111 + 1];
                        class348.field4831[var111 + 1] = var116;
                        boolean var117 = class305.field4336[var111];
                        class305.field4336[var111] = class305.field4336[var111 + 1];
                        class305.field4336[var111 + 1] = var117;
                        var110 = false;
                    }
                }
                if (var110) {
                    break;
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class375.field5555 == class169.field2395) {
            int var126 = class85.field1163.method625(arg0 + 121);
            if (var126 == 65535) {
                var126 = -1;
            }
            int var127 = class85.field1163.method616((byte) 105);
            int var128 = class85.field1163.method635(arg0 + 952968607);
            if (class397.method2433(var128, arg0 ^ 0xFFFF81DC)) {
                class238.method1587(arg0 ^ 0x28CE, var126, var127);
            }
            class169.field2395 = null;
            return true;
        } else if (class169.field2395 == class127.field1846) {
            class446.method2713(class85.field1163, -127, class26.field314);
            class169.field2395 = null;
            return true;
        } else if (class232.field3417 == class169.field2395) {
            int var129 = class85.field1163.method623((byte) 98);
            int var130 = class85.field1163.method577(255);
            class253.field3739.method2743(var130, var129, 0);
            class169.field2395 = null;
            return true;
        } else if (class39.field452 == class169.field2395) {
            int var131 = class85.field1163.method602((byte) 55);
            if (var131 == 65535) {
                var131 = -1;
            }
            int var132 = class85.field1163.method597(43);
            int var133 = class85.field1163.method623((byte) -50);
            int var134 = class85.field1163.method616((byte) 82);
            int var135 = class85.field1163.method625(124);
            if (var135 == 65535) {
                var135 = -1;
            }
            if (class397.method2433(var133, arg0 - 32292)) {
                for (int var136 = var131; var136 <= var135; var136++) {
                    long var137 = ((long) var134 << 32) + (long) var136;
                    class278 var139 = (class278) class519.field7638.method875(var137, 127);
                    class278 var140;
                    if (var139 != null) {
                        var140 = new class278(var132, var139.field4077);
                        var139.method1525((byte) -73);
                    } else if (var136 == -1) {
                        var140 = new class278(var132, class371.method2286(0, var134).field2691.field4077);
                    } else {
                        var140 = new class278(var132, -1);
                    }
                    class519.field7638.method878(var137, arg0 ^ 0xFFFFF702, var140);
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class84.field1151 == class169.field2395) {
            class109.field1550 = class85.field1163.method621(128) << 3;
            class436.field6395 = class85.field1163.method629(false) << 3;
            class92.field1271 = class85.field1163.method610(-82);
            class169.field2395 = null;
            return true;
        } else if (class402.field5955 == class169.field2395) {
            class333.field4631 = class85.field1163.method599((byte) 1);
            class411.field6111 = class49.field548;
            class169.field2395 = null;
            return true;
        } else if (class377.field5579 == class169.field2395) {
            int var141 = class85.field1163.method576((byte) 122);
            int var142 = class85.field1163.method602((byte) 55);
            if (class397.method2433(var142, -32291)) {
                class330.field4593 = var141;
            }
            class169.field2395 = null;
            return true;
        } else if (class296.field4250 == class169.field2395) {
            int var143 = class85.field1163.method625(118);
            int var144 = class85.field1163.method635(arg0 + 952968607);
            int var145 = class85.field1163.method597(34);
            int var146 = class85.field1163.method635(952968608);
            int var147 = class85.field1163.method607(27574);
            boolean var148 = (var147 & 0x80) != 0;
            if (var145 >> 30 != 0) {
                int var179 = var145 >> 28 & 0x3;
                int var180 = (var145 >> 14 & 0x3FFF) - class340.field4713;
                int var181 = (var145 & 0x3FFF) - class476.field7013;
                if (var180 >= 0 && var181 >= 0 && class397.field5828 > var180 && class457.field6713 > var181) {
                    int var182 = var180 * 128 + 64;
                    int var183 = var181 * 128 + 64;
                    int var184 = var179;
                    if (var179 < 3 && class274.method1765(var180, -29792, var181)) {
                        var184 = var179 + 1;
                    }
                    class495 var185 = new class495(var144, 0, class263.field3867, var179, var184, var182, class66.method643(var182, -117, var179, var183) - var146, var183, var180, var180, var181, var181, var147);
                    class125.field1824.method1015(false, new class138(var185));
                }
            } else if (var145 >> 29 != 0) {
                int var149 = var145 & 0xFFFF;
                class461 var150 = class250.field3690[var149];
                if (var150 != null) {
                    if (var144 == 65535) {
                        var144 = -1;
                    }
                    boolean var151 = true;
                    int var152 = var148 ? var150.field1728 : var150.field1707;
                    if (var144 != -1 && var152 != -1) {
                        if (var144 == var152) {
                            class330 var157 = class151.field2145.method2115(arg0 - 138, var144);
                            if (var157.field4606 && var157.field4611 != -1) {
                                class267 var158 = class153.field2169.method1585(arg0 + 2, var157.field4611);
                                int var159 = var158.field3932;
                                if (var159 == 0 || var159 == 2) {
                                    var151 = false;
                                } else if (var159 == 1) {
                                    var151 = true;
                                }
                            }
                        } else {
                            class330 var153 = class151.field2145.method2115(arg0 - 138, var144);
                            class330 var154 = class151.field2145.method2115(-137, var152);
                            if (var153.field4611 != -1 && var154.field4611 != -1) {
                                class267 var155 = class153.field2169.method1585(3, var153.field4611);
                                class267 var156 = class153.field2169.method1585(3, var154.field4611);
                                if (var156.field3942 > var155.field3942) {
                                    var151 = false;
                                }
                            }
                        }
                    }
                    if (var151) {
                        if (var148) {
                            var150.field1697 = 0;
                            var150.field1751 = class263.field3867 + var143;
                            var150.field1736 = var146;
                            var150.field1754 = 1;
                            var150.field1747 = 0;
                            var150.field1739 = var147 & 0x7;
                            var150.field1728 = var144;
                            if (var150.field1751 > class263.field3867) {
                                var150.field1697 = -1;
                            }
                            if (var150.field1728 != -1 && class263.field3867 == var150.field1751) {
                                int var162 = class151.field2145.method2115(arg0 - 138, var150.field1728).field4611;
                                if (var162 != -1) {
                                    class267 var163 = class153.field2169.method1585(3, var162);
                                    if (var163 != null && var163.field3919 != null) {
                                        class20.method183(var150.field6335, 0, var150.field6328, var150.field6334, true, var163, false);
                                    }
                                }
                            }
                        } else {
                            var150.field1687 = var146;
                            var150.field1703 = 0;
                            var150.field1770 = 1;
                            var150.field1707 = var144;
                            var150.field1691 = var147 & 0x7;
                            var150.field1741 = class263.field3867 + var143;
                            var150.field1712 = 0;
                            if (var150.field1741 > class263.field3867) {
                                var150.field1703 = -1;
                            }
                            if (var150.field1707 != -1 && class263.field3867 == var150.field1741) {
                                int var160 = class151.field2145.method2115(arg0 - 138, var150.field1707).field4611;
                                if (var160 != -1) {
                                    class267 var161 = class153.field2169.method1585(3, var160);
                                    if (var161 != null && var161.field3919 != null) {
                                        class20.method183(var150.field6335, 0, var150.field6328, var150.field6334, true, var161, false);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var145 >> 28 != 0) {
                int var164 = var145 & 0xFFFF;
                class364 var165;
                if (class396.field5815 == var164) {
                    var165 = class435.field6375;
                } else {
                    var165 = class384.field5647[var164];
                }
                if (var165 != null) {
                    if (var144 == 65535) {
                        var144 = -1;
                    }
                    boolean var166 = true;
                    int var167 = var148 ? var165.field1728 : var165.field1707;
                    if (var144 != -1 && var167 != -1) {
                        if (var144 == var167) {
                            class330 var172 = class151.field2145.method2115(-137, var144);
                            if (var172.field4606 && var172.field4611 != -1) {
                                class267 var173 = class153.field2169.method1585(3, var172.field4611);
                                int var174 = var173.field3932;
                                if (var174 == 0 || var174 == 2) {
                                    var166 = false;
                                } else if (var174 == 1) {
                                    var166 = true;
                                }
                            }
                        } else {
                            class330 var168 = class151.field2145.method2115(arg0 ^ 0xFFFFFF76, var144);
                            class330 var169 = class151.field2145.method2115(-137, var167);
                            if (var168.field4611 != -1 && var169.field4611 != -1) {
                                class267 var170 = class153.field2169.method1585(arg0 ^ 0x2, var168.field4611);
                                class267 var171 = class153.field2169.method1585(arg0 + 2, var169.field4611);
                                if (var171.field3942 > var170.field3942) {
                                    var166 = false;
                                }
                            }
                        }
                    }
                    if (var166) {
                        if (var148) {
                            var165.field1739 = var147 & 0x7;
                            var165.field1728 = var144;
                            var165.field1736 = var146;
                            var165.field1754 = 1;
                            var165.field1751 = class263.field3867 + var143;
                            var165.field1697 = 0;
                            var165.field1747 = 0;
                            if (var165.field1728 == 65535) {
                                var165.field1728 = -1;
                            }
                            if (var165.field1751 > class263.field3867) {
                                var165.field1697 = -1;
                            }
                            if (var165.field1728 != -1 && class263.field3867 == var165.field1751) {
                                int var177 = class151.field2145.method2115(-137, var165.field1728).field4611;
                                if (var177 != -1) {
                                    class267 var178 = class153.field2169.method1585(3, var177);
                                    if (var178 != null && var178.field3919 != null) {
                                        class20.method183(var165.field6335, 0, var165.field6328, var165.field6334, true, var178, class435.field6375 == var165);
                                    }
                                }
                            }
                        } else {
                            var165.field1691 = var147 & 0x7;
                            var165.field1712 = 0;
                            var165.field1687 = var146;
                            var165.field1770 = 1;
                            var165.field1707 = var144;
                            var165.field1741 = class263.field3867 + var143;
                            var165.field1703 = 0;
                            if (var165.field1707 == 65535) {
                                var165.field1707 = -1;
                            }
                            if (var165.field1741 > class263.field3867) {
                                var165.field1703 = -1;
                            }
                            if (var165.field1707 != -1 && class263.field3867 == var165.field1741) {
                                int var175 = class151.field2145.method2115(arg0 - 138, var165.field1707).field4611;
                                if (var175 != -1) {
                                    class267 var176 = class153.field2169.method1585(3, var175);
                                    if (var176 != null && var176.field3919 != null) {
                                        class20.method183(var165.field6335, 0, var165.field6328, var165.field6334, true, var176, class435.field6375 == var165);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class442.field6560 == class169.field2395) {
            int var186 = class85.field1163.method623((byte) 105);
            int var187 = class85.field1163.method577(255);
            boolean var188 = (var187 & 0x1) == 1;
            class497.method2976(var186, 0, var188);
            int var189 = class85.field1163.method623((byte) 89);
            for (int var190 = 0; var190 < var189; var190++) {
                int var191 = class85.field1163.method576((byte) -37);
                if (var191 == 255) {
                    var191 = class85.field1163.method598(72);
                }
                int var192 = class85.field1163.method623((byte) -87);
                class215.method1464(var190, var192 - 1, -1, var186, var191, var188);
            }
            class61.field708[method2089(class509.field7511++, 31)] = var186;
            class169.field2395 = null;
            return true;
        } else if (class180.field2535 == class169.field2395) {
            String var193 = class85.field1163.method624((byte) -40);
            String var194 = class450.method2723(class405.method2479(false, class85.field1163), (byte) 89);
            class331.method2032(0, 6, var194, var193, var193, true);
            class169.field2395 = null;
            return true;
        } else if (class410.field6102 == class169.field2395) {
            int var195 = class85.field1163.method625(arg0 + 122);
            int var196 = class85.field1163.method635(952968608);
            if (var196 == 65535) {
                var196 = -1;
            }
            int var197 = class85.field1163.method616((byte) 93);
            int var198 = class85.field1163.method578(-103);
            if (class397.method2433(var195, -32291)) {
                class4.method37(arg0 ^ 0xFFFFFF89, var198, var197, var196);
                class72 var199 = class270.field3995.method6(22883, var196);
                class194.method1357(var198, (byte) -63, var199.field909, var199.field927, var199.field934);
                class283.method1803(var199.field953, var199.field972, (byte) 53, var198, var199.field931);
            }
            class169.field2395 = null;
            return true;
        } else if (class169.field2395 == class144.field2022) {
            int var200 = class85.field1163.method625(125);
            int var201 = class85.field1163.method602((byte) 55);
            int var202 = class85.field1163.method623((byte) -90);
            int var203 = class85.field1163.method635(952968608);
            int var204 = class85.field1163.method578(arg0 ^ 0xFFFFFF8A);
            if (class397.method2433(var203, -32291)) {
                class510.method3036(7, -74, var204, var201 | var202 << 16, var200);
            }
            class169.field2395 = null;
            return true;
        } else if (class480.field7062 == class169.field2395) {
            int var205 = class85.field1163.method635(952968608);
            int var206 = class85.field1163.method635(arg0 + 952968607);
            int var207 = class85.field1163.method616((byte) 86);
            int var208 = class85.field1163.method625(122);
            int var209 = class85.field1163.method623((byte) -124);
            if (class397.method2433(var205, -32291)) {
                class194.method1357(var207, (byte) -60, var209, var208, var206);
            }
            class169.field2395 = null;
            return true;
        } else if (class400.field5939 == class169.field2395) {
            class181.method1274((byte) -30, true);
            class169.field2395 = null;
            return true;
        } else if (class263.field3864 == class169.field2395) {
            int var210 = class85.field1163.method623((byte) -90);
            byte var211 = class85.field1163.method594(0);
            class253.field3739.method2745(arg0 - 119, var210, var211);
            class169.field2395 = null;
            return true;
        } else if (class85.field1162 == class169.field2395) {
            int var212 = class85.field1163.method577(255);
            if (class85.field1163.method577(255) == 0) {
                class404.field5978[var212] = new class482();
            } else {
                class85.field1163.field827--;
                class404.field5978[var212] = new class482(class85.field1163);
            }
            class40.field458 = class49.field548;
            class169.field2395 = null;
            return true;
        } else if (class429.field6313 == class169.field2395) {
            boolean var213 = class85.field1163.method577(255) == 1;
            String var214 = class85.field1163.method624((byte) -40);
            String var215 = var214;
            if (var213) {
                var215 = class85.field1163.method624((byte) -40);
            }
            long var216 = (long) class85.field1163.method623((byte) 120);
            long var218 = (long) class85.field1163.method580((byte) 29);
            int var220 = class85.field1163.method577(255);
            long var221 = (var216 << 32) + var218;
            boolean var223 = false;
            int var224 = 0;
            while (true) {
                if (var224 >= 100) {
                    if (var220 <= 1) {
                        if (!(!class388.field5741 || class53.field582) || class411.field6107) {
                            var223 = true;
                        } else if (class88.method778(var215, false)) {
                            var223 = true;
                        }
                    }
                    break;
                }
                if (class339.field4704[var224] == var221) {
                    var223 = true;
                    break;
                }
                var224++;
            }
            if (!var223 && class368.field5478 == 0) {
                class339.field4704[class291.field4188] = var221;
                class291.field4188 = (class291.field4188 + 1) % 100;
                String var225 = class450.method2723(class405.method2479(false, class85.field1163), (byte) 111);
                if (var220 == 2) {
                    class11.method77((byte) 115, -1, "<img=1>" + var215, var225, null, 0, "<img=1>" + var214, 7);
                } else if (var220 == 1) {
                    class11.method77((byte) 82, -1, "<img=0>" + var215, var225, null, 0, "<img=0>" + var214, 7);
                } else {
                    class11.method77((byte) 70, -1, var215, var225, null, 0, var214, 3);
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class253.field3735 == class169.field2395) {
            int var226 = class85.field1163.method625(arg0 ^ 0x7A);
            int var227 = class85.field1163.method607(27574);
            int var228 = class85.field1163.method625(120);
            class461 var229 = class250.field3690[var226];
            if (var229 != null) {
                class75.method708(var228, var227, 1, var229);
            }
            class169.field2395 = null;
            return true;
        } else if (class3.field34 == class169.field2395) {
            class188.field2696 = class85.field1163.method577(255);
            for (int var230 = 0; var230 < class188.field2696; var230++) {
                class397.field5820[var230] = class85.field1163.method624((byte) -40);
                class474.field6987[var230] = class85.field1163.method624((byte) -40);
                if (class474.field6987[var230].equals("")) {
                    class474.field6987[var230] = class397.field5820[var230];
                }
                class367.field5467[var230] = class85.field1163.method624((byte) -40);
                class94.field1279[var230] = class85.field1163.method624((byte) -40);
                if (class94.field1279[var230].equals("")) {
                    class94.field1279[var230] = class367.field5467[var230];
                }
                class244.field3598[var230] = false;
            }
            class169.field2395 = null;
            class444.field6577 = class49.field548;
            return true;
        } else if (class213.field3062 == class169.field2395) {
            boolean var231 = class85.field1163.method577(arg0 + 254) == 1;
            String var232 = class85.field1163.method624((byte) -40);
            String var233 = var232;
            if (var231) {
                var233 = class85.field1163.method624((byte) -40);
            }
            long var234 = class85.field1163.method588(true);
            long var236 = (long) class85.field1163.method623((byte) 98);
            long var238 = (long) class85.field1163.method580((byte) 29);
            int var240 = class85.field1163.method577(255);
            int var241 = class85.field1163.method623((byte) -122);
            long var242 = (var236 << 32) + var238;
            boolean var244 = false;
            int var245 = 0;
            while (true) {
                if (var245 >= 100) {
                    if (var240 <= 1 && class88.method778(var233, false)) {
                        var244 = true;
                    }
                    break;
                }
                if (class339.field4704[var245] == var242) {
                    var244 = true;
                    break;
                }
                var245++;
            }
            if (!var244 && class368.field5478 == 0) {
                class339.field4704[class291.field4188] = var242;
                class291.field4188 = (class291.field4188 + 1) % 100;
                String var246 = class95.field1280.method2335(var241, (byte) -99).method3069(class85.field1163, arg0 - 128);
                if (var240 == 2) {
                    class11.method77((byte) 117, var241, "<img=1>" + var233, var246, class359.method2161(var234, arg0 ^ 0xFFFFFFB5), 0, "<img=1>" + var232, 20);
                } else if (var240 == 1) {
                    class11.method77((byte) 126, var241, "<img=0>" + var233, var246, class359.method2161(var234, -116), 0, "<img=0>" + var232, 20);
                } else {
                    class11.method77((byte) 120, var241, var233, var246, class359.method2161(var234, -112), 0, var232, 20);
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class27.field322 == class169.field2395) {
            for (int var247 = 0; var247 < class384.field5647.length; var247++) {
                if (class384.field5647[var247] != null) {
                    class384.field5647[var247].field1696 = -1;
                }
            }
            for (int var248 = 0; var248 < class250.field3690.length; var248++) {
                if (class250.field3690[var248] != null) {
                    class250.field3690[var248].field1696 = -1;
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class389.field5747 == class169.field2395) {
            int var249 = class85.field1163.method623((byte) 126);
            if (class397.method2433(var249, arg0 - 32292)) {
                class510.method3035(-18006);
            }
            class169.field2395 = null;
            return true;
        } else if (class376.field5569 == class169.field2395) {
            class193.field2813 = class49.field548;
            if (class26.field314 == 0) {
                class158.field2242 = null;
                class169.field2395 = null;
                class24.field288 = null;
                class221.field3177 = 0;
                class391.field5758 = null;
                return true;
            }
            class391.field5758 = class85.field1163.method624((byte) -40);
            boolean var250 = class85.field1163.method577(255) == 1;
            if (var250) {
                class85.field1163.method624((byte) -40);
            }
            long var251 = class85.field1163.method588(true);
            class158.field2242 = class199.method1403(arg0 + 106, var251);
            class280.field4100 = class85.field1163.method629(false);
            int var253 = class85.field1163.method577(255);
            if (var253 == 255) {
                class169.field2395 = null;
                return true;
            }
            class221.field3177 = var253;
            class256[] var254 = new class256[100];
            for (int var255 = 0; var255 < class221.field3177; var255++) {
                var254[var255] = new class256();
                var254[var255].field3756 = class85.field1163.method624((byte) -40);
                boolean var261 = class85.field1163.method577(255) == 1;
                if (var261) {
                    var254[var255].field3755 = class85.field1163.method624((byte) -40);
                } else {
                    var254[var255].field3755 = var254[var255].field3756;
                }
                var254[var255].field3754 = class499.method2994(var254[var255].field3755, (byte) -49);
                var254[var255].field3759 = class85.field1163.method623((byte) -127);
                var254[var255].field3757 = class85.field1163.method629(false);
                var254[var255].field3751 = class85.field1163.method624((byte) -40);
                if (var254[var255].field3755.equals(class435.field6375.field5074)) {
                    class491.field7196 = var254[var255].field3757;
                }
            }
            boolean var256 = false;
            int var257 = class221.field3177;
            while (var257 > 0) {
                boolean var258 = true;
                var257--;
                for (int var259 = 0; var259 < var257; var259++) {
                    if (var254[var259].field3754.compareTo(var254[var259 + 1].field3754) > 0) {
                        class256 var260 = var254[var259];
                        var254[var259] = var254[var259 + 1];
                        var258 = false;
                        var254[var259 + 1] = var260;
                    }
                }
                if (var258) {
                    break;
                }
            }
            class24.field288 = var254;
            class169.field2395 = null;
            return true;
        } else if (class402.field5966 == class169.field2395) {
            class253.field3739.method2744(126);
            class125.field1837 += 32;
            class169.field2395 = null;
            return true;
        } else if (class475.field6999 == class169.field2395) {
            int var262 = class85.field1163.method625(117);
            int var263 = class85.field1163.method602((byte) 55);
            if (var263 == 65535) {
                var263 = -1;
            }
            int var264 = class85.field1163.method597(44);
            if (class397.method2433(var262, -32291)) {
                class510.method3036(1, -107, var264, var263, -1);
            }
            class169.field2395 = null;
            return true;
        } else if (class198.field2897 == class169.field2395) {
            int var265 = class85.field1163.method616((byte) 104);
            int var266 = class85.field1163.method635(952968608);
            if (class397.method2433(var266, arg0 - 32292)) {
                class510.method3036(5, -101, var265, class396.field5815, 0);
            }
            class169.field2395 = null;
            return true;
        } else if (class485.field7131 == class169.field2395) {
            int var267 = class85.field1163.method623((byte) 109);
            int var268 = class85.field1163.method577(255);
            int var269 = class85.field1163.method577(255);
            int var270 = class85.field1163.method623((byte) 100) << 0;
            int var271 = class85.field1163.method577(255);
            int var272 = class85.field1163.method577(arg0 + 254);
            if (class397.method2433(var267, arg0 - 32292)) {
                class310.method1931(var272, var270, var269, var271, -115, var268);
            }
            class169.field2395 = null;
            return true;
        } else if (class375.field5554 == class169.field2395) {
            class169.field2395 = null;
            class444.field6577 = class49.field548;
            class471.field6950 = 1;
            return true;
        } else if (class39.field442 == class169.field2395) {
            int var273 = class85.field1163.method577(arg0 ^ 0xFE);
            boolean var274 = (var273 & 0x1) == 1;
            String var275 = class85.field1163.method624((byte) -40);
            String var276 = class85.field1163.method624((byte) -40);
            if (var276.equals("")) {
                var276 = var275;
            }
            String var277 = class85.field1163.method624((byte) -40);
            String var278 = class85.field1163.method624((byte) -40);
            if (var278.equals("")) {
                var278 = var277;
            }
            if (var274) {
                for (int var279 = 0; var279 < class188.field2696; var279++) {
                    if (class474.field6987[var279].equals(var278)) {
                        class397.field5820[var279] = var275;
                        class474.field6987[var279] = var276;
                        class367.field5467[var279] = var277;
                        class94.field1279[var279] = var278;
                        break;
                    }
                }
            } else {
                class397.field5820[class188.field2696] = var275;
                class474.field6987[class188.field2696] = var276;
                class367.field5467[class188.field2696] = var277;
                class94.field1279[class188.field2696] = var278;
                class244.field3598[class188.field2696] = method2089(var273, 2) == 2;
                class188.field2696++;
            }
            class169.field2395 = null;
            class444.field6577 = class49.field548;
            return true;
        } else if (class372.field5529 == class169.field2395) {
            class150.field2123 = class85.field1163.method577(arg0 + 254);
            class169.field2395 = null;
            class411.field6111 = class49.field548;
            return true;
        } else if (class7.field83 == class169.field2395) {
            class76.field1036 = class85.field1163.method623((byte) -87) * 30;
            class169.field2395 = null;
            class411.field6111 = class49.field548;
            return true;
        } else if (class369.field5486 == class169.field2395) {
            String var280 = class85.field1163.method624((byte) -40);
            int var281 = class85.field1163.method623((byte) 125);
            int var282 = class85.field1163.method597(arg0 ^ 0x7D);
            if (class397.method2433(var281, arg0 - 32292)) {
                class238.method1586(var280, var282, 3);
            }
            class169.field2395 = null;
            return true;
        } else if (class386.field5692 == class169.field2395) {
            class444.method2708(44, class306.field4342);
            class169.field2395 = null;
            return true;
        } else if (class60.field694 == class169.field2395) {
            int var283 = class85.field1163.method635(952968608);
            String var284 = class85.field1163.method624((byte) -40);
            int var285 = class85.field1163.method623((byte) 112);
            if (class397.method2433(var285, arg0 ^ 0xFFFF81DC)) {
                class444.method2706(-113, var284, var283);
            }
            class169.field2395 = null;
            return true;
        } else if (class493.field7216 == class169.field2395) {
            int var286 = class85.field1163.method616((byte) 106);
            int var287 = class85.field1163.method623((byte) -87);
            int var288 = class85.field1163.method625(arg0 + 123);
            if (class397.method2433(var288, -32291)) {
                class445.method2711(var286, var287, (byte) -71);
            }
            class169.field2395 = null;
            return true;
        } else if (class169.field2395 == class122.field1789) {
            class519.method3088(10094);
            class169.field2395 = null;
            return false;
        } else if (class472.field6965 == class169.field2395) {
            int var289 = class85.field1163.method623((byte) -60);
            int var290 = class85.field1163.method597(87);
            int var291 = class85.field1163.method635(952968608);
            if (class397.method2433(var289, -32291)) {
                class386.method2355(false, var291, var290);
            }
            class169.field2395 = null;
            return true;
        } else if (class385.field5651 == class169.field2395) {
            class109.field1550 = class85.field1163.method621(128) << 3;
            class436.field6395 = class85.field1163.method629(false) << 3;
            class92.field1271 = class85.field1163.method610(-105);
            while (class26.field314 > class85.field1163.field827) {
                class372 var292 = class507.method3030(true)[class85.field1163.method577(arg0 ^ 0xFE)];
                class444.method2708(arg0 ^ 0x5A, var292);
            }
            class169.field2395 = null;
            return true;
        } else if (class227.field3308 == class169.field2395) {
            class144.field2023 = class85.field1163.method577(arg0 ^ 0xFE);
            class169.field2395 = null;
            return true;
        } else if (class241.field3573 == class169.field2395) {
            class444.method2708(100, class482.field7087);
            class169.field2395 = null;
            return true;
        } else if (class169.field2395 == class109.field1545) {
            int var293 = class85.field1163.method623((byte) 87);
            if (class397.method2433(var293, -32291)) {
                class487.method2925(true);
            }
            class169.field2395 = null;
            return true;
        } else if (class353.field4930 == class169.field2395) {
            int var294 = class85.field1163.method622(arg0 + 65535);
            int var295 = class85.field1163.method616((byte) 85);
            int var296 = class85.field1163.method622(arg0 + 65535);
            int var297 = class85.field1163.method602((byte) 55);
            if (class397.method2433(var297, -32291)) {
                class155.method1104(var295, var296, var294, -32509);
            }
            class169.field2395 = null;
            return true;
        } else if (class500.field7419 == class169.field2395) {
            int var298 = class85.field1163.method623((byte) 126);
            if (var298 == 65535) {
                var298 = -1;
            }
            int var299 = class85.field1163.method577(255);
            int var300 = class85.field1163.method623((byte) 94);
            int var301 = class85.field1163.method577(255);
            class432.method2621(var298, 0, var299, var301, var300);
            class169.field2395 = null;
            return true;
        } else if (class98.field1314 == class169.field2395) {
            class444.method2708(101, class112.field1579);
            class169.field2395 = null;
            return true;
        } else if (class332.field4624 == class169.field2395) {
            class444.method2708(arg0 ^ 0x7B, class511.field7546);
            class169.field2395 = null;
            return true;
        } else if (class359.field4998 == class169.field2395) {
            int var302 = class85.field1163.method623((byte) 118);
            int var303 = class85.field1163.method577(255);
            int var304 = class85.field1163.method577(255);
            int var305 = class85.field1163.method623((byte) -41) << 0;
            int var306 = class85.field1163.method577(255);
            int var307 = class85.field1163.method577(arg0 + 254);
            if (class397.method2433(var302, -32291)) {
                class463.method2778(var305, true, var307, var304, true, var303, var306);
            }
            class169.field2395 = null;
            return true;
        } else if (class67.field870 == class169.field2395) {
            int var308 = class85.field1163.method623((byte) -107);
            if (var308 == 65535) {
                var308 = -1;
            }
            int var309 = class85.field1163.method577(255);
            int var310 = class85.field1163.method623((byte) -41);
            int var311 = class85.field1163.method577(255);
            class148.method1068(var309, var310, false, var308, var311);
            class169.field2395 = null;
            return true;
        } else if (class169.field2395 == class167.field2373) {
            class444.method2708(122, class276.field4068);
            class169.field2395 = null;
            return true;
        } else if (class37.field407 == class169.field2395) {
            class181.method1274((byte) -30, false);
            class169.field2395 = null;
            return true;
        } else if (class169.field2395 == class149.field2113) {
            int var312 = class85.field1163.method576((byte) 125);
            int var313 = class85.field1163.method597(114);
            int var314 = class85.field1163.method635(arg0 + 952968607);
            if (class397.method2433(var314, -32291)) {
                class272.method1754(var312, var313, (byte) -109);
            }
            class169.field2395 = null;
            return true;
        } else if (class325.field4573 == class169.field2395) {
            String var315 = class85.field1163.method624((byte) -40);
            boolean var316 = class85.field1163.method577(arg0 ^ 0xFE) == 1;
            String var317;
            if (var316) {
                var317 = class85.field1163.method624((byte) -40);
            } else {
                var317 = var315;
            }
            int var318 = class85.field1163.method623((byte) -47);
            byte var319 = class85.field1163.method629(false);
            boolean var320 = false;
            if (var319 == -128) {
                var320 = true;
            }
            if (var320) {
                if (class221.field3177 == 0) {
                    class169.field2395 = null;
                    return true;
                }
                boolean var326 = false;
                int var327;
                for (var327 = 0; class221.field3177 > var327 && (!class24.field288[var327].field3755.equals(var317) || class24.field288[var327].field3759 != var318); var327++) {
                }
                if (var327 < class221.field3177) {
                    while (var327 < (class221.field3177 - 1)) {
                        class24.field288[var327] = class24.field288[var327 + 1];
                        var327++;
                    }
                    class221.field3177--;
                    class24.field288[class221.field3177] = null;
                }
            } else {
                String var321 = class85.field1163.method624((byte) -40);
                class256 var322 = new class256();
                var322.field3756 = var315;
                var322.field3755 = var317;
                var322.field3754 = class499.method2994(var322.field3755, (byte) -47);
                var322.field3757 = var319;
                var322.field3759 = var318;
                var322.field3751 = var321;
                int var323;
                for (var323 = class221.field3177 - 1; var323 >= 0; var323--) {
                    int var324 = class24.field288[var323].field3754.compareTo(var322.field3754);
                    if (var324 == 0) {
                        class24.field288[var323].field3759 = var318;
                        class24.field288[var323].field3757 = var319;
                        class24.field288[var323].field3751 = var321;
                        if (var317.equals(class435.field6375.field5074)) {
                            class491.field7196 = var319;
                        }
                        class193.field2813 = class49.field548;
                        class169.field2395 = null;
                        return true;
                    }
                    if (var324 < 0) {
                        break;
                    }
                }
                if (class221.field3177 >= class24.field288.length) {
                    class169.field2395 = null;
                    return true;
                }
                for (int var325 = class221.field3177 - 1; var325 > var323; var325--) {
                    class24.field288[var325 + 1] = class24.field288[var325];
                }
                if (class221.field3177 == 0) {
                    class24.field288 = new class256[100];
                }
                class24.field288[var323 + 1] = var322;
                class221.field3177++;
                if (var317.equals(class435.field6375.field5074)) {
                    class491.field7196 = var319;
                }
            }
            class169.field2395 = null;
            class193.field2813 = class49.field548;
            return true;
        } else if (class435.field6373 == class169.field2395) {
            class444.method2708(125, class171.field2437);
            class169.field2395 = null;
            return true;
        } else if (class185.field2592 == class169.field2395) {
            class444.method2708(83, class182.field2578);
            class169.field2395 = null;
            return true;
        } else if (class418.field6166 == class169.field2395) {
            int var328 = class85.field1163.method623((byte) 85);
            if (var328 == 65535) {
                var328 = -1;
            }
            int var329 = class85.field1163.method635(952968608);
            int var330 = class85.field1163.method598(55);
            int var331 = class85.field1163.method625(126);
            int var332 = class85.field1163.method623((byte) -65);
            if (var332 == 65535) {
                var332 = -1;
            }
            if (class397.method2433(var329, arg0 - 32292)) {
                for (int var333 = var332; var333 <= var328; var333++) {
                    long var334 = ((long) var330 << 32) + ((long) var333);
                    class278 var336 = (class278) class519.field7638.method875(var334, arg0 + 125);
                    class278 var337;
                    if (var336 != null) {
                        var337 = new class278(var336.field4072, var331);
                        var336.method1525((byte) -40);
                    } else if (var333 == -1) {
                        var337 = new class278(class371.method2286(0, var330).field2691.field4072, var331);
                    } else {
                        var337 = new class278(0, var331);
                    }
                    class519.field7638.method878(var334, -2301, var337);
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class315.field4483 == class169.field2395) {
            int var338 = class85.field1163.method635(952968608);
            String var339 = class85.field1163.method624((byte) -40);
            int var340 = class85.field1163.method635(arg0 + 952968607);
            if (class397.method2433(var338, -32291)) {
                class444.method2706(122, var339, var340);
            }
            class169.field2395 = null;
            return true;
        } else if (class489.field7186 == class169.field2395) {
            class179.method1261((byte) -69, class85.field1163.method624((byte) -40));
            class169.field2395 = null;
            return true;
        } else if (class396.field5797 == class169.field2395) {
            class92.field1271 = class85.field1163.method610(-86);
            class109.field1550 = class85.field1163.method621(128) << 3;
            class436.field6395 = class85.field1163.method594(0) << 3;
            for (class518 var341 = (class518) class89.field1216.method880((byte) -23); var341 != null; var341 = (class518) class89.field1216.method879((byte) -20)) {
                int var343 = (int) (var341.field3271 & 0x3FFFL);
                int var344 = (int) (var341.field3271 >> 14 & 0x3FFFL);
                int var345 = (int) (var341.field3271 >> 28 & 0x3L);
                if (class92.field1271 == var345 && var343 >= class109.field1550 && (class109.field1550 + 8) > var343 && class436.field6395 <= var344 && class436.field6395 + 8 > var344) {
                    var341.method1525((byte) -97);
                    class325.method2012(class92.field1271, 1546660647, var343, var344);
                }
            }
            for (class199 var342 = (class199) class212.field3057.method1018(38); var342 != null; var342 = (class199) class212.field3057.method1022((byte) -112)) {
                if (class109.field1550 <= var342.field2901 && (class109.field1550 + 8) > var342.field2901 && var342.field2898 >= class436.field6395 && (class436.field6395 + 8) > var342.field2898 && class92.field1271 == var342.field2909) {
                    var342.field2904 = 0;
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class9.field105 == class169.field2395) {
            int var346 = class85.field1163.method598(111);
            int var347 = class85.field1163.method623((byte) 101);
            int var348 = class85.field1163.method635(952968608);
            if (var348 == 65535) {
                var348 = -1;
            }
            if (class397.method2433(var347, arg0 - 32292)) {
                class510.method3036(2, -73, var346, var348, -1);
            }
            class169.field2395 = null;
            return true;
        } else if (class483.field7111 == class169.field2395) {
            int var349 = class85.field1163.method593((byte) 99);
            int var350 = class85.field1163.method616((byte) 98);
            int var351 = class85.field1163.method577(255);
            String var352 = "";
            String var353 = var352;
            if ((var351 & 0x1) != 0) {
                var352 = class85.field1163.method624((byte) -40);
                if ((var351 & 0x2) == 0) {
                    var353 = var352;
                } else {
                    var353 = class85.field1163.method624((byte) -40);
                }
            }
            String var354 = class85.field1163.method624((byte) -40);
            if (var349 == 99) {
                class293.method1856(arg0 + 121, var354);
            } else if (var353.equals("") || !class88.method778(var353, false)) {
                class331.method2032(var350, var349, var354, var352, var353, true);
            } else {
                class169.field2395 = null;
                return true;
            }
            class169.field2395 = null;
            return true;
        } else if (class448.field6606 == class169.field2395) {
            class188.method1309(arg0 + 7);
            class169.field2395 = null;
            return true;
        } else if (class97.field1310 == class169.field2395) {
            class444.method2708(89, class9.field113);
            class169.field2395 = null;
            return true;
        } else if (class413.field6141 == class169.field2395) {
            int var355 = class85.field1163.method623((byte) 127);
            int var356 = class85.field1163.method616((byte) 81);
            if (class397.method2433(var355, -32291)) {
                class305 var357 = (class305) class49.field545.method875((long) var356, 124);
                if (var357 != null) {
                    class349.method2103(true, var357, false, arg0 - 83);
                }
                if (class454.field6681 != null) {
                    class120.method951(class454.field6681, (byte) -109);
                    class454.field6681 = null;
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class25.field300 == class169.field2395) {
            int var358 = class85.field1163.method610(-108);
            int var359 = var358 >> 2;
            int var360 = var358 & 0x3;
            int var361 = class185.field2596[var359];
            int var362 = class85.field1163.method598(83);
            int var363 = var362 >> 28 & 0x3;
            int var364 = (var362 & 0xFFFE770) >> 14;
            int var365 = var362 & 0x3FFF;
            int var366 = class85.field1163.method625(arg0 + 115);
            int var367 = var365 - class476.field7013;
            if (var366 == 65535) {
                var366 = -1;
            }
            int var368 = var364 - class340.field4713;
            class123.method975(var363, var360, (byte) 119, var366, var361, var359, var368, var367);
            class169.field2395 = null;
            return true;
        } else if (class278.field4081 == class169.field2395) {
            int var369 = class85.field1163.method623((byte) -108);
            int var370 = class85.field1163.method577(255);
            int var371 = class85.field1163.method577(255);
            int var372 = class85.field1163.method577(255);
            int var373 = class85.field1163.method577(arg0 + 254);
            int var374 = class85.field1163.method623((byte) 124);
            if (class397.method2433(var369, -32291)) {
                class173.field2456[var370] = true;
                class400.field5937[var370] = var371;
                class200.field2935[var370] = var372;
                class146.field2051[var370] = var373;
                class442.field6562[var370] = var374;
            }
            class169.field2395 = null;
            return true;
        } else if (class236.field3455 == class169.field2395) {
            class444.method2708(arg0 ^ 0x4F, class104.field1446);
            class169.field2395 = null;
            return true;
        } else if (class27.field324 == class169.field2395) {
            class7.field87 = class26.field314 > 2 ? class85.field1163.method624((byte) -40) : class484.field7117.method2031(true, class377.field5585);
            class456.field6706 = class26.field314 > 0 ? class85.field1163.method623((byte) -89) : -1;
            class169.field2395 = null;
            if (class456.field6706 == 65535) {
                class456.field6706 = -1;
            }
            return true;
        } else if (class169.field2395 == class167.field2368) {
            int var375 = class85.field1163.method616((byte) 124);
            class108.field1542 = class498.field7404.method2562((byte) 122, var375);
            class169.field2395 = null;
            return true;
        } else if (class203.field2944 == class169.field2395) {
            class110.field1553 = class336.method2053(0, class85.field1163.method577(255));
            class169.field2395 = null;
            return true;
        } else if (class99.field1333 == class169.field2395) {
            class289.method1829(class85.field1163, class26.field314, class498.field7404, arg0 - 12509);
            class169.field2395 = null;
            return true;
        } else if (class169.field2395 == class136.field1959) {
            int var376 = class85.field1163.method602((byte) 55);
            int var377 = class85.field1163.method623((byte) -123);
            byte var378 = class85.field1163.method621(arg0 + 127);
            if (class397.method2433(var376, arg0 ^ 0xFFFF81DC)) {
                class393.method2411(1, var377, var378);
            }
            class169.field2395 = null;
            return true;
        } else if (class205.field2995 == class169.field2395) {
            class85.field1163.field827 += 28;
            if (class85.field1163.method587(true)) {
                class86.method762(class85.field1163, arg0 - 114, class85.field1163.field827 + -28);
            }
            class169.field2395 = null;
            return true;
        } else if (class53.field579 == class169.field2395) {
            int var379 = class85.field1163.method602((byte) 55);
            int var380 = class85.field1163.method602((byte) 55);
            int var381 = class85.field1163.method616((byte) 126);
            int var382 = class85.field1163.method602((byte) 55);
            if (class397.method2433(var379, arg0 - 32292)) {
                class513.method3054(72, var381, (var382 << 16) + var380);
            }
            class169.field2395 = null;
            return true;
        } else if (class92.field1265 == class169.field2395) {
            class444.method2708(89, class102.field1431);
            class169.field2395 = null;
            return true;
        } else if (class273.field4031 == class169.field2395) {
            int var383 = class85.field1163.method598(arg0 ^ 0x3C);
            int var384 = class85.field1163.method597(118);
            int var385 = class85.field1163.method625(118);
            if (class397.method2433(var385, arg0 ^ 0xFFFF81DC)) {
                class305 var386 = (class305) class49.field545.method875((long) var384, arg0 + 126);
                class305 var387 = (class305) class49.field545.method875((long) var383, 124);
                if (var387 != null) {
                    class349.method2103(var386 == null || var386.field4333 != var387.field4333, var387, false, -36);
                }
                if (var386 != null) {
                    var386.method1525((byte) 119);
                    class49.field545.method878((long) var383, -2301, var386);
                }
                class188 var388 = class371.method2286(0, var384);
                if (var388 != null) {
                    class120.method951(var388, (byte) -109);
                }
                class188 var389 = class371.method2286(0, var383);
                if (var389 != null) {
                    class120.method951(var389, (byte) -109);
                    class140.method1050(var389, arg0 ^ 0xFFFFFFFE, true);
                }
                if (class64.field761 != -1) {
                    class389.method2393(class64.field761, -1, 1);
                }
            }
            class169.field2395 = null;
            return true;
        } else if (class198.field2891 == class169.field2395) {
            boolean var390 = class85.field1163.method577(255) == 1;
            String var391 = class85.field1163.method624((byte) -40);
            String var392 = var391;
            if (var390) {
                var392 = class85.field1163.method624((byte) -40);
            }
            long var393 = class85.field1163.method588(true);
            long var395 = (long) class85.field1163.method623((byte) -80);
            long var397 = (long) class85.field1163.method580((byte) 29);
            int var399 = class85.field1163.method577(arg0 + 254);
            long var400 = (var395 << 32) + var397;
            boolean var402 = false;
            int var403 = 0;
            while (true) {
                if (var403 >= 100) {
                    if (var399 <= 1) {
                        if (!(!class388.field5741 || class53.field582) || class411.field6107) {
                            var402 = true;
                        } else if (class88.method778(var392, false)) {
                            var402 = true;
                        }
                    }
                    break;
                }
                if (class339.field4704[var403] == var400) {
                    var402 = true;
                    break;
                }
                var403++;
            }
            if (!var402 && class368.field5478 == 0) {
                class339.field4704[class291.field4188] = var400;
                class291.field4188 = (class291.field4188 + 1) % 100;
                String var404 = class450.method2723(class405.method2479(false, class85.field1163), (byte) 77);
                if (var399 == 2 || var399 == 3) {
                    class11.method77((byte) 117, -1, "<img=1>" + var392, var404, class359.method2161(var393, -113), 0, "<img=1>" + var391, 9);
                } else if (var399 == 1) {
                    class11.method77((byte) 110, -1, "<img=0>" + var392, var404, class359.method2161(var393, arg0 - 98), 0, "<img=0>" + var391, 9);
                } else {
                    class11.method77((byte) 92, -1, var392, var404, class359.method2161(var393, arg0 - 77), 0, var391, 9);
                }
            }
            class169.field2395 = null;
            return true;
        } else {
            class194.method1362(null, "T1 - " + (class169.field2395 == null ? -1 : class169.field2395.method2001(arg0 ^ -114)) + "," + (class434.field6366 == null ? -1 : class434.field6366.method2001(-116)) + "," + (class393.field5780 == null ? -1 : class393.field5780.method2001(-96)) + " - " + class26.field314, 96);
            class531.method3135(2700);
            return true;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
    public static final void method2085(int arg0) {
        class230.field3367.method1105(false);
        field4785++;
        if (arg0 != -1) {
            field4780 = 85L;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V")
    public final void method2086(boolean arg0) {
        this.field4781 = this.field4781 << 8 | this.field4795;
        field4789++;
        if (this.field4783 == -1) {
            this.field4783 = this.field4786;
        }
        if (arg0) {
            this.method2086(false);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILiv;I)V")
    private final void method2087(int arg0, class65 arg1, int arg2) {
        field4777++;
        if (arg0 <= 34) {
            method2088((byte) 50, -64);
        }
        if (arg2 == 1) {
            this.field4791 = class314.method1961(117, arg1.method580((byte) 29));
        } else if (arg2 == 2) {
            this.field4786 = arg1.method577(255);
            return;
        } else if (arg2 == 3) {
            this.field4786 = arg1.method623((byte) 95);
            if (this.field4786 == 65535) {
                this.field4786 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field4797 = false;
            return;
        } else if (arg2 == 7) {
            this.field4778 = class314.method1961(116, arg1.method580((byte) 29));
            return;
        } else if (arg2 == 8) {
            this.field4779.field7132 = this.field4795;
            return;
        } else if (arg2 == 9) {
            this.field4782 = arg1.method623((byte) -125) << 0;
            return;
        } else if (arg2 == 10) {
            this.field4790 = false;
            return;
        } else if (arg2 == 11) {
            this.field4781 = arg1.method577(255);
            return;
        } else if (arg2 == 12) {
            this.field4788 = true;
            return;
        } else if (arg2 == 13) {
            this.field4784 = arg1.method580((byte) 29);
            return;
        } else {
            if (arg2 == 14) {
                this.field4793 = arg1.method577(255);
            } else if (arg2 == 15) {
                this.field4783 = arg1.method623((byte) 117);
                if (this.field4783 == 65535) {
                    this.field4783 = -1;
                    return;
                }
            } else if (arg2 == 16) {
                this.field4794 = arg1.method577(255);
                return;
            } else {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BI)I")
    public static final int method2088(byte arg0, int arg1) {
        if (arg0 != -86) {
            field4780 = -59L;
        }
        field4792++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
    public static int method2089(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILiv;)V")
    public final void method2090(int arg0, class65 arg1) {
        while (true) {
            int var3 = arg1.method577(255);
            if (var3 == 0) {
                field4796++;
                if (arg0 >= -38) {
                    this.method2090(-76, null);
                    return;
                }
                return;
            }
            this.method2087(50, arg1, var3);
        }
    }
}
