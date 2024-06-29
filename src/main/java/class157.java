import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class157 extends class388 {

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "I")
    public int field2252 = 0;

    @OriginalMember(owner = "client!pca", name = "v", descriptor = "I")
    public static int field2255 = 0;

    @OriginalMember(owner = "client!pca", name = "t", descriptor = "Lgr;")
    public static class530 field2253 = new class530(7, 6);

    @OriginalMember(owner = "client!pca", name = "y", descriptor = "[Z")
    public static boolean[] field2258 = new boolean[5];

    @OriginalMember(owner = "client!pca", name = "r", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!pca", name = "u", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!pca", name = "w", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!pca", name = "x", descriptor = "Ljia;")
    public static class336 field2257;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILsl;)V", line = 3)
    public final void method1120(int arg0, class479 arg1) {
        int var3 = -102 % ((arg0 + 26) / 57);
        while (true) {
            int var4 = arg1.method2886(true);
            if (var4 == 0) {
                field2254++;
                return;
            }
            this.method1122(arg1, var4, -447);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lsl;B)Lqfa;", line = 27)
    public static final class326 method1121(class479 arg0, byte arg1) {
        field2256++;
        String var2 = arg0.method2894(-13192);
        class14 var3 = class176.method1266(24)[arg0.method2886(true)];
        class141 var4 = class501.method3050(true)[arg0.method2886(true)];
        int var5 = arg0.method2870(-11395);
        int var6 = arg0.method2870(-11395);
        int var7 = arg0.method2886(true);
        int var8 = arg0.method2886(true);
        int var9 = arg0.method2886(true);
        int var10 = arg0.method2882(-1);
        int var11 = arg0.method2882(-1);
        int var12 = arg0.method2868(-37);
        int var13 = arg0.method2868(-107);
        if (arg1 > -13) {
            field2255 = 73;
        }
        int var14 = arg0.method2868(-121);
        return new class326(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lsl;II)V", line = 64)
    private final void method1122(class479 arg0, int arg1, int arg2) {
        if (arg2 == -447) {
            if (arg1 == 2) {
                this.field2252 = arg0.method2882(arg2 + 446);
            }
            field2251++;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V", line = 82)
    public static void method1123(byte arg0) {
        field2253 = null;
        int var1 = 82 % ((arg0 + 11) / 43);
        field2257 = null;
        field2258 = null;
    }
}
