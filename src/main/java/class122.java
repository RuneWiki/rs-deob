import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class122 extends class45 {

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field3117 = 0;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field3119 = 0;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    public static int field3122 = 0;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "B")
    public byte field3127;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "Lua;")
    public class137 field3115;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
    public static final void method1041(byte arg0) {
        if (class115.field2903 != null) {
            class133 var1 = class115.field2903;
            synchronized (class115.field2903) {
                class115.field2903 = null;
            }
        }
        if (arg0 <= 44) {
            field3117 = 94;
        }
        field3124++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lua;II)V")
    public static final void method1042(class137 arg0, int arg1, int arg2) {
        field3121++;
        if (class133.field3339 != null) {
            class133.field3339.field2816 = arg1 * 8 + 5;
            int var3 = class133.field3339.method973(-124);
            int var4 = class133.field3339.method973(-122);
            arg0.method1126(var3, var4, 22255);
            return;
        }
        class64.method541(255, 1, 255, null, 0, (byte) 0, true);
        if (arg2 != -29376) {
            method1042(null, 15, -113);
        }
        class143.field3569[arg1] = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)Lde;")
    public static final class27 method1043(byte arg0) {
        class27 var1 = new class27();
        var1.field777 = class111.field2723;
        var1.field776 = class132.field3315[0];
        var1.field771 = class92.field2382[0];
        var1.field775 = class22.field641[0];
        var1.field774 = class2.field150[0];
        var1.field772 = class72.field1819[0];
        field3120++;
        var1.field773 = class24.field682;
        int var2 = -49 / ((arg0 + 31) / 48);
        var1.field778 = class45.field1192;
        class57.method492(-4202);
        return var1;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(B)V")
    public static final void method1044(byte arg0) {
        field3126++;
        try {
            if (class107.field2656 == 0) {
                if (class31.field862 != null) {
                    class31.field862.method1135(-119);
                    class31.field862 = null;
                }
                class107.field2656 = 1;
                class25.field728 = false;
                class20.field549 = 0;
                class60.field1583 = null;
            }
            if (arg0 <= -4) {
                if (class107.field2656 == 1) {
                    if (class60.field1583 == null) {
                        class60.field1583 = class107.field2637.method1178(2280, class81.field2047, class26.field753);
                    }
                    if (class60.field1583.field1695 == 2) {
                        throw new IOException();
                    }
                    if (class60.field1583.field1695 == 1) {
                        class31.field862 = new class140((Socket) class60.field1583.field1693, class107.field2637);
                        class107.field2656 = 2;
                        class60.field1583 = null;
                    }
                }
                if (class107.field2656 == 2) {
                    long var1 = class36.field996 = class42.field1142.method643(255);
                    int var3 = (int) (var1 >> 16 & 0x1FL);
                    class121.field3079.field2816 = 0;
                    class121.field3079.method956((byte) 10, 14);
                    class121.field3079.method956((byte) 10, var3);
                    class31.field862.method1143(5000, 0, class121.field3079.field2880, 2);
                    class89.field2235.field2816 = 0;
                    class107.field2656 = 3;
                }
                if (class107.field2656 == 3) {
                    if (class73.field1891 != null) {
                        class73.field1891.method401((byte) 106);
                    }
                    if (class21.field582 != null) {
                        class21.field582.method401((byte) 103);
                    }
                    int var4 = class31.field862.method1139(-5440);
                    if (class73.field1891 != null) {
                        class73.field1891.method401((byte) -121);
                    }
                    if (class21.field582 != null) {
                        class21.field582.method401((byte) 59);
                    }
                    if (var4 != 0) {
                        class20.method163(20, var4);
                        return;
                    }
                    class107.field2656 = 4;
                    class89.field2235.field2816 = 0;
                }
                if (class107.field2656 == 4) {
                    if (class89.field2235.field2816 < 8) {
                        int var5 = class31.field862.method1136(0);
                        if (var5 > 8 - class89.field2235.field2816) {
                            var5 = 8 - class89.field2235.field2816;
                        }
                        if (var5 > 0) {
                            class31.field862.method1137(class89.field2235.field2816, class89.field2235.field2880, false, var5);
                            class89.field2235.field2816 += var5;
                        }
                    }
                    if (class89.field2235.field2816 == 8) {
                        class89.field2235.field2816 = 0;
                        class126.field3193 = class89.field2235.method970(-29916);
                        class107.field2656 = 5;
                    }
                }
                if (class107.field2656 == 5) {
                    class121.field3079.field2816 = 0;
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class126.field3193 >> 32), (int) class126.field3193 };
                    class121.field3079.method956((byte) 10, 10);
                    class121.field3079.method937(-1370716840, var6[0]);
                    class121.field3079.method937(-1370716840, var6[1]);
                    class121.field3079.method937(-1370716840, var6[2]);
                    class121.field3079.method937(-1370716840, var6[3]);
                    class121.field3079.method937(-1370716840, class107.field2637.field3634);
                    class121.field3079.method967(true, class42.field1142.method643(255));
                    class121.field3079.method953(true, class42.field1125);
                    class121.field3079.method924((byte) 64, class115.field2901, class37.field1014);
                    class118.field3000.field2816 = 0;
                    if (class1.field35 == 40) {
                        class118.field3000.method956((byte) 10, 18);
                    } else {
                        class118.field3000.method956((byte) 10, 16);
                    }
                    class118.field3000.method956((byte) 10, class121.field3079.field2816 + 69);
                    class118.field3000.method937(-1370716840, 457);
                    class118.field3000.method956((byte) 10, class77.field1971 ? 1 : 0);
                    class118.field3000.method937(-1370716840, class44.field1172.field2731);
                    class118.field3000.method937(-1370716840, class153.field3764.field2731);
                    class118.field3000.method937(-1370716840, class33.field905.field2731);
                    class118.field3000.method937(-1370716840, class37.field1012.field2731);
                    class118.field3000.method937(-1370716840, class121.field3101.field2731);
                    class118.field3000.method937(-1370716840, class149.field3673.field2731);
                    class118.field3000.method937(-1370716840, class87.field2193.field2731);
                    class118.field3000.method937(-1370716840, class141.field3512.field2731);
                    class118.field3000.method937(-1370716840, class5.field180.field2731);
                    class118.field3000.method937(-1370716840, class38.field1027.field2731);
                    class118.field3000.method937(-1370716840, class11.field362.field2731);
                    class118.field3000.method937(-1370716840, class31.field879.field2731);
                    class118.field3000.method937(-1370716840, class84.field2142.field2731);
                    class118.field3000.method937(-1370716840, class77.field1973.field2731);
                    class118.field3000.method937(-1370716840, client.field620.field2731);
                    class118.field3000.method937(-1370716840, class63.field1660.field2731);
                    class118.field3000.method964(class121.field3079.field2816, 0, (byte) 78, class121.field3079.field2880);
                    class31.field862.method1143(5000, 0, class118.field3000.field2880, class118.field3000.field2816);
                    class121.field3079.method1206(94, var6);
                    for (int var7 = 0; var7 < 4; var7++) {
                        var6[var7] += 50;
                    }
                    class89.field2235.method1206(48, var6);
                    class107.field2656 = 6;
                }
                if (class107.field2656 == 6 && class31.field862.method1136(0) > 0) {
                    int var8 = class31.field862.method1139(-5440);
                    if (var8 == 21 && class1.field35 == 20) {
                        class107.field2656 = 7;
                    } else if (var8 == 2) {
                        class107.field2656 = 9;
                    } else if (var8 == 15 && class1.field35 == 40) {
                        class1.method8(9145);
                        return;
                    } else if (var8 == 23 && class111.field2766 < 1) {
                        class111.field2766++;
                        class107.field2656 = 0;
                    } else {
                        class20.method163(20, var8);
                        return;
                    }
                }
                if (class107.field2656 == 7 && class31.field862.method1136(0) > 0) {
                    class76.field1953 = (class31.field862.method1139(-5440) + 3) * 60;
                    class107.field2656 = 8;
                }
                if (class107.field2656 == 8) {
                    class20.field549 = 0;
                    class42.method315(class74.field1923, class32.method258(-110, new class73[] { class78.method676(class76.field1953 / 60, -9), class150.field3705 }), 123, client.field611);
                    if (--class76.field1953 <= 0) {
                        class107.field2656 = 0;
                    }
                } else {
                    if (class107.field2656 == 9 && class31.field862.method1136(0) >= 8) {
                        class64.field1691 = class31.field862.method1139(-5440);
                        class104.field2592 = class31.field862.method1139(-5440) == 1;
                        class78.field1997 = class31.field862.method1139(-5440);
                        class78.field1997 <<= 0x8;
                        class78.field1997 += class31.field862.method1139(-5440);
                        field3119 = class31.field862.method1139(-5440);
                        class31.field862.method1137(0, class89.field2235.field2880, false, 1);
                        class89.field2235.field2816 = 0;
                        class142.field3535 = class89.field2235.method1213(-40);
                        class31.field862.method1137(0, class89.field2235.field2880, false, 2);
                        class89.field2235.field2816 = 0;
                        class81.field2039 = class89.field2235.method944((byte) 114);
                        class107.field2656 = 10;
                    }
                    if (class107.field2656 != 10) {
                        class20.field549++;
                        if (class20.field549 > 2000) {
                            if (class111.field2766 < 1) {
                                class107.field2656 = 0;
                                class111.field2766++;
                                if (class81.field2047 == class32.field891) {
                                    class81.field2047 = class22.field630;
                                } else {
                                    class81.field2047 = class32.field891;
                                }
                            } else {
                                class20.method163(20, -3);
                            }
                        }
                    } else if (class31.field862.method1136(0) >= class81.field2039) {
                        class89.field2235.field2816 = 0;
                        class31.field862.method1137(0, class89.field2235.field2880, false, class81.field2039);
                        class28.method215(127);
                        class9.field303 = -1;
                        class103.method829(false, (byte) 109);
                        class142.field3535 = -1;
                    }
                }
            }
        } catch (IOException var9) {
            if (class111.field2766 < 1) {
                class107.field2656 = 0;
                if (class81.field2047 == class32.field891) {
                    class81.field2047 = class22.field630;
                } else {
                    class81.field2047 = class32.field891;
                }
                class111.field2766++;
            } else {
                class20.method163(20, -2);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)Lwa;")
    public static final class149 method1045(int arg0, int arg1) {
        class149 var2 = (class149) class98.field2450.method538(0, (long) arg1);
        field3129++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class61.field1601.method898((byte) -122, arg1, 6);
        class149 var4 = new class149();
        var4.field3640 = arg1;
        if (var3 != null) {
            var4.method1187(new class114(var3), 4);
        }
        var4.method1191((byte) 79);
        if (var4.field3664) {
            var4.field3648 = 0;
            var4.field3646 = false;
        }
        class98.field2450.method542(var4, -901, (long) arg1);
        return arg0 == 31 ? var4 : null;
    }
}
