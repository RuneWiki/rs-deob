import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class306 {

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field4997 = 0;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Lnm;")
    public static class221 field4999;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "[[I")
    public static int[][] field4998;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([I[JI)V", line = 5)
    public static final void method2140(int[] arg0, long[] arg1, int arg2) {
        field5001++;
        class13.method99(arg0, arg1, false, arg2, arg1.length - 1);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)I", line = 28)
    public static final int method2141(byte arg0, int arg1) {
        if (arg0 != -108) {
            field4997 = 127;
        }
        field4996++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 40)
    public static void method2142(int arg0) {
        field4998 = (int[][]) null;
        field4999 = null;
        if (arg0 < 67) {
            method2140((int[]) null, (long[]) null, -113);
        }
    }
}
