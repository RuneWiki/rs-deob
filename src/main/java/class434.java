import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class434 {

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public int field5909 = class779.method4269(true);

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "Ljava/lang/String;")
    public String field5901;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "Ljava/lang/String;")
    public String field5907;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public int field5899;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public int field5906;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "Ljava/lang/String;")
    public String field5910;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public int field5898;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public int field5904;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "Ljava/lang/String;")
    public String field5911;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "Ljava/lang/String;")
    public String field5908;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "[B")
    public static byte[] field5900 = new byte[2048];

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "Lvl;")
    public static class15 field5902 = new class15(13, 6);

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "Lsk;")
    public static class650 field5905;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;BLjava/lang/String;ILjava/lang/String;)V")
    public final void method2540(String arg0, int arg1, String arg2, int arg3, String arg4, byte arg5, String arg6, int arg7, String arg8) {
        field5897++;
        this.field5909 = class779.method4269(true);
        this.field5904 = class440.field5977;
        this.field5910 = arg0;
        this.field5906 = arg1;
        this.field5911 = arg4;
        this.field5901 = arg8;
        this.field5898 = arg7;
        this.field5908 = arg6;
        this.field5907 = arg2;
        this.field5899 = arg3;
        if (arg5 != -33) {
            field5912 = 56;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZ)V")
    public static final void method2541(int arg0, boolean arg1) {
        if (class384.field5207 == null || class384.field5207.length < arg0) {
            class384.field5207 = new int[arg0];
        }
        field5896++;
        if (!arg1) {
            field5903 = 51;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static void method2542(int arg0) {
        field5902 = null;
        field5905 = null;
        if (arg0 < 40) {
            field5902 = null;
        }
        field5900 = null;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class434(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field5901 = arg2;
        this.field5907 = arg3;
        this.field5899 = arg1;
        this.field5906 = arg6;
        this.field5910 = arg4;
        this.field5898 = arg0;
        this.field5904 = class440.field5977;
        this.field5911 = arg5;
        this.field5908 = arg7;
    }
}
