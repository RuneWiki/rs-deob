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

@OriginalClass("client!af")
public class class7 extends class77 {

    @OriginalMember(owner = "client!af", name = "M", descriptor = "[B")
    public byte[] field81;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "Z")
    public static boolean field75 = false;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field78 = -1;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "[I")
    public static int[] field79 = new int[256];

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "Ldc;")
    private static class37 field85;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "Ldc;")
    public static class37 field84;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "[I")
    public static int[] field77;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([IIIIII)V")
    public static final void method47(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class18 var6 = class180.field3354[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class237 var7 = var6.field286;
        if (var7 != null) {
            int var8 = var7.field4312;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class116 var10 = var6.field284;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2089;
        int var12 = var10.field2091;
        int var13 = var10.field2088;
        int var14 = var10.field2077;
        int[] var15 = class197.field3685[var11];
        int[] var16 = class50.field1017[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)I")
    public static final int method48(int arg0, int arg1, int arg2) {
        int var3 = arg1 >>> 31;
        if (arg2 <= 30) {
            field79 = null;
        }
        field82++;
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V")
    public static void method49(boolean arg0) {
        field85 = null;
        if (arg0) {
            field79 = null;
            field77 = null;
            field84 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lvf;IB)V")
    public static final void method50(class233 arg0, int arg1, byte arg2) {
        field73++;
        if (arg2 != 35) {
            return;
        }
        while (true) {
            class246 var3 = (class246) class163.field3076.method1338(-125);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4502; var5++) {
                if (var3.field4500[var5] != null) {
                    if (var3.field4500[var5].field2461 == 2) {
                        var3.field4496[var5] = -5;
                    }
                    if (var3.field4500[var5].field2461 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4493[var5] != null) {
                    if (var3.field4493[var5].field2461 == 2) {
                        var3.field4496[var5] = -6;
                    }
                    if (var3.field4493[var5].field2461 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1503(arg1, arg2 ^ 0xB83);
            arg0.method214((byte) 106, 0);
            int var6 = arg0.field526;
            arg0.method183(var3.field4494, arg2 ^ 0xBC2D1C3B);
            for (int var7 = 0; var7 < var3.field4502; var7++) {
                if (var3.field4496[var7] == 0) {
                    try {
                        int var8 = var3.field4501[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field4500[var7].field2465;
                            int var13 = var12.getInt(null);
                            arg0.method214((byte) 104, 0);
                            arg0.method183(var13, arg2 - 1137894411);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field4500[var7].field2465;
                            var11.setInt(null, var3.field4490[var7]);
                            arg0.method214((byte) 118, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field4500[var7].field2465;
                            int var10 = var9.getModifiers();
                            arg0.method214((byte) 127, 0);
                            arg0.method183(var10, arg2 - 1137894411);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field4493[var7].field2465;
                            byte[][] var17 = var3.field4492[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg0.method214((byte) 111, 0);
                            } else if (var21 instanceof Number) {
                                arg0.method214((byte) 127, 1);
                                arg0.method190(((Number) var21).longValue(), (byte) -111);
                            } else if (var21 instanceof class37) {
                                arg0.method214((byte) 118, 2);
                                arg0.method200((class37) var21, -106);
                            } else {
                                arg0.method214((byte) 113, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4493[var7].field2465;
                            int var15 = var14.getModifiers();
                            arg0.method214((byte) 127, 0);
                            arg0.method183(var15, -1137894376);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method214((byte) 125, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method214((byte) 114, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method214((byte) 126, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method214((byte) 125, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method214((byte) 109, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method214((byte) 112, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method214((byte) 125, -16);
                    } catch (SecurityException var29) {
                        arg0.method214((byte) 109, -17);
                    } catch (IOException var30) {
                        arg0.method214((byte) 119, -18);
                    } catch (NullPointerException var31) {
                        arg0.method214((byte) 109, -19);
                    } catch (Exception var32) {
                        arg0.method214((byte) 103, -20);
                    } catch (Throwable var33) {
                        arg0.method214((byte) 111, -21);
                    }
                } else {
                    arg0.method214((byte) 104, var3.field4496[var7]);
                }
            }
            arg0.method185(32258, var6);
            arg0.method231((byte) 21, arg0.field526 - var6);
            var3.method433(0);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    public static final void method51(int arg0, int arg1) {
        field74++;
        class140 var2 = (class140) class107.field1857.method1042((byte) -25);
        if (arg0 != 0) {
            field79 = null;
        }
        while (var2 != null) {
            if ((var2.field1066 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method433(arg0);
            }
            var2 = (class140) class107.field1857.method1041(true);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)V")
    public static final void method52(int arg0, byte arg1) {
        field83++;
        if (arg1 <= 101) {
            return;
        }
        if (arg0 == -1 && !class238.field4376) {
            class97.method649(false);
        } else if (arg0 != -1 && (class184.field3396 != arg0 || !class103.method670((byte) -37)) && class52.field1050 != 0 && !class238.field4376) {
            class103.method668(arg0, 13910, 0, false, 2, class68.field1236, class52.field1050);
        }
        class184.field3396 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "([B)V")
    public class7(byte[] arg0) {
        this.field81 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field79[var0] = var1;
        }
        field85 = class185.method1233((byte) 86, "Please try again)3");
        field84 = field85;
    }
}
