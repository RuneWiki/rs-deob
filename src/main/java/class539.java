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

@OriginalClass("client!jd")
public class class539 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lwg;")
    public static class59 field7588;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BZJILtf;II)V")
    public static final void method3036(byte arg0, boolean arg1, long arg2, int arg3, class701 arg4, int arg5, int arg6) {
        if (arg0 != -97) {
            method3038((byte) -103);
        }
        class255.method1512(arg2, arg1, arg5, 10000, 1, arg3, arg6, arg4);
        field7585++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILce;)V")
    public static final void method3037(int arg0, class445 arg1) {
        field7587++;
        class79 var2 = (class79) class298.field3718.method3434((byte) 2);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        int var4 = 0;
        if (arg0 >= -44) {
            return;
        }
        while (var2.field805 > var4) {
            if (var2.field804[var4] != null) {
                if (var2.field804[var4].field884 == 2) {
                    var2.field796[var4] = -5;
                }
                if (var2.field804[var4].field884 == 0) {
                    var3 = true;
                }
            }
            if (var2.field799[var4] != null) {
                if (var2.field799[var4].field884 == 2) {
                    var2.field796[var4] = -6;
                }
                if (var2.field799[var4].field884 == 0) {
                    var3 = true;
                }
            }
            var4++;
        }
        if (var3) {
            return;
        }
        int var5 = arg1.field1218;
        arg1.method660((byte) 100, var2.field802);
        for (int var6 = 0; var6 < var2.field805; var6++) {
            if (var2.field796[var6] == 0) {
                try {
                    int var7 = var2.field807[var6];
                    if (var7 == 0) {
                        Field var11 = (Field) var2.field804[var6].field886;
                        int var12 = var11.getInt(null);
                        arg1.method658(0, (byte) 85);
                        arg1.method660((byte) 80, var12);
                    } else if (var7 == 1) {
                        Field var10 = (Field) var2.field804[var6].field886;
                        var10.setInt(null, var2.field797[var6]);
                        arg1.method658(0, (byte) 123);
                    } else if (var7 == 2) {
                        Field var8 = (Field) var2.field804[var6].field886;
                        int var9 = var8.getModifiers();
                        arg1.method658(0, (byte) 63);
                        arg1.method660((byte) 53, var9);
                    }
                    if (var7 == 3) {
                        Method var13 = (Method) var2.field799[var6].field886;
                        byte[][] var14 = var2.field798[var6];
                        Object[] var15 = new Object[var14.length];
                        for (int var16 = 0; var16 < var14.length; var16++) {
                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                            var15[var16] = var17.readObject();
                        }
                        Object var18 = var13.invoke(null, var15);
                        if (var18 == null) {
                            arg1.method658(0, (byte) 83);
                        } else if (var18 instanceof Number) {
                            arg1.method658(1, (byte) 105);
                            arg1.method670((byte) 125, ((Number) var18).longValue());
                        } else if ((var18 instanceof String)) {
                            arg1.method658(2, (byte) 68);
                            arg1.method672((byte) -107, (String) var18);
                        } else {
                            arg1.method658(4, (byte) 65);
                        }
                    } else if (var7 == 4) {
                        Method var19 = (Method) var2.field799[var6].field886;
                        int var20 = var19.getModifiers();
                        arg1.method658(0, (byte) 124);
                        arg1.method660((byte) 73, var20);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method658(-10, (byte) 59);
                } catch (InvalidClassException var22) {
                    arg1.method658(-11, (byte) 87);
                } catch (StreamCorruptedException var23) {
                    arg1.method658(-12, (byte) 100);
                } catch (OptionalDataException var24) {
                    arg1.method658(-13, (byte) 62);
                } catch (IllegalAccessException var25) {
                    arg1.method658(-14, (byte) 65);
                } catch (IllegalArgumentException var26) {
                    arg1.method658(-15, (byte) 89);
                } catch (InvocationTargetException var27) {
                    arg1.method658(-16, (byte) 71);
                } catch (SecurityException var28) {
                    arg1.method658(-17, (byte) 70);
                } catch (IOException var29) {
                    arg1.method658(-18, (byte) 123);
                } catch (NullPointerException var30) {
                    arg1.method658(-19, (byte) 75);
                } catch (Exception var31) {
                    arg1.method658(-20, (byte) 85);
                } catch (Throwable var32) {
                    arg1.method658(-21, (byte) 100);
                }
            } else {
                arg1.method658(var2.field796[var6], (byte) 80);
            }
        }
        arg1.method647(8, var5);
        var2.method1922(87);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static void method3038(byte arg0) {
        if (arg0 != -101) {
            method3036((byte) -97, false, -60L, 118, null, -84, -88);
        }
        field7588 = null;
    }

    @OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7586++;
        throw new IllegalStateException();
    }
}
