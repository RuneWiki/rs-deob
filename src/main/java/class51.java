import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class51 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field940 = 0;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lij;")
    public static class50 field942 = class78.method578(121, "loc)3dat");

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
    public static int method413(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)[Lek;")
    public static final class169[] method414(int arg0) {
        field944++;
        class169[] var1 = new class169[class190.field3151];
        for (int var2 = arg0; var2 < class190.field3151; var2++) {
            int var3 = class46.field836[var2] * class164.field2805[var2];
            byte[] var4 = class31.field628[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class114.field1996[method413(var4[var6], 255)];
            }
            var1[var2] = new class169(class89.field1707, class116.field2024, class20.field421[var2], class2.field27[var2], class46.field836[var2], class164.field2805[var2], var5);
        }
        class261.method1759(true);
        return var1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
    public static final void method415() {
        for (int var0 = 0; var0 < class261.field4553; var0++) {
            for (int var5 = 0; var5 < class139.field2421; var5++) {
                for (int var6 = 0; var6 < class54.field978; var6++) {
                    class59.field1089[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class61.field1120; var1++) {
            for (int var4 = 0; var4 < class61.field1122[var1]; var4++) {
                class61.field1131[var1][var4] = null;
            }
            class61.field1122[var1] = 0;
        }
        for (int var2 = 0; var2 < class127.field2225; var2++) {
            class187.field3064[var2] = null;
        }
        class127.field2225 = 0;
        for (int var3 = 0; var3 < class78.field1449.length; var3++) {
            class78.field1449[var3] = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Z")
    public static final boolean method416(int arg0) {
        if (arg0 != 63) {
            field942 = null;
        }
        field946++;
        try {
            return class205.method1382(0);
        } catch (IOException var4) {
            class26.method244((byte) -32);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class213.field3523 + "," + class99.field1827 + "," + class87.field1688 + " - " + class20.field428 + "," + (class239.field4067.field3978[0] + class61.field1124) + "," + (class239.field4067.field3980[0] + class254.field4394) + " - ";
            for (int var3 = 0; var3 < class20.field428 && var3 < 50; var3++) {
                var2 = var2 + class119.field2109.field3633[var3] + ",";
            }
            class121.method883(var2, (byte) -91, var5);
            class25.method239((byte) 54);
            return true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILce;)V")
    public static final void method417(int arg0, int arg1, int arg2, class10 arg3) {
        field941++;
        if (class34.field668 != 0 && class34.field668 != 3 || !arg3.method62(arg1 ^ 0x1CAA84EA)) {
            return;
        }
        int var4 = arg3.field158[arg0];
        if (arg2 < var4 || arg3.field286[arg0] + var4 < arg2) {
            return;
        }
        int var5 = arg0 - arg3.field242 / 2;
        int var6 = arg2 - arg3.field243 / 2;
        int var7 = class45.field832 + class160.field2758 & 0x7FF;
        int var8 = class13.field311[var7];
        int var9 = class13.field313[var7];
        int var10 = (class252.field4381 + 256) * var8 >> 8;
        int var11 = (class252.field4381 + 256) * var9 >> 8;
        int var12 = var5 * var11 + var6 * var10 >> 11;
        int var13 = class239.field4067.field3990 + var12 >> 7;
        int var14 = var5 * var10 - var6 * var11 >> 11;
        int var15 = class239.field4067.field4027 - var14 >> 7;
        boolean var16 = class26.method243(class239.field4067.field3980[0], true, 0, false, 0, var13, var15, class239.field4067.field3978[0], 0, 0, 1, 0);
        if (var16) {
            class190.field3141.method1471(var6, (byte) 24);
            class190.field3141.method1471(var5, (byte) 24);
            class190.field3141.method1494(class160.field2758, (byte) -47);
            class190.field3141.method1471(57, (byte) 24);
            class190.field3141.method1471(class45.field832, (byte) 24);
            class190.field3141.method1471(class252.field4381, (byte) 24);
            class190.field3141.method1471(89, (byte) 24);
            class190.field3141.method1494(class239.field4067.field3990, (byte) -59);
            class190.field3141.method1494(class239.field4067.field4027, (byte) -20);
            class190.field3141.method1471(class57.field1026, (byte) 24);
            class190.field3141.method1471(63, (byte) 24);
        }
        if (arg1 != -480948313) {
            method420(88, 113);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method418(byte arg0) {
        if (arg0 != 89) {
            field942 = null;
        }
        field942 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZILij;)V")
    public static final void method419(boolean arg0, int arg1, class50 arg2) {
        short[] var3 = new short[16];
        class50 var4 = arg2.method402(2023);
        int var5 = 0;
        field945++;
        for (int var6 = 0; var6 < class34.field667; var6++) {
            class239 var10 = class15.method111(var6, false);
            if ((!arg0 || var10.field4094) && var10.field4058 == -1 && var10.field4055 == -1 && var10.field4073 == 0 && var10.field4103.method402(2023).method390(var4, -1) != -1) {
                if (var5 >= 250) {
                    class64.field1227 = null;
                    class252.field4380 = -1;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var11 = new short[var3.length * 2];
                    for (int var12 = 0; var12 < var5; var12++) {
                        var11[var12] = var3[var12];
                    }
                    var3 = var11;
                }
                var3[var5++] = (short) var6;
            }
        }
        class137.field2378 = 0;
        class64.field1227 = var3;
        class252.field4380 = var5;
        class50[] var7 = new class50[class252.field4380];
        int var8 = -71 % ((arg1 + 57) / 52);
        for (int var9 = 0; var9 < class252.field4380; var9++) {
            var7[var9] = class15.method111(var3[var9], false).field4103;
        }
        class220.method1503(var7, true, class64.field1227);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)I")
    public static final int method420(int arg0, int arg1) {
        field943++;
        if (arg1 != -20476) {
            field940 = 1;
        }
        return arg0 & 0xFF;
    }
}
