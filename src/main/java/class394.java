import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class394 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public int field5188;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public int field5190;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field5191;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public int field5192;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public int field5193;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public int field5194;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public int field5195;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public int field5196;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public int field5197;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public int field5199;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public int field5201;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public int field5202;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lsr;")
    public static class234 field5189;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Lbi;")
    public static class449 field5203;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "[I")
    public static int[] field5200;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILad;)Z", line = 13)
    public final boolean method2260(int arg0, class394 arg1) {
        field5198++;
        if (arg0 != -1879) {
            this.method2260(86, null);
        }
        return this.field5191 == arg1.field5191 && this.field5192 == arg1.field5192 && this.field5196 == arg1.field5196;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 36)
    public static void method2261(byte arg0) {
        field5189 = null;
        if (arg0 > 3) {
            field5200 = null;
            field5203 = null;
        }
    }
}
