import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class49 {

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "Z")
    public static boolean field689 = true;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "Lnj;")
    public static class415 field688 = new class415(14, 8);

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "[Lxa;")
    public static class511[] field687;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
    public static final void method441(int arg0) {
        if (arg0 == 8) {
            class483.field6429 = new class57(class604.field8128.method3280((byte) -70, class144.field1890), "", client.field1223, 1009, -1, 0L, 0, 0, true, false);
            field684++;
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V")
    public static void method442(int arg0) {
        if (arg0 != 8) {
            method442(66);
        }
        field688 = null;
        field687 = null;
    }
}
