import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class465 extends class172 {

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    private int field6477 = -1;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field6480 = 0;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Lho;")
    public static class318 field6478;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "[[[I")
    public static int[][][] field6476;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 13)
    public static void method2789(byte arg0) {
        field6478 = null;
        if (arg0 == -40) {
            field6476 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILgga;)V", line = 28)
    public final void method102(int arg0, class511 arg1) {
        field6481++;
        this.field6477 = arg1.method3002(-1);
        if (arg0 != 2048) {
            method2789((byte) 4);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLhia;)V", line = 46)
    public final void method100(byte arg0, class48 arg1) {
        field6479++;
        if (arg0 != 71) {
            this.method100((byte) -103, null);
        }
        arg1.method401(-62, this.field6477);
    }
}
