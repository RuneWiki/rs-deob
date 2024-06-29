import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public abstract class class173 extends class255 {

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "[I")
    public static int[] field2190 = new int[1];

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
    public static int field2193 = -1;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "Lvaa;")
    public static class579 field2192;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "[[Z")
    public static boolean[][] field2191;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V", line = 3)
    public static void method1104(byte arg0) {
        field2192 = null;
        field2191 = null;
        if (arg0 == -73) {
            field2190 = null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)Ljka;")
    public abstract class734 method1105(int arg0);
}
