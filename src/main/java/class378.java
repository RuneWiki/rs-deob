import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class378 {

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public int field5218;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public int field5211;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "Z")
    public static boolean field5215 = false;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "Z")
    public static boolean field5223 = false;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "[B")
    public static byte[] field5220 = null;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public int field5214;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public int field5216;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public int field5217;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "Lqja;")
    public class326 field5222;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "Loq;")
    public class378 field5213;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "Lwia;")
    public static class791 field5212;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V", line = 19)
    public static void method2341(byte arg0) {
        field5220 = null;
        field5212 = null;
        int var1 = -27 % ((-arg0 - 1) / 61);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)Lej;", line = 30)
    public final class132 method2342(boolean arg0) {
        if (arg0) {
            this.field5216 = -49;
        }
        field5219++;
        return class771.method4253(11879, this.field5218);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BI)Loq;", line = 41)
    public final class378 method2343(byte arg0, int arg1) {
        field5221++;
        if (arg0 <= 8) {
            this.method2342(false);
        }
        return new class378(this.field5218, arg1);
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(II)V", line = 53)
    public class378(int arg0, int arg1) {
        this.field5218 = arg0;
        this.field5211 = arg1;
    }
}
