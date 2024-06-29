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

@OriginalClass("client!hg")
public abstract class class91 {

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field1750 = -2;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "[I")
    public static int[] field1753 = new int[128];

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "Lr;")
    public static class66 field1758 = class93.method641(43, "Fallen lassen");

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Lr;")
    public static class66 field1759 = class93.method641(43, "::fps ");

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Lr;")
    public static class66 field1762 = class93.method641(43, "null");

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Lr;")
    private static class66 field1751 = class93.method641(43, " is already on your friend list)3");

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Lr;")
    public static class66 field1755 = field1751;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Lc;")
    public static class125 field1754 = new class125();

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Llh;")
    public static class249 field1749;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method635(int arg0) {
        field1758 = null;
        field1754 = null;
        field1759 = null;
        field1762 = null;
        int var1 = 89 / ((arg0 - 55) / 57);
        field1749 = null;
        field1753 = null;
        field1755 = null;
        field1751 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IJ)V")
    public static final void method636(int arg0, long arg1) {
        field1757++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class122.method825(false, arg1 - 1L);
            class122.method825(false, 1L);
        } else {
            class122.method825(false, arg1);
        }
        if (arg0 != -5) {
            method637(false, false);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public abstract void method210(boolean arg0);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZZ)V")
    public static final void method637(boolean arg0, boolean arg1) {
        field1748++;
        if (class147.field2674 == null) {
            return;
        }
        try {
            class249 var2 = new class249(4);
            var2.method1638(32, arg0 ? 2 : 3);
            var2.method1645(0, arg1);
            class147.field2674.method1273(0, (byte) 116, 4, var2.field4350);
        } catch (IOException var4) {
            try {
                class147.field2674.method1277(-125);
            } catch (Exception var3) {
            }
            class147.field2674 = null;
            class49.field880++;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZILcc;)V")
    public static final void method638(boolean arg0, int arg1, class83 arg2) {
        field1761++;
        if (arg0) {
            method635(-39);
        }
        while (true) {
            class35 var3 = (class35) field1754.method873((byte) 76);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field519; var5++) {
                if (var3.field533[var5] != null) {
                    if (var3.field533[var5].field4066 == 2) {
                        var3.field523[var5] = -5;
                    }
                    if (var3.field533[var5].field4066 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field529[var5] != null) {
                    if (var3.field529[var5].field4066 == 2) {
                        var3.field523[var5] = -6;
                    }
                    if (var3.field529[var5].field4066 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method578(-53, arg1);
            arg2.method1638(32, 0);
            int var6 = arg2.field4335;
            arg2.method1666(544537784, var3.field532);
            for (int var7 = 0; var7 < var3.field519; var7++) {
                if (var3.field523[var7] == 0) {
                    try {
                        int var8 = var3.field524[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field533[var7].field4069;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1638(32, 0);
                            arg2.method1666(544537784, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field533[var7].field4069;
                            var11.setInt((Object) null, var3.field528[var7]);
                            arg2.method1638(32, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field533[var7].field4069;
                            int var13 = var12.getModifiers();
                            arg2.method1638(32, 0);
                            arg2.method1666(544537784, var13);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field529[var7].field4069;
                            byte[][] var15 = var3.field516[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method1638(32, 0);
                            } else if (var19 instanceof Number) {
                                arg2.method1638(32, 1);
                                arg2.method1651(!arg0, ((Number) var19).longValue());
                            } else if ((var19 instanceof class66)) {
                                arg2.method1638(32, 2);
                                arg2.method1641((byte) -9, (class66) var19);
                            } else {
                                arg2.method1638(32, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field529[var7].field4069;
                            int var21 = var20.getModifiers();
                            arg2.method1638(32, 0);
                            arg2.method1666(544537784, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1638(32, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method1638(32, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1638(32, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method1638(32, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method1638(32, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1638(32, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method1638(32, -16);
                    } catch (SecurityException var29) {
                        arg2.method1638(32, -17);
                    } catch (IOException var30) {
                        arg2.method1638(32, -18);
                    } catch (NullPointerException var31) {
                        arg2.method1638(32, -19);
                    } catch (Exception var32) {
                        arg2.method1638(32, -20);
                    } catch (Throwable var33) {
                        arg2.method1638(32, -21);
                    }
                } else {
                    arg2.method1638(32, var3.field523[var7]);
                }
            }
            arg2.method1647(var6, -116);
            arg2.method1662(arg2.field4335 - var6, 124);
            var3.method560(-17554);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)I")
    public abstract int method211(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)I")
    public static final int method639(int arg0, int arg1, int arg2) {
        if (arg1 != -11143) {
            return 32;
        }
        class15 var3 = (class15) class84.field1631.method1381((long) arg2, -106);
        field1752++;
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field195.length) {
            return var3.field195[arg0];
        } else {
            return -1;
        }
    }
}
