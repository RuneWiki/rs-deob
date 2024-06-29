import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class54 extends class130 {

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    private int field678;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "[Z")
    public boolean[] field679;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "[[I")
    public int[][] field671;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "[I")
    public int[] field672;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Z")
    public static boolean field674 = false;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field681 = 1;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "Lqj;")
    public static class196 field680 = class80.method502("Null", -48);

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Lba;")
    public static class93 field676 = new class93(64);

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "Lbk;")
    public static class136 field670;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Lnb;")
    public static class95 field673;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public static void method280(int arg0) {
        field680 = null;
        field670 = null;
        if (arg0 == 1) {
            field673 = null;
            field676 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V")
    public static final void method281(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field677++;
        for (int var5 = arg4; var5 < class46.field555; var5++) {
            if (class29.field368[var5] + class138.field2122[var5] > arg0 && class138.field2122[var5] < arg0 + arg3 && class64.field886[var5] + class168.field2828[var5] > arg1 && class168.field2828[var5] < arg1 + arg2) {
                class86.field1271[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I[B)V")
    public class54(int arg0, byte[] arg1) {
        this.field675 = arg0;
        class56 var3 = new class56(arg1);
        this.field678 = var3.method367(1);
        this.field679 = new boolean[this.field678];
        this.field671 = new int[this.field678][];
        this.field672 = new int[this.field678];
        for (int var4 = 0; var4 < this.field678; var4++) {
            this.field672[var4] = var3.method367(1);
        }
        for (int var5 = 0; var5 < this.field678; var5++) {
            this.field679[var5] = var3.method367(1) == 1;
        }
        for (int var6 = 0; var6 < this.field678; var6++) {
            this.field671[var6] = new int[var3.method367(1)];
        }
        for (int var7 = 0; var7 < this.field678; var7++) {
            for (int var8 = 0; var8 < this.field671[var7].length; var8++) {
                this.field671[var7][var8] = var3.method367(1);
            }
        }
    }
}
