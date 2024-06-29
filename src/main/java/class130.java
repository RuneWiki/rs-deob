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

@OriginalClass("client!rb")
public class class130 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lmb;")
    private static class96 field2346 = class243.method1708("flash3:", (byte) 119);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[I")
    public static int[] field2344 = new int[32];

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lmb;")
    public static class96 field2348 = field2346;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Z")
    public static boolean field2353 = true;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lmb;")
    public static class96 field2350 = field2346;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lmj;")
    public static class246 field2349;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIB)I")
    public static final int method982(int arg0, int arg1, byte arg2) {
        field2347++;
        if (arg2 > -37) {
            method983(-99);
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method983(int arg0) {
        if (arg0 != 1) {
            field2348 = null;
        }
        field2346 = null;
        field2349 = null;
        field2348 = null;
        field2350 = null;
        field2344 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIB)V")
    public static final void method984(int arg0, int arg1, byte arg2) {
        if (arg2 >= -69) {
            return;
        }
        class54.field937[arg1] = arg0;
        field2345++;
        class149 var3 = (class149) class245.field4257.method1081(0, (long) arg1);
        if (var3 == null) {
            class149 var4 = new class149(class155.method1133(126) + 500L);
            class245.field4257.method1085(-1, var4, (long) arg1);
        } else {
            var3.field2631 = class155.method1133(124) + 500L;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I")
    public static int method985(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lhe;IB)V")
    public static final void method986(class136 arg0, int arg1, byte arg2) {
        if (arg2 < 11) {
            return;
        }
        field2352++;
        while (true) {
            class233 var3 = (class233) class17.field252.method1811(2);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3993; var5++) {
                if (var3.field3997[var5] != null) {
                    if (var3.field3997[var5].field4605 == 2) {
                        var3.field3988[var5] = -5;
                    }
                    if (var3.field3997[var5].field4605 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3996[var5] != null) {
                    if (var3.field3996[var5].field4605 == 2) {
                        var3.field3988[var5] = -6;
                    }
                    if (var3.field3996[var5].field4605 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1012((byte) 0, arg1);
            arg0.method1652(0, (byte) 41);
            int var6 = arg0.field4124;
            arg0.method1625((byte) -122, var3.field3991);
            for (int var7 = 0; var7 < var3.field3993; var7++) {
                if (var3.field3988[var7] == 0) {
                    try {
                        int var8 = var3.field4001[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3997[var7].field4604;
                            int var13 = var12.getInt((Object) null);
                            arg0.method1652(0, (byte) 41);
                            arg0.method1625((byte) -99, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3997[var7].field4604;
                            var11.setInt((Object) null, var3.field3994[var7]);
                            arg0.method1652(0, (byte) 41);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field3997[var7].field4604;
                            int var10 = var9.getModifiers();
                            arg0.method1652(0, (byte) 41);
                            arg0.method1625((byte) -101, var10);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3996[var7].field4604;
                            byte[][] var17 = var3.field3987[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method1652(0, (byte) 41);
                            } else if (var21 instanceof Number) {
                                arg0.method1652(1, (byte) 41);
                                arg0.method1668(((Number) var21).longValue(), -32);
                            } else if (var21 instanceof class96) {
                                arg0.method1652(2, (byte) 41);
                                arg0.method1644((class96) var21, -84);
                            } else {
                                arg0.method1652(4, (byte) 41);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3996[var7].field4604;
                            int var15 = var14.getModifiers();
                            arg0.method1652(0, (byte) 41);
                            arg0.method1625((byte) -99, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1652(-10, (byte) 41);
                    } catch (InvalidClassException var23) {
                        arg0.method1652(-11, (byte) 41);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1652(-12, (byte) 41);
                    } catch (OptionalDataException var25) {
                        arg0.method1652(-13, (byte) 41);
                    } catch (IllegalAccessException var26) {
                        arg0.method1652(-14, (byte) 41);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1652(-15, (byte) 41);
                    } catch (InvocationTargetException var28) {
                        arg0.method1652(-16, (byte) 41);
                    } catch (SecurityException var29) {
                        arg0.method1652(-17, (byte) 41);
                    } catch (IOException var30) {
                        arg0.method1652(-18, (byte) 41);
                    } catch (NullPointerException var31) {
                        arg0.method1652(-19, (byte) 41);
                    } catch (Exception var32) {
                        arg0.method1652(-20, (byte) 41);
                    } catch (Throwable var33) {
                        arg0.method1652(-21, (byte) 41);
                    }
                } else {
                    arg0.method1652(var3.field3988[var7], (byte) 41);
                }
            }
            arg0.method1670(var6, (byte) -56);
            arg0.method1665(arg0.field4124 - var6, -109);
            var3.method1743((byte) 121);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIZI)V")
    public static final void method987(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            method982(-33, -30, (byte) 49);
        }
        for (int var5 = 0; var5 < class47.field822; var5++) {
            if (class271.field4717[var5] + class270.field4698[var5] > arg2 && class270.field4698[var5] < (arg0 + arg2) && (class266.field4643[var5] + class61.field1046[var5]) > arg4 && class266.field4643[var5] < arg4 + arg1) {
                class19.field317[var5] = true;
            }
        }
        field2351++;
    }
}
