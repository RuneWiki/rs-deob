import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public abstract class class113 extends class623 {

    @OriginalMember(owner = "client!rba", name = "y", descriptor = "Lqq;")
    public class75 field1395;

    @OriginalMember(owner = "client!rba", name = "t", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!rba", name = "s", descriptor = "Ljt;")
    public static class635 field1389 = new class635(2);

    @OriginalMember(owner = "client!rba", name = "v", descriptor = "I")
    public static int field1392 = 0;

    @OriginalMember(owner = "client!rba", name = "w", descriptor = "Lnha;")
    public static class501 field1393 = new class501("", 13);

    @OriginalMember(owner = "client!rba", name = "u", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!rba", name = "x", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method763(String arg0, byte arg1) {
        System.out.println("Error: " + class27.method274((byte) -128, "%0a", "\n", arg0));
        field1394++;
        if (arg1 <= 99) {
            field1393 = null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method764(int arg0);

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IB)I")
    public static final int method765(int arg0, byte arg1) {
        field1391++;
        return arg1 < 77 ? -94 : arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)V")
    public static void method766(int arg0) {
        field1389 = null;
        field1393 = null;
        if (arg0 != 6373) {
            method763(null, (byte) 60);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)Z")
    public abstract boolean method767(boolean arg0);

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lqq;I)V")
    public class113(class75 arg0, int arg1) {
        this.field1395 = arg0;
        this.field1390 = arg1;
    }
}
