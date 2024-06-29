import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class492 extends class504 {

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public int field6630;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public int field6631;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Ldb;")
    public static class298 field6632 = new class298(26, 6);

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static void method2746(byte arg0) {
        field6632 = null;
        if (arg0 >= -47) {
            method2747((byte) 29, -103, 97);
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(II)V")
    public class492(int arg0, int arg1) {
        this.field6630 = arg1;
        this.field6631 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)Z")
    public static final boolean method2747(byte arg0, int arg1, int arg2) {
        int var3 = -4 % ((-arg0 - 50) / 55);
        field6633++;
        return (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
    }
}
