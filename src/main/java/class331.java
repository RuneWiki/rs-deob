import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class331 {

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Loi;")
    public static class169 field4251 = new class169("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[[I")
    public static int[][] field4253 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "[I")
    public static int[] field4254 = new int[32];

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Lul;")
    public static class316 field4255;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "[[S")
    public static short[][] field4252;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILqa;III)V")
    public static final void method1976(int arg0, int arg1, class129 arg2, int arg3, int arg4, int arg5) {
        arg2.method925(arg4, arg0, arg1 + arg4, arg0 - -arg3);
        field4250++;
        arg2.method866(arg3, -5152, arg4, arg1, arg0, -16777216);
        if (class412.field5499 < 100) {
            return;
        }
        float var6 = (float) class230.field2978 / (float) class230.field2970;
        int var7 = arg1;
        int var8 = arg3;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg1 * var6);
        } else {
            var7 = (int) ((float) arg3 / var6);
        }
        int var9 = (arg1 - var7) / 2 + arg4;
        int var10 = (arg3 - var8) / 2 + arg0;
        if (class108.field1474 == null || class108.field1474.method375() != arg1 || class108.field1474.method378() != arg3) {
            class230.method1463(class230.field2983, class230.field2978 + class230.field2971, class230.field2983 + class230.field2970, class230.field2971, var9, var10, var7 + var9, var8 + var10);
            class230.method1469(arg2);
            class108.field1474 = arg2.method905(var9, var10, var7, var8, false);
        }
        class108.field1474.method2406(var9, var10);
        int var11 = class529.field7801 * var7 / class230.field2970;
        int var12 = class302.field3917 * var8 / class230.field2978;
        int var13 = var9 + (class357.field4599 * var7 / class230.field2970);
        int var14 = var10 - var12 - (class175.field2248 * var8 / class230.field2978 + -var8);
        int var15 = -1996554240;
        if (class494.field7234 == class10.field134) {
            var15 = -1996488705;
        }
        arg2.method861(var13, var14, var11, var12, var15, 1);
        arg2.method918(var13, var14, var11, var12, var15, arg5);
        if (class407.field5459 <= 0) {
            return;
        }
        int var16;
        if (class181.field2366 <= 50) {
            var16 = class181.field2366 * 5;
        } else {
            var16 = (100 - class181.field2366) * 5;
        }
        for (class343 var17 = (class343) class230.field2953.method49(24); var17 != null; var17 = (class343) class230.field2953.method46((byte) 97)) {
            class429 var18 = class230.field2950.method1093(var17.field4371, arg5 ^ 0xFFFFFF95);
            if (class294.method1765(var18, 837401932)) {
                if (class196.field2536 == var17.field4371) {
                    int var19 = var9 + (var17.field4367 * var7 / class230.field2970);
                    int var20 = var10 + ((class230.field2978 - var17.field4368) * var8 / class230.field2978);
                    arg2.method866(4, arg5 ^ 0xFFFFEBE0, var19 - 2, 4, var20 - 2, var16 << 24 | 0xFFFF00);
                } else if (class246.field3149 != -1 && class246.field3149 == var18.field5912) {
                    int var21 = var17.field4367 * var7 / class230.field2970 + var9;
                    int var22 = (class230.field2978 - var17.field4368) * var8 / class230.field2978 + var10;
                    arg2.method866(4, -5152, var21 - 2, 4, var22 - 2, var16 << 24 | 0xFFFF00);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method1977(int arg0) {
        field4253 = null;
        field4255 = null;
        field4251 = null;
        if (arg0 != 2) {
            field4253 = null;
        }
        field4254 = null;
        field4252 = null;
    }
}
