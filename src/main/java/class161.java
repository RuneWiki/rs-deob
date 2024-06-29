import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class class161 {

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "[Z")
    public static boolean[] field2247 = new boolean[5];

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "Lno;")
    public static class420 field2245 = new class420(64);

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Lsg;")
    public static class226 field2246;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "[[B")
    public static byte[][] field2249;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
    public abstract void method1064(boolean arg0);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static void method1065(int arg0) {
        field2245 = null;
        field2246 = null;
        if (arg0 != 5) {
            field2246 = null;
        }
        field2247 = null;
        field2249 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)Z")
    public abstract boolean method1066(byte arg0);

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)Z")
    public final boolean method1067(int arg0) {
        field2248++;
        if (arg0 != 5) {
            field2249 = null;
        }
        return this.method1066((byte) 103) || this.method1072((byte) -13) || this.method1070(19822);
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)I")
    public abstract int method1068(byte arg0);

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(Z)V")
    public abstract void method1069(boolean arg0);

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)Z")
    public abstract boolean method1070(int arg0);

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)I")
    public abstract int method1071(byte arg0);

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(B)Z")
    public abstract boolean method1072(byte arg0);

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "(B)Lum;")
    public abstract class307 method1073(byte arg0);
}
