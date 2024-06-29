import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class466 extends class539 {

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public int field6550;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public int field6553;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "[[I")
    public int[][] field6548;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "[I")
    public int[] field6551;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[I")
    public int[] field6549;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "[Z")
    public boolean[] field6552;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "Luc;")
    public static class27 field6554 = new class27(63, 15);

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lhs;")
    public static class295 field6556 = new class295(0, 1);

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "Lpj;")
    public static class132 field6558;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Lec;")
    public static class213 field6555;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Lln;")
    public static class345 field6559;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method2667(int arg0) {
        field6556 = null;
        field6559 = null;
        if (arg0 < 96) {
            field6556 = null;
        }
        field6554 = null;
        field6555 = null;
        field6558 = null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Lpd;")
    public static final class233 method2668(int arg0) {
        class70.field946 = 0;
        field6557++;
        if (arg0 >= -86) {
            field6559 = null;
        }
        return class640.method3567((byte) -69);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I[B)V")
    public class466(int arg0, byte[] arg1) {
        this.field6550 = arg0;
        class96 var3 = new class96(arg1);
        this.field6553 = var3.method718(-95);
        this.field6548 = new int[this.field6553][];
        this.field6551 = new int[this.field6553];
        this.field6549 = new int[this.field6553];
        this.field6552 = new boolean[this.field6553];
        for (int var4 = 0; var4 < this.field6553; var4++) {
            this.field6549[var4] = var3.method718(-57);
            if (this.field6549[var4] == 6) {
                this.field6549[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field6553; var5++) {
            this.field6552[var5] = var3.method718(-126) == 1;
        }
        for (int var6 = 0; var6 < this.field6553; var6++) {
            this.field6551[var6] = var3.method743((byte) -25);
        }
        for (int var7 = 0; var7 < this.field6553; var7++) {
            this.field6548[var7] = new int[var3.method718(-52)];
        }
        for (int var8 = 0; var8 < this.field6553; var8++) {
            for (int var9 = 0; var9 < this.field6548[var8].length; var9++) {
                this.field6548[var8][var9] = var3.method718(76);
            }
        }
    }
}
