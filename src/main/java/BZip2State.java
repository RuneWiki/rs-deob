import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sb")
public class BZip2State {

    @OriginalMember(owner = "sb", name = "a", descriptor = "I")
    public final int MTFA_SIZE = 4096;

    @OriginalMember(owner = "sb", name = "b", descriptor = "I")
    public final int MTFL_SIZE = 16;

    @OriginalMember(owner = "sb", name = "c", descriptor = "I")
    public final int BZ_MAX_ALPHA_SIZE = 258;

    @OriginalMember(owner = "sb", name = "d", descriptor = "I")
    public final int BZ_MAX_CODE_LEN = 23;

    @OriginalMember(owner = "sb", name = "e", descriptor = "I")
    public final int field683 = 1;

    @OriginalMember(owner = "sb", name = "f", descriptor = "I")
    public final int BZ_N_GROUPS = 6;

    @OriginalMember(owner = "sb", name = "g", descriptor = "I")
    public final int BZ_G_SIZE = 50;

    @OriginalMember(owner = "sb", name = "h", descriptor = "I")
    public final int field686 = 4;

    @OriginalMember(owner = "sb", name = "i", descriptor = "I")
    public final int BZ_MAX_SELECTORS = 18002;

    @OriginalMember(owner = "sb", name = "D", descriptor = "[I")
    public int[] unzftab = new int[256];

    @OriginalMember(owner = "sb", name = "F", descriptor = "[I")
    public int[] cftab = new int[257];

    @OriginalMember(owner = "sb", name = "G", descriptor = "[I")
    public int[] cftabCopy = new int[257];

    @OriginalMember(owner = "sb", name = "J", descriptor = "[Z")
    public boolean[] inUse = new boolean[256];

    @OriginalMember(owner = "sb", name = "K", descriptor = "[Z")
    public boolean[] inUse16 = new boolean[16];

    @OriginalMember(owner = "sb", name = "L", descriptor = "[B")
    public byte[] seqToUnseq = new byte[256];

    @OriginalMember(owner = "sb", name = "M", descriptor = "[B")
    public byte[] mtfa = new byte[4096];

    @OriginalMember(owner = "sb", name = "N", descriptor = "[I")
    public int[] mtfbase = new int[16];

    @OriginalMember(owner = "sb", name = "O", descriptor = "[B")
    public byte[] selector = new byte[18002];

    @OriginalMember(owner = "sb", name = "P", descriptor = "[B")
    public byte[] selectorMtf = new byte[18002];

    @OriginalMember(owner = "sb", name = "Q", descriptor = "[[B")
    public byte[][] len = new byte[6][258];

    @OriginalMember(owner = "sb", name = "R", descriptor = "[[I")
    public int[][] limit = new int[6][258];

    @OriginalMember(owner = "sb", name = "S", descriptor = "[[I")
    public int[][] base = new int[6][258];

    @OriginalMember(owner = "sb", name = "T", descriptor = "[[I")
    public int[][] perm = new int[6][258];

    @OriginalMember(owner = "sb", name = "U", descriptor = "[I")
    public int[] minLens = new int[6];

    @OriginalMember(owner = "sb", name = "t", descriptor = "B")
    public byte state_out_ch;

    @OriginalMember(owner = "sb", name = "l", descriptor = "I")
    public int avail_in;

    @OriginalMember(owner = "sb", name = "q", descriptor = "I")
    public int avail_out;

    @OriginalMember(owner = "sb", name = "y", descriptor = "I")
    public int blockSize100k;

    @OriginalMember(owner = "sb", name = "w", descriptor = "I")
    public int bsBuff;

    @OriginalMember(owner = "sb", name = "x", descriptor = "I")
    public int bsLive;

    @OriginalMember(owner = "sb", name = "E", descriptor = "I")
    public int c_nblock_used;

    @OriginalMember(owner = "sb", name = "z", descriptor = "I")
    public int currBlockNo;

    @OriginalMember(owner = "sb", name = "C", descriptor = "I")
    public int k0;

    @OriginalMember(owner = "sb", name = "I", descriptor = "I")
    public int nInUse;

    @OriginalMember(owner = "sb", name = "k", descriptor = "I")
    public int next_in;

    @OriginalMember(owner = "sb", name = "p", descriptor = "I")
    public int next_out;

    @OriginalMember(owner = "sb", name = "A", descriptor = "I")
    public int origPtr;

    @OriginalMember(owner = "sb", name = "V", descriptor = "I")
    public int save_nblock;

    @OriginalMember(owner = "sb", name = "u", descriptor = "I")
    public int state_out_len;

    @OriginalMember(owner = "sb", name = "B", descriptor = "I")
    public int tPos;

    @OriginalMember(owner = "sb", name = "n", descriptor = "I")
    public int total_in_hi32;

    @OriginalMember(owner = "sb", name = "m", descriptor = "I")
    public int total_in_lo32;

    @OriginalMember(owner = "sb", name = "s", descriptor = "I")
    public int total_out_hi32;

    @OriginalMember(owner = "sb", name = "r", descriptor = "I")
    public int total_out_lo32;

    @OriginalMember(owner = "sb", name = "v", descriptor = "Z")
    public boolean blockRandomized;

    @OriginalMember(owner = "sb", name = "o", descriptor = "[B")
    public byte[] decompressed;

    @OriginalMember(owner = "sb", name = "j", descriptor = "[B")
    public byte[] stream;

    @OriginalMember(owner = "sb", name = "H", descriptor = "[I")
    public static int[] tt;
}
