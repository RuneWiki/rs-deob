import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class493 {

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public int field6144;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public int field6148;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Lfd;")
    public class493 field6145;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Lq;")
    public class396 field6142;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Z")
    public static boolean field6139 = false;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Z")
    public static boolean field6149 = false;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lnh;")
    public static class699 field6140 = new class699(2);

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public int field6141;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field6147;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public int field6151;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Lpfa;")
    public static class275 field6150;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "[[S")
    public static short[][] field6143;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method2671(int arg0) {
        field6143 = null;
        field6140 = null;
        field6150 = null;
        if (arg0 >= -39) {
            method2671(40);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Lfd;")
    public final class493 method2672(byte arg0, int arg1) {
        if (arg0 == -95) {
            field6152++;
            return new class493(this.field6144, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Lcb;")
    public final class486 method2673(int arg0) {
        field6146++;
        if (arg0 != 2) {
            field6149 = true;
        }
        return class581.method3230(this.field6144, -3);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(II)V")
    public class493(int arg0, int arg1) {
        this.field6144 = arg0;
        this.field6148 = arg1;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lfd;I)V")
    public class493(class493 arg0, int arg1) {
        this.field6145 = arg0;
        this.field6144 = this.field6145.field6144;
        this.field6142 = this.field6145.field6142;
        this.field6148 = this.field6145.field6148 + arg1;
    }
}
