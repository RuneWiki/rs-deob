import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class190 extends class134 {

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "[[I")
    public static int[][] field2289 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "[[I")
    public static int[][] field2290;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)I", line = 4)
    public final int method58(int arg0) {
        if (arg0 != 0) {
            this.method60((byte) 106);
        }
        ++field2283;
        return 1;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(ILkda;)V", line = 15)
    public class190(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V", line = 19)
    public final void method55(int arg0, int arg1) {
        super.field1708 = arg1;
        ++field2285;
        int var3 = -44 / ((-26 - arg0) / 41);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)I", line = 32)
    public final int method1058(byte arg0) {
        if (arg0 < 119) {
            return 12;
        } else {
            ++field2287;
            return super.field1708;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZI)Lbc;", line = 49)
    public static final class369 method1059(int arg0, boolean arg1, int arg2) {
        ++field2291;
        if (arg2 != 6) {
            field2290 = null;
        }
        long var3 = (long) ((!arg1 ? 0 : Integer.MIN_VALUE) | arg0);
        return (class369) class358.field4748.method2552(var3, -1);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(III)Z", line = 64)
    public static final boolean method1060(int arg0, int arg1, int arg2) {
        ++field2293;
        if (arg1 != -12294) {
            field2290 = null;
        }
        return (class337.method1998(arg0, 544, arg2) | (arg0 & 8192) != 0 | class62.method482(arg2, arg0, (byte) 91)) & class561.method3166(-27984, arg2, arg0);
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)Z", line = 75)
    public final boolean method1061(int arg0) {
        ++field2288;
        if (arg0 != -1) {
            this.method60((byte) 19);
        }
        return !super.field1712.method2282((byte) 109);
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lkda;)V", line = 89)
    public class190(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V", line = 92)
    public final void method60(byte arg0) {
        if (super.field1712.method2282((byte) 118)) {
            super.field1708 = 0;
        }
        ++field2292;
        if (arg0 <= 118) {
            field2290 = null;
        }
        if (super.field1708 < 0 && ~super.field1708 < -3) {
            super.field1708 = this.method58(0);
        }
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(II)I", line = 111)
    public final int method57(int arg0, int arg1) {
        ++field2284;
        if (super.field1712.method2282((byte) 113)) {
            return 3;
        } else if (~arg0 != -1 && ~super.field1712.field5499.method249((byte) 121) != -2) {
            if (arg1 != 29053) {
                this.method60((byte) -65);
            }
            return 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V", line = 129)
    public static void method1062(int arg0) {
        field2289 = null;
        field2290 = null;
        if (arg0 != 8192) {
            field2290 = null;
        }
    }
}
