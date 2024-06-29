import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class382 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Liv;")
    public static class64 field5780 = new class64(6, -1);

    @OriginalMember(owner = "client!el", name = "g", descriptor = "[I")
    public static int[] field5785 = new int[2];

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public int field5781;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public int field5782;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public int field5786;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Z")
    public boolean field5783;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I[S[Ljava/lang/String;)V", line = 10)
    public static final void method2374(int arg0, short[] arg1, String[] arg2) {
        if (arg0 == 11698) {
            class296.method1879(arg1, 0, arg2, arg2.length - 1, (byte) 59);
            field5779++;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V", line = 21)
    public static final void method2375(int arg0, int arg1) {
        field5784++;
        class54 var2 = class442.method2651(arg0, arg1, -13208);
        var2.method476((byte) -44);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 35)
    public static void method2376(int arg0) {
        field5780 = null;
        if (arg0 != 0) {
            method2376(-82);
        }
        field5785 = null;
    }
}
