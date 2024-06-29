import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class432 {

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6790 = new String[] { method3419(method3418("v\u001dw \u0015")), method3419(method3418("v\u001dw%\u0015")), method3419(method3418("z_wJ@")), method3419(method3418("o\u00045\b")), method3419(method3418("v\u001dw'\u0015")), method3419(method3418(",\\gD")), method3419(method3418("v\u001dw&\u0015")) };

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Ljj;")
    public static class126 field6786 = new class126();

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "B")
    public byte field6785;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public int field6784;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "Lgda;")
    public static class58 field6787;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "Ljava/lang/String;")
    public String field6783;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "[Ljga;")
    public static class749[] field6781;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static final void method3414(int arg0) {
        try {
            if (arg0 <= -57) {
                field6788++;
                if (class453.field7006 <= 0) {
                    class54.field683 = "";
                } else {
                    int var1 = 0;
                    for (int var2 = 0; var2 < class585.field8479.length; var2++) {
                        if (class585.field8479[var2].indexOf(field6790[5]) != -1) {
                            var1++;
                            if (class453.field7006 == var1) {
                                class54.field683 = class585.field8479[var2].substring(class585.field8479[var2].indexOf(">") + 2);
                                return;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6790[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIZILha;Lmk;IIIIII)V")
    public static final void method3415(int arg0, int arg1, boolean arg2, int arg3, class63 arg4, class59 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            if (arg1 < arg6 && arg1 + arg10 > arg6 && arg0 - 13 < arg3 && arg0 + 3 > arg3 && arg5.field775) {
                arg8 = arg11;
            }
            field6789++;
            int[] var12 = null;
            if (class772.method5571((byte) -54, arg5.field773)) {
                var12 = class229.field3563.method531((int) arg5.field762, (byte) 71).field8476;
            } else if (arg5.field771 != -1) {
                var12 = class229.field3563.method531(arg5.field771, (byte) 45).field8476;
            } else if (class738.method5357(12, arg5.field773)) {
                class19 var15 = (class19) class176.field2797.method737((byte) -39, (long) ((int) arg5.field762));
                if (var15 != null) {
                    class426 var16 = var15.field194;
                    class162 var17 = var16.field6716;
                    if (var17.field2620 != null) {
                        var17 = var17.method1530(-114, class398.field6315);
                    }
                    if (var17 != null) {
                        var12 = var17.field2569;
                    }
                }
            } else if (class252.method2138(-1, arg5.field773)) {
                Object var13 = null;
                class362 var14;
                if (arg5.field773 == 1001) {
                    var14 = class370.field5999.method4002(110, (int) arg5.field762);
                } else {
                    var14 = class370.field5999.method4002(-78, (int) (arg5.field762 >>> 32 & 0x7FFFFFFFL));
                }
                if (var14.field5873 != null) {
                    var14 = var14.method2997(-108, class398.field6315);
                }
                if (var14 != null) {
                    var12 = var14.field5900;
                }
            }
            if (!arg2) {
                method3416(0.10365264F, 8, 46, -117, -99, 26, false, -12, -87);
            }
            String var18 = class207.method1869(arg5, (byte) -112);
            if (var12 != null) {
                var18 = var18 + class679.method4944(0, var12);
            }
            class461.field7108.method684(class475.field7238, arg1 + 3, arg8, var18, arg0, 0, 0, class714.field10323);
            if (arg5.field763) {
                class351.field5676.method1001(arg1 + client.field5163.method498(var18, -1) + 5, arg0 + -12);
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field6790[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field6790[3] : field6790[2]) + ',' + (arg5 == null ? field6790[3] : field6790[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(FIIIIIZII)[[I")
    public static final int[][] method3416(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        try {
            field6782++;
            int[][] var9 = new int[arg2][arg8];
            class767 var10 = new class767();
            if (arg1 <= 49) {
                return null;
            }
            var10.field11222 = arg4;
            var10.field11234 = arg6;
            var10.field11238 = arg3;
            var10.field11227 = (int) (arg0 * 4096.0F);
            var10.field11237 = arg5;
            var10.method67((byte) -43);
            class209.method1891(arg2, 119, arg8);
            for (int var11 = 0; var11 < arg2; var11++) {
                var10.method5525(var9[var11], 81, var11);
            }
            return var9;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field6790[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    public static void method3417(int arg0) {
        try {
            field6781 = null;
            field6786 = null;
            field6787 = null;
            int var1 = 85 % ((69 - arg0) / 50);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6790[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3418(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3419(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
