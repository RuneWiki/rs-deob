import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class480 extends class134 {

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "Lufa;")
    public static class680 field6631;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        ++field6630;
        super.field1708 = arg1;
        int var3 = 121 % ((-26 - arg0) / 41);
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(ILkda;)V")
    public class480(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        if (arg0 != 0) {
            field6629 = -27;
        }
        ++field6633;
        return !super.field1712.method2282((byte) 111) ? 0 : 1;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)I")
    public final int method2692(byte arg0) {
        ++field6627;
        if (arg0 <= 119) {
            field6631 = null;
        }
        return super.field1708;
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(I)V")
    public static void method2693(int arg0) {
        field6631 = null;
        if (arg0 != 8) {
            method2693(15);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        super.field1708 = this.method58(0);
        if (arg0 < 118) {
            this.method60((byte) 28);
        }
        ++field6626;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZLac;)V")
    public static final void method2694(boolean arg0, class541 arg1) {
        if (class171.field2135 == null) {
            class92 var2 = new class92();
            byte[] var3 = var2.method646(16, 20283, 128, 128);
            class171.field2135 = class41.method248(2, var3, false);
        }
        ++field6628;
        if (class707.field9897 == null) {
            class705 var4 = new class705();
            byte[] var5 = var4.method3973(true, 128, 16, 128);
            class707.field9897 = class41.method248(2, var5, false);
        }
        class104 var6 = arg1.field7533;
        if (var6.method710(arg0) && class106.field1415 == null) {
            byte[] var7 = class492.method2756(-31633, 16.0F, 0.5F, 0.6F, 16, 8, 128, new class546(419684), 4.0F, 4.0F, 128);
            class106.field1415 = class41.method248(2, var7, false);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6632;
        class189 var8 = null;
        for (class189 var9 = (class189) class56.field574.method724(32); var9 != null; var9 = (class189) class56.field574.method723(122)) {
            if (~var9.field2273 == ~arg7 && ~var9.field2269 == ~arg1 && var9.field2270 == arg3 && ~var9.field2275 == ~arg4) {
                var8 = var9;
                break;
            }
        }
        if (var8 == null) {
            var8 = new class189();
            var8.field2270 = arg3;
            var8.field2275 = arg4;
            var8.field2273 = arg7;
            var8.field2269 = arg1;
            if (arg1 >= 0 && ~arg3 <= -1 && ~arg1 > ~class272.field3589 && ~arg3 > ~class3.field26) {
                class756.method4208((byte) 109, var8);
            }
            class56.field574.method725(var8, -20911);
        }
        int var10 = 24 % ((arg0 - 39) / 58);
        var8.field2279 = arg2;
        var8.field2281 = false;
        var8.field2271 = arg5;
        var8.field2280 = true;
        var8.field2277 = arg6;
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        if (arg1 != 29053) {
            field6631 = null;
        }
        ++field6625;
        return 3;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lkda;)V")
    public class480(class391 arg0) {
        super(arg0);
    }
}
