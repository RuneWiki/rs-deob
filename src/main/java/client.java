import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class165 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lct;")
    public static class285 field6667 = new class285(66, 2);

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "[Z")
    public static boolean[] field6675 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lng;")
    public static class153 field6670;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Z")
    public static boolean field6677;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
    public static int[] field6676;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[[B")
    public static byte[][] field6674;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "[[I")
    public static int[][] field6672;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lje;)Z")
    public static final boolean method2771(class178 arg0) {
        if (class365.field5528) {
            if (method2777(arg0).field2506 != 0) {
                return false;
            }
            if (arg0.field2655 == 0) {
                return false;
            }
        }
        return arg0.field2539;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1125(int arg0) {
        field6657++;
        if (arg0 != 20490 || class316.field4752 == 1000) {
            return;
        }
        class452.field6418++;
        if ((class452.field6418 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class57.field799 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class408.field5919.setSeed((long) class57.field799);
        }
        if ((class452.field6418 % 50) == 0) {
            class342.field5117 = class269.field3985;
            class187.field2847 = class186.field2822;
            class269.field3985 = 0;
            class186.field2822 = 0;
        }
        this.method2787(65);
        if (class178.field2649 != null) {
            class178.field2649.method2138(106);
        }
        class401.method2402(arg0 ^ 0xFFFFAF8E);
        class418.method2483((byte) 93);
        class296.field4445.method1097(113);
        class78.field1105.method1983(-116);
        if (class429.field6115 != null) {
            int var3 = class429.field6115.method1408(-1489113977);
            class340.field5095 = var3;
        }
        if (class138.field1976 != null) {
            class138.field1976.method554((int) class435.method2539(-10659));
        }
        class157.method1077((byte) -124);
        class336.field5032 = 0;
        for (class293 var4 = class296.field4445.method1099(0); var4 != null && class336.field5032 < 128; var4 = class296.field4445.method1099(0)) {
            if (var4.method891(arg0 - 20491) != 1) {
                char var5 = var4.method895((byte) 84);
                if (!class228.method1484((byte) 123) || var5 != '`' && var5 != '§') {
                    class164.field2281[class336.field5032] = var4;
                    class336.field5032++;
                } else if (class33.method273(-1)) {
                    class338.method2067(109);
                } else {
                    class486.method2843((byte) 124);
                }
            }
        }
        class260.field3872 = null;
        for (class131 var6 = class78.field1105.method1976(6); var6 != null; var6 = class78.field1105.method1976(6)) {
            int var7 = var6.method911((byte) 40);
            if (var7 == -1) {
                class269.field3973.method2453((byte) -123, var6);
            } else if (class115.method822(19321, var7)) {
                class260.field3872 = var6;
            }
        }
        if (class33.method273(-1)) {
            class229.method1489((byte) 124);
        }
        if (class316.field4752 == 0) {
            this.method2781(-2881);
            class382.method2331(false);
        } else if (class316.field4752 == 5) {
            this.method2781(-2881);
            class382.method2331(false);
        } else if (class316.field4752 == 25 || class316.field4752 == 28) {
            class317.method1951(arg0 ^ 0xFFFFAFF5);
        }
        if (class316.field4752 == 10) {
            this.method2789((byte) -115);
            class197.method1339(120);
            class273.method1777((byte) 119);
            class131.method914(31);
        } else if (class316.field4752 == 30) {
            class370.method2292(-125);
        } else if (class316.field4752 == 40) {
            class131.method914(arg0 ^ 0x5015);
            if (class6.field107 != -3 && class6.field107 != 2 && class6.field107 != 15) {
                class38.method295(arg0 ^ 0x506C);
            }
        }
        class42.method313(class138.field1976, 36);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1119(byte arg0) {
        field6665++;
        if (class316.field4752 == 1000) {
            return;
        }
        long var2 = class6.method42(151) / 1000000L - class120.field1667;
        class120.field1667 = class6.method42(151) / 1000000L;
        if (arg0 < 14) {
            method2783(49, true, 119, 43);
        }
        boolean var4 = class154.method1052(127);
        if (var4 && class208.field3142 && class395.field5816 != null) {
            class395.field5816.method2229((byte) 121);
        }
        if (class316.field4752 == 30 || class316.field4752 == 10) {
            if (class467.field6576 != 0L && class435.method2539(-10659) > class467.field6576) {
                class76.method650((byte) 107, class337.field5038.field3944, class419.method2487((byte) -67), class337.field5038.field3948, false);
            } else if (class138.field1976.method515() && class115.field1607) {
                class82.method673(2);
            }
        }
        if (class123.field1698 == null) {
            Container var5;
            if (class316.field4749 == null) {
                var5 = class21.field261.field2125;
            } else {
                var5 = class316.field4749;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class316.field4749 == var5) {
                Insets var8 = class316.field4749.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class297.field4450 != var6 || class321.field4794 != var7) {
                if (class138.field1976 == null || class138.field1976.method495()) {
                    class255.method1687(768);
                } else {
                    class297.field4450 = var6;
                    class321.field4794 = var7;
                }
                class467.field6576 = class435.method2539(-10659) + 500L;
            }
        }
        if (class123.field1698 != null && !class78.field1104 && (class316.field4752 == 30 || class316.field4752 == 10)) {
            class76.method650((byte) 124, -1, class337.field5038.field3947, -1, false);
        }
        boolean var9 = false;
        if (class442.field6243) {
            var9 = true;
            class442.field6243 = false;
        }
        if (var9) {
            class188.method1300(true);
        }
        if (class138.field1976 != null && class138.field1976.method568() || class419.method2487((byte) -45) != 1) {
            class456.method2706((byte) 114);
        }
        if (class316.field4752 == 0) {
            class412.method2462(class273.field4111, 255, class154.field2157[class252.field3624], class78.field1099[class252.field3624], class29.field403, class452.field6413[class252.field3624], var9);
        } else if (class316.field4752 == 5) {
            class6.method39(class452.field6413[class252.field3624].getRGB(), class154.field2157[class252.field3624].getRGB(), class462.field6513, var9 | class138.field1976.method568(), class78.field1099[class252.field3624].getRGB(), class138.field1976, 2);
        } else if (class316.field4752 == 10) {
            class262.method1730(-1);
        } else if (class316.field4752 == 25 || class316.field4752 == 28) {
            if (class310.field4685 == 1) {
                if (class336.field5035 > class488.field6845) {
                    class488.field6845 = class336.field5035;
                }
                int var10 = (class488.field6845 - class336.field5035) * 50 / class488.field6845;
                class416.method2477(class226.field3314.method2036(class4.field85, (byte) -21) + "<br>(" + var10 + "%)", 95, class310.field4690, true);
            } else if (class310.field4685 == 2) {
                if (class363.field5510 > class163.field2264) {
                    class163.field2264 = class363.field5510;
                }
                int var11 = ((class163.field2264 - class363.field5510) * 50 / class163.field2264) + 50;
                class416.method2477(class226.field3314.method2036(class4.field85, (byte) -21) + "<br>(" + var11 + "%)", 74, class310.field4690, true);
            } else {
                class416.method2477(class226.field3314.method2036(class4.field85, (byte) -21), 84, class310.field4690, true);
            }
        } else if (class316.field4752 == 30) {
            class40.method304(var2, -87);
        } else if (class316.field4752 == 40) {
            class416.method2477(class230.field3385.method2036(class4.field85, (byte) -21) + "<br>" + class486.field6832.method2036(class4.field85, (byte) -21), 118, class310.field4690, true);
        }
        if (class14.field197 == 3) {
            for (int var12 = 0; var12 < class267.field3959; var12++) {
                Rectangle var13 = class398.field5826[var12];
                if (class100.field1424[var12]) {
                    class138.field1976.method530(var13.height, -1996553985, var13.y, (byte) 108, var13.x, var13.width);
                } else if (class225.field3270[var12]) {
                    class138.field1976.method530(var13.height, -1996554240, var13.y, (byte) 108, var13.x, var13.width);
                }
            }
        }
        if (class33.method273(-1)) {
            class110.method805(class138.field1976, false);
        }
        if ((class316.field4752 == 30 || class316.field4752 == 10) && class14.field197 == 0 && class419.method2487((byte) -40) == 1 && !var9 && class153.field2127.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class267.field3959; var15++) {
                if (class225.field3270[var15]) {
                    class225.field3270[var15] = false;
                    class150.field2116[var14++] = class398.field5826[var15];
                }
            }
            class138.field1976.method537(class150.field2116, var14);
        } else if (class316.field4752 != 0) {
            class138.field1976.method591();
            for (int var16 = 0; var16 < class267.field3959; var16++) {
                class225.field3270[var16] = false;
            }
        }
        if (class337.field5038.field3953 == 0) {
            class325.method2005(true, 15L);
        } else if (class337.field5038.field3953 == 1) {
            class325.method2005(true, 10L);
        } else if (class337.field5038.field3953 == 2) {
            class325.method2005(true, 5L);
        } else if (class337.field5038.field3953 == 3) {
            class325.method2005(true, 2L);
        }
        if (class306.field4565) {
            class134.method950(12499);
        }
        if (class337.field5038.field3931 && class316.field4752 == 10 && class279.field4220 != -1) {
            class337.field5038.field3931 = false;
            class337.field5038.method2208(-123, class21.field261);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lje;)Lje;")
    public static final class178 method2772(class178 arg0) {
        int var1 = method2777(arg0).method1212(16);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class493.method2885(arg0.field2580, 65535);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method2773() {
        int var0 = class299.field4466;
        int[] var1 = class161.field2218;
        boolean var2 = class337.field5038.field3943 == 1 && var0 > 200 || class337.field5038.field3943 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class257 var12 = class40.field565[var1[var3]];
            if (var12.method1698(0)) {
                var12.method1469(-7360);
                if (var12.field4542 >= 0 && var12.field4547 >= 0 && var12.field4541 < class379.field5642 && var12.field4552 < class456.field6477) {
                    var12.field3842 = var12.field4663 ? var2 : false;
                    if (class472.field6622 == var12) {
                        var12.field4592 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field4644) {
                            var13++;
                        }
                        if (var12.field4630 > class452.field6418) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method1705((byte) 65) << 2);
                        if (class451.field6386 == 0) {
                            var14 += 32;
                        } else {
                            var14 += 128;
                        }
                        var14 += 256;
                        var12.field4592 = var14 + 1;
                    }
                } else {
                    var12.field4592 = -1;
                }
            } else {
                var12.field4592 = -1;
            }
        }
        for (int var4 = 0; var4 < class256.field3797; var4++) {
            class349 var9 = class18.field241[class236.field3441[var4]];
            if (var9.method2147(0) && var9.field5309.method1787((byte) 28, class315.field4736)) {
                var9.method1469(-7360);
                if (var9.field4542 >= 0 && var9.field4547 >= 0 && var9.field4541 < class379.field5642 && var9.field4552 < class456.field6477) {
                    int var10 = 0;
                    if (!var9.field4644) {
                        var10++;
                    }
                    if (var9.field4630 > class452.field6418) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method1705((byte) 65) << 2);
                    if (class451.field6386 == 0) {
                        if (var9.field5309.field4161) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class451.field6386 == 1) {
                        if (var9.field5309.field4161) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field5309.field4119) {
                        var11 += 1024;
                    } else if (!var9.field5309.field4094) {
                        var11 += 256;
                    }
                    var9.field4592 = var11 + 1;
                } else {
                    var9.field4592 = -1;
                }
            } else {
                var9.field4592 = -1;
            }
        }
        for (int var5 = 0; var5 < class365.field5522.length; var5++) {
            class208 var6 = class365.field5522[var5];
            if (var6 != null) {
                if (var6.field3129 == 1) {
                    class349 var7 = class18.field241[var6.field3134];
                    if (var7 != null && var7.field4592 >= 0) {
                        var7.field4592 += 2048;
                    }
                } else if (var6.field3129 == 10) {
                    class257 var8 = class40.field565[var6.field3134];
                    if (var8 != null && class472.field6622 != var8 && var8.field4592 >= 0) {
                        var8.field4592 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lje;IIIIIIIII)V")
    public static final void method2774(class178[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class178 var11 = arg0[var10];
            if (var11 != null && var11.field2580 == arg1) {
                int var12 = var11.field2593 + arg6;
                int var13 = var11.field2648 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2655 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field2595 + var12;
                    int var19 = var11.field2589 + var13;
                    if (var11.field2655 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field2655 == 0 || var11.field2569 || method2777(var11).field2506 != 0 || class245.field3509 == var11 || class78.field1091 == var11.field2577) {
                    if (!method2771(var11)) {
                        if (class100.field1419 == var11) {
                            class310.field4692 = true;
                            class287.field4384 = var12;
                            class123.field1694 = var13;
                        }
                        if (var11.field2545 || var14 < var16 && var15 < var17) {
                            if (var11.field2655 == 0 && var11.field2640 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class415 var20 = (class415) class352.field5362.method2456(32101); var20 != null; var20 = (class415) class352.field5362.method2461(301)) {
                                    if (var20.field5977) {
                                        var20.method283(2);
                                        var20.field5990.field2597 = false;
                                    }
                                }
                                if (class35.field433 == 0) {
                                    class100.field1419 = null;
                                    class245.field3509 = null;
                                }
                                class346.field5284 = 0;
                                class172.field2458 = false;
                                class180.field2681 = false;
                                if (!class166.field2335) {
                                    class281.method1809(true);
                                }
                            }
                            boolean var21;
                            if (class78.field1105.method1975(119) >= var14 && class78.field1105.method1984((byte) -123) >= var15 && class78.field1105.method1975(47) < var16 && class78.field1105.method1984((byte) -102) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class166.field2335 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class398.method2380(false, arg8 - var12, arg9 - var13, var11);
                            }
                            boolean var22 = false;
                            if (class78.field1105.method1972(6) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            if (class260.field3872 != null && class260.field3872.method911((byte) 105) == 0 && class260.field3872.method912(-14721) >= var14 && class260.field3872.method907(-91) >= var15 && class260.field3872.method912(-14721) < var16 && class260.field3872.method907(-91) < var17) {
                                var23 = true;
                            }
                            if (var11.field2669 != null) {
                                for (int var24 = 0; var24 < var11.field2669.length; var24++) {
                                    if (class296.field4445.method1100(false, var11.field2669[var24])) {
                                        if (var11.field2566 == null || class452.field6418 >= var11.field2566[var24]) {
                                            byte var25 = var11.field2512[var24];
                                            if (var25 == 0 || ((var25 & 0x8) == 0 || !class296.field4445.method1100(false, 86) && !class296.field4445.method1100(false, 82) && !class296.field4445.method1100(false, 81)) && ((var25 & 0x2) == 0 || class296.field4445.method1100(false, 86)) && ((var25 & 0x1) == 0 || class296.field4445.method1100(false, 82)) && ((var25 & 0x4) == 0 || class296.field4445.method1100(false, 81))) {
                                                class485.method2834(18776, var24 + 1, "", -1, var11.field2631);
                                                int var26 = var11.field2511[var24];
                                                if (var11.field2566 == null) {
                                                    var11.field2566 = new int[var11.field2669.length];
                                                }
                                                if (var26 == 0) {
                                                    var11.field2566[var24] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field2566[var24] = class452.field6418 + var26;
                                                }
                                            }
                                        }
                                    } else if (var11.field2566 != null) {
                                        var11.field2566[var24] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class46.method340(class260.field3872.method907(-115) - var13, var11, class260.field3872.method912(-14721) - var12, (byte) 101);
                            }
                            if (class100.field1419 != null && class100.field1419 != var11 && var21 && method2777(var11).method1213((byte) -123)) {
                                class349.field5313 = var11;
                            }
                            if (class245.field3509 == var11) {
                                class360.field5458 = true;
                                class47.field684 = var12;
                                class454.field6461 = var13;
                            }
                            if (var11.field2569 || var11.field2577 != 0) {
                                if (var21 && class340.field5095 != 0 && var11.field2612 != null) {
                                    class415 var27 = new class415();
                                    var27.field5977 = true;
                                    var27.field5990 = var11;
                                    var27.field5980 = class340.field5095;
                                    var27.field5989 = var11.field2612;
                                    class352.field5362.method2453((byte) -85, var27);
                                }
                                if (class100.field1419 != null || class166.field2335 || class157.field2189 != var11.field2577 && class346.field5284 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field2577 != 0) {
                                    if (class124.field1701 == var11.field2577 || class387.field5705 == var11.field2577) {
                                        class478.field6708 = var11;
                                        if (class378.field5629 != null) {
                                            class378.field5629.method677(var11.field2589, class138.field1976, (byte) 46);
                                        }
                                        if (class124.field1701 == var11.field2577) {
                                            if (!class166.field2335 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class96.method746(arg9, arg8, class138.field1976, (byte) -54);
                                                for (class97 var28 = (class97) class57.field794.method1594(16); var28 != null; var28 = (class97) class57.field794.method1596(true)) {
                                                    if (arg8 >= var28.field1393 && arg8 < var28.field1395 && arg9 >= var28.field1394 && arg9 < var28.field1392) {
                                                        class281.method1809(true);
                                                        class362.method2233((byte) 38, var28.field1397);
                                                    }
                                                }
                                            }
                                            class142.method979(var13, -1, var11, var12);
                                            continue;
                                        }
                                    }
                                    if (class78.field1091 == var11.field2577) {
                                        if (var11.method1235(class138.field1976, (byte) -122) == null || class488.field6847 != 0 && class488.field6847 != 3 || class166.field2335 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var29 = arg8 - var12;
                                        int var30 = arg9 - var13;
                                        int var31 = var11.field2608[var30];
                                        if (var29 < var31 || var29 > var11.field2602[var30] + var31) {
                                            continue;
                                        }
                                        int var32 = var29 - var11.field2595 / 2;
                                        int var33 = var30 - var11.field2589 / 2;
                                        int var34;
                                        if (class469.field6596 == 4) {
                                            var34 = (int) class384.field5682 & 0x3FFF;
                                        } else {
                                            var34 = (int) class384.field5682 + class347.field5291 & 0x3FFF;
                                        }
                                        int var35 = class172.field2450[var34];
                                        int var36 = class172.field2456[var34];
                                        if (class469.field6596 != 4) {
                                            var35 = (class358.field5437 + 256) * var35 >> 8;
                                            var36 = (class358.field5437 + 256) * var36 >> 8;
                                        }
                                        int var37 = var32 * var36 + var33 * var35 >> 15;
                                        int var38 = var33 * var36 - var32 * var35 >> 15;
                                        int var39;
                                        int var40;
                                        if (class469.field6596 == 4) {
                                            var39 = (class128.field1787 >> 7) + (var37 >> 2);
                                            var40 = (class492.field6932 >> 7) - (var38 >> 2);
                                        } else {
                                            int var41 = (class472.field6622.method1705((byte) 65) - 1) * 64;
                                            var39 = (class472.field6622.field4543 - var41 >> 7) + (var37 >> 2);
                                            var40 = (class472.field6622.field4538 - var41 >> 7) - (var38 >> 2);
                                        }
                                        if (class432.field6152 && (class197.field2960 & 0x40) != 0) {
                                            class178 var42 = class331.method2032(class65.field898, class467.field6570, -1);
                                            if (var42 == null) {
                                                class110.method809((byte) -103);
                                            } else {
                                                class344.method2117(1L, 4, true, class186.field2830, " ->", class184.field2803, -8, var39, var11.field2605, false, var40);
                                            }
                                            continue;
                                        }
                                        if (class77.field1088 == class124.field1710) {
                                            class344.method2117(1L, 19, true, -1, "", class335.field5001.method2036(class4.field85, (byte) -21), -8, var39, -1, false, var40);
                                        }
                                        class344.method2117(1L, 51, true, -1, "", class200.field3036, -8, var39, -1, false, var40);
                                        continue;
                                    }
                                    if (class157.field2189 == var11.field2577) {
                                        class330.field4954 = var11;
                                        if (var21) {
                                            class172.field2458 = true;
                                        }
                                        if (var23) {
                                            int var43 = (int) ((double) (class260.field3872.method912(-14721) - var12 - var11.field2595 / 2) * 2.0D / (double) class189.field2890);
                                            int var44 = (int) (-((double) (class260.field3872.method907(-51) - var13 - var11.field2589 / 2) * 2.0D / (double) class189.field2890));
                                            int var45 = class384.field5692 + var43 + class189.field2912;
                                            int var46 = class446.field6309 + var44 + class189.field2902;
                                            class12 var47 = class356.method2197((byte) 123);
                                            if (var47 == null) {
                                                continue;
                                            }
                                            int[] var48 = new int[3];
                                            var47.method122(var48, var45, var46, (byte) 112);
                                            if (var48 != null) {
                                                if (class296.field4445.method1100(false, 82) && class465.field6556 > 0) {
                                                    class422.method2491(var48[1], var48[0], var48[2], 0);
                                                    continue;
                                                }
                                                class180.field2681 = true;
                                                class452.field6415 = var48[0];
                                                class275.field4191 = var48[1];
                                                class21.field260 = var48[2];
                                            }
                                            class346.field5284 = 1;
                                            class178.field2660 = false;
                                            class338.field5071 = class78.field1105.method1975(57);
                                            class382.field5658 = class78.field1105.method1984((byte) -96);
                                            continue;
                                        }
                                        if (var22 && class346.field5284 > 0) {
                                            if (class346.field5284 == 1 && (class338.field5071 != class78.field1105.method1975(77) || class382.field5658 != class78.field1105.method1984((byte) -122))) {
                                                class131.field1831 = class384.field5692;
                                                class432.field6137 = class446.field6309;
                                                class346.field5284 = 2;
                                            }
                                            if (class346.field5284 == 2) {
                                                class178.field2660 = true;
                                                class44.method320(class131.field1831 + (int) ((double) (class338.field5071 - class78.field1105.method1975(84)) * 2.0D / (double) class189.field2894), 112);
                                                class260.method1716(false, class432.field6137 - (int) ((double) (class382.field5658 - class78.field1105.method1984((byte) -55)) * 2.0D / (double) class189.field2894));
                                            }
                                            continue;
                                        }
                                        if (class346.field5284 > 0 && !class178.field2660) {
                                            if ((class358.field5435 == 1 || class468.method2745(105)) && class186.field2817 > 2) {
                                                class384.method2336(class338.field5071, class382.field5658, true);
                                            } else if (class100.method769((byte) -28)) {
                                                class384.method2336(class338.field5071, class382.field5658, true);
                                            }
                                        }
                                        class346.field5284 = 0;
                                        continue;
                                    }
                                    if (class9.field144 == var11.field2577) {
                                        if (var22) {
                                            class270.method1756(class78.field1105.method1975(107) - var12, var11.field2589, class78.field1105.method1984((byte) -34) - var13, var11.field2595, 32);
                                        }
                                        continue;
                                    }
                                    if (class465.field6549 == var11.field2577) {
                                        class408.method2440((byte) 72, var13, var11, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field2541 && var23) {
                                    var11.field2541 = true;
                                    if (var11.field2664 != null) {
                                        class415 var49 = new class415();
                                        var49.field5977 = true;
                                        var49.field5990 = var11;
                                        var49.field5983 = class260.field3872.method912(-14721) - var12;
                                        var49.field5980 = class260.field3872.method907(-88) - var13;
                                        var49.field5989 = var11.field2664;
                                        class352.field5362.method2453((byte) -104, var49);
                                    }
                                }
                                if (var11.field2541 && var22 && var11.field2514 != null) {
                                    class415 var50 = new class415();
                                    var50.field5977 = true;
                                    var50.field5990 = var11;
                                    var50.field5983 = class78.field1105.method1975(71) - var12;
                                    var50.field5980 = class78.field1105.method1984((byte) -61) - var13;
                                    var50.field5989 = var11.field2514;
                                    class352.field5362.method2453((byte) -92, var50);
                                }
                                if (var11.field2541 && !var22) {
                                    var11.field2541 = false;
                                    if (var11.field2546 != null) {
                                        class415 var51 = new class415();
                                        var51.field5977 = true;
                                        var51.field5990 = var11;
                                        var51.field5983 = class78.field1105.method1975(85) - var12;
                                        var51.field5980 = class78.field1105.method1984((byte) -68) - var13;
                                        var51.field5989 = var11.field2546;
                                        class466.field6560.method2453((byte) -100, var51);
                                    }
                                }
                                if (var22 && var11.field2653 != null) {
                                    class415 var52 = new class415();
                                    var52.field5977 = true;
                                    var52.field5990 = var11;
                                    var52.field5983 = class78.field1105.method1975(85) - var12;
                                    var52.field5980 = class78.field1105.method1984((byte) -115) - var13;
                                    var52.field5989 = var11.field2653;
                                    class352.field5362.method2453((byte) -113, var52);
                                }
                                if (!var11.field2597 && var21) {
                                    var11.field2597 = true;
                                    if (var11.field2630 != null) {
                                        class415 var53 = new class415();
                                        var53.field5977 = true;
                                        var53.field5990 = var11;
                                        var53.field5983 = class78.field1105.method1975(66) - var12;
                                        var53.field5980 = class78.field1105.method1984((byte) -45) - var13;
                                        var53.field5989 = var11.field2630;
                                        class352.field5362.method2453((byte) -127, var53);
                                    }
                                }
                                if (var11.field2597 && var21 && var11.field2618 != null) {
                                    class415 var54 = new class415();
                                    var54.field5977 = true;
                                    var54.field5990 = var11;
                                    var54.field5983 = class78.field1105.method1975(87) - var12;
                                    var54.field5980 = class78.field1105.method1984((byte) -102) - var13;
                                    var54.field5989 = var11.field2618;
                                    class352.field5362.method2453((byte) -105, var54);
                                }
                                if (var11.field2597 && !var21) {
                                    var11.field2597 = false;
                                    if (var11.field2524 != null) {
                                        class415 var55 = new class415();
                                        var55.field5977 = true;
                                        var55.field5990 = var11;
                                        var55.field5983 = class78.field1105.method1975(87) - var12;
                                        var55.field5980 = class78.field1105.method1984((byte) -59) - var13;
                                        var55.field5989 = var11.field2524;
                                        class466.field6560.method2453((byte) -94, var55);
                                    }
                                }
                                if (var11.field2575 != null) {
                                    class415 var56 = new class415();
                                    var56.field5990 = var11;
                                    var56.field5989 = var11.field2575;
                                    class36.field471.method2453((byte) -99, var56);
                                }
                                if (var11.field2554 != null && class453.field6443 > var11.field2547) {
                                    if (var11.field2509 == null || class453.field6443 - var11.field2547 > 32) {
                                        class415 var61 = new class415();
                                        var61.field5990 = var11;
                                        var61.field5989 = var11.field2554;
                                        class352.field5362.method2453((byte) -103, var61);
                                    } else {
                                        label672: for (int var57 = var11.field2547; var57 < class453.field6443; var57++) {
                                            int var58 = class85.field1222[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var11.field2509.length; var59++) {
                                                if (var11.field2509[var59] == var58) {
                                                    class415 var60 = new class415();
                                                    var60.field5990 = var11;
                                                    var60.field5989 = var11.field2554;
                                                    class352.field5362.method2453((byte) -100, var60);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2547 = class453.field6443;
                                }
                                if (var11.field2517 != null && class469.field6608 > var11.field2588) {
                                    if (var11.field2585 == null || class469.field6608 - var11.field2588 > 32) {
                                        class415 var66 = new class415();
                                        var66.field5990 = var11;
                                        var66.field5989 = var11.field2517;
                                        class352.field5362.method2453((byte) -115, var66);
                                    } else {
                                        label648: for (int var62 = var11.field2588; var62 < class469.field6608; var62++) {
                                            int var63 = class351.field5351[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var11.field2585.length; var64++) {
                                                if (var11.field2585[var64] == var63) {
                                                    class415 var65 = new class415();
                                                    var65.field5990 = var11;
                                                    var65.field5989 = var11.field2517;
                                                    class352.field5362.method2453((byte) -109, var65);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2588 = class469.field6608;
                                }
                                if (var11.field2596 != null && class161.field2228 > var11.field2638) {
                                    if (var11.field2520 == null || class161.field2228 - var11.field2638 > 32) {
                                        class415 var71 = new class415();
                                        var71.field5990 = var11;
                                        var71.field5989 = var11.field2596;
                                        class352.field5362.method2453((byte) -84, var71);
                                    } else {
                                        label624: for (int var67 = var11.field2638; var67 < class161.field2228; var67++) {
                                            int var68 = class255.field3788[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var11.field2520.length; var69++) {
                                                if (var11.field2520[var69] == var68) {
                                                    class415 var70 = new class415();
                                                    var70.field5990 = var11;
                                                    var70.field5989 = var11.field2596;
                                                    class352.field5362.method2453((byte) -103, var70);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2638 = class161.field2228;
                                }
                                if (var11.field2522 != null && class262.field3888 > var11.field2510) {
                                    if (var11.field2622 == null || class262.field3888 - var11.field2510 > 32) {
                                        class415 var76 = new class415();
                                        var76.field5990 = var11;
                                        var76.field5989 = var11.field2522;
                                        class352.field5362.method2453((byte) -111, var76);
                                    } else {
                                        label600: for (int var72 = var11.field2510; var72 < class262.field3888; var72++) {
                                            int var73 = class18.field242[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var11.field2622.length; var74++) {
                                                if (var11.field2622[var74] == var73) {
                                                    class415 var75 = new class415();
                                                    var75.field5990 = var11;
                                                    var75.field5989 = var11.field2522;
                                                    class352.field5362.method2453((byte) -115, var75);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2510 = class262.field3888;
                                }
                                if (var11.field2645 != null && class358.field5440 > var11.field2555) {
                                    if (var11.field2635 == null || class358.field5440 - var11.field2555 > 32) {
                                        class415 var81 = new class415();
                                        var81.field5990 = var11;
                                        var81.field5989 = var11.field2645;
                                        class352.field5362.method2453((byte) -88, var81);
                                    } else {
                                        label576: for (int var77 = var11.field2555; var77 < class358.field5440; var77++) {
                                            int var78 = class386.field5700[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var11.field2635.length; var79++) {
                                                if (var11.field2635[var79] == var78) {
                                                    class415 var80 = new class415();
                                                    var80.field5990 = var11;
                                                    var80.field5989 = var11.field2645;
                                                    class352.field5362.method2453((byte) -103, var80);
                                                    break label576;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2555 = class358.field5440;
                                }
                                if (class431.field6131 > var11.field2657 && var11.field2523 != null) {
                                    class415 var82 = new class415();
                                    var82.field5990 = var11;
                                    var82.field5989 = var11.field2523;
                                    class352.field5362.method2453((byte) -111, var82);
                                }
                                if (class475.field6649 > var11.field2657 && var11.field2525 != null) {
                                    class415 var83 = new class415();
                                    var83.field5990 = var11;
                                    var83.field5989 = var11.field2525;
                                    class352.field5362.method2453((byte) -86, var83);
                                }
                                if (class75.field1041 > var11.field2657 && var11.field2619 != null) {
                                    class415 var84 = new class415();
                                    var84.field5990 = var11;
                                    var84.field5989 = var11.field2619;
                                    class352.field5362.method2453((byte) -121, var84);
                                }
                                if (class412.field5945 > var11.field2657 && var11.field2642 != null) {
                                    class415 var85 = new class415();
                                    var85.field5990 = var11;
                                    var85.field5989 = var11.field2642;
                                    class352.field5362.method2453((byte) -119, var85);
                                }
                                if (class273.field4162 > var11.field2657 && var11.field2557 != null) {
                                    class415 var86 = new class415();
                                    var86.field5990 = var11;
                                    var86.field5989 = var11.field2557;
                                    class352.field5362.method2453((byte) -120, var86);
                                }
                                var11.field2657 = class12.field169;
                                if (var11.field2624 != null) {
                                    for (int var87 = 0; var87 < class336.field5032; var87++) {
                                        class415 var88 = new class415();
                                        var88.field5990 = var11;
                                        var88.field5984 = class164.field2281[var87].method892(-1);
                                        var88.field5978 = class164.field2281[var87].method895((byte) 49);
                                        var88.field5989 = var11.field2624;
                                        class352.field5362.method2453((byte) -103, var88);
                                    }
                                }
                                if (class330.field4938 && var11.field2519 != null) {
                                    class415 var89 = new class415();
                                    var89.field5990 = var11;
                                    var89.field5989 = var11.field2519;
                                    class352.field5362.method2453((byte) -87, var89);
                                }
                            }
                            if (var11.field2655 == 5 && var11.field2636 != -1) {
                                var11.method1229(class365.field5529, (byte) -51, class431.field6129).method677(var11.field2589, class138.field1976, (byte) 46);
                            }
                            class296.method1856(28214, var11);
                            if (var11.field2655 == 0) {
                                method2774(arg0, var11.field2631, var14, var15, var16, var17, var12 - var11.field2530, var13 - var11.field2620, arg8, arg9);
                                if (var11.field2548 != null) {
                                    method2774(var11.field2548, var11.field2631, var14, var15, var16, var17, var12 - var11.field2530, var13 - var11.field2620, arg8, arg9);
                                }
                                class468 var90 = (class468) class466.field6564.method2305((long) var11.field2631, (byte) 113);
                                if (var90 != null) {
                                    if (class13.field195 == class124.field1710 && var90.field6587 == 0 && !class166.field2335 && var21 && !class365.field5528) {
                                        class281.method1809(true);
                                    }
                                    class36.method284(arg8, var13, var90.field6584, arg9, var17, var12, var14, -1, var16, var15);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class296.method1856(28214, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method2775() {
        for (int var0 = 0; var0 < class379.field5642; var0++) {
            int[] var1 = class406.field5898[var0];
            for (int var2 = 0; var2 < class456.field6477; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method2776(int arg0) {
        field6673++;
        if (class190.field2920 < class154.field2154.field1368) {
            if (class487.field6839 == class14.field198) {
                class14.field198 = class94.field1289;
            } else {
                class14.field198 = class487.field6839;
            }
            class467.field6579 = (class154.field2154.field1368 - 1) * 50 * 5;
            if (class467.field6579 > 3000) {
                class467.field6579 = 3000;
            }
            if (class154.field2154.field1368 >= 2 && class154.field2154.field1365 == 6) {
                this.method1117("js5connect_outofdate", (byte) -50);
                class316.field4752 = 1000;
                return;
            }
            if (class154.field2154.field1368 >= 4 && class154.field2154.field1365 == -1) {
                this.method1117("js5crc", (byte) -50);
                class316.field4752 = 1000;
                return;
            }
            if (class154.field2154.field1368 >= 4 && (class316.field4752 == 0 || class316.field4752 == 5)) {
                if (class154.field2154.field1365 == 7 || class154.field2154.field1365 == 9) {
                    this.method1117("js5connect_full", (byte) -50);
                } else if (class154.field2154.field1365 <= 0) {
                    this.method1117("js5io", (byte) -50);
                } else {
                    this.method1117("js5connect", (byte) -50);
                }
                class316.field4752 = 1000;
                return;
            }
        }
        class190.field2920 = class154.field2154.field1368;
        if (class467.field6579 > arg0) {
            class467.field6579--;
            return;
        }
        try {
            if (class472.field6623 == 0) {
                class382.field5662 = class21.field261.method1051(class14.field198, -4655, class150.field2110);
                class472.field6623++;
            }
            if (class472.field6623 == 1) {
                if (class382.field5662.field5822 == 2) {
                    this.method2786(1000, arg0 + 13);
                    return;
                }
                if (class382.field5662.field5822 == 1) {
                    class472.field6623++;
                }
            }
            if (class472.field6623 == 2) {
                class427.field6104 = new class147((Socket) class382.field5662.field5823, class21.field261);
                class446 var2 = new class446(5);
                var2.method2619((byte) -124, class109.field1534.field2407);
                var2.method2596((byte) 124, 575);
                class427.field6104.method1000(30000, 0, 5, var2.field6316);
                class472.field6623++;
                class235.field3424 = class435.method2539(-10659);
            }
            if (class472.field6623 == 3) {
                if (class316.field4752 == 0 || class316.field4752 == 5 || class427.field6104.method1005(5000) > 0) {
                    int var3 = class427.field6104.method1002((byte) -89);
                    if (var3 != 0) {
                        this.method2786(var3, arg0 ^ 0xD);
                        return;
                    }
                    class472.field6623++;
                } else if (class435.method2539(-10659) - class235.field3424 > 30000L) {
                    this.method2786(1001, 13);
                    return;
                }
            }
            if (class472.field6623 == 4) {
                boolean var4 = class316.field4752 == 5 || class316.field4752 == 10 || class316.field4752 == 28;
                class154.field2154.method743(114, !var4, class427.field6104);
                class427.field6104 = null;
                class472.field6623 = 0;
                class382.field5662 = null;
            }
        } catch (IOException var5) {
            this.method2786(1002, 13);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lje;)Lko;")
    public static final class176 method2777(class178 arg0) {
        class176 var1 = (class176) class206.field3111.method2305(((long) arg0.field2631 << 32) + (long) arg0.field2534, (byte) 91);
        return var1 == null ? arg0.field2668 : var1;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1133(int arg0) {
        field6663++;
        method2780(arg0 ^ 0xFFFFFFA8);
        class186.method1282(6798);
        class332.method2035((byte) 99);
        class488.method2851((byte) -115);
        class321.method1981((byte) 101);
        class49.method352((byte) 126);
        class35.method281(2);
        class157.method1076((byte) -1);
        class371.method2298(false);
        class165.method1126(true);
        class325.method2003(16711680);
        class204.method1392(true);
        class441.method2565(-10093);
        class315.method1945(118);
        class63.method588(16);
        class360.method2215(-15406);
        class208.method1405(78);
        class3.method24(30);
        class412.method2455((byte) 42);
        class209.method1414(0);
        class147.method994((byte) -96);
        class95.method744((byte) 19);
        class303.method1891(true);
        class478.method2800(0);
        class451.method2679(true);
        class262.method1726(false);
        class302.method1884(false);
        class400.method2398(118);
        class286.method1831(-126);
        class13.method131(arg0 - 64);
        class260.method1717(-16605);
        class251.method1601(-12);
        class442.method2568((byte) -64);
        class203.method1386(-13311);
        class389.method2345(false);
        class408.method2442(arg0);
        class46.method342(4);
        class164.method1109(arg0 ^ 0xFFFF9F90);
        class365.method2241(-7483);
        class45.method332(-105);
        class392.method2373(34);
        class206.method1403(arg0 ^ 0xFFFF8CA0);
        class232.method1521(35);
        class247.method1581((byte) 108);
        class58.method452(759623041);
        class134.method953(arg0 - 59);
        class320.method1968(-26150);
        class140.method971(true);
        class270.method1755(true);
        class230.method1510(-1923473896);
        class132.method920(arg0 ^ 0x3C35);
        class349.method2151(0);
        class51.method375(-2);
        class472.method2754(0);
        class69.method607((byte) -100);
        class340.method2089((byte) 120);
        class491.method2871(5);
        class350.method2164(false);
        class12.method121((byte) -114);
        class486.method2847(-118);
        class83.method678(89);
        class250.method1593(81);
        class178.method1228(arg0 ^ 0x40);
        class426.method2507(arg0 ^ 0xFFFFFFE5);
        class257.method1703(arg0 ^ 0xFFFFFFBD);
        class124.method866(-24634);
        class166.method1152(-15290);
        class362.method2230(256);
        class459.method2711((byte) -41);
        class446.method2586(-114);
        class356.method2189(arg0 ^ 0x6C1C);
        class309.method1918(-17499);
        class229.method1499(-44);
        class337.method2065(arg0 + 991);
        class198.method1346(-122);
        class267.method1744(30);
        class468.method2746((byte) -70);
        class176.method1214(arg0 - 28262);
        class285.method1824(arg0 ^ 0xFFFFBFBF);
        class401.method2405(arg0 - 191);
        class381.method2328(-1391);
        class1.method8(-1);
        class246.method1575(27);
        class57.method406(arg0 ^ 0x40);
        class48.method351((byte) 45);
        class233.method1524((byte) 111);
        class156.method1067(arg0 - 32);
        class385.method2338(-101);
        class312.method1935((byte) -116);
        class294.method1851(false);
        class5.method36(arg0 - 60);
        class280.method1801(arg0 ^ 0xFFFFFFE5);
        class329.method2017(1339);
        class14.method136(0);
        class24.method216(-7525);
        class266.method1743(arg0 - 1);
        class330.method2025(arg0 + 2128933071);
        class110.method806(1);
        class414.method2468((byte) -102);
        class288.method1836(2523);
        class484.method2830(0);
        class120.method852(34);
        class271.method1764(-120);
        class447.method2644(8);
        class273.method1782((byte) -16);
        class184.method1266((byte) 113);
        class33.method272(true);
        class462.method2726((byte) -104);
        class121.method854(true);
        class373.method2311(-85);
        class281.method1810(-115);
        class179.method1240(false);
        class21.method190((byte) -80);
        class361.method2220(26663);
        class2.method11((byte) -104);
        class366.method2260();
        class18.method184(0);
        class199.method1351((byte) -127);
        class418.method2482(-112);
        class76.method646((byte) -77);
        class296.method1855(31);
        class10.method107(arg0 ^ 0xFFFFFFC8);
        class220.method1452(true);
        class477.method2796();
        class189.method1312();
        class239.method1552();
        class122.method855((byte) -103);
        class94.method720(0);
        class169.method1173(8);
        class355.method2188(-13176);
        class193.method1330((byte) -117);
        class304.method1901(0);
        class85.method687(0);
        class236.method1534((byte) 111);
        class433.method2536(-100);
        class170.method1180((byte) 110);
        class322.method1990(-1);
        class130.method904(121);
        class480.method2814(15793);
        class172.method1189(0);
        class489.method2852(true);
        class126.method874((byte) 29);
        class306.method1907(arg0 ^ 0x47);
        class197.method1340(10924);
        class150.method1019(-5);
        class116.method827((byte) 48);
        class245.method1558(-3);
        class345.method2129(0);
        class188.method1294(-23);
        class115.method825((byte) 117);
        class9.method103(arg0 + 53);
        class227.method1473((byte) -62);
        class298.method1865(-127);
        class96.method760(0);
        class398.method2382(arg0 ^ 0x45);
        class219.method1449((byte) -55);
        class382.method2330((byte) 34);
        class301.method1876((byte) 98);
        class370.method2295((byte) 103);
        class175.method1205();
        class155.method1060(100);
        class351.method2168(arg0 - 64);
        class216.method1439(1);
        class92.method712(false);
        class427.method2509(false);
        class187.method1291((byte) -104);
        class464.method2729(true);
        class256.method1691(-109);
        class19.method188(8);
        class436.method2542(true);
        class415.method2473((byte) -73);
        class422.method2490(57);
        class99.method765((byte) 30);
        class305.method1902(101);
        class352.method2171(20135);
        class123.method865(arg0 - 64);
        class467.method2740(86);
        class59.method461();
        class378.method2319(false);
        class27.method234(32);
        class212.method1423(32277);
        class47.method346((byte) -8);
        class367.method2261((byte) -33);
        class100.method768((byte) -92);
        class287.method1832((byte) 113);
        class448.method2649(102);
        class32.method271(arg0 + 12920);
        class87.method693(10);
        class182.method1250((byte) 103);
        class317.method1950((byte) -34);
        class341.method2094(-24810);
        class252.method1604(arg0 - 64);
        class388.method2344(20917);
        class452.method2693(118);
        class43.method318((byte) 36);
        class283.method1819(arg0 - 36);
        class453.method2702((byte) -112);
        class98.method763(-16762);
        class429.method2520(arg0 + 52);
        class39.method300();
        class409.method2445(99);
        class363.method2235((byte) 91);
        class97.method762(-126);
        class226.method1465(150);
        class200.method1357((byte) 111);
        class6.method41(2);
        class53.method385(-116);
        class416.method2479(-88);
        class31.method267(-16486);
        class263.method1732(0);
        class37.method291((byte) -122);
        class201.method1361(-101);
        class228.method1483(137);
        class29.method248(141456743);
        class336.method2062((byte) 122);
        class380.method2323(true);
        class191.method1328(7832);
        class113.method815();
        class275.method1788((byte) 70);
        class493.method2887(arg0 - 9257);
        class258.method1707(420487964);
        class335.method2059(arg0 - 1187920996);
        class261.method1718(21);
        class42.method314((byte) 108);
        class333.method2042(29);
        class449.method2650(0);
        class353.method2175(-18919);
        class158.method1079((byte) 2);
        class177.method1224();
        class75.method644((byte) -126);
        class316.method1948(arg0 - 1276160089);
        class106.method786(arg0 ^ 0xFFFFFF90);
        class476.method2769((byte) 32);
        class40.method305(-1);
        class105.method779(-61);
        class439.method2554(15851);
        class109.method802(arg0 ^ 0x22);
        class327.method2013((byte) 126);
        class307.method1912((byte) -44);
        class44.method322((byte) -24);
        class463.method2728(-109);
        class36.method290(112);
        class282.method1812(124);
        class17.method179(65);
        class244.method1556(21);
        class310.method1929(arg0 ^ 0xFFFFFFBD);
        class34.method274();
        class437.method2546();
        class431.method2523((byte) -32);
        class403.method2412((byte) 54);
        class81.method668((byte) 51);
        class145.method991(7042);
        class74.method633();
        class61.method472();
        class70.method615((byte) -71);
        class405.method2424();
        class144.method984(1);
        class334.method2043((byte) -56);
        class456.method2705(2);
        class50.method367(true);
        class295.method1853(arg0 - 64);
        class161.method1092(16145);
        class432.method2528(arg0 ^ 0x3E);
        class346.method2135(106);
        class72.method624(124);
        class88.method694(false);
        if (arg0 != 64) {
            this.method2785(-42, (byte[]) null);
        }
        class479.method2813((byte) -29);
        class466.method2738(true);
        class394.method2378(-74);
        class38.method292((byte) 78);
        class71.method617(-29);
        class8.method95(255);
        class390.method2351(-1);
        class358.method2204(-1);
        class180.method1244(arg0 - 60);
        class450.method2653(-75);
        class402.method2406((byte) 41);
        class344.method2122(19997);
        class68.method602(0);
        class23.method211(true);
        class395.method2379(127);
        class428.method2517((byte) -73);
        class119.method846((byte) -93);
        class28.method238((byte) -124);
        class163.method1105(-16);
        class269.method1753((byte) 99);
        class314.method1941(83);
        class483.method2827(1736);
        class225.method1461(-6);
        class384.method2335(arg0 ^ 0x41);
        class324.method2002(arg0 ^ 0x10);
        class52.method380((byte) 57);
        class183.method1256(arg0 ^ 0xFFFFFFDB);
        class103.method777((byte) 35);
        class469.method2748((byte) 121);
        class386.method2339(arg0 + 13);
        class410.method2447((byte) 98);
        class299.method1869(0);
        class443.method2578(true);
        class65.method595((byte) 125);
        class485.method2836(arg0 ^ 0xFFFFFFBE);
        class4.method34(96);
        class141.method973(-20234);
        class138.method963(-109);
        class454.method2704(-105);
        class78.method656(arg0 - 64);
        class424.method2502(false);
        class492.method2882(false);
        class331.method2033(arg0 - 40500);
        class253.method1608((byte) -60);
        class318.method1956(false);
        class133.method930();
        class291.method1840();
        class473.method2759(3);
        class391.method2359((byte) 24);
        class55.method396((byte) -73);
        class297.method1860(-1);
        class475.method2767(101);
        class77.method651(true);
        class25.method218(false);
        class151.method1023((byte) -120);
        class111.method810(arg0 ^ 0x40);
        class313.method1937((byte) -71);
        class237.method1544(-127);
        class231.method1515(arg0 ^ 0xFFFFFFBF);
        class171.method1184(19086);
        class425.method2504(21661);
        class293.method1843((byte) -97);
        class131.method909((byte) 127);
        class136.method958(30000);
        class419.method2485(-69);
        class357.method2200((byte) -105);
        class154.method1054(arg0 - 375);
        class146.method993(arg0 + 38);
        class128.method896(true);
        class235.method1530(true);
        class465.method2731((byte) 67);
        class255.method1684((byte) -79);
        class190.method1326(7);
        class73.method629((byte) 121);
        class406.method2434(true);
        class174.method1194(-6056);
        class82.method671(true);
        class279.method1797((byte) 125);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static final void method2778(int arg0) {
        int var1 = class299.field4466;
        int[] var2 = class161.field2218;
        for (int var3 = 0; var3 < class256.field3797 + var1; var3++) {
            class309 var4;
            if (var3 < var1) {
                var4 = class40.field565[var2[var3]];
            } else {
                var4 = class18.field241[class236.field3441[var3 - var1]];
            }
            if (var4.field4545 == arg0 && var4.field4592 >= 0) {
                int var5 = var4.method1705((byte) 65);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4543 & 0x7F) != 0 || (var4.field4538 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field4543 & 0x7F) != 64 || (var4.field4538 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field4543 >> 7;
                    int var7 = var4.field4538 >> 7;
                    if (var4.field4592 > class406.field5898[var6][var7]) {
                        class406.field5898[var6][var7] = var4.field4592;
                        class324.field4870[var6][var7] = 1;
                    } else if (class406.field5898[var6][var7] == var4.field4592) {
                        var10002 = class324.field4870[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field4543 - var8 >> 7;
                    int var10 = var4.field4538 - var8 >> 7;
                    int var11 = var4.field4543 + var8 >> 7;
                    int var12 = var4.field4538 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field4592 > class406.field5898[var13][var14]) {
                                class406.field5898[var13][var14] = var4.field4592;
                                class324.field4870[var13][var14] = 1;
                            } else if (class406.field5898[var13][var14] == var4.field4592) {
                                var10002 = class324.field4870[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1132(int arg0) {
        field6658++;
        if (class95.field1349) {
            class92.method715(false);
        }
        if (arg0 > -84) {
            return;
        }
        if (class138.field1976 != null) {
            class138.field1976.method507((byte) -101);
        }
        if (class123.field1698 != null) {
            class475.method2766(class21.field261, class123.field1698, (byte) 111);
            class123.field1698 = null;
        }
        if (class27.field335 != null) {
            class27.field335.method998((byte) -13);
            class27.field335 = null;
        }
        if (class429.field6115 != null) {
            class429.field6115.method1410(18387, class378.field5618);
        }
        class429.field6115 = null;
        if (class395.field5816 != null) {
            class395.field5816.method2226((byte) -127);
        }
        if (class398.field5829 != null) {
            class398.field5829.method2226((byte) -126);
        }
        class154.field2154.method735(118);
        class247.field3591.method1885((byte) 94);
        if (class279.field4229 != null) {
            class279.field4229.method610((byte) -88);
            class279.field4229 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)I")
    public static final int method2779(int arg0) {
        field6669++;
        if (arg0 < 45) {
            field6670 = null;
        }
        if (class100.field1419 == null) {
            if (!class166.field2335 && class186.field2817 > 0) {
                if (class193.field2944 && class296.field4445.method1100(false, 81) && class186.field2817 > 2) {
                    return ((class146) class451.field6377.field5951.field435.field435).field2068;
                }
                return ((class146) class451.field6377.field5951.field435).field2068;
            }
            int var1 = class78.field1105.method1975(79);
            int var2 = class78.field1105.method1984((byte) -53);
            int var3 = class432.field6144;
            int var4 = class99.field1414;
            int var5 = class330.field4935;
            if (var1 > var3 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class186.field2817; var7++) {
                    if (class486.field6828) {
                        int var12 = (class186.field2817 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > var12 - 13 && var2 <= var12 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class186.field2817 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > var11 - 13 && (var11 + 3) >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class122 var9 = new class122(class451.field6377);
                    for (class146 var10 = (class146) var9.method857(16986); var10 != null; var10 = (class146) var9.method860(0)) {
                        if (var6 == var8++) {
                            return var10.field2068;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static void method2780(int arg0) {
        field6676 = null;
        field6675 = null;
        field6667 = null;
        field6674 = null;
        int var1 = 23 % ((arg0 + 70) / 42);
        field6670 = null;
        field6672 = null;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method2781(int arg0) {
        if (!class337.field5038.field3931) {
            for (int var2 = 0; var2 < class336.field5032; var2++) {
                if (class164.field2281[var2].method895((byte) 120) == 's' || class164.field2281[var2].method895((byte) 64) == 'S') {
                    class337.field5038.field3931 = true;
                    break;
                }
            }
        }
        field6668++;
        if (class143.field2034 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class435.method2539(-10659);
            if (class353.field5370 == 0L) {
                class353.field5370 = var5;
            }
            if (var4 > 16384 && var5 - class353.field5370 < 5000L) {
                if ((var5 - class379.field5640) > 1000L) {
                    System.gc();
                    class379.field5640 = var5;
                }
                class273.field4111 = class136.field1963.method2036(class4.field85, (byte) -21);
                class29.field403 = 5;
            } else {
                class273.field4111 = class172.field2460.method2036(class4.field85, (byte) -21);
                class29.field403 = 5;
                class143.field2034 = 10;
            }
        } else if (class143.field2034 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class183.field2717[var7] = class257.method1701((byte) -109, class379.field5642, class456.field6477);
            }
            class273.field4111 = class50.field725.method2036(class4.field85, (byte) -21);
            class143.field2034 = 20;
            class29.field403 = 10;
        } else if (class143.field2034 == 20) {
            if (class178.field2649 == null) {
                class178.field2649 = new class347(class154.field2154, class247.field3591);
            }
            if (class178.field2649.method2143((byte) 123)) {
                class493.field6938 = class317.method1953(1, 0, false, true, -32717);
                class443.field6258 = class317.method1953(1, 1, false, true, -32717);
                class73.field983 = class317.method1953(1, 2, false, true, -32717);
                class317.field4762 = class317.method1953(1, 3, false, true, -32717);
                class163.field2261 = class317.method1953(1, 4, false, true, -32717);
                class170.field2421 = class317.method1953(1, 5, true, true, -32717);
                class43.field598 = class317.method1953(1, 6, true, false, -32717);
                class231.field3398 = class317.method1953(1, 7, false, true, -32717);
                class425.field6075 = class317.method1953(1, 8, false, true, -32717);
                class116.field1617 = class317.method1953(1, 9, false, true, arg0 - 29836);
                class122.field1678 = class317.method1953(1, 10, false, true, -32717);
                class476.field6654 = class317.method1953(1, 11, false, true, -32717);
                class119.field1664 = class317.method1953(1, 12, false, true, arg0 ^ 0x748C);
                class388.field5716 = class317.method1953(1, 13, false, true, -32717);
                class120.field1669 = class317.method1953(1, 14, false, false, -32717);
                class378.field5624 = class317.method1953(1, 15, false, true, -32717);
                class251.field3621 = class317.method1953(1, 16, false, true, -32717);
                class33.field428 = class317.method1953(1, 17, false, true, -32717);
                class466.field6566 = class317.method1953(1, 18, false, true, -32717);
                class451.field6409 = class317.method1953(1, 19, false, true, arg0 ^ 0x748C);
                class130.field1819 = class317.method1953(1, 20, false, true, -32717);
                class285.field4350 = class317.method1953(1, 21, false, true, arg0 ^ 0x748C);
                class288.field4394 = class317.method1953(1, 22, false, true, arg0 ^ 0x748C);
                class150.field2106 = class317.method1953(1, 23, true, true, -32717);
                class97.field1396 = class317.method1953(1, 24, false, true, -32717);
                class473.field6628 = class317.method1953(1, 25, false, true, -32717);
                class58.field811 = class317.method1953(1, 26, true, true, -32717);
                class1.field19 = class317.method1953(1, 27, false, true, -32717);
                class208.field3145 = class317.method1953(1, 28, true, true, arg0 - 29836);
                class273.field4111 = class464.field6546.method2036(class4.field85, (byte) -21);
                class29.field403 = 15;
                class143.field2034 = 30;
            } else {
                class273.field4111 = class68.field926.method2036(class4.field85, (byte) -21);
                class29.field403 = 12;
            }
        } else if (class143.field2034 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 29; var9++) {
                var8 += class198.field2985[var9].method2803(-63) * class315.field4734[var9] / 100;
            }
            if (var8 == 100) {
                class273.field4111 = class231.field3396.method2036(class4.field85, (byte) -21);
                class29.field403 = 20;
                class392.method2374((byte) -64, class425.field6075);
                class333.method2041(class425.field6075, (byte) 39);
                class143.field2034 = 40;
            } else {
                if (var8 != 0) {
                    class273.field4111 = class288.field4396.method2036(class4.field85, (byte) -21) + var8 + "%";
                }
                class29.field403 = 20;
            }
        } else if (class143.field2034 == 40) {
            if (class208.field3145.method2660(-1)) {
                this.method2785(0, class208.field3145.method2667((byte) -126, 1));
                class273.field4111 = class4.field83.method2036(class4.field85, (byte) -21);
                class29.field403 = 25;
                class143.field2034 = 50;
            } else {
                class273.field4111 = class140.field2001.method2036(class4.field85, (byte) -21) + class208.field3145.method2661(true) + "%";
                class29.field403 = 25;
            }
        } else if (class143.field2034 == 50) {
            class100.method772(22050, 2, class337.field5038.field3936, true);
            class432.field6146 = new class166();
            class432.field6146.method1139(-2389, 128, 9);
            class395.field5816 = class285.method1825((byte) 117, 22050, class378.field5618, 0, class21.field261);
            class395.field5816.method2227(class432.field6146, arg0 + 2881);
            class453.method2699(class378.field5624, class432.field6146, class163.field2261, class120.field1669, 0);
            class398.field5829 = class285.method1825((byte) 63, 2048, class378.field5618, 1, class21.field261);
            class452.field6419 = new class404();
            class398.field5829.method2227(class452.field6419, 0);
            class424.field6071 = new class459(22050, class144.field2047);
            class279.field4230 = class43.field598.method2676("scape main", (byte) -46);
            class273.field4111 = class247.field3593.method2036(class4.field85, (byte) -21);
            class143.field2034 = 60;
            class29.field403 = 30;
        } else if (class143.field2034 == 60) {
            int var10 = class492.method2884(arg0 ^ 0xFFFFF4E7, class425.field6075, class388.field5716);
            int var11 = class81.method670(-1);
            if (var11 > var10) {
                class273.field4111 = class426.field6090.method2036(class4.field85, (byte) -21) + var10 * 100 / var11 + "%";
                class29.field403 = 35;
            } else {
                class273.field4111 = class327.field4885.method2036(class4.field85, (byte) -21);
                class29.field403 = 35;
                class143.field2034 = 70;
            }
        } else if (class143.field2034 == 70) {
            int var12 = class40.method303(0, class425.field6075);
            int var13 = class472.method2752(27944);
            if (var13 > var12) {
                class273.field4111 = class44.field625.method2036(class4.field85, (byte) -21) + var12 * 100 / var13 + "%";
                class29.field403 = 40;
            } else {
                class273.field4111 = class75.field1031.method2036(class4.field85, (byte) -21);
                class143.field2034 = 80;
                class29.field403 = 40;
            }
        } else if (class143.field2034 == 80) {
            if (class58.field811.method2660(-1)) {
                class492.field6913 = new class193(class58.field811, class116.field1617, class425.field6075);
                class273.field4111 = class178.field2646.method2036(class4.field85, (byte) -21);
                class143.field2034 = 90;
                class29.field403 = 45;
            } else {
                class273.field4111 = class275.field4186.method2036(class4.field85, (byte) -21) + class58.field811.method2661(true) + "%";
                class29.field403 = 45;
            }
        } else if (class143.field2034 == 90) {
            class273.field4111 = class40.field560.method2036(class4.field85, (byte) -21);
            class143.field2034 = 95;
            class29.field403 = 50;
        } else if (class143.field2034 == 95) {
            if (class337.field5038.field3931) {
                class337.field5038.field3941 = 0;
                class337.field5038.field3930 = 0;
                class337.field5038.field3951 = 0;
                class337.field5038.field3947 = 1;
                class337.field5038.field3935 = 0;
            }
            class337.field5038.field3931 = true;
            class337.field5038.method2208(arg0 + 2857, class21.field261);
            class144.method983(false, class337.field5038.field3935, -83);
            class273.field4111 = class28.field371.method2036(class4.field85, (byte) -21);
            class143.field2034 = 100;
            class29.field403 = 55;
        } else if (class143.field2034 == 100) {
            class85.method690(class138.field1976, class388.field5716, true, class425.field6075);
            class273.field4111 = class275.field4189.method2036(class4.field85, (byte) -21);
            class29.field403 = 60;
            class144.method987((byte) 29, 5);
            class143.field2034 = 110;
        } else if (class143.field2034 == 110) {
            class73.field983.method2660(arg0 + 2880);
            byte var14 = 0;
            int var15 = var14 + class73.field983.method2661(true);
            class251.field3621.method2660(-1);
            int var16 = var15 + class251.field3621.method2661(true);
            class33.field428.method2660(-1);
            int var17 = var16 + class33.field428.method2661(true);
            class466.field6566.method2660(-1);
            int var18 = var17 + class466.field6566.method2661(true);
            class451.field6409.method2660(-1);
            int var19 = var18 + class451.field6409.method2661(true);
            class130.field1819.method2660(-1);
            int var20 = var19 + class130.field1819.method2661(true);
            class285.field4350.method2660(arg0 ^ 0xB40);
            int var21 = var20 + class285.field4350.method2661(true);
            class288.field4394.method2660(-1);
            int var22 = var21 + class288.field4394.method2661(true);
            class97.field1396.method2660(arg0 + 2880);
            int var23 = var22 + class97.field1396.method2661(true);
            class473.field6628.method2660(-1);
            int var24 = var23 + class473.field6628.method2661(true);
            class1.field19.method2660(arg0 + 2880);
            int var25 = var24 + class1.field19.method2661(true);
            if (var25 < 1100) {
                class273.field4111 = class29.field402.method2036(class4.field85, (byte) -21) + var25 / 11 + "%";
                class29.field403 = 65;
            } else {
                class237.field3463 = new class206(class124.field1710, class4.field85, class73.field983);
                class297.field4454 = new class286(class124.field1710, class4.field85, class73.field983);
                class42.field571 = new class13(class124.field1710, class4.field85, class73.field983, class425.field6075);
                class324.field4867 = new class260(class124.field1710, class4.field85, class33.field428);
                class463.field6540 = new class251(class124.field1710, class4.field85, class73.field983);
                class352.field5364 = new class442(class124.field1710, class4.field85, class73.field983);
                class158.field2197 = new class203(class124.field1710, class4.field85, class73.field983, class231.field3398);
                class200.field3021 = new class389(class124.field1710, class4.field85, class73.field983);
                class81.field1144 = new class408(class124.field1710, class4.field85, class73.field983);
                class206.field3124 = new class46(class124.field1710, class4.field85, true, class251.field3621, class231.field3398);
                class492.field6915 = new class164(class124.field1710, class4.field85, class73.field983, class425.field6075);
                class256.field3796 = new class365(class124.field1710, class4.field85, class73.field983, class425.field6075);
                class448.field6339 = new class45(class124.field1710, class4.field85, true, class466.field6566, class231.field3398);
                class23.field309 = new class392(class124.field1710, class4.field85, true, class237.field3463, class451.field6409, class231.field3398);
                class388.field5714 = new class232(class124.field1710, class4.field85, class73.field983);
                class170.field2423 = new class247(class124.field1710, class4.field85, class130.field1819, class493.field6938, class443.field6258);
                class365.field5529 = new class84(class124.field1710, class4.field85, class73.field983);
                class431.field6129 = new class58(class124.field1710, class4.field85, class73.field983);
                class322.field4848 = new class134(class124.field1710, class4.field85, class285.field4350, class231.field3398);
                class258.field3853 = new class320(class124.field1710, class4.field85, class73.field983);
                class282.field4270 = new class140(class124.field1710, class4.field85, class73.field983);
                class318.field4778 = new class270(class124.field1710, class4.field85, class73.field983);
                class180.field2687 = new class230(class124.field1710, class4.field85, class288.field4394);
                class156.field2167 = new class132(class124.field1710, class4.field85, class73.field983);
                class335.method2052(class388.field5716, class317.field4762, class231.field3398, 1279658478, class425.field6075);
                class163.method1107(class473.field6628, class97.field1396, new class398(), 1);
                class210.method1415(false, class97.field1396, class473.field6628);
                class273.field4111 = class92.field1274.method2036(class4.field85, (byte) -21);
                class29.field403 = 65;
                class406.method2433((byte) -102);
                class206.field3124.method344(true, !class337.field5038.method2209(class170.field2424, 86));
                class315.field4736 = new class3();
                class92.method711((byte) -42);
                class158.method1082(class1.field19, (byte) 0);
                class442.method2570(class231.field3398, 4, class492.field6913);
                class143.field2034 = 120;
            }
        } else if (class143.field2034 == 120) {
            int var26 = class147.method995(class425.field6075, -120);
            int var27 = class321.method1979((byte) 100);
            if (var27 > var26) {
                class273.field4111 = class45.field641.method2036(class4.field85, (byte) -21) + var26 * 100 / var27 + "%";
                class29.field403 = 70;
            } else {
                class129.method900(class425.field6075, class138.field1976, 0);
                class14.method135(class186.field2816, arg0 + 2758);
                class273.field4111 = class203.field3088.method2036(class4.field85, (byte) -21);
                class29.field403 = 70;
                class143.field2034 = 130;
            }
        } else if (class143.field2034 == 130) {
            if (class122.field1678.method2678("huffman", 13541, "")) {
                class351 var28 = new class351(class122.field1678.method2687("", arg0 ^ 0x72F4, "huffman"));
                class273.method1784(var28, (byte) -75);
                class273.field4111 = class282.field4267.method2036(class4.field85, (byte) -21);
                class29.field403 = 75;
                class143.field2034 = 140;
            } else {
                class273.field4111 = class251.field3620.method2036(class4.field85, (byte) -21) + "0%";
                class29.field403 = 75;
            }
        } else if (class143.field2034 == 140) {
            if (class317.field4762.method2660(arg0 ^ 0xB40)) {
                class273.field4111 = class344.field5195.method2036(class4.field85, (byte) -21);
                class29.field403 = 80;
                class143.field2034 = 150;
            } else {
                class273.field4111 = class87.field1236.method2036(class4.field85, (byte) -21) + class317.field4762.method2661(true) + "%";
                class29.field403 = 80;
            }
        } else if (class143.field2034 == 150) {
            if (class119.field1664.method2660(-1)) {
                class273.field4111 = class122.field1681.method2036(class4.field85, (byte) -21);
                class29.field403 = 82;
                class143.field2034 = 160;
            } else {
                class273.field4111 = class302.field4500.method2036(class4.field85, (byte) -21) + class119.field1664.method2661(true) + "%";
                class29.field403 = 82;
            }
        } else if (class143.field2034 == 160) {
            if (class388.field5716.method2660(-1)) {
                class273.field4111 = class427.field6102.method2036(class4.field85, (byte) -21);
                class29.field403 = 85;
                class143.field2034 = 170;
            } else {
                class273.field4111 = class427.field6102.method2036(class4.field85, (byte) -21) + class388.field5716.method2661(true) + "%";
                class29.field403 = 85;
            }
        } else if (class143.field2034 == 170) {
            if (class150.field2106.method2664("details", true)) {
                class189.method1302(class150.field2106, class463.field6540, class352.field5364, class206.field3124, class492.field6915, class256.field3796, class315.field4736);
                class273.field4111 = class329.field4926.method2036(class4.field85, (byte) -21);
                class29.field403 = 89;
                class143.field2034 = 180;
            } else {
                class273.field4111 = class29.field400.method2036(class4.field85, (byte) -21) + class150.field2106.method2692("details", (byte) 60) + "%";
                class29.field403 = 87;
            }
        } else if (class143.field2034 == 180) {
            int var29 = class406.method2435(-109);
            if (var29 == -1) {
                class273.field4111 = class141.field2017.method2036(class4.field85, (byte) -21);
                class29.field403 = 90;
            } else if (var29 == 7 || var29 == 9) {
                this.method1117("worldlistfull", (byte) -50);
                class144.method987((byte) 29, 1000);
            } else if (class373.field5604) {
                class273.field4111 = class454.field6458.method2036(class4.field85, (byte) -21);
                class29.field403 = 90;
                class143.field2034 = 190;
            } else {
                this.method1117("worldlistio_" + var29, (byte) -50);
                class144.method987((byte) 29, 1000);
            }
        } else if (class143.field2034 == 190) {
            class12.field158 = new boolean[class318.field4778.field3994];
            class156.field2170 = new int[class318.field4778.field3994];
            class315.field4740 = new String[class282.field4270.field1997];
            for (int var30 = 0; var30 < class318.field4778.field3994; var30++) {
                if (class318.field4778.method1754((byte) 89, var30).field142 == 0) {
                    class12.field158[var30] = true;
                    class64.field873++;
                }
                class156.field2170[var30] = -1;
            }
            class322.method1987(-1);
            class297.field4453 = class317.field4762.method2676("loginscreen", (byte) -55);
            class170.field2421.method2673(false, arg0 ^ 0xFFFFF4BF, true);
            class43.field598.method2673(true, arg0 ^ 0xFFFFF4BF, true);
            class425.field6075.method2673(true, 0, true);
            class388.field5716.method2673(true, 0, true);
            class122.field1678.method2673(true, 0, true);
            class317.field4762.method2673(true, 0, true);
            class306.field4565 = true;
            class73.field983.field6378 = 2;
            class33.field428.field6378 = 2;
            class251.field3621.field6378 = 2;
            class466.field6566.field6378 = 2;
            class451.field6409.field6378 = 2;
            class130.field1819.field6378 = 2;
            class285.field4350.field6378 = 2;
            class76.method650((byte) -30, -1, class337.field5038.field3947, -1, false);
            class273.field4111 = class447.field6333.method2036(class4.field85, (byte) -21);
            class143.field2034 = 200;
            class29.field403 = 95;
        } else {
            if (arg0 != -2881) {
                field6676 = null;
            }
            if (class143.field2034 == 200) {
                class197.method1345(arg0 + 2870, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method2782(int arg0) {
        int var1 = class299.field4466;
        int[] var2 = class161.field2218;
        int var3 = class341.field5112 ? var1 : class256.field3797 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class309 var5;
            if (var4 < var1) {
                var5 = class40.field565[var2[var4]];
            } else {
                var5 = class18.field241[class236.field3441[var4 - var1]];
            }
            if (var5.field4545 == arg0) {
                var5.field4597 = 0;
                if (var5.field4592 < 0) {
                    var5.field4644 = false;
                } else {
                    int var6 = var5.method1705((byte) 65);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field4543 & 0x7F) != 0 || (var5.field4538 & 0x7F) != 0) {
                            var5.field4644 = false;
                            continue;
                        }
                    } else if ((var5.field4543 & 0x7F) != 64 || (var5.field4538 & 0x7F) != 64) {
                        var5.field4644 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field4543 >> 7;
                        int var8 = var5.field4538 >> 7;
                        if (class406.field5898[var7][var8] != var5.field4592) {
                            var5.field4644 = true;
                            continue;
                        }
                        if (class324.field4870[var7][var8] > 1) {
                            var10002 = class324.field4870[var7][var8]--;
                            var5.field4644 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field4543 - var9 >> 7;
                        int var11 = var5.field4538 - var9 >> 7;
                        int var12 = var5.field4543 + var9 >> 7;
                        int var13 = var5.field4538 + var9 >> 7;
                        if (!class29.method243(var13, var10, var11, var5.field4592, -125, var12)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class406.field5898[var14][var15] == var5.field4592) {
                                        var10002 = class324.field4870[var14][var15]--;
                                    }
                                }
                            }
                            var5.field4644 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class257 && var5.field4671 != null && class452.field6418 >= var5.field4671.field883 && class452.field6418 < var5.field4671.field881) {
                        ((class257) var5).field3842 = false;
                    }
                    var5.field4644 = false;
                    var5.field4554 = class25.method219(48602855, var5.field4545, var5.field4538, var5.field4543);
                    class204.method1394(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)I")
    public static final int method2783(int arg0, boolean arg1, int arg2, int arg3) {
        field6664++;
        class341 var4 = class271.method1763(arg1, arg0, false);
        if (var4 == null) {
            return -1;
        } else {
            if (arg3 != 0) {
                main((String[]) null);
            }
            return arg2 >= 0 && arg2 < var4.field5108.length ? var4.field5108[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method2784() {
        class466.field6562 = 0;
        for (int var0 = 0; var0 < class256.field3797; var0++) {
            class349 var1 = class18.field241[class236.field3441[var0]];
            if (var1.field4644 && var1.method1692(112) != -1) {
                int var2 = (var1.method1705((byte) 65) - 1) * 64 + 60;
                int var3 = var1.field4543 - var2 >> 7;
                int var4 = var1.field4538 - var2 >> 7;
                class309 var5 = class182.method1249((byte) 86, var3, var1.field4545, var4);
                if (var5 != null) {
                    int var6 = var5.field4609;
                    if (var5 instanceof class349) {
                        var6 += 2048;
                    }
                    if (var5.field4597 == 0 && var5.method1692(105) != -1) {
                        class390.field5747[class466.field6562] = var6;
                        class206.field3117[class466.field6562] = var6;
                        class466.field6562++;
                        var5.field4597++;
                    }
                    class390.field5747[class466.field6562] = var6;
                    class206.field3117[class466.field6562] = var1.field4609 + 2048;
                    class466.field6562++;
                    var5.field4597++;
                }
            }
        }
        class280.method1802(118, 0, class390.field5747, class206.field3117, class466.field6562 - 1);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field6656++;
        if (!this.method1127(true)) {
            return;
        }
        class209.field3150 = Integer.parseInt(this.getParameter("worldid"));
        class103.field1445 = class100.method771(Integer.parseInt(this.getParameter("modewhere")), 16515);
        if (!class53.method383(-16, class103.field1445) && class150.field2114 != class103.field1445) {
            class103.field1445 = class150.field2114;
        }
        class484.field6804 = class71.method619(Integer.parseInt(this.getParameter("modewhat")), (byte) 67);
        if (class484.field6804 != class350.field5344 && class484.field6804 != class110.field1556 && class484.field6804 != class418.field6008) {
            class484.field6804 = class418.field6008;
        }
        try {
            class4.field85 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class4.field85 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class245.field3518 = true;
        } else {
            class245.field3518 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class378.field5614 = true;
        } else {
            class378.field5614 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class489.field6854 = true;
        } else {
            class489.field6854 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class124.field1710 = class77.field1088;
        } else {
            class124.field1710 = class13.field195;
        }
        try {
            class64.field891 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class64.field891 = 0;
        }
        class141.field2022 = this.getParameter("quiturl");
        class229.field3374 = this.getParameter("settings");
        if (class229.field3374 == null) {
            class229.field3374 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class146.field2069 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class146.field2069 = 0;
            }
        }
        class252.field3624 = Integer.parseInt(this.getParameter("colourid"));
        if (class252.field3624 < 0 || class252.field3624 >= class154.field2157.length) {
            class252.field3624 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class459.field6503 = true;
            class419.field6026 = true;
        }
        class312.field4712 = this;
        if (class13.field195 == class124.field1710) {
            class4.field86 = 503;
            class356.field5401 = 765;
        } else if (class77.field1088 == class124.field1710) {
            class356.field5401 = 640;
            class4.field86 = 480;
        }
        this.method1124(575, class4.field86, class356.field5401, (byte) 104, class484.field6804.method1393((byte) -125) + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method2785(int arg0, byte[] arg1) {
        if (arg0 != 0) {
            field6674 = null;
        }
        field6666++;
        class446 var3 = new class446(arg1);
        while (true) {
            while (true) {
                int var4 = var3.method2628(49152);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class363.field5508 = new int[6];
                    var5[0] = var3.method2631(class76.method648(arg0, 2530));
                    var5[1] = var3.method2631(2530);
                    var5[2] = var3.method2631(2530);
                    var5[3] = var3.method2631(2530);
                    var5[4] = var3.method2631(2530);
                    var5[5] = var3.method2631(class76.method648(arg0, 2530));
                } else if (var4 == 4) {
                    int var6 = var3.method2628(49152);
                    class349.field5329 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class349.field5329[var7] = var3.method2631(2530);
                        if (class349.field5329[var7] == 65535) {
                            class349.field5329[var7] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var8 = var3.method2628(49152);
                    class76.field1067 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class76.field1067[var9] = var3.method2631(2530);
                        if (class76.field1067[var9] == 65535) {
                            class76.field1067[var9] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method1131(boolean arg0) {
        field6660++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class255.method1687(768);
        class247.field3591 = new class303(class21.field261);
        class154.field2154 = new class95();
        if (class150.field2114 != class103.field1445) {
            class206.field3123 = new byte[50][];
        }
        class337.field5038 = new class360(class21.field261);
        if (class150.field2114 == class103.field1445) {
            class226.field3315 = this.getCodeBase().getHost();
            class82.field1158 = 443;
            class84.field1192 = 43594;
        } else if (class53.method383(-16, class103.field1445)) {
            class226.field3315 = this.getCodeBase().getHost();
            class84.field1192 = class209.field3150 + 40000;
            class82.field1158 = class209.field3150 + 50000;
        } else if (class182.field2702 == class103.field1445) {
            class82.field1158 = class209.field3150 + 50000;
            class84.field1192 = class209.field3150 + 40000;
            class226.field3315 = "127.0.0.1";
        }
        class94.field1289 = class82.field1158;
        class150.field2110 = class226.field3315;
        class487.field6839 = class84.field1192;
        class461.field6509 = class84.field1192;
        if (class77.field1088 == class124.field1710) {
            class14.field200 = 16777215;
            class314.field4733 = class85.field1219;
            class85.field1221 = 0;
            class87.field1233 = class197.field2971;
            class193.field2944 = true;
            class76.field1071 = class180.field2689;
            class73.field989 = class488.field6846;
        } else {
            class73.field989 = class81.field1135;
            class314.field4733 = class255.field3786;
            class76.field1071 = class186.field2818;
            class87.field1233 = class441.field6235;
        }
        if (class153.field2137 == 3) {
            class212.field3196 = class209.field3150;
        }
        class306.field4561 = class146.field2065 = class398.field5830 = class76.field1075 = new short[256];
        class14.field198 = class461.field6509;
        class296.field4445 = class228.method1485(class378.field5618, 103333031);
        class78.field1105 = class105.method783(class378.field5618, arg0, 0);
        class429.field6115 = class147.method1001(21063);
        if (class429.field6115 != null) {
            class429.field6115.method1412(class378.field5618, -16731);
        }
        class257.field3816 = class153.field2137;
        try {
            if (class21.field261.field2126 != null) {
                class270.field3999 = new class262(class21.field261.field2126, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class475.field6652[var3] = new class262(class21.field261.field2131[var3], 6000, 0);
                }
                class29.field399 = new class262(class21.field261.field2122, 6000, 0);
                class416.field5996 = new class302(255, class270.field3999, class29.field399, 500000);
                class204.field3097 = new class262(class21.field261.field2124, 24, 0);
                class21.field261.field2131 = null;
                class21.field261.field2124 = null;
                class21.field261.field2126 = null;
                class21.field261.field2122 = null;
            }
        } catch (IOException var4) {
            class416.field5996 = null;
            class204.field3097 = null;
            class29.field399 = null;
            class270.field3999 = null;
        }
        if (class150.field2114 != class103.field1445) {
            class162.field2245 = true;
        }
        class197.field2962 = (class13.field195 == class124.field1710 ? class230.field3387 : class252.field3627).method2036(class4.field85, (byte) -21);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method2786(int arg0, int arg1) {
        class427.field6104 = null;
        class154.field2154.field1365 = arg0;
        class154.field2154.field1368++;
        class382.field5662 = null;
        field6659++;
        if (arg1 != 13) {
            field6675 = null;
        }
        class472.field6623 = 0;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method2787(int arg0) {
        if (arg0 != 65) {
            field6674 = null;
        }
        field6661++;
        boolean var2 = class154.field2154.method733((byte) -127);
        if (!var2) {
            this.method2776(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field6662++;
        try {
            if (arg0.length != 4) {
                class442.method2571("argument count", -1996554240);
            }
            class209.field3150 = Integer.parseInt(arg0[0]);
            class103.field1445 = class182.field2702;
            if (arg0[1].equals("live")) {
                class484.field6804 = class418.field6008;
            } else if (arg0[1].equals("rc")) {
                class484.field6804 = class110.field1556;
            } else if (arg0[1].equals("wip")) {
                class484.field6804 = class350.field5344;
            } else {
                class442.method2571("modewhat", -1996554240);
            }
            class4.field85 = class307.method1910(arg0[2], -1);
            if (class4.field85 == -1) {
                if (arg0[2].equals("english")) {
                    class4.field85 = 0;
                } else if (arg0[2].equals("german")) {
                    class4.field85 = 1;
                } else {
                    class442.method2571("language", -1996554240);
                }
            }
            class245.field3518 = false;
            class378.field5614 = false;
            if (arg0[3].equals("game0")) {
                class124.field1710 = class13.field195;
            } else if (arg0[3].equals("game1")) {
                class124.field1710 = class77.field1088;
            } else {
                class442.method2571("game", -1996554240);
            }
            class459.field6503 = true;
            class419.field6026 = true;
            class229.field3374 = "";
            class146.field2069 = 0;
            class64.field891 = 0;
            class252.field3624 = class124.field1710.field6119;
            client var1 = new client();
            class312.field4712 = var1;
            var1.method1123(29, 1024, class124.field1710.field6121, class484.field6804.method1393((byte) -64) + 32, 575, false, (byte) -70, 768);
            class316.field4749.setLocation(40, 40);
        } catch (Exception var3) {
            class416.method2475(false, var3, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method2788() {
        int var0 = class299.field4466;
        int[] var1 = class161.field2218;
        int var2 = class341.field5112 ? var0 : class256.field3797 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class309 var4;
            if (var3 < var0) {
                var4 = class40.field565[var1[var3]];
            } else {
                var4 = class18.field241[class236.field3441[var3 - var0]];
            }
            if (var4.field4592 >= 0) {
                int var5 = var4.method1705((byte) 65);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4543 & 0x7F) == 0 && (var4.field4538 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field4543 & 0x7F) == 64 && (var4.field4538 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class257 && var4.field4671 != null && class452.field6418 >= var4.field4671.field883 && class452.field6418 < var4.field4671.field881) {
                    ((class257) var4).field3842 = false;
                }
                var4.field4554 = class25.method219(48602855, var4.field4545, var4.field4538, var4.field4543);
                class204.method1394(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method2789(byte arg0) {
        class269.field3987++;
        field6671++;
        class142.method979(-1, -1, (class178) null, -1);
        class408.method2440((byte) 72, -1, (class178) null, -1);
        class20.method189(-6260);
        class12.field169++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class349 var12 = class18.field241[var2];
            if (var12 != null) {
                byte var13 = var12.field5309.field4140;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method1705((byte) 65);
                    if ((var13 & 0x2) != 0 && var12.field4678 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field4675[0] + var15;
                            int var18 = var12.field4674[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (class379.field5642 - var14 - 1 < var17) {
                                var17 = class379.field5642 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > class456.field6477 - var14 - 1) {
                                var18 = class456.field6477 - var14 - 1;
                            }
                            int var19 = class403.method2408(0, var14, var12.field4675[0], class302.field4494, var14, class183.field2717[var12.field4545], var18, class4.field87, var17, (byte) -100, 0, var12.field4674[0], -1, true, var14);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field4675[var20] = class4.field87[var19 - var20 - 1];
                                    var12.field4674[var20] = class302.field4494[var19 - var20 - 1];
                                    var12.field4672[var20] = 1;
                                }
                                var12.field4678 = var19;
                            }
                        }
                    }
                    class209.method1413(true, var12, 0);
                    int var21 = class2.method13(var12, -1);
                    class282.method1811(class441.field6233, (byte) 19, var12, var21, class21.field258);
                    class51.method370(-117, var12);
                }
            }
        }
        if (class88.field1240 == 0 && class78.field1095 == 0) {
            if (class469.field6596 == 2) {
                class363.method2234(0);
            } else {
                class287.method1834(0);
            }
            if ((class68.field920 >> 7) < 14 || class379.field5642 - 14 <= class68.field920 >> 7 || class200.field3027 >> 7 < 14 || class200.field3027 >> 7 >= class456.field6477 - 14) {
                class347.method2142((byte) -4);
            }
        }
        while (true) {
            class415 var3;
            class178 var4;
            class178 var5;
            do {
                var3 = (class415) class36.field471.method2457((byte) 75);
                if (var3 == null) {
                    while (true) {
                        class415 var6;
                        class178 var7;
                        class178 var8;
                        do {
                            var6 = (class415) class466.field6560.method2457((byte) 75);
                            if (var6 == null) {
                                while (true) {
                                    class415 var9;
                                    class178 var10;
                                    class178 var11;
                                    do {
                                        var9 = (class415) class352.field5362.method2457((byte) 75);
                                        if (var9 == null) {
                                            if (class100.field1419 != null) {
                                                class310.method1927(24600);
                                            }
                                            if (class452.field6418 % 1500 == 0) {
                                                class340.method2086((byte) 112);
                                            }
                                            class352.method2173(111);
                                            if (class95.field1349 && class435.method2539(-10659) - 60000L > class198.field2990) {
                                                class92.method715(false);
                                            }
                                            if (arg0 >= -21) {
                                                this.method2781(113);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field5990;
                                        if (var10.field2534 < 0) {
                                            break;
                                        }
                                        var11 = class493.method2885(var10.field2580, 65535);
                                    } while (var11 == null || var11.field2548 == null || var10.field2534 >= var11.field2548.length || var11.field2548[var10.field2534] != var10);
                                    class477.method2797(var9);
                                }
                            }
                            var7 = var6.field5990;
                            if (var7.field2534 < 0) {
                                break;
                            }
                            var8 = class493.method2885(var7.field2580, 65535);
                        } while (var8 == null || var8.field2548 == null || var7.field2534 >= var8.field2548.length || var8.field2548[var7.field2534] != var7);
                        class477.method2797(var6);
                    }
                }
                var4 = var3.field5990;
                if (var4.field2534 < 0) {
                    break;
                }
                var5 = class493.method2885(var4.field2580, 65535);
            } while (var5 == null || var5.field2548 == null || var4.field2534 >= var5.field2548.length || var5.field2548[var4.field2534] != var4);
            class477.method2797(var3);
        }
    }
}
