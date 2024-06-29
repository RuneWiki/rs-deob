import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class37 extends class220 {

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "Lmb;")
    public class98 field745;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Ls;")
    public static class261 field744 = new class261(64);

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field749 = 0;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "Lmh;")
    public static class128 field750 = class22.method156(125, "compass");

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "Ls;")
    public static class261 field748 = new class261(260);

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lmh;I)Lmd;", line = 18)
    public static final class241 method246(class128 arg0, int arg1) {
        field746++;
        if (arg1 < 107) {
            field744 = (class261) null;
        }
        for (class241 var2 = (class241) class102.field1741.method2024(0); var2 != null; var2 = (class241) class102.field1741.method2027(1211754408)) {
            if (var2.field4130.method855(arg0, 255)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V", line = 49)
    public static void method247(int arg0) {
        field748 = null;
        if (arg0 != 0) {
            method247(-30);
        }
        field744 = null;
        field750 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lmb;)V", line = 69)
    public class37(class98 arg0) {
        this.field745 = arg0;
    }
}
