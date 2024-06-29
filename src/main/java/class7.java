import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 {

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[J")
    public static long[] field81 = new long[32];

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field80 = 0;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field89 = -1;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field88 = new String[500];

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "Ljava/lang/String;")
    public static String field92 = "glow2:";

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "[C")
    public static char[] field91 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lsk;")
    public static class112 field79;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "[I")
    public static int[] field90;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "[Ld;")
    public static class238[] field87;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static final void method50(int arg0) {
        field85++;
        if (class85.field1352 == 0 || class85.field1352 == 5) {
            return;
        }
        try {
            if (++class179.field2823 > 2000) {
                if (class5.field69 != null) {
                    class5.field69.method7((byte) 18);
                    class5.field69 = null;
                }
                if (class111.field1838 >= 1) {
                    class85.field1352 = 0;
                    class33.field515 = -5;
                    return;
                }
                class111.field1838++;
                class85.field1352 = 1;
                if (class99.field1628 == class245.field3922) {
                    class245.field3922 = class271.field4276;
                } else {
                    class245.field3922 = class99.field1628;
                }
                class179.field2823 = 0;
            }
            if (class85.field1352 == 1) {
                class16.field282 = class105.field1684.method1135(52, class200.field3195, class245.field3922);
                class85.field1352 = 2;
            }
            if (class85.field1352 == 2) {
                if (class16.field282.field2589 == 2) {
                    throw new IOException();
                }
                if (class16.field282.field2589 != 1) {
                    return;
                }
                class5.field69 = new class1((Socket) class16.field282.field2594, class105.field1684);
                class16.field282 = null;
                long var1 = class53.field919 = class74.method522((byte) -120, class219.field3581);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class68.field1113.field3655 = 0;
                class68.field1113.method1548(-494964184, 14);
                class68.field1113.method1548(-494964184, var3);
                class5.field69.method2(0, class68.field1113.field3653, -123, 2);
                if (class74.field1203 != null) {
                    class74.field1203.method1191(2);
                }
                if (class13.field243 != null) {
                    class13.field243.method1191(2);
                }
                int var4 = class5.field69.method9(17335);
                if (class74.field1203 != null) {
                    class74.field1203.method1191(2);
                }
                if (class13.field243 != null) {
                    class13.field243.method1191(2);
                }
                if (var4 != 0) {
                    class33.field515 = var4;
                    class85.field1352 = 0;
                    class5.field69.method7((byte) 18);
                    class5.field69 = null;
                    return;
                }
                class85.field1352 = 3;
            }
            if (class85.field1352 == 3) {
                if (class5.field69.method6(6) < 8) {
                    return;
                }
                class5.field69.method4(8, (byte) -70, 0, class67.field1103.field3653);
                int[] var5 = new int[4];
                class67.field1103.field3655 = 0;
                class200.field3191 = class67.field1103.method1507(arg0 ^ 0xFFFFFFC7);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class200.field3191 >> 32);
                class68.field1113.field3655 = 0;
                var5[3] = (int) class200.field3191;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class68.field1113.method1548(-494964184, 10);
                class68.field1113.method1529((byte) 118, var5[0]);
                class68.field1113.method1529((byte) 125, var5[1]);
                class68.field1113.method1529((byte) 123, var5[2]);
                class68.field1113.method1529((byte) 121, var5[3]);
                class68.field1113.method1502((byte) 106, class74.method522((byte) -76, class219.field3581));
                class68.field1113.method1563(class263.field4207, 66);
                class68.field1113.method1530(class247.field3950, arg0 - 1, class60.field984);
                class167.field2647.field3655 = 0;
                if (class273.field4336 == 40) {
                    class167.field2647.method1548(-494964184, 18);
                } else {
                    class167.field2647.method1548(-494964184, 16);
                }
                class167.field2647.method1554(class68.field1113.field3655 + class193.method1313(arg0 + 23, class238.field3868) + 159, (byte) 89);
                class167.field2647.method1529((byte) 120, 533);
                class167.field2647.method1548(-494964184, class285.field4513);
                class167.field2647.method1548(-494964184, class60.field993 ? 1 : 0);
                class167.field2647.method1548(-494964184, 0);
                class167.field2647.method1548(-494964184, class259.method1764(0));
                class167.field2647.method1554(class84.field1326, (byte) 89);
                class167.field2647.method1554(class279.field4423, (byte) 89);
                class167.field2647.method1548(-494964184, class64.field1073);
                class161.method1120((byte) 92, class167.field2647);
                class167.field2647.method1563(class238.field3868, arg0 + 85);
                class167.field2647.method1529((byte) 124, class54.field926);
                class167.field2647.method1529((byte) 124, class211.method1457(0));
                class221.field3679 = true;
                class167.field2647.method1554(class113.field1876, (byte) 89);
                class167.field2647.method1529((byte) 126, class280.field4435.method1386(true));
                class167.field2647.method1529((byte) 118, class210.field3433.method1386(true));
                class167.field2647.method1529((byte) 126, class135.field2180.method1386(true));
                class167.field2647.method1529((byte) 119, class115.field1921.method1386(true));
                class167.field2647.method1529((byte) 122, class44.field806.method1386(true));
                class167.field2647.method1529((byte) 126, class122.field1982.method1386(true));
                class167.field2647.method1529((byte) 122, class168.field2665.method1386(true));
                class167.field2647.method1529((byte) 122, class95.field1556.method1386(true));
                class167.field2647.method1529((byte) 124, class222.field3687.method1386(true));
                class167.field2647.method1529((byte) 127, class51.field887.method1386(true));
                class167.field2647.method1529((byte) 122, class230.field3792.method1386(true));
                class167.field2647.method1529((byte) 117, class203.field3251.method1386(true));
                class167.field2647.method1529((byte) 123, class207.field3383.method1386(true));
                class167.field2647.method1529((byte) 117, class256.field4066.method1386(true));
                class167.field2647.method1529((byte) 117, class70.field1157.method1386(true));
                class167.field2647.method1529((byte) 120, class156.field2533.method1386(true));
                class167.field2647.method1529((byte) 121, class168.field2662.method1386(true));
                class167.field2647.method1529((byte) 120, class135.field2228.method1386(true));
                class167.field2647.method1529((byte) 127, class45.field818.method1386(true));
                class167.field2647.method1529((byte) 118, class127.field2054.method1386(true));
                class167.field2647.method1529((byte) 123, class173.field2723.method1386(true));
                class167.field2647.method1529((byte) 120, class262.field4166.method1386(true));
                class167.field2647.method1529((byte) 120, class57.field971.method1386(true));
                class167.field2647.method1529((byte) 120, class29.field462.method1386(true));
                class167.field2647.method1529((byte) 125, class95.field1565.method1386(true));
                class167.field2647.method1529((byte) 125, class87.field1388.method1386(true));
                class167.field2647.method1529((byte) 119, class284.field4481.method1386(true));
                class167.field2647.method1529((byte) 118, class92.field1520.method1386(true));
                class167.field2647.method1537(class68.field1113.field3653, (byte) 20, class68.field1113.field3655, 0);
                class5.field69.method2(0, class167.field2647.field3653, -109, class167.field2647.field3655);
                class68.field1113.method535(var5, (byte) -118);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class67.field1103.method535(var5, (byte) -124);
                class85.field1352 = 4;
            }
            if (arg0 != 1) {
                field87 = null;
            }
            if (class85.field1352 == 4) {
                if (class5.field69.method6(-121) < 1) {
                    return;
                }
                int var7 = class5.field69.method9(17335);
                if (var7 == 21) {
                    class85.field1352 = 7;
                } else if (var7 == 29) {
                    class85.field1352 = 10;
                } else if (var7 == 1) {
                    class85.field1352 = 5;
                    class33.field515 = var7;
                    return;
                } else if (var7 == 2) {
                    class85.field1352 = 8;
                } else if (var7 == 15) {
                    class85.field1352 = 0;
                    class33.field515 = var7;
                    return;
                } else if (var7 == 23 && class111.field1838 < 1) {
                    class85.field1352 = 1;
                    class111.field1838++;
                    class179.field2823 = 0;
                    class5.field69.method7((byte) 18);
                    class5.field69 = null;
                    return;
                } else {
                    class33.field515 = var7;
                    class85.field1352 = 0;
                    class5.field69.method7((byte) 18);
                    class5.field69 = null;
                    return;
                }
            }
            if (class85.field1352 == 6) {
                class68.field1113.field3655 = 0;
                class68.field1113.method534((byte) 35, 17);
                class5.field69.method2(0, class68.field1113.field3653, -116, class68.field1113.field3655);
                class85.field1352 = 4;
            } else if (class85.field1352 == 7) {
                if (class5.field69.method6(26) >= 1) {
                    client.field2521 = (class5.field69.method9(17335) + 3) * 60;
                    class33.field515 = 21;
                    class85.field1352 = 0;
                    class5.field69.method7((byte) 18);
                    class5.field69 = null;
                }
            } else if (class85.field1352 != 10) {
                if (class85.field1352 == 8) {
                    if (class5.field69.method6(91) < 14) {
                        return;
                    }
                    class5.field69.method4(14, (byte) 92, 0, class67.field1103.field3653);
                    class67.field1103.field3655 = 0;
                    class144.field2313 = class67.field1103.method1517((byte) -96);
                    class229.field3783 = class67.field1103.method1517((byte) -96);
                    class215.field3516 = class67.field1103.method1517((byte) -96) == 1;
                    class74.field1201 = class67.field1103.method1517((byte) -96) == 1;
                    class92.field1519 = class67.field1103.method1517((byte) -96) == 1;
                    class9.field134 = class67.field1103.method1517((byte) -96) == 1;
                    class143.field2309 = class67.field1103.method1517((byte) -96) == 1;
                    class233.field3811 = class67.field1103.method1521((byte) 113);
                    class95.field1560 = class67.field1103.method1517((byte) -96) == 1;
                    class1.field31 = class67.field1103.method1517((byte) -96) == 1;
                    class195.method1328(-80, class1.field31);
                    class101.method743(-337312853, class1.field31);
                    if (!class60.field993) {
                        if ((!class215.field3516 || class92.field1519) && !class95.field1560) {
                            try {
                                class160.method1116("unzap", class105.field1684.field2620, (byte) -25);
                            } catch (Throwable var8) {
                            }
                        } else {
                            try {
                                class160.method1116("zap", class105.field1684.field2620, (byte) 69);
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    class121.field1973 = class67.field1103.method538(arg0 + 254);
                    class115.field1912 = class67.field1103.method1521((byte) 113);
                    class85.field1352 = 9;
                }
                if (class85.field1352 == 9 && class5.field69.method6(-125) >= class115.field1912) {
                    class67.field1103.field3655 = 0;
                    class5.field69.method4(class115.field1912, (byte) 53, 0, class67.field1103.field3653);
                    class33.field515 = 2;
                    class85.field1352 = 0;
                    class193.method1316(true);
                    class73.field1196 = -1;
                    class87.method634(false, arg0 ^ 0x46D0);
                    class121.field1973 = -1;
                }
            } else if (class5.field69.method6(arg0 ^ 0xD) >= 1) {
                class212.field3456 = class5.field69.method9(17335);
                class33.field515 = 29;
                class85.field1352 = 0;
                class5.field69.method7((byte) 18);
                class5.field69 = null;
            }
        } catch (IOException var10) {
            if (class5.field69 != null) {
                class5.field69.method7((byte) 18);
                class5.field69 = null;
            }
            if (class111.field1838 >= 1) {
                class85.field1352 = 0;
                class33.field515 = -4;
            } else {
                class111.field1838++;
                if (class99.field1628 == class245.field3922) {
                    class245.field3922 = class271.field4276;
                } else {
                    class245.field3922 = class99.field1628;
                }
                class85.field1352 = 1;
                class179.field2823 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILf;)Z")
    public static final boolean method51(int arg0, class36 arg1) {
        field84++;
        if (arg1.field570 == 205) {
            class176.field2780 = 250;
            return true;
        } else {
            return arg0 != 887;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
    public static final void method52(int arg0, int arg1, int arg2) {
        class68.field1113.method534((byte) 81, 131);
        if (arg2 != -28346) {
            field79 = null;
        }
        class157.field2542++;
        field82++;
        class68.field1113.method1547(arg1, (byte) 58);
        class68.field1113.method1504((byte) -117, arg0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZIIILbl;)V")
    public static final void method53(boolean arg0, int arg1, int arg2, int arg3, class33 arg4) {
        field83++;
        if (class167.field2655 == arg4 || class205.field3291 >= 400) {
            return;
        }
        String var11;
        if (arg4.field518 == 0) {
            boolean var5 = true;
            if (class167.field2655.field517 != -1 && arg4.field517 != -1) {
                int var6 = class167.field2655.field519 <= arg4.field519 ? arg4.field519 : class167.field2655.field519;
                int var7 = arg4.field517 <= class167.field2655.field517 ? arg4.field517 : class167.field2655.field517;
                int var8 = var6 * 10 / 100 + var7 + 5;
                int var9 = class167.field2655.field519 - arg4.field519;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            String var10 = class111.field1837 == 1 ? class13.field239 : class48.field861;
            if (arg4.field519 >= arg4.field509) {
                var11 = arg4.method284(0) + (var5 ? class30.method255(8, class167.field2655.field519, arg4.field519) : "<col=ffffff>") + " (" + var10 + arg4.field519 + ")";
            } else {
                var11 = arg4.method284(0) + (var5 ? class30.method255(8, class167.field2655.field519, arg4.field519) : "<col=ffffff>") + " (" + var10 + arg4.field519 + "+" + (arg4.field509 - arg4.field519) + ")";
            }
        } else {
            var11 = arg4.method284(0) + " (" + class119.field1954 + arg4.field518 + ")";
        }
        if (class51.field894 == 1) {
            class40.method348(arg3, (long) arg1, (short) 51, class200.field3193, arg2, class89.field1414, class197.field3152 + " -> <col=ffffff>" + var11, !arg0);
            class96.field1567++;
        } else if (!class288.field4560) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class220.field3609[var12] != null) {
                    class156.field2535++;
                    boolean var13 = false;
                    short var14 = 0;
                    if (class111.field1837 == 0 && class220.field3609[var12].equalsIgnoreCase(class78.field1247)) {
                        if (arg4.field519 > class167.field2655.field519) {
                            var14 = 2000;
                        }
                        if (class167.field2655.field505 != 0 && arg4.field505 != 0) {
                            if (class167.field2655.field505 == arg4.field505) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class103.field1674[var12]) {
                        var14 = 2000;
                    }
                    short var15 = class28.field440[var12];
                    short var16 = (short) (var14 + var15);
                    class40.method348(arg3, (long) arg1, var16, class220.field3609[var12], arg2, class32.field497[var12], "<col=ffffff>" + var11, true);
                }
            }
        } else if ((class212.field3473 & 0x8) != 0) {
            class107.field1707++;
            class40.method348(arg3, (long) arg1, (short) 28, class154.field2496, arg2, class138.field2268, class149.field2403 + " -> <col=ffffff>" + var11, !arg0);
        }
        if (arg0) {
            method50(18);
        }
        for (int var17 = 0; var17 < class205.field3291; var17++) {
            if (class279.field4427[var17] == 50) {
                class113.field1893[var17] = "<col=ffffff>" + var11;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method54(int arg0) {
        field81 = null;
        field87 = null;
        field79 = null;
        field88 = null;
        if (arg0 != 4178) {
            field81 = null;
        }
        field90 = null;
        field91 = null;
        field92 = null;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public static final void method55(int arg0) {
        class54.field929++;
        field86++;
        class68.field1113.method534((byte) 95, arg0);
        class68.field1113.method1554(class113.field1876, (byte) 89);
    }
}
