import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class630 {

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "Lqaa;")
    public static class27 field142 = new class27(34, -1);

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "[[[B")
    public static byte[][][] field141;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(B)V", line = 7)
    public static void method54(byte arg0) {
        field142 = null;
        int var1 = -28 / ((arg0 + 25) / 40);
        field141 = null;
    }
}
