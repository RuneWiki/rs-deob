import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class4 extends class108 {

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    private int field78 = -32768;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    private int field92 = 0;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    private int field76 = 0;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "Z")
    public boolean field95 = false;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    private int field82;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lpk;")
    private class67 field75;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field83 = 3353893;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field81 = 0;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Lic;")
    public static class263 field90;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Lra;")
    private final class35 method47(int arg0) {
        field80++;
        if (arg0 != -1) {
            this.method47(23);
        }
        class183 var2 = class146.method1082(this.field82, (byte) 124);
        class35 var3;
        if (this.field95) {
            var3 = var2.method1290(-1, 86);
        } else {
            var3 = var2.method1290(this.field76, 94);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lw;IBI)V")
    public static final void method48(class107 arg0, int arg1, byte arg2, int arg3) {
        if (arg0.field1905 == 1) {
            class189.field3311++;
            class220.method1513(-112, (short) 50, arg0.field1884, 0, class120.field2227, 0L, arg0.field1896);
        }
        field77++;
        if (arg0.field1905 == 2 && !class124.field2301) {
            class96 var4 = class144.method1064(-1, arg0);
            if (var4 != null) {
                class220.method1513(-21, (short) 10, var4, -1, class36.method289(-5615, new class96[] { class77.field1323, arg0.field1821 }), 0L, arg0.field1896);
                class36.field622++;
            }
        }
        if (arg0.field1905 == 3) {
            class220.method1513(-117, (short) 15, class188.field3289, 0, class120.field2227, 0L, arg0.field1896);
            class175.field3045++;
        }
        int var5 = 75 / ((-arg2 - 15) / 48);
        if (arg0.field1905 == 4) {
            class220.method1513(-62, (short) 26, arg0.field1884, 0, class120.field2227, 0L, arg0.field1896);
            class148.field2619++;
        }
        if (arg0.field1905 == 5) {
            class220.method1513(-76, (short) 45, arg0.field1884, 0, class120.field2227, 0L, arg0.field1896);
            class144.field2544++;
        }
        if (arg0.field1905 == 6 && class27.field459 == null) {
            class226.field3836++;
            class220.method1513(-35, (short) 9, arg0.field1884, -1, class120.field2227, 0L, arg0.field1896);
        }
        if (arg0.field1833 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field1866; var7++) {
                for (int var8 = 0; var8 < arg0.field1899; var8++) {
                    int var9 = (arg0.field1966 + 32) * var8;
                    int var10 = (arg0.field1816 + 32) * var7;
                    if (var6 < 20) {
                        var10 += arg0.field1870[var6];
                        var9 += arg0.field1907[var6];
                    }
                    if (var9 <= arg3 && var10 <= arg1 && arg3 < var9 + 32 && arg1 < var10 + 32) {
                        class193.field3329 = arg0;
                        class193.field3330 = var6;
                        if (arg0.field1873[var6] > 0) {
                            class159 var11 = class269.method1845(arg0.field1873[var6] - 1, (byte) 61);
                            if (class148.field2616 == 1 && class110.method844(1318177530, client.method817(arg0))) {
                                if (class93.field1545 != arg0.field1896 || class195.field3350 != var6) {
                                    class220.method1513(-76, (short) 30, class219.field3754, var6, class36.method289(-5615, new class96[] { class178.field3075, class233.field3989, var11.field2779 }), (long) var11.field2812, arg0.field1896);
                                    class33.field565++;
                                }
                            } else if (!class124.field2301 || !class110.method844(1318177530, client.method817(arg0))) {
                                class183.field3171++;
                                class96[] var12 = var11.field2755;
                                if (class115.field2138) {
                                    var12 = class107.method809((byte) 119, var12);
                                }
                                if (class110.method844(1318177530, client.method817(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var12 != null && var12[var13] != null) {
                                            class106.field1787++;
                                            byte var14;
                                            if (var13 == 3) {
                                                var14 = 51;
                                            } else {
                                                var14 = 18;
                                            }
                                            class220.method1513(-83, var14, var12[var13], var6, class36.method289(-5615, new class96[] { class91.field1513, var11.field2779 }), (long) var11.field2812, arg0.field1896);
                                        } else if (var13 == 4) {
                                            class34.field599++;
                                            class220.method1513(-72, (short) 18, class213.field3675, var6, class36.method289(-5615, new class96[] { class91.field1513, var11.field2779 }), (long) var11.field2812, arg0.field1896);
                                        }
                                    }
                                }
                                if (class101.method770(false, client.method817(arg0))) {
                                    class251.field4339++;
                                    class220.method1513(-20, (short) 14, class219.field3754, var6, class36.method289(-5615, new class96[] { class91.field1513, var11.field2779 }), (long) var11.field2812, arg0.field1896);
                                }
                                if (class110.method844(1318177530, client.method817(arg0)) && var12 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var12[var15] != null) {
                                            class232.field3985++;
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 13;
                                            }
                                            if (var15 == 1) {
                                                var16 = 25;
                                            }
                                            if (var15 == 2) {
                                                var16 = 58;
                                            }
                                            class220.method1513(-31, var16, var12[var15], var6, class36.method289(-5615, new class96[] { class91.field1513, var11.field2779 }), (long) var11.field2812, arg0.field1896);
                                        }
                                    }
                                }
                                class96[] var17 = arg0.field1813;
                                if (class115.field2138) {
                                    var17 = class107.method809((byte) 119, var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            class195.field3357++;
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 33;
                                            }
                                            if (var18 == 1) {
                                                var19 = 6;
                                            }
                                            if (var18 == 2) {
                                                var19 = 46;
                                            }
                                            if (var18 == 3) {
                                                var19 = 12;
                                            }
                                            if (var18 == 4) {
                                                var19 = 44;
                                            }
                                            class220.method1513(-99, var19, var17[var18], var6, class36.method289(-5615, new class96[] { class91.field1513, var11.field2779 }), (long) var11.field2812, arg0.field1896);
                                        }
                                    }
                                }
                                class220.method1513(-93, (short) 1007, class258.field4473, var6, class36.method289(-5615, new class96[] { class91.field1513, var11.field2779 }), (long) var11.field2812, arg0.field1896);
                            } else if ((class251.field4343 & 0x10) == 16) {
                                class220.method1513(-103, (short) 31, class75.field1302, var6, class36.method289(-5615, new class96[] { class138.field2478, class233.field3989, var11.field2779 }), (long) var11.field2812, arg0.field1896);
                                class216.field3717++;
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg0.field1867) {
            return;
        }
        if (!class124.field2301) {
            for (int var20 = 9; var20 >= 5; var20--) {
                class96 var24 = class196.method1371(1, arg0, var20);
                if (var24 != null) {
                    class197.field3440++;
                    class220.method1513(-103, (short) 1004, var24, arg0.field1974, arg0.field1812, (long) (var20 + 1), arg0.field1896);
                }
            }
            class96 var21 = class144.method1064(-1, arg0);
            if (var21 != null) {
                class36.field622++;
                class220.method1513(-63, (short) 10, var21, arg0.field1974, arg0.field1812, 0L, arg0.field1896);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class96 var23 = class196.method1371(1, arg0, var22);
                if (var23 != null) {
                    class197.field3440++;
                    class220.method1513(-60, (short) 2, var23, arg0.field1974, arg0.field1812, (long) (var22 + 1), arg0.field1896);
                }
            }
            if (!class64.method451(client.method817(arg0), -83)) {
                return;
            }
            class220.method1513(-38, (short) 9, class78.field1327, arg0.field1974, class120.field2227, 0L, arg0.field1896);
            class226.field3836++;
        } else if (class264.method1820((byte) 10, client.method817(arg0)) && (class251.field4343 & 0x20) == 32) {
            class245.field4254++;
            class220.method1513(-125, (short) 8, class75.field1302, arg0.field1974, class36.method289(-5615, new class96[] { class138.field2478, class176.field3057, arg0.field1812 }), 0L, arg0.field1896);
            return;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    public final void method49(int arg0, int arg1) {
        field79++;
        if (this.field95) {
            return;
        }
        this.field92 += arg0;
        while (this.field75.field1143[this.field76] < this.field92) {
            this.field92 -= this.field75.field1143[this.field76];
            this.field76++;
            if (this.field76 >= this.field75.field1140.length) {
                this.field95 = true;
                break;
            }
        }
        if (arg1 != -2) {
            this.field78 = 46;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()I")
    public final int method50() {
        field86++;
        return this.field78;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)Lmb;")
    public static final class96 method51(int arg0, byte arg1) {
        field84++;
        if (arg1 == 99) {
            return arg0 < 999999999 ? class31.method205(arg0, (byte) -78) : class176.field3065;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field89++;
        class35 var11 = this.method47(-1);
        if (var11 != null) {
            var11.method52(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field78 = var11.method50();
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public static void method53(byte arg0) {
        field90 = null;
        if (arg0 <= 65) {
            field83 = -83;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static final void method54(int arg0) {
        field88++;
        for (int var1 = arg0; var1 < class145.field2577; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class103.field1734[var1];
            }
            class47 var6 = class22.field371[var5];
            if (var6 != null && var6.field4556 > 0) {
                var6.field4556--;
                if (var6.field4556 == 0) {
                    var6.field4509 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class132.field2375; var2++) {
            int var3 = class222.field3797[var2];
            class197 var4 = class86.field1450[var3];
            if (var4 != null && var4.field4556 > 0) {
                var4.field4556--;
                if (var4.field4556 == 0) {
                    var4.field4509 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIIIII)V")
    public class4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field87 = arg1;
        this.field82 = arg0;
        this.field91 = arg2;
        this.field85 = arg3;
        this.field93 = arg5 + arg6;
        this.field94 = arg4;
        int var8 = class146.method1082(this.field82, (byte) -116).field3175;
        if (var8 == -1) {
            this.field95 = true;
        } else {
            this.field95 = false;
            this.field75 = class189.method1332(var8, 2);
        }
    }
}
