import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class62 extends class210 {

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    private int field988;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    private int field972;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    private int field980;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "[S")
    public static short[] field970 = new short[256];

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field975 = 0;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field982 = 0;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "Z")
    public static boolean field983 = false;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Lwd;")
    public static class23 field971;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(JI)V")
    public static final void method498(long arg0, int arg1) {
        ++field976;
        if (!class189.field2972) {
            class248.field3941 += (float) arg0 * class226.field3621 / 40.0F;
            class50.field818 += (float) arg0 * class260.field4118 / 40.0F;
        }
        if (arg1 == -849415636) {
            int var3 = class154.field2305 + class263.field4168.field4725;
            int var4 = class88.field1377 + class263.field4168.field4709;
            if (-var3 + class135.field2025 < -500 || -var3 + class135.field2025 > 500 || ~(-var4 + class223.field3573) > 499 || ~(-var4 + class223.field3573) < -501) {
                class223.field3573 = var4;
                class135.field2025 = var3;
            }
            if (~class135.field2025 != ~var3) {
                int var5 = -class135.field2025 + var3;
                int var6 = (int) ((long) var5 * arg0 / 320L);
                if (~var5 >= -1) {
                    if (var6 == 0) {
                        var6 = -1;
                    } else if (~var6 > ~var5) {
                        var6 = var5;
                    }
                } else if (var6 != 0) {
                    if (var6 > var5) {
                        var6 = var5;
                    }
                } else {
                    var6 = 1;
                }
                class135.field2025 += var6;
            }
            if (~class223.field3573 != ~var4) {
                int var7 = -class223.field3573 + var4;
                int var8 = (int) ((long) var7 * arg0 / 320L);
                if (~var7 < -1) {
                    if (~var8 == -1) {
                        var8 = 1;
                    } else if (~var7 > ~var8) {
                        var8 = var7;
                    }
                } else if (~var8 == -1) {
                    var8 = -1;
                } else if (~var7 < ~var8) {
                    var8 = var7;
                }
                class223.field3573 += var8;
            }
            class3.method13(-30070);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(III)V")
    public final void method499(int arg0, int arg1, int arg2) {
        ++field979;
        int var4 = this.field988 * arg2 >> 12;
        int var5 = this.field980 * arg0 >> 12;
        int var6 = this.field985 * arg0 >> 12;
        int var7 = this.field973 * arg2 >> 12;
        if (arg1 != -20) {
            field970 = null;
        }
        int var8 = this.field987 * arg2 >> 12;
        int var9 = this.field986 * arg0 >> 12;
        int var10 = this.field984 * arg0 >> 12;
        int var11 = this.field972 * arg2 >> 12;
        class247.method1673(var11, var5, super.field3247, 113, var4, var8, var7, var10, var9, var6);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method500(byte arg0) {
        field970 = null;
        if (arg0 <= -94) {
            field971 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIBIII)V")
    public static final void method501(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        class79.field1204 = arg1;
        ++field978;
        int var6 = -64 / ((40 - arg2) / 58);
        class269.field4261 = arg5;
        class15.field181 = arg3;
        class237.field3749 = arg4;
        class218.field3333 = arg0;
        if (class218.field3333 >= 100) {
            int var7 = class79.field1204 * 128 + 64;
            int var8 = class15.field181 * 128 - -64;
            int var9 = class254.method1721(-580808345, class130.field1941, var8, var7) + -class237.field3749;
            int var10 = -class226.field3616 + var7;
            int var11 = -class250.field4007 + var9;
            int var12 = var8 - class118.field1787;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
            class8.field128 = (int) (325.949D * Math.atan2((double) var11, (double) var13)) & 2047;
            class82.field1244 = (int) (Math.atan2((double) var10, (double) var12) * -325.949D) & 2047;
            if (class8.field128 < 128) {
                class8.field128 = 128;
            }
            if (~class8.field128 < -384) {
                class8.field128 = 383;
            }
        }
        class175.field2704 = 2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)V")
    public final void method502(int arg0, byte arg1, int arg2) {
        ++field977;
        if (arg1 < 72) {
            method501(127, 68, (byte) 87, 75, 110, 30);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lub;I)V")
    public static final void method503(class92 arg0, int arg1) {
        ++field974;
        class266.field4206 = class220.method1509(class134.field2005, (byte) 105, arg0);
        class23.field389 = new int[256];
        for (int var2 = 0; ~var2 > -4; ++var2) {
            float var4 = (float) (255 & class23.field406[var2] >> 16);
            int var5 = 255 & class23.field406[var2 - -1] >> 16;
            float var6 = (float) (255 & class23.field406[var2] >> 8);
            float var7 = ((float) var5 + -var4) / 64.0F;
            int var8 = (65280 & class23.field406[var2 + 1]) >> 8;
            float var9 = ((float) var8 - var6) / 64.0F;
            float var10 = (float) (255 & class23.field406[var2]);
            int var11 = 255 & class23.field406[var2 + 1];
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; ~var13 > -65; ++var13) {
                class23.field389[var2 * 64 - -var13] = class44.method377(class44.method377((int) var4 << 16, (int) var6 << 8), (int) var10);
                var10 += var12;
                var6 += var9;
                var4 += var7;
            }
        }
        for (int var3 = 192; var3 < 255; ++var3) {
            class23.field389[var3] = class23.field406[3];
        }
        class182.field2878 = new int[32768];
        class220.field3365 = new int[32768];
        if (arg1 < 51) {
            field971 = null;
        }
        class22.method193((class13) null, 119);
        class5.field78 = new int[32768];
        class241.field3869 = new int[32768];
        class133.field1990 = new class51(128, 254);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field984 = arg5;
        this.field986 = arg7;
        this.field985 = arg3;
        this.field988 = arg0;
        this.field973 = arg2;
        this.field972 = arg6;
        this.field980 = arg1;
        this.field987 = arg4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
    public final void method504(int arg0, int arg1, int arg2) {
        ++field981;
        if (arg2 >= -8) {
            method501(46, 83, (byte) -13, -16, -61, -11);
        }
    }
}
