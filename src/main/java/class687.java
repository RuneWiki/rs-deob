import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class687 extends class578 {

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9632 = new String[] { method4919(method4918("\u00188D\u0012")), method4919(method4918("\rc\u0006P\u0002")), method4919(method4918("\u001f*\u0006-W")), method4919(method4918("\u001f*\u0006,W")), method4919(method4918("\u001f*\u00061W")), method4919(method4918("\u001f*\u0006.W")), method4919(method4918("\u001f*\u00060W")), method4919(method4918("\u001f*\u0006*W")), method4919(method4918("\u001f*\u0006/W")) };

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "[I")
    public static int[] field9625 = new int[1];

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Ldfa;")
    public static class477 field9624 = new class477(4);

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "J")
    public long field9630;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Lig;")
    public class687 field9626;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "Lig;")
    public class687 field9627;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
    public final void method4911(int arg0) {
        try {
            field9631++;
            if (this.field9627 != null && arg0 >= 116) {
                this.field9627.field9626 = this.field9626;
                this.field9626.field9627 = this.field9627;
                this.field9626 = null;
                this.field9627 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9632[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V")
    public static void method4912(int arg0) {
        try {
            field9625 = null;
            if (arg0 != 3) {
                method4915(87, 20, null, 118, -128);
            }
            field9624 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9632[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lha;I)V")
    public static final void method4913(class18 arg0, int arg1) {
        try {
            if (arg1 == 3) {
                if (class728.field10430) {
                    class651.method4739(16, arg0);
                } else {
                    class620.method4559(arg0, false);
                }
                field9621++;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9632[7] + (arg0 == null ? field9632[0] : field9632[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
    public static final void method4914(String arg0, byte arg1, String arg2) {
        try {
            field9622++;
            class139.field1812 = -1;
            if (arg1 <= 69) {
                field9625 = null;
            }
            class398.field5797 = 1;
            class341.field4966 = class60.field911;
            class157.method1317(false, arg0, 0, arg2, false);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9632[2] + (arg0 == null ? field9632[0] : field9632[1]) + ',' + arg1 + ',' + (arg2 == null ? field9632[0] : field9632[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public static final void method4915(int arg0, int arg1, String arg2, int arg3, int arg4) {
        try {
            field9629++;
            class782 var5 = class372.method2952(arg3, arg4, 0);
            if (var5 != null) {
                if (var5.field11254 != null) {
                    class618 var6 = new class618();
                    var6.field8818 = arg0;
                    var6.field8805 = var5;
                    var6.field8812 = var5.field11254;
                    var6.field8807 = arg2;
                    class158.method1334(var6);
                }
                if (class559.field8139 == 11 && client.method4957(var5).method1181(arg0 - 1, 0)) {
                    if (arg0 == 1) {
                        class184.field2375++;
                        class274 var7 = class375.method2969((byte) 1, class752.field10740, class60.field916.field11100);
                        class442.method3440(var7, arg3, -7, var5.field11276, arg4);
                        class60.field916.method5608(var7, 29867);
                    }
                    if (arg0 == 2) {
                        class268.field3794++;
                        class274 var8 = class375.method2969((byte) 1, class602.field8621, class60.field916.field11100);
                        class442.method3440(var8, arg3, arg1 - 50, var5.field11276, arg4);
                        class60.field916.method5608(var8, 29867);
                    }
                    if (arg0 == 3) {
                        class282.field3967++;
                        class274 var9 = class375.method2969((byte) 1, class701.field9800, class60.field916.field11100);
                        class442.method3440(var9, arg3, arg1 ^ 0x62, var5.field11276, arg4);
                        class60.field916.method5608(var9, arg1 + 29875);
                    }
                    if (arg0 == 4) {
                        class140.field1824++;
                        class274 var10 = class375.method2969((byte) 1, class138.field1798, class60.field916.field11100);
                        class442.method3440(var10, arg3, arg1 - 59, var5.field11276, arg4);
                        class60.field916.method5608(var10, 29867);
                    }
                    if (arg0 == 5) {
                        class70.field1004++;
                        class274 var11 = class375.method2969((byte) 1, class250.field3567, class60.field916.field11100);
                        class442.method3440(var11, arg3, arg1 - 105, var5.field11276, arg4);
                        class60.field916.method5608(var11, 29867);
                    }
                    if (arg0 == 6) {
                        class656.field9305++;
                        class274 var12 = class375.method2969((byte) 1, class387.field5651, class60.field916.field11100);
                        class442.method3440(var12, arg3, -94, var5.field11276, arg4);
                        class60.field916.method5608(var12, 29867);
                    }
                    if (~arg0 == arg1) {
                        class654.field9278++;
                        class274 var13 = class375.method2969((byte) 1, class378.field5512, class60.field916.field11100);
                        class442.method3440(var13, arg3, arg1 ^ 0x53, var5.field11276, arg4);
                        class60.field916.method5608(var13, 29867);
                    }
                    if (arg0 == 8) {
                        class767.field10955++;
                        class274 var14 = class375.method2969((byte) 1, class276.field3899, class60.field916.field11100);
                        class442.method3440(var14, arg3, -11, var5.field11276, arg4);
                        class60.field916.method5608(var14, 29867);
                    }
                    if (arg0 == 9) {
                        class641.field9144++;
                        class274 var15 = class375.method2969((byte) 1, class672.field9461, class60.field916.field11100);
                        class442.method3440(var15, arg3, -52, var5.field11276, arg4);
                        class60.field916.method5608(var15, 29867);
                    }
                    if (arg0 == 10) {
                        class118.field1498++;
                        class274 var16 = class375.method2969((byte) 1, class396.field5738, class60.field916.field11100);
                        class442.method3440(var16, arg3, -128, var5.field11276, arg4);
                        class60.field916.method5608(var16, 29867);
                    }
                }
            }
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field9632[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9632[0] : field9632[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIBIFFF[FII[FI)V")
    public static final void method4916(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, float arg6, float arg7, float arg8, float[] arg9, int arg10, int arg11, float[] arg12, int arg13) {
        try {
            int var24 = arg2 - arg0;
            int var26 = arg10 - arg11;
            int var14 = -36 % ((14 - arg4) / 43);
            field9623++;
            int var25 = arg5 - arg3;
            float var15 = arg12[2] * (float) var25 + arg12[0] * (float) var26 + arg12[1] * (float) var24;
            float var16 = arg12[5] * (float) var25 + arg12[3] * (float) var26 + arg12[4] * (float) var24;
            float var17 = arg12[8] * (float) var25 + arg12[6] * (float) var26 + arg12[7] * (float) var24;
            float var18;
            float var19;
            if (arg1 == 0) {
                var18 = arg6 + var15 + 0.5F;
                var19 = arg7 + 0.5F - var17;
            } else if (arg1 == 1) {
                var19 = arg7 + var17 + 0.5F;
                var18 = arg6 + var15 + 0.5F;
            } else if (arg1 == 2) {
                var18 = arg6 + 0.5F - var15;
                var19 = arg8 + 0.5F - var16;
            } else if (arg1 == 3) {
                var19 = arg8 + 0.5F - var16;
                var18 = arg6 + var15 + 0.5F;
            } else if (arg1 == 4) {
                var19 = arg8 + 0.5F - var16;
                var18 = arg7 + var17 + 0.5F;
            } else {
                var18 = arg7 + 0.5F - var17;
                var19 = arg8 + 0.5F - var16;
            }
            if (arg13 == 1) {
                float var20 = var18;
                var18 = -var19;
                var19 = var20;
            } else if (arg13 == 2) {
                var18 = -var18;
                var19 = -var19;
            } else if (arg13 == 3) {
                float var21 = var18;
                var18 = var19;
                var19 = -var21;
            }
            arg9[0] = var18;
            arg9[1] = var19;
        } catch (RuntimeException var23) {
            throw class665.method4799(var23, field9632[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field9632[0] : field9632[1]) + ',' + arg10 + ',' + arg11 + ',' + (arg12 == null ? field9632[0] : field9632[1]) + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Z")
    public final boolean method4917(int arg0) {
        try {
            field9628++;
            if (arg0 < 110) {
                field9625 = null;
            }
            return this.field9627 != null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9632[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4918(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4919(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 40;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
