import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class132 extends class102 {

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "[I")
    private int[] field2398 = new int[3];

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    private int field2401 = 3216;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    private int field2404 = 4096;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    private int field2402 = 3216;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field2392 = 0;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field2394 = 0;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "Lae;")
    public static class6 field2397;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
    public static void method844(int arg0) {
        if (arg0 != 0) {
            field2392 = 19;
        }
        field2397 = null;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    public static final void method845(int arg0) {
        ++field2406;
        class215.field3991.method572(arg0 + -11692);
        if (arg0 == 11693) {
            for (int var1 = 0; var1 < 32; ++var1) {
                class206.field3852[var1] = 0L;
            }
            for (int var2 = 0; ~var2 > -33; ++var2) {
                class189.field3521[var2] = 0L;
            }
            class182.field3366 = 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)I")
    public static final int method846(int arg0, int arg1) {
        if (arg0 != -1) {
            field2397 = null;
        }
        ++field2393;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field2402 = arg0.method1252(2);
                }
            } else {
                this.field2401 = arg0.method1252(2);
            }
        } else {
            this.field2404 = arg0.method1252(2);
        }
        if (arg2) {
            this.field2398 = null;
        }
        ++field2396;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            field2397 = null;
        }
        ++field2408;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int var4 = class189.field3506 * this.field2404 >> 12;
            int[] var5 = this.method679(arg1 + -1 & class233.field4296, 0, (byte) -109);
            int[] var6 = this.method679(arg1, 0, (byte) -109);
            int[] var7 = this.method679(arg1 + 1 & class233.field4296, 0, (byte) -109);
            for (int var8 = 0; var8 < class155.field2796; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class227.field4193 & var8 - 1] + -var6[var8 + 1 & class227.field4193]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class161.field2917[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field2398[0] * var14 >> 12;
                int var17 = var13 * 4096 >> 8;
                int var18 = this.field2398[2] * var17 >> 12;
                int var19 = this.field2398[1] * var15 >> 12;
                var3[var8] = var18 + var19 + var16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
    private final void method847(byte arg0) {
        ++field2395;
        double var2 = Math.cos((double) ((float) this.field2402 / 4096.0F));
        this.field2398[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field2401 / 4096.0F)));
        this.field2398[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field2401 / 4096.0F)));
        this.field2398[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2402 / 4096.0F)));
        int var4 = this.field2398[1] * this.field2398[1] >> 12;
        int var5 = this.field2398[0] * this.field2398[0] >> 12;
        int var6 = this.field2398[2] * this.field2398[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 - (-var4 + -var6) >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field2398[0] = (this.field2398[0] << 12) / var7;
            this.field2398[1] = (this.field2398[1] << 12) / var7;
            this.field2398[2] = (this.field2398[2] << 12) / var7;
        }
        int var8 = -121 % ((-75 - arg0) / 45);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)Lqe;")
    public static final class179 method848(int arg0, int arg1, int arg2) {
        int var3 = -arg0 + arg1;
        ++field2405;
        if (~var3 > 8) {
            return class214.field3973;
        } else if (arg2 <= 60) {
            return null;
        } else if (var3 < -6) {
            return class42.field901;
        } else if (~var3 > 2) {
            return class93.field1758;
        } else if (var3 < 0) {
            return class78.field1527;
        } else if (~var3 < -10) {
            return class134.field2464;
        } else if (var3 > 6) {
            return class97.field1826;
        } else if (~var3 < -4) {
            return class163.field2953;
        } else {
            return var3 > 0 ? class230.field4249 : class173.field3099;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        if (arg0 != 14005) {
            field2394 = 120;
        }
        this.method847((byte) 20);
        ++field2400;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class132() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V")
    public static final void method849(byte arg0) {
        class48.field1036 = null;
        class102.field1947 = null;
        class90.field1696 = null;
        class32.field687 = null;
        class201.field3728 = null;
        class128.field2340 = null;
        ++field2399;
        class102.field1951 = null;
        class96.field1817 = 0;
        class155.field2795 = null;
        class188.field3502 = null;
        if (arg0 <= 111) {
            field2397 = null;
        }
        class237.field4371 = null;
        class106.field1983.method236((byte) -107);
        class136.field2519.method236((byte) 64);
        class147.field2666 = null;
        class131.field2387 = null;
        class89.field1685 = null;
        class121.field2255 = null;
        class30.field663 = null;
        class40.field867 = null;
        class127.field2318 = null;
        class133.field2413 = null;
        class222.field4098 = null;
    }
}
