import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class677 extends class212 {

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "Lmu;")
    public static class303 field9203 = new class303(89, 0);

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)I", line = 3)
    public final int method422(int arg0) {
        ++field9200;
        return arg0 != 20014 ? 63 : 1;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)V", line = 14)
    public final void method418(boolean arg0) {
        if (super.field3006 != 1 && ~super.field3006 != -1) {
            super.field3006 = this.method422(20014);
        }
        ++field9198;
        if (arg0) {
            field9204 = 59;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)V", line = 28)
    public final void method419(int arg0, int arg1) {
        ++field9202;
        super.field3006 = arg1;
        int var3 = 126 / ((82 - arg0) / 35);
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Ldh;)V", line = 39)
    public class677(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "(I)I", line = 42)
    public final int method3809(int arg0) {
        if (arg0 != -32350) {
            method3810(84);
        }
        ++field9199;
        return super.field3006;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(ILdh;)V", line = 55)
    public class677(int arg0, class322 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "(I)V", line = 60)
    public static void method3810(int arg0) {
        field9203 = null;
        if (arg0 != 1) {
            field9203 = null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(II)I", line = 72)
    public final int method417(int arg0, int arg1) {
        ++field9201;
        if (arg0 != 3) {
            field9204 = -121;
        }
        return 1;
    }
}
