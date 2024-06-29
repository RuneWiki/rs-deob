import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class72 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Ldc;")
    public static class37 field1274 = class185.method1233((byte) 86, " )2>");

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Ldc;")
    private static class37 field1280 = class185.method1233((byte) 86, "Your account has been disabled)3");

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "[I")
    public static int[] field1281 = new int[256];

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Ldc;")
    public static class37 field1277 = field1280;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lmf;")
    public static class136 field1282;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "[[[B")
    public static byte[][][] field1286;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIBLld;)V")
    public static final void method511(int arg0, int arg1, int arg2, byte arg3, class123 arg4) {
        field1289++;
        if (class238.field4382 == arg4 || class97.field1701 >= 400) {
            return;
        }
        class37 var5;
        if (arg4.field2184 == 0) {
            var5 = class80.method548(new class37[] { arg4.field2187, class5.method41(class238.field4382.field2181, (byte) -15, arg4.field2181), class212.field3961, class131.field2444, class151.method1034((byte) -9, arg4.field2181), class75.field1323 }, -93);
        } else {
            var5 = class80.method548(new class37[] { arg4.field2187, class212.field3961, class190.field3510, class151.method1034((byte) -9, arg4.field2184), class75.field1323 }, -58);
        }
        if (class66.field1191 == 1) {
            class200.method1328((long) arg2, (short) 40, arg1, class80.method548(new class37[] { class223.field4142, class28.field509, var5 }, -46), 500, class206.field3841, arg0);
            class51.field1039++;
        } else if (!class30.field600) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class166.field3177[var6] != null) {
                    short var7 = 0;
                    boolean var8 = false;
                    if (class192.field3592 == 0 && class166.field3177[var6].method303(class70.field1266, 40)) {
                        if (class238.field4382.field2181 < arg4.field2181) {
                            var7 = 2000;
                        }
                        if (class238.field4382.field2196 != 0 && arg4.field2196 != 0) {
                            if (class238.field4382.field2196 == arg4.field2196) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class77.field1360[var6]) {
                        var7 = 2000;
                    }
                    short var9 = class224.field4144[var6];
                    short var10 = (short) (var7 + var9);
                    class200.method1328((long) arg2, var10, arg1, class80.method548(new class37[] { class5.field48, var5 }, -124), 500, class166.field3177[var6], arg0);
                    class113.field2021++;
                }
            }
        } else if ((class24.field418 & 0x8) == 8) {
            class200.method1328((long) arg2, (short) 38, arg1, class80.method548(new class37[] { class12.field170, class28.field509, var5 }, -16), 500, class109.field1899, arg0);
            class39.field807++;
        }
        int var11 = -41 / ((arg3 + 8) / 62);
        for (int var12 = 0; var12 < class97.field1701; var12++) {
            if (class171.field3281[var12] == 5) {
                class220.field4088[var12] = class80.method548(new class37[] { class5.field48, var5 }, -15);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class94.field1647 != null) {
            int var2 = class35.method297(arg0, 97);
            if (var2 >= 0) {
                int var3 = class147.field2810 + 1 & 0x7F;
                if (class236.field4294 != var3) {
                    class88.field1545[class147.field2810] = -1;
                    class17.field260[class147.field2810] = var2;
                    class147.field2810 = var3;
                }
            }
        }
        arg0.consume();
        field1283++;
    }

    @OriginalMember(owner = "client!gg", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1279++;
        if (class94.field1647 != null) {
            class174.field3316 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class184.field3395.length) {
                var3 = class184.field3395[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class38.field799 >= 0 && var3 >= 0) {
                class13.field188[class38.field799] = ~var3;
                class38.field799 = class38.field799 + 1 & 0x7F;
                if (class77.field1352 == class38.field799) {
                    class38.field799 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
    public static final void method512() {
        int var0 = class88.field1544[class92.field1583];
        class127[] var1 = class88.field1540[class92.field1583];
        class31.field630 = 0;
        label191: for (int var2 = 0; var2 < var0; var2++) {
            class127 var3 = var1[var2];
            if (class82.field1452 != null) {
                for (int var4 = 0; var4 < class82.field1452.length; var4++) {
                    if (class82.field1452[var4] != -1000000 && (var3.field2356 <= class82.field1452[var4] || var3.field2351 <= class82.field1452[var4]) && (var3.field2376 <= class151.field2865[var4] || var3.field2358 <= class151.field2865[var4]) && (var3.field2376 >= class176.field3333[var4] || var3.field2358 >= class176.field3333[var4]) && (var3.field2373 <= class199.field3704[var4] || var3.field2359 <= class199.field3704[var4]) && (var3.field2373 >= class183.field3391[var4] || var3.field2359 >= class183.field3391[var4])) {
                        continue label191;
                    }
                }
            }
            if (var3.field2377 == 1) {
                int var5 = var3.field2370 + class84.field1484 - class240.field4408;
                if (var5 >= 0 && var5 <= class84.field1484 + class84.field1484) {
                    int var6 = var3.field2352 + class84.field1484 - class199.field3702;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = var3.field2365 + class84.field1484 - class199.field3702;
                    if (var7 > class84.field1484 + class84.field1484) {
                        var7 = class84.field1484 + class84.field1484;
                    }
                    boolean var8 = false;
                    while (var6 <= var7) {
                        if (class214.field4005[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        int var9 = class39.field818 - var3.field2376;
                        if (var9 > 32) {
                            var3.field2361 = 1;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }
                            var3.field2361 = 2;
                            var9 = -var9;
                        }
                        var3.field2368 = (var3.field2373 - class151.field2861 << 8) / var9;
                        var3.field2350 = (var3.field2359 - class151.field2861 << 8) / var9;
                        var3.field2378 = (var3.field2356 - class133.field2466 << 8) / var9;
                        var3.field2372 = (var3.field2351 - class133.field2466 << 8) / var9;
                        class6.field68[class31.field630++] = var3;
                    }
                }
            } else if (var3.field2377 == 2) {
                int var10 = var3.field2352 + class84.field1484 - class199.field3702;
                if (var10 >= 0 && var10 <= class84.field1484 + class84.field1484) {
                    int var11 = var3.field2370 + class84.field1484 - class240.field4408;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = var3.field2343 + class84.field1484 - class240.field4408;
                    if (var12 > class84.field1484 + class84.field1484) {
                        var12 = class84.field1484 + class84.field1484;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class214.field4005[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        int var14 = class151.field2861 - var3.field2373;
                        if (var14 > 32) {
                            var3.field2361 = 3;
                        } else {
                            if (var14 >= -32) {
                                continue;
                            }
                            var3.field2361 = 4;
                            var14 = -var14;
                        }
                        var3.field2367 = (var3.field2376 - class39.field818 << 8) / var14;
                        var3.field2371 = (var3.field2358 - class39.field818 << 8) / var14;
                        var3.field2378 = (var3.field2356 - class133.field2466 << 8) / var14;
                        var3.field2372 = (var3.field2351 - class133.field2466 << 8) / var14;
                        class6.field68[class31.field630++] = var3;
                    }
                }
            } else if (var3.field2377 == 4) {
                int var15 = var3.field2356 - class133.field2466;
                if (var15 > 128) {
                    int var16 = var3.field2352 + class84.field1484 - class199.field3702;
                    if (var16 < 0) {
                        var16 = 0;
                    }
                    int var17 = var3.field2365 + class84.field1484 - class199.field3702;
                    if (var17 > class84.field1484 + class84.field1484) {
                        var17 = class84.field1484 + class84.field1484;
                    }
                    if (var16 <= var17) {
                        int var18 = var3.field2370 + class84.field1484 - class240.field4408;
                        if (var18 < 0) {
                            var18 = 0;
                        }
                        int var19 = var3.field2343 + class84.field1484 - class240.field4408;
                        if (var19 > class84.field1484 + class84.field1484) {
                            var19 = class84.field1484 + class84.field1484;
                        }
                        boolean var20 = false;
                        label163: for (int var21 = var18; var21 <= var19; var21++) {
                            for (int var22 = var16; var22 <= var17; var22++) {
                                if (class214.field4005[var21][var22]) {
                                    var20 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var20) {
                            var3.field2361 = 5;
                            var3.field2367 = (var3.field2376 - class39.field818 << 8) / var15;
                            var3.field2371 = (var3.field2358 - class39.field818 << 8) / var15;
                            var3.field2368 = (var3.field2373 - class151.field2861 << 8) / var15;
                            var3.field2350 = (var3.field2359 - class151.field2861 << 8) / var15;
                            class6.field68[class31.field630++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1287++;
        if (class94.field1647 != null) {
            class38.field799 = -1;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public static final void method513(int arg0, int arg1) {
        class168.field3206 = -1;
        class240.field4412 = arg1;
        field1284++;
        if (arg0 == 128) {
            class147.field2811 = -1;
            class133.method924(15);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method514(int arg0) {
        field1274 = null;
        field1281 = null;
        field1280 = null;
        field1277 = null;
        field1282 = null;
        field1286 = null;
        if (arg0 != -7897) {
            method515(18, -79);
        }
    }

    @OriginalMember(owner = "client!gg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1288++;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)Z")
    public static final boolean method515(int arg0, int arg1) {
        field1275++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else if (arg0 >= 48 && arg0 <= 57) {
            return true;
        } else {
            if (arg1 != 122) {
                field1281 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1276++;
        if (class94.field1647 == null) {
            return;
        }
        class174.field3316 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class184.field3395.length) {
            var3 = class184.field3395[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class38.field799 >= 0 && var3 >= 0) {
            class13.field188[class38.field799] = var3;
            class38.field799 = class38.field799 + 1 & 0x7F;
            if (class77.field1352 == class38.field799) {
                class38.field799 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class147.field2810 + 1 & 0x7F;
            if (class236.field4294 != var4) {
                class88.field1545[class147.field2810] = var3;
                class17.field260[class147.field2810] = -1;
                class147.field2810 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }
}
