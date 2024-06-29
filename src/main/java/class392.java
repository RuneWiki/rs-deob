import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class392 {

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public int field6004;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public int field6003;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public int field5998;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public int field6002;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    public static int field6006 = 0;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field6001 = 0;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "[I")
    public static int[] field5999 = new int[14];

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field6007 = 0;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "[Lada;")
    public static class144[] field6000;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)Lgt;", line = 3)
    public final class392 method2525(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method2525(7, 97);
        }
        field6005++;
        return new class392(this.field5998, arg0, this.field6002, this.field6004);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V", line = 15)
    public static void method2526(int arg0) {
        field6000 = null;
        if (arg0 >= -20) {
            field6000 = null;
        }
        field5999 = null;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(IIII)V", line = 35)
    public class392(int arg0, int arg1, int arg2, int arg3) {
        this.field6004 = arg3;
        this.field6003 = arg1;
        this.field5998 = arg0;
        this.field6002 = arg2;
    }
}
