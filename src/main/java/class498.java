import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class498 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Laq;")
    private class494 field6846 = new class494(64);

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "Lgga;")
    private class513 field6852;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "Lgga;")
    public class513 field6847;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field6850 = 0;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "Lnea;")
    public static class600 field6845 = new class600(3);

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "D")
    public static double field6853;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "Lva;")
    public static class585 field6854;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method2911(byte arg0, int arg1) {
        class752.field10460 = arg1;
        class482.field6622 = 100;
        if (arg0 == 85) {
            class33.field410 = 3;
            class727.field10134 = -1;
            field6844++;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)V", line = 17)
    public final void method2912(int arg0, int arg1) {
        field6851++;
        class494 var3 = this.field6846;
        synchronized (this.field6846) {
            if (arg0 != -32227) {
                field6850 = -89;
            }
            this.field6846.method2888(arg1, 116);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)Lbda;", line = 30)
    public final class224 method2913(int arg0, byte arg1) {
        field6855++;
        class494 var3 = this.field6846;
        class224 var4;
        synchronized (this.field6846) {
            var4 = (class224) this.field6846.method2882((long) arg0, (byte) -70);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field6852;
        byte[] var6;
        synchronized (this.field6852) {
            var6 = this.field6852.method3019(3, arg0, 58);
        }
        class224 var7 = new class224();
        var7.field3282 = this;
        if (arg1 < 57) {
            this.method2916(-116);
        }
        if (var6 != null) {
            var7.method1537(new class431(var6), 0);
        }
        class494 var8 = this.field6846;
        synchronized (this.field6846) {
            this.field6846.method2890(-7307, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 61)
    public final void method2914(byte arg0) {
        class494 var2 = this.field6846;
        synchronized (this.field6846) {
            if (arg0 > -112) {
                return;
            }
            this.field6846.method2893((byte) -75);
        }
        field6848++;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V", line = 81)
    public static void method2915(boolean arg0) {
        field6854 = null;
        field6845 = null;
        if (!arg0) {
            field6850 = -23;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 92)
    public final void method2916(int arg0) {
        field6849++;
        class494 var2 = this.field6846;
        synchronized (this.field6846) {
            if (arg0 != 3) {
                this.method2912(66, -98);
            }
            this.field6846.method2881((byte) -28);
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lmca;ILgga;Lgga;)V", line = 122)
    public class498(class41 arg0, int arg1, class513 arg2, class513 arg3) {
        this.field6852 = arg2;
        this.field6847 = arg3;
        this.field6852.method3007(-1, 3);
    }
}
