import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class42 extends class190 {

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field554 = 0;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "Lqe;")
    public static class168 field555 = class66.method448("Spielwelt erstellt)3", 79);

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "Ljava/awt/Font;")
    public static Font field557;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field558++;
        int var7 = arg5 - arg3;
        int var8 = arg1 + arg3;
        int var9 = arg4 - arg3;
        int var10 = -82 % ((arg0 + 32) / 47);
        for (int var11 = arg1; var11 < var8; var11++) {
            class232.method1501(arg6, arg2, (byte) -108, class241.field4117[var11], arg4);
        }
        for (int var12 = arg5; var12 > var7; var12--) {
            class232.method1501(arg6, arg2, (byte) -108, class241.field4117[var12], arg4);
        }
        int var13 = arg2 + arg3;
        for (int var14 = var8; var14 <= var7; var14++) {
            int[] var15 = class241.field4117[var14];
            class232.method1501(arg6, arg2, (byte) -108, var15, var13);
            class232.method1501(arg6, var9, (byte) -108, var15, arg4);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(DI)V")
    public static final void method282(double arg0, int arg1) {
        if (arg1 != 255) {
            field554 = 11;
        }
        if (class128.field2114 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class190.field3321[var3] = var4 <= 255 ? var4 : 255;
            }
            class128.field2114 = arg0;
        }
        field553++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILqe;IZ)V")
    public static final void method283(int arg0, int arg1, class168 arg2, int arg3, boolean arg4) {
        class129 var5 = class58.method404(arg3, false, arg1);
        field550++;
        if (var5 == null) {
            return;
        }
        if (var5.field2201 != null) {
            class147 var6 = new class147();
            var6.field2573 = arg0;
            var6.field2566 = var5.field2201;
            var6.field2552 = var5;
            var6.field2559 = arg2;
            class82.method545(var6, (byte) 106);
        }
        boolean var7 = arg4;
        if (var5.field2136 > 0) {
            var7 = class60.method412(var5, -206);
        }
        if (!var7 || !class58.method403(client.method266(var5), arg0 - 1, -82)) {
            return;
        }
        if (arg0 == 1) {
            class229.field3890++;
            class87.field1348.method672(242, 238);
            class87.field1348.method770(arg1, (byte) -10);
            class87.field1348.method753(arg3, -242005080);
        }
        if (arg0 == 2) {
            class87.field1348.method672(67, 238);
            class87.field1348.method770(arg1, (byte) -10);
            class87.field1348.method753(arg3, -242005080);
            class109.field1751++;
        }
        if (arg0 == 3) {
            class177.field3102++;
            class87.field1348.method672(233, 238);
            class87.field1348.method770(arg1, (byte) -10);
            class87.field1348.method753(arg3, -242005080);
        }
        if (arg0 == 4) {
            class205.field3563++;
            class87.field1348.method672(153, 238);
            class87.field1348.method770(arg1, (byte) -10);
            class87.field1348.method753(arg3, -242005080);
        }
        if (arg0 == 5) {
            class87.field1348.method672(210, 238);
            class87.field1348.method770(arg1, (byte) -10);
            class87.field1348.method753(arg3, -242005080);
            class150.field2624++;
        }
        if (arg0 == 6) {
            class53.field738++;
            class87.field1348.method672(161, 238);
            class87.field1348.method770(arg1, (byte) -10);
            class87.field1348.method753(arg3, -242005080);
        }
        if (arg0 == 7) {
            class87.field1348.method672(54, 238);
            class99.field1567++;
            class87.field1348.method770(arg1, (byte) -10);
            class87.field1348.method753(arg3, -242005080);
        }
        if (arg0 == 8) {
            class87.field1348.method672(31, 238);
            class87.field1348.method770(arg1, (byte) -10);
            class87.field1348.method753(arg3, -242005080);
            class185.field3255++;
        }
        if (arg0 == 9) {
            class87.field1348.method672(121, 238);
            class87.field1348.method770(arg1, (byte) -10);
            class87.field1348.method753(arg3, -242005080);
            class83.field1249++;
        }
        if (arg0 == 10) {
            class252.field4353++;
            class87.field1348.method672(190, 238);
            class87.field1348.method770(arg1, (byte) -10);
            class87.field1348.method753(arg3, -242005080);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public static void method284(byte arg0) {
        field557 = null;
        if (arg0 <= -79) {
            field555 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II)V")
    public class42(int arg0, int arg1) {
        this.field556 = arg1;
        this.field559 = arg0;
    }
}
