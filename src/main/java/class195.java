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

@OriginalClass("client!vc")
public class class195 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lrf;")
    public static class289 field2966 = null;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "[I")
    public static int[] field2974 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Z")
    public static boolean field2970;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1215(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2969++;
        if (arg5 >= -80) {
            method1217((String) null, -48);
        }
        if (arg1 == arg4) {
            class264.method1756(arg3, 1, arg0, arg2, arg1);
        } else if ((arg2 - arg1) >= class248.field3765 && arg1 + arg2 <= class163.field2505 && (arg0 - arg4) >= class243.field3635 && class118.field1782 >= (arg0 + arg4)) {
            class77.method515(arg1, 1569449985, arg3, arg2, arg4, arg0);
        } else {
            class134.method825(arg4, arg2, -117, arg1, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLfl;)Lmh;")
    public static final class154 method1216(byte arg0, class248 arg1) {
        if (arg0 <= 89) {
            return null;
        } else {
            field2973++;
            return new class154(arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1587(-123), arg1.method1593((byte) 27));
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1217(String arg0, int arg1) {
        if (arg1 >= -49) {
            field2966 = null;
        }
        field2971++;
        int var2 = class96.method624(-1, arg0);
        if (var2 != -1) {
            int[] var3 = class39.field524.method1082(120, class293.field4610.field2739[var2] & 0x3FFF, class293.field4610.field2739[var2] >> 14 & 0x3FFF, class293.field4610.field2739[var2] >> 28 & 0x3);
            class198.method1238(var3[1], var3[2], -1);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IS)Z")
    public static final boolean method1218(int arg0, short arg1) {
        field2965++;
        if (arg1 == 25 || arg1 == 45 || arg1 == 22 || arg1 == 47 || arg1 == 49 || arg1 == 1 || arg1 == 60 || arg1 == 59) {
            return true;
        } else if (arg1 == 13 || arg1 == 43 || arg1 == 1003 || arg1 == 1006) {
            return true;
        } else if (arg1 == 29 || arg1 == 26 || arg1 == 38 || arg1 == 14 || arg1 == 58) {
            return true;
        } else if (arg1 == 11 || arg1 == 41 || arg1 == 5 || arg1 == 9 || arg1 == 46 || arg1 == 37) {
            return true;
        } else {
            if (arg0 != -5) {
                field2966 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static final void method1219(boolean arg0) {
        field2967++;
        if (!arg0) {
            field2972 = -82;
        }
        class277.field4178++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILwg;)V")
    public static final void method1220(int arg0, int arg1, class177 arg2) {
        if (arg1 != -24025) {
            field2970 = false;
        }
        field2976++;
        while (true) {
            class293 var3 = (class293) class248.field3705.method983(7);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4608; var5++) {
                if (var3.field4613[var5] != null) {
                    if (var3.field4613[var5].field1249 == 2) {
                        var3.field4623[var5] = -5;
                    }
                    if (var3.field4613[var5].field1249 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4622[var5] != null) {
                    if (var3.field4622[var5].field1249 == 2) {
                        var3.field4623[var5] = -6;
                    }
                    if (var3.field4622[var5].field1249 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method1106(arg0, false);
            arg2.method1568(0, (byte) 49);
            int var6 = arg2.field3748;
            arg2.method1577((byte) 88, var3.field4612);
            for (int var7 = 0; var7 < var3.field4608; var7++) {
                if (var3.field4623[var7] == 0) {
                    try {
                        int var8 = var3.field4606[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field4613[var7].field1250;
                            int var13 = var12.getInt((Object) null);
                            arg2.method1568(0, (byte) 49);
                            arg2.method1577((byte) 85, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field4613[var7].field1250;
                            var11.setInt((Object) null, var3.field4614[var7]);
                            arg2.method1568(0, (byte) 49);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field4613[var7].field1250;
                            int var10 = var9.getModifiers();
                            arg2.method1568(0, (byte) 49);
                            arg2.method1577((byte) 115, var10);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field4622[var7].field1250;
                            byte[][] var17 = var3.field4611[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method1568(0, (byte) 49);
                            } else if ((var21 instanceof Number)) {
                                arg2.method1568(1, (byte) 49);
                                arg2.method1610(791715792, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg2.method1568(2, (byte) 49);
                                arg2.method1589((byte) 113, (String) var21);
                            } else {
                                arg2.method1568(4, (byte) 49);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4622[var7].field1250;
                            int var15 = var14.getModifiers();
                            arg2.method1568(0, (byte) 49);
                            arg2.method1577((byte) 113, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1568(-10, (byte) 49);
                    } catch (InvalidClassException var23) {
                        arg2.method1568(-11, (byte) 49);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1568(-12, (byte) 49);
                    } catch (OptionalDataException var25) {
                        arg2.method1568(-13, (byte) 49);
                    } catch (IllegalAccessException var26) {
                        arg2.method1568(-14, (byte) 49);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1568(-15, (byte) 49);
                    } catch (InvocationTargetException var28) {
                        arg2.method1568(-16, (byte) 49);
                    } catch (SecurityException var29) {
                        arg2.method1568(-17, (byte) 49);
                    } catch (IOException var30) {
                        arg2.method1568(-18, (byte) 49);
                    } catch (NullPointerException var31) {
                        arg2.method1568(-19, (byte) 49);
                    } catch (Exception var32) {
                        arg2.method1568(-20, (byte) 49);
                    } catch (Throwable var33) {
                        arg2.method1568(-21, (byte) 49);
                    }
                } else {
                    arg2.method1568(var3.field4623[var7], (byte) 49);
                }
            }
            arg2.method1592((byte) 122, var6);
            arg2.method1565(arg2.field3748 - var6, (byte) 104);
            var3.method538(124);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1221(int arg0) {
        field2974 = null;
        if (arg0 < 92) {
            method1218(-13, (short) -80);
        }
        field2966 = null;
    }
}
