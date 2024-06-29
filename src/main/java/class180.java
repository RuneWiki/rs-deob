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

@OriginalClass("client!ua")
public class class180 extends class14 {

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public int field3630 = 0;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "Lea;")
    private static class38 field3635 = class9.method46((byte) 102, "red:");

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "Lea;")
    public static class38 field3636 = class9.method46((byte) 102, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "Lea;")
    private static class38 field3629 = class9.method46((byte) 118, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "Lea;")
    public static class38 field3634 = field3635;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "Lea;")
    public static class38 field3633 = field3629;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "Lea;")
    private static class38 field3639 = class9.method46((byte) 118, "Login server offline)3");

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "Lea;")
    public static class38 field3631 = field3639;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "Lea;")
    public static class38 field3638 = field3635;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "[I")
    public static int[] field3628;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ld;II)V")
    public static final void method1234(class28 arg0, int arg1, int arg2) {
        if (arg2 != -21) {
            method1237((byte) -117);
        }
        field3632++;
        while (true) {
            class169 var3 = (class169) class52.field1334.method1020(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3467; var5++) {
                if (var3.field3471[var5] != null) {
                    if (var3.field3471[var5].field1486 == 2) {
                        var3.field3474[var5] = -5;
                    }
                    if (var3.field3471[var5].field1486 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3468[var5] != null) {
                    if (var3.field3468[var5].field1486 == 2) {
                        var3.field3474[var5] = -6;
                    }
                    if (var3.field3468[var5].field1486 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method169(-1494101117, arg1);
            arg0.method495(119, 0);
            int var6 = arg0.field1620;
            arg0.method478((byte) 43, var3.field3469);
            for (int var7 = 0; var7 < var3.field3467; var7++) {
                if (var3.field3474[var7] == 0) {
                    try {
                        int var8 = var3.field3476[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3471[var7].field1490;
                            int var13 = var12.getInt(null);
                            arg0.method495(116, 0);
                            arg0.method478((byte) 81, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field3471[var7].field1490;
                            var9.setInt(null, var3.field3466[var7]);
                            arg0.method495(arg2 ^ 0xFFFFFF97, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field3471[var7].field1490;
                            int var11 = var10.getModifiers();
                            arg0.method495(100, 0);
                            arg0.method478((byte) -117, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3468[var7].field1490;
                            byte[][] var17 = var3.field3475[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg0.method495(103, 0);
                            } else if (var21 instanceof Number) {
                                arg0.method495(arg2 ^ 0xFFFFFF93, 1);
                                arg0.method480(((Number) var21).longValue(), (byte) 98);
                            } else if (var21 instanceof class38) {
                                arg0.method495(arg2 + 137, 2);
                                arg0.method508((class38) var21, arg2 ^ 0xFFFFFFEB);
                            } else {
                                arg0.method495(108, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3468[var7].field1490;
                            int var15 = var14.getModifiers();
                            arg0.method495(111, 0);
                            arg0.method478((byte) -124, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method495(121, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method495(112, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method495(108, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method495(arg2 ^ 0xFFFFFF8A, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method495(120, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method495(104, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method495(102, -16);
                    } catch (SecurityException var29) {
                        arg0.method495(arg2 ^ 0xFFFFFF9E, -17);
                    } catch (IOException var30) {
                        arg0.method495(118, -18);
                    } catch (NullPointerException var31) {
                        arg0.method495(101, -19);
                    } catch (Exception var32) {
                        arg0.method495(127, -20);
                    } catch (Throwable var33) {
                        arg0.method495(110, -21);
                    }
                } else {
                    arg0.method495(115, var3.field3474[var7]);
                }
            }
            arg0.method468(var6, (byte) -87);
            arg0.method479(arg0.field1620 - var6, 128);
            var3.method805(false);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILhc;)V")
    private final void method1235(int arg0, int arg1, class66 arg2) {
        field3640++;
        if (arg0 < 53) {
            field3628 = null;
        }
        if (arg1 == 2) {
            this.field3630 = arg2.method511(-124);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lhc;Z)V")
    public final void method1236(class66 arg0, boolean arg1) {
        field3637++;
        while (true) {
            int var3 = arg0.method509(117);
            if (var3 == 0) {
                if (arg1) {
                    field3628 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1235(85, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static void method1237(byte arg0) {
        if (arg0 <= 90) {
            method1234(null, 35, -71);
        }
        field3629 = null;
        field3633 = null;
        field3634 = null;
        field3635 = null;
        field3639 = null;
        field3628 = null;
        field3638 = null;
        field3631 = null;
        field3636 = null;
    }
}
