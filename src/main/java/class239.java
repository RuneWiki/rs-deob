import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class239 {

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field3078 = -1;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "Lus;")
    public static class328 field3083 = new class328(57, 7);

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "Lr;")
    public class108 field3082;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "Lka;")
    public class219 field3079;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "[I")
    public static int[] field3084;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIB)Z", line = 9)
    public static final boolean method1492(int arg0, int arg1, byte arg2) {
        int var3 = -71 / ((arg2 + 86) / 39);
        field3080++;
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 26)
    public static final void method1493(int arg0) {
        if (arg0 > -106) {
            method1492(-77, 121, (byte) 79);
        }
        field3081++;
        if (class487.field6932 != null) {
            return;
        }
        class487.field6932 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var10 = var18;
                    var9 = var8;
                } else if (var14 == 1) {
                    var11 = var16;
                    var9 = var17;
                    var10 = var8;
                } else if (var14 == 2) {
                    var9 = var16;
                    var10 = var8;
                    var11 = var18;
                } else if (var14 == 3) {
                    var10 = var17;
                    var11 = var8;
                    var9 = var16;
                } else if (var14 == 4) {
                    var10 = var16;
                    var11 = var8;
                    var9 = var18;
                } else if (var14 == 5) {
                    var9 = var8;
                    var10 = var16;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + ((var23 << 8) - 16777216) + var24;
                class487.field6932[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "()V", line = 149)
    public static final void method1494() {
        for (int var0 = class335.field4312; var0 < class126.field1511; var0++) {
            for (int var1 = 0; var1 < class90.field1142; var1++) {
                for (int var2 = 0; var2 < class665.field9107; var2++) {
                    class73 var3 = class495.field7002[var0][var1][var2];
                    if (var3 != null) {
                        class525 var4 = var3.field973;
                        class525 var5 = var3.field961;
                        if (var4 != null && var4.method516((byte) -108)) {
                            class248.method1519(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method516((byte) -119)) {
                                class248.method1519(var5, var0, var1, var2, 1, 1);
                                var5.method514(false, 12473, var4, class618.field8660, 0, 0, 0);
                                var5.method523(0);
                            }
                            var4.method523(0);
                        }
                        for (class456 var6 = var3.field969; var6 != null; var6 = var6.field6389) {
                            class451 var8 = var6.field6384;
                            if (var8 != null && var8.method516((byte) -80)) {
                                class248.method1519(var8, var0, var1, var2, var8.field6322 + 1 - var8.field6321, var8.field6324 - var8.field6328 + 1);
                                var8.method523(0);
                            }
                        }
                        class337 var7 = var3.field966;
                        if (var7 != null && var7.method516((byte) -79)) {
                            class495.method2877(var7, var0, var1, var2);
                            var7.method523(0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V", line = 225)
    public static void method1495(int arg0) {
        field3083 = null;
        if (arg0 != 0) {
            field3078 = 37;
        }
        field3084 = null;
    }
}
