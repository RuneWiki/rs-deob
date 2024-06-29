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

@OriginalClass("client!t")
public class class293 {

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field4484 = 0;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[I")
    public static int[] field4480 = new int[5];

    @OriginalMember(owner = "client!t", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4485 = new String[200];

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4481 = "glow1:";

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lab;")
    public static class279 field4478 = new class279(50);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 3)
    public static final void method1962(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class154 var20 = new class154(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class326.field4975[var21][arg1][arg2] == null) {
                    class326.field4975[var21][arg1][arg2] = new class47(var21, arg1, arg2);
                }
            }
            class326.field4975[arg0][arg1][arg2].field970 = var20;
        } else if (arg3 == 1) {
            class154 var22 = new class154(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class326.field4975[var23][arg1][arg2] == null) {
                    class326.field4975[var23][arg1][arg2] = new class47(var23, arg1, arg2);
                }
            }
            class326.field4975[arg0][arg1][arg2].field970 = var22;
        } else {
            class7 var24 = new class7(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class326.field4975[var25][arg1][arg2] == null) {
                    class326.field4975[var25][arg1][arg2] = new class47(var25, arg1, arg2);
                }
            }
            class326.field4975[arg0][arg1][arg2].field973 = var24;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILoe;I)V", line = 53)
    public static final void method1963(int arg0, class9 arg1, int arg2) {
        if (arg2 > -60) {
            field4485 = (String[]) null;
        }
        field4482++;
        while (true) {
            class46 var3 = (class46) class328.field5020.method424(-120);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field944; var5++) {
                if (var3.field947[var5] != null) {
                    if (var3.field947[var5].field1852 == 2) {
                        var3.field945[var5] = -5;
                    }
                    if (var3.field947[var5].field1852 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field939[var5] != null) {
                    if (var3.field939[var5].field1852 == 2) {
                        var3.field945[var5] = -6;
                    }
                    if (var3.field939[var5].field1852 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method80(arg0, (byte) 115);
            arg1.method1311(0, 10964);
            int var6 = arg1.field3249;
            arg1.method1359(16705, var3.field946);
            for (int var7 = 0; var7 < var3.field944; var7++) {
                if (var3.field945[var7] == 0) {
                    try {
                        int var8 = var3.field940[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field947[var7].field1853;
                            int var10 = var9.getInt((Object) null);
                            arg1.method1311(0, 10964);
                            arg1.method1359(16705, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field947[var7].field1853;
                            var11.setInt((Object) null, var3.field941[var7]);
                            arg1.method1311(0, 10964);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field947[var7].field1853;
                            int var13 = var12.getModifiers();
                            arg1.method1311(0, 10964);
                            arg1.method1359(16705, var13);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field939[var7].field1853;
                            byte[][] var17 = var3.field938[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method1311(0, 10964);
                            } else if (var21 instanceof Number) {
                                arg1.method1311(1, 10964);
                                arg1.method1353((byte) -105, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg1.method1311(2, 10964);
                                arg1.method1309(50, (String) var21);
                            } else {
                                arg1.method1311(4, 10964);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field939[var7].field1853;
                            int var15 = var14.getModifiers();
                            arg1.method1311(0, 10964);
                            arg1.method1359(16705, var15);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg1.method1311(-10, 10964);
                    } catch (InvalidClassException var35) {
                        arg1.method1311(-11, 10964);
                    } catch (StreamCorruptedException var36) {
                        arg1.method1311(-12, 10964);
                    } catch (OptionalDataException var37) {
                        arg1.method1311(-13, 10964);
                    } catch (IllegalAccessException var38) {
                        arg1.method1311(-14, 10964);
                    } catch (IllegalArgumentException var39) {
                        arg1.method1311(-15, 10964);
                    } catch (InvocationTargetException var40) {
                        arg1.method1311(-16, 10964);
                    } catch (SecurityException var41) {
                        arg1.method1311(-17, 10964);
                    } catch (IOException var42) {
                        arg1.method1311(-18, 10964);
                    } catch (NullPointerException var43) {
                        arg1.method1311(-19, 10964);
                    } catch (Exception var44) {
                        arg1.method1311(-20, 10964);
                    } catch (Throwable var45) {
                        arg1.method1311(-21, 10964);
                    }
                } else {
                    arg1.method1311(var3.field945[var7], 10964);
                }
            }
            arg1.method1344(var6, 127);
            arg1.method1318(arg1.field3249 - var6, (byte) -19);
            var3.method278((byte) -105);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)Lii;", line = 242)
    public static final class289 method1964(int arg0, int arg1, int arg2) {
        class47 var3 = class326.field4975[arg0][arg1][arg2];
        return var3 == null || var3.field967 == null ? null : var3.field967;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V", line = 255)
    public static final void method1965(boolean arg0) {
        field4477++;
        if (!arg0) {
            field4481 = (String) null;
        }
        class35.field699.method1877(-29702);
        class151.field2463.method1877(-29702);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 269)
    public static void method1966(byte arg0) {
        field4480 = null;
        field4485 = null;
        if (arg0 == -25) {
            field4478 = null;
            field4481 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 283)
    public static final void method1967(int arg0) {
        field4479++;
        if (class344.field5349) {
            return;
        }
        class35.field707 = true;
        if (class6.field136) {
            class95.field1709 = (float) ((int) class95.field1709 + 191 & 0xFFFFFF80);
        } else {
            class199.field3185 += (24.0F - class199.field3185) / 2.0F;
        }
        if (arg0 != 2) {
            method1966((byte) -51);
        }
        class344.field5349 = true;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V", line = 308)
    public static final void method1968(byte arg0) {
        if (arg0 >= -124) {
            return;
        }
        field4483++;
        if (class277.field4249 != null) {
            class148 var1 = class277.field4249;
            synchronized (class277.field4249) {
                class277.field4249 = null;
            }
        }
    }
}
