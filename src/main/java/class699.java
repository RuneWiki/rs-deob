import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class699 extends class645 {

    @OriginalMember(owner = "client!sea", name = "Ib", descriptor = "I")
    public static int field9637 = 0;

    @OriginalMember(owner = "client!sea", name = "Jb", descriptor = "[C")
    private static char[] field9638 = new char[64];

    @OriginalMember(owner = "client!sea", name = "Lb", descriptor = "Lej;")
    public static class123 field9640;

    @OriginalMember(owner = "client!sea", name = "Gb", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!sea", name = "Hb", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!sea", name = "Kb", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(I)V")
    public class699(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BII)Z")
    public static final boolean method3966(byte arg0, int arg1, int arg2) {
        ++field9635;
        if (arg0 <= 1) {
            return true;
        } else {
            return (1024 & arg2) != 0;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BF)V")
    public final void method3967(byte arg0, float arg1) {
        ++field9636;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field9068[super.field9084++] = (byte) var3;
        super.field9068[super.field9084++] = (byte) (var3 >> 8);
        super.field9068[super.field9084++] = (byte) (var3 >> 16);
        super.field9068[super.field9084++] = (byte) (var3 >> 24);
        if (arg0 != 38) {
            field9637 = 103;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IF)V")
    public final void method3968(int arg0, float arg1) {
        ++field9639;
        if (arg0 != 724) {
            method3969(false);
        }
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field9068[super.field9084++] = (byte) (var3 >> 24);
        super.field9068[super.field9084++] = (byte) (var3 >> 16);
        super.field9068[super.field9084++] = (byte) (var3 >> 8);
        super.field9068[super.field9084++] = (byte) var3;
    }

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "(Z)V")
    public static void method3969(boolean arg0) {
        field9640 = null;
        if (arg0) {
            field9638 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 26; ++var0) {
            field9638[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field9638[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; ~var2 > -63; ++var2) {
            field9638[var2] = (char) (var2 + 48 + -52);
        }
        field9638[63] = '-';
        field9638[62] = '*';
        field9640 = new class123();
    }
}
