import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class546 {

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field7706 = -1;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field7709 = 0;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "Lda;")
    public static class67 field7704;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)[Lve;")
    public static final class527[] method3176(byte arg0) {
        field7707++;
        if (arg0 >= -41) {
            field7704 = null;
        }
        return new class527[] { class365.field5277, class681.field9674, class640.field8997, class16.field269, class468.field6683, class297.field4470, class585.field8276, class272.field3798, class572.field8106, class752.field10422 };
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(B)V")
    public static void method3177(byte arg0) {
        if (arg0 != 112) {
            field7706 = 84;
        }
        field7704 = null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IZI)I")
    public static final int method3178(int arg0, boolean arg1, int arg2) {
        field7708++;
        if (arg0 == -1) {
            return 12345678;
        }
        if (!arg1) {
            field7704 = null;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(JJ)J")
    public static long method3179(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIIIBILjava/lang/String;I)V")
    public static final void method3180(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, String arg6, int arg7) {
        field7705++;
        class202 var8 = new class202();
        var8.field2953 = arg3;
        if (arg4 != 102) {
            method3180(-119, 25, -71, 96, (byte) 100, 121, null, -25);
        }
        var8.field2963 = arg5;
        var8.field2959 = arg0;
        var8.field2952 = arg2;
        var8.field2955 = arg1;
        var8.field2950 = class673.field9441 + arg7;
        var8.field2954 = arg6;
        class602.field8486.method2026((byte) 51, var8);
    }
}
