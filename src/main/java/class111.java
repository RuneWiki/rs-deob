import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class111 extends class1 {

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
    private int field1958 = 585;

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "Loc;")
    private static class151 field1955 = class137.method873(2, "The server is being updated)3");

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "I")
    public static int field1956 = 0;

    @OriginalMember(owner = "client!kc", name = "mb", descriptor = "Loc;")
    public static class151 field1960 = field1955;

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!kc", name = "lb", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!kc", name = "nb", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!kc", name = "ob", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!kc", name = "pb", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!kc", name = "qb", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V")
    public static final void method666(int arg0, int arg1, int arg2) {
        class72 var3 = class95.field1776[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1407 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ID)V")
    public static final void method667(int arg0, double arg1) {
        if (class174.field3152 != arg1) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg1));
                class11.field200[var3] = var4 <= 255 ? var4 : 255;
            }
            class174.field3152 = arg1;
        }
        ++field1961;
        if (arg0 <= 33) {
            field1955 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Loc;IB)V")
    public static final void method668(class151 arg0, int arg1, byte arg2) {
        class151 var3 = arg0.method962(79).method994(-105);
        ++field1962;
        boolean var4 = false;
        for (int var5 = 0; class47.field961 > var5; ++var5) {
            class20 var6 = class179.field3229[class159.field2866[var5]];
            if (var6 != null && var6.field416 != null && var6.field416.method995((byte) -22, var3)) {
                class225.method1414(117, 0, 1, var6.field4031[0], false, 1, 0, 2, var6.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                if (arg1 == 1) {
                    class48.field984.method650(-13721, 209);
                    class48.field984.method1485(class159.field2866[var5], (byte) 124);
                    ++class229.field4060;
                } else if (arg1 == 4) {
                    class48.field984.method650(-13721, 110);
                    ++class20.field431;
                    class48.field984.method1478(true, class159.field2866[var5]);
                } else if (~arg1 != -7) {
                    if (arg1 == 7) {
                        ++class169.field3080;
                        class48.field984.method650(-13721, 189);
                        class48.field984.method1478(true, class159.field2866[var5]);
                    }
                } else {
                    class48.field984.method650(-13721, 107);
                    ++class142.field2575;
                    class48.field984.method1473(class159.field2866[var5], (byte) -41);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            client.method246(0, (byte) -124, class134.field2441, class126.method761(new class151[] { class141.field2560, var3 }, 10260));
        }
        if (arg2 <= 45) {
            field1960 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(III)J")
    public static final long method669(int arg0, int arg1, int arg2) {
        class72 var3 = class95.field1776[arg0][arg1][arg2];
        return var3 != null && var3.field1419 != null ? var3.field1419.field3739 : 0L;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)V")
    public static final void method670(byte arg0, int arg1, int arg2) {
        if (arg0 >= 118) {
            class109[] var3 = class47.field967;
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                class109 var5 = var3[var4];
                if (var5 != null && ~var5.field1935 == -3) {
                    class59.method391((var5.field1928 - class64.field1255 << 7) + var5.field1927, (-class232.field4188 + var5.field1934 << 7) + var5.field1920, var5.field1931 * 2, 35867888);
                    if (class162.field2924 > -1 && ~(class200.field3541 % 20) > -11) {
                        class157.field2838[var5.field1930].method545(class162.field2924 + -12 + arg1, arg2 + -28 + class109.field1932);
                    }
                }
            }
            ++field1959;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)V")
    public static final void method671(int arg0, int arg1) {
        ++field1963;
        if (~arg0 <= -1) {
            int var2 = class117.field2109[arg0];
            int var3 = class115.field2041[arg0];
            int var4 = class185.field3316[arg0];
            int var5 = (int) class179.field3247[arg0];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            long var6 = class179.field3247[arg0];
            if (var4 == 5) {
                class20 var8 = class179.field3229[var5];
                if (var8 != null) {
                    class225.method1414(-58, 0, 1, var8.field4031[0], false, 1, 0, 2, var8.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                    class211.field3692 = 0;
                    ++class45.field932;
                    class28.field600 = 2;
                    class33.field668 = class209.field3677;
                    class109.field1938 = class2.field61;
                    class48.field984.method650(-13721, 224);
                    class48.field984.method1473(var5, (byte) -41);
                }
            }
            if (~var4 == -1008) {
                class211.field3692 = 0;
                class109.field1938 = class2.field61;
                class28.field600 = 2;
                ++class161.field2902;
                class33.field668 = class209.field3677;
                class48.field984.method650(-13721, 231);
                class48.field984.method1463(-72, var5);
            }
            if (var4 == 37) {
                boolean var9 = class225.method1414(-54, 0, 0, var3, false, 0, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                ++class120.field2167;
                if (!var9) {
                    class225.method1414(119, 0, 1, var3, false, 1, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                }
                class109.field1938 = class2.field61;
                class211.field3692 = 0;
                class28.field600 = 2;
                class33.field668 = class209.field3677;
                class48.field984.method650(-13721, 91);
                class48.field984.method1463(-86, class4.field78);
                class48.field984.method1485(var5, (byte) 122);
                class48.field984.method1461(class178.field3209, (byte) 83);
                class48.field984.method1463(-70, class25.field546);
                class48.field984.method1473(var2 - -class232.field4188, (byte) -41);
                class48.field984.method1478(true, class64.field1255 + var3);
            }
            if (~var4 == -11) {
                ++class191.field3374;
                class48.field984.method650(-13721, 152);
                class48.field984.method1485(var5, (byte) 119);
                class48.field984.method1473(var2, (byte) -41);
                class48.field984.method1480(var3, (byte) 103);
                class11.field207 = 0;
                class164.field2962 = class175.method1115(-22192, var3);
                class205.field3638 = var2;
            }
            if (arg1 >= 23) {
                if (~var4 == -51) {
                    class20 var11 = class179.field3229[var5];
                    if (var11 != null) {
                        class225.method1414(-44, 0, 1, var11.field4031[0], false, 1, 0, 2, var11.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        class211.field3692 = 0;
                        ++class229.field4060;
                        class109.field1938 = class2.field61;
                        class33.field668 = class209.field3677;
                        class28.field600 = 2;
                        class48.field984.method650(-13721, 209);
                        class48.field984.method1485(var5, (byte) 126);
                    }
                }
                if (~var4 == -7) {
                    ++class210.field3689;
                    boolean var12 = class225.method1414(122, 0, 0, var3, false, 0, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                    if (!var12) {
                        class225.method1414(-95, 0, 1, var3, false, 1, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                    }
                    class109.field1938 = class2.field61;
                    class28.field600 = 2;
                    class211.field3692 = 0;
                    class33.field668 = class209.field3677;
                    class48.field984.method650(-13721, 98);
                    class48.field984.method1485(class64.field1255 + var3, (byte) 121);
                    class48.field984.method1473(var2 - -class232.field4188, (byte) -41);
                    class48.field984.method1485(var5, (byte) 120);
                }
                if (~var4 == -2) {
                    class203 var14 = class122.field2190[var5];
                    if (var14 != null) {
                        ++class227.field3954;
                        class225.method1414(-33, 0, 1, var14.field4031[0], false, 1, 0, 2, var14.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        class28.field600 = 2;
                        class109.field1938 = class2.field61;
                        class211.field3692 = 0;
                        class33.field668 = class209.field3677;
                        class48.field984.method650(-13721, 151);
                        class48.field984.method1478(true, var5);
                    }
                }
                if (var4 == 29) {
                    class3.method27(var6, 31, var3, var2);
                    class48.field984.method650(-13721, 162);
                    class48.field984.method1478(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    ++class15.field345;
                    class48.field984.method1463(-90, class232.field4188 + var2);
                    class48.field984.method1473(class64.field1255 + var3, (byte) -41);
                }
                if (~var4 == -19) {
                    class48.field984.method650(-13721, 136);
                    ++class21.field472;
                    class48.field984.method1461(var3, (byte) 108);
                    class48.field984.method1478(true, var5);
                    class48.field984.method1463(-85, var2);
                    class11.field207 = 0;
                    class164.field2962 = class175.method1115(-22192, var3);
                    class205.field3638 = var2;
                }
                if (var4 == 34) {
                    ++class213.field3748;
                    boolean var15 = class225.method1414(119, 0, 0, var3, false, 0, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                    if (!var15) {
                        class225.method1414(119, 0, 1, var3, false, 1, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                    }
                    class211.field3692 = 0;
                    class109.field1938 = class2.field61;
                    class33.field668 = class209.field3677;
                    class28.field600 = 2;
                    class48.field984.method650(-13721, 159);
                    class48.field984.method1485(class64.field1255 + var3, (byte) 118);
                    class48.field984.method1478(true, var5);
                    class48.field984.method1485(var2 - -class232.field4188, (byte) 126);
                }
                if (~var4 == -13) {
                    class203 var17 = class122.field2190[var5];
                    if (var17 != null) {
                        ++class99.field1796;
                        class225.method1414(-107, 0, 1, var17.field4031[0], false, 1, 0, 2, var17.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        class109.field1938 = class2.field61;
                        class211.field3692 = 0;
                        class28.field600 = 2;
                        class33.field668 = class209.field3677;
                        class48.field984.method650(-13721, 220);
                        class48.field984.method1485(class25.field546, (byte) 123);
                        class48.field984.method1473(class4.field78, (byte) -41);
                        class48.field984.method1485(var5, (byte) 117);
                        class48.field984.method1477(-78, class178.field3209);
                    }
                }
                if (var4 == 33) {
                    ++class39.field801;
                    class48.field984.method650(-13721, 185);
                    class48.field984.method1485(var5, (byte) 123);
                    class48.field984.method1455(-12974, var3);
                    class48.field984.method1478(true, var2);
                    class11.field207 = 0;
                    class164.field2962 = class175.method1115(-22192, var3);
                    class205.field3638 = var2;
                }
                if (var4 == 44) {
                    ++class95.field1775;
                    class48.field984.method650(-13721, 169);
                    class48.field984.method1463(-96, var2);
                    class48.field984.method1477(126, var3);
                    class48.field984.method1485(var5, (byte) 123);
                    class11.field207 = 0;
                    class164.field2962 = class175.method1115(-22192, var3);
                    class205.field3638 = var2;
                }
                if (var4 == 39) {
                    boolean var18 = class225.method1414(122, 0, 0, var3, false, 0, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                    if (!var18) {
                        class225.method1414(115, 0, 1, var3, false, 1, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                    }
                    class33.field668 = class209.field3677;
                    class28.field600 = 2;
                    class109.field1938 = class2.field61;
                    class211.field3692 = 0;
                    ++class182.field3304;
                    class48.field984.method650(-13721, 21);
                    class48.field984.method1463(-58, var3 - -class64.field1255);
                    class48.field984.method1478(true, class232.field4188 + var2);
                    class48.field984.method1463(-54, var5);
                }
                if (~var4 == -10) {
                    class48.field984.method650(-13721, 119);
                    class48.field984.method1461(var3, (byte) 122);
                    ++class171.field3114;
                    class232 var20 = class175.method1115(-22192, var3);
                    if (var20.field4198 != null && var20.field4198[0][0] == 5) {
                        int var21 = var20.field4198[0][1];
                        class156.field2836[var21] = -class156.field2836[var21] + 1;
                        class167.method1086(3, var21);
                    }
                }
                if (var4 == 19) {
                    class203 var22 = class122.field2190[var5];
                    if (var22 != null) {
                        ++class188.field3337;
                        class225.method1414(114, 0, 1, var22.field4031[0], false, 1, 0, 2, var22.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        class33.field668 = class209.field3677;
                        class211.field3692 = 0;
                        class109.field1938 = class2.field61;
                        class28.field600 = 2;
                        class48.field984.method650(-13721, 36);
                        class48.field984.method1463(-63, var5);
                    }
                }
                if (~var4 == -1006) {
                    class33.field668 = class209.field3677;
                    class109.field1938 = class2.field61;
                    class211.field3692 = 0;
                    class28.field600 = 2;
                    class203 var23 = class122.field2190[var5];
                    if (var23 != null) {
                        class67 var24 = var23.field3608;
                        if (var24.field1291 != null) {
                            var24 = var24.method446(-99);
                        }
                        if (var24 != null) {
                            ++class118.field2131;
                            class48.field984.method650(-13721, 66);
                            class48.field984.method1463(-63, var24.field1324);
                        }
                    }
                }
                if (~var4 == -39) {
                    class20 var25 = class179.field3229[var5];
                    if (var25 != null) {
                        ++class154.field2798;
                        class225.method1414(-52, 0, 1, var25.field4031[0], false, 1, 0, 2, var25.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        class109.field1938 = class2.field61;
                        class28.field600 = 2;
                        class33.field668 = class209.field3677;
                        class211.field3692 = 0;
                        class48.field984.method650(-13721, 192);
                        class48.field984.method1463(-86, var5);
                    }
                }
                if (~var4 == -25) {
                    ++class179.field3227;
                    class48.field984.method650(-13721, 64);
                    class48.field984.method1478(true, var5);
                    class48.field984.method1477(127, var3);
                    class48.field984.method1478(true, var2);
                    class11.field207 = 0;
                    class164.field2962 = class175.method1115(-22192, var3);
                    class205.field3638 = var2;
                }
                if (var4 == 42) {
                    class115.method688(class234.field4325, var2, var3);
                }
                if (~var4 == -17) {
                    ++class191.field3372;
                    class3.method27(var6, 31, var3, var2);
                    class48.field984.method650(-13721, 214);
                    class48.field984.method1478(true, Integer.MAX_VALUE & (int) (var6 >>> 32));
                    class48.field984.method1473(class64.field1255 + var3, (byte) -41);
                    class48.field984.method1478(true, var2 - -class232.field4188);
                }
                if (~var4 == -21 || var4 == 1003) {
                    class25.method195(var3, var5, class225.field3916[arg0], var2, true);
                }
                if (~var4 == -32) {
                    class20 var26 = class179.field3229[var5];
                    if (var26 != null) {
                        ++class63.field1223;
                        class225.method1414(118, 0, 1, var26.field4031[0], false, 1, 0, 2, var26.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        class28.field600 = 2;
                        class211.field3692 = 0;
                        class33.field668 = class209.field3677;
                        class109.field1938 = class2.field61;
                        class48.field984.method650(-13721, 193);
                        class48.field984.method1485(var5, (byte) 127);
                    }
                }
                if (~var4 == -3) {
                    class203 var27 = class122.field2190[var5];
                    if (var27 != null) {
                        class225.method1414(122, 0, 1, var27.field4031[0], false, 1, 0, 2, var27.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        class28.field600 = 2;
                        ++class103.field1849;
                        class211.field3692 = 0;
                        class109.field1938 = class2.field61;
                        class33.field668 = class209.field3677;
                        class48.field984.method650(-13721, 128);
                        class48.field984.method1473(var5, (byte) -41);
                    }
                }
                if (var4 == 25) {
                    class115.method698((byte) -127);
                    class232 var28 = class175.method1115(-22192, var3);
                    class25.field546 = var5;
                    class4.field78 = var2;
                    class178.field3209 = var3;
                    class166.field3017 = 1;
                    class27.method208(true, var28);
                    class29.field613 = class126.method761(new class151[] { class52.field1053, class43.method311(var5, 0).field241, class31.field643 }, 10260);
                    if (class29.field613 == null) {
                        class29.field613 = class179.field3226;
                    }
                } else {
                    if (var4 == 4) {
                        class232 var29 = class175.method1115(-22192, var3);
                        boolean var30 = true;
                        if (var29.field4148 > 0) {
                            var30 = class166.method1080((byte) 61, var29);
                        }
                        if (var30) {
                            ++class171.field3114;
                            class48.field984.method650(-13721, 119);
                            class48.field984.method1461(var3, (byte) 61);
                        }
                    }
                    if (var4 == 23) {
                        ++class171.field3114;
                        class48.field984.method650(-13721, 119);
                        class48.field984.method1461(var3, (byte) 71);
                        class232 var31 = class175.method1115(-22192, var3);
                        if (var31.field4198 != null && ~var31.field4198[0][0] == -6) {
                            int var32 = var31.field4198[0][1];
                            if (class156.field2836[var32] != var31.field4247[0]) {
                                class156.field2836[var32] = var31.field4247[0];
                                class167.method1086(3, var32);
                            }
                        }
                    }
                    if (var4 == 32) {
                        class20 var33 = class179.field3229[var5];
                        if (var33 != null) {
                            class225.method1414(-86, 0, 1, var33.field4031[0], false, 1, 0, 2, var33.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                            class211.field3692 = 0;
                            class33.field668 = class209.field3677;
                            ++class169.field3080;
                            class28.field600 = 2;
                            class109.field1938 = class2.field61;
                            class48.field984.method650(-13721, 189);
                            class48.field984.method1478(true, var5);
                        }
                    }
                    if (var4 == 40) {
                        class48.field984.method650(-13721, 34);
                        ++class153.field2780;
                        class48.field984.method1478(true, var2);
                        class48.field984.method1478(true, var5);
                        class48.field984.method1461(var3, (byte) 69);
                        class11.field207 = 0;
                        class164.field2962 = class175.method1115(-22192, var3);
                        class205.field3638 = var2;
                    }
                    if (var4 == 1004) {
                        class232 var34 = class175.method1115(-22192, var3);
                        if (var34 != null && ~var34.field4199[var2] <= -100001) {
                            client.method246(0, (byte) -117, class134.field2441, class126.method761(new class151[] { class137.method874(var34.field4199[var2], false), class7.field115, class43.method311(var5, 0).field241 }, 10260));
                        } else {
                            class48.field984.method650(-13721, 231);
                            ++class161.field2902;
                            class48.field984.method1463(-78, var5);
                        }
                        class11.field207 = 0;
                        class164.field2962 = class175.method1115(-22192, var3);
                        class205.field3638 = var2;
                    }
                    if (var4 == 15) {
                        class203 var35 = class122.field2190[var5];
                        if (var35 != null) {
                            class225.method1414(-42, 0, 1, var35.field4031[0], false, 1, 0, 2, var35.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                            class109.field1938 = class2.field61;
                            class33.field668 = class209.field3677;
                            class28.field600 = 2;
                            ++class36.field746;
                            class211.field3692 = 0;
                            class48.field984.method650(-13721, 1);
                            class48.field984.method1480(class58.field1162, (byte) 38);
                            class48.field984.method1463(-96, var5);
                            class48.field984.method1485(class95.field1771, (byte) 126);
                        }
                    }
                    if (~var4 == -50) {
                        class178.method1130(-101);
                    }
                    if (var4 == 8) {
                        class48.field984.method650(-13721, 140);
                        ++class23.field512;
                        class48.field984.method1480(class178.field3209, (byte) 118);
                        class48.field984.method1461(var3, (byte) 42);
                        class48.field984.method1473(class25.field546, (byte) -41);
                        class48.field984.method1463(-26, var5);
                        class48.field984.method1463(-58, var2);
                        class48.field984.method1463(-67, class4.field78);
                        class11.field207 = 0;
                        class164.field2962 = class175.method1115(-22192, var3);
                        class205.field3638 = var2;
                    }
                    if (~var4 == -44) {
                        ++class187.field3325;
                        boolean var36 = class225.method1414(-114, 0, 0, var3, false, 0, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        if (!var36) {
                            class225.method1414(115, 0, 1, var3, false, 1, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        }
                        class33.field668 = class209.field3677;
                        class211.field3692 = 0;
                        class109.field1938 = class2.field61;
                        class28.field600 = 2;
                        class48.field984.method650(-13721, 199);
                        class48.field984.method1473(var3 - -class64.field1255, (byte) -41);
                        class48.field984.method1463(-79, var5);
                        class48.field984.method1473(class232.field4188 + var2, (byte) -41);
                    }
                    if (var4 == 36) {
                        class20 var38 = class179.field3229[var5];
                        if (var38 != null) {
                            class225.method1414(125, 0, 1, var38.field4031[0], false, 1, 0, 2, var38.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                            ++class59.field1169;
                            class109.field1938 = class2.field61;
                            class211.field3692 = 0;
                            class33.field668 = class209.field3677;
                            class28.field600 = 2;
                            class48.field984.method650(-13721, 92);
                            class48.field984.method1473(var5, (byte) -41);
                        }
                    }
                    if (~var4 == -31) {
                        class20 var39 = class179.field3229[var5];
                        if (var39 != null) {
                            class225.method1414(-82, 0, 1, var39.field4031[0], false, 1, 0, 2, var39.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                            ++class142.field2575;
                            class109.field1938 = class2.field61;
                            class28.field600 = 2;
                            class33.field668 = class209.field3677;
                            class211.field3692 = 0;
                            class48.field984.method650(-13721, 107);
                            class48.field984.method1473(var5, (byte) -41);
                        }
                    }
                    if (~var4 == -23) {
                        class48.field984.method650(-13721, 116);
                        ++class22.field488;
                        class48.field984.method1478(true, var5);
                        class48.field984.method1485(var2, (byte) 127);
                        class48.field984.method1477(126, var3);
                        class11.field207 = 0;
                        class164.field2962 = class175.method1115(-22192, var3);
                        class205.field3638 = var2;
                    }
                    if (~var4 == -36) {
                        ++class147.field2632;
                        boolean var40 = class225.method1414(123, 0, 0, var3, false, 0, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        if (!var40) {
                            class225.method1414(118, 0, 1, var3, false, 1, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        }
                        class33.field668 = class209.field3677;
                        class211.field3692 = 0;
                        class109.field1938 = class2.field61;
                        class28.field600 = 2;
                        class48.field984.method650(-13721, 138);
                        class48.field984.method1478(true, class232.field4188 + var2);
                        class48.field984.method1478(true, var5);
                        class48.field984.method1463(-123, class95.field1771);
                        class48.field984.method1485(class64.field1255 + var3, (byte) 123);
                        class48.field984.method1455(-12974, class58.field1162);
                    }
                    if (~var4 == -8) {
                        ++class126.field2259;
                        class48.field984.method650(-13721, 252);
                        class48.field984.method1473(var5, (byte) -41);
                        class48.field984.method1478(true, var2);
                        class48.field984.method1477(-108, var3);
                        class11.field207 = 0;
                        class164.field2962 = class175.method1115(-22192, var3);
                        class205.field3638 = var2;
                    }
                    if (~var4 == -15) {
                        class20 var42 = class179.field3229[var5];
                        if (var42 != null) {
                            class225.method1414(119, 0, 1, var42.field4031[0], false, 1, 0, 2, var42.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                            class109.field1938 = class2.field61;
                            ++class66.field1272;
                            class211.field3692 = 0;
                            class33.field668 = class209.field3677;
                            class28.field600 = 2;
                            class48.field984.method650(-13721, 155);
                            class48.field984.method1485(class95.field1771, (byte) 126);
                            class48.field984.method1455(-12974, class58.field1162);
                            class48.field984.method1478(true, var5);
                        }
                    }
                    if (var4 == 3 && class3.method27(var6, 31, var3, var2)) {
                        ++class132.field2416;
                        class48.field984.method650(-13721, 148);
                        class48.field984.method1485(class64.field1255 + var3, (byte) 117);
                        class48.field984.method1480(class58.field1162, (byte) 35);
                        class48.field984.method1478(true, Integer.MAX_VALUE & (int) (var6 >>> 32));
                        class48.field984.method1485(class95.field1771, (byte) 123);
                        class48.field984.method1463(-44, class232.field4188 + var2);
                    }
                    if (var4 == 41) {
                        ++class65.field1260;
                        class48.field984.method650(-13721, 174);
                        class48.field984.method1473(var5, (byte) -41);
                        class48.field984.method1455(-12974, class58.field1162);
                        class48.field984.method1478(true, class95.field1771);
                        class48.field984.method1480(var3, (byte) 95);
                        class48.field984.method1485(var2, (byte) 119);
                        class11.field207 = 0;
                        class164.field2962 = class175.method1115(-22192, var3);
                        class205.field3638 = var2;
                    }
                    if (~var4 == -1002) {
                        class109.field1938 = class2.field61;
                        ++class169.field3086;
                        class28.field600 = 2;
                        class33.field668 = class209.field3677;
                        class211.field3692 = 0;
                        class48.field984.method650(-13721, 170);
                        class48.field984.method1463(-34, var5);
                    }
                    if (~var4 == -1007) {
                        class3.method27(var6, 31, var3, var2);
                        ++class178.field3219;
                        class48.field984.method650(-13721, 175);
                        class48.field984.method1478(true, var2 - -class232.field4188);
                        class48.field984.method1485(var3 - -class64.field1255, (byte) 123);
                        class48.field984.method1463(-57, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    }
                    if (~var4 == -59 && class3.method27(var6, 31, var3, var2)) {
                        ++class225.field3920;
                        class48.field984.method650(-13721, 2);
                        class48.field984.method1485(class25.field546, (byte) 121);
                        class48.field984.method1478(true, class4.field78);
                        class48.field984.method1463(-103, class232.field4188 + var2);
                        class48.field984.method1485((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 124);
                        class48.field984.method1485(var3 - -class64.field1255, (byte) 117);
                        class48.field984.method1477(126, class178.field3209);
                    }
                    if (var4 == 46) {
                        class20 var43 = class179.field3229[var5];
                        if (var43 != null) {
                            class225.method1414(-41, 0, 1, var43.field4031[0], false, 1, 0, 2, var43.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                            ++class39.field800;
                            class28.field600 = 2;
                            class109.field1938 = class2.field61;
                            class211.field3692 = 0;
                            class33.field668 = class209.field3677;
                            class48.field984.method650(-13721, 70);
                            class48.field984.method1473(class4.field78, (byte) -41);
                            class48.field984.method1485(var5, (byte) 121);
                            class48.field984.method1478(true, class25.field546);
                            class48.field984.method1477(126, class178.field3209);
                        }
                    }
                    if (~var4 == -52) {
                        boolean var44 = class225.method1414(-35, 0, 0, var3, false, 0, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        ++class150.field2685;
                        if (!var44) {
                            class225.method1414(115, 0, 1, var3, false, 1, 0, 2, var2, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                        }
                        class109.field1938 = class2.field61;
                        class211.field3692 = 0;
                        class33.field668 = class209.field3677;
                        class28.field600 = 2;
                        class48.field984.method650(-13721, 156);
                        class48.field984.method1463(-70, var5);
                        class48.field984.method1463(-50, var2 - -class232.field4188);
                        class48.field984.method1473(class64.field1255 + var3, (byte) -41);
                    }
                    if (var4 == 48) {
                        class20 var46 = class179.field3229[var5];
                        if (var46 != null) {
                            class225.method1414(125, 0, 1, var46.field4031[0], false, 1, 0, 2, var46.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                            class28.field600 = 2;
                            class211.field3692 = 0;
                            ++class20.field431;
                            class33.field668 = class209.field3677;
                            class109.field1938 = class2.field61;
                            class48.field984.method650(-13721, 110);
                            class48.field984.method1478(true, var5);
                        }
                    }
                    if (~var4 == -18) {
                        class232 var47 = class197.method1235(97, var3, var2);
                        if (var47 != null) {
                            class115.method698((byte) -99);
                            class146.method927(var3, class122.method739(class174.method1110(true, var47), 258072555), -107, var2);
                            class166.field3017 = 0;
                            class95.field1770 = class90.method577(var47, -97);
                            if (class95.field1770 == null) {
                                class95.field1770 = class131.field2399;
                            }
                            if (!var47.field4237) {
                                class20.field447 = class126.method761(new class151[] { class220.field3820, var47.field4168, class31.field643 }, 10260);
                                return;
                            }
                            class20.field447 = class126.method761(new class151[] { var47.field4181, class31.field643 }, 10260);
                        }
                    } else {
                        if (~var4 == -29) {
                            ++class78.field1511;
                            class3.method27(var6, 31, var3, var2);
                            class48.field984.method650(-13721, 212);
                            class48.field984.method1478(true, class232.field4188 + var2);
                            class48.field984.method1485((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 121);
                            class48.field984.method1478(true, class64.field1255 + var3);
                        }
                        if (~var4 == -22 && class7.field113 == null) {
                            class7.method44(true, var3, var2);
                            class7.field113 = class197.method1235(110, var3, var2);
                            class27.method208(true, class7.field113);
                        }
                        if (~var4 == -27) {
                            class203 var48 = class122.field2190[var5];
                            if (var48 != null) {
                                ++class8.field133;
                                class225.method1414(-56, 0, 1, var48.field4031[0], false, 1, 0, 2, var48.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                                class211.field3692 = 0;
                                class28.field600 = 2;
                                class109.field1938 = class2.field61;
                                class33.field668 = class209.field3677;
                                class48.field984.method650(-13721, 198);
                                class48.field984.method1485(var5, (byte) 124);
                            }
                        }
                        if (var4 == 47) {
                            class48.field984.method650(-13721, 206);
                            class48.field984.method1478(true, var2);
                            ++class118.field2133;
                            class48.field984.method1461(var3, (byte) 49);
                            class48.field984.method1478(true, var5);
                            class11.field207 = 0;
                            class164.field2962 = class175.method1115(-22192, var3);
                            class205.field3638 = var2;
                        }
                        if (var4 == 11) {
                            class3.method27(var6, 31, var3, var2);
                            class48.field984.method650(-13721, 172);
                            ++class115.field2042;
                            class48.field984.method1463(-69, Integer.MAX_VALUE & (int) (var6 >>> 32));
                            class48.field984.method1463(-113, class232.field4188 + var2);
                            class48.field984.method1463(-69, class64.field1255 + var3);
                        }
                        if (~var4 == -46) {
                            class203 var49 = class122.field2190[var5];
                            if (var49 != null) {
                                ++class208.field3670;
                                class225.method1414(-74, 0, 1, var49.field4031[0], false, 1, 0, 2, var49.field3978[0], class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                                class33.field668 = class209.field3677;
                                class109.field1938 = class2.field61;
                                class211.field3692 = 0;
                                class28.field600 = 2;
                                class48.field984.method650(-13721, 218);
                                class48.field984.method1473(var5, (byte) -41);
                            }
                        }
                        if (var4 == 13) {
                            ++class162.field2920;
                            class48.field984.method650(-13721, 39);
                            class48.field984.method1477(-118, var3);
                            class48.field984.method1455(-12974, class58.field1162);
                            class48.field984.method1463(-39, class95.field1771);
                            class48.field984.method1485(var2, (byte) 125);
                        }
                        if (var4 == 57) {
                            class48.field984.method650(-13721, 114);
                            ++class57.field1138;
                            class48.field984.method1485(var5, (byte) 123);
                            class48.field984.method1485(var2, (byte) 117);
                            class48.field984.method1461(var3, (byte) 33);
                            class11.field207 = 0;
                            class164.field2962 = class175.method1115(-22192, var3);
                            class205.field3638 = var2;
                        }
                        if (class166.field3017 != 0) {
                            class166.field3017 = 0;
                            class27.method208(true, class175.method1115(-22192, class178.field3209));
                        }
                        if (class159.field2859) {
                            class115.method698((byte) -123);
                        }
                        if (class164.field2962 != null && ~class11.field207 == -1) {
                            class27.method208(true, class164.field2962);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class111() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        if (arg0 != 107) {
            field1955 = null;
        }
        ++field1954;
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (super.field21.field3388) {
            int var4 = class23.field509[arg1];
            for (int var5 = 0; ~class202.field3603 < ~var5; ++var5) {
                int var6 = class195.field3477[var5];
                if (~this.field1958 > ~var6 && 4096 - this.field1958 > var6 && -this.field1958 + 2048 < var4 && ~var4 > ~(this.field1958 + 2048)) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1958 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field1958 + 2048) > ~var6 && ~(this.field1958 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field1958;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1958 + 2048);
                } else if (this.field1958 <= var4 && var4 <= -this.field1958 + 4096) {
                    if (~var6 <= ~this.field1958 && ~var6 >= ~(-this.field1958 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1958 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field1958;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1958);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(BI)I")
    public static final int method672(byte arg0, int arg1) {
        ++field1957;
        if (arg0 <= 40) {
            field1955 = null;
        }
        return 7 & arg1 >> 17;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (arg0 != 0) {
            method668((class151) null, -38, (byte) 11);
        }
        if (~arg1 == -1) {
            this.field1958 = arg2.method1490((byte) 73);
        }
        ++field1964;
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
    public static void method673(int arg0) {
        field1960 = null;
        if (arg0 >= 114) {
            field1955 = null;
        }
    }
}
