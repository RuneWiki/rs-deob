import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class119 extends class137 {

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lhh;")
    public class163 field2239;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Lhh;")
    public static class163 field2242 = class137.method1065("<)4col> x", 17);

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Z")
    public static boolean field2247 = true;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "Lhh;")
    private static class163 field2245 = class137.method1065("M", 17);

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Lhh;")
    public static class163 field2249 = field2245;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lhh;")
    public static class163 field2240 = class137.method1065(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 17);

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lhh;")
    public static class163 field2246 = field2245;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "[I")
    public static int[] field2252 = new int[2000];

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Lhh;")
    public static class163 field2244 = class137.method1065(" ", 17);

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Lne;")
    public static class94 field2248;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "[[I")
    public static int[][] field2243;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "[[[B")
    public static byte[][][] field2241;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)V")
    public static final void method937(int arg0, boolean arg1) {
        class89.field1639.method112(arg0, 111);
        field2250++;
        if (arg1) {
            field2245 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class119() {
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public static void method938(int arg0) {
        field2243 = null;
        field2246 = null;
        field2252 = null;
        field2245 = null;
        field2248 = null;
        field2240 = null;
        field2241 = null;
        field2242 = null;
        field2244 = null;
        field2249 = null;
        if (arg0 > -44) {
            method937(-58, false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lhh;)V")
    public class119(class163 arg0) {
        this.field2239 = arg0;
    }
}
