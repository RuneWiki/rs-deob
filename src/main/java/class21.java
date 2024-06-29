import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class21 extends class296 {

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Ljf;")
    public static class216 field272 = new class216(4);

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field275 = 0;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Ljava/lang/String;")
    public static String field277 = "level: ";

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "J")
    public static long field278 = 0L;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Leb;")
    public static class109 field280;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lfe;")
    public static class231 field273;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "[Ldh;")
    public static class158[] field276;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V")
    public static void method117(byte arg0) {
        field280 = null;
        if (arg0 != 46) {
            method118(-67, -100, -86, false, -8);
        }
        field273 = null;
        field272 = null;
        field276 = null;
        field277 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIZI)V")
    public static final void method118(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class68.method453(false, -29397);
        if (arg4 <= 39) {
            return;
        }
        class83.field1263 = arg3;
        class33.field392 = arg2;
        class286.field4633 = arg0;
        field274++;
        class207.method1442(arg1);
        class264.field4288 = new class153(8);
        class146.field2184 = new class153(8);
    }
}
