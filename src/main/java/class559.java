import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class559 extends class66 {

    @OriginalMember(owner = "client!kfa", name = "t", descriptor = "I")
    public int field8071;

    @OriginalMember(owner = "client!kfa", name = "u", descriptor = "I")
    public int field8072;

    @OriginalMember(owner = "client!kfa", name = "v", descriptor = "Lrl;")
    public static class672 field8073 = new class672(26, 2);

    @OriginalMember(owner = "client!kfa", name = "q", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!kfa", name = "r", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!kfa", name = "s", descriptor = "I")
    public static int field8070;

    @OriginalMember(owner = "client!kfa", name = "w", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!kfa", name = "x", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZIIBZ)V")
    public static final void method3330(boolean arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        class395.method2551(arg0, arg4, 0, arg1, arg2, -128, class231.field3683.length - 1);
        field8069++;
        if (arg3 > -61) {
            field8075 = -17;
        }
        class11.field187 = 0;
        class691.field9691 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V")
    public static void method3331(byte arg0) {
        if (arg0 <= 110) {
            method3332(123, -105);
        }
        field8073 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)V")
    public static final void method3332(int arg0, int arg1) {
        class315.field4948 = arg0;
        field8070++;
        int var2 = -89 % ((11 - arg1) / 59);
        class177.field2913.method569(0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)Z")
    public static final boolean method3333(int arg0, int arg1, int arg2) {
        int var3 = -6 % ((-arg0 - 38) / 60);
        field8068++;
        return (arg2 & 0x60000) != 0 | class259.method1831(arg2, arg1, true) || class22.method370(arg2, 3314, arg1);
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(II)V")
    public class559(int arg0, int arg1) {
        this.field8071 = arg1;
        this.field8072 = arg0;
    }
}
