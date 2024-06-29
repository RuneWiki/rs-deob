import java.awt.Component;
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

@OriginalClass("client!ti")
public class class204 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3120 = 20;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Ljo;")
    public static class150 field3122 = new class150();

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILha;)V", line = 4)
    public static final void method1390(int arg0, int arg1, class29 arg2) {
        if (arg0 != -14) {
            field3122 = (class150) null;
        }
        field3119++;
        while (true) {
            class267 var3 = (class267) class69.field1067.method1081(107);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4404; var5++) {
                if (var3.field4390[var5] != null) {
                    if (var3.field4390[var5].field2542 == 2) {
                        var3.field4398[var5] = -5;
                    }
                    if (var3.field4390[var5].field2542 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4396[var5] != null) {
                    if (var3.field4396[var5].field2542 == 2) {
                        var3.field4398[var5] = -6;
                    }
                    if (var3.field4396[var5].field2542 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method250(21066, arg1);
            arg2.method2193(0, false);
            int var6 = arg2.field5137;
            arg2.method2222(var3.field4397, 255);
            for (int var7 = 0; var7 < var3.field4404; var7++) {
                if (var3.field4398[var7] == 0) {
                    try {
                        int var8 = var3.field4395[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field4390[var7].field2538;
                            int var10 = var9.getInt((Object) null);
                            arg2.method2193(0, false);
                            arg2.method2222(var10, 255);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field4390[var7].field2538;
                            var11.setInt((Object) null, var3.field4391[var7]);
                            arg2.method2193(0, false);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field4390[var7].field2538;
                            int var13 = var12.getModifiers();
                            arg2.method2193(0, false);
                            arg2.method2222(var13, 255);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field4396[var7].field2538;
                            byte[][] var15 = var3.field4399[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method2193(0, false);
                            } else if (var19 instanceof Number) {
                                arg2.method2193(1, false);
                                arg2.method2228(((Number) var19).longValue(), true);
                            } else if (var19 instanceof String) {
                                arg2.method2193(2, false);
                                arg2.method2223(arg0 ^ 0xFFFFFFF2, (String) var19);
                            } else {
                                arg2.method2193(4, false);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field4396[var7].field2538;
                            int var21 = var20.getModifiers();
                            arg2.method2193(0, false);
                            arg2.method2222(var21, arg0 + 269);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg2.method2193(-10, false);
                    } catch (InvalidClassException var35) {
                        arg2.method2193(-11, false);
                    } catch (StreamCorruptedException var36) {
                        arg2.method2193(-12, false);
                    } catch (OptionalDataException var37) {
                        arg2.method2193(-13, false);
                    } catch (IllegalAccessException var38) {
                        arg2.method2193(-14, false);
                    } catch (IllegalArgumentException var39) {
                        arg2.method2193(-15, false);
                    } catch (InvocationTargetException var40) {
                        arg2.method2193(-16, false);
                    } catch (SecurityException var41) {
                        arg2.method2193(-17, false);
                    } catch (IOException var42) {
                        arg2.method2193(-18, false);
                    } catch (NullPointerException var43) {
                        arg2.method2193(-19, false);
                    } catch (Exception var44) {
                        arg2.method2193(-20, false);
                    } catch (Throwable var45) {
                        arg2.method2193(-21, false);
                    }
                } else {
                    arg2.method2193(var3.field4398[var7], false);
                }
            }
            arg2.method2244(var6, -128);
            arg2.method2240((byte) 76, arg2.field5137 - var6);
            var3.method1131(8);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 197)
    public static void method1391(int arg0) {
        field3122 = null;
        if (arg0 < 91) {
            method1394(-118, -68);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)I", line = 209)
    public static final int method1392(boolean arg0) {
        field3121++;
        return arg0 ? 11 : class181.field2820.method647(-80);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILjava/awt/Component;I)Lpa;", line = 223)
    public static final class169 method1393(int arg0, int arg1, Component arg2, int arg3) {
        field3123++;
        try {
            Class var4 = Class.forName("vk");
            if (arg0 == 30663) {
                class169 var5 = (class169) var4.getDeclaredConstructor().newInstance();
                var5.method1165(arg3, 4, arg1, arg2);
                return var5;
            } else {
                return (class169) null;
            }
        } catch (Throwable var8) {
            class228 var7 = new class228();
            var7.method1165(arg3, arg0 ^ 0x77C3, arg1, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Ljava/lang/String;", line = 254)
    public static final String method1394(int arg0, int arg1) {
        field3118++;
        if (arg1 != 0) {
            field3122 = (class150) null;
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + ((arg0 & 0xFF6F) >> 8) + "." + (arg0 & 0xFF);
    }
}
