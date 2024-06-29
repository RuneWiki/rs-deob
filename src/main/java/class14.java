import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 {

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field244 = 0;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field245 = 0;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIII)V", line = 11)
    public static final void method118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field243++;
        for (class397 var5 = (class397) class754.field10532.method1269(4); var5 != null; var5 = (class397) class754.field10532.method1264((byte) 97)) {
            class75.method705(arg2, arg4, arg1, arg3, (byte) -78, var5);
        }
        for (class397 var6 = (class397) client.field4233.method1269(4); var6 != null; var6 = (class397) client.field4233.method1264((byte) 85)) {
            byte var13 = 1;
            class399 var14 = var6.field5825.method2445((byte) 72);
            if (var6.field5825.field5694 == -1 || var6.field5825.field5639) {
                var13 = 0;
            } else if (var6.field5825.field5694 == var14.field5863 || var6.field5825.field5694 == var14.field5864 || var6.field5825.field5694 == var14.field5893 || var6.field5825.field5694 == var14.field5858) {
                var13 = 2;
            } else if (var6.field5825.field5694 == var14.field5884 || var6.field5825.field5694 == var14.field5868 || var6.field5825.field5694 == var14.field5891 || var6.field5825.field5694 == var14.field5902) {
                var13 = 3;
            }
            if (var6.field5809 != var13) {
                int var15 = class436.method2643(var6.field5825, -1);
                class334 var16 = var6.field5825.field126;
                if (var16.field4694 != null) {
                    var16 = var16.method2110(class390.field5635, -1);
                }
                if (var16 == null || var15 == -1) {
                    var6.field5809 = var13;
                    var6.field5808 = false;
                    var6.field5819 = -1;
                } else if (var6.field5819 == var15 && var16.field4687 == var6.field5808) {
                    var6.field5811 = var16.field4673;
                    var6.field5809 = var13;
                } else {
                    boolean var17 = false;
                    if (var6.field5810 == null) {
                        var17 = true;
                    } else {
                        var6.field5811 -= 512;
                        if (var6.field5811 <= 0) {
                            class326.field4510.method1321(var6.field5810);
                            var17 = true;
                            var6.field5810 = null;
                        }
                    }
                    if (var17) {
                        var6.field5808 = var16.field4687;
                        var6.field5819 = var15;
                        var6.field5820 = null;
                        var6.field5822 = null;
                        var6.field5809 = var13;
                        var6.field5811 = var16.field4673;
                    }
                }
            }
            var6.field5812 = var6.field5825.field5922;
            var6.field5832 = var6.field5825.field5922 + (var6.field5825.method2457((byte) 55) << 8);
            var6.field5823 = var6.field5825.field5933;
            var6.field5821 = var6.field5825.field5933 + (var6.field5825.method2457((byte) 92) << 8);
            class75.method705(arg2, arg4, arg1, arg3, (byte) -78, var6);
        }
        class397 var7 = (class397) class68.field1280.method1469(0);
        int var8 = -122 / (-arg0 / 47);
        while (var7 != null) {
            byte var9 = 1;
            class399 var10 = var7.field5813.method2445((byte) 72);
            if (var7.field5813.field5694 == -1 || var7.field5813.field5639) {
                var9 = 0;
            } else if (var7.field5813.field5694 == var10.field5863 || var7.field5813.field5694 == var10.field5864 || var7.field5813.field5694 == var10.field5893 || var7.field5813.field5694 == var10.field5858) {
                var9 = 2;
            } else if (var7.field5813.field5694 == var10.field5884 || var7.field5813.field5694 == var10.field5868 || var7.field5813.field5694 == var10.field5891 || var7.field5813.field5694 == var10.field5902) {
                var9 = 3;
            }
            if (var7.field5809 != var9) {
                int var11 = class613.method3475(-1, var7.field5813);
                if (var7.field5819 == var11 && var7.field5813.field8162 == var7.field5808) {
                    var7.field5811 = var7.field5813.field8203;
                    var7.field5809 = var9;
                } else {
                    boolean var12 = false;
                    if (var7.field5810 == null) {
                        var12 = true;
                    } else {
                        var7.field5811 -= 512;
                        if (var7.field5811 <= 0) {
                            class326.field4510.method1321(var7.field5810);
                            var7.field5810 = null;
                            var12 = true;
                        }
                    }
                    if (var12) {
                        var7.field5808 = var7.field5813.field8162;
                        var7.field5811 = var7.field5813.field8203;
                        var7.field5822 = null;
                        var7.field5819 = var11;
                        var7.field5820 = null;
                        var7.field5809 = var9;
                    }
                }
            }
            var7.field5812 = var7.field5813.field5922;
            var7.field5832 = var7.field5813.field5922 + (var7.field5813.method2457((byte) 123) << 8);
            var7.field5823 = var7.field5813.field5933;
            var7.field5821 = var7.field5813.field5933 + (var7.field5813.method2457((byte) 126) << 8);
            class75.method705(arg2, arg4, arg1, arg3, (byte) -78, var7);
            var7 = (class397) class68.field1280.method1467(0);
        }
    }
}
