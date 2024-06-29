import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class42 extends class511 {

    @OriginalMember(owner = "client!sca", name = "s", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client!sca", name = "r", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!sca", name = "t", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "Lrr;")
    private class332 field590;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "[I")
    public static int[] field589 = new int[1];

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "[I")
    public static int[] field588 = new int[6];

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!sca", name = "v", descriptor = "Lpfa;")
    private class270 field596;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)Lpfa;", line = 5)
    public final class270 method525(boolean arg0) {
        field591++;
        if (!arg0) {
            return null;
        }
        if (this.field596 == null) {
            class667.field9436[2] = this.field585;
            class667.field9436[5] = this.field594;
            class667.field9436[4] = this.field593;
            class667.field9436[3] = this.field592;
            class214 var2 = this.field590.field2812;
            class667.field9436[1] = this.field595;
            class667.field9436[0] = this.field587;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1608(-20340, class667.field9436[var5])) {
                    return null;
                }
                class258 var7 = var2.method1610(18904, class667.field9436[var5]);
                int var8 = var7.field4137 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field4127 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class325.field5061[var6] = var2.method1607(var4, class667.field9436[var6], -20490, false, var4, 1.0F);
            }
            this.field596 = this.field590.method171(var3, true, class325.field5061, var4);
        }
        return this.field596;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(B)V", line = 70)
    public static void method526(byte arg0) {
        field588 = null;
        if (arg0 != -32) {
            method526((byte) 22);
        }
        field589 = null;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIIIB)V", line = 91)
    public static final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field586++;
        int var6 = class160.method1320(arg5 + 28, arg1, class545.field7931, class585.field8331);
        int var7 = class160.method1320(0, arg3, class545.field7931, class585.field8331);
        int var8 = class160.method1320(arg5 ^ 0xFFFFFFE4, arg2, class576.field8218, class340.field5510);
        if (arg5 != -28) {
            method527(-104, -34, -112, 75, -3, (byte) -98);
        }
        int var9 = class160.method1320(0, arg4, class576.field8218, class340.field5510);
        for (int var10 = var6; var10 <= var7; var10++) {
            class367.method2427(arg5 + 3831, arg0, var9, class39.field527[var10], var8);
        }
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lrr;IIIIII)V", line = 117)
    public class42(class332 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field593 = arg5;
        this.field587 = arg1;
        this.field592 = arg4;
        this.field595 = arg2;
        this.field594 = arg6;
        this.field590 = arg0;
        this.field585 = arg3;
    }
}
