import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class223 {

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "Lha;")
    public static class53 field3232;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "Z")
    public static boolean field3233;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
    public static void method1441(byte arg0) {
        if (arg0 != -128) {
            method1441((byte) -50);
        }
        field3232 = null;
    }

    static {
        new class572("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }
}
