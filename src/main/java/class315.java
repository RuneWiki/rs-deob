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

@OriginalClass("client!afa")
public class class315 {

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "Llh;")
    public static class487 field4345 = new class487(14, 16);

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "Ldp;")
    public static class3 field4347;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "Lla;")
    public static class417 field4348;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
    public static void method1907(int arg0) {
        field4348 = null;
        field4345 = null;
        if (arg0 != 2076) {
            method1907(-59);
        }
        field4347 = null;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILmw;)V")
    public static final void method1908(int arg0, class455 arg1) {
        field4344++;
        class251 var2 = (class251) class341.field4566.method1436(28964);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field3426; var4++) {
            if (var2.field3420[var4] != null) {
                if (var2.field3420[var4].field948 == 2) {
                    var2.field3430[var4] = -5;
                }
                if (var2.field3420[var4].field948 == 0) {
                    var3 = true;
                }
            }
            if (var2.field3429[var4] != null) {
                if (var2.field3429[var4].field948 == 2) {
                    var2.field3430[var4] = -6;
                }
                if (var2.field3429[var4].field948 == 0) {
                    var3 = true;
                }
            }
        }
        if (arg0 != 4 || var3) {
            return;
        }
        int var5 = arg1.field6892;
        arg1.method2836(var2.field3428, -22164);
        for (int var6 = 0; var6 < var2.field3426; var6++) {
            if (var2.field3430[var6] == 0) {
                try {
                    int var7 = var2.field3432[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field3420[var6].field946;
                        int var9 = var8.getInt(null);
                        arg1.method2817(0, true);
                        arg1.method2836(var9, -22164);
                    } else if (var7 == 1) {
                        Field var12 = (Field) var2.field3420[var6].field946;
                        var12.setInt(null, var2.field3427[var6]);
                        arg1.method2817(0, true);
                    } else if (var7 == 2) {
                        Field var10 = (Field) var2.field3420[var6].field946;
                        int var11 = var10.getModifiers();
                        arg1.method2817(0, true);
                        arg1.method2836(var11, arg0 ^ 0xFFFFA968);
                    }
                    if (var7 == 3) {
                        Method var15 = (Method) var2.field3429[var6].field946;
                        byte[][] var16 = var2.field3431[var6];
                        Object[] var17 = new Object[var16.length];
                        for (int var18 = 0; var18 < var16.length; var18++) {
                            ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                            var17[var18] = var19.readObject();
                        }
                        Object var20 = var15.invoke(null, var17);
                        if (var20 == null) {
                            arg1.method2817(0, true);
                        } else if ((var20 instanceof Number)) {
                            arg1.method2817(1, true);
                            arg1.method2834(((Number) var20).longValue(), 79);
                        } else if (var20 instanceof String) {
                            arg1.method2817(2, true);
                            arg1.method2820(97, (String) var20);
                        } else {
                            arg1.method2817(4, true);
                        }
                    } else if (var7 == 4) {
                        Method var13 = (Method) var2.field3429[var6].field946;
                        int var14 = var13.getModifiers();
                        arg1.method2817(0, true);
                        arg1.method2836(var14, arg0 - 22168);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method2817(-10, true);
                } catch (InvalidClassException var22) {
                    arg1.method2817(-11, true);
                } catch (StreamCorruptedException var23) {
                    arg1.method2817(-12, true);
                } catch (OptionalDataException var24) {
                    arg1.method2817(-13, true);
                } catch (IllegalAccessException var25) {
                    arg1.method2817(-14, true);
                } catch (IllegalArgumentException var26) {
                    arg1.method2817(-15, true);
                } catch (InvocationTargetException var27) {
                    arg1.method2817(-16, true);
                } catch (SecurityException var28) {
                    arg1.method2817(-17, true);
                } catch (IOException var29) {
                    arg1.method2817(-18, true);
                } catch (NullPointerException var30) {
                    arg1.method2817(-19, true);
                } catch (Exception var31) {
                    arg1.method2817(-20, true);
                } catch (Throwable var32) {
                    arg1.method2817(-21, true);
                }
            } else {
                arg1.method2817(var2.field3430[var6], true);
            }
        }
        arg1.method2844(var5, (byte) -127);
        var2.method2340(75);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1909(int arg0, int arg1, byte arg2) {
        int var3 = 44 / ((arg2 - 46) / 61);
        field4346++;
        return (arg1 & 0x10) != 0;
    }
}
