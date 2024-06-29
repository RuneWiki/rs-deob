import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class567 extends class489 {

    @OriginalMember(owner = "client!vs", name = "hb", descriptor = "Lrt;")
    public class169 field7928;

    @OriginalMember(owner = "client!vs", name = "kb", descriptor = "[I")
    public static int[] field7931 = new int[1];

    @OriginalMember(owner = "client!vs", name = "ib", descriptor = "Lvt;")
    public static class344 field7929 = new class344("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!vs", name = "gb", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!vs", name = "lb", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!vs", name = "jb", descriptor = "[[Ljq;")
    public static class447[][] field7930;

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Ljba;)V")
    public class567(class647 arg0) {
        super(arg0);
        this.field7928 = new class169(arg0);
        super.field6854 = new class469(super.field6804);
        super.field6817 = new class469(super.field6804);
        super.field6836 = new class469(super.field6804);
        super.field6813 = new class469(super.field6804);
        super.field6844 = new class469(super.field6804);
        super.field6819 = new class469(super.field6804);
        super.field6820 = new class469(super.field6804);
        super.field6842 = new class469(super.field6804);
        super.field6829 = new class469(super.field6804);
        super.field6831 = new class469(super.field6804);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public final void method1830(int arg0) {
        if (arg0 < 10) {
            field7931 = null;
        }
        this.field7928 = new class169(super.field6804);
        ++field7932;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(B)V")
    public static void method3174(byte arg0) {
        field7930 = null;
        field7929 = null;
        if (arg0 < 22) {
            field7931 = null;
        }
        field7931 = null;
    }
}
