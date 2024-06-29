import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class134 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field1947 = 0;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1951 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Z")
    public static boolean field1949 = false;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZIIILlj;IBII)V")
    public static final void method908(boolean arg0, int arg1, int arg2, int arg3, class25 arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (arg6 <= 91) {
            return;
        }
        if (arg7 >= 0 && arg7 < 104 && arg3 >= 0 && arg3 < 104) {
            if (!arg0) {
                class35.field449[arg2][arg7][arg3] = 0;
            }
            while (true) {
                int var9 = arg4.method201(255);
                if (var9 == 0) {
                    if (arg0) {
                        class200.field3128[0][arg7][arg3] = class198.field3108[0][arg7][arg3];
                    } else if (arg2 == 0) {
                        class200.field3128[0][arg7][arg3] = -class74.method505(arg1 + arg7 + 932731, arg3 + arg5 + 556238, -21087) * 8;
                    } else {
                        class200.field3128[arg2][arg7][arg3] = class200.field3128[arg2 - 1][arg7][arg3] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg4.method201(255);
                    if (arg0) {
                        class200.field3128[0][arg7][arg3] = class198.field3108[0][arg7][arg3] + (var10 * 8);
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg2 == 0) {
                            class200.field3128[0][arg7][arg3] = -var10 * 8;
                        } else {
                            class200.field3128[arg2][arg7][arg3] = class200.field3128[arg2 - 1][arg7][arg3] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class110.field1665[arg2][arg7][arg3] = arg4.method188(72);
                    class157.field2427[arg2][arg7][arg3] = (byte) ((var9 - 2) / 4);
                    class185.field2899[arg2][arg7][arg3] = (byte) class224.method1526(3, arg8 + var9 - 2);
                } else if (var9 > 81) {
                    class4.field49[arg2][arg7][arg3] = (byte) (var9 - 81);
                } else if (!arg0) {
                    class35.field449[arg2][arg7][arg3] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg4.method201(255);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg4.method201(255);
                    break;
                }
                if (var11 <= 49) {
                    arg4.method201(255);
                }
            }
        }
        field1948++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIII)V")
    public static final void method909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1952++;
        int var6 = class34.method273(class189.field2984, arg0, false, class110.field1669);
        int var7 = class34.method273(class189.field2984, arg5, false, class110.field1669);
        int var8 = class34.method273(class96.field1484, arg4, false, class51.field710);
        int var9 = class34.method273(class96.field1484, arg1, false, class51.field710);
        if (arg3 == 11121) {
            for (int var10 = var6; var10 <= var7; var10++) {
                class8.method52(var8, class106.field1637[var10], var9, arg2, true);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method910(int arg0) {
        if (arg0 != 27915) {
            field1951 = null;
        }
        field1951 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIZI)V")
    public static final void method911(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class64.field900++;
        class122.method796(-94);
        if (arg4) {
            class22.method152(0, false, 93, false);
        } else {
            class148.method989((byte) 102, 0);
            class22.method152(0, true, 122, false);
            if (class129.field1887 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class22.method152(var7, false, arg3 ^ 0x14, false);
                    class22.method152(var7, false, 100, true);
                    class148.method989((byte) 92, var7);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class148.method989((byte) 119, var6);
                    class22.method152(var6, false, 108, false);
                    class22.method152(var6, false, 104, true);
                }
            }
        }
        if (!arg4) {
            class151.method1004((byte) -112);
        }
        field1953++;
        class58.method418((byte) -108);
        if (class278.field4414 == 1) {
            int var8 = class39.field530;
            int var9 = class72.field1026 + class29.field392 & 0x7FF;
            if (class231.field3719 / 256 > var8) {
                var8 = class231.field3719 / 256;
            }
            if (class139.field2048[4] && var8 < class11.field150[4] + 128) {
                var8 = class11.field150[4] + 128;
            }
            class53.method387(class99.method658(class149.field2227.field1273, class276.field4398, class149.field2227.field1226, -7185) - 50, arg5, class250.field4000, var8, (var8 * 3) + 600, var9, 50, class269.field4288);
        }
        int var10 = class66.field918;
        int var11 = class96.field1487;
        int var12 = class215.field3516;
        int var13 = class54.field750;
        int var14 = class77.field1092;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class139.field2048[var15]) {
                int var21 = (int) ((double) (class35.field452[var15] * 2 + 1) * Math.random() + Math.sin((double) class153.field2273[var15] / 100.0D * (double) class91.field1394[var15]) * (double) class11.field150[var15] - (double) class35.field452[var15]);
                if (var15 == 2) {
                    class54.field750 += var21;
                }
                if (var15 == 3) {
                    class77.field1092 = class77.field1092 + var21 & 0x7FF;
                }
                if (var15 == 1) {
                    class96.field1487 += var21;
                }
                if (var15 == 0) {
                    class66.field918 += var21;
                }
                if (var15 == 4) {
                    class215.field3516 += var21;
                    if (class215.field3516 < 128) {
                        class215.field3516 = 128;
                    }
                    if (class215.field3516 > 383) {
                        class215.field3516 = 383;
                    }
                }
            }
        }
        class23.method159(false);
        class127.method861(arg1, arg2, arg0 + arg1, arg2 + arg5);
        if (arg3 != 104) {
            field1951 = null;
        }
        class171.method1209();
        if (class286.field4542 || class106.field1634 < arg1 || class106.field1634 >= arg0 + arg1 || class236.field3780 < arg2 || arg2 + arg5 <= class236.field3780) {
            class104.field1606 = 0;
            class225.field3646 = false;
        } else {
            int var16 = class80.field1161;
            class225.field3646 = true;
            int var17 = class181.field2873;
            int var18 = class189.field2982;
            class104.field1606 = 0;
            class38.field523 = (var17 - var16) * (class106.field1634 - arg1) / arg0 + var16;
            int var19 = class242.field3876;
            class68.field949 = (class236.field3780 - arg2) * (var19 - var18) / arg5 + var18;
        }
        class10.method63(13371);
        byte var20 = class70.method476(true) == 2 ? (byte) class64.field900 : 1;
        class127.method876(arg1, arg2, arg0, arg5, 0);
        class278.method1865(class66.field918, class96.field1487, class54.field750, class215.field3516, class77.field1092, class66.field929, class247.field3952, class141.field2070, class121.field1765, class28.field390, class10.field141, class276.field4398 + 1, var20, class149.field2227.field1226 >> 7, class149.field2227.field1273 >> 7);
        class10.method63(13371);
        client.method1042();
        class173.method1219(256, arg0, 256, arg5, 10, arg1, arg2);
        class77.method519(arg5, 256, arg2, arg0, arg1, -113, 256);
        ((class144) class171.field2689).method962(class80.field1166, -61);
        class47.method357(arg0, arg5, 24651, arg1, arg2);
        class54.field750 = var13;
        class215.field3516 = var12;
        class66.field918 = var10;
        class77.field1092 = var14;
        class96.field1487 = var11;
        if (class40.field550 && class68.field958.method1544(13270) == 0) {
            class40.field550 = false;
        }
        if (class40.field550) {
            class127.method876(arg1, arg2, arg0, arg5, 0);
            class34.method272((byte) 43, class165.field2559, false);
        }
        if (!arg4 && !class40.field550 && !class286.field4542 && arg1 <= class106.field1634 && class106.field1634 < arg0 + arg1 && arg2 <= class236.field3780 && arg2 + arg5 > class236.field3780) {
            class286.method1910(class106.field1634, 23757, class236.field3780, arg0, arg1, arg2, arg5);
        }
    }
}
