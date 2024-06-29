import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class499 extends class56 {

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "Lbda;")
    public static class505 field7165 = new class505(3);

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    public static int field7167 = 0;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "Lclient;")
    public static client field7161;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "[Lkba;")
    public static class105[] field7163;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "[[B")
    public static byte[][] field7164;

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V", line = 3)
    public class499() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)V", line = 7)
    public static void method2971(int arg0) {
        field7161 = null;
        field7164 = null;
        if (arg0 != 0) {
            field7163 = null;
        }
        field7163 = null;
        field7165 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)[I", line = 23)
    public final int[] method24(int arg0, boolean arg1) {
        if (!arg1) {
            field7167 = 76;
        }
        field7166++;
        return class132.field1945;
    }
}
