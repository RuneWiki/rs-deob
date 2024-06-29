import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class701 extends class177 {

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "Z")
    public static boolean field9863 = false;

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
    public int field9859;

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
    public int field9860;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "I")
    public static int field9862;

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "I")
    public int field9865;

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
    public int field9866;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "Lpl;")
    public class604 field9861;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Llk;B)Ljava/lang/String;")
    public static final String method3910(class545 arg0, byte arg1) {
        field9862++;
        if (client.method1825(arg0).method3528((byte) 2) == 0) {
            return null;
        } else if (arg1 != -17) {
            return null;
        } else if (arg0.field7711 == null || arg0.field7711.trim().length() == 0) {
            return class609.field8870 ? "Hidden-use" : null;
        } else {
            return arg0.field7711;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ILea;IIBI)V")
    public static final void method3911(int arg0, class509 arg1, int arg2, int arg3, byte arg4, int arg5) {
        field9864++;
        if (arg1.field7223 == -1 && arg1.field7214 == null) {
            return;
        }
        if (arg4 > -108) {
            field9863 = false;
        }
        int var6 = 0;
        int var7 = class527.field7429.field2635 * arg1.field7227 >> 8;
        if (arg5 > arg1.field7202) {
            var6 += arg5 - arg1.field7202;
        } else if (arg1.field7228 > arg5) {
            var6 += arg1.field7228 - arg5;
        }
        if (arg0 > arg1.field7201) {
            var6 += arg0 - arg1.field7201;
        } else if (arg0 < arg1.field7222) {
            var6 += arg1.field7222 - arg0;
        }
        if (arg1.field7211 == 0 || arg1.field7211 < (var6 - 256) || class527.field7429.field2635 == 0 || arg1.field7197 != arg2) {
            if (arg1.field7212 != null) {
                class50.field1184.method2073(arg1.field7212);
                arg1.field7212 = null;
                arg1.field7216 = null;
                arg1.field7198 = null;
            }
            if (arg1.field7221 != null) {
                class50.field1184.method2073(arg1.field7221);
                arg1.field7221 = null;
                arg1.field7224 = null;
                arg1.field7196 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg1.field7211 - var6) * var7 / arg1.field7211;
        if (arg1.field7212 != null) {
            arg1.field7212.method1657(var8);
        } else if (arg1.field7223 >= 0) {
            if (arg1.field7207) {
                if (arg1.field7198 == null) {
                    arg1.field7198 = class429.method2618(class444.field6395, arg1.field7223);
                }
                if (arg1.field7198 != null) {
                    if (arg1.field7216 == null) {
                        arg1.field7216 = arg1.field7198.method2607(new int[] { 22050 });
                    }
                    if (arg1.field7216 != null) {
                        class245 var12 = class245.method1659(arg1.field7216, 100, var8);
                        var12.method1653(-1);
                        class50.field1184.method2067(var12);
                        arg1.field7212 = var12;
                    }
                }
            } else {
                class60 var9 = class60.method682(class35.field1027, arg1.field7223, 0);
                if (var9 != null) {
                    class630 var10 = var9.method683().method3603(class39.field1063);
                    class245 var11 = class245.method1659(var10, 100, var8);
                    var11.method1653(-1);
                    class50.field1184.method2067(var11);
                    arg1.field7212 = var11;
                }
            }
        }
        if (arg1.field7221 != null) {
            arg1.field7221.method1657(var8);
            if (arg1.field7221.method2589(300)) {
                return;
            }
            arg1.field7196 = null;
            arg1.field7224 = null;
            arg1.field7221 = null;
        } else if (arg1.field7214 != null && (arg1.field7217 -= arg3) <= 0) {
            if (arg1.field7206) {
                if (arg1.field7224 == null) {
                    int var13 = (int) (Math.random() * (double) arg1.field7214.length);
                    arg1.field7224 = class429.method2618(class444.field6395, arg1.field7214[var13]);
                }
                if (arg1.field7224 != null) {
                    if (arg1.field7196 == null) {
                        arg1.field7196 = arg1.field7224.method2607(new int[] { 22050 });
                    }
                    if (arg1.field7196 != null) {
                        class245 var14 = class245.method1659(arg1.field7196, 100, var8);
                        var14.method1653(0);
                        class50.field1184.method2067(var14);
                        arg1.field7217 = arg1.field7219 + ((int) ((double) (arg1.field7204 - arg1.field7219) * Math.random()));
                        arg1.field7221 = var14;
                        return;
                    }
                }
            } else {
                int var15 = (int) (Math.random() * (double) arg1.field7214.length);
                class60 var16 = class60.method682(class35.field1027, arg1.field7214[var15], 0);
                if (var16 == null) {
                    return;
                }
                class630 var17 = var16.method683().method3603(class39.field1063);
                class245 var18 = class245.method1659(var17, 100, var8);
                var18.method1653(0);
                class50.field1184.method2067(var18);
                arg1.field7221 = var18;
                arg1.field7217 = arg1.field7219 + (int) (Math.random() * (double) (arg1.field7204 - arg1.field7219));
            }
            return;
        }
    }
}
