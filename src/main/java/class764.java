import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class764 extends class407 {

    @OriginalMember(owner = "client!eja", name = "v", descriptor = "[[F")
    public static float[][] field10528 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!eja", name = "r", descriptor = "I")
    public static int field10524;

    @OriginalMember(owner = "client!eja", name = "s", descriptor = "I")
    public static int field10525;

    @OriginalMember(owner = "client!eja", name = "u", descriptor = "I")
    public static int field10527;

    @OriginalMember(owner = "client!eja", name = "x", descriptor = "I")
    public static int field10530;

    @OriginalMember(owner = "client!eja", name = "t", descriptor = "J")
    public static long field10526;

    @OriginalMember(owner = "client!eja", name = "w", descriptor = "Ljd;")
    private class241 field10529;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(IBIZ)V")
    public final void method1920(int arg0, byte arg1, int arg2, boolean arg3) {
        ++field10530;
        if (arg1 != 105) {
            field10528 = null;
        }
        int var5 = this.method2489(arg1 ^ 10105) * super.field5543.field9833 / 10000;
        int[] var6 = new int[4];
        class37.field491.method449(var6);
        class37.field491.method434(arg0, arg2 + 2, arg0 + var5, arg2 - -super.field5543.field9837);
        this.field10529.method1610(arg0, arg2 - -2, super.field5543.field9833, super.field5543.field9837);
        class37.field491.method434(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(IIIZ)V")
    public final void method1919(int arg0, int arg1, int arg2, boolean arg3) {
        class37.field491.method520(arg1 - 2, arg0, super.field5543.field9833 + 4, super.field5543.field9837 - -2, ((class730) super.field5543).field10111, 0);
        ++field10524;
        class37.field491.method520(arg1 + -1, arg0 + 1, super.field5543.field9833 + 2, super.field5543.field9837, 0, 0);
        if (arg2 != 7) {
            this.method1920(-86, (byte) 6, -10, true);
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)V")
    public final void method297(int arg0) {
        ++field10525;
        super.method297(115);
        this.field10529 = class611.method3549(0, super.field5544, ((class730) super.field5543).field10113);
        int var2 = -84 / ((arg0 - 83) / 32);
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(B)Z")
    public final boolean method298(byte arg0) {
        ++field10527;
        return !super.method298(arg0) ? false : super.field5544.method4349((byte) -102, ((class730) super.field5543).field10113);
    }

    @OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Lwia;Lwia;Lno;)V")
    public class764(class791 arg0, class791 arg1, class730 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "(B)V")
    public static void method4232(byte arg0) {
        if (arg0 > -62) {
            method4232((byte) 90);
        }
        field10528 = null;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(JJ)J")
    public static long method4233(long arg0, long arg1) {
        return arg0 ^ arg1;
    }
}
