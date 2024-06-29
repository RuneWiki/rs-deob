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

@OriginalClass("client!bu")
public class class19 {

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "Leb;")
    public static class584 field313 = new class584();

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "[I")
    public static int[] field315 = new int[13];

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILed;IIIIIIIII)Z", line = 3)
    public static final boolean method190(int arg0, class661 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field312++;
        int var11 = arg9;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg9 - var13;
        class77.field1210[var13][var14] = 99;
        int var16 = arg7 - var14;
        class526.field7006[var13][var14] = arg3;
        byte var17 = 0;
        int var18 = 0;
        class255.field3541[var17] = arg9;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class445.field6092[var10001] = arg7;
        int[][] var19 = arg1.field9391;
        while (var26 != var18) {
            var11 = class255.field3541[var18];
            var12 = class445.field6092[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            int var22 = var11 - arg1.field9385;
            int var23 = var12 - arg1.field9388;
            if (arg0 == -4) {
                if (arg6 == var11 && arg2 == var12) {
                    class689.field9702 = var12;
                    class160.field2542 = var11;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class502.method2790(var12, 2, arg8, arg4, arg6, 2, arg2, var11, -24945)) {
                    class689.field9702 = var12;
                    class160.field2542 = var11;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg1.method3716(2, arg4, 2, 2, arg2, var11, arg8, arg5, var12, arg6)) {
                    class160.field2542 = var11;
                    class689.field9702 = var12;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg1.method3706(var11, 2, arg2, arg4, var12, (byte) -5, arg6, arg5, arg8)) {
                    class160.field2542 = var11;
                    class689.field9702 = var12;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg1.method3705(2, arg2, var12, var11, -103, arg0, arg10, arg6)) {
                    class689.field9702 = var12;
                    class160.field2542 = var11;
                    return true;
                }
            } else if (arg1.method3707(var12, 2, arg10, arg6, arg0, (byte) -125, arg2, var11)) {
                class160.field2542 = var11;
                class689.field9702 = var12;
                return true;
            }
            int var25 = class526.field7006[var21][var20] + 1;
            if (var21 > 0 && class77.field1210[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class255.field3541[var26] = var11 - 1;
                class445.field6092[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class77.field1210[var21 - 1][var20] = 2;
                class526.field7006[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class77.field1210[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class255.field3541[var26] = var11 + 1;
                class445.field6092[var26] = var12;
                class77.field1210[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class526.field7006[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class77.field1210[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class255.field3541[var26] = var11;
                class445.field6092[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field1210[var21][var20 - 1] = 1;
                class526.field7006[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class77.field1210[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class255.field3541[var26] = var11;
                class445.field6092[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field1210[var21][var20 + 1] = 4;
                class526.field7006[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class77.field1210[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class255.field3541[var26] = var11 - 1;
                class445.field6092[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field1210[var21 - 1][var20 - 1] = 3;
                class526.field7006[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class77.field1210[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class255.field3541[var26] = var11 + 1;
                class445.field6092[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field1210[var21 + 1][var20 - 1] = 9;
                class526.field7006[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class77.field1210[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class255.field3541[var26] = var11 - 1;
                class445.field6092[var26] = var12 + 1;
                class77.field1210[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class526.field7006[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class77.field1210[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class255.field3541[var26] = var11 + 1;
                class445.field6092[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field1210[var21 + 1][var20 + 1] = 12;
                class526.field7006[var21 + 1][var20 + 1] = var25;
            }
        }
        class160.field2542 = var11;
        class689.field9702 = var12;
        return false;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILcea;)V", line = 357)
    public static final void method191(int arg0, class201 arg1) {
        field314++;
        class690 var2 = (class690) class214.field3063.method3257(-110);
        if (var2 == null) {
            return;
        }
        int var3 = -82 / ((40 - arg0) / 62);
        boolean var4 = false;
        for (int var5 = 0; var5 < var2.field9727; var5++) {
            if (var2.field9719[var5] != null) {
                if (var2.field9719[var5].field2816 == 2) {
                    var2.field9712[var5] = -5;
                }
                if (var2.field9719[var5].field2816 == 0) {
                    var4 = true;
                }
            }
            if (var2.field9715[var5] != null) {
                if (var2.field9715[var5].field2816 == 2) {
                    var2.field9712[var5] = -6;
                }
                if (var2.field9715[var5].field2816 == 0) {
                    var4 = true;
                }
            }
        }
        if (var4) {
            return;
        }
        int var6 = arg1.field4619;
        arg1.method1982(var2.field9729, (byte) 63);
        for (int var7 = 0; var7 < var2.field9727; var7++) {
            if (var2.field9712[var7] == 0) {
                try {
                    int var8 = var2.field9710[var7];
                    if (var8 == 0) {
                        Field var9 = (Field) var2.field9719[var7].field2820;
                        int var10 = var9.getInt(null);
                        arg1.method1980(-345277664, 0);
                        arg1.method1982(var10, (byte) 63);
                    } else if (var8 == 1) {
                        Field var11 = (Field) var2.field9719[var7].field2820;
                        var11.setInt(null, var2.field9716[var7]);
                        arg1.method1980(-345277664, 0);
                    } else if (var8 == 2) {
                        Field var12 = (Field) var2.field9719[var7].field2820;
                        int var13 = var12.getModifiers();
                        arg1.method1980(-345277664, 0);
                        arg1.method1982(var13, (byte) 63);
                    }
                    if (var8 == 3) {
                        Method var14 = (Method) var2.field9715[var7].field2820;
                        byte[][] var15 = var2.field9723[var7];
                        Object[] var16 = new Object[var15.length];
                        for (int var17 = 0; var17 < var15.length; var17++) {
                            ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                            var16[var17] = var18.readObject();
                        }
                        Object var19 = var14.invoke(null, var16);
                        if (var19 == null) {
                            arg1.method1980(-345277664, 0);
                        } else if ((var19 instanceof Number)) {
                            arg1.method1980(-345277664, 1);
                            arg1.method2027((byte) 118, ((Number) var19).longValue());
                        } else if (var19 instanceof String) {
                            arg1.method1980(-345277664, 2);
                            arg1.method2019(-92, (String) var19);
                        } else {
                            arg1.method1980(-345277664, 4);
                        }
                    } else if (var8 == 4) {
                        Method var20 = (Method) var2.field9715[var7].field2820;
                        int var21 = var20.getModifiers();
                        arg1.method1980(-345277664, 0);
                        arg1.method1982(var21, (byte) 63);
                    }
                } catch (ClassNotFoundException var22) {
                    arg1.method1980(-345277664, -10);
                } catch (InvalidClassException var23) {
                    arg1.method1980(-345277664, -11);
                } catch (StreamCorruptedException var24) {
                    arg1.method1980(-345277664, -12);
                } catch (OptionalDataException var25) {
                    arg1.method1980(-345277664, -13);
                } catch (IllegalAccessException var26) {
                    arg1.method1980(-345277664, -14);
                } catch (IllegalArgumentException var27) {
                    arg1.method1980(-345277664, -15);
                } catch (InvocationTargetException var28) {
                    arg1.method1980(-345277664, -16);
                } catch (SecurityException var29) {
                    arg1.method1980(-345277664, -17);
                } catch (IOException var30) {
                    arg1.method1980(-345277664, -18);
                } catch (NullPointerException var31) {
                    arg1.method1980(-345277664, -19);
                } catch (Exception var32) {
                    arg1.method1980(-345277664, -20);
                } catch (Throwable var33) {
                    arg1.method1980(-345277664, -21);
                }
            } else {
                arg1.method1980(-345277664, var2.field9712[var7]);
            }
        }
        arg1.method2025(var6, 255);
        var2.method2797(104);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 545)
    public static void method192(int arg0) {
        field315 = null;
        field313 = null;
        if (arg0 != -12508) {
            method190(-82, null, 74, -2, 106, 114, -55, -70, -58, -127, -41);
        }
    }
}
