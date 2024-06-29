import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class448 {

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Lwm;")
    private class399 field6668 = new class399(64);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "Lph;")
    private class459 field6667;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field6671 = 0;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field6672 = -1;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static final void method2679(int arg0) {
        if (class145.method1077(-17638)) {
            if (class509.field7425 == null) {
                class31.method218(false);
            }
            class191.field3073 = true;
            class344.field5144 = 0;
            try {
                class472.field6997 = class418.field6296.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        if (arg0 != 5593) {
            field6671 = 7;
        }
        field6670++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lja;")
    public final class184 method2680(int arg0, int arg1) {
        field6669++;
        class399 var3 = this.field6668;
        class184 var4;
        synchronized (this.field6668) {
            var4 = (class184) this.field6668.method2478(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field6667;
        byte[] var6;
        synchronized (this.field6667) {
            var6 = this.field6667.method2757(arg0, arg1, (byte) -122);
        }
        class184 var7 = new class184();
        if (var6 != null) {
            var7.method1254((byte) 29, new class289(var6));
        }
        class399 var8 = this.field6668;
        synchronized (this.field6668) {
            this.field6668.method2472(-115, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)Z")
    public static final boolean method2681(int arg0, int arg1) {
        field6673++;
        if (arg0 != -18) {
            method2679(-48);
        }
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lkp;ILph;)V")
    public class448(class341 arg0, int arg1, class459 arg2) {
        this.field6667 = arg2;
        this.field6667.method2763(5, -3);
    }

    static {
        new class309("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }
}
