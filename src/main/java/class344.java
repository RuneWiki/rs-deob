import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class344 {

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public static int field4732 = -60;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "[I")
    public static int[] field4735 = new int[1];

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    private int field4728;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public int field4729;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "Lqk;")
    public static class146 field4731;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIII)Z")
    public final boolean method2108(int arg0, int arg1, int arg2, int arg3) {
        field4730++;
        int var5 = this.field4728;
        if (this.field4729 == arg0 && this.field4728 == 0) {
            return false;
        }
        boolean var6;
        if (this.field4728 == 0) {
            if (arg0 > this.field4729 && (this.field4729 + arg3) >= arg0 || this.field4729 > arg0 && arg0 >= (this.field4729 - arg3)) {
                this.field4729 = arg0;
                return false;
            }
            var6 = true;
        } else if (this.field4728 > 0 && arg0 > this.field4729) {
            int var7 = this.field4728 * this.field4728 / (arg3 * 2);
            int var8 = this.field4729 + var7;
            if (var8 < arg0 && this.field4729 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field4728 < 0 && this.field4729 > arg0) {
            int var9 = this.field4728 * this.field4728 / (arg3 * 2);
            int var10 = this.field4729 - var9;
            if (arg0 < var10 && var10 <= this.field4729) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg0 > this.field4729) {
                this.field4728 += arg3;
                if (arg2 != 0 && arg2 < this.field4728) {
                    this.field4728 = arg2;
                }
            } else {
                this.field4728 -= arg3;
                if (arg2 != 0 && (-arg2) > this.field4728) {
                    this.field4728 = -arg2;
                }
            }
            if (this.field4728 != var5) {
                int var11 = this.field4728 * this.field4728 / (arg3 * 2);
                if (arg0 > this.field4729) {
                    if (arg0 < this.field4729 + var11) {
                        this.field4728 = var5;
                    }
                } else if (arg0 < this.field4729 && arg0 > (this.field4729 - var11)) {
                    this.field4728 = var5;
                }
            }
        } else if (this.field4728 <= 0) {
            this.field4728 += arg3;
            if (this.field4728 > 0) {
                this.field4728 = 0;
            }
        } else {
            this.field4728 -= arg3;
            if (this.field4728 < 0) {
                this.field4728 = 0;
            }
        }
        this.field4729 += this.field4728 + var5 >> 1;
        int var12 = -52 / ((48 - arg1) / 60);
        return var6;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
    public static void method2109(int arg0) {
        field4731 = null;
        field4735 = null;
        if (arg0 != 0) {
            method2109(-69);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)I")
    public final int method2110(boolean arg0) {
        field4733++;
        if (!arg0) {
            this.method2111((byte) -90);
        }
        return this.field4729 & 0x3FFF;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
    public final void method2111(byte arg0) {
        this.field4729 &= 0x3FFF;
        field4734++;
        int var2 = 94 % ((arg0 - 40) / 40);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)V")
    public final void method2112(boolean arg0, int arg1) {
        if (arg0) {
            this.method2112(true, -35);
        }
        this.field4728 = 0;
        field4736++;
        this.field4729 = arg1;
    }
}
