import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class266 extends class27 {

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public static int field4005 = -1;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "Ljava/lang/String;")
    public String field4007;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Ljava/lang/String;")
    public String field4009;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1767(int arg0, boolean arg1) {
        ++field4003;
        if (arg1) {
            return false;
        } else {
            class70.field1114 = true;
            class255.field3885 = 65535 & arg0 + 1;
            return true;
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
    public static final void method1768(int arg0) {
        if (class165.field2537 != null && ~(class165.field2537.field2251 - (-64 + class165.field2537.method676(-30217) * 64) >> 7) == ~class56.field892 && class165.field2537.field2234 + -((-1 + class165.field2537.method676(-30217)) * 64) >> 7 == class225.field3364) {
            class56.field892 = 0;
        }
        int var1 = -69 % ((28 - arg0) / 34);
        for (int var2 = 0; var2 < 104; ++var2) {
            for (int var7 = 0; var7 < 104; ++var7) {
                class187.field2828[var2][var7] = 0;
            }
        }
        ++field4004;
        for (int var3 = 0; ~var3 > ~class141.field2069; ++var3) {
            class107 var6 = class96.field1521[class58.field918[var3]];
            if (var6 != null) {
                var6.field2265 = false;
            }
        }
        for (int var4 = 0; var4 < class24.field295; ++var4) {
            class61 var5 = class18.field220[class169.field2586[var4]];
            if (var5 != null) {
                var5.field2265 = false;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)La;")
    public final class49 method1769(int arg0) {
        if (arg0 != 16518) {
            field4005 = 53;
        }
        ++field4008;
        return class285.field4271[super.field337];
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZI)V")
    public static final void method1770(boolean arg0, int arg1) {
        ++field4010;
        class204.field3067.method1780(arg1, arg0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V")
    public static final void method1771(int arg0, byte arg1) {
        ++field4006;
        if (class294.method1943((byte) 103, arg0)) {
            class56.method379(150, class234.field3532[arg0], -1);
            int var2 = 43 / ((arg1 - 61) / 44);
        }
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)Z")
    public static final boolean method1772(int arg0) {
        ++field4012;
        int var1 = -101 / ((arg0 - -31) / 62);
        return class58.field914;
    }
}
