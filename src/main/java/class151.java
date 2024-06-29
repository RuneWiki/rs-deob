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

@OriginalClass("client!ve")
public class class151 {

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3409 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3403 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3404 = 0;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lhe;")
    public static class54 field3408 = class6.method58("gelb:", false);

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lhe;")
    public static class54 field3411 = class6.method58("p12_full", false);

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Lhe;")
    public static class54 field3413 = class6.method58("Geben Sie Ihren Benutzernamen", false);

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "[I")
    public static int[] field3412 = new int[5];

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lhe;")
    public static class54 field3410 = class6.method58("nav", false);

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1143(int arg0) {
        field3413 = null;
        int var1 = -28 / ((46 - arg0) / 54);
        field3411 = null;
        field3410 = null;
        field3412 = null;
        field3408 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZ)V")
    public static final void method1144(int arg0, int arg1, boolean arg2) {
        class6.field177++;
        if (!arg2) {
            field3406++;
            class131.field2969.method454(240, 114);
            class131.field2969.method658(181, arg1);
            class131.field2969.method646(13421, arg0);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static final void method1145(byte arg0) {
        field3407++;
        int var1 = class38.field959 * 128 + 64;
        int var2 = class139.field3189 * 128 + 64;
        int var3 = class134.method1007(var1, var2, true, class157.field3573) - class86.field2138;
        if (class11.field315 < var1) {
            class11.field315 += (var1 - class11.field315) * class142.field3263 / 1000 + class1.field1;
            if (class11.field315 > var1) {
                class11.field315 = var1;
            }
        }
        if (var1 < class11.field315) {
            class11.field315 -= (class11.field315 - var1) * class142.field3263 / 1000 + class1.field1;
            if (class11.field315 < var1) {
                class11.field315 = var1;
            }
        }
        if (class65.field1561 < var2) {
            class65.field1561 += class1.field1 + (var2 - class65.field1561) * class142.field3263 / 1000;
            if (var2 < class65.field1561) {
                class65.field1561 = var2;
            }
        }
        if (arg0 <= 105) {
            method1144(-92, 41, false);
        }
        int var4 = class19.field550 * 128 + 64;
        if (var2 < class65.field1561) {
            class65.field1561 -= (class65.field1561 - var2) * class142.field3263 / 1000 + class1.field1;
            if (var2 > class65.field1561) {
                class65.field1561 = var2;
            }
        }
        if (var3 > class93.field2277) {
            class93.field2277 += class1.field1 + (var3 - class93.field2277) * class142.field3263 / 1000;
            if (class93.field2277 > var3) {
                class93.field2277 = var3;
            }
        }
        int var5 = class28.field744 * 128 + 64;
        if (class93.field2277 > var3) {
            class93.field2277 -= (class93.field2277 - var3) * class142.field3263 / 1000 + class1.field1;
            if (class93.field2277 < var3) {
                class93.field2277 = var3;
            }
        }
        int var6 = class134.method1007(var4, var5, true, class157.field3573) - class13.field366;
        int var7 = var6 - class93.field2277;
        int var8 = var4 - class11.field315;
        int var9 = var5 - class65.field1561;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var9)) & 0x7FF;
        int var13 = var12 - class39.field1025;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (class95.field2418 < var11) {
            class95.field2418 += (var11 - class95.field2418) * class102.field2552 / 1000 + class34.field851;
            if (class95.field2418 > var11) {
                class95.field2418 = var11;
            }
        }
        if (class95.field2418 > var11) {
            class95.field2418 -= (class95.field2418 - var11) * class102.field2552 / 1000 + class34.field851;
            if (class95.field2418 < var11) {
                class95.field2418 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class39.field1025 += class102.field2552 * var13 / 1000 + class34.field851;
            class39.field1025 &= 0x7FF;
        }
        if (var13 < 0) {
            class39.field1025 -= class34.field851 + -var13 * class102.field2552 / 1000;
            class39.field1025 &= 0x7FF;
        }
        int var14 = var12 - class39.field1025;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class39.field1025 = var12;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBLib;)V")
    public static final void method1146(int arg0, byte arg1, class58 arg2) {
        if (arg1 != -61) {
            return;
        }
        field3405++;
        while (true) {
            class39 var3 = (class39) class13.field358.method979(arg1 ^ 0x41);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1000; var5++) {
                if (var3.field1024[var5] != null) {
                    if (var3.field1024[var5].field1145 == 2) {
                        var3.field1010[var5] = -5;
                    }
                    if (var3.field1024[var5].field1145 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1011[var5] != null) {
                    if (var3.field1011[var5].field1145 == 2) {
                        var3.field1010[var5] = -6;
                    }
                    if (var3.field1011[var5].field1145 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method454(arg0, 108);
            arg2.method649((byte) -27, 0);
            int var6 = arg2.field2076;
            arg2.method658(181, var3.field1021);
            for (int var7 = 0; var7 < var3.field1000; var7++) {
                if (var3.field1010[var7] == 0) {
                    try {
                        int var8 = var3.field1004[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1024[var7].field1143;
                            int var13 = var12.getInt(null);
                            arg2.method649((byte) -27, 0);
                            arg2.method658(181, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field1024[var7].field1143;
                            var9.setInt(null, var3.field1013[var7]);
                            arg2.method649((byte) -27, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field1024[var7].field1143;
                            int var11 = var10.getModifiers();
                            arg2.method649((byte) -27, 0);
                            arg2.method658(181, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field1011[var7].field1143;
                            byte[][] var17 = var3.field1009[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg2.method649((byte) -27, 0);
                            } else if (var21 instanceof Number) {
                                arg2.method649((byte) -27, 1);
                                arg2.method677(arg1 ^ 0xF4B6AE13, ((Number) var21).longValue());
                            } else if (var21 instanceof class54) {
                                arg2.method649((byte) -27, 2);
                                arg2.method681((class54) var21, 18601);
                            } else {
                                arg2.method649((byte) -27, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1011[var7].field1143;
                            int var15 = var14.getModifiers();
                            arg2.method649((byte) -27, 0);
                            arg2.method658(181, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method649((byte) -27, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method649((byte) -27, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method649((byte) -27, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method649((byte) -27, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method649((byte) -27, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method649((byte) -27, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method649((byte) -27, -16);
                    } catch (SecurityException var29) {
                        arg2.method649((byte) -27, -17);
                    } catch (IOException var30) {
                        arg2.method649((byte) -27, -18);
                    } catch (NullPointerException var31) {
                        arg2.method649((byte) -27, -19);
                    } catch (Exception var32) {
                        arg2.method649((byte) -27, -20);
                    } catch (Throwable var33) {
                        arg2.method649((byte) -27, -21);
                    }
                } else {
                    arg2.method649((byte) -27, var3.field1010[var7]);
                }
            }
            arg2.method656(var6, arg1 + 62);
            arg2.method680(arg2.field2076 - var6, (byte) 50);
            var3.method48(-315);
        }
    }
}
