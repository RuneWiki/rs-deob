import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class327 implements class159 {

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "Lfp;")
    private class323 field4521;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "Lju;")
    private class124 field4526;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Loia;")
    private class88 field4523;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V", line = 4)
    public static final void method2126(int arg0) {
        field4520++;
        if (class2.field23 != null) {
            return;
        }
        class2.field23 = new int[65536];
        if (arg0 != 1) {
            return;
        }
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
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var11 = var16;
                    var9 = var8;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var9 = var16;
                    var10 = var8;
                    var11 = var18;
                } else if (var14 == 3) {
                    var9 = var16;
                    var11 = var8;
                    var10 = var17;
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
                int var25 = (var23 << 8) + (-(-(var22 << 16) - var24) - 16777216);
                class2.field23[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Z", line = 127)
    public final boolean method49(int arg0) {
        if (arg0 != -32252) {
            this.method1056(false, 81);
        }
        field4524++;
        return this.field4521.method2088(this.field4526.field1497, -85);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)V", line = 139)
    public final void method1056(boolean arg0, int arg1) {
        if (arg1 != -3340) {
            this.method1056(true, 84);
        }
        if (arg0) {
            int var3 = class192.field2561 < class446.field6323 ? class446.field6323 : class192.field2561;
            int var4 = class172.field2348 > class191.field2553 ? class172.field2348 : class191.field2553;
            int var5 = this.field4523.method656();
            int var6 = this.field4523.method670();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var4 < var9) {
                var8 = var4 * var5 / var6;
                var10 = 0;
                var9 = var4;
                var7 = (var3 - var8) / 2;
            }
            this.field4523.method668(var7, var10, var8, var9);
        }
        field4528++;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lfp;Lju;)V", line = 184)
    public class327(class323 arg0, class124 arg1) {
        this.field4521 = arg0;
        this.field4526 = arg1;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)Lek;", line = 193)
    public static final class507 method2127(byte arg0) {
        field4527++;
        if (class678.field9278 == null || class48.field560 == null) {
            return null;
        }
        int var1 = -65 / ((54 - arg0) / 62);
        class48.field560.method2431(class678.field9278, -1819659005);
        class507 var2 = (class507) class48.field560.method2430(11034);
        if (var2 == null) {
            return null;
        } else {
            class344 var3 = class678.field9273.method3088((byte) -87, var2.field7257);
            return var3 != null && var3.field4806 && var3.method2223(class678.field9274, 2) ? var2 : class172.method1105(true);
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V", line = 221)
    public final void method55(int arg0) {
        field4525++;
        this.field4523 = class674.method3686(-20770, this.field4521, this.field4526.field1497);
        if (arg0 != 11133) {
            method2128(-40, -86);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V", line = 233)
    public static final void method2128(int arg0, int arg1) {
        if (arg1 > 104) {
            field4522++;
            class592 var2 = class682.method3825(-652872096, 12, arg0);
            var2.method3350(0);
        }
    }
}
