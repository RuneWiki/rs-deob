import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public abstract class class39 extends class199 {

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "[I")
    public static int[] field601 = new int[32];

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "[[B")
    public static byte[][] field603 = new byte[1000][];

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "[Loh;")
    public static class281[] field602 = new class281[14];

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "[Lwj;")
    public static class270[] field600;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V", line = 16)
    public static void method327(int arg0) {
        field602 = null;
        field600 = null;
        if (arg0 != 14) {
            method327(-47);
        }
        field603 = (byte[][]) null;
        field601 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method325(byte arg0);

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)Z")
    public abstract boolean method326(byte arg0);
}
