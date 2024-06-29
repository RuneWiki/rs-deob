import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class745 extends class644 {

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public int field10377;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lkg;")
    public static class275 field10380 = new class275(5, 6);

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lkg;")
    public static class275 field10381 = new class275(21, -1);

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field10378;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field10379;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field10383;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Liea;")
    public static class481 field10382;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method4141(int arg0) {
        if (arg0 > -50) {
            field10379 = 90;
        }
        field10382 = null;
        field10381 = null;
        field10380 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIB)Z")
    public static final boolean method4142(int arg0, int arg1, byte arg2) {
        if (arg2 <= 80) {
            method4141(46);
        }
        field10378++;
        return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Z")
    public abstract boolean method222(byte arg0);

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
    public class745(int arg0) {
        this.field10377 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method221(byte arg0);
}
