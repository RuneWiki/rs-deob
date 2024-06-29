import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class314 extends class305 {

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "[I")
    public static int[] field4453 = new int[2048];

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[Lbs;")
    public static class689[] field4456 = new class689[2048];

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        ++field4458;
        return arg0 != 68 ? 1 : 1;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        ++field4457;
        if (arg0 >= -40) {
            field4453 = null;
        }
        if (~super.field4320 != -2 && super.field4320 != 0) {
            super.field4320 = this.method305((byte) 68);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)Lfa;")
    public static final class235 method1988(boolean arg0, int arg1) {
        ++field4452;
        if (arg0) {
            return null;
        } else {
            class235[] var2 = class361.method2248(6434);
            for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                if (var2[var3].field3412 == arg1) {
                    return var2[var3];
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLefa;Lefa;)V")
    public static final void method1989(byte arg0, class184 arg1, class184 arg2) {
        if (arg0 != 100) {
            method1989((byte) 11, (class184) null, (class184) null);
        }
        ++field4454;
        if (arg2.field2819 != null) {
            arg2.method1304((byte) 7);
        }
        arg2.field2819 = arg1.field2819;
        arg2.field2812 = arg1;
        arg2.field2819.field2812 = arg2;
        arg2.field2812.field2819 = arg2;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        super.field4320 = arg1;
        ++field4459;
        if (arg0 != -27751) {
            method1991((byte) 28);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)I")
    public final int method1990(int arg0) {
        ++field4460;
        if (arg0 != 17503) {
            field4456 = null;
        }
        return super.field4320;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(ILhb;)V")
    public class314(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lhb;)V")
    public class314(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        if (arg0 != 31401) {
            return 30;
        } else {
            ++field4455;
            return 1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)V")
    public static void method1991(byte arg0) {
        if (arg0 == 54) {
            field4453 = null;
            field4456 = null;
        }
    }
}
