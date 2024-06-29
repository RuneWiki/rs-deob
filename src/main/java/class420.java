import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class420 {

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lha;")
    private class570 field5535;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Lne;")
    private class166 field5543;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[Lbda;")
    public static class750[] field5533 = new class750[2048];

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lrn;")
    public static class633 field5536 = new class633(75, 3);

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[Z")
    public static boolean[] field5545 = new boolean[5];

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method1037(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([ILjava/lang/String;[IBI[I[Lpu;I)V")
    private final void method2418(int[] arg0, String arg1, int[] arg2, byte arg3, int arg4, int[] arg5, class772[] arg6, int arg7) {
        int var9 = arg4 - this.field5543.field2209;
        field5529++;
        int var10 = -38 / ((arg3 - 21) / 58);
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg1.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class755.method4099(-256, arg1.charAt(var15)) & 0xFF);
            if (var16 == '<') {
                var11 = var15;
            } else {
                if (var16 == '>' && var11 != -1) {
                    String var17 = arg1.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var17.equals("lt")) {
                        var16 = '<';
                    } else if (var17.equals("gt")) {
                        var16 = '>';
                    } else if (var17.equals("nbsp")) {
                        var16 = ' ';
                    } else if (var17.equals("shy")) {
                        var16 = '\u00AD';
                    } else if (var17.equals("times")) {
                        var16 = '×';
                    } else if (var17.equals("euro")) {
                        var16 = '€';
                    } else if (var17.equals("copy")) {
                        var16 = '©';
                    } else {
                        if (!var17.equals("reg")) {
                            if (var17.startsWith("img=")) {
                                try {
                                    int var18;
                                    if (arg2 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg2[var13];
                                    }
                                    int var19;
                                    if (arg5 == null) {
                                        var19 = 0;
                                    } else {
                                        var19 = arg5[var13];
                                    }
                                    var13++;
                                    int var20 = class530.method2908((byte) -107, var17.substring(4));
                                    class772 var21 = arg6[var20];
                                    int var22 = arg0 == null ? var21.method628() : arg0[var20];
                                    var21.method616(arg7 + var18, -var22 + var19 + this.field5543.field2209 + var9, 1, 0, 1);
                                    var12 = -1;
                                    arg7 += arg6[var20].method623();
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method2424(var17, 7354);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg7 += this.field5543.method1051(var16, var12, (byte) -35);
                    }
                    int var23;
                    if (arg2 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg2[var13];
                    }
                    int var24;
                    if (arg5 == null) {
                        var24 = 0;
                    } else {
                        var24 = arg5[var13];
                    }
                    var13++;
                    if (var16 != ' ') {
                        if ((class261.field3497 & 0xFF000000) != 0) {
                            this.method1037(var16, arg7 + var23 + 1, var9 + var24 + 1, class261.field3497, true);
                        }
                        this.method1037(var16, arg7 + var23, var9 - -var24, class224.field3043, false);
                    } else if (class724.field9504 > 0) {
                        class9.field82 += class724.field9504;
                        arg7 += class9.field82 >> 8;
                        class9.field82 &= 0xFF;
                    }
                    int var25 = this.field5543.method1052(255, var16);
                    if (class526.field6681 != -1) {
                        this.field5535.method3076(var25, arg7, true, class526.field6681, (int) ((double) this.field5543.field2209 * 0.7D) + var9);
                    }
                    if (class353.field4309 != -1) {
                        this.field5535.method3076(var25, arg7, true, class353.field4309, this.field5543.field2209 + var9);
                    }
                    var12 = var16;
                    arg7 += var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public final void method2419(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field5539++;
        if (arg2 != null && arg3 < 0) {
            this.method2433(arg1, arg5, (byte) -78);
            this.method2423(0, arg2, 0, (byte) 100, arg4, null, null, arg0, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/util/Random;Ljava/lang/String;[II[Lpu;II)I")
    public final int method2420(int arg0, int arg1, int arg2, Random arg3, String arg4, int[] arg5, int arg6, class772[] arg7, int arg8, int arg9) {
        field5542++;
        if (arg4 == null) {
            return 0;
        }
        arg3.setSeed((long) arg2);
        int var11 = (arg3.nextInt() & 0x1F) + 192;
        this.method2433(var11 << 24 | arg8 & 0xFFFFFF, arg9 & 0xFFFFFF | var11 << 24, (byte) -119);
        int var12 = arg4.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        if (arg6 != 3) {
            this.field5543 = null;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg3.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2418(arg5, arg4, var13, (byte) -57, arg1, null, arg7, arg0);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lpu;IIIII[IILjava/util/Random;II[IIILjava/lang/String;)I")
    public final int method2421(class772[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, Random arg8, int arg9, int arg10, int[] arg11, int arg12, int arg13, String arg14) {
        field5525++;
        if (arg14 == null) {
            return 0;
        }
        arg8.setSeed((long) arg3);
        int var16 = (arg8.nextInt() & 0x1F) + 192;
        this.method2433(var16 << 24 | arg12 & 0xFFFFFF, arg7 & 0xFFFFFF | var16 << 24, (byte) -74);
        int var17 = arg14.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg8.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        if (arg4 != 2) {
            field5533 = null;
        }
        int var21 = arg9;
        int var22 = this.field5543.field2212 + arg10;
        int var23 = -1;
        if (arg13 == 1) {
            var22 += (arg1 - this.field5543.field2201 - this.field5543.field2212) / 2;
        } else if (arg13 == 2) {
            var22 = arg1 + arg10 - this.field5543.field2201;
        }
        if (arg2 == 1) {
            var23 = this.field5543.method1049(66, arg14) + var19;
            var21 = (arg5 - var23) / 2 + arg9;
        } else if (arg2 == 2) {
            var23 = this.field5543.method1049(86, arg14) + var19;
            var21 = arg5 + arg9 - var23;
        }
        this.method2418(arg6, arg14, var18, (byte) -63, var22, null, arg0, var21);
        if (arg11 != null) {
            if (var23 == -1) {
                var23 = this.field5543.method1049(arg4 ^ 0xFFFFFFE4, arg14) + var19;
            }
            arg11[0] = var21;
            arg11[3] = this.field5543.field2212 + this.field5543.field2201;
            arg11[1] = var22 - this.field5543.field2212;
            arg11[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IB)V")
    public final void method2422(int arg0, int arg1, int arg2, String arg3, int arg4, byte arg5) {
        field5541++;
        if (arg5 < 7) {
            this.method2424(null, 8);
        }
        if (arg3 != null) {
            this.method2433(arg4, arg0, (byte) -74);
            this.method2423(0, arg3, 0, (byte) 114, arg2 - this.field5543.method1049(87, arg3), null, null, arg1, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IBILaa;[Lpu;I[I)V")
    private final void method2423(int arg0, String arg1, int arg2, byte arg3, int arg4, class596 arg5, class772[] arg6, int arg7, int[] arg8) {
        int var10 = arg7 - this.field5543.field2209;
        field5532++;
        int var11 = 109 % (-arg3 / 53);
        int var12 = -1;
        int var13 = -1;
        int var14 = arg1.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class755.method4099(-256, arg1.charAt(var15)) & 0xFF);
            if (var16 == '<') {
                var12 = var15;
            } else {
                if (var16 == '>' && var12 != -1) {
                    String var17 = arg1.substring(var12 + 1, var15);
                    var12 = -1;
                    if (var17.equals("lt")) {
                        var16 = '<';
                    } else if (var17.equals("gt")) {
                        var16 = '>';
                    } else if (var17.equals("nbsp")) {
                        var16 = ' ';
                    } else if (var17.equals("shy")) {
                        var16 = '\u00AD';
                    } else if (var17.equals("times")) {
                        var16 = '×';
                    } else if (var17.equals("euro")) {
                        var16 = '€';
                    } else if (var17.equals("copy")) {
                        var16 = '©';
                    } else {
                        if (!var17.equals("reg")) {
                            if (var17.startsWith("img=")) {
                                try {
                                    int var18 = class530.method2908((byte) 58, var17.substring(4));
                                    class772 var19 = arg6[var18];
                                    int var20 = arg8 == null ? var19.method628() : arg8[var18];
                                    if ((class224.field3043 & 0xFF000000) == -16777216) {
                                        var19.method616(arg4, this.field5543.field2209 + var10 - var20, 1, 0, 1);
                                    } else {
                                        var19.method616(arg4, var10 + this.field5543.field2209 - var20, 0, class224.field3043 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var13 = -1;
                                    arg4 += arg6[var18].method623();
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method2424(var17, 7354);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var12 == -1) {
                    if (var13 != -1) {
                        arg4 += this.field5543.method1051(var16, var13, (byte) -125);
                    }
                    if (var16 == ' ') {
                        if (class724.field9504 > 0) {
                            class9.field82 += class724.field9504;
                            arg4 += class9.field82 >> 8;
                            class9.field82 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((class261.field3497 & 0xFF000000) != 0) {
                            this.method1037(var16, arg4 + 1, var10 + 1, class261.field3497, true);
                        }
                        this.method1037(var16, arg4, var10, class224.field3043, false);
                    } else {
                        if ((class261.field3497 & 0xFF000000) != 0) {
                            this.method1039(var16, arg4 + 1, var10 + 1, class261.field3497, true, arg5, arg2, arg0);
                        }
                        this.method1039(var16, arg4, var10, class224.field3043, false, arg5, arg2, arg0);
                    }
                    int var21 = this.field5543.method1052(255, var16);
                    if (class526.field6681 != -1) {
                        this.field5535.method3076(var21, arg4, true, class526.field6681, (int) ((double) this.field5543.field2209 * 0.7D) + var10);
                    }
                    if (class353.field4309 != -1) {
                        this.field5535.method3076(var21, arg4, true, class353.field4309, this.field5543.field2209 + var10 + 1);
                    }
                    arg4 += var21;
                    var13 = var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method2424(String arg0, int arg1) {
        try {
            if (arg1 != 7354) {
                return;
            }
            if (arg0.startsWith("col=")) {
                class224.field3043 = class224.field3043 & 0xFF000000 | class129.method763(16, arg1 - 7245, arg0.substring(4)) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class224.field3043 = class224.field3043 & 0xFF000000 | class44.field492 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class224.field3043 = class129.method763(16, 109, arg0.substring(5));
            } else if (arg0.equals("/argb")) {
                class224.field3043 = class44.field492;
            } else if (arg0.startsWith("str=")) {
                class526.field6681 = class224.field3043 & 0xFF000000 | class129.method763(16, 85, arg0.substring(4));
            } else if (arg0.equals("str")) {
                class526.field6681 = class224.field3043 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class526.field6681 = -1;
            } else if (arg0.startsWith("u=")) {
                class353.field4309 = class224.field3043 & 0xFF000000 | class129.method763(16, 100, arg0.substring(2));
            } else if (arg0.equals("u")) {
                class353.field4309 = class224.field3043 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class353.field4309 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class261.field3497 = 0;
            } else if (arg0.startsWith("shad=")) {
                class261.field3497 = class224.field3043 & 0xFF000000 | class129.method763(16, 100, arg0.substring(5));
            } else if (arg0.equals("shad")) {
                class261.field3497 = class224.field3043 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class261.field3497 = class148.field1889;
            } else if (arg0.equals("br")) {
                this.method2433(class44.field492, class148.field1889, (byte) -114);
            }
        } catch (Exception var3) {
        }
        field5534++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
    public final void method2425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field5531++;
        if (arg6 == null) {
            return;
        }
        this.method2433(arg0, arg2, (byte) -91);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        for (int var10 = arg5; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2418(null, arg6, null, (byte) 110, arg3, var9, null, arg4 - (this.field5543.method1049(99, arg6) / 2));
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILaa;IILjava/lang/String;II[Lpu;IIIIII[I)I")
    public final int method2426(byte arg0, int arg1, class596 arg2, int arg3, int arg4, String arg5, int arg6, int arg7, class772[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int[] arg15) {
        field5538++;
        if (arg0 >= -102) {
            this.method2430(null, -113, null, -37, 76, 94, 61, null);
        }
        return this.method2432(arg5, arg10, arg8, arg1, arg7, 0, (byte) -122, arg12, arg2, arg6, arg13, arg9, arg3, arg11, arg15, arg14, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method2427(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 105) {
            return;
        }
        field5546++;
        if (arg0 != null) {
            this.method2433(arg5, arg4, (byte) -102);
            this.method2423(0, arg0, 0, (byte) 111, arg3 - (this.field5543.method1049(115, arg0) / 2), null, null, arg1, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method2428(byte arg0) {
        field5533 = null;
        field5536 = null;
        int var1 = 62 / ((-arg0 - 25) / 40);
        field5545 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)Z")
    public static final boolean method2429(boolean arg0) {
        field5526++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class170.field2259.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class170.field2259.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class170.field2259.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class232.field3128.get(var9);
                        Class var11 = (Class) class170.field2259.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var13 < var12.size(); var13++) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, Integer.valueOf(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
                if (!arg0) {
                    method2429(false);
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class170.field2259 = var1;
        return class170.field2259.isEmpty();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I[Lpu;IIII[I)V")
    public final void method2430(String arg0, int arg1, class772[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field5528++;
        if (arg0 != null) {
            this.method2433(arg1, arg5, (byte) -99);
            this.method2423(0, arg0, arg4, (byte) 123, arg3, null, arg2, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
    public final void method2431(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field5537++;
        if (arg3 == null) {
            return;
        }
        this.method2433(arg7, arg0, (byte) -76);
        double var9 = 7.0D - (double) arg4 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        if (arg6 != 1) {
            this.field5543 = null;
        }
        int var11 = arg3.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg5));
        }
        this.method2418(null, arg3, null, (byte) 119, arg1, var12, null, arg2 - (this.field5543.method1049(-53, arg3) / 2));
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method1039(char arg0, int arg1, int arg2, int arg3, boolean arg4, class596 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I[Lpu;IIIBILaa;IIIII[III)I")
    public final int method2432(String arg0, int arg1, class772[] arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, class596 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14, int arg15, int arg16) {
        if (arg6 > -47) {
            return -110;
        }
        field5527++;
        if (arg0 == null) {
            return 0;
        }
        this.method2433(arg10, arg13, (byte) -115);
        if (arg7 == 0) {
            arg7 = this.field5543.field2209;
        }
        int[] var18;
        if (arg15 < (this.field5543.field2212 + this.field5543.field2201 + arg7) && arg15 < arg7 + arg7) {
            var18 = null;
        } else {
            var18 = new int[] { arg11 };
        }
        if (arg5 == -1) {
            arg5 = arg15 / arg7;
            if (arg5 <= 0) {
                arg5 = 1;
            }
        }
        int var19 = this.field5543.method1058(arg0, var18, class342.field4192, (byte) 125, arg2);
        if (arg5 > 0 && var19 >= arg5) {
            var19 = arg5;
            class342.field4192[arg5 - 1] = this.field5543.method1060(true, arg11, class342.field4192[arg5 - 1], arg2);
        }
        if (arg4 == 3 && var19 == 1) {
            arg4 = 1;
        }
        int var20;
        if (arg4 == 0) {
            var20 = this.field5543.field2212 + arg16;
        } else if (arg4 == 1) {
            var20 = (arg15 - ((var19 - 1) * arg7) - this.field5543.field2212 - this.field5543.field2201) / 2 + this.field5543.field2212 + arg16;
        } else if (arg4 == 2) {
            var20 = arg15 + arg16 - ((var19 - 1) * arg7) - this.field5543.field2201;
        } else {
            int var21 = (arg15 - this.field5543.field2212 - ((var19 + -1) * arg7) - this.field5543.field2201) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg7 += var21;
            var20 = this.field5543.field2212 + arg16 + var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg3 == 0) {
                this.method2423(arg1, class342.field4192[var22], arg9, (byte) 103, arg12, arg8, arg2, var20, arg14);
            } else if (arg3 == 1) {
                this.method2423(arg1, class342.field4192[var22], arg9, (byte) 94, (arg11 - this.field5543.method1049(100, class342.field4192[var22])) / 2 + arg12, arg8, arg2, var20, arg14);
            } else if (arg3 == 2) {
                this.method2423(arg1, class342.field4192[var22], arg9, (byte) -110, arg12 + arg11 - this.field5543.method1049(121, class342.field4192[var22]), arg8, arg2, var20, arg14);
            } else if (var19 - 1 == var22) {
                this.method2423(arg1, class342.field4192[var22], arg9, (byte) -65, arg12, arg8, arg2, var20, arg14);
            } else {
                this.method2435(arg11, true, class342.field4192[var22]);
                this.method2423(arg1, class342.field4192[var22], arg9, (byte) 75, arg12, arg8, arg2, var20, arg14);
                class724.field9504 = 0;
            }
            var20 += arg7;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
    private final void method2433(int arg0, int arg1, byte arg2) {
        field5530++;
        class9.field82 = 0;
        class44.field492 = arg0;
        class224.field3043 = arg0;
        class353.field4309 = -1;
        class526.field6681 = -1;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class724.field9504 = 0;
        if (arg2 <= -71) {
            class148.field1889 = arg1;
            class261.field3497 = arg1;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method2434(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field5544++;
        if (arg3 == null || arg1 != 5) {
            return;
        }
        this.method2433(arg6, arg5, (byte) -118);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2418(null, arg3, var9, (byte) -85, arg4, var10, null, arg2 - (this.field5543.method1049(-120, arg3) / 2));
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLjava/lang/String;)V")
    private final void method2435(int arg0, boolean arg1, String arg2) {
        field5540++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg2.length(); var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (!arg1) {
            this.field5543 = null;
        }
        if (var4 > 0) {
            class724.field9504 = (arg0 - this.field5543.method1049(101, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lne;)V")
    public class420(class570 arg0, class166 arg1) {
        this.field5535 = arg0;
        this.field5543 = arg1;
    }
}
