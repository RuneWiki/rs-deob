import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class213 extends class34 {

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    private int field3269 = 16;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    private int field3273 = 2000;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    private int field3271 = 4096;

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
    private int field3282 = 0;

    @OriginalMember(owner = "client!jh", name = "gb", descriptor = "I")
    private int field3285 = 0;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3270 = " is already on your ignore list.";

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
    public static int field3277 = 0;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
    public static int field3278 = 0;

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
    public static int field3283 = -1;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "Lpk;")
    public static class237 field3276;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "Lv;")
    public static class69 field3275;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 < 75) {
            this.method43(37, -42);
        }
        ++field3284;
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int var4 = this.field3271 >> 1;
            int[][] var5 = super.field610.method224(2652);
            Random var6 = new Random((long) this.field3285);
            for (int var7 = 0; var7 < this.field3273; ++var7) {
                int var8 = this.field3271 <= 0 ? this.field3282 : this.field3282 - (-class18.method129(var6, -52, this.field3271) - -var4);
                int var9 = var8 >> 4 & 255;
                int var10 = class18.method129(var6, -87, class226.field3527);
                int var11 = class18.method129(var6, 114, class259.field3965);
                int var12 = (class87.field1321[var9] * this.field3269 >> 12) + var11;
                int var13 = -var11 + var12;
                int var14 = (class21.field356[var9] * this.field3269 >> 12) + var10;
                int var15 = -var10 + var14;
                if (~var15 != -1 || var13 != 0) {
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var13;
                    if (var16) {
                        int var17 = var14;
                        var14 = var12;
                        int var18 = var10;
                        var12 = var17;
                        var10 = var11;
                        var11 = var18;
                    }
                    if (~var14 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var14;
                        var14 = var19;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = -var10 + var14;
                    int var22 = var11;
                    int var23 = -var11 + var12;
                    int var24 = -var21 / 2;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var25 = 2048 / var21;
                    int var26 = 1024 + -(class18.method129(var6, -28, 4096) >> 2);
                    int var27 = var12 <= var11 ? -1 : 1;
                    for (int var28 = var10; ~var14 < ~var28; ++var28) {
                        var24 += var23;
                        int var29 = var26 + 1024 - -((-var10 + var28) * var25);
                        int var30 = class201.field3014 & var22;
                        int var31 = var28 & class167.field2457;
                        if (!var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (~var24 < -1) {
                            var24 += -var21;
                            var22 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(II)I")
    public static final int method1436(int arg0, int arg1) {
        ++field3280;
        if (arg0 != 11818) {
            field3275 = null;
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field3271 = arg2.method423(-79);
                        }
                    } else {
                        this.field3282 = arg2.method423(arg0 ^ 74);
                    }
                } else {
                    this.field3269 = arg2.method407(255);
                }
            } else {
                this.field3273 = arg2.method423(122);
            }
        } else {
            this.field3285 = arg2.method407(255);
        }
        ++field3268;
        if (arg0 != 6) {
            method1438(127);
        }
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)Ljava/lang/String;")
    public static final String method1437(int arg0) {
        ++field3279;
        String var1 = "";
        String var2 = "www";
        if (class4.field58 != null) {
            var1 = "/p=" + class4.field58;
        }
        if (~class146.field2119 != -1) {
            var2 = "www-wtqa";
        }
        if (arg0 != 0) {
            method1436(-28, -8);
        }
        return "http://" + var2 + ".runescape.com/l=" + class24.field394 + "/a=" + class246.field3826 + var1 + "/";
    }

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "(I)V")
    public static void method1438(int arg0) {
        field3275 = null;
        field3276 = null;
        field3270 = null;
        if (arg0 >= -10) {
            field3277 = 87;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1439(String arg0, int arg1) {
        if (arg1 != 10) {
            method1437(4);
        }
        ++field3272;
        return class42.method346(10, true, -14750, arg0);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class213() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(III)V")
    public static final void method1440(int arg0, int arg1, int arg2) {
        ++field3281;
        class284 var3 = class235.field3614[class260.field3986][arg1][arg0];
        if (var3 == null) {
            class265.method1795(class260.field3986, arg1, arg0);
        } else {
            class4 var4 = null;
            int var5 = -99999999;
            int var6 = 22 % ((arg2 - -26) / 41);
            for (class4 var7 = (class4) var3.method1894((byte) -90); var7 != null; var7 = (class4) var3.method1886(-121)) {
                class15 var14 = class140.method951((byte) -94, var7.field54.field2878);
                int var15 = var14.field278;
                if (~var14.field267 == -2) {
                    var15 = (var7.field54.field2886 - -1) * var15;
                }
                if (~var5 > ~var15) {
                    var4 = var7;
                    var5 = var15;
                }
            }
            if (var4 == null) {
                class265.method1795(class260.field3986, arg1, arg0);
            } else {
                var3.method1882((byte) 123, var4);
                class190 var8 = null;
                class190 var9 = null;
                for (class4 var10 = (class4) var3.method1894((byte) -90); var10 != null; var10 = (class4) var3.method1886(-82)) {
                    class190 var13 = var10.field54;
                    if (~var4.field54.field2878 != ~var13.field2878) {
                        if (var8 == null) {
                            var8 = var13;
                        }
                        if (var8.field2878 != var13.field2878 && var9 == null) {
                            var9 = var13;
                        }
                    }
                }
                long var11 = (long) ((arg0 << 7) + arg1 + 1610612736);
                class154.method1043(class260.field3986, arg1, arg0, class268.method1810(class260.field3986, arg1 * 128 + 64, (byte) 118, arg0 * 128 - -64), var4.field54, var11, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        int var2 = 53 % ((-2 - arg0) / 43);
        ++field3274;
        class189.method1255((byte) 95);
    }
}
