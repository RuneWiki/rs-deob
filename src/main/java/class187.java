import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class187 extends class338 {

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "J")
    public static volatile long field2359 = 0L;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "J")
    public long field2365;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "Ltm;")
    public class187 field2358;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "Ltm;")
    public class187 field2362;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
    public static final void method1007(int arg0) {
        field2361++;
        if (class180.field2271 != null) {
            return;
        }
        class180.field2271 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 != 3) {
            field2359 = 69L;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class180.field2271[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)V")
    public static final void method1008(boolean arg0, int arg1) {
        class24.method130(0);
        field2356++;
        class367.method2223((byte) 96);
        int var2 = class44.method209(arg1, -120).field1908;
        if (arg0) {
            method1008(true, 65);
        }
        if (var2 == 0) {
            return;
        }
        int var3 = class254.field3495[arg1];
        if (var2 == 5) {
            class56.field566 = var3;
        }
        if (var2 == 9) {
            class242.field3301 = var3;
        }
        if (var2 == 6) {
            class27.field260 = var3;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public final void method1009(byte arg0) {
        field2364++;
        if (this.field2362 == null) {
            return;
        }
        this.field2362.field2358 = this.field2358;
        int var2 = 65 % ((arg0 - 64) / 53);
        this.field2358.field2362 = this.field2362;
        this.field2362 = null;
        this.field2358 = null;
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)Z")
    public final boolean method1010(int arg0) {
        field2363++;
        if (this.field2362 == null) {
            return false;
        } else if (arg0 == 6) {
            return true;
        } else {
            return true;
        }
    }
}
