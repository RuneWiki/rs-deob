import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class115 implements class151 {

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    private int field2576 = 128;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    private int field2586 = 50;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Lag;")
    private class8 field2560;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "Lag;")
    private class8 field2579;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "Lld;")
    private class111 field2582;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "[I")
    public static int[] field2557 = new int[2000];

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field2559 = 0;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Ldd;")
    public static class35 field2566 = class180.method1196((byte) 127, "titlebutton");

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Ldd;")
    public static class35 field2573 = class180.method1196((byte) -86, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Ldd;")
    public static class35 field2564 = class180.method1196((byte) 126, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "Ldd;")
    public static class35 field2580 = class180.method1196((byte) 126, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "[I")
    public static int[] field2574 = new int[100];

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "Ldd;")
    public static class35 field2577 = class180.method1196((byte) 126, "<)4col> x");

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Ldd;")
    public static class35 field2569 = class180.method1196((byte) 126, "<col=ffffff>");

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "Ldd;")
    public static class35 field2581 = class180.method1196((byte) -52, "(U2");

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field2587 = 0;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Lag;")
    public static class8 field2578;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "[Lba;")
    public static class12[] field2588;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)I")
    public final int method829(int arg0, int arg1) {
        field2584++;
        if (arg0 != 529) {
            this.method831((byte) 61);
        }
        return this.method833(arg1, 115).field677;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(FII)[I")
    public final int[] method830(float arg0, int arg1, int arg2) {
        field2567++;
        if (arg1 > -7) {
            return null;
        } else {
            class32 var4 = this.method833(arg2, 66);
            var4.field673 = true;
            return var4.method309(this, arg0, this.field2579, this.field2576, (byte) 58);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public final void method831(byte arg0) {
        this.field2582 = new class111(this.field2586);
        field2568++;
        if (arg0 != -128) {
            field2564 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static final void method832(int arg0) {
        field2570++;
        try {
            if (class90.field2014 == 0) {
                if (class108.field2408 != null) {
                    class108.field2408.method920((byte) -55);
                    class108.field2408 = null;
                }
                class147.field3094 = null;
                class90.field2014 = 1;
                class109.field2423 = 0;
                class53.field1198 = false;
            }
            if (class90.field2014 == 1) {
                if (class147.field3094 == null) {
                    class147.field3094 = class182.field3734.method393(class152.field3150, (byte) 104, class82.field1904);
                }
                if (class147.field3094.field1806 == 2) {
                    throw new IOException();
                }
                if (class147.field3094.field1806 == 1) {
                    class108.field2408 = new class135((Socket) class147.field3094.field1804, class182.field3734);
                    class90.field2014 = 2;
                    class147.field3094 = null;
                }
            }
            if (class90.field2014 == 2) {
                long var1 = class148.field3104 = class134.field2849.method321(21830);
                class1.field11.field527 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class1.field11.method257((byte) 126, 14);
                class1.field11.method257((byte) 126, var3);
                class108.field2408.method924(0, 2, class1.field11.field529, true);
                class172.field3441.field527 = 0;
                class90.field2014 = 3;
            }
            if (class90.field2014 == 3) {
                if (class24.field493 != null) {
                    class24.field493.method1165(0);
                }
                if (class26.field550 != null) {
                    class26.field550.method1165(0);
                }
                int var4 = class108.field2408.method928(true);
                if (class24.field493 != null) {
                    class24.field493.method1165(0);
                }
                if (class26.field550 != null) {
                    class26.field550.method1165(0);
                }
                if (var4 != 0) {
                    class57.method502(-19, var4);
                    return;
                }
                class172.field3441.field527 = 0;
                class90.field2014 = 4;
            }
            if (class90.field2014 == 4) {
                if (class172.field3441.field527 < 8) {
                    int var5 = class108.field2408.method923(false);
                    if (8 - class172.field3441.field527 < var5) {
                        var5 = 8 - class172.field3441.field527;
                    }
                    if (var5 > 0) {
                        class108.field2408.method922(1, var5, class172.field3441.field529, class172.field3441.field527);
                        class172.field3441.field527 += var5;
                    }
                }
                if (class172.field3441.field527 == 8) {
                    class172.field3441.field527 = 0;
                    class110.field2429 = class172.field3441.method230((byte) 100);
                    class90.field2014 = 5;
                }
            }
            if (class90.field2014 == 5) {
                class1.field11.field527 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class110.field2429 >> 32), (int) class110.field2429 };
                class1.field11.method257((byte) 126, 10);
                class1.field11.method249(var6[0], -116);
                class1.field11.method249(var6[1], -81);
                class1.field11.method249(var6[2], 70);
                class1.field11.method249(var6[3], -97);
                class1.field11.method239((byte) 103, class134.field2849.method321(21830));
                class1.field11.method253(class134.field2867, (byte) -39);
                class1.field11.method265((byte) 92, class145.field3026, class121.field2654);
                class179.field3670.field527 = 0;
                if (class2.field27 == 40) {
                    class179.field3670.method257((byte) 126, 18);
                } else {
                    class179.field3670.method257((byte) 126, 16);
                }
                class179.field3670.method257((byte) 126, class1.field11.field527 + class93.method677(class174.field3555, -326) + 97);
                class179.field3670.method249(487, -112);
                class179.field3670.method257((byte) 126, class35.field781 ? 1 : 0);
                class204.method1349(class179.field3670, -28369);
                class179.field3670.method253(class174.field3555, (byte) -39);
                class179.field3670.method249(class158.field3214, 94);
                class179.field3670.method249(class165.field3332.field166, -77);
                class179.field3670.method249(class69.field1653.field166, 75);
                class179.field3670.method249(class80.field1864.field166, -89);
                class179.field3670.method249(class107.field2387.field166, -81);
                class179.field3670.method249(class57.field1420.field166, -70);
                class179.field3670.method249(class48.field1055.field166, 110);
                class179.field3670.method249(class162.field3293.field166, 66);
                class179.field3670.method249(class80.field1861.field166, 62);
                class179.field3670.method249(class78.field1815.field166, 64);
                class179.field3670.method249(class79.field1855.field166, 80);
                class179.field3670.method249(class191.field3848.field166, 105);
                class179.field3670.method249(class102.field2255.field166, -114);
                class179.field3670.method249(class134.field2871.field166, -74);
                class179.field3670.method249(class137.field2936.field166, 89);
                class179.field3670.method249(class198.field3946.field166, -82);
                class179.field3670.method249(class44.field964.field166, -100);
                class179.field3670.method237(31534, 0, class1.field11.field527, class1.field11.field529);
                class108.field2408.method924(0, class179.field3670.field527, class179.field3670.field529, true);
                class1.field11.method665((byte) 102, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class172.field3441.method665((byte) 102, var6);
                class90.field2014 = 6;
            }
            if (class90.field2014 == 6 && class108.field2408.method923(false) > 0) {
                int var8 = class108.field2408.method928(true);
                if (var8 == 21 && class2.field27 == 20) {
                    class90.field2014 = 7;
                } else if (var8 == 2) {
                    class90.field2014 = 9;
                } else if (var8 == 15 && class2.field27 == 40) {
                    class176.method1173((byte) -80);
                    return;
                } else if (var8 == 23 && class159.field3240 < 1) {
                    class90.field2014 = 0;
                    class159.field3240++;
                } else {
                    class57.method502(-19, var8);
                    return;
                }
            }
            if (class90.field2014 == 7 && class108.field2408.method923(false) > 0) {
                class173.field3491 = class108.field2408.method928(true) * 60 + 180;
                class90.field2014 = 8;
            }
            if (class90.field2014 == 8) {
                class109.field2423 = 0;
                class188.method1243(class4.field75, class52.field1168, class63.method529(new class35[] { class3.method19(class173.field3491 / 60, -29578), class45.field976 }, (byte) 87), 21);
                if (--class173.field3491 <= 0) {
                    class90.field2014 = 0;
                }
            } else {
                if (class90.field2014 == 9 && class108.field2408.method923(false) >= 9) {
                    class28.field579 = class108.field2408.method928(true);
                    class173.field3507 = class108.field2408.method928(true);
                    class132.field2835 = class108.field2408.method928(true) == 1;
                    client.field614 = class108.field2408.method928(true);
                    client.field614 <<= 0x8;
                    client.field614 += class108.field2408.method928(true);
                    class17.field337 = class108.field2408.method928(true);
                    class108.field2408.method922(1, 1, class172.field3441.field529, 0);
                    class172.field3441.field527 = 0;
                    class207.field4121 = class172.field3441.method668(255);
                    class108.field2408.method922(1, 2, class172.field3441.field529, 0);
                    class172.field3441.field527 = 0;
                    class101.field2224 = class172.field3441.method256((byte) -78);
                    class90.field2014 = 10;
                }
                if (class90.field2014 != 10) {
                    class109.field2423++;
                    if (arg0 > -98) {
                        method832(-69);
                    }
                    if (class109.field2423 > 2000) {
                        if (class159.field3240 < 1) {
                            if (class82.field1904 == class210.field4163) {
                                class82.field1904 = class100.field2202;
                            } else {
                                class82.field1904 = class210.field4163;
                            }
                            class159.field3240++;
                            class90.field2014 = 0;
                        } else {
                            class57.method502(-19, -3);
                        }
                    }
                } else if (class108.field2408.method923(false) >= class101.field2224) {
                    class172.field3441.field527 = 0;
                    class108.field2408.method922(1, class101.field2224, class172.field3441.field529, 0);
                    class7.method32((byte) -119);
                    client.field632 = -1;
                    class45.method407(-48, false);
                    class207.field4121 = -1;
                }
            }
        } catch (IOException var9) {
            if (class159.field3240 < 1) {
                class90.field2014 = 0;
                if (class82.field1904 == class210.field4163) {
                    class82.field1904 = class100.field2202;
                } else {
                    class82.field1904 = class210.field4163;
                }
                class159.field3240++;
            } else {
                class57.method502(-19, -2);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(II)Lda;")
    private final class32 method833(int arg0, int arg1) {
        field2572++;
        class32 var3 = (class32) this.field2582.method817(true, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        if (arg1 <= 1) {
            field2577 = null;
        }
        byte[] var4 = this.field2560.method39(0, -1, arg0);
        if (var4 == null) {
            return class21.method193(42);
        } else {
            class26 var5 = new class26(var4);
            class32 var6 = new class32(var5);
            this.field2582.method816(var6, (long) arg0, 16);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(II)Z")
    public final boolean method834(int arg0, int arg1) {
        field2565++;
        return arg1 == 28222 ? this.method833(arg0, arg1 ^ 0x6E39).field688 : false;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(II)Z")
    public final boolean method835(int arg0, int arg1) {
        field2561++;
        if (arg1 < 64) {
            field2588 = null;
        }
        return this.field2576 == 64 || this.method833(arg0, 24).field689 == 64;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)[I")
    public final int[] method836(boolean arg0, int arg1) {
        field2585++;
        class26 var3 = new class26(this.field2560.method39(0, -1, arg1));
        if (arg0) {
            this.method839(-89, -106);
        }
        class32 var4 = new class32(var3);
        return var4.method311(this, this.field2579, 0, this.field2576);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V")
    public final void method837(byte arg0, int arg1) {
        if (arg0 != 84) {
            this.method835(-48, 66);
        }
        field2571++;
        for (class32 var3 = (class32) this.field2582.method815((byte) 127); var3 != null; var3 = (class32) this.field2582.method809(16)) {
            if (var3.field673) {
                var3.method310((byte) -73, arg1);
                var3.field673 = false;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)Z")
    public final boolean method838(int arg0, int arg1) {
        int var3 = -80 % ((-arg1 - 63) / 58);
        field2563++;
        return this.method833(arg0, 98).method306(this.field2579, this, true);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z")
    public final boolean method839(int arg0, int arg1) {
        field2562++;
        if (arg0 != -3030) {
            field2580 = null;
        }
        return this.method833(arg1, 30).field674;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lag;Lag;II)V")
    public class115(class8 arg0, class8 arg1, int arg2, int arg3) {
        this.field2560 = arg0;
        this.field2576 = arg3;
        this.field2586 = arg2;
        this.field2579 = arg1;
        this.field2582 = new class111(this.field2586);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static void method840(int arg0) {
        field2569 = null;
        if (arg0 >= -18) {
            return;
        }
        field2574 = null;
        field2588 = null;
        field2557 = null;
        field2577 = null;
        field2566 = null;
        field2564 = null;
        field2580 = null;
        field2581 = null;
        field2573 = null;
        field2578 = null;
    }
}
