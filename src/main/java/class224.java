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

@OriginalClass("client!sg")
public class class224 {

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "[I")
    public static int[] field4014 = new int[2];

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[I")
    public static int[] field4015 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lqj;")
    public static class196 field4019 = class80.method502("<img=0>", -48);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lnb;")
    public static class95 field4013;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "[[[B")
    public static byte[][][] field4008;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[B)Ll;")
    public static final class190 method1515(int arg0, byte[] arg1) {
        field4009++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -19) {
            method1519((byte) -11, (byte) 101);
        }
        class184 var2 = new class184(arg1, class234.field4169, class240.field4261, class77.field1126, class31.field392, class203.field3645);
        class168.method1099(false);
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLug;I)V")
    public static final void method1516(byte arg0, class179 arg1, int arg2) {
        field4010++;
        if (arg0 >= -117) {
            field4013 = null;
        }
        while (true) {
            class46 var3 = (class46) class92.field1346.method1651((byte) -26);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field554; var5++) {
                if (var3.field549[var5] != null) {
                    if (var3.field549[var5].field2140 == 2) {
                        var3.field558[var5] = -5;
                    }
                    if (var3.field549[var5].field2140 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field546[var5] != null) {
                    if (var3.field546[var5].field2140 == 2) {
                        var3.field558[var5] = -6;
                    }
                    if (var3.field546[var5].field2140 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1173(arg2, 14592);
            arg1.method329((byte) 74, 0);
            int var6 = arg1.field699;
            arg1.method355((byte) 79, var3.field557);
            for (int var7 = 0; var7 < var3.field554; var7++) {
                if (var3.field558[var7] == 0) {
                    try {
                        int var8 = var3.field548[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field549[var7].field2135;
                            int var10 = var9.getInt(null);
                            arg1.method329((byte) 57, 0);
                            arg1.method355((byte) -124, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field549[var7].field2135;
                            var13.setInt(null, var3.field552[var7]);
                            arg1.method329((byte) 15, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field549[var7].field2135;
                            int var12 = var11.getModifiers();
                            arg1.method329((byte) 126, 0);
                            arg1.method355((byte) 49, var12);
                        }
                        if (var8 == 3) {
                            byte[][] var14 = var3.field556[var7];
                            Method var15 = (Method) var3.field546[var7].field2135;
                            Object[] var16 = new Object[var14.length];
                            for (int var17 = 0; var17 < var14.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var14[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var15.invoke(null, var16);
                            if (var19 == null) {
                                arg1.method329((byte) 67, 0);
                            } else if (var19 instanceof Number) {
                                arg1.method329((byte) 56, 1);
                                arg1.method346(((Number) var19).longValue(), (byte) 105);
                            } else if (var19 instanceof class196) {
                                arg1.method329((byte) 112, 2);
                                arg1.method330((class196) var19, 12865);
                            } else {
                                arg1.method329((byte) 50, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field546[var7].field2135;
                            int var21 = var20.getModifiers();
                            arg1.method329((byte) 17, 0);
                            arg1.method355((byte) -121, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method329((byte) 59, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method329((byte) 118, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method329((byte) 68, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method329((byte) 17, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method329((byte) 69, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method329((byte) 57, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method329((byte) 6, -16);
                    } catch (SecurityException var29) {
                        arg1.method329((byte) 95, -17);
                    } catch (IOException var30) {
                        arg1.method329((byte) 86, -18);
                    } catch (NullPointerException var31) {
                        arg1.method329((byte) 86, -19);
                    } catch (Exception var32) {
                        arg1.method329((byte) 42, -20);
                    } catch (Throwable var33) {
                        arg1.method329((byte) 42, -21);
                    }
                } else {
                    arg1.method329((byte) 88, var3.field558[var7]);
                }
            }
            arg1.method306(var6, 0);
            arg1.method359(arg1.field699 - var6, (byte) -114);
            var3.method797((byte) 105);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZIIII[Lec;)V")
    public static final void method1517(boolean arg0, int arg1, int arg2, int arg3, int arg4, class178[] arg5) {
        field4017++;
        for (int var6 = arg1; var6 < arg5.length; var6++) {
            class178 var7 = arg5[var6];
            if (var7 != null && var7.field2990 == arg2) {
                class101.method611(var7, arg1 ^ 0xFFFFFF97, arg4, arg3, arg0);
                class164.method1033(var7, arg3, arg1 ^ 0xFFFFFFFE, arg4);
                if (var7.field2998 > var7.field3056 - var7.field2997) {
                    var7.field2998 = var7.field3056 - var7.field2997;
                }
                if (var7.field3070 - var7.field3085 < var7.field3088) {
                    var7.field3088 = var7.field3070 - var7.field3085;
                }
                if (var7.field3088 < 0) {
                    var7.field3088 = 0;
                }
                if (var7.field2998 < 0) {
                    var7.field2998 = 0;
                }
                if (var7.field3123 == 0) {
                    class163.method1026(arg0, arg1 ^ 0xFFFFFFF8, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method1518(int arg0) {
        field4014 = null;
        field4019 = null;
        if (arg0 != -97) {
            field4015 = null;
        }
        field4015 = null;
        field4008 = null;
        field4013 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BB)I")
    public static final int method1519(byte arg0, byte arg1) {
        field4018++;
        if (arg1 >= 65 && arg1 <= 90) {
            return arg1 - 65;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return arg1 + 26 - 97;
        } else {
            if (arg0 != 41) {
                field4014 = null;
            }
            if (arg1 >= 48 && arg1 <= 57) {
                return arg1 + 52 - 48;
            } else if (arg1 == 43) {
                return 62;
            } else if (arg1 == 42) {
                return 62;
            } else if (arg1 == 47) {
                return 63;
            } else if (arg1 == 45) {
                return 63;
            } else {
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIILpe;IJIIII)Z")
    public static final boolean method1520(int arg0, int arg1, int arg2, int arg3, class258 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class219.method1496(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
