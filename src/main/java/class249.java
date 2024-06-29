import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class249 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "[I")
    public static int[] field3404;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "[Lta;")
    public static class337[] field3405;

    static {
        new class347(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field3404 = new int[1000];
        new class347("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 9)
    public static void method1494(boolean arg0) {
        field3405 = null;
        if (!arg0) {
            field3404 = null;
        }
        field3404 = null;
    }
}
