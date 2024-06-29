import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class683 {

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field9568 = -1;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public static int field9565 = 0;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "Ljn;")
    public static class134 field9566 = new class134(52, -2);

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    public static int field9567;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "[Lho;")
    public static class318[] field9569;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V", line = 7)
    public static void method3902(int arg0) {
        field9569 = null;
        field9566 = null;
        if (arg0 != 5823) {
            field9569 = null;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)J", line = 19)
    public static final synchronized long method3903(byte arg0) {
        field9567++;
        long var1 = System.currentTimeMillis();
        if (arg0 != 4) {
            method3903((byte) 38);
        }
        if (class697.field9716 > var1) {
            class10.field57 += class697.field9716 - var1;
        }
        class697.field9716 = var1;
        return class10.field57 + var1;
    }
}
