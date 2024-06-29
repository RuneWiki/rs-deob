import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class314 extends class425 {

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
    public int field4648;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
    public int field4646;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "[Z")
    public boolean[] field4641;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "[I")
    public int[] field4639;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "[I")
    public int[] field4644;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "[[I")
    public int[][] field4640;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "Z")
    public static boolean field4645 = false;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "[I")
    public static int[] field4643 = new int[2];

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)Z")
    public static final boolean method2035(int arg0, int arg1, int arg2) {
        field4642++;
        if (arg1 == -7) {
            return method2037(arg1 ^ 0x7E, arg2, arg0) | (arg2 & 0x60000) != 0 || class629.method3599(arg2, -92, arg0) || class677.method3808(arg2, 1, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static void method2036(int arg0) {
        if (arg0 == 0) {
            field4643 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(III)Z")
    public static final boolean method2037(int arg0, int arg1, int arg2) {
        if (arg0 > -42) {
            method2036(-115);
        }
        field4647++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I[B)V")
    public class314(int arg0, byte[] arg1) {
        this.field4648 = arg0;
        class61 var3 = new class61(arg1);
        this.field4646 = var3.method732(-559537960);
        this.field4641 = new boolean[this.field4646];
        this.field4639 = new int[this.field4646];
        this.field4644 = new int[this.field4646];
        this.field4640 = new int[this.field4646][];
        for (int var4 = 0; var4 < this.field4646; var4++) {
            this.field4639[var4] = var3.method732(-559537960);
            if (this.field4639[var4] == 6) {
                this.field4639[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field4646; var5++) {
            this.field4641[var5] = var3.method732(-559537960) == 1;
        }
        for (int var6 = 0; var6 < this.field4646; var6++) {
            this.field4644[var6] = var3.method723((byte) -25);
        }
        for (int var7 = 0; var7 < this.field4646; var7++) {
            this.field4640[var7] = new int[var3.method732(-559537960)];
        }
        for (int var8 = 0; var8 < this.field4646; var8++) {
            for (int var9 = 0; var9 < this.field4640[var8].length; var9++) {
                this.field4640[var8][var9] = var3.method732(-559537960);
            }
        }
    }
}
