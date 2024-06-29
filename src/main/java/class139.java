import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class139 {

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "B")
    public byte field1530;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "S")
    public short field1531;

    @OriginalMember(owner = "client!ida", name = "k", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "Z")
    public boolean field1534;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "S")
    public short field1526;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!ida", name = "l", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "S")
    public short field1533;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "[[I")
    public static int[][] field1527 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "Lgk;")
    public static class616 field1529 = new class616();

    @OriginalMember(owner = "client!ida", name = "m", descriptor = "Lad;")
    public static class19 field1538 = new class19(260);

    @OriginalMember(owner = "client!ida", name = "o", descriptor = "[Lwn;")
    public static class236[] field1540 = new class236[2048];

    @OriginalMember(owner = "client!ida", name = "n", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1532 = arg2;
        this.field1530 = (byte) arg8;
        this.field1531 = (short) arg4;
        this.field1536 = arg0;
        this.field1534 = arg10;
        this.field1526 = (short) arg5;
        this.field1528 = arg3;
        this.field1537 = arg1;
        this.field1535 = arg11;
        this.field1533 = (short) arg6;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Z)V")
    public static void method777(boolean arg0) {
        field1538 = null;
        field1529 = null;
        field1527 = null;
        if (!arg0) {
            field1540 = null;
        }
    }
}
