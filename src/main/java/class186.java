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

@OriginalClass("client!sj")
public abstract class class186 extends class155 {

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "Lpi;")
    public static class201 field2771 = new class201(100);

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "[I")
    public static int[] field2772 = new int[100];

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "Z")
    public static boolean field2774 = false;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II[Lmh;IIZ)V")
    public static final void method1329(int arg0, int arg1, class263[] arg2, int arg3, int arg4, boolean arg5) {
        for (int var6 = arg1; var6 < arg2.length; var6++) {
            class263 var7 = arg2[var6];
            if (var7 != null && var7.field4202 == arg0) {
                class128.method971(arg3, var7, arg5, arg4, (byte) -59);
                class24.method162(arg3, -13627, arg4, var7);
                if ((var7.field4207 - var7.field4046) < var7.field4160) {
                    var7.field4160 = var7.field4207 - var7.field4046;
                }
                if (var7.field4171 - var7.field4215 < var7.field4097) {
                    var7.field4097 = var7.field4171 - var7.field4215;
                }
                if (var7.field4097 < 0) {
                    var7.field4097 = 0;
                }
                if (var7.field4160 < 0) {
                    var7.field4160 = 0;
                }
                if (var7.field4129 == 0) {
                    class107.method826((byte) 81, var7, arg5);
                }
            }
        }
        field2769++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Llc;III)[Ldj;")
    public static final class138[] method1330(class270 arg0, int arg1, int arg2, int arg3) {
        field2768++;
        if (class144.method1079(arg3, arg0, arg1, (byte) 59)) {
            if (arg2 >= -9) {
                method1332(true, -32, (class91) null);
            }
            return class291.method1978(87);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(Z)Z")
    public abstract boolean method563(boolean arg0);

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method559(int arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ICI)C")
    public static final char method1331(int arg0, char arg1, int arg2) {
        int var3 = -126 % ((-arg0 - 10) / 55);
        field2775++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZILue;)V")
    public static final void method1332(boolean arg0, int arg1, class91 arg2) {
        if (!arg0) {
            return;
        }
        field2770++;
        while (true) {
            class182 var3 = (class182) class159.field2475.method8(-103);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2739; var5++) {
                if (var3.field2733[var5] != null) {
                    if (var3.field2733[var5].field936 == 2) {
                        var3.field2728[var5] = -5;
                    }
                    if (var3.field2733[var5].field936 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2734[var5] != null) {
                    if (var3.field2734[var5].field936 == 2) {
                        var3.field2728[var5] = -6;
                    }
                    if (var3.field2734[var5].field936 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method683(true, arg1);
            arg2.method360(0, 25759);
            int var6 = arg2.field735;
            arg2.method385(var3.field2738, 455748840);
            for (int var7 = 0; var7 < var3.field2739; var7++) {
                if (var3.field2728[var7] == 0) {
                    try {
                        int var8 = var3.field2726[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2733[var7].field932;
                            int var13 = var12.getInt((Object) null);
                            arg2.method360(0, 25759);
                            arg2.method385(var13, 455748840);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2733[var7].field932;
                            var11.setInt((Object) null, var3.field2737[var7]);
                            arg2.method360(0, 25759);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field2733[var7].field932;
                            int var10 = var9.getModifiers();
                            arg2.method360(0, 25759);
                            arg2.method385(var10, 455748840);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2734[var7].field932;
                            byte[][] var17 = var3.field2729[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method360(0, 25759);
                            } else if ((var21 instanceof Number)) {
                                arg2.method360(1, 25759);
                                arg2.method382(902642416, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg2.method360(2, 25759);
                                arg2.method338((String) var21, 1970);
                            } else {
                                arg2.method360(4, 25759);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2734[var7].field932;
                            int var15 = var14.getModifiers();
                            arg2.method360(0, 25759);
                            arg2.method385(var15, 455748840);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method360(-10, 25759);
                    } catch (InvalidClassException var23) {
                        arg2.method360(-11, 25759);
                    } catch (StreamCorruptedException var24) {
                        arg2.method360(-12, 25759);
                    } catch (OptionalDataException var25) {
                        arg2.method360(-13, 25759);
                    } catch (IllegalAccessException var26) {
                        arg2.method360(-14, 25759);
                    } catch (IllegalArgumentException var27) {
                        arg2.method360(-15, 25759);
                    } catch (InvocationTargetException var28) {
                        arg2.method360(-16, 25759);
                    } catch (SecurityException var29) {
                        arg2.method360(-17, 25759);
                    } catch (IOException var30) {
                        arg2.method360(-18, 25759);
                    } catch (NullPointerException var31) {
                        arg2.method360(-19, 25759);
                    } catch (Exception var32) {
                        arg2.method360(-20, 25759);
                    } catch (Throwable var33) {
                        arg2.method360(-21, 25759);
                    }
                } else {
                    arg2.method360(var3.field2728[var7], 25759);
                }
            }
            arg2.method363(var6, -22053);
            arg2.method355(arg2.field735 - var6, 101);
            var3.method1781(5250);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    public static void method1333(byte arg0) {
        field2771 = null;
        field2772 = null;
        if (arg0 > -2) {
            field2773 = -102;
        }
    }
}
