import java.awt.Frame;
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

@OriginalClass("client!pd")
public class class106 extends class196 {

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "[I")
    public static int[] field1652 = new int[64];

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field1656 = 0;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "S")
    public static short field1658 = 1;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "Ljava/awt/Frame;")
    public static Frame field1661;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "Ljava/lang/String;")
    public String field1663;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "[C")
    public char[] field1653;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "[C")
    public char[] field1664;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "[I")
    public int[] field1657;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "[I")
    public int[] field1667;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLkh;I)V", line = 7)
    public static final void method747(byte arg0, class7 arg1, int arg2) {
        if (arg0 != -105) {
            field1652 = (int[]) null;
        }
        field1666++;
        while (true) {
            class3 var3 = (class3) class21.field251.method1109(-100);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field11; var5++) {
                if (var3.field6[var5] != null) {
                    if (var3.field6[var5].field3456 == 2) {
                        var3.field20[var5] = -5;
                    }
                    if (var3.field6[var5].field3456 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field19[var5] != null) {
                    if (var3.field19[var5].field3456 == 2) {
                        var3.field20[var5] = -6;
                    }
                    if (var3.field19[var5].field3456 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method28(arg2, false);
            arg1.method1813(arg0 ^ 0xFFFFFFFA, 0);
            int var6 = arg1.field4025;
            arg1.method1815(arg0 + 203, var3.field12);
            for (int var7 = 0; var7 < var3.field11; var7++) {
                if (var3.field20[var7] == 0) {
                    try {
                        int var8 = var3.field10[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field6[var7].field3452;
                            int var13 = var12.getInt((Object) null);
                            arg1.method1813(43, 0);
                            arg1.method1815(arg0 + 191, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field6[var7].field3452;
                            var9.setInt((Object) null, var3.field7[var7]);
                            arg1.method1813(-122, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field6[var7].field3452;
                            int var11 = var10.getModifiers();
                            arg1.method1813(44, 0);
                            arg1.method1815(103, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field19[var7].field3452;
                            byte[][] var17 = var3.field21[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method1813(46, 0);
                            } else if ((var21 instanceof Number)) {
                                arg1.method1813(9, 1);
                                arg1.method1816(((Number) var21).longValue(), 21054);
                            } else if ((var21 instanceof String)) {
                                arg1.method1813(arg0 + 120, 2);
                                arg1.method1825((String) var21, (byte) 101);
                            } else {
                                arg1.method1813(arg0 ^ 0x9, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field19[var7].field3452;
                            int var15 = var14.getModifiers();
                            arg1.method1813(75, 0);
                            arg1.method1815(72, var15);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg1.method1813(-83, -10);
                    } catch (InvalidClassException var35) {
                        arg1.method1813(32, -11);
                    } catch (StreamCorruptedException var36) {
                        arg1.method1813(arg0 ^ 0xFFFFFF85, -12);
                    } catch (OptionalDataException var37) {
                        arg1.method1813(-78, -13);
                    } catch (IllegalAccessException var38) {
                        arg1.method1813(-81, -14);
                    } catch (IllegalArgumentException var39) {
                        arg1.method1813(58, -15);
                    } catch (InvocationTargetException var40) {
                        arg1.method1813(arg0 ^ 0x0, -16);
                    } catch (SecurityException var41) {
                        arg1.method1813(104, -17);
                    } catch (IOException var42) {
                        arg1.method1813(115, -18);
                    } catch (NullPointerException var43) {
                        arg1.method1813(-90, -19);
                    } catch (Exception var44) {
                        arg1.method1813(arg0 + 166, -20);
                    } catch (Throwable var45) {
                        arg1.method1813(arg0 ^ 0x18, -21);
                    }
                } else {
                    arg1.method1813(-121, var3.field20[var7]);
                }
            }
            arg1.method1818(var6, arg0 ^ 0xFFC9C5A7);
            arg1.method1791(-1157288507, arg1.field4025 - var6);
            var3.method714(125);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZLre;)V", line = 198)
    public final void method748(boolean arg0, class263 arg1) {
        if (arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1787(arg0);
            if (var3 == 0) {
                field1651++;
                return;
            }
            this.method749(var3, (byte) 86, arg1);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBLre;)V", line = 222)
    private final void method749(int arg0, byte arg1, class263 arg2) {
        if (arg0 == 1) {
            this.field1663 = arg2.method1801(-30054);
        } else if (arg0 == 2) {
            int var4 = arg2.method1787(false);
            this.field1657 = new int[var4];
            this.field1653 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1657[var5] = arg2.method1830((byte) -77);
                byte var6 = arg2.method1810((byte) 117);
                this.field1653[var5] = var6 == 0 ? 0 : class166.method1164(var6, (byte) 75);
            }
        } else if (arg0 == 3) {
            int var7 = arg2.method1787(false);
            this.field1664 = new char[var7];
            this.field1667 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1667[var8] = arg2.method1830((byte) -77);
                byte var9 = arg2.method1810((byte) 98);
                this.field1664[var8] = var9 == 0 ? 0 : class166.method1164(var9, (byte) 100);
            }
        } else if (arg0 != 4) {
        }
        field1654++;
        if (arg1 < 48) {
            field1652 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(CI)I", line = 287)
    public final int method750(char arg0, int arg1) {
        field1650++;
        if (this.field1657 == null) {
            return -1;
        } else if (arg1 == -255) {
            for (int var3 = 0; var3 < this.field1657.length; var3++) {
                if (this.field1653[var3] == arg0) {
                    return this.field1657[var3];
                }
            }
            return -1;
        } else {
            return 127;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 317)
    public final void method751(int arg0) {
        int var2 = 122 % ((arg0 - 34) / 58);
        field1659++;
        if (this.field1667 != null) {
            for (int var3 = 0; var3 < this.field1667.length; var3++) {
                this.field1667[var3] = class140.method1009(this.field1667[var3], 32768);
            }
        }
        if (this.field1657 != null) {
            for (int var4 = 0; var4 < this.field1657.length; var4++) {
                this.field1657[var4] = class140.method1009(this.field1657[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lij;IZLij;I)I", line = 354)
    public static final int method752(class178 arg0, int arg1, boolean arg2, class178 arg3, int arg4) {
        field1662++;
        if (~arg1 == arg4) {
            int var5 = arg3.field165;
            int var6 = arg0.field165;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg1 == 2) {
            return class212.method1473(arg0.method1230(-1).field2203, arg3.method1230(-1).field2203, (byte) 50, class256.field3882);
        } else if (arg1 == 3) {
            if (arg0.field2635.equals("-")) {
                if (arg3.field2635.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field2635.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class212.method1473(arg0.field2635, arg3.field2635, (byte) 50, class256.field3882);
            }
        } else if (arg1 == 4) {
            return arg0.method95(-1) ? (arg3.method95(-1) ? 0 : 1) : (arg3.method95(-1) ? -1 : 0);
        } else if (arg1 == 5) {
            return arg0.method96((byte) -128) ? (arg3.method96((byte) -128) ? 0 : 1) : (arg3.method96((byte) -127) ? -1 : 0);
        } else if (arg1 == 6) {
            return arg0.method98(arg4 + 6) ? (arg3.method98(arg4 + 6) ? 0 : 1) : (arg3.method98(4) ? -1 : 0);
        } else if (arg1 == 7) {
            return arg0.method94(true) ? (arg3.method94(true) ? 0 : 1) : (arg3.method94(true) ? -1 : 0);
        } else {
            return arg0.field2643 - arg3.field2643;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V", line = 421)
    public static void method753(int arg0) {
        field1661 = null;
        if (arg0 == -16) {
            field1652 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V", line = 440)
    public static final void method754(int arg0) {
        field1665++;
        class88.field1301.method2176((byte) -83);
        if (arg0 != 1) {
            field1658 = 83;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZC)I", line = 457)
    public final int method755(boolean arg0, char arg1) {
        field1660++;
        if (this.field1667 == null) {
            return -1;
        }
        if (!arg0) {
            this.method750((char) 65518, -22);
        }
        for (int var3 = 0; var3 < this.field1667.length; var3++) {
            if (this.field1664[var3] == arg1) {
                return this.field1667[var3];
            }
        }
        return -1;
    }
}
