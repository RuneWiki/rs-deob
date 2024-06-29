import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class39 extends class134 {

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Ltw;")
    public static class204 field405;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)I", line = 6)
    public static final int method189(int arg0, int arg1, int arg2) {
        ++field408;
        int var3 = arg1 >>> 31;
        return arg0 != 749908671 ? -120 : (arg1 + var3) / arg2 + -var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I", line = 19)
    public final int method58(int arg0) {
        ++field399;
        return arg0 != 0 ? 11 : 1;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(ILkda;)V", line = 31)
    public class39(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 37)
    public static void method190(int arg0) {
        if (arg0 != 3) {
            method191(61, 91, -74, 72);
        }
        field405 = null;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lkda;)V", line = 47)
    public class39(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 50)
    public final void method55(int arg0, int arg1) {
        ++field402;
        int var3 = -10 / ((-26 - arg0) / 41);
        super.field1708 = arg1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V", line = 60)
    public static final void method191(int arg0, int arg1, int arg2, int arg3) {
        ++field401;
        class252 var4 = class150.method916(arg0, -98, 9);
        var4.method1502((byte) -103);
        var4.field3251 = arg3;
        var4.field3247 = arg1;
        int var5 = 123 % ((arg2 - 43) / 57);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)Z", line = 74)
    public final boolean method192(int arg0) {
        if (arg0 != -1) {
            field405 = null;
        }
        ++field398;
        return !super.field1712.method2282((byte) 102);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)I", line = 91)
    public final int method57(int arg0, int arg1) {
        ++field406;
        if (arg1 != 29053) {
            return -85;
        } else {
            return super.field1712.method2282((byte) 123) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)I", line = 111)
    public final int method193(byte arg0) {
        ++field400;
        return arg0 <= 119 ? 24 : super.field1708;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 122)
    public final void method60(byte arg0) {
        if (arg0 <= 118) {
            this.method192(114);
        }
        ++field403;
        if (super.field1712.method2282((byte) 124)) {
            super.field1708 = 0;
        }
        if (super.field1708 != 1 && ~super.field1708 != -1) {
            super.field1708 = this.method58(0);
        }
    }
}
