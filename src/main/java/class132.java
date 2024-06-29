import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class132 implements class100 {

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Lmga;")
    private class29 field1787;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field1784 = 0;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "Lwu;")
    public static class557 field1785;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "[Lcw;")
    public static class21[] field1790;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V", line = 3)
    public final void method682(byte arg0) {
        field1786++;
        if (arg0 < 29) {
            field1784 = -91;
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lmga;)V", line = 16)
    public class132(class29 arg0) {
        this.field1787 = arg0;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V", line = 28)
    public static void method837(int arg0) {
        field1785 = null;
        if (arg0 <= 82) {
            field1784 = -45;
        }
        field1790 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Z", line = 40)
    public final boolean method680(int arg0) {
        if (arg0 != 29892) {
            this.field1787 = null;
        }
        field1791++;
        return true;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZZ)V", line = 51)
    public final void method681(boolean arg0, boolean arg1) {
        field1788++;
        if (arg1) {
            class96.field1401.method2194(0, 0, class58.field807, class582.field8281, this.field1787.field373, 0);
        }
        if (!arg0) {
            this.method682((byte) -2);
        }
    }
}
