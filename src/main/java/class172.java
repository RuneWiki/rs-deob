import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class172 extends class24 {

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    private int field2797;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "[[I")
    public int[][] field2803;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "[Z")
    public boolean[] field2798;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "[I")
    public int[] field2805;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "[Luf;")
    public static class168[] field2800 = new class168[1000];

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "[[[I")
    public static int[][][] field2804;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V", line = 11)
    public static void method1239(boolean arg0) {
        field2804 = (int[][][]) null;
        field2800 = null;
        if (arg0) {
            method1239(true);
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(I[B)V", line = 49)
    public class172(int arg0, byte[] arg1) {
        this.field2796 = arg0;
        class153 var3 = new class153(arg1);
        this.field2797 = var3.method1042((byte) -28);
        this.field2803 = new int[this.field2797][];
        this.field2798 = new boolean[this.field2797];
        this.field2805 = new int[this.field2797];
        for (int var4 = 0; var4 < this.field2797; var4++) {
            this.field2805[var4] = var3.method1042((byte) 90);
        }
        for (int var5 = 0; var5 < this.field2797; var5++) {
            this.field2798[var5] = var3.method1042((byte) 105) == 1;
        }
        for (int var6 = 0; var6 < this.field2797; var6++) {
            this.field2803[var6] = new int[var3.method1042((byte) 115)];
        }
        for (int var7 = 0; var7 < this.field2797; var7++) {
            for (int var8 = 0; var8 < this.field2803[var7].length; var8++) {
                this.field2803[var7][var8] = var3.method1042((byte) 105);
            }
        }
    }
}
