import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class351 {

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "Lfr;")
    private class231 field5485 = new class231(64);

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Lqs;")
    private class496 field5488;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "Lqs;")
    public static class496 field5486;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)Lgn;")
    public static final class405 method2253(int arg0, int arg1) {
        field5481++;
        class405 var2 = (class405) class387.field5958.method2832((byte) 82, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class488.field7142.method2926(0, -100, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class405 var4 = class534.method3167(var3, (byte) -21);
        class387.field5958.method2831((byte) 105, var4, (long) arg0);
        if (arg1 != 1) {
            field5486 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
    public static void method2254(boolean arg0) {
        if (!arg0) {
            method2253(-124, -51);
        }
        field5486 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public final void method2255(int arg0) {
        field5487++;
        class231 var2 = this.field5485;
        synchronized (this.field5485) {
            this.field5485.method1598(-113);
            if (arg0 != 0) {
                this.method2257((byte) -73);
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
    public final void method2256(int arg0, int arg1) {
        field5484++;
        if (arg1 != -23543) {
            this.field5485 = null;
        }
        class231 var3 = this.field5485;
        synchronized (this.field5485) {
            this.field5485.method1603((byte) -123, arg0);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public final void method2257(byte arg0) {
        class231 var2 = this.field5485;
        synchronized (this.field5485) {
            this.field5485.method1604(4);
        }
        field5483++;
        if (arg0 > -116) {
            method2254(false);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZI)Lam;")
    public final class223 method2258(boolean arg0, int arg1) {
        if (!arg0) {
            this.method2257((byte) -69);
        }
        field5482++;
        class231 var3 = this.field5485;
        class223 var4;
        synchronized (this.field5485) {
            var4 = (class223) this.field5485.method1593((byte) -112, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field5488;
        byte[] var6;
        synchronized (this.field5488) {
            var6 = this.field5488.method2926(arg1, -90, 11);
        }
        class223 var7 = new class223();
        if (var6 != null) {
            var7.method1536(true, new class23(var6));
        }
        class231 var8 = this.field5485;
        synchronized (this.field5485) {
            this.field5485.method1595(var7, (long) arg1, (byte) 84);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lwv;ILqs;)V")
    public class351(class535 arg0, int arg1, class496 arg2) {
        this.field5488 = arg2;
        if (this.field5488 != null) {
            this.field5488.method2940(11, -10511);
        }
    }

    static {
        new class306("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }
}
