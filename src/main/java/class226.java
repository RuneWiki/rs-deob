import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class226 extends class159 {

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!cea", name = "k", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "[Z")
    public boolean[] field2926;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "[[I")
    public int[][] field2924;

    @OriginalMember(owner = "client!cea", name = "q", descriptor = "[I")
    public int[] field2927;

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "[I")
    public int[] field2928;

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)V")
    public static final void method1437(boolean arg0) {
        class652.field8795 = 0;
        field2922++;
        int var1 = 0;
        if (arg0) {
            field2923 = 3;
        }
        while (var1 < 2048) {
            class243.field3193[var1] = null;
            class747.field10072[var1] = 1;
            class637.field8588[var1] = null;
            var1++;
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(I[B)V")
    public class226(int arg0, byte[] arg1) {
        this.field2925 = arg0;
        class254 var3 = new class254(arg1);
        this.field2921 = var3.method1731((byte) 64);
        this.field2926 = new boolean[this.field2921];
        this.field2924 = new int[this.field2921][];
        this.field2927 = new int[this.field2921];
        this.field2928 = new int[this.field2921];
        for (int var4 = 0; var4 < this.field2921; var4++) {
            this.field2928[var4] = var3.method1731((byte) 64);
            if (this.field2928[var4] == 6) {
                this.field2928[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field2921; var5++) {
            this.field2926[var5] = var3.method1731((byte) 64) == 1;
        }
        for (int var6 = 0; var6 < this.field2921; var6++) {
            this.field2927[var6] = var3.method1728((byte) 40);
        }
        for (int var7 = 0; var7 < this.field2921; var7++) {
            this.field2924[var7] = new int[var3.method1731((byte) 64)];
        }
        for (int var8 = 0; var8 < this.field2921; var8++) {
            for (int var9 = 0; var9 < this.field2924[var8].length; var9++) {
                this.field2924[var8][var9] = var3.method1731((byte) 64);
            }
        }
    }
}
