import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class304 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[[[Lma;")
    public static class5[][][] field4750;

    @OriginalMember(owner = "client!ua", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field4761++;
        if (class5.field58 != null) {
            class281.field4345 = 0;
            class215.field3389 = arg0.getX();
            class284.field4399 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ua", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 32)
    public final synchronized void focusLost(FocusEvent arg0) {
        field4754++;
        if (class5.field58 != null) {
            class263.field4131 = 0;
        }
    }

    @OriginalMember(owner = "client!ua", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 44)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4757++;
        if (class5.field58 != null) {
            class281.field4345 = 0;
            class215.field3389 = arg0.getX();
            class284.field4399 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 64)
    public static void method2105(int arg0) {
        field4750 = (class5[][][]) null;
        if (arg0 != 0) {
            field4750 = (class5[][][]) ((class5[][][]) null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 76)
    public final void focusGained(FocusEvent arg0) {
        field4755++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lug;Lug;I)V", line = 85)
    public static final void method2106(class253 arg0, class253 arg1, int arg2) {
        class10.field178 = arg1;
        field4756++;
        class39.field551 = arg0;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class39.field551.method1826(0, 34);
        int var4 = (int) (Math.random() * 41.0D) - 20;
        if (arg2 != -7508) {
            method2107((class253) null, 20, (class159) null, (class253) null, (class253) null);
        }
        class291.field4495 = var3 + var4;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        class316.field4994 = var4 + var5;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class169.field2786 = var6 + var4;
    }

    @OriginalMember(owner = "client!ua", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 118)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class5.field58 != null) {
            class281.field4345 = 0;
            class215.field3389 = -1;
            class284.field4399 = -1;
        }
        field4764++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lug;ILll;Lug;Lug;)Z", line = 137)
    public static final boolean method2107(class253 arg0, int arg1, class159 arg2, class253 arg3, class253 arg4) {
        class282.field4367 = arg0;
        if (arg1 != 0) {
            method2109(-76, 90);
        }
        class197.field3160 = arg4;
        field4753++;
        class92.field1228 = arg2;
        class133.field1961 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILug;)I", line = 153)
    public static final int method2108(int arg0, class253 arg1) {
        field4749++;
        if (arg0 != 3518) {
            return -66;
        }
        int var2 = 0;
        if (arg1.method1837(86, class311.field4844)) {
            var2++;
        }
        if (arg1.method1837(106, class291.field4501)) {
            var2++;
        }
        if (arg1.method1837(87, class205.field3255)) {
            var2++;
        }
        if (arg1.method1837(95, class97.field1276)) {
            var2++;
        }
        if (arg1.method1837(92, class78.field1045)) {
            var2++;
        }
        if (arg1.method1837(arg0 - 3423, class158.field2446)) {
            var2++;
        }
        if (arg1.method1837(106, class39.field547)) {
            var2++;
        }
        if (arg1.method1837(arg0 ^ 0xDE8, class158.field2452)) {
            var2++;
        }
        if (arg1.method1837(86, class58.field838)) {
            var2++;
        }
        if (arg1.method1837(106, class332.field5179)) {
            var2++;
        }
        if (arg1.method1837(106, class56.field771)) {
            var2++;
        }
        if (arg1.method1837(95, class128.field1883)) {
            var2++;
        }
        if (arg1.method1837(arg0 - 3425, class83.field1133)) {
            var2++;
        }
        if (arg1.method1837(arg0 - 3402, class275.field4243)) {
            var2++;
        }
        if (arg1.method1837(125, class193.field3073)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ua", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 218)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4763++;
        if (class5.field58 != null) {
            class281.field4345 = 0;
            class3.field29 = arg0.getX();
            class69.field968 = arg0.getY();
            class125.field1803 = class219.method1609(-898);
            if (arg0.isMetaDown()) {
                class63.field924 = 2;
                class263.field4131 = 2;
            } else {
                class63.field924 = 1;
                class263.field4131 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lek;", line = 269)
    public static final class224 method2109(int arg0, int arg1) {
        field4760++;
        if (arg1 < 60) {
            method2109(-28, -42);
        }
        class224 var2 = (class224) class281.field4340.method1628(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class52.field662.method1813(class158.method1148(arg0, (byte) 127), class256.method1858((byte) -15, arg0), true);
        class224 var4 = new class224();
        if (var3 != null) {
            var4.method1636(121, new class6(var3));
        }
        class281.field4340.method1627((byte) 97, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 293)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class5.field58 != null) {
            class281.field4345 = 0;
            class263.field4131 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        field4748++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ua", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 326)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4758++;
    }

    @OriginalMember(owner = "client!ua", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 338)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4752++;
        if (class5.field58 != null) {
            class281.field4345 = 0;
            class215.field3389 = arg0.getX();
            class284.field4399 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 357)
    public static final void method2110(int arg0) {
        if (arg0 <= 82) {
            method2107((class253) null, -65, (class159) null, (class253) null, (class253) null);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class130.field1918[var1] = false;
        }
        class14.field236 = 0;
        class319.field5044 = 0;
        class185.field3006 = -1;
        field4762++;
        class166.field2715 = 5;
        class255.field4035 = -1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lpe;ZI)V", line = 381)
    public static final void method2111(class277 arg0, boolean arg1, int arg2) {
        field4751++;
        if (!arg1) {
            field4750 = (class5[][][]) ((class5[][][]) null);
        }
        while (true) {
            class269 var3 = (class269) class234.field3657.method22((byte) 123);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4180; var5++) {
                if (var3.field4178[var5] != null) {
                    if (var3.field4178[var5].field1595 == 2) {
                        var3.field4190[var5] = -5;
                    }
                    if (var3.field4178[var5].field1595 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4183[var5] != null) {
                    if (var3.field4183[var5].field1595 == 2) {
                        var3.field4190[var5] = -6;
                    }
                    if (var3.field4183[var5].field1595 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1947((byte) -102, arg2);
            arg0.method81((byte) -104, 0);
            int var6 = arg0.field111;
            arg0.method34(var3.field4186, 294335144);
            for (int var7 = 0; var7 < var3.field4180; var7++) {
                if (var3.field4190[var7] == 0) {
                    try {
                        int var8 = var3.field4187[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field4178[var7].field1591;
                            int var13 = var12.getInt((Object) null);
                            arg0.method81((byte) -100, 0);
                            arg0.method34(var13, 294335144);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field4178[var7].field1591;
                            var11.setInt((Object) null, var3.field4189[var7]);
                            arg0.method81((byte) -118, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field4178[var7].field1591;
                            int var10 = var9.getModifiers();
                            arg0.method81((byte) -106, 0);
                            arg0.method34(var10, 294335144);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field4183[var7].field1591;
                            byte[][] var17 = var3.field4175[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method81((byte) -101, 0);
                            } else if (var21 instanceof Number) {
                                arg0.method81((byte) -117, 1);
                                arg0.method53((byte) -125, ((Number) var21).longValue());
                            } else if ((var21 instanceof String)) {
                                arg0.method81((byte) -121, 2);
                                arg0.method48(128, (String) var21);
                            } else {
                                arg0.method81((byte) -111, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4183[var7].field1591;
                            int var15 = var14.getModifiers();
                            arg0.method81((byte) -122, 0);
                            arg0.method34(var15, 294335144);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method81((byte) -119, -10);
                    } catch (InvalidClassException var35) {
                        arg0.method81((byte) -107, -11);
                    } catch (StreamCorruptedException var36) {
                        arg0.method81((byte) -110, -12);
                    } catch (OptionalDataException var37) {
                        arg0.method81((byte) -123, -13);
                    } catch (IllegalAccessException var38) {
                        arg0.method81((byte) -99, -14);
                    } catch (IllegalArgumentException var39) {
                        arg0.method81((byte) -104, -15);
                    } catch (InvocationTargetException var40) {
                        arg0.method81((byte) -124, -16);
                    } catch (SecurityException var41) {
                        arg0.method81((byte) -113, -17);
                    } catch (IOException var42) {
                        arg0.method81((byte) -115, -18);
                    } catch (NullPointerException var43) {
                        arg0.method81((byte) -114, -19);
                    } catch (Exception var44) {
                        arg0.method81((byte) -104, -20);
                    } catch (Throwable var45) {
                        arg0.method81((byte) -108, -21);
                    }
                } else {
                    arg0.method81((byte) -117, var3.field4190[var7]);
                }
            }
            arg0.method51(var6, 101);
            arg0.method64(arg0.field111 - var6, 1557888296);
            var3.method2028(13329);
        }
    }
}
