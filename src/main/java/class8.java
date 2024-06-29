import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public int field96 = 0;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
    public static int[] field100 = new int[3];

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field101 = 0;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "Lak;")
    public static class293 field95 = new class293(128);

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ldaa;IB)V")
    private final void method46(class11 arg0, int arg1, byte arg2) {
        field98++;
        if (arg2 != -35) {
            field101 = -102;
        }
        if (arg1 == 5) {
            this.field96 = arg0.method93((byte) 86);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Z")
    public static final boolean method47(int arg0, int arg1, int arg2) {
        if (arg1 < 48) {
            return true;
        } else {
            field97++;
            return (arg2 & 0x8000) != 0;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
    public static void method48(byte arg0) {
        if (arg0 < 18) {
            method48((byte) 15);
        }
        field95 = null;
        field100 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ldaa;Z)V")
    public final void method49(class11 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method110((byte) 67);
            if (var3 == 0) {
                field99++;
                if (arg1) {
                    field100 = null;
                    return;
                }
                return;
            }
            this.method46(arg0, var3, (byte) -35);
        }
    }
}
