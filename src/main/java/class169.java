import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class169 {

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public int field2445 = 0;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "[[I")
    public int[][] field2456 = new int[6][258];

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "[B")
    public byte[] field2458 = new byte[18002];

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[I")
    public int[] field2447 = new int[257];

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[B")
    public byte[] field2446 = new byte[4096];

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "[B")
    public byte[] field2457 = new byte[256];

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "[I")
    public int[] field2453 = new int[16];

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[[B")
    public byte[][] field2443 = new byte[6][258];

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "[Z")
    public boolean[] field2462 = new boolean[256];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[[I")
    public int[][] field2441 = new int[6][258];

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field2442 = 0;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "[I")
    public int[] field2467 = new int[6];

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "[I")
    public int[] field2469 = new int[256];

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "[Z")
    public boolean[] field2460 = new boolean[16];

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "[[I")
    public int[][] field2471 = new int[6][258];

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "[B")
    public byte[] field2464 = new byte[18002];

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Lub;")
    public static class18 field2465;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field2473;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "B")
    public byte field2468;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public int field2444;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public int field2449;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field2450;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public int field2451;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public int field2466;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public int field2470;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[B")
    public byte[] field2440;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "[B")
    public byte[] field2455;

    static {
        new class304("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field2465 = new class18(8);
        field2473 = new String[100];
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 14)
    public static void method1133(int arg0) {
        field2465 = null;
        if (arg0 != 6) {
            field2473 = null;
        }
        field2473 = null;
    }
}
