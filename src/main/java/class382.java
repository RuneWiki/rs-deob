import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class382 extends class383 {

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public int field5034;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public int field5035;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
    public int[] field5030;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "[Z")
    public boolean[] field5032;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "[I")
    public int[] field5033;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "[[I")
    public int[][] field5039;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Z")
    public static boolean field5029 = false;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Z")
    public static boolean field5037 = false;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "[I")
    public static int[] field5036 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!md", name = "t", descriptor = "[I")
    public static int[] field5038 = new int[50];

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lrk;")
    public static class25 field5031;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "[[S")
    public static short[][] field5040;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method2162(int arg0) {
        field5036 = null;
        field5031 = null;
        if (arg0 != 0) {
            method2163(-56, (byte) -47);
        }
        field5038 = null;
        field5040 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V")
    public static final void method2163(int arg0, byte arg1) {
        class347.field4453 = arg0;
        if (arg1 == -57) {
            field5028++;
            class392.field5265.method2642(0);
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I[B)V")
    public class382(int arg0, byte[] arg1) {
        this.field5034 = arg0;
        class463 var3 = new class463(arg1);
        this.field5035 = var3.method2737(false);
        this.field5030 = new int[this.field5035];
        this.field5032 = new boolean[this.field5035];
        this.field5033 = new int[this.field5035];
        this.field5039 = new int[this.field5035][];
        for (int var4 = 0; var4 < this.field5035; var4++) {
            this.field5030[var4] = var3.method2737(false);
        }
        for (int var5 = 0; var5 < this.field5035; var5++) {
            this.field5032[var5] = var3.method2737(false) == 1;
        }
        for (int var6 = 0; var6 < this.field5035; var6++) {
            this.field5033[var6] = var3.method2758((byte) 106);
        }
        for (int var7 = 0; var7 < this.field5035; var7++) {
            this.field5039[var7] = new int[var3.method2737(false)];
        }
        for (int var8 = 0; var8 < this.field5035; var8++) {
            for (int var9 = 0; var9 < this.field5039[var8].length; var9++) {
                this.field5039[var8][var9] = var3.method2737(false);
            }
        }
    }
}
