import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class225 {

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Lrb;")
    public static class143 field3304 = new class143(16);

    @OriginalMember(owner = "client!el", name = "i", descriptor = "[I")
    public static int[] field3309 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Z")
    public static boolean field3308 = true;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Z")
    public static boolean field3306 = false;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "Z")
    public static boolean field3307 = false;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field3311 = -1;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3310 = "Loading interfaces - ";

    @OriginalMember(owner = "client!el", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3305 = null;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static volatile int field3312 = 0;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method1559(int arg0) {
        field3305 = null;
        field3310 = null;
        if (arg0 <= 13) {
            method1562(-33, -22, 7);
        }
        field3309 = null;
        field3304 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1560(int arg0, int arg1, int arg2, int arg3) {
        if (class152.method1125(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class49.method302(var4 + 1, class103.field1792[arg0][arg1][arg2] + arg3, var5 + 1) && class49.method302(var4 + 128 - 1, class103.field1792[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class49.method302(var4 + 128 - 1, class103.field1792[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class49.method302(var4 + 1, class103.field1792[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIIIIIBII)V")
    public static final void method1561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11, int arg12) {
        field3302++;
        if (arg10 != 88) {
            field3306 = true;
        }
        class47 var13 = new class47();
        var13.field662 = arg11;
        var13.field656 = arg3;
        var13.field660 = arg12;
        var13.field655 = arg9;
        var13.field646 = arg8;
        var13.field664 = arg7;
        var13.field650 = arg6;
        var13.field651 = arg1;
        var13.field661 = arg4;
        var13.field663 = arg5;
        var13.field649 = arg2;
        var13.field648 = arg0;
        class136.field2214.method13(32, var13);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Lbl;")
    public static final class272 method1562(int arg0, int arg1, int arg2) {
        class313 var3 = class223.field3286[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5023;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
    public static final void method1563(int arg0, int arg1) {
        if (arg1 == -9468) {
            field3303++;
            class279 var2 = class111.method844(arg0, 7, -1780180960);
            var2.method1934((byte) -114);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZIII)I")
    public static final int method1564(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            field3308 = true;
        }
        if ((arg5 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg0;
            arg0 = var7;
        }
        int var8 = arg6 & 0x3;
        field3301++;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 1 - (arg4 - 7) - arg2;
        } else {
            return 7 + 1 - arg1 - arg0;
        }
    }
}
