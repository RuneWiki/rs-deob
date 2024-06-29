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

@OriginalClass("client!db")
public class class17 {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public int field275 = -1;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field269 = 0;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field278 = 0;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Ljava/lang/String;")
    public static String field282 = "flash3:";

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field281 = 1;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Log;")
    public class226 field271;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[I")
    public int[] field276;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field270;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I[IIB[I)V")
    public static final void method157(int arg0, int[] arg1, int arg2, byte arg3, int[] arg4) {
        if (arg3 > -19) {
            method157(61, (int[]) null, -34, (byte) 111, (int[]) null);
        }
        if (arg0 > arg2) {
            int var5 = arg2;
            int var6 = (arg0 + arg2) / 2;
            int var7 = arg4[var6];
            arg4[var6] = arg4[arg0];
            arg4[arg0] = var7;
            int var8 = arg1[var6];
            arg1[var6] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg2; var9 < arg0; var9++) {
                if (((var9 & 0x1) + var7) < arg4[var9]) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5++] = var11;
                }
            }
            arg4[arg0] = arg4[var5];
            arg4[var5] = var7;
            arg1[arg0] = arg1[var5];
            arg1[var5] = var8;
            method157(var5 - 1, arg1, arg2, (byte) -99, arg4);
            method157(arg0, arg1, var5 + 1, (byte) -97, arg4);
        }
        field277++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BII)I")
    public static final int method158(byte arg0, int arg1, int arg2) {
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        if (arg0 != 64) {
            field281 = 92;
        }
        field274++;
        return arg1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZB)V")
    public static final void method159(boolean arg0, byte arg1) {
        field280++;
        if (class181.field2693 == arg0) {
            return;
        }
        class181.field2693 = arg0;
        if (arg1 != 11) {
            field278 = -17;
        }
        class273.method1839(32233);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method160(int arg0) {
        field282 = null;
        int var1 = 74 % ((arg0 - 38) / 60);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILed;I)V")
    public static final void method161(int arg0, class186 arg1, int arg2) {
        field272++;
        if (arg0 > -95) {
            method160(6);
        }
        while (true) {
            class215 var3 = (class215) class34.field533.method1010(123);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3319; var5++) {
                if (var3.field3317[var5] != null) {
                    if (var3.field3317[var5].field3828 == 2) {
                        var3.field3324[var5] = -5;
                    }
                    if (var3.field3317[var5].field3828 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3311[var5] != null) {
                    if (var3.field3311[var5].field3828 == 2) {
                        var3.field3324[var5] = -6;
                    }
                    if (var3.field3311[var5].field3828 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1251(arg2, (byte) -107);
            arg1.method287(440742616, 0);
            int var6 = arg1.field588;
            arg1.method289(var3.field3325, 107);
            for (int var7 = 0; var7 < var3.field3319; var7++) {
                if (var3.field3324[var7] == 0) {
                    try {
                        int var8 = var3.field3321[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3317[var7].field3831;
                            int var10 = var9.getInt((Object) null);
                            arg1.method287(440742616, 0);
                            arg1.method289(var10, -128);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3317[var7].field3831;
                            var11.setInt((Object) null, var3.field3310[var7]);
                            arg1.method287(440742616, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field3317[var7].field3831;
                            int var13 = var12.getModifiers();
                            arg1.method287(440742616, 0);
                            arg1.method289(var13, -127);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3311[var7].field3831;
                            byte[][] var17 = var3.field3323[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method287(440742616, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method287(440742616, 1);
                                arg1.method337(2103219728, ((Number) var21).longValue());
                            } else if ((var21 instanceof String)) {
                                arg1.method287(440742616, 2);
                                arg1.method321(-75, (String) var21);
                            } else {
                                arg1.method287(440742616, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3311[var7].field3831;
                            int var15 = var14.getModifiers();
                            arg1.method287(440742616, 0);
                            arg1.method289(var15, -127);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method287(440742616, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method287(440742616, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method287(440742616, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method287(440742616, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method287(440742616, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method287(440742616, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method287(440742616, -16);
                    } catch (SecurityException var29) {
                        arg1.method287(440742616, -17);
                    } catch (IOException var30) {
                        arg1.method287(440742616, -18);
                    } catch (NullPointerException var31) {
                        arg1.method287(440742616, -19);
                    } catch (Exception var32) {
                        arg1.method287(440742616, -20);
                    } catch (Throwable var33) {
                        arg1.method287(440742616, -21);
                    }
                } else {
                    arg1.method287(440742616, var3.field3324[var7]);
                }
            }
            arg1.method288(var6, -100);
            arg1.method339(arg1.field588 - var6, 440742616);
            var3.method693(-20);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Luf;II)Lji;")
    public static final class43 method162(class176 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1152(-4897, arg1);
        field279++;
        if (var3 == null) {
            return null;
        } else {
            int var4 = 117 / ((arg2 + 51) / 58);
            return new class43(var3);
        }
    }
}
