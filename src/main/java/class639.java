import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class639 extends class381 {

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
    public int field9180;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    public int field9179;

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "[Z")
    public boolean[] field9176;

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "[I")
    public int[] field9181;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "[I")
    public int[] field9175;

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "[[I")
    public int[][] field9178;

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "Lmh;")
    public static class139 field9182 = new class139(3, 2);

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
    public static int field9183 = 0;

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "Ldba;")
    public static class416 field9177;

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(I[B)V", line = 11)
    public class639(int arg0, byte[] arg1) {
        this.field9180 = arg0;
        class540 var3 = new class540(arg1);
        this.field9179 = var3.method3115(29871);
        this.field9176 = new boolean[this.field9179];
        this.field9181 = new int[this.field9179];
        this.field9175 = new int[this.field9179];
        this.field9178 = new int[this.field9179][];
        for (int var4 = 0; var4 < this.field9179; var4++) {
            this.field9175[var4] = var3.method3115(29871);
            if (this.field9175[var4] == 6) {
                this.field9175[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field9179; var5++) {
            this.field9176[var5] = var3.method3115(29871) == 1;
        }
        for (int var6 = 0; var6 < this.field9179; var6++) {
            this.field9181[var6] = var3.method3169(26488);
        }
        for (int var7 = 0; var7 < this.field9179; var7++) {
            this.field9178[var7] = new int[var3.method3115(29871)];
        }
        for (int var8 = 0; var8 < this.field9179; var8++) {
            for (int var9 = 0; var9 < this.field9178[var8].length; var9++) {
                this.field9178[var8][var9] = var3.method3115(29871);
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V", line = 76)
    public static void method3646(byte arg0) {
        field9182 = null;
        int var1 = 67 / ((50 - arg0) / 36);
        field9177 = null;
    }
}
