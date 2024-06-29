import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class41 extends class513 {

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "[[I")
    public int[][] field580;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "[Z")
    public boolean[] field579;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "[I")
    public int[] field583;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[I")
    public int[] field577;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field576 = -1;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Lqk;")
    public static class148 field578 = new class148(101, 16);

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 9)
    public static void method284(byte arg0) {
        int var1 = -71 / ((arg0 - 21) / 33);
        field578 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBI)Z", line = 26)
    public static final boolean method285(int arg0, byte arg1, int arg2) {
        field584++;
        if (arg1 <= 22) {
            method285(-83, (byte) -31, 99);
        }
        return (arg2 & 0x100100) != 0;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(I[B)V", line = 38)
    public class41(int arg0, byte[] arg1) {
        this.field575 = arg0;
        class26 var3 = new class26(arg1);
        this.field582 = var3.method194((byte) 119);
        this.field580 = new int[this.field582][];
        this.field579 = new boolean[this.field582];
        this.field583 = new int[this.field582];
        this.field577 = new int[this.field582];
        for (int var4 = 0; var4 < this.field582; var4++) {
            this.field577[var4] = var3.method194((byte) 119);
            if (this.field577[var4] == 6) {
                this.field577[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field582; var5++) {
            this.field579[var5] = var3.method194((byte) 119) == 1;
        }
        for (int var6 = 0; var6 < this.field582; var6++) {
            this.field583[var6] = var3.method193(2);
        }
        for (int var7 = 0; var7 < this.field582; var7++) {
            this.field580[var7] = new int[var3.method194((byte) 119)];
        }
        for (int var8 = 0; var8 < this.field582; var8++) {
            for (int var9 = 0; var9 < this.field580[var8].length; var9++) {
                this.field580[var8][var9] = var3.method194((byte) 119);
            }
        }
    }
}
