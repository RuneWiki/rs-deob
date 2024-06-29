import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class53 {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "B")
    private byte field754;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[J")
    public static long[] field751 = new long[32];

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "[I")
    public static int[] field755 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field758 = new String[5];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lue;")
    public static class222 field750;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Z")
    public static boolean field760;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public static final void method335(int arg0, int arg1) {
        field749++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class228.field3567[arg0];
        int var3 = class151.field2101[arg0];
        int var4 = class250.field3910[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var5 = (int) class51.field717[arg0];
        long var6 = class51.field717[arg0];
        if (var3 == 10) {
            class231.field3614.method809(121, arg1);
            class231.field3614.method1361(-2021929176, var5);
            class309.field4984++;
            class231.field3614.method1371(var2, -81);
            class231.field3614.method1375(var4, -98);
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(104, var4);
            class275.field4366 = var2;
        }
        if (var3 == 58) {
            class310 var8 = class88.field1274[var5];
            if (var8 != null) {
                class247.field3873 = 2;
                class17.field299 = class59.field826;
                class189.field2873 = class25.field393;
                class224.field3503 = 0;
                class303.field4810++;
                class231.field3614.method809(45, 0);
                class231.field3614.method1391(-126, class233.field3651[82] ? 1 : 0);
                class231.field3614.method1385(var5, true);
                class143.method898(var8.method1683(-64), var8.method1683(-70), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 39) {
            class314 var9 = class48.field689[var5];
            if (var9 != null) {
                class189.field2873 = class25.field393;
                class17.field299 = class59.field826;
                class291.field4637++;
                class247.field3873 = 2;
                class224.field3503 = 0;
                class231.field3614.method809(141, 0);
                class231.field3614.method1363(class233.field3651[82] ? 1 : 0, -35);
                class231.field3614.method1361(-2021929176, class83.field1142);
                class231.field3614.method1375(class288.field4593, -98);
                class231.field3614.method1371(class298.field4759, arg1 - 51);
                class231.field3614.method1385(var5, true);
                class143.method898(var9.method1683(-90), var9.method1683(-116), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 16) {
            class274.field4358++;
            class17.field299 = class59.field826;
            class189.field2873 = class25.field393;
            class247.field3873 = 2;
            class224.field3503 = 0;
            class231.field3614.method809(244, 0);
            class231.field3614.method1361(-2021929176, class228.field3570 + var2);
            class231.field3614.method1391(70, class233.field3651[82] ? 1 : 0);
            class231.field3614.method1371(class170.field2421 + var4, -55);
            class231.field3614.method1361(arg1 ^ 0x877BCF28, var5);
            class143.method898(0, 0, var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
        }
        if (var3 == 38) {
            class314 var10 = class48.field689[var5];
            if (var10 != null) {
                class247.field3873 = 2;
                class136.field1864++;
                class17.field299 = class59.field826;
                class189.field2873 = class25.field393;
                class224.field3503 = 0;
                class231.field3614.method809(126, arg1);
                class231.field3614.method1363(class233.field3651[82] ? 1 : 0, arg1 ^ 0x7C);
                class231.field3614.method1385(var5, true);
                class143.method898(var10.method1683(-75), var10.method1683(-64), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 9) {
            class103.field1485++;
            class231.field3614.method809(177, 0);
            class231.field3614.method1398(true, var4);
            class178 var11 = class166.method1057(77, var4);
            if (var11.field2669 != null && var11.field2669[0][0] == 5) {
                int var12 = var11.field2669[0][1];
                if (class189.field2864[var12] != var11.field2594[0]) {
                    class189.field2864[var12] = var11.field2594[0];
                    class78.method502(var12, -93);
                }
            }
        }
        if (var3 == 48) {
            if (var5 == 0) {
                class79.method505(class166.field2364, var2, var4);
            } else if (var5 == 1) {
                if (class245.field3846 > 0 && class233.field3651[82] && class233.field3651[81]) {
                    class136.method854(class228.field3570 + var2, class166.field2364, class170.field2421 + var4, (byte) 107);
                } else {
                    class231.method1517(1, 32148, var4, var2);
                    class231.field3614.method1363(class9.field100, 125);
                    class231.field3614.method1363(class149.field2061, 115);
                    class231.field3614.method1385((int) class123.field1743, true);
                    class231.field3614.method1363(57, 121);
                    if (class12.field203 == 4) {
                        class231.field3614.method1363(0, 92);
                        class231.field3614.method1363(0, -102);
                    } else {
                        class231.field3614.method1363(class179.field2712, -83);
                        class231.field3614.method1363(class42.field627, -22);
                    }
                    class231.field3614.method1363(89, 126);
                    class231.field3614.method1385(class250.field3905.field4081, true);
                    class231.field3614.method1385(class250.field3905.field4140, true);
                    class231.field3614.method1363(class15.field259, -112);
                    class231.field3614.method1363(63, 125);
                    class143.method898(0, 0, var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
                }
            }
        }
        if (var3 == 3) {
            class104.field1493++;
            class231.field3614.method809(89, 0);
            class231.field3614.method1381(var4, arg1 - 80);
            class231.field3614.method1361(-2021929176, var2);
            class231.field3614.method1393(-2032582224, class142.field1952);
            class231.field3614.method1385(class195.field2994, true);
        }
        if (var3 == 14) {
            class314 var13 = class48.field689[var5];
            if (var13 != null) {
                class17.field299 = class59.field826;
                class111.field1598++;
                class189.field2873 = class25.field393;
                class224.field3503 = 0;
                class247.field3873 = 2;
                class231.field3614.method809(5, 0);
                class231.field3614.method1400(49152, class233.field3651[82] ? 1 : 0);
                class231.field3614.method1385(var5, true);
                class143.method898(var13.method1683(-92), var13.method1683(-73), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 50) {
            class178 var14 = class166.method1057(49, var4);
            boolean var15 = true;
            if (var14.field2694 > 0) {
                var15 = class83.method532((byte) -126, var14);
            }
            if (var15) {
                class103.field1485++;
                class231.field3614.method809(177, 0);
                class231.field3614.method1398(true, var4);
            }
        }
        if (var3 == 12) {
            class314 var16 = class48.field689[var5];
            if (var16 != null) {
                class189.field2873 = class25.field393;
                class247.field3873 = 2;
                class17.field299 = class59.field826;
                class113.field1617++;
                class224.field3503 = 0;
                class231.field3614.method809(135, 0);
                class231.field3614.method1363(class233.field3651[82] ? 1 : 0, arg1 - 47);
                class231.field3614.method1371(var5, -93);
                class143.method898(var16.method1683(-125), var16.method1683(-97), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 2) {
            class310 var17 = class88.field1274[var5];
            if (var17 != null) {
                class29.field444++;
                class17.field299 = class59.field826;
                class247.field3873 = 2;
                class189.field2873 = class25.field393;
                class224.field3503 = 0;
                class231.field3614.method809(139, arg1);
                class231.field3614.method1359((byte) 49, class233.field3651[82] ? 1 : 0);
                class231.field3614.method1392(true, var5);
                class143.method898(var17.method1683(-83), var17.method1683(-66), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 28) {
            class231.field3614.method809(179, 0);
            class163.field2317++;
            class231.field3614.method1393(-2032582224, var4);
            class231.field3614.method1361(-2021929176, var5);
            class231.field3614.method1398(true, class142.field1952);
            class231.field3614.method1392(true, class195.field2994);
            class231.field3614.method1392(true, var2);
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(arg1 ^ 0xFFFFFFA0, var4);
            class275.field4366 = var2;
        }
        if (var3 == 59) {
            class235.field3664++;
            class231.field3614.method809(173, arg1);
            class231.field3614.method1385(var5, true);
            class231.field3614.method1381(var4, -93);
            class231.field3614.method1361(arg1 ^ 0x877BCF28, var2);
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(61, var4);
            class275.field4366 = var2;
        }
        if (var3 == 33) {
            class314 var18 = class48.field689[var5];
            if (var18 != null) {
                class224.field3503 = 0;
                class247.field3873 = 2;
                class192.field2922++;
                class189.field2873 = class25.field393;
                class17.field299 = class59.field826;
                class231.field3614.method809(136, arg1);
                class231.field3614.method1391(125, class233.field3651[82] ? 1 : 0);
                class231.field3614.method1371(var5, -51);
                class143.method898(var18.method1683(-59), var18.method1683(arg1 - 85), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 57) {
            class231.field3614.method809(112, arg1);
            class136.field1866++;
            class231.field3614.method1385(class83.field1142, true);
            class231.field3614.method1381(var4, -91);
            class231.field3614.method1361(arg1 ^ 0x877BCF28, class298.field4759);
            class231.field3614.method1393(arg1 ^ 0x86D941B0, class288.field4593);
            class231.field3614.method1385(var2, true);
            class231.field3614.method1392(true, var5);
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(-116, var4);
            class275.field4366 = var2;
        }
        if (var3 == 1011) {
            class224.field3503 = 0;
            class189.field2873 = class25.field393;
            class247.field3873 = 2;
            class14.field217++;
            class17.field299 = class59.field826;
            class231.field3614.method809(46, 0);
            class231.field3614.method1361(-2021929176, var5);
        }
        if (var3 == 60) {
            class144.method900(2);
        }
        if (var3 == 1003) {
            class224.field3503 = 0;
            class189.field2873 = class25.field393;
            class17.field299 = class59.field826;
            class247.field3873 = 2;
            class310 var19 = class88.field1274[var5];
            if (var19 != null) {
                class211 var20 = var19.field4993;
                if (var20.field3173 != null) {
                    var20 = var20.method1316((byte) -101);
                }
                if (var20 != null) {
                    class6.field59++;
                    class231.field3614.method809(59, 0);
                    class231.field3614.method1361(-2021929176, var20.field3177);
                }
            }
        }
        if (var3 == 51) {
            class314 var21 = class48.field689[var5];
            if (var21 != null) {
                class224.field3503 = 0;
                class17.field299 = class59.field826;
                class189.field2873 = class25.field393;
                class247.field3873 = 2;
                class231.field3614.method809(249, 0);
                class231.field3614.method1361(-2021929176, class195.field2994);
                class232.field3640++;
                class231.field3614.method1393(arg1 ^ 0x86D941B0, class142.field1952);
                class231.field3614.method1371(var5, -88);
                class231.field3614.method1400(49152, class233.field3651[82] ? 1 : 0);
                class143.method898(var21.method1683(-83), var21.method1683(-71), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 7) {
            class17.field299 = class59.field826;
            class224.field3503 = 0;
            class247.field3873 = 2;
            class310.field4995++;
            class189.field2873 = class25.field393;
            class231.field3614.method809(254, 0);
            class231.field3614.method1359((byte) 49, class233.field3651[82] ? 1 : 0);
            class231.field3614.method1392(true, class195.field2994);
            class231.field3614.method1398(true, class142.field1952);
            class231.field3614.method1361(-2021929176, var5);
            class231.field3614.method1385(class170.field2421 + var4, true);
            class231.field3614.method1385(class228.field3570 + var2, true);
            class143.method898(0, 0, var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
        }
        if (var3 == 17) {
            class252.field3932++;
            class247.field3873 = 2;
            class189.field2873 = class25.field393;
            class224.field3503 = 0;
            class17.field299 = class59.field826;
            class231.field3614.method809(192, 0);
            class231.field3614.method1385(class228.field3570 + var2, true);
            class231.field3614.method1361(arg1 - 2021929176, class170.field2421 + var4);
            class231.field3614.method1391(arg1 - 119, class233.field3651[82] ? 1 : 0);
            class231.field3614.method1392(true, var5);
            class143.method898(0, 0, var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
        }
        if (var3 == 21) {
            class17.field299 = class59.field826;
            class102.field1467++;
            class247.field3873 = 2;
            class224.field3503 = 0;
            class189.field2873 = class25.field393;
            class231.field3614.method809(227, 0);
            class231.field3614.method1400(49152, class233.field3651[82] ? 1 : 0);
            class231.field3614.method1371(Integer.MAX_VALUE & (int) (var6 >>> 32), -96);
            class231.field3614.method1392(true, var2 + class228.field3570);
            class231.field3614.method1392(true, class170.field2421 + var4);
            class265.method1719((byte) 119, var2, var4, var6);
        }
        if (var3 == 11) {
            class231.field3614.method809(94, 0);
            class231.field3614.method1375(var4, arg1 ^ 0xFFFFFF9E);
            class231.field3614.method1392(true, var2);
            class231.field3614.method1371(var5, -46);
            class69.field976++;
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(-122, var4);
            class275.field4366 = var2;
        }
        if (var3 == 34) {
            class21.method140(-8252);
            class178 var22 = class166.method1057(-102, var4);
            class288.field4593 = var4;
            class298.field4759 = var5;
            class83.field1142 = var2;
            class265.field4266 = 1;
            class312.method2108(false, var22);
            class34.field521 = "<col=ff9040>" + class281.method1822((byte) -99, var5).field147 + "<col=ffffff>";
            if (class34.field521 == null) {
                class34.field521 = "null";
            }
            return;
        }
        if (var3 == 42 && class76.field1074 == null) {
            class110.method701((byte) 23, var2, var4);
            class76.field1074 = class14.method96(~arg1, var4, var2);
            class312.method2108(false, class76.field1074);
        }
        if (var3 == 30) {
            class109.field1555++;
            class231.field3614.method809(102, 0);
            class231.field3614.method1393(arg1 ^ 0x86D941B0, var4);
            class231.field3614.method1361(-2021929176, var2);
            class231.field3614.method1392(true, var5);
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(43, var4);
            class275.field4366 = var2;
        }
        if (var3 == 26) {
            class310 var23 = class88.field1274[var5];
            if (var23 != null) {
                class247.field3873 = 2;
                class189.field2873 = class25.field393;
                class224.field3503 = 0;
                class212.field3195++;
                class17.field299 = class59.field826;
                class231.field3614.method809(158, 0);
                class231.field3614.method1361(arg1 - 2021929176, var5);
                class231.field3614.method1391(-127, class233.field3651[82] ? 1 : 0);
                class143.method898(var23.method1683(-108), var23.method1683(arg1 - 90), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 1004 || var3 == 1006 || var3 == 1010 || var3 == 1007 || var3 == 1012) {
            class63.method393(var2, var3, -27756, var5);
        }
        if (var3 == 20) {
            class314 var24 = class48.field689[var5];
            if (var24 != null) {
                class17.field299 = class59.field826;
                class175.field2469++;
                class189.field2873 = class25.field393;
                class247.field3873 = 2;
                class224.field3503 = 0;
                class231.field3614.method809(111, arg1);
                class231.field3614.method1400(49152, class233.field3651[82] ? 1 : 0);
                class231.field3614.method1385(var5, true);
                class143.method898(var24.method1683(arg1 - 60), var24.method1683(-91), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 49) {
            class310 var25 = class88.field1274[var5];
            if (var25 != null) {
                class189.field2873 = class25.field393;
                class224.field3503 = 0;
                class17.field299 = class59.field826;
                class5.field47++;
                class247.field3873 = 2;
                class231.field3614.method809(253, arg1);
                class231.field3614.method1393(-2032582224, class142.field1952);
                class231.field3614.method1359((byte) 49, class233.field3651[82] ? 1 : 0);
                class231.field3614.method1371(var5, arg1 - 44);
                class231.field3614.method1371(class195.field2994, -88);
                class143.method898(var25.method1683(-110), var25.method1683(-88), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 44) {
            class19.field321++;
            class231.field3614.method809(219, 0);
            class231.field3614.method1371(var5, -101);
            class231.field3614.method1371(var2, -41);
            class231.field3614.method1375(var4, -98);
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(57, var4);
            class275.field4366 = var2;
        }
        if (var3 == 4) {
            class247.field3873 = 2;
            class256.field4054++;
            class17.field299 = class59.field826;
            class189.field2873 = class25.field393;
            class224.field3503 = 0;
            class231.field3614.method809(137, 0);
            class231.field3614.method1363(class233.field3651[82] ? 1 : 0, arg1 - 83);
            class231.field3614.method1385((int) (var6 >>> 32) & Integer.MAX_VALUE, true);
            class231.field3614.method1385(class228.field3570 + var2, true);
            class231.field3614.method1361(arg1 - 2021929176, class170.field2421 + var4);
            class265.method1719((byte) 120, var2, var4, var6);
        }
        if (var3 == 23) {
            class231.field3614.method809(177, arg1);
            class231.field3614.method1398(true, var4);
            class178 var26 = class166.method1057(-108, var4);
            class103.field1485++;
            if (var26.field2669 != null && var26.field2669[0][0] == 5) {
                int var27 = var26.field2669[0][1];
                class189.field2864[var27] = 1 - class189.field2864[var27];
                class78.method502(var27, arg1 - 107);
            }
        }
        if (var3 == 45 || var3 == 1009) {
            class314.method2116(var2, var4, (byte) 118, var5, class137.field1877[arg0]);
        }
        if (var3 == 41) {
            class310 var28 = class88.field1274[var5];
            if (var28 != null) {
                class17.field299 = class59.field826;
                class247.field3873 = 2;
                class189.field2873 = class25.field393;
                class224.field3503 = 0;
                class231.field3614.method809(208, 0);
                class231.field3614.method1359((byte) 49, class233.field3651[82] ? 1 : 0);
                class231.field3614.method1361(-2021929176, var5);
                class143.method898(var28.method1683(-99), var28.method1683(arg1 - 103), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
                class208.field3092++;
            }
        }
        if (var3 == 1002) {
            class178 var29 = class166.method1057(114, var4);
            if (var29 == null || var29.field2691[var2] < 100000) {
                class231.field3614.method809(223, 0);
                class231.field3614.method1361(-2021929176, var5);
                class302.field4799++;
            } else {
                class89.method573(var29.field2691[var2] + " x " + class281.method1822((byte) -122, var5).field147, (byte) -121);
            }
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(-105, var4);
            class275.field4366 = var2;
        }
        if (var3 == 40) {
            class310.field4990++;
            class231.field3614.method809(119, 0);
            class231.field3614.method1381(var4, -84);
            class231.field3614.method1371(var5, -66);
            class231.field3614.method1385(var2, true);
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(76, var4);
            class275.field4366 = var2;
        }
        if (var3 == 43) {
            class310 var30 = class88.field1274[var5];
            if (var30 != null) {
                class17.field299 = class59.field826;
                class189.field2873 = class25.field393;
                class247.field3873 = 2;
                class224.field3503 = 0;
                class231.field3614.method809(183, 0);
                class180.field2730++;
                class231.field3614.method1363(class233.field3651[82] ? 1 : 0, arg1 - 65);
                class231.field3614.method1392(true, var5);
                class143.method898(var30.method1683(-80), var30.method1683(-93), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 25) {
            class247.field3873 = 2;
            class17.field299 = class59.field826;
            class189.field2873 = class25.field393;
            class224.field3503 = 0;
            class59.field815++;
            class231.field3614.method809(251, 0);
            class231.field3614.method1363(class233.field3651[82] ? 1 : 0, 101);
            class231.field3614.method1361(-2021929176, class83.field1142);
            class231.field3614.method1385(class170.field2421 + var4, true);
            class231.field3614.method1375(class288.field4593, -98);
            class231.field3614.method1385(class298.field4759, true);
            class231.field3614.method1392(true, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class231.field3614.method1392(true, class228.field3570 + var2);
            class265.method1719((byte) 125, var2, var4, var6);
        }
        if (var3 == 1001) {
            class189.field2873 = class25.field393;
            class17.field299 = class59.field826;
            class302.field4799++;
            class247.field3873 = 2;
            class224.field3503 = 0;
            class231.field3614.method809(223, 0);
            class231.field3614.method1361(-2021929176, var5);
        }
        if (var3 == 47) {
            class310 var31 = class88.field1274[var5];
            if (var31 != null) {
                class247.field3873 = 2;
                class17.field299 = class59.field826;
                class43.field654++;
                class189.field2873 = class25.field393;
                class224.field3503 = 0;
                class231.field3614.method809(79, 0);
                class231.field3614.method1361(-2021929176, class298.field4759);
                class231.field3614.method1392(true, var5);
                class231.field3614.method1363(class233.field3651[82] ? 1 : 0, -58);
                class231.field3614.method1385(class83.field1142, true);
                class231.field3614.method1398(true, class288.field4593);
                class143.method898(var31.method1683(arg1 ^ 0xFFFFFFAD), var31.method1683(-100), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 32) {
            class314 var32 = class48.field689[var5];
            if (var32 != null) {
                class247.field3873 = 2;
                class224.field3503 = 0;
                class205.field3068++;
                class189.field2873 = class25.field393;
                class17.field299 = class59.field826;
                class231.field3614.method809(100, arg1);
                class231.field3614.method1400(49152, class233.field3651[82] ? 1 : 0);
                class231.field3614.method1361(-2021929176, var5);
                class143.method898(var32.method1683(-96), var32.method1683(-97), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 19) {
            class17.field299 = class59.field826;
            class224.field3503 = 0;
            class112.field1606++;
            class247.field3873 = 2;
            class189.field2873 = class25.field393;
            class231.field3614.method809(204, 0);
            class231.field3614.method1371(var5, -113);
            class231.field3614.method1371(class228.field3570 + var2, -75);
            class231.field3614.method1361(-2021929176, class170.field2421 + var4);
            class231.field3614.method1363(class233.field3651[82] ? 1 : 0, 100);
            class143.method898(0, 0, var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
        }
        if (var3 == 8) {
            class224.field3503 = 0;
            class247.field3873 = 2;
            class17.field299 = class59.field826;
            class189.field2873 = class25.field393;
            class231.field3614.method809(83, 0);
            class231.field3614.method1392(true, class228.field3570 + var2);
            class205.field3064++;
            class231.field3614.method1371(var5, arg1 ^ 0xFFFFFF83);
            class231.field3614.method1359((byte) 49, class233.field3651[82] ? 1 : 0);
            class231.field3614.method1392(true, var4 + class170.field2421);
            class143.method898(0, 0, var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
        }
        if (var3 == 13) {
            class231.field3614.method809(41, arg1);
            class208.field3093++;
            class231.field3614.method1361(-2021929176, var2);
            class231.field3614.method1398(true, var4);
            class231.field3614.method1392(true, var5);
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(84, var4);
            class275.field4366 = var2;
        }
        if (var3 == 1005) {
            class189.field2873 = class25.field393;
            class247.field3873 = 2;
            class224.field3503 = 0;
            class6.field57++;
            class17.field299 = class59.field826;
            class231.field3614.method809(32, arg1);
            class231.field3614.method1400(49152, class233.field3651[82] ? 1 : 0);
            class231.field3614.method1385(var4 + class170.field2421, true);
            class231.field3614.method1385((int) (var6 >>> 32) & Integer.MAX_VALUE, true);
            class231.field3614.method1392(true, class228.field3570 + var2);
            class265.method1719((byte) 123, var2, var4, var6);
        }
        if (var3 == 1) {
            class51.field725++;
            class189.field2873 = class25.field393;
            class17.field299 = class59.field826;
            class224.field3503 = 0;
            class247.field3873 = 2;
            class231.field3614.method809(105, 0);
            class231.field3614.method1361(-2021929176, var4 + class170.field2421);
            class231.field3614.method1371((int) (var6 >>> 32) & Integer.MAX_VALUE, -97);
            class231.field3614.method1363(class233.field3651[82] ? 1 : 0, -17);
            class231.field3614.method1392(true, var2 + class228.field3570);
            class231.field3614.method1361(-2021929176, class195.field2994);
            class231.field3614.method1393(-2032582224, class142.field1952);
            class265.method1719((byte) 126, var2, var4, var6);
        }
        if (var3 == 35) {
            class314 var33 = class48.field689[var5];
            if (var33 != null) {
                class17.field299 = class59.field826;
                class189.field2873 = class25.field393;
                class224.field3503 = 0;
                class240.field3714++;
                class247.field3873 = 2;
                class231.field3614.method809(12, 0);
                class231.field3614.method1371(var5, -63);
                class231.field3614.method1400(49152, class233.field3651[82] ? 1 : 0);
                class143.method898(var33.method1683(arg1 ^ 0xFFFFFFB4), var33.method1683(arg1 ^ 0xFFFFFFB4), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 18) {
            class178.field2692++;
            class17.field299 = class59.field826;
            class189.field2873 = class25.field393;
            class224.field3503 = 0;
            class247.field3873 = 2;
            class231.field3614.method809(25, 0);
            class231.field3614.method1371(class83.field1142, -54);
            class231.field3614.method1385(var5, true);
            class231.field3614.method1385(var2 + class228.field3570, true);
            class231.field3614.method1363(class233.field3651[82] ? 1 : 0, 108);
            class231.field3614.method1385(var4 + class170.field2421, true);
            class231.field3614.method1393(-2032582224, class288.field4593);
            class231.field3614.method1392(true, class298.field4759);
            class143.method898(0, 0, var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
        }
        if (var3 == 5) {
            class189.field2873 = class25.field393;
            class35.field527++;
            class224.field3503 = 0;
            class17.field299 = class59.field826;
            class247.field3873 = 2;
            class231.field3614.method809(63, 0);
            class231.field3614.method1385((int) (var6 >>> 32) & Integer.MAX_VALUE, true);
            class231.field3614.method1392(true, var4 + class170.field2421);
            class231.field3614.method1400(arg1 ^ 0xC000, class233.field3651[82] ? 1 : 0);
            class231.field3614.method1371(class228.field3570 + var2, -108);
            class265.method1719((byte) 118, var2, var4, var6);
        }
        if (var3 == 31) {
            if (var5 == 0) {
                class242.field3808 = 1;
                class79.method505(class166.field2364, var2, var4);
            } else if (class245.field3846 > 0 && class233.field3651[82] && class233.field3651[81]) {
                class136.method854(class228.field3570 + var2, class166.field2364, class170.field2421 + var4, (byte) 124);
            } else {
                class231.field3614.method809(125, 0);
                class281.field4461++;
                class231.field3614.method1371(class228.field3570 + var2, arg1 ^ 0xFFFFFFD4);
                class231.field3614.method1385(class170.field2421 + var4, true);
            }
        }
        if (var3 == 24) {
            class231.field3614.method809(242, 0);
            class231.field3614.method1398(true, var4);
            class231.field3614.method1371(var2, -127);
            class148.field2024++;
            class231.field3614.method1371(var5, arg1 - 63);
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(53, var4);
            class275.field4366 = var2;
        }
        if (var3 == 6) {
            class178 var34 = class14.method96(-1, var4, var2);
            if (var34 != null) {
                class21.method140(arg1 - 8252);
                class297 var35 = client.method2028(var34);
                class137.method861(var4, var34.field2653, var35.field4731, var34.field2697, var35.method1996(-11), (byte) -96, var2);
                class265.field4266 = 0;
                class225.field3526 = class115.method736((byte) 34, var34);
                if (var34.field2611) {
                    class166.field2353 = var34.field2533 + "<col=ffffff>";
                } else {
                    class166.field2353 = "<col=00ff00>" + var34.field2547 + "<col=ffffff>";
                }
                if (class225.field3526 == null) {
                    class225.field3526 = "Null";
                }
            }
            return;
        }
        if (var3 == 46) {
            if (var5 == 0) {
                class258.field4178 = 1;
                class79.method505(class166.field2364, var2, var4);
            } else if (var5 == 1) {
                class104.field1491++;
                class231.field3614.method809(216, arg1);
                class231.field3614.method1392(true, class195.field2994);
                class231.field3614.method1361(-2021929176, class228.field3570 + var2);
                class231.field3614.method1398(true, class142.field1952);
                class231.field3614.method1371(class170.field2421 + var4, arg1 ^ 0xFFFFFFA7);
            }
        }
        if (var3 == 36) {
            class247.field3873 = 2;
            class224.field3503 = 0;
            class17.field299 = class59.field826;
            class18.field308++;
            class189.field2873 = class25.field393;
            class231.field3614.method809(43, arg1);
            class231.field3614.method1385(class170.field2421 + var4, true);
            class231.field3614.method1371(Integer.MAX_VALUE & (int) (var6 >>> 32), arg1 ^ 0xFFFFFF86);
            class231.field3614.method1391(-89, class233.field3651[82] ? 1 : 0);
            class231.field3614.method1392(true, class228.field3570 + var2);
            class265.method1719((byte) 119, var2, var4, var6);
        }
        if (var3 == 29) {
            class279.field4433++;
            class17.field299 = class59.field826;
            class247.field3873 = 2;
            class189.field2873 = class25.field393;
            class224.field3503 = 0;
            class231.field3614.method809(138, arg1);
            class231.field3614.method1391(-76, class233.field3651[82] ? 1 : 0);
            class231.field3614.method1361(-2021929176, class170.field2421 + var4);
            class231.field3614.method1361(arg1 ^ 0x877BCF28, class228.field3570 + var2);
            class231.field3614.method1371(var5, -51);
            class143.method898(0, 0, var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
        }
        if (var3 == 37) {
            class231.field3614.method809(145, 0);
            class231.field3614.method1371(var2, -89);
            class231.field3614.method1392(true, var5);
            class175.field2466++;
            class231.field3614.method1381(var4, arg1 - 82);
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(arg1 ^ 0xFFFFFFA4, var4);
            class275.field4366 = var2;
        }
        if (var3 == 22) {
            class314 var36 = class48.field689[var5];
            if (var36 != null) {
                class17.field299 = class59.field826;
                class39.field595++;
                class247.field3873 = 2;
                class189.field2873 = class25.field393;
                class224.field3503 = 0;
                class231.field3614.method809(101, arg1);
                class231.field3614.method1359((byte) 49, class233.field3651[82] ? 1 : 0);
                class231.field3614.method1392(true, var5);
                class143.method898(var36.method1683(-107), var36.method1683(-76), var2, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, 0, var4);
            }
        }
        if (var3 == 15) {
            class231.field3614.method809(107, 0);
            class231.field3614.method1375(var4, -98);
            class291.field4635++;
            class231.field3614.method1392(true, var5);
            class231.field3614.method1371(var2, -99);
            class113.field1625 = 0;
            class229.field3590 = class166.method1057(119, var4);
            class275.field4366 = var2;
        }
        if (class265.field4266 != arg1) {
            class265.field4266 = 0;
            class312.method2108(false, class166.method1057(arg1 - 127, class288.field4593));
        }
        if (class193.field2950) {
            class21.method140(-8252);
        }
        if (class229.field3590 != null && class113.field1625 == 0) {
            class312.method2108(false, class229.field3590);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static final void method336(byte arg0) {
        field764++;
        if (arg0 != 76) {
            field751 = null;
        }
        class277.field4401.method944(99);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lim;I)Lim;")
    public static final class178 method337(class178 arg0, int arg1) {
        if (arg1 != 0) {
            field760 = false;
        }
        field766++;
        class178 var2 = client.method2038(arg0);
        if (var2 == null) {
            var2 = arg0.field2666;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I")
    public static final int method338(int arg0) {
        field767++;
        if (arg0 != 82) {
            method337((class178) null, 60);
        }
        return class151.field2094.method953(0);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)I")
    public final int method339(int arg0) {
        if (arg0 > -118) {
            return 123;
        } else {
            field759++;
            return this.field754 & 0x7;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static void method340(int arg0) {
        field750 = null;
        if (arg0 == 10259) {
            field755 = null;
            field751 = null;
            field758 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public static final void method341(int arg0) {
        class35.field531.method948((byte) 58);
        if (arg0 != 0) {
            field750 = null;
        }
        class126.field1759.method948((byte) 58);
        field763++;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class53() {
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lbj;)V")
    public class53(class215 arg0) {
        this.field754 = arg0.method1350((byte) 91);
        this.field752 = arg0.method1379(-102);
        this.field753 = arg0.method1383((byte) -105);
        this.field762 = arg0.method1383((byte) -84);
        this.field765 = arg0.method1383((byte) 42);
        this.field761 = arg0.method1383((byte) 28);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)I")
    public final int method342(byte arg0) {
        field756++;
        if (arg0 != 103) {
            this.field753 = -126;
        }
        return (this.field754 & 0x8) == 8 ? 1 : 0;
    }
}
