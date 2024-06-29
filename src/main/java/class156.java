import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class156 {

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "J")
    public long field2431 = 0L;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2446 = "Loaded wordpack";

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Lnh;")
    public static class312 field2439 = new class312(64);

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public int field2429;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public int field2432;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public int field2440;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public int field2442;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public int field2444;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public int field2445;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lff;")
    public class4 field2436;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "[[I")
    public static int[][] field2435;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method1139(byte arg0) {
        field2439 = null;
        field2435 = null;
        field2446 = null;
        if (arg0 <= 1) {
            method1142((class270) null, 6);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lke;Z)V")
    public static final void method1140(class248 arg0, boolean arg1) {
        if (class199.field2930 == arg0.field3658 || arg0.field3741 == -1 || arg0.field3677 != 0 || (arg0.field3740 + 1) > class232.method1609((byte) -32, arg0.field3741).field1194[arg0.field3747]) {
            int var2 = arg0.field3658 - arg0.field3682;
            int var3 = class199.field2930 - arg0.field3682;
            int var4 = arg0.field3667 * 128 + arg0.method1467(0) * 64;
            int var5 = arg0.field3754 * 128 + (arg0.method1467(0) * 64);
            int var6 = arg0.field3744 * 128 + arg0.method1467(0) * 64;
            int var7 = arg0.field3725 * 128 + arg0.method1467(0) * 64;
            arg0.field3660 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg0.field3753 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
        }
        if (!arg1) {
            return;
        }
        field2433++;
        arg0.field3675 = 0;
        if (arg0.field3671 == 0) {
            arg0.field3712 = 1024;
        }
        if (arg0.field3671 == 1) {
            arg0.field3712 = 1536;
        }
        if (arg0.field3671 == 2) {
            arg0.field3712 = 0;
        }
        if (arg0.field3671 == 3) {
            arg0.field3712 = 512;
        }
        arg0.field3668 = arg0.field3712;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static final void method1141(int arg0) {
        class40.field531.method1420((byte) -83);
        if (arg0 < 56) {
            method1139((byte) 118);
        }
        class134.field2196.method1420((byte) 119);
        field2428++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Llc;I)V")
    public static final void method1142(class270 arg0, int arg1) {
        class6.field58 = arg0;
        field2434++;
        if (arg1 <= 23) {
            method1140((class248) null, true);
        }
    }
}
