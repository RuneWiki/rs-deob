import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class627 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Llga;")
    private class663 field8687 = new class663(128);

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lsea;")
    private class648 field8697;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field8691 = "";

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field8693;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)Lij;", line = 3)
    public final class386 method3501(byte arg0, int arg1) {
        field8690++;
        class663 var3 = this.field8687;
        class386 var4;
        synchronized (this.field8687) {
            var4 = (class386) this.field8687.method3747((byte) -66, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field8697;
        byte[] var6;
        synchronized (this.field8697) {
            var6 = this.field8697.method3654(-15615, 1, arg1);
        }
        class386 var7 = new class386();
        if (var6 != null) {
            var7.method2284(-115, new class501(var6));
        }
        class663 var8 = this.field8687;
        synchronized (this.field8687) {
            this.field8687.method3748((long) arg1, var7, 12537);
        }
        return arg0 > -120 ? null : var7;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 37)
    public final void method3502(byte arg0) {
        field8695++;
        class663 var2 = this.field8687;
        synchronized (this.field8687) {
            this.field8687.method3749(7648);
        }
        int var3 = -77 / ((32 - arg0) / 39);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Z", line = 49)
    public static final boolean method3503(int arg0) {
        if (arg0 != 1) {
            method3504(null, (byte) 111);
        }
        field8689++;
        return class555.field7483;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([BB)Ljava/lang/String;", line = 62)
    public static final String method3504(byte[] arg0, byte arg1) {
        int var2 = 85 % ((arg1 - 20) / 33);
        field8694++;
        return class20.method218(1385181641, 0, arg0.length, arg0);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 73)
    public static void method3505(int arg0) {
        field8691 = null;
        if (arg0 != 1) {
            field8688 = 91;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 83)
    public final void method3506(byte arg0) {
        field8693++;
        if (arg0 != 65) {
            this.field8687 = null;
        }
        class663 var2 = this.field8687;
        synchronized (this.field8687) {
            this.field8687.method3755(19713);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V", line = 108)
    public final void method3507(int arg0, int arg1) {
        class663 var3 = this.field8687;
        synchronized (this.field8687) {
            this.field8687.method3754(arg1, true);
            if (arg0 != 1) {
                field8688 = -61;
            }
        }
        field8696++;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lci;ILsea;)V", line = 125)
    public class627(class414 arg0, int arg1, class648 arg2) {
        this.field8697 = arg2;
        this.field8697.method3653(1, true);
    }
}
