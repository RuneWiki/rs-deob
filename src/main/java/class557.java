import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class557 extends class159 {

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Ljea;")
    public static class474 field7657 = new class474(6, 7);

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ltn;I)V")
    public abstract void method32(class95 arg0, int arg1);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLdt;)V")
    public abstract void method30(byte arg0, class254 arg1);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method3190(byte arg0) {
        if (arg0 <= 86) {
            method3190((byte) -122);
        }
        field7657 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILtga;)Ltga;")
    public static final class64 method3191(int arg0, class64 arg1) {
        field7656++;
        class64 var2 = arg1 == null ? new class64() : new class64(arg1);
        var2.method403((byte) 28, 128, 9);
        return arg0 > -21 ? null : var2;
    }
}
