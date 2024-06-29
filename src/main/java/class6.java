import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class6 extends class287 {

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "Z")
    public boolean field55;

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "J")
    public long field48;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "Ljava/lang/String;")
    public String field50;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "Z")
    public boolean field56;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "J")
    public long field47;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "Ljava/lang/String;")
    public String field51;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "Z")
    public boolean field46;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
    public static int field54 = 0;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "[I")
    public static int[] field49 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "Ljava/lang/String;")
    public String field53;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 10)
    public static void method28(boolean arg0) {
        if (!arg0) {
            field49 = null;
        }
        field49 = null;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 36)
    public class6(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field55 = arg8;
        this.field60 = arg3;
        this.field52 = arg4;
        this.field48 = arg10;
        this.field50 = arg1;
        this.field57 = arg6;
        this.field56 = arg11;
        this.field47 = arg5;
        this.field58 = arg7;
        this.field59 = arg2;
        this.field51 = arg0;
        this.field46 = arg9;
    }
}
