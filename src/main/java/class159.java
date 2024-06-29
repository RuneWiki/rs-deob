import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class159 extends class485 {

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Loq;")
    public class358 field1759;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Lsn;")
    public static class629 field1757 = new class629("LOCAL", 4);

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "[Ls;")
    public static class278[] field1758;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method980(byte arg0) {
        if (arg0 >= 125) {
            field1757 = null;
            field1758 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lln;II[B)V")
    public class159(class377 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1759 = arg0.method2323(arg3, class252.field3039, arg1, arg2, -125, false);
        this.field1759.method604(false, false, (byte) -43);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lln;II[I)V")
    public class159(class377 arg0, int arg1, int arg2, int[] arg3) {
        this.field1759 = arg0.method2266(arg3, 126, arg2, arg1, false);
        this.field1759.method604(false, false, (byte) -43);
    }
}
