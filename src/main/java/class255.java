import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class255 extends class273 {

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "Ljd;")
    public static class86 field4536 = class122.method868(" <col=ffff00>", true);

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "Luk;")
    public static class96 field4528 = new class96(50);

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public static int field4539 = 0;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    private int field4530;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    private int field4531;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    private int field4532;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "Lbj;")
    public static class151 field4535;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "[I")
    public static int[] field4537;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(B)V")
    public static void method1725(byte arg0) {
        field4528 = null;
        field4537 = null;
        field4535 = null;
        field4536 = null;
        int var1 = -17 % ((-24 - arg0) / 53);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int[][] var3 = super.field4787.method1657(arg0, (byte) -78);
        ++field4534;
        int var4 = -98 / ((12 - arg1) / 58);
        if (super.field4787.field4355) {
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class176.field3200; ++var8) {
                var6[var8] = this.field4532;
                var5[var8] = this.field4530;
                var7[var8] = this.field4531;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class255() {
        this(0);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)V")
    private final void method1726(int arg0, int arg1) {
        this.field4530 = (65280 & arg0) >> 4;
        this.field4532 = arg0 >> 12 & 4080;
        this.field4531 = (255 & arg0) << 4;
        ++field4533;
        if (arg1 > -20) {
            this.method29(104, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
    private class255(int arg0) {
        super(0, false);
        this.method1726(arg0, -35);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field4529;
        if (~arg0 == -1) {
            this.method1726(arg1.method1405(-3), -112);
        }
        if (arg2 > -16) {
            this.method1726(2, 16);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1727(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class82.field1611 = (short) arg1;
        if (arg5 < -42) {
            class115.field2194 = (short) arg3;
            ++field4538;
        }
    }
}
