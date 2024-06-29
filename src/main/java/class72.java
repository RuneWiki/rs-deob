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

@OriginalClass("client!gf")
public class class72 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1365 = 0;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Ldj;")
    public static class44 field1364 = class89.method650(255, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Ldj;")
    private static class44 field1371 = class89.method650(255, "Please remove ");

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field1372 = 0;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
    public static boolean field1374 = false;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Ldj;")
    public static class44 field1370 = field1371;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field1373 = 0;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Ldj;")
    public static class44 field1376 = field1371;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Ldj;")
    private static class44 field1379 = class89.method650(255, "white:");

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Ldj;")
    public static class44 field1368 = field1379;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Ldj;")
    public static class44 field1369 = field1379;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[Lle;")
    public static class125[] field1377;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "[[[I")
    public static int[][][] field1378;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method563(int arg0) {
        field1376 = null;
        field1364 = null;
        field1369 = null;
        field1370 = null;
        field1378 = null;
        field1377 = null;
        field1368 = null;
        field1371 = null;
        field1379 = null;
        if (arg0 >= -26) {
            field1368 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)Lac;")
    public static final class4 method564(int arg0) {
        field1367++;
        try {
            if (arg0 != -6) {
                field1377 = null;
            }
            return (class4) Class.forName("ug").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class235();
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lwd;IIIII)V")
    public static final void method565(class234 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class163.field2815 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class66.field1205) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class21.field355 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class68 var14 = class32.field567[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class205.field3675[var11][var12 + 1][var13] + class205.field3675[var11][var12][var13] + class205.field3675[var11][var12][var13 + 1] + class205.field3675[var11][var12 + 1][var13 + 1]) / 4 - (class205.field3675[arg1][arg2 + 1][arg3] + class205.field3675[arg1][arg2][arg3] + class205.field3675[arg1][arg2][arg3 + 1] + class205.field3675[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class33 var16 = var14.field1298;
                                    if (var16 != null) {
                                        if (var16.field576.method1269()) {
                                            arg0.method1254(var16.field576, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field578 != null && var16.field578.method1269()) {
                                            arg0.method1254(var16.field578, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1300; var17++) {
                                        class106 var18 = var14.field1314[var17];
                                        if (var18 != null && var18.field1947.method1269() && (var18.field1945 == var12 || var7 == var12) && (var18.field1955 == var13 || var9 == var13)) {
                                            int var19 = var18.field1939 + 1 - var18.field1945;
                                            int var20 = var18.field1936 + 1 - var18.field1955;
                                            arg0.method1254(var18.field1947, (var18.field1945 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1955 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
    public static final void method566(int arg0, int arg1, int arg2) {
        int[] var3 = new int[4];
        field1366++;
        var3[0] = arg2;
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class17.field306[var6] != arg2) {
                var3[var5] = class17.field306[var6];
                var4[var5] = class156.field2704[var6];
                var5++;
            }
        }
        class17.field306 = var3;
        class156.field2704 = var4;
        class197.method1276(0, class183.field3188.length + arg0, 30146, class183.field3188, class17.field306, class156.field2704);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLrh;I)V")
    public static final void method567(byte arg0, class188 arg1, int arg2) {
        field1375++;
        if (arg0 != 82) {
            method566(-31, 91, -24);
        }
        while (true) {
            class166 var3 = (class166) class135.field2412.method1189(arg0 ^ 0x52);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2859; var5++) {
                if (var3.field2857[var5] != null) {
                    if (var3.field2857[var5].field3043 == 2) {
                        var3.field2863[var5] = -5;
                    }
                    if (var3.field2857[var5].field3043 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2858[var5] != null) {
                    if (var3.field2858[var5].field3043 == 2) {
                        var3.field2863[var5] = -6;
                    }
                    if (var3.field2858[var5].field3043 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1170(arg2, (byte) -105);
            arg1.method488(120, 0);
            int var6 = arg1.field1195;
            arg1.method489(var3.field2855, -85);
            for (int var7 = 0; var7 < var3.field2859; var7++) {
                if (var3.field2863[var7] == 0) {
                    try {
                        int var8 = var3.field2866[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2857[var7].field3040;
                            int var10 = var9.getInt(null);
                            arg1.method488(arg0 ^ 0x28, 0);
                            arg1.method489(var10, -45);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2857[var7].field3040;
                            var11.setInt(null, var3.field2854[var7]);
                            arg1.method488(126, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field2857[var7].field3040;
                            int var13 = var12.getModifiers();
                            arg1.method488(127, 0);
                            arg1.method489(var13, -114);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2858[var7].field3040;
                            byte[][] var17 = var3.field2862[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method488(121, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method488(120, 1);
                                arg1.method536(((Number) var21).longValue(), 59);
                            } else if (var21 instanceof class44) {
                                arg1.method488(arg0 ^ 0x2E, 2);
                                arg1.method492(7527, (class44) var21);
                            } else {
                                arg1.method488(120, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2858[var7].field3040;
                            int var15 = var14.getModifiers();
                            arg1.method488(arg0 ^ 0x2D, 0);
                            arg1.method489(var15, arg0 - 128);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method488(arg0 + 39, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method488(123, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method488(arg0 ^ 0x2D, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method488(123, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method488(125, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method488(arg0 ^ 0x2C, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method488(123, -16);
                    } catch (SecurityException var29) {
                        arg1.method488(arg0 + 38, -17);
                    } catch (IOException var30) {
                        arg1.method488(126, -18);
                    } catch (NullPointerException var31) {
                        arg1.method488(arg0 ^ 0x2D, -19);
                    } catch (Exception var32) {
                        arg1.method488(120, -20);
                    } catch (Throwable var33) {
                        arg1.method488(121, -21);
                    }
                } else {
                    arg1.method488(119, var3.field2863[var7]);
                }
            }
            arg1.method518(var6, -69);
            arg1.method508(-1, arg1.field1195 - var6);
            var3.method1148(-13215);
        }
    }
}
