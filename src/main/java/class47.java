import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class47 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "[S")
    public static short[] field773 = new short[] { 28, 34, 59, 60, 18, 14, 4, 11 };

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[I")
    public static int[] field775 = new int[14];

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method395(int arg0) {
        field773 = null;
        field775 = null;
        if (arg0 >= -96) {
            method399(-40, 67);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)I")
    public static final int method396(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 125 / ((arg2 + 36) / 45);
        field778++;
        if (arg1 >= arg0) {
            return arg3 < arg1 ? arg3 : arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)I")
    public static final int method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg0;
            arg0 = var7;
        }
        int var8 = arg3 & 0x3;
        field774++;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return arg6;
        } else {
            int var9 = -20 / ((arg5 + 1) / 58);
            return var8 == 2 ? 8 - arg4 - arg1 : -arg0 + 7 + -arg6 + 1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILub;)I")
    public static final int method398(int arg0, class92 arg1) {
        field777++;
        int var2 = arg0;
        if (arg1.method697(-108, class257.field4102)) {
            var2 = arg0 + 1;
        }
        if (arg1.method697(-121, class64.field1019)) {
            var2++;
        }
        if (arg1.method697(arg0 ^ 0x4E, class252.field4035)) {
            var2++;
        }
        if (arg1.method697(123, class50.field816)) {
            var2++;
        }
        if (arg1.method697(-112, class248.field3954)) {
            var2++;
        }
        if (arg1.method697(-128, class172.field2645)) {
            var2++;
        }
        if (arg1.method697(arg0 - 17, class125.field1881)) {
            var2++;
        }
        if (arg1.method697(-106, class46.field766)) {
            var2++;
        }
        if (arg1.method697(123, class294.field4568)) {
            var2++;
        }
        if (arg1.method697(arg0 - 93, class55.field870)) {
            var2++;
        }
        if (arg1.method697(33, class26.field457)) {
            var2++;
        }
        if (arg1.method697(20, class115.field1766)) {
            var2++;
        }
        if (arg1.method697(-107, class204.field3147)) {
            var2++;
        }
        if (arg1.method697(77, class152.field2250)) {
            var2++;
        }
        if (arg1.method697(99, class247.field3931)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
    public static final int method399(int arg0, int arg1) {
        field776++;
        if (arg0 != 2) {
            field775 = null;
        }
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xF9) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)J")
    public static final long method400(int arg0, int arg1, int arg2) {
        class22 var3 = class149.field2210[arg0][arg1][arg2];
        return var3 == null || var3.field364 == null ? 0L : var3.field364.field880;
    }
}
