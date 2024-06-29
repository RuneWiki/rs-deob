import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class634 extends class272 {

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    public static int field8596 = 503;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "Lhm;")
    public static class208 field8597 = new class208(32);

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "Ldr;")
    public static class675 field8598 = new class675(116, 5);

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "[I")
    public static int[] field8600 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "[Lld;")
    public static class158[] field8601 = new class158[4];

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "Lpfa;")
    public static class275 field8594;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "Lwca;")
    public class634 field8591;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "Lwca;")
    public class634 field8593;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "[[[B")
    public static byte[][][] field8599;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V", line = 8)
    public final void method3554(int arg0) {
        field8592++;
        if (this.field8591 == null) {
            return;
        }
        this.field8591.field8593 = this.field8593;
        this.field8593.field8591 = this.field8591;
        this.field8591 = null;
        this.field8593 = null;
        if (arg0 != 15) {
            this.field8593 = null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)V", line = 32)
    public static void method3555(byte arg0) {
        field8601 = null;
        field8594 = null;
        field8597 = null;
        field8598 = null;
        field8600 = null;
        int var1 = -67 / ((arg0 + 3) / 38);
        field8599 = null;
    }
}
