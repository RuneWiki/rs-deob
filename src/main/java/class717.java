import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class717 extends class408 {

    @OriginalMember(owner = "client!pca", name = "D", descriptor = "Lqe;")
    public static class469 field10081 = new class469(54, -1);

    @OriginalMember(owner = "client!pca", name = "y", descriptor = "I")
    public static int field10077;

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "I")
    public static int field10078;

    @OriginalMember(owner = "client!pca", name = "A", descriptor = "I")
    public static int field10079;

    @OriginalMember(owner = "client!pca", name = "B", descriptor = "I")
    public static int field10080;

    @OriginalMember(owner = "client!pca", name = "G", descriptor = "I")
    public static int field10083;

    @OriginalMember(owner = "client!pca", name = "H", descriptor = "I")
    public static int field10084;

    @OriginalMember(owner = "client!pca", name = "E", descriptor = "Lhe;")
    private class372 field10082;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)V", line = 3)
    public static final void method4070(byte arg0) {
        field10080++;
        if (arg0 > -91) {
            field10081 = null;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class251.field3626[var1] = false;
        }
        class762.field10618 = 0;
        class423.field6297 = class364.field5254;
        class241.field3506 = class120.field1650;
        class583.field8297 = 0;
        class70.field988 = -1;
        class264.field3784 = 5;
        class289.field4123 = class259.field3700;
        class531.field7565 = class460.field6783;
        class520.field7451 = -1;
        class95.field1352 = class357.field5189;
        class74.field1027 = class660.field9234;
        class67.field967 = -1;
        class656.field9191 = -1;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILrg;)V", line = 34)
    public final void method4071(int arg0, class645 arg1) {
        while (true) {
            int var3 = arg1.method3745(-6314);
            if (var3 == 0) {
                if (arg0 != 17440) {
                    field10081 = null;
                }
                field10084++;
                return;
            }
            this.method4075((byte) -52, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;", line = 61)
    public final String method4072(String arg0, int arg1, byte arg2) {
        field10083++;
        if (this.field10082 == null) {
            return arg0;
        }
        if (arg2 < 76) {
            field10081 = null;
        }
        class139 var4 = (class139) this.field10082.method2287((long) arg1, (byte) -117);
        return var4 == null ? arg0 : var4.field1856;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(JJ)J", line = 85)
    public static long method4073(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "(B)V", line = 93)
    public static final void method4074(byte arg0) {
        field10078++;
        if (class9.field141 != null) {
            return;
        }
        class9.field141 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        if (arg0 < 0) {
            field10081 = null;
        }
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
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var9 = var8;
                    var11 = var16;
                } else if (var14 == 1) {
                    var9 = var17;
                    var10 = var8;
                    var11 = var16;
                } else if (var14 == 2) {
                    var10 = var8;
                    var11 = var18;
                    var9 = var16;
                } else if (var14 == 3) {
                    var9 = var16;
                    var10 = var17;
                    var11 = var8;
                } else if (var14 == 4) {
                    var9 = var18;
                    var11 = var8;
                    var10 = var16;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class9.field141[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BILrg;)V", line = 214)
    private final void method4075(byte arg0, int arg1, class645 arg2) {
        if (arg0 != -52) {
            this.field10082 = null;
        }
        if (arg1 == 249) {
            int var4 = arg2.method3745(-6314);
            if (this.field10082 == null) {
                int var5 = class432.method2684(var4, -21774);
                this.field10082 = new class372(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method3745(arg0 ^ 0x189A) == 1;
                int var8 = arg2.method3747((byte) -74);
                class184 var9;
                if (var7) {
                    var9 = new class139(arg2.method3752(-2));
                } else {
                    var9 = new class317(arg2.method3720(-19541));
                }
                this.field10082.method2278((byte) -121, (long) var8, var9);
            }
        }
        field10079++;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V", line = 259)
    public static void method4076(int arg0) {
        field10081 = null;
        if (arg0 >= -6) {
            method4074((byte) -88);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIB)I", line = 270)
    public final int method4077(int arg0, int arg1, byte arg2) {
        field10077++;
        if (this.field10082 == null) {
            return arg1;
        }
        class317 var4 = (class317) this.field10082.method2287((long) arg0, (byte) -117);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg2 != -27) {
                this.method4071(96, null);
            }
            return var4.field4518;
        }
    }
}
