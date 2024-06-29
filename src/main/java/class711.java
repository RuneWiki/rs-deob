import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class711 {

    @OriginalMember(owner = "client!lga", name = "l", descriptor = "Lkha;")
    public class583 field9891 = new class583();

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "Z")
    public static boolean field9885 = true;

    @OriginalMember(owner = "client!lga", name = "g", descriptor = "[Lwl;")
    public static class408[] field9886 = new class408[2048];

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "Z")
    public static boolean field9881 = false;

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
    public static int field9884 = 0;

    @OriginalMember(owner = "client!lga", name = "i", descriptor = "[I")
    public static int[] field9888 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "Lgda;")
    public static class53 field9890 = new class53(76, 3);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
    public static int field9880;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "I")
    public static int field9883;

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!lga", name = "m", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!lga", name = "n", descriptor = "I")
    public static int field9893;

    @OriginalMember(owner = "client!lga", name = "o", descriptor = "I")
    public static int field9894;

    @OriginalMember(owner = "client!lga", name = "p", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!lga", name = "h", descriptor = "Lfp;")
    public static class323 field9887;

    @OriginalMember(owner = "client!lga", name = "q", descriptor = "Lkha;")
    private class583 field9896;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)Lkha;", line = 16)
    public final class583 method3997(int arg0) {
        if (arg0 != 0) {
            this.method4000((byte) -52);
        }
        field9880++;
        class583 var2 = this.field9891.field8206;
        if (this.field9891 == var2) {
            return null;
        } else {
            var2.method3311(100);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V", line = 35)
    public static final void method3998(int arg0) {
        class452.field6394.method418(class441.field6287, class557.field7812.field6557.method3237(false) == 1 ? class68.field838 + 256 << 2 : -1, 0);
        if (arg0 != 27920) {
            method4004(-76, -118, (byte) 110);
        }
        field9895++;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lkha;I)V", line = 46)
    public final void method3999(class583 arg0, int arg1) {
        field9894++;
        if (arg0.field8205 != null) {
            arg0.method3311(100);
        }
        if (arg1 == 21934) {
            arg0.field8206 = this.field9891;
            arg0.field8205 = this.field9891.field8205;
            arg0.field8205.field8206 = arg0;
            arg0.field8206.field8205 = arg0;
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)Lkha;", line = 67)
    public final class583 method4000(byte arg0) {
        field9893++;
        if (arg0 != -7) {
            this.method3997(-91);
        }
        class583 var2 = this.field9891.field8206;
        if (this.field9891 == var2) {
            this.field9896 = null;
            return null;
        } else {
            this.field9896 = var2.field8206;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)I", line = 95)
    public final int method4001(byte arg0) {
        field9883++;
        if (arg0 >= -79) {
            this.method4003(10);
        }
        int var2 = 0;
        class583 var3 = this.field9891.field8206;
        while (this.field9891 != var3) {
            var3 = var3.field8206;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(I)Lkha;", line = 123)
    public final class583 method4002(int arg0) {
        if (arg0 > -38) {
            field9884 = -110;
        }
        field9882++;
        class583 var2 = this.field9896;
        if (this.field9891 == var2) {
            this.field9896 = null;
            return null;
        } else {
            this.field9896 = var2.field8206;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "(I)V", line = 143)
    public final void method4003(int arg0) {
        field9889++;
        while (true) {
            class583 var2 = this.field9891.field8206;
            if (this.field9891 == var2) {
                this.field9896 = null;
                if (arg0 == 3) {
                    return;
                } else {
                    this.method3997(23);
                    return;
                }
            }
            var2.method3311(100);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIB)Z", line = 166)
    public static final boolean method4004(int arg0, int arg1, byte arg2) {
        field9892++;
        int var3 = -26 / ((arg2 + 5) / 39);
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(B)V", line = 182)
    public static void method4005(byte arg0) {
        field9886 = null;
        field9888 = null;
        field9887 = null;
        field9890 = null;
        int var1 = -33 % ((arg0 + 48) / 59);
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V", line = 206)
    public class711() {
        this.field9891.field8205 = this.field9891;
        this.field9891.field8206 = this.field9891;
    }
}
