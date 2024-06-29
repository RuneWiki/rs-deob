import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class333 {

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "[Lch;")
    private class465[] field4774 = null;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "Lkj;")
    public class568 field4777 = null;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "Lkj;")
    public class568 field4775 = null;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "[Lch;")
    public class465[] field4779 = null;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "Lwu;")
    private class373 field4780;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "Z")
    public boolean field4782;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "S")
    public static short field4781 = 32767;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "Leba;")
    public static class590 field4776;

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lwu;)V", line = 166)
    public class333(class373 arg0) {
        this.field4780 = arg0;
        this.field4782 = this.field4780.field5605;
        if (this.field4782 && !this.field4780.method2346(9, class256.field3677, class683.field9458)) {
            this.field4782 = false;
        }
        if (this.field4782 || this.field4780.method2311((byte) -13, class256.field3677, class683.field9458)) {
            class510.method3025((byte) 85);
            if (this.field4782) {
                byte[] var6 = class287.method1830(false, -1688, class201.field3017);
                this.field4775 = this.field4780.method2314(var6, 16, 128, true, 128, class683.field9458);
                byte[] var7 = class287.method1830(false, -1688, class364.field5260);
                this.field4780.method2314(var7, 16, 128, true, 128, class683.field9458);
            } else {
                this.field4779 = new class465[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class341.method2172(32768, var2 * 32768, (byte) 81, class201.field3017);
                    this.field4779[var2] = this.field4780.method2386(128, (byte) -92, true, var5, class683.field9458, 128);
                }
                this.field4774 = new class465[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class341.method2172(32768, var3 * 128 * 128 * 2, (byte) 84, class364.field5260);
                    this.field4774[var3] = this.field4780.method2386(128, (byte) -107, true, var4, class683.field9458, 128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method2099(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4778++;
        if (arg0 >= -118) {
            field4776 = null;
        }
        int var5 = class166.field2619;
        int var6 = class133.field1789;
        if (class419.field6265) {
            var5 += class210.method1422(true);
            var6 += class407.method2589((byte) -45);
        }
        if (class199.field2994 == 1) {
            class536 var7 = class80.field1134[class177.field2750 / 100];
            var7.method3142(var5 - 8, var6 - 8);
            class497.method2963(var7.method1514() + var6 - 8, var7.method1504() + var5 + -8, (byte) -126, var6 - 8, var5 + -8);
        }
        if (class199.field2994 == 2) {
            class536 var8 = class80.field1134[class177.field2750 / 100 + 4];
            var8.method3142(var5 - 8, var6 + -8);
            class497.method2963(var8.method1514() + var6 - 8, var8.method1504() + var5 + -8, (byte) 83, var6 - 8, var5 + -8);
        }
        class665.method3823(2705);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)Z", line = 53)
    public final boolean method2100(int arg0) {
        if (arg0 != 29275) {
            this.method2100(99);
        }
        field4784++;
        if (this.field4777 == null) {
            if (class430.field6435 == null) {
                byte[] var2 = class578.method3348(0.6F, new class712(419684), 128, (byte) -24, 8, 4.0F, 16, 0.5F, 4.0F, 16.0F, 128);
                class430.field6435 = class597.method3477(false, var2, (byte) 104);
            }
            byte[] var3 = class287.method1830(false, -1688, class430.field6435);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 16384;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var8 + (var9 * 128);
                    int var11 = var8 + ((var9 - 1 & 0x7F) * 128);
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field4777 = this.field4780.method2314(var4, 16, 128, true, 128, class752.field10511);
        }
        return this.field4777 != null;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Z)V", line = 136)
    public static void method2101(boolean arg0) {
        if (arg0) {
            field4776 = null;
        }
        field4776 = null;
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)Z", line = 156)
    public final boolean method2102(int arg0) {
        field4783++;
        if (arg0 != 0) {
            method2099(-99, -114, 62, 124, 49);
        }
        if (this.field4782) {
            return this.field4775 != null;
        } else {
            return this.field4779 != null;
        }
    }
}
