import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class14 {

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[Luc;")
    public static class169[] field135 = new class169[100];

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lqe;")
    private static class168 field134 = class66.method448("glow3:", -110);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lqe;")
    public static class168 field128 = field134;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lqe;")
    public static class168 field132 = field134;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lqg;I)V")
    public static final void method52(class217 arg0, int arg1) {
        field133++;
        short var2 = 256;
        for (int var3 = 0; var3 < class245.field4255.length; var3++) {
            class245.field4255[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var17 = (int) (Math.random() * 128.0D * (double) var2);
            class245.field4255[var17] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var13 = 1; var13 < var2 - 1; var13++) {
                for (int var15 = 1; var15 < 127; var15++) {
                    int var16 = (var13 << 7) + var15;
                    class233.field3963[var16] = (class245.field4255[var16 - 1] + class245.field4255[var16 + 1] + class245.field4255[var16 + -128] + class245.field4255[var16 + 128]) / 4;
                }
            }
            int[] var14 = class245.field4255;
            class245.field4255 = class233.field3963;
            class233.field3963 = var14;
        }
        int var6 = 25 % ((arg1 - 59) / 63);
        if (arg0 == null) {
            return;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.field2739; var8++) {
            for (int var9 = 0; var9 < arg0.field2737; var9++) {
                if (arg0.field3734[var7++] != 0) {
                    int var10 = arg0.field2723 + var9 + 16;
                    int var11 = var8 + arg0.field2730 + 16;
                    int var12 = var10 + (var11 << 7);
                    class245.field4255[var12] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lqe;")
    public static final class168 method53(int arg0, int arg1) {
        field129++;
        if (arg0 != -7303) {
            method55((byte) -33);
        }
        return class125.field2052[arg1].method1109((byte) 72) > 0 ? class50.method347(2, new class168[] { class151.field2640[arg1], class237.field4052, class125.field2052[arg1] }) : class151.field2640[arg1];
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method54(int arg0, Component arg1) {
        field131++;
        int var2 = 24 / ((50 - arg0) / 33);
        arg1.addMouseListener(class62.field845);
        arg1.addMouseMotionListener(class62.field845);
        arg1.addFocusListener(class62.field845);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method55(byte arg0) {
        field132 = null;
        if (arg0 >= -42) {
            field134 = null;
        }
        field135 = null;
        field134 = null;
        field128 = null;
    }
}
