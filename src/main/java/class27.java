import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class27 extends class152 implements class26 {

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client!fba", name = "w", descriptor = "[I")
    public static int[] field515;

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "[C")
    public static char[] field511;

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "D")
    public static double field513;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!fba", name = "v", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "Lod;")
    public static class534 field516;

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "Ldm;")
    public static class58 field512;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z[BII)V")
    public final void method175(boolean arg0, byte[] arg1, int arg2, int arg3) {
        this.method1197(arg2, arg1, 0);
        ++field506;
        this.field507 = arg3;
        if (arg0) {
            field515 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)I")
    public final int method174(int arg0) {
        ++field514;
        if (arg0 != -2163) {
            this.method173(1);
        }
        return super.field2504;
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)V")
    public final void method177(int arg0) {
        super.field2494.method938(this, (byte) -121);
        ++field508;
        if (arg0 != -22194) {
            field516 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V")
    public static void method178(int arg0) {
        field516 = null;
        field511 = null;
        field512 = null;
        if (arg0 != -14799) {
            field513 = -0.524184270963195D;
        }
        field515 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)J")
    public final long method173(int arg0) {
        int var2 = 71 / ((47 - arg0) / 57);
        ++field517;
        return 0L;
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)I")
    public final int method176(int arg0) {
        ++field509;
        if (arg0 <= 97) {
            this.method176(104);
        }
        return this.field507;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)I")
    public static final int method179(int arg0, int arg1) {
        return class603.field8438 != null ? class603.field8438[arg0][arg1] & 255 : 0;
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lhk;I[BIZ)V")
    public class27(class111 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field507 = arg1;
    }

    static {
        new BitSet(65536);
        field515 = new int[2];
        field510 = 0;
        field511 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    }
}
