import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class80 extends class601 {

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "Ljava/lang/String;")
    public static String field835 = "";

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(ILgn;)V", line = 4)
    public class80(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)I", line = 10)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            field835 = null;
        }
        ++field842;
        return 0;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V", line = 26)
    public static void method563(int arg0) {
        field835 = null;
        if (arg0 != 3) {
            field839 = 51;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V", line = 37)
    public final void method35(byte arg0) {
        ++field836;
        int var2 = super.field8563.method3928((byte) -128).method970((byte) -112);
        if (var2 < 96) {
            super.field8565 = 0;
        }
        if (super.field8565 > 1 && var2 < 128) {
            super.field8565 = 1;
        }
        if (~super.field8565 < -3 && var2 < 192) {
            super.field8565 = 2;
        }
        if (arg0 < -37) {
            if (super.field8565 < 0 || super.field8565 > 3) {
                super.field8565 = this.method39((byte) -17);
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(II)I", line = 66)
    public final int method34(int arg0, int arg1) {
        ++field841;
        int var3 = super.field8563.method3928((byte) -128).method970((byte) -85);
        if (arg1 != 15706) {
            this.method35((byte) 7);
        }
        if (~var3 > -97) {
            return 3;
        } else if (arg0 > 1 && var3 < 128) {
            return 3;
        } else {
            return arg0 > 3 && var3 < 192 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)Z", line = 88)
    public final boolean method564(int arg0) {
        ++field838;
        if (arg0 != -9242) {
            return true;
        } else {
            int var2 = super.field8563.method3928((byte) -126).method970((byte) -76);
            return var2 >= 96;
        }
    }

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)I", line = 105)
    public final int method565(int arg0) {
        ++field840;
        int var2 = 118 / ((-59 - arg0) / 61);
        return super.field8565;
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lgn;)V", line = 115)
    public class80(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLtp;)V", line = 119)
    public static final void method566(byte arg0, class532 arg1) {
        ++field837;
        class532 var2 = class235.method1393((byte) -109, arg1);
        int var3 = 37 / ((arg0 - 67) / 52);
        int var4;
        int var5;
        if (var2 == null) {
            var4 = class476.field6777;
            var5 = class705.field9926;
        } else {
            var4 = var2.field7573;
            var5 = var2.field7658;
        }
        class299.method1769(false, var5, -81, var4, arg1);
        class30.method153(-3334, arg1, var4, var5);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZ)V", line = 146)
    public final void method40(int arg0, boolean arg1) {
        if (arg1) {
            this.method34(-120, 98);
        }
        super.field8565 = arg0;
        ++field834;
    }
}
