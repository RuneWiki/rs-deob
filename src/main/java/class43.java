import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class43 {

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "[Lca;")
    public static class14[] field851 = new class14[50];

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[I")
    public static int[] field847 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field852 = 0;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Llc;")
    public static class69 field859 = class69.method470((byte) -105, "Imported music");

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Llc;")
    public static class69 field845 = class69.method470((byte) -97, "::errortest");

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "[[[B")
    public static byte[][][] field856 = new byte[4][104][104];

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Llc;")
    public static class69 field861 = class69.method470((byte) -101, "Report abuse");

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field857 = 0;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Llc;")
    public static class69 field860 = class69.method470((byte) -111, " ");

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Llc;")
    public static class69 field862 = class69.method470((byte) -98, "(U(Y");

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Z")
    public static boolean field858;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
    public static int[] field850;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
    public static final int method251(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            return 70;
        }
        field854++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 127) {
                arg2 = 127;
            }
            return 127 - arg2;
        } else {
            int var4 = (arg1 & 0x7F) * arg2 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg1 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class13 var10 = null;
        int var11 = -35 / ((arg8 - 15) / 58);
        field848++;
        for (class13 var12 = (class13) class75.field1689.method580((byte) -92); var12 != null; var12 = (class13) class75.field1689.method576((byte) 74)) {
            if (var12.field243 == arg2 && var12.field242 == arg4 && var12.field250 == arg3 && var12.field256 == arg7) {
                var10 = var12;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class13();
            var10.field243 = arg2;
            var10.field256 = arg7;
            var10.field242 = arg4;
            var10.field250 = arg3;
            class77.method551(var10, -82);
            class75.field1689.method577(var10, -108);
        }
        var10.field245 = arg1;
        var10.field260 = arg0;
        var10.field246 = arg9;
        var10.field241 = arg6;
        var10.field247 = arg5;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lib;Z)V")
    public static final void method253(class50 arg0, boolean arg1) {
        if (arg0.field1039 == 0) {
            arg0.field1080 = 1024;
        }
        field849++;
        if (arg0.field1039 == 1) {
            arg0.field1080 = 1536;
        }
        int var2 = arg0.field1075 - class62.field1282;
        if (!arg1) {
            method255(null, (byte) -33);
        }
        if (arg0.field1039 == 2) {
            arg0.field1080 = 0;
        }
        int var3 = arg0.field1046 * 128 + arg0.field1042 * 64;
        arg0.field1035 = 0;
        if (arg0.field1039 == 3) {
            arg0.field1080 = 512;
        }
        int var4 = arg0.field1096 * 128 + arg0.field1042 * 64;
        arg0.field1065 += (var4 - arg0.field1065) / var2;
        arg0.field1058 += (var3 - arg0.field1058) / var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method254(byte arg0) {
        field851 = null;
        field861 = null;
        field860 = null;
        field856 = null;
        field850 = null;
        field859 = null;
        if (arg0 != 41) {
            field850 = null;
        }
        field847 = null;
        field862 = null;
        field845 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lbb;B)Z")
    public static final boolean method255(class9 arg0, byte arg1) {
        field846++;
        int var2 = arg0.field186;
        if (class22.field459 == 2) {
            if (var2 == 201) {
                class62.field1277 = 0;
                class2.field9 = true;
                class35.field709 = true;
                class49.field1015 = class49.field992;
                class57.field1194 = 1;
                class49.field1007 = class24.field492;
            }
            if (var2 == 202) {
                class49.field1015 = class49.field992;
                class57.field1194 = 2;
                class2.field9 = true;
                class49.field1007 = class19.field429;
                class35.field709 = true;
                class62.field1277 = 0;
            }
        }
        int var3 = 6 % ((-arg1 - 36) / 58);
        if (var2 == 205) {
            class50.field1094 = 250;
            return true;
        }
        if (var2 == 501) {
            class2.field9 = true;
            class62.field1277 = 0;
            class35.field709 = true;
            class49.field1007 = class55.field1168;
            class57.field1194 = 4;
            class49.field1015 = class49.field992;
        }
        if (var2 == 502) {
            class49.field1007 = class49.field1001;
            class57.field1194 = 5;
            class35.field709 = true;
            class49.field1015 = class49.field992;
            class2.field9 = true;
            class62.field1277 = 0;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var4 = (var2 - 300) / 2;
            int var5 = var2 & 0x1;
            class94.field2113.method29(true, var4, var5 == 1);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var6 = (var2 - 314) / 2;
            int var7 = var2 & 0x1;
            class94.field2113.method19(var7 == 1, var6, 72);
        }
        if (var2 == 324) {
            class94.field2113.method25(-53, false);
        }
        if (var2 == 325) {
            class94.field2113.method25(-98, true);
        }
        if (var2 == 326) {
            class26.field557.method178(-5, 12);
            class6.field112++;
            class94.field2113.method23(class26.field557, false);
            return true;
        }
        if (var2 == 620) {
            class91.field1974 = !class91.field1974;
        }
        if (var2 >= 601 && var2 <= 613) {
            class96.method731(-1);
            if (class49.field1013.method487((byte) -107) > 0) {
                class26.field557.method178(-5, 72);
                class26.field557.method664(class49.field1013.method465(1), 118);
                class26.field557.method675((byte) -73, var2 - 601);
                class26.field557.method675((byte) -113, class91.field1974 ? 1 : 0);
                class87.field1915++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILbb;)V")
    public static final void method256(int arg0, class9 arg1) {
        int var2 = arg1.field186;
        field855++;
        if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
            if (var2 == 1 && class22.field459 == 0) {
                arg1.field137 = class70.field1552;
                arg1.field154 = 0;
            } else if (var2 == 1 && class22.field459 == 1) {
                arg1.field154 = 0;
                arg1.field137 = class73.field1633;
            } else if (var2 == 2 && class22.field459 != 2) {
                arg1.field137 = class67.field1393;
                arg1.field154 = 0;
            } else {
                int var3 = field852;
                if (class22.field459 != 2) {
                    var3 = 0;
                }
                if (var2 <= 700) {
                    var2--;
                } else {
                    var2 -= 601;
                }
                if (var3 <= var2) {
                    arg1.field154 = 0;
                    arg1.field137 = class49.field992;
                } else {
                    arg1.field137 = class64.field1356[var2];
                    arg1.field154 = 1;
                }
            }
        } else if (var2 >= 101 && var2 <= 200 || !(var2 < 801 || var2 > 900)) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = field852;
            if (class22.field459 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg1.field137 = class49.field992;
                arg1.field154 = 0;
            } else {
                if (class51.field1122[var2] == 0) {
                    arg1.field137 = class35.field697;
                } else if (class51.field1122[var2] < 5000) {
                    if (class51.field1122[var2] == class2.field12) {
                        arg1.field137 = class46.method305(20025, new class69[] { class23.field484, class106.method791(class51.field1122[var2], (byte) -64) });
                    } else {
                        arg1.field137 = class46.method305(20025, new class69[] { class23.field483, class106.method791(class51.field1122[var2], (byte) -64) });
                    }
                } else if (class51.field1122[var2] == class2.field12) {
                    arg1.field137 = class46.method305(20025, new class69[] { class78.field1768, class106.method791(class51.field1122[var2] - 5000, (byte) -116) });
                } else {
                    arg1.field137 = class46.method305(arg0 ^ 0xFFFFB1C6, new class69[] { class40.field790, class106.method791(class51.field1122[var2] - 5000, (byte) -52) });
                }
                arg1.field154 = 1;
            }
        } else if (var2 == 203) {
            int var5 = field852;
            if (class22.field459 != 2) {
                var5 = 0;
            }
            arg1.field178 = var5 * 15 + 20;
            if (arg1.field178 <= arg1.field140) {
                arg1.field178 = arg1.field140 + 1;
            }
        } else if (arg0 == -1) {
            if (var2 >= 401 && var2 <= 500) {
                var2 -= 401;
                if (var2 == 0 && class22.field459 == 0) {
                    arg1.field154 = 0;
                    arg1.field137 = class96.field2121;
                } else if (var2 == 1 && class22.field459 == 0) {
                    arg1.field137 = class67.field1393;
                    arg1.field154 = 0;
                } else {
                    int var6 = class104.field2271;
                    if (class22.field459 == 0) {
                        var6 = 0;
                    }
                    if (var2 >= var6) {
                        arg1.field154 = 0;
                        arg1.field137 = class49.field992;
                    } else {
                        arg1.field137 = class49.method322(arg0 ^ 0xFFFFFF85, class22.field470[var2]).method460(false);
                        arg1.field154 = 1;
                    }
                }
            } else if (var2 == 503) {
                arg1.field178 = class104.field2271 * 15 + 20;
                if (arg1.field140 >= arg1.field178) {
                    arg1.field178 = arg1.field140 + 1;
                }
            } else if (var2 == 327) {
                arg1.field122 = 150;
                arg1.field175 = (int) (Math.sin((double) class62.field1282 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field172 = 0;
                arg1.field146 = 5;
            } else if (var2 == 324) {
                if (class51.field1130 == -1) {
                    class83.field1873 = arg1.field159;
                    class51.field1130 = arg1.field118;
                }
                if (class94.field2113.field82) {
                    arg1.field118 = class51.field1130;
                } else {
                    arg1.field118 = class83.field1873;
                }
            } else if (var2 == 325) {
                if (class51.field1130 == -1) {
                    class83.field1873 = arg1.field159;
                    class51.field1130 = arg1.field118;
                }
                if (class94.field2113.field82) {
                    arg1.field118 = class83.field1873;
                } else {
                    arg1.field118 = class51.field1130;
                }
            } else if (var2 == 600) {
                arg1.field137 = class49.field1013;
                if (class62.field1282 % 20 < 10) {
                    arg1.field137 = arg1.field137.method469(124, (byte) -100);
                } else {
                    arg1.field137 = arg1.field137.method469(32, (byte) -127);
                }
            } else {
                if (var2 == 620) {
                    if (class80.field1828 < 1) {
                        arg1.field137 = class49.field992;
                    } else if (class91.field1974) {
                        arg1.field137 = class36.field721;
                        arg1.field181 = 16711680;
                    } else {
                        arg1.field181 = 16777215;
                        arg1.field137 = class60.field1242;
                    }
                }
                if (var2 == 660) {
                    int var7 = class50.field1084 - class10.field218;
                    class69 var8;
                    if (var7 <= 0) {
                        var8 = class128.field2751;
                    } else if (var7 == 1) {
                        var8 = class19.field431;
                    } else {
                        var8 = class46.method305(20025, new class69[] { class106.method791(var7, (byte) -73), class110.field2419 });
                    }
                    class69 var9 = class49.field992;
                    if (class90.field1949 != null) {
                        var9 = class25.method166(255, class90.field1949.field2508);
                        try {
                            if (class90.field1949.field2505 != null) {
                                byte[] var10 = ((String) class90.field1949.field2505).getBytes("ISO-8859-1");
                                var9 = class62.method375(var10.length, 0, var10, 0);
                            }
                        } catch (UnsupportedEncodingException var14) {
                        }
                    }
                    arg1.field137 = class46.method305(20025, new class69[] { class17.field329, var8, class82.field1857, var9 });
                }
                if (var2 == 661) {
                    if (class115.field2500 == 0) {
                        arg1.field137 = client.field391;
                    } else if (class50.field1084 < class115.field2500) {
                        int var11 = class50.field1084 + 14 - class115.field2500;
                        class69 var12;
                        if (var11 <= 0) {
                            var12 = class103.field2239;
                        } else if (var11 == 1) {
                            var12 = class75.field1680;
                        } else {
                            var12 = class46.method305(20025, new class69[] { class106.method791(var11, (byte) -124), class110.field2419 });
                        }
                        arg1.field137 = class46.method305(arg0 + 20026, new class69[] { var12, class70.field1566, class76.method540(arg0 ^ 0xFFFFE5A5, class115.field2500), class39.field772 });
                    } else {
                        arg1.field137 = class46.method305(20025, new class69[] { class93.field2045, class76.method540(6746, class115.field2500) });
                    }
                }
                if (var2 == 662) {
                    class69 var13;
                    if (class63.field1293 == 0) {
                        var13 = class114.field2484;
                    } else if (class63.field1293 == 1) {
                        var13 = class30.field622;
                    } else {
                        var13 = class46.method305(20025, new class69[] { class98.field2157, class106.method791(class63.field1293, (byte) -111), class19.field412 });
                    }
                    arg1.field137 = class46.method305(20025, new class69[] { class24.field499, var13, class93.field2030 });
                }
                if (var2 == 663) {
                    if (class29.field608 > 0 && class50.field1084 + 10 >= class29.field608) {
                        arg1.field137 = class46.method305(20025, new class69[] { class112.field2447, class76.method540(arg0 + 6747, class29.field608) });
                    } else {
                        arg1.field137 = class9.field187;
                    }
                }
                if (var2 == 664) {
                    if (class122.field2653 == 0) {
                        arg1.field137 = class67.field1406;
                    }
                    if (class122.field2653 == 1) {
                        arg1.field137 = class46.method305(20025, new class69[] { class83.field1874, class76.method540(6746, class121.field2615) });
                    }
                    if (class122.field2653 == 2) {
                        arg1.field137 = class119.field2556;
                    }
                }
                if (var2 == 665) {
                    if (class39.field771 > 2 && !class75.field1685) {
                        arg1.field137 = class64.field1343;
                    } else if (class39.field771 > 2) {
                        arg1.field137 = class46.method305(20025, new class69[] { class81.field1837, class106.method791(class39.field771, (byte) -77), class60.field1241 });
                    } else if (class39.field771 <= 0) {
                        arg1.field137 = class77.field1736;
                    } else {
                        arg1.field137 = class46.method305(arg0 ^ 0xFFFFB1C6, new class69[] { class96.field2126, class106.method791(class39.field771, (byte) -115), class29.field601 });
                    }
                }
                if (var2 == 667) {
                    if (class39.field771 > 2 && !class75.field1685) {
                        arg1.field137 = class13.field262;
                    } else if (class39.field771 > 0) {
                        arg1.field137 = class47.field990;
                    } else {
                        arg1.field137 = class19.field425;
                    }
                }
                if (var2 == 668) {
                    if (class115.field2500 > class50.field1084) {
                        arg1.field137 = class69.field1539;
                    } else {
                        arg1.field137 = class114.field2482;
                    }
                }
            }
        }
    }
}
