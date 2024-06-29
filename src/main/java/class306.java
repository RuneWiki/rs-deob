import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class306 {

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Lej;")
    public static class104 field4160 = new class104("K", "T", "K", "K");

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lcba;")
    public static class471 field4162 = new class471(107, -2);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILan;Lan;Lkb;Lan;)Z")
    public static final boolean method1935(int arg0, class21 arg1, class21 arg2, class592 arg3, class21 arg4) {
        class538.field7523 = arg2;
        field4163++;
        class551.field7611 = arg4;
        class218.field3105 = arg3;
        class496.field6938 = arg1;
        if (arg0 != 643379271) {
            method1935(52, null, null, null, null);
        }
        return true;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)I")
    public static final int method1936(int arg0) {
        field4161++;
        return arg0 <= 43 ? 82 : 2;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)I")
    public static final int method1937(int arg0, int arg1, int arg2) {
        field4159++;
        int var3 = (arg0 & arg1) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
    public static void method1938(boolean arg0) {
        field4160 = null;
        if (!arg0) {
            field4162 = null;
        }
    }
}
