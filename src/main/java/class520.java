import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class520 {

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "Loa;")
    public static class43 field6799;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZIIII)V", line = 3)
    public static final void method2795(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class260.field3509.field1289 != 0 && arg3 != 0 && class202.field2639 < 50 && arg2 != -1) {
            class47.field666[class202.field2639++] = new class64((byte) 1, arg2, arg3, arg4, arg1, 0);
        }
        field6800++;
        if (arg0) {
            method2795(false, 49, -89, -68, 68);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 21)
    public static void method2796(int arg0) {
        if (arg0 > 84) {
            field6799 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Loa;IIIIII)Lba;", line = 31)
    public static final class107 method2797(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 82) {
            return null;
        }
        field6798++;
        long var7 = (long) arg3;
        class107 var9 = (class107) class195.field2541.method3655(52, var7);
        short var10 = 2055;
        if (var9 == null) {
            class645 var11 = class463.method2591(true, arg3, 0, class61.field837);
            if (var11 == null) {
                return null;
            }
            if (var11.field8947 < 13) {
                var11.method3539(2, true);
            }
            var9 = arg0.method410(var11, var10, class581.field7914, 64, 768);
            class195.field2541.method3650(var7, -111, var9);
        }
        class107 var12 = var9.method479((byte) 2, var10, true);
        if (arg5 != 0) {
            var12.method822(arg5);
        }
        if (arg6 != 0) {
            var12.method800(arg6);
        }
        if (arg1 != 0) {
            var12.method803(arg1);
        }
        if (arg4 != 0) {
            var12.method804(0, arg4, 0);
        }
        return var12;
    }
}
