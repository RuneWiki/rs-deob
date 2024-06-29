import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class14 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Z")
    public static volatile boolean field128 = false;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field131 = 0;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lph;")
    public static class114 field130 = new class114(64);

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field136 = null;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "[[I")
    public static int[][] field135 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lmk;")
    public static class154 field134 = new class154();

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "F")
    public static float field129;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static final void method64(byte arg0) {
        class162.field2073.method606((byte) 107);
        field133++;
        if (arg0 <= -108) {
            class321.field4295.method606((byte) 123);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method65(int arg0) {
        field136 = null;
        field135 = null;
        field134 = null;
        if (arg0 > 94) {
            field130 = null;
        }
    }
}
