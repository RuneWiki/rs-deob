import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class275 extends class247 {

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public int field4462;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public int field4464;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "[I")
    public int[] field4458;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "[Z")
    public boolean[] field4460;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "[[I")
    public int[][] field4468;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "[I")
    public int[] field4461;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Lol;")
    public static class220 field4463 = new class220();

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "Z")
    public static boolean field4466;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public static void method1903(int arg0) {
        field4463 = null;
        int var1 = -7 / ((-arg0 - 40) / 57);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lca;B)V")
    public static final void method1904(class91 arg0, byte arg1) {
        field4465++;
        for (int var2 = 0; var2 < class302.field4810.length; var2++) {
            class302.field4810[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class302.field4810[var16] = (int) (Math.random() * 284.0D);
        }
        if (arg1 != -9) {
            field4466 = false;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class270.field4396[var15] = (class302.field4810[var15 + 1] + class302.field4810[var15 - 1] + class302.field4810[var15 + 128] + class302.field4810[var15 - 128]) / 4;
                }
            }
            int[] var13 = class302.field4810;
            class302.field4810 = class270.field4396;
            class270.field4396 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2952; var7++) {
            for (int var8 = 0; var8 < arg0.field2946; var8++) {
                if (arg0.field1366[var6++] != 0) {
                    int var9 = arg0.field2948 + var8 + 16;
                    int var10 = arg0.field2949 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class302.field4810[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I[B)V")
    public class275(int arg0, byte[] arg1) {
        this.field4462 = arg0;
        class170 var3 = new class170(arg1);
        this.field4464 = var3.method1218(106);
        this.field4458 = new int[this.field4464];
        this.field4460 = new boolean[this.field4464];
        this.field4468 = new int[this.field4464][];
        this.field4461 = new int[this.field4464];
        for (int var4 = 0; var4 < this.field4464; var4++) {
            this.field4458[var4] = var3.method1218(-27);
        }
        for (int var5 = 0; var5 < this.field4464; var5++) {
            this.field4460[var5] = var3.method1218(-72) == 1;
        }
        for (int var6 = 0; var6 < this.field4464; var6++) {
            this.field4461[var6] = var3.method1186((byte) -99);
        }
        for (int var7 = 0; var7 < this.field4464; var7++) {
            this.field4468[var7] = new int[var3.method1218(-37)];
        }
        for (int var8 = 0; var8 < this.field4464; var8++) {
            for (int var9 = 0; var9 < this.field4468[var8].length; var9++) {
                this.field4468[var8][var9] = var3.method1218(98);
            }
        }
    }
}
