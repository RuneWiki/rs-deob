import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends Canvas {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field87;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lge;")
    public static class71 field95 = new class71(20);

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "[I")
    public static int[] field96 = new int[5];

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[Lkh;")
    public static class117[] field99 = new class117[100];

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Lkh;")
    public static class117 field102 = class224.method1450((byte) -46, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lkh;")
    private static class117 field98 = class224.method1450((byte) 117, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Lkh;")
    public static class117 field97 = field98;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field103 = 0;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Lkh;")
    private static class117 field104 = class224.method1450((byte) 110, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lkh;")
    public static class117 field100 = field104;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Lvb;")
    public static class232 field101;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZBIII)V")
    public static final void method45(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        field93++;
        if (class223.method1446(arg3, 6) && arg1 == -128) {
            class117.method806(-1, arg0, true, class90.field1675[arg3], arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ae", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field88++;
        this.field87.update(arg0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method46(int arg0) {
        field101 = null;
        field100 = null;
        field99 = null;
        if (arg0 >= -123) {
            return;
        }
        field97 = null;
        field96 = null;
        field104 = null;
        field95 = null;
        field98 = null;
        field102 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)I")
    public static final int method47(int arg0, int arg1, int arg2) {
        if (arg0 == -825699888) {
            long var3 = (long) ((arg1 << 16) + arg2);
            field94++;
            return class233.field4197 != null && class233.field4197.field389 == var3 ? class40.field920.field2643 * 99 / (class40.field920.field2613.length - class233.field4197.field2993) + 1 : 0;
        } else {
            return 103;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLai;)V")
    public static final void method48(byte arg0, class10 arg1) {
        class105.field1915 = arg1;
        if (arg0 != 75) {
            field99 = null;
        }
        field92++;
    }

    @OriginalMember(owner = "client!ae", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field87.paint(arg0);
        field89++;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V")
    public static final void method49(int arg0, int arg1, int arg2) {
        class170 var3 = class109.field2063[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3062 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class6(Component arg0) {
        this.field87 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lkh;ZI)V")
    public static final void method50(class117 arg0, boolean arg1, int arg2) {
        field91++;
        short[] var3 = new short[16];
        if (arg2 != 23636) {
            field100 = null;
        }
        class117 var4 = arg0.method820(-128);
        int var5 = 0;
        for (int var6 = 0; var6 < class227.field4087; var6++) {
            class154 var9 = class214.method1408((byte) 102, var6);
            if ((!arg1 || var9.field2772) && var9.field2822 == -1 && var9.field2767 == -1 && var9.field2823 == 0 && var9.field2812.method820(-127).method799(var4, 0) != -1) {
                if (var5 >= 250) {
                    class203.field3677 = null;
                    class148.field2703 = -1;
                    return;
                }
                if (var3.length <= var5) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        class40.field911 = 0;
        class148.field2703 = var5;
        class203.field3677 = var3;
        class117[] var7 = new class117[class148.field2703];
        for (int var8 = 0; var8 < class148.field2703; var8++) {
            var7[var8] = class214.method1408((byte) 102, var3[var8]).field2812;
        }
        class41.method356(116, class203.field3677, var7);
    }
}
