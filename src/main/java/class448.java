import java.awt.Component;
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
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class448 extends class132 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "[Z")
    private boolean[] field6597 = new boolean[112];

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "Ljava/util/Random;")
    public static Random field6584 = new Random();

    @OriginalMember(owner = "client!sp", name = "B", descriptor = "Lwj;")
    public static class270 field6605 = new class270(81, 3);

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "Lwj;")
    public static class270 field6607;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "Lpf;")
    private class411 field6591;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "Lpf;")
    private class411 field6602;

    @OriginalMember(owner = "client!sp", name = "A", descriptor = "Lpf;")
    private class411 field6604;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field6586;

    @OriginalMember(owner = "client!sp", name = "C", descriptor = "[I")
    public static int[] field6606;

    @OriginalMember(owner = "client!sp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6600++;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method2649(byte arg0, Component arg1) {
        field6593++;
        this.method2653(121);
        this.field6586 = arg1;
        Method var3 = class504.field7432;
        if (var3 != null) {
            try {
                var3.invoke(this.field6586, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg0 == -83) {
            this.field6586.addKeyListener(this);
            this.field6586.addFocusListener(this);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Z")
    public final boolean method901(int arg0, int arg1) {
        if (arg0 == 0) {
            field6601++;
            return arg1 >= 0 && arg1 < 112 ? this.field6597[arg1] : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)V")
    public static void method2650(int arg0) {
        field6607 = null;
        field6605 = null;
        if (arg0 == -6) {
            field6606 = null;
            field6584 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field6594++;
        this.method2654(113, 0, arg0);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)V")
    public static final void method2651(int arg0, byte arg1) {
        field6608++;
        if (class492.field7178 == arg0) {
            return;
        }
        if (class492.field7178 == 0) {
            class512.method3057((byte) -128);
        }
        if (arg0 == 40) {
            class226.method1399((byte) 13);
        }
        if (arg0 != 40 && class154.field2356 != null) {
            class154.field2356.method2839(arg1 - 20940);
            class154.field2356 = null;
        }
        if (class492.field7178 == 25 || class492.field7178 == 28) {
            class356.field5196.field1541 = 2;
            class27.field358.field1541 = 2;
            class427.field6259.field1541 = 2;
            class127.field1888.field1541 = 2;
            class469.field6853.field1541 = 2;
            class115.field1719.field1541 = 2;
            class138.field1974.field1541 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class464.field6809 = 1;
            class30.field401 = 0;
            class219.field3048 = 1;
            class445.field6556 = 0;
            class509.field7554 = 0;
            class96.method706(-4701, true);
            class356.field5196.field1541 = 1;
            class27.field358.field1541 = 1;
            class427.field6259.field1541 = 1;
            class127.field1888.field1541 = 1;
            class469.field6853.field1541 = 1;
            class115.field1719.field1541 = 1;
            class138.field1974.field1541 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class368.method2218(-106);
        }
        if (arg0 == 5) {
            class26.method149(class269.field3721, class364.field5334, (byte) 15);
        } else {
            class50.method444(17755);
        }
        if (arg1 != 112) {
            method2651(-112, (byte) -10);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var3 = class492.field7178 == 5 || class492.field7178 == 10 || class492.field7178 == 28;
        if (var3 != var2) {
            if (var2) {
                class173.field2570 = class502.field7391;
                if (class20.field269.field7671 == 0) {
                    class2.method6(arg1 ^ 0x54C9, 2);
                } else {
                    class217.method1342(class20.field269.field7671, 2, false, class177.field2625, class502.field7391, -3, 0);
                }
                class366.field5366.method2383(false, (byte) -71);
            } else {
                class2.method6(21689, 2);
                class366.field5366.method2383(true, (byte) -89);
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class269.field3721.method262();
        }
        class492.field7178 = arg0;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BCII)V")
    private final void method2652(byte arg0, char arg1, int arg2, int arg3) {
        field6585++;
        if (arg0 >= -7) {
            return;
        }
        class411 var5 = new class411();
        var5.field6005 = arg3;
        var5.field6013 = arg2;
        var5.field6002 = arg1;
        var5.field6004 = class246.method1483(5957);
        if (this.field6602 == null) {
            this.field6591 = var5;
        } else {
            this.field6602.field6010 = var5;
        }
        this.field6602 = var5;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
    public final synchronized void method903(int arg0) {
        field6603++;
        for (class411 var2 = this.field6591; var2 != null; var2 = var2.field6010) {
            if (var2.field6013 == 0) {
                if (var2.field6005 >= 0) {
                    var2.field6006 = !this.field6597[var2.field6005];
                }
                this.field6597[var2.field6005] = true;
            } else if (var2.field6013 == 1) {
                this.field6597[var2.field6005] = false;
            } else if (var2.field6013 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field6597[var3] = false;
                }
            }
        }
        if (arg0 != 0) {
            field6607 = null;
        }
        this.field6604 = this.field6591;
        this.field6602 = null;
        this.field6591 = null;
    }

    @OriginalMember(owner = "client!sp", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6609++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class175.method1132(var2, -1)) {
            this.method2652((byte) -16, var2, 2, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sp", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method2654(114, 1, arg0);
        field6592++;
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)Lkg;")
    public final class178 method905(int arg0) {
        field6598++;
        if (arg0 != 1) {
            return null;
        }
        class411 var2;
        for (var2 = this.field6604; var2 != null && var2.field6013 == -1; var2 = var2.field6010) {
        }
        if (var2 == null) {
            this.field6604 = null;
        } else {
            this.field6604 = var2.field6010;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
    public final void method907(byte arg0) {
        this.method2653(-67);
        if (arg0 == 97) {
            field6589++;
        }
    }

    @OriginalMember(owner = "client!sp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method2652((byte) -11, '\u0000', -1, 0);
        field6595++;
    }

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)V")
    private final void method2653(int arg0) {
        field6587++;
        if (this.field6586 == null) {
            return;
        }
        this.field6586.removeKeyListener(this);
        this.field6586.removeFocusListener(this);
        this.field6586 = null;
        int var2 = -44 / ((arg0 - 69) / 46);
        for (int var3 = 0; var3 < 112; var3++) {
            this.field6597[var3] = false;
        }
        this.field6591 = null;
        this.field6602 = null;
        this.field6604 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
    private final void method2654(int arg0, int arg1, KeyEvent arg2) {
        field6588++;
        int var4 = arg2.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class86.field1269.length > var4) {
            int var5 = class86.field1269[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 == 0) {
            return;
        }
        this.method2652((byte) -32, '\u0000', arg1, var6);
        if (arg0 < 92) {
            this.method2654(-94, -58, null);
        }
        arg2.consume();
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLvc;I)V")
    public static final void method2655(byte arg0, class207 arg1, int arg2) {
        int var3 = 52 / ((25 - arg0) / 35);
        field6590++;
        while (true) {
            class89 var4 = (class89) class269.field3717.method2818((byte) 5);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field1296; var6++) {
                if (var4.field1299[var6] != null) {
                    if (var4.field1299[var6].field667 == 2) {
                        var4.field1295[var6] = -5;
                    }
                    if (var4.field1299[var6].field667 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field1297[var6] != null) {
                    if (var4.field1297[var6].field667 == 2) {
                        var4.field1295[var6] = -6;
                    }
                    if (var4.field1297[var6].field667 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg1.method1281(arg2, -3);
            arg1.method2302(-4, 0);
            int var7 = arg1.field5719;
            arg1.method2359(var4.field1298, -93);
            for (int var8 = 0; var8 < var4.field1296; var8++) {
                if (var4.field1295[var8] == 0) {
                    try {
                        int var9 = var4.field1293[var8];
                        if (var9 == 0) {
                            Field var10 = (Field) var4.field1299[var8].field670;
                            int var11 = var10.getInt(null);
                            arg1.method2302(-4, 0);
                            arg1.method2359(var11, -122);
                        } else if (var9 == 1) {
                            Field var12 = (Field) var4.field1299[var8].field670;
                            var12.setInt(null, var4.field1294[var8]);
                            arg1.method2302(-4, 0);
                        } else if (var9 == 2) {
                            Field var13 = (Field) var4.field1299[var8].field670;
                            int var14 = var13.getModifiers();
                            arg1.method2302(-4, 0);
                            arg1.method2359(var14, -86);
                        }
                        if (var9 == 3) {
                            Method var15 = (Method) var4.field1297[var8].field670;
                            byte[][] var16 = var4.field1300[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; var18 < var16.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke(null, var17);
                            if (var20 == null) {
                                arg1.method2302(-4, 0);
                            } else if ((var20 instanceof Number)) {
                                arg1.method2302(-4, 1);
                                arg1.method2303(((Number) var20).longValue(), (byte) -28);
                            } else if (var20 instanceof String) {
                                arg1.method2302(-4, 2);
                                arg1.method2349((String) var20, true);
                            } else {
                                arg1.method2302(-4, 4);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field1297[var8].field670;
                            int var22 = var21.getModifiers();
                            arg1.method2302(-4, 0);
                            arg1.method2359(var22, -85);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg1.method2302(-4, -10);
                    } catch (InvalidClassException var24) {
                        arg1.method2302(-4, -11);
                    } catch (StreamCorruptedException var25) {
                        arg1.method2302(-4, -12);
                    } catch (OptionalDataException var26) {
                        arg1.method2302(-4, -13);
                    } catch (IllegalAccessException var27) {
                        arg1.method2302(-4, -14);
                    } catch (IllegalArgumentException var28) {
                        arg1.method2302(-4, -15);
                    } catch (InvocationTargetException var29) {
                        arg1.method2302(-4, -16);
                    } catch (SecurityException var30) {
                        arg1.method2302(-4, -17);
                    } catch (IOException var31) {
                        arg1.method2302(-4, -18);
                    } catch (NullPointerException var32) {
                        arg1.method2302(-4, -19);
                    } catch (Exception var33) {
                        arg1.method2302(-4, -20);
                    } catch (Throwable var34) {
                        arg1.method2302(-4, -21);
                    }
                } else {
                    arg1.method2302(-4, var4.field1295[var8]);
                }
            }
            arg1.method2333((byte) -73, var7);
            arg1.method2301(arg1.field5719 - var7, -4595);
            var4.method1565(0);
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class448(Component arg0) {
        class44.method413((byte) 6);
        this.method2649((byte) -83, arg0);
    }
}
