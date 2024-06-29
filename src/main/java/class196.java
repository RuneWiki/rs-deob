import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class196 {

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "Lmg;")
    private class101 field2785;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "J")
    public static long field2784 = 0L;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "[B")
    public static byte[] field2786 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V", line = 11)
    public static void method1217(byte arg0) {
        field2786 = null;
        if (arg0 != 8) {
            method1218(-32);
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lal;ILmg;)V", line = 213)
    public class196(class66 arg0, int arg1, class101 arg2) {
        new class162(64);
        this.field2785 = arg2;
        this.field2787 = this.field2785.method753(15, -83);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V", line = 42)
    public static final void method1218(int arg0) {
        field2788++;
        if (arg0 != -1) {
            return;
        }
        for (int var1 = 0; var1 < class228.field3242; var1++) {
            class233 var2 = class275.field3767[var1];
            boolean var3 = false;
            if (var2.field3287 == null) {
                var2.field3286--;
                if (var2.field3286 < (var2.field3295 == 2 ? -1500 : -10)) {
                    var3 = true;
                } else {
                    if (var2.field3295 == 1 && var2.field3284 == null) {
                        var2.field3284 = class191.method1202(class167.field2509, var2.field3282, 0);
                        if (var2.field3284 == null) {
                            continue;
                        }
                        var2.field3286 += var2.field3284.method1204();
                    } else if (var2.field3295 == 2 && (var2.field3293 == null || var2.field3288 == null)) {
                        if (var2.field3293 == null) {
                            var2.field3293 = class363.method2189(class497.field7247, var2.field3282);
                        }
                        if (var2.field3293 == null) {
                            continue;
                        }
                        if (var2.field3288 == null) {
                            var2.field3288 = var2.field3293.method2191(new int[] { 22050 });
                            if (var2.field3288 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field3286 < 0) {
                        int var5;
                        if (var2.field3290 == 0) {
                            var5 = class20.field269.field7650 * var2.field3283 >> 8;
                        } else {
                            int var4 = (var2.field3290 & 0x376A2D9) >> 24;
                            if (class316.field4324.field1738 == var4) {
                                int var6 = (var2.field3290 & 0xFF) << 7;
                                int var7 = var2.field3290 >> 16 & 0xFF;
                                int var8 = (var7 << 7) + 64 - class316.field4324.field1732;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = (var2.field3290 & 0xFFAB) >> 8;
                                int var10 = (var9 << 7) + 64 - class316.field4324.field1735;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var11 > var6) {
                                    var2.field3286 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var5 = (var6 - var11) * class20.field269.field7640 * var2.field3283 / var6 >> 8;
                            } else {
                                var5 = 0;
                            }
                        }
                        if (var5 > 0) {
                            class452 var12 = null;
                            if (var2.field3295 == 1) {
                                var12 = var2.field3284.method1201().method2666(class305.field4166);
                            } else if (var2.field3295 == 2) {
                                var12 = var2.field3288;
                            }
                            class505 var13 = var2.field3287 = class505.method2998(var12, 100, var5);
                            var13.method3010(var2.field3291 - 1);
                            class361.field5267.method583(var13);
                        }
                    }
                }
            } else if (!var2.field3287.method1564(4)) {
                var3 = true;
            }
            if (var3) {
                class228.field3242--;
                for (int var14 = var1; var14 < class228.field3242; var14++) {
                    class275.field3767[var14] = class275.field3767[var14 + 1];
                }
                var1--;
            }
        }
        if (class486.field7122 && !class52.method450(-13911)) {
            if (class20.field269.field7671 != 0 && class173.field2570 != -1) {
                class5.method31(false, class177.field2625, 0, (byte) 115, class173.field2570, class20.field269.field7671);
            }
            class486.field7122 = false;
        } else if (class20.field269.field7671 != 0 && class173.field2570 != -1 && !class52.method450(-13911)) {
            class491.method2878((byte) 92, class439.field6481);
            class149.field2158++;
            class481.field7027.method2359(class173.field2570, -120);
            class173.field2570 = -1;
        }
    }
}
