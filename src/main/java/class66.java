import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class66 {

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public int field948 = 1;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "Lrb;")
    public static class283 field952 = new class283(104, 19);

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "[I")
    public static int[] field955 = new int[64];

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "Z")
    public static boolean field954 = false;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "C")
    public char field951;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "J")
    public static long field957;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lsv;II)V")
    private final void method429(class319 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field951 = class294.method1703(arg0.method1894(-2018), -833419040);
        } else if (arg2 == 2) {
            this.field948 = 0;
        }
        field949++;
        if (arg1 <= 7) {
            this.field948 = -111;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILsv;)V")
    public final void method430(int arg0, class319 arg1) {
        if (arg0 != -1) {
            return;
        }
        field946++;
        while (true) {
            int var3 = arg1.method1869(-84);
            if (var3 == 0) {
                return;
            }
            this.method429(arg1, 64, var3);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public static final void method431(int arg0) {
        field950++;
        class258.method1534(true, class275.field3737, (long) class28.field417);
        if (class236.field3268 != -1) {
            class137.method976(class236.field3268, (byte) -80);
        }
        for (int var1 = 0; var1 < class293.field3963; var1++) {
            if (class428.field6214[var1]) {
                class259.field3517[var1] = true;
            }
            class225.field3178[var1] = class428.field6214[var1];
            class428.field6214[var1] = false;
        }
        class255.field3478 = class28.field417;
        if (class275.field3737.method551()) {
            class416.field6038 = true;
        }
        if (arg0 > -34) {
            field955 = null;
        }
        if (class236.field3268 != -1) {
            class293.field3963 = 0;
            class224.method1394((byte) -36);
        }
        class275.field3737.method477();
        class511.method3032(class275.field3737, (byte) -18);
        int var2 = class123.method897(-3);
        if (var2 == -1) {
            var2 = class358.field5165;
        }
        if (var2 == -1) {
            var2 = class275.field3733;
        }
        class9.method63(var2, 11363);
        class71.field1026 = 0;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
    public static void method432(int arg0) {
        if (arg0 == 1) {
            field955 = null;
            field952 = null;
        }
    }
}
