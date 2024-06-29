import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class409 extends class201 {

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "Z")
    public static boolean field5592 = false;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "Lhu;")
    private class131 field5590;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public final void method11(int arg0) {
        ++field5594;
        super.method11(arg0);
        this.field5590 = class563.method3280(super.field2379, 0, ((class324) super.field2375).field4142);
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(B)V")
    public static final void method2512(byte arg0) {
        if (arg0 != -30) {
            method2512((byte) -110);
        }
        class123.field1291.method3549(0);
        ++field5589;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIII)V")
    public final void method869(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = 10 / ((-69 - arg3) / 42);
        ++field5595;
        class275.field3370.method399(arg2 + -2, arg1, super.field2375.field1249 + 4, super.field2375.field1250 + 2, ((class324) super.field2375).field4135, 0);
        class275.field3370.method399(arg2 + -1, arg1 + 1, super.field2375.field1249 - -2, super.field2375.field1250, 0, 0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIIZ)V")
    public final void method867(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field5593;
        if (arg3) {
            int var5 = this.method1212(100) * super.field2375.field1249 / 10000;
            int[] var6 = new int[4];
            class275.field3370.method354(var6);
            class275.field3370.method432(arg1, arg2 - -2, arg1 - -var5, super.field2375.field1250 + arg2);
            this.field5590.method819(arg1, arg2 + 2, super.field2375.field1249, super.field2375.field1250);
            class275.field3370.method432(var6[0], var6[1], var6[2], var6[3]);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)Z")
    public final boolean method9(byte arg0) {
        ++field5591;
        return !super.method9(arg0) ? false : super.field2379.method2463((byte) 117, ((class324) super.field2375).field4142);
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Loh;Loh;Lvv;)V")
    public class409(class404 arg0, class404 arg1, class324 arg2) {
        super(arg0, arg1, arg2);
    }
}
