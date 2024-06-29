import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class649 {

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public int field8930 = class494.method2904((byte) 53);

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Ljava/lang/String;")
    public String field8927;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public int field8931;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Ljava/lang/String;")
    public String field8932;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Ljava/lang/String;")
    public String field8924;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Ljava/lang/String;")
    public String field8921;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public int field8929;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Ljava/lang/String;")
    public String field8923;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public int field8926;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public int field8925;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field8920 = 0;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field8934 = 0;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "[Lea;")
    public static class546[] field8933;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[[[Les;")
    public static class384[][][] field8928;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method3675(byte arg0) {
        if (arg0 < 73) {
            method3675((byte) 61);
        }
        field8928 = null;
        field8933 = null;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class649(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field8927 = arg7;
        this.field8931 = arg0;
        this.field8932 = arg3;
        this.field8924 = arg4;
        this.field8921 = arg5;
        this.field8929 = class641.field8810;
        this.field8923 = arg2;
        this.field8926 = arg1;
        this.field8925 = arg6;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
    public final void method3676(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, int arg6, String arg7, String arg8) {
        this.field8930 = class494.method2904((byte) -91);
        field8935++;
        this.field8932 = arg3;
        this.field8923 = arg7;
        this.field8929 = class641.field8810;
        this.field8924 = arg2;
        this.field8931 = arg0;
        this.field8921 = arg4;
        this.field8927 = arg8;
        this.field8926 = arg1;
        if (arg5 != -18691) {
            this.field8926 = -83;
        }
        this.field8925 = arg6;
    }
}
