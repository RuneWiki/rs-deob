import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class156 {

    @OriginalMember(owner = "client!af", name = "j", descriptor = "B")
    public byte field2000;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "B")
    public byte field1991;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Llq;")
    public class9 field1995;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "S")
    public short field1999;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field1993 = 0;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lqn;")
    public static class526 field1994 = null;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[Lps;")
    public static class428[] field1996 = new class428[2048];

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Llh;")
    public static class125 field1997;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method903(int arg0) {
        if (arg0 == -13183) {
            field1996 = null;
            field1997 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZI)B")
    public static final byte method904(int arg0, boolean arg1, int arg2) {
        field1998++;
        if (arg0 != 9) {
            return 0;
        } else if (arg1) {
            return 100;
        } else {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Llq;III)V")
    public class156(class9 arg0, int arg1, int arg2, int arg3) {
        this.field2000 = (byte) arg2;
        this.field1991 = (byte) arg3;
        this.field1995 = arg0;
        this.field1999 = (short) arg1;
    }
}
