import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class195 {

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3069 = "";

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field3071 = 0;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 5)
    public static void method1481(int arg0) {
        int var1 = 11 % ((arg0 + 47) / 35);
        field3069 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BIZI)V", line = 18)
    public static final void method1482(byte arg0, int arg1, boolean arg2, int arg3) {
        field3070++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class317.field4893 = arg1;
        class61.field946 = arg2;
        if (arg0 <= -40) {
            class294.field4571 = arg3;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)I", line = 40)
    public static final int method1483(int arg0, int arg1, int arg2, int arg3) {
        field3067++;
        if (arg1 != 18205) {
            field3066 = -84;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg2;
        }
    }
}
