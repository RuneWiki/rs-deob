import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class37 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Laj;")
    public static class151 field586;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method229(boolean arg0) {
        if (!arg0) {
            field588 = -96;
        }
        field586 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method230(byte arg0, String arg1) {
        field587++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg1.charAt(var4) - var3;
        }
        if (arg0 != 32) {
            method231(40, (byte) -47);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V")
    public static final void method231(int arg0, byte arg1) {
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        field585++;
        if (arg0 > 10) {
            arg0 = 10;
        }
        class152.field2543 += arg0 * 128;
        if (arg1 > -91) {
            return;
        }
        if (class152.field2543 > class160.field2616.length) {
            class152.field2543 -= class160.field2616.length;
            int var3 = (int) (Math.random() * 12.0D);
            class109.method819(-100, class96.field1556[var3]);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class110.field1825[var4 + var5] - class160.field2616[class160.field2616.length - 1 & class152.field2543 + var4] * arg0 / 6;
            if (var26 < 0) {
                var26 = 0;
            }
            class110.field1825[var4++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class110.field1825[var23 + var24] = 255;
                } else {
                    class110.field1825[var24 + var23] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < (var2 - arg0); var9++) {
            class231.field3924[var9] = class231.field3924[arg0 + var9];
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class231.field3924[var10] = (int) (Math.sin((double) class17.field346 / 14.0D) * 16.0D + Math.sin((double) class17.field346 / 15.0D) * 14.0D + Math.sin((double) class17.field346 / 16.0D) * 12.0D);
            class17.field346++;
        }
        class243.field4083 += arg0;
        int var11 = (arg0 + (class275.field4598 & 0x1)) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class243.field4083; var12++) {
            int var21 = (int) (Math.random() * 128.0D) + 128;
            int var22 = (int) (Math.random() * 124.0D) + 2;
            class110.field1825[(var21 << 7) + var22] = 192;
        }
        class243.field4083 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var20 + var11) < 128) {
                    var18 += class110.field1825[var19 + var20 + var11];
                }
                if ((var20 - var11 - 1) >= 0) {
                    var18 -= class110.field1825[var20 + var19 - var11 - 1];
                }
                if (var20 >= 0) {
                    class28.field484[var20 + var19] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > var16 + var11) {
                    var15 += class28.field484[var11 * 128 + (var14 + var17)];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class28.field484[var14 + var17 - ((var11 + 1) * 128)];
                }
                if (var16 >= 0) {
                    class110.field1825[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }
}
