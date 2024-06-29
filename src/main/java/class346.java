import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class346 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field4615 = 0;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "F")
    public static float field4618;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "[I")
    public static int[] field4614;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 7)
    public static void method2022(int arg0) {
        if (arg0 != -11543) {
            method2022(-8);
        }
        field4614 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V", line = 17)
    public static final void method2023(int arg0, int arg1) {
        field4617++;
        int var2 = -120 % ((arg1 + 60) / 60);
        int var3 = class406.field5732 - class374.field5208;
        if (var3 >= 100) {
            class39.field404 = -1;
            class520.field6999 = -1;
            class8.field57 = 1;
            return;
        }
        int var4 = (int) class255.field3307;
        if (var4 < (class61.field653 >> 8)) {
            var4 = class61.field653 >> 8;
        }
        if (class587.field8213[4] && class726.field10138[4] + 128 > var4) {
            var4 = class726.field10138[4] + 128;
        }
        int var5 = (int) class183.field2237 + class595.field8285 & 0x3FFF;
        class475.method2670(false, var5, (var4 >> 3) * 3 + 600 << 2, class420.field5892, arg0, class558.field7855, var4, class86.method624(class61.field677, class653.field9086.field2165, class653.field9086.field2170, 24111) - 200);
        float var6 = 1.0F - (float) ((100 - var3) * (100 - var3) * (100 - var3)) / 1000000.0F;
        class74.field801 = (int) ((float) (class74.field801 - class70.field763) * var6 + (float) class70.field763);
        class294.field3956 = (int) ((float) (class294.field3956 - class215.field2603) * var6 + (float) class215.field2603);
        class262.field3429 = (int) ((float) (class262.field3429 - class328.field4437) * var6 + (float) class328.field4437);
        class684.field9518 = (int) ((float) (class684.field9518 - class677.field9456) * var6 + (float) class677.field9456);
        int var7 = class710.field9907 - class123.field1609;
        if (var7 > 8192) {
            var7 -= 16384;
        } else if (var7 < -8192) {
            var7 += 16384;
        }
        class710.field9907 = (int) ((float) var7 * var6 + (float) class123.field1609);
        class710.field9907 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 67)
    public static final void method2024(int arg0) {
        field4616++;
        int var1 = class427.field6032;
        int var2 = 42 / ((arg0 + 17) / 42);
        int[] var3 = class619.field8682;
        for (int var4 = 0; var4 < var1; var4++) {
            class83 var5 = class361.field4793[var3[var4]];
            if (var5 != null) {
                class692.method3902(var5, var5.method543(0), -12212);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)Leda;", line = 104)
    public static final class103 method2025(int arg0, int arg1, int arg2, int arg3) {
        field4619++;
        int var4 = 87 % ((59 - arg3) / 56);
        class103 var5 = null;
        if (arg1 == 0) {
            class391.field5491++;
            var5 = class752.method4186(260, class563.field7960, class449.field6285);
        }
        if (arg1 == 1) {
            class593.field8269++;
            var5 = class752.method4186(260, class60.field640, class449.field6285);
        }
        var5.field1379.method3437(class99.field1313 + arg2, 128);
        var5.field1379.method3437(class133.field1704 + arg0, 128);
        var5.field1379.method3393(class290.field3843.method1426(82, 5503) ? 1 : 0, 72);
        class98.field1303 = arg0;
        class476.field6576 = arg2;
        class50.field530 = false;
        class611.method3415(-17470);
        return var5;
    }
}
