import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class183 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Ldj;")
    public static class44 field3180 = class89.method650(255, "lila:");

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Ldj;")
    private static class44 field3184 = class89.method650(255, "Login");

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Ldj;")
    public static class44 field3182 = field3184;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3183 = 0;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field3191 = 0;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "J")
    public long field3186;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Lnf;")
    public static class147 field3187;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lrb;")
    public class183 field3193;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Lrb;")
    public class183 field3195;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[Lmc;")
    public static class134[] field3188;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z")
    public final boolean method1146(byte arg0) {
        if (arg0 == 96) {
            field3190++;
            return this.field3193 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method1147(int arg0) {
        field3180 = null;
        field3182 = null;
        field3187 = null;
        if (arg0 >= -49) {
            method1151(-100, -71, (byte) -40, null);
        }
        field3184 = null;
        field3188 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public final void method1148(int arg0) {
        field3192++;
        if (this.field3193 == null) {
            return;
        }
        this.field3193.field3195 = this.field3195;
        this.field3195.field3193 = this.field3193;
        this.field3195 = null;
        this.field3193 = null;
        if (arg0 != -13215) {
            method1147(115);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIILwd;IJZ)Z")
    public static final boolean method1149(int arg0, int arg1, int arg2, int arg3, int arg4, class234 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class143.method947(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I")
    public static final int method1150(int arg0, int arg1) {
        field3185++;
        return arg0 <= 21 ? 74 : arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIBLvc;)V")
    public static final void method1151(int arg0, int arg1, byte arg2, class223 arg3) {
        field3189++;
        if (class235.field4364 != null || class58.field1086 || (arg3 == null || class111.method789(56, arg3) == null)) {
            return;
        }
        class235.field4364 = arg3;
        class61.field1148 = class111.method789(43, arg3);
        class213.field3824 = arg0;
        class215.field3919 = arg1;
        class205.field3669 = 0;
        if (arg2 > 47) {
            class112.field2018 = false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lve;B)V")
    public static final void method1152(class225 arg0, byte arg1) {
        class58.field1091 = arg0;
        field3194++;
        if (arg1 < 5) {
            field3188 = null;
        }
    }
}
