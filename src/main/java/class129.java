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

@OriginalClass("client!ai")
public class class129 extends class381 {

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public int field1830 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public int field1834 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public int field1832 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public int field1836 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public int field1833 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public int field1840 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public int field1839 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public int field1829 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "Ltj;")
    public class430 field1841;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "[S")
    public static short[] field1831 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lio;II)V")
    public static final void method1003(class286 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        field1837++;
        while (true) {
            class185 var3 = (class185) class220.field3041.method1240((byte) -81);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2680; var5++) {
                if (var3.field2686[var5] != null) {
                    if (var3.field2686[var5].field3345 == 2) {
                        var3.field2681[var5] = -5;
                    }
                    if (var3.field2686[var5].field3345 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2687[var5] != null) {
                    if (var3.field2687[var5].field3345 == 2) {
                        var3.field2681[var5] = -6;
                    }
                    if (var3.field2687[var5].field3345 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1801(arg1, (byte) -87);
            arg0.method1824(arg2 ^ 0x4D, 0);
            int var6 = arg0.field3938;
            arg0.method1854(var3.field2685, true);
            for (int var7 = 0; var7 < var3.field2680; var7++) {
                if (var3.field2681[var7] == 0) {
                    try {
                        int var8 = var3.field2688[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2686[var7].field3341;
                            int var10 = var9.getInt((Object) null);
                            arg0.method1824(77, 0);
                            arg0.method1854(var10, true);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2686[var7].field3341;
                            var11.setInt((Object) null, var3.field2689[var7]);
                            arg0.method1824(56, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field2686[var7].field3341;
                            int var13 = var12.getModifiers();
                            arg0.method1824(95, 0);
                            arg0.method1854(var13, true);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field2687[var7].field3341;
                            byte[][] var15 = var3.field2683[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method1824(85, 0);
                            } else if ((var19 instanceof Number)) {
                                arg0.method1824(arg2 ^ 0x61, 1);
                                arg0.method1866(-19069, ((Number) var19).longValue());
                            } else if (var19 instanceof String) {
                                arg0.method1824(35, 2);
                                arg0.method1827(0, (String) var19);
                            } else {
                                arg0.method1824(79, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2687[var7].field3341;
                            int var21 = var20.getModifiers();
                            arg0.method1824(123, 0);
                            arg0.method1854(var21, true);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1824(arg2 ^ 0x5B, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method1824(54, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1824(arg2 + 75, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method1824(46, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method1824(76, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1824(76, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method1824(115, -16);
                    } catch (SecurityException var29) {
                        arg0.method1824(55, -17);
                    } catch (IOException var30) {
                        arg0.method1824(arg2 + 104, -18);
                    } catch (NullPointerException var31) {
                        arg0.method1824(arg2 + 119, -19);
                    } catch (Exception var32) {
                        arg0.method1824(107, -20);
                    } catch (Throwable var33) {
                        arg0.method1824(117, -21);
                    }
                } else {
                    arg0.method1824(62, var3.field2681[var7]);
                }
            }
            arg0.method1849(var6, (byte) 98);
            arg0.method1857(arg2 + 100, -var6 + arg0.field3938);
            var3.method2367(arg2 ^ 0x5);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZIIII)Lji;")
    public static final class64 method1004(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1838++;
        class64 var5 = new class64();
        var5.field973 = arg1;
        var5.field976 = arg4;
        class204.field2865.method612((long) arg2, -1, var5);
        class437.method2715(86, arg4);
        class139 var6 = class10.method57(65535, arg2);
        if (var6 != null) {
            class10.method52(var6, (byte) -89);
        }
        if (class331.field4502 != null) {
            class10.method52(class331.field4502, (byte) -89);
            class331.field4502 = null;
        }
        int var7 = 103 / (-arg3 / 44);
        class414.method2560(22);
        if (var6 != null) {
            class441.method2738((byte) 73, var6, !arg0);
        }
        if (!arg0) {
            class18.method263(arg4);
        }
        if (!arg0 && class149.field2288 != -1) {
            class385.method2389(1, -22715, class149.field2288);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)Z")
    public final boolean method1005(int arg0, int arg1, int arg2) {
        if (arg2 >= -2) {
            method1006(-115);
        }
        field1835++;
        if (this.field1830 <= arg1 && this.field1832 >= arg1 && arg0 >= this.field1840 && this.field1833 >= arg0) {
            return true;
        } else {
            return arg1 >= this.field1836 && arg1 <= this.field1829 && arg0 >= this.field1839 && arg0 <= this.field1834;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public static void method1006(int arg0) {
        field1831 = null;
        if (arg0 != 0) {
            field1831 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ltj;)V")
    public class129(class430 arg0) {
        this.field1841 = arg0;
    }
}
