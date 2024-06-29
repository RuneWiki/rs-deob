import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class55 {

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Lfs;")
    public static class387 field584;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
    public static void method519(boolean arg0) {
        if (!arg0) {
            method519(true);
        }
        field584 = null;
    }
}
