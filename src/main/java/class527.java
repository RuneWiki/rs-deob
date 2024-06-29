import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class527 {

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "[B")
    public byte[] field7647 = new byte[18002];

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "[Z")
    public boolean[] field7648 = new boolean[256];

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "[[I")
    public int[][] field7646 = new int[6][258];

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "[B")
    public byte[] field7657 = new byte[4096];

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "[Z")
    public boolean[] field7663 = new boolean[16];

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "I")
    public int field7671 = 0;

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "[I")
    public int[] field7662 = new int[257];

    @OriginalMember(owner = "client!efa", name = "y", descriptor = "[I")
    public int[] field7670 = new int[6];

    @OriginalMember(owner = "client!efa", name = "A", descriptor = "[I")
    public int[] field7672 = new int[16];

    @OriginalMember(owner = "client!efa", name = "C", descriptor = "[[I")
    public int[][] field7674 = new int[6][258];

    @OriginalMember(owner = "client!efa", name = "t", descriptor = "I")
    public int field7665 = 0;

    @OriginalMember(owner = "client!efa", name = "v", descriptor = "[B")
    public byte[] field7667 = new byte[256];

    @OriginalMember(owner = "client!efa", name = "B", descriptor = "[[B")
    public byte[][] field7673 = new byte[6][258];

    @OriginalMember(owner = "client!efa", name = "D", descriptor = "[[I")
    public int[][] field7675 = new int[6][258];

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "[I")
    public int[] field7659 = new int[256];

    @OriginalMember(owner = "client!efa", name = "G", descriptor = "[B")
    public byte[] field7678 = new byte[18002];

    @OriginalMember(owner = "client!efa", name = "x", descriptor = "Llc;")
    public static class435 field7669 = new class435(104, -1);

    @OriginalMember(owner = "client!efa", name = "F", descriptor = "B")
    public byte field7677;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public int field7649;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "I")
    public int field7650;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    public int field7651;

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "I")
    public int field7653;

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
    public int field7655;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "I")
    public int field7656;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
    public int field7658;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
    public int field7660;

    @OriginalMember(owner = "client!efa", name = "s", descriptor = "I")
    public int field7664;

    @OriginalMember(owner = "client!efa", name = "u", descriptor = "I")
    public int field7666;

    @OriginalMember(owner = "client!efa", name = "E", descriptor = "I")
    public int field7676;

    @OriginalMember(owner = "client!efa", name = "H", descriptor = "I")
    public int field7679;

    @OriginalMember(owner = "client!efa", name = "I", descriptor = "I")
    public int field7680;

    @OriginalMember(owner = "client!efa", name = "J", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7652;

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "[B")
    public byte[] field7661;

    @OriginalMember(owner = "client!efa", name = "w", descriptor = "[B")
    public byte[] field7668;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lqm;Lqm;I)V")
    public static final void method3191(class430 arg0, class430 arg1, int arg2) {
        if (arg0.field6186 != null) {
            arg0.method2656((byte) 126);
        }
        field7654++;
        if (arg2 > -28) {
            field7681 = -72;
        }
        arg0.field6186 = arg1.field6186;
        arg0.field6189 = arg1;
        arg0.field6186.field6189 = arg0;
        arg0.field6189.field6186 = arg0;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
    public static void method3192(byte arg0) {
        if (arg0 < 117) {
            method3191(null, null, 112);
        }
        field7652 = null;
        field7669 = null;
    }
}
