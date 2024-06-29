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

@OriginalClass("client!p")
public class class93 {

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[S")
    public static short[] field1395 = new short[] { 46, 45, 5, 42, 38, 31, 29, 49 };

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Lfe;")
    public static class231 field1399;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Ldl;")
    public static class35 field1397;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILv;)V")
    public static final void method632(int arg0, int arg1, class67 arg2) {
        if (arg1 != 1) {
            field1395 = null;
        }
        field1393++;
        while (true) {
            class47 var3 = (class47) class209.field3270.method1548(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field599; var5++) {
                if (var3.field590[var5] != null) {
                    if (var3.field590[var5].field2399 == 2) {
                        var3.field589[var5] = -5;
                    }
                    if (var3.field590[var5].field2399 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field601[var5] != null) {
                    if (var3.field601[var5].field2399 == 2) {
                        var3.field589[var5] = -6;
                    }
                    if (var3.field601[var5].field2399 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method445(arg0, 7);
            arg2.method1183(0, arg1 ^ 0x3AA76639);
            int var6 = arg2.field2676;
            arg2.method1210(var3.field596, (byte) -16);
            for (int var7 = 0; var7 < var3.field599; var7++) {
                if (var3.field589[var7] == 0) {
                    try {
                        int var8 = var3.field593[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field590[var7].field2401;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1183(0, 984049208);
                            arg2.method1210(var10, (byte) -16);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field590[var7].field2401;
                            var13.setInt((Object) null, var3.field591[var7]);
                            arg2.method1183(0, 984049208);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field590[var7].field2401;
                            int var12 = var11.getModifiers();
                            arg2.method1183(0, arg1 ^ 0x3AA76639);
                            arg2.method1210(var12, (byte) -16);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field601[var7].field2401;
                            byte[][] var15 = var3.field588[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method1183(0, 984049208);
                            } else if (var19 instanceof Number) {
                                arg2.method1183(1, arg1 + 984049207);
                                arg2.method1160(arg1 ^ 0xFFFF9BD4, ((Number) var19).longValue());
                            } else if (var19 instanceof String) {
                                arg2.method1183(2, 984049208);
                                arg2.method1168((byte) -37, (String) var19);
                            } else {
                                arg2.method1183(4, 984049208);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field601[var7].field2401;
                            int var21 = var20.getModifiers();
                            arg2.method1183(0, 984049208);
                            arg2.method1210(var21, (byte) -16);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1183(-10, 984049208);
                    } catch (InvalidClassException var23) {
                        arg2.method1183(-11, 984049208);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1183(-12, 984049208);
                    } catch (OptionalDataException var25) {
                        arg2.method1183(-13, 984049208);
                    } catch (IllegalAccessException var26) {
                        arg2.method1183(-14, 984049208);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1183(-15, arg1 ^ 0x3AA76639);
                    } catch (InvocationTargetException var28) {
                        arg2.method1183(-16, 984049208);
                    } catch (SecurityException var29) {
                        arg2.method1183(-17, 984049208);
                    } catch (IOException var30) {
                        arg2.method1183(-18, 984049208);
                    } catch (NullPointerException var31) {
                        arg2.method1183(-19, 984049208);
                    } catch (Exception var32) {
                        arg2.method1183(-20, arg1 + 984049207);
                    } catch (Throwable var33) {
                        arg2.method1183(-21, 984049208);
                    }
                } else {
                    arg2.method1183(var3.field589[var7], 984049208);
                }
            }
            arg2.method1185((byte) -90, var6);
            arg2.method1177(arg2.field2676 - var6, arg1 + 254);
            var3.method1764(64);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBI)V")
    public static final void method633(int arg0, byte arg1, int arg2) {
        int var3 = 0 / ((91 - arg1) / 33);
        class36.field441++;
        class150.field2218.method445(94, 7);
        class150.field2218.method1180(-17437, arg2);
        field1394++;
        class150.field2218.method1163(arg0, (byte) 40);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)Lva;")
    public static final class138 method634(int arg0) {
        field1398++;
        if (class207.field3238 == null) {
            return null;
        } else if (arg0 == 30370) {
            for (class138 var1 = (class138) class258.field4198.method2084((byte) -126); var1 != null; var1 = (class138) class258.field4198.method2084((byte) -122)) {
                class152 var2 = class136.method863(var1.field1987, 0);
                if (var2 != null && var2.field2237 && var2.method1051(-8963)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static final void method635(byte arg0) {
        field1401++;
        if (arg0 <= 62) {
            return;
        }
        try {
            if (class294.field4712 == 1) {
                int var1 = class179.field2810.method2065(false);
                if (var1 > 0 && class179.field2810.method2078(37)) {
                    int var2 = var1 - class92.field1369;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class179.field2810.method2052(1, var2);
                } else {
                    class179.field2810.method2050(true);
                    class179.field2810.method2048(120);
                    class217.field3388 = null;
                    class197.field3114 = null;
                    if (class138.field1992 == null) {
                        class294.field4712 = 0;
                    } else {
                        class294.field4712 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class179.field2810.method2050(true);
            class217.field3388 = null;
            class197.field3114 = null;
            class294.field4712 = 0;
            class138.field1992 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static void method636(int arg0) {
        field1397 = null;
        if (arg0 != 7630) {
            field1397 = null;
        }
        field1399 = null;
        field1395 = null;
    }
}
