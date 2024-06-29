import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class161 extends class74 {

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    private int field2457 = 8192;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    private int field2458 = 4096;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    private int field2456 = 0;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    private int field2459 = 0;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    private int field2462 = 2048;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    private int field2466 = 12288;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    private int field2467 = 2048;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "F")
    public static float field2460 = 128.0F;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "Z")
    public static boolean field2461 = false;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "[C")
    public static char[] field2469 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field2455 = 1;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field2465 = "skill: ";

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "[I")
    public static int[] field2470;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(Z)V")
    public static void method1082(boolean arg0) {
        field2470 = null;
        field2469 = null;
        field2465 = null;
        if (arg0) {
            method1085(-65);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field2453;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            int var4 = class207.field3212[arg1] - 2048;
            for (int var5 = 0; class178.field2662 > var5; ++var5) {
                int var6 = class224.field3522[var5] + -2048;
                int var7 = this.field2462 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = ~var8 < -2049 ? var8 - 4096 : var8;
                int var10 = var4 - -this.field2456;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = this.field2459 + var6;
                int var13 = var12 < -2048 ? var12 + 4096 : var12;
                int var14 = ~var11 >= -2049 ? var11 : var11 - 4096;
                int var15 = ~var13 < -2049 ? var13 - 4096 : var13;
                int var16 = this.field2467 + var4;
                int var17 = ~var16 <= 2047 ? var16 : var16 - -4096;
                int var18 = ~var17 >= -2049 ? var17 : var17 - 4096;
                var3[var5] = !this.method1084(var14, class76.method605(arg0, -159390808), var9) && !this.method1083(var15, (byte) 48, var18) ? 0 : 4096;
            }
        }
        if (arg0 != 4) {
            field2455 = -64;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 != -79) {
            method1082(true);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field2457 = arg1.method293(arg0 + 190);
                                }
                            } else {
                                this.field2458 = arg1.method293(-118);
                            }
                        } else {
                            this.field2466 = arg1.method293(-93);
                        }
                    } else {
                        this.field2467 = arg1.method293(arg0 ^ 124);
                    }
                } else {
                    this.field2459 = arg1.method293(-65);
                }
            } else {
                this.field2456 = arg1.method293(7);
            }
        } else {
            this.field2462 = arg1.method293(arg0 + 168);
        }
        ++field2471;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBI)Z")
    private final boolean method1083(int arg0, byte arg1, int arg2) {
        ++field2463;
        int var4 = (arg0 + arg2) * this.field2466 >> 12;
        int var5 = class221.field3456[(var4 * 255 & 1046674) >> 12];
        int var6 = (var5 << 12) / this.field2466;
        if (arg1 != 48) {
            return true;
        } else {
            int var7 = (var6 << 12) / this.field2457;
            int var8 = this.field2458 * var7 >> 12;
            return -arg0 + arg2 < var8 && -arg0 + arg2 > -var8;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        ++field2454;
        class87.method698(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)Z")
    private final boolean method1084(int arg0, int arg1, int arg2) {
        int var4 = (-arg2 + arg0) * this.field2466 >> 12;
        ++field2472;
        if (arg1 != -159390804) {
            this.method493(true);
        }
        int var5 = class221.field3456[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field2466;
        int var7 = (var6 << 12) / this.field2457;
        int var8 = this.field2458 * var7 >> 12;
        return var8 > arg0 + arg2 && ~(arg0 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    public static final void method1085(int arg0) {
        ++field2468;
        int var1 = class139.field2139;
        int var2 = class154.field2353;
        int var3 = class273.field4313;
        int var4 = 6116423;
        int var5 = class92.field1478;
        class201.method1333(var1, var2, var3, var5, var4);
        class201.method1333(var1 + 1, var2 + 1, var3 + -2, 16, 0);
        class201.method1340(var1 + 1, var2 - -18, var3 + -2, var5 + -19, 0);
        class123.field1925.method13(class215.field3315, var1 + 3, var2 + 14, var4, -1);
        int var6 = class108.field1719;
        if (arg0 <= 120) {
            method1085(67);
        }
        int var7 = class188.field3012;
        for (int var8 = 0; ~var8 > ~class220.field3450; ++var8) {
            int var9 = var2 - -31 - -((class220.field3450 + -1 + -var8) * 15);
            int var10 = 16777215;
            if (~var1 > ~var7 && ~var7 > ~(var1 + var3) && ~(var9 - 13) > ~var6 && ~(var9 + 3) < ~var6) {
                var10 = 16776960;
            }
            class123.field1925.method13(class57.method454(15827, var8), var1 + 3, var9, var10, 0);
        }
        class204.method1365(class273.field4313, (byte) -17, class139.field2139, class92.field1478, class154.field2353);
    }
}
