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

@OriginalClass("client!sj")
public class class49 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "[I")
    public static int[] field784 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Lhg;")
    public static class177 field790;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Lcf;")
    public class93 field783;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method269(int arg0) {
        if (arg0 == 14041) {
            field784 = null;
            field790 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
    public static final void method270(boolean arg0) {
        class237.field4250 = -1;
        class256.field4627 = -1;
        class14.field170 = 0;
        class238.field4265 = -1;
        class55.field908 = 0;
        class253.field4549 = 0;
        field785++;
        if (!arg0) {
            field790 = null;
        }
        class111.field1888 = -1;
        class58.field991 = false;
        class285.field5105.field5027 = 0;
        class38.field593 = 0;
        class72.field1300 = 0;
        class31.field492 = 0;
        class250.field4504.field5027 = 0;
        for (int var1 = 0; var1 < class224.field4031.length; var1++) {
            if (class224.field4031[var1] != null) {
                class224.field4031[var1].field3841 = -1;
            }
        }
        for (int var2 = 0; var2 < class155.field2709.length; var2++) {
            if (class155.field2709[var2] != null) {
                class155.field2709[var2].field3841 = -1;
            }
        }
        class169.method1216(32);
        class18.field234 = 1;
        class19.method88(30, false);
        for (int var3 = 0; var3 < 100; var3++) {
            class25.field314[var3] = true;
        }
        class135.method982((byte) 33);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIII)V")
    public static final void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field789++;
        int var6 = arg2 - arg5;
        int var7 = arg1 - arg4;
        if (~var6 == arg3) {
            if (var7 != 0) {
                class92.method631(arg4, arg0, arg5, arg1, true);
            }
        } else if (var7 == 0) {
            class101.method726(arg4, (byte) 126, arg0, arg5, arg2);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class277.field4967) {
                var11 = class277.field4967;
                var10 = var9 + (class277.field4967 * var8 >> 12);
            } else if (arg5 > class147.field2593) {
                var10 = (class147.field2593 * var8 >> 12) + var9;
                var11 = class147.field2593;
            } else {
                var10 = arg4;
                var11 = arg5;
            }
            if (class26.field342 > var10) {
                var10 = class26.field342;
                var11 = (class26.field342 - var9 << 12) / var8;
            } else if (var10 > class271.field4820) {
                var10 = class271.field4820;
                var11 = (class271.field4820 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class277.field4967 > arg2) {
                var12 = (class277.field4967 * var8 >> 12) + var9;
                var13 = class277.field4967;
            } else if (class147.field2593 < arg2) {
                var12 = (class147.field2593 * var8 >> 12) + var9;
                var13 = class147.field2593;
            } else {
                var12 = arg1;
                var13 = arg2;
            }
            if (class26.field342 > var12) {
                var12 = class26.field342;
                var13 = (class26.field342 - var9 << 12) / var8;
            } else if (class271.field4820 < var12) {
                var13 = (class271.field4820 - var9 << 12) / var8;
                var12 = class271.field4820;
            }
            class287.method1966(var10, var13, var12, (byte) -109, arg0, var11);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZLhc;I)V")
    public static final void method272(boolean arg0, class228 arg1, int arg2) {
        if (arg0) {
            method271(28, 125, 74, 78, -57, 22);
        }
        field788++;
        while (true) {
            class4 var3 = (class4) class112.field1904.method1151(108);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field39; var5++) {
                if (var3.field38[var5] != null) {
                    if (var3.field38[var5].field290 == 2) {
                        var3.field42[var5] = -5;
                    }
                    if (var3.field38[var5].field290 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field51[var5] != null) {
                    if (var3.field51[var5].field290 == 2) {
                        var3.field42[var5] = -6;
                    }
                    if (var3.field51[var5].field290 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1568(arg2, (byte) 68);
            arg1.method1916(0, 75);
            int var6 = arg1.field5027;
            arg1.method1886(var3.field40, 2);
            for (int var7 = 0; var7 < var3.field39; var7++) {
                if (var3.field42[var7] == 0) {
                    try {
                        int var8 = var3.field47[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field38[var7].field292;
                            int var10 = var9.getInt((Object) null);
                            arg1.method1916(0, 111);
                            arg1.method1886(var10, 2);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field38[var7].field292;
                            var13.setInt((Object) null, var3.field50[var7]);
                            arg1.method1916(0, 92);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field38[var7].field292;
                            int var12 = var11.getModifiers();
                            arg1.method1916(0, 69);
                            arg1.method1886(var12, 2);
                        }
                        if (var8 == 3) {
                            byte[][] var16 = var3.field58[var7];
                            Method var17 = (Method) var3.field51[var7].field292;
                            Object[] var18 = new Object[var16.length];
                            for (int var19 = 0; var19 < var16.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var16[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var17.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method1916(0, 80);
                            } else if ((var21 instanceof Number)) {
                                arg1.method1916(1, 86);
                                arg1.method1882(((Number) var21).longValue(), (byte) -126);
                            } else if (var21 instanceof class93) {
                                arg1.method1916(2, 74);
                                arg1.method1898((byte) 119, (class93) var21);
                            } else {
                                arg1.method1916(4, 123);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field51[var7].field292;
                            int var15 = var14.getModifiers();
                            arg1.method1916(0, 113);
                            arg1.method1886(var15, 2);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1916(-10, 63);
                    } catch (InvalidClassException var23) {
                        arg1.method1916(-11, 115);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1916(-12, 69);
                    } catch (OptionalDataException var25) {
                        arg1.method1916(-13, 111);
                    } catch (IllegalAccessException var26) {
                        arg1.method1916(-14, 117);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1916(-15, 114);
                    } catch (InvocationTargetException var28) {
                        arg1.method1916(-16, 124);
                    } catch (SecurityException var29) {
                        arg1.method1916(-17, 68);
                    } catch (IOException var30) {
                        arg1.method1916(-18, 113);
                    } catch (NullPointerException var31) {
                        arg1.method1916(-19, 83);
                    } catch (Exception var32) {
                        arg1.method1916(-20, 79);
                    } catch (Throwable var33) {
                        arg1.method1916(-21, 107);
                    }
                } else {
                    arg1.method1916(var3.field42[var7], 105);
                }
            }
            arg1.method1894(var6, -53);
            arg1.method1874(arg0, arg1.field5027 - var6);
            var3.method1544((byte) -30);
        }
    }
}
