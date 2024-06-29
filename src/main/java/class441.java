import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class441 {

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public int field6547 = 128;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public int field6554 = 128;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public int field6549;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public int field6551;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public int field6552;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public int field6555;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "Lsl;")
    public static class318 field6556 = new class318(27, -1);

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Ll;")
    public static class16 field6545;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILgo;)V", line = 4)
    public final void method2691(int arg0, class441 arg1) {
        this.field6551 = arg1.field6551;
        this.field6554 = arg1.field6554;
        field6548++;
        if (arg0 == 128) {
            this.field6549 = arg1.field6549;
            this.field6555 = arg1.field6555;
            this.field6552 = arg1.field6552;
            this.field6547 = arg1.field6547;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 20)
    public static final void method2692(int arg0) {
        class56.field607 = new class97(class316.field4501.method2031(true, class377.field5585), "", class86.field1177, 1011, -1, (long) arg0, 0, 0, true, false);
        field6550++;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 30)
    public static void method2693(int arg0) {
        field6556 = null;
        field6545 = null;
        if (arg0 <= 89) {
            method2693(-123);
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(I)V", line = 97)
    public class441(int arg0) {
        this.field6549 = arg0;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIIII)V", line = 104)
    private class441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6549 = arg0;
        this.field6551 = arg5;
        this.field6547 = arg1;
        this.field6554 = arg2;
        this.field6552 = arg4;
        this.field6555 = arg3;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)Lgo;", line = 53)
    public final class441 method2694(int arg0) {
        field6546++;
        if (arg0 != 23495) {
            method2696((byte) 96);
        }
        return new class441(this.field6549, this.field6547, this.field6554, this.field6555, this.field6552, this.field6551);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I", line = 65)
    public static final int method2695(int arg0, int arg1) {
        field6553++;
        if (arg1 != 1011) {
            field6545 = null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)[Lid;", line = 84)
    public static final class412[] method2696(byte arg0) {
        if (arg0 > -17) {
            method2693(-88);
        }
        field6557++;
        return new class412[] { class318.field4510, class490.field7194, class322.field4534 };
    }
}
