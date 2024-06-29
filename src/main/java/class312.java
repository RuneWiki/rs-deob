import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class312 extends class219 {

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "I")
    public int field4638;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "Ljava/lang/String;")
    public String field4633;

    @OriginalMember(owner = "client!nba", name = "B", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!nba", name = "C", descriptor = "Z")
    public boolean field4641;

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!nba", name = "D", descriptor = "Z")
    public boolean field4642;

    @OriginalMember(owner = "client!nba", name = "A", descriptor = "I")
    public int field4639;

    @OriginalMember(owner = "client!nba", name = "F", descriptor = "Ljava/lang/String;")
    public String field4644;

    @OriginalMember(owner = "client!nba", name = "J", descriptor = "J")
    public long field4647;

    @OriginalMember(owner = "client!nba", name = "E", descriptor = "Z")
    public boolean field4643;

    @OriginalMember(owner = "client!nba", name = "y", descriptor = "I")
    public int field4637;

    @OriginalMember(owner = "client!nba", name = "w", descriptor = "J")
    public long field4635;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!nba", name = "I", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!nba", name = "G", descriptor = "Lha;")
    public static class66 field4645;

    @OriginalMember(owner = "client!nba", name = "x", descriptor = "Ljava/lang/String;")
    public String field4636;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
    public static void method2035(int arg0) {
        if (arg0 > 93) {
            field4645 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIIILha;)V")
    public static final void method2036(int arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5) {
        field4646++;
        class438.field6281 = arg5;
        class754.field10433 = class438.field6281.method462();
        class599.field8453 = class438.field6281.method462();
        class638.field8978 = class438.field6281.method462();
        int var6 = 24 % ((-arg3 - 78) / 42);
        class394.field5585 = arg0;
        class519.field7409 = null;
        class151.field1984 = arg2;
        class148.field1898 = null;
        class463.field6612 = 0;
        class578.method3357(1, arg1, arg4);
        class4.field53 = -1;
        class603.field8490 = -1;
        class135.field1747 = -1;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(BI)Z")
    public static final boolean method2037(byte arg0, int arg1) {
        field4634++;
        int var2 = 93 / ((arg0 - 1) / 54);
        return arg1 == 7 || arg1 == 8 || arg1 == 9;
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class312(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field4638 = arg4;
        this.field4633 = arg1;
        this.field4640 = arg3;
        this.field4641 = arg8;
        this.field4632 = arg7;
        this.field4642 = arg11;
        this.field4639 = arg6;
        this.field4644 = arg0;
        this.field4647 = arg5;
        this.field4643 = arg9;
        this.field4637 = arg2;
        this.field4635 = arg10;
    }
}
