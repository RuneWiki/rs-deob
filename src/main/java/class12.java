import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class12 extends class44 {

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "[I")
    public static int[] field193 = new int[25];

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field201 = 1;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Lkb;")
    public static class93 field198 = class76.method390("auf einer freien Welt zu spielen)3", 0);

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "Lkb;")
    private static class93 field203 = class76.method390("skill)2", 0);

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Lkb;")
    public static class93 field196 = field203;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Lob;")
    public static class129 field204;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "Lba;")
    public class12 field197;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Lba;")
    public class12 field202;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
    public final void method60(byte arg0) {
        field194++;
        if (this.field202 == null) {
            return;
        }
        this.field202.field197 = this.field197;
        if (arg0 != -93) {
            field201 = -16;
        }
        this.field197.field202 = this.field202;
        this.field202 = null;
        this.field197 = null;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
    public static void method61(byte arg0) {
        field196 = null;
        int var1 = -79 % ((43 - arg0) / 50);
        field204 = null;
        field198 = null;
        field203 = null;
        field193 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILtg;)V")
    public static final void method62(int arg0, class179 arg1) {
        field195++;
        int var2 = 0;
        int var3 = -1;
        int var4 = 0;
        if (arg1.field3559 == 0) {
            var2 = class175.field3458.method844(arg1.field3566, arg1.field3554, arg1.field3556);
        }
        if (arg1.field3559 == 1) {
            var2 = class175.field3458.method816(arg1.field3566, arg1.field3554, arg1.field3556);
        }
        if (arg1.field3559 == 2) {
            var2 = class175.field3458.method832(arg1.field3566, arg1.field3554, arg1.field3556);
        }
        if (arg1.field3559 == 3) {
            var2 = class175.field3458.method809(arg1.field3566, arg1.field3554, arg1.field3556);
        }
        int var5 = 0;
        if (~var2 != arg0) {
            int var6 = class175.field3458.method803(arg1.field3566, arg1.field3554, arg1.field3556, var2);
            var5 = var6 >> 6 & 0x3;
            var3 = var2 >> 14 & 0x7FFF;
            var4 = var6 & 0x1F;
        }
        arg1.field3561 = var3;
        arg1.field3560 = var4;
        arg1.field3551 = var5;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
    public static final void method63(int arg0, int arg1, int arg2, int arg3) {
        field199++;
        if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
            class36.field586 = -1;
            class26.field415 = -1;
            return;
        }
        int var4 = class189.method1226(arg0, arg3 - 1118300113, arg2, class114.field2145) - arg1;
        int var5 = var4 - class108.field1965;
        int var6 = arg2 - class152.field2939;
        int var7 = arg0 - class81.field1497;
        int var8 = class150.field2896[class184.field3629];
        if (arg3 != 1118300112) {
            return;
        }
        int var9 = class150.field2888[class141.field2763];
        int var10 = class150.field2896[class141.field2763];
        int var11 = var6 * var9 + var7 * var10 >> 16;
        int var12 = var7 * var9 - var6 * var10 >> 16;
        int var13 = class150.field2888[class184.field3629];
        int var15 = var5 * var13 - var8 * var12 >> 16;
        int var16 = var5 * var8 + var12 * var13 >> 16;
        if (var16 >= 50) {
            class36.field586 = (var15 << 9) / var16 + 167;
            class26.field415 = (var11 << 9) / var16 + 256;
        } else {
            class36.field586 = -1;
            class26.field415 = -1;
        }
    }
}
