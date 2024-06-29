import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class40 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
    public static int[] field644 = new int[5];

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lwm;")
    public static class152 field647 = class157.method1048(")1", 114);

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[Lqc;")
    public static class4[] field649 = new class4[32768];

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Z")
    public static boolean field651 = false;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Z")
    public static boolean field646 = false;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lwm;")
    private static class152 field652 = class157.method1048("Loaded sprites", 113);

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Lwm;")
    public static class152 field648 = class157.method1048("Librairie 3D d-Bmarr-Be", 112);

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field653 = -1;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lwm;")
    public static class152 field650 = field652;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class127 var7 = class132.method837(arg5, arg4, arg1 ^ arg1);
        field645++;
        if (var7 != null && var7.field1803 != null) {
            class320 var8 = new class320();
            var8.field5569 = var7;
            var8.field5581 = var7.field1803;
            class64.method412(var8, (byte) -121);
        }
        class93.field1329 = arg4;
        class208.field3393 = arg3;
        class324.field5660 = arg6;
        class321.field5607 = arg2;
        class172.field2758 = arg5;
        class239.field3926 = arg0;
        class125.field1762 = true;
        class272.method1868(22889, var7);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 32)
    public static void method285(int arg0) {
        field644 = null;
        field650 = null;
        if (arg0 > 8) {
            field648 = null;
            field652 = null;
            field649 = null;
            field647 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIIIIII)I", line = 61)
    public static final int method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        if (~(arg6 & 0x1) == arg0) {
            int var8 = arg3;
            arg3 = arg1;
            arg1 = var8;
        }
        field654++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 8 - arg3 - arg4;
        } else if (var7 == 2) {
            return 1 + 7 - arg1 - arg2;
        } else {
            return arg4;
        }
    }
}
