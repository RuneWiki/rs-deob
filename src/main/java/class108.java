import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class108 extends class45 {

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public int field1283;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "[Z")
    public boolean[] field1282;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "[I")
    public int[] field1279;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "[I")
    public int[] field1280;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "[[I")
    public int[][] field1276;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "Lgk;")
    public static class615 field1274 = new class615();

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V", line = 20)
    public static void method590(int arg0) {
        field1274 = null;
        if (arg0 < 40) {
            field1281 = 13;
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(I[B)V", line = 31)
    public class108(int arg0, byte[] arg1) {
        this.field1278 = arg0;
        class157 var3 = new class157(arg1);
        this.field1283 = var3.method930(255);
        this.field1282 = new boolean[this.field1283];
        this.field1279 = new int[this.field1283];
        this.field1280 = new int[this.field1283];
        this.field1276 = new int[this.field1283][];
        for (int var4 = 0; var4 < this.field1283; var4++) {
            this.field1279[var4] = var3.method930(255);
            if (this.field1279[var4] == 6) {
                this.field1279[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field1283; var5++) {
            this.field1282[var5] = var3.method930(255) == 1;
        }
        for (int var6 = 0; var6 < this.field1283; var6++) {
            this.field1280[var6] = var3.method963(-122);
        }
        for (int var7 = 0; var7 < this.field1283; var7++) {
            this.field1276[var7] = new int[var3.method930(255)];
        }
        for (int var8 = 0; var8 < this.field1283; var8++) {
            for (int var9 = 0; var9 < this.field1276[var8].length; var9++) {
                this.field1276[var8][var9] = var3.method930(255);
            }
        }
    }
}
