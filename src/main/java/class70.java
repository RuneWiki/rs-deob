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

@OriginalClass("client!hg")
public abstract class class70 {

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field1628 = -1;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Lcd;")
    public static class23 field1632 = class54.method414("(U2", -1);

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Lcd;")
    private static class23 field1633 = class54.method414("button near the top of that page)3", -1);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lcd;")
    public static class23 field1626 = field1633;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILkg;I)V")
    public static final void method505(int arg0, class96 arg1, int arg2) {
        if (arg0 >= -23) {
            field1626 = null;
        }
        field1629++;
        while (true) {
            class175 var3 = (class175) class10.field210.method188((byte) 54);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3495; var5++) {
                if (var3.field3496[var5] != null) {
                    if (var3.field3496[var5].field686 == 2) {
                        var3.field3486[var5] = -5;
                    }
                    if (var3.field3496[var5].field686 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3478[var5] != null) {
                    if (var3.field3478[var5].field686 == 2) {
                        var3.field3486[var5] = -6;
                    }
                    if (var3.field3478[var5].field686 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method631(arg2, -1);
            arg1.method1180(0, (byte) 105);
            int var6 = arg1.field3752;
            arg1.method1186(var3.field3487, -12);
            for (int var7 = 0; var7 < var3.field3495; var7++) {
                if (var3.field3486[var7] == 0) {
                    try {
                        int var8 = var3.field3491[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3496[var7].field683;
                            int var13 = var12.getInt(null);
                            arg1.method1180(0, (byte) 69);
                            arg1.method1186(var13, -12);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3496[var7].field683;
                            var11.setInt(null, var3.field3483[var7]);
                            arg1.method1180(0, (byte) 60);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field3496[var7].field683;
                            int var10 = var9.getModifiers();
                            arg1.method1180(0, (byte) 99);
                            arg1.method1186(var10, -12);
                        }
                        if (var8 == 3) {
                            byte[][] var14 = var3.field3481[var7];
                            Method var15 = (Method) var3.field3478[var7].field683;
                            Object[] var16 = new Object[var14.length];
                            for (int var17 = 0; var17 < var14.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var14[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var15.invoke(null, var16);
                            if (var19 == null) {
                                arg1.method1180(0, (byte) 118);
                            } else if (var19 instanceof Number) {
                                arg1.method1180(1, (byte) 76);
                                arg1.method1199(((Number) var19).longValue(), -1898826808);
                            } else if (var19 instanceof class23) {
                                arg1.method1180(2, (byte) 58);
                                arg1.method1191((class23) var19, (byte) -46);
                            } else {
                                arg1.method1180(4, (byte) 82);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field3478[var7].field683;
                            int var21 = var20.getModifiers();
                            arg1.method1180(0, (byte) 127);
                            arg1.method1186(var21, -12);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1180(-10, (byte) 76);
                    } catch (InvalidClassException var23) {
                        arg1.method1180(-11, (byte) 93);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1180(-12, (byte) 57);
                    } catch (OptionalDataException var25) {
                        arg1.method1180(-13, (byte) 71);
                    } catch (IllegalAccessException var26) {
                        arg1.method1180(-14, (byte) 98);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1180(-15, (byte) 85);
                    } catch (InvocationTargetException var28) {
                        arg1.method1180(-16, (byte) 74);
                    } catch (SecurityException var29) {
                        arg1.method1180(-17, (byte) 105);
                    } catch (IOException var30) {
                        arg1.method1180(-18, (byte) 56);
                    } catch (NullPointerException var31) {
                        arg1.method1180(-19, (byte) 65);
                    } catch (Exception var32) {
                        arg1.method1180(-20, (byte) 109);
                    } catch (Throwable var33) {
                        arg1.method1180(-21, (byte) 52);
                    }
                } else {
                    arg1.method1180(var3.field3486[var7], (byte) 70);
                }
            }
            arg1.method1189(var6, 16711680);
            arg1.method1206(arg1.field3752 - var6, -4375);
            var3.method1018(15789);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[B)V")
    public abstract void method506(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lkh;Ljava/awt/Component;Lkh;B)V")
    public static final void method507(class97 arg0, Component arg1, class97 arg2, byte arg3) {
        field1631++;
        if (class103.field2202) {
            return;
        }
        class196.method1269();
        byte[] var4 = arg2.method659(class105.field2280, true, class61.field1414);
        class183.field3606 = new class38(var4, arg1);
        class202.field3995 = class183.field3606.method297();
        class163.field3267 = class2.method11(arg0, -82, class119.field2449, class105.field2280);
        class116.field2419 = class2.method11(arg0, 110, class2.field18, class105.field2280);
        if (arg3 >= -115) {
            field1630 = 20;
        }
        class56.field1314 = class2.method11(arg0, -37, class107.field2295, class105.field2280);
        class107.field2290 = class44.method348(30, class105.field2280, arg0, class157.field3138);
        class31.field676 = class44.method348(-118, class105.field2280, arg0, class97.field2077);
        class124.field2545 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class124.field2545[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class124.field2545[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class124.field2545[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class124.field2545[var8 + 192] = 16777215;
        }
        class156.field3125 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class156.field3125[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class156.field3125[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class156.field3125[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class156.field3125[var12 + 192] = 16777215;
        }
        class34.field702 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class34.field702[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class34.field702[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class34.field702[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class34.field702[var16 + 192] = 16777215;
        }
        class113.field2378 = new int[32768];
        class163.field3263 = new int[256];
        class103.field2190 = new int[32768];
        class49.method385(null, (byte) 28);
        class35.field711 = new int[32768];
        class151.field3026 = false;
        class105.field2284 = class105.field2280;
        class12.field241 = new int[32768];
        class105.field2274 = class105.field2280;
        class21.field441 = 0;
        if (class40.field848 == 0) {
            class175.field3489 = true;
        } else {
            class175.field3489 = false;
        }
        if (class175.field3489) {
            class121.method754(2, (byte) -100);
        } else {
            class44.method347(class193.field3812, -16699, class105.field2280, 2, 255, false, class108.field2299);
        }
        class115.method733((byte) 78, false);
        class103.field2202 = true;
        class183.field3606.method293(0, 0);
        class202.field3995.method293(382, 0);
        class163.field3267.method836(382 - class163.field3267.field2706 / 2, 18);
        class54.field1274 = new class38(128, 254);
        class138.field2848 = new class38(128, 254);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZIILkh;)Lea;")
    public static final class38 method508(boolean arg0, int arg1, int arg2, class97 arg3) {
        if (!arg0) {
            field1632 = null;
        }
        field1627++;
        return class124.method765(arg1, arg2, (byte) 84, arg3) ? class60.method455(!arg0) : null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)[B")
    public abstract byte[] method509(int arg0);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method510(byte arg0) {
        if (arg0 != -127) {
            field1633 = null;
        }
        field1633 = null;
        field1632 = null;
        field1626 = null;
    }
}
