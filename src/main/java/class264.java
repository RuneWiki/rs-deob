import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class264 extends class81 {

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    private int field4511;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "[[I")
    public int[][] field4509;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "[I")
    public int[] field4510;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "[Z")
    public boolean[] field4514;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field4507 = 0;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Lpj;")
    public static class237 field4508 = class33.method353(":allyreq:", 122);

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field4517 = 0;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "[[B")
    public static byte[][] field4518 = new byte[1000][];

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field4513 = 10;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "[I")
    public static int[] field4516 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Lob;")
    public static class128 field4506;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "[Lgk;")
    public static class154[] field4515;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)V")
    public static void method1765(boolean arg0) {
        field4508 = null;
        if (!arg0) {
            field4518 = null;
            field4506 = null;
            field4515 = null;
            field4516 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method1766(int arg0, int arg1) {
        if (arg1 != 0) {
            method1766(35, -96);
        }
        if (class106.field1886 == null || class106.field1886.length < arg0) {
            class106.field1886 = new int[arg0];
        }
        field4505++;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I[B)V")
    public class264(int arg0, byte[] arg1) {
        this.field4512 = arg0;
        class32 var3 = new class32(arg1);
        this.field4511 = var3.method316((byte) 113);
        this.field4509 = new int[this.field4511][];
        this.field4510 = new int[this.field4511];
        this.field4514 = new boolean[this.field4511];
        for (int var4 = 0; var4 < this.field4511; var4++) {
            this.field4510[var4] = var3.method316((byte) 98);
        }
        for (int var5 = 0; var5 < this.field4511; var5++) {
            this.field4514[var5] = var3.method316((byte) 118) == 1;
        }
        for (int var6 = 0; var6 < this.field4511; var6++) {
            this.field4509[var6] = new int[var3.method316((byte) 105)];
        }
        for (int var7 = 0; var7 < this.field4511; var7++) {
            for (int var8 = 0; var8 < this.field4509[var7].length; var8++) {
                this.field4509[var7][var8] = var3.method316((byte) -40);
            }
        }
    }
}
