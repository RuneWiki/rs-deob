import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class143 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lt;")
    public static class128 field3451 = new class128(5000);

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lwd;")
    private static class150 field3452 = class2.method9(true, "Choose Option");

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lwd;")
    public static class150 field3457 = class2.method9(true, "p11_full");

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lwd;")
    private static class150 field3459 = class2.method9(true, "You have only just left another world)3");

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3460 = 0;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lwd;")
    public static class150 field3462 = field3452;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lwd;")
    private static class150 field3463 = class2.method9(true, "Members only world");

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lwd;")
    public static class150 field3456 = field3459;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lwd;")
    public static class150 field3464 = field3463;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Li;")
    public static class56 field3461 = new class56(64);

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3466 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "[I")
    public static int[] field3465;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[Lqd;")
    public static class114[] field3453;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static final void method1079(int arg0) {
        field3455++;
        try {
            if (class88.field2074 == 0) {
                if (class49.field1292 != null) {
                    class49.field1292.method121((byte) 121);
                    class49.field1292 = null;
                }
                class88.field2074 = 1;
                class98.field2242 = 0;
                class61.field1564 = null;
                class101.field2310 = false;
            }
            if (class88.field2074 == 1) {
                if (class61.field1564 == null) {
                    class61.field1564 = class10.field243.method1024(-19452, class46.field1246, class76.field1894);
                }
                if (class61.field1564.field2281 == 2) {
                    throw new IOException();
                }
                if (class61.field1564.field2281 == 1) {
                    class49.field1292 = new class17((Socket) class61.field1564.field2282, class10.field243);
                    class61.field1564 = null;
                    class88.field2074 = 2;
                }
            }
            if (class88.field2074 == 2) {
                long var1 = class31.field926 = class94.field2171.method1198(1);
                field3451.field3601 = 0;
                field3451.method1126(31159, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                field3451.method1126(31159, var3);
                class49.field1292.method122(0, field3451.field3592, (byte) 4, 2);
                class121.field2783.field3601 = 0;
                class88.field2074 = 3;
            }
            if (class88.field2074 == 3) {
                if (class130.field3069 != null) {
                    class130.field3069.method381(4096);
                }
                if (class1.field15 != null) {
                    class1.field15.method381(4096);
                }
                int var4 = class49.field1292.method120((byte) 80);
                if (class130.field3069 != null) {
                    class130.field3069.method381(4096);
                }
                if (class1.field15 != null) {
                    class1.field15.method381(4096);
                }
                if (var4 != 0) {
                    class130.method984(24445, var4);
                    return;
                }
                class88.field2074 = 4;
                class121.field2783.field3601 = 0;
            }
            if (class88.field2074 == 4) {
                if (class121.field2783.field3601 < 8) {
                    int var5 = class49.field1292.method125(-16059);
                    if (8 - class121.field2783.field3601 < var5) {
                        var5 = 8 - class121.field2783.field3601;
                    }
                    if (var5 > 0) {
                        class49.field1292.method123(0, class121.field2783.field3592, var5, class121.field2783.field3601);
                        class121.field2783.field3601 += var5;
                    }
                }
                if (class121.field2783.field3601 == 8) {
                    class121.field2783.field3601 = 0;
                    class2.field51 = class121.field2783.method1149(1539013024);
                    class88.field2074 = 5;
                }
            }
            if (class88.field2074 == 5) {
                field3451.field3601 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class2.field51 >> 32), (int) class2.field51 };
                field3451.method1126(31159, 10);
                field3451.method1122((byte) 32, var6[0]);
                field3451.method1122((byte) 32, var6[1]);
                field3451.method1122((byte) 32, var6[2]);
                field3451.method1122((byte) 32, var6[3]);
                field3451.method1122((byte) 32, class10.field243.field3253);
                field3451.method1129(class94.field2171.method1198(1), false);
                field3451.method1111(class94.field2190, 0);
                field3451.method1120(class41.field1080, class29.field880, -94);
                class136.field3206.field3601 = 0;
                if (class137.field3209 == 40) {
                    class136.field3206.method1126(31159, 18);
                } else {
                    class136.field3206.method1126(31159, 16);
                }
                class136.field3206.method1126(31159, field3451.field3601 + 69);
                class136.field3206.method1122((byte) 32, 454);
                class136.field3206.method1126(31159, class20.field517 ? 1 : 0);
                class136.field3206.method1122((byte) 32, class131.field3099.field1139);
                class136.field3206.method1122((byte) 32, class111.field2572.field1139);
                class136.field3206.method1122((byte) 32, class125.field2899.field1139);
                class136.field3206.method1122((byte) 32, class127.field2994.field1139);
                class136.field3206.method1122((byte) 32, class107.field2437.field1139);
                class136.field3206.method1122((byte) 32, class9.field201.field1139);
                class136.field3206.method1122((byte) 32, class30.field912.field1139);
                class136.field3206.method1122((byte) 32, class35.field979.field1139);
                class136.field3206.method1122((byte) 32, class66.field1677.field1139);
                class136.field3206.method1122((byte) 32, class141.field3329.field1139);
                class136.field3206.method1122((byte) 32, class43.field1202.field1139);
                class136.field3206.method1122((byte) 32, class40.field1068.field1139);
                class136.field3206.method1122((byte) 32, class4.field87.field1139);
                class136.field3206.method1122((byte) 32, class148.field3602.field1139);
                class136.field3206.method1122((byte) 32, class9.field213.field1139);
                class136.field3206.method1122((byte) 32, class16.field415.field1139);
                class136.field3206.method1130(field3451.field3592, (byte) -109, field3451.field3601, 0);
                class49.field1292.method122(0, class136.field3206.field3592, (byte) 4, class136.field3206.field3601);
                field3451.method977(-21160, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class121.field2783.method977(-21160, var6);
                class88.field2074 = 6;
            }
            if (arg0 >= 9) {
                if (class88.field2074 == 6 && class49.field1292.method125(-16059) > 0) {
                    int var8 = class49.field1292.method120((byte) 114);
                    if (var8 == 21 && class137.field3209 == 20) {
                        class88.field2074 = 7;
                    } else if (var8 == 2) {
                        class88.field2074 = 9;
                    } else if (var8 == 15 && class137.field3209 == 40) {
                        class29.method240((byte) -53);
                        return;
                    } else if (var8 == 23 && class6.field147 < 1) {
                        class6.field147++;
                        class88.field2074 = 0;
                    } else {
                        class130.method984(24445, var8);
                        return;
                    }
                }
                if (class88.field2074 == 7 && class49.field1292.method125(-16059) > 0) {
                    class63.field1618 = class49.field1292.method120((byte) 89) * 60 + 180;
                    class88.field2074 = 8;
                }
                if (class88.field2074 == 8) {
                    class98.field2242 = 0;
                    class101.method695(field3456, -8014, class111.method786((byte) -116, new class150[] { class29.method239(1000, class63.field1618 / 60), class101.field2311 }), class136.field3188);
                    if (--class63.field1618 <= 0) {
                        class88.field2074 = 0;
                    }
                } else {
                    if (class88.field2074 == 9 && class49.field1292.method125(-16059) >= 8) {
                        class66.field1689 = class49.field1292.method120((byte) 56);
                        class119.field2741 = class49.field1292.method120((byte) 116) == 1;
                        class29.field876 = class49.field1292.method120((byte) 111);
                        class29.field876 <<= 0x8;
                        class29.field876 += class49.field1292.method120((byte) 112);
                        class6.field149 = class49.field1292.method120((byte) 117);
                        class49.field1292.method123(0, class121.field2783.field3592, 1, 0);
                        class121.field2783.field3601 = 0;
                        class11.field277 = class121.field2783.method975(72);
                        class49.field1292.method123(0, class121.field2783.field3592, 2, 0);
                        class121.field2783.field3601 = 0;
                        class76.field1870 = class121.field2783.method1140(-1);
                        class88.field2074 = 10;
                    }
                    if (class88.field2074 != 10) {
                        class98.field2242++;
                        if (class98.field2242 > 2000) {
                            if (class6.field147 < 1) {
                                class6.field147++;
                                if (class46.field1246 == class30.field910) {
                                    class46.field1246 = class135.field3182;
                                } else {
                                    class46.field1246 = class30.field910;
                                }
                                class88.field2074 = 0;
                            } else {
                                class130.method984(24445, -3);
                            }
                        }
                    } else if (class49.field1292.method125(-16059) >= class76.field1870) {
                        class121.field2783.field3601 = 0;
                        class49.field1292.method123(0, class121.field2783.field3592, class76.field1870, 0);
                        class142.method1074(111);
                        class142.field3441 = -1;
                        class128.method968(false, 125);
                        class11.field277 = -1;
                    }
                }
            }
        } catch (IOException var9) {
            if (class6.field147 < 1) {
                if (class46.field1246 == class30.field910) {
                    class46.field1246 = class135.field3182;
                } else {
                    class46.field1246 = class30.field910;
                }
                class6.field147++;
                class88.field2074 = 0;
            } else {
                class130.method984(24445, -2);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static void method1080(int arg0) {
        field3456 = null;
        field3465 = null;
        field3453 = null;
        field3461 = null;
        field3464 = null;
        if (arg0 >= -2) {
            field3453 = null;
        }
        field3451 = null;
        field3457 = null;
        field3452 = null;
        field3459 = null;
        field3462 = null;
        field3463 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Z")
    public static final boolean method1081(int arg0, int arg1) {
        field3458++;
        if (arg1 != 355945055) {
            method1080(-99);
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
    public static final int method1082(int arg0, int arg1, int arg2) {
        field3454++;
        if (arg0 < 2) {
            if (arg1 != 6378) {
                method1081(63, 7);
            }
            return arg0 == 1 ? arg2 : 1;
        }
        int var3 = method1082(arg0 >> 1, 6378, arg2 * arg2);
        if ((arg0 & 0x1) != 0) {
            var3 = arg2 * var3;
        }
        return var3;
    }
}
