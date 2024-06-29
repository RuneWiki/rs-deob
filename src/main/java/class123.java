import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class123 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field2200 = 0;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lda;")
    private static class275 field2199 = class255.method1672(116, "Unable to find ");

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lda;")
    public static class275 field2198 = field2199;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field2203 = 0;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lne;")
    public static class137 field2202 = new class137(50);

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lda;")
    public static class275 field2206 = class255.method1672(115, "");

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lvh;")
    public static class163 field2201;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[[[B")
    public static byte[][][] field2207;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method893(int arg0) {
        field2199 = null;
        if (arg0 != 0) {
            field2199 = null;
        }
        field2201 = null;
        field2206 = null;
        field2202 = null;
        field2207 = null;
        field2198 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)[B")
    public abstract byte[] method894(byte arg0);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[B)V")
    public abstract void method895(int arg0, byte[] arg1);
}
