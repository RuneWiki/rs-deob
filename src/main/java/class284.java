import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class284 {

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public int field3982 = class296.method1840((byte) -98);

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Ljava/lang/String;")
    public String field3975;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Ljava/lang/String;")
    public String field3977;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Ljava/lang/String;")
    public String field3980;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Ljava/lang/String;")
    public String field3984;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public int field3972;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Ljava/lang/String;")
    public String field3978;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lkd;")
    public static class700 field3974;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", line = 3)
    public final void method1755(String arg0, int arg1, int arg2, String arg3, String arg4, int arg5, int arg6, String arg7, String arg8) {
        field3979++;
        this.field3982 = class296.method1840((byte) -126);
        this.field3972 = class148.field2508;
        this.field3976 = arg6;
        this.field3984 = arg7;
        this.field3983 = arg2;
        this.field3975 = arg8;
        if (arg1 == -22301) {
            this.field3977 = arg0;
            this.field3973 = arg5;
            this.field3978 = arg3;
            this.field3980 = arg4;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIIII)V", line = 29)
    public static final void method1756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3981++;
        class316.field4374[class576.field8442++] = new class302(arg7, arg4, arg8, arg3, arg3, arg8, arg2, arg0, arg0, arg2, arg5, arg5, arg6, arg6);
        if (arg1 != -13159) {
            method1756(-27, 16, -78, 117, 79, 68, 99, -39, 39);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 40)
    public static void method1757(byte arg0) {
        if (arg0 == 6) {
            field3974 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 57)
    public class284(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field3976 = arg1;
        this.field3975 = arg3;
        this.field3973 = arg0;
        this.field3977 = arg7;
        this.field3980 = arg5;
        this.field3984 = arg2;
        this.field3972 = class148.field2508;
        this.field3983 = arg6;
        this.field3978 = arg4;
    }
}
