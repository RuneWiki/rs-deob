import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class2 extends class212 {

    @OriginalMember(owner = "client!ug", name = "eb", descriptor = "I")
    private int field56;

    @OriginalMember(owner = "client!ug", name = "gb", descriptor = "Lsc;")
    public static class181 field58 = class149.method967(255, "_labels");

    @OriginalMember(owner = "client!ug", name = "fb", descriptor = "Lob;")
    public static class190 field57 = new class190();

    @OriginalMember(owner = "client!ug", name = "nb", descriptor = "Lsc;")
    public static class181 field65 = class149.method967(255, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ug", name = "ib", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ug", name = "kb", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ug", name = "lb", descriptor = "Ltg;")
    public static class107 field63;

    @OriginalMember(owner = "client!ug", name = "hb", descriptor = "Ljb;")
    public static class11 field59;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "Lab;")
    public static class12 field55;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "Lo;")
    public static class175 field51;

    @OriginalMember(owner = "client!ug", name = "mb", descriptor = "[Lka;")
    public static class134[] field64;

    @OriginalMember(owner = "client!ug", name = "jb", descriptor = "[[[B")
    public static byte[][][] field61;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILo;)Lsc;")
    public static final class181 method19(int arg0, class175 arg1) {
        ++field53;
        if (arg0 != -15077) {
            method21((byte) -36);
        }
        if (class229.method1502((byte) -74, client.method1058(arg1)) == 0) {
            return null;
        } else if (arg1.field3059 != null && arg1.field3059.method1232(124).method1226(-458531486) != 0) {
            return arg1.field3059;
        } else {
            return class166.field2826 ? class163.field2784 : null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZIIIB)V")
    public static final void method20(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        class238.field4140 = (short) arg0;
        class96.field1546 = (short) arg2;
        ++field52;
        if (arg5 <= 123) {
            method20(-114, false, 36, 94, 81, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V")
    public static void method21(byte arg0) {
        if (arg0 != 94) {
            method23(91);
        }
        field51 = null;
        field61 = null;
        field55 = null;
        field65 = null;
        field57 = null;
        field64 = null;
        field59 = null;
        field63 = null;
        field58 = null;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class2() {
        this(4096);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljb;Ljb;Ljb;ZLhj;)Z")
    public static final boolean method22(class11 arg0, class11 arg1, class11 arg2, boolean arg3, class184 arg4) {
        class247.field4317 = arg4;
        class211.field3621 = arg1;
        ++field62;
        class244.field4243 = arg0;
        class224.field3872 = arg2;
        if (arg3) {
            method19(104, (class175) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V")
    private class2(int arg0) {
        super(0, true);
        this.field56 = 4096;
        this.field56 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V")
    public static final void method23(int arg0) {
        if (arg0 == -711023152) {
            ++field46;
            if (~class25.field451 != -1 && ~class25.field451 != -6) {
                try {
                    if (~(++class106.field1737) < -2001) {
                        if (class216.field3713 != null) {
                            class216.field3713.method313(106);
                            class216.field3713 = null;
                        }
                        if (~class211.field3622 <= -2) {
                            class25.field451 = 0;
                            class102.field1704 = -5;
                            return;
                        }
                        ++class211.field3622;
                        class106.field1737 = 0;
                        class25.field451 = 1;
                        if (~class55.field853 == ~class248.field4333) {
                            class248.field4333 = class219.field3780;
                        } else {
                            class248.field4333 = class55.field853;
                        }
                    }
                    if (~class25.field451 == -2) {
                        class96.field1550 = class224.field3870.method915(class248.field4333, 0, class173.field2912);
                        class25.field451 = 2;
                    }
                    if (~class25.field451 == -3) {
                        if (class96.field1550.field1933 == 2) {
                            throw new IOException();
                        }
                        if (class96.field1550.field1933 != 1) {
                            return;
                        }
                        class216.field3713 = new class46((Socket) class96.field1550.field1935, class224.field3870);
                        class96.field1550 = null;
                        long var1 = class137.field2250 = class241.field4191.method1197(arg0 + 711023039);
                        int var3 = (int) (31L & var1 >> 16);
                        class141.field2275.field3933 = 0;
                        class141.field2275.method1538(14, (byte) -114);
                        class141.field2275.method1538(var3, (byte) -75);
                        class216.field3713.method317(2, 6, class141.field2275.field3977, 0);
                        if (class174.field2914 != null) {
                            class174.field2914.method1703(arg0 ^ -711023152);
                        }
                        if (class8.field156 != null) {
                            class8.field156.method1703(0);
                        }
                        int var4 = class216.field3713.method312((byte) -40);
                        if (class174.field2914 != null) {
                            class174.field2914.method1703(0);
                        }
                        if (class8.field156 != null) {
                            class8.field156.method1703(0);
                        }
                        if (~var4 != -1) {
                            class25.field451 = 0;
                            class102.field1704 = var4;
                            class216.field3713.method313(arg0 ^ -711023173);
                            class216.field3713 = null;
                            return;
                        }
                        class25.field451 = 3;
                    }
                    if (~class25.field451 == -4) {
                        if (~class216.field3713.method315((byte) -120) > -9) {
                            return;
                        }
                        int[] var5 = new int[4];
                        class216.field3713.method316(0, (byte) -120, class76.field1223.field3977, 8);
                        class76.field1223.field3933 = 0;
                        class71.field1139 = class76.field1223.method1514(arg0 + 711045280);
                        var5[1] = (int) (9.9999999E7D * Math.random());
                        var5[2] = (int) (class71.field1139 >> 32);
                        class141.field2275.field3933 = 0;
                        var5[3] = (int) class71.field1139;
                        var5[0] = (int) (Math.random() * 9.9999999E7D);
                        class141.field2275.method1538(10, (byte) -95);
                        class141.field2275.method1544(var5[0], -3165);
                        class141.field2275.method1544(var5[1], -3165);
                        class141.field2275.method1544(var5[2], arg0 ^ 711022195);
                        class141.field2275.method1544(var5[3], arg0 + 711019987);
                        class141.field2275.method1511(false, class241.field4191.method1197(-127));
                        class141.field2275.method1550(class241.field4195, arg0 ^ -711023205);
                        class141.field2275.method1562(class95.field1518, class148.field2461, 74);
                        class159.field2722.field3933 = 0;
                        if (~class5.field106 != -41) {
                            class159.field2722.method1538(16, (byte) -63);
                        } else {
                            class159.field2722.method1538(18, (byte) -98);
                        }
                        class159.field2722.method1534(0, 151 + class141.field2275.field3933 + class78.method539((byte) 91, class4.field78));
                        class159.field2722.method1544(507, -3165);
                        class159.field2722.method1538(class115.field1859, (byte) 64);
                        class159.field2722.method1538(0, (byte) -117);
                        class159.field2722.method1538(class76.method529((byte) 121), (byte) 74);
                        class159.field2722.method1534(0, class143.field2321);
                        class159.field2722.method1534(0, class41.field620);
                        class256.method1743(-79, class159.field2722);
                        class159.field2722.method1550(class4.field78, 113);
                        class159.field2722.method1544(class264.field4584, -3165);
                        class159.field2722.method1544(class239.method1630((byte) 39), -3165);
                        class132.field2179 = true;
                        class159.field2722.method1544(class21.field382.field206, arg0 ^ 711022195);
                        class159.field2722.method1544(class99.field1626.field206, -3165);
                        class159.field2722.method1544(class250.field4362.field206, -3165);
                        class159.field2722.method1544(class69.field1111.field206, -3165);
                        class159.field2722.method1544(class264.field4600.field206, -3165);
                        class159.field2722.method1544(class90.field1435.field206, -3165);
                        class159.field2722.method1544(class13.field266.field206, -3165);
                        class159.field2722.method1544(class45.field692.field206, -3165);
                        class159.field2722.method1544(class254.field4453.field206, arg0 ^ 711022195);
                        class159.field2722.method1544(class241.field4179.field206, -3165);
                        class159.field2722.method1544(class196.field3427.field206, -3165);
                        class159.field2722.method1544(class132.field2189.field206, -3165);
                        class159.field2722.method1544(class229.field3921.field206, -3165);
                        class159.field2722.method1544(class71.field1132.field206, -3165);
                        class159.field2722.method1544(class257.field4503.field206, -3165);
                        class159.field2722.method1544(class98.field1583.field206, -3165);
                        class159.field2722.method1544(class13.field265.field206, -3165);
                        class159.field2722.method1544(class221.field3825.field206, -3165);
                        class159.field2722.method1544(class64.field1053.field206, -3165);
                        class159.field2722.method1544(class258.field4510.field206, arg0 + 711019987);
                        class159.field2722.method1544(class81.field1301.field206, -3165);
                        class159.field2722.method1544(class80.field1293.field206, -3165);
                        class159.field2722.method1544(class162.field2773.field206, -3165);
                        class159.field2722.method1544(class37.field571.field206, -3165);
                        class159.field2722.method1544(class41.field613.field206, -3165);
                        class159.field2722.method1544(class248.field4334.field206, arg0 + 711019987);
                        class159.field2722.method1544(class198.field3439.field206, -3165);
                        class159.field2722.method1564(class141.field2275.field3933, class141.field2275.field3977, (byte) 56, 0);
                        class216.field3713.method317(class159.field2722.field3933, 49, class159.field2722.field3977, 0);
                        class141.field2275.method552(-16332, var5);
                        for (int var6 = 0; var6 < 4; ++var6) {
                            var5[var6] += 50;
                        }
                        class76.field1223.method552(-16332, var5);
                        class25.field451 = 4;
                    }
                    if (~class25.field451 == -5) {
                        if (~class216.field3713.method315((byte) -120) > -2) {
                            return;
                        }
                        int var7 = class216.field3713.method312((byte) -40);
                        if (~var7 != -22) {
                            if (var7 == 1) {
                                class25.field451 = 5;
                                class102.field1704 = var7;
                                return;
                            }
                            if (~var7 != -3) {
                                if (var7 != 15) {
                                    if (~var7 == -24 && class211.field3622 < 1) {
                                        ++class211.field3622;
                                        class106.field1737 = 0;
                                        class25.field451 = 1;
                                        class216.field3713.method313(-124);
                                        class216.field3713 = null;
                                        return;
                                    }
                                    class25.field451 = 0;
                                    class102.field1704 = var7;
                                    class216.field3713.method313(111);
                                    class216.field3713 = null;
                                    return;
                                }
                                class102.field1704 = var7;
                                class25.field451 = 0;
                                return;
                            }
                            class25.field451 = 8;
                        } else {
                            class25.field451 = 7;
                        }
                    }
                    if (~class25.field451 == -7) {
                        class141.field2275.field3933 = 0;
                        class141.field2275.method541(17, arg0 + 711023045);
                        class216.field3713.method317(class141.field2275.field3933, 121, class141.field2275.field3977, 0);
                        class25.field451 = 4;
                    } else if (~class25.field451 == -8) {
                        if (class216.field3713.method315((byte) -120) >= 1) {
                            class100.field1685 = 180 + class216.field3713.method312((byte) -40) * 60;
                            class25.field451 = 0;
                            class102.field1704 = 21;
                            class216.field3713.method313(-53);
                            class216.field3713 = null;
                        }
                    } else {
                        if (class25.field451 == 8) {
                            if (class216.field3713.method315((byte) -120) < 11) {
                                return;
                            }
                            class216.field3713.method316(0, (byte) 75, class76.field1223.field3977, 11);
                            class76.field1223.field3933 = 0;
                            class264.field4594 = class76.field1223.method1516((byte) 82);
                            class237.field4120 = class76.field1223.method1516((byte) 82);
                            class116.field1914 = class76.field1223.method1516((byte) 82);
                            if (class116.field1914 == 1) {
                                try {
                                    class32.field522.method1244(0, class224.field3870.field2285);
                                } catch (Throwable var9) {
                                }
                            } else {
                                try {
                                    class203.field3500.method1244(0, class224.field3870.field2285);
                                } catch (Throwable var8) {
                                }
                            }
                            class11.field241 = class76.field1223.method1516((byte) 82);
                            class235.field4090 = ~class76.field1223.method1516((byte) 82) == -2;
                            class199.field3452 = class76.field1223.method1535(2);
                            class232.field4062 = class76.field1223.method1516((byte) 82);
                            class100.field1680 = class76.field1223.method544(true);
                            class108.field1772 = class76.field1223.method1535(2);
                            class25.field451 = 9;
                        }
                        if (~class25.field451 == -10) {
                            if (class216.field3713.method315((byte) -120) >= class108.field1772) {
                                class76.field1223.field3933 = 0;
                                class216.field3713.method316(0, (byte) 126, class76.field1223.field3977, class108.field1772);
                                class102.field1704 = 2;
                                class25.field451 = 0;
                                class172.method1137(arg0 + 711023152);
                                class144.field2342 = -1;
                                class69.method480(false, true);
                                class100.field1680 = -1;
                            }
                        }
                    }
                } catch (IOException var10) {
                    if (class216.field3713 != null) {
                        class216.field3713.method313(90);
                        class216.field3713 = null;
                    }
                    if (class211.field3622 < 1) {
                        ++class211.field3622;
                        if (class55.field853 != class248.field4333) {
                            class248.field4333 = class55.field853;
                        } else {
                            class248.field4333 = class219.field3780;
                        }
                        class25.field451 = 1;
                        class106.field1737 = 0;
                    } else {
                        class102.field1704 = -4;
                        class25.field451 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field54;
        if (arg1 <= 25) {
            method20(-7, false, -48, 22, 54, (byte) 89);
        }
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            class252.method1719(var3, 0, class26.field452, this.field56);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lsc;ILsc;B)V")
    public static final void method25(class181 arg0, int arg1, class181 arg2, byte arg3) {
        class38.field588 = false;
        ++field49;
        if (arg3 <= 53) {
            field58 = null;
        }
        class241.field4191 = arg0;
        class115.field1859 = arg1;
        class100.field1685 = 0;
        class241.field4195 = arg2;
        if (!class241.field4191.method1202(class241.field4187, -4557) && !class241.field4195.method1202(class241.field4187, -4557)) {
            class211.field3622 = 0;
            class106.field1737 = 0;
            class25.field451 = 1;
            class102.field1704 = -3;
        } else {
            class102.field1704 = 3;
            class25.field451 = 0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            method25((class181) null, 37, (class181) null, (byte) -116);
        }
        ++field48;
        if (~arg1 == -1) {
            this.field56 = (arg0.method1516((byte) 82) << 12) / 255;
        }
    }
}
