import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public abstract class class307 {

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field3935 = -1;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "[I")
    public static int[] field3934 = new int[50];

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public static void method1845(int arg0) {
        if (arg0 == 25921) {
            field3934 = null;
        }
    }

    static {
        new class344("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }
}
