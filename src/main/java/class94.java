import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class94 extends class32 {

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    private int field1750;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[Z")
    public boolean[] field1755;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "[[I")
    public int[][] field1752;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[I")
    public int[] field1753;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Lij;")
    private static class50 field1757 = class78.method578(124, "skill)2");

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Lij;")
    public static class50 field1751 = field1757;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lda;")
    public static class22 field1749;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Ljd;")
    public static class85 field1756;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[I")
    public static int[] field1754;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method716(byte arg0) {
        field1749 = null;
        int var1 = -91 / ((-arg0 - 29) / 49);
        field1751 = null;
        field1757 = null;
        field1754 = null;
        field1756 = null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I[B)V")
    public class94(int arg0, byte[] arg1) {
        this.field1758 = arg0;
        class217 var3 = new class217(arg1);
        this.field1750 = var3.method1487(255);
        this.field1755 = new boolean[this.field1750];
        this.field1752 = new int[this.field1750][];
        this.field1753 = new int[this.field1750];
        for (int var4 = 0; var4 < this.field1750; var4++) {
            this.field1753[var4] = var3.method1487(255);
        }
        for (int var5 = 0; var5 < this.field1750; var5++) {
            this.field1755[var5] = var3.method1487(255) == 1;
        }
        for (int var6 = 0; var6 < this.field1750; var6++) {
            this.field1752[var6] = new int[var3.method1487(255)];
        }
        for (int var7 = 0; var7 < this.field1750; var7++) {
            for (int var8 = 0; var8 < this.field1752[var7].length; var8++) {
                this.field1752[var7][var8] = var3.method1487(255);
            }
        }
    }
}
