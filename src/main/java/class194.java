import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class194 extends class252 {

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    private int field3309 = 4096;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "I")
    private int field3312 = 3216;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "I")
    private int field3318 = 3216;

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "[I")
    private int[] field3322 = new int[3];

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "Z")
    public static boolean field3308 = true;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "[Ldb;")
    public static class17[] field3320 = new class17[32768];

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!bf", name = "jb", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "Lna;")
    public static class31 field3310;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "Ljf;")
    public static class62 field3311;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "[[B")
    public static byte[][] field3314;

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class194() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        if (arg0 != 3906) {
            this.method88((class247) null, -2, (byte) -102);
        }
        this.method1323(-124);
        ++field3324;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZI)Ldd;")
    public static final class129 method1321(int arg0, int arg1, boolean arg2, int arg3) {
        ++field3313;
        class129 var4 = new class129();
        var4.field2263 = arg0;
        var4.field2264 = arg1;
        if (arg2) {
            return null;
        } else {
            class121.field2126.method1393(var4, (long) arg3, 817);
            class219.method1494(-118, arg1);
            class255 var5 = class72.method506(arg3, 0);
            if (var5 != null) {
                class16.method120((byte) -123, var5);
            }
            if (class47.field836 != null) {
                class16.method120((byte) -87, class47.field836);
                class47.field836 = null;
            }
            int var6 = class115.field2058;
            for (int var7 = 0; var6 > var7; ++var7) {
                if (class184.method1261(false, class90.field1659[var7])) {
                    class141.method924(-11953, var7);
                }
            }
            if (class115.field2058 != 1) {
                class252.method1745(class230.field3978, class102.field1812, (byte) 123, class134.field2334, class150.field2544);
                int var8 = class180.field3092.method75(class202.field3532);
                for (int var9 = 0; ~var9 > ~class115.field2058; ++var9) {
                    int var10 = class180.field3092.method75(class154.method1012(-127, var9));
                    if (var10 > var8) {
                        var8 = var10;
                    }
                }
                class150.field2544 = class115.field2058 * 15 + 22;
                class134.field2334 = var8 + 8;
            } else {
                class52.field902 = false;
                class252.method1745(class230.field3978, class102.field1812, (byte) 107, class134.field2334, class150.field2544);
            }
            if (var5 != null) {
                class66.method446(var5, false, (byte) 57);
            }
            class39.method262((byte) -127, arg1);
            if (class129.field2267 != -1) {
                class205.method1401(1, class129.field2267, (byte) -119);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
    public static void method1322(int arg0) {
        if (arg0 == -1651665204) {
            field3310 = null;
            field3320 = null;
            field3314 = null;
            field3311 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field3312 = arg0.method1694((byte) -100);
                }
            } else {
                this.field3318 = arg0.method1694((byte) -100);
            }
        } else {
            this.field3309 = arg0.method1694((byte) -100);
        }
        if (arg2 != -99) {
            method1322(-94);
        }
        ++field3321;
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)V")
    private final void method1323(int arg0) {
        ++field3316;
        double var2 = Math.cos((double) ((float) this.field3312 / 4096.0F));
        this.field3322[0] = (int) (var2 * Math.sin((double) ((float) this.field3318 / 4096.0F)) * 4096.0D);
        this.field3322[1] = (int) (var2 * Math.cos((double) ((float) this.field3318 / 4096.0F)) * 4096.0D);
        this.field3322[2] = (int) (Math.sin((double) ((float) this.field3312 / 4096.0F)) * 4096.0D);
        int var4 = this.field3322[0] * this.field3322[0] >> 12;
        int var5 = this.field3322[2] * this.field3322[2] >> 12;
        if (arg0 > -109) {
            method1321(-26, -53, true, 41);
        }
        int var6 = this.field3322[1] * this.field3322[1] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
        if (var7 != 0) {
            this.field3322[0] = (this.field3322[0] << 12) / var7;
            this.field3322[1] = (this.field3322[1] << 12) / var7;
            this.field3322[2] = (this.field3322[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field3319;
        int[] var3 = super.field4356.method868(arg0, (byte) -26);
        if (super.field4356.field2258) {
            int var4 = class123.field2180 * this.field3309 >> 12;
            int[] var5 = this.method1742((byte) 8, 0, class25.field360 & arg0 + -1);
            int[] var6 = this.method1742((byte) 8, 0, arg0);
            int[] var7 = this.method1742((byte) 8, 0, class25.field360 & arg0 - -1);
            for (int var8 = 0; ~var8 > ~class5.field63; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class67.field1233] + -var6[var8 + 1 & class67.field1233]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class141.field2434[((var11 + 1) * var11 >> 1) + var12] & 255;
                int var14 = var9 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = this.field3322[2] * var15 >> 12;
                int var17 = var10 * var13 >> 8;
                int var18 = this.field3322[0] * var17 >> 12;
                int var19 = this.field3322[1] * var14 >> 12;
                var3[var8] = var18 - -var19 - -var16;
            }
        }
        if (arg1 != -55) {
            this.method149(-51, (byte) -56);
        }
        return var3;
    }
}
