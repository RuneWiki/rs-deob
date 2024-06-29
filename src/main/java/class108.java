import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 extends class137 {

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "[B")
    public byte[] field2648;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "Lbd;")
    public static class12 field2631 = new class12(4096);

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "[[[I")
    public static int[][][] field2636 = new int[4][105][105];

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field2639 = 0;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field2633 = 0;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "Laf;")
    public static class7 field2644 = class48.method406(40, "p12_full");

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "Laf;")
    public static class7 field2635 = class48.method406(40, ")3runescape)3com");

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field2634 = 0;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field2646 = 0;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Lkb;")
    public static class71 field2640;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "Z")
    public static boolean field2647;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "[[[B")
    public static byte[][][] field2643;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static void method862(int arg0) {
        field2636 = null;
        field2643 = null;
        field2631 = null;
        field2635 = null;
        field2644 = null;
        if (arg0 != 0) {
            field2635 = null;
        }
        field2640 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILkb;Lkb;Lkb;Lkd;)Z")
    public static final boolean method863(int arg0, class71 arg1, class71 arg2, class71 arg3, class73 arg4) {
        class67.field1463 = arg3;
        int var5 = 14 / ((-arg0 - 59) / 48);
        class155.field3606 = arg2;
        field2638++;
        class48.field1172 = arg1;
        class3.field22 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Laf;Laf;Laf;II)V")
    public static final void method864(class7 arg0, class7 arg1, class7 arg2, int arg3, int arg4) {
        for (int var5 = 99; var5 > 0; var5--) {
            class42.field996[var5] = class42.field996[var5 - 1];
            class106.field2598[var5] = class106.field2598[var5 - 1];
            class120.field2839[var5] = class120.field2839[var5 - 1];
            class80.field1849[var5] = class80.field1849[var5 - 1];
        }
        class42.field996[0] = arg4;
        class106.field2598[0] = arg0;
        if (arg3 < 0) {
            class68.field1485 = class69.field1508;
            field2632++;
            class120.field2839[0] = arg1;
            class80.field1849[0] = arg2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([B)V")
    public class108(byte[] arg0) {
        this.field2648 = arg0;
    }
}
