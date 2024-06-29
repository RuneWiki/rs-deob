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

@OriginalClass("client!sd")
public class class275 extends class63 {

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    private int field4584;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    private int field4602;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    private int field4601;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    private int field4593;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    private int field4590;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    private int field4599;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    private int field4603;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    private int field4600;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field4586 = 0;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "[I")
    public static int[] field4595 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field4598 = 0;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Ldd;")
    public static class91 field4591 = new class91(5000);

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "Z")
    public static boolean field4605 = false;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "F")
    public static float field4588;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "[I")
    public static int[] field4596;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB)V")
    public final void method214(int arg0, int arg1, byte arg2) {
        ++field4592;
        int var4 = this.field4593 * arg0 >> 12;
        int var5 = this.field4590 * arg0 >> 12;
        int var6 = this.field4584 * arg1 >> 12;
        int var7 = this.field4601 * arg0 >> 12;
        int var8 = this.field4602 * arg1 >> 12;
        int var9 = this.field4600 * arg0 >> 12;
        if (arg2 >= -110) {
            this.method210(-26, 124, -61);
        }
        int var10 = this.field4603 * arg1 >> 12;
        int var11 = this.field4599 * arg1 >> 12;
        class282.method1965(var5, var4, super.field1066, var8, var10, var11, var9, var6, 23329, var7);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
    public final void method210(int arg0, int arg1, int arg2) {
        if (arg2 != 8846) {
            method1931(false, -59, (class91) null);
        }
        ++field4594;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZILdd;)V")
    public static final void method1931(boolean arg0, int arg1, class91 arg2) {
        ++field4589;
        if (arg0) {
            method1933(52);
        }
        while (true) {
            class130 var3 = (class130) class259.field4351.method309(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; ~var3.field2148 < ~var5; ++var5) {
                if (var3.field2155[var5] != null) {
                    if (var3.field2155[var5].field3091 == 2) {
                        var3.field2145[var5] = -5;
                    }
                    if (var3.field2155[var5].field3091 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2144[var5] != null) {
                    if (var3.field2144[var5].field3091 == 2) {
                        var3.field2145[var5] = -6;
                    }
                    if (var3.field2144[var5].field3091 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method640((byte) 97, arg1);
            arg2.method1780(0, 110);
            int var6 = arg2.field4160;
            arg2.method1811(var3.field2158, (byte) 51);
            for (int var7 = 0; var7 < var3.field2148; ++var7) {
                if (var3.field2145[var7] != 0) {
                    arg2.method1780(var3.field2145[var7], 113);
                } else {
                    try {
                        int var8 = var3.field2160[var7];
                        if (var8 != 0) {
                            if (~var8 != -2) {
                                if (~var8 == -3) {
                                    Field var9 = (Field) var3.field2155[var7].field3089;
                                    int var10 = var9.getModifiers();
                                    arg2.method1780(0, 116);
                                    arg2.method1811(var10, (byte) 51);
                                }
                            } else {
                                Field var11 = (Field) var3.field2155[var7].field3089;
                                var11.setInt((Object) null, var3.field2152[var7]);
                                arg2.method1780(0, 109);
                            }
                        } else {
                            Field var12 = (Field) var3.field2155[var7].field3089;
                            int var13 = var12.getInt((Object) null);
                            arg2.method1780(0, 120);
                            arg2.method1811(var13, (byte) 51);
                        }
                        if (var8 != 3) {
                            if (var8 == 4) {
                                Method var20 = (Method) var3.field2144[var7].field3089;
                                int var21 = var20.getModifiers();
                                arg2.method1780(0, 106);
                                arg2.method1811(var21, (byte) 51);
                            }
                        } else {
                            Method var14 = (Method) var3.field2144[var7].field3089;
                            byte[][] var15 = var3.field2156[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; ++var17) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method1780(0, 116);
                            } else if (var19 instanceof Number) {
                                arg2.method1780(1, 100);
                                arg2.method1795(((Number) var19).longValue(), (byte) -59);
                            } else if (!(var19 instanceof String)) {
                                arg2.method1780(4, 82);
                            } else {
                                arg2.method1780(2, 70);
                                arg2.method1786(-25149, (String) var19);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1780(-10, 68);
                    } catch (InvalidClassException var23) {
                        arg2.method1780(-11, 71);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1780(-12, 120);
                    } catch (OptionalDataException var25) {
                        arg2.method1780(-13, 63);
                    } catch (IllegalAccessException var26) {
                        arg2.method1780(-14, 121);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1780(-15, 117);
                    } catch (InvocationTargetException var28) {
                        arg2.method1780(-16, 62);
                    } catch (SecurityException var29) {
                        arg2.method1780(-17, 118);
                    } catch (IOException var30) {
                        arg2.method1780(-18, 69);
                    } catch (NullPointerException var31) {
                        arg2.method1780(-19, 66);
                    } catch (Exception var32) {
                        arg2.method1780(-20, 117);
                    } catch (Throwable var33) {
                        arg2.method1780(-21, 70);
                    }
                }
            }
            arg2.method1803(!arg0, var6);
            arg2.method1797(-var6 + arg2.field4160, (byte) -106);
            var3.method993(32);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method1932(byte arg0) {
        field4591 = null;
        field4596 = null;
        if (arg0 != 115) {
            method1931(true, -112, (class91) null);
        }
        field4595 = null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static final void method1933(int arg0) {
        ++field4597;
        if (class68.field1144 != class182.field2898) {
            if (arg0 != -18) {
                method1931(true, 81, (class91) null);
            }
            if (class289.method2011(class182.field2898, (byte) -79)) {
                class68.field1144 = class182.field2898;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZI)V")
    public final void method216(int arg0, boolean arg1, int arg2) {
        ++field4587;
        if (!arg1) {
            method1934(100, -102, 35, -118, 44, 91, -83);
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4584 = arg3;
        this.field4602 = arg1;
        this.field4601 = arg4;
        this.field4593 = arg0;
        this.field4590 = arg2;
        this.field4599 = arg7;
        this.field4603 = arg5;
        this.field4600 = arg6;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 - -arg6;
        ++field4585;
        int var8 = -arg6 + arg0;
        int var9 = arg5 + arg6;
        for (int var10 = arg1; var10 < var7; ++var10) {
            class134.method996(0, arg4, arg5, arg2, class41.field630[var10]);
        }
        if (arg3 <= 92) {
            method1931(false, -23, (class91) null);
        }
        for (int var11 = arg0; ~var11 < ~var8; --var11) {
            class134.method996(0, arg4, arg5, arg2, class41.field630[var11]);
        }
        int var12 = -arg6 + arg4;
        for (int var13 = var7; ~var13 >= ~var8; ++var13) {
            int[] var14 = class41.field630[var13];
            class134.method996(0, var9, arg5, arg2, var14);
            class134.method996(0, arg4, var12, arg2, var14);
        }
    }
}
