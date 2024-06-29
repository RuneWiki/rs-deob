import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class208 extends class33 {

    @OriginalMember(owner = "client!va", name = "X", descriptor = "Lrd;")
    public static class173 field4050 = class133.method843("floorshadows", -121);

    @OriginalMember(owner = "client!va", name = "W", descriptor = "Lrd;")
    public static class173 field4049 = class133.method843("", 118);

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "Lrd;")
    public static class173 field4051 = class133.method843("Benutzen Sie die (WPasswort -=ndern(W Option", -68);

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field4045 = 0;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
    public static int field4057 = 4;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "[I")
    public static int[] field4044 = new int[field4057];

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "Lrd;")
    public static class173 field4052 = field4049;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "[[Lmg;")
    public static class126[][] field4056 = new class126[field4057][500];

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "Lwb;")
    public static class218 field4053;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "[Ldh;")
    public static class39[] field4041;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "[[[B")
    public static byte[][][] field4054;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "[[[Lkf;")
    public static class105[][][] field4055;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field4048;
        int var3 = -117 / ((arg1 - -65) / 60);
        int[] var4 = super.field718.method514(arg0, -31);
        if (super.field718.field1615) {
            int var5 = class105.field1937[arg0];
            for (int var6 = 0; ~var6 > ~class117.field2173; ++var6) {
                var4[var6] = this.method1377(var5, 8064, class138.field2585[var6]) % 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lbc;Lbc;Z)V")
    public static final void method1375(class14 arg0, class14 arg1, boolean arg2) {
        class110.field2043 = arg1;
        ++field4042;
        class46.field956 = arg0;
        if (!arg2) {
            field4055 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZIIII)V")
    public static final void method1376(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            method1375((class14) null, (class14) null, true);
        }
        if (class37.field790 <= arg2 && arg2 <= class20.field445) {
            int var5 = class68.method421(arg3, class194.field3778, 48, class96.field1766);
            int var6 = class68.method421(arg4, class194.field3778, 82, class96.field1766);
            class168.method1084(var6, arg2, (byte) 92, arg1, var5);
        }
        ++field4040;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(III)I")
    private final int method1377(int arg0, int arg1, int arg2) {
        ++field4046;
        if (arg1 != 8064) {
            return -1;
        } else {
            int var4 = arg0 * 57 + arg2;
            int var5 = var4 << 1 ^ var4;
            return -(((var5 * 15731 * var5 + 789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
    public static void method1378(int arg0) {
        field4041 = null;
        field4056 = null;
        if (arg0 != -118615391) {
            method1376(false, -115, -36, -41, -102);
        }
        field4052 = null;
        field4050 = null;
        field4054 = null;
        field4049 = null;
        field4055 = null;
        field4044 = null;
        field4053 = null;
        field4051 = null;
    }
}
