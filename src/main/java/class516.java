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

@OriginalClass("client!dn")
public class class516 {

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Ldn;")
    public static class516 field7351 = new class516();

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "Ldn;")
    public static class516 field7355 = new class516();

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "Ldn;")
    public static class516 field7356 = new class516();

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "Ldn;")
    public static class516 field7357 = new class516();

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field7359 = 7000;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field7361 = field7359;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "Z")
    public static boolean field7362 = false;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Lg;")
    public static class153 field7358 = new class153(6, 1);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Lhaa;")
    public static class80 field7360;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method3032(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if ((arg3 ? class557.field7812.field6545.method3029(false) : class557.field7812.field6527.method3029(false)) != 0 && arg2 != 0 && class557.field7828 < 50 && arg6 != -1) {
            class503.field7212[class557.field7828++] = new class319((byte) (arg3 ? 3 : 2), arg6, arg2, arg0, arg5, arg4, arg7, null);
        }
        if (arg1 != -18) {
            method3033(-87, -19, 49, -96, (byte) 97);
        }
        field7349++;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIB)I")
    public static final int method3033(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field7353++;
        int var5 = arg1 & 0xF;
        int var6 = var5 < 8 ? arg3 : arg2;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg3 : arg0) : arg2;
        if (arg4 >= -46) {
            method3033(-85, 78, -11, -41, (byte) -29);
        }
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)Z")
    public static final boolean method3034(int arg0, int arg1, int arg2) {
        field7354++;
        class10 var3 = class612.field8588.method558((byte) 13, arg1);
        if (arg0 == arg2) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method60(true, arg0);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZLag;)V")
    public static final void method3035(boolean arg0, class682 arg1) {
        field7350++;
        class361 var2 = (class361) class103.field1219.method2765(-12261);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        if (!arg0) {
            field7359 = -52;
        }
        for (int var4 = 0; var4 < var2.field5119; var4++) {
            if (var2.field5118[var4] != null) {
                if (var2.field5118[var4].field3310 == 2) {
                    var2.field5120[var4] = -5;
                }
                if (var2.field5118[var4].field3310 == 0) {
                    var3 = true;
                }
            }
            if (var2.field5121[var4] != null) {
                if (var2.field5121[var4].field3310 == 2) {
                    var2.field5120[var4] = -6;
                }
                if (var2.field5121[var4].field3310 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg1.field9146;
        arg1.method3733(-49, var2.field5124);
        for (int var6 = 0; var6 < var2.field5119; var6++) {
            if (var2.field5120[var6] == 0) {
                try {
                    int var7 = var2.field5117[var6];
                    if (var7 == 0) {
                        Field var11 = (Field) var2.field5118[var6].field3311;
                        int var12 = var11.getInt(null);
                        arg1.method3694(0, -1528071456);
                        arg1.method3733(-49, var12);
                    } else if (var7 == 1) {
                        Field var8 = (Field) var2.field5118[var6].field3311;
                        var8.setInt(null, var2.field5126[var6]);
                        arg1.method3694(0, -1528071456);
                    } else if (var7 == 2) {
                        Field var9 = (Field) var2.field5118[var6].field3311;
                        int var10 = var9.getModifiers();
                        arg1.method3694(0, -1528071456);
                        arg1.method3733(-49, var10);
                    }
                    if (var7 == 3) {
                        Method var13 = (Method) var2.field5121[var6].field3311;
                        byte[][] var14 = var2.field5125[var6];
                        Object[] var15 = new Object[var14.length];
                        for (int var16 = 0; var16 < var14.length; var16++) {
                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                            var15[var16] = var17.readObject();
                        }
                        Object var18 = var13.invoke(null, var15);
                        if (var18 == null) {
                            arg1.method3694(0, -1528071456);
                        } else if ((var18 instanceof Number)) {
                            arg1.method3694(1, -1528071456);
                            arg1.method3692((byte) -103, ((Number) var18).longValue());
                        } else if ((var18 instanceof String)) {
                            arg1.method3694(2, -1528071456);
                            arg1.method3747((byte) 27, (String) var18);
                        } else {
                            arg1.method3694(4, -1528071456);
                        }
                    } else if (var7 == 4) {
                        Method var19 = (Method) var2.field5121[var6].field3311;
                        int var20 = var19.getModifiers();
                        arg1.method3694(0, -1528071456);
                        arg1.method3733(-49, var20);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method3694(-10, -1528071456);
                } catch (InvalidClassException var22) {
                    arg1.method3694(-11, -1528071456);
                } catch (StreamCorruptedException var23) {
                    arg1.method3694(-12, -1528071456);
                } catch (OptionalDataException var24) {
                    arg1.method3694(-13, -1528071456);
                } catch (IllegalAccessException var25) {
                    arg1.method3694(-14, -1528071456);
                } catch (IllegalArgumentException var26) {
                    arg1.method3694(-15, -1528071456);
                } catch (InvocationTargetException var27) {
                    arg1.method3694(-16, -1528071456);
                } catch (SecurityException var28) {
                    arg1.method3694(-17, -1528071456);
                } catch (IOException var29) {
                    arg1.method3694(-18, -1528071456);
                } catch (NullPointerException var30) {
                    arg1.method3694(-19, -1528071456);
                } catch (Exception var31) {
                    arg1.method3694(-20, -1528071456);
                } catch (Throwable var32) {
                    arg1.method3694(-21, -1528071456);
                }
            } else {
                arg1.method3694(var2.field5120[var6], -1528071456);
            }
        }
        arg1.method3746(var5, (byte) -104);
        var2.method1185(-113);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
    public static void method3036(byte arg0) {
        field7357 = null;
        field7360 = null;
        field7355 = null;
        field7356 = null;
        field7351 = null;
        if (arg0 < 121) {
            field7357 = null;
        }
        field7358 = null;
    }

    @OriginalMember(owner = "client!dn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7352++;
        throw new IllegalStateException();
    }
}
