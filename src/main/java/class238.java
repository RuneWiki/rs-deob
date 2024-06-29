import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class238 extends class128 {

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Z")
    public boolean field3684 = false;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public int field3688 = -1;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "Z")
    public boolean field3695 = false;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "Ljava/lang/String;")
    public static String field3685 = "Loaded textures";

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3694 = " is already on your ignore list.";

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public int field3687;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public int field3689;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public int field3691;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public int field3692;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "[[I")
    public static int[][] field3693;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIBIIILim;)V")
    public static final void method1560(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class178 arg6) {
        field3690++;
        class149 var7 = class121.method784(-110, arg4);
        if (var7 != null && var7.field2067 && var7.method937(-90)) {
            if (var7.field2052 != null) {
                int[] var8 = new int[var7.field2052.length];
                for (int var9 = 0; var9 < var8.length / 2; var9++) {
                    int var11;
                    if (class12.field203 == 4) {
                        var11 = (int) class123.field1743 & 0x7FF;
                    } else {
                        var11 = (int) class123.field1743 + class179.field2712 & 0x7FF;
                    }
                    int var12 = class118.field1697[var11];
                    int var13 = class118.field1690[var11];
                    if (class12.field203 != 4) {
                        var12 = var12 * 256 / (class42.field627 + 256);
                        var13 = var13 * 256 / (class42.field627 + 256);
                    }
                    var8[var9 * 2] = arg6.field2529 / 2 + arg0 + ((var7.field2052[var9 * 2] * 4 + arg1) * var13 + (var7.field2052[var9 * 2 - -1] * 4 + arg5) * var12 >> 16);
                    var8[var9 * 2 + 1] = arg6.field2571 / 2 + arg3 - ((var7.field2052[var9 * 2 - -1] * 4 + arg5) * var13 + -((arg1 - -(var7.field2052[var9 * 2] * 4)) * var12) >> 16);
                }
                class237.method1553(var8, var7.field2055, var7.field2055 >>> 24, arg6.field2528, arg6.field2631);
                for (int var10 = 0; var10 < (var8.length / 2 - 1); var10++) {
                    class266.method1733(var8[var10 * 2], var8[var10 * 2 + 1], var8[(var10 + 1) * 2], var8[var10 * 2 + 1 + 2], var7.field2027, var7.field2027 >>> 24, arg6.field2528, arg6.field2631);
                }
                class266.method1733(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field2027, var7.field2027 >>> 24, arg6.field2528, arg6.field2631);
            }
            class284 var14 = null;
            if (var7.field2072 != -1) {
                var14 = var7.method932((byte) 59, false, false);
                if (var14 != null) {
                    class194.method1225(arg3, var14, arg5, arg6, arg1, arg0, 109);
                }
            }
            if (var7.field2068 != null) {
                int var15 = 0;
                class33 var16 = class301.field4788;
                if (var14 != null) {
                    var15 = var14.field4557;
                }
                if (var7.field2044 == 1) {
                    var16 = class17.field293;
                }
                if (var7.field2044 == 2) {
                    var16 = class261.field4201;
                }
                class153.method959(arg0, var15, arg3, var7.field2068, arg1, arg6, arg5, var16, -5, var7.field2031);
            }
        }
        if (arg2 >= -123) {
            method1560(-34, 14, (byte) 69, -12, 7, 110, (class178) null);
        }
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V")
    public static void method1561(int arg0) {
        field3685 = null;
        field3693 = null;
        field3694 = null;
        if (arg0 != -5) {
            method1561(-115);
        }
    }
}
