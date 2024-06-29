import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class414 extends class540 {

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public int field5848;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public int field5845;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "[I")
    public int[] field5849;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "[I")
    public int[] field5847;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "[[I")
    public int[][] field5852;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "[Z")
    public boolean[] field5850;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field5846 = 100;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "Lkf;")
    public static class263 field5851;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V", line = 5)
    public static void method2482(byte arg0) {
        field5851 = null;
        if (arg0 <= 3) {
            method2482((byte) -31);
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(I[B)V", line = 23)
    public class414(int arg0, byte[] arg1) {
        this.field5848 = arg0;
        class120 var3 = new class120(arg1);
        this.field5845 = var3.method842(2384);
        this.field5849 = new int[this.field5845];
        this.field5847 = new int[this.field5845];
        this.field5852 = new int[this.field5845][];
        this.field5850 = new boolean[this.field5845];
        for (int var4 = 0; var4 < this.field5845; var4++) {
            this.field5849[var4] = var3.method842(2384);
            if (this.field5849[var4] == 6) {
                this.field5849[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field5845; var5++) {
            this.field5850[var5] = var3.method842(2384) == 1;
        }
        for (int var6 = 0; var6 < this.field5845; var6++) {
            this.field5847[var6] = var3.method898((byte) -110);
        }
        for (int var7 = 0; var7 < this.field5845; var7++) {
            this.field5852[var7] = new int[var3.method842(2384)];
        }
        for (int var8 = 0; var8 < this.field5845; var8++) {
            for (int var9 = 0; var9 < this.field5852[var8].length; var9++) {
                this.field5852[var8][var9] = var3.method842(2384);
            }
        }
    }
}
