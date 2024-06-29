import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class451 {

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "[I")
    public int[] field6471 = new int[6];

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "[[I")
    public int[][] field6483 = new int[6][258];

    @OriginalMember(owner = "client!uba", name = "t", descriptor = "[B")
    public byte[] field6486 = new byte[18002];

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "[Z")
    public boolean[] field6470 = new boolean[256];

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "I")
    public int field6469 = 0;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "[Z")
    public boolean[] field6482 = new boolean[16];

    @OriginalMember(owner = "client!uba", name = "x", descriptor = "[B")
    public byte[] field6490 = new byte[256];

    @OriginalMember(owner = "client!uba", name = "h", descriptor = "I")
    public int field6474 = 0;

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "[B")
    public byte[] field6473 = new byte[4096];

    @OriginalMember(owner = "client!uba", name = "z", descriptor = "[I")
    public int[] field6492 = new int[256];

    @OriginalMember(owner = "client!uba", name = "A", descriptor = "[[I")
    public int[][] field6493 = new int[6][258];

    @OriginalMember(owner = "client!uba", name = "B", descriptor = "[[B")
    public byte[][] field6494 = new byte[6][258];

    @OriginalMember(owner = "client!uba", name = "G", descriptor = "[I")
    public int[] field6498 = new int[257];

    @OriginalMember(owner = "client!uba", name = "M", descriptor = "[B")
    public byte[] field6502 = new byte[18002];

    @OriginalMember(owner = "client!uba", name = "w", descriptor = "[[I")
    public int[][] field6489 = new int[6][258];

    @OriginalMember(owner = "client!uba", name = "N", descriptor = "[I")
    public int[] field6503 = new int[16];

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "[I")
    public static int[] field6480 = new int[16];

    @OriginalMember(owner = "client!uba", name = "C", descriptor = "Lke;")
    public static class622 field6495 = new class622(9, -1);

    @OriginalMember(owner = "client!uba", name = "F", descriptor = "I")
    public static int field6497 = 1400;

    @OriginalMember(owner = "client!uba", name = "v", descriptor = "B")
    public byte field6488;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "I")
    public int field6467;

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "I")
    public int field6468;

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "I")
    public int field6472;

    @OriginalMember(owner = "client!uba", name = "i", descriptor = "I")
    public int field6475;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
    public int field6476;

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
    public int field6477;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
    public int field6479;

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "I")
    public int field6485;

    @OriginalMember(owner = "client!uba", name = "u", descriptor = "I")
    public int field6487;

    @OriginalMember(owner = "client!uba", name = "y", descriptor = "I")
    public int field6491;

    @OriginalMember(owner = "client!uba", name = "E", descriptor = "I")
    public int field6496;

    @OriginalMember(owner = "client!uba", name = "I", descriptor = "I")
    public int field6499;

    @OriginalMember(owner = "client!uba", name = "L", descriptor = "I")
    public int field6501;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "Lql;")
    public static class766 field6478;

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "[B")
    public byte[] field6481;

    @OriginalMember(owner = "client!uba", name = "J", descriptor = "[B")
    public byte[] field6500;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V", line = 14)
    public static void method2717(boolean arg0) {
        field6478 = null;
        field6495 = null;
        if (arg0) {
            method2718((byte) -125, null, 22, null, -35);
        }
        field6480 = null;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BLd;ILjava/awt/Canvas;I)Lha;", line = 92)
    public static final class66 method2718(byte arg0, class159 arg1, int arg2, Canvas arg3, int arg4) {
        field6484++;
        return arg0 == 13 ? new class545(arg3, arg1, arg2, arg4) : null;
    }
}
