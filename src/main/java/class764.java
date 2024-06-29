import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class764 {

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "[Z")
    public boolean[] field10482 = new boolean[256];

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "[I")
    public int[] field10485 = new int[6];

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "[Z")
    public boolean[] field10488 = new boolean[16];

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public int field10500 = 0;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "[I")
    public int[] field10498 = new int[16];

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "[[I")
    public int[][] field10503 = new int[6][258];

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public int field10486 = 0;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "[B")
    public byte[] field10487 = new byte[18002];

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "[[I")
    public int[][] field10497 = new int[6][258];

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "[B")
    public byte[] field10478 = new byte[256];

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "[[I")
    public int[][] field10479 = new int[6][258];

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "[I")
    public int[] field10505 = new int[257];

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "[B")
    public byte[] field10508 = new byte[4096];

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "[[B")
    public byte[][] field10509 = new byte[6][258];

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "[B")
    public byte[] field10504 = new byte[18002];

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "[I")
    public int[] field10507 = new int[256];

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "[F")
    public static float[] field10484 = new float[16384];

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "[F")
    public static float[] field10511 = new float[16384];

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "B")
    public byte field10501;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public int field10480;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public int field10481;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public int field10483;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public int field10490;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public int field10491;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public int field10492;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public int field10494;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public int field10495;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public int field10499;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public int field10502;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    public int field10506;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    public int field10510;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public int field10512;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "[B")
    public byte[] field10489;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "[B")
    public byte[] field10496;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "[I")
    public static int[] field10493;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field10511[var2] = (float) Math.sin((double) var2 * var0);
            field10484[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 23)
    public static void method4206(byte arg0) {
        field10493 = null;
        if (arg0 <= 66) {
            field10484 = null;
        }
        field10484 = null;
        field10511 = null;
    }
}
