import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class414 extends OutputStream {

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[I")
    public static int[] field5848;

    static {
        new class530("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field5849 = 0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2453(int arg0, int arg1, int arg2) {
        field5846++;
        if (arg2 >= -116) {
            field5848 = null;
        }
        if (class73.method544((byte) 84, arg0, arg1)) {
            return class57.method474((byte) 29, arg1, arg0) | (arg1 & 0xB000) != 0 | class377.method2198(arg0, 116, arg1) ? true : (arg0 & 0x37) == 0 & (class82.method608(arg0, arg1, -13) | class343.method2048(18902, arg1, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 24)
    public static void method2454(int arg0) {
        if (arg0 != 55) {
            method2454(-1);
        }
        field5848 = null;
    }

    @OriginalMember(owner = "client!nf", name = "write", descriptor = "(I)V", line = 43)
    public final void write(int arg0) throws IOException {
        field5847++;
        throw new IOException();
    }
}
