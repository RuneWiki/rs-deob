import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class class222 extends class444 {

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public int field3101;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lof;")
    public static class446 field3096 = new class446("M", "M", "M", "M");

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "[I")
    public static int[] field3104 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Lof;")
    public static class446 field3103 = new class446("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Z")
    public static boolean field3108 = false;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1494(int arg0, String arg1) {
        field3100++;
        if (arg0 != 64512) {
            method1502(null, null, 56, (byte) 117);
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 <= '߿') {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (arg0 == 0) {
            field3107++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1495(int arg0, byte arg1, int arg2) {
        if (arg1 != 118) {
            method1495(55, (byte) 82, -27);
        }
        field3097++;
        return class539.method3181(arg0, arg2, true) & class361.method2306(-23496, arg0, arg2);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lou;I)V")
    public static final void method1496(class437 arg0, int arg1) {
        arg0.field6610 = null;
        field3099++;
        int var2 = arg0.field6608.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field6608[var3].field4424 = false;
        }
        class507[] var4 = class176.field2356;
        synchronized (class176.field2356) {
            if (var2 < class176.field2356.length && class471.field7020[var2] < 200) {
                class176.field2356[var2].method3045(arg0, 78);
                int var10002 = class471.field7020[var2]++;
            }
            if (arg1 != 14628) {
                method1502(null, null, 37, (byte) -103);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)I")
    public abstract int method1497(int arg0);

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(Z)Lnv;")
    public static final class292 method1498(boolean arg0) {
        field3098++;
        try {
            return arg0 ? null : (class292) Class.forName("tf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILa;IIILqa;Z)V")
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        field3088++;
        if (arg2 < -4) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static final void method1499(byte arg0) {
        if (arg0 > -90) {
            method1496(null, 10);
        }
        class194.field2585.method2127((byte) 8);
        field3106++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIILqa;BLvr;IIIIIILka;)Lka;")
    public static final class334 method1500(int arg0, int arg1, int arg2, int arg3, int arg4, class165 arg5, byte arg6, class91 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class334 arg14) {
        field3092++;
        if (arg14 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg7 != null) {
            int var16 = var15 | arg7.method618(-1, false, arg1, (byte) 86);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg2 << 48) + ((long) arg4 << 32) + (long) ((arg9 << 16) + (arg10 << 24) + arg13);
        class330 var19 = class160.field2086;
        class334 var20;
        synchronized (class160.field2086) {
            var20 = (class334) class160.field2086.method2133(var17, (byte) 47);
        }
        if (var20 == null || arg5.method775(var20.method46(), var15) != 0) {
            if (var20 != null) {
                var15 = arg5.method781(var15, var20.method46());
            }
            byte var21;
            if (arg13 == 1) {
                var21 = 9;
            } else if (arg13 == 2) {
                var21 = 12;
            } else if (arg13 == 3) {
                var21 = 15;
            } else if (arg13 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class387 var24 = new class387(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
            int var25 = var24.method2428(0, 1724, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class428.field6502[var31] * var28 >> 15;
                    int var33 = class428.field6501[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method2428(var32, 1724, var33, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg9 * var36 + arg10 * var35 >> 8);
                short var38 = (short) (((arg2 & 0x7F) * var35 + (arg4 & 0x7F) * var36 & 0x7F00) + ((arg2 & 0x380) * var35 + (arg4 & 0x380) * var36 & 0x38000) + ((arg2 & 0xFC00) * var35 + (arg4 & 0xFC00) * var36 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method2426((byte) -1, var26[0][var39], var25, var37, var38, (short) -1, -14094, (byte) 1, var26[0][(var39 + 1) % var21]);
                    } else {
                        var24.method2426((byte) -1, var26[var34][(var39 + 1) % var21], var26[var34 - 1][var39], var37, var38, (short) -1, -14094, (byte) 1, var26[var34 - 1][(var39 + 1) % var21]);
                        var24.method2426((byte) -1, var26[var34][var39], var26[var34 - 1][var39], var37, var38, (short) -1, -14094, (byte) 1, var26[var34][(var39 + 1) % var21]);
                    }
                }
            }
            var20 = arg5.method833(var24, var15, class128.field1731, 64, 768);
            class330 var40 = class160.field2086;
            synchronized (class160.field2086) {
                class160.field2086.method2131(var20, var17, false);
            }
        }
        int var41 = (arg13 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg12 != 0) {
            if ((arg12 & 0x4) != 0) {
                var44 = var41 + 128;
            }
            if ((arg12 & 0x8) != 0) {
                var42 -= 128;
            }
            if ((arg12 & 0x2) != 0) {
                var43 -= 128;
            }
            if ((arg12 & 0x1) != 0) {
                var45 = var41 + 128;
            }
        }
        int var46 = arg14.method58();
        int var47 = arg14.method45();
        int var48 = arg14.method81();
        if (arg6 != -62) {
            method1496(null, 78);
        }
        if (var43 > var48) {
            var48 = var43;
        }
        if (var47 > var44) {
            var47 = var44;
        }
        int var49 = arg14.method38();
        if (var46 < var42) {
            var46 = var42;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class425 var50 = null;
        if (arg7 != null) {
            int var51 = arg7.field1315[arg1];
            var50 = class201.field2707.method485(var51 >> 16, arg6 ^ 0xFFFFFFC7);
            arg1 = var51 & 0xFFFF;
        }
        class334 var52;
        if (var50 == null) {
            var52 = var20.method47((byte) 3, var15, true);
            var52.method90(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method66(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method47((byte) 3, var15, true);
            var52.method90(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method66(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method2155(arg1, arg6 + 62, var50);
        }
        if (arg11 != 0) {
            var52.method63(arg11);
        }
        if (arg8 != 0) {
            var52.method36(arg8);
        }
        if (arg3 != 0) {
            var52.method66(0, arg3, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)Z")
    public final boolean method176(boolean arg0) {
        if (!arg0) {
            this.method176(true);
        }
        field3102++;
        return false;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(Z)V")
    public static void method1501(boolean arg0) {
        field3104 = null;
        field3096 = null;
        field3103 = null;
        if (!arg0) {
            field3108 = true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;Lnq;IB)Lpb;")
    public static final class473 method1502(String arg0, class325 arg1, int arg2, byte arg3) {
        field3094++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class400.field6082, 0);
        if (class400.field6082[0] == 0) {
            if (class400.field6082[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class400.field6082, 1);
            if (class400.field6082[1] > 1) {
                byte[] var6 = new byte[class400.field6082[1]];
                OpenGL.glGetInfoLogARB(var4, class400.field6082[1], class400.field6082, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class400.field6082[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        int var7 = -33 / ((arg3 + 24) / 61);
        return new class473(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIII)V")
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3091 = arg2;
        this.field3093 = arg3;
        this.field3095 = arg1;
        this.field3101 = arg4;
        this.field3090 = arg6;
        this.field3105 = arg5;
        this.field3087 = arg0;
    }
}
