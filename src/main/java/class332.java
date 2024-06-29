import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class332 {

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lgd;")
    public static class325 field5182 = new class325(32);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[S")
    public static short[] field5183;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[[[B")
    public static byte[][][] field5184;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 5)
    public static void method2331(int arg0) {
        field5183 = null;
        field5182 = null;
        if (arg0 != 32) {
            method2331(-64);
        }
        field5184 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 18)
    public static final String method2332(int arg0, long arg1) {
        if (arg0 != -31648) {
            method2331(83);
        }
        field5181++;
        return class65.method520(-121, arg1);
    }
}
