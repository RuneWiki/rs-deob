import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class44 extends class69 {

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public int field523 = -1;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public int field516 = 0;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Lui;")
    public static class239 field515 = new class239(16);

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Z")
    public static boolean field524 = false;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Ljava/lang/String;")
    public static String field526 = "Select";

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field531 = 0;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public static int field528 = -1;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "[I")
    public static int[] field514;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "[[[I")
    public static int[][][] field521;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
    public static final void method343(int arg0, int arg1) {
        field525++;
        if (arg1 != 16) {
            method344(-72);
        }
        class283 var2 = class46.method360(1, arg1 - 115, arg0);
        var2.method1900(true);
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public static void method344(int arg0) {
        int var1 = -103 % ((arg0 - 40) / 48);
        field515 = null;
        field514 = null;
        field526 = null;
        field521 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lmg;Ljj;Ljj;B)V")
    public static final void method345(class139 arg0, class134 arg1, class134 arg2, byte arg3) {
        if (arg3 <= 116) {
            field528 = 87;
        }
        class110.field1898 = arg2;
        field518++;
        class77.field1058 = arg1;
        class100.field1524 = arg0;
        if (class77.field1058 != null) {
            class204.field3270 = class77.field1058.method948((byte) -97, 1);
        }
        if (class110.field1898 != null) {
            class64.field900 = class110.field1898.method948((byte) -97, 1);
        }
    }
}
