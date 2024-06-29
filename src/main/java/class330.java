import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class330 {

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lgp;")
    private class561 field4747;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public int field4745;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Lcb;")
    public static class78 field4742 = new class78(8);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V", line = 6)
    public static final void method2044(int arg0, int arg1) {
        class88 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class542 var4 = class587.field8363[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class305.field4400; var5++) {
                    for (int var6 = 0; var6 < class362.field5145; var6++) {
                        var2 = var4.method692(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class162.field2401;
                            int var8 = var5 << class162.field2401;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class542 var10 = class587.field8363[var9];
                                if (var10 != null) {
                                    int var11 = var4.method694(var6, var5) - var10.method694(var6, var5);
                                    int var12 = var4.method694(var6 + 1, var5) - var10.method694(var6 + 1, var5);
                                    int var13 = var4.method694(var6 + 1, var5 + 1) - var10.method694(var6 + 1, var5 + 1);
                                    int var14 = var4.method694(var6, var5 + 1) - var10.method694(var6, var5 + 1);
                                    var10.method696(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIFI[FIIBIFF)V", line = 71)
    public static final void method2045(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, float[] arg6, int arg7, int arg8, byte arg9, int arg10, float arg11, float arg12) {
        field4743++;
        int var13 = arg7 - arg8;
        int var14 = arg1 - arg0;
        int var15 = arg3 - arg10;
        float var16 = arg6[2] * (float) var15 + arg6[1] * (float) var14 + arg6[0] * (float) var13;
        float var17 = arg6[5] * (float) var15 + arg6[4] * (float) var14 + arg6[3] * (float) var13;
        float var18 = arg6[8] * (float) var15 + arg6[6] * (float) var13 + arg6[7] * (float) var14;
        float var19;
        float var20;
        if (arg2 == 0) {
            var20 = arg4 + 0.5F - var18;
            var19 = arg11 + var16 + 0.5F;
        } else if (arg2 == 1) {
            var19 = arg11 + var16 + 0.5F;
            var20 = arg4 + var18 + 0.5F;
        } else if (arg2 == 2) {
            var20 = arg12 + 0.5F - var17;
            var19 = arg11 + 0.5F - var16;
        } else if (arg2 == 3) {
            var19 = arg11 + var16 + 0.5F;
            var20 = arg12 + 0.5F - var17;
        } else if (arg2 == 4) {
            var20 = arg12 + 0.5F - var17;
            var19 = arg4 + var18 + 0.5F;
        } else {
            var19 = arg4 + 0.5F - var18;
            var20 = arg12 + 0.5F - var17;
        }
        if (arg5 == 1) {
            float var21 = var19;
            var19 = -var20;
            var20 = var21;
        } else if (arg5 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg5 == 3) {
            float var22 = var19;
            var19 = var20;
            var20 = -var22;
        }
        class262.field3821 = var19;
        class347.field4966 = var20;
        if (arg9 > -88) {
            method2045(81, 41, -81, -49, -1.5128095F, -62, null, -100, 29, (byte) -2, 5, 0.3093243F, 0.23074272F);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 158)
    public static final void method2046(byte arg0) {
        class127.field2088.method1702(class420.field6182.method3163(153009603), false);
        field4744++;
        class127.field2088.method1702(class576.field8225.method3163(153009603), false);
        class127.field2088.method1702(class352.field5018.method3163(153009603), false);
        class127.field2088.method1702(class51.field759.method3163(153009603), false);
        class127.field2088.method1702(class366.field5196.method3163(153009603), false);
        class127.field2088.method1702(class597.field8501.method3163(153009603), false);
        class127.field2088.method1702(class115.field1890.method3163(153009603), false);
        class127.field2088.method1702(class193.field2784.method3163(153009603), false);
        class127.field2088.method1702(class325.field4675.method3163(153009603), false);
        class127.field2088.method1702(class325.field4681.method3163(153009603), false);
        class127.field2088.method1702(class555.field7858.method3163(153009603), false);
        class127.field2088.method1702(class234.field3442.method3163(153009603), false);
        class127.field2088.method1702(class108.field1804.method3163(153009603), false);
        class127.field2088.method1702(class353.field5059.method3163(153009603), false);
        class127.field2088.method1702(class523.field7265.method3163(153009603), false);
        class127.field2088.method1702(class539.field7506.method3163(153009603), false);
        class127.field2088.method1702(class129.field2108.method3163(153009603), false);
        class127.field2088.method1702(class284.field4145.method3163(153009603), false);
        class127.field2088.method1702(class206.field2901.method3163(153009603), false);
        class127.field2088.method1702(class179.field2600.method3163(153009603), false);
        if (arg0 >= -86) {
            return;
        }
        class127.field2088.method1702(class220.field3308.method3163(153009603), false);
        class127.field2088.method1702(class565.field8087.method3163(153009603), false);
        class127.field2088.method1702(class274.field4011.method3163(153009603), false);
        class127.field2088.method1702(class421.field6184.method3163(153009603), false);
        class127.field2088.method1702(class287.field4182.method3163(153009603), false);
        class127.field2088.method1702(class627.field8841.method3163(153009603), false);
        class127.field2088.method1702(class419.field6163.method3163(153009603), false);
        class127.field2088.method1702(class431.field6293.method3163(153009603), false);
        class127.field2088.method1702(class578.field8246.method3163(153009603), false);
        class127.field2088.method1702(class459.field6619.method3163(153009603), false);
        class127.field2088.method1702(class394.field5908.method3163(153009603), false);
        class127.field2088.method1702(class111.field1843.method3163(153009603), false);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 203)
    public static void method2047(int arg0) {
        if (arg0 != -3682) {
            field4742 = null;
        }
        field4742 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLbda;III)V", line = 222)
    public static final void method2048(byte arg0, class400 arg1, int arg2, int arg3, int arg4) {
        field4746++;
        int var5 = arg1.field1571[0];
        int var6 = arg1.field1572[0];
        if (var5 < 0 || class146.field2247 <= var5 || var6 < 0 || class66.field990 <= var6 || arg3 < 0 || arg3 >= class146.field2247 || arg2 < 0 || arg2 >= class66.field990 || arg4 <= 38) {
            return;
        }
        int var7 = class503.method2851(arg3, arg2, class268.field3916[arg1.field5116], class2.field15, 0, 0, class648.field9391, var5, var6, false, 0, arg1.method781((byte) 108), 0, -4, true);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg1.method2446(arg0, class2.field15[var8], 89, class648.field9391[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Ljc;ILgp;)V", line = 266)
    public class330(class584 arg0, int arg1, class561 arg2) {
        new class395(64);
        this.field4747 = arg2;
        this.field4745 = this.field4747.method3164(15, true);
    }
}
