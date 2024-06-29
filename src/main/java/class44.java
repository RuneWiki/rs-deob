import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class44 extends class401 {

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "[I")
    public int[] field528;

    @OriginalMember(owner = "client!kaa", name = "q", descriptor = "[Z")
    public boolean[] field535;

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "[[I")
    public int[][] field533;

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "[I")
    public int[] field530;

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "Lem;")
    public static class206 field534 = new class206(71, 0);

    @OriginalMember(owner = "client!kaa", name = "r", descriptor = "[[[I")
    public static int[][][] field536 = new int[2][][];

    @OriginalMember(owner = "client!kaa", name = "t", descriptor = "[B")
    public static byte[] field538 = new byte[520];

    @OriginalMember(owner = "client!kaa", name = "s", descriptor = "[I")
    public static int[] field537 = new int[5];

    @OriginalMember(owner = "client!kaa", name = "v", descriptor = "I")
    public static int field540 = 0;

    @OriginalMember(owner = "client!kaa", name = "u", descriptor = "Laba;")
    public static class159 field539 = new class159();

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!kaa", name = "w", descriptor = "[[[B")
    public static byte[][][] field541;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lwp;BLvda;IIILlf;Lr;)V")
    public static final void method374(class163 arg0, byte arg1, class165 arg2, int arg3, int arg4, int arg5, class215 arg6, class166 arg7) {
        field532++;
        if (arg1 != -44) {
            return;
        }
        int var8 = arg0.field2339 - (arg4 / 2) - 5;
        int var9 = arg3 + 2;
        if (arg2.field2371 != 0) {
            arg7.method1170(arg2.field2371, arg6.method1384() * arg5 + arg3 + 1 - var9, var8, arg4 + 10, var9, arg1 - 28163);
        }
        if (arg2.field2402 != 0) {
            arg7.method1166(var9, 1, arg2.field2402, var8, arg4 + 10, -var9 + arg3 - -(arg5 * arg6.method1384()) + 1);
        }
        int var10 = arg2.field2373;
        if (arg0.field2340 && arg2.field2389 != -1) {
            var10 = arg2.field2389;
        }
        for (int var11 = 0; var11 < arg5; var11++) {
            String var12 = class442.field6114[var11];
            if (var11 < arg5 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg6.method1385(arg7, var12, arg0.field2339, arg3, var10, true);
            arg3 += arg6.method1384();
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
    public static void method375(int arg0) {
        field538 = null;
        if (arg0 != -14682) {
            return;
        }
        field541 = null;
        field536 = null;
        field534 = null;
        field537 = null;
        field539 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(I[B)V")
    public class44(int arg0, byte[] arg1) {
        this.field529 = arg0;
        class501 var3 = new class501(arg1);
        this.field531 = var3.method2874((byte) -75);
        this.field528 = new int[this.field531];
        this.field535 = new boolean[this.field531];
        this.field533 = new int[this.field531][];
        this.field530 = new int[this.field531];
        for (int var4 = 0; var4 < this.field531; var4++) {
            this.field530[var4] = var3.method2874((byte) -75);
            if (this.field530[var4] == 6) {
                this.field530[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field531; var5++) {
            this.field535[var5] = var3.method2874((byte) -75) == 1;
        }
        for (int var6 = 0; var6 < this.field531; var6++) {
            this.field528[var6] = var3.method2845(-1);
        }
        for (int var7 = 0; var7 < this.field531; var7++) {
            this.field533[var7] = new int[var3.method2874((byte) -75)];
        }
        for (int var8 = 0; var8 < this.field531; var8++) {
            for (int var9 = 0; var9 < this.field533[var8].length; var9++) {
                this.field533[var8][var9] = var3.method2874((byte) -75);
            }
        }
    }
}
