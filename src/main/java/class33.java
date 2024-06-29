import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class33 extends class406 {

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "[I")
    public int[] field382;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "[I")
    public int[] field385;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "[Z")
    public boolean[] field375;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "[[I")
    public int[][] field379;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "Z")
    public static boolean field381 = true;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Liq;")
    public static class362 field374 = new class362("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field386 = -1;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field388 = 0;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "[[B")
    public static byte[][] field387 = new byte[50][];

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "Ltq;")
    public static class376 field384;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "[I")
    public static int[] field380;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V", line = 13)
    public static final void method209(int arg0, int arg1) {
        field383++;
        class20 var2 = class369.method2351((byte) 82, arg0, arg1);
        var2.method148(-11806);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)I", line = 29)
    public static int method210(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 38)
    public static void method211(int arg0) {
        field387 = null;
        field380 = null;
        int var1 = 11 % ((-arg0 - 30) / 53);
        field384 = null;
        field374 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I[B)V", line = 55)
    public class33(int arg0, byte[] arg1) {
        this.field378 = arg0;
        class236 var3 = new class236(arg1);
        this.field376 = var3.method1574(-103);
        this.field382 = new int[this.field376];
        this.field385 = new int[this.field376];
        this.field375 = new boolean[this.field376];
        this.field379 = new int[this.field376][];
        for (int var4 = 0; var4 < this.field376; var4++) {
            this.field385[var4] = var3.method1574(-126);
        }
        for (int var5 = 0; var5 < this.field376; var5++) {
            this.field375[var5] = var3.method1574(-111) == 1;
        }
        for (int var6 = 0; var6 < this.field376; var6++) {
            this.field382[var6] = var3.method1617((byte) 48);
        }
        for (int var7 = 0; var7 < this.field376; var7++) {
            this.field379[var7] = new int[var3.method1574(-76)];
        }
        for (int var8 = 0; var8 < this.field376; var8++) {
            for (int var9 = 0; var9 < this.field379[var8].length; var9++) {
                this.field379[var8][var9] = var3.method1574(-27);
            }
        }
    }
}
