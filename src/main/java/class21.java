import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class class21 extends class85 {

    @OriginalMember(owner = "c", name = "S", descriptor = "I")
    private int field470 = 4096;

    @OriginalMember(owner = "c", name = "Q", descriptor = "I")
    private int field468 = 8192;

    @OriginalMember(owner = "c", name = "gb", descriptor = "I")
    private int field484 = 2048;

    @OriginalMember(owner = "c", name = "ab", descriptor = "I")
    private int field478 = 0;

    @OriginalMember(owner = "c", name = "cb", descriptor = "I")
    private int field480 = 0;

    @OriginalMember(owner = "c", name = "hb", descriptor = "I")
    private int field485 = 2048;

    @OriginalMember(owner = "c", name = "nb", descriptor = "I")
    private int field491 = 12288;

    @OriginalMember(owner = "c", name = "R", descriptor = "Llf;")
    public static class109 field469 = class35.method275("weiss:", 2);

    @OriginalMember(owner = "c", name = "bb", descriptor = "I")
    public static int field479 = 0;

    @OriginalMember(owner = "c", name = "T", descriptor = "[I")
    public static int[] field471 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "V", descriptor = "I")
    public static int field473 = -1;

    @OriginalMember(owner = "c", name = "ib", descriptor = "I")
    public static int field486 = 3353893;

    @OriginalMember(owner = "c", name = "lb", descriptor = "[I")
    public static int[] field489 = new int[4000];

    @OriginalMember(owner = "c", name = "X", descriptor = "I")
    public static int field475 = 0;

    @OriginalMember(owner = "c", name = "U", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "c", name = "W", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "c", name = "Y", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "c", name = "Z", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "c", name = "eb", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "c", name = "fb", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "c", name = "jb", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "c", name = "kb", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "c", name = "mb", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "c", name = "ob", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "c", name = "db", descriptor = "[I")
    public static int[] field481;

    @OriginalMember(owner = "c", name = "a", descriptor = "(Ldf;B)V")
    public static final void method194(class37 arg0, byte arg1) {
        ++field483;
        short var2 = 256;
        for (int var3 = 0; ~var3 > ~class190.field3641.length; ++var3) {
            class190.field3641[var3] = 0;
        }
        if (arg1 > -81) {
            method196((byte) -9);
        }
        for (int var4 = 0; ~var4 > -5001; ++var4) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class190.field3641[var16] = (int) (256.0D * Math.random());
        }
        for (int var5 = 0; var5 < 20; ++var5) {
            for (int var12 = 1; var2 + -1 > var12; ++var12) {
                for (int var14 = 1; var14 < 127; ++var14) {
                    int var15 = (var12 << 7) + var14;
                    class10.field161[var15] = (class190.field3641[var15 + 1] + class190.field3641[var15 + -1] + class190.field3641[var15 - 128] + class190.field3641[var15 + 128]) / 4;
                }
            }
            int[] var13 = class190.field3641;
            class190.field3641 = class10.field161;
            class10.field161 = var13;
        }
        if (arg0 != null) {
            int var6 = 0;
            for (int var7 = 0; ~var7 > ~arg0.field806; ++var7) {
                for (int var8 = 0; arg0.field801 > var8; ++var8) {
                    if (arg0.field802[var6++] != 0) {
                        int var9 = var7 - -arg0.field807 + 16;
                        int var10 = var8 + 16 + arg0.field803;
                        int var11 = (var9 << 7) + var10;
                        class190.field3641[var11] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg0 > -120) {
            this.method31((byte) 63, -71, (class86) null);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field468 = arg2.method569(true);
                                }
                            } else {
                                this.field470 = arg2.method569(true);
                            }
                        } else {
                            this.field491 = arg2.method569(true);
                        }
                    } else {
                        this.field484 = arg2.method569(true);
                    }
                } else {
                    this.field480 = arg2.method569(true);
                }
            } else {
                this.field478 = arg2.method569(true);
            }
        } else {
            this.field485 = arg2.method569(true);
        }
        ++field482;
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIB)Z")
    private final boolean method195(int arg0, int arg1, byte arg2) {
        ++field477;
        if (arg2 > -17) {
            return false;
        } else {
            int var4 = (arg0 + arg1) * this.field491 >> 12;
            int var5 = class109.field2173[255 & var4 * 255 >> 12];
            int var6 = (var5 << 12) / this.field491;
            int var7 = (var6 << 12) / this.field468;
            int var8 = this.field470 * var7 >> 12;
            return -arg0 + arg1 < var8 && ~(arg1 - arg0) < ~(-var8);
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        int[] var3 = super.field1736.method835(-314, arg1);
        ++field490;
        if (arg0 >= -49) {
            return null;
        } else {
            if (super.field1736.field2253) {
                int var4 = class54.field1083[arg1] - 2048;
                for (int var5 = 0; ~var5 > ~class57.field1152; ++var5) {
                    int var6 = class47.field980[var5] - 2048;
                    int var7 = this.field478 + var4;
                    int var8 = this.field485 + var6;
                    int var9 = ~var8 <= 2047 ? var8 : var8 + 4096;
                    int var10 = this.field484 + var4;
                    int var11 = var9 > 2048 ? var9 + -4096 : var9;
                    int var12 = this.field480 + var6;
                    int var13 = var10 < -2048 ? var10 + 4096 : var10;
                    int var14 = var13 <= 2048 ? var13 : var13 + -4096;
                    int var15 = var7 < -2048 ? var7 - -4096 : var7;
                    int var16 = var15 > 2048 ? var15 + -4096 : var15;
                    int var17 = ~var12 <= 2047 ? var12 : var12 - -4096;
                    int var18 = var17 > 2048 ? var17 + -4096 : var17;
                    var3[var5] = !this.method197(110, var16, var11) && !this.method195(var18, var14, (byte) -40) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "c", name = "d", descriptor = "(B)V")
    public static void method196(byte arg0) {
        field481 = null;
        if (arg0 == 0) {
            field471 = null;
            field489 = null;
            field469 = null;
        }
    }

    @OriginalMember(owner = "c", name = "c", descriptor = "(III)Z")
    private final boolean method197(int arg0, int arg1, int arg2) {
        int var4 = (-arg2 + arg1) * this.field491 >> 12;
        int var5 = 29 / ((41 - arg0) / 54);
        ++field488;
        int var6 = class109.field2173[255 & var4 * 255 >> 12];
        int var7 = (var6 << 12) / this.field491;
        int var8 = (var7 << 12) / this.field468;
        int var9 = this.field470 * var8 >> 12;
        return var9 > arg1 + arg2 && ~(-var9) > ~(arg1 + arg2);
    }

    @OriginalMember(owner = "c", name = "<init>", descriptor = "()V")
    public class21() {
        super(0, true);
    }

    @OriginalMember(owner = "c", name = "c", descriptor = "(II)V")
    public static final void method198(int arg0, int arg1) {
        ++field487;
        if (~class84.field1711 != -1) {
            class8.field109 = arg1;
        } else {
            class67.field1309.method1192(arg1, (byte) -34);
        }
        if (arg0 != 7920) {
            method196((byte) 92);
        }
    }

    @OriginalMember(owner = "c", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        class179.method1217(127);
        if (arg0 == 25614) {
            ++field474;
        }
    }
}
