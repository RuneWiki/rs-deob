import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class40 {

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public int field606 = -1;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public int field612 = -1;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field611 = 0;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Lah;")
    public static class176 field610;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
    public int[] field607;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILfh;I)V", line = 11)
    public final void method320(int arg0, class313 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method2224(-122);
            if (var4 == 0) {
                field605++;
                if (arg0 != 358) {
                    this.method320(24, (class313) null, 28);
                }
                return;
            }
            this.method322(-127, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 42)
    public static void method321(byte arg0) {
        if (arg0 != -53) {
            method323(-41);
        }
        field610 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILfh;I)V", line = 54)
    private final void method322(int arg0, int arg1, class313 arg2, int arg3) {
        if (arg1 == 1) {
            this.field606 = arg2.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field607 = new int[arg2.method2224(-121)];
            for (int var5 = 0; var5 < this.field607.length; var5++) {
                this.field607[var5] = arg2.method2250(-1613178296);
            }
        } else if (arg1 == 3) {
            this.field612 = arg2.method2224(-121);
        }
        if (arg0 >= -124) {
            field611 = 75;
        }
        field609++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 93)
    public static final void method323(int arg0) {
        field608++;
        int var1 = -44 % ((arg0 + 30) / 60);
        class100.field1452.method651(0);
    }
}
