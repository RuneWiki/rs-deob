import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class696 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public int field9234 = class135.method945(31635);

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public int field9238;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Ljava/lang/String;")
    public String field9235;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Ljava/lang/String;")
    public String field9242;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Ljava/lang/String;")
    public String field9237;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Ljava/lang/String;")
    public String field9232;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Ljava/lang/String;")
    public String field9236;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public int field9239;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public int field9231;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public int field9233;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field9243 = 1406;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;)V")
    public final void method3786(String arg0, String arg1, String arg2, int arg3, int arg4, int arg5, int arg6, String arg7, String arg8) {
        field9240++;
        this.field9234 = class135.method945(arg6 + 7782);
        this.field9236 = arg2;
        this.field9237 = arg0;
        this.field9235 = arg1;
        this.field9238 = arg4;
        this.field9239 = class572.field7788;
        if (arg6 == 23853) {
            this.field9231 = arg5;
            this.field9242 = arg7;
            this.field9233 = arg3;
            this.field9232 = arg8;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class696(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field9238 = arg0;
        this.field9235 = arg4;
        this.field9242 = arg5;
        this.field9237 = arg7;
        this.field9232 = arg3;
        this.field9236 = arg2;
        this.field9239 = class572.field7788;
        this.field9231 = arg6;
        this.field9233 = arg1;
    }
}
