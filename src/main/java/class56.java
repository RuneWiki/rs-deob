import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class56 extends class151 {

    @OriginalMember(owner = "client!f", name = "u", descriptor = "[B")
    public byte[] field950;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "Lmb;")
    public static class132 field944 = class166.method1092("", 118);

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Lmb;")
    public static class132 field948 = class166.method1092(")3)3)3", 116);

    @OriginalMember(owner = "client!f", name = "v", descriptor = "[J")
    public static long[] field951 = new long[100];

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Lmb;")
    public static class132 field946 = class166.method1092("W-=hlen Sie eine Welt", 111);

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Lmb;")
    public static class132 field952 = class166.method1092("k", 118);

    @OriginalMember(owner = "client!f", name = "A", descriptor = "[Lli;")
    public static class128[] field956 = new class128[6];

    @OriginalMember(owner = "client!f", name = "y", descriptor = "Lmb;")
    public static class132 field954 = class166.method1092("Der Server wird gerade aktualisiert)3", 122);

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lpb;")
    public static class165 field945;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "[[[B")
    public static byte[][][] field955;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)I")
    public static final int method380(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field947++;
        if (arg4 != -14446) {
            method381((byte) 57);
        }
        int var5 = 65536 - class50.field851[arg3 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
    public static void method381(byte arg0) {
        field946 = null;
        field956 = null;
        field944 = null;
        field948 = null;
        field955 = null;
        field952 = null;
        if (arg0 < -55) {
            field945 = null;
            field951 = null;
            field954 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B)V")
    public class56(byte[] arg0) {
        this.field950 = arg0;
    }
}
