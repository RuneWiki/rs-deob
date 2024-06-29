import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class233 {

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "Lgda;")
    private class58 field3610;

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
    public int field3616;

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3617 = new String[] { method2032(method2031(")}~JEc")), method2032(method2031(")}~JDc")), method2032(method2031(")}~JGc")), method2032(method2031("061J{")), method2032(method2031("%ms\b")), method2032(method2031(")}~J:\"vv\u00108c")) };

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
    public static int field3611 = -1;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "[Ltf;")
    public static class310[] field3615 = new class310[37];

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
    public static int field3614 = 0;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "Lgda;")
    public static class58 field3609;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 6)
    public static void method2028(int arg0) {
        try {
            int var1 = 67 % ((26 - arg0) / 54);
            field3615 = null;
            field3609 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3617[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjava/awt/Frame;Ltga;)V", line = 29)
    public static final void method2029(int arg0, Frame arg1, class61 arg2) {
        try {
            if (arg0 == 100) {
                while (true) {
                    class218 var3 = arg2.method635((byte) -81, arg1);
                    while (var3.field3402 == 0) {
                        class524.method3918(-4, 10L);
                    }
                    if (var3.field3402 == 1) {
                        field3612++;
                        arg1.setVisible(false);
                        arg1.dispose();
                        return;
                    }
                    class524.method3918(-4, 100L);
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3617[2] + arg0 + ',' + (arg1 == null ? field3617[4] : field3617[3]) + ',' + (arg2 == null ? field3617[4] : field3617[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIII)V", line = 62)
    public static final void method2030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field3613++;
            int var6 = 0;
            int var7 = arg5;
            int var8 = arg1 * arg1;
            int var9 = arg5 * arg5;
            int var10 = var9 << 1;
            int var11 = var8 << 1;
            int var12 = arg5 << 1;
            int var13 = (1 - var12) * var8 + var10;
            int var14 = var9 - (var12 - 1) * var11;
            if (arg0 != 37) {
                field3614 = 74;
            }
            int var15 = var8 << 2;
            int var16 = var9 << 2;
            int var17 = ((var6 << 1) + 3) * var10;
            int var18 = ((arg5 << 1) - 3) * var11;
            int var19 = (var6 + 1) * var16;
            if (class310.field5088 <= arg2 && class478.field7264 >= arg2) {
                int var20 = class694.method5039(class779.field11374, class546.field8030, 0, arg1 + arg4);
                int var21 = class694.method5039(class779.field11374, class546.field8030, arg0 ^ 0x25, arg4 - arg1);
                class545.method4051(var21, arg3, var20, class193.field3047[arg2], arg0 - 154);
            }
            int var22 = (arg5 - 1) * var15;
            while (var7 > 0) {
                if (var13 < 0) {
                    while (var13 < 0) {
                        var14 += var19;
                        var13 += var17;
                        var19 += var16;
                        var6++;
                        var17 += var16;
                    }
                }
                if (var14 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
                var14 += -var18;
                var13 += -var22;
                var18 -= var15;
                var7--;
                var22 -= var15;
                int var23 = arg2 - var7;
                int var24 = arg2 + var7;
                if (class310.field5088 <= var24 && class478.field7264 >= var23) {
                    int var25 = class694.method5039(class779.field11374, class546.field8030, arg0 - 37, arg4 + var6);
                    int var26 = class694.method5039(class779.field11374, class546.field8030, arg0 ^ 0x25, arg4 - var6);
                    if (var23 >= class310.field5088) {
                        class545.method4051(var26, arg3, var25, class193.field3047[var23], arg0 ^ 0xFFFFFFB6);
                    }
                    if (var24 <= class478.field7264) {
                        class545.method4051(var26, arg3, var25, class193.field3047[var24], -124);
                    }
                }
            }
        } catch (RuntimeException var28) {
            throw class590.method4333(var28, field3617[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lpo;ILgda;)V", line = 169)
    public class233(class585 arg0, int arg1, class58 arg2) {
        new class29(64);
        try {
            this.field3610 = arg2;
            this.field3616 = this.field3610.method580(72, 15);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3617[5] + (arg0 == null ? field3617[4] : field3617[3]) + ',' + arg1 + ',' + (arg2 == null ? field3617[4] : field3617[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2031(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2032(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
