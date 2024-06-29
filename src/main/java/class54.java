import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class54 extends class120 implements class142 {

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Lkn;")
    public static class530 field688 = new class530("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Lmg;")
    public static class103 field694 = new class103("LIVE", 0);

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
    public final void method451(byte arg0) {
        if (arg0 != -28) {
            this.field693 = -101;
        }
        ++field687;
        super.field1656.method2937(this, false);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)J")
    public final long method452(byte arg0) {
        if (arg0 != 104) {
            this.field693 = 64;
        }
        ++field689;
        return 0L;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V")
    public static final void method453(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field692;
        float var5 = (float) class245.field3571 / (float) class245.field3582;
        int var6 = arg0;
        int var7 = arg1;
        if (!(var5 < (float) arg2)) {
            var6 = (int) ((float) arg1 / var5);
        } else {
            var7 = (int) ((float) arg0 * var5);
        }
        int var8 = arg3 - (arg0 - var6) / 2;
        int var9 = arg4 - (-var7 + arg1) / 2;
        class97.field1278 = -1;
        class421.field5935 = class245.field3571 - class245.field3571 * var9 / var7;
        class307.field4455 = class245.field3582 * var8 / var6;
        class409.field5787 = -1;
        class516.method3066(111);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB[BI)V")
    public final void method454(int arg0, byte arg1, byte[] arg2, int arg3) {
        ++field686;
        if (arg1 == 60) {
            this.method808(arg2, -467059280, arg0);
            this.field693 = arg3;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
    public final int method455(int arg0) {
        if (arg0 != -31267) {
            field688 = null;
        }
        ++field690;
        return this.field693;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)I")
    public final int method456(boolean arg0) {
        ++field691;
        return arg0 ? 44 : super.field1650;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lih;I[BIZ)V")
    public class54(class503 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field693 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
    public static void method457(byte arg0) {
        field694 = null;
        int var1 = 65 % ((arg0 - 49) / 51);
        field688 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)V")
    public static final void method458(byte arg0, int arg1) {
        ++field685;
        if (class340.field4895 != arg1) {
            class43.field494 = class500.field7068 = class206.field2989[arg1];
            class74.method547(50);
            class292.field4265 = new int[4][class43.field494 >> 3][class500.field7068 >> 3];
            class255.field3779 = new int[class43.field494][class500.field7068];
            class508.field7507 = new int[class43.field494][class500.field7068];
            for (int var2 = 0; var2 < 4; ++var2) {
                class143.field1877[var2] = class450.method2633(-24283, class43.field494, class500.field7068);
            }
            class453.field6348 = new byte[4][class43.field494][class500.field7068];
            int var3 = 98 % ((arg0 - 1) / 45);
            class44.method255(class500.field7068, class43.field494, 4, (byte) -78);
            class274.method1724(class385.field5414, class500.field7068 >> 3, class43.field494 >> 3, 5);
            class340.field4895 = arg1;
        }
    }
}
