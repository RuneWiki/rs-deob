import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class5 extends class212 {

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    private int field91 = 0;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
    private int field99 = 8192;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    private int field97 = 2048;

    @OriginalMember(owner = "client!r", name = "kb", descriptor = "I")
    private int field107 = 12288;

    @OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
    private int field109 = 2048;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
    private int field102 = 4096;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    private int field94 = 0;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "[Lsc;")
    public static class181[] field100 = new class181[200];

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
    public static int field103 = 0;

    @OriginalMember(owner = "client!r", name = "jb", descriptor = "I")
    public static int field106 = 0;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "Lsc;")
    private static class181 field98 = class149.method967(255, "green:");

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "Lsc;")
    public static class181 field104 = field98;

    @OriginalMember(owner = "client!r", name = "nb", descriptor = "Lsc;")
    public static class181 field110 = field98;

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!r", name = "lb", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!r", name = "ob", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!r", name = "pb", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "[Lka;")
    public static class134[] field101;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
    public static void method39(int arg0) {
        field110 = null;
        field98 = null;
        if (arg0 != -1) {
            field101 = null;
        }
        field100 = null;
        field104 = null;
        field101 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class5() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        if (arg1 < 25) {
            this.method26((class230) null, 24, -110);
        }
        ++field92;
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int var4 = class176.field3090[arg0] + -2048;
            for (int var5 = 0; var5 < class26.field452; ++var5) {
                int var6 = var4 - -this.field94;
                int var7 = class253.field4416[var5] + -2048;
                int var8 = this.field97 + var7;
                int var9 = var8 < -2048 ? var8 + 4096 : var8;
                int var10 = var9 > 2048 ? var9 - 4096 : var9;
                int var11 = var6 >= -2048 ? var6 : var6 + 4096;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = this.field91 + var7;
                int var14 = this.field109 + var4;
                int var15 = ~var14 > 2047 ? var14 + 4096 : var14;
                int var16 = var13 >= -2048 ? var13 : var13 + 4096;
                int var17 = var16 > 2048 ? var16 - 4096 : var16;
                int var18 = ~var15 >= -2049 ? var15 : var15 + -4096;
                var3[var5] = !this.method44(var10, (byte) -128, var12) && !this.method40(var17, -127, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(III)Z")
    private final boolean method40(int arg0, int arg1, int arg2) {
        ++field95;
        int var4 = (arg0 + arg2) * this.field107 >> 12;
        int var5 = 77 / ((-78 - arg1) / 48);
        int var6 = class216.field3712[(1047714 & var4 * 255) >> 12];
        int var7 = (var6 << 12) / this.field107;
        int var8 = (var7 << 12) / this.field99;
        int var9 = this.field102 * var8 >> 12;
        return ~var9 < ~(-arg0 + arg2) && arg2 - arg0 > -var9;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
    public static final void method41(byte arg0) {
        ++field105;
        if (class123.field2017 != -1 && class193.field3387 != -1) {
            int var1 = class229.field3923 - -((-class229.field3923 + class62.field953) * class108.field1768 >> 16);
            class108.field1768 += var1;
            if (class108.field1768 >= 65535) {
                class108.field1768 = 65535;
                if (class87.field1383) {
                    class91.field1441 = false;
                } else {
                    class91.field1441 = true;
                }
                class87.field1383 = true;
            } else {
                class87.field1383 = false;
                class91.field1441 = false;
            }
            float var2 = (float) class108.field1768 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class138.field2256 * 2;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var22 = class221.field3822[class123.field2017][var4][var5] * 3;
                int var23 = class221.field3822[class123.field2017][var4 - -1][var5] * 3;
                int var24 = (class221.field3822[class123.field2017][var4 - -2][var5] + class221.field3822[class123.field2017][var4 - -2][var5] + -class221.field3822[class123.field2017][var4 - -3][var5]) * 3;
                int var25 = class221.field3822[class123.field2017][var4][var5];
                int var26 = var23 - var22;
                int var27 = -(var23 * 2) + var22 + var24;
                int var28 = class221.field3822[class123.field2017][var4 + 2][var5] + -var25 + -var24 + var23;
                var3[var5] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
            }
            float[] var6 = new float[3];
            class228.field3916 = (int) var3[1] * -1;
            if (class253.field4420 == 0 && class222.field3844 == 0) {
                class253.field4420 = ((int) var3[0] >> 10) * 8 + -48;
                class222.field3844 = ((int) var3[2] >> 10) * 8 + -48;
            }
            class127.field2100 = (int) var3[0] + -(class253.field4420 * 128);
            int var7 = class189.field3339 * 2;
            class86.field1370 = (int) var3[2] + -(class222.field3844 * 128);
            for (int var8 = 0; var8 < 3; ++var8) {
                int var15 = class221.field3822[class193.field3387][var7][var8] * 3;
                int var16 = class221.field3822[class193.field3387][var7 + 1][var8] * 3;
                int var17 = (class221.field3822[class193.field3387][var7 + 2][var8] - class221.field3822[class193.field3387][var7 - -3][var8] + class221.field3822[class193.field3387][var7 + 2][var8]) * 3;
                int var18 = var15 - var16 * 2 - -var17;
                int var19 = class221.field3822[class193.field3387][var7][var8];
                int var20 = class221.field3822[class193.field3387][var7 - -2][var8] + -var19 + var16 - var17;
                int var21 = -var15 + var16;
                var6[var8] = (((float) var20 * var2 + (float) var18) * var2 + (float) var21) * var2 + (float) var19;
            }
            float var9 = var6[0] + -var3[0];
            float var10 = var6[2] - var3[2];
            float var11 = (var6[1] - var3[1]) * -1.0F;
            double var12 = Math.sqrt((double) (var9 * var9 + var10 * var10));
            int var14 = 26 / ((arg0 - -64) / 52);
            class224.field3867 = (float) Math.atan2((double) var11, var12);
            class188.field3327 = -((float) Math.atan2((double) var9, (double) var10));
            class208.field3559 = 2047 & (int) ((double) class224.field3867 * 325.949D);
            class47.field734 = 2047 & (int) ((double) class188.field3327 * 325.949D);
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(III)Z")
    public static final boolean method42(int arg0, int arg1, int arg2) {
        int var3 = class86.field1365[arg0][arg1][arg2];
        if (-class257.field4500 == var3) {
            return false;
        } else if (class257.field4500 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class222.method1473(var4 + 1, class31.field505[arg0][arg1][arg2], var5 + 1) && class222.method1473(var4 + 128 - 1, class31.field505[arg0][arg1 + 1][arg2], var5 + 1) && class222.method1473(var4 + 128 - 1, class31.field505[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class222.method1473(var4 + 1, class31.field505[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class86.field1365[arg0][arg1][arg2] = class257.field4500;
                return true;
            } else {
                class86.field1365[arg0][arg1][arg2] = -class257.field4500;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)I")
    public static int method43(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)Z")
    private final boolean method44(int arg0, byte arg1, int arg2) {
        int var4 = (-arg0 + arg2) * this.field107 >> 12;
        int var5 = class216.field3712[var4 * 255 >> 12 & 255];
        ++field111;
        int var6 = (var5 << 12) / this.field107;
        int var7 = (var6 << 12) / this.field99;
        int var8 = -112 % ((-13 - arg1) / 55);
        int var9 = this.field102 * var7 >> 12;
        return ~(arg0 - -arg2) > ~var9 && -var9 < arg0 + arg2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            this.method44(-28, (byte) -25, 17);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field99 = arg0.method1535(2);
                                }
                            } else {
                                this.field102 = arg0.method1535(2);
                            }
                        } else {
                            this.field107 = arg0.method1535(2);
                        }
                    } else {
                        this.field109 = arg0.method1535(2);
                    }
                } else {
                    this.field91 = arg0.method1535(2);
                }
            } else {
                this.field94 = arg0.method1535(2);
            }
        } else {
            this.field97 = arg0.method1535(2);
        }
        ++field93;
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public static final void method45(int arg0) {
        ++field112;
        class110.field1796.method1798(-57);
        class210.field3596.method1798(-112);
        class47.field744.method1798(-82);
        if (arg0 <= 29) {
            method39(-45);
        }
        class184.field3238.method1798(-29);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        class85.method575(23);
        if (!arg0) {
            this.field97 = 45;
        }
        ++field108;
    }
}
