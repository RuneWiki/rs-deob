import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class70 implements Runnable {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lgd;")
    private static class40 field1676 = class14.method90(false, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[I")
    public static int[] field1679 = new int[4000];

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "[I")
    public static int[] field1684 = new int[128];

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lgd;")
    public static class40 field1682 = field1676;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Lgd;")
    public static class40 field1689 = class14.method90(false, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lgd;")
    public static class40 field1691 = class14.method90(false, "backleft1");

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lgd;")
    private static class40 field1692 = class14.method90(false, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1675 = 0;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lgd;")
    private static class40 field1693 = class14.method90(false, "Enter name of player to add to list");

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field1695 = 0;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lgd;")
    public static class40 field1683 = field1692;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Lgd;")
    private static class40 field1697 = class14.method90(false, "System update in: ");

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Lgd;")
    public static class40 field1699 = field1693;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Lgd;")
    public static class40 field1696 = class14.method90(false, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lgd;")
    public static class40 field1681 = field1697;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Lgd;")
    private static class40 field1687 = class14.method90(false, " has logged out)3");

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lgd;")
    public static class40 field1678 = field1687;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lv;")
    public static class129 field1694;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "Loc;")
    public static class86 field1698;

    @OriginalMember(owner = "client!ld", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field1677++;
        try {
            while (true) {
                class89 var1 = class58.field1475;
                class53 var2;
                synchronized (class58.field1475) {
                    var2 = (class53) class58.field1475.method593(0);
                }
                if (var2 == null) {
                    class51.method400((byte) 58, 100L);
                    Object var3 = class76.field1736;
                    synchronized (class76.field1736) {
                        if (class12.field299 <= 1) {
                            class12.field299 = 0;
                            class76.field1736.notifyAll();
                            return;
                        }
                        class12.field299--;
                    }
                } else {
                    if (var2.field1340 == 0) {
                        var2.field1339.method546((int) var2.field2647, var2.field1341.length, var2.field1341, (byte) -90);
                        class89 var4 = class58.field1475;
                        synchronized (class58.field1475) {
                            var2.method833(4);
                        }
                    } else if (var2.field1340 == 1) {
                        var2.field1341 = var2.field1339.method543(-75, (int) var2.field2647);
                        class89 var5 = class58.field1475;
                        synchronized (class58.field1475) {
                            class51.field1299.method589(var2, 29);
                        }
                    }
                    Object var6 = class76.field1736;
                    synchronized (class76.field1736) {
                        if (class12.field299 <= 1) {
                            class12.field299 = 0;
                            class76.field1736.notifyAll();
                            return;
                        }
                        class12.field299 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class50.method392(66, null, var17);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I", line = 88)
    public static int method486(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 98)
    public static final void method487(byte arg0) {
        if (arg0 != -42) {
            field1675 = -43;
        }
        field1686++;
        if (class8.field209 && class99.field2361 != class74.field1733) {
            class7.method42(class99.field2361, (byte) -115, class135.field3275, class13.field332.field803[0], class13.field332.field819[0], class125.field2957);
        } else if (class99.field2361 != class129.field3090) {
            class129.field3090 = class99.field2361;
            class54.method409(-26959, class99.field2361);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V", line = 125)
    public static void method488(byte arg0) {
        field1682 = null;
        field1697 = null;
        if (arg0 != -2) {
            field1696 = null;
        }
        field1691 = null;
        field1687 = null;
        field1676 = null;
        field1683 = null;
        field1696 = null;
        field1681 = null;
        field1692 = null;
        field1679 = null;
        field1678 = null;
        field1684 = null;
        field1689 = null;
        field1693 = null;
        field1699 = null;
        field1698 = null;
        field1694 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILrc;Lgd;)I", line = 151)
    public static final int method489(int arg0, class104 arg1, class40 arg2) {
        field1688++;
        int var3 = arg1.field2563;
        arg1.method769(127, arg2.field950);
        arg1.field2563 += field1694.method1022(arg2.field950, arg2.field948, arg0, arg1.field2554, arg1.field2563, true);
        return arg1.field2563 - var3;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V", line = 174)
    public static final void method490(byte arg0) {
        if (arg0 <= 74) {
            field1699 = null;
        }
        try {
            Graphics var1 = class30.field761.getGraphics();
            field1698.method465(-63, 4, var1, 4);
        } catch (Exception var2) {
            class30.field761.repaint();
        }
        field1690++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Z", line = 203)
    public static final boolean method491(int arg0) {
        field1680++;
        long var1 = class98.method683(0);
        int var3 = (int) (var1 - class58.field1486);
        class58.field1486 = var1;
        if (arg0 != 30590) {
            field1691 = null;
        }
        if (var3 > 200) {
            var3 = 200;
        }
        client.field471 += var3;
        if (class50.field1264 == 0 && class110.field2678 == 0 && class104.field2506 == 0 && class61.field1516 == 0) {
            return true;
        } else if (class16.field416 == null) {
            return false;
        } else {
            try {
                if (client.field471 > 30000) {
                    throw new IOException();
                }
                while (class110.field2678 < 20 && class61.field1516 > 0) {
                    class85 var4 = (class85) class35.field898.method139(120);
                    class104 var5 = new class104(4);
                    var5.method756(1, 1);
                    var5.method762((int) var4.field2647, 96);
                    class16.field416.method1086(0, var5.field2554, 4, (byte) -55);
                    class38.field939.method144(var4, var4.field2647, arg0 - 13242);
                    class110.field2678++;
                    class61.field1516--;
                }
                while (class50.field1264 < 20 && class104.field2506 > 0) {
                    class85 var6 = (class85) class91.field2054.method511(-104);
                    class104 var7 = new class104(4);
                    var7.method756(0, 1);
                    var7.method762((int) var6.field2647, 113);
                    class16.field416.method1086(0, var7.field2554, 4, (byte) 119);
                    var6.method482(arg0 - 30677);
                    class35.field899.method144(var6, var6.field2647, 17348);
                    class50.field1264++;
                    class104.field2506--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class16.field416.method1085(0);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    byte var10 = 0;
                    client.field471 = 0;
                    if (class129.field3080 == null) {
                        var10 = 8;
                    } else if (class10.field251 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class113.field2739.field2563;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class16.field416.method1081(class113.field2739.field2554, 117, var11, class113.field2739.field2563);
                        if (class129.field3082 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class113.field2739.field2554[class113.field2739.field2563 + var12] = (byte) method486(class113.field2739.field2554[class113.field2739.field2563 + var12], class129.field3082);
                            }
                        }
                        class113.field2739.field2563 += var11;
                        if (class113.field2739.field2563 < var10) {
                            break;
                        }
                        if (class129.field3080 == null) {
                            class113.field2739.field2563 = 0;
                            int var13 = class113.field2739.method798((byte) -104);
                            int var14 = class113.field2739.method797(-7916);
                            int var15 = class113.field2739.method798((byte) -69);
                            int var16 = class113.field2739.method774(-29404);
                            long var17 = (long) ((var13 << 16) + var14);
                            class85 var19 = (class85) class38.field939.method142(var17, 23056);
                            class77.field1788 = true;
                            if (var19 == null) {
                                var19 = (class85) class35.field899.method142(var17, 23056);
                                class77.field1788 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class129.field3080 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class45.field1138 = new class104(var16 + class129.field3080.field1892 + var20);
                            class45.field1138.method756(var15, 1);
                            class45.field1138.method761(var16, -23644);
                            class10.field251 = 8;
                            class113.field2739.field2563 = 0;
                        } else if (class10.field251 == 0) {
                            if (class113.field2739.field2554[0] == -1) {
                                class113.field2739.field2563 = 0;
                                class10.field251 = 1;
                            } else {
                                class129.field3080 = null;
                            }
                        }
                    } else {
                        int var21 = 512 - class10.field251;
                        int var22 = class45.field1138.field2554.length - class129.field3080.field1892;
                        if (var22 - class45.field1138.field2563 < var21) {
                            var21 = var22 - class45.field1138.field2563;
                        }
                        if (var21 > var9) {
                            var21 = var9;
                        }
                        class16.field416.method1081(class45.field1138.field2554, 103, var21, class45.field1138.field2563);
                        if (class129.field3082 != 0) {
                            for (int var23 = 0; var23 < var21; var23++) {
                                class45.field1138.field2554[class45.field1138.field2563 + var23] = (byte) method486(class45.field1138.field2554[class45.field1138.field2563 + var23], class129.field3082);
                            }
                        }
                        class10.field251 += var21;
                        class45.field1138.field2563 += var21;
                        if (class45.field1138.field2563 == var22) {
                            if (class129.field3080.field2647 == 16711935L) {
                                class29.field617 = class45.field1138;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class135 var26 = class106.field2586[var25];
                                    if (var26 != null) {
                                        class29.field617.field2563 = var25 * 4 + 5;
                                        int var27 = class29.field617.method774(-29404);
                                        var26.method1056(arg0 - 30678, var27);
                                    }
                                }
                            } else {
                                class110.field2676.reset();
                                class110.field2676.update(class45.field1138.field2554, 0, var22);
                                int var24 = (int) class110.field2676.getValue();
                                if (class129.field3080.field1908 != var24) {
                                    try {
                                        class16.field416.method1079(true);
                                    } catch (Exception var29) {
                                    }
                                    class16.field416 = null;
                                    class60.field1503++;
                                    class129.field3082 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class60.field1503 = 0;
                                class112.field2713 = 0;
                                class129.field3080.field1901.method1063(class45.field1138.field2554, class77.field1788, (int) (class129.field3080.field2647 & 0xFFFFL), (class129.field3080.field2647 & 0xFF0000L) == 16711680L, arg0 - 30591);
                            }
                            class129.field3080.method833(4);
                            class10.field251 = 0;
                            class129.field3080 = null;
                            class45.field1138 = null;
                            if (class77.field1788) {
                                class110.field2678--;
                            } else {
                                class50.field1264--;
                            }
                        } else {
                            if (class10.field251 != 512) {
                                break;
                            }
                            class10.field251 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var30) {
                try {
                    class16.field416.method1079(true);
                } catch (Exception var28) {
                }
                class16.field416 = null;
                class112.field2713++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 498)
    public static final void method492(int arg0) {
        Object var1 = class76.field1736;
        synchronized (class76.field1736) {
            if (~class12.field299 != arg0) {
                class12.field299 = 1;
                try {
                    class76.field1736.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field1685++;
    }
}
