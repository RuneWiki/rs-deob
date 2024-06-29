import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class76 extends class23 {

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field1342 = 0;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "Ldc;")
    private static class37 field1341 = class185.method1233((byte) 86, "Click to switch");

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "Ldc;")
    public static class37 field1343 = field1341;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    public static int field1346 = 0;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "Ldc;")
    private static class37 field1340 = class185.method1233((byte) 86, "Login limit exceeded)3");

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Ldc;")
    public static class37 field1338 = field1340;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "Lwa;")
    public static class238 field1347;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class76() {
        super(0, true);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZII)I")
    private final int method527(boolean arg0, int arg1, int arg2) {
        ++field1348;
        if (!arg0) {
            field1347 = null;
        }
        int var4 = arg1 - -(arg2 * 57);
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * var5 * 15731 + 789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(III)I")
    public static final int method528(int arg0, int arg1, int arg2) {
        if (arg0 < 106) {
            method529((class238) null, 35, 103, 40, (class238) null);
        }
        ++field1344;
        int var3 = 1;
        while (arg1 > 1) {
            if (~(1 & arg1) != -1) {
                var3 = arg2 * var3;
            }
            arg1 >>= 1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lwa;IIILwa;)Lig;")
    public static final class93 method529(class238 arg0, int arg1, int arg2, int arg3, class238 arg4) {
        ++field1345;
        if (!class192.method1278(arg0, 0, arg3, arg2)) {
            return null;
        } else {
            if (arg1 != 21095) {
                method528(-18, 20, -34);
            }
            return class35.method291(arg4.method1547(arg2, 0, arg3), false);
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(B)V")
    public static void method530(byte arg0) {
        if (arg0 < -67) {
            field1341 = null;
            field1338 = null;
            field1347 = null;
            field1343 = null;
            field1340 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        int[] var3 = super.field405.method1461(arg1, (byte) -126);
        ++field1339;
        if (super.field405.field4114) {
            int var4 = class167.field3196[arg1];
            for (int var5 = 0; ~class199.field3705 < ~var5; ++var5) {
                var3[var5] = this.method527(true, class133.field2477[var5], var4) % 4096;
            }
        }
        if (arg0 != 0) {
            field1342 = -87;
        }
        return var3;
    }
}
