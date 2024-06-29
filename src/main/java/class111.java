import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class111 extends class88 {

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public int field2111;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    private int field2105;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "[Z")
    public boolean[] field2108;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "[I")
    public int[] field2106;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "[[I")
    public int[][] field2109;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Lhj;")
    public static class69 field2110 = class181.method1318("::clientdrop", (byte) -126);

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lhj;")
    private static class69 field2104 = class181.method1318(" from your friend list first)3", (byte) -112);

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Lhj;")
    public static class69 field2107 = field2104;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field2112 = 0;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public static void method827(int arg0) {
        field2104 = null;
        if (arg0 != -18059) {
            field2110 = null;
        }
        field2107 = null;
        field2110 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I[B)V")
    public class111(int arg0, byte[] arg1) {
        this.field2111 = arg0;
        class128 var3 = new class128(arg1);
        this.field2105 = var3.method937(false);
        this.field2108 = new boolean[this.field2105];
        this.field2106 = new int[this.field2105];
        this.field2109 = new int[this.field2105][];
        for (int var4 = 0; var4 < this.field2105; var4++) {
            this.field2106[var4] = var3.method937(false);
        }
        for (int var5 = 0; var5 < this.field2105; var5++) {
            this.field2108[var5] = var3.method937(false) == 1;
        }
        for (int var6 = 0; var6 < this.field2105; var6++) {
            this.field2109[var6] = new int[var3.method937(false)];
        }
        for (int var7 = 0; var7 < this.field2105; var7++) {
            for (int var8 = 0; var8 < this.field2109[var7].length; var8++) {
                this.field2109[var7][var8] = var3.method937(false);
            }
        }
    }
}
