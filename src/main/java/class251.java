import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class251 extends class88 {

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    private int field4022;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    private int field4029;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    private int field4016;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    private int field4009;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    private int field4018;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    private int field4010;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    private int field4019;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    private int field4023;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "[Lse;")
    public static class10[] field4014 = new class10[14];

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public static int field4020 = 0;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public static int field4025 = 0;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    public static int field4027 = 0;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "Z")
    public static boolean field4024 = false;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field4017 = 0;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4013 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "Ljj;")
    public static class134 field4021;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)V")
    public final void method621(int arg0, int arg1, int arg2) {
        ++field4012;
        if (arg2 != 0) {
            this.method620(-17, -77, 34);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIB)V")
    public final void method629(int arg0, int arg1, byte arg2) {
        int var4 = this.field4029 * arg1 >> 12;
        ++field4026;
        int var5 = -53 % ((arg2 - -19) / 62);
        int var6 = this.field4016 * arg1 >> 12;
        int var7 = this.field4009 * arg0 >> 12;
        int var8 = this.field4022 * arg0 >> 12;
        int var9 = this.field4019 * arg0 >> 12;
        int var10 = this.field4010 * arg0 >> 12;
        int var11 = this.field4018 * arg1 >> 12;
        int var12 = this.field4023 * arg1 >> 12;
        class1.method11(var10, var8, var7, (byte) 117, super.field1208, var12, var4, var6, var11, var9);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)V")
    public static final void method1653(byte arg0, int arg1) {
        ++field4028;
        if (arg1 >= 0) {
            int var2 = class270.field4368[arg1];
            int var3 = class23.field284[arg1];
            int var4 = class23.field291[arg1];
            long var5 = class109.field1892[arg1];
            if (~var4 <= -2001) {
                var4 -= 2000;
            }
            int var7 = (int) class109.field1892[arg1];
            if (~var4 == -7) {
                class235 var8 = class260.field4141[var7];
                if (var8 != null) {
                    class153.field2480 = 0;
                    class71.field973 = class266.field4319;
                    ++class66.field938;
                    class9.field142 = 2;
                    class8.field125 = class232.field3696;
                    class83.field1148.method1238(196, arg0 + -136478394);
                    class83.field1148.method1771(14819, !class247.field3975[82] ? 0 : 1);
                    class83.field1148.method1772((byte) -29, var7);
                }
            }
            if (~var4 == -42) {
                class275 var9 = class198.field3193[var7];
                if (var9 != null) {
                    class71.field973 = class266.field4319;
                    class8.field125 = class232.field3696;
                    class153.field2480 = 0;
                    ++class28.field340;
                    class9.field142 = 2;
                    class83.field1148.method1238(136, -136478397);
                    class83.field1148.method1736(class247.field3975[82] ? 1 : 0, true);
                    class83.field1148.method1768(93, var7);
                }
            }
            if (~var4 == -34) {
                ++class92.field1307;
                class83.field1148.method1238(91, -136478397);
                class83.field1148.method1737(-1234590152, class254.field4063);
                class83.field1148.method1789((byte) -38, var3);
                class83.field1148.method1761(class221.field3526, 4334);
                class83.field1148.method1769(128, var2);
            }
            if (~var4 == -44) {
                ++class290.field4631;
                class83.field1148.method1238(43, arg0 ^ 136478398);
                class83.field1148.method1772((byte) -29, var7);
                class83.field1148.method1764((byte) -103, var3);
                class83.field1148.method1768(103, var2);
                class296.field4681 = 0;
                class109.field1882 = class168.method1180(8931, var3);
                class228.field3628 = var2;
            }
            if (var4 == 20) {
                class235 var10 = class260.field4141[var7];
                if (var10 != null) {
                    class71.field973 = class266.field4319;
                    ++class142.field2307;
                    class153.field2480 = 0;
                    class8.field125 = class232.field3696;
                    class9.field142 = 2;
                    class83.field1148.method1238(92, -136478397);
                    class83.field1148.method1772((byte) -29, var7);
                    class83.field1148.method1744(-30, !class247.field3975[82] ? 0 : 1);
                }
            }
            if (var4 == 39) {
                class83.field1148.method1238(192, -136478397);
                class83.field1148.method1772((byte) -29, var2);
                class83.field1148.method1768(66, var7);
                ++class174.field2805;
                class83.field1148.method1763(var3, arg0 ^ 9698);
                class296.field4681 = 0;
                class109.field1882 = class168.method1180(8931, var3);
                class228.field3628 = var2;
            }
            if (~var4 == -26) {
                ++class79.field1078;
                class83.field1148.method1238(19, arg0 ^ 136478398);
                class83.field1148.method1789((byte) -38, var3);
                class83.field1148.method1769(128, var2);
                class83.field1148.method1761(var7, 4334);
                class296.field4681 = 0;
                class109.field1882 = class168.method1180(8931, var3);
                class228.field3628 = var2;
            }
            if (var4 == 30) {
                class235 var11 = class260.field4141[var7];
                if (var11 != null) {
                    class153.field2480 = 0;
                    class8.field125 = class232.field3696;
                    class71.field973 = class266.field4319;
                    ++class257.field4105;
                    class9.field142 = 2;
                    class83.field1148.method1238(250, -136478397);
                    class83.field1148.method1744(-43, class247.field3975[82] ? 1 : 0);
                    class83.field1148.method1761(var7, arg0 + 4337);
                }
            }
            if (var4 == 57) {
                class83.field1148.method1238(13, -136478397);
                ++class184.field2949;
                class83.field1148.method1761(var2, 4334);
                class83.field1148.method1764((byte) -103, var3);
                class83.field1148.method1761(var7, 4334);
                class296.field4681 = 0;
                class109.field1882 = class168.method1180(8931, var3);
                class228.field3628 = var2;
            }
            if (~var4 == -29) {
                class235 var12 = class260.field4141[var7];
                if (var12 != null) {
                    ++class120.field2024;
                    class153.field2480 = 0;
                    class71.field973 = class266.field4319;
                    class8.field125 = class232.field3696;
                    class9.field142 = 2;
                    class83.field1148.method1238(184, -136478397);
                    class83.field1148.method1768(101, var7);
                    class83.field1148.method1757(class247.field3975[82] ? 1 : 0, (byte) 122);
                }
            }
            if (var4 == 7) {
                if (var7 != 0) {
                    if (var7 == 1) {
                        if (class151.field2420 > 0 && class247.field3975[82] && class247.field3975[81]) {
                            class217.method1444(arg0 ^ -56, class93.field1321 - -var3, class296.field4685 - -var2, class28.field336);
                        } else {
                            class142.method965(5, var2, var3, 1);
                            class83.field1148.method1757(class218.field3488, (byte) -16);
                            class83.field1148.method1757(class73.field994, (byte) -38);
                            class83.field1148.method1761((int) class121.field2039, arg0 ^ -4333);
                            class83.field1148.method1757(57, (byte) 127);
                            class83.field1148.method1757(class93.field1330, (byte) -119);
                            class83.field1148.method1757(class77.field1050, (byte) 108);
                            class83.field1148.method1757(89, (byte) 116);
                            class83.field1148.method1761(class197.field3179.field614, arg0 + 4337);
                            class83.field1148.method1761(class197.field3179.field613, 4334);
                            class83.field1148.method1757(class294.field4657, (byte) 119);
                            class83.field1148.method1757(63, (byte) -91);
                        }
                    }
                } else {
                    class30.method209(class28.field336, var2, var3);
                }
            }
            if (var4 == 1004) {
                class71.field973 = class266.field4319;
                class153.field2480 = 0;
                class9.field142 = 2;
                ++class260.field4135;
                class8.field125 = class232.field3696;
                class83.field1148.method1238(194, -136478397);
                class83.field1148.method1768(50, (int) (var5 >>> 32) & Integer.MAX_VALUE);
                class83.field1148.method1761(class296.field4685 + var2, arg0 + 4337);
                class83.field1148.method1744(arg0 ^ 94, class247.field3975[82] ? 1 : 0);
                class83.field1148.method1769(128, var3 - -class93.field1321);
            }
            if (~var4 == -47) {
                class83.field1148.method1238(188, -136478397);
                class83.field1148.method1789((byte) -38, class254.field4063);
                ++class284.field4530;
                class83.field1148.method1772((byte) -29, class221.field3526);
                class83.field1148.method1768(arg0 + 116, var7);
                class83.field1148.method1772((byte) -29, var2);
                class83.field1148.method1764((byte) -103, var3);
                class296.field4681 = 0;
                class109.field1882 = class168.method1180(8931, var3);
                class228.field3628 = var2;
            }
            if (var4 == 1002) {
                class103 var13 = class168.method1180(8931, var3);
                if (var13 != null && var13.field1592[var2] >= 100000) {
                    class297.method1986(0, "", true, var13.field1592[var2] + " x " + class64.method514(var7, 0).field3358);
                } else {
                    ++class8.field120;
                    class83.field1148.method1238(236, arg0 + -136478394);
                    class83.field1148.method1761(var7, arg0 ^ -4333);
                }
                class296.field4681 = 0;
                class109.field1882 = class168.method1180(8931, var3);
                class228.field3628 = var2;
            }
            if (~var4 == -30) {
                class9.field142 = 2;
                class8.field125 = class232.field3696;
                ++class189.field3019;
                class71.field973 = class266.field4319;
                class153.field2480 = 0;
                class83.field1148.method1238(189, arg0 ^ 136478398);
                class83.field1148.method1768(87, class296.field4685 + var2);
                class83.field1148.method1771(14819, !class247.field3975[82] ? 0 : 1);
                class83.field1148.method1769(128, var3 - -class93.field1321);
                class83.field1148.method1768(77, var7);
            }
            if (arg0 != -3) {
                field4021 = null;
            }
            if (var4 == 16 || var4 == 1007) {
                class265.method1791(var2, class162.field2633[arg1], var3, -25002, var7);
            }
            if (var4 == 58) {
                class235 var14 = class260.field4141[var7];
                if (var14 != null) {
                    class71.field973 = class266.field4319;
                    class8.field125 = class232.field3696;
                    ++class125.field2094;
                    class153.field2480 = 0;
                    class9.field142 = 2;
                    class83.field1148.method1238(176, -136478397);
                    class83.field1148.method1761(class221.field3526, 4334);
                    class83.field1148.method1769(128, var7);
                    class83.field1148.method1763(class254.field4063, -9697);
                    class83.field1148.method1744(arg0 + -71, class247.field3975[82] ? 1 : 0);
                }
            }
            if (var4 == 13) {
                class9.field142 = 2;
                ++field4011;
                class71.field973 = class266.field4319;
                class153.field2480 = 0;
                class8.field125 = class232.field3696;
                class83.field1148.method1238(76, -136478397);
                class83.field1148.method1768(105, (int) (var5 >>> 32) & Integer.MAX_VALUE);
                class83.field1148.method1761(class296.field4685 + var2, 4334);
                class83.field1148.method1757(!class247.field3975[82] ? 0 : 1, (byte) -128);
                class83.field1148.method1761(var3 - -class93.field1321, 4334);
            }
            if (~var4 == -18) {
                ++class191.field3053;
                class83.field1148.method1238(183, -136478397);
                class83.field1148.method1763(var3, -9697);
                class83.field1148.method1769(128, var7);
                class83.field1148.method1768(118, var2);
                class296.field4681 = 0;
                class109.field1882 = class168.method1180(arg0 + 8934, var3);
                class228.field3628 = var2;
            }
            if (~var4 == -50) {
                class275 var15 = class198.field3193[var7];
                if (var15 != null) {
                    class8.field125 = class232.field3696;
                    class153.field2480 = 0;
                    ++class30.field360;
                    class71.field973 = class266.field4319;
                    class9.field142 = 2;
                    class83.field1148.method1238(109, arg0 ^ 136478398);
                    class83.field1148.method1744(arg0 + -80, !class247.field3975[82] ? 0 : 1);
                    class83.field1148.method1761(var7, 4334);
                }
            }
            if (var4 == 23) {
                class275 var16 = class198.field3193[var7];
                if (var16 != null) {
                    class153.field2480 = 0;
                    class8.field125 = class232.field3696;
                    ++class102.field1533;
                    class9.field142 = 2;
                    class71.field973 = class266.field4319;
                    class83.field1148.method1238(66, arg0 + -136478394);
                    class83.field1148.method1757(class247.field3975[82] ? 1 : 0, (byte) 112);
                    class83.field1148.method1772((byte) -29, var7);
                    class83.field1148.method1737(-1234590152, class42.field496);
                    class83.field1148.method1768(122, class85.field1157);
                    class83.field1148.method1761(class209.field3433, 4334);
                }
            }
            if (~var4 == -60) {
                ++class225.field3568;
                class8.field125 = class232.field3696;
                class153.field2480 = 0;
                class9.field142 = 2;
                class71.field973 = class266.field4319;
                class83.field1148.method1238(48, -136478397);
                class83.field1148.method1736(!class247.field3975[82] ? 0 : 1, true);
                class83.field1148.method1768(arg0 + 93, class296.field4685 + var2);
                class83.field1148.method1769(arg0 ^ -131, class221.field3526);
                class83.field1148.method1772((byte) -29, (int) (var5 >>> 32) & Integer.MAX_VALUE);
                class83.field1148.method1768(arg0 ^ -116, class93.field1321 + var3);
                class83.field1148.method1789((byte) -38, class254.field4063);
            }
            if (~var4 == -22) {
                class153.field2480 = 0;
                class8.field125 = class232.field3696;
                class9.field142 = 2;
                ++class33.field404;
                class71.field973 = class266.field4319;
                class83.field1148.method1238(25, -136478397);
                class83.field1148.method1761(class93.field1321 + var3, arg0 ^ -4333);
                class83.field1148.method1761(var7, 4334);
                class83.field1148.method1757(class247.field3975[82] ? 1 : 0, (byte) 113);
                class83.field1148.method1761(class296.field4685 + var2, arg0 ^ -4333);
            }
            if (var4 == 5) {
                ++class131.field2191;
                class8.field125 = class232.field3696;
                class153.field2480 = 0;
                class71.field973 = class266.field4319;
                class9.field142 = 2;
                class83.field1148.method1238(246, -136478397);
                class83.field1148.method1764((byte) -103, class42.field496);
                class83.field1148.method1761(class93.field1321 + var3, 4334);
                class83.field1148.method1772((byte) -29, class209.field3433);
                class83.field1148.method1769(128, var7);
                class83.field1148.method1768(arg0 ^ -93, class85.field1157);
                class83.field1148.method1736(class247.field3975[82] ? 1 : 0, true);
                class83.field1148.method1768(40, class296.field4685 + var2);
            }
            if (var4 == 1) {
                class8.field125 = class232.field3696;
                class71.field973 = class266.field4319;
                class153.field2480 = 0;
                class9.field142 = 2;
                class83.field1148.method1238(11, -136478397);
                ++class241.field3857;
                class83.field1148.method1761(var2 - -class296.field4685, 4334);
                class83.field1148.method1771(14819, !class247.field3975[82] ? 0 : 1);
                class83.field1148.method1769(128, var7);
                class83.field1148.method1769(128, class93.field1321 + var3);
            }
            if (var4 == 19) {
                class223.method1482(arg0 + -93);
            }
            if (~var4 == -48) {
                class103 var17 = class122.method859(var2, (byte) -104, var3);
                if (var17 != null) {
                    class238.method1566(arg0 + 82);
                    class29 var18 = client.method1511(var17);
                    class197.method1330(var18.method204((byte) -18), var17.field1562, var2, var17.field1723, (byte) 51, var18.field349, var3);
                    class262.field4151 = 0;
                    class117.field1995 = class262.method1717(var17, 113);
                    if (!var17.field1603) {
                        class21.field268 = "<col=00ff00>" + var17.field1710 + "<col=ffffff>";
                    } else {
                        class21.field268 = var17.field1717 + "<col=ffffff>";
                    }
                    if (class117.field1995 == null) {
                        class117.field1995 = "Null";
                    }
                }
            } else {
                if (~var4 == -16) {
                    class235 var19 = class260.field4141[var7];
                    if (var19 != null) {
                        class71.field973 = class266.field4319;
                        class8.field125 = class232.field3696;
                        class9.field142 = 2;
                        class153.field2480 = 0;
                        ++class133.field2208;
                        class83.field1148.method1238(161, arg0 + -136478394);
                        class83.field1148.method1761(var7, 4334);
                        class83.field1148.method1744(-124, !class247.field3975[82] ? 0 : 1);
                    }
                }
                if (var4 == 11) {
                    class83.field1148.method1238(174, -136478397);
                    class83.field1148.method1772((byte) -29, var2);
                    ++class101.field1528;
                    class83.field1148.method1737(-1234590152, var3);
                    class83.field1148.method1772((byte) -29, var7);
                    class296.field4681 = 0;
                    class109.field1882 = class168.method1180(8931, var3);
                    class228.field3628 = var2;
                }
                if (~var4 == -1006) {
                    ++class8.field120;
                    class8.field125 = class232.field3696;
                    class71.field973 = class266.field4319;
                    class9.field142 = 2;
                    class153.field2480 = 0;
                    class83.field1148.method1238(236, -136478397);
                    class83.field1148.method1761(var7, 4334);
                }
                if (var4 == 42) {
                    ++class1.field7;
                    class71.field973 = class266.field4319;
                    class9.field142 = 2;
                    class8.field125 = class232.field3696;
                    class153.field2480 = 0;
                    class83.field1148.method1238(82, arg0 + -136478394);
                    class83.field1148.method1772((byte) -29, class296.field4685 + var2);
                    class83.field1148.method1772((byte) -29, (int) (var5 >>> 32) & Integer.MAX_VALUE);
                    class83.field1148.method1768(arg0 ^ -125, var3 - -class93.field1321);
                    class83.field1148.method1757(class247.field3975[82] ? 1 : 0, (byte) -113);
                }
                if (~var4 == -13) {
                    if (~var7 != -1) {
                        if (~var7 == -2) {
                            ++class104.field1734;
                            class83.field1148.method1238(206, -136478397);
                            class83.field1148.method1769(128, class221.field3526);
                            class83.field1148.method1772((byte) -29, class296.field4685 + var2);
                            class83.field1148.method1761(class93.field1321 + var3, 4334);
                            class83.field1148.method1737(-1234590152, class254.field4063);
                        }
                    } else {
                        class216.field3467 = 1;
                        class30.method209(class28.field336, var2, var3);
                    }
                }
                if (var4 == 9) {
                    class8.field125 = class232.field3696;
                    class71.field973 = class266.field4319;
                    class9.field142 = 2;
                    ++class220.field3517;
                    class153.field2480 = 0;
                    class83.field1148.method1238(100, -136478397);
                    class83.field1148.method1769(128, class85.field1157);
                    class83.field1148.method1761(class209.field3433, arg0 ^ -4333);
                    class83.field1148.method1789((byte) -38, class42.field496);
                    class83.field1148.method1772((byte) -29, class93.field1321 + var3);
                    class83.field1148.method1736(class247.field3975[82] ? 1 : 0, true);
                    class83.field1148.method1768(85, Integer.MAX_VALUE & (int) (var5 >>> 32));
                    class83.field1148.method1761(class296.field4685 + var2, 4334);
                }
                if (var4 == 35) {
                    ++class170.field2747;
                    class83.field1148.method1238(125, -136478397);
                    class83.field1148.method1789((byte) -38, var3);
                    class103 var20 = class168.method1180(arg0 + 8934, var3);
                    if (var20.field1689 != null && ~var20.field1689[0][0] == -6) {
                        int var21 = var20.field1689[0][1];
                        class214.field3454[var21] = -class214.field3454[var21] + 1;
                        class233.method1542(var21, (byte) 63);
                    }
                }
                if (var4 == 37) {
                    class83.field1148.method1238(117, -136478397);
                    class83.field1148.method1737(arg0 ^ 1234590149, var3);
                    ++class223.field3546;
                    class83.field1148.method1769(128, var2);
                    class83.field1148.method1761(var7, 4334);
                    class296.field4681 = 0;
                    class109.field1882 = class168.method1180(8931, var3);
                    class228.field3628 = var2;
                }
                if (var4 == 31) {
                    class9.field142 = 2;
                    class153.field2480 = 0;
                    ++class5.field67;
                    class8.field125 = class232.field3696;
                    class71.field973 = class266.field4319;
                    class83.field1148.method1238(219, -136478397);
                    class83.field1148.method1772((byte) -29, class93.field1321 + var3);
                    class83.field1148.method1772((byte) -29, class296.field4685 + var2);
                    class83.field1148.method1768(127, (int) (var5 >>> 32) & Integer.MAX_VALUE);
                    class83.field1148.method1744(-75, !class247.field3975[82] ? 0 : 1);
                }
                if (~var4 == -51) {
                    ++class115.field1971;
                    class83.field1148.method1238(237, -136478397);
                    class83.field1148.method1761(var7, 4334);
                    class83.field1148.method1764((byte) -103, var3);
                    class83.field1148.method1768(68, var2);
                    class83.field1148.method1768(57, class85.field1157);
                    class83.field1148.method1764((byte) -103, class42.field496);
                    class83.field1148.method1761(class209.field3433, 4334);
                    class296.field4681 = 0;
                    class109.field1882 = class168.method1180(8931, var3);
                    class228.field3628 = var2;
                }
                if (var4 == 18 && class247.field3969 == null) {
                    class38.method302(arg0 + -116, var2, var3);
                    class247.field3969 = class122.method859(var2, (byte) 56, var3);
                    class45.method346((byte) 31, class247.field3969);
                }
                if (var4 == 24) {
                    class275 var22 = class198.field3193[var7];
                    if (var22 != null) {
                        class71.field973 = class266.field4319;
                        ++class171.field2760;
                        class9.field142 = 2;
                        class8.field125 = class232.field3696;
                        class153.field2480 = 0;
                        class83.field1148.method1238(37, -136478397);
                        class83.field1148.method1744(arg0 ^ 76, !class247.field3975[82] ? 0 : 1);
                        class83.field1148.method1772((byte) -29, var7);
                    }
                }
                if (var4 == 2) {
                    class9.field142 = 2;
                    ++class113.field1948;
                    class153.field2480 = 0;
                    class71.field973 = class266.field4319;
                    class8.field125 = class232.field3696;
                    class83.field1148.method1238(99, -136478397);
                    class83.field1148.method1772((byte) -29, var3 - -class93.field1321);
                    class83.field1148.method1772((byte) -29, var7);
                    class83.field1148.method1768(arg0 ^ -122, class296.field4685 + var2);
                    class83.field1148.method1771(14819, class247.field3975[82] ? 1 : 0);
                }
                if (var4 == 44) {
                    ++class74.field1011;
                    class83.field1148.method1238(49, arg0 + -136478394);
                    class83.field1148.method1764((byte) -103, var3);
                    class83.field1148.method1768(40, var2);
                    class83.field1148.method1772((byte) -29, var7);
                    class296.field4681 = 0;
                    class109.field1882 = class168.method1180(8931, var3);
                    class228.field3628 = var2;
                }
                if (~var4 == -37) {
                    class235 var23 = class260.field4141[var7];
                    if (var23 != null) {
                        class153.field2480 = 0;
                        ++class23.field294;
                        class71.field973 = class266.field4319;
                        class9.field142 = 2;
                        class8.field125 = class232.field3696;
                        class83.field1148.method1238(96, -136478397);
                        class83.field1148.method1771(14819, !class247.field3975[82] ? 0 : 1);
                        class83.field1148.method1769(128, var7);
                    }
                }
                if (var4 == 1003) {
                    class153.field2480 = 0;
                    class9.field142 = 2;
                    class71.field973 = class266.field4319;
                    class8.field125 = class232.field3696;
                    ++class184.field2946;
                    class83.field1148.method1238(111, -136478397);
                    class83.field1148.method1772((byte) -29, var7);
                }
                if (~var4 == -23) {
                    if (~var7 == -1) {
                        class174.field2808 = 1;
                        class30.method209(class28.field336, var2, var3);
                    } else if (~class151.field2420 < -1 && class247.field3975[82] && class247.field3975[81]) {
                        class217.method1444(90, class93.field1321 + var3, class296.field4685 + var2, class28.field336);
                    } else {
                        ++class249.field3994;
                        class83.field1148.method1238(29, arg0 + -136478394);
                        class83.field1148.method1772((byte) -29, class93.field1321 + var3);
                        class83.field1148.method1761(class296.field4685 - -var2, 4334);
                    }
                }
                if (var4 == 1006) {
                    class71.field973 = class266.field4319;
                    class8.field125 = class232.field3696;
                    class153.field2480 = 0;
                    class9.field142 = 2;
                    class275 var24 = class198.field3193[var7];
                    if (var24 != null) {
                        class265 var25 = var24.field4439;
                        if (var25.field4271 != null) {
                            var25 = var25.method1794(-8159);
                        }
                        if (var25 != null) {
                            ++class203.field3257;
                            class83.field1148.method1238(203, arg0 + -136478394);
                            class83.field1148.method1768(57, var25.field4277);
                        }
                    }
                }
                if (var4 == 3) {
                    class9.field142 = 2;
                    ++class244.field3903;
                    class71.field973 = class266.field4319;
                    class8.field125 = class232.field3696;
                    class153.field2480 = 0;
                    class83.field1148.method1238(98, -136478397);
                    class83.field1148.method1769(128, var2 - -class296.field4685);
                    class83.field1148.method1744(arg0 + -33, !class247.field3975[82] ? 0 : 1);
                    class83.field1148.method1768(121, var7);
                    class83.field1148.method1761(class93.field1321 + var3, 4334);
                }
                if (~var4 == -33) {
                    ++client.field3608;
                    class83.field1148.method1238(97, -136478397);
                    class83.field1148.method1761(var7, arg0 + 4337);
                    class83.field1148.method1764((byte) -103, var3);
                    class83.field1148.method1769(128, var2);
                    class296.field4681 = 0;
                    class109.field1882 = class168.method1180(8931, var3);
                    class228.field3628 = var2;
                }
                if (var4 == 48) {
                    class275 var26 = class198.field3193[var7];
                    if (var26 != null) {
                        class153.field2480 = 0;
                        ++class185.field2955;
                        class9.field142 = 2;
                        class8.field125 = class232.field3696;
                        class71.field973 = class266.field4319;
                        class83.field1148.method1238(113, -136478397);
                        class83.field1148.method1736(!class247.field3975[82] ? 0 : 1, true);
                        class83.field1148.method1772((byte) -29, var7);
                    }
                }
                if (var4 == 60) {
                    class235 var27 = class260.field4141[var7];
                    if (var27 != null) {
                        class71.field973 = class266.field4319;
                        ++class193.field3077;
                        class8.field125 = class232.field3696;
                        class9.field142 = 2;
                        class153.field2480 = 0;
                        class83.field1148.method1238(5, -136478397);
                        class83.field1148.method1769(128, var7);
                        class83.field1148.method1757(class247.field3975[82] ? 1 : 0, (byte) 122);
                    }
                }
                if (~var4 == -41) {
                    class235 var28 = class260.field4141[var7];
                    if (var28 != null) {
                        class8.field125 = class232.field3696;
                        ++class200.field3220;
                        class9.field142 = 2;
                        class153.field2480 = 0;
                        class71.field973 = class266.field4319;
                        class83.field1148.method1238(74, -136478397);
                        class83.field1148.method1789((byte) -38, class42.field496);
                        class83.field1148.method1769(128, class85.field1157);
                        class83.field1148.method1768(126, class209.field3433);
                        class83.field1148.method1771(arg0 ^ -14818, class247.field3975[82] ? 1 : 0);
                        class83.field1148.method1768(arg0 + 126, var7);
                    }
                }
                if (~var4 == -9) {
                    ++class42.field509;
                    class83.field1148.method1238(69, -136478397);
                    class83.field1148.method1772((byte) -29, var2);
                    class83.field1148.method1763(var3, arg0 + -9694);
                    class83.field1148.method1768(74, var7);
                    class296.field4681 = 0;
                    class109.field1882 = class168.method1180(arg0 + 8934, var3);
                    class228.field3628 = var2;
                }
                if (var4 == 34) {
                    class71.field973 = class266.field4319;
                    class9.field142 = 2;
                    class153.field2480 = 0;
                    ++class29.field358;
                    class8.field125 = class232.field3696;
                    class83.field1148.method1238(201, -136478397);
                    class83.field1148.method1761(var3 - -class93.field1321, 4334);
                    class83.field1148.method1736(class247.field3975[82] ? 1 : 0, true);
                    class83.field1148.method1761(class296.field4685 + var2, 4334);
                    class83.field1148.method1768(45, Integer.MAX_VALUE & (int) (var5 >>> 32));
                }
                if (var4 == 38) {
                    class83.field1148.method1238(125, arg0 + -136478394);
                    class83.field1148.method1789((byte) -38, var3);
                    class103 var29 = class168.method1180(8931, var3);
                    if (var29.field1689 != null && var29.field1689[0][0] == 5) {
                        int var30 = var29.field1689[0][1];
                        if (class214.field3454[var30] != var29.field1553[0]) {
                            class214.field3454[var30] = var29.field1553[0];
                            class233.method1542(var30, (byte) 21);
                        }
                    }
                    ++class170.field2747;
                }
                if (var4 == 4) {
                    class275 var31 = class198.field3193[var7];
                    if (var31 != null) {
                        class71.field973 = class266.field4319;
                        class153.field2480 = 0;
                        class8.field125 = class232.field3696;
                        ++class109.field1885;
                        class9.field142 = 2;
                        class83.field1148.method1238(247, -136478397);
                        class83.field1148.method1737(-1234590152, class254.field4063);
                        class83.field1148.method1757(class247.field3975[82] ? 1 : 0, (byte) 118);
                        class83.field1148.method1768(123, class221.field3526);
                        class83.field1148.method1768(66, var7);
                    }
                }
                if (~var4 == -52) {
                    class275 var32 = class198.field3193[var7];
                    if (var32 != null) {
                        class8.field125 = class232.field3696;
                        class153.field2480 = 0;
                        class71.field973 = class266.field4319;
                        ++class261.field4146;
                        class9.field142 = 2;
                        class83.field1148.method1238(205, -136478397);
                        class83.field1148.method1757(class247.field3975[82] ? 1 : 0, (byte) -11);
                        class83.field1148.method1772((byte) -29, var7);
                    }
                }
                if (~var4 == -27) {
                    class238.method1566(-86);
                    class103 var33 = class168.method1180(8931, var3);
                    class209.field3433 = var7;
                    class42.field496 = var3;
                    class262.field4151 = 1;
                    class85.field1157 = var2;
                    class45.method346((byte) 118, var33);
                    class74.field1010 = "<col=ff9040>" + class64.method514(var7, 0).field3358 + "<col=ffffff>";
                    if (class74.field1010 == null) {
                        class74.field1010 = "null";
                    }
                } else {
                    if (~var4 == -15) {
                        class71.field973 = class266.field4319;
                        class153.field2480 = 0;
                        class8.field125 = class232.field3696;
                        ++class11.field151;
                        class9.field142 = 2;
                        class83.field1148.method1238(185, arg0 + -136478394);
                        class83.field1148.method1769(128, class221.field3526);
                        class83.field1148.method1768(72, class296.field4685 + var2);
                        class83.field1148.method1771(arg0 ^ -14818, class247.field3975[82] ? 1 : 0);
                        class83.field1148.method1772((byte) -29, var7);
                        class83.field1148.method1769(128, class93.field1321 + var3);
                        class83.field1148.method1764((byte) -103, class254.field4063);
                    }
                    if (~var4 == -11) {
                        class235 var34 = class260.field4141[var7];
                        if (var34 != null) {
                            ++class140.field2299;
                            class71.field973 = class266.field4319;
                            class9.field142 = 2;
                            class8.field125 = class232.field3696;
                            class153.field2480 = 0;
                            class83.field1148.method1238(30, -136478397);
                            class83.field1148.method1768(66, var7);
                            class83.field1148.method1744(-36, !class247.field3975[82] ? 0 : 1);
                        }
                    }
                    if (~var4 == -46) {
                        class103 var35 = class168.method1180(arg0 + 8934, var3);
                        boolean var36 = true;
                        if (var35.field1716 > 0) {
                            var36 = class88.method628(arg0 ^ 2, var35);
                        }
                        if (var36) {
                            ++class170.field2747;
                            class83.field1148.method1238(125, arg0 + -136478394);
                            class83.field1148.method1789((byte) -38, var3);
                        }
                    }
                    if (~class262.field4151 != -1) {
                        class262.field4151 = 0;
                        class45.method346((byte) 100, class168.method1180(arg0 + 8934, class42.field496));
                    }
                    if (class290.field4632) {
                        class238.method1566(-80);
                    }
                    if (class109.field1882 != null && class296.field4681 == 0) {
                        class45.method346((byte) 32, class109.field1882);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
    public final void method620(int arg0, int arg1, int arg2) {
        ++field4015;
        if (arg0 != -1) {
            this.field4010 = 70;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method1654(int arg0) {
        if (arg0 < -40) {
            field4021 = null;
            field4013 = null;
            field4014 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4022 = arg6;
        this.field4029 = arg3;
        this.field4016 = arg5;
        this.field4009 = arg2;
        this.field4018 = arg1;
        this.field4010 = arg4;
        this.field4019 = arg0;
        this.field4023 = arg7;
    }
}
