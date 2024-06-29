import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class247 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Lbd;")
    public static class162 field4088 = class17.method142(0, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Z")
    public static boolean field4090 = true;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field4086 = 0;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Lbd;")
    public static class162 field4096 = class17.method142(0, "Texturen geladen)3");

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Lda;")
    public static class143 field4087;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "Lbd;")
    public static class162 field4095;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "Lrb;")
    public static class66 field4100;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIII)Z", line = 15)
    public static final boolean method1734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!kl", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 53)
    public final void keyTyped(KeyEvent arg0) {
        field4091++;
        if (class237.field3946 != null) {
            int var2 = class273.method1851(-1, arg0);
            if (var2 >= 0) {
                int var3 = class94.field1679 + 1 & 0x7F;
                if (class139.field2477 != var3) {
                    class30.field503[class94.field1679] = -1;
                    class83.field1464[class94.field1679] = var2;
                    class94.field1679 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!kl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 83)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class237.field3946 != null) {
            class86.field1535 = -1;
        }
        field4099++;
    }

    @OriginalMember(owner = "client!kl", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 128)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class237.field3946 != null) {
            class102.field1854 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class280.field4718.length > var2) {
                var3 = class280.field4718[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class86.field1535 >= 0 && var3 >= 0) {
                class297.field4976[class86.field1535] = ~var3;
                class86.field1535 = class86.field1535 + 1 & 0x7F;
                if (class86.field1535 == class84.field1510) {
                    class86.field1535 = -1;
                }
            }
        }
        arg0.consume();
        field4097++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V", line = 165)
    public static final void method1735(int arg0, int arg1) {
        class101 var2 = (class101) class40.field651.method1672((long) arg0, arg1 ^ 0x4D30);
        field4098++;
        if (var2 != null) {
            for (int var3 = arg1; var3 < var2.field1847.length; var3++) {
                var2.field1847[var3] = -1;
                var2.field1849[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 188)
    public static final void method1736(int arg0) {
        field4093++;
        if (class131.field2364 == 0 || class131.field2364 == 5) {
            return;
        }
        try {
            if ((++class88.field1570) > 2000) {
                if (class116.field2054 != null) {
                    class116.field2054.method1829((byte) 4);
                    class116.field2054 = null;
                }
                if (class179.field3063 >= 1) {
                    class217.field3620 = -5;
                    class131.field2364 = 0;
                    return;
                }
                class131.field2364 = 1;
                if (class163.field2880 == class146.field2642) {
                    class146.field2642 = class243.field4033;
                } else {
                    class146.field2642 = class163.field2880;
                }
                class179.field3063++;
                class88.field1570 = 0;
            }
            if (class131.field2364 == 1) {
                class71.field1132 = client.field1903.method237(class146.field2642, -6303, class250.field4179);
                class131.field2364 = 2;
            }
            if (class131.field2364 == 2) {
                if (class71.field1132.field2934 == 2) {
                    throw new IOException();
                }
                if (class71.field1132.field2934 != 1) {
                    return;
                }
                class116.field2054 = new class267((Socket) class71.field1132.field2933, client.field1903);
                class71.field1132 = null;
                long var1 = class27.field465 = class244.field4057.method1256(0);
                class187.field3229.field1653 = 0;
                class187.field3229.method753(14, true);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class187.field3229.method753(var3, true);
                class116.field2054.method1827(0, arg0 ^ 0xFFFF9824, class187.field3229.field1681, 2);
                if (class268.field4484 != null) {
                    class268.field4484.method458((byte) -74);
                }
                if (field4100 != null) {
                    field4100.method458((byte) -74);
                }
                int var4 = class116.field2054.method1832(25831);
                if (class268.field4484 != null) {
                    class268.field4484.method458((byte) -74);
                }
                if (field4100 != null) {
                    field4100.method458((byte) -74);
                }
                if (var4 != 0) {
                    class131.field2364 = 0;
                    class217.field3620 = var4;
                    class116.field2054.method1829((byte) 4);
                    class116.field2054 = null;
                    return;
                }
                class131.field2364 = 3;
            }
            if (class131.field2364 == 3) {
                if (class116.field2054.method1826(arg0 + 26640) < 8) {
                    return;
                }
                class116.field2054.method1830(8, (byte) -20, class63.field975.field1681, 0);
                class63.field975.field1653 = 0;
                int[] var5 = new int[4];
                class262.field4378 = class63.field975.method722(1285103432);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class262.field4378 >> 32);
                class187.field3229.field1653 = 0;
                var5[3] = (int) class262.field4378;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class187.field3229.method753(10, true);
                class187.field3229.method730(false, var5[0]);
                class187.field3229.method730(false, var5[1]);
                class187.field3229.method730(false, var5[2]);
                class187.field3229.method730(false, var5[3]);
                class187.field3229.method745(class244.field4057.method1256(0), (byte) -124);
                class187.field3229.method727(class244.field4046, -253);
                class187.field3229.method708(4096, class250.field4170, class274.field4556);
                class157.field2761.field1653 = 0;
                if (class262.field4380 == 40) {
                    class157.field2761.method753(18, true);
                } else {
                    class157.field2761.method753(16, true);
                }
                class157.field2761.method751(class187.field3229.field1653 + class298.method2043(class35.field590, -1) + 154, -1044017976);
                class157.field2761.method730(false, 517);
                class157.field2761.method753(class94.field1726, true);
                class157.field2761.method753(class273.field4537 ? 1 : 0, true);
                class157.field2761.method753(1, true);
                class157.field2761.method753(class251.method1754((byte) -126), true);
                class157.field2761.method751(class251.field4201, arg0 - 1043991438);
                class157.field2761.method751(class252.field4205, arg0 - 1043991438);
                class264.method1812(-82, class157.field2761);
                class157.field2761.method727(class35.field590, -253);
                class157.field2761.method730(false, class262.field4377);
                class157.field2761.method730(false, class34.method270((byte) 123));
                class87.field1558 = true;
                class157.field2761.method751(class63.field988, -1044017976);
                class157.field2761.method730(false, class213.field3577.method1120(arg0 + 26419));
                class157.field2761.method730(false, class143.field2574.method1120(arg0 ^ 0x6796));
                class157.field2761.method730(false, class50.field806.method1120(arg0 + 26507));
                class157.field2761.method730(false, class151.field2693.method1120(105));
                class157.field2761.method730(false, class157.field2764.method1120(arg0 + 26631));
                class157.field2761.method730(false, class91.field1614.method1120(arg0 ^ 0xFFFF9830));
                class157.field2761.method730(false, class178.field3047.method1120(-76));
                class157.field2761.method730(false, class158.field2782.method1120(-92));
                class157.field2761.method730(false, class35.field577.method1120(84));
                class157.field2761.method730(false, class181.field3120.method1120(arg0 ^ 0x67C9));
                class157.field2761.method730(false, class105.field1920.method1120(99));
                class157.field2761.method730(false, class67.field1081.method1120(81));
                class157.field2761.method730(false, class97.field1768.method1120(-122));
                class157.field2761.method730(false, class51.field817.method1120(arg0 + 26665));
                class157.field2761.method730(false, class243.field4037.method1120(arg0 ^ 0xFFFF9833));
                class157.field2761.method730(false, class127.field2308.method1120(-127));
                class157.field2761.method730(false, field4087.method1120(-16));
                class157.field2761.method730(false, class203.field3435.method1120(arg0 + 26413));
                class157.field2761.method730(false, class296.field4956.method1120(-58));
                class157.field2761.method730(false, class154.field2728.method1120(arg0 + 26639));
                class157.field2761.method730(false, class34.field546.method1120(92));
                class157.field2761.method730(false, class252.field4209.method1120(84));
                class157.field2761.method730(false, class12.field201.method1120(98));
                class157.field2761.method730(false, class6.field50.method1120(99));
                class157.field2761.method730(false, class181.field3110.method1120(-89));
                class157.field2761.method730(false, class147.field2657.method1120(-26));
                class157.field2761.method730(false, class206.field3468.method1120(84));
                class157.field2761.method720(class187.field3229.field1653, class187.field3229.field1681, 0, -20);
                class116.field2054.method1827(0, -106, class157.field2761.field1681, class157.field2761.field1653);
                class187.field3229.method340(var5, 69);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class63.field975.method340(var5, 81);
                class131.field2364 = 4;
            }
            if (class131.field2364 == 4) {
                if (class116.field2054.method1826(arg0 ^ 0xFFFF982B) < 1) {
                    return;
                }
                int var7 = class116.field2054.method1832(25831);
                if (var7 == 21) {
                    class131.field2364 = 7;
                } else if (var7 == 29) {
                    class131.field2364 = 10;
                } else if (var7 == 1) {
                    class131.field2364 = 5;
                    class217.field3620 = var7;
                    return;
                } else if (var7 == 2) {
                    class131.field2364 = 8;
                } else if (var7 == 15) {
                    class217.field3620 = var7;
                    class131.field2364 = 0;
                    return;
                } else if (var7 == 23 && class179.field3063 < 1) {
                    class179.field3063++;
                    class88.field1570 = 0;
                    class131.field2364 = 1;
                    class116.field2054.method1829((byte) 4);
                    class116.field2054 = null;
                    return;
                } else {
                    class217.field3620 = var7;
                    class131.field2364 = 0;
                    class116.field2054.method1829((byte) 4);
                    class116.field2054 = null;
                    return;
                }
            }
            if (class131.field2364 != 6) {
                if (class131.field2364 == 7) {
                    if (class116.field2054.method1826(122) >= 1) {
                        class49.field780 = (class116.field2054.method1832(25831) + 3) * 60;
                        class217.field3620 = 21;
                        class131.field2364 = 0;
                        class116.field2054.method1829((byte) 4);
                        class116.field2054 = null;
                        return;
                    }
                    return;
                }
                if (class131.field2364 != 10) {
                    if (arg0 != -26538) {
                        field4088 = (class162) null;
                    }
                    if (class131.field2364 == 8) {
                        if (class116.field2054.method1826(98) < 12) {
                            return;
                        }
                        class116.field2054.method1830(12, (byte) 122, class63.field975.field1681, 0);
                        class63.field975.field1653 = 0;
                        class83.field1438 = class63.field975.method756(915905888);
                        class111.field2010 = class63.field975.method756(arg0 + 915932426);
                        class202.field3426 = class63.field975.method756(915905888);
                        class228.field3800 = class63.field975.method756(arg0 ^ 0xC9680536);
                        class170.field2953 = class63.field975.method756(915905888) == 1;
                        class263.field4390 = class63.field975.method761((byte) 108);
                        class95.field1733 = class63.field975.method756(915905888) == 1;
                        class261.field4356 = class63.field975.method756(915905888) == 1;
                        class143.method1122(class261.field4356, (byte) -16);
                        class8.method52(0, class261.field4356);
                        if (!class273.field4537) {
                            if (class202.field3426 == 1 || class95.field1733) {
                                try {
                                    class47.field750.method1243(arg0 + 26549, client.field1903.field469);
                                } catch (Throwable var12) {
                                }
                            } else {
                                try {
                                    class71.field1129.method1243(30, client.field1903.field469);
                                } catch (Throwable var11) {
                                }
                            }
                        }
                        class86.field1524 = class63.field975.method342(-119);
                        class244.field4045 = class63.field975.method761((byte) 108);
                        class131.field2364 = 9;
                    }
                    if (class131.field2364 == 9) {
                        if (class116.field2054.method1826(96) >= class244.field4045) {
                            class63.field975.field1653 = 0;
                            class116.field2054.method1830(class244.field4045, (byte) -123, class63.field975.field1681, 0);
                            class217.field3620 = 2;
                            class131.field2364 = 0;
                            class278.method1910(true);
                            class165.field2928 = -1;
                            class126.method1020(false, true);
                            class86.field1524 = -1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (class116.field2054.method1826(80) >= 1) {
                    class297.field4973 = class116.field2054.method1832(25831);
                    class131.field2364 = 0;
                    class217.field3620 = 29;
                    class116.field2054.method1829((byte) 4);
                    class116.field2054 = null;
                    return;
                }
                return;
            }
            class187.field3229.field1653 = 0;
            class187.field3229.method338(17, (byte) 8);
            class116.field2054.method1827(0, -116, class187.field3229.field1681, class187.field3229.field1653);
            class131.field2364 = 4;
            return;
        } catch (IOException var13) {
            if (class116.field2054 != null) {
                class116.field2054.method1829((byte) 4);
                class116.field2054 = null;
            }
            if (class179.field3063 >= 1) {
                class131.field2364 = 0;
                class217.field3620 = -4;
            } else {
                class88.field1570 = 0;
                if (class163.field2880 == class146.field2642) {
                    class146.field2642 = class243.field4033;
                } else {
                    class146.field2642 = class163.field2880;
                }
                class131.field2364 = 1;
                class179.field3063++;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 573)
    public static void method1737(int arg0) {
        field4096 = null;
        field4088 = null;
        if (arg0 != -11764) {
            field4087 = (class143) null;
        }
        field4100 = null;
        field4087 = null;
        field4095 = null;
    }

    @OriginalMember(owner = "client!kl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 595)
    public final void focusGained(FocusEvent arg0) {
        field4092++;
    }

    @OriginalMember(owner = "client!kl", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 609)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class237.field3946 != null) {
            class102.field1854 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class280.field4718.length) {
                var3 = class280.field4718[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class86.field1535 >= 0 && var3 >= 0) {
                class297.field4976[class86.field1535] = var3;
                class86.field1535 = class86.field1535 + 1 & 0x7F;
                if (class86.field1535 == class84.field1510) {
                    class86.field1535 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class94.field1679 + 1 & 0x7F;
                if (class139.field2477 != var4) {
                    class30.field503[class94.field1679] = var3;
                    class83.field1464[class94.field1679] = -1;
                    class94.field1679 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4089++;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 671)
    public static final void method1738(int arg0) {
        class190.field3253 = null;
        class306.field5152 = null;
        field4094++;
        class40.field646 = null;
        class127.field2312 = null;
        class317.field5350 = (byte[][]) null;
        int var1 = 11 % ((-arg0 - 60) / 52);
        class260.field4333 = null;
    }
}
