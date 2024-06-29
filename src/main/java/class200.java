import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class200 extends class252 {

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    private int field3477 = 2048;

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
    private int field3483 = 0;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "I")
    private int field3478 = 2048;

    @OriginalMember(owner = "client!qk", name = "gb", descriptor = "I")
    private int field3490 = 8192;

    @OriginalMember(owner = "client!qk", name = "ib", descriptor = "I")
    private int field3492 = 0;

    @OriginalMember(owner = "client!qk", name = "eb", descriptor = "I")
    private int field3488 = 4096;

    @OriginalMember(owner = "client!qk", name = "jb", descriptor = "I")
    private int field3493 = 12288;

    @OriginalMember(owner = "client!qk", name = "hb", descriptor = "[Lik;")
    public static class247[] field3491 = new class247[2048];

    @OriginalMember(owner = "client!qk", name = "mb", descriptor = "Ljd;")
    private static class85 field3496 = class221.method1499("Drop", (byte) 93);

    @OriginalMember(owner = "client!qk", name = "bb", descriptor = "Ljd;")
    public static class85 field3485 = field3496;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!qk", name = "cb", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!qk", name = "db", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!qk", name = "fb", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!qk", name = "kb", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!qk", name = "lb", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(IB)I")
    public static final int method1372(int arg0, byte arg1) {
        ++field3480;
        int var2 = -25 % ((69 - arg1) / 51);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZ)Z")
    private final boolean method1373(int arg0, int arg1, boolean arg2) {
        int var4 = (arg1 - arg0) * this.field3493 >> 12;
        int var5 = class97.field1757[(1045472 & var4 * 255) >> 12];
        ++field3495;
        int var6 = (var5 << 12) / this.field3493;
        int var7 = (var6 << 12) / this.field3490;
        int var8 = this.field3488 * var7 >> 12;
        if (!arg2) {
            return true;
        } else {
            return ~var8 < ~(arg0 + arg1) && arg0 - -arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
    public static final void method1374(int arg0, int arg1) {
        if (arg1 != 1266345388) {
            method1372(-44, (byte) -84);
        }
        class124.field2191.method1267(arg0, (byte) -97);
        ++field3486;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field3494;
        if (arg2 != -99) {
            this.method1375((byte) 85, -31, 3);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field3490 = arg0.method1694((byte) -100);
                                }
                            } else {
                                this.field3488 = arg0.method1694((byte) -100);
                            }
                        } else {
                            this.field3493 = arg0.method1694((byte) -100);
                        }
                    } else {
                        this.field3477 = arg0.method1694((byte) -100);
                    }
                } else {
                    this.field3492 = arg0.method1694((byte) -100);
                }
            } else {
                this.field3483 = arg0.method1694((byte) -100);
            }
        } else {
            this.field3478 = arg0.method1694((byte) -100);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
    public class200() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(BII)Z")
    private final boolean method1375(byte arg0, int arg1, int arg2) {
        if (arg0 >= -112) {
            this.field3490 = 47;
        }
        ++field3487;
        int var4 = (arg1 + arg2) * this.field3493 >> 12;
        int var5 = class97.field1757[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field3493;
        int var7 = (var6 << 12) / this.field3490;
        int var8 = this.field3488 * var7 >> 12;
        return ~(-arg2 + arg1) > ~var8 && arg1 - arg2 > -var8;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V")
    public static final void method1376(byte arg0) {
        ++field3482;
        if (arg0 != -122) {
            method1377((class68) null, (class68) null, -17);
        }
        class239.field4119 = new class15();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lge;Lge;I)V")
    public static final void method1377(class68 arg0, class68 arg1, int arg2) {
        class130.field2280 = class207.method1420(arg0, 0, class263.field4686, arg1, (byte) -92);
        class21.field301 = (class138) class130.field2280;
        ++field3489;
        class30.field457 = class207.method1420(arg0, 0, class234.field4050, arg1, (byte) 71);
        class180.field3092 = class207.method1420(arg0, 0, class108.field1899, arg1, (byte) 122);
        if (arg2 != 5719) {
            field3491 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        ++field3481;
        class195.method1328(60);
        if (arg0 != 3906) {
            this.method88((class247) null, 28, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        if (arg1 != -55) {
            method1378(false);
        }
        ++field3479;
        int[] var3 = super.field4356.method868(arg0, (byte) 127);
        if (super.field4356.field2258) {
            int var4 = class39.field622[arg0] + -2048;
            for (int var5 = 0; ~class5.field63 < ~var5; ++var5) {
                int var6 = class105.field1838[var5] + -2048;
                int var7 = this.field3478 + var6;
                int var8 = this.field3483 + var4;
                int var9 = var8 < -2048 ? var8 + 4096 : var8;
                int var10 = var7 < -2048 ? var7 + 4096 : var7;
                int var11 = ~var9 >= -2049 ? var9 : var9 + -4096;
                int var12 = var10 > 2048 ? var10 - 4096 : var10;
                int var13 = var4 - -this.field3477;
                int var14 = this.field3492 + var6;
                int var15 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var16 = ~var14 <= 2047 ? var14 : var14 + 4096;
                int var17 = ~var15 >= -2049 ? var15 : var15 - 4096;
                int var18 = var16 > 2048 ? var16 + -4096 : var16;
                var3[var5] = !this.method1373(var12, var11, true) && !this.method1375((byte) -118, var17, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V")
    public static void method1378(boolean arg0) {
        field3491 = null;
        field3496 = null;
        field3485 = null;
        if (!arg0) {
            method1374(-89, -34);
        }
    }
}
