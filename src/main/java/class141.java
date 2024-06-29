import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class141 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lsf;")
    public static class108 field2479 = class140.method973(255, "l");

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lhe;")
    public static class94 field2483 = new class94(64);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!jd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 4)
    public final void focusGained(FocusEvent arg0) {
        field2488++;
    }

    @OriginalMember(owner = "client!jd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 14)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class206.field3694 != null) {
            class134.field2315 = 0;
            class19.field274 = arg0.getX();
            class232.field4108 = arg0.getY();
            class221.field3930 = class118.method835(-1272);
            if (arg0.isMetaDown()) {
                class295.field5157 = 2;
                class211.field3770 = 2;
            } else {
                class295.field5157 = 1;
                class211.field3770 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2478++;
    }

    @OriginalMember(owner = "client!jd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 63)
    public final void mouseClicked(MouseEvent arg0) {
        field2480++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZZIII)V", line = 78)
    public static final void method977(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2484++;
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (class231.field4051) {
            int var6 = arg0 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = class35.field485 + ((class45.field642 - class35.field485) * var6 / 100);
            if (var7 < class137.field2416) {
                var7 = class137.field2416;
            } else if (class301.field5238 < var7) {
                var7 = class301.field5238;
            }
            int var8 = arg0 * 512 * var7 / (arg4 * 334);
            if (class326.field5553 > var8) {
                short var12 = class326.field5553;
                var7 = arg4 * var12 * 334 / (arg0 * 512);
                if (class301.field5238 < var7) {
                    var7 = class301.field5238;
                    int var13 = var7 * 512 * arg0 / (var12 * 334);
                    int var14 = (arg4 - var13) / 2;
                    if (arg2) {
                        class50.method351();
                        class50.method348(arg5, arg3, var14, arg0, 0);
                        class50.method348(arg4 + arg5 - var14, arg3, var14, arg0, 0);
                    }
                    arg4 -= var14 * 2;
                    arg5 += var14;
                }
            } else if (var8 > class52.field773) {
                short var9 = class52.field773;
                var7 = arg4 * 334 * var9 / (arg0 * 512);
                if (class137.field2416 > var7) {
                    var7 = class137.field2416;
                    int var10 = arg4 * 334 * var9 / (var7 * 512);
                    int var11 = (arg0 - var10) / 2;
                    if (arg2) {
                        class50.method351();
                        class50.method348(arg5, arg3, arg4, var11, 0);
                        class50.method348(arg5, arg0 + arg3 - var11, arg4, var11, 0);
                    }
                    arg0 -= var11 * 2;
                    arg3 += var11;
                }
            }
            class144.field2538 = arg0 * var7 / 334;
        }
        class311.field5370 = arg3;
        class234.field4137 = (short) arg4;
        if (!arg1) {
            class9.field109 = arg5;
            class155.field2790 = (short) arg0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 178)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2490++;
        if (class206.field3694 != null) {
            class211.field3770 = 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 194)
    public static final void method978(int arg0) {
        int var1 = client.field4529.length;
        if (arg0 != -1) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (client.field4529[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class59.field885; var4++) {
                    if (class66.field1043[var4] == class57.field838[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class66.field1043[class59.field885] = class57.field838[var2];
                    var3 = class59.field885++;
                }
                class249 var5 = new class249(client.field4529[var2]);
                int var6 = 0;
                while (client.field4529[var2].length > var5.field4314 && var6 < 511) {
                    int var7 = var5.method1712(-1);
                    int var8 = var7 >> 7 & 0x3F;
                    int var9 = (class57.field838[var2] >> 8) * 64 + var8 - class305.field5295;
                    int var10 = var7 >> 14;
                    int var11 = var3 | var6++ << 6;
                    int var12 = var7 & 0x3F;
                    int var13 = (class57.field838[var2] & 0xFF) * 64 + var12 - class137.field2421;
                    class136 var14 = class57.method397(0, var5.method1712(-1));
                    if (class159.field2863[var11] == null && (var14.field2413 & 0x1) > 0 && class90.field1416 == var10 && var9 >= 0 && (var9 + var14.field2381) < 104 && var13 >= 0 && var14.field2381 + var13 < 104) {
                        class159.field2863[var11] = new class45();
                        class45 var15 = class159.field2863[var11];
                        class168.field3020[class61.field969++] = var11;
                        var15.field4459 = class116.field2000;
                        var15.method317(0, var14);
                        var15.method1810(var15.field646.field2381, -110);
                        var15.field4486 = var15.field4518 = class276.field4831[var15.field646.field2362];
                        var15.field4465 = var15.field646.field2353;
                        var15.field4455 = var15.field646.field2401;
                        var15.field4497 = var15.field646.field2409;
                        var15.field4510 = var15.field646.field2398;
                        var15.field4470 = var15.field646.field2371;
                        var15.field4496 = var15.field646.field2377;
                        if (var15.field4510 == 0) {
                            var15.field4518 = 0;
                        }
                        var15.field4449 = var15.field646.field2370;
                        var15.field4490 = var15.field646.field2404;
                        var15.method1804(var9, true, var13, var15.method363((byte) 87), 16852);
                    }
                }
            }
        }
        field2492++;
    }

    @OriginalMember(owner = "client!jd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 303)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2489++;
        if (class206.field3694 != null) {
            class134.field2315 = 0;
            class92.field1475 = arg0.getX();
            class312.field5398 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 320)
    public static void method979(int arg0) {
        if (arg0 != -1) {
            method978(-30);
        }
        field2479 = null;
        field2483 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)V", line = 332)
    public static final void method980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class15.field197 = arg3;
        class135.field2343 = arg0;
        if (arg5 != -525) {
            return;
        }
        field2486++;
        class52.field771 = arg4;
        class178.field3232 = arg2;
        class117.field2026 = arg1;
        if (class135.field2343 >= 100) {
            int var6 = class117.field2026 * 128 + 64;
            int var7 = class15.field197 * 128 + 64;
            int var8 = class45.method321(arg5 + 649, var7, var6, class295.field5159) - class52.field771;
            int var9 = var8 - class42.field560;
            int var10 = var7 - class255.field4443;
            int var11 = var6 - class15.field193;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class135.field2346 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class330.field5640 = (int) (-325.949D * Math.atan2((double) var11, (double) var10)) & 0x7FF;
            if (class135.field2346 < 128) {
                class135.field2346 = 128;
            }
            if (class135.field2346 > 383) {
                class135.field2346 = 383;
            }
        }
        class63.field1021 = 2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 380)
    public static final void method981(byte arg0) {
        class74.field1115.method639(-47);
        if (arg0 <= 89) {
            field2481 = 45;
        }
        field2487++;
    }

    @OriginalMember(owner = "client!jd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 408)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class206.field3694 != null) {
            class134.field2315 = 0;
            class211.field3770 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2494++;
    }

    @OriginalMember(owner = "client!jd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 446)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class206.field3694 != null) {
            class134.field2315 = 0;
            class92.field1475 = -1;
            class312.field5398 = -1;
        }
        field2493++;
    }

    @OriginalMember(owner = "client!jd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 462)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class206.field3694 != null) {
            class134.field2315 = 0;
            class92.field1475 = arg0.getX();
            class312.field5398 = arg0.getY();
        }
        field2482++;
    }

    @OriginalMember(owner = "client!jd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 478)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2485++;
        if (class206.field3694 != null) {
            class134.field2315 = 0;
            class92.field1475 = arg0.getX();
            class312.field5398 = arg0.getY();
        }
    }
}
