import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class155 extends class16 {

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field2287;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Llt;")
    public static class475 field2281 = new class475(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field2284 = -1;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Z")
    public static volatile boolean field2286 = true;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "[[I")
    public static int[][] field2285 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field2283;

    static {
        new class475("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZBIIII)V", line = 4)
    public static final void method997(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        class385.field5841 = arg5;
        field2282++;
        class90.field1363 = arg0;
        class5.field74 = arg6;
        if (arg2 < 61) {
            return;
        }
        class509.field7427 = arg4;
        class526.field7785 = arg3;
        if (arg1 && class509.field7427 >= 100) {
            class260.field3827 = class5.field74 * 128 + 64;
            class24.field258 = class526.field7785 * 128 + 64;
            class291.field4175 = class377.method2316(class260.field3827, false, class24.field258, class79.field1192) - class90.field1363;
        }
        class140.field2103 = 2;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V", line = 30)
    public static void method998(byte arg0) {
        int var1 = -18 / ((72 - arg0) / 36);
        field2281 = null;
        field2285 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 41)
    public final void method999(int arg0) {
        field2283++;
        if (arg0 != -9034) {
            field2286 = true;
        }
        this.field2287.method2644();
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V", line = 83)
    public class155(int arg0) {
        this.field2287 = new NativeHeap(arg0);
    }
}
