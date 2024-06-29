import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class529 {

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Ljo;")
    private class382 field7788 = new class382(64);

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public int field7796 = 0;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lok;")
    private class74 field7793;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public int field7791;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Ldp;")
    public static class347 field7786 = new class347("M", "M", "M", "M");

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lur;")
    public static class292 field7794;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lok;")
    public static class74 field7795;

    static {
        new class347("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 7)
    public static void method3139(int arg0) {
        field7794 = null;
        field7786 = null;
        if (arg0 > -104) {
            method3139(-64);
        }
        field7795 = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 24)
    public final void method3140(int arg0) {
        field7792++;
        class382 var2 = this.field7788;
        synchronized (this.field7788) {
            if (arg0 != -3945) {
                this.field7791 = -32;
            }
            this.field7788.method2287(118);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)V", line = 39)
    public final void method3141(int arg0, boolean arg1) {
        field7790++;
        class382 var3 = this.field7788;
        synchronized (this.field7788) {
            if (arg1) {
                this.method3143((byte) -16, -50);
            }
            this.field7788.method2294(arg0, true);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lkr;ILok;)V", line = 115)
    public class529(class262 arg0, int arg1, class74 arg2) {
        this.field7793 = arg2;
        this.field7791 = this.field7793.method536(false, 4);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 58)
    public final void method3142(int arg0) {
        field7789++;
        class382 var2 = this.field7788;
        synchronized (this.field7788) {
            this.field7788.method2293(false);
            int var3 = -82 % ((arg0 - 43) / 60);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)Lut;", line = 73)
    public final class148 method3143(byte arg0, int arg1) {
        field7787++;
        class382 var3 = this.field7788;
        class148 var4;
        synchronized (this.field7788) {
            var4 = (class148) this.field7788.method2288((long) arg1, arg0 + 91);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field7793;
        byte[] var6;
        synchronized (this.field7793) {
            var6 = this.field7793.method541(arg1, 4, (byte) -122);
        }
        class148 var7 = new class148();
        var7.field2245 = this;
        var7.field2226 = arg1;
        if (var6 != null) {
            var7.method1072(-25666, new class468(var6));
        }
        var7.method1073(127);
        class382 var8 = this.field7788;
        synchronized (this.field7788) {
            if (arg0 != -91) {
                this.field7788 = null;
            }
            this.field7788.method2290((long) arg1, var7, 126);
            return var7;
        }
    }
}
