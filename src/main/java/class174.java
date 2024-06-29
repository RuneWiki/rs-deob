import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class174 extends class12 {

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
    private int field3300 = 2048;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    private int field3301 = 12288;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    private int field3304 = 0;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    private int field3306 = 2048;

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "I")
    private int field3308 = 8192;

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "I")
    private int field3310 = 0;

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "I")
    private int field3309 = 4096;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static volatile int field3290 = -1;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "Ltg;")
    private static class184 field3292 = class135.method812("Loading wordpack )2 ", 3);

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "Ltg;")
    public static class184 field3289 = field3292;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "Ltg;")
    public static class184 field3297 = class135.method812("<col=ffb000>", 3);

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    public static int field3295 = -1;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
    public static int field3307 = 2;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "[Ltg;")
    public static class184[] field3298 = new class184[500];

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "I")
    public static int field3311 = 0;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "Ltg;")
    public static class184 field3305 = class135.method812("Musik)2Engine vorbereitet)3", 3);

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "Ls;")
    public static class168 field3302;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "Lud;")
    public static class190 field3291;

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class174() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
    public static void method1075(int arg0) {
        field3297 = null;
        field3305 = null;
        field3298 = null;
        field3291 = null;
        if (arg0 != 1048562) {
            field3307 = 9;
        }
        field3292 = null;
        field3289 = null;
        field3302 = null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        class90.method527((byte) 127);
        if (arg0 == 57) {
            ++field3293;
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(III)Z")
    private final boolean method1076(int arg0, int arg1, int arg2) {
        int var4 = (arg0 + arg1) * this.field3301 >> 12;
        ++field3296;
        int var5 = class67.field1304[(1048562 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3301;
        if (arg2 != 2) {
            return true;
        } else {
            int var7 = (var6 << 12) / this.field3308;
            int var8 = this.field3309 * var7 >> 12;
            return ~var8 < ~(-arg0 + arg1) && arg1 - arg0 > -var8;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field3294;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field3308 = arg0.method611(false);
                                }
                            } else {
                                this.field3309 = arg0.method611(false);
                            }
                        } else {
                            this.field3301 = arg0.method611(false);
                        }
                    } else {
                        this.field3300 = arg0.method611(false);
                    }
                } else {
                    this.field3304 = arg0.method611(false);
                }
            } else {
                this.field3310 = arg0.method611(false);
            }
        } else {
            this.field3306 = arg0.method611(arg2);
        }
        if (arg2) {
            this.method59((class97) null, 89, true);
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(III)Z")
    private final boolean method1077(int arg0, int arg1, int arg2) {
        ++field3299;
        int var4 = (-arg2 + arg1) * this.field3301 >> 12;
        int var5 = class67.field1304[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field3301;
        int var7 = -18 % ((arg0 - 8) / 50);
        int var8 = (var6 << 12) / this.field3308;
        int var9 = this.field3309 * var8 >> 12;
        return var9 > arg2 - -arg1 && arg2 - -arg1 > -var9;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        if (arg1 != 17) {
            field3297 = null;
        }
        int[] var3 = super.field224.method7((byte) 123, arg0);
        if (super.field224.field53) {
            int var4 = class37.field698[arg0] + -2048;
            for (int var5 = 0; ~var5 > ~class201.field3889; ++var5) {
                int var6 = this.field3300 + var4;
                int var7 = class131.field2381[var5] + -2048;
                int var8 = var7 - -this.field3306;
                int var9 = this.field3310 + var4;
                int var10 = ~var8 <= 2047 ? var8 : var8 + 4096;
                int var11 = var9 >= -2048 ? var9 : var9 + 4096;
                int var12 = var11 > 2048 ? var11 + -4096 : var11;
                int var13 = this.field3304 + var7;
                int var14 = var10 <= 2048 ? var10 : var10 + -4096;
                int var15 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var16 = var6 >= -2048 ? var6 : var6 + 4096;
                int var17 = var16 > 2048 ? var16 - 4096 : var16;
                int var18 = ~var15 < -2049 ? var15 + -4096 : var15;
                var3[var5] = !this.method1077(120, var12, var14) && !this.method1076(var18, var17, 2) ? 0 : 4096;
            }
        }
        ++field3303;
        return var3;
    }
}
