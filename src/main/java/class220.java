import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class220 extends class196 {

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    private int field3824;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class220() {
        this(4096);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field3827;
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            class256.method1743(var3, 0, class49.field767, this.field3824);
        }
        if (arg1 != 10565) {
            this.field3824 = 87;
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V")
    private class220(int arg0) {
        super(0, true);
        this.field3824 = 4096;
        this.field3824 = arg0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (~arg0 == -1) {
            this.field3824 = (arg1.method897(arg2 ^ 56) << 12) / 255;
        }
        ++field3822;
        if (arg2 != 82) {
            method1513((byte) 106, 34, -29, true);
        }
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(B)V")
    public static final void method1512(byte arg0) {
        ++field3823;
        if (~class210.field3497 != -1) {
            try {
                if (++class130.field2185 > 2000) {
                    if (class204.field3415 != null) {
                        class204.field3415.method838(-121);
                        class204.field3415 = null;
                    }
                    if (~class144.field2403 <= -2) {
                        class210.field3497 = 0;
                        class181.field2987 = -5;
                        return;
                    }
                    class210.field3497 = 1;
                    class130.field2185 = 0;
                    if (~class138.field2320 != ~class133.field2221) {
                        class133.field2221 = class138.field2320;
                    } else {
                        class133.field2221 = class76.field1232;
                    }
                    ++class144.field2403;
                }
                if (~class210.field3497 == -2) {
                    class70.field1130 = class25.field376.method1580((byte) 8, class238.field4142, class133.field2221);
                    class210.field3497 = 2;
                }
                if (arg0 > 64) {
                    if (~class210.field3497 == -3) {
                        if (~class70.field1130.field2504 == -3) {
                            throw new IOException();
                        }
                        if (~class70.field1130.field2504 != -2) {
                            return;
                        }
                        class204.field3415 = new class114((Socket) class70.field1130.field2505, class25.field376);
                        class70.field1130 = null;
                        class204.field3415.method840(0, -782, class95.field1575.field2014, class95.field1575.field2026);
                        if (class198.field3300 != null) {
                            class198.field3300.method1215(255);
                        }
                        if (class37.field571 != null) {
                            class37.field571.method1215(255);
                        }
                        int var1 = class204.field3415.method839((byte) 101);
                        if (class198.field3300 != null) {
                            class198.field3300.method1215(255);
                        }
                        if (class37.field571 != null) {
                            class37.field571.method1215(255);
                        }
                        if (~var1 != -22) {
                            class210.field3497 = 0;
                            class181.field2987 = var1;
                            class204.field3415.method838(-121);
                            class204.field3415 = null;
                            return;
                        }
                        class210.field3497 = 3;
                    }
                    if (~class210.field3497 == -4) {
                        if (class204.field3415.method837(false) < 1) {
                            return;
                        }
                        class171.field2801 = new class51[class204.field3415.method839((byte) 101)];
                        class210.field3497 = 4;
                    }
                    if (~class210.field3497 == -5) {
                        if (~class204.field3415.method837(false) <= ~(class171.field2801.length * 8)) {
                            class97.field1622.field2026 = 0;
                            class204.field3415.method841(0, class97.field1622.field2014, class171.field2801.length * 8, (byte) -110);
                            for (int var2 = 0; class171.field2801.length > var2; ++var2) {
                                class171.field2801[var2] = class63.method422(class97.field1622.method868(101), -29);
                            }
                            class210.field3497 = 0;
                            class181.field2987 = 21;
                            class204.field3415.method838(-122);
                            class204.field3415 = null;
                        }
                    }
                }
            } catch (IOException var3) {
                if (class204.field3415 != null) {
                    class204.field3415.method838(-122);
                    class204.field3415 = null;
                }
                if (~class144.field2403 <= -2) {
                    class181.field2987 = -4;
                    class210.field3497 = 0;
                } else {
                    if (class138.field2320 != class133.field2221) {
                        class133.field2221 = class138.field2320;
                    } else {
                        class133.field2221 = class76.field1232;
                    }
                    ++class144.field2403;
                    class210.field3497 = 1;
                    class130.field2185 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BIIZ)V")
    public static final void method1513(byte arg0, int arg1, int arg2, boolean arg3) {
        ++field3826;
        if (arg0 != -112) {
            method1512((byte) -109);
        }
        if (arg2 >= 8000 && ~arg2 >= -48001) {
            class156.field2568 = arg2;
            class223.field3939 = arg1;
            class34.field498 = arg3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(B)V")
    public static final void method1514(byte arg0) {
        if (arg0 == 5) {
            for (int var1 = 0; var1 < class218.field3792; ++var1) {
                int var10002 = class228.field3977[var1]--;
                if (~class228.field3977[var1] <= 9) {
                    class117 var3 = class145.field2426[var1];
                    if (var3 == null) {
                        var3 = class117.method852(class176.field2883, class192.field3226[var1], 0);
                        if (var3 == null) {
                            continue;
                        }
                        class228.field3977[var1] += var3.method854();
                        class145.field2426[var1] = var3;
                    }
                    if (~class228.field3977[var1] > -1) {
                        int var4;
                        if (~class209.field3487[var1] == -1) {
                            var4 = class261.field4551;
                        } else {
                            int var5 = (class209.field3487[var1] & 255) * 128;
                            int var6 = (class209.field3487[var1] & 16717751) >> 16;
                            int var7 = var6 * 128 - (class44.field706.field4319 + -64);
                            if (~var7 > -1) {
                                var7 = -var7;
                            }
                            int var8 = (class209.field3487[var1] & 65476) >> 8;
                            int var9 = var8 * 128 - -64 + -class44.field706.field4348;
                            if (var9 < 0) {
                                var9 = -var9;
                            }
                            int var10 = var7 + var9 + -128;
                            if (~var5 > ~var10) {
                                class228.field3977[var1] = -100;
                                continue;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            }
                            var4 = (-var10 + var5) * class218.field3801 / var5;
                        }
                        if (var4 > 0) {
                            class224 var11 = var3.method853().method1544(client.field2450);
                            class81 var12 = class81.method628(var11, 100, var4);
                            var12.method600(class7.field76[var1] + -1);
                            class166.field2709.method495(var12);
                        }
                        class228.field3977[var1] = -100;
                    }
                } else {
                    --class218.field3792;
                    for (int var2 = var1; class218.field3792 > var2; ++var2) {
                        class192.field3226[var2] = class192.field3226[var2 + 1];
                        class145.field2426[var2] = class145.field2426[var2 + 1];
                        class7.field76[var2] = class7.field76[var2 + 1];
                        class228.field3977[var2] = class228.field3977[var2 + 1];
                        class209.field3487[var2] = class209.field3487[var2 + 1];
                    }
                    --var1;
                }
            }
            ++field3825;
            if (class236.field4117 && !class264.method1793(2)) {
                if (~class26.field381 != -1 && ~class153.field2556 != 0) {
                    class9.method42(0, class149.field2493, (byte) 97, class153.field2556, class26.field381, false);
                }
                class236.field4117 = false;
            } else if (class26.field381 != 0 && ~class153.field2556 != 0 && !class264.method1793(arg0 ^ 7)) {
                class95.field1575.method424((byte) 86, 162);
                class95.field1575.method870(class153.field2556, (byte) 12);
                ++class255.field4452;
                class153.field2556 = -1;
            }
        }
    }
}
