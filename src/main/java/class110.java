import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class110 extends class189 {

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    private int field2474 = -1;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    public static int field2471 = 127;

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2477 = new CRC32();

    @OriginalMember(owner = "client!mb", name = "xb", descriptor = "Lgg;")
    public static class63 field2485 = class116.method911(43, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!mb", name = "tb", descriptor = "[I")
    public static int[] field2481 = new int[100];

    @OriginalMember(owner = "client!mb", name = "sb", descriptor = "I")
    public static int field2480 = 0;

    @OriginalMember(owner = "client!mb", name = "Bb", descriptor = "Lgg;")
    public static class63 field2489 = class116.method911(43, "Fps:");

    @OriginalMember(owner = "client!mb", name = "Ab", descriptor = "[Z")
    public static boolean[] field2488 = new boolean[5];

    @OriginalMember(owner = "client!mb", name = "Cb", descriptor = "Lgg;")
    public static class63 field2490 = class116.method911(43, ")2");

    @OriginalMember(owner = "client!mb", name = "wb", descriptor = "Lid;")
    public static class78 field2484 = new class78(32);

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!mb", name = "zb", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!mb", name = "rb", descriptor = "Lmc;")
    public static class111 field2479;

    @OriginalMember(owner = "client!mb", name = "vb", descriptor = "Ltd;")
    public static class175 field2483;

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "[I")
    public int[] field2476;

    @OriginalMember(owner = "client!mb", name = "ub", descriptor = "[I")
    public static int[] field2482;

    @OriginalMember(owner = "client!mb", name = "yb", descriptor = "[I")
    public static int[] field2486;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[[I")
    public int[][] method83(int arg0, int arg1) {
        int[][] var3 = super.field3808.method237(-1, arg0);
        ++field2468;
        if (super.field3808.field561 && this.method882(23226)) {
            int[] var4 = var3[1];
            int var5 = this.field2475 * (class12.field287 == this.field2473 ? arg0 : this.field2473 * arg0 / class12.field287);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            if (~class54.field1430 == ~this.field2475) {
                for (int var8 = 0; ~class54.field1430 < ~var8; ++var8) {
                    int var9 = this.field2476[var5++];
                    var7[var8] = method881(4080, var9 << 4);
                    var4[var8] = method881(65280, var9) >> 4;
                    var6[var8] = method881(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; ~var10 > ~class54.field1430; ++var10) {
                    int var11 = this.field2475 * var10 / class54.field1430;
                    int var12 = this.field2476[var5 + var11];
                    var7[var10] = method881(var12, 255) << 4;
                    var4[var10] = method881(65280, var12) >> 4;
                    var6[var10] = method881(var12, 16711680) >> 12;
                }
            }
        }
        if (arg1 <= 34) {
            field2490 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
    public static final void method880(byte arg0) {
        ++field2472;
        int var1 = class167.field3462 * 128 - -64;
        int var2 = class123.field2721 * 128 - -64;
        int var3 = class112.method894(-95, class112.field2528, var2, var1) - class101.field2366;
        if (~class39.field924 > ~var3) {
            class39.field924 += class4.field128 - -((var3 - class39.field924) * class187.field3771 / 1000);
            if (~var3 > ~class39.field924) {
                class39.field924 = var3;
            }
        }
        if (var1 > class21.field491) {
            class21.field491 += (-class21.field491 + var1) * class187.field3771 / 1000 + class4.field128;
            if (~class21.field491 < ~var1) {
                class21.field491 = var1;
            }
        }
        if (var1 < class21.field491) {
            class21.field491 -= class4.field128 - -((-var1 + class21.field491) * class187.field3771 / 1000);
            if (~class21.field491 > ~var1) {
                class21.field491 = var1;
            }
        }
        if (~var3 > ~class39.field924) {
            class39.field924 -= (class39.field924 - var3) * class187.field3771 / 1000 + class4.field128;
            if (~class39.field924 > ~var3) {
                class39.field924 = var3;
            }
        }
        if (~class35.field828 > ~var2) {
            class35.field828 += (-class35.field828 + var2) * class187.field3771 / 1000 + class4.field128;
            if (~var2 > ~class35.field828) {
                class35.field828 = var2;
            }
        }
        int var4 = class173.field3569 * 128 + 64;
        if (class35.field828 > var2) {
            class35.field828 -= class4.field128 - -((-var2 + class35.field828) * class187.field3771 / 1000);
            if (~var2 < ~class35.field828) {
                class35.field828 = var2;
            }
        }
        int var5 = class121.field2687 * 128 + 64;
        int var6 = class112.method894(-113, class112.field2528, var5, var4) + -class188.field3795;
        int var7 = -class21.field491 + var4;
        int var8 = -class39.field924 + var6;
        int var9 = -class35.field828 + var5;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 2047;
        if (~var11 > -129) {
            var11 = 128;
        }
        if (~var11 < -384) {
            var11 = 383;
        }
        int var12 = 2047 & (int) (-325.949D * Math.atan2((double) var9, (double) var7));
        int var13 = -class32.field778 + var12;
        if (~var13 < -1025) {
            var13 -= 2048;
        }
        if (~class123.field2719 > ~var11) {
            class123.field2719 += class113.field2539 - -((-class123.field2719 + var11) * class85.field2043 / 1000);
            if (~class123.field2719 < ~var11) {
                class123.field2719 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class32.field778 += class85.field2043 * var13 / 1000 + class113.field2539;
            class32.field778 &= 2047;
        }
        if (var13 < 0) {
            class32.field778 -= -var13 * class85.field2043 / 1000 + class113.field2539;
            class32.field778 &= 2047;
        }
        int var14 = -class32.field778 + var12;
        if (~var14 < -1025) {
            var14 -= 2048;
        }
        if (class123.field2719 > var11) {
            class123.field2719 -= (-var11 + class123.field2719) * class85.field2043 / 1000 + class113.field2539;
            if (~var11 < ~class123.field2719) {
                class123.field2719 = var11;
            }
        }
        int var15 = -81 % ((-78 - arg0) / 47);
        if (~var14 > 1023) {
            var14 += 2048;
        }
        if (var14 < 0 && ~var13 < -1 || ~var14 < -1 && var13 < 0) {
            class32.field778 = var12;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
    public static int method881(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class110() {
        super(0, false);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Z")
    public final boolean method882(int arg0) {
        if (arg0 != 23226) {
            return true;
        } else {
            ++field2469;
            if (this.field2476 != null) {
                return true;
            } else if (~this.field2474 <= -1) {
                class200 var2 = class168.method1134(class126.field2779, 63, this.field2474);
                var2.method1326();
                this.field2476 = var2.field3994;
                this.field2473 = var2.field3992;
                this.field2475 = var2.field3988;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V")
    public static void method883(byte arg0) {
        field2486 = null;
        field2481 = null;
        field2490 = null;
        field2488 = null;
        field2484 = null;
        field2479 = null;
        field2489 = null;
        field2483 = null;
        field2482 = null;
        field2477 = null;
        if (arg0 < 121) {
            field2485 = null;
        }
        field2485 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)I")
    public final int method884(byte arg0) {
        int var2 = 121 % ((29 - arg0) / 45);
        ++field2478;
        return this.field2474;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 > 32) {
            ++field2470;
            if (~arg0 == -1) {
                this.field2474 = arg2.method46((byte) 65);
            }
        }
    }
}
