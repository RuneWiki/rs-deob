import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class664 {

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field9290 = 0;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "Lad;")
    public static class19 field9289 = new class19(8);

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "[[[B")
    public static byte[][][] field9292;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 3)
    public static void method3685(int arg0) {
        if (arg0 != 0) {
            method3686(null, (byte) 26, null);
        }
        field9292 = null;
        field9289 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "([Ljava/lang/String;B[S)V", line = 16)
    public static final void method3686(String[] arg0, byte arg1, short[] arg2) {
        class526.method2964(arg0.length - 1, 0, arg2, arg0, (byte) -86);
        if (arg1 != 83) {
            field9290 = 108;
        }
        field9291++;
    }
}
