import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class425 extends class592 {

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lej;")
    public static class694 field5511 = new class694();

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Lme;")
    public static class668 field5516 = new class668(8);

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field5518 = 0;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Ljava/awt/Frame;")
    public static Frame field5520;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method32(int arg0, boolean arg1) {
        super.field8014.method3466(-44, true);
        if (arg0 != -1) {
            this.method27(true, (byte) 11);
        }
        ++field5514;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)V", line = 15)
    public static void method2445(byte arg0) {
        field5511 = null;
        field5520 = null;
        field5516 = null;
        int var1 = -81 / ((arg0 - -3) / 44);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZII)V", line = 28)
    public final void method33(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method33(true, -72, 61);
        }
        ++field5509;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lji;)V", line = 39)
    public class425(class622 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 43)
    public static final void method2446(int arg0) {
        class33.field491.method41(62);
        ++field5517;
        if (arg0 > -47) {
            field5519 = 54;
        }
        class434.field5588.method41(62);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 55)
    public final void method29(int arg0) {
        if (arg0 != -1640) {
            field5520 = null;
        }
        super.field8014.method3466(-83, false);
        ++field5510;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZB)V", line = 66)
    public final void method27(boolean arg0, byte arg1) {
        ++field5513;
        if (arg1 >= -67) {
            this.method35(-105, -113, (class710) null);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILgq;)V", line = 77)
    public final void method35(int arg0, int arg1, class710 arg2) {
        ++field5515;
        if (arg1 == 458752) {
            super.field8014.method3388(arg2, false);
            super.field8014.method3443(arg0, true);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)Z", line = 89)
    public final boolean method30(byte arg0) {
        ++field5512;
        return arg0 >= -90 ? true : true;
    }
}
