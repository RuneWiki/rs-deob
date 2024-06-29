import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class583 extends class268 {

    @OriginalMember(owner = "client!jv", name = "Fb", descriptor = "Lbv;")
    public static class567 field8314 = new class567(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!jv", name = "Gb", descriptor = "I")
    public static int field8315 = 0;

    @OriginalMember(owner = "client!jv", name = "Jb", descriptor = "[F")
    public static float[] field8318 = new float[16];

    @OriginalMember(owner = "client!jv", name = "Ib", descriptor = "I")
    public static int field8317 = 0;

    @OriginalMember(owner = "client!jv", name = "Db", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!jv", name = "Eb", descriptor = "I")
    public static int field8313;

    @OriginalMember(owner = "client!jv", name = "Hb", descriptor = "[[B")
    public static byte[][] field8316;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IF)V")
    public final void method3338(int arg0, float arg1) {
        if (arg0 == -1325457552) {
            ++field8312;
            int var3 = Stream.floatToRawIntBits(arg1);
            super.field3952[super.field3913++] = (byte) var3;
            super.field3952[super.field3913++] = (byte) (var3 >> 8);
            super.field3952[super.field3913++] = (byte) (var3 >> 16);
            super.field3952[super.field3913++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(I)V")
    public class583(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(FI)V")
    public final void method3339(float arg0, int arg1) {
        ++field8313;
        int var3 = Stream.floatToRawIntBits(arg0);
        if (arg1 != -9720) {
            field8318 = null;
        }
        super.field3952[super.field3913++] = (byte) (var3 >> 24);
        super.field3952[super.field3913++] = (byte) (var3 >> 16);
        super.field3952[super.field3913++] = (byte) (var3 >> 8);
        super.field3952[super.field3913++] = (byte) var3;
    }

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "(I)V")
    public static void method3340(int arg0) {
        field8314 = null;
        if (arg0 != -968305224) {
            method3340(120);
        }
        field8316 = null;
        field8318 = null;
    }
}
