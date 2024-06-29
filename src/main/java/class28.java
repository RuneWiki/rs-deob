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

@OriginalClass("client!e")
public class class28 {

    @OriginalMember(owner = "client!e", name = "e", descriptor = "[I")
    public static int[] field742 = new int[50];

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lke;")
    private static class65 field741 = class1.method17("On", -118);

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lke;")
    public static class65 field743 = field741;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Lke;")
    public static class65 field738 = class1.method17(",Zffentlicher Chat", -113);

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Lke;")
    public static class65 field754 = class1.method17("headicons_prayer", -116);

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lke;")
    private static class65 field744 = class1.method17("Your account has been disabled)3", -115);

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Lke;")
    public static class65 field751 = field744;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lke;")
    public static class65 field749 = null;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "Lke;")
    public static class65 field755 = class1.method17("Ladevorgang )2 bitte warten Sie)3", -122);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Luc;")
    public static class119 field748;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Lf;")
    public static class34 field750;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lpa;")
    public static class90 field745;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)Z", line = 8)
    public static final boolean method232(int arg0, boolean arg1) {
        field752++;
        if (class104.field2692[arg0]) {
            return true;
        } else if (class77.field2049.method488(0, arg0)) {
            int var2 = class77.field2049.method479((byte) 51, arg0);
            if (var2 == 0) {
                class104.field2692[arg0] = true;
                return true;
            }
            if (class88.field2361[arg0] == null) {
                class88.field2361[arg0] = new class27[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class88.field2361[arg0][var3] == null) {
                    byte[] var4 = class77.field2049.method477(arg0, (byte) 127, var3);
                    if (var4 != null) {
                        class88.field2361[arg0][var3] = new class27();
                        class88.field2361[arg0][var3].method222(4, new class39(var4));
                    }
                }
            }
            class104.field2692[arg0] = arg1;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I", line = 58)
    public static final int method233(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg1 != 7) {
            field749 = null;
        }
        field747++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 83)
    public static final void method234(int arg0) {
        field739++;
        int var1 = class94.field2497;
        int var2 = class53.field1367;
        int var3 = class20.field479;
        int var4 = class111.field2758;
        int var5 = 6116423;
        class108.method886(var2, var1, var3, var4, var5);
        if (arg0 != 18) {
            method238(68);
        }
        class108.method886(var2 + 1, var1 + 1, var3 - 2, 16, 0);
        class108.method884(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        class27.field660.method109(class79.field2112, var2 + 3, var1 + 14, var5);
        int var6 = class52.field1320;
        int var7 = class91.field2418;
        if (class10.field215 == 0) {
            var7 -= 4;
            var6 -= 4;
        }
        if (class10.field215 == 1) {
            var6 -= 205;
            var7 -= 553;
        }
        if (class10.field215 == 2) {
            var6 -= 357;
            var7 -= 17;
        }
        for (int var8 = 0; var8 < class125.field3040; var8++) {
            int var9 = (class125.field3040 - var8 - 1) * 15 + var1 + 31;
            int var10 = 16777215;
            if (var7 > var2 && var7 < var2 + var3 && var6 > var9 - 13 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class27.field660.method110(class29.field783[var8], var2 + 3, var9, var10, true);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 148)
    public static void method235(int arg0) {
        field745 = null;
        if (arg0 != 0) {
            return;
        }
        field741 = null;
        field738 = null;
        field751 = null;
        field755 = null;
        field744 = null;
        field748 = null;
        field754 = null;
        field742 = null;
        field749 = null;
        field743 = null;
        field750 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 184)
    public static final void method236(byte arg0) {
        int var1 = 94 / ((-arg0 - 42) / 35);
        field753++;
        class64.field1668.method793(-122);
        class64.field1686.method963(0, 0);
        class73.field1941 = class127.method1003(class73.field1941);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lmb;II)V", line = 208)
    public static final void method237(class73 arg0, int arg1, int arg2) {
        int var3 = -107 % ((arg1 + 35) / 45);
        field740++;
        while (true) {
            class91 var4 = (class91) class31.field814.method421(1);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field2409; var6++) {
                if (var4.field2402[var6] != null) {
                    if (var4.field2402[var6].field875 == 2) {
                        var4.field2410[var6] = -5;
                    }
                    if (var4.field2402[var6].field875 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field2404[var6] != null) {
                    if (var4.field2404[var6].field875 == 2) {
                        var4.field2410[var6] = -6;
                    }
                    if (var4.field2404[var6].field875 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg0.method642(arg2, false);
            arg0.method305(false, 0);
            int var7 = arg0.field998;
            arg0.method351(var4.field2405, 86);
            for (int var8 = 0; var8 < var4.field2409; var8++) {
                if (var4.field2410[var8] == 0) {
                    try {
                        int var9 = var4.field2407[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field2402[var8].field878;
                            int var14 = var13.getInt(null);
                            arg0.method305(false, 0);
                            arg0.method351(var14, 86);
                        } else if (var9 == 1) {
                            Field var12 = (Field) var4.field2402[var8].field878;
                            var12.setInt(null, var4.field2399[var8]);
                            arg0.method305(false, 0);
                        } else if (var9 == 2) {
                            Field var10 = (Field) var4.field2402[var8].field878;
                            int var11 = var10.getModifiers();
                            arg0.method305(false, 0);
                            arg0.method351(var11, 56);
                        }
                        if (var9 == 3) {
                            Method var17 = (Method) var4.field2404[var8].field878;
                            byte[][] var18 = var4.field2398[var8];
                            Object[] var19 = new Object[var18.length];
                            for (int var20 = 0; var20 < var18.length; var20++) {
                                ObjectInputStream var21 = new ObjectInputStream(new ByteArrayInputStream(var18[var20]));
                                var19[var20] = var21.readObject();
                            }
                            Object var22 = var17.invoke(null, var19);
                            if (var22 == null) {
                                arg0.method305(false, 0);
                            } else if (var22 instanceof Number) {
                                arg0.method305(false, 1);
                                arg0.method323(((Number) var22).longValue(), 0);
                            } else if (var22 instanceof class65) {
                                arg0.method305(false, 2);
                                arg0.method350((byte) -5, (class65) var22);
                            } else {
                                arg0.method305(false, 4);
                            }
                        } else if (var9 == 4) {
                            Method var15 = (Method) var4.field2404[var8].field878;
                            int var16 = var15.getModifiers();
                            arg0.method305(false, 0);
                            arg0.method351(var16, -112);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg0.method305(false, -10);
                    } catch (InvalidClassException var24) {
                        arg0.method305(false, -11);
                    } catch (StreamCorruptedException var25) {
                        arg0.method305(false, -12);
                    } catch (OptionalDataException var26) {
                        arg0.method305(false, -13);
                    } catch (IllegalAccessException var27) {
                        arg0.method305(false, -14);
                    } catch (IllegalArgumentException var28) {
                        arg0.method305(false, -15);
                    } catch (InvocationTargetException var29) {
                        arg0.method305(false, -16);
                    } catch (SecurityException var30) {
                        arg0.method305(false, -17);
                    } catch (IOException var31) {
                        arg0.method305(false, -18);
                    } catch (NullPointerException var32) {
                        arg0.method305(false, -19);
                    } catch (Exception var33) {
                        arg0.method305(false, -20);
                    } catch (Throwable var34) {
                        arg0.method305(false, -21);
                    }
                } else {
                    arg0.method305(false, var4.field2410[var8]);
                }
            }
            arg0.method318(114, var7);
            arg0.method319(arg0.field998 - var7, -1332453464);
            var4.method133(2);
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)I", line = 400)
    public static final int method238(int arg0) {
        field746++;
        int var1 = 5 / ((arg0 - 54) / 36);
        int var2 = class58.method495(class51.field1293, class102.field2642, true, class19.field462);
        return var2 - class5.field102 >= 800 || (class114.field2852[class19.field462][class102.field2642 >> 7][class51.field1293 >> 7] & 0x4) == 0 ? 3 : class19.field462;
    }
}
