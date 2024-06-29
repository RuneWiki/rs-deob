import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class586 {

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Luaa;")
    private class395 field8355 = new class395(64);

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Luaa;")
    public class395 field8357 = new class395(2);

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Lgp;")
    private class561 field8352;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Lgp;")
    public class561 field8354;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Liu;")
    public static class517 field8353 = new class517(71, 7);

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Liu;")
    public static class517 field8356 = new class517(36, -2);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method3358(int arg0, int arg1, int arg2) {
        if (arg0 != 55) {
            return true;
        }
        field8350++;
        if (class448.method2654(arg1, arg2, (byte) 103)) {
            return class399.method2438(arg1, arg2, 540800) | (arg2 & 0xB000) != 0 | class33.method301(arg2, arg1, (byte) -99) ? true : (class219.method1469((byte) 67, arg2, arg1) | class589.method3370(arg2, (byte) 98, arg1)) & (arg1 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V", line = 26)
    public static void method3359(boolean arg0) {
        if (arg0) {
            field8353 = null;
        }
        field8356 = null;
        field8353 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V", line = 38)
    public final void method3360(boolean arg0, int arg1) {
        class395 var3 = this.field8355;
        synchronized (this.field8355) {
            this.field8355.method2397(arg1, (byte) -52);
        }
        field8346++;
        if (!arg0) {
            this.method3362(-34, 14);
        }
        class395 var4 = this.field8357;
        synchronized (this.field8357) {
            this.field8357.method2397(arg1, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 56)
    public final void method3361(int arg0) {
        class395 var2 = this.field8355;
        synchronized (this.field8355) {
            this.field8355.method2406(124);
        }
        field8347++;
        class395 var3 = this.field8357;
        synchronized (this.field8357) {
            if (arg0 != 71) {
                field8356 = null;
            }
            this.field8357.method2406(-117);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Lpm;", line = 73)
    public final class129 method3362(int arg0, int arg1) {
        field8348++;
        class395 var3 = this.field8355;
        class129 var4;
        synchronized (this.field8355) {
            var4 = (class129) this.field8355.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field8352;
        byte[] var6;
        synchronized (this.field8352) {
            var6 = this.field8352.method3175(arg1, (byte) -53, arg0);
        }
        class129 var7 = new class129();
        var7.field2106 = this;
        if (var6 != null) {
            var7.method1013(new class268(var6), -83);
        }
        class395 var8 = this.field8355;
        synchronized (this.field8355) {
            this.field8355.method2408(var7, (long) arg1, -114);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 109)
    public final void method3363(int arg0) {
        class395 var2 = this.field8355;
        synchronized (this.field8355) {
            this.field8355.method2404((byte) -99);
        }
        field8351++;
        class395 var3 = this.field8357;
        synchronized (this.field8357) {
            if (arg0 != -26478) {
                this.field8352 = null;
            }
            this.field8357.method2404((byte) -49);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljc;ILgp;Lgp;)V", line = 141)
    public class586(class584 arg0, int arg1, class561 arg2, class561 arg3) {
        this.field8352 = arg2;
        this.field8354 = arg3;
        this.field8352.method3164(33, true);
    }
}
