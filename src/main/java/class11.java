import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class11 extends class235 {

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public int field231;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "[I")
    public int[] field232;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "[Z")
    public boolean[] field221;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "[[I")
    public int[][] field229;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "[I")
    public static int[] field228 = new int[1000];

    @OriginalMember(owner = "client!o", name = "v", descriptor = "[I")
    public static int[] field222 = new int[100];

    @OriginalMember(owner = "client!o", name = "z", descriptor = "Lsb;")
    private static class98 field226 = class47.method368("Select a world", 0);

    @OriginalMember(owner = "client!o", name = "t", descriptor = "Lsb;")
    public static class98 field220 = field226;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Z")
    public static volatile boolean field230 = false;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "[I")
    public static int[] field223 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "[I")
    public static int[] field225;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static final void method103(int arg0) {
        class156.field2843.method1554((byte) -109);
        field227++;
        if (arg0 != 65280) {
            field220 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static void method104(int arg0) {
        field226 = null;
        field223 = null;
        field222 = null;
        field225 = null;
        if (arg0 == 0) {
            field220 = null;
            field228 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I[B)V")
    public class11(int arg0, byte[] arg1) {
        this.field231 = arg0;
        class216 var3 = new class216(arg1);
        this.field224 = var3.method1446(5350);
        this.field232 = new int[this.field224];
        this.field221 = new boolean[this.field224];
        this.field229 = new int[this.field224][];
        for (int var4 = 0; var4 < this.field224; var4++) {
            this.field232[var4] = var3.method1446(5350);
        }
        for (int var5 = 0; var5 < this.field224; var5++) {
            this.field221[var5] = var3.method1446(5350) == 1;
        }
        for (int var6 = 0; var6 < this.field224; var6++) {
            this.field229[var6] = new int[var3.method1446(5350)];
        }
        for (int var7 = 0; var7 < this.field224; var7++) {
            for (int var8 = 0; var8 < this.field229[var7].length; var8++) {
                this.field229[var7][var8] = var3.method1446(5350);
            }
        }
    }
}
