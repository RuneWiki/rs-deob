import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class304 extends class204 {

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "Lnp;")
    public static class174 field4413 = new class174(0, -1);

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "Loja;")
    public static class124 field4414 = new class124();

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "F")
    public static float field4415;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lfs;)V", line = 3)
    public class304(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V", line = 9)
    public static void method1980(int arg0) {
        field4413 = null;
        if (arg0 == -1) {
            field4414 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(ILfs;)V", line = 20)
    public class304(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)I", line = 25)
    public final int method1981(byte arg0) {
        ++field4409;
        if (arg0 != -98) {
            this.method488(-81, 53);
        }
        return super.field2852;
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(II)V", line = 36)
    public final void method488(int arg0, int arg1) {
        if (arg1 >= -105) {
            this.method488(29, 55);
        }
        ++field4408;
        super.field2852 = arg0;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 48)
    public final void method486(int arg0) {
        if (arg0 != -4591) {
            field4415 = 0.95334333F;
        }
        ++field4411;
        if (~super.field2852 > -1 && ~super.field2852 < -128) {
            super.field2852 = this.method490((byte) 84);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)I", line = 61)
    public final int method487(int arg0, int arg1) {
        ++field4407;
        int var3 = -34 / ((arg1 - -57) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)I", line = 72)
    public final int method490(byte arg0) {
        if (arg0 < 83) {
            return 60;
        } else {
            ++field4412;
            return 127;
        }
    }
}
