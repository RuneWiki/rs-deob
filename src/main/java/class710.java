import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class710 {

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public int field10008 = class489.method2926(82);

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Ljava/lang/String;")
    public String field10002;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public int field10000;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public int field10006;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Ljava/lang/String;")
    public String field9998;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Ljava/lang/String;")
    public String field10007;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public int field9996;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Ljava/lang/String;")
    public String field10001;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public int field9997;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Ljava/lang/String;")
    public String field10005;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Z")
    public static boolean field9999 = false;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "[I")
    public static int[] field10009 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field10003;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field10004;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public final void method4039(String arg0, int arg1, int arg2, String arg3, byte arg4, String arg5, String arg6, String arg7, int arg8) {
        field10004++;
        this.field10008 = class489.method2926(-49);
        this.field10001 = arg6;
        this.field10007 = arg7;
        this.field9996 = arg2;
        this.field10000 = class357.field5189;
        if (arg4 <= 75) {
            this.field10002 = null;
        }
        this.field10002 = arg0;
        this.field9998 = arg3;
        this.field9997 = arg1;
        this.field10005 = arg5;
        this.field10006 = arg8;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static void method4040(byte arg0) {
        if (arg0 >= 80) {
            field10009 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class710(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field10002 = arg7;
        this.field10000 = class357.field5189;
        this.field10006 = arg1;
        this.field9998 = arg2;
        this.field10007 = arg3;
        this.field9996 = arg0;
        this.field10001 = arg4;
        this.field9997 = arg6;
        this.field10005 = arg5;
    }
}
