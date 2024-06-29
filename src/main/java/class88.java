import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class88 extends class430 {

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Ljc;")
    public class168 field1260;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Lgr;")
    public class530 field1258;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public final void method691(int arg0) {
        if (arg0 != 30608) {
            this.field1257 = -1;
        }
        field1256++;
        if (class182.field2508 < class601.field8529.length) {
            class601.field8529[class182.field2508++] = this;
        }
    }
}
