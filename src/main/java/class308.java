import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class308 {

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Z")
    public static boolean field4926 = false;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[J")
    public static long[] field4928 = new long[32];

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Lqd;")
    public static class173 field4923 = new class173(100);

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field4930 = 0;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4931 = new String[200];

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[Lbl;")
    public static class146[] field4927;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[[I")
    public static int[][] field4922;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "[[[B")
    public static byte[][][] field4929;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZBI)V")
    public static final void method2059(int arg0, boolean arg1, byte arg2, int arg3) {
        field4925++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class262.field4214 = arg1;
        class133.field2103 = arg0;
        if (arg2 > 108) {
            class168.field2738 = arg3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method2060(int arg0) {
        field4929 = null;
        field4922 = null;
        field4928 = null;
        field4931 = null;
        field4923 = null;
        field4927 = null;
        if (arg0 != -30526) {
            method2059(46, false, (byte) 78, 34);
        }
    }
}
