import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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

@OriginalClass("client!kb")
public class class70 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lvc;")
    public static class137 field1472 = class45.method325("0(U", -46);

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lvc;")
    private static class137 field1475 = class45.method325("Unexpected server response", -46);

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lvc;")
    public static class137 field1477 = class45.method325("l", -46);

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lvc;")
    public static class137 field1479 = class45.method325("Benutzen Sie die (WPasswort -=ndern(W Option", -46);

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "[[I")
    public static int[][] field1483 = new int[104][104];

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lvc;")
    public static class137 field1484 = class45.method325("leuchten3:", -46);

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "[[[B")
    public static byte[][][] field1490 = new byte[4][104][104];

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field1489 = 0;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lvc;")
    private static class137 field1482 = class45.method325("flash1:", -46);

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lvc;")
    public static class137 field1473 = field1475;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lvc;")
    public static class137 field1485 = class45.method325(" ", -46);

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lvc;")
    public static class137 field1488 = field1482;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Lvc;")
    public static class137 field1492 = class45.method325("Benutzen", -46);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lnb;")
    public static class88 field1480;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILr;I)V")
    public static final void method491(int arg0, class110 arg1, int arg2) {
        field1471++;
        int var3 = -57 / ((-arg2 - 6) / 57);
        while (true) {
            class91 var4 = (class91) class22.field514.method726(0);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field2167; var6++) {
                if (var4.field2154[var6] != null) {
                    if (var4.field2154[var6].field3131 == 2) {
                        var4.field2160[var6] = -5;
                    }
                    if (var4.field2154[var6].field3131 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field2164[var6] != null) {
                    if (var4.field2164[var6].field3131 == 2) {
                        var4.field2160[var6] = -6;
                    }
                    if (var4.field2164[var6].field3131 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg1.method845(arg0, 100);
            arg1.method837(105, 0);
            int var7 = arg1.field2583;
            arg1.method817(-2770, var4.field2149);
            for (int var8 = 0; var8 < var4.field2167; var8++) {
                if (var4.field2160[var8] == 0) {
                    try {
                        int var9 = var4.field2146[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field2154[var8].field3129;
                            int var14 = var13.getInt(null);
                            arg1.method837(-71, 0);
                            arg1.method817(-2770, var14);
                        } else if (var9 == 1) {
                            Field var12 = (Field) var4.field2154[var8].field3129;
                            var12.setInt(null, var4.field2168[var8]);
                            arg1.method837(57, 0);
                        } else if (var9 == 2) {
                            Field var10 = (Field) var4.field2154[var8].field3129;
                            int var11 = var10.getModifiers();
                            arg1.method837(120, 0);
                            arg1.method817(-2770, var11);
                        }
                        if (var9 == 3) {
                            byte[][] var17 = var4.field2150[var8];
                            Method var18 = (Method) var4.field2164[var8].field3129;
                            Object[] var19 = new Object[var17.length];
                            for (int var20 = 0; var20 < var17.length; var20++) {
                                ObjectInputStream var21 = new ObjectInputStream(new ByteArrayInputStream(var17[var20]));
                                var19[var20] = var21.readObject();
                            }
                            Object var22 = var18.invoke(null, var19);
                            if (var22 == null) {
                                arg1.method837(-116, 0);
                            } else if (var22 instanceof Number) {
                                arg1.method837(-101, 1);
                                arg1.method840(false, ((Number) var22).longValue());
                            } else if (var22 instanceof class137) {
                                arg1.method837(-62, 2);
                                arg1.method826(false, (class137) var22);
                            } else {
                                arg1.method837(120, 4);
                            }
                        } else if (var9 == 4) {
                            Method var15 = (Method) var4.field2164[var8].field3129;
                            int var16 = var15.getModifiers();
                            arg1.method837(-126, 0);
                            arg1.method817(-2770, var16);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg1.method837(79, -10);
                    } catch (InvalidClassException var24) {
                        arg1.method837(123, -11);
                    } catch (StreamCorruptedException var25) {
                        arg1.method837(-57, -12);
                    } catch (OptionalDataException var26) {
                        arg1.method837(-89, -13);
                    } catch (IllegalAccessException var27) {
                        arg1.method837(58, -14);
                    } catch (IllegalArgumentException var28) {
                        arg1.method837(57, -15);
                    } catch (InvocationTargetException var29) {
                        arg1.method837(72, -16);
                    } catch (SecurityException var30) {
                        arg1.method837(109, -17);
                    } catch (IOException var31) {
                        arg1.method837(-79, -18);
                    } catch (NullPointerException var32) {
                        arg1.method837(83, -19);
                    } catch (Exception var33) {
                        arg1.method837(-73, -20);
                    } catch (Throwable var34) {
                        arg1.method837(105, -21);
                    }
                } else {
                    arg1.method837(58, var4.field2160[var8]);
                }
            }
            arg1.method796(var7, -16234);
            arg1.method810(2057446968, arg1.field2583 - var7);
            var4.method776(0);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    public static void method492(boolean arg0) {
        field1490 = null;
        field1477 = null;
        field1482 = null;
        field1473 = null;
        field1479 = null;
        field1488 = null;
        field1492 = null;
        field1472 = null;
        field1484 = null;
        field1483 = null;
        if (!arg0) {
            field1485 = null;
        }
        field1485 = null;
        field1480 = null;
        field1475 = null;
    }

    @OriginalMember(owner = "client!kb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1487++;
        if (class78.field1725 != null) {
            class24.field582 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class106.field2474.length) {
                var3 = class106.field2474[var2];
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
                var4 = class58.method412(-1, arg0);
            }
            if (class104.field2423 >= 0 && var3 >= 0) {
                class29.field638[class104.field2423] = var3;
                class104.field2423 = class104.field2423 + 1 & 0x7F;
                if (class46.field1041 == class104.field2423) {
                    class104.field2423 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class21.field437 + 1 & 0x7F;
                if (class2.field46 != var5) {
                    class89.field2129[class21.field437] = var3;
                    class23.field534[class21.field437] = var4;
                    class21.field437 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!kb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class78.field1725 != null) {
            class24.field582 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class106.field2474.length) {
                var3 = class106.field2474[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class104.field2423 >= 0 && var3 >= 0) {
                class29.field638[class104.field2423] = ~var3;
                class104.field2423 = class104.field2423 + 1 & 0x7F;
                if (class46.field1041 == class104.field2423) {
                    class104.field2423 = -1;
                }
            }
        }
        field1481++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!kb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
        field1491++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILwe;BI)V")
    public static final void method493(int arg0, int arg1, class145 arg2, byte arg3, int arg4) {
        field1486++;
        class93.field2213.method680(90);
        class99.field2305.method394(0, 0);
        arg2.method1138(class93.field2209, 55, 28, 16777215, true);
        if (arg4 == 0) {
            arg2.method1138(class112.field2678, 55, 41, 65280, true);
        }
        if (arg4 == 1) {
            arg2.method1138(class98.field2284, 55, 41, 16776960, true);
        }
        if (arg4 == 2) {
            arg2.method1138(class85.field2020, 55, 41, 16711680, true);
        }
        if (arg4 == 3) {
            arg2.method1138(class46.field1029, 55, 41, 65535, true);
        }
        arg2.method1138(class23.field539, 184, 28, 16777215, true);
        if (arg0 == 0) {
            arg2.method1138(class112.field2678, 184, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg2.method1138(class98.field2284, 184, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg2.method1138(class85.field2020, 184, 41, 16711680, true);
        }
        arg2.method1138(class106.field2481, 324, 28, 16777215, true);
        if (arg1 == 0) {
            arg2.method1138(class112.field2678, 324, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg2.method1138(class98.field2284, 324, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg2.method1138(class85.field2020, 324, 41, 16711680, true);
        }
        arg2.method1134(class46.field1040, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class124.field2871.getGraphics();
            int var6 = 84 % ((arg3 - 65) / 42);
            class93.field2213.method61(0, var5, 453, (byte) -89);
        } catch (Exception var7) {
            class124.field2871.repaint();
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method494(byte arg0) {
        field1478++;
        try {
            Graphics var1 = class124.field2871.getGraphics();
            class107.field2482.method61(0, var1, 4, (byte) -127);
            class73.field1544.method61(0, var1, 357, (byte) -114);
            class49.field1104.method61(722, var1, 4, (byte) -100);
            class13.field290.method61(743, var1, 205, (byte) -44);
            class120.field2805.method61(0, var1, 0, (byte) -69);
            class105.field2428.method61(516, var1, 4, (byte) -94);
            class103.field2398.method61(516, var1, 205, (byte) -63);
            if (arg0 == -23) {
                class19.field410.method61(496, var1, 357, (byte) -64);
                class116.field2766.method61(0, var1, 338, (byte) -121);
            }
        } catch (Exception var2) {
            class124.field2871.repaint();
        }
    }

    @OriginalMember(owner = "client!kb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1476++;
    }

    @OriginalMember(owner = "client!kb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1474++;
        if (class78.field1725 != null) {
            class104.field2423 = -1;
        }
    }
}
