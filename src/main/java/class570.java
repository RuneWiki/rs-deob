import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class570 {

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Lpe;")
    private class615 field7441;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Lpe;")
    private class615 field7437;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field7438 = -1;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lbs;")
    private class148 field7435;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Z")
    public static boolean field7439;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIZLpe;ZI)V")
    public static final void method3046(int arg0, int arg1, int arg2, boolean arg3, class615 arg4, boolean arg5, int arg6) {
        class557.field7280 = arg1;
        class332.field4314 = arg2;
        class521.field6803 = arg6;
        class426.field5523 = 1;
        class64.field867 = arg3;
        field7436++;
        class414.field5327 = arg4;
        class27.field403 = class359.field4658.method2947((byte) 104) / arg0;
        if (arg5) {
            method3046(-13, 67, 72, false, null, false, -51);
        }
        if (class27.field403 < 1) {
            class27.field403 = 1;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lkr;I)Ln;")
    public final class682 method3047(class104 arg0, int arg1) {
        field7440++;
        if (arg0 == null) {
            return null;
        }
        class103 var3 = arg0.method318(-26207);
        if (class614.field8296 == var3) {
            return new class50((class260) arg0);
        } else if (class213.field2745 == var3) {
            return new class356(this.method3048(69), (class517) arg0);
        } else if (class549.field7128 == var3) {
            return new class480(this.field7437, (class243) arg0);
        } else if (class419.field5431 == var3) {
            return new class191(this.field7437, (class256) arg0);
        } else if (class501.field6615 == var3) {
            return new class68(this.field7437, this.field7441, (class187) arg0);
        } else if (class197.field2593 == var3) {
            return new class483(this.field7437, this.field7441, (class53) arg0);
        } else if (class240.field3234 == var3) {
            return new class646(this.field7437, this.field7441, (class485) arg0);
        } else {
            int var4 = -55 / ((-arg1 - 18) / 57);
            if (class469.field6131 == var3) {
                return new class165(this.field7437, this.field7441, (class112) arg0);
            } else if (class625.field8740 == var3) {
                return new class437(this.field7437, (class446) arg0);
            } else if (class549.field7127 == var3) {
                return new class379(this.field7437, this.field7441, (class167) arg0);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Lbs;")
    private final class148 method3048(int arg0) {
        field7442++;
        int var2 = -120 % ((arg0 + 10) / 55);
        if (this.field7435 == null) {
            this.field7435 = new class148();
        }
        return this.field7435;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lpe;Lpe;)V")
    public class570(class615 arg0, class615 arg1) {
        this.field7441 = arg1;
        this.field7437 = arg0;
    }
}
