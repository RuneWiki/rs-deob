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

@OriginalClass("client!mi")
public class class287 extends class359 {

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field4044 = 3;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public int field4040;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public int field4043;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public int field4045;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public int field4050;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public int field4052;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public int field4056;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public int field4057;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public int field4058;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public int field4061;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public int field4062;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public int field4065;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "Lfp;")
    public class177 field4054;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "Ltc;")
    public static class196 field4059;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Lgj;")
    public class380 field4042;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "Lcp;")
    public class430 field4060;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "Lra;")
    public static class57 field4066;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "Lqm;")
    public class78 field4048;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBLae;)V")
    public static final void method1828(int arg0, byte arg1, class135 arg2) {
        if (arg1 >= -61) {
            method1830((byte) -110);
        }
        field4063++;
        while (true) {
            class225 var3 = (class225) class147.field2063.method1124(-1);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3071; var5++) {
                if (var3.field3069[var5] != null) {
                    if (var3.field3069[var5].field3268 == 2) {
                        var3.field3067[var5] = -5;
                    }
                    if (var3.field3069[var5].field3268 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3066[var5] != null) {
                    if (var3.field3066[var5].field3268 == 2) {
                        var3.field3067[var5] = -6;
                    }
                    if (var3.field3066[var5].field3268 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method809(arg0, -28022);
            arg2.method1396(21375, 0);
            int var6 = arg2.field2888;
            arg2.method1361((byte) -127, var3.field3068);
            for (int var7 = 0; var7 < var3.field3071; var7++) {
                if (var3.field3067[var7] == 0) {
                    try {
                        int var8 = var3.field3078[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3069[var7].field3270;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1396(21375, 0);
                            arg2.method1361((byte) -124, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field3069[var7].field3270;
                            var13.setInt((Object) null, var3.field3074[var7]);
                            arg2.method1396(21375, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field3069[var7].field3270;
                            int var12 = var11.getModifiers();
                            arg2.method1396(21375, 0);
                            arg2.method1361((byte) -126, var12);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3066[var7].field3270;
                            byte[][] var17 = var3.field3079[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method1396(21375, 0);
                            } else if ((var21 instanceof Number)) {
                                arg2.method1396(21375, 1);
                                arg2.method1381(1024975824, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg2.method1396(21375, 2);
                                arg2.method1359((byte) 0, (String) var21);
                            } else {
                                arg2.method1396(21375, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3066[var7].field3270;
                            int var15 = var14.getModifiers();
                            arg2.method1396(21375, 0);
                            arg2.method1361((byte) -122, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1396(21375, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method1396(21375, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1396(21375, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method1396(21375, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method1396(21375, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1396(21375, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method1396(21375, -16);
                    } catch (SecurityException var29) {
                        arg2.method1396(21375, -17);
                    } catch (IOException var30) {
                        arg2.method1396(21375, -18);
                    } catch (NullPointerException var31) {
                        arg2.method1396(21375, -19);
                    } catch (Exception var32) {
                        arg2.method1396(21375, -20);
                    } catch (Throwable var33) {
                        arg2.method1396(21375, -21);
                    }
                } else {
                    arg2.method1396(21375, var3.field3067[var7]);
                }
            }
            arg2.method1374(var6, 126);
            arg2.method1367((byte) -55, arg2.field2888 - var6);
            var3.method2290((byte) 98);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public final void method1829(int arg0) {
        this.field4042 = null;
        int var2 = 113 / ((arg0 - 51) / 46);
        this.field4060 = null;
        this.field4048 = null;
        this.field4054 = null;
        field4041++;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V")
    public static void method1830(byte arg0) {
        if (arg0 == -4) {
            field4059 = null;
            field4066 = null;
        }
    }
}
