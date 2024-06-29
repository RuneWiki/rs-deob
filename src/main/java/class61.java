import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class61 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lae;")
    private static class6 field1325 = class64.method474(108, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lae;")
    public static class6 field1324 = field1325;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lae;")
    public static class6 field1330 = class64.method474(109, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!je", name = "j", descriptor = "[I")
    public static int[] field1333 = new int[500];

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Lae;")
    private static class6 field1338 = class64.method474(123, "Friends");

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lae;")
    public static class6 field1337 = field1338;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "J")
    public static long field1341 = 0L;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lae;")
    private static class6 field1331 = class64.method474(117, "Checking for updates )2 ");

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Lae;")
    public static class6 field1335 = field1331;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Lae;")
    private static class6 field1342 = class64.method474(109, "Loading game screen )2 ");

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lae;")
    public static class6 field1334 = field1342;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Lva;")
    public static class128 field1344;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "Z")
    public static boolean field1343;

    @OriginalMember(owner = "client!je", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 4)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1336++;
        if (class2.field21 != null) {
            class65.field1420 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class66.field1469.length) {
                var3 = class66.field1469[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class118.method966(arg0, 8);
            }
            if (class26.field643 >= 0 && var3 >= 0) {
                class85.field2065[class26.field643] = var3;
                class26.field643 = class26.field643 + 1 & 0x7F;
                if (class89.field2128 == class26.field643) {
                    class26.field643 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class76.field1779 + 1 & 0x7F;
                if (class77.field1861 != var5) {
                    class89.field2133[class76.field1779] = var3;
                    class58.field1262[class76.field1779] = var4;
                    class76.field1779 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Z", line = 83)
    public static final boolean method452(int arg0) {
        field1346++;
        long var1 = class5.method22(arg0 ^ 0x255);
        int var3 = (int) (var1 - class116.field2739);
        class116.field2739 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class69.field1522 += var3;
        if (class80.field1956 == 0 && class4.field33 == 0 && class70.field1548 == 0 && class51.field1151 == 0) {
            return true;
        } else if (class95.field2262 == null) {
            return false;
        } else {
            try {
                if (class69.field1522 > 30000) {
                    throw new IOException();
                }
                while (class4.field33 < 20 && class51.field1151 > 0) {
                    class34 var4 = (class34) class40.field888.method270(70);
                    class77 var5 = new class77(4);
                    var5.method641((byte) -28, 1);
                    var5.method642(arg0 ^ 0xFFFFFDA1, (int) var4.field1501);
                    class95.field2262.method211(-1, var5.field1858, 4, 0);
                    class8.field171.method269(var4.field1501, var4, (byte) -15);
                    class51.field1151--;
                    class4.field33++;
                }
                while (class80.field1956 < 20 && class70.field1548 > 0) {
                    class34 var6 = (class34) class56.field1224.method884((byte) -123);
                    class77 var7 = new class77(4);
                    var7.method641((byte) -28, 0);
                    var7.method642(-89, (int) var6.field1501);
                    class95.field2262.method211(-1, var7.field1858, 4, 0);
                    var6.method572(16777215);
                    class30.field731.method269(var6.field1501, var6, (byte) -49);
                    class70.field1548--;
                    class80.field1956++;
                }
                int var8 = 0;
                if (arg0 != 512) {
                    method455((byte) 78, -62, null);
                }
                while (var8 < 100) {
                    int var9 = class95.field2262.method210(0);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class69.field1522 = 0;
                    byte var10 = 0;
                    if (class129.field3115 == null) {
                        var10 = 8;
                    } else if (class52.field1172 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class109.field2625.field1821;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class95.field2262.method206(var11, class109.field2625.field1858, class109.field2625.field1821, -22323);
                        if (class109.field2606 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class109.field2625.field1858[class109.field2625.field1821 + var12] = (byte) class2.method7(class109.field2625.field1858[class109.field2625.field1821 + var12], class109.field2606);
                            }
                        }
                        class109.field2625.field1821 += var11;
                        if (var10 > class109.field2625.field1821) {
                            break;
                        }
                        if (class129.field3115 == null) {
                            class109.field2625.field1821 = 0;
                            int var13 = class109.field2625.method620((byte) -8);
                            int var14 = class109.field2625.method636(102);
                            int var15 = class109.field2625.method620((byte) -8);
                            long var16 = (long) ((var13 << 16) + var14);
                            int var18 = class109.field2625.method647((byte) -72);
                            class34 var19 = (class34) class8.field171.method276((byte) -19, var16);
                            class70.field1563 = true;
                            if (var19 == null) {
                                var19 = (class34) class30.field731.method276((byte) -19, var16);
                                class70.field1563 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class129.field3115 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class73.field1669 = new class77(class129.field3115.field804 + var18 + var20);
                            class73.field1669.method641((byte) -28, var15);
                            class73.field1669.method644(var18, (byte) 38);
                            class52.field1172 = 8;
                            class109.field2625.field1821 = 0;
                        } else if (class52.field1172 == 0) {
                            if (class109.field2625.field1858[0] == -1) {
                                class109.field2625.field1821 = 0;
                                class52.field1172 = 1;
                            } else {
                                class129.field3115 = null;
                            }
                        }
                    } else {
                        int var21 = class73.field1669.field1858.length - class129.field3115.field804;
                        int var22 = 512 - class52.field1172;
                        if (var21 - class73.field1669.field1821 < var22) {
                            var22 = var21 - class73.field1669.field1821;
                        }
                        if (var9 < var22) {
                            var22 = var9;
                        }
                        class95.field2262.method206(var22, class73.field1669.field1858, class73.field1669.field1821, arg0 ^ 0xFFFFAACD);
                        if (class109.field2606 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class73.field1669.field1858[class73.field1669.field1821 + var23] = (byte) class2.method7(class73.field1669.field1858[class73.field1669.field1821 + var23], class109.field2606);
                            }
                        }
                        class73.field1669.field1821 += var22;
                        class52.field1172 += var22;
                        if (class73.field1669.field1821 == var21) {
                            if (class129.field3115.field1501 == 16711935L) {
                                class92.field2199 = class73.field1669;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class129 var25 = class57.field1246[var24];
                                    if (var25 != null) {
                                        class92.field2199.field1821 = var24 * 4 + 5;
                                        int var26 = class92.field2199.method647((byte) -72);
                                        var25.method1040(116, var26);
                                    }
                                }
                            } else {
                                class118.field2803.reset();
                                class118.field2803.update(class73.field1669.field1858, 0, var21);
                                int var27 = (int) class118.field2803.getValue();
                                if (class129.field3115.field815 != var27) {
                                    try {
                                        class95.field2262.method207(-2158);
                                    } catch (Exception var29) {
                                    }
                                    class109.field2606 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class95.field2262 = null;
                                    class27.field679++;
                                    return false;
                                }
                                class130.field3156 = 0;
                                class27.field679 = 0;
                                class129.field3115.field809.method1045(class73.field1669.field1858, class70.field1563, (byte) -106, (class129.field3115.field1501 & 0xFF0000L) == 16711680L, (int) (class129.field3115.field1501 & 0xFFFFL));
                            }
                            class129.field3115.method498(arg0 - 415);
                            if (class70.field1563) {
                                class4.field33--;
                            } else {
                                class80.field1956--;
                            }
                            class129.field3115 = null;
                            class73.field1669 = null;
                            class52.field1172 = 0;
                        } else {
                            if (class52.field1172 != 512) {
                                break;
                            }
                            class52.field1172 = 0;
                        }
                    }
                    var8++;
                }
                return true;
            } catch (IOException var30) {
                try {
                    class95.field2262.method207(-2158);
                } catch (Exception var28) {
                }
                class95.field2262 = null;
                class130.field3156++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 374)
    public static void method453(int arg0) {
        field1344 = null;
        if (arg0 != -13461) {
            method452(-7);
        }
        field1334 = null;
        field1325 = null;
        field1324 = null;
        field1335 = null;
        field1342 = null;
        field1338 = null;
        field1333 = null;
        field1337 = null;
        field1331 = null;
        field1330 = null;
    }

    @OriginalMember(owner = "client!je", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 407)
    public final void focusGained(FocusEvent arg0) {
        field1328++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)I", line = 415)
    public static final int method454(byte arg0) {
        int var1 = 123 / ((13 - arg0) / 35);
        field1339++;
        return 5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BILmc;)V", line = 428)
    public static final void method455(byte arg0, int arg1, class76 arg2) {
        field1327++;
        class7.method75(arg1, arg2.field1752, arg0 + 99, arg2.field1783);
        if (arg0 != -11) {
            method452(122);
        }
    }

    @OriginalMember(owner = "client!je", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 442)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class2.field21 != null) {
            class65.field1420 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class66.field1469.length > var2) {
                var3 = class66.field1469[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class26.field643 >= 0 && var3 >= 0) {
                class85.field2065[class26.field643] = ~var3;
                class26.field643 = class26.field643 + 1 & 0x7F;
                if (class89.field2128 == class26.field643) {
                    class26.field643 = -1;
                }
            }
        }
        arg0.consume();
        field1340++;
    }

    @OriginalMember(owner = "client!je", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 485)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class2.field21 != null) {
            class26.field643 = -1;
        }
        field1326++;
    }

    @OriginalMember(owner = "client!je", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 509)
    public final void keyTyped(KeyEvent arg0) {
        field1345++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLba;Lvb;I)V", line = 573)
    public static final void method456(boolean arg0, class8 arg1, class129 arg2, int arg3) {
        field1332++;
        class87 var4 = new class87();
        var4.field2090 = arg2;
        var4.field2093 = arg1;
        var4.field1501 = arg3;
        var4.field2094 = 1;
        if (!arg0) {
            return;
        }
        class95 var5 = class21.field509;
        synchronized (class21.field509) {
            class21.field509.method785((byte) -70, var4);
        }
        class130.method1052(117);
    }
}
