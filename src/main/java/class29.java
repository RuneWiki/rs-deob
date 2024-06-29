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
public class class29 {

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Le;")
    public static class191 field413 = class54.method368("Fps:", 2047);

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Le;")
    private static class191 field414 = class54.method368("Discard", 2047);

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Le;")
    public static class191 field418 = field414;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lqk;")
    public static class6 field410;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZZBI)Lng;")
    public static final class121 method205(boolean arg0, boolean arg1, boolean arg2, byte arg3, int arg4) {
        field411++;
        if (arg3 > -62) {
            return null;
        }
        class59 var5 = null;
        if (class256.field4537 != null) {
            var5 = new class59(arg4, class256.field4537, class258.field4577[arg4], 1000000);
        }
        class188.field3317[arg4] = class211.field3737.method1028(var5, class221.field3899, arg4, 10);
        if (arg1) {
            class188.field3317[arg4].method1857(0);
        }
        return new class121(class188.field3317[arg4], arg0, arg2);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BZ)V")
    public static final void method206(byte arg0, boolean arg1) {
        field415++;
        class37.method255(class190.field3337, class200.field3584, arg1, 92, class130.field2166);
        if (arg0 >= -91) {
            field416 = -9;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILng;)V")
    public static final void method207(int arg0, class121 arg1) {
        if (arg0 <= -15) {
            field412++;
            class141.field2361 = arg1.method824(true, class36.field663);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILci;)V")
    public static final void method208(int arg0, int arg1, class162 arg2) {
        if (arg1 < 80) {
            method208(19, 70, (class162) null);
        }
        field417++;
        while (true) {
            class71 var3 = (class71) class267.field4724.method1173(110);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1250; var5++) {
                if (var3.field1246[var5] != null) {
                    if (var3.field1246[var5].field1356 == 2) {
                        var3.field1248[var5] = -5;
                    }
                    if (var3.field1246[var5].field1356 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1254[var5] != null) {
                    if (var3.field1254[var5].field1356 == 2) {
                        var3.field1248[var5] = -6;
                    }
                    if (var3.field1254[var5].field1356 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method1096(arg0, 0);
            arg2.method1613(0, 21);
            int var6 = arg2.field3996;
            arg2.method1576(30289, var3.field1243);
            for (int var7 = 0; var7 < var3.field1250; var7++) {
                if (var3.field1248[var7] == 0) {
                    try {
                        int var8 = var3.field1242[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field1246[var7].field1360;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1613(0, 21);
                            arg2.method1576(30289, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field1246[var7].field1360;
                            var13.setInt((Object) null, var3.field1252[var7]);
                            arg2.method1613(0, 21);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field1246[var7].field1360;
                            int var12 = var11.getModifiers();
                            arg2.method1613(0, 21);
                            arg2.method1576(30289, var12);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field1254[var7].field1360;
                            byte[][] var17 = var3.field1249[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method1613(0, 21);
                            } else if (var21 instanceof Number) {
                                arg2.method1613(1, 21);
                                arg2.method1589(((Number) var21).longValue(), false);
                            } else if (var21 instanceof class191) {
                                arg2.method1613(2, 21);
                                arg2.method1586((class191) var21, (byte) -117);
                            } else {
                                arg2.method1613(4, 21);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1254[var7].field1360;
                            int var15 = var14.getModifiers();
                            arg2.method1613(0, 21);
                            arg2.method1576(30289, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1613(-10, 21);
                    } catch (InvalidClassException var23) {
                        arg2.method1613(-11, 21);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1613(-12, 21);
                    } catch (OptionalDataException var25) {
                        arg2.method1613(-13, 21);
                    } catch (IllegalAccessException var26) {
                        arg2.method1613(-14, 21);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1613(-15, 21);
                    } catch (InvocationTargetException var28) {
                        arg2.method1613(-16, 21);
                    } catch (SecurityException var29) {
                        arg2.method1613(-17, 21);
                    } catch (IOException var30) {
                        arg2.method1613(-18, 21);
                    } catch (NullPointerException var31) {
                        arg2.method1613(-19, 21);
                    } catch (Exception var32) {
                        arg2.method1613(-20, 21);
                    } catch (Throwable var33) {
                        arg2.method1613(-21, 21);
                    }
                } else {
                    arg2.method1613(var3.field1248[var7], 21);
                }
            }
            arg2.method1572((byte) 127, var6);
            arg2.method1567(28916, arg2.field3996 - var6);
            var3.method655(63);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method209(int arg0) {
        field418 = null;
        field413 = null;
        field414 = null;
        if (arg0 != 5467) {
            field413 = null;
        }
        field410 = null;
    }
}
