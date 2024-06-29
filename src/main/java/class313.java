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

@OriginalClass("client!tp")
public class class313 {

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "Z")
    public static boolean field4316 = true;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "[S")
    public static short[] field4313;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)Lsf;", line = 7)
    public static final class305 method1983(int arg0, int arg1) {
        field4318++;
        if (arg0 >= -111) {
            field4316 = false;
        }
        class305 var2 = (class305) class377.field5375.method567((byte) 98, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class235.field3192.method1920(arg1, false, 11);
        class305 var4 = new class305();
        if (var3 != null) {
            var4.method1950(new class371(var3), (byte) -117);
        }
        class377.field5375.method565(-1, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 33)
    public static void method1984(int arg0) {
        if (arg0 != 196) {
            method1989((class281) null, (class43) null, 79, -65, -101);
        }
        field4313 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)V", line = 45)
    public static final void method1985(byte arg0, int arg1) {
        if (arg1 != 13594) {
            method1984(102);
        }
        if (class8.field123 == null) {
            class8.field123 = new byte[4][class432.field6220][class267.field3646];
        }
        field4312++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class432.field6220; var3++) {
                for (int var4 = 0; var4 < class267.field3646; var4++) {
                    class8.field123[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lbh;IB)V", line = 82)
    public static final void method1986(class24 arg0, int arg1, byte arg2) {
        field4315++;
        int var3 = 82 % ((78 - arg2) / 40);
        while (true) {
            class115 var4 = (class115) class105.field1573.method1312((byte) 25);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field1673; var6++) {
                if (var4.field1671[var6] != null) {
                    if (var4.field1671[var6].field4068 == 2) {
                        var4.field1670[var6] = -5;
                    }
                    if (var4.field1671[var6].field4068 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field1676[var6] != null) {
                    if (var4.field1676[var6].field4068 == 2) {
                        var4.field1670[var6] = -6;
                    }
                    if (var4.field1676[var6].field4068 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg0.method158((byte) 7, arg1);
            arg0.method2396(0, 12450);
            int var7 = arg0.field5273;
            arg0.method2386(var4.field1677, 19324);
            for (int var8 = 0; var8 < var4.field1673; var8++) {
                if (var4.field1670[var8] == 0) {
                    try {
                        int var9 = var4.field1669[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field1671[var8].field4070;
                            int var14 = var13.getInt((Object) null);
                            arg0.method2396(0, 12450);
                            arg0.method2386(var14, 19324);
                        } else if (var9 == 1) {
                            Field var10 = (Field) var4.field1671[var8].field4070;
                            var10.setInt((Object) null, var4.field1672[var8]);
                            arg0.method2396(0, 12450);
                        } else if (var9 == 2) {
                            Field var11 = (Field) var4.field1671[var8].field4070;
                            int var12 = var11.getModifiers();
                            arg0.method2396(0, 12450);
                            arg0.method2386(var12, 19324);
                        }
                        if (var9 == 3) {
                            Method var15 = (Method) var4.field1676[var8].field4070;
                            byte[][] var16 = var4.field1668[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; var18 < var16.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke((Object) null, var17);
                            if (var20 == null) {
                                arg0.method2396(0, 12450);
                            } else if ((var20 instanceof Number)) {
                                arg0.method2396(1, 12450);
                                arg0.method2409(((Number) var20).longValue(), true);
                            } else if (var20 instanceof String) {
                                arg0.method2396(2, 12450);
                                arg0.method2412(-128, (String) var20);
                            } else {
                                arg0.method2396(4, 12450);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field1676[var8].field4070;
                            int var22 = var21.getModifiers();
                            arg0.method2396(0, 12450);
                            arg0.method2386(var22, 19324);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg0.method2396(-10, 12450);
                    } catch (InvalidClassException var24) {
                        arg0.method2396(-11, 12450);
                    } catch (StreamCorruptedException var25) {
                        arg0.method2396(-12, 12450);
                    } catch (OptionalDataException var26) {
                        arg0.method2396(-13, 12450);
                    } catch (IllegalAccessException var27) {
                        arg0.method2396(-14, 12450);
                    } catch (IllegalArgumentException var28) {
                        arg0.method2396(-15, 12450);
                    } catch (InvocationTargetException var29) {
                        arg0.method2396(-16, 12450);
                    } catch (SecurityException var30) {
                        arg0.method2396(-17, 12450);
                    } catch (IOException var31) {
                        arg0.method2396(-18, 12450);
                    } catch (NullPointerException var32) {
                        arg0.method2396(-19, 12450);
                    } catch (Exception var33) {
                        arg0.method2396(-20, 12450);
                    } catch (Throwable var34) {
                        arg0.method2396(-21, 12450);
                    }
                } else {
                    arg0.method2396(var4.field1670[var8], 12450);
                }
            }
            arg0.method2385(-1340042720, var7);
            arg0.method2390(arg0.field5273 - var7, 105);
            var4.method2459(198);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIII)Lcl;", line = 283)
    public static final class145 method1987(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4317++;
        if (arg3 <= 51) {
            return null;
        }
        class314[] var5 = null;
        class266 var6 = class445.method2780(arg4, 29948);
        if (var6.field3627 != null) {
            var5 = new class314[var6.field3627.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class236 var8 = class99.method700(var6.field3627[var7], false);
                var5[var7] = new class314(var8.field3204, var8.field3208, var8.field3210, var8.field3202, var8.field3206, var8.field3207, var8.field3211, var8.field3199);
            }
        }
        return new class145(var6.field3631, var5, var6.field3636, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(BI)Ljava/lang/String;", line = 314)
    public static final String method1988(byte arg0, int arg1) {
        if (arg0 != 93) {
            method1985((byte) -87, 117);
        }
        field4314++;
        return arg1 < 999999999 ? Integer.toString(arg1) : "*";
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Laa;Lqh;III)V", line = 329)
    public static final void method1989(class281 arg0, class43 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class386.field5629) {
            class142 var5 = class5.field79[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field2047 != null && var5.field2047.method137(0)) {
                arg1.method129(0, true, 0, 128, arg0, 0, var5.field2047);
            }
        }
        if (arg4 < class386.field5629) {
            class142 var6 = class5.field79[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field2047 != null && var6.field2047.method137(0)) {
                arg1.method129(0, true, 128, 0, arg0, 0, var6.field2047);
            }
        }
        if (arg3 < class386.field5629 && arg4 < class371.field5311) {
            class142 var7 = class5.field79[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field2047 != null && var7.field2047.method137(0)) {
                arg1.method129(0, true, 128, 128, arg0, 0, var7.field2047);
            }
        }
        if (arg3 < class386.field5629 && arg4 > 0) {
            class142 var8 = class5.field79[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field2047 != null && var8.field2047.method137(0)) {
                arg1.method129(0, true, -128, 128, arg0, 0, var8.field2047);
            }
        }
    }
}
