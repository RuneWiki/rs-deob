import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class382 extends class214 {

    @OriginalMember(owner = "client!laa", name = "H", descriptor = "I")
    private int field5731 = 2048;

    @OriginalMember(owner = "client!laa", name = "L", descriptor = "I")
    private int field5735 = 4096;

    @OriginalMember(owner = "client!laa", name = "M", descriptor = "I")
    private int field5736 = 0;

    @OriginalMember(owner = "client!laa", name = "T", descriptor = "I")
    private int field5743 = 12288;

    @OriginalMember(owner = "client!laa", name = "W", descriptor = "I")
    private int field5746 = 8192;

    @OriginalMember(owner = "client!laa", name = "S", descriptor = "I")
    private int field5742 = 2048;

    @OriginalMember(owner = "client!laa", name = "O", descriptor = "I")
    private int field5738 = 0;

    @OriginalMember(owner = "client!laa", name = "P", descriptor = "I")
    public static int field5739 = -1;

    @OriginalMember(owner = "client!laa", name = "Q", descriptor = "Z")
    public static boolean field5740 = true;

    @OriginalMember(owner = "client!laa", name = "D", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!laa", name = "G", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!laa", name = "I", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!laa", name = "J", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!laa", name = "K", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!laa", name = "R", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!laa", name = "U", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!laa", name = "V", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!laa", name = "N", descriptor = "Leha;")
    public static class162 field5737;

    @OriginalMember(owner = "client!laa", name = "E", descriptor = "Lqia;")
    public static class303 field5728;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILofa;I)V", line = 5)
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 < 92) {
            this.field5746 = 13;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field5746 = arg1.method1989((byte) -83);
                                }
                            } else {
                                this.field5735 = arg1.method1989((byte) -31);
                            }
                        } else {
                            this.field5743 = arg1.method1989((byte) -100);
                        }
                    } else {
                        this.field5742 = arg1.method1989((byte) -55);
                    }
                } else {
                    this.field5736 = arg1.method1989((byte) -99);
                }
            } else {
                this.field5738 = arg1.method1989((byte) -82);
            }
        } else {
            this.field5731 = arg1.method1989((byte) -39);
        }
        ++field5729;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIB)Z", line = 85)
    private final boolean method2400(int arg0, int arg1, byte arg2) {
        ++field5734;
        int var4 = (-arg0 + arg1) * this.field5743 >> 12;
        int var5 = class3.field18[(var4 * 255 & 1046068) >> 12];
        int var6 = (var5 << 12) / this.field5743;
        int var7 = (var6 << 12) / this.field5746;
        int var8 = this.field5735 * var7 >> 12;
        if (arg2 != 115) {
            return true;
        } else {
            return ~var8 < ~(arg0 + arg1) && ~(-var8) > ~(arg0 - -arg1);
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "()V", line = 103)
    public class382() {
        super(0, true);
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)V", line = 107)
    public final void method65(int arg0) {
        class465.method2853(256);
        ++field5744;
        if (arg0 <= 48) {
            this.field5738 = 9;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIZ)Z", line = 123)
    private final boolean method2401(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return false;
        } else {
            ++field5727;
            int var4 = (arg0 + arg1) * this.field5743 >> 12;
            int var5 = class3.field18[(var4 * 255 & 1048341) >> 12];
            int var6 = (var5 << 12) / this.field5743;
            int var7 = (var6 << 12) / this.field5746;
            int var8 = this.field5735 * var7 >> 12;
            return var8 > arg1 - arg0 && -var8 < -arg0 + arg1;
        }
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(II)V", line = 148)
    public static final void method2402(int arg0, int arg1) {
        ++field5741;
        if (arg0 != 29400) {
            method2404(29, false, -64, -28, 50);
        }
        class118 var2 = class86.method755(true, 1, arg1);
        var2.method936(0);
    }

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "(B)V", line = 168)
    public static final void method2403(byte arg0) {
        ++field5745;
        for (class124 var1 = (class124) class662.field9426.method3508((byte) -90); var1 != null; var1 = (class124) class662.field9426.method3520(-1)) {
            if (!var1.field1902) {
                class188.method1429(var1.field1896, 112);
            } else {
                var1.field1902 = false;
            }
        }
        int var2 = 63 % ((-13 - arg0) / 51);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZIII)V", line = 192)
    public static final void method2404(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field5733;
        if (class118.method934(arg2, 19)) {
            class488.method2968(arg1, -1, class158.field2453[arg2], arg4, (byte) -76, arg3);
            if (arg0 >= -74) {
                field5740 = false;
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "(B)V", line = 210)
    public static void method2405(byte arg0) {
        if (arg0 != -26) {
            method2403((byte) -55);
        }
        field5737 = null;
        field5728 = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IB)[I", line = 225)
    public final int[] method64(int arg0, byte arg1) {
        ++field5730;
        if (arg1 != 5) {
            method2404(111, false, -6, 100, -54);
        }
        int[] var3 = super.field3544.method3869(arg0, -127);
        if (super.field3544.field9836) {
            int var4 = class131.field2138[arg0] + -2048;
            for (int var5 = 0; class626.field8787 > var5; ++var5) {
                int var6 = class592.field8328[var5] - 2048;
                int var7 = this.field5731 + var6;
                int var8 = var7 < -2048 ? var7 - -4096 : var7;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = this.field5738 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field5736 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = this.field5742 + var4;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method2400(var9, var12, (byte) 115) && !this.method2401(var15, var18, false) ? 0 : 4096;
            }
        }
        return var3;
    }
}
