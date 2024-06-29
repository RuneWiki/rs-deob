import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class353 {

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "J")
    private long field5130 = -1L;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "Lqw;")
    private class84 field5126 = new class84();

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field5128 = 0;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "[I")
    public static int[] field5133 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "J")
    private long field5131;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public static final void method2244(int arg0) {
        field5132++;
        if (class554.field7645 == class135.field1836) {
            return;
        }
        try {
            class376.method2358(class723.field9821, 3860, "tbrefresh");
        } catch (Throwable var1) {
        }
        if (arg0 != 2) {
            field5128 = 33;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lhr;I)V")
    public final void method2245(class551 arg0, int arg1) {
        field5129++;
        if (this.field5131 != arg0.field2146 || this.field5130 != arg0.field7596) {
            throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.field2146 + " updateNum:" + arg0.field7596 + " delta.clanHash:" + this.field5131 + " updateNum:" + this.field5130);
        }
        for (class683 var3 = (class683) this.field5126.method679((byte) -86); var3 != null; var3 = (class683) this.field5126.method681(-50)) {
            var3.method1668(arg0, (byte) -60);
        }
        arg0.field7596++;
        if (arg1 != 3) {
            method2244(43);
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
    public static void method2246(int arg0) {
        field5133 = null;
        if (arg0 != 0) {
            field5128 = 124;
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Ldt;)V")
    public class353(class254 arg0) {
        this.method2247(-2, arg0);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILdt;)V")
    private final void method2247(int arg0, class254 arg1) {
        this.field5131 = arg1.method1723(21795);
        field5127++;
        this.field5130 = arg1.method1723(arg0 ^ 0xFFFFAADD);
        if (arg0 != -2) {
            this.method2247(-125, null);
        }
        for (int var3 = arg1.method1731((byte) 64); var3 != 0; var3 = arg1.method1731((byte) 64)) {
            class683 var4;
            if (var3 == 1) {
                var4 = new class253();
            } else if (var3 == 4) {
                var4 = new class772();
            } else if (var3 == 3) {
                var4 = new class454();
            } else if (var3 == 2) {
                var4 = new class273();
            } else {
                throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
            }
            var4.method1666(arg1, arg0 ^ 0x6F);
            this.field5126.method689(var4, -107);
        }
    }
}
