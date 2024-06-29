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

@OriginalClass("client!nm")
public class class435 extends class539 {

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "Lsu;")
    public class192 field6146 = new class192();

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "[Llv;")
    public static class408[] field6148 = new class408[34];

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "Lfc;")
    public static class235 field6145 = new class235(116, 0);

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIBII)V", line = 4)
    public static final void method2496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field6142++;
        if (arg8 >= 1 && arg3 >= 1 && (class86.field1185 - 2) >= arg8 && arg3 <= class526.field7212 - 2) {
            int var9 = arg2;
            if (arg2 < 3 && class105.method800((byte) 19, arg3, arg8)) {
                var9 = arg2 + 1;
            }
            if (!class274.field3872.method2433(0, class429.field6020) && !class269.method1632(arg8, class122.field1683, (byte) 48, arg3, var9)) {
                return;
            }
            if (class658.field9266 == null) {
                return;
            }
            class340.field4946.method1177(arg7, arg8, class630.field8790, arg2, class480.field6696[arg2], arg3, -85);
            if (arg1 >= 0) {
                boolean var10 = class274.field3872.field916;
                class274.field3872.field916 = true;
                class340.field4946.method1178(class630.field8790, arg5, arg2, arg0, arg3, var9, arg4, (byte) 109, arg8, arg1, class480.field6696[arg2]);
                class274.field3872.field916 = var10;
            }
        }
        if (arg6 != 27) {
            field6148 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I", line = 45)
    public static final int method2497(byte arg0) {
        field6143++;
        if (class229.field3278) {
            return 6;
        } else if (arg0 != -25) {
            return -85;
        } else if (class643.field9138 == null) {
            return 0;
        } else {
            int var1 = class643.field9138.field4983;
            if (class44.method246((byte) 96, var1)) {
                return 1;
            } else if (class375.method2187(var1, false)) {
                return 2;
            } else if (class471.method2680(var1, arg0 ^ 0x15)) {
                return 3;
            } else if (class287.method1729(var1, (byte) 17)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lql;IB)V", line = 82)
    public static final void method2498(class674 arg0, int arg1, byte arg2) {
        if (arg2 != 103) {
            return;
        }
        field6147++;
        while (true) {
            class200 var3 = (class200) class81.field1135.method1270((byte) -25);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2956; var5++) {
                if (var3.field2949[var5] != null) {
                    if (var3.field2949[var5].field3702 == 2) {
                        var3.field2945[var5] = -5;
                    }
                    if (var3.field2949[var5].field3702 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2952[var5] != null) {
                    if (var3.field2952[var5].field3702 == 2) {
                        var3.field2945[var5] = -6;
                    }
                    if (var3.field2952[var5].field3702 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method3727(arg1, (byte) 108);
            arg0.method746((byte) -113, 0);
            int var6 = arg0.field1301;
            arg0.method741(var3.field2948, (byte) 27);
            for (int var7 = 0; var7 < var3.field2956; var7++) {
                if (var3.field2945[var7] == 0) {
                    try {
                        int var8 = var3.field2950[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2949[var7].field3706;
                            int var10 = var9.getInt(null);
                            arg0.method746((byte) -98, 0);
                            arg0.method741(var10, (byte) 27);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2949[var7].field3706;
                            var11.setInt(null, var3.field2946[var7]);
                            arg0.method746((byte) -111, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field2949[var7].field3706;
                            int var13 = var12.getModifiers();
                            arg0.method746((byte) -102, 0);
                            arg0.method741(var13, (byte) 27);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2952[var7].field3706;
                            byte[][] var17 = var3.field2955[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg0.method746((byte) -111, 0);
                            } else if (var21 instanceof Number) {
                                arg0.method746((byte) -127, 1);
                                arg0.method725((byte) 36, ((Number) var21).longValue());
                            } else if ((var21 instanceof String)) {
                                arg0.method746((byte) -88, 2);
                                arg0.method708(109, (String) var21);
                            } else {
                                arg0.method746((byte) -114, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2952[var7].field3706;
                            int var15 = var14.getModifiers();
                            arg0.method746((byte) -100, 0);
                            arg0.method741(var15, (byte) 27);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method746((byte) -94, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method746((byte) -108, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method746((byte) -125, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method746((byte) -119, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method746((byte) -123, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method746((byte) -95, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method746((byte) -90, -16);
                    } catch (SecurityException var29) {
                        arg0.method746((byte) -94, -17);
                    } catch (IOException var30) {
                        arg0.method746((byte) -107, -18);
                    } catch (NullPointerException var31) {
                        arg0.method746((byte) -92, -19);
                    } catch (Exception var32) {
                        arg0.method746((byte) -114, -20);
                    } catch (Throwable var33) {
                        arg0.method746((byte) -123, -21);
                    }
                } else {
                    arg0.method746((byte) -108, var3.field2945[var7]);
                }
            }
            arg0.method704(var6, 3);
            arg0.method755(96, arg0.field1301 - var6);
            var3.method2971(1);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljr;B)Lpl;", line = 273)
    public static final class595 method2499(class96 arg0, byte arg1) {
        if (arg1 == 37) {
            field6144++;
            int var2 = arg0.method714(false);
            return new class595(var2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 289)
    public static void method2500(int arg0) {
        field6148 = null;
        int var1 = 107 / ((27 - arg0) / 36);
        field6145 = null;
    }
}
