import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class87 extends class569 {

    @OriginalMember(owner = "client!cga", name = "o", descriptor = "I")
    public static int field872 = 0;

    @OriginalMember(owner = "client!cga", name = "p", descriptor = "I")
    public static int field873 = 503;

    @OriginalMember(owner = "client!cga", name = "n", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!cga", name = "q", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!cga", name = "r", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!cga", name = "s", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!cga", name = "t", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!cga", name = "u", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!cga", name = "v", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)I")
    public static final int method447(int arg0, int arg1) {
        return class470.field6718 != null ? class470.field6718[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZ)V")
    public static final void method448(int arg0, boolean arg1) {
        ++field875;
        if (~class222.field2755.length() != -1) {
            if (arg0 != 2) {
                method451((byte) -59);
            }
            class415.method2335("--> " + class222.field2755, 11);
            class353.method2088(false, arg1, class222.field2755, -1);
            class222.field2755 = "";
            class68.field678 = 0;
            class311.field3846 = 0;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIZ)V")
    public final void method449(int arg0, int arg1, int arg2, boolean arg3) {
        ++field876;
        int var5 = this.method3223((byte) 124) * super.field8096.field1972 / 10000;
        class701.field9813.method1022(arg2, arg0 + arg1, var5, super.field8096.field1971 - 2, ((class202) super.field8096).field2390, 0);
        class701.field9813.method1022(arg2 + var5, arg1 - -2, super.field8096.field1972 - var5, super.field8096.field1971 + -2, 0, 0);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "([FIFIIIIIIIFFI)V")
    public static final void method450(float[] arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float arg10, float arg11, int arg12) {
        int var13 = arg3 - arg4;
        int var14 = arg6 - arg1;
        int var15 = arg12 - arg5;
        ++field877;
        float var16 = arg0[2] * (float) var14 + arg0[1] * (float) var15 + arg0[0] * (float) var13;
        float var17 = arg0[5] * (float) var14 + arg0[arg8] * (float) var15 + arg0[3] * (float) var13;
        float var18 = arg0[8] * (float) var14 + arg0[6] * (float) var13 + arg0[7] * (float) var15;
        float var19;
        float var20;
        if (~arg7 != -1) {
            if (~arg7 != -2) {
                if (arg7 == 2) {
                    var19 = -var16 + arg11 + 0.5F;
                    var20 = -var17 + arg2 + 0.5F;
                } else if (~arg7 == -4) {
                    var19 = arg11 + var16 + 0.5F;
                    var20 = -var17 + arg2 + 0.5F;
                } else if (arg7 != 4) {
                    var20 = -var17 + arg2 + 0.5F;
                    var19 = -var18 + arg10 + 0.5F;
                } else {
                    var19 = arg10 + var18 + 0.5F;
                    var20 = -var17 + arg2 + 0.5F;
                }
            } else {
                var19 = arg11 + var16 + 0.5F;
                var20 = arg10 + var18 + 0.5F;
            }
        } else {
            var20 = -var18 + arg10 + 0.5F;
            var19 = arg11 + var16 + 0.5F;
        }
        if (~arg9 == -2) {
            float var21 = var19;
            var19 = -var20;
            var20 = var21;
        } else if (~arg9 == -3) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg9 == 3) {
            float var22 = var19;
            var19 = var20;
            var20 = -var22;
        }
        class564.field8059 = var20;
        class149.field1650 = var19;
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)V")
    public static final void method451(byte arg0) {
        class185.field2107.method975(class635.field8948, class108.field1172, class656.field9237);
        ++field871;
        if (arg0 <= 5) {
            method451((byte) 119);
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Ltf;Ltf;Liq;)V")
    public class87(class701 arg0, class701 arg1, class202 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZIZ)V")
    public final void method452(int arg0, boolean arg1, int arg2, boolean arg3) {
        class701.field9813.method999(arg2 - 2, arg0, super.field8096.field1972 + 4, super.field8096.field1971 + 2, ((class202) super.field8096).field2389, 0);
        ++field878;
        class701.field9813.method999(arg2 + -1, arg0 + 1, super.field8096.field1972 + 2, super.field8096.field1971, 0, 0);
        if (!arg1) {
            method448(109, false);
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(III)V")
    public static final void method453(int arg0, int arg1, int arg2) {
        ++field879;
        class76 var3 = class3.method28(16, (byte) 42, arg2);
        var3.method403((byte) 68);
        if (arg1 <= -119) {
            var3.field785 = arg0;
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(II)Luca;")
    public static final class695 method454(int arg0, int arg1) {
        ++field874;
        class695 var2 = (class695) class271.field3376.method78(0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            int var3 = -72 / ((arg0 - -66) / 46);
            byte[] var4 = class42.field415.method3854((byte) 49, 1, arg1);
            class695 var5 = new class695();
            var5.field9743 = arg1;
            if (var4 != null) {
                var5.method3822(new class115(var4), 1);
            }
            var5.method3821(-128);
            if (var5.field9735 == 2 && class471.field6753.method3669((long) arg1, -1) == null) {
                class471.field6753.method3671(false, new class22(class243.field3008), (long) arg1);
                class490.field7125[class243.field3008++] = var5;
            }
            class271.field3376.method92(1, (long) arg1, var5);
            return var5;
        }
    }
}
