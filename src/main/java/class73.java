import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class73 {

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    private int field1205 = 128;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public int field1194 = -1;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    private int field1204 = 128;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    private int field1208 = 0;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    private int field1200 = 0;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    private int field1211 = 0;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "Z")
    public boolean field1207 = false;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lda;")
    public static class275 field1188 = class255.method1672(125, "details");

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lda;")
    public static class275 field1191 = class255.method1672(104, "Okay");

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Lda;")
    private static class275 field1202 = class255.method1672(109, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field1198 = 0;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lda;")
    public static class275 field1187 = field1202;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lda;")
    public static class275 field1192 = class255.method1672(126, ")4");

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[Z")
    public static boolean[] field1195 = new boolean[5];

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field1189 = 0;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lda;")
    public static class275 field1193 = class255.method1672(103, "overlay2");

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Llg;")
    public static class266 field1203;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[S")
    private short[] field1181;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "[S")
    private short[] field1182;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[S")
    private short[] field1183;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "[S")
    private short[] field1199;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
    public static final void method474(int arg0, int arg1, int arg2) {
        field1186++;
        if (arg1 >= -117) {
            method483((byte) -71, -92);
        }
        if (class52.field863 < 2 && class190.field3272 == 0 && !class144.field2523) {
            return;
        }
        class275 var3;
        if (class190.field3272 == 1 && class52.field863 < 2) {
            var3 = class197.method1291(new class275[] { class165.field2869, class116.field2073, class210.field3550, class67.field1096 }, -30025);
        } else if (class144.field2523 && class52.field863 < 2) {
            var3 = class197.method1291(new class275[] { class103.field1715, class116.field2073, class19.field266, class67.field1096 }, -30025);
        } else {
            var3 = class269.method1774(class52.field863 - 1, (byte) 39);
        }
        if (class52.field863 > 2) {
            var3 = class197.method1291(new class275[] { var3, class261.field4540, class250.method1644(class52.field863 - 2, (byte) -115), class211.field3582 }, -30025);
        }
        int var4 = class93.field1599.method123(var3, arg2 + 4, arg0 + 15, 16777215, 0, class195.field3334, class237.field4127);
        class102.method733(15, arg2 + 4, var4 + class93.field1599.method113(var3), (byte) -77, arg0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLij;)V")
    public final void method475(boolean arg0, class85 arg1) {
        field1185++;
        if (!arg0) {
            method483((byte) 19, -97);
        }
        while (true) {
            int var3 = arg1.method564((byte) 64);
            if (var3 == 0) {
                return;
            }
            this.method476(var3, (byte) -126, arg1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBLij;)V")
    private final void method476(int arg0, byte arg1, class85 arg2) {
        field1196++;
        if (arg1 > -121) {
            return;
        }
        if (arg0 == 1) {
            this.field1210 = arg2.method608(79);
        } else if (arg0 == 2) {
            this.field1194 = arg2.method608(20);
        } else if (arg0 == 4) {
            this.field1204 = arg2.method608(122);
        } else if (arg0 == 5) {
            this.field1205 = arg2.method608(99);
        } else if (arg0 == 6) {
            this.field1208 = arg2.method608(77);
        } else if (arg0 == 7) {
            this.field1211 = arg2.method564((byte) 122);
        } else if (arg0 == 8) {
            this.field1200 = arg2.method564((byte) 118);
            return;
        } else if (arg0 == 9) {
            this.field1207 = true;
            return;
        } else if (arg0 == 40) {
            int var4 = arg2.method564((byte) 93);
            this.field1199 = new short[var4];
            this.field1182 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1199[var5] = (short) arg2.method608(106);
                this.field1182[var5] = (short) arg2.method608(113);
            }
            return;
        } else if (arg0 == 41) {
            int var6 = arg2.method564((byte) 94);
            this.field1183 = new short[var6];
            this.field1181 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1181[var7] = (short) arg2.method608(16);
                this.field1183[var7] = (short) arg2.method608(19);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method477(int arg0) {
        field1191 = null;
        field1187 = null;
        field1203 = null;
        field1193 = null;
        if (arg0 != 18) {
            method478(-124, -37, -71);
        }
        field1202 = null;
        field1195 = null;
        field1192 = null;
        field1188 = null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)Lh;")
    public static final class139 method478(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class139 var4 = var3.field50;
            var3.field50 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lda;IIII)V")
    public static final void method479(class275 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1190++;
        class229 var5 = class182.method1219((byte) 114, arg2, arg4);
        if (var5 == null) {
            return;
        }
        if (var5.field3914 != null) {
            class99 var6 = new class99();
            var6.field1676 = arg0;
            var6.field1678 = var5.field3914;
            var6.field1677 = var5;
            var6.field1664 = arg3;
            class177.method1192(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field3886 > 0) {
            var7 = class108.method799((byte) 9, var5);
        }
        if (!var7 || !class182.method1221(128, client.method635(var5), arg3 - 1)) {
            return;
        }
        if (arg3 == 1) {
            class270.field4694++;
            class149.field2597.method526((byte) -53, 122);
            class149.field2597.method586(122, arg2);
            class149.field2597.method600(arg4, (byte) 76);
        }
        if (arg1 != -11624) {
            return;
        }
        if (arg3 == 2) {
            class149.field2597.method526((byte) -44, 245);
            class252.field4471++;
            class149.field2597.method586(-125, arg2);
            class149.field2597.method600(arg4, (byte) 30);
        }
        if (arg3 == 3) {
            class149.field2597.method526((byte) -116, 107);
            class149.field2597.method586(arg1 + 11697, arg2);
            class179.field3078++;
            class149.field2597.method600(arg4, (byte) 37);
        }
        if (arg3 == 4) {
            class149.field2597.method526((byte) -127, 69);
            class149.field2597.method586(-93, arg2);
            class149.field2597.method600(arg4, (byte) 40);
            class164.field2855++;
        }
        if (arg3 == 5) {
            class267.field4629++;
            class149.field2597.method526((byte) -52, 213);
            class149.field2597.method586(-125, arg2);
            class149.field2597.method600(arg4, (byte) 105);
        }
        if (arg3 == 6) {
            class149.field2597.method526((byte) -125, 27);
            class149.field2597.method586(98, arg2);
            class184.field3158++;
            class149.field2597.method600(arg4, (byte) 51);
        }
        if (arg3 == 7) {
            class149.field2597.method526((byte) -121, 138);
            class50.field835++;
            class149.field2597.method586(-97, arg2);
            class149.field2597.method600(arg4, (byte) 80);
        }
        if (arg3 == 8) {
            class149.field2597.method526((byte) -81, 37);
            class185.field3163++;
            class149.field2597.method586(-101, arg2);
            class149.field2597.method600(arg4, (byte) 75);
        }
        if (arg3 == 9) {
            class149.field2597.method526((byte) -77, 130);
            class149.field2597.method586(115, arg2);
            class149.field2597.method600(arg4, (byte) 101);
            class244.field4261++;
        }
        if (arg3 == 10) {
            class9.field142++;
            class149.field2597.method526((byte) -101, 23);
            class149.field2597.method586(arg1 ^ 0x2D39, arg2);
            class149.field2597.method600(arg4, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Z")
    public static final boolean method480(boolean arg0) throws IOException {
        field1201++;
        if (class52.field866 == null) {
            return false;
        }
        int var1 = class52.field866.method1404(-1048);
        if (var1 == 0) {
            return false;
        }
        if (class268.field4650 == -1) {
            class52.field866.method1406(0, class196.field3351.field1381, 1, -120);
            var1--;
            class196.field3351.field1392 = 0;
            class268.field4650 = class196.field3351.method517((byte) -78);
            class59.field1000 = class232.field4064[class268.field4650];
        }
        if (class59.field1000 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class52.field866.method1406(0, class196.field3351.field1381, 1, -111);
            var1--;
            class59.field1000 = class196.field3351.field1381[0] & 0xFF;
        }
        if (class59.field1000 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class52.field866.method1406(0, class196.field3351.field1381, 2, -95);
            class196.field3351.field1392 = 0;
            var1 -= 2;
            class59.field1000 = class196.field3351.method608(54);
        }
        if (class59.field1000 > var1) {
            return false;
        }
        class196.field3351.field1392 = 0;
        class52.field866.method1406(0, class196.field3351.field1381, class59.field1000, -120);
        class72.field1165 = class108.field1873;
        class108.field1873 = class247.field4362;
        class247.field4362 = class268.field4650;
        class210.field3558 = 0;
        if (class268.field4650 == 194) {
            int var2 = class196.field3351.method579(117);
            class148.field2576 = class3.field24.method367(var2, 108);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 151) {
            class41.method236(260, class196.field3351.method599(-1));
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 157) {
            int var3 = class196.field3351.method562(-119);
            int var4 = class196.field3351.method578(-110);
            int var5 = class196.field3351.method571(-73);
            int var6 = class196.field3351.method578(-121);
            if (class34.method199((byte) -124, var3)) {
                class197.method1289(var6, (byte) -113, var4, var5);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 238) {
            int var7 = class196.field3351.method611(-111);
            int var8 = class196.field3351.method559(0);
            int var9 = class196.field3351.method608(89);
            if (class34.method199((byte) 119, var9)) {
                class119.method875(var8, -907, var7);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 87) {
            class244.method1591((byte) -107);
            class268.field4650 = -1;
            return false;
        } else if (class268.field4650 == 74) {
            byte var10 = class196.field3351.method609(-205131416);
            int var11 = class196.field3351.method566(-1);
            class16.method85(0, var11, var10);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 197) {
            class31.method183(116);
            int var12 = class196.field3351.method559(0);
            int var13 = class196.field3351.method567(-70);
            int var14 = class196.field3351.method571(-117);
            class4.field57[var13] = var14;
            class79.field1303[var13] = var12;
            class19.field273[var13] = 1;
            for (int var15 = 0; var15 < 98; var15++) {
                if (class232.field4054[var15] <= var14) {
                    class19.field273[var13] = var15 + 2;
                }
            }
            class235.field4097[class19.method98(class261.field4544++, 31)] = var13;
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 159) {
            long var16 = class196.field3351.method610(arg0);
            class196.field3351.method581(8);
            long var18 = class196.field3351.method610(arg0);
            long var20 = (long) class196.field3351.method608(94);
            long var22 = (long) class196.field3351.method598(97);
            long var24 = (var20 << 32) + var22;
            int var26 = class196.field3351.method564((byte) 123);
            int var27 = class196.field3351.method608(60);
            boolean var28 = false;
            int var29 = 0;
            label1111: while (true) {
                if (var29 >= 100) {
                    if (var26 <= 1) {
                        for (int var30 = 0; var30 < class16.field240; var30++) {
                            if (class139.field2440[var30] == var16) {
                                var28 = true;
                                break label1111;
                            }
                        }
                    }
                    break;
                }
                if (class114.field2012[var29] == var24) {
                    var28 = true;
                    break;
                }
                var29++;
            }
            if (!var28 && class91.field1550 == 0) {
                class114.field2012[class50.field829] = var24;
                class50.field829 = (class50.field829 + 1) % 100;
                class275 var31 = class170.method1168(32768, var27).method958(-112, class196.field3351);
                if (var26 == 2 || var26 == 3) {
                    class167.method1144(1, 20, var27, class197.method1291(new class275[] { class92.field1564, class181.method1212(0, var16).method1850(97) }, -30025), var31, class181.method1212(0, var18).method1850(97));
                } else if (var26 == 1) {
                    class167.method1144(1, 20, var27, class197.method1291(new class275[] { class139.field2442, class181.method1212(0, var16).method1850(97) }, -30025), var31, class181.method1212(0, var18).method1850(97));
                } else {
                    class167.method1144(1, 20, var27, class181.method1212(0, var16).method1850(97), var31, class181.method1212(0, var18).method1850(97));
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 177) {
            for (int var32 = 0; var32 < class16.field238.length; var32++) {
                if (class16.field238[var32] != null) {
                    class16.field238[var32].field1776 = -1;
                }
            }
            for (int var33 = 0; var33 < class31.field478.length; var33++) {
                if (class31.field478[var33] != null) {
                    class31.field478[var33].field1776 = -1;
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 249) {
            if (class166.field2881 != -1) {
                class37.method222(0, class166.field2881, (byte) -73);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 215) {
            int var34 = class196.field3351.method580(true);
            int var35 = class196.field3351.method580(true);
            if (var34 == 65535) {
                var34 = -1;
            }
            int var36 = class196.field3351.method579(123);
            int var37 = class196.field3351.method568(19845);
            if (class34.method199((byte) -86, var35)) {
                class229 var38 = class261.method1709(var37, -106);
                if (var38.field3884) {
                    class162.method1129(var36, var34, (byte) 91, var37);
                    class245 var40 = class210.method1352(100, var34);
                    class195.method1272(var37, var40.field4274, arg0, var40.field4271, var40.field4304);
                    class60.method379(var40.field4276, var40.field4294, var37, 80, var40.field4308);
                } else if (var34 == -1) {
                    var38.field3902 = 0;
                    class268.field4650 = -1;
                    return true;
                } else {
                    class245 var39 = class210.method1352(56, var34);
                    var38.field3940 = var39.field4304;
                    var38.field3902 = 4;
                    var38.field3932 = var39.field4274;
                    var38.field3985 = var39.field4271 * 100 / var36;
                    var38.field4023 = var34;
                    class40.method231(var38, 0);
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 94) {
            long var41 = class196.field3351.method610(false);
            boolean var43 = false;
            long var44 = (long) class196.field3351.method608(50);
            long var46 = (long) class196.field3351.method598(125);
            int var48 = class196.field3351.method564((byte) 78);
            long var49 = (var44 << 32) + var46;
            int var51 = 0;
            label1138: while (true) {
                if (var51 >= 100) {
                    if (var48 <= 1) {
                        if (class255.field4490 == 1 || class131.field2343 == 1) {
                            var43 = true;
                        } else {
                            for (int var52 = 0; var52 < class16.field240; var52++) {
                                if (class139.field2440[var52] == var41) {
                                    var43 = true;
                                    break label1138;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class114.field2012[var51] == var49) {
                    var43 = true;
                    break;
                }
                var51++;
            }
            if (!var43 && class91.field1550 == 0) {
                class114.field2012[class50.field829] = var49;
                class50.field829 = (class50.field829 + 1) % 100;
                class275 var53 = class21.method111(class233.method1518(class196.field3351, -519).method1849((byte) -3));
                if (var48 == 2 || var48 == 3) {
                    class277.method1874(var53, class197.method1291(new class275[] { class92.field1564, class181.method1212(0, var41).method1850(97) }, -30025), 7, true);
                } else if (var48 == 1) {
                    class277.method1874(var53, class197.method1291(new class275[] { class139.field2442, class181.method1212(0, var41).method1850(97) }, -30025), 7, true);
                } else {
                    class277.method1874(var53, class181.method1212(0, var41).method1850(97), 3, true);
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 40) {
            int var54 = class196.field3351.method562(-120);
            int var55 = class196.field3351.method607(106);
            int var56 = class196.field3351.method568(19845);
            if (class34.method199((byte) -66, var54)) {
                class84.method552((byte) -14, var56, var55);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 242) {
            int var57 = class196.field3351.method562(-123);
            int var58 = class196.field3351.method579(84);
            if (var57 == 65535) {
                var57 = -1;
            }
            int var59 = class196.field3351.method571(115);
            int var60 = class196.field3351.method608(124);
            int var61 = class196.field3351.method562(-120);
            if (var61 == 65535) {
                var61 = -1;
            }
            if (class34.method199((byte) 127, var60)) {
                for (int var62 = var57; var62 <= var61; var62++) {
                    long var63 = ((long) var58 << 32) + (long) var62;
                    class103 var65 = class116.field2055.method1871(0, var63);
                    if (var65 != null) {
                        var65.method741(3);
                    }
                    class116.field2055.method1867(true, var63, new class216(var59));
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 133) {
            int var66 = class196.field3351.method571(22);
            int var67 = class196.field3351.method580(!arg0);
            int var68 = class196.field3351.method566(-1);
            if (class34.method199((byte) -69, var68)) {
                class113.method828(var66, true, var67);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 232) {
            int var69 = class196.field3351.method564((byte) 89);
            int var70 = var69 >> 6;
            class9 var71 = new class9();
            var71.field135 = var69 & 0x3F;
            var71.field138 = class196.field3351.method564((byte) 92);
            if (var71.field138 >= 0 && var71.field138 < class165.field2872.length) {
                if (var71.field135 == 1 || var71.field135 == 10) {
                    var71.field140 = class196.field3351.method608(25);
                    class196.field3351.field1392 += 3;
                } else if (var71.field135 >= 2 && var71.field135 <= 6) {
                    if (var71.field135 == 2) {
                        var71.field136 = 64;
                        var71.field145 = 64;
                    }
                    if (var71.field135 == 3) {
                        var71.field145 = 64;
                        var71.field136 = 0;
                    }
                    if (var71.field135 == 4) {
                        var71.field145 = 64;
                        var71.field136 = 128;
                    }
                    if (var71.field135 == 5) {
                        var71.field136 = 64;
                        var71.field145 = 0;
                    }
                    if (var71.field135 == 6) {
                        var71.field136 = 64;
                        var71.field145 = 128;
                    }
                    var71.field135 = 2;
                    var71.field133 = class196.field3351.method608(31);
                    var71.field141 = class196.field3351.method608(31);
                    var71.field144 = class196.field3351.method564((byte) 55);
                }
                var71.field137 = class196.field3351.method608(23);
                if (var71.field137 == 65535) {
                    var71.field137 = -1;
                }
                class114.field2014[var70] = var71;
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 2) {
            class228.method1472((byte) 125, true);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 11) {
            byte[] var72 = new byte[class59.field1000];
            class196.field3351.method519(0, (byte) -23, var72, class59.field1000);
            class275 var73 = class191.method1256(var72, 66, class59.field1000, 0);
            if (class165.field2870 == null && class58.field979 == 3 || !class58.field975.startsWith("win") || class81.field1326) {
                class200.method1307(var73, 50, true);
            } else {
                class93.field1595 = var73;
                class230.field4033 = true;
                class255.field4492 = class3.field24.method369((byte) -16, new String(var73.method1812((byte) -14), "ISO-8859-1"));
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 63) {
            class65.method445((byte) 126, class196.field3351, class3.field24, class59.field1000);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 68) {
            class120.field2165 = class196.field3351.method564((byte) 76);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 98) {
            int var74 = class196.field3351.method571(-109);
            int var75 = class196.field3351.method579(79);
            int var76 = class196.field3351.method562(-122);
            if (class34.method199((byte) -83, var76)) {
                class112 var77 = (class112) class267.field4633.method1871(0, (long) var75);
                class112 var78 = (class112) class267.field4633.method1871(0, (long) var74);
                if (var78 != null) {
                    class39.method227(var78, var77 == null || var77.field1977 != var78.field1977, 0);
                }
                if (var77 != null) {
                    var77.method741(3);
                    class267.field4633.method1867(true, (long) var74, var77);
                }
                class229 var79 = class261.method1709(var75, -94);
                if (var79 != null) {
                    class40.method231(var79, 0);
                }
                class229 var80 = class261.method1709(var74, -107);
                if (var80 != null) {
                    class40.method231(var80, 0);
                    class92.method666(var80, true, -1811);
                }
                if (class166.field2881 != -1) {
                    class37.method222(1, class166.field2881, (byte) -110);
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 226) {
            int var81 = class196.field3351.method608(25);
            int var82 = class196.field3351.method562(-121);
            if (var82 == 65535) {
                var82 = -1;
            }
            int var83 = class196.field3351.method611(-107);
            if (class34.method199((byte) 119, var81)) {
                class30.method177(var83, 1, var82, -30873);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 61) {
            int var84 = class196.field3351.method566(-1);
            int var85 = class196.field3351.method566(-1);
            int var86 = class196.field3351.method579(98);
            if (class34.method199((byte) 119, var84)) {
                class52.method328(var85, var86, 12);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 236) {
            class17.field254 = class209.field3533;
            long var87 = class196.field3351.method610(false);
            if (var87 == 0L) {
                class225.field3816 = 0;
                class74.field1224 = null;
                class76.field1244 = null;
                class268.field4650 = -1;
                class235.field4098 = null;
                return true;
            }
            long var89 = class196.field3351.method610(false);
            class76.field1244 = class181.method1212(0, var89);
            class235.field4098 = class181.method1212(0, var87);
            class48.field809 = class196.field3351.method581(8);
            int var91 = class196.field3351.method564((byte) 70);
            if (var91 == 255) {
                class268.field4650 = -1;
                return true;
            }
            class225.field3816 = var91;
            class164[] var92 = new class164[100];
            for (int var93 = 0; var93 < class225.field3816; var93++) {
                var92[var93] = new class164();
                var92[var93].field1707 = class196.field3351.method610(false);
                var92[var93].field2860 = class181.method1212(0, var92[var93].field1707);
                var92[var93].field2853 = class196.field3351.method608(17);
                var92[var93].field2861 = class196.field3351.method581(8);
                var92[var93].field2858 = class196.field3351.method599(-1);
                if (class46.field769 == var92[var93].field1707) {
                    class42.field711 = var92[var93].field2861;
                }
            }
            boolean var94 = false;
            int var95 = class225.field3816;
            while (var95 > 0) {
                var95--;
                boolean var96 = true;
                for (int var97 = 0; var97 < var95; var97++) {
                    if (var92[var97].field2860.method1846((byte) 94, var92[var97 + 1].field2860) > 0) {
                        class164 var98 = var92[var97];
                        var96 = false;
                        var92[var97] = var92[var97 + 1];
                        var92[var97 + 1] = var98;
                    }
                }
                if (var96) {
                    break;
                }
            }
            class268.field4650 = -1;
            class74.field1224 = var92;
            return true;
        } else if (class268.field4650 == 121) {
            class91.method657((byte) 93);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 95) {
            class31.method183(115);
            class152.field2669 = class196.field3351.method564((byte) 96);
            class268.field4650 = -1;
            class152.field2661 = class209.field3533;
            return true;
        } else if (class268.field4650 == 134) {
            long var99 = class196.field3351.method610(false);
            class275 var101 = class21.method111(class233.method1518(class196.field3351, -519).method1849((byte) -123));
            class277.method1874(var101, class181.method1212(0, var99).method1850(97), 6, !arg0);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 174) {
            class31.method184(-25218);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 211) {
            long var102 = class196.field3351.method610(false);
            int var104 = class196.field3351.method608(124);
            byte var105 = class196.field3351.method581(8);
            boolean var106 = false;
            if ((var102 & Long.MIN_VALUE) != 0L) {
                var106 = true;
            }
            if (var106) {
                if (class225.field3816 == 0) {
                    class268.field4650 = -1;
                    return true;
                }
                boolean var107 = false;
                long var108 = var102 & Long.MAX_VALUE;
                int var110;
                for (var110 = 0; class225.field3816 > var110 && (class74.field1224[var110].field1707 != var108 || class74.field1224[var110].field2853 != var104); var110++) {
                }
                if (class225.field3816 > var110) {
                    while ((class225.field3816 - 1) > var110) {
                        class74.field1224[var110] = class74.field1224[var110 + 1];
                        var110++;
                    }
                    class225.field3816--;
                    class74.field1224[class225.field3816] = null;
                }
            } else {
                class275 var111 = class196.field3351.method599(-1);
                class164 var112 = new class164();
                var112.field1707 = var102;
                var112.field2860 = class181.method1212(0, var112.field1707);
                var112.field2861 = var105;
                var112.field2853 = var104;
                var112.field2858 = var111;
                int var113;
                for (var113 = class225.field3816 - 1; var113 >= 0; var113--) {
                    int var114 = class74.field1224[var113].field2860.method1846((byte) 94, var112.field2860);
                    if (var114 == 0) {
                        class74.field1224[var113].field2853 = var104;
                        class74.field1224[var113].field2861 = var105;
                        class74.field1224[var113].field2858 = var111;
                        if (class46.field769 == var102) {
                            class42.field711 = var105;
                        }
                        class268.field4650 = -1;
                        class17.field254 = class209.field3533;
                        return true;
                    }
                    if (var114 < 0) {
                        break;
                    }
                }
                if (class74.field1224.length <= class225.field3816) {
                    class268.field4650 = -1;
                    return true;
                }
                for (int var115 = class225.field3816 - 1; var115 > var113; var115--) {
                    class74.field1224[var115 + 1] = class74.field1224[var115];
                }
                if (class225.field3816 == 0) {
                    class74.field1224 = new class164[100];
                }
                class74.field1224[var113 + 1] = var112;
                if (class46.field769 == var102) {
                    class42.field711 = var105;
                }
                class225.field3816++;
            }
            class268.field4650 = -1;
            class17.field254 = class209.field3533;
            return true;
        } else if (class268.field4650 == 148) {
            int var116 = class196.field3351.method564((byte) 102);
            if (class196.field3351.method564((byte) 105) == 0) {
                class256.field4514[var116] = new class250();
            } else {
                class196.field3351.field1392--;
                class256.field4514[var116] = new class250(class196.field3351);
            }
            class268.field4650 = -1;
            class225.field3822 = class209.field3533;
            return true;
        } else if (class268.field4650 == 228) {
            int var117 = class196.field3351.method568(19845);
            int var118 = class196.field3351.method608(35);
            class229 var119;
            if (var117 < 0) {
                var119 = null;
            } else {
                var119 = class261.method1709(var117, -112);
            }
            if (var117 < -70000) {
                var118 += 32768;
            }
            if (var119 != null) {
                for (int var120 = 0; var120 < var119.field4007.length; var120++) {
                    var119.field4007[var120] = 0;
                    var119.field4020[var120] = 0;
                }
            }
            class177.method1190(0, var118);
            int var121 = class196.field3351.method608(89);
            for (int var122 = 0; var122 < var121; var122++) {
                int var123 = class196.field3351.method580(true);
                int var124 = class196.field3351.method603((byte) -69);
                if (var124 == 255) {
                    var124 = class196.field3351.method571(-105);
                }
                if (var119 != null && var119.field4007.length > var122) {
                    var119.field4007[var122] = var123;
                    var119.field4020[var122] = var124;
                }
                class164.method1135(var124, (byte) -116, var118, var123 - 1, var122);
            }
            if (var119 != null) {
                class40.method231(var119, 0);
            }
            class31.method183(84);
            class86.field1451[class19.method98(client.field1487++, 31)] = class19.method98(var118, 32767);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 254) {
            class189.method1248(-51, class196.field3351);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 204) {
            int var125 = class196.field3351.method608(47);
            if (var125 == 65535) {
                var125 = -1;
            }
            int var126 = class196.field3351.method564((byte) 55);
            int var127 = class196.field3351.method608(110);
            class153.method1080(var127, var126, var125, (byte) -67);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 244) {
            int var128 = class196.field3351.method608(119);
            int var129 = class196.field3351.method559(0);
            class61.method383((byte) 70, var128, var129);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 217) {
            int var130 = class196.field3351.method564((byte) 87);
            int var131 = class196.field3351.method564((byte) 116);
            int var132 = class196.field3351.method608(87);
            int var133 = class196.field3351.method564((byte) 82);
            int var134 = class196.field3351.method564((byte) 126);
            class65.method440(var130, var132, 97, var134, var133, true, var131);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 218) {
            int var135 = class196.field3351.method608(116);
            int var136 = class196.field3351.method562(-125);
            int var137 = class196.field3351.method579(61);
            if (class34.method199((byte) 122, var135)) {
                class234.method1522(var136, (byte) 106, var137);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 50) {
            class139.field2431 = class196.field3351.method603((byte) -118);
            class199.field3395 = class196.field3351.method559(0);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 142) {
            class228.method1472((byte) 125, false);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 29) {
            long var138 = class196.field3351.method610(false);
            int var140 = class196.field3351.method608(59);
            class275 var141 = class170.method1168(32768, var140).method958(-106, class196.field3351);
            class167.method1144(1, 19, var140, class181.method1212(0, var138).method1850(97), var141, (class275) null);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 168) {
            class139.field2431 = class196.field3351.method603((byte) -85);
            class199.field3395 = class196.field3351.method567(-83);
            while (class59.field1000 > class196.field3351.field1392) {
                class268.field4650 = class196.field3351.method564((byte) 110);
                class209.method1344(128);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 196) {
            long var142 = class196.field3351.method610(arg0);
            int var144 = class196.field3351.method608(70);
            int var145 = class196.field3351.method564((byte) 97);
            boolean var146 = true;
            if (var142 < 0L) {
                var146 = false;
                var142 &= Long.MAX_VALUE;
            }
            class275 var147 = class79.field1301;
            if (var144 > 0) {
                var147 = class196.field3351.method599(-1);
            }
            class275 var148 = class181.method1212(0, var142).method1850(97);
            for (int var149 = 0; var149 < class63.field1053; var149++) {
                if (class135.field2393[var149] == var142) {
                    if (class102.field1694[var149] != var144) {
                        class102.field1694[var149] = var144;
                        if (var144 > 0) {
                            class277.method1874(class197.method1291(new class275[] { var148, class168.field2934 }, -30025), class79.field1301, 5, true);
                        }
                        if (var144 == 0) {
                            class277.method1874(class197.method1291(new class275[] { var148, class157.field2757 }, -30025), class79.field1301, 5, true);
                        }
                    }
                    class86.field1450[var149] = var147;
                    var148 = null;
                    class25.field408[var149] = var145;
                    class157.field2760[var149] = var146;
                    break;
                }
            }
            boolean var150 = false;
            if (var148 != null && class63.field1053 < 200) {
                class135.field2393[class63.field1053] = var142;
                class148.field2585[class63.field1053] = var148;
                class102.field1694[class63.field1053] = var144;
                class86.field1450[class63.field1053] = var147;
                class25.field408[class63.field1053] = var145;
                class157.field2760[class63.field1053] = var146;
                class63.field1053++;
            }
            int var151 = class63.field1053;
            class156.field2753 = class209.field3533;
            while (var151 > 0) {
                var151--;
                boolean var152 = true;
                for (int var153 = 0; var153 < var151; var153++) {
                    if (class102.field1694[var153] != class108.field1880 && class102.field1694[var153 + 1] == class108.field1880 || class102.field1694[var153] == 0 && class102.field1694[var153 + 1] != 0) {
                        var152 = false;
                        int var154 = class102.field1694[var153];
                        class102.field1694[var153] = class102.field1694[var153 + 1];
                        class102.field1694[var153 + 1] = var154;
                        class275 var155 = class86.field1450[var153];
                        class86.field1450[var153] = class86.field1450[var153 + 1];
                        class86.field1450[var153 + 1] = var155;
                        class275 var156 = class148.field2585[var153];
                        class148.field2585[var153] = class148.field2585[var153 + 1];
                        class148.field2585[var153 + 1] = var156;
                        long var157 = class135.field2393[var153];
                        class135.field2393[var153] = class135.field2393[var153 + 1];
                        class135.field2393[var153 + 1] = var157;
                        int var159 = class25.field408[var153];
                        class25.field408[var153] = class25.field408[var153 + 1];
                        class25.field408[var153 + 1] = var159;
                        boolean var160 = class157.field2760[var153];
                        class157.field2760[var153] = class157.field2760[var153 + 1];
                        class157.field2760[var153 + 1] = var160;
                    }
                }
                if (var152) {
                    break;
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 71) {
            class36.field602 = class196.field3351.method564((byte) 67);
            class268.field4650 = -1;
            class156.field2753 = class209.field3533;
            return true;
        } else if (class268.field4650 == 132) {
            class220.field3746 = 0;
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 114) {
            class95.field1627 = class196.field3351.method564((byte) 95);
            class9.field149 = class196.field3351.method564((byte) 48);
            class95.field1629 = class196.field3351.method564((byte) 79);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 20) {
            class275 var161 = class196.field3351.method599(-1);
            if (var161.method1813(class180.field3091, (byte) -70)) {
                class275 var197 = var161.method1815(0, var161.method1818(19701, class12.field190), 0);
                long var198 = var197.method1833(0);
                boolean var200 = false;
                for (int var201 = 0; var201 < class16.field240; var201++) {
                    if (class139.field2440[var201] == var198) {
                        var200 = true;
                        break;
                    }
                }
                if (!var200 && class91.field1550 == 0) {
                    class277.method1874(class219.field3723, var197, 4, true);
                }
            } else if (var161.method1813(class80.field1321, (byte) -70)) {
                class275 var162 = var161.method1815(0, var161.method1818(19701, class12.field190), 0);
                long var163 = var162.method1833(0);
                boolean var165 = false;
                for (int var166 = 0; var166 < class16.field240; var166++) {
                    if (class139.field2440[var166] == var163) {
                        var165 = true;
                        break;
                    }
                }
                if (!var165 && class91.field1550 == 0) {
                    class275 var167 = var161.method1815(var161.method1818(19701, class12.field190) + 1, var161.method1838(3) + -9, 0);
                    class277.method1874(var167, var162, 8, true);
                }
            } else if (var161.method1813(class35.field579, (byte) -70)) {
                class275 var192 = var161.method1815(0, var161.method1818(19701, class12.field190), 0);
                long var193 = var192.method1833(0);
                boolean var195 = false;
                for (int var196 = 0; var196 < class16.field240; var196++) {
                    if (class139.field2440[var196] == var193) {
                        var195 = true;
                        break;
                    }
                }
                if (!var195 && class91.field1550 == 0) {
                    class277.method1874(class79.field1301, var192, 10, !arg0);
                }
            } else if (var161.method1813(class258.field4525, (byte) -70)) {
                class275 var191 = var161.method1815(0, var161.method1818(19701, class258.field4525), 0);
                class277.method1874(var191, class79.field1301, 11, !arg0);
            } else if (var161.method1813(class99.field1668, (byte) -70)) {
                class275 var168 = var161.method1815(0, var161.method1818(19701, class99.field1668), 0);
                if (class91.field1550 == 0) {
                    class277.method1874(var168, class79.field1301, 12, true);
                }
            } else if (var161.method1813(class255.field4504, (byte) -70)) {
                class275 var169 = var161.method1815(0, var161.method1818(19701, class255.field4504), 0);
                if (class91.field1550 == 0) {
                    class277.method1874(var169, class79.field1301, 13, !arg0);
                }
            } else if (var161.method1813(class76.field1252, (byte) -70)) {
                class275 var186 = var161.method1815(0, var161.method1818(19701, class12.field190), 0);
                long var187 = var186.method1833(0);
                boolean var189 = false;
                for (int var190 = 0; var190 < class16.field240; var190++) {
                    if (class139.field2440[var190] == var187) {
                        var189 = true;
                        break;
                    }
                }
                if (!var189 && class91.field1550 == 0) {
                    class277.method1874(class79.field1301, var186, 14, true);
                }
            } else if (var161.method1813(class94.field1610, (byte) -70)) {
                class275 var181 = var161.method1815(0, var161.method1818(19701, class12.field190), 0);
                long var182 = var181.method1833(0);
                boolean var184 = false;
                for (int var185 = 0; var185 < class16.field240; var185++) {
                    if (class139.field2440[var185] == var182) {
                        var184 = true;
                        break;
                    }
                }
                if (!var184 && class91.field1550 == 0) {
                    class277.method1874(class79.field1301, var181, 15, true);
                }
            } else if (var161.method1813(class117.field2089, (byte) -70)) {
                class275 var170 = var161.method1815(0, var161.method1818(19701, class12.field190), 0);
                long var171 = var170.method1833(0);
                boolean var173 = false;
                for (int var174 = 0; var174 < class16.field240; var174++) {
                    if (class139.field2440[var174] == var171) {
                        var173 = true;
                        break;
                    }
                }
                if (!var173 && class91.field1550 == 0) {
                    class277.method1874(class79.field1301, var170, 16, true);
                }
            } else if (var161.method1813(class156.field2719, (byte) -70)) {
                class275 var175 = var161.method1815(0, var161.method1818(19701, class12.field190), 0);
                long var176 = var175.method1833(0);
                boolean var178 = false;
                for (int var179 = 0; var179 < class16.field240; var179++) {
                    if (class139.field2440[var179] == var176) {
                        var178 = true;
                        break;
                    }
                }
                if (!var178 && class91.field1550 == 0) {
                    class275 var180 = var161.method1815(var161.method1818(19701, class12.field190) + 1, var161.method1838(3) + -9, 0);
                    class277.method1874(var180, var175, 21, true);
                }
            } else {
                class277.method1874(var161, class79.field1301, 0, !arg0);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 48) {
            int var202 = class196.field3351.method603((byte) -92);
            int var203 = class196.field3351.method603((byte) -125);
            class275 var204 = class196.field3351.method599(-1);
            if (var203 >= 1 && var203 <= 8) {
                if (var204.method1844(90, class258.field4526)) {
                    var204 = null;
                }
                class226.field3835[var203 - 1] = var204;
                class52.field870[var203 - 1] = var202 == 0;
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 46) {
            long var205 = class196.field3351.method610(false);
            long var207 = (long) class196.field3351.method608(95);
            long var209 = (long) class196.field3351.method598(121);
            int var211 = class196.field3351.method564((byte) 91);
            int var212 = class196.field3351.method608(98);
            boolean var213 = false;
            long var214 = (var207 << 32) + var209;
            int var216 = 0;
            label1368: while (true) {
                if (var216 >= 100) {
                    if (var211 <= 1) {
                        for (int var217 = 0; var217 < class16.field240; var217++) {
                            if (class139.field2440[var217] == var205) {
                                var213 = true;
                                break label1368;
                            }
                        }
                    }
                    break;
                }
                if (class114.field2012[var216] == var214) {
                    var213 = true;
                    break;
                }
                var216++;
            }
            if (!var213 && class91.field1550 == 0) {
                class114.field2012[class50.field829] = var214;
                class50.field829 = (class50.field829 + 1) % 100;
                class275 var218 = class170.method1168(32768, var212).method958(-112, class196.field3351);
                if (var211 == 2) {
                    class167.method1144(1, 18, var212, class197.method1291(new class275[] { class92.field1564, class181.method1212(0, var205).method1850(97) }, -30025), var218, (class275) null);
                } else if (var211 == 1) {
                    class167.method1144(1, 18, var212, class197.method1291(new class275[] { class139.field2442, class181.method1212(0, var205).method1850(97) }, -30025), var218, (class275) null);
                } else {
                    class167.method1144(1, 18, var212, class181.method1212(0, var205).method1850(97), var218, (class275) null);
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 65) {
            int var219 = class196.field3351.method562(-128);
            int var220 = class196.field3351.method562(-121);
            int var221 = class196.field3351.method568(19845);
            int var222 = class196.field3351.method562(-128);
            if (class34.method199((byte) 126, var220)) {
                class197.method1293((byte) 11, (var219 << 16) + var222, var221);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 117) {
            int var223 = class196.field3351.method608(117);
            class275 var224 = class196.field3351.method599(-1);
            Object[] var225 = new Object[var224.method1838(3) + 1];
            for (int var226 = var224.method1838(3) - 1; var226 >= 0; var226--) {
                if (var224.method1852(111, var226) == 115) {
                    var225[var226 + 1] = class196.field3351.method599(-1);
                } else {
                    var225[var226 + 1] = Integer.valueOf(class196.field3351.method568(19845));
                }
            }
            var225[0] = Integer.valueOf(class196.field3351.method568(19845));
            if (class34.method199((byte) 120, var223)) {
                class99 var227 = new class99();
                var227.field1678 = var225;
                class177.method1192(var227, 200000);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 90) {
            int var228 = class196.field3351.method579(57);
            class229 var229 = class261.method1709(var228, -100);
            for (int var230 = 0; var230 < var229.field4007.length; var230++) {
                var229.field4007[var230] = -1;
                var229.field4007[var230] = 0;
            }
            class40.method231(var229, 0);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 26) {
            class36.method213(false);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 83) {
            int var231 = class196.field3351.method566(-1);
            if (var231 == 65535) {
                var231 = -1;
            }
            int var232 = class196.field3351.method571(-103);
            int var233 = (var232 & 0xFFFC488) >> 14;
            int var234 = (var232 & 0x32CD141F) >> 28;
            int var235 = class196.field3351.method603((byte) -56);
            int var236 = var235 >> 2;
            int var237 = var232 & 0x3FFF;
            int var238 = var237 - class234.field4083;
            int var239 = var233 - class16.field237;
            int var240 = var235 & 0x3;
            int var241 = class149.field2604[var236];
            class144.method1031(15854, var231, var240, var238, var236, var241, var234, var239);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 123) {
            int var242 = class196.field3351.method568(19845);
            int var243 = class196.field3351.method566(-1);
            int var244 = class196.field3351.method566(-1);
            int var245 = class196.field3351.method580(true);
            if ((var242 >> 30) != 0) {
                int var254 = var242 >> 28 & 0x3;
                int var255 = (var242 >> 14 & 0x3FFF) - class16.field237;
                int var256 = (var242 & 0x3FFF) - class234.field4083;
                if (var255 >= 0 && var256 >= 0 && var255 < 104 && var256 < 104) {
                    int var257 = var255 * 128 + 64;
                    int var258 = var256 * 128 + 64;
                    class178 var259 = new class178(var245, var254, var257, var258, class89.method647(var258, var254, var257, 126) - var243, var244, class35.field576);
                    class141.field2494.method547(104, new class162(var259));
                }
            } else if ((var242 >> 29) != 0) {
                int var246 = var242 & 0xFFFF;
                class165 var247 = class31.field478[var246];
                if (var247 != null) {
                    var247.field1724 = var245;
                    var247.field1723 = class35.field576 + var244;
                    var247.field1785 = var243;
                    var247.field1726 = 0;
                    var247.field1777 = 0;
                    if (var247.field1724 == 65535) {
                        var247.field1724 = -1;
                    }
                    if (var247.field1723 > class35.field576) {
                        var247.field1777 = -1;
                    }
                    if (var247.field1724 != -1 && class35.field576 == var247.field1723) {
                        int var248 = class188.method1246(var247.field1724, 6).field1194;
                        if (var248 != -1) {
                            class215 var249 = class201.method1321(128, var248);
                            if (var249 != null && var249.field3688 != null) {
                                class12.method54(-1797326908, false, var247.field1758, var247.field1770, 0, var249);
                            }
                        }
                    }
                }
            } else if ((var242 >> 28) != 0) {
                int var250 = var242 & 0xFFFF;
                class109 var251;
                if (class11.field167 == var250) {
                    var251 = class66.field1094;
                } else {
                    var251 = class16.field238[var250];
                }
                if (var251 != null) {
                    var251.field1723 = class35.field576 + var244;
                    var251.field1777 = 0;
                    var251.field1785 = var243;
                    var251.field1726 = 0;
                    if (var251.field1723 > class35.field576) {
                        var251.field1777 = -1;
                    }
                    var251.field1724 = var245;
                    if (var251.field1724 == 65535) {
                        var251.field1724 = -1;
                    }
                    if (var251.field1724 != -1 && class35.field576 == var251.field1723) {
                        int var252 = class188.method1246(var251.field1724, 6).field1194;
                        if (var252 != -1) {
                            class215 var253 = class201.method1321(128, var252);
                            if (var253 != null && var253.field3688 != null) {
                                class12.method54(-1797326908, class66.field1094 == var251, var251.field1758, var251.field1770, 0, var253);
                            }
                        }
                    }
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 224) {
            int var260 = class196.field3351.method608(64);
            int var261 = class196.field3351.method568(19845);
            if (class34.method199((byte) -5, var260)) {
                class112 var262 = (class112) class267.field4633.method1871(0, (long) var261);
                if (var262 != null) {
                    class39.method227(var262, true, 0);
                }
                if (class45.field754 != null) {
                    class40.method231(class45.field754, 0);
                    class45.field754 = null;
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 124) {
            int var263 = class196.field3351.method564((byte) 113);
            int var264 = class196.field3351.method559(0);
            int var265 = class196.field3351.method603((byte) -93);
            class159.field2790 = var265 >> 1;
            class66.field1094.method810(var264, (byte) -123, var263, (var265 & 0x1) == 1);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 97) {
            int var266 = class196.field3351.method580(true);
            int var267 = class196.field3351.method571(-109);
            class16.method85(0, var266, var267);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 191) {
            class199.field3395 = class196.field3351.method567(-78);
            class139.field2431 = class196.field3351.method603((byte) -6);
            for (int var268 = class139.field2431; var268 < (class139.field2431 + 8); var268++) {
                for (int var270 = class199.field3395; var270 < class199.field3395 + 8; var270++) {
                    if (class118.field2122[class159.field2790][var268][var270] != null) {
                        class118.field2122[class159.field2790][var268][var270] = null;
                        class5.method20(var270, -6356, var268);
                    }
                }
            }
            for (class8 var269 = (class8) class22.field336.method550(-65); var269 != null; var269 = (class8) class22.field336.method545(104)) {
                if (var269.field122 >= class139.field2431 && (class139.field2431 + 8) > var269.field122 && var269.field126 >= class199.field3395 && class199.field3395 + 8 > var269.field126 && class159.field2790 == var269.field127) {
                    var269.field132 = 0;
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 92) {
            int var271 = class196.field3351.method608(56);
            int var272 = class196.field3351.method608(20);
            class275.field4794 = var271;
            class169.field2938 = var272;
            class97.method688(32768);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 27) {
            int var273 = class196.field3351.method580(true);
            int var274 = class196.field3351.method579(90);
            class61.method383((byte) -88, var273, var274);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 184) {
            int var275 = class196.field3351.method566(-1);
            int var276 = class196.field3351.method608(54);
            int var277 = class196.field3351.method567(-81);
            if (class34.method199((byte) -46, var276)) {
                if (var277 == 2) {
                    class65.method446(-96);
                }
                class166.field2881 = var275;
                class144.method1029(var275, 1);
                class23.method155((byte) -117, false);
                class146.method1042(class166.field2881, 111);
                for (int var278 = 0; var278 < 100; var278++) {
                    class200.field3418[var278] = true;
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 158) {
            for (int var279 = 0; var279 < class218.field3698.length; var279++) {
                if (class218.field3698[var279] != class199.field3390[var279]) {
                    class218.field3698[var279] = class199.field3390[var279];
                    class219.method1409(var279, -20144);
                    class14.field222[class19.method98(class190.field3276++, 31)] = var279;
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 149) {
            int var280 = class196.field3351.method564((byte) 67);
            int var281 = class196.field3351.method564((byte) 82);
            int var282 = class196.field3351.method608(41);
            int var283 = class196.field3351.method564((byte) 58);
            int var284 = class196.field3351.method564((byte) 61);
            class35.method212(var284, var281, var282, -65536, var280, var283);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 241) {
            int var285 = class196.field3351.method562(-122);
            int var286 = class196.field3351.method580(true);
            class275 var287 = class196.field3351.method599(-1);
            if (class34.method199((byte) 124, var285)) {
                class63.method437(-60, var286, var287);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 34) {
            int var288 = class196.field3351.method568(19845);
            int var289 = class196.field3351.method566(-1);
            if (class34.method199((byte) -97, var289)) {
                int var290 = 0;
                if (class66.field1094.field1907 != null) {
                    var290 = class66.field1094.field1907.method1503((byte) -121);
                }
                class30.method177(var288, 3, var290, -30873);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 209) {
            int var291 = class196.field3351.method579(113);
            int var292 = class196.field3351.method608(101);
            int var293 = class196.field3351.method608(57);
            if (var292 == 65535) {
                var292 = -1;
            }
            if (class34.method199((byte) -100, var293)) {
                class30.method177(var291, 2, var292, -30873);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 231) {
            int var294 = class196.field3351.method568(19845);
            int var295 = class196.field3351.method608(29);
            if (var294 < -70000) {
                var295 += 32768;
            }
            class229 var296;
            if (var294 < 0) {
                var296 = null;
            } else {
                var296 = class261.method1709(var294, -111);
            }
            while (class196.field3351.field1392 < class59.field1000) {
                int var297 = class196.field3351.method593((byte) -106);
                int var298 = class196.field3351.method608(115);
                int var299 = 0;
                if (var298 != 0) {
                    var299 = class196.field3351.method564((byte) 105);
                    if (var299 == 255) {
                        var299 = class196.field3351.method568(19845);
                    }
                }
                if (var296 != null && var297 >= 0 && var297 < var296.field4007.length) {
                    var296.field4007[var297] = var298;
                    var296.field4020[var297] = var299;
                }
                class164.method1135(var299, (byte) -111, var295, var298 - 1, var297);
            }
            if (var296 != null) {
                class40.method231(var296, 0);
            }
            class31.method183(119);
            class86.field1451[class19.method98(31, client.field1487++)] = class19.method98(32767, var295);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 176) {
            int var300 = class196.field3351.method608(93);
            int var301 = class196.field3351.method566(-1);
            int var302 = class196.field3351.method567(-128);
            if (class34.method199((byte) 121, var301)) {
                class113.method828(var302, true, var300);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 219) {
            int var303 = class196.field3351.method611(114);
            int var304 = class196.field3351.method567(-74);
            int var305 = class196.field3351.method566(-1);
            int var306 = class196.field3351.method580(true);
            if (class34.method199((byte) 122, var305)) {
                class112 var307 = (class112) class267.field4633.method1871(0, (long) var303);
                if (var307 != null) {
                    class39.method227(var307, var307.field1977 != var306, 0);
                }
                class180.method1210(-24007, var303, var306, var304);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 202) {
            class275 var308 = class196.field3351.method599(-1);
            int var309 = class196.field3351.method566(-1);
            int var310 = class196.field3351.method611(-107);
            if (class34.method199((byte) 122, var309)) {
                class81.method527(var308, var310, 0);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 234) {
            if (class59.field1000 == 0) {
                class3.field19 = class147.field2575;
            } else {
                class3.field19 = class196.field3351.method599(-1);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 206) {
            class31.method183(45);
            class86.field1461 = class196.field3351.method570(255);
            class152.field2661 = class209.field3533;
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 102) {
            long var311 = class196.field3351.method610(false);
            class196.field3351.method581(8);
            long var313 = class196.field3351.method610(false);
            long var315 = (long) class196.field3351.method608(97);
            long var317 = (long) class196.field3351.method598(93);
            long var319 = (var315 << 32) + var317;
            int var321 = class196.field3351.method564((byte) 78);
            boolean var322 = false;
            int var323 = 0;
            label1422: while (true) {
                if (var323 >= 100) {
                    if (var321 <= 1) {
                        if (class255.field4490 == 1 || class131.field2343 == 1) {
                            var322 = true;
                        } else {
                            for (int var324 = 0; var324 < class16.field240; var324++) {
                                if (class139.field2440[var324] == var311) {
                                    var322 = true;
                                    break label1422;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class114.field2012[var323] == var319) {
                    var322 = true;
                    break;
                }
                var323++;
            }
            if (!var322 && class91.field1550 == 0) {
                class114.field2012[class50.field829] = var319;
                class50.field829 = (class50.field829 + 1) % 100;
                class275 var325 = class21.method111(class233.method1518(class196.field3351, -519).method1849((byte) 102));
                if (var321 == 2 || var321 == 3) {
                    class161.method1124(class181.method1212(0, var313).method1850(97), class197.method1291(new class275[] { class92.field1564, class181.method1212(0, var311).method1850(97) }, -30025), 9, -88, var325);
                } else if (var321 == 1) {
                    class161.method1124(class181.method1212(0, var313).method1850(97), class197.method1291(new class275[] { class139.field2442, class181.method1212(0, var311).method1850(97) }, -30025), 9, -97, var325);
                } else {
                    class161.method1124(class181.method1212(0, var313).method1850(97), class181.method1212(0, var311).method1850(97), 9, -126, var325);
                }
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 144) {
            int var326 = class196.field3351.method562(-124);
            if (var326 == 65535) {
                var326 = -1;
            }
            class120.method877(var326, (byte) 88);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 146) {
            int var327 = class196.field3351.method604(-249518000);
            int var328 = class196.field3351.method580(true);
            if (var328 == 65535) {
                var328 = -1;
            }
            class269.method1775(!arg0, var327, var328);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 85) {
            int var329 = class196.field3351.method564((byte) 101);
            int var330 = class196.field3351.method564((byte) 87);
            int var331 = class196.field3351.method564((byte) 76);
            int var332 = class196.field3351.method564((byte) 84);
            int var333 = class196.field3351.method608(34);
            field1195[var329] = true;
            class231.field4039[var329] = var330;
            class137.field2413[var329] = var331;
            class93.field1596[var329] = var332;
            class185.field3171[var329] = var333;
            class268.field4650 = -1;
            return true;
        } else if (arg0) {
            return true;
        } else if (class268.field4650 == 119) {
            int var334 = class196.field3351.method562(-127);
            class275 var335 = class196.field3351.method599(-1);
            int var336 = class196.field3351.method608(35);
            if (class34.method199((byte) -31, var334)) {
                class63.method437(-72, var336, var335);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 198) {
            int var337 = class196.field3351.method608(43);
            class231.method1496(1, var337);
            class86.field1451[class19.method98(client.field1487++, 31)] = class19.method98(32767, var337);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 203) {
            int var338 = class196.field3351.method580(!arg0);
            int var339 = class196.field3351.method608(25);
            int var340 = class196.field3351.method562(-128);
            int var341 = class196.field3351.method579(75);
            if (class34.method199((byte) -127, var339)) {
                class30.method177(var341, 7, var340 << 16 | var338, -30873);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 186 || class268.field4650 == 109 || class268.field4650 == 233 || class268.field4650 == 175 || class268.field4650 == 135 || class268.field4650 == 243 || class268.field4650 == 33 || class268.field4650 == 130 || class268.field4650 == 239 || class268.field4650 == 170 || class268.field4650 == 18 || class268.field4650 == 223) {
            class209.method1344(128);
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 6) {
            class107.method797(13326);
            class31.method183(99);
            class268.field4650 = -1;
            class190.field3276 += 32;
            return true;
        } else if (class268.field4650 == 66) {
            class16.field240 = class59.field1000 / 8;
            for (int var342 = 0; var342 < class16.field240; var342++) {
                class139.field2440[var342] = class196.field3351.method610(false);
                class165.field2875[var342] = class181.method1212(0, class139.field2440[var342]);
            }
            class268.field4650 = -1;
            class156.field2753 = class209.field3533;
            return true;
        } else if (class268.field4650 == 93) {
            int var343 = class196.field3351.method608(101);
            int var344 = class196.field3351.method603((byte) -26);
            int var345 = class196.field3351.method608(37);
            class165 var346 = class31.field478[var345];
            if (var346 != null) {
                class152.method1077(var343, -118, var344, var346);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 199) {
            int var347 = class196.field3351.method562(-121);
            int var348 = class196.field3351.method562(-123);
            int var349 = class196.field3351.method568(19845);
            int var350 = class196.field3351.method580(true);
            int var351 = class196.field3351.method566(-1);
            if (class34.method199((byte) -61, var347)) {
                class195.method1272(var349, var348, arg0, var351, var350);
            }
            class268.field4650 = -1;
            return true;
        } else if (class268.field4650 == 205) {
            class270.field4697 = class196.field3351.method608(118) * 30;
            class152.field2661 = class209.field3533;
            class268.field4650 = -1;
            return true;
        } else {
            class1.method1((Throwable) null, "T1 - " + class268.field4650 + "," + class108.field1873 + "," + class72.field1165 + " - " + class59.field1000, false);
            class244.method1591((byte) -126);
            return true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V")
    public static final void method481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1209++;
        for (int var6 = arg3; var6 <= arg2; var6++) {
            class36.method216(class19.field280[var6], arg4, arg1, -123, arg0);
        }
        if (arg5 != -1) {
            method481(-120, -126, -47, 21, -11, 101);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)Lhh;")
    public final class176 method482(byte arg0, int arg1) {
        if (arg0 >= -91) {
            method474(79, 114, 118);
        }
        class176 var3 = (class176) class268.field4648.method990((long) this.field1197, (byte) -117);
        field1206++;
        if (var3 == null) {
            class263 var4 = class263.method1719(class8.field121, this.field1210, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1199 != null) {
                for (int var5 = 0; var5 < this.field1199.length; var5++) {
                    var4.method1723(this.field1199[var5], this.field1182[var5]);
                }
            }
            if (this.field1181 != null) {
                for (int var6 = 0; var6 < this.field1181.length; var6++) {
                    var4.method1734(this.field1181[var6], this.field1183[var6]);
                }
            }
            var3 = var4.method1744(this.field1211 + 64, 850 - -this.field1200, -30, -50, -30);
            class268.field4648.method986(0, (long) this.field1197, var3);
        }
        class176 var7;
        if (this.field1194 == -1 || arg1 == -1) {
            var7 = var3.method943(true, true);
        } else {
            var7 = class201.method1321(128, this.field1194).method1390(arg1, var3, (byte) 122);
        }
        if (this.field1204 != 128 || this.field1205 != 128) {
            var7.method936(this.field1204, this.field1205, this.field1204);
        }
        if (this.field1208 != 0) {
            if (this.field1208 == 90) {
                var7.method951();
            }
            if (this.field1208 == 180) {
                var7.method937();
            }
            if (this.field1208 == 270) {
                var7.method948();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(BI)I")
    public static final int method483(byte arg0, int arg1) {
        int var2 = -56 % ((arg0 + 26) / 52);
        field1184++;
        return arg1 >> 11 & 0x7F;
    }
}
