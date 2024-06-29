import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class532 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public int field7188 = 2048;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public int field7190 = 0;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public int field7191 = 0;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public int field7192 = 2048;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Ltp;")
    public static class494 field7194 = new class494();

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "[I")
    public static int[] field7195;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILac;)V", line = 9)
    public final void method3020(int arg0, class501 arg1) {
        if (arg0 < 16) {
            this.field7188 = -17;
        }
        field7193++;
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                return;
            }
            this.method3021(66, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILac;)V", line = 30)
    private final void method3021(int arg0, int arg1, class501 arg2) {
        field7189++;
        if (arg1 == 1) {
            this.field7190 = arg2.method2874((byte) -75);
        } else if (arg1 == 2) {
            this.field7192 = arg2.method2845(-1);
        } else if (arg1 == 3) {
            this.field7188 = arg2.method2845(-1);
        } else if (arg1 == 4) {
            this.field7191 = arg2.method2875(false);
        }
        if (arg0 < 56) {
            this.method3020(114, null);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 61)
    public static void method3022(byte arg0) {
        field7194 = null;
        if (arg0 > -76) {
            method3022((byte) -102);
        }
        field7195 = null;
    }
}
