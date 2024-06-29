import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class39 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public int field944 = 64;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Z")
    public boolean field947 = true;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public int field950 = 8;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public int field949 = 0;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Z")
    public boolean field952 = true;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Z")
    public boolean field946 = false;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public int field955 = -1;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public int field956 = 512;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public int field945 = 1190717;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public int field961 = -1;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public int field960 = 127;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lhj;")
    public static class569 field958 = new class569();

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lcb;")
    public class521 field948;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lnw;")
    public static class586 field954;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 4)
    public final void method476(int arg0) {
        this.field950 = this.field950 << 8 | this.field959;
        if (arg0 != -4860) {
            this.method476(-102);
        }
        field957++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(JJ)J", line = 17)
    public static long method477(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILcea;I)V", line = 37)
    private final void method478(int arg0, class215 arg1, int arg2) {
        field953++;
        if (arg0 != -1) {
            return;
        }
        if (arg2 == 1) {
            this.field949 = class170.method1281(-57, arg1.method1499(-1));
        } else if (arg2 == 2) {
            this.field961 = arg1.method1535(255);
            return;
        } else if (arg2 == 3) {
            this.field961 = arg1.method1478(842397944);
            if (this.field961 == 65535) {
                this.field961 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field947 = false;
            return;
        } else if (arg2 == 7) {
            this.field955 = class170.method1281(-67, arg1.method1499(-1));
            return;
        } else if (arg2 == 8) {
            this.field948.field7241 = this.field959;
            return;
        } else if (arg2 == 9) {
            this.field956 = arg1.method1478(842397944) << 2;
            return;
        } else if (arg2 == 10) {
            this.field952 = false;
            return;
        } else if (arg2 == 11) {
            this.field950 = arg1.method1535(255);
            return;
        } else if (arg2 == 12) {
            this.field946 = true;
            return;
        } else if (arg2 == 13) {
            this.field945 = arg1.method1499(-1);
            return;
        } else {
            if (arg2 == 14) {
                this.field944 = arg1.method1535(255) << 2;
            } else if (arg2 == 16) {
                this.field960 = arg1.method1535(255);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLcea;)V", line = 109)
    public final void method479(boolean arg0, class215 arg1) {
        if (!arg0) {
            this.field947 = false;
        }
        while (true) {
            int var3 = arg1.method1535(255);
            if (var3 == 0) {
                field951++;
                return;
            }
            this.method478(-1, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 130)
    public static void method480(int arg0) {
        field958 = null;
        field954 = null;
        if (arg0 > -126) {
            field958 = null;
        }
    }
}
