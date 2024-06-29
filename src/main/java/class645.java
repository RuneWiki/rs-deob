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

@OriginalClass("client!ms")
public class class645 {

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Lui;")
    public static class193 field9394 = new class193();

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "Ldn;")
    public static class438 field9391;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
    public static final void method3723(int arg0, int arg1, int arg2) {
        field9392++;
        class557 var3 = class93.method564(arg2, -14073, arg1);
        var3.method3257(arg2 + 1936);
        var3.field8207 = arg0;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILkj;)V")
    public static final void method3724(int arg0, int arg1, class484 arg2) {
        if (arg0 != 20471) {
            field9391 = null;
        }
        field9395++;
        while (true) {
            class578 var3 = (class578) class486.field6798.method1050((byte) 73);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field8428; var5++) {
                if (var3.field8429[var5] != null) {
                    if (var3.field8429[var5].field7031 == 2) {
                        var3.field8432[var5] = -5;
                    }
                    if (var3.field8429[var5].field7031 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field8431[var5] != null) {
                    if (var3.field8431[var5].field7031 == 2) {
                        var3.field8432[var5] = -6;
                    }
                    if (var3.field8431[var5].field7031 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method2804(arg1, 30979);
            arg2.method2093(0, -101);
            int var6 = arg2.field4966;
            arg2.method2131(var3.field8433, -1495157560);
            for (int var7 = 0; var7 < var3.field8428; var7++) {
                if (var3.field8432[var7] == 0) {
                    try {
                        int var8 = var3.field8439[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field8429[var7].field7030;
                            int var13 = var12.getInt(null);
                            arg2.method2093(0, -119);
                            arg2.method2131(var13, -1495157560);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field8429[var7].field7030;
                            var11.setInt(null, var3.field8438[var7]);
                            arg2.method2093(0, -105);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field8429[var7].field7030;
                            int var10 = var9.getModifiers();
                            arg2.method2093(0, arg0 ^ 0xFFFFB06C);
                            arg2.method2131(var10, arg0 ^ 0xA6E1FB3F);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field8431[var7].field7030;
                            byte[][] var15 = var3.field8437[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg2.method2093(0, arg0 ^ 0xFFFFB067);
                            } else if ((var19 instanceof Number)) {
                                arg2.method2093(1, -122);
                                arg2.method2094(((Number) var19).longValue(), -20439);
                            } else if (var19 instanceof String) {
                                arg2.method2093(2, -119);
                                arg2.method2106(-79, (String) var19);
                            } else {
                                arg2.method2093(4, -122);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field8431[var7].field7030;
                            int var21 = var20.getModifiers();
                            arg2.method2093(0, -114);
                            arg2.method2131(var21, -1495157560);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method2093(-10, -126);
                    } catch (InvalidClassException var23) {
                        arg2.method2093(-11, arg0 ^ -20384);
                    } catch (StreamCorruptedException var24) {
                        arg2.method2093(-12, -106);
                    } catch (OptionalDataException var25) {
                        arg2.method2093(-13, -116);
                    } catch (IllegalAccessException var26) {
                        arg2.method2093(-14, -110);
                    } catch (IllegalArgumentException var27) {
                        arg2.method2093(-15, -116);
                    } catch (InvocationTargetException var28) {
                        arg2.method2093(-16, -104);
                    } catch (SecurityException var29) {
                        arg2.method2093(-17, -103);
                    } catch (IOException var30) {
                        arg2.method2093(-18, arg0 - 20573);
                    } catch (NullPointerException var31) {
                        arg2.method2093(-19, -107);
                    } catch (Exception var32) {
                        arg2.method2093(-20, -111);
                    } catch (Throwable var33) {
                        arg2.method2093(-21, -126);
                    }
                } else {
                    arg2.method2093(var3.field8432[var7], arg0 ^ 0xFFFFB066);
                }
            }
            arg2.method2085((byte) -43, var6);
            arg2.method2083((byte) -122, arg2.field4966 - var6);
            var3.method3187(true);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static void method3725(int arg0) {
        field9391 = null;
        int var1 = 32 % ((-arg0 - 58) / 52);
        field9394 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BIIIIZ)V")
    public static final void method3726(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0 < 51) {
            field9391 = null;
        }
        field9393++;
        long var6 = (long) ((arg5 ? Integer.MIN_VALUE : 0) | arg3);
        class125 var8 = (class125) class394.field5207.method2645(var6, (byte) -104);
        if (var8 == null) {
            var8 = new class125();
            class394.field5207.method2640(1, var6, var8);
        }
        if (var8.field1535.length <= arg2) {
            int[] var9 = new int[arg2 + 1];
            int[] var10 = new int[arg2 + 1];
            for (int var11 = 0; var11 < var8.field1535.length; var11++) {
                var9[var11] = var8.field1535[var11];
                var10[var11] = var8.field1538[var11];
            }
            for (int var12 = var8.field1535.length; var12 < arg2; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field1538 = var10;
            var8.field1535 = var9;
        }
        var8.field1535[arg2] = arg4;
        var8.field1538[arg2] = arg1;
    }
}
