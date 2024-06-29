import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class56 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field667 = 0;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "J")
    public static long field668 = 0L;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIII)V", line = 7)
    public static final void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field664++;
        int var8 = class112.method728(arg2, class244.field3844, class2.field22, -54);
        int var9 = class112.method728(arg5, class244.field3844, class2.field22, -113);
        int var10 = class112.method728(arg4, class337.field5389, class344.field5460, -60);
        int var11 = class112.method728(arg0, class337.field5389, class344.field5460, -105);
        if (arg6 <= 99) {
            field668 = 112L;
        }
        int var12 = class112.method728(arg2 + arg1, class244.field3844, class2.field22, -128);
        int var13 = class112.method728(arg5 - arg1, class244.field3844, class2.field22, -108);
        for (int var14 = var8; var14 < var12; var14++) {
            class278.method1986(var10, class347.field5501[var14], arg3, var11, (byte) -123);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class278.method1986(var10, class347.field5501[var15], arg3, var11, (byte) -64);
        }
        int var16 = class112.method728(arg1 + arg4, class337.field5389, class344.field5460, -76);
        int var17 = class112.method728(arg0 - arg1, class337.field5389, class344.field5460, -127);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class347.field5501[var18];
            class278.method1986(var10, var19, arg3, var16, (byte) -127);
            class278.method1986(var16, var19, arg7, var17, (byte) 32);
            class278.method1986(var17, var19, arg3, var11, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 63)
    public static final void method336(int arg0) {
        class291.field4582.method383((byte) -48);
        field666++;
        int var1 = 98 / ((-arg0 - 8) / 49);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)Lch;", line = 73)
    public static final class158 method337(int arg0) {
        field669++;
        int var1 = 97 % ((arg0 + 27) / 46);
        int var2 = class259.field4093[0] * class245.field3855[0];
        byte[] var3 = class14.field145[0];
        class158 var6;
        if (class203.field3082[0]) {
            byte[] var7 = class279.field4392[0];
            int[] var8 = new int[var2];
            for (int var9 = 0; var9 < var2; var9++) {
                var8[var9] = class77.method492(class251.field3978[class261.method1840(var3[var9], 255)], class261.method1840(var7[var9] << 24, -16777216));
            }
            var6 = new class155(class122.field1683, class253.field4004, class110.field1518[0], class33.field392[0], class245.field3855[0], class259.field4093[0], var8);
        } else {
            int[] var4 = new int[var2];
            for (int var5 = 0; var5 < var2; var5++) {
                var4[var5] = class251.field3978[class261.method1840(var3[var5], 255)];
            }
            var6 = new class158(class122.field1683, class253.field4004, class110.field1518[0], class33.field392[0], class245.field3855[0], class259.field4093[0], var4);
        }
        class99.method627(3735);
        return var6;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII)V", line = 123)
    public static final void method338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class85 var7 = new class85();
        var7.field1108 = arg1 / 128;
        var7.field1118 = arg2 / 128;
        var7.field1109 = arg3 / 128;
        var7.field1121 = arg4 / 128;
        var7.field1127 = arg0;
        var7.field1112 = arg1;
        var7.field1107 = arg2;
        var7.field1111 = arg3;
        var7.field1123 = arg4;
        var7.field1122 = arg5;
        var7.field1119 = arg6;
        class123.field1700[class135.field2026++] = var7;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBIIII)I", line = 149)
    public static final int method339(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 52 / ((arg2 - 25) / 56);
        field665++;
        int var8 = arg4 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var9 = arg5;
            arg5 = arg3;
            arg3 = var9;
        }
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 1 + 7 - arg5 - arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg6;
        } else {
            return arg0;
        }
    }
}
