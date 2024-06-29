import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class182 extends class212 {

    @OriginalMember(owner = "client!f", name = "V", descriptor = "Lwc;")
    public static class232 field3237 = new class232(64);

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "J")
    public static long field3240 = 0L;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public static int field3239 = 0;

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
    public static int field3241 = 20;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "F")
    public static float field3238;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Lqe;")
    public class168 field3229;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "[I")
    public int[] field3228;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "[I")
    public int[] field3235;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "[Lqe;")
    public class168[] field3234;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "[Lui;")
    public class236[] field3230;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    public static void method1203(int arg0) {
        if (arg0 != 20) {
            field3240 = -86L;
        }
        field3237 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lmj;IBIIII)V")
    public static final void method1204(class129 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field3236++;
        int var7 = arg1 * arg1 + arg3 * arg3;
        int var8 = -105 % ((arg2 - 76) / 42);
        if (var7 > 360000) {
            return;
        }
        int var9 = Math.min(arg0.field2175 / 2, arg0.field2210 / 2);
        if (var7 <= var9 * var9) {
            class66.method449(arg4, arg0, false, arg1, arg3, arg6, class45.field586[arg5]);
            return;
        }
        var9 -= 10;
        int var10 = class159.field2742 + class103.field1665 & 0x7FF;
        int var11 = class248.field4301[var10];
        int var12 = var11 * 256 / (class100.field1583 + 256);
        int var13 = class248.field4297[var10];
        int var14 = var13 * 256 / (class100.field1583 + 256);
        int var15 = arg3 * var12 - arg1 * var14 >> 16;
        int var16 = arg1 * var12 + arg3 * var14 >> 16;
        double var17 = Math.atan2((double) var16, (double) var15);
        int var19 = (int) (Math.sin(var17) * (double) var9);
        int var20 = (int) ((double) var9 * Math.cos(var17));
        ((class15) class176.field3087[arg5]).method62(arg0.field2175 / 2 + arg6 + var19 - 10, arg0.field2210 / 2 + arg4 + -10 + -var20, 20, 20, 15, 15, var17, 256);
    }
}
