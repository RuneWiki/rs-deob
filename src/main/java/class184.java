import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class184 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2888 = "Please remove ";

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field2898 = -1;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field2903 = 0;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Ljb;")
    public static class269 field2892;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
    public static int[] field2886;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method1244(byte arg0) {
        field2886 = null;
        field2888 = null;
        field2892 = null;
        if (arg0 >= -92) {
            field2903 = -73;
        }
    }

    @OriginalMember(owner = "client!ag", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class12.field234 != null) {
            class220.field3601 = 0;
            class83.field1300 = arg0.getX();
            class85.field1357 = arg0.getY();
            class4.field54 = class276.method1861((byte) 122);
            if (arg0.isMetaDown()) {
                class90.field1493 = 2;
                class241.field3895 = 2;
            } else {
                class90.field1493 = 1;
                class241.field3895 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2897++;
    }

    @OriginalMember(owner = "client!ag", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class12.field234 != null) {
            class220.field3601 = 0;
            class43.field803 = -1;
            class221.field3635 = -1;
        }
        field2885++;
    }

    @OriginalMember(owner = "client!ag", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2894++;
        if (class12.field234 != null) {
            class220.field3601 = 0;
            class43.field803 = arg0.getX();
            class221.field3635 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1245(String arg0, int arg1) {
        if (arg1 == 10) {
            field2887++;
            return class275.method1858(true, 87, arg0, 10);
        } else {
            return 75;
        }
    }

    @OriginalMember(owner = "client!ag", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class12.field234 != null) {
            class241.field3895 = 0;
        }
        field2893++;
    }

    @OriginalMember(owner = "client!ag", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2890++;
    }

    @OriginalMember(owner = "client!ag", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2902++;
        if (class12.field234 != null) {
            class220.field3601 = 0;
            class43.field803 = arg0.getX();
            class221.field3635 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
    public static final void method1246(byte arg0) {
        field2896++;
        if (class142.field2296 == null) {
            return;
        }
        if (class139.field2278 < 10) {
            if (!class176.field2771.method1356(class142.field2296.field930, (byte) 123)) {
                class139.field2278 = class29.field462.method1363((byte) -90, class142.field2296.field930) / 10;
                return;
            }
            class36.method298((byte) -18);
            class139.field2278 = 10;
        }
        if (class139.field2278 == 10) {
            class161.field2568 = class142.field2296.field935 >> 6 << 6;
            int var1 = (class167.field2655.field3389 >> 7) + class50.field884 - class161.field2568;
            class1.field17 = (class142.field2296.field934 >> 6 << 6) + 64 - class161.field2568;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            class223.field3692 = class142.field2296.field948 >> 6 << 6;
            if (class142.field2296.field941 == 37) {
                class221.field3668 = 3.0F;
                class28.field445 = 3.0F;
            } else if (class142.field2296.field941 == 50) {
                class221.field3668 = 4.0F;
                class28.field445 = 4.0F;
            } else if (class142.field2296.field941 == 75) {
                class221.field3668 = 6.0F;
                class28.field445 = 6.0F;
            } else if (class142.field2296.field941 == 100) {
                class221.field3668 = 8.0F;
                class28.field445 = 8.0F;
            } else if (class142.field2296.field941 == 200) {
                class221.field3668 = 16.0F;
                class28.field445 = 16.0F;
            } else {
                class221.field3668 = 8.0F;
                class28.field445 = 8.0F;
            }
            class210.field3428 = (class142.field2296.field933 >> 6 << 6) + 64 - class223.field3692;
            int var3 = class210.field3428 - (1 - class223.field3692) - class214.field3501 - (class167.field2655.field3341 >> 7);
            int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
            if (var2 >= 0 && class1.field17 > var2 && var4 >= 0 && var4 < class210.field3428) {
                class28.field448 = var2;
                class126.field2046 = var4;
            } else {
                class126.field2046 = -(class142.field2296.field938 * 64) - (-class223.field3692 - (class210.field3428 - 1));
                class28.field448 = class142.field2296.field936 * 64 - class161.field2568;
            }
            class6.method47(87);
            int var5 = class1.field17 >> 6;
            int var6 = class141.field2280 >> 1;
            class7.field90 = new int[class158.field2558 + 1];
            int var7 = class195.field3122 >> 2 << 10;
            int var8 = class210.field3428 >> 6;
            class273.field4306 = new byte[var5][var8][];
            class118.field1938 = new int[var5][var8][];
            class196.field3131 = new byte[var5][var8][];
            class95.field1559 = new int[var5][var8][];
            class102.field1672 = new byte[var5][var8][];
            class119.field1948 = new byte[var5][var8][];
            class195.field3115 = new byte[var5][var8][];
            class183.field2878 = new int[var5][var8][];
            class16.method131(var7, arg0 - 117, var6);
            class139.field2278 = 20;
        } else if (class139.field2278 == 20) {
            class194.method1324(new class221(class176.field2771.method1376(class142.field2296.field930, (byte) 44, "underlay")), true);
            class139.field2278 = 30;
            class6.method46(-98, true);
            class235.method1636((byte) 114);
        } else if (class139.field2278 == 30) {
            class36.method295(-1246565082, new class221(class176.field2771.method1376(class142.field2296.field930, (byte) 44, "overlay")));
            class139.field2278 = 40;
            class235.method1636((byte) 111);
        } else if (class139.field2278 == 40) {
            class194.method1321(-118, new class221(class176.field2771.method1376(class142.field2296.field930, (byte) 44, "overlay2")));
            class139.field2278 = 50;
            class235.method1636((byte) 127);
        } else {
            if (arg0 != 117) {
                method1245((String) null, -50);
            }
            if (class139.field2278 == 50) {
                class164.method1131(new class221(class176.field2771.method1376(class142.field2296.field930, (byte) 44, "loc")), 70);
                class139.field2278 = 60;
                class6.method46(arg0 - 238, true);
                class235.method1636((byte) 88);
            } else if (class139.field2278 == 60) {
                if (class176.field2771.method1365(class142.field2296.field930 + "_labels", -110)) {
                    if (!class176.field2771.method1356(class142.field2296.field930 + "_labels", (byte) 85)) {
                        return;
                    }
                    class153.field2479 = class85.method623(class176.field2771, 0, class142.field2296.field930 + "_labels");
                } else {
                    class153.field2479 = new class16(0);
                }
                class139.field2278 = 70;
                class235.method1636((byte) 102);
            } else if (class139.field2278 == 70) {
                class121.field1974 = new class147(11, true, class155.field2511);
                class139.field2278 = 73;
                class6.method46(-107, true);
                class235.method1636((byte) 98);
            } else if (class139.field2278 == 73) {
                class79.field1262 = new class147(12, true, class155.field2511);
                class139.field2278 = 76;
                class6.method46(-121, true);
                class235.method1636((byte) 120);
            } else if (class139.field2278 == 76) {
                class205.field3294 = new class147(14, true, class155.field2511);
                class139.field2278 = 79;
                class6.method46(-100, true);
                class235.method1636((byte) 103);
            } else if (class139.field2278 == 79) {
                class189.field3061 = new class147(17, true, class155.field2511);
                class139.field2278 = 82;
                class6.method46(-85, true);
                class235.method1636((byte) 90);
            } else if (class139.field2278 == 82) {
                class176.field2772 = new class147(19, true, class155.field2511);
                class139.field2278 = 85;
                class6.method46(arg0 - 233, true);
                class235.method1636((byte) 112);
            } else if (class139.field2278 == 85) {
                class155.field2509 = new class147(22, true, class155.field2511);
                class139.field2278 = 88;
                class6.method46(-88, true);
                class235.method1636((byte) 125);
            } else if (class139.field2278 == 88) {
                class247.field3938 = new class147(26, true, class155.field2511);
                class139.field2278 = 91;
                class6.method46(arg0 ^ 0xFFFFFFEC, true);
                class235.method1636((byte) 102);
            } else {
                class44.field804 = new class147(30, true, class155.field2511);
                class139.field2278 = 100;
                class6.method46(arg0 - 224, true);
                class235.method1636((byte) 92);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2899++;
        if (class12.field234 != null) {
            class220.field3601 = 0;
            class43.field803 = arg0.getX();
            class221.field3635 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V")
    public static final void method1247(byte arg0) {
        class280.method1886(client.field2517, 32);
        class239.field3877++;
        field2900++;
        if (class109.field1805 && client.field2523) {
            int var1 = class241.field3898;
            int var2 = var1 - class241.field3900;
            int var3 = class109.field1801;
            int var4 = var3 - class107.field1711;
            int var5 = client.field2517.field612;
            if (class110.field1815 > var2) {
                var2 = class110.field1815;
            }
            if ((client.field2517.field642 + var2) > (class110.field1815 + class173.field2725.field642)) {
                var2 = class110.field1815 + class173.field2725.field642 - client.field2517.field642;
            }
            int var6 = var2 - class96.field1566;
            if (var4 < class78.field1258) {
                var4 = class78.field1258;
            }
            int var7 = class173.field2725.field630 + var2 - class110.field1815;
            if (class78.field1258 + class173.field2725.field676 < client.field2517.field676 + var4) {
                var4 = class78.field1258 + class173.field2725.field676 - client.field2517.field676;
            }
            int var8 = var4 - class161.field2563;
            int var9 = var4 + class173.field2725.field571 - class78.field1258;
            if (client.field2517.field574 < class239.field3877 && (var6 > var5 || -var5 > var6 || var8 > var5 || (-var5) > var8)) {
                class67.field1108 = true;
            }
            if (client.field2517.field679 != null && class67.field1108) {
                class213 var10 = new class213();
                var10.field3491 = var7;
                var10.field3480 = client.field2517;
                var10.field3487 = var9;
                var10.field3477 = client.field2517.field679;
                class89.method645(-89, var10);
            }
            if (arg0 < 60) {
                method1249(-120, (class207) null);
            }
            if (class270.field4259 == 0) {
                if (class67.field1108) {
                    if (client.field2517.field703 != null) {
                        class213 var11 = new class213();
                        var11.field3477 = client.field2517.field703;
                        var11.field3480 = client.field2517;
                        var11.field3491 = var7;
                        var11.field3485 = class108.field1787;
                        var11.field3487 = var9;
                        class89.method645(-97, var11);
                    }
                    if (class108.field1787 != null && client.method1088(client.field2517) != null) {
                        class278.field4371++;
                        class68.field1113.method534((byte) -100, 51);
                        class68.field1113.method1547(class108.field1787.field661, (byte) 58);
                        class68.field1113.method1514(client.field2517.field661, (byte) -104);
                        class68.field1113.method1504((byte) 123, class108.field1787.field648);
                        class68.field1113.method1557(client.field2517.field648, (byte) -92);
                    }
                } else if ((class222.field3683 == 1 || class45.method366((byte) -86, class205.field3291 - 1)) && class205.field3291 > 2) {
                    class180.method1225(22);
                } else if (class205.field3291 > 0) {
                    class179.method1222(15444);
                }
                client.field2517 = null;
            }
        } else if (class239.field3877 > 1) {
            client.field2517 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2891++;
    }

    @OriginalMember(owner = "client!ag", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2895++;
        if (class12.field234 != null) {
            class220.field3601 = 0;
            class241.field3895 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1248(int arg0, String arg1) {
        field2901++;
        if (arg0 != 64) {
            method1248(-110, (String) null);
        }
        String var2 = class141.method979(class74.method522((byte) -73, arg1), (byte) -117);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILnb;)V")
    public static final void method1249(int arg0, class207 arg1) {
        field2889++;
        int var2 = arg1.field3373 - class222.field3682;
        int var3 = arg1.field3357 * 128 + (arg1.method278(arg0 + 26236) * 64);
        int var4 = arg1.field3370 * 128 + arg1.method278(0) * 64;
        arg1.field3337 = 0;
        if (arg0 != -26236) {
            method1245((String) null, -33);
        }
        arg1.field3389 += (var3 - arg1.field3389) / var2;
        if (arg1.field3375 == 0) {
            arg1.field3322 = 1024;
        }
        arg1.field3341 += (var4 - arg1.field3341) / var2;
        if (arg1.field3375 == 1) {
            arg1.field3322 = 1536;
        }
        if (arg1.field3375 == 2) {
            arg1.field3322 = 0;
        }
        if (arg1.field3375 == 3) {
            arg1.field3322 = 512;
        }
    }
}
