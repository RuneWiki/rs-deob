import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class357 {

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public int field5058;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public int field5060;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "B")
    public byte field5043;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public int field5042;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public int field5040;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lmd;")
    public class357 field5050;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "[S")
    public static short[] field5056 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public int field5041;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public int field5044;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public int field5045;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field5046;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public int field5049;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public int field5053;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public int field5054;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public int field5059;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 11)
    public static final void method2174(int arg0) {
        field5048++;
        class109 var1 = class110.field1351;
        synchronized (class110.field1351) {
            class318.field4232++;
            class268.field3650 = class67.field687;
            class337.field4493 = class68.field718;
            class306.field4146 = class398.field5742;
            class128.field1657 = class234.field3221;
            class96.field1147 = class208.field2809;
            class341.field4568 = class299.field4080;
            class262.field3580 = class401.field5858;
            if (arg0 != 21553) {
                method2176(67, 27, -12, true, 49);
            }
            class234.field3221 = 0;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 42)
    public static void method2175(boolean arg0) {
        field5056 = null;
        if (arg0) {
            field5057 = 124;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIZI)V", line = 53)
    public static final void method2176(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 >= 66) {
            field5052++;
            if (class262.method1460((byte) -124, arg1)) {
                class8.method38(arg2, class235.field3227[arg1], -1, (byte) -68, arg0, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)Lpi;", line = 70)
    public static final class220 method2177(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5047++;
        class95[] var5 = null;
        if (arg2 != 4550) {
            field5057 = -113;
        }
        class61 var6 = class414.method2572(arg2 ^ 0x11DB, arg1);
        if (var6.field623 != null) {
            var5 = new class95[var6.field623.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class266 var8 = class312.method1818(var6.field623[var7], arg2 - 4520);
                var5[var7] = new class95(var8.field3621, var8.field3618, var8.field3617, var8.field3619, var8.field3620, var8.field3615, var8.field3627, var8.field3625);
            }
        }
        return new class220(var6.field624, var5, var6.field621, arg0, arg3, arg4);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IIIIB)V", line = 112)
    public class357(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field5058 = arg1;
        this.field5060 = arg0;
        this.field5043 = arg4;
        this.field5042 = arg2;
        this.field5040 = arg3;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lmd;I)V", line = 123)
    public class357(class357 arg0, int arg1) {
        this.field5050 = arg0;
        this.field5043 = this.field5050.field5043;
        this.field5040 = this.field5050.field5040 + arg1;
        this.field5042 = this.field5050.field5042 + arg1;
        this.field5060 = this.field5050.field5060;
        this.field5058 = this.field5050.field5058 + arg1;
    }
}
