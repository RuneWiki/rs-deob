import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class70 extends class450 {

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "Lwn;")
    public static class724 field854;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
    public static int[] field849;

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(ILup;)V", line = 3)
    public class70(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lup;)V", line = 6)
    public class70(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V", line = 10)
    public static void method572(int arg0) {
        field849 = null;
        if (arg0 == 2) {
            field854 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII)V", line = 25)
    public static final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field851;
        int var5 = class696.field9696;
        int var6 = class678.field9469;
        if (class24.field412) {
            var5 += class367.method2167(-2);
            var6 += class672.method3717((byte) -19);
        }
        if (class21.field389 == 1) {
            class133 var7 = class405.field5640[class680.field9505 / 100];
            var7.method1035(var5 + -8, var6 + -8);
            class62.method539(var7.method1036() + -8 + var5, var5 + -8, (byte) -61, var7.method1048() + var6 - 8, var6 + -8);
        }
        if (~class21.field389 == -3) {
            class133 var8 = class405.field5640[class680.field9505 / 100 + 4];
            var8.method1035(var5 - 8, var6 + -8);
            class62.method539(var5 - (8 + -var8.method1036()), var5 + -8, (byte) -127, var6 - 8 + var8.method1048(), var6 + -8);
        }
        class702.method3954((byte) 88);
        if (arg0 != -3267) {
            field849 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)I", line = 66)
    public final int method68(boolean arg0) {
        ++field847;
        return arg0 ? 59 : 1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V", line = 77)
    public final void method67(boolean arg0, int arg1) {
        ++field850;
        super.field6170 = arg1;
        if (!arg0) {
            field854 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)I", line = 89)
    public final int method75(int arg0, int arg1) {
        ++field853;
        if (super.field6171.method1672(arg0)) {
            return 3;
        } else {
            return arg1 != 0 && ~super.field6171.field3900.method1182(true) != -2 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)I", line = 106)
    public final int method574(boolean arg0) {
        if (!arg0) {
            field854 = null;
        }
        ++field852;
        return super.field6170;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 120)
    public final void method73(byte arg0) {
        if (arg0 != 98) {
            field854 = null;
        }
        if (super.field6171.method1672(0)) {
            super.field6170 = 0;
        }
        ++field846;
        if (super.field6170 < 0 && super.field6170 > 2) {
            super.field6170 = this.method68(false);
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)Z", line = 136)
    public final boolean method575(int arg0) {
        ++field848;
        if (arg0 != 260) {
            field849 = null;
        }
        return !super.field6171.method1672(0);
    }
}
