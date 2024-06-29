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

@OriginalClass("client!hfa")
public class class331 {

    @OriginalMember(owner = "client!hfa", name = "k", descriptor = "I")
    public int field4583;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!hfa", name = "m", descriptor = "I")
    public int field4585;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!hfa", name = "j", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!hfa", name = "l", descriptor = "I")
    public static int field4584;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hfa", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field4586;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "[Z")
    public static boolean[] field4580;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIZBI)V")
    public static final void method1961(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        if (arg4 <= 35) {
            return;
        }
        field4574++;
        long var6 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg2);
        class569 var8 = (class569) class624.field8898.method2818(-22803, var6);
        if (var8 == null) {
            var8 = new class569();
            class624.field8898.method2816(var8, var6, false);
        }
        if (var8.field8318.length <= arg5) {
            int[] var9 = new int[arg5 + 1];
            int[] var10 = new int[arg5 + 1];
            for (int var11 = 0; var11 < var8.field8318.length; var11++) {
                var9[var11] = var8.field8318[var11];
                var10[var11] = var8.field8313[var11];
            }
            for (int var12 = var8.field8318.length; var12 < arg5; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field8313 = var10;
            var8.field8318 = var9;
        }
        var8.field8318[arg5] = arg1;
        var8.field8313[arg5] = arg0;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
    public static final void method1962(int arg0) {
        field4581++;
        class121.field1983 = 0;
        int var1 = class376.field5209.method2755((byte) -127);
        int var2 = class376.field5209.method2706((byte) 97);
        boolean var3 = class376.field5209.method2688(arg0 ^ 0xFFFFA23D) == 1;
        int var4 = class376.field5209.method2696(-1605640280);
        class23.method220((byte) -10);
        class696.method3918(var2, (byte) -110);
        int var5 = (class99.field1481 - class376.field5209.field6710) / 16;
        class500.field7433 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class500.field7433[var6][var10] = class376.field5209.method2691((byte) -67);
            }
        }
        if (arg0 != -23875) {
            method1968(null, (byte) 50);
        }
        class556.field8139 = null;
        class648.field9181 = new byte[var5][];
        class223.field3352 = null;
        class395.field5713 = new byte[var5][];
        class113.field1805 = new byte[var5][];
        class221.field3306 = new int[var5];
        class694.field9865 = new int[var5];
        class436.field6271 = new byte[var5][];
        class623.field8876 = new int[var5];
        class297.field4200 = new int[var5];
        class204.field3165 = new int[var5];
        int var7 = 0;
        for (int var8 = (var1 - (class430.field6136 >> 4)) / 8; var8 <= ((class430.field6136 >> 4) + var1) / 8; var8++) {
            for (int var9 = (var4 - (class580.field8504 >> 4)) / 8; var9 <= (var4 + (class580.field8504 >> 4)) / 8; var9++) {
                class221.field3306[var7] = (var8 << 8) + var9;
                class297.field4200[var7] = class466.field6733.method2083(arg0 + 23877, "m" + var8 + "_" + var9);
                class623.field8876[var7] = class466.field6733.method2083(arg0 + 23877, "l" + var8 + "_" + var9);
                class204.field3165[var7] = class466.field6733.method2083(2, "um" + var8 + "_" + var9);
                class694.field9865[var7] = class466.field6733.method2083(2, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class613.method3465(false, 11, var3, var4, var1);
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)V")
    public static void method1963(byte arg0) {
        if (arg0 > 117) {
            field4580 = null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)Z")
    public static final boolean method1964(int arg0, int arg1) {
        if (arg1 <= 33) {
            field4573 = -9;
        }
        field4582++;
        return arg0 == 7 || arg0 == 9;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILsj;)V")
    public static final void method1965(int arg0, class373 arg1) {
        field4584++;
        class702 var2 = (class702) class187.field2932.method3905(-117);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field9931; var4++) {
            if (var2.field9936[var4] != null) {
                if (var2.field9936[var4].field8787 == 2) {
                    var2.field9934[var4] = -5;
                }
                if (var2.field9936[var4].field8787 == 0) {
                    var3 = true;
                }
            }
            if (var2.field9927[var4] != null) {
                if (var2.field9927[var4].field8787 == 2) {
                    var2.field9934[var4] = -6;
                }
                if (var2.field9927[var4].field8787 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg1.field6710;
        arg1.method2733(false, var2.field9929);
        if (arg0 != -18) {
            field4573 = 62;
        }
        for (int var6 = 0; var6 < var2.field9931; var6++) {
            if (var2.field9934[var6] == 0) {
                try {
                    int var7 = var2.field9935[var6];
                    if (var7 == 0) {
                        Field var11 = (Field) var2.field9936[var6].field8785;
                        int var12 = var11.getInt(null);
                        arg1.method2753((byte) 77, 0);
                        arg1.method2733(false, var12);
                    } else if (var7 == 1) {
                        Field var10 = (Field) var2.field9936[var6].field8785;
                        var10.setInt(null, var2.field9932[var6]);
                        arg1.method2753((byte) 64, 0);
                    } else if (var7 == 2) {
                        Field var8 = (Field) var2.field9936[var6].field8785;
                        int var9 = var8.getModifiers();
                        arg1.method2753((byte) 89, 0);
                        arg1.method2733(false, var9);
                    }
                    if (var7 == 3) {
                        Method var13 = (Method) var2.field9927[var6].field8785;
                        byte[][] var14 = var2.field9928[var6];
                        Object[] var15 = new Object[var14.length];
                        for (int var16 = 0; var16 < var14.length; var16++) {
                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                            var15[var16] = var17.readObject();
                        }
                        Object var18 = var13.invoke(null, var15);
                        if (var18 == null) {
                            arg1.method2753((byte) 51, 0);
                        } else if (var18 instanceof Number) {
                            arg1.method2753((byte) 99, 1);
                            arg1.method2721(((Number) var18).longValue(), 520596624);
                        } else if (var18 instanceof String) {
                            arg1.method2753((byte) 125, 2);
                            arg1.method2703(false, (String) var18);
                        } else {
                            arg1.method2753((byte) 53, 4);
                        }
                    } else if (var7 == 4) {
                        Method var19 = (Method) var2.field9927[var6].field8785;
                        int var20 = var19.getModifiers();
                        arg1.method2753((byte) 124, 0);
                        arg1.method2733(false, var20);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method2753((byte) 119, -10);
                } catch (InvalidClassException var22) {
                    arg1.method2753((byte) 88, -11);
                } catch (StreamCorruptedException var23) {
                    arg1.method2753((byte) 108, -12);
                } catch (OptionalDataException var24) {
                    arg1.method2753((byte) 96, -13);
                } catch (IllegalAccessException var25) {
                    arg1.method2753((byte) 50, -14);
                } catch (IllegalArgumentException var26) {
                    arg1.method2753((byte) 77, -15);
                } catch (InvocationTargetException var27) {
                    arg1.method2753((byte) 55, -16);
                } catch (SecurityException var28) {
                    arg1.method2753((byte) 66, -17);
                } catch (IOException var29) {
                    arg1.method2753((byte) 112, -18);
                } catch (NullPointerException var30) {
                    arg1.method2753((byte) 56, -19);
                } catch (Exception var31) {
                    arg1.method2753((byte) 90, -20);
                } catch (Throwable var32) {
                    arg1.method2753((byte) 55, -21);
                }
            } else {
                arg1.method2753((byte) 54, var2.field9934[var6]);
            }
        }
        arg1.method2740(var5, -16384);
        var2.method2549((byte) -102);
    }

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(II)Lhfa;")
    public final class331 method1966(int arg0, int arg1) {
        if (arg1 == -20) {
            field4577++;
            return new class331(this.field4578, arg0, this.field4583, this.field4585);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "(II)V")
    public static final void method1967(int arg0, int arg1) {
        field4576++;
        class433.field6238.method939(28093, arg0);
        if (arg1 != -21) {
            field4580 = null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method1968(String arg0, byte arg1) {
        if (arg1 < 26) {
            field4573 = -8;
        }
        field4575++;
        return class505.method3011(field4586 == null ? (field4586 = method1969("ofa")) : field4586, (byte) -44, arg0);
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(IIII)V")
    public class331(int arg0, int arg1, int arg2, int arg3) {
        this.field4583 = arg2;
        this.field4578 = arg0;
        this.field4585 = arg3;
        this.field4579 = arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1969(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
