import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class226 extends class232 {

    @OriginalMember(owner = "client!sba", name = "N", descriptor = "I")
    private int field3538 = 4096;

    @OriginalMember(owner = "client!sba", name = "H", descriptor = "Z")
    private boolean field3542 = true;

    @OriginalMember(owner = "client!sba", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field3545 = new String[] { method1988(method1987("l]\u0006\u000b,")), method1988(method1987("d\u0011I\u000b\u0014?")), method1988(method1987("y\u0006DI")), method1988(method1987("d\u0011I\u000b\u0010?")), method1988(method1987("d\u0011I\u000b\u0013?")), method1988(method1987("d\u0011I\u000b\u0015?")) };

    @OriginalMember(owner = "client!sba", name = "M", descriptor = "Lqr;")
    public static class69 field3539 = new class69(16);

    @OriginalMember(owner = "client!sba", name = "I", descriptor = "I")
    public static int field3544 = 1339;

    @OriginalMember(owner = "client!sba", name = "G", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!sba", name = "L", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!sba", name = "K", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!sba", name = "J", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "(I)V", line = 4)
    public static void method1985(int arg0) {
        try {
            if (arg0 == -22082) {
                field3539 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3545[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(ILwq;I)V", line = 14)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg0 >= 96) {
                if (arg2 != 0) {
                    if (arg2 == 1) {
                        this.field3542 = ~arg1.method1645((byte) -70) == -2;
                    }
                } else {
                    this.field3538 = arg1.method1687((byte) -84);
                }
                ++field3543;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3545[1] + arg0 + ',' + (arg1 != null ? field3545[0] : field3545[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "()V", line = 51)
    public class226() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZI[Lmj;III)V", line = 54)
    public static final void method1986(boolean arg0, int arg1, class683[] arg2, int arg3, int arg4, int arg5) {
        try {
            ++field3540;
            for (int var6 = arg1; ~arg2.length < ~var6; ++var6) {
                class683 var7 = arg2[var6];
                if (var7 != null && var7.field9764 == arg3) {
                    class140.method1298(arg5, arg0, arg4, var7, -1821370130);
                    class781.method5611(arg4, arg5, arg1 + 2, var7);
                    if (-var7.field9797 + var7.field9716 < var7.field9739) {
                        var7.field9739 = -var7.field9797 + var7.field9716;
                    }
                    if (~var7.field9744 < ~(var7.field9821 - var7.field9777)) {
                        var7.field9744 = -var7.field9777 + var7.field9821;
                    }
                    if (var7.field9739 < 0) {
                        var7.field9739 = 0;
                    }
                    if (var7.field9744 < 0) {
                        var7.field9744 = 0;
                    }
                    if (var7.field9782 == 0) {
                        class151.method1371(var7, (byte) -95, arg0);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3545[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3545[0] : field3545[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(II)[[I", line = 107)
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field3537;
            if (arg0 != -3093) {
                field3541 = 123;
            }
            int[][] var3 = super.field3599.method1580(arg1, (byte) -47);
            if (super.field3599.field2743) {
                int[] var4 = this.method2022(arg1 + -1 & class315.field5126, 0, arg0 ^ -3093);
                int[] var5 = this.method2022(arg1, 0, arg0 ^ -3093);
                int[] var6 = this.method2022(class315.field5126 & arg1 + 1, 0, arg0 + 3093);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; class449.field6969 > var10; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field3538;
                    int var12 = (var5[class250.field3824 & var10 + 1] + -var5[var10 + -1 & class250.field3824]) * this.field3538;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                    int var18;
                    int var19;
                    int var20;
                    if (var17 == 0) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    } else {
                        var20 = var11 / var17;
                        var18 = var12 / var17;
                        var19 = 16777216 / var17;
                    }
                    if (this.field3542) {
                        var18 = (var18 >> 1) + 2048;
                        var20 = (var20 >> 1) + 2048;
                        var19 = (var19 >> 1) + 2048;
                    }
                    var7[var10] = var18;
                    var8[var10] = var20;
                    var9[var10] = var19;
                }
            }
            return var3;
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field3545[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1987(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 81);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1988(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 40;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
