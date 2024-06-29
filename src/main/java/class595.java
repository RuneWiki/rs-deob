import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class595 extends class108 {

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
    public static int field8584 = -1;

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "I")
    public int field8579;

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
    public int field8581;

    @OriginalMember(owner = "client!sba", name = "t", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "[I")
    public int[] field8580;

    @OriginalMember(owner = "client!sba", name = "p", descriptor = "[I")
    public int[] field8583;

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "[I")
    public int[] field8586;

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "[Ljr;")
    public class441[] field8577;

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "[Ljr;")
    public class441[] field8582;

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "[[[B")
    public byte[][][] field8585;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BB)V")
    public static final void method3429(byte arg0, byte arg1) {
        field8578++;
        if (class625.field9046 == null) {
            class625.field9046 = new byte[4][class139.field1760][class369.field5135];
        }
        int var2 = 0;
        if (arg0 != 106) {
            return;
        }
        while (var2 < 4) {
            for (int var3 = 0; var3 < class139.field1760; var3++) {
                for (int var4 = 0; var4 < class369.field5135; var4++) {
                    class625.field9046[var2][var3][var4] = arg1;
                }
            }
            var2++;
        }
    }
}
