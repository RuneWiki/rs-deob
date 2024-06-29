import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class660 extends class204 {

    @OriginalMember(owner = "client!co", name = "i", descriptor = "Lqk;")
    public static class1 field9290 = new class1(1, 18);

    @OriginalMember(owner = "client!co", name = "o", descriptor = "[I")
    public static int[] field9296 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!co", name = "k", descriptor = "Ljn;")
    public static class134 field9292 = new class134(33, 11);

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field9289;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)I")
    public final int method490(byte arg0) {
        ++field9291;
        if (arg0 <= 83) {
            field9290 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
    public static void method3772(int arg0) {
        field9292 = null;
        field9290 = null;
        field9296 = null;
        if (arg0 != 1) {
            field9290 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lfs;)V")
    public class660(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(II)V")
    public final void method488(int arg0, int arg1) {
        ++field9289;
        if (arg1 > -105) {
            method3772(70);
        }
        super.field2852 = arg0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)I")
    public final int method487(int arg0, int arg1) {
        int var3 = 24 % ((arg1 - -57) / 60);
        ++field9294;
        return 1;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public final void method486(int arg0) {
        ++field9295;
        if (arg0 != -4591) {
            field9290 = null;
        }
        if (super.field2853.method3510(-86) == class389.field5550) {
            super.field2852 = 2;
        }
        if (super.field2852 < 0 || ~super.field2852 < -3) {
            super.field2852 = this.method490((byte) 106);
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(ILfs;)V")
    public class660(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(B)I")
    public final int method3773(byte arg0) {
        ++field9293;
        if (arg0 != -98) {
            this.method3773((byte) -47);
        }
        return super.field2852;
    }
}
