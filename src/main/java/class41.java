import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class41 extends class73 {

    @OriginalMember(owner = "client!m", name = "O", descriptor = "[I")
    public static int[] field481 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!m", name = "P", descriptor = "Z")
    public static boolean field482 = false;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field491 = " from your friend list first.";

    @OriginalMember(owner = "client!m", name = "M", descriptor = "B")
    public byte field479;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "Lhi;")
    public class264 field484;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V")
    public static void method314(int arg0) {
        field491 = null;
        if (arg0 == -1554864895) {
            field481 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)I")
    public final int method2(byte arg0) {
        ++field480;
        if (arg0 != 113) {
            return -46;
        } else {
            return this.field484 == null ? 0 : this.field484.field4195 * 100 / (this.field484.field4198.length + -this.field479);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BII)V")
    public static final void method315(byte arg0, int arg1, int arg2) {
        if (~class233.field3706 < -1) {
            class200.method1346(class233.field3706, 10);
            class233.field3706 = 0;
        }
        short var3 = 256;
        ++field483;
        int var4 = 0;
        int var5 = class63.field897 * arg1;
        int var6 = 0;
        for (int var7 = 1; var3 - 1 > var7; ++var7) {
            int var8 = (-var7 + var3) * class178.field2890[var7] / var3;
            if (~var8 > -1) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; ~var9 > -129; ++var9) {
                int var11 = class162.field2636[var4++];
                int var12 = class63.field894[arg2 + var5++];
                if (var11 != 0) {
                    int var13 = var11 + 18;
                    int var14 = -var11 + 238;
                    int var15 = class85.field1174[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    if (~var13 < -256) {
                        var13 = 255;
                    }
                    class62.field856.field510[var6++] = class204.method1369(class204.method1369(var15, 65280) * var13 + var14 * class204.method1369(65280, var12), 16711680) + class204.method1369(-16711936, class204.method1369(var12, 16711935) * var14 + var13 * class204.method1369(16711935, var15)) >> 8;
                } else {
                    class62.field856.field510[var6++] = var12;
                }
            }
            for (int var10 = 0; var10 < var8; ++var10) {
                class62.field856.field510[var6++] = class63.field894[var5++ + arg2];
            }
            var5 += class63.field897 - 128;
        }
        if (arg0 < 83) {
            method315((byte) -128, -119, 51);
        }
        class62.field856.method166(arg2, arg1);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljj;BLjj;Ljj;)V")
    public static final void method316(class134 arg0, byte arg1, class134 arg2, class134 arg3) {
        if (arg1 >= -127) {
            field490 = -67;
        }
        ++field489;
        class286.field4556 = arg3;
        class154.field2485 = arg0;
        class271.field4370 = arg2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjj;)V")
    public static final void method317(int arg0, class134 arg1) {
        if (arg0 == 8) {
            class129.field2161 = arg1.method947(-24925, "runes");
            ++field478;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(CI)C")
    public static final char method318(char arg0, int arg1) {
        if (arg1 != 0) {
            field491 = null;
        }
        ++field488;
        return ~arg0 != -182 && ~arg0 != -403 ? Character.toTitleCase(arg0) : arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIB)V")
    public static final void method319(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class168.method1184(128, arg2 + arg3, arg3 - arg2, arg0, class85.field1162[arg4]);
        ++field485;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg2 * arg2;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        if (arg5 != 33) {
            field481 = null;
        }
        int var14 = var8 << 2;
        int var15 = var9 << 2;
        int var16 = -((var12 + -1) * var11) + var9;
        int var17 = ((arg1 << 1) - 3) * var11;
        int var18 = ((var6 << 1) - -3) * var10;
        int var19 = (var6 + 1) * var15;
        int var20 = (arg1 + -1) * var14;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var18;
                    ++var6;
                    var16 += var19;
                    var18 += var15;
                    var19 += var15;
                }
            }
            if (~var16 > -1) {
                var16 += var19;
                var13 += var18;
                var19 += var15;
                var18 += var15;
                ++var6;
            }
            var16 += -var17;
            --var7;
            var13 += -var20;
            var20 -= var14;
            var17 -= var14;
            int var21 = arg4 + var7;
            int var22 = -var7 + arg4;
            int var23 = arg3 + var6;
            int var24 = arg3 - var6;
            class168.method1184(arg5 + 95, var23, var24, arg0, class85.field1162[var22]);
            class168.method1184(128, var23, var24, arg0, class85.field1162[var21]);
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)[B")
    public final byte[] method7(byte arg0) {
        ++field477;
        int var2 = -115 % ((29 - arg0) / 57);
        if (!super.field998 && this.field484.field4198.length + -this.field479 <= this.field484.field4195) {
            return this.field484.field4198;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI[B)I")
    public static final int method320(boolean arg0, int arg1, byte[] arg2) {
        ++field492;
        if (!arg0) {
            field481 = null;
        }
        return class98.method703((byte) 120, arg2, arg1, 0);
    }
}
