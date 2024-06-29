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

@OriginalClass("client!ow")
public class class322 extends class539 implements class310 {

    @OriginalMember(owner = "client!ow", name = "C", descriptor = "Luo;")
    public class539 field4004;

    @OriginalMember(owner = "client!ow", name = "J", descriptor = "[I")
    public static int[] field4011 = new int[32];

    @OriginalMember(owner = "client!ow", name = "N", descriptor = "J")
    public static long field4015;

    @OriginalMember(owner = "client!ow", name = "x", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!ow", name = "y", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!ow", name = "A", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ow", name = "B", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!ow", name = "D", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!ow", name = "E", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!ow", name = "F", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!ow", name = "G", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!ow", name = "H", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!ow", name = "I", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ow", name = "K", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!ow", name = "L", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!ow", name = "M", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
    public final void method132(int arg0) {
        if (arg0 == -13968) {
            field4005++;
        }
    }

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "(B)V")
    public static void method1857(byte arg0) {
        if (arg0 != 31) {
            field4015 = 72L;
        }
        field4011 = null;
    }

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "(B)I")
    public final int method1858(byte arg0) {
        field4013++;
        if (arg0 < 6) {
            method1859(-36, null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILqf;)V")
    public static final void method1859(int arg0, class638 arg1) {
        field4012++;
        class432 var2 = (class432) class539.field6796.method1909(true);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field5446; var4++) {
            if (var2.field5444[var4] != null) {
                if (var2.field5444[var4].field2546 == 2) {
                    var2.field5447[var4] = -5;
                }
                if (var2.field5444[var4].field2546 == 0) {
                    var3 = true;
                }
            }
            if (var2.field5448[var4] != null) {
                if (var2.field5448[var4].field2546 == 2) {
                    var2.field5447[var4] = -6;
                }
                if (var2.field5448[var4].field2546 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg1.field7313;
        arg1.method3061(var2.field5445, (byte) 115);
        for (int var6 = arg0; var6 < var2.field5446; var6++) {
            if (var2.field5447[var6] == 0) {
                try {
                    int var7 = var2.field5452[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field5444[var6].field2547;
                        int var9 = var8.getInt(null);
                        arg1.method3090(0, 3);
                        arg1.method3061(var9, (byte) 115);
                    } else if (var7 == 1) {
                        Field var10 = (Field) var2.field5444[var6].field2547;
                        var10.setInt(null, var2.field5450[var6]);
                        arg1.method3090(0, 3);
                    } else if (var7 == 2) {
                        Field var11 = (Field) var2.field5444[var6].field2547;
                        int var12 = var11.getModifiers();
                        arg1.method3090(0, 3);
                        arg1.method3061(var12, (byte) 115);
                    }
                    if (var7 == 3) {
                        Method var15 = (Method) var2.field5448[var6].field2547;
                        byte[][] var16 = var2.field5451[var6];
                        Object[] var17 = new Object[var16.length];
                        for (int var18 = 0; var18 < var16.length; var18++) {
                            ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                            var17[var18] = var19.readObject();
                        }
                        Object var20 = var15.invoke(null, var17);
                        if (var20 == null) {
                            arg1.method3090(0, 3);
                        } else if ((var20 instanceof Number)) {
                            arg1.method3090(1, 3);
                            arg1.method3047(true, ((Number) var20).longValue());
                        } else if ((var20 instanceof String)) {
                            arg1.method3090(2, 3);
                            arg1.method3050(false, (String) var20);
                        } else {
                            arg1.method3090(4, arg0 ^ 0x3);
                        }
                    } else if (var7 == 4) {
                        Method var13 = (Method) var2.field5448[var6].field2547;
                        int var14 = var13.getModifiers();
                        arg1.method3090(0, 3);
                        arg1.method3061(var14, (byte) 115);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method3090(-10, 3);
                } catch (InvalidClassException var22) {
                    arg1.method3090(-11, 3);
                } catch (StreamCorruptedException var23) {
                    arg1.method3090(-12, 3);
                } catch (OptionalDataException var24) {
                    arg1.method3090(-13, 3);
                } catch (IllegalAccessException var25) {
                    arg1.method3090(-14, arg0 + 3);
                } catch (IllegalArgumentException var26) {
                    arg1.method3090(-15, 3);
                } catch (InvocationTargetException var27) {
                    arg1.method3090(-16, 3);
                } catch (SecurityException var28) {
                    arg1.method3090(-17, 3);
                } catch (IOException var29) {
                    arg1.method3090(-18, 3);
                } catch (NullPointerException var30) {
                    arg1.method3090(-19, 3);
                } catch (Exception var31) {
                    arg1.method3090(-20, 3);
                } catch (Throwable var32) {
                    arg1.method3090(-21, arg0 ^ 0x3);
                }
            } else {
                arg1.method3090(var2.field5447[var6], arg0 + 3);
            }
        }
        arg1.method3088(16405, var5);
        var2.method1566(-67);
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)I")
    public final int method138(int arg0) {
        if (arg0 != 8470) {
            this.method132(-55);
        }
        field4009++;
        return 0;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Loa;B)V")
    public final void method130(class650 arg0, byte arg1) {
        field4002++;
        if (arg1 > -27) {
            this.method7(null, (byte) -21);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(BILoa;I)Z")
    public final boolean method8(byte arg0, int arg1, class650 arg2, int arg3) {
        int var5 = -70 % ((arg0 - 77) / 40);
        field4014++;
        return false;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILoa;)Lww;")
    public final class686 method11(int arg0, class650 arg1) {
        field4000++;
        return arg0 >= -89 ? null : null;
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(Loa;B)V")
    public final void method7(class650 arg0, byte arg1) {
        field4003++;
        if (arg1 != 98) {
            this.method7(null, (byte) 24);
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(Loa;I)Lqt;")
    public final class595 method6(class650 arg0, int arg1) {
        if (arg1 != -7459) {
            this.method6(null, 26);
        }
        field3999++;
        return this.field4004.method6(arg0, -7459);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Loa;I)V")
    public final void method136(class650 arg0, int arg1) {
        int var3 = -4 % ((-arg1 - 78) / 37);
        field4006++;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)I")
    public final int method131(byte arg0) {
        field4007++;
        if (arg0 != -97) {
            field4015 = 64L;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Loa;BI)Lba;")
    public final class359 method134(class650 arg0, byte arg1, int arg2) {
        field4008++;
        return arg1 < 80 ? null : null;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)Z")
    public final boolean method133(boolean arg0) {
        field4001++;
        if (arg0) {
            this.method8((byte) 3, 101, null, 106);
        }
        return false;
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)I")
    public final int method139(byte arg0) {
        field4010++;
        return arg0 < 13 ? -36 : 0;
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(IIIIILuo;)V")
    public class322(int arg0, int arg1, int arg2, int arg3, int arg4, class539 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class602.method3310(arg1, arg0, -82));
        this.field4004 = arg5;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4011[var1] = var0 - 1;
            var0 += var0;
        }
        field4015 = 0L;
    }
}
