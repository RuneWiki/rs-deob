import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class213 {

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "[Lada;")
    private class175[] field2512 = null;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lch;")
    public class489 field2517 = null;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "[Lada;")
    public class175[] field2519 = null;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "Lch;")
    public class489 field2510 = null;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "Lwg;")
    private class449 field2514;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "Z")
    public boolean field2520;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lkq;")
    public static class620 field2516 = null;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
    public static int field2522 = -1;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "[Lkq;")
    public static class620[] field2515;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V", line = 11)
    public static void method1338(int arg0) {
        field2516 = null;
        if (arg0 != 255) {
            method1342(null, (byte) -107);
        }
        field2515 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)Z", line = 22)
    public final boolean method1339(int arg0) {
        field2521++;
        if (arg0 != -10521) {
            field2516 = null;
        }
        if (this.field2520) {
            return this.field2517 != null;
        } else {
            return this.field2519 != null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "([BIIIBI)Z", line = 39)
    public static final boolean method1340(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2513++;
        if (arg4 < 118) {
            method1340(null, 94, 88, 91, (byte) -17, 88);
        }
        boolean var6 = true;
        class403 var7 = new class403(arg0);
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method2417(117);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class174 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method2354((byte) 52);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method2396((byte) -124);
                                    }
                                    int var12 = var7.method2354((byte) 37);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method2396((byte) -112) >> 2;
                                    var16 = var14 + arg1;
                                    var17 = arg2 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (var16 >= (arg5 - 1));
                    } while (arg3 - 1 <= var17);
                    var18 = class379.field4811.method4192(27324, var8);
                } while (var15 == 22 && class118.field1503.field10649.method3707(0) == 0 && var18.field2171 == 0 && var18.field2110 != 1 && !var18.field2176);
                var11 = true;
                if (!var18.method1189(27139)) {
                    class427.field5654++;
                    var6 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lwg;)V", line = 232)
    public class213(class449 arg0) {
        this.field2514 = arg0;
        this.field2520 = this.field2514.field6308;
        if (this.field2520 && !this.field2514.method62(class216.field2549, -4435, class748.field10384)) {
            this.field2520 = false;
        }
        if (this.field2520 || this.field2514.method42(class748.field10384, class216.field2549, 26)) {
            class82.method775(false);
            if (this.field2520) {
                byte[] var2 = class439.method2590(true, class507.field7210, false);
                this.field2517 = this.field2514.method26(var2, 16, 128, 128, (byte) -90, class216.field2549);
                byte[] var3 = class439.method2590(true, class647.field8810, false);
                this.field2514.method26(var3, 16, 128, 128, (byte) -90, class216.field2549);
            } else {
                this.field2519 = new class175[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class737.method4147(32768, (byte) -84, var4 * 128 * 256, class507.field7210);
                    this.field2519[var4] = this.field2514.method2653(128, -2, true, var7, class216.field2549, 128);
                }
                this.field2512 = new class175[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class737.method4147(32768, (byte) -84, var5 * 2 * 16384, class647.field8810);
                    this.field2512[var5] = this.field2514.method2653(128, 61, true, var6, class216.field2549, 128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(I)Z", line = 132)
    public final boolean method1341(int arg0) {
        if (arg0 >= -3) {
            field2516 = null;
        }
        if (this.field2510 == null) {
            if (class467.field6527 == null) {
                byte[] var2 = class531.method3165(4.0F, 128, 16, 0.5F, 128, 0.6F, new class710(419684), 8, 16.0F, 4.0F, (byte) -128);
                class467.field6527 = class606.method3447(false, var2, 0);
            }
            byte[] var3 = class439.method2590(true, class467.field6527, false);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var9 * 128 + var8;
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
            this.field2510 = this.field2514.method26(var4, 16, 128, 128, (byte) -90, class141.field1759);
        }
        field2511++;
        return this.field2510 != null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lha;B)V", line = 210)
    public static final void method1342(class66 arg0, byte arg1) {
        if (arg1 != 48) {
            method1338(-62);
        }
        class145.field1820 = class241.method1455(true, class45.field608, arg0, arg1 ^ 0x1C4);
        field2518++;
        class620.field8388 = class109.method879(class45.field608, arg1 - 24295, arg0);
        class708.field9946 = class241.method1455(true, class643.field8772, arg0, 500);
        class466.field6523 = class109.method879(class643.field8772, -24247, arg0);
        class452.field6380 = class241.method1455(true, class117.field1484, arg0, 500);
        class332.field4108 = class109.method879(class117.field1484, -24247, arg0);
    }
}
