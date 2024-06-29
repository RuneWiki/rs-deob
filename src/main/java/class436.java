import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class436 extends class293 {

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    private int field6154;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Ldia;")
    private class246 field6146;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    private int field6158;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    private int field6157;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    private int field6155;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    private int field6152;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    private int field6147;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "[[I")
    public static int[][] field6151 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Lmga;")
    public static class739 field6150 = new class739(78, -1);

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "F")
    public static float field6156;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Lefa;")
    private class196 field6153;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Lefa;")
    public final class196 method1852(int arg0) {
        if (arg0 != 16824) {
            return null;
        }
        field6149++;
        if (this.field6153 == null) {
            class161 var2 = this.field6146.field912;
            class514.field7042[4] = this.field6152;
            class514.field7042[2] = this.field6147;
            class514.field7042[3] = this.field6157;
            class514.field7042[5] = this.field6154;
            class514.field7042[1] = this.field6158;
            class514.field7042[0] = this.field6155;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1173(true, class514.field7042[var5])) {
                    return null;
                }
                class662 var7 = var2.method1174(class514.field7042[var5], true);
                int var8 = var7.field9143 ? 64 : 128;
                if (var7.field9153 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class113.field1551[var6] = var2.method1177(var4, false, var4, 1.0F, class514.field7042[var6], (byte) -117);
            }
            this.field6153 = new class196(this.field6146, 6407, var4, var3, class113.field1551);
        }
        return this.field6153;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZB)V")
    public static final void method2632(boolean arg0, byte arg1) {
        class117.field1680++;
        field6148++;
        class267 var2 = class545.method3099((byte) 75, class269.field3966, class611.field8304);
        class617.method3392(var2, true);
        for (class237 var3 = (class237) class609.field8283.method3960(0); var3 != null; var3 = (class237) class609.field8283.method3955((byte) 26)) {
            if (!var3.method790(arg1 ^ 0x50)) {
                var3 = (class237) class609.field8283.method3960(arg1 - 81);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field3196 == 0) {
                class618.method3397(arg0, true, var3, -86709072);
            }
        }
        if (arg1 != 81) {
            field6151 = null;
        }
        if (class189.field2524 != null) {
            class763.method4242(class189.field2524, true);
            class189.field2524 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public static void method2633(boolean arg0) {
        field6150 = null;
        if (arg0) {
            method2632(true, (byte) -74);
        }
        field6151 = null;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Ldia;IIIIII)V")
    public class436(class246 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6154 = arg6;
        this.field6146 = arg0;
        this.field6158 = arg2;
        this.field6157 = arg4;
        this.field6155 = arg1;
        this.field6152 = arg5;
        this.field6147 = arg3;
    }
}
