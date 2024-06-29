import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class43 extends class12 {

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "Z")
    private boolean field816 = true;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "Z")
    private boolean field812 = true;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "Lnd;")
    public static class127 field818 = new class127(64);

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public static int field822 = 0;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "Ltg;")
    public static class184 field824 = class135.method812("Willkommen auf RuneScape", 3);

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "Ltg;")
    private static class184 field819 = class135.method812("Connection lost)3", 3);

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "Ltg;")
    public static class184 field821 = field819;

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "I")
    public static int field828 = 0;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "Lla;")
    public static class106 field825;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "Lsc;")
    public static class171 field820;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "Lib;")
    public static class81 field823;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "Ljava/awt/Frame;")
    public static Frame field827;

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class43() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)V")
    public static final void method249(boolean arg0, int arg1) {
        ++field817;
        if (arg1 >= 0) {
            int var2 = class164.field2958[arg1];
            int var3 = class25.field444[arg1];
            int var4 = (int) class72.field1345[arg1];
            long var5 = class72.field1345[arg1];
            int var7 = class54.field960[arg1];
            if (var7 >= 2000) {
                var7 -= 2000;
            }
            if (var7 == 46) {
                class117.field2122.method106(193, 65);
                class117.field2122.method609((byte) -93, var3);
                ++class122.field2187;
                class117.field2122.method570(-601443768, var4);
                class117.field2122.method597(var2, 0);
                class146.field2636 = 0;
                class204.field3934 = class44.method255(var3, 10583);
                class58.field1031 = var2;
            }
            if (var7 == 43) {
                class67 var8 = class57.field1024[var4];
                if (var8 != null) {
                    class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var8.field644[0], class46.field872.field615[0], var8.field615[0], 0, 0);
                    class196.field3806 = 0;
                    ++class153.field2743;
                    class21.field409 = class134.field2429;
                    class24.field437 = 2;
                    class129.field2346 = class158.field2823;
                    class117.field2122.method106(218, -115);
                    class117.field2122.method589((byte) -115, var4);
                }
            }
            if (var7 == 34) {
                class158 var9 = class52.field948[var4];
                if (var9 != null) {
                    ++class150.field2698;
                    class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var9.field644[0], class46.field872.field615[0], var9.field615[0], 0, 0);
                    class21.field409 = class134.field2429;
                    class24.field437 = 2;
                    class129.field2346 = class158.field2823;
                    class196.field3806 = 0;
                    class117.field2122.method106(121, -125);
                    class117.field2122.method573(-109, var4);
                }
            }
            if (~var7 == -2) {
                class67 var10 = class57.field1024[var4];
                if (var10 != null) {
                    ++class126.field2267;
                    class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var10.field644[0], class46.field872.field615[0], var10.field615[0], 0, 0);
                    class196.field3806 = 0;
                    class129.field2346 = class158.field2823;
                    class21.field409 = class134.field2429;
                    class24.field437 = 2;
                    class117.field2122.method106(165, 82);
                    class117.field2122.method597(var4, 0);
                }
            }
            if (var7 == 6) {
                class138.method854((byte) -48);
            }
            if (~var7 == -49) {
                class158 var11 = class52.field948[var4];
                if (var11 != null) {
                    class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var11.field644[0], class46.field872.field615[0], var11.field615[0], 0, 0);
                    class129.field2346 = class158.field2823;
                    ++class83.field1480;
                    class196.field3806 = 0;
                    class21.field409 = class134.field2429;
                    class24.field437 = 2;
                    class117.field2122.method106(128, -123);
                    class117.field2122.method597(var4, 0);
                }
            }
            if (var7 == 30) {
                class67 var12 = class57.field1024[var4];
                if (var12 != null) {
                    ++class197.field3834;
                    class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var12.field644[0], class46.field872.field615[0], var12.field615[0], 0, 0);
                    class21.field409 = class134.field2429;
                    class24.field437 = 2;
                    class196.field3806 = 0;
                    class129.field2346 = class158.field2823;
                    class117.field2122.method106(26, -121);
                    class117.field2122.method597(var4, 0);
                }
            }
            if (~var7 == -11) {
                class167 var13 = class44.method255(var3, 10583);
                boolean var14 = true;
                if (var13.field3101 > 0) {
                    var14 = class128.method784(var13, (byte) -111);
                }
                if (var14) {
                    ++class74.field1381;
                    class117.field2122.method106(229, -114);
                    class117.field2122.method580(var3, false);
                }
            }
            if (var7 == 21) {
                class117.field2122.method106(36, -124);
                class117.field2122.method570(-601443768, var2);
                ++class169.field3211;
                class117.field2122.method563(var3, (byte) 107);
                class117.field2122.method573(121, var4);
                class146.field2636 = 0;
                class204.field3934 = class44.method255(var3, 10583);
                class58.field1031 = var2;
            }
            if (var7 == 25) {
                class186.method1175((byte) 104, var5, var2, var3);
                class117.field2122.method106(191, -5);
                class117.field2122.method597(class57.field1020 + var2, 0);
                class117.field2122.method570(-601443768, Integer.MAX_VALUE & (int) (var5 >>> 32));
                class117.field2122.method597(class129.field2331 + var3, 0);
                ++class67.field1281;
            }
            if (var7 == 23) {
                class67 var15 = class57.field1024[var4];
                if (var15 != null) {
                    class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var15.field644[0], class46.field872.field615[0], var15.field615[0], 0, 0);
                    class21.field409 = class134.field2429;
                    ++class113.field2036;
                    class129.field2346 = class158.field2823;
                    class196.field3806 = 0;
                    class24.field437 = 2;
                    class117.field2122.method106(38, 52);
                    class117.field2122.method585(class173.field3279, -1);
                    class117.field2122.method570(-601443768, var4);
                    class117.field2122.method570(-601443768, class79.field1434);
                }
            }
            if (var7 == 41) {
                class158 var16 = class52.field948[var4];
                if (var16 != null) {
                    class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var16.field644[0], class46.field872.field615[0], var16.field615[0], 0, 0);
                    class196.field3806 = 0;
                    class24.field437 = 2;
                    ++class115.field2091;
                    class21.field409 = class134.field2429;
                    class129.field2346 = class158.field2823;
                    class117.field2122.method106(53, -119);
                    class117.field2122.method573(124, var4);
                }
            }
            if (~var7 == -52) {
                class117.field2122.method106(166, 104);
                class117.field2122.method573(-121, var4);
                class117.field2122.method563(var3, (byte) 107);
                ++class159.field2874;
                class117.field2122.method573(30, var2);
                class146.field2636 = 0;
                class204.field3934 = class44.method255(var3, 10583);
                class58.field1031 = var2;
            }
            if (~var7 == -8) {
                class167 var17 = class189.method1199(var3, arg0, var2);
                if (var17 != null) {
                    class13.method86((byte) -27);
                    class119.method722(var3, var2, class14.method87(class188.method1191((byte) -106, var17), -1), (byte) 117);
                    class187.field3610 = 0;
                    class14.field270 = class7.method40(var17, -18531);
                    if (class14.field270 == null) {
                        class14.field270 = class38.field714;
                    }
                    if (var17.field3106) {
                        class84.field1553 = class144.method884(0, new class184[] { var17.field3119, class31.field534 });
                        return;
                    }
                    class84.field1553 = class144.method884(0, new class184[] { class58.field1074, var17.field3036, class31.field534 });
                }
            } else {
                if (var7 == 1001) {
                    class21.field409 = class134.field2429;
                    ++class185.field3581;
                    class196.field3806 = 0;
                    class129.field2346 = class158.field2823;
                    class24.field437 = 2;
                    class117.field2122.method106(27, -124);
                    class117.field2122.method589((byte) -81, var4);
                }
                if (~var7 == -1003) {
                    class196.field3806 = 0;
                    class21.field409 = class134.field2429;
                    class24.field437 = 2;
                    class129.field2346 = class158.field2823;
                    class117.field2122.method106(154, -127);
                    ++class193.field3736;
                    class117.field2122.method589((byte) -63, var4);
                }
                if (var7 == 22) {
                    ++class46.field864;
                    class117.field2122.method106(227, -115);
                    class117.field2122.method570(-601443768, var2);
                    class117.field2122.method585(var3, -1);
                    class117.field2122.method570(-601443768, class79.field1434);
                    class117.field2122.method589((byte) -102, var4);
                    class117.field2122.method563(class173.field3279, (byte) 127);
                    class146.field2636 = 0;
                    class204.field3934 = class44.method255(var3, 10583);
                    class58.field1031 = var2;
                }
                if (var7 == 11) {
                    ++class24.field440;
                    boolean var18 = class157.method952(19661184, false, 0, 0, 2, 0, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    if (!var18) {
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    }
                    class24.field437 = 2;
                    class129.field2346 = class158.field2823;
                    class196.field3806 = 0;
                    class21.field409 = class134.field2429;
                    class117.field2122.method106(64, -121);
                    class117.field2122.method570(-601443768, class129.field2331 + var3);
                    class117.field2122.method573(-121, class57.field1020 + var2);
                    class117.field2122.method585(class173.field3279, -1);
                    class117.field2122.method573(-124, var4);
                    class117.field2122.method573(20, class79.field1434);
                }
                if (var7 == 17) {
                    class158 var20 = class52.field948[var4];
                    if (var20 != null) {
                        ++class189.field3664;
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var20.field644[0], class46.field872.field615[0], var20.field615[0], 0, 0);
                        class21.field409 = class134.field2429;
                        class196.field3806 = 0;
                        class129.field2346 = class158.field2823;
                        class24.field437 = 2;
                        class117.field2122.method106(58, -126);
                        class117.field2122.method597(var4, 0);
                        class117.field2122.method573(-123, class12.field219);
                        class117.field2122.method597(class175.field3313, 0);
                        class117.field2122.method580(class7.field133, false);
                    }
                }
                if (~var7 == -33) {
                    boolean var21 = class157.method952(19661184, false, 0, 0, 2, 0, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    ++class45.field853;
                    if (!var21) {
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    }
                    class196.field3806 = 0;
                    class24.field437 = 2;
                    class21.field409 = class134.field2429;
                    class129.field2346 = class158.field2823;
                    class117.field2122.method106(12, -128);
                    class117.field2122.method570(-601443768, class129.field2331 + var3);
                    class117.field2122.method570(-601443768, class57.field1020 + var2);
                    class117.field2122.method570(-601443768, var4);
                }
                if (~var7 == -58) {
                    ++class12.field234;
                    class117.field2122.method106(50, 85);
                    class117.field2122.method573(-125, var4);
                    class117.field2122.method573(-125, var2);
                    class117.field2122.method563(var3, (byte) 119);
                    class146.field2636 = 0;
                    class204.field3934 = class44.method255(var3, 10583);
                    class58.field1031 = var2;
                }
                if (~var7 == -59) {
                    class117.field2122.method106(119, -122);
                    ++class179.field3404;
                    class117.field2122.method597(var2, 0);
                    class117.field2122.method580(var3, false);
                    class117.field2122.method573(-126, var4);
                    class146.field2636 = 0;
                    class204.field3934 = class44.method255(var3, 10583);
                    class58.field1031 = var2;
                }
                if (var7 == 8 && class186.method1175((byte) 104, var5, var2, var3)) {
                    class117.field2122.method106(123, -123);
                    ++class58.field1033;
                    class117.field2122.method597(class129.field2331 + var3, 0);
                    class117.field2122.method563(class173.field3279, (byte) 110);
                    class117.field2122.method570(-601443768, class79.field1434);
                    class117.field2122.method597(Integer.MAX_VALUE & (int) (var5 >>> 32), 0);
                    class117.field2122.method589((byte) -46, class57.field1020 + var2);
                }
                if (var7 == 39) {
                    class67 var23 = class57.field1024[var4];
                    if (var23 != null) {
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var23.field644[0], class46.field872.field615[0], var23.field615[0], 0, 0);
                        class196.field3806 = 0;
                        class21.field409 = class134.field2429;
                        class129.field2346 = class158.field2823;
                        class24.field437 = 2;
                        class117.field2122.method106(68, -115);
                        ++class212.field4112;
                        class117.field2122.method589((byte) -49, var4);
                    }
                }
                if (~var7 == -43) {
                    class200.method1279(class47.field892, var2, var3);
                }
                if (~var7 == -34) {
                    ++class74.field1381;
                    class117.field2122.method106(229, -117);
                    class117.field2122.method580(var3, false);
                    class167 var24 = class44.method255(var3, 10583);
                    if (var24.field3102 != null && ~var24.field3102[0][0] == -6) {
                        int var25 = var24.field3102[0][1];
                        if (~class94.field1710[var25] != ~var24.field3048[0]) {
                            class94.field1710[var25] = var24.field3048[0];
                            class99.method620(2, var25);
                        }
                    }
                }
                if (~var7 == -37) {
                    class67 var26 = class57.field1024[var4];
                    if (var26 != null) {
                        ++class83.field1482;
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var26.field644[0], class46.field872.field615[0], var26.field615[0], 0, 0);
                        class24.field437 = 2;
                        class129.field2346 = class158.field2823;
                        class196.field3806 = 0;
                        class21.field409 = class134.field2429;
                        class117.field2122.method106(81, -119);
                        class117.field2122.method573(-122, var4);
                    }
                }
                if (var7 == 1005) {
                    class186.method1175((byte) 104, var5, var2, var3);
                    ++class178.field3394;
                    class117.field2122.method106(79, 76);
                    class117.field2122.method597(class57.field1020 + var2, 0);
                    class117.field2122.method573(-122, class129.field2331 + var3);
                    class117.field2122.method597(Integer.MAX_VALUE & (int) (var5 >>> 32), 0);
                }
                if (~var7 == -16) {
                    ++class125.field2246;
                    boolean var27 = class157.method952(19661184, false, 0, 0, 2, 0, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    if (!var27) {
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    }
                    class129.field2346 = class158.field2823;
                    class21.field409 = class134.field2429;
                    class196.field3806 = 0;
                    class24.field437 = 2;
                    class117.field2122.method106(184, -115);
                    class117.field2122.method597(class57.field1020 + var2, 0);
                    class117.field2122.method573(-109, var4);
                    class117.field2122.method589((byte) -72, class129.field2331 + var3);
                }
                if (var7 == 1004) {
                    class21.field409 = class134.field2429;
                    class24.field437 = 2;
                    class196.field3806 = 0;
                    class129.field2346 = class158.field2823;
                    class158 var29 = class52.field948[var4];
                    if (var29 != null) {
                        class41 var30 = var29.field2832;
                        if (var30.field785 != null) {
                            var30 = var30.method240(-27284);
                        }
                        if (var30 != null) {
                            class117.field2122.method106(2, -122);
                            class117.field2122.method573(127, var30.field792);
                            ++class49.field905;
                        }
                    }
                }
                if (var7 == 31) {
                    ++class178.field3388;
                    boolean var31 = class157.method952(19661184, false, 0, 0, 2, 0, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    if (!var31) {
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    }
                    class129.field2346 = class158.field2823;
                    class24.field437 = 2;
                    class21.field409 = class134.field2429;
                    class196.field3806 = 0;
                    class117.field2122.method106(237, -125);
                    class117.field2122.method597(class12.field219, 0);
                    class117.field2122.method589((byte) -79, var4);
                    class117.field2122.method573(-121, class129.field2331 + var3);
                    class117.field2122.method585(class7.field133, -1);
                    class117.field2122.method570(-601443768, class57.field1020 + var2);
                    class117.field2122.method597(class175.field3313, 0);
                }
                if (~var7 == -39) {
                    ++class146.field2640;
                    boolean var33 = class157.method952(19661184, false, 0, 0, 2, 0, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    if (!var33) {
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    }
                    class24.field437 = 2;
                    class196.field3806 = 0;
                    class21.field409 = class134.field2429;
                    class129.field2346 = class158.field2823;
                    class117.field2122.method106(182, 48);
                    class117.field2122.method589((byte) -71, class57.field1020 + var2);
                    class117.field2122.method589((byte) -57, var4);
                    class117.field2122.method570(-601443768, class129.field2331 + var3);
                }
                if (var7 == 16) {
                    class67 var35 = class57.field1024[var4];
                    if (var35 != null) {
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var35.field644[0], class46.field872.field615[0], var35.field615[0], 0, 0);
                        class21.field409 = class134.field2429;
                        ++class117.field2109;
                        class129.field2346 = class158.field2823;
                        class24.field437 = 2;
                        class196.field3806 = 0;
                        class117.field2122.method106(34, 88);
                        class117.field2122.method597(var4, 0);
                    }
                }
                if (~var7 == -5) {
                    ++class74.field1381;
                    class117.field2122.method106(229, -124);
                    class117.field2122.method580(var3, !arg0);
                    class167 var36 = class44.method255(var3, 10583);
                    if (var36.field3102 != null && ~var36.field3102[0][0] == -6) {
                        int var37 = var36.field3102[0][1];
                        class94.field1710[var37] = -class94.field1710[var37] + 1;
                        class99.method620(2, var37);
                    }
                }
                if (var7 == 37) {
                    class67 var38 = class57.field1024[var4];
                    if (var38 != null) {
                        ++class101.field1874;
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var38.field644[0], class46.field872.field615[0], var38.field615[0], 0, 0);
                        class129.field2346 = class158.field2823;
                        class24.field437 = 2;
                        class21.field409 = class134.field2429;
                        class196.field3806 = 0;
                        class117.field2122.method106(56, -21);
                        class117.field2122.method573(-111, class12.field219);
                        class117.field2122.method580(class7.field133, false);
                        class117.field2122.method573(-114, class175.field3313);
                        class117.field2122.method597(var4, 0);
                    }
                }
                if (!arg0) {
                    method249(false, -18);
                }
                if (~var7 == -36 && class186.method1175((byte) 104, var5, var2, var3)) {
                    ++class45.field861;
                    class117.field2122.method106(151, 2);
                    class117.field2122.method589((byte) -121, class175.field3313);
                    class117.field2122.method570(-601443768, class12.field219);
                    class117.field2122.method580(class7.field133, false);
                    class117.field2122.method573(112, (int) (var5 >>> 32) & Integer.MAX_VALUE);
                    class117.field2122.method589((byte) -78, class129.field2331 + var3);
                    class117.field2122.method573(62, class57.field1020 + var2);
                }
                if (var7 == 50) {
                    class186.method1175((byte) 104, var5, var2, var3);
                    class117.field2122.method106(251, -116);
                    class117.field2122.method573(70, class129.field2331 + var3);
                    class117.field2122.method597(Integer.MAX_VALUE & (int) (var5 >>> 32), 0);
                    ++class156.field2799;
                    class117.field2122.method589((byte) -74, var2 - -class57.field1020);
                }
                if (var7 == 13 && class50.field925 == null) {
                    class97.method601(var2, (byte) 113, var3);
                    class50.field925 = class189.method1199(var3, true, var2);
                    class57.method305(-112, class50.field925);
                }
                if (var7 == 3) {
                    class117.field2122.method106(59, 124);
                    ++class76.field1394;
                    class117.field2122.method589((byte) -62, var2);
                    class117.field2122.method589((byte) -117, var4);
                    class117.field2122.method585(var3, -1);
                    class146.field2636 = 0;
                    class204.field3934 = class44.method255(var3, 10583);
                    class58.field1031 = var2;
                }
                if (var7 == 14) {
                    class158 var39 = class52.field948[var4];
                    if (var39 != null) {
                        ++class182.field3487;
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var39.field644[0], class46.field872.field615[0], var39.field615[0], 0, 0);
                        class21.field409 = class134.field2429;
                        class196.field3806 = 0;
                        class24.field437 = 2;
                        class129.field2346 = class158.field2823;
                        class117.field2122.method106(187, -125);
                        class117.field2122.method573(-109, var4);
                    }
                }
                if (~var7 == -19) {
                    ++class41.field768;
                    class117.field2122.method106(125, 26);
                    class117.field2122.method570(-601443768, class12.field219);
                    class117.field2122.method573(-125, class175.field3313);
                    class117.field2122.method585(var3, -1);
                    class117.field2122.method609((byte) -74, class7.field133);
                    class117.field2122.method597(var2, 0);
                    class117.field2122.method573(65, var4);
                    class146.field2636 = 0;
                    class204.field3934 = class44.method255(var3, 10583);
                    class58.field1031 = var2;
                }
                if (var7 == 29) {
                    class186.method1175((byte) 104, var5, var2, var3);
                    ++class9.field155;
                    class117.field2122.method106(197, 22);
                    class117.field2122.method570(-601443768, (int) (var5 >>> 32) & Integer.MAX_VALUE);
                    class117.field2122.method570(-601443768, var3 - -class129.field2331);
                    class117.field2122.method597(class57.field1020 + var2, 0);
                }
                if (~var7 == -45) {
                    class117.field2122.method106(22, -117);
                    class117.field2122.method573(98, var2);
                    class117.field2122.method570(-601443768, var4);
                    ++class146.field2644;
                    class117.field2122.method585(var3, -1);
                    class146.field2636 = 0;
                    class204.field3934 = class44.method255(var3, 10583);
                    class58.field1031 = var2;
                }
                if (~var7 == -46) {
                    class117.field2122.method106(149, 38);
                    ++class119.field2137;
                    class117.field2122.method570(-601443768, var2);
                    class117.field2122.method597(var4, 0);
                    class117.field2122.method585(var3, -1);
                    class146.field2636 = 0;
                    class204.field3934 = class44.method255(var3, 10583);
                    class58.field1031 = var2;
                }
                if (~var7 == -10) {
                    ++class55.field977;
                    class186.method1175((byte) 104, var5, var2, var3);
                    class117.field2122.method106(24, -126);
                    class117.field2122.method570(-601443768, class129.field2331 + var3);
                    class117.field2122.method597(Integer.MAX_VALUE & (int) (var5 >>> 32), 0);
                    class117.field2122.method597(class57.field1020 + var2, 0);
                }
                if (~var7 == -25) {
                    ++class78.field1411;
                    class117.field2122.method106(247, -114);
                    class117.field2122.method589((byte) -52, class79.field1434);
                    class117.field2122.method573(121, var2);
                    class117.field2122.method563(var3, (byte) 112);
                    class117.field2122.method580(class173.field3279, false);
                }
                if (~var7 == -41) {
                    class67 var40 = class57.field1024[var4];
                    if (var40 != null) {
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var40.field644[0], class46.field872.field615[0], var40.field615[0], 0, 0);
                        class196.field3806 = 0;
                        class21.field409 = class134.field2429;
                        ++class62.field1171;
                        class24.field437 = 2;
                        class129.field2346 = class158.field2823;
                        class117.field2122.method106(139, -122);
                        class117.field2122.method570(-601443768, var4);
                    }
                }
                if (~var7 == -29) {
                    ++class97.field1788;
                    boolean var41 = class157.method952(19661184, false, 0, 0, 2, 0, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    if (!var41) {
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    }
                    class196.field3806 = 0;
                    class129.field2346 = class158.field2823;
                    class21.field409 = class134.field2429;
                    class24.field437 = 2;
                    class117.field2122.method106(205, -16);
                    class117.field2122.method597(class57.field1020 + var2, 0);
                    class117.field2122.method589((byte) -108, var4);
                    class117.field2122.method597(var3 - -class129.field2331, 0);
                }
                if (var7 == 5) {
                    class67 var43 = class57.field1024[var4];
                    if (var43 != null) {
                        ++class78.field1410;
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var43.field644[0], class46.field872.field615[0], var43.field615[0], 0, 0);
                        class129.field2346 = class158.field2823;
                        class196.field3806 = 0;
                        class21.field409 = class134.field2429;
                        class24.field437 = 2;
                        class117.field2122.method106(70, 35);
                        class117.field2122.method570(-601443768, var4);
                    }
                }
                if (~var7 == -21) {
                    boolean var44 = class157.method952(19661184, false, 0, 0, 2, 0, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    ++class162.field2923;
                    if (!var44) {
                        class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var2, class46.field872.field615[0], var3, 0, 0);
                    }
                    class129.field2346 = class158.field2823;
                    class196.field3806 = 0;
                    class21.field409 = class134.field2429;
                    class24.field437 = 2;
                    class117.field2122.method106(211, 118);
                    class117.field2122.method597(class57.field1020 + var2, 0);
                    class117.field2122.method589((byte) -65, var4);
                    class117.field2122.method570(-601443768, class129.field2331 + var3);
                }
                if (var7 == 2) {
                    class117.field2122.method106(160, -123);
                    ++class151.field2722;
                    class117.field2122.method597(var4, 0);
                    class117.field2122.method570(-601443768, var2);
                    class117.field2122.method580(var3, false);
                    class146.field2636 = 0;
                    class204.field3934 = class44.method255(var3, 10583);
                    class58.field1031 = var2;
                }
                if (var7 == 26 || var7 == 1003) {
                    class190.method1220(class174.field3298[arg1], var2, var4, var3, !arg0);
                }
                if (~var7 == -13) {
                    ++class177.field3380;
                    class117.field2122.method106(110, -116);
                    class117.field2122.method573(-121, var2);
                    class117.field2122.method585(var3, -1);
                    class117.field2122.method573(27, var4);
                    class146.field2636 = 0;
                    class204.field3934 = class44.method255(var3, 10583);
                    class58.field1031 = var2;
                }
                if (~var7 == -48) {
                    class13.method86((byte) -27);
                    class167 var46 = class44.method255(var3, 10583);
                    class175.field3313 = var4;
                    class7.field133 = var3;
                    class187.field3610 = 1;
                    class12.field219 = var2;
                    class57.method305(-116, var46);
                    class150.field2689 = class144.method884(0, new class184[] { class26.field476, class60.method336(var4, 10).field2233, class31.field534 });
                    if (class150.field2689 == null) {
                        class150.field2689 = class212.field4106;
                    }
                } else {
                    if (~var7 == -1007) {
                        class167 var47 = class44.method255(var3, 10583);
                        if (var47 != null && var47.field3056[var2] >= 100000) {
                            class149.method914(0, class144.method884(0, new class184[] { class170.method1060(var47.field3056[var2], -115), class7.field124, class60.method336(var4, 10).field2233 }), class170.field3242, -114);
                        } else {
                            ++class185.field3581;
                            class117.field2122.method106(27, 25);
                            class117.field2122.method589((byte) -87, var4);
                        }
                        class146.field2636 = 0;
                        class204.field3934 = class44.method255(var3, 10583);
                        class58.field1031 = var2;
                    }
                    if (var7 == 19) {
                        class158 var48 = class52.field948[var4];
                        if (var48 != null) {
                            ++class52.field958;
                            class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var48.field644[0], class46.field872.field615[0], var48.field615[0], 0, 0);
                            class24.field437 = 2;
                            class129.field2346 = class158.field2823;
                            class21.field409 = class134.field2429;
                            class196.field3806 = 0;
                            class117.field2122.method106(183, -125);
                            class117.field2122.method597(var4, 0);
                        }
                    }
                    if (var7 == 49) {
                        class158 var49 = class52.field948[var4];
                        if (var49 != null) {
                            class157.method952(19661184, false, 1, 0, 2, 1, class46.field872.field644[0], var49.field644[0], class46.field872.field615[0], var49.field615[0], 0, 0);
                            ++class189.field3657;
                            class24.field437 = 2;
                            class21.field409 = class134.field2429;
                            class129.field2346 = class158.field2823;
                            class196.field3806 = 0;
                            class117.field2122.method106(62, -125);
                            class117.field2122.method573(110, class79.field1434);
                            class117.field2122.method580(class173.field3279, false);
                            class117.field2122.method589((byte) -46, var4);
                        }
                    }
                    if (class187.field3610 != 0) {
                        class187.field3610 = 0;
                        class57.method305(-120, class44.method255(class7.field133, 10583));
                    }
                    if (class209.field4013) {
                        class13.method86((byte) -27);
                    }
                    if (class204.field3934 != null && class146.field2636 == 0) {
                        class57.method305(-121, class204.field3934);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        if (arg1 != 17) {
            method249(false, -81);
        }
        ++field813;
        int[] var3 = super.field224.method7((byte) 90, arg0);
        if (super.field224.field53) {
            int[] var4 = this.method77(0, !this.field816 ? arg0 : -arg0 + class173.field3274, arg1 ^ -110);
            if (this.field812) {
                for (int var5 = 0; var5 < class201.field3889; ++var5) {
                    var3[var5] = var4[-var5 + class51.field937];
                }
            } else {
                class93.method537(var4, 0, var3, 0, class201.field3889);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field826;
        int[][] var3 = super.field232.method673(arg0, -52);
        if (super.field232.field1962) {
            int[][] var4 = this.method76(!this.field816 ? arg0 : -arg0 + class173.field3274, 6218, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            if (this.field812) {
                for (int var11 = 0; ~class201.field3889 < ~var11; ++var11) {
                    var8[var11] = var5[class51.field937 - var11];
                    var10[var11] = var6[-var11 + class51.field937];
                    var9[var11] = var7[-var11 + class51.field937];
                }
            } else {
                for (int var12 = 0; ~class201.field3889 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var10[var12] = var6[var12];
                    var9[var12] = var7[var12];
                }
            }
        }
        int var13 = -121 / ((arg1 - -58) / 34);
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
    public static void method250(byte arg0) {
        field824 = null;
        field825 = null;
        field819 = null;
        field818 = null;
        field821 = null;
        field820 = null;
        field823 = null;
        int var1 = -23 / ((arg0 - -14) / 56);
        field827 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BZ)V")
    public static final void method251(byte arg0, boolean arg1) {
        ++field814;
        if (arg0 != 123) {
            field820 = null;
        }
        for (int var2 = 0; ~var2 > ~class38.field711; ++var2) {
            class158 var3 = class52.field948[class97.field1782[var2]];
            long var4 = 536870912L | (long) class97.field1782[var2] << 32;
            if (var3 != null && var3.method213(-30610) && var3.field2832.field759 == arg1 && var3.field2832.method233(false)) {
                int var6 = var3.field635 >> 7;
                int var7 = var3.field614 >> 7;
                if (var6 >= 0 && ~var6 > -105 && var7 >= 0 && var7 < 104) {
                    if (~var3.field651 == -2 && (var3.field635 & 127) == 64 && ~(127 & var3.field614) == -65) {
                        if (class9.field165[var6][var7] == class105.field1904) {
                            continue;
                        }
                        class9.field165[var6][var7] = class105.field1904;
                    }
                    if (!var3.field2832.field779) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field599 = class115.method706(var3.field651 * 64 + -64 + var3.field635, class47.field892, 127, var3.field651 * 64 + var3.field614 + -64);
                    class125.method760(class47.field892, var3.field635, var3.field614, var3.field599, var3.field651 * 64 + -64 + 60, var3, var3.field647, var4, var3.field648);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field211 = ~arg0.method588((byte) -58) == -2;
                }
            } else {
                this.field816 = ~arg0.method588((byte) -96) == -2;
            }
        } else {
            this.field812 = arg0.method588((byte) -113) == 1;
        }
        if (arg2) {
            field824 = null;
        }
        ++field815;
    }
}
