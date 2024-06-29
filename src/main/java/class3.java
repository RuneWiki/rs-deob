import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class3 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Lr;")
    public static class66 field35 = class93.method641(43, ")1p");

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Z")
    public static boolean field36 = false;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "J")
    public static long field40 = 0L;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field38 = 0;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)J")
    public static final synchronized long method13(int arg0) {
        if (arg0 != 17161) {
            return -108L;
        }
        field41++;
        long var1 = System.currentTimeMillis();
        if (var1 < class196.field3395) {
            class28.field422 += class196.field3395 - var1;
        }
        class196.field3395 = var1;
        return class28.field422 + var1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method14(byte arg0) {
        if (arg0 < 8) {
            field40 = -105L;
        }
        field35 = null;
    }
}
