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

@OriginalClass("client!i")
public class class55 extends class207 {

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1111 = 0;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "Z")
    public static boolean field1122 = true;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "Ljd;")
    public static class86 field1126 = class122.method868("<img=0>", true);

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Ljd;")
    private static class86 field1116 = class122.method868("Loading)3)3)3", true);

    @OriginalMember(owner = "client!i", name = "y", descriptor = "Ljd;")
    public static class86 field1120 = field1116;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "Ljd;")
    public static class86 field1127 = class122.method868("lila:", true);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field1130 = 0;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Loj;")
    public static class155 field1109;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Lwj;")
    public class6 field1114;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "Lwj;")
    public class6 field1129;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "Ljd;")
    public class86 field1123;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Z")
    public boolean field1112;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "[Ljava/lang/Object;")
    public Object[] field1128;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqh;II)V")
    public static final void method404(class195 arg0, int arg1, int arg2) {
        field1125++;
        int var3 = -116 / ((arg2 - 54) / 34);
        while (true) {
            class176 var4 = (class176) class226.field4103.method1737((byte) 74);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field3198; var6++) {
                if (var4.field3197[var6] != null) {
                    if (var4.field3197[var6].field613 == 2) {
                        var4.field3191[var6] = -5;
                    }
                    if (var4.field3197[var6].field613 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field3201[var6] != null) {
                    if (var4.field3201[var6].field613 == 2) {
                        var4.field3191[var6] = -6;
                    }
                    if (var4.field3201[var6].field613 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg0.method1356(arg1, true);
            arg0.method1388(-71, 0);
            int var7 = arg0.field3565;
            arg0.method1406(1472534024, var4.field3190);
            for (int var8 = 0; var8 < var4.field3198; var8++) {
                if (var4.field3191[var8] == 0) {
                    try {
                        int var9 = var4.field3196[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field3197[var8].field611;
                            int var14 = var13.getInt((Object) null);
                            arg0.method1388(-119, 0);
                            arg0.method1406(1472534024, var14);
                        } else if (var9 == 1) {
                            Field var12 = (Field) var4.field3197[var8].field611;
                            var12.setInt((Object) null, var4.field3194[var8]);
                            arg0.method1388(-79, 0);
                        } else if (var9 == 2) {
                            Field var10 = (Field) var4.field3197[var8].field611;
                            int var11 = var10.getModifiers();
                            arg0.method1388(-46, 0);
                            arg0.method1406(1472534024, var11);
                        }
                        if (var9 == 3) {
                            Method var17 = (Method) var4.field3201[var8].field611;
                            byte[][] var18 = var4.field3192[var8];
                            Object[] var19 = new Object[var18.length];
                            for (int var20 = 0; var20 < var18.length; var20++) {
                                ObjectInputStream var21 = new ObjectInputStream(new ByteArrayInputStream(var18[var20]));
                                var19[var20] = var21.readObject();
                            }
                            Object var22 = var17.invoke((Object) null, var19);
                            if (var22 == null) {
                                arg0.method1388(-36, 0);
                            } else if (var22 instanceof Number) {
                                arg0.method1388(-97, 1);
                                arg0.method1399((byte) -105, ((Number) var22).longValue());
                            } else if ((var22 instanceof class86)) {
                                arg0.method1388(-61, 2);
                                arg0.method1379(0, (class86) var22);
                            } else {
                                arg0.method1388(-104, 4);
                            }
                        } else if (var9 == 4) {
                            Method var15 = (Method) var4.field3201[var8].field611;
                            int var16 = var15.getModifiers();
                            arg0.method1388(-104, 0);
                            arg0.method1406(1472534024, var16);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg0.method1388(-72, -10);
                    } catch (InvalidClassException var24) {
                        arg0.method1388(-80, -11);
                    } catch (StreamCorruptedException var25) {
                        arg0.method1388(-93, -12);
                    } catch (OptionalDataException var26) {
                        arg0.method1388(-108, -13);
                    } catch (IllegalAccessException var27) {
                        arg0.method1388(-73, -14);
                    } catch (IllegalArgumentException var28) {
                        arg0.method1388(-87, -15);
                    } catch (InvocationTargetException var29) {
                        arg0.method1388(-114, -16);
                    } catch (SecurityException var30) {
                        arg0.method1388(-87, -17);
                    } catch (IOException var31) {
                        arg0.method1388(-38, -18);
                    } catch (NullPointerException var32) {
                        arg0.method1388(-73, -19);
                    } catch (Exception var33) {
                        arg0.method1388(-69, -20);
                    } catch (Throwable var34) {
                        arg0.method1388(-56, -21);
                    }
                } else {
                    arg0.method1388(-108, var4.field3191[var8]);
                }
            }
            arg0.method1381(var7, (byte) 127);
            arg0.method1400(101, arg0.field3565 - var7);
            var4.method1477(1);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static final void method405(byte arg0) {
        if (class75.field1502 != null) {
            class227 var1 = class75.field1502;
            synchronized (class75.field1502) {
                class75.field1502 = null;
            }
        }
        if (arg0 != 51) {
            method405((byte) -56);
        }
        field1110++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Z")
    public static final boolean method406(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class150.field2792; var3++) {
            class106 var4 = class230.field4181[var3];
            if (var4.field2038 == 1) {
                int var5 = var4.field2046 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2035 * var5 >> 8) + var4.field2041;
                    int var7 = (var4.field2034 * var5 >> 8) + var4.field2026;
                    int var8 = (var4.field2022 * var5 >> 8) + var4.field2031;
                    int var9 = (var4.field2036 * var5 >> 8) + var4.field2020;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2038 == 2) {
                int var10 = arg0 - var4.field2046;
                if (var10 > 0) {
                    int var11 = (var4.field2035 * var10 >> 8) + var4.field2041;
                    int var12 = (var4.field2034 * var10 >> 8) + var4.field2026;
                    int var13 = (var4.field2022 * var10 >> 8) + var4.field2031;
                    int var14 = (var4.field2036 * var10 >> 8) + var4.field2020;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2038 == 3) {
                int var15 = var4.field2041 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2037 * var15 >> 8) + var4.field2046;
                    int var17 = (var4.field2027 * var15 >> 8) + var4.field2044;
                    int var18 = (var4.field2022 * var15 >> 8) + var4.field2031;
                    int var19 = (var4.field2036 * var15 >> 8) + var4.field2020;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2038 == 4) {
                int var20 = arg2 - var4.field2041;
                if (var20 > 0) {
                    int var21 = (var4.field2037 * var20 >> 8) + var4.field2046;
                    int var22 = (var4.field2027 * var20 >> 8) + var4.field2044;
                    int var23 = (var4.field2022 * var20 >> 8) + var4.field2031;
                    int var24 = (var4.field2036 * var20 >> 8) + var4.field2020;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2038 == 5) {
                int var25 = arg1 - var4.field2031;
                if (var25 > 0) {
                    int var26 = (var4.field2037 * var25 >> 8) + var4.field2046;
                    int var27 = (var4.field2027 * var25 >> 8) + var4.field2044;
                    int var28 = (var4.field2035 * var25 >> 8) + var4.field2041;
                    int var29 = (var4.field2034 * var25 >> 8) + var4.field2026;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IJZII)Ljd;")
    public static final class86 method407(int arg0, long arg1, boolean arg2, int arg3, int arg4) {
        field1117++;
        class86 var6 = class106.method758(0, 0);
        if (arg1 < 0L) {
            var6.method582(arg3 + 22193, class228.field4140);
            arg1 = -arg1;
        }
        class86 var7 = class118.field2322;
        class86 var8 = class142.field2691;
        if (arg0 == 1) {
            var8 = class118.field2322;
            var7 = class142.field2691;
        }
        if (arg0 == 2) {
            var7 = class79.field1545;
            var8 = class118.field2322;
        }
        class86 var9 = class106.method758(0, 0);
        class86 var10 = class106.method758(0, arg3 ^ arg3);
        for (int var11 = 0; var11 < arg4; var11++) {
            var10.method582(-1, class4.method26(false, (int) (arg1 % 10L)));
            arg1 /= 10L;
        }
        if (arg1 == 0L) {
            var9 = class129.field2478;
        }
        int var12 = 0;
        while (arg1 > 0L) {
            if (arg2 && var12 != 0 && var12 % 3 == 0) {
                var9.method582(arg3 + 22193, var7);
            }
            var12++;
            var9.method582(arg3 + 22193, class4.method26(false, (int) (arg1 % 10L)));
            arg1 /= 10L;
        }
        if (var10.method612((byte) 118) > 0) {
            var10.method582(arg3 + 22193, var8);
        }
        return class109.method783(2, new class86[] { var6, var9.method632(2777), var10.method632(arg3 + 24971) });
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V")
    public static void method408(byte arg0) {
        if (arg0 != 68) {
            return;
        }
        field1120 = null;
        field1126 = null;
        field1116 = null;
        field1127 = null;
        field1109 = null;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
    public static final void method409(int arg0) {
        field1124++;
        if (!class171.method1225(arg0 ^ 0x1D) && class6.field235 != class180.field3244) {
            class184.method1271(class149.field2780, arg0 - 118, class180.field3244, class249.field4446, false, class124.field2412.field707[0], class124.field2412.field705[0]);
            return;
        }
        if (class244.field4357 != class180.field3244) {
            class244.field4357 = class180.field3244;
            class70.method507(15090, class180.field3244);
            class100.method721(-126);
        }
        if (arg0 != 0) {
            field1109 = null;
        }
    }
}
