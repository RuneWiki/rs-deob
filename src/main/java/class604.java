import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class604 extends class626 {

    @OriginalMember(owner = "client!raa", name = "u", descriptor = "Lqe;")
    public static class465 field8781 = new class465(24, 6);

    @OriginalMember(owner = "client!raa", name = "w", descriptor = "[[B")
    public static byte[][] field8783 = new byte[250][];

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public int field8768;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
    public int field8771;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    public int field8772;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    public int field8775;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
    public int field8778;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "I")
    public int field8780;

    @OriginalMember(owner = "client!raa", name = "x", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "Ldm;")
    public class50 field8774;

    @OriginalMember(owner = "client!raa", name = "v", descriptor = "Ldm;")
    public class50 field8782;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "Ljava/lang/String;")
    public String field8769;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "Z")
    public boolean field8770;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "[Ljava/lang/Object;")
    public Object[] field8773;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)[Lap;", line = 3)
    public static final class474[] method3499(int arg0) {
        if (arg0 != 8315) {
            method3501();
        }
        field8777++;
        return new class474[] { class560.field7956, class7.field115, class22.field283 };
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZI)Lqk;", line = 20)
    public static final class16 method3500(boolean arg0, int arg1) {
        if (!arg0) {
            method3501();
        }
        field8779++;
        return new class16(arg1, false);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "()V", line = 42)
    public static final void method3501() {
        class62.field1128 = class62.field1125;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V", line = 46)
    public static void method3502(byte arg0) {
        field8783 = null;
        int var1 = -19 % ((-arg0 - 82) / 35);
        field8781 = null;
    }
}
