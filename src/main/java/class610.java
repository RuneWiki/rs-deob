import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class610 {

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "J")
    public long field8770;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "Luq;")
    private class313 field8769;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field8767 = new String[200];

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "[Lsh;")
    public static class617[] field8771 = new class617[8];

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "Lbn;")
    public static class371 field8766 = new class371(13, 0, 1, 0);

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "Lim;")
    public static class353 field8772 = new class353(88, 3);

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "I")
    public static int field8773 = 0;

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "Lwg;")
    public static class58 field8774 = new class58(200);

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "Lvt;")
    public static class344 field8775 = new class344("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "[I")
    public static int[] field8776 = new int[2048];

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!qca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field8769.method1963(this.field8770, (byte) 121);
        field8768++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
    public static void method3488(int arg0) {
        field8767 = null;
        field8771 = null;
        field8772 = null;
        field8776 = null;
        int var1 = -27 / ((arg0 + 33) / 42);
        field8775 = null;
        field8774 = null;
        field8766 = null;
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Luq;J[Lop;)V")
    public class610(class313 arg0, long arg1, class364[] arg2) {
        this.field8770 = arg1;
        this.field8769 = arg0;
    }
}
