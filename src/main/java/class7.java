import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class7 extends class83 {

    @OriginalMember(owner = "client!fp", name = "T", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client!fp", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field66 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!fp", name = "S", descriptor = "I")
    public static int field68 = 0;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!fp", name = "N", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!fp", name = "O", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!fp", name = "R", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!fp", name = "U", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!fp", name = "V", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(B)V", line = 3)
    public static void method31(byte arg0) {
        field66 = null;
        if (arg0 != 63) {
            field66 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(II)V", line = 13)
    public static final void method32(int arg0, int arg1) {
        if (arg0 == arg1) {
            class443.field6450 = 3.0F;
        } else if (arg1 == 50) {
            class443.field6450 = 4.0F;
        } else if (arg1 != 75) {
            if (~arg1 == -101) {
                class443.field6450 = 8.0F;
            } else if (~arg1 == -201) {
                class443.field6450 = 16.0F;
            }
        } else {
            class443.field6450 = 6.0F;
        }
        ++field67;
        class68.field715 = -1;
        class68.field715 = -1;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V", line = 44)
    public class7() {
        this(4096);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIII)I", line = 47)
    public static final int method33(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field70;
        if (~var4 == -1) {
            return arg3;
        } else if (~var4 == -2) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return -arg3 + 7;
        } else {
            if (arg2 != 7) {
                method34((class285) null, (byte) -43);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I)V", line = 70)
    public class7(int arg0) {
        super(0, true);
        this.field69 = 4096;
        this.field69 = arg0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lio;B)Z", line = 78)
    public static final boolean method34(class285 arg0, byte arg1) {
        if (arg1 != 116) {
            field62 = 1;
        }
        ++field63;
        class225 var2 = class281.method1655((byte) -28, arg0.method356(arg1 + 10281));
        if (~var2.field2986 == 0) {
            return true;
        } else {
            class339 var3 = class315.method1827(var2.field2986, (byte) 102);
            return var3.field4527 == -1 ? true : var3.method1976(23423);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBLtq;)V", line = 107)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = 49 % ((-27 - arg1) / 50);
        if (~arg0 == -1) {
            this.field69 = (arg2.method1350(31351) << 12) / 255;
        }
        ++field60;
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(II)I", line = 142)
    public static final int method36(int arg0, int arg1) {
        return class116.field1450 != null ? class116.field1450[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)[I", line = 153)
    public final int[] method37(int arg0, int arg1) {
        ++field61;
        int[] var3 = super.field916.method1813(arg1, (byte) 124);
        if (arg0 != 2) {
            this.method35(84, (byte) -6, (class250) null);
        }
        if (super.field916.field4174) {
            class358.method2180(var3, 0, class420.field6139, this.field69);
        }
        return var3;
    }
}
