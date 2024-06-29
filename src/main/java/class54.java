import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class54 extends class8 {

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "Lnd;")
    public class81 field761;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field760 = 0;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "[J")
    public static long[] field769 = new long[100];

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "Z")
    public static boolean field768 = false;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "C")
    public static char field767;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "Lgf;")
    public static class140 field770;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "Lek;")
    public static class220 field764;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "[[B")
    public static byte[][] field757;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method344(boolean arg0) {
        if (!arg0) {
            field767 = (char) 65432;
        }
        class303.field4754.method702((byte) 127);
        field765++;
        class83.field1170.method702((byte) 127);
        class195.field3188.method702((byte) 126);
        class169.field2799.method702((byte) 125);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)I", line = 19)
    public static final int method345(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 7515) {
            method349((byte) 116);
        }
        field759++;
        if (arg1 == arg2) {
            return arg1;
        } else {
            int var4 = 128 - arg3;
            int var5 = ((arg1 & 0xFF00FF00) >>> 7) * var4 + (arg2 >>> 7 & 0x1FE01FE) * arg3 & 0xFF00FF00;
            int var6 = (arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg3 & 0xFF00FF00;
            return (var6 >> 7) + var5;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 45)
    public static final void method346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class31 var20 = new class31(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class324.field5032[var21][arg1][arg2] == null) {
                    class324.field5032[var21][arg1][arg2] = new class204(var21, arg1, arg2);
                }
            }
            class324.field5032[arg0][arg1][arg2].field3344 = var20;
        } else if (arg3 == 1) {
            class31 var22 = new class31(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class324.field5032[var23][arg1][arg2] == null) {
                    class324.field5032[var23][arg1][arg2] = new class204(var23, arg1, arg2);
                }
            }
            class324.field5032[arg0][arg1][arg2].field3344 = var22;
        } else {
            class104 var24 = new class104(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class324.field5032[var25][arg1][arg2] == null) {
                    class324.field5032[var25][arg1][arg2] = new class204(var25, arg1, arg2);
                }
            }
            class324.field5032[arg0][arg1][arg2].field3357 = var24;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[F", line = 96)
    public static final float[] method347(byte arg0, int arg1) {
        field762++;
        float var2 = class87.method588() + class87.method592();
        int var3 = class87.method593();
        float var4 = (float) (var3 & 0xFF) / 255.0F;
        class194.field3176[3] = 1.0F;
        float var5 = (float) ((var3 & 0xFF65) >> 8) / 255.0F;
        float var6 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        int var8 = 107 / ((arg0 - 8) / 59);
        class194.field3176[2] = var2 * var7 * (float) client.method767(arg1, 255) / 255.0F * var4;
        class194.field3176[0] = var7 * (float) client.method767(255, arg1 >> 16) / 255.0F * var6 * var2;
        class194.field3176[1] = var2 * var5 * ((float) client.method767(arg1 >> 8, 255) / 255.0F) * var7;
        return class194.field3176;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)Ljj;", line = 124)
    public static final class44 method348(byte arg0) {
        class44 var1 = new class44(34);
        field766++;
        var1.method257(-2, 11);
        var1.method257(-2, class149.field2311);
        var1.method257(-2, class14.field157 ? 1 : 0);
        var1.method257(-2, class273.field4410 ? 1 : 0);
        var1.method257(-2, class297.field4695 ? 1 : 0);
        var1.method257(-2, class245.field3863 ? 1 : 0);
        var1.method257(-2, class322.field4989 ? 1 : 0);
        var1.method257(-2, class42.field535 ? 1 : 0);
        var1.method257(arg0 + 94, class8.field123 ? 1 : 0);
        var1.method257(-2, class180.field2984 ? 1 : 0);
        var1.method257(-2, class18.field250);
        var1.method257(-2, class322.field4994 ? 1 : 0);
        var1.method257(-2, class245.field3872 ? 1 : 0);
        var1.method257(-2, class43.field541 ? 1 : 0);
        var1.method257(-2, class34.field460);
        var1.method257(-2, class152.field2352 ? 1 : 0);
        var1.method257(-2, class261.field4169);
        var1.method257(arg0 ^ 0x5E, class210.field3447);
        var1.method257(arg0 + 94, class174.field2883);
        var1.method287(0, class70.field994);
        var1.method287(0, class45.field634);
        var1.method257(-2, class294.method2104());
        var1.method283((byte) -51, class97.field1376);
        var1.method257(arg0 ^ 0x5E, class318.field4946);
        var1.method257(arg0 + 94, class159.field2627 ? 1 : 0);
        var1.method257(-2, class57.field803 ? 1 : 0);
        var1.method257(-2, class105.field1537);
        var1.method257(-2, class79.field1111 ? 1 : 0);
        if (arg0 != -96) {
            field757 = (byte[][]) ((byte[][]) null);
        }
        var1.method257(-2, class231.field3681 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lnd;)V", line = 163)
    public class54(class81 arg0) {
        this.field761 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(B)V", line = 182)
    public static void method349(byte arg0) {
        field757 = (byte[][]) null;
        field769 = null;
        if (arg0 > -43) {
            method347((byte) 77, 17);
        }
        field764 = null;
        field770 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 195)
    public static final void method350(int arg0, int arg1) {
        if (arg1 == 1) {
            field758++;
            class258.field4132.method708(arg0, true);
            class29.field400.method708(arg0, true);
        }
    }
}
