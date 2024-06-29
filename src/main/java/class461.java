import jaggl.OpenGL;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class461 extends class193 {

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Z")
    private boolean field6593 = false;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Lbu;")
    private class17 field6587;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field6586 = -50;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "[I")
    public static int[] field6596 = new int[14];

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "F")
    public static float field6598 = 0.0F;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "[I")
    public static int[] field6590 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V", line = 8)
    public static void method2716(int arg0) {
        if (arg0 != 5890) {
            field6590 = null;
        }
        field6596 = null;
        field6590 = null;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(ZZ)V", line = 19)
    public final void method95(boolean arg0, boolean arg1) {
        super.field2498.method2271(-125, 8448, 7681);
        ++field6599;
        if (!arg1) {
            method2718(49, -74, -94, -123, 52, 89, -66);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 30)
    public final void method92(byte arg0) {
        if (!this.field6593) {
            super.field2498.method2289(770, 60, 0, 5890);
        } else {
            this.field6587.method149('\u0001', 4864);
            super.field2498.method2321(1, 25322);
            super.field2498.method2322((class119) null, 14);
            super.field2498.method2321(0, 25322);
        }
        if (arg0 <= -56) {
            ++field6594;
            super.field2498.method2271(54, 8448, 8448);
            this.field6593 = false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lsq;II)V", line = 53)
    public final void method97(class119 arg0, int arg1, int arg2) {
        ++field6597;
        if (arg2 != 36) {
            this.method97((class119) null, 111, 20);
        }
        super.field2498.method2322(arg0, 14);
        super.field2498.method2305(7681, arg1);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZZ)V", line = 65)
    public final void method94(boolean arg0, boolean arg1) {
        ++field6595;
        if (!arg0) {
            this.method95(true, false);
        }
        class288 var3 = super.field2498.method2285((byte) 69);
        if (this.field6587 != null && var3 != null && arg1) {
            this.field6587.method149('\u0000', 4864);
            super.field2498.method2321(1, 25322);
            super.field2498.method2322(var3, 14);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2498.field5589.method1423(-26552), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field2498.method2321(0, 25322);
            this.field6593 = true;
        } else {
            super.field2498.method2289(770, 23, 0, 34168);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 93)
    public static final String method2717(long arg0, byte arg1) {
        class310.field3972.setTime(new Date(arg0));
        ++field6601;
        int var3 = class310.field3972.get(7);
        int var4 = class310.field3972.get(5);
        if (arg1 <= 18) {
            field6586 = -63;
        }
        int var5 = class310.field3972.get(2);
        int var6 = class310.field3972.get(1);
        int var7 = class310.field3972.get(11);
        int var8 = class310.field3972.get(12);
        int var9 = class310.field3972.get(13);
        return class283.field3605[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class431.field6120[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIII)I", line = 123)
    public static final int method2718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((1 & arg0) == 1) {
            int var7 = arg3;
            arg3 = arg4;
            arg4 = var7;
        }
        ++field6592;
        int var8 = arg5 & 3;
        if (var8 == 0) {
            return arg1;
        } else if (~var8 == -2) {
            return arg2;
        } else {
            return arg6 == var8 ? -arg3 - -1 + -arg1 + 7 : -arg2 + 7 + -arg4 - -1;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lug;)V", line = 151)
    public class461(class395 arg0) {
        super(arg0);
        if (arg0.field5622) {
            this.field6587 = new class17(arg0, 2);
            this.field6587.method152((byte) 63, 0);
            super.field2498.method2321(1, 25322);
            super.field2498.method2271(91, 34165, 7681);
            super.field2498.method2338(34168, 2, false, 770);
            super.field2498.method2289(770, 82, 0, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field2498.method2321(0, 25322);
            this.field6587.method150((byte) 99);
            this.field6587.method152((byte) 63, 1);
            super.field2498.method2321(1, 25322);
            super.field2498.method2271(-14, 8448, 8448);
            super.field2498.method2338(34166, 2, false, 770);
            super.field2498.method2289(770, -112, 0, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field2498.method2321(0, 25322);
            this.field6587.method150((byte) 116);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 190)
    public static final void method2719(Throwable arg0, String arg1, int arg2) {
        ++field6602;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class148.method981(5, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class242.method1476(114, var3);
            String var4 = class324.method1897(":", (byte) -59, "%3a", var3);
            String var5 = class324.method1897("@", (byte) -107, "%40", var4);
            String var6 = class324.method1897("&", (byte) -64, "%26", var5);
            String var7 = class324.method1897("#", (byte) -52, "%23", var6);
            if (class123.field1651.field6891 != null) {
                class121 var8 = class123.field1651.method2874(-86, new URL(class123.field1651.field6891.getCodeBase(), "clienterror.ws?c=" + class407.field5823 + "&u=" + class277.field3509 + "&v1=" + class476.field6887 + "&v2=" + class476.field6899 + "&e=" + var7));
                while (~var8.field1628 == -1) {
                    class199.method1251(1L, (byte) 100);
                }
                if (var8.field1628 == arg2) {
                    DataInputStream var9 = (DataInputStream) var8.field1627;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIZ)V", line = 240)
    public final void method99(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field6591;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILtf;)V", line = 254)
    public static final void method2720(int arg0, int arg1, class194 arg2) {
        if (arg0 != -19) {
            field6590 = null;
        }
        ++field6589;
        while (true) {
            class345 var3 = (class345) class250.field3196.method153(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; ~var5 > ~var3.field4427; ++var5) {
                if (var3.field4423[var5] != null) {
                    if (var3.field4423[var5].field1628 == 2) {
                        var3.field4424[var5] = -5;
                    }
                    if (~var3.field4423[var5].field1628 == -1) {
                        var4 = true;
                    }
                }
                if (var3.field4430[var5] != null) {
                    if (~var3.field4430[var5].field1628 == -3) {
                        var3.field4424[var5] = -6;
                    }
                    if (~var3.field4430[var5].field1628 == -1) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method1206(arg0 + 19, arg1);
            arg2.method2729(0, false);
            int var6 = arg2.field6631;
            arg2.method2777(var3.field4432, -11);
            for (int var7 = 0; ~var3.field4427 < ~var7; ++var7) {
                if (var3.field4424[var7] != 0) {
                    arg2.method2729(var3.field4424[var7], false);
                } else {
                    try {
                        int var8 = var3.field4433[var7];
                        if (var8 != 0) {
                            if (~var8 == -2) {
                                Field var9 = (Field) var3.field4423[var7].field1627;
                                var9.setInt((Object) null, var3.field4428[var7]);
                                arg2.method2729(0, false);
                            } else if (var8 == 2) {
                                Field var10 = (Field) var3.field4423[var7].field1627;
                                int var11 = var10.getModifiers();
                                arg2.method2729(0, false);
                                arg2.method2777(var11, -11);
                            }
                        } else {
                            Field var12 = (Field) var3.field4423[var7].field1627;
                            int var13 = var12.getInt((Object) null);
                            arg2.method2729(0, false);
                            arg2.method2777(var13, arg0 ^ 24);
                        }
                        if (var8 != 3) {
                            if (~var8 == -5) {
                                Method var20 = (Method) var3.field4430[var7].field1627;
                                int var21 = var20.getModifiers();
                                arg2.method2729(0, false);
                                arg2.method2777(var21, -11);
                            }
                        } else {
                            Method var14 = (Method) var3.field4430[var7].field1627;
                            byte[][] var15 = var3.field4431[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; ~var17 > ~var15.length; ++var17) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method2729(0, false);
                            } else if (!(var19 instanceof Number)) {
                                if (var19 instanceof String) {
                                    arg2.method2729(2, false);
                                    arg2.method2769((String) var19, true);
                                } else {
                                    arg2.method2729(4, false);
                                }
                            } else {
                                arg2.method2729(1, false);
                                arg2.method2760(((Number) var19).longValue(), 113);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method2729(-10, false);
                    } catch (InvalidClassException var23) {
                        arg2.method2729(-11, false);
                    } catch (StreamCorruptedException var24) {
                        arg2.method2729(-12, false);
                    } catch (OptionalDataException var25) {
                        arg2.method2729(-13, false);
                    } catch (IllegalAccessException var26) {
                        arg2.method2729(-14, false);
                    } catch (IllegalArgumentException var27) {
                        arg2.method2729(-15, false);
                    } catch (InvocationTargetException var28) {
                        arg2.method2729(-16, false);
                    } catch (SecurityException var29) {
                        arg2.method2729(-17, false);
                    } catch (IOException var30) {
                        arg2.method2729(-18, false);
                    } catch (NullPointerException var31) {
                        arg2.method2729(-19, false);
                    } catch (Exception var32) {
                        arg2.method2729(-20, false);
                    } catch (Throwable var33) {
                        arg2.method2729(-21, false);
                    }
                }
            }
            arg2.method2736(-96, var6);
            arg2.method2755(-var6 + arg2.field6631, (byte) -76);
            var3.method2165(16225);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BZ)V", line = 445)
    public static final void method2721(byte arg0, boolean arg1) {
        ++field6600;
        if (class64.field835 != null) {
            class64.field835.method2473(10228);
            class64.field835 = null;
        }
        class495.field7198 = 0;
        class124.method876((byte) 107);
        class194.method1203();
        for (int var2 = 0; var2 < 4; ++var2) {
            class172.field2185[var2].method2004(-1);
        }
        class280.method1663(false, 1475);
        System.gc();
        class348.method1991(2, (byte) -99);
        class45.field538 = false;
        class387.field5085 = -1;
        class452.method2697(true, true);
        class169.field2170 = 0;
        class320.field4064 = 0;
        class441.field6317 = 0;
        class387.field5108 = 0;
        class75.field963 = 0;
        if (arg0 != -76) {
            field6596 = null;
        }
        for (int var3 = 0; ~class147.field1869.length < ~var3; ++var3) {
            class147.field1869[var3] = null;
        }
        class85.method687((byte) -63);
        for (int var4 = 0; ~var4 > -2049; ++var4) {
            class387.field5107[var4] = null;
        }
        class489.field7114 = 0;
        for (int var5 = 0; var5 < 32768; ++var5) {
            class187.field2446[var5] = null;
        }
        class201.field2614.method2024(false);
        class349.method2007(1);
        class296.field3802 = 0;
        class491.field7160.method2802((byte) 122);
        class62.method571(arg0 ^ -2737);
        class265.method1579((byte) -115);
        class469.field6813 = 0L;
        class404.field5755 = null;
        if (!arg1) {
            class284.method1677(-20429, 2);
            try {
                class114.method825("loggedout", 13324, class219.field2794.field6891);
            } catch (Throwable var6) {
            }
        } else {
            class284.method1677(arg0 ^ 20359, 11);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Z", line = 526)
    public final boolean method93(boolean arg0) {
        if (arg0) {
            method2721((byte) 79, false);
        }
        ++field6588;
        return true;
    }
}
