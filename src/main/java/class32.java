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

@OriginalClass("client!bt")
public class class32 {

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "Z")
    public static boolean field469 = false;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "F")
    public static float field470;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method273(String arg0, int arg1) {
        int var2 = 89 % ((25 - arg1) / 43);
        field472++;
        return class206.method1412(true, true, 10, arg0);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILik;)V")
    public static final void method274(int arg0, int arg1, class141 arg2) {
        if (arg1 <= 50) {
            field469 = true;
        }
        field471++;
        while (true) {
            class183 var3 = (class183) class132.field1784.method445(33);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2482; var5++) {
                if (var3.field2484[var5] != null) {
                    if (var3.field2484[var5].field3322 == 2) {
                        var3.field2476[var5] = -5;
                    }
                    if (var3.field2484[var5].field3322 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2480[var5] != null) {
                    if (var3.field2480[var5].field3322 == 2) {
                        var3.field2476[var5] = -6;
                    }
                    if (var3.field2480[var5].field3322 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method947(65, arg0);
            arg2.method1072((byte) 102, 0);
            int var6 = arg2.field2185;
            arg2.method1073(326170192, var3.field2475);
            for (int var7 = 0; var7 < var3.field2482; var7++) {
                if (var3.field2476[var7] == 0) {
                    try {
                        int var8 = var3.field2483[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2484[var7].field3324;
                            int var10 = var9.getInt(null);
                            arg2.method1072((byte) 102, 0);
                            arg2.method1073(326170192, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2484[var7].field3324;
                            var11.setInt(null, var3.field2474[var7]);
                            arg2.method1072((byte) 102, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field2484[var7].field3324;
                            int var13 = var12.getModifiers();
                            arg2.method1072((byte) 102, 0);
                            arg2.method1073(326170192, var13);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field2480[var7].field3324;
                            byte[][] var15 = var3.field2477[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg2.method1072((byte) 102, 0);
                            } else if ((var19 instanceof Number)) {
                                arg2.method1072((byte) 102, 1);
                                arg2.method1054(((Number) var19).longValue(), -713416072);
                            } else if ((var19 instanceof String)) {
                                arg2.method1072((byte) 102, 2);
                                arg2.method1071(-25643, (String) var19);
                            } else {
                                arg2.method1072((byte) 102, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2480[var7].field3324;
                            int var21 = var20.getModifiers();
                            arg2.method1072((byte) 102, 0);
                            arg2.method1073(326170192, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1072((byte) 102, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method1072((byte) 102, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1072((byte) 102, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method1072((byte) 102, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method1072((byte) 102, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1072((byte) 102, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method1072((byte) 102, -16);
                    } catch (SecurityException var29) {
                        arg2.method1072((byte) 102, -17);
                    } catch (IOException var30) {
                        arg2.method1072((byte) 102, -18);
                    } catch (NullPointerException var31) {
                        arg2.method1072((byte) 102, -19);
                    } catch (Exception var32) {
                        arg2.method1072((byte) 102, -20);
                    } catch (Throwable var33) {
                        arg2.method1072((byte) 102, -21);
                    }
                } else {
                    arg2.method1072((byte) 102, var3.field2476[var7]);
                }
            }
            arg2.method1104(0, var6);
            arg2.method1082(-32769, arg2.field2185 - var6);
            var3.method25(-13489);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIII)V")
    public static final void method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field466++;
        if (arg2 >= -93) {
            field468 = -21;
        }
        if (class377.field5760 <= arg5 && arg1 <= class49.field701 && arg0 >= class463.field6924 && arg3 <= class369.field5628) {
            if (arg4 == 1) {
                class311.method1957(arg5, arg1, arg6, arg0, -1, arg3);
            } else {
                class46.method358(arg6, arg1, arg4, arg3, arg0, 46, arg5);
            }
        } else if (arg4 == 1) {
            class20.method188(arg3, (byte) 46, arg1, arg6, arg0, arg5);
        } else {
            class127.method872(arg0, arg1, arg6, 0, arg3, arg5, arg4);
        }
    }
}
