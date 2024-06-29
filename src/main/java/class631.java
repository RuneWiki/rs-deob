import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class631 extends class324 {

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "Z")
    public boolean field9097;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public int field9096;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public int field9104;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public int field9102;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "Ljava/lang/String;")
    public String field9101;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "Z")
    public boolean field9105;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "J")
    public long field9099;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "Ljava/lang/String;")
    public String field9107;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public int field9103;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public int field9100;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "Lea;")
    public static class474 field9106 = new class474("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V", line = 5)
    public static void method3611(byte arg0) {
        if (arg0 == -86) {
            field9106 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIZI)V", line = 22)
    public static final void method3612(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field9098++;
        if (class227.method1477(arg0, arg4)) {
            class313.method2062(arg1, arg3, class297.field4403[arg0], 0, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 36)
    public class631(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field9097 = arg9;
        this.field9096 = arg7;
        this.field9104 = arg4;
        this.field9102 = arg2;
        this.field9101 = arg0;
        this.field9105 = arg8;
        this.field9099 = arg5;
        this.field9107 = arg1;
        this.field9103 = arg6;
        this.field9100 = arg3;
    }
}
