import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class275 {

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Lcm;")
    public static class449 field3825 = new class449(0, 15);

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3827 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Lge;")
    public static class13 field3826;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[B")
    public static final byte[] method1744(int arg0, int arg1) {
        field3822++;
        class371 var2 = (class371) class456.field6701.method2211((long) arg1, -128);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class455.method2740(-8, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class371(var3);
            class456.field6701.method2216(var2, (long) arg1, -25431);
        }
        return arg0 >= -34 ? null : var2.field5697;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILtl;)Ljava/lang/String;")
    public static final String method1745(int arg0, class91 arg1) {
        field3823++;
        if (arg0 != -20) {
            method1747(-74, -66, null);
        }
        return class227.method1561(0, 32767, arg1);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lap;B)V")
    public static final void method1746(class337 arg0, byte arg1) {
        field3824++;
        boolean var2 = false;
        if (class405.field6116 == arg0.field5264 || arg0.field5240 == -1 || arg0.field5301 != 0) {
            var2 = true;
        } else {
            class270 var3 = class260.field3621.method1934(115, arg0.field5240);
            if (var3.field3744 || arg0.field5256 + 1 > var3.field3746[arg0.field5269]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field5264 - arg0.field5285;
            int var5 = class405.field6116 - arg0.field5285;
            int var6 = arg0.field5315 * 128 + (arg0.method2091(-15245) * 64);
            int var7 = arg0.field5331 * 128 + arg0.method2091(-15245) * 64;
            int var8 = arg0.field5262 * 128 + (arg0.method2091(-15245) * 64);
            int var9 = arg0.field5270 * 128 + (arg0.method2091(-15245) * 64);
            arg0.field2217 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field2215 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field5342 = 0;
        if (arg0.field5298 == 0) {
            arg0.method2184(8192, 14839);
        }
        int var10 = 44 % ((arg1 + 17) / 52);
        if (arg0.field5298 == 1) {
            arg0.method2184(12288, 14839);
        }
        if (arg0.field5298 == 2) {
            arg0.method2184(0, 14839);
        }
        if (arg0.field5298 == 3) {
            arg0.method2184(4096, 14839);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILof;)V")
    public static final void method1747(int arg0, int arg1, class321 arg2) {
        field3820++;
        if (arg0 != -18) {
            field3827 = null;
        }
        while (true) {
            class390 var3 = (class390) class509.field7563.method1970(64);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field5910; var5++) {
                if (var3.field5911[var5] != null) {
                    if (var3.field5911[var5].field1791 == 2) {
                        var3.field5912[var5] = -5;
                    }
                    if (var3.field5911[var5].field1791 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field5909[var5] != null) {
                    if (var3.field5909[var5].field1791 == 2) {
                        var3.field5912[var5] = -6;
                    }
                    if (var3.field5909[var5].field1791 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method2082(arg0 ^ 0xFFFFFFF9, arg1);
            arg2.method625(0, false);
            int var6 = arg2.field1292;
            arg2.method615(28010, var3.field5915);
            for (int var7 = 0; var7 < var3.field5910; var7++) {
                if (var3.field5912[var7] == 0) {
                    try {
                        int var8 = var3.field5908[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field5911[var7].field1793;
                            int var10 = var9.getInt(null);
                            arg2.method625(0, false);
                            arg2.method615(arg0 + 28028, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field5911[var7].field1793;
                            var11.setInt(null, var3.field5914[var7]);
                            arg2.method625(0, false);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field5911[var7].field1793;
                            int var13 = var12.getModifiers();
                            arg2.method625(0, false);
                            arg2.method615(arg0 ^ 0xFFFF9284, var13);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field5909[var7].field1793;
                            byte[][] var15 = var3.field5920[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg2.method625(0, false);
                            } else if (var19 instanceof Number) {
                                arg2.method625(1, false);
                                arg2.method614(((Number) var19).longValue(), false);
                            } else if (var19 instanceof String) {
                                arg2.method625(2, false);
                                arg2.method603(-112, (String) var19);
                            } else {
                                arg2.method625(4, false);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field5909[var7].field1793;
                            int var21 = var20.getModifiers();
                            arg2.method625(0, false);
                            arg2.method615(arg0 + 28028, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method625(-10, false);
                    } catch (InvalidClassException var23) {
                        arg2.method625(-11, false);
                    } catch (StreamCorruptedException var24) {
                        arg2.method625(-12, false);
                    } catch (OptionalDataException var25) {
                        arg2.method625(-13, false);
                    } catch (IllegalAccessException var26) {
                        arg2.method625(-14, false);
                    } catch (IllegalArgumentException var27) {
                        arg2.method625(-15, false);
                    } catch (InvocationTargetException var28) {
                        arg2.method625(-16, false);
                    } catch (SecurityException var29) {
                        arg2.method625(-17, false);
                    } catch (IOException var30) {
                        arg2.method625(-18, false);
                    } catch (NullPointerException var31) {
                        arg2.method625(-19, false);
                    } catch (Exception var32) {
                        arg2.method625(-20, false);
                    } catch (Throwable var33) {
                        arg2.method625(-21, false);
                    }
                } else {
                    arg2.method625(var3.field5912[var7], false);
                }
            }
            arg2.method639(var6, (byte) 77);
            arg2.method596(arg2.field1292 - var6, false);
            var3.method2785((byte) -120);
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)I")
    public static final int method1748(int arg0, int arg1) {
        field3821++;
        if (arg1 >= -93) {
            field3826 = null;
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method1749(int arg0) {
        if (arg0 != 30956) {
            method1744(65, -112);
        }
        field3827 = null;
        field3825 = null;
        field3826 = null;
    }
}
