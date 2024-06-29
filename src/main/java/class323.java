import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class323 {

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field4152 = 0;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field4151 = 0;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "Lfha;")
    public static class522 field4155 = new class522();

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "[I")
    public static int[] field4157 = new int[256];

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "Lwu;")
    public static class557 field4156;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V", line = 4)
    public static void method1887(byte arg0) {
        field4156 = null;
        field4155 = null;
        if (arg0 == 36) {
            field4157 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)B", line = 22)
    public static final byte method1888(int arg0, int arg1, int arg2) {
        field4154++;
        if (arg1 != 2) {
            method1887((byte) -62);
        }
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V", line = 41)
    public static final void method1889(int arg0) {
        field4153++;
        class677 var1 = (class677) class450.field6178.method3118((byte) 73);
        if (arg0 != 11629) {
            return;
        }
        while (var1 != null) {
            class236 var2 = var1.field9535;
            if (var2.field3267) {
                var1.method3065(-17363);
                var2.method1510((byte) -125);
            } else if (class245.field3409 >= var2.field3284) {
                var2.method1507(0, class284.field3763);
                if (var2.field3267) {
                    var1.method3065(-17363);
                } else {
                    class257.method1603(var2, true);
                }
            }
            var1 = (class677) class450.field6178.method3111(arg0 - 11502);
        }
    }
}
