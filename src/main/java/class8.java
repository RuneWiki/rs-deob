import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class270 implements class597 {

    @OriginalMember(owner = "client!to", name = "s", descriptor = "Z")
    public static boolean field69 = false;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "[[I")
    public static int[][] field68 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!to", name = "y", descriptor = "C")
    public char field75;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "J")
    public long field74;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(B)V")
    public static void method36(byte arg0) {
        field68 = null;
        if (arg0 != -117) {
            field69 = false;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)I")
    public final int method37(byte arg0) {
        if (arg0 >= -7) {
            field70 = -89;
        }
        field63++;
        return this.field67;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)I")
    public final int method38(int arg0) {
        field66++;
        if (arg0 != 19888) {
            this.field64 = 1;
        }
        return this.field64;
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)I")
    public final int method39(int arg0) {
        if (arg0 != 9576) {
            field68 = null;
        }
        field72++;
        return this.field65;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)J")
    public final long method40(int arg0) {
        field73++;
        if (arg0 != 7270) {
            field70 = -109;
        }
        return this.field74;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)C")
    public final char method41(int arg0) {
        field71++;
        if (arg0 < 102) {
            this.field64 = 100;
        }
        return this.field75;
    }
}
