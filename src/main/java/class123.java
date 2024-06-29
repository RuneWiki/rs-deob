import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class123 implements class343 {

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "Ljava/lang/String;")
    private String field1687;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "Lsea;")
    private class648 field1689;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Z")
    public static boolean field1686 = false;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "Lem;")
    public static class206 field1684 = new class206(98, 12);

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "Ljba;")
    public static class364 field1688;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Lge;")
    public static class660 field1685;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
    public static void method880(int arg0) {
        if (arg0 != 10102) {
            field1686 = true;
        }
        field1684 = null;
        field1685 = null;
        field1688 = null;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lsea;Ljava/lang/String;)V")
    public class123(class648 arg0, String arg1) {
        this.field1687 = arg1;
        this.field1689 = arg0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)I")
    public final int method301(int arg0) {
        field1690++;
        if (this.field1689.method3625(this.field1687, -1)) {
            return 100;
        } else {
            if (arg0 != 28158) {
                field1688 = null;
            }
            return this.field1689.method3638(false, this.field1687);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)Lmv;")
    public final class342 method302(byte arg0) {
        field1691++;
        if (arg0 > -88) {
            method880(-75);
        }
        return class342.field4587;
    }
}
