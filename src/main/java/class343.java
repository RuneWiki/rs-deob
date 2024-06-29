import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class343 extends class404 {

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    private int field4405;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    private int field4408;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    private int field4403;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    private int field4412;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Z")
    public static boolean field4404 = false;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4411 = null;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Lor;")
    public static class232 field4402;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "[I")
    public static int[] field4400;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V", line = 4)
    public final void method1910(int arg0, int arg1, int arg2) {
        if (arg1 == -21716) {
            ++field4410;
            int var4 = this.field4405 * arg0 >> 12;
            int var5 = this.field4412 * arg0 >> 12;
            int var6 = this.field4403 * arg2 >> 12;
            int var7 = this.field4408 * arg2 >> 12;
            class332.method1884(super.field5067, var7, var6, var4, arg1 ^ -25060, var5);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIIII)V", line = 24)
    public class343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4405 = arg0;
        this.field4408 = arg3;
        this.field4403 = arg1;
        this.field4412 = arg2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI)V", line = 36)
    public final void method1911(int arg0, byte arg1, int arg2) {
        ++field4406;
        int var4 = this.field4405 * arg0 >> 12;
        int var5 = this.field4412 * arg0 >> 12;
        if (arg1 != -34) {
            this.method1911(-121, (byte) -103, 78);
        }
        int var6 = this.field4403 * arg2 >> 12;
        int var7 = this.field4408 * arg2 >> 12;
        class512.method2763(var4, var5, super.field5067, var6, var7, false, super.field5064, super.field5068);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)V", line = 56)
    public final void method1912(int arg0, int arg1, int arg2) {
        ++field4407;
        int var4 = this.field4405 * arg1 >> 12;
        int var5 = this.field4412 * arg1 >> 12;
        int var6 = this.field4403 * arg0 >> 12;
        if (arg2 != 4) {
            field4402 = null;
        }
        int var7 = this.field4408 * arg0 >> 12;
        class37.method228(var5, var6, super.field5064, var7, 376, super.field5068, var4);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBIII)I", line = 77)
    public static final int method1913(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field4409;
        int var5 = arg0 & 15;
        if (arg1 != 116) {
            method1913(5, (byte) 36, 17, 88, 17);
        }
        int var6 = ~var5 > -9 ? arg4 : arg2;
        int var7 = ~var5 <= -5 ? (var5 != 12 && var5 != 14 ? arg3 : arg4) : arg2;
        return ((1 & var5) == 0 ? var6 : -var6) - -((2 & var5) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 100)
    public static void method1914(int arg0) {
        field4411 = null;
        if (arg0 == -9) {
            field4402 = null;
            field4400 = null;
        }
    }
}
