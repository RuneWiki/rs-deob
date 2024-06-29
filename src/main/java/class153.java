import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class153 {

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public int field1996;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "B")
    public byte field2002;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field2003 = 1;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Lpa;")
    public static class254 field1992 = new class254(5, 16);

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "Lla;")
    public static class319 field2005 = new class319(49, -1);

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "Ljp;")
    public class242 field2001;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "Lqv;")
    public class314 field1999;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "Laa;")
    public static class341 field2004;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "Lt;")
    public class481 field1997;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "Ljm;")
    public class494 field1994;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 13)
    public static void method996(int arg0) {
        field2005 = null;
        field2004 = null;
        field1992 = null;
        if (arg0 != 16) {
            field1992 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(BIIIII)V", line = 42)
    public class153(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1995 = arg4;
        this.field1996 = arg5;
        this.field1993 = arg2;
        this.field2002 = arg0;
        this.field2000 = arg1;
        this.field1998 = arg3;
    }
}
