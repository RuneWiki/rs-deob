import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class131 extends class172 {

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "Ljn;")
    public static class134 field1687 = new class134(16, 2);

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "Ljn;")
    public static class134 field1689 = new class134(60, 2);

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "[Lgf;")
    public static class73[] field1690 = new class73[14];

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "Lae;")
    public static class283 field1691;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "Ljava/lang/String;")
    private String field1688;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V")
    public static void method890(int arg0) {
        field1687 = null;
        if (arg0 != -10006) {
            method890(-107);
        }
        field1691 = null;
        field1690 = null;
        field1689 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BLhia;)V")
    public final void method100(byte arg0, class48 arg1) {
        if (arg0 == 71) {
            arg1.field553 = this.field1688;
            field1684++;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILgga;)V")
    public final void method102(int arg0, class511 arg1) {
        this.field1688 = arg1.method2993((byte) -83);
        if (arg0 != 2048) {
            field1689 = null;
        }
        field1686++;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
    public static final void method891(int arg0, int arg1) {
        field1685++;
        if (arg1 == -1) {
            return;
        }
        int var2 = 67 % ((27 - arg0) / 60);
        if (class689.field9604[arg1]) {
            field1691.method1857(arg1, 0);
            class609.field8594[arg1] = null;
            class558.field7840[arg1] = null;
            class689.field9604[arg1] = false;
        }
    }
}
