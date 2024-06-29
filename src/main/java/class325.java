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

@OriginalClass("client!u")
public class class325 {

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field5041 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lak;")
    public static class172 field5040;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lpi;", line = 18)
    public static final class202 method2274(int arg0, int arg1) {
        field5037++;
        class202 var2 = (class202) class279.field4492.method704((byte) 110, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class277.field4465.method1287(class137.method1018(arg0, 53), class318.method2239(arg0, -1), -1);
        class202 var4 = new class202();
        var4.field3288 = arg0;
        if (var3 != null) {
            var4.method1480(new class44(var3), (byte) 87);
        }
        var4.method1475(0);
        if (arg1 > -56) {
            field5040 = (class172) null;
        }
        class279.field4492.method703(var4, (long) arg0, (byte) 64);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BII)V", line = 82)
    public static final void method2275(byte arg0, int arg1, int arg2) {
        class27 var3 = class117.method809(arg1, -100);
        field5039++;
        int var4 = var3.field375;
        int var5 = var3.field380;
        int var6 = var3.field370;
        if (arg0 != -23) {
            return;
        }
        int var7 = class131.field2075[var5 - var4];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var4;
        class186.method1391(var6, -33, arg2 << var4 & var8 | ~var8 & class70.field991[var6]);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIBII)V", line = 173)
    public static final void method2276(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field5042++;
        class24.field329 = arg0;
        class338.field5270 = arg1;
        int var6 = -40 % ((76 - arg3) / 37);
        class123.field1923 = arg4;
        class61.field883 = arg2;
        class191.field3123 = arg5;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BILpf;)V", line = 199)
    public static final void method2277(byte arg0, int arg1, class342 arg2) {
        if (arg0 != 2) {
            method2275((byte) -72, -82, -60);
        }
        field5038++;
        while (true) {
            class152 var3 = (class152) class184.field3042.method1240(3);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2341; var5++) {
                if (var3.field2342[var5] != null) {
                    if (var3.field2342[var5].field2661 == 2) {
                        var3.field2345[var5] = -5;
                    }
                    if (var3.field2342[var5].field2661 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2343[var5] != null) {
                    if (var3.field2343[var5].field2661 == 2) {
                        var3.field2345[var5] = -6;
                    }
                    if (var3.field2343[var5].field2661 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method2375(arg1, 0);
            arg2.method257(-2, 0);
            int var6 = arg2.field586;
            arg2.method283((byte) -51, var3.field2351);
            for (int var7 = 0; var7 < var3.field2341; var7++) {
                if (var3.field2345[var7] == 0) {
                    try {
                        int var8 = var3.field2354[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2342[var7].field2664;
                            int var13 = var12.getInt((Object) null);
                            arg2.method257(-2, 0);
                            arg2.method283((byte) -51, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field2342[var7].field2664;
                            var9.setInt((Object) null, var3.field2347[var7]);
                            arg2.method257(arg0 ^ 0xFFFFFFFC, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field2342[var7].field2664;
                            int var11 = var10.getModifiers();
                            arg2.method257(-2, 0);
                            arg2.method283((byte) -51, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2343[var7].field2664;
                            byte[][] var17 = var3.field2346[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method257(-2, 0);
                            } else if (var21 instanceof Number) {
                                arg2.method257(-2, 1);
                                arg2.method255(false, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg2.method257(arg0 - 4, 2);
                                arg2.method231(arg0 + 23571, (String) var21);
                            } else {
                                arg2.method257(-2, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2343[var7].field2664;
                            int var15 = var14.getModifiers();
                            arg2.method257(arg0 ^ 0xFFFFFFFC, 0);
                            arg2.method283((byte) -51, var15);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg2.method257(arg0 ^ 0xFFFFFFFC, -10);
                    } catch (InvalidClassException var35) {
                        arg2.method257(-2, -11);
                    } catch (StreamCorruptedException var36) {
                        arg2.method257(-2, -12);
                    } catch (OptionalDataException var37) {
                        arg2.method257(-2, -13);
                    } catch (IllegalAccessException var38) {
                        arg2.method257(-2, -14);
                    } catch (IllegalArgumentException var39) {
                        arg2.method257(-2, -15);
                    } catch (InvocationTargetException var40) {
                        arg2.method257(-2, -16);
                    } catch (SecurityException var41) {
                        arg2.method257(-2, -17);
                    } catch (IOException var42) {
                        arg2.method257(-2, -18);
                    } catch (NullPointerException var43) {
                        arg2.method257(-2, -19);
                    } catch (Exception var44) {
                        arg2.method257(arg0 ^ 0xFFFFFFFC, -20);
                    } catch (Throwable var45) {
                        arg2.method257(-2, -21);
                    }
                } else {
                    arg2.method257(arg0 ^ 0xFFFFFFFC, var3.field2345[var7]);
                }
            }
            arg2.method262((byte) 118, var6);
            arg2.method251(arg2.field586 - var6, false);
            var3.method1212((byte) 71);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 389)
    public static void method2278(int arg0) {
        if (arg0 == 0) {
            field5040 = null;
        }
    }
}
