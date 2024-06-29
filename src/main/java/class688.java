import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class688 extends class601 {

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field9717 = 0;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Ldh;")
    public static class320 field9711 = new class320(34, -1);

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field9712;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field9716;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Ljj;")
    public static class118 field9708;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Loh;")
    public static class404 field9715;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Lvi;")
    public static class537 field9714;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method3889(int arg0, int arg1, int arg2) {
        ++field9709;
        if (arg0 <= 60) {
            field9715 = null;
        }
        return (arg1 & 544) == 544 | (24 & arg1) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Z", line = 23)
    public final boolean method3890(int arg0) {
        if (arg0 != -9242) {
            return true;
        } else {
            ++field9707;
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)I", line = 34)
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            return -110;
        } else {
            ++field9716;
            return ~arg0 != -1 && super.field8563.field9845.method3265(-121) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lgn;)V", line = 49)
    public class688(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V", line = 56)
    public final void method40(int arg0, boolean arg1) {
        ++field9712;
        super.field8565 = arg0;
        if (arg1) {
            field9711 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I", line = 67)
    public final int method39(byte arg0) {
        ++field9706;
        if (arg0 != -17) {
            method3894(-119);
        }
        return 1;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ILgn;)V", line = 78)
    public class688(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Llga;)V", line = 84)
    public static final void method3891(class710 arg0) {
        class36.field387 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 88)
    public final void method35(byte arg0) {
        ++field9705;
        if (~super.field8565 != -1 && super.field8563.field9845.method3265(11) != 1) {
            super.field8565 = 0;
        }
        if (super.field8565 < 0 || super.field8565 > 1) {
            super.field8565 = this.method39((byte) -17);
        }
        if (arg0 >= -37) {
            method3889(-55, 96, 8);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)I", line = 106)
    public final int method3892(int arg0) {
        ++field9713;
        int var2 = 90 % ((arg0 - -59) / 61);
        return super.field8565;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V", line = 116)
    public static final void method3893(int arg0) {
        for (class649 var1 = (class649) class265.field3289.method1719(65280); var1 != null; var1 = (class649) class265.field3289.method1723(-20665)) {
            if (class228.method1318(var1.field9270, (byte) -81)) {
                class326.method1945(var1, -101);
            }
        }
        if (arg0 != 1) {
            field9711 = null;
        }
        ++field9710;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V", line = 137)
    public static void method3894(int arg0) {
        field9711 = null;
        if (arg0 != 9277) {
            method3893(-91);
        }
        field9715 = null;
        field9714 = null;
        field9708 = null;
    }
}
