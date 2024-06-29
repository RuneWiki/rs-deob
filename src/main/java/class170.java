import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class170 extends class190 {

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "[I")
    public int[] field2960 = new int[1];

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "[I")
    public int[] field2964 = new int[] { -1 };

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field2959 = 0;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "Lqe;")
    public static class168 field2966 = class66.method448("Nehmen", 37);

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public static int field2967 = 1;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "[I")
    public static int[] field2961;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "[I")
    public static int[] field2963;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1127(int arg0, Component arg1) {
        field2957++;
        if (arg0 != -21301) {
            return;
        }
        Method var2 = class239.field4096;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class165.field2816);
        arg1.addFocusListener(class165.field2816);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public static void method1128(byte arg0) {
        field2961 = null;
        field2966 = null;
        if (arg0 >= -62) {
            field2961 = null;
        }
        field2963 = null;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
    public static final void method1129(byte arg0) {
        field2965++;
        if (arg0 < 25) {
            return;
        }
        if (!class119.method816((byte) 15) && class196.field3401 != class118.field1938) {
            class18.method94(27578, class7.field85.field206[0], class159.field2743, class7.field85.field219[0], false, class196.field3401, class155.field2696);
        } else if (class29.field348 != class196.field3401) {
            class29.field348 = class196.field3401;
            class101.method668(class196.field3401, -30862);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
    public static final void method1130(int arg0, int arg1, int arg2) {
        field2958++;
        short var3 = 256;
        if (class253.field4376 > 0) {
            class58.method402(-110, class253.field4376);
            class253.field4376 = 0;
        }
        int var4 = 0;
        int var5 = class216.field3729 * arg0;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class142.field2497[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class197.field3415[var4++];
                int var12 = class216.field3731[arg1 + var5++];
                if (var11 == 0) {
                    class179.field3158.field136[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 256 - var11 - 18;
                    int var15 = class29.field358[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class179.field3158.field136[var6++] = class86.method571(var13 * class86.method571(var15, 16711935) + class86.method571(16711935, var12) * var14, -16711936) + class86.method571(16711680, class86.method571(var15, 65280) * var13 + var14 * class86.method571(var12, 65280)) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class179.field3158.field136[var6++] = class216.field3731[var5++ + arg1];
            }
            var5 += class216.field3729 - 128;
        }
        class179.field3158.method76(arg1, arg0);
        if (arg2 != 18) {
            method1131(23, 0L);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IJ)Lqe;")
    public static final class168 method1131(int arg0, long arg1) {
        if (arg0 < 20) {
            field2963 = null;
        }
        field2962++;
        return class110.method716(10, 13131, arg1, false);
    }
}
