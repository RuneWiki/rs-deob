import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class255 extends class17 {

    @OriginalMember(owner = "client!wu", name = "L", descriptor = "I")
    private int field3767 = 8192;

    @OriginalMember(owner = "client!wu", name = "F", descriptor = "I")
    private int field3761 = 0;

    @OriginalMember(owner = "client!wu", name = "Q", descriptor = "I")
    private int field3772 = 4096;

    @OriginalMember(owner = "client!wu", name = "R", descriptor = "I")
    private int field3773 = 0;

    @OriginalMember(owner = "client!wu", name = "U", descriptor = "I")
    private int field3776 = 2048;

    @OriginalMember(owner = "client!wu", name = "S", descriptor = "I")
    private int field3774 = 12288;

    @OriginalMember(owner = "client!wu", name = "V", descriptor = "I")
    private int field3777 = 2048;

    @OriginalMember(owner = "client!wu", name = "P", descriptor = "I")
    public static int field3771 = 0;

    @OriginalMember(owner = "client!wu", name = "H", descriptor = "Lqi;")
    public static class406 field3763 = new class406(8);

    @OriginalMember(owner = "client!wu", name = "G", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!wu", name = "I", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!wu", name = "J", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!wu", name = "K", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!wu", name = "M", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!wu", name = "N", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!wu", name = "O", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!wu", name = "T", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!wu", name = "W", descriptor = "Lum;")
    public static class370 field3778;

    @OriginalMember(owner = "client!wu", name = "X", descriptor = "[[I")
    public static int[][] field3779;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)V", line = 3)
    public static void method1642(byte arg0) {
        field3779 = null;
        field3778 = null;
        if (arg0 == 4) {
            field3763 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(III)Z", line = 18)
    private final boolean method1643(int arg0, int arg1, int arg2) {
        ++field3765;
        int var4 = (arg2 - -arg1) * this.field3774 >> 12;
        int var5 = class475.field6607[var4 * 255 >> 12 & 255];
        if (arg0 > -45) {
            method1642((byte) -85);
        }
        int var6 = (var5 << 12) / this.field3774;
        int var7 = (var6 << 12) / this.field3767;
        int var8 = this.field3772 * var7 >> 12;
        return -arg1 + arg2 < var8 && -arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(III)Z", line = 46)
    private final boolean method1644(int arg0, int arg1, int arg2) {
        ++field3769;
        int var4 = (-arg2 + arg1) * this.field3774 >> 12;
        int var5 = -95 % ((arg0 - -27) / 52);
        int var6 = class475.field6607[(1047563 & var4 * 255) >> 12];
        int var7 = (var6 << 12) / this.field3774;
        int var8 = (var7 << 12) / this.field3767;
        int var9 = this.field3772 * var8 >> 12;
        return ~(arg1 + arg2) > ~var9 && ~(-var9) > ~(arg1 + arg2);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lwm;II)V", line = 63)
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field3767 = arg0.method2338(0);
                                }
                            } else {
                                this.field3772 = arg0.method2338(0);
                            }
                        } else {
                            this.field3774 = arg0.method2338(0);
                        }
                    } else {
                        this.field3776 = arg0.method2338(0);
                    }
                } else {
                    this.field3761 = arg0.method2338(0);
                }
            } else {
                this.field3773 = arg0.method2338(0);
            }
        } else {
            this.field3777 = arg0.method2338(0);
        }
        if (arg2 != 5159) {
            this.method31(-11);
        }
        ++field3762;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V", line = 157)
    public class255() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "(I)V", line = 145)
    public final void method31(int arg0) {
        if (arg0 == -9) {
            class341.method2034(true);
            ++field3766;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)V", line = 160)
    public static final void method1645(int arg0, int arg1) {
        if (!class4.field81.field1448) {
            arg1 = -1;
        }
        ++field3775;
        if (arg0 != 4096) {
            method1642((byte) 40);
        }
        if (class362.field5180 != arg1) {
            if (~arg1 != 0) {
                class487 var2 = class344.field5004.method2785(arg1, 0);
                class506 var3 = var2.method2811((byte) 63);
                if (var3 == null) {
                    arg1 = -1;
                } else {
                    class268.field3914.method971(19, var3.method3022(), var3.method3010(), new Point(var2.field6788, var2.field6795), class487.field6799, var3.method3017());
                    class362.field5180 = arg1;
                }
            }
            if (arg1 == -1 && class362.field5180 != -1) {
                class268.field3914.method971(19, -1, -1, new Point(), class487.field6799, (int[]) null);
                class362.field5180 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)V", line = 213)
    public static final void method1646(boolean arg0) {
        class520.method3075(0);
        if (arg0) {
            ++field3768;
            class17.field213 = null;
            class478.field6660 = null;
            class514.field7587 = null;
            class134.field1759 = null;
            class140.field1843 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)[I", line = 232)
    public final int[] method27(int arg0, int arg1) {
        ++field3770;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int var4 = class40.field427[arg0] + -2048;
            for (int var5 = 0; ~class530.field7763 < ~var5; ++var5) {
                int var6 = class492.field6966[var5] + -2048;
                int var7 = this.field3777 + var6;
                int var8 = ~var7 > 2047 ? var7 - -4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field3773 + var4;
                int var11 = ~var10 > 2047 ? var10 - -4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field3761 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                int var16 = this.field3776 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method1644(-81, var12, var9) && !this.method1643(-73, var15, var18) ? 0 : 4096;
            }
        }
        if (arg1 < 53) {
            this.field3777 = 32;
        }
        return var3;
    }
}
