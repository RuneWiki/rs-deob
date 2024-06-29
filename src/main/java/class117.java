import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class117 extends class504 {

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Ljava/lang/String;")
    public String field2001;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Ljava/lang/String;")
    public String field1994;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "Z")
    public boolean field2004;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Z")
    public boolean field2000;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "J")
    public long field1996;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lns;")
    public static class375 field1991;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Lmo;")
    public static class700 field1995;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 13)
    public static void method922(int arg0) {
        field1991 = null;
        field1995 = null;
        if (arg0 >= -16) {
            field1995 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 31)
    public class117(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field2003 = arg6;
        this.field2001 = arg0;
        this.field1997 = arg2;
        this.field1994 = arg1;
        this.field1999 = arg7;
        this.field2004 = arg8;
        this.field2000 = arg9;
        this.field1993 = arg3;
        this.field1996 = arg5;
        this.field1992 = arg4;
    }
}
