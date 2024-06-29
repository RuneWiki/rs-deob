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

@OriginalClass("client!gh")
public class class64 {

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Led;")
    public static class43 field1310 = class191.method1219("::qa_op_test", false);

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Led;")
    public static class43 field1309 = class191.method1219("oder benutzen Sie eine andere Welt)3", false);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Ltd;")
    public static class176 field1308 = new class176(64);

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Led;")
    private static class43 field1313 = class191.method1219("Please wait 5 minutes before trying again)3", false);

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Led;")
    public static class43 field1315 = class191.method1219("sl_back", false);

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Led;")
    public static class43 field1316 = field1313;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[I")
    public static int[] field1314 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "[I")
    public static int[] field1307;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILff;I)V")
    public static final void method406(int arg0, class54 arg1, int arg2) {
        if (arg0 > -79) {
            method406(111, null, -104);
        }
        field1312++;
        while (true) {
            class128 var3 = (class128) class50.field1005.method753(-26703);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2557; var5++) {
                if (var3.field2569[var5] != null) {
                    if (var3.field2569[var5].field2927 == 2) {
                        var3.field2570[var5] = -5;
                    }
                    if (var3.field2569[var5].field2927 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2554[var5] != null) {
                    if (var3.field2554[var5].field2927 == 2) {
                        var3.field2570[var5] = -6;
                    }
                    if (var3.field2554[var5].field2927 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method338(253, arg2);
            arg1.method539(0, 27678);
            int var6 = arg1.field1727;
            arg1.method581(var3.field2559, -268435456);
            for (int var7 = 0; var7 < var3.field2557; var7++) {
                if (var3.field2570[var7] == 0) {
                    try {
                        int var8 = var3.field2571[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2569[var7].field2930;
                            int var10 = var9.getInt(null);
                            arg1.method539(0, 27678);
                            arg1.method581(var10, -268435456);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field2569[var7].field2930;
                            var13.setInt(null, var3.field2566[var7]);
                            arg1.method539(0, 27678);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field2569[var7].field2930;
                            int var12 = var11.getModifiers();
                            arg1.method539(0, 27678);
                            arg1.method581(var12, -268435456);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2554[var7].field2930;
                            byte[][] var17 = var3.field2551[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method539(0, 27678);
                            } else if (var21 instanceof Number) {
                                arg1.method539(1, 27678);
                                arg1.method550(28, ((Number) var21).longValue());
                            } else if (var21 instanceof class43) {
                                arg1.method539(2, 27678);
                                arg1.method535((class43) var21, (byte) 0);
                            } else {
                                arg1.method539(4, 27678);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2554[var7].field2930;
                            int var15 = var14.getModifiers();
                            arg1.method539(0, 27678);
                            arg1.method581(var15, -268435456);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method539(-10, 27678);
                    } catch (InvalidClassException var23) {
                        arg1.method539(-11, 27678);
                    } catch (StreamCorruptedException var24) {
                        arg1.method539(-12, 27678);
                    } catch (OptionalDataException var25) {
                        arg1.method539(-13, 27678);
                    } catch (IllegalAccessException var26) {
                        arg1.method539(-14, 27678);
                    } catch (IllegalArgumentException var27) {
                        arg1.method539(-15, 27678);
                    } catch (InvocationTargetException var28) {
                        arg1.method539(-16, 27678);
                    } catch (SecurityException var29) {
                        arg1.method539(-17, 27678);
                    } catch (IOException var30) {
                        arg1.method539(-18, 27678);
                    } catch (NullPointerException var31) {
                        arg1.method539(-19, 27678);
                    } catch (Exception var32) {
                        arg1.method539(-20, 27678);
                    } catch (Throwable var33) {
                        arg1.method539(-21, 27678);
                    }
                } else {
                    arg1.method539(var3.field2570[var7], 27678);
                }
            }
            arg1.method548(var6, (byte) 16);
            arg1.method554(arg1.field1727 - var6, (byte) -111);
            var3.method417(-83);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method407(int arg0) {
        field1315 = null;
        field1309 = null;
        field1310 = null;
        if (arg0 <= 22) {
            field1307 = null;
        }
        field1313 = null;
        field1314 = null;
        field1316 = null;
        field1308 = null;
        field1307 = null;
    }
}
