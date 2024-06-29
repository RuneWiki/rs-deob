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

@OriginalClass("client!ka")
public class class217 extends class216 {

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public int field3618 = 0;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "[I")
    public static int[] field3616 = new int[256];

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "Lbd;")
    public static class162 field3619;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "[I")
    public static int[] field3622;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "Lbd;")
    public static class162 field3624;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILb;)V", line = 4)
    public final void method1574(int arg0, class94 arg1) {
        field3621++;
        while (true) {
            int var3 = arg1.method756(915905888);
            if (var3 == 0) {
                if (arg0 >= -57) {
                    method1576(66, -108, (class47) null);
                }
                return;
            }
            this.method1577(var3, 2, arg1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)Lgg;", line = 25)
    public static final class34 method1575(byte arg0) {
        field3628++;
        class34 var1;
        if (class117.field2159) {
            var1 = new class249(class238.field3962, class277.field4637, class127.field2312[0], class40.field646[0], class190.field3253[0], class260.field4333[0], class317.field5350[0], class306.field5152);
        } else {
            var1 = new class99(class238.field3962, class277.field4637, class127.field2312[0], class40.field646[0], class190.field3253[0], class260.field4333[0], class317.field5350[0], class306.field5152);
        }
        class247.method1738(-125);
        return arg0 == 35 ? var1 : (class34) null;
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
            field3616[var0] = var1;
        }
        field3619 = class17.method142(0, "_labels");
        field3622 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
        field3620 = -2;
        field3625 = 0;
        field3624 = class17.method142(0, "blaugr-Un:");
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILk;)V", line = 51)
    public static final void method1576(int arg0, int arg1, class47 arg2) {
        field3626++;
        if (arg0 != 24067) {
            field3616 = (int[]) null;
        }
        while (true) {
            class186 var3 = (class186) class144.field2632.method169(arg0 ^ 0xFFFFA184);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3215; var5++) {
                if (var3.field3209[var5] != null) {
                    if (var3.field3209[var5].field2934 == 2) {
                        var3.field3202[var5] = -5;
                    }
                    if (var3.field3209[var5].field2934 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3211[var5] != null) {
                    if (var3.field3211[var5].field2934 == 2) {
                        var3.field3202[var5] = -6;
                    }
                    if (var3.field3211[var5].field2934 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method338(arg1, (byte) 8);
            arg2.method753(0, true);
            int var6 = arg2.field1653;
            arg2.method730(false, var3.field3207);
            for (int var7 = 0; var7 < var3.field3215; var7++) {
                if (var3.field3202[var7] == 0) {
                    try {
                        int var8 = var3.field3204[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3209[var7].field2933;
                            int var13 = var12.getInt((Object) null);
                            arg2.method753(0, true);
                            arg2.method730(false, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3209[var7].field2933;
                            var11.setInt((Object) null, var3.field3213[var7]);
                            arg2.method753(0, true);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field3209[var7].field2933;
                            int var10 = var9.getModifiers();
                            arg2.method753(0, true);
                            arg2.method730(false, var10);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3211[var7].field2933;
                            byte[][] var17 = var3.field3201[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method753(0, true);
                            } else if ((var21 instanceof Number)) {
                                arg2.method753(1, true);
                                arg2.method745(((Number) var21).longValue(), (byte) -124);
                            } else if (var21 instanceof class162) {
                                arg2.method753(2, true);
                                arg2.method727((class162) var21, -253);
                            } else {
                                arg2.method753(4, true);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3211[var7].field2933;
                            int var15 = var14.getModifiers();
                            arg2.method753(0, true);
                            arg2.method730(false, var15);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg2.method753(-10, true);
                    } catch (InvalidClassException var35) {
                        arg2.method753(-11, true);
                    } catch (StreamCorruptedException var36) {
                        arg2.method753(-12, true);
                    } catch (OptionalDataException var37) {
                        arg2.method753(-13, true);
                    } catch (IllegalAccessException var38) {
                        arg2.method753(-14, true);
                    } catch (IllegalArgumentException var39) {
                        arg2.method753(-15, true);
                    } catch (InvocationTargetException var40) {
                        arg2.method753(-16, true);
                    } catch (SecurityException var41) {
                        arg2.method753(-17, true);
                    } catch (IOException var42) {
                        arg2.method753(-18, true);
                    } catch (NullPointerException var43) {
                        arg2.method753(-19, true);
                    } catch (Exception var44) {
                        arg2.method753(-20, true);
                    } catch (Throwable var45) {
                        arg2.method753(-21, true);
                    }
                } else {
                    arg2.method753(var3.field3202[var7], true);
                }
            }
            arg2.method717(var6, true);
            arg2.method742((byte) -32, arg2.field1653 - var6);
            var3.method1183(false);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILb;)V", line = 242)
    private final void method1577(int arg0, int arg1, class94 arg2) {
        field3627++;
        if (arg0 == arg1) {
            this.field3618 = arg2.method761((byte) 108);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([Lpm;[Lpm;[Lpm;[Lud;Lda;[Lpm;I)V", line = 293)
    public static final void method1578(class99[] arg0, class99[] arg1, class99[] arg2, class79[] arg3, class143 arg4, class99[] arg5, int arg6) {
        class39.field638 = arg5;
        class194.field3272 = arg1;
        class60.field935 = arg2;
        if (arg6 >= -11) {
            method1578((class99[]) null, (class99[]) null, (class99[]) null, (class79[]) null, (class143) null, (class99[]) null, 126);
        }
        class183.field3144 = arg3;
        field3623++;
        class74.field1172 = arg0;
        class54.field855 = arg4;
        class50.field800.method171(35);
        int var7 = class54.field855.method1136(class126.field2288, 63);
        int[] var8 = class54.field855.method1149(var7, (byte) 110);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class50.field800.method167(false, class153.method1193(new class94(class54.field855.method1128(var8[var9], 0, var7)), -127));
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V", line = 334)
    public static void method1579(boolean arg0) {
        field3619 = null;
        field3624 = null;
        field3616 = null;
        if (!arg0) {
            method1576(54, -7, (class47) null);
        }
        field3622 = null;
    }
}
