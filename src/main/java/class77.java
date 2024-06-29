import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class77 extends class22 {

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    private final int field1248;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    private final int field1251;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    private final int field1236;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    private final int field1238;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "Z")
    public static boolean field1241 = true;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Lsc;")
    public static class181 field1244 = class149.method967(255, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "Lsc;")
    public static class181 field1249 = class149.method967(255, "event_opbase");

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Lsc;")
    public static class181 field1243 = class149.method967(255, "p11_full");

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "Lsc;")
    public static class181 field1253 = class149.method967(255, "_");

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(IIIIII)V")
    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1248 = arg0;
        this.field1251 = arg2;
        this.field1236 = arg3;
        this.field1238 = arg1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBI)V")
    public final void method200(int arg0, byte arg1, int arg2) {
        if (arg1 >= -97) {
            this.method199(57, 58, 42);
        }
        ++field1239;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(III)V")
    public static final void method532(int arg0, int arg1, int arg2) {
        if (arg1 == 6848) {
            ++field1252;
            if (class94.field1502 != 0 && ~arg2 != 0) {
                class121.method793(arg2, false, 0, false, class94.field1502, class132.field2189);
                class148.field2479 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public static void method533(int arg0) {
        if (arg0 != 1) {
            method532(62, -67, 36);
        }
        field1249 = null;
        field1253 = null;
        field1244 = null;
        field1243 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIILaf;IZJ)Z")
    public static final boolean method534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class208 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class31.field505 == class253.field4418;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class238.field4129 || var24 >= class2.field47) {
                    return false;
                }
                class220 var25 = class221.field3820[arg0][var15][var24];
                if (var25 != null && var25.field3806 >= 5) {
                    return false;
                }
            }
        }
        class100 var16 = new class100();
        var16.field1677 = arg11;
        var16.field1670 = arg0;
        var16.field1667 = arg5;
        var16.field1684 = arg6;
        var16.field1666 = arg7;
        var16.field1681 = arg8;
        var16.field1673 = arg9;
        var16.field1688 = arg1;
        var16.field1672 = arg2;
        var16.field1671 = arg1 + arg3 - 1;
        var16.field1676 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; ++var17) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                int var21 = 0;
                if (var17 > arg1) {
                    ++var21;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; --var22) {
                    if (class221.field3820[var22][var17][var20] == null) {
                        class221.field3820[var22][var17][var20] = new class220(var22, var17, var20);
                    }
                }
                class220 var23 = class221.field3820[arg0][var17][var20];
                var23.field3797[var23.field3806] = var16;
                var23.field3808[var23.field3806] = var21;
                var23.field3802 |= var21;
                ++var23.field3806;
                if (var13 && class27.field474[var17][var20] != 0) {
                    var14 = class27.field474[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class27.field474[var18][var19] == 0) {
                        class27.field474[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class4.field89[class100.field1665++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
    public final void method199(int arg0, int arg1, int arg2) {
        ++field1240;
        if (arg0 != -6474) {
            this.method200(-77, (byte) 114, -28);
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
    public static final void method535(int arg0) {
        ++field1237;
        if (~class47.field743 != -1) {
            try {
                if (arg0 != 2) {
                    field1241 = true;
                }
                if (++class8.field157 > 2000) {
                    if (class216.field3713 != null) {
                        class216.field3713.method313(arg0 + -84);
                        class216.field3713 = null;
                    }
                    if (~class123.field2011 <= -2) {
                        class47.field743 = 0;
                        class234.field4075 = -5;
                        return;
                    }
                    if (~class55.field853 == ~class248.field4333) {
                        class248.field4333 = class219.field3780;
                    } else {
                        class248.field4333 = class55.field853;
                    }
                    ++class123.field2011;
                    class47.field743 = 1;
                    class8.field157 = 0;
                }
                if (class47.field743 == 1) {
                    class96.field1550 = class224.field3870.method915(class248.field4333, 0, class173.field2912);
                    class47.field743 = 2;
                }
                if (~class47.field743 == -3) {
                    if (class96.field1550.field1933 == 2) {
                        throw new IOException();
                    }
                    if (class96.field1550.field1933 != 1) {
                        return;
                    }
                    class216.field3713 = new class46((Socket) class96.field1550.field1935, class224.field3870);
                    class96.field1550 = null;
                    class216.field3713.method317(class141.field2275.field3933, -125, class141.field2275.field3977, 0);
                    if (class174.field2914 != null) {
                        class174.field2914.method1703(0);
                    }
                    if (class8.field156 != null) {
                        class8.field156.method1703(0);
                    }
                    int var1 = class216.field3713.method312((byte) -40);
                    if (class174.field2914 != null) {
                        class174.field2914.method1703(0);
                    }
                    if (class8.field156 != null) {
                        class8.field156.method1703(0);
                    }
                    if (~var1 != -22) {
                        class47.field743 = 0;
                        class234.field4075 = var1;
                        class216.field3713.method313(-79);
                        class216.field3713 = null;
                        return;
                    }
                    class47.field743 = 3;
                }
                if (~class47.field743 == -4) {
                    if (class216.field3713.method315((byte) -120) < 1) {
                        return;
                    }
                    class58.field879 = new class181[class216.field3713.method312((byte) -40)];
                    class47.field743 = 4;
                }
                if (class47.field743 == 4) {
                    if (class216.field3713.method315((byte) -120) >= class58.field879.length * 8) {
                        class76.field1223.field3933 = 0;
                        class216.field3713.method316(0, (byte) -53, class76.field1223.field3977, class58.field879.length * 8);
                        for (int var2 = 0; ~class58.field879.length < ~var2; ++var2) {
                            class58.field879[var2] = class19.method184(-26890, class76.field1223.method1514(22128));
                        }
                        class234.field4075 = 21;
                        class47.field743 = 0;
                        class216.field3713.method313(-81);
                        class216.field3713 = null;
                    }
                }
            } catch (IOException var3) {
                if (class216.field3713 != null) {
                    class216.field3713.method313(81);
                    class216.field3713 = null;
                }
                if (class123.field2011 >= 1) {
                    class47.field743 = 0;
                    class234.field4075 = -4;
                } else {
                    class47.field743 = 1;
                    if (~class55.field853 == ~class248.field4333) {
                        class248.field4333 = class219.field3780;
                    } else {
                        class248.field4333 = class55.field853;
                    }
                    ++class123.field2011;
                    class8.field157 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(III)V")
    public final void method202(int arg0, int arg1, int arg2) {
        ++field1247;
        int var4 = this.field1248 * arg0 >> 12;
        int var5 = this.field1238 * arg2 >> 12;
        if (arg1 != -1) {
            field1241 = false;
        }
        int var6 = this.field1251 * arg0 >> 12;
        int var7 = this.field1236 * arg2 >> 12;
        class237.method1623(var5, var6, super.field389, true, var7, var4);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZIIILjb;I)V")
    public static final void method536(int arg0, boolean arg1, int arg2, int arg3, int arg4, class11 arg5, int arg6) {
        class203.field3498 = arg4;
        ++field1246;
        class43.field674 = arg0;
        class255.field4466 = arg6;
        class263.field4577 = arg3;
        class145.field2376 = arg1;
        class97.field1575 = 1;
        class218.field3765 = arg5;
        if (arg2 <= 114) {
            field1244 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Z")
    public static final boolean method537(int arg0, int arg1) {
        ++field1250;
        if (class262.field4573[arg1]) {
            return true;
        } else if (!class212.field3663.method104(arg1, 0)) {
            return false;
        } else {
            int var2 = class212.field3663.method102(arg1, -23099);
            if (var2 == 0) {
                class262.field4573[arg1] = true;
                return true;
            } else {
                if (class208.field3563[arg1] == null) {
                    class208.field3563[arg1] = new class175[var2];
                }
                int var3 = 0;
                if (arg0 != -1) {
                    return false;
                } else {
                    while (~var2 < ~var3) {
                        if (class208.field3563[arg1][var3] == null) {
                            byte[] var4 = class212.field3663.method89(var3, arg1, 124);
                            if (var4 != null) {
                                class208.field3563[arg1][var3] = new class175();
                                class208.field3563[arg1][var3].field2987 = (arg1 << 16) - -var3;
                                if (var4[0] == -1) {
                                    class208.field3563[arg1][var3].method1162((byte) -66, new class230(var4));
                                } else {
                                    class208.field3563[arg1][var3].method1168(new class230(var4), -95);
                                }
                            }
                        }
                        ++var3;
                    }
                    class262.field4573[arg1] = true;
                    return true;
                }
            }
        }
    }
}
