import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class125 extends class460 {

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "I")
    public static int field1604 = 0;

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "Lvk;")
    public static class337 field1603;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)V", line = 20)
    public static void method863(byte arg0) {
        if (arg0 != 40) {
            method863((byte) 74);
        }
        field1603 = null;
    }
}
