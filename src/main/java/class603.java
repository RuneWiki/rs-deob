import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class603 {

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lwg;")
    private class58 field8708 = new class58(64);

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lkr;")
    private class329 field8704;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Lbe;")
    public static class189 field8706 = new class189();

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Lvt;")
    public static class344 field8707 = new class344("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Luu;")
    public static class514 field8709 = new class514(0, 0);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method3461(int arg0) {
        field8709 = null;
        if (arg0 != -15813) {
            field8709 = null;
        }
        field8706 = null;
        field8707 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3462(int arg0, int arg1, byte arg2) {
        field8705++;
        if (arg2 != -19) {
            field8706 = null;
        }
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)Lia;")
    public final class182 method3463(byte arg0, int arg1) {
        field8703++;
        class58 var3 = this.field8708;
        class182 var4;
        synchronized (this.field8708) {
            var4 = (class182) this.field8708.method323((long) arg1, arg0 - 19738);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field8704;
        byte[] var6;
        synchronized (this.field8704) {
            var6 = this.field8704.method2054(true, 5, arg1);
        }
        if (arg0 != -76) {
            method3461(65);
        }
        class182 var7 = new class182();
        if (var6 != null) {
            var7.method1120(false, new class551(var6));
        }
        class58 var8 = this.field8708;
        synchronized (this.field8708) {
            this.field8708.method316((long) arg1, (byte) -113, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class603(class513 arg0, int arg1, class329 arg2) {
        this.field8704 = arg2;
        this.field8704.method2064(0, 5);
    }
}
