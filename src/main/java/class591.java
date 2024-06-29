import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class591 extends class335 {

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    private int field8145 = 4096;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    private int field8143 = 0;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "[I")
    public static int[] field8149 = new int[256];

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "[Lpt;")
    public static class407[] field8148 = new class407[1024];

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "[[[Z")
    public static boolean[][][] field8150;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        ++field8146;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (arg1) {
            return null;
        } else {
            if (super.field4527.field1468) {
                int[][] var4 = this.method1968(arg0, 3, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class649.field8968; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (this.field8143 > var12) {
                        var8[var11] = this.field8143;
                    } else if (~this.field8145 > ~var12) {
                        var8[var11] = this.field8145;
                    } else {
                        var8[var11] = var12;
                    }
                    if (~var13 > ~this.field8143) {
                        var9[var11] = this.field8143;
                    } else if (var13 > this.field8145) {
                        var9[var11] = this.field8145;
                    } else {
                        var9[var11] = var13;
                    }
                    if (this.field8143 > var14) {
                        var10[var11] = this.field8143;
                    } else if (var14 <= this.field8145) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field8145;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public static void method3267(byte arg0) {
        field8150 = null;
        field8148 = null;
        field8149 = null;
        if (arg0 > -18) {
            field8150 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class591() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field8144;
        if (arg2 != -66) {
            this.field8145 = 8;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field4537 = arg1.method930(255) == 1;
                }
            } else {
                this.field8145 = arg1.method963(arg2 ^ 54);
            }
        } else {
            this.field8143 = arg1.method963(-125);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Laga;Lr;ZLjava/lang/String;Lla;Z)V")
    public static final void method3268(class658 arg0, class562 arg1, boolean arg2, String arg3, class409 arg4, boolean arg5) {
        ++field8152;
        boolean var6 = !class366.field4827 || class255.method1541(false);
        if (var6) {
            if (class366.field4827 && var6) {
                class658 var12 = class342.field4578;
                class409 var13 = arg1.method1130(var12, class603.field8421, true);
                int var14 = var12.method3768(30061, (class532[]) null, 250, arg3);
                int var15 = var12.method3759(var12.field9382, 1, 250, arg3, (class532[]) null);
                int var16 = class441.field5859.field1132;
                int var17 = var16 + 4;
                int var18 = var17 * 2 + var15;
                int var19 = var17 * 2 + var14;
                if (var18 < class118.field1509) {
                    var18 = class118.field1509;
                }
                if (var19 < class537.field7364) {
                    var19 = class537.field7364;
                }
                int var20 = class592.field8154.method3139((byte) 74, var19, class666.field9479) - -class314.field4209;
                int var21 = class512.field7138.method1697(-111, var18, class399.field5293) + class595.field8209;
                arg1.method1139(class559.field7626, false).method531(class404.field5344.field1132 + var20, var21 - -class404.field5344.field1128, -(class404.field5344.field1132 * 2) + var19, -(class404.field5344.field1128 * 2) + var18, 1, 0, 0);
                arg1.method1139(class404.field5344, true).method2990(var20, var21);
                class404.field5344.method515();
                arg1.method1139(class404.field5344, true).method2990(var19 + var20 + -var16, var21);
                class404.field5344.method511();
                arg1.method1139(class404.field5344, true).method2990(-var16 + var19 + var20, var21 - var16 + var18);
                class404.field5344.method515();
                arg1.method1139(class404.field5344, true).method2990(var20, var18 + var21 + -var16);
                class404.field5344.method511();
                arg1.method1139(class441.field5859, true).method2992(var20, class404.field5344.field1128 + var21, var16, var18 - class404.field5344.field1128 * 2);
                class441.field5859.method510();
                arg1.method1139(class441.field5859, true).method2992(var20 - -class404.field5344.field1132, var21, -(class404.field5344.field1132 * 2) + var19, var16);
                class441.field5859.method510();
                arg1.method1139(class441.field5859, true).method2992(var20 - -var19 + -var16, class404.field5344.field1128 + var21, var16, -(class404.field5344.field1128 * 2) + var18);
                class441.field5859.method510();
                arg1.method1139(class441.field5859, true).method2992(var20 - -class404.field5344.field1132, var18 + var21 - var16, var19 - class404.field5344.field1132 * 2, var16);
                class441.field5859.method510();
                var13.method2332(-(var17 * 2) + var19, var21 - -var17, (int[]) null, 0, arg3, (class596) null, 0, 0, 0, -(var17 * 2) + var18, 1, class670.field9525 | -16777216, (class532[]) null, var20 - -var17, -1, 1);
                class576.method3180(var21, var19, var20, var18, -109);
            } else {
                int var7 = arg0.method3768(30061, (class532[]) null, 250, arg3);
                int var8 = 13 * arg0.method3758(169, (class532[]) null, arg3, 250);
                byte var9 = 4;
                int var10 = var9 + 6;
                int var11 = 6 - -var9;
                arg1.method1113(-var9 + var10, -var9 + var11, var9 + var9 + var7, var9 + var9 + var8, -16777216, 0);
                arg1.method1121(-var9 + var10, -var9 + var11, var7 + var9 + var9, var8 + var9 + var9, -1, 0);
                arg4.method2332(var7, var11, (int[]) null, 0, arg3, (class596) null, 0, 0, 0, var8, 1, -1, (class532[]) null, var10, -1, 1);
                class576.method3180(-var9 + var11, var9 + var9 + var7, -var9 + var10, var8 + var9 + var9, -72);
            }
            if (!arg5) {
                if (arg2) {
                    try {
                        arg1.method1151();
                    } catch (class56 var22) {
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field8147;
            int[] var3 = super.field4525.method2344(-2, arg1);
            if (super.field4525.field5435) {
                int[] var4 = this.method1969(0, arg1, -51);
                for (int var5 = 0; ~class649.field8968 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    if (this.field8143 <= var6) {
                        if (var6 > this.field8145) {
                            var3[var5] = this.field8145;
                        } else {
                            var3[var5] = var6;
                        }
                    } else {
                        var3[var5] = this.field8143;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)Z")
    public static final boolean method3269(byte arg0) {
        ++field8151;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class615.field8523.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class615.field8523.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class615.field8523.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class611.field8485.get(var9);
                        Class var11 = (Class) class615.field8523.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var13 < var12.size(); ++var13) {
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
                                            var17.set(var14, new Integer(0));
                                            var1.remove(var9);
                                        } catch (Throwable var20) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var21) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var22) {
                            }
                        }
                    } catch (Throwable var23) {
                    }
                }
                int var19 = 31 / ((arg0 - 26) / 57);
            } catch (Throwable var24) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var25) {
        }
        class615.field8523 = var1;
        return class615.field8523.isEmpty();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BZ)V")
    public static final void method3270(byte arg0, boolean arg1) {
        ++field8153;
        if (arg0 != -58) {
            field8149 = null;
        }
        while (class289.field3807.method3017(-123, class151.field2070) >= 15) {
            int var2 = class289.field3807.method3008(false, 15);
            if (~var2 == -32768) {
                break;
            }
            boolean var3 = false;
            class407 var4 = (class407) class296.field3921.method3057(1, (long) var2);
            if (var4 == null) {
                class351 var5 = new class351();
                var5.field3010 = var2;
                var4 = new class407(var5);
                class296.field3921.method3061(127, (long) var2, var4);
                var3 = true;
                field8148[class468.field6163++] = var4;
            }
            class351 var6 = var4.field5354;
            class389.field5220[class289.field3820++] = var2;
            var6.field2998 = class327.field4404;
            if (var6.field4671 != null && var6.field4671.method2199(true)) {
                class454.method2552(arg0 ^ -58, var6);
            }
            var6.method2074(class440.field5847.method502(class289.field3807.method3008(false, 14), -15704), true);
            int var7;
            if (arg1) {
                var7 = class289.field3807.method3008(false, 8);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = class289.field3807.method3008(false, 5);
                if (~var7 < -16) {
                    var7 -= 32;
                }
            }
            int var8 = class289.field3807.method3008(false, 1);
            if (var8 == 1) {
                class284.field3738[class360.field4779++] = var2;
            }
            int var9 = class289.field3807.method3008(false, 2);
            int var10 = (-547356665 & 4 + class289.field3807.method3008(false, 3)) << 11;
            int var11;
            if (arg1) {
                var11 = class289.field3807.method3008(false, 8);
                if (~var11 < -128) {
                    var11 -= 256;
                }
            } else {
                var11 = class289.field3807.method3008(false, 5);
                if (var11 > 15) {
                    var11 -= 32;
                }
            }
            int var12 = class289.field3807.method3008(false, 1);
            var6.method1442(var6.field4671.field5105, 10);
            var6.field3013 = var6.field4671.field5137 << 3;
            if (var3) {
                var6.method1439(true, -123, var10);
            }
            var6.method2073(var12 == 1, var9, var6.method1435((byte) 75), class408.field5369.field3086[0] - -var7, arg0 + 52, class408.field5369.field3088[0] + var11);
            if (var6.field4671.method2199(true)) {
                class519.method2943(var6.field385, (class573) null, var6, 0, var6.field3088[0], var6.field3086[0], true, (class600) null);
            }
        }
        class289.field3807.method3016(109);
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; ++var2) {
                if (~(var1 & 1) != -2) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -306674912;
                }
            }
            field8149[var0] = var1;
        }
    }
}
