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

@OriginalClass("client!rl")
public class class74 extends class26 {

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public static int field979 = 0;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "[I")
    public static int[] field980 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field977 = 0;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    public static int field984 = 10;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "Lll;")
    public static class54 field983 = new class54();

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "Lkk;")
    public static class295 field976;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "[[[I")
    public static int[][][] field978;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lwa;ZI)V", line = 5)
    public static final void method542(class177 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field983 = (class54) null;
        }
        field975++;
        while (true) {
            class242 var3 = (class242) field983.method413(1253231568);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3503; var5++) {
                if (var3.field3505[var5] != null) {
                    if (var3.field3505[var5].field2608 == 2) {
                        var3.field3514[var5] = -5;
                    }
                    if (var3.field3505[var5].field2608 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3511[var5] != null) {
                    if (var3.field3511[var5].field2608 == 2) {
                        var3.field3514[var5] = -6;
                    }
                    if (var3.field3511[var5].field2608 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1309(23, arg2);
            arg0.method2048(0, 65);
            int var6 = arg0.field4351;
            arg0.method2084(true, var3.field3507);
            for (int var7 = 0; var7 < var3.field3503; var7++) {
                if (var3.field3514[var7] == 0) {
                    try {
                        int var8 = var3.field3506[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3505[var7].field2606;
                            int var10 = var9.getInt((Object) null);
                            arg0.method2048(0, 86);
                            arg0.method2084(true, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3505[var7].field2606;
                            var11.setInt((Object) null, var3.field3502[var7]);
                            arg0.method2048(0, 90);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field3505[var7].field2606;
                            int var13 = var12.getModifiers();
                            arg0.method2048(0, 112);
                            arg0.method2084(true, var13);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3511[var7].field2606;
                            byte[][] var17 = var3.field3500[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method2048(0, 118);
                            } else if (var21 instanceof Number) {
                                arg0.method2048(1, 86);
                                arg0.method2049(-19780, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg0.method2048(2, 103);
                                arg0.method2042((String) var21, -125);
                            } else {
                                arg0.method2048(4, 115);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3511[var7].field2606;
                            int var15 = var14.getModifiers();
                            arg0.method2048(0, 72);
                            arg0.method2084(true, var15);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method2048(-10, 84);
                    } catch (InvalidClassException var35) {
                        arg0.method2048(-11, 102);
                    } catch (StreamCorruptedException var36) {
                        arg0.method2048(-12, 127);
                    } catch (OptionalDataException var37) {
                        arg0.method2048(-13, 61);
                    } catch (IllegalAccessException var38) {
                        arg0.method2048(-14, 68);
                    } catch (IllegalArgumentException var39) {
                        arg0.method2048(-15, 89);
                    } catch (InvocationTargetException var40) {
                        arg0.method2048(-16, 97);
                    } catch (SecurityException var41) {
                        arg0.method2048(-17, 102);
                    } catch (IOException var42) {
                        arg0.method2048(-18, 117);
                    } catch (NullPointerException var43) {
                        arg0.method2048(-19, 104);
                    } catch (Exception var44) {
                        arg0.method2048(-20, 126);
                    } catch (Throwable var45) {
                        arg0.method2048(-21, 66);
                    }
                } else {
                    arg0.method2048(var3.field3514[var7], 77);
                }
            }
            arg0.method2088(8523, var6);
            arg0.method2105((byte) -115, arg0.field4351 - var6);
            var3.method179((byte) 51);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V", line = 202)
    public static void method543(int arg0) {
        field976 = null;
        field983 = null;
        if (arg0 != -11) {
            field978 = (int[][][]) ((int[][][]) null);
        }
        field980 = null;
        field978 = (int[][][]) null;
    }
}
