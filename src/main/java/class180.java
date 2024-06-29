import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class180 extends class205 {

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    private int field3337 = 0;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
    private int field3339 = 16;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
    private int field3344 = 4096;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    private int field3343 = 0;

    @OriginalMember(owner = "client!rb", name = "lb", descriptor = "I")
    private int field3350 = 2000;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "Lug;")
    public static class215 field3335 = new class215();

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "Lvd;")
    private static class222 field3345 = class212.method1357("Attack", 10731);

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "Lvd;")
    public static class222 field3347 = class212.method1357("Fehler beim Laden Ihres Spielcharakters)3", 10731);

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "Lvd;")
    public static class222 field3348 = class212.method1357("<)4col>", 10731);

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "Lvd;")
    public static class222 field3346 = field3345;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!rb", name = "kb", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)I")
    public static final int method1128(byte arg0) {
        if (arg0 != -23) {
            return -51;
        } else {
            ++field3334;
            return class13.field230;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class180() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lba;III)V")
    public static final void method1129(class13 arg0, int arg1, int arg2, int arg3) {
        ++field3349;
        if (class182.field3369 == null && !class38.field834) {
            if (arg0 != null && class155.method995(38, arg0) != null) {
                class182.field3369 = arg0;
                class57.field1074 = class155.method995(-99, arg0);
                class130.field2528 = arg2;
                class186.field3438 = arg1;
                class102.field1899 = arg3;
                class82.field1582 = false;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        class121.method771((byte) 105);
        if (arg0) {
            field3348 = null;
        }
        ++field3340;
    }

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)V")
    public static final void method1130(int arg0) {
        int var1 = -108 % ((arg0 - -12) / 51);
        for (int var2 = -1; class38.field859 > var2; ++var2) {
            int var3;
            if (var2 != -1) {
                var3 = class122.field2328[var2];
            } else {
                var3 = 2047;
            }
            class38 var4 = class54.field1024[var3];
            if (var4 != null) {
                class5.method51(var4, (byte) 67, 1);
            }
        }
        ++field3342;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field3336;
        int[] var3 = super.field3810.method557(6978, arg1);
        if (arg0 != 0) {
            method1130(18);
        }
        if (super.field3810.field1635) {
            int var4 = this.field3344 >> 1;
            int[][] var5 = super.field3810.method554(-5038);
            Random var6 = new Random((long) this.field3337);
            for (int var7 = 0; var7 < this.field3350; ++var7) {
                int var8 = this.field3344 > 0 ? this.field3343 - (var4 + -class217.method1384(Integer.MIN_VALUE, this.field3344, var6)) : this.field3343;
                int var9 = (var8 & 4091) >> 4;
                int var10 = class217.method1384(Integer.MIN_VALUE, class118.field2245, var6);
                int var11 = class217.method1384(Integer.MIN_VALUE, class134.field2598, var6);
                int var12 = (class25.field571[var9] * this.field3339 >> 12) + var11;
                int var13 = var12 - var11;
                int var14 = (class8.field135[var9] * this.field3339 >> 12) + var10;
                int var15 = -var10 + var14;
                if (var15 != 0 || var13 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    boolean var16 = var13 > var15;
                    if (var16) {
                        int var17 = var14;
                        var14 = var12;
                        int var18 = var10;
                        var10 = var11;
                        var12 = var17;
                        var11 = var18;
                    }
                    if (~var10 < ~var14) {
                        int var19 = var11;
                        var11 = var12;
                        int var20 = var10;
                        var12 = var19;
                        var10 = var14;
                        var14 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var14;
                    int var23 = -var11 + var12;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class217.method1384(Integer.MIN_VALUE, 4096, var6) >> 2) + 1024;
                    int var27 = var12 > var11 ? 1 : -1;
                    for (int var28 = var10; ~var14 < ~var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class159.field3039 & var28;
                        var24 += var23;
                        int var31 = class17.field433 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var24 < -1) {
                            var24 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V")
    public static void method1131(boolean arg0) {
        field3348 = null;
        field3335 = null;
        if (!arg0) {
            method1131(true);
        }
        field3346 = null;
        field3347 = null;
        field3345 = null;
    }

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "(I)V")
    public static final void method1132(int arg0) {
        class79.field1517.method596(false);
        if (arg0 <= 104) {
            field3347 = null;
        }
        ++field3341;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field3338;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field3344 = arg0.method675(2);
                        }
                    } else {
                        this.field3343 = arg0.method675(2);
                    }
                } else {
                    this.field3339 = arg0.method662((byte) -85);
                }
            } else {
                this.field3350 = arg0.method675(2);
            }
        } else {
            this.field3337 = arg0.method662((byte) -101);
        }
        int var5 = 56 % ((arg1 - -47) / 34);
    }
}
