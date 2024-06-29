import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class145 implements class655 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lwu;")
    public static class149 field2081 = new class149(1);

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
    public static int[] field2085 = new int[3];

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field2084 = new Hashtable();

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field2086 = 0;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static void method1005(byte arg0) {
        field2085 = null;
        field2084 = null;
        if (arg0 > -92) {
            field2085 = null;
        }
        field2081 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
    public static int method1006(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V")
    public class145(int arg0) {
        this.field2082 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Lmh;")
    public final class139 method599(int arg0) {
        field2083++;
        int var2 = -115 % ((-arg0 - 89) / 34);
        return class460.field6627;
    }
}
