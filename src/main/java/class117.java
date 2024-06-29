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

@OriginalClass("client!u")
public class class117 extends class81 {

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Z")
    public static boolean field2047 = true;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Lpj;")
    public static class237 field2050 = null;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Lpj;")
    public static class237 field2059 = class33.method353("name_icons", 83);

    @OriginalMember(owner = "client!u", name = "H", descriptor = "[I")
    public static int[] field2062 = new int[2048];

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public int field2045;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public int field2049;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public int field2051;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public int field2055;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Lw;")
    public class141 field2046;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Lw;")
    public class141 field2048;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Lpj;")
    public class237 field2057;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Z")
    public boolean field2061;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "[Ljava/lang/Object;")
    public Object[] field2053;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILva;)V")
    public static final void method850(int arg0, int arg1, class34 arg2) {
        if (arg1 != 0) {
            method850(76, -4, (class34) null);
        }
        field2054++;
        while (true) {
            class227 var3 = (class227) class16.field278.method673(false);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3888; var5++) {
                if (var3.field3879[var5] != null) {
                    if (var3.field3879[var5].field1823 == 2) {
                        var3.field3892[var5] = -5;
                    }
                    if (var3.field3879[var5].field1823 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3878[var5] != null) {
                    if (var3.field3878[var5].field1823 == 2) {
                        var3.field3892[var5] = -6;
                    }
                    if (var3.field3878[var5].field1823 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method368(27, arg0);
            arg2.method293((byte) 125, 0);
            int var6 = arg2.field647;
            arg2.method290((byte) -20, var3.field3882);
            for (int var7 = 0; var7 < var3.field3888; var7++) {
                if (var3.field3892[var7] == 0) {
                    try {
                        int var8 = var3.field3877[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3879[var7].field1826;
                            int var13 = var12.getInt((Object) null);
                            arg2.method293((byte) 125, 0);
                            arg2.method290((byte) -20, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field3879[var7].field1826;
                            var9.setInt((Object) null, var3.field3893[var7]);
                            arg2.method293((byte) 125, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field3879[var7].field1826;
                            int var11 = var10.getModifiers();
                            arg2.method293((byte) 125, 0);
                            arg2.method290((byte) -20, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3878[var7].field1826;
                            byte[][] var17 = var3.field3880[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method293((byte) 125, 0);
                            } else if ((var21 instanceof Number)) {
                                arg2.method293((byte) 125, 1);
                                arg2.method292(98, ((Number) var21).longValue());
                            } else if (var21 instanceof class237) {
                                arg2.method293((byte) 125, 2);
                                arg2.method334(-124, (class237) var21);
                            } else {
                                arg2.method293((byte) 125, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3878[var7].field1826;
                            int var15 = var14.getModifiers();
                            arg2.method293((byte) 125, 0);
                            arg2.method290((byte) -20, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method293((byte) 125, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method293((byte) 125, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method293((byte) 125, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method293((byte) 125, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method293((byte) 125, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method293((byte) 125, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method293((byte) 125, -16);
                    } catch (SecurityException var29) {
                        arg2.method293((byte) 125, -17);
                    } catch (IOException var30) {
                        arg2.method293((byte) 125, -18);
                    } catch (NullPointerException var31) {
                        arg2.method293((byte) 125, -19);
                    } catch (Exception var32) {
                        arg2.method293((byte) 125, -20);
                    } catch (Throwable var33) {
                        arg2.method293((byte) 125, -21);
                    }
                } else {
                    arg2.method293((byte) 125, var3.field3892[var7]);
                }
            }
            arg2.method349(var6, (byte) 100);
            arg2.method338((byte) -126, arg2.field647 - var6);
            var3.method629(0);
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public static final void method851(int arg0) {
        if (arg0 == -1) {
            class59.field1208.method942(0);
            field2052++;
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
    public static void method852(int arg0) {
        field2050 = null;
        field2059 = null;
        field2062 = null;
        if (arg0 > -98) {
            field2050 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
    public static final void method853(int arg0) {
        class223.field3830.method368(103, 175);
        for (class58 var1 = (class58) class164.field2915.method566(0); var1 != null; var1 = (class58) class164.field2915.method565(123)) {
            if (var1.field1189 == 0) {
                class210.method1405(19337, var1, true);
            }
        }
        if (class83.field1552 != null) {
            class128.method911(class83.field1552, -17149);
            class83.field1552 = null;
        }
        class29.field594++;
        if (arg0 >= 114) {
            field2060++;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Lsc;")
    public static final class238 method854(byte arg0, int arg1) {
        field2058++;
        class238 var2 = (class238) class99.field1765.method1549((long) arg1, 9447);
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 19) {
            method854((byte) -27, -83);
        }
        byte[] var3 = class220.field3792.method1645(true, arg1, 11);
        class238 var4 = new class238();
        if (var3 != null) {
            var4.method1625(0, new class32(var3));
        }
        class99.field1765.method1552((byte) -75, var4, (long) arg1);
        return var4;
    }
}
