import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class106 extends class83 implements class162 {

    @OriginalMember(owner = "client!jha", name = "H", descriptor = "I")
    private int field1244;

    @OriginalMember(owner = "client!jha", name = "C", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client!jha", name = "E", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client!jha", name = "G", descriptor = "[I")
    public static int[] field1243 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!jha", name = "J", descriptor = "[I")
    public static int[] field1246 = new int[1000];

    @OriginalMember(owner = "client!jha", name = "K", descriptor = "Z")
    public static boolean field1247 = true;

    @OriginalMember(owner = "client!jha", name = "D", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!jha", name = "F", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!jha", name = "I", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Z)V")
    public static final void method750(boolean arg0) {
        ++field1242;
        class231.field3485.method2707((byte) 52);
        class632.field8833.method3362(91);
        class15.field91.method2618((byte) -83);
        class390.field5558.method3059((byte) -62);
        class104.field1201.method4319((byte) -99);
        class35.field367.method3049(-1);
        class571.field8029.method3696((byte) 108);
        class576.field8094.method4138((byte) -86);
        class650.field9089.method1963(-119);
        class206.field2895.method1924((byte) -89);
        class326.field4583.method1347(-15883);
        class671.field9419.method2876((byte) 43);
        class35.field354.method2919((byte) -117);
        class657.field9274.method513(123);
        class545.field7585.method2796((byte) 97);
        class734.field10126.method708(11);
        class72.field790.method676(-98);
        class651.field9101.method556((byte) -57);
        class444.field6154.method3183(39);
        class315.field4514.method1873(false);
        class616.field8649.method2430(true);
        class10.field67.method2199(8);
        class521.method3110((byte) 105);
        class607.method3509(211);
        class618.method3566(arg0);
        class486.method2888((byte) 71);
        if (class425.field5937 != class224.field3414) {
            for (int var1 = 0; class81.field904.length > var1; ++var1) {
                class81.field904[var1] = null;
            }
            class361.field5212 = 0;
        }
        class479.method2853(true);
        class379.method2369(0);
        class567.method3341(118);
        class188.method1174(16);
        class9.method23(false);
        class700.field9741.method314(-2);
        class111.field1332.method184();
        class396.method2442(-84);
        class729.method4051((byte) -104);
        class564.field7978.method1844((byte) 112);
        class685.field9574.method1844((byte) 112);
        class403.field5684.method1844((byte) 112);
        class132.field1695.method1844((byte) 112);
        class406.field5726.method1844((byte) 112);
        class604.field8480.method1844((byte) 112);
        class456.field6372.method1844((byte) 112);
        class384.field5496.method1844((byte) 112);
        class149.field1968.method1844((byte) 112);
        class115.field1473.method1844((byte) 112);
        class392.field5585.method1844((byte) 112);
        class456.field6376.method1844((byte) 112);
        class540.field7466.method1844((byte) 112);
        class170.field2160.method1844((byte) 112);
        class102.field1184.method1844((byte) 112);
        class269.field3901.method1844((byte) 112);
        class99.field1155.method1844((byte) 112);
        class122.field1617.method1844((byte) 112);
        class605.field8484.method1844((byte) 112);
        class75.field841.method1844((byte) 112);
        class16.field95.method1844((byte) 112);
        class448.field6272.method1844((byte) 112);
        class274.field3962.method1844((byte) 112);
        class539.field7458.method1844((byte) 112);
        class85.field1026.method1844((byte) 112);
        class368.field5290.method1844((byte) 112);
        class35.field359.method1844((byte) 112);
        class679.field9499.method1844((byte) 112);
        class516.field7087.method1844((byte) 112);
        class212.field2925.method1844((byte) 112);
        class356.field5136.method1844((byte) 112);
        class100.field1175.method1844((byte) 112);
        class278.field4003.method1844((byte) 112);
        class766.field10538.method314(-2);
        class380.field5447.method314(-2);
        class170.field2167.method314(-2);
        class463.field6468.method314(-2);
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(Z)V")
    public static void method751(boolean arg0) {
        field1243 = null;
        if (!arg0) {
            field1246 = null;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field1245;
        if (arg0 >= class177.field2236 && arg2 <= class627.field8783 && class727.field10060 <= arg5 && class474.field6576 >= arg1) {
            if (~arg4 == -2) {
                class500.method2932(arg3, arg2, arg5, 127, arg0, arg1);
            } else {
                class535.method3181(arg0, arg1, arg2, arg5, 816931216, arg4, arg3);
            }
        } else if (arg4 != 1) {
            class289.method1921(arg1, arg2, arg3, -6169, arg4, arg5, arg0);
        } else {
            class380.method2374(18, arg1, arg5, arg2, arg0, arg3);
        }
        if (arg6 >= -86) {
            field1246 = null;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(B[ILao;I)Lcda;")
    public static final class594 method753(byte arg0, int[] arg1, class534 arg2, int arg3) {
        ++field1240;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        float[][] var7 = null;
        if (arg2.field7386 != null) {
            int var8 = arg2.field7369;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; ++var15) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            var5 = new int[var8];
            for (int var16 = 0; ~arg3 < ~var16; ++var16) {
                int var23 = arg1[var16];
                if (arg2.field7386[var23] != -1) {
                    int var24 = 255 & arg2.field7386[var23];
                    for (int var25 = 0; ~var25 > -4; ++var25) {
                        short var26;
                        if (var25 != 0) {
                            if (~var25 == -2) {
                                var26 = arg2.field7371[var23];
                            } else {
                                var26 = arg2.field7385[var23];
                            }
                        } else {
                            var26 = arg2.field7344[var23];
                        }
                        int var27 = arg2.field7374[var26];
                        int var28 = arg2.field7375[var26];
                        int var29 = arg2.field7395[var26];
                        if (var9[var24] > var27) {
                            var9[var24] = var27;
                        }
                        if (~var27 < ~var10[var24]) {
                            var10[var24] = var27;
                        }
                        if (~var11[var24] < ~var28) {
                            var11[var24] = var28;
                        }
                        if (var12[var24] < var28) {
                            var12[var24] = var28;
                        }
                        if (var29 < var13[var24]) {
                            var13[var24] = var29;
                        }
                        if (var14[var24] < var29) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            var7 = new float[var8][];
            var6 = new int[var8];
            var4 = new int[var8];
            for (int var17 = 0; ~var8 < ~var17; ++var17) {
                byte var18 = arg2.field7380[var17];
                if (~var18 < -1) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg2.field7346[var17];
                        if (var19 != 0) {
                            if (var19 <= 0) {
                                var20 = (float) (-var19) / 1024.0F;
                                var21 = 1.0F;
                            } else {
                                var20 = 1.0F;
                                var21 = (float) var19 / 1024.0F;
                            }
                        } else {
                            var21 = 1.0F;
                            var20 = 1.0F;
                        }
                        var22 = 64.0F / (float) arg2.field7377[var17];
                    } else if (var18 != 2) {
                        var21 = (float) arg2.field7355[var17] / 1024.0F;
                        var22 = (float) arg2.field7377[var17] / 1024.0F;
                        var20 = (float) arg2.field7346[var17] / 1024.0F;
                    } else {
                        var20 = 64.0F / (float) arg2.field7346[var17];
                        var21 = 64.0F / (float) arg2.field7355[var17];
                        var22 = 64.0F / (float) arg2.field7377[var17];
                    }
                    var7[var17] = class86.method649(arg2.field7370[var17], (byte) -112, arg2.field7356[var17], var20, var21, class407.method2490(255, arg2.field7368[var17]), arg2.field7341[var17], var22);
                }
            }
        }
        if (arg0 != -35) {
            method753((byte) 39, (int[]) null, (class534) null, -46);
        }
        return new class594(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Loaa;Lpb;III[B)V")
    public class106(class556 arg0, class2 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class612.field8616, arg2 * arg4 * arg3, false);
        this.field1244 = arg2;
        this.field1239 = arg3;
        this.field1241 = arg4;
        super.field1006.method1492(this, 2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field1016, 0, this.method631(107), this.field1244, this.field1239, this.field1241, 0, class723.method4029(80, super.field994), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
