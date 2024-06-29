import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class398 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    private int field5672;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field5673 = 0;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field5676 = 0;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!jj", name = "toString", descriptor = "()Ljava/lang/String;", line = 10)
    public final String toString() {
        field5674++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Lvm;", line = 20)
    public static final class349 method2355(int arg0, int arg1) {
        field5675++;
        if (arg0 != 39) {
            method2355(61, 74);
        }
        if (arg1 == 0) {
            return new class211();
        } else if (arg1 == 1) {
            return new class481();
        } else if (arg1 == 2) {
            return new class597();
        } else if (arg1 == 3) {
            return new class74();
        } else if (arg1 == 4) {
            return new class563();
        } else if (arg1 == 5) {
            return new class201();
        } else if (arg1 == 6) {
            return new class21();
        } else if (arg1 == 7) {
            return new class533();
        } else if (arg1 == 8) {
            return new class86();
        } else if (arg1 == 9) {
            return new class656();
        } else if (arg1 == 10) {
            return new class2();
        } else if (arg1 == 11) {
            return new class453();
        } else if (arg1 == 12) {
            return new class187();
        } else if (arg1 == 13) {
            return new class652();
        } else if (arg1 == 14) {
            return new class11();
        } else if (arg1 == 15) {
            return new class429();
        } else if (arg1 == 16) {
            return new class623();
        } else if (arg1 == 17) {
            return new class340();
        } else if (arg1 == 18) {
            return new class389();
        } else if (arg1 == 19) {
            return new class205();
        } else if (arg1 == 20) {
            return new class3();
        } else if (arg1 == 21) {
            return new class242();
        } else if (arg1 == 22) {
            return new class671();
        } else if (arg1 == 23) {
            return new class632();
        } else if (arg1 == 24) {
            return new class426();
        } else if (arg1 == 25) {
            return new class348();
        } else if (arg1 == 26) {
            return new class251();
        } else if (arg1 == 27) {
            return new class161();
        } else if (arg1 == 28) {
            return new class420();
        } else if (arg1 == 29) {
            return new class15();
        } else if (arg1 == 30) {
            return new class353();
        } else if (arg1 == 31) {
            return new class85();
        } else if (arg1 == 32) {
            return new class414();
        } else if (arg1 == 33) {
            return new class244();
        } else if (arg1 == 34) {
            return new class541();
        } else if (arg1 == 35) {
            return new class666();
        } else if (arg1 == 36) {
            return new class496();
        } else if (arg1 == 37) {
            return new class480();
        } else if (arg1 == 38) {
            return new class505();
        } else if (arg1 == 39) {
            return new class530();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I", line = 344)
    public final int method2356(int arg0) {
        int var2 = -62 / ((arg0 - 43) / 52);
        field5677++;
        return this.field5672;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(II)V", line = 357)
    public class398(int arg0, int arg1) {
        this.field5672 = arg0;
    }
}
