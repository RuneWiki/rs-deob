import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class257 {

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field4001 = 0;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Z")
    public static boolean field4000 = false;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field3999 = 0;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field4004 = -1;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "C")
    public static char field4003;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)Z", line = 12)
    public static final boolean method1725(int arg0, int arg1) {
        field4002++;
        if (class44.field627 == arg1) {
            return false;
        }
        class212.field3362 = new int[4][13][13];
        if (arg0 != 104) {
            method1726(113, 59);
        }
        class200.field3011 = new int[104][104];
        for (int var2 = 0; var2 < 4; var2++) {
            class33.field425[var2] = new class294(104, 104);
        }
        class274.field4221 = new class2[4][104][104];
        class97.field1512 = new byte[4][104][104];
        class305.field4784 = new byte[4][104][104];
        if (class333.field5166) {
            class147.method1031(4, 104, 104);
            class11.method72(104, 104);
            class14.field144 = new class117[13][13];
        }
        class44.field627 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)Lfm;", line = 55)
    public static final class200 method1726(int arg0, int arg1) {
        field4005++;
        if (arg0 != -5) {
            method1726(106, -124);
        }
        return (class200) class207.field3164.method1558((long) arg1, false);
    }
}
