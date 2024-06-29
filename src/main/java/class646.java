import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class646 {

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public int field8990 = class336.method1997(120);

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public int field8989;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public int field8992;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public int field8993;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "Ljava/lang/String;")
    public String field8986;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "Ljava/lang/String;")
    public String field8994;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "Ljava/lang/String;")
    public String field8985;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "Ljava/lang/String;")
    public String field8996;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "Ljava/lang/String;")
    public String field8987;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public int field8988;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "Ljava/applet/Applet;")
    public static Applet field8991;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V", line = 4)
    public final void method3642(int arg0, String arg1, String arg2, String arg3, int arg4, String arg5, int arg6, String arg7, int arg8) {
        field8995++;
        this.field8990 = class336.method1997(arg8 ^ 0xFFFF868F);
        this.field8985 = arg3;
        this.field8988 = arg4;
        this.field8994 = arg1;
        this.field8987 = arg5;
        this.field8992 = class406.field5732;
        this.field8989 = arg0;
        if (arg8 != -30991) {
            this.field8989 = -72;
        }
        this.field8993 = arg6;
        this.field8996 = arg7;
        this.field8986 = arg2;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V", line = 24)
    public static void method3643(int arg0) {
        field8991 = null;
        if (arg0 != -11535) {
            field8991 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 47)
    public class646(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field8989 = arg6;
        this.field8992 = class406.field5732;
        this.field8993 = arg0;
        this.field8986 = arg2;
        this.field8994 = arg7;
        this.field8985 = arg5;
        this.field8996 = arg4;
        this.field8987 = arg3;
        this.field8988 = arg1;
    }
}
