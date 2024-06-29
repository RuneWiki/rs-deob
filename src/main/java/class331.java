import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class331 extends class63 {

    @OriginalMember(owner = "client!is", name = "D", descriptor = "I")
    public static int field4244 = 0;

    @OriginalMember(owner = "client!is", name = "H", descriptor = "Lgca;")
    public static class209 field4247 = new class209(512);

    @OriginalMember(owner = "client!is", name = "M", descriptor = "Lbh;")
    public static class538 field4251 = new class538(4);

    @OriginalMember(owner = "client!is", name = "C", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!is", name = "E", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!is", name = "G", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!is", name = "I", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!is", name = "N", descriptor = "I")
    public int field4252;

    @OriginalMember(owner = "client!is", name = "L", descriptor = "Lhca;")
    public class244 field4250;

    @OriginalMember(owner = "client!is", name = "O", descriptor = "Lwu;")
    public static class557 field4253;

    @OriginalMember(owner = "client!is", name = "J", descriptor = "[B")
    public byte[] field4249;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lha;I)V", line = 4)
    public static final void method1922(class545 arg0, int arg1) {
        ++field4245;
        int var2 = 0;
        int var3 = 0;
        if (class264.field3595) {
            var2 = class468.method2788(false);
            var3 = class142.method934((byte) -88);
        }
        int var4 = -10660793;
        class322.method1882(class148.field2046, var4, -16777216, class140.field1930 + var3, arg0, class463.field6345 + var2, class248.field3438, -26918);
        class743.field10354.method2427(648, class463.field6345 + var2 + 3, class138.field1860.method891(-2041650704, class369.field4721), class140.field1930 + var3 + 14, var4, -1);
        int var5 = class93.field1263.method805(0) - -var2;
        int var6 = class93.field1263.method806(0) - -var3;
        if (arg1 < 75) {
            method1925(57);
        }
        if (class229.field3185) {
            int var7 = 0;
            for (class480 var8 = (class480) class314.field4033.method667(true); var8 != null; var8 = (class480) class314.field4033.method662((byte) 126)) {
                int var12 = class140.field1930 + var3 + 31 - -(var7 * 16);
                if (~var8.field6524 != -2) {
                    class63.method403(class463.field6345 + var2, class140.field1930 + var3, class248.field3438, class148.field2046, var6, var5, -1, -256, arg0, var8, var12, 10960);
                } else {
                    class583.method3469(0, var12, class463.field6345 + var2, -1, class248.field3438, class140.field1930 + var3, (class6) var8.field6519.field1417.field3781, class148.field2046, arg0, -256, var5, var6);
                }
                ++var7;
            }
            if (class105.field1536 != null) {
                class322.method1882(class695.field9701, var4, -16777216, class495.field6946, arg0, class729.field10220, class660.field9314, -26918);
                class743.field10354.method2427(648, class729.field10220 + 3, class105.field1536.field6518, class495.field6946 + 14, var4, -1);
                int var9 = 0;
                for (class6 var10 = (class6) class105.field1536.field6519.method667(true); var10 != null; var10 = (class6) class105.field1536.field6519.method662((byte) 126)) {
                    int var11 = var9 * 16 + (class495.field6946 - -31);
                    ++var9;
                    class583.method3469(0, var11, class729.field10220, -1, class660.field9314, class495.field6946, var10, class695.field9701, arg0, -256, var5, var6);
                }
                class270.method1648(class495.field6946, class729.field10220, class695.field9701, class660.field9314, false);
            }
        } else {
            int var13 = 0;
            for (class6 var14 = (class6) class478.field6510.method3118((byte) 73); var14 != null; var14 = (class6) class478.field6510.method3111(119)) {
                int var15 = (class605.field8642 + -1 + -var13) * 16 + 31 + class140.field1930 + var3;
                class583.method3469(0, var15, class463.field6345 - -var2, -1, class248.field3438, class140.field1930 - -var3, var14, class148.field2046, arg0, -256, var5, var6);
                ++var13;
            }
        }
        class270.method1648(class140.field1930 - -var3, class463.field6345 + var2, class148.field2046, class248.field3438, false);
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(B)I", line = 93)
    public final int method404(byte arg0) {
        ++field4246;
        if (super.field846) {
            return 0;
        } else {
            return arg0 <= 50 ? 30 : 100;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lr;III[Z)Z", line = 114)
    public static final boolean method1923(class706 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class52.field741 != class435.field5969) {
            int var6 = class155.field2126[arg1].method1960(arg2, arg3, 124);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class339 var8 = class155.field2126[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1960(arg2, arg3, 118);
                    if (arg4 != null) {
                        arg4[var7] = var8.method515(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method500(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!is", name = "i", descriptor = "(I)V", line = 149)
    public static final void method1924(int arg0) {
        ++field4248;
        class72.field1012 = null;
        class175.field2385 = null;
        class339.field4345 = null;
        class585.field8423 = null;
        class101.field1452 = null;
        class743.field10354 = null;
        class132.field1790 = null;
        class519.field7238 = null;
        class611.field8687 = null;
        class548.field7728 = null;
        if (arg0 != -24265) {
            method1924(-62);
        }
        class140.field1926 = null;
        class604.field8629 = null;
        class488.field6573 = null;
        class575.field8113 = null;
        class631.field8998 = null;
        class209.field2979 = null;
        class370.field4731 = null;
        class405.field5621 = null;
    }

    @OriginalMember(owner = "client!is", name = "g", descriptor = "(I)[B", line = 177)
    public final byte[] method406(int arg0) {
        ++field4243;
        if (super.field846) {
            throw new RuntimeException();
        } else {
            int var2 = -8 / ((arg0 - -80) / 45);
            return this.field4249;
        }
    }

    @OriginalMember(owner = "client!is", name = "j", descriptor = "(I)V", line = 197)
    public static void method1925(int arg0) {
        field4251 = null;
        if (arg0 != -1) {
            field4244 = -34;
        }
        field4247 = null;
        field4253 = null;
    }
}
