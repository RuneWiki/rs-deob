import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class84 extends class64 {

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public int field1530;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "J")
    public static long field1533 = 0L;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field1531 = 0;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "Ltc;")
    public static class178 field1536 = null;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field1535 = 0;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "[I")
    public static int[] field1538;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method624(int arg0) {
        field1536 = null;
        if (arg0 != 26675) {
            method625(-64, false, -91);
        }
        field1538 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZI)I")
    public static final int method625(int arg0, boolean arg1, int arg2) {
        field1529++;
        if (!arg1) {
            method626((class230) null, -125, 44);
        }
        int var3 = class60.method378(arg0 - 1, -1, arg2 - 1) + class60.method378(arg0 - 1, -1, arg2 + 1) + class60.method378(arg0 + 1, -1, arg2 + -1) + class60.method378(arg0 - -1, -1, arg2 + 1);
        int var4 = class60.method378(arg0, -1, arg2 - 1) + (class60.method378(arg0, -1, arg2 + 1) + class60.method378(arg0 - 1, -1, arg2)) + class60.method378(arg0 + 1, -1, arg2);
        int var5 = class60.method378(arg0, -1, arg2);
        return var3 / 16 + var5 / 4 + (var4 / 8);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lal;II)[Lch;")
    public static final class282[] method626(class230 arg0, int arg1, int arg2) {
        if (arg1 > -96) {
            field1533 = 44L;
        }
        field1534++;
        return class39.method226(arg0, arg2, -116) ? class191.method1298(74) : null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(II)V")
    public class84(int arg0, int arg1) {
        this.field1530 = arg1;
        this.field1532 = arg0;
    }
}
