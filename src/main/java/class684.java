import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class684 {

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "[[B")
    public byte[][] field9624 = new byte[6][258];

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public int field9619 = 0;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "[[I")
    public int[][] field9626 = new int[6][258];

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "[I")
    public int[] field9620 = new int[257];

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "[I")
    public int[] field9618 = new int[16];

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
    public int field9638 = 0;

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "[[I")
    public int[][] field9637 = new int[6][258];

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "[B")
    public byte[] field9641 = new byte[18002];

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "[I")
    public int[] field9639 = new int[6];

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "[B")
    public byte[] field9647 = new byte[18002];

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "[Z")
    public boolean[] field9648 = new boolean[16];

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "[Z")
    public boolean[] field9651 = new boolean[256];

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "[[I")
    public int[][] field9627 = new int[6][258];

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "[I")
    public int[] field9655 = new int[256];

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "[B")
    public byte[] field9628 = new byte[256];

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "[B")
    public byte[] field9629 = new byte[4096];

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "Lqaa;")
    public static class27 field9652 = new class27(17, 3);

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "Lhda;")
    public static class747 field9653 = new class747();

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "B")
    public byte field9621;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public int field9623;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public int field9625;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    public int field9630;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public int field9631;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    public int field9633;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
    public int field9634;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
    public int field9635;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "I")
    public int field9636;

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
    public int field9643;

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "I")
    public int field9646;

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "I")
    public int field9649;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
    public int field9650;

    @OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
    public int field9656;

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "Lfw;")
    public static class55 field9642;

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "Z")
    public static boolean field9654;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "[B")
    public byte[] field9632;

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "[B")
    public byte[] field9645;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)B", line = 17)
    public static final byte method3853(int arg0, int arg1, int arg2) {
        field9644++;
        if (arg1 != -18273) {
            return -11;
        } else if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZIIIII)V", line = 50)
    public static final void method3854(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9640++;
        int var6 = class498.method3000(arg0, class748.field10458, arg4, class558.field7940);
        int var7 = class498.method3000(false, class748.field10458, arg2, class558.field7940);
        int var8 = class498.method3000(false, class612.field8854, arg5, class156.field2337);
        int var9 = class498.method3000(false, class612.field8854, arg3, class156.field2337);
        for (int var10 = var6; var10 <= var7; var10++) {
            class399.method2472(27113, var8, var9, arg1, class329.field4651[var10]);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 106)
    public static void method3855(int arg0) {
        field9652 = null;
        field9653 = null;
        field9642 = null;
        if (arg0 != 256) {
            field9642 = null;
        }
    }
}
