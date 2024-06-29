import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class664 {

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "[I")
    public static int[] field9436 = new int[64];

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "B")
    public byte field9434;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public int field9439;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "Ljava/lang/String;")
    public String field9433;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "Ljava/lang/String;")
    public String field9435;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "Ljava/lang/String;")
    public String field9437;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "Ljava/lang/String;")
    public String field9438;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)Luw;", line = 8)
    public static final class194 method3728(int arg0, int arg1, int arg2) {
        class114 var3 = class488.field7062[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1764;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V", line = 15)
    public static void method3729(byte arg0) {
        field9436 = null;
        if (arg0 != -17) {
            method3728(103, 64, -82);
        }
    }
}
