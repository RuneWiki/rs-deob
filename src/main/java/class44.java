import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class44 extends class260 {

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "S")
    public short field537;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[I")
    public static int[] field533 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "[I")
    public static int[] field534 = new int[5];

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static final void method411(byte arg0) {
        class274.field3764 = 0;
        field536++;
        class526.field7778.method2814((byte) 98);
        class181.field2659 = false;
        if (arg0 != 53) {
            field534 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)V")
    public static final void method412(int arg0, byte arg1, int arg2) {
        field531++;
        int var3 = -19 % ((arg1 - 41) / 61);
        if (class90.field1316 != arg2) {
            class448.field6606 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class448.field6606[var4] = (var4 << 12) / arg2;
            }
            class380.field5559 = arg2 * 32;
            class99.field1490 = arg2 - 1;
            class90.field1316 = arg2;
        }
        if (class508.field7537 == arg0) {
            return;
        }
        if (class90.field1316 == arg0) {
            class328.field4484 = class448.field6606;
        } else {
            class328.field4484 = new int[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                class328.field4484[var5] = (var5 << 12) / arg0;
            }
        }
        class183.field2683 = arg0 - 1;
        class508.field7537 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
    public static final void method413(byte arg0) {
        field532++;
        if (arg0 != 6) {
            field534 = null;
        }
        if (class504.field7426.toLowerCase().indexOf("microsoft") != -1) {
            class86.field1269[192] = 58;
            class86.field1269[189] = 26;
            class86.field1269[187] = 27;
            class86.field1269[186] = 57;
            class86.field1269[222] = 59;
            class86.field1269[219] = 42;
            class86.field1269[188] = 71;
            class86.field1269[220] = 74;
            class86.field1269[190] = 72;
            class86.field1269[191] = 73;
            class86.field1269[223] = 28;
            class86.field1269[221] = 43;
            return;
        }
        if (class504.field7432 == null) {
            class86.field1269[222] = 59;
            class86.field1269[192] = 58;
        } else {
            class86.field1269[192] = 28;
            class86.field1269[222] = 58;
            class86.field1269[520] = 59;
        }
        class86.field1269[46] = 72;
        class86.field1269[44] = 71;
        class86.field1269[47] = 73;
        class86.field1269[91] = 42;
        class86.field1269[45] = 26;
        class86.field1269[59] = 57;
        class86.field1269[92] = 74;
        class86.field1269[61] = 27;
        class86.field1269[93] = 43;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(CI)Z")
    public static final boolean method414(char arg0, int arg1) {
        field535++;
        if (arg1 != 48) {
            method415(false);
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static void method415(boolean arg0) {
        field533 = null;
        field534 = null;
        if (!arg0) {
            field533 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class44() {
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(S)V")
    public class44(short arg0) {
        this.field537 = arg0;
    }
}
