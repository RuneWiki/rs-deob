import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class420 extends class450 {

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "Lhda;")
    public static class752 field5782 = new class752(96, 10);

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field5783 = 0;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "Lvfa;")
    public static class672 field5787 = null;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)I", line = 3)
    public final int method2432(boolean arg0) {
        if (!arg0) {
            this.method75(-31, 46);
        }
        ++field5784;
        return super.field6170;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)I", line = 14)
    public final int method68(boolean arg0) {
        if (arg0) {
            return -128;
        } else {
            ++field5788;
            return 127;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lup;)V", line = 25)
    public class420(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 31)
    public final void method73(byte arg0) {
        if (arg0 != 98) {
            this.method68(false);
        }
        ++field5780;
        if (super.field6170 < 0 && super.field6170 > 127) {
            super.field6170 = this.method68(false);
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V", line = 45)
    public static void method2433(int arg0) {
        if (arg0 < 87) {
            field5787 = null;
        }
        field5787 = null;
        field5782 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)V", line = 58)
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        if (!arg0) {
            this.method68(false);
        }
        ++field5781;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)I", line = 73)
    public final int method75(int arg0, int arg1) {
        ++field5786;
        if (arg0 != 0) {
            this.method75(-21, -47);
        }
        return 1;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V", line = 89)
    public static final void method2434(byte arg0) {
        class640.method3500(22050, class411.field5711.field3875.method3931(true) == 1, 2, false);
        ++field5785;
        class453.field6187 = class578.method3168(0, 22050, class295.field4217, (byte) 27, class66.field828);
        int var1 = -107 % ((arg0 - 34) / 38);
        class75.method606(true, class729.method4091((byte) -123, (class3) null), true);
        class507.field6770 = class578.method3168(1, 2048, class295.field4217, (byte) 27, class66.field828);
        class603.field7927 = new class266();
        class507.field6770.method1796(class603.field7927, 98);
        class383.field5318 = new class298(22050, class405.field5646);
        class390.method2314(false);
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(ILup;)V", line = 106)
    public class420(int arg0, class278 arg1) {
        super(arg0, arg1);
    }
}
