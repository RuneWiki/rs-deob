import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class110 extends class657 {

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "Z")
    private boolean field1277 = false;

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "Lbia;")
    private class524 field1280;

    @OriginalMember(owner = "client!eda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1285 = new String[] { method967(method966("S.\u0015:\u0005\u001e")), method967(method966("S.\u0015:\u000e\u001e")), method967(method966("S.\u0015:\u000f\u001e")), method967(method966("[+\fY#[%\u0006m")), method967(method966("\\+\u0002uhZ+\u001ashd?\u001a`/[/")), method967(method966("S.\u0015:\u0003\u001e")), method967(method966("S.\u0015:\u0001\u001e")), method967(method966("S.\u0015:\u0007\u001e")), method967(method966("S.\u0015:\u0000\u001e")), method967(method966("X?\u0018x")), method967(method966("MdZ:;")), method967(method966("S.\u0015:z_$\u001d`x\u001e")), method967(method966("S.\u0015:\u0002\u001e")), method967(method966("S.\u0015:\u0004\u001e")) };

    @OriginalMember(owner = "client!eda", name = "s", descriptor = "Lsi;")
    public static class585 field1276 = class487.method3699((byte) 123);

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!eda", name = "t", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!eda", name = "u", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
    public static int field1282;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eda", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field1284;

    @OriginalMember(owner = "client!eda", name = "v", descriptor = "[Lfs;")
    public static class581[] field1283;

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lffa;)V")
    public class110(class197 arg0) {
        super(arg0);
        try {
            if (arg0.field2962) {
                this.field1280 = new class524(arg0, 2);
                this.field1280.method3972(0, (byte) -101);
                super.field9490.method1716(33984, 1);
                super.field9490.method1684((byte) -61, 7681, 34165);
                super.field9490.method1739(34168, 2, (byte) 19, 770);
                super.field9490.method1683(770, 32888, 34167, 0);
                OpenGL.glTexGeni(8192, 9472, 34066);
                OpenGL.glTexGeni(8193, 9472, 34066);
                OpenGL.glTexGeni(8194, 9472, 34066);
                OpenGL.glEnable(3168);
                OpenGL.glEnable(3169);
                OpenGL.glEnable(3170);
                super.field9490.method1716(33984, 0);
                this.field1280.method3973(126);
                this.field1280.method3972(1, (byte) -107);
                super.field9490.method1716(33984, 1);
                super.field9490.method1684((byte) -61, 8448, 8448);
                super.field9490.method1739(34166, 2, (byte) 19, 770);
                super.field9490.method1683(770, 32888, 5890, 0);
                OpenGL.glDisable(3168);
                OpenGL.glDisable(3169);
                OpenGL.glDisable(3170);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                super.field9490.method1716(33984, 0);
                this.field1280.method3973(127);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1285[11] + (arg0 != null ? field1285[10] : field1285[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IBLmw;)V")
    public final void method4(int arg0, byte arg1, class517 arg2) {
        try {
            super.field9490.method1733(arg2, 17237);
            ++field1278;
            if (arg1 < 117) {
                this.field1280 = null;
            }
            super.field9490.method1753(0, arg0);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1285[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1285[10] : field1285[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)V")
    public static final void method962(boolean arg0) {
        try {
            if (arg0) {
                method963(18);
            }
            if (class571.field8454 >= 0) {
                long var1 = class430.method3299(77);
                class571.field8454 = (int) ((long) class571.field8454 - (-class254.field3942 + var1));
                if (~class571.field8454 >= -1) {
                    class287.field4272 = class398.field5950.field5272;
                    class134.field1561 = class398.field5950.field5258;
                    class391.field5887 = class398.field5950.field5273;
                    class248.field3869 = class398.field5950.field5262;
                    class571.field8454 = -1;
                    class616.field9054 = class398.field5950.field5268;
                    class326.field5132 = class398.field5950.field5263;
                    class424.field6247 = class398.field5950.field5266;
                    class239.field3623 = class398.field5950.field5257;
                    class331.field5197 = class398.field5950.field5260;
                    class756.field10987 = class398.field5950.field5256;
                } else {
                    int var3 = (class571.field8454 << 8) / class534.field7821;
                    int var4 = -var3 + 255;
                    float var5 = (float) var3 / 255.0F;
                    float var6 = 1.0F - var5;
                    class424.field6247 = ((65280 & class582.field8605) * var3 + (65280 & class398.field5950.field5266) * var4 & 16711680) + (-16711936 & (class582.field8605 & 16711935) * var3 + (16711935 & class398.field5950.field5266) * var4) >>> 8;
                    class134.field1561 = ((65280 & class580.field8603) * var3 + (65280 & class398.field5950.field5258) * var4 & 16711680) + (-16711936 & (16711935 & class580.field8603) * var3 + (class398.field5950.field5258 & 16711935) * var4) >>> 8;
                    class331.field5197 = (class398.field5950.field5260 - class143.field1721) * var6 + class143.field1721;
                    class616.field9054 = class653.field9443 * var3 + class398.field5950.field5268 * var4 >> 8;
                    class756.field10987 = (-class625.field9147 + class398.field5950.field5256) * var6 + class625.field9147;
                    class239.field3623 = (-class279.field4193 + class398.field5950.field5257) * var6 + class279.field4193;
                    class326.field5132 = (-class627.field9186 + class398.field5950.field5263) * var6 + class627.field9186;
                    class391.field5887 = (class398.field5950.field5273 - class81.field916) * var6 + class81.field916;
                    class287.field4272 = (class398.field5950.field5272 - class425.field6265) * var6 + class425.field6265;
                    if (class342.field5315 != class398.field5950.field5262) {
                        class248.field3869 = class198.field3097.method485(class342.field5315, class398.field5950.field5262, var6, class248.field3869);
                    }
                }
                class254.field3942 = var1;
            }
            ++field1275;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1285[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)V")
    public static final void method963(int arg0) {
        try {
            if (arg0 == 0) {
                if (!class580.field8601.field395) {
                    try {
                        Method var1 = (field1284 != null ? field1284 : (field1284 = method965(field1285[4]))).getMethod(field1285[3]);
                        if (var1 != null) {
                            try {
                                Runtime var2 = Runtime.getRuntime();
                                Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                                class568.field8403 = (int) (var3 / 1048576L) + 1;
                            } catch (Throwable var5) {
                            }
                        }
                    } catch (Exception var6) {
                    }
                } else {
                    class568.field8403 = 96;
                }
                ++field1274;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1285[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BZ)V")
    public final void method6(byte arg0, boolean arg1) {
        try {
            super.field9490.method1684((byte) -61, 7681, 8448);
            if (arg0 == 38) {
                ++field1272;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1285[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZI)V")
    public final void method3(boolean arg0, int arg1) {
        try {
            if (arg1 != 1) {
                method963(-21);
            }
            ++field1279;
            class532 var3 = super.field9490.method1703(72);
            if (this.field1280 != null && var3 != null && arg0) {
                this.field1280.method3971(0, '\u0000');
                super.field9490.method1716(33984, 1);
                super.field9490.method1733(var3, 17237);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field9490.field2885.method5541(94), 0);
                OpenGL.glMatrixMode(5888);
                super.field9490.method1716(33984, 0);
                this.field1277 = true;
            } else {
                super.field9490.method1683(770, 32888, 34168, 0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1285[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "(I)V")
    public static void method964(int arg0) {
        try {
            field1283 = null;
            field1276 = null;
            if (arg0 != 8448) {
                method964(-115);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1285[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        try {
            int var2 = 24 / ((arg0 - -17) / 42);
            ++field1282;
            return true;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1285[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIZ)V")
    public final void method7(int arg0, int arg1, boolean arg2) {
        try {
            ++field1273;
            if (!arg2) {
                method964(5);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1285[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)V")
    public final void method1(int arg0) {
        try {
            ++field1281;
            if (arg0 == 0) {
                if (!this.field1277) {
                    super.field9490.method1683(770, arg0 + 32888, 5890, 0);
                } else {
                    this.field1280.method3971(0, '\u0001');
                    super.field9490.method1716(33984, 1);
                    super.field9490.method1733((class517) null, 17237);
                    super.field9490.method1716(33984, 0);
                }
                super.field9490.method1684((byte) -61, 8448, 8448);
                this.field1277 = false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1285[8] + arg0 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method965(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!eda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method966(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method967(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
