import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class443 {

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public int field6072;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Lvj;")
    public static class304 field6074 = new class304("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 4)
    public static void method2555(int arg0) {
        field6074 = null;
        if (arg0 <= 11) {
            field6074 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IJ)V", line = 14)
    public static final void method2556(int arg0, long arg1) {
        int var3 = -91 / ((-arg0 - 26) / 63);
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        field6076++;
    }

    @OriginalMember(owner = "client!sn", name = "toString", descriptor = "()Ljava/lang/String;", line = 28)
    public final String toString() {
        field6075++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)I", line = 37)
    public final int method2557(int arg0) {
        if (arg0 != 16966) {
            field6074 = null;
        }
        field6073++;
        return this.field6072;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 49)
    public class443(String arg0, int arg1) {
        this.field6072 = arg1;
    }
}
