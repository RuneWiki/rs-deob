import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class161 extends class87 {

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    private int field2492 = 2048;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    private int field2493 = 12288;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    private int field2496 = 0;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    private int field2500 = 4096;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    private int field2508 = 8192;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    private int field2504 = 2048;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    private int field2502 = 0;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2491 = "";

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field2499 = -1;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field2505 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILhc;)Ljava/lang/String;")
    public static final String method1165(int arg0, int arg1, class53 arg2) {
        ++field2506;
        try {
            int var3 = arg2.method368(arg1 ^ -7001);
            if (arg0 < var3) {
                var3 = arg0;
            }
            if (arg1 != 7128) {
                return null;
            } else {
                byte[] var4 = new byte[var3];
                arg2.field735 += class300.field4848.method1343(arg2.field735, arg2.field758, arg1 + -7128, var3, 0, var4);
                return class102.method794(var4, (byte) 87, var3, 0);
            }
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(III)Z")
    private final boolean method1166(int arg0, int arg1, int arg2) {
        ++field2494;
        int var4 = (-arg1 + arg2) * this.field2493 >> 12;
        int var5 = class256.field3870[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field2493;
        if (arg0 != -27037) {
            return false;
        } else {
            int var7 = (var6 << 12) / this.field2508;
            int var8 = this.field2500 * var7 >> 12;
            return ~(arg1 + arg2) > ~var8 && arg1 + arg2 > -var8;
        }
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(III)Z")
    private final boolean method1167(int arg0, int arg1, int arg2) {
        ++field2501;
        int var4 = (arg1 + arg2) * this.field2493 >> 12;
        int var5 = class256.field3870[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field2493;
        int var7 = (var6 << 12) / this.field2508;
        if (arg0 != -4096) {
            method1165(-124, -86, (class53) null);
        }
        int var8 = this.field2500 * var7 >> 12;
        return var8 > -arg2 + arg1 && ~(-arg2 + arg1) < ~(-var8);
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        ++field2495;
        if (arg0 != 0) {
            method1169(101, -33);
        }
        class272.method1897(51);
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
    public static void method1168(int arg0) {
        field2491 = null;
        field2505 = null;
        if (arg0 != 7391) {
            method1168(44);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 == 25645) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (arg1 != 4) {
                                if (arg1 != 5) {
                                    if (arg1 == 6) {
                                        this.field2508 = arg0.method331(-55);
                                    }
                                } else {
                                    this.field2500 = arg0.method331(arg2 ^ -25629);
                                }
                            } else {
                                this.field2493 = arg0.method331(arg2 + -25759);
                            }
                        } else {
                            this.field2492 = arg0.method331(arg2 ^ -25652);
                        }
                    } else {
                        this.field2496 = arg0.method331(-76);
                    }
                } else {
                    this.field2502 = arg0.method331(arg2 + -25759);
                }
            } else {
                this.field2504 = arg0.method331(-23);
            }
            ++field2503;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Ltk;")
    public static final class139 method1169(int arg0, int arg1) {
        ++field2498;
        class139 var2 = (class139) class139.field2259.method1418((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class24.field256.method1868(arg0, arg1, 1);
            class139 var4 = new class139();
            if (var3 != null) {
                var4.method1051(new class53(var3), true);
            }
            class139.field2259.method1421((long) arg0, var4, (byte) 51);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field2497;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int var4 = class140.field2272[arg0] + -2048;
            for (int var5 = 0; var5 < class206.field3032; ++var5) {
                int var6 = class138.field2254[var5] + -2048;
                int var7 = this.field2504 + var6;
                int var8 = this.field2496 + var6;
                int var9 = this.field2492 + var4;
                int var10 = var7 >= -2048 ? var7 : var7 + 4096;
                int var11 = ~var9 > 2047 ? var9 - -4096 : var9;
                int var12 = ~var8 > 2047 ? var8 + 4096 : var8;
                int var13 = ~var10 < -2049 ? var10 + -4096 : var10;
                int var14 = this.field2502 + var4;
                int var15 = var11 <= 2048 ? var11 : var11 + -4096;
                int var16 = var12 > 2048 ? var12 + -4096 : var12;
                int var17 = ~var14 > 2047 ? var14 + 4096 : var14;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method1166(-27037, var13, var18) && !this.method1167(-4096, var15, var16) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
    public static final void method1170(byte arg0) {
        ++field2507;
        ++class36.field453;
        class144.field2338.method683(true, 189);
        for (class133 var1 = (class133) class251.field3793.method1071(-127); var1 != null; var1 = (class133) class251.field3793.method1069(-123)) {
            if (var1.field2181 == 0) {
                class35.method226(var1, true, -80);
            }
        }
        if (class195.field2880 != null) {
            class63.method476(class195.field2880, 14105);
            class195.field2880 = null;
        }
        if (arg0 <= 57) {
            method1169(41, -1);
        }
    }
}
