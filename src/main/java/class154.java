import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class154 {

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field2331 = -1;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "[I")
    public static int[] field2337 = new int[32];

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public static int field2341 = 0;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field2338 = 0;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "Lfr;")
    public static class497 field2334 = new class497();

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "Lok;")
    public static class74 field2333;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lp", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field2343;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1113(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 5)
    public static void method1106(int arg0) {
        field2337 = null;
        field2333 = null;
        if (arg0 > 73) {
            field2334 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIIZI)V", line = 21)
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field2335++;
        if (arg6) {
            method1108(-70, -1.1418742F, -125, -122, null, -74, (byte) 45, 2.395278F, null, -0.31966832F, -24, 2.2176235F, 90, -1.7731835F);
        }
        if (arg2 < 0 || arg7 < 0 || arg2 >= class50.field640 - 1 || (class448.field6611 - 1) <= arg7) {
            return;
        }
        if (class236.field3305 == null) {
            return;
        }
        if (arg4 == 0) {
            class401 var8 = (class401) class222.method1406(arg1, arg2, arg7);
            class401 var9 = (class401) class389.method2335(arg1, arg2, arg7);
            if (var8 != null && arg3 != 2) {
                if (var8 instanceof class407) {
                    ((class407) var8).field6142.method2156(2732, arg0);
                } else {
                    class233.method1443(var8.method240(-15578), arg7, arg1, arg0, arg5, arg3, arg4, 0, arg2);
                }
            }
            if (var9 != null) {
                if (var9 instanceof class407) {
                    ((class407) var9).field6142.method2156(2732, arg0);
                    return;
                }
                class233.method1443(var9.method240(-15578), arg7, arg1, arg0, arg5, arg3, arg4, 0, arg2);
                return;
            }
            return;
        }
        if (arg4 == 1) {
            class401 var10 = (class401) class118.method886(arg1, arg2, arg7);
            if (var10 != null) {
                if (!(var10 instanceof class125)) {
                    int var11 = var10.method240(-15578);
                    if (arg3 != 4 && arg3 != 5) {
                        if (arg3 == 6) {
                            class233.method1443(var11, arg7, arg1, arg0, arg5 + 4, 4, arg4, 0, arg2);
                            return;
                        }
                        if (arg3 == 7) {
                            class233.method1443(var11, arg7, arg1, arg0, (arg5 + 2 & 0x3) + 4, 4, arg4, 0, arg2);
                        } else if (arg3 == 8) {
                            class233.method1443(var11, arg7, arg1, arg0, arg5 + 4, 4, arg4, 0, arg2);
                            class233.method1443(var11, arg7, arg1, arg0, (arg5 + 2 & 0x3) + 4, 4, arg4, 0, arg2);
                            return;
                        }
                        return;
                    }
                    class233.method1443(var11, arg7, arg1, arg0, arg5, 4, arg4, 0, arg2);
                    return;
                }
                ((class125) var10).field1885.method2156(2732, arg0);
                return;
            }
            return;
        }
        if (arg4 != 2) {
            if (arg4 == 3) {
                class401 var12 = (class401) class341.method2081(arg1, arg2, arg7);
                if (var12 != null) {
                    if (var12 instanceof class515) {
                        ((class515) var12).field7566.method2156(2732, arg0);
                        return;
                    }
                    class233.method1443(var12.method240(-15578), arg7, arg1, arg0, arg5, arg3, arg4, 0, arg2);
                    return;
                }
            }
            return;
        }
        class401 var13 = (class401) class534.method3160(arg1, arg2, arg7, field2343 == null ? (field2343 = method1113("gf")) : field2343);
        if (var13 == null) {
            return;
        }
        if (arg3 == 11) {
            arg3 = 10;
        }
        if (!(var13 instanceof class338)) {
            class233.method1443(var13.method240(-15578), arg7, arg1, arg0, arg5, arg3, arg4, 0, arg2);
            return;
        }
        ((class338) var13).field5223.method2156(2732, arg0);
        return;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IFIILsh;IBF[BFIFIF)V", line = 144)
    public static final void method1108(int arg0, float arg1, int arg2, int arg3, class510 arg4, int arg5, byte arg6, float arg7, byte[] arg8, float arg9, int arg10, float arg11, int arg12, float arg13) {
        field2340++;
        int var14 = arg5 * arg12;
        if (arg6 != 110) {
            method1109(43);
        }
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg3; var16++) {
            arg4.method16(arg11 * 127.0F, (byte) -58, var15, arg0, arg13 / (float) arg5, arg1 / (float) arg12, arg5, 0, arg9 / (float) arg0, arg12, arg2);
            int var19 = arg10;
            arg9 *= 2.0F;
            arg11 = arg7 * arg11;
            for (int var20 = 0; var20 < var14; var20++) {
                arg8[var19] = (byte) ((int) ((float) arg8[var19] + var15[var20]));
                var19++;
            }
            arg1 *= 2.0F;
            arg13 *= 2.0F;
        }
        int var17 = arg10;
        for (int var18 = 0; var18 < var14; var18++) {
            arg8[var17] -= -127;
            var17++;
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V", line = 197)
    public static final void method1109(int arg0) {
        field2330++;
        class59.field813.method3141(5, false);
        class293.field4386.method2004((byte) -109, 5);
        class239.field3348.method427(5, -1);
        class119.field1824.method247(-95, 5);
        class373.field5641.method769(5, false);
        class164.field2437.method1756(5, (byte) -127);
        class510.field7490.method570(5, 126);
        class443.field6509.method2024(false, 5);
        class41.field539.method2513(64, 5);
        class233.field3279.method216((byte) 123, 5);
        class159.field2391.method378((byte) -9, 5);
        class36.field497.method700((byte) 97, 5);
        class274.field4086.method338(-2, 5);
        class260.field3873.method2675(false, 5);
        class526.field7776.method2479(5, (byte) -97);
        class69.field925.method1806(5, true);
        class119.field1821.method2880(5, (byte) -82);
        if (arg0 >= -96) {
            return;
        }
        class25.field372.method1413(20444, 5);
        class312.field4844.method1064(5, false);
        class152.field2317.method1456(5, (byte) -109);
        class507.method2996(5, (byte) 97);
        class399.method2409((byte) 2, 50);
        class141.method1026(true, 5);
        class488.method2916(5, (byte) 120);
        class125.field1877.method2294(5, true);
        class32.field451.method2294(5, true);
        class145.field2185.method2294(5, true);
        class309.field4635.method2294(5, true);
        class64.field868.method2294(5, true);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZF)F", line = 241)
    public static final float method1110(boolean arg0, float arg1) {
        field2332++;
        if (!arg0) {
            method1109(20);
        }
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V", line = 252)
    public static final void method1111(int arg0) {
        field2339++;
        int var1 = arg0;
        for (int var2 = 0; var2 < class50.field640; var2++) {
            for (int var3 = 0; var3 < class448.field6611; var3++) {
                if (class350.method2115(var3, var1, true, (byte) 85, class236.field3305, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILjava/lang/String;Lvd;)Lrv;", line = 283)
    public static final class224 method1112(int arg0, int arg1, String arg2, class258 arg3) {
        field2336++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class269.field4004, 0);
        if (class269.field4004[0] == 0) {
            if (class269.field4004[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class269.field4004, 1);
            if (class269.field4004[1] > 1) {
                byte[] var6 = new byte[class269.field4004[1]];
                OpenGL.glGetInfoLogARB(var4, class269.field4004[1], class269.field4004, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class269.field4004[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        if (arg0 != 1) {
            method1107(-59, -116, 38, 0, -83, -92, true, -27);
        }
        return new class224(arg3, var4, arg1);
    }
}
