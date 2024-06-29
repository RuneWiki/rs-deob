import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class79 {

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "[I")
    public int[] field1090 = new int[100];

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "[Lwr;")
    public class531[] field1092 = new class531[8];

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "[Lmv;")
    public class522[] field1093 = new class522[100];

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "[I")
    public int[] field1091 = new int[3];

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1089;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)V")
    public static final void method568(int arg0, byte arg1) {
        field1094++;
        if (arg0 != -1 && class36.field502[arg0] && arg1 >= 84) {
            class433.field6407.method527(arg0, -124);
            class174.field2549[arg0] = null;
            class376.field5673[arg0] = null;
            class36.field502[arg0] = false;
        }
    }
}
