import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class54 {

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "[I")
    public static int[] field764 = new int[4096];

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "[I")
    public static int[] field760 = new int[32];

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lwf;")
    public static class306 field762;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "[Lvk;")
    public static class271[] field765;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[F", line = 4)
    public static final float[] method361(int arg0, int arg1) {
        field767++;
        float var2 = class326.method2216() + class326.method2210();
        int var3 = 32 / ((47 - arg0) / 54);
        int var4 = class326.method2219();
        float var5 = (float) ((var4 & 0xFF149B) >> 16) / 255.0F;
        class107.field1648[3] = 1.0F;
        float var6 = (float) (var4 >> 8 & 0xFF) / 255.0F;
        float var7 = (float) (var4 & 0xFF) / 255.0F;
        float var8 = 0.58823526F;
        class107.field1648[1] = var2 * var8 * var6 * ((float) class311.method2135(255, arg1 >> 8) / 255.0F);
        class107.field1648[2] = var2 * var8 * (float) class311.method2135(arg1, 255) / 255.0F * var7;
        class107.field1648[0] = var2 * var5 * ((float) class311.method2135(255, arg1 >> 16) / 255.0F) * var8;
        return class107.field1648;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)I", line = 33)
    public static final int method362(int arg0, int arg1, int arg2) {
        if (arg0 >= -67) {
            return -128;
        }
        field766++;
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 61)
    public static void method363(byte arg0) {
        if (arg0 > -60) {
            field765 = (class271[]) null;
        }
        field760 = null;
        field765 = null;
        field762 = null;
        field764 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lwf;III)[Lbd;", line = 80)
    public static final class20[] method364(class306 arg0, int arg1, int arg2, int arg3) {
        field761++;
        if (arg3 != 25147) {
            field763 = 29;
        }
        return class156.method1093(true, arg2, arg1, arg0) ? class229.method1572(false) : null;
    }
}
