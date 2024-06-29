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

@OriginalClass("client!g")
public class class226 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "[Lfa;")
    public static class259[] field3238;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[Lco;")
    public static class280[] field3242;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 6)
    public static void method1583(byte arg0) {
        if (arg0 != -88) {
            field3242 = (class280[]) null;
        }
        field3238 = null;
        field3242 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILlh;I)V", line = 17)
    public static final void method1584(int arg0, class320 arg1, int arg2) {
        field3241++;
        if (arg0 != -1) {
            method1589(-97, -50, -15);
        }
        while (true) {
            class313 var3 = (class313) class203.field2900.method1335(arg0 + 2);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4729; var5++) {
                if (var3.field4733[var5] != null) {
                    if (var3.field4733[var5].field4241 == 2) {
                        var3.field4722[var5] = -5;
                    }
                    if (var3.field4733[var5].field4241 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4734[var5] != null) {
                    if (var3.field4734[var5].field4241 == 2) {
                        var3.field4722[var5] = -6;
                    }
                    if (var3.field4734[var5].field4241 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method2238(arg2, (byte) -128);
            arg1.method2184((byte) 89, 0);
            int var6 = arg1.field4777;
            arg1.method2188(arg0 ^ 0xFFFFFF00, var3.field4730);
            for (int var7 = 0; var7 < var3.field4729; var7++) {
                if (var3.field4722[var7] == 0) {
                    try {
                        int var8 = var3.field4735[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field4733[var7].field4244;
                            int var10 = var9.getInt((Object) null);
                            arg1.method2184((byte) 89, 0);
                            arg1.method2188(255, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field4733[var7].field4244;
                            var11.setInt((Object) null, var3.field4732[var7]);
                            arg1.method2184((byte) 89, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field4733[var7].field4244;
                            int var13 = var12.getModifiers();
                            arg1.method2184((byte) 89, 0);
                            arg1.method2188(255, var13);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field4734[var7].field4244;
                            byte[][] var15 = var3.field4728[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method2184((byte) 89, 0);
                            } else if ((var19 instanceof Number)) {
                                arg1.method2184((byte) 89, 1);
                                arg1.method2202(((Number) var19).longValue(), -108);
                            } else if ((var19 instanceof String)) {
                                arg1.method2184((byte) 89, 2);
                                arg1.method2157((byte) -66, (String) var19);
                            } else {
                                arg1.method2184((byte) 89, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field4734[var7].field4244;
                            int var21 = var20.getModifiers();
                            arg1.method2184((byte) 89, 0);
                            arg1.method2188(255, var21);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg1.method2184((byte) 89, -10);
                    } catch (InvalidClassException var35) {
                        arg1.method2184((byte) 89, -11);
                    } catch (StreamCorruptedException var36) {
                        arg1.method2184((byte) 89, -12);
                    } catch (OptionalDataException var37) {
                        arg1.method2184((byte) 89, -13);
                    } catch (IllegalAccessException var38) {
                        arg1.method2184((byte) 89, -14);
                    } catch (IllegalArgumentException var39) {
                        arg1.method2184((byte) 89, -15);
                    } catch (InvocationTargetException var40) {
                        arg1.method2184((byte) 89, -16);
                    } catch (SecurityException var41) {
                        arg1.method2184((byte) 89, -17);
                    } catch (IOException var42) {
                        arg1.method2184((byte) 89, -18);
                    } catch (NullPointerException var43) {
                        arg1.method2184((byte) 89, -19);
                    } catch (Exception var44) {
                        arg1.method2184((byte) 89, -20);
                    } catch (Throwable var45) {
                        arg1.method2184((byte) 89, -21);
                    }
                } else {
                    arg1.method2184((byte) 89, var3.field4722[var7]);
                }
            }
            arg1.method2214(116, var6);
            arg1.method2170((byte) 120, arg1.field4777 - var6);
            var3.method1274((byte) -26);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([BI)Lbn;", line = 207)
    public static final class9 method1585(byte[] arg0, int arg1) {
        field3235++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == 64) {
            class9 var2 = new class9(arg0, class209.field3002, class274.field4115, class323.field4903, class288.field4281, class209.field3012);
            class236.method1624(arg1 ^ 0x33);
            return var2;
        } else {
            return (class9) null;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V", line = 228)
    public static final void method1586(byte arg0) {
        class251.field3600.method717((byte) 111);
        if (arg0 == 8) {
            field3243++;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I[B)V", line = 245)
    public static final void method1587(int arg0, byte[] arg1) {
        field3246++;
        class316 var2 = new class316(arg1);
        var2.field4777 = arg1.length - 2;
        class342.field5121 = var2.method2220((byte) 53);
        class163.field2250 = new boolean[class342.field5121];
        class209.field3012 = new byte[class342.field5121][];
        class274.field4115 = new int[class342.field5121];
        class209.field3002 = new int[class342.field5121];
        class323.field4903 = new int[class342.field5121];
        class185.field2553 = new byte[class342.field5121][];
        class288.field4281 = new int[class342.field5121];
        var2.field4777 = arg1.length - (class342.field5121 * 8) - 7;
        class154.field2136 = var2.method2220((byte) 40);
        class194.field2674 = var2.method2220((byte) 61);
        int var3 = (var2.method2219(16448) & 0xFF) + 1;
        for (int var4 = 0; var4 < class342.field5121; var4++) {
            class209.field3002[var4] = var2.method2220((byte) 122);
        }
        for (int var5 = 0; var5 < class342.field5121; var5++) {
            class274.field4115[var5] = var2.method2220((byte) 99);
        }
        for (int var6 = 0; var6 < class342.field5121; var6++) {
            class323.field4903[var6] = var2.method2220((byte) 37);
        }
        for (int var7 = 0; var7 < class342.field5121; var7++) {
            class288.field4281[var7] = var2.method2220((byte) 40);
        }
        var2.field4777 = arg1.length - (class342.field5121 * 8) - (7 - -((var3 + -1) * 3));
        int var8 = -79 / ((71 - arg0) / 50);
        class235.field3331 = new int[var3];
        for (int var9 = 1; var9 < var3; var9++) {
            class235.field3331[var9] = var2.method2210((byte) -5);
            if (class235.field3331[var9] == 0) {
                class235.field3331[var9] = 1;
            }
        }
        var2.field4777 = 0;
        for (int var10 = 0; var10 < class342.field5121; var10++) {
            int var11 = class323.field4903[var10];
            int var12 = class288.field4281[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            boolean var15 = false;
            class209.field3012[var10] = var14;
            byte[] var16 = new byte[var13];
            class185.field2553[var10] = var16;
            int var17 = var2.method2219(16448);
            if ((var17 & 0x1) == 0) {
                for (int var18 = 0; var18 < var13; var18++) {
                    var14[var18] = var2.method2192(3);
                }
                if ((var17 & 0x2) != 0) {
                    for (int var19 = 0; var19 < var13; var19++) {
                        byte var20 = var16[var19] = var2.method2192(3);
                        var15 |= var20 != -1;
                    }
                }
            } else {
                int var21 = 0;
                label97: while (true) {
                    if (var21 >= var11) {
                        if ((var17 & 0x2) == 0) {
                            break;
                        }
                        int var23 = 0;
                        while (true) {
                            if (var23 >= var11) {
                                break label97;
                            }
                            for (int var24 = 0; var24 < var12; var24++) {
                                byte var25 = var16[var11 * var24 + var23] = var2.method2192(3);
                                var15 |= var25 != -1;
                            }
                            var23++;
                        }
                    }
                    for (int var22 = 0; var22 < var12; var22++) {
                        var14[var21 + (var11 * var22)] = var2.method2192(3);
                    }
                    var21++;
                }
            }
            class163.field2250[var10] = var15;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZIIII)V", line = 408)
    public static final void method1588(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3239++;
        class106.field1424 = arg2;
        if (arg1) {
            method1589(101, 87, 121);
        }
        class171.field2338 = arg4;
        class74.field1024 = arg5;
        class334.field5044 = arg3;
        class175.field2379 = arg0;
        if (class171.field2338 >= 100) {
            int var6 = class74.field1024 * 128 + 64;
            int var7 = class106.field1424 * 128 + 64;
            int var8 = class135.method985(var6, class251.field3603, var7, (byte) -117) - class334.field5044;
            int var9 = var8 - class101.field1394;
            int var10 = var7 - class198.field2820;
            int var11 = var6 - class275.field4123;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class204.field2944 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class236.field3347 = (int) (Math.atan2((double) var10, (double) var11) * -325.949D) & 0x7FF;
            if (class204.field2944 < 128) {
                class204.field2944 = 128;
            }
            if (class204.field2944 > 383) {
                class204.field2944 = 383;
            }
        }
        class343.field5168 = 2;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Lvm;", line = 455)
    public static final class297 method1589(int arg0, int arg1, int arg2) {
        field3245++;
        for (class297 var3 = (class297) class122.field1656.method110(arg2); var3 != null; var3 = (class297) class122.field1656.method115(0)) {
            if (var3.field4398 && var3.method2022(0, arg1, arg0)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)I", line = 476)
    public static final int method1590(byte arg0) {
        field3240++;
        int var1 = 92 / ((7 - arg0) / 58);
        return 2;
    }
}
