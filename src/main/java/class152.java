import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class152 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    public int[] field2261 = new int[3];

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
    public int[] field2263 = new int[100];

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[Lkt;")
    public class107[] field2265 = new class107[8];

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[Lsq;")
    public class117[] field2264 = new class117[100];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field2260;

    static {
        new class475(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I", line = 18)
    public static final int method990(int arg0, int arg1) {
        return class200.field2889 == null ? 0 : class200.field2889[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z", line = 24)
    public static final boolean method991(int arg0, int arg1, int arg2) {
        if (arg2 <= 16) {
            method991(46, -80, -79);
        }
        field2262++;
        return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
    }
}
