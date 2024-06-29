import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class24 extends class198 {

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    private int field309 = 2048;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    private int field305 = 0;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    private int field316 = 10;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "[[[I")
    public static int[][][] field313 = new int[2][][];

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lwa;")
    public static class281 field311 = new class281();

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "[I")
    private int[] field310;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "[I")
    private int[] field315;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "[Ltf;")
    public static class114[] field317;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
    private final void method139(boolean arg0) {
        this.field310 = new int[this.field316 + 1];
        this.field315 = new int[this.field316 + 1];
        int var2 = 4096 / this.field316;
        ++field312;
        int var3 = 0;
        int var4 = this.field309 * var2 >> 12;
        if (!arg0) {
            for (int var5 = 0; ~this.field316 < ~var5; ++var5) {
                this.field310[var5] = var3;
                this.field315[var5] = var3 - -var4;
                var3 += var2;
            }
            this.field310[this.field316] = 4096;
            this.field315[this.field316] = this.field315[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)V")
    public static void method140(boolean arg0) {
        field311 = null;
        if (arg0) {
            field317 = null;
            field313 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            this.field316 = -74;
        }
        ++field303;
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int var4 = class42.field591[arg1];
            if (~this.field305 != -1) {
                for (int var5 = 0; ~class42.field590 < ~var5; ++var5) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class152.field2367[var5];
                    int var9 = this.field305;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var7 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var7 = (var8 + -4096 - -var4 >> 1) + 2048;
                        }
                    } else {
                        var7 = var8;
                    }
                    for (int var10 = 0; ~this.field316 < ~var10; ++var10) {
                        if (var7 >= this.field310[var10] && ~this.field310[var10 + 1] < ~var7) {
                            if (this.field315[var10] > var7) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field316; ++var12) {
                    if (this.field310[var12] <= var4 && ~this.field310[var12 + 1] < ~var4) {
                        if (this.field315[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class158.method1050(var3, 0, class42.field590, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method141(boolean arg0, String arg1) {
        ++field306;
        if (!arg0) {
            return -126;
        } else {
            for (int var2 = 0; var2 < class292.field4819.length; ++var2) {
                if (class292.field4819[var2].equalsIgnoreCase(arg1)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        this.method139(false);
        ++field308;
        int var2 = 2 % ((arg0 - -46) / 47);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field305 = arg1.method1420((byte) 0);
                }
            } else {
                this.field309 = arg1.method1419(86);
            }
        } else {
            this.field316 = arg1.method1420((byte) 0);
        }
        ++field307;
        int var5 = 64 % ((60 - arg0) / 61);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class24() {
        super(0, true);
    }
}
