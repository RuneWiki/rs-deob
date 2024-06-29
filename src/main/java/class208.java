import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class208 {

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public int field3338;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public int field3341;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3342 = "flash1:";

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3345 = 0;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[Lub;")
    public static class169[] field3347 = new class169[14];

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3340 = 0;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "D")
    public static double field3343 = -1.0D;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3351 = 0;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient;")
    public static client field3344;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[S")
    public static short[] field3346;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static final void method1390(int arg0) {
        field3349++;
        if (class256.field4081 == 0 || class256.field4081 == 5) {
            return;
        }
        try {
            if ((++class224.field3576) > 2000) {
                if (class23.field360 != null) {
                    class23.field360.method294((byte) 110);
                    class23.field360 = null;
                }
                if (class48.field880 >= 1) {
                    class106.field1615 = -5;
                    class256.field4081 = 0;
                    return;
                }
                class48.field880++;
                class256.field4081 = 1;
                if (class194.field3176 == class113.field1741) {
                    class194.field3176 = class236.field3735;
                } else {
                    class194.field3176 = class113.field1741;
                }
                class224.field3576 = 0;
            }
            if (class256.field4081 == 1) {
                class239.field3767 = class205.field3294.method637(class130.field2153, class194.field3176, (byte) -119);
                class256.field4081 = 2;
            }
            if (class256.field4081 == 2) {
                if (class239.field3767.field1937 == 2) {
                    throw new IOException();
                }
                if (class239.field3767.field1937 != 1) {
                    return;
                }
                class23.field360 = new class35((Socket) class239.field3767.field1936, class205.field3294);
                class239.field3767 = null;
                long var1 = class12.field162 = class260.method1739(false, class160.field2617);
                class87.field1405.field2231 = 0;
                class87.field1405.method966((byte) 69, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class87.field1405.method966((byte) 122, var3);
                class23.field360.method301(2, 0, class87.field1405.field2263, (byte) 122);
                if (class165.field2709 != null) {
                    class165.field2709.method1600(-3624);
                }
                if (class212.field3396 != null) {
                    class212.field3396.method1600(-3624);
                }
                int var4 = class23.field360.method295(-8922);
                if (class165.field2709 != null) {
                    class165.field2709.method1600(arg0 - 3613);
                }
                if (class212.field3396 != null) {
                    class212.field3396.method1600(-3624);
                }
                if (var4 != 0) {
                    class106.field1615 = var4;
                    class256.field4081 = 0;
                    class23.field360.method294((byte) -25);
                    class23.field360 = null;
                    return;
                }
                class256.field4081 = 3;
            }
            if (class256.field4081 == 3) {
                if (class23.field360.method296(104) < 8) {
                    return;
                }
                class23.field360.method303(arg0 + 10, 8, class143.field2360.field2263, 0);
                int[] var5 = new int[4];
                class143.field2360.field2231 = 0;
                class129.field2136 = class143.field2360.method983(29834);
                var5[2] = (int) (class129.field2136 >> 32);
                var5[3] = (int) class129.field2136;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class87.field1405.field2231 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class87.field1405.method966((byte) 114, 10);
                class87.field1405.method1029(var5[0], 15430);
                class87.field1405.method1029(var5[1], arg0 ^ 0xFFFFC3B3);
                class87.field1405.method1029(var5[2], 15430);
                class87.field1405.method1029(var5[3], 15430);
                class87.field1405.method967((byte) -8, class260.method1739(false, class160.field2617));
                class87.field1405.method1028(arg0 ^ 0xFFFFC6D3, class58.field1003);
                class87.field1405.method985(class145.field2387, (byte) -88, class189.field3103);
                class274.field4376.field2231 = 0;
                if (class146.field2401 == 40) {
                    class274.field4376.method966((byte) 92, 18);
                } else {
                    class274.field4376.method966((byte) 79, 16);
                }
                class274.field4376.method971(3792, class87.field1405.field2231 + class65.method499(arg0 + 101, class241.field3801) + 163);
                class274.field4376.method1029(538, 15430);
                class274.field4376.method966((byte) 123, class155.field2534);
                class274.field4376.method966((byte) 108, class47.field869 ? 1 : 0);
                class274.field4376.method966((byte) 92, 0);
                class274.field4376.method966((byte) 104, class218.method1447(arg0 ^ 0x2DE2E9B2));
                class274.field4376.method971(3792, class137.field2301);
                class274.field4376.method971(3792, class33.field557);
                class274.field4376.method966((byte) 124, class163.field2643);
                class55.method445(class274.field4376, 24);
                class274.field4376.method1028(14630, class241.field3801);
                class274.field4376.method1029(class252.field4019, 15430);
                class274.field4376.method1029(class296.method1983((byte) -90), 15430);
                class251.field3994 = true;
                class274.field4376.method971(3792, class167.field2757);
                class274.field4376.method1029(class2.field21.method918((byte) -124), arg0 ^ 0xFFFFC3B3);
                class274.field4376.method1029(class185.field3045.method918((byte) -124), 15430);
                class274.field4376.method1029(class219.field3513.method918((byte) -124), 15430);
                class274.field4376.method1029(class262.field4160.method918((byte) -124), arg0 + 15441);
                class274.field4376.method1029(class205.field3300.method918((byte) -124), 15430);
                class274.field4376.method1029(class91.field1431.method918((byte) -124), 15430);
                class274.field4376.method1029(class10.field134.method918((byte) -124), 15430);
                class274.field4376.method1029(class197.field3219.method918((byte) -124), 15430);
                class274.field4376.method1029(class35.field594.method918((byte) -124), 15430);
                class274.field4376.method1029(class176.field2942.method918((byte) -124), 15430);
                class274.field4376.method1029(class268.field4305.method918((byte) -124), 15430);
                class274.field4376.method1029(class94.field1471.method918((byte) -124), 15430);
                class274.field4376.method1029(class234.field3712.method918((byte) -124), arg0 ^ 0xFFFFC3B3);
                class274.field4376.method1029(class209.field3358.method918((byte) -124), 15430);
                class274.field4376.method1029(class240.field3778.method918((byte) -124), 15430);
                class274.field4376.method1029(class144.field2385.method918((byte) -124), arg0 ^ 0xFFFFC3B3);
                class274.field4376.method1029(class268.field4297.method918((byte) -124), 15430);
                class274.field4376.method1029(class198.field3228.method918((byte) -124), 15430);
                class274.field4376.method1029(class129.field2134.method918((byte) -124), 15430);
                class274.field4376.method1029(class267.field4282.method918((byte) -124), 15430);
                class274.field4376.method1029(class4.field58.method918((byte) -124), 15430);
                class274.field4376.method1029(class285.field4543.method918((byte) -124), 15430);
                class274.field4376.method1029(class131.field2177.method918((byte) -124), 15430);
                class274.field4376.method1029(class184.field3035.method918((byte) -124), 15430);
                class274.field4376.method1029(class252.field4012.method918((byte) -124), 15430);
                class274.field4376.method1029(class116.field1950.method918((byte) -124), 15430);
                class274.field4376.method1029(class92.field1446.method918((byte) -124), 15430);
                class274.field4376.method1029(class134.field2222.method918((byte) -124), arg0 + 15441);
                class274.field4376.method1029(class233.field3699.method918((byte) -124), 15430);
                class274.field4376.method965(0, class87.field1405.field2263, class87.field1405.field2231, arg0 - 88);
                class23.field360.method301(class274.field4376.field2231, 0, class274.field4376.field2263, (byte) -36);
                class87.field1405.method603(9801, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class143.field2360.method603(9801, var5);
                class256.field4081 = 4;
            }
            if (class256.field4081 == 4) {
                if (class23.field360.method296(arg0 ^ 0x21) < 1) {
                    return;
                }
                int var7 = class23.field360.method295(-8922);
                if (var7 == 21) {
                    class256.field4081 = 7;
                } else if (var7 == 29) {
                    class256.field4081 = 10;
                } else if (var7 == 1) {
                    class256.field4081 = 5;
                    class106.field1615 = var7;
                    return;
                } else if (var7 == 2) {
                    class256.field4081 = 8;
                } else if (var7 == 15) {
                    class106.field1615 = var7;
                    class256.field4081 = 0;
                    return;
                } else if (var7 == 23 && class48.field880 < 1) {
                    class224.field3576 = 0;
                    class256.field4081 = 1;
                    class48.field880++;
                    class23.field360.method294((byte) -53);
                    class23.field360 = null;
                    return;
                } else {
                    class256.field4081 = 0;
                    class106.field1615 = var7;
                    class23.field360.method294((byte) 119);
                    class23.field360 = null;
                    return;
                }
            }
            if (class256.field4081 == 6) {
                class87.field1405.field2231 = 0;
                class87.field1405.method607(17, (byte) 71);
                class23.field360.method301(class87.field1405.field2231, 0, class87.field1405.field2263, (byte) -35);
                class256.field4081 = 4;
            } else if (class256.field4081 == 7) {
                if (class23.field360.method296(-50) >= 1) {
                    class217.field3478 = class23.field360.method295(-8922) * 60 + 180;
                    class256.field4081 = 0;
                    class106.field1615 = 21;
                    class23.field360.method294((byte) -45);
                    class23.field360 = null;
                }
            } else if (~class256.field4081 != arg0) {
                if (class256.field4081 == 8) {
                    if (class23.field360.method296(116) < 14) {
                        return;
                    }
                    class23.field360.method303(-1, 14, class143.field2360.field2263, 0);
                    class143.field2360.field2231 = 0;
                    class58.field1012 = class143.field2360.method1012(4);
                    class238.field3757 = class143.field2360.method1012(4);
                    class116.field1945 = class143.field2360.method1012(4) == 1;
                    class228.field3642 = class143.field2360.method1012(4) == 1;
                    class72.field1193 = class143.field2360.method1012(arg0 ^ 0xFFFFFFF1) == 1;
                    class189.field3090 = class143.field2360.method1012(4) == 1;
                    class149.field2443 = class143.field2360.method1012(arg0 ^ 0xFFFFFFF1) == 1;
                    class288.field4607 = class143.field2360.method996(65280);
                    class48.field879 = class143.field2360.method1012(4) == 1;
                    class6.field75 = class143.field2360.method1012(4) == 1;
                    class233.method1541(class6.field75, -796004472);
                    class260.method1737(class6.field75, (byte) -30);
                    if (!class47.field869) {
                        if ((!class116.field1945 || class72.field1193) && !class48.field879) {
                            try {
                                class120.method877(class205.field3294.field1291, arg0 + 25729, "unzap");
                            } catch (Throwable var10) {
                            }
                        } else {
                            try {
                                class120.method877(class205.field3294.field1291, 25718, "zap");
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    try {
                        class120.method877(class205.field3294.field1291, 25718, "loggedin");
                    } catch (Throwable var8) {
                    }
                    client.field4578 = class143.field2360.method610(false);
                    class222.field3547 = class143.field2360.method996(65280);
                    class256.field4081 = 9;
                }
                if (class256.field4081 == 9 && class23.field360.method296(111) >= class222.field3547) {
                    class143.field2360.field2231 = 0;
                    class23.field360.method303(-1, class222.field3547, class143.field2360.field2263, 0);
                    class106.field1615 = 2;
                    class256.field4081 = 0;
                    class36.method306((byte) 15);
                    class33.field551 = -1;
                    class65.method501(false, 0);
                    client.field4578 = -1;
                }
            } else if (class23.field360.method296(111) >= 1) {
                class265.field4240 = class23.field360.method295(-8922);
                class256.field4081 = 0;
                class106.field1615 = 29;
                class23.field360.method294((byte) -66);
                class23.field360 = null;
            }
        } catch (IOException var11) {
            if (class23.field360 != null) {
                class23.field360.method294((byte) 108);
                class23.field360 = null;
            }
            if (class48.field880 >= 1) {
                class106.field1615 = -4;
                class256.field4081 = 0;
            } else {
                if (class194.field3176 == class113.field1741) {
                    class194.field3176 = class236.field3735;
                } else {
                    class194.field3176 = class113.field1741;
                }
                class48.field880++;
                class224.field3576 = 0;
                class256.field4081 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static void method1391(boolean arg0) {
        field3347 = null;
        field3342 = null;
        if (arg0) {
            field3340 = -102;
        }
        field3346 = null;
        field3344 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lsb;B)V")
    public static final void method1392(class124 arg0, byte arg1) {
        field3348++;
        if (class116.field1949) {
            return;
        }
        class63.method474();
        class233.field3693 = class85.method675(class11.field159, arg0, arg1 ^ 0x33);
        int var2 = class33.field557;
        int var3 = var2 * 956 / 503;
        class233.field3693.method132((class137.field2301 - var3) / 2, 0, var3, var2);
        if (arg1 == 66) {
            class190.field3106 = class32.method279(arg0, class262.field4161, (byte) 103);
            class190.field3106.method588(class137.field2301 / 2 - (class190.field3106.field2440 / 2), 18);
            class116.field1949 = true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class208() {
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lwc;)V")
    public class208(class208 arg0) {
        this.field3350 = arg0.field3350;
        this.field3339 = arg0.field3339;
        this.field3338 = arg0.field3338;
        this.field3341 = arg0.field3341;
    }
}
