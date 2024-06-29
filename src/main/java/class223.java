import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class223 extends class683 {

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    private int field3268;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    private int field3267;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    private int field3270;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    private int field3277;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "[Lb;")
    public static class204[] field3276;

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIII)V")
    public class223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3268 = arg2;
        this.field3267 = arg0;
        this.field3270 = arg3;
        this.field3277 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static final void method1528(byte arg0) {
        ++field3269;
        class478 var1 = (class478) class752.field10463.method3731((byte) -70);
        if (arg0 >= 28) {
            while (var1 != null) {
                class326 var2 = var1.field6576;
                if (!var2.field4611) {
                    if (var2.field4614 <= class594.field8494) {
                        var2.method1984((byte) -106, class662.field9326);
                        if (var2.field4611) {
                            var1.method4237(-1);
                        } else {
                            class630.method3597(var2, true);
                        }
                    }
                } else {
                    var1.method4237(-1);
                    var2.method1981(19716);
                }
                var1 = (class478) class752.field10463.method3729((byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZI)V")
    public final void method269(int arg0, boolean arg1, int arg2) {
        ++field3271;
        int var4 = this.field3267 * arg2 >> 12;
        int var5 = this.field3268 * arg2 >> 12;
        int var6 = this.field3277 * arg0 >> 12;
        int var7 = this.field3270 * arg0 >> 12;
        class133.method1107(var7, var5, var4, (byte) -44, super.field9678, var6);
        if (!arg1) {
            field3276 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
    public static final int method1529(int arg0) {
        if (arg0 >= -86) {
            field3276 = null;
        }
        ++field3273;
        return class265.field3732;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
    public final void method267(int arg0, int arg1, int arg2) {
        ++field3274;
        if (arg1 != 1) {
            this.field3270 = -77;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static void method1530(int arg0) {
        if (arg0 > 103) {
            field3276 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZII)V")
    public final void method268(boolean arg0, int arg1, int arg2) {
        ++field3275;
        if (!arg0) {
            method1529(-106);
        }
        int var4 = this.field3267 * arg2 >> 12;
        int var5 = this.field3268 * arg2 >> 12;
        int var6 = this.field3277 * arg1 >> 12;
        int var7 = this.field3270 * arg1 >> 12;
        class544.method3152(var5, var4, super.field9679, super.field9678, var7, var6, super.field9680, -96);
    }
}
