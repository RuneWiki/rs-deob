import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class338 {

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field4800 = 0;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field4799 = 0;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    private int field4802;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public int field4806;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIBI)Z")
    public final boolean method2173(int arg0, int arg1, byte arg2, int arg3) {
        field4803++;
        int var5 = this.field4802;
        if (arg2 >= -97) {
            method2174((class134) null, -125, (byte) -85, true, 103, (byte[]) null, (class119[]) null);
        }
        if (this.field4806 == arg0 && this.field4802 == 0) {
            return false;
        }
        boolean var6;
        if (this.field4802 == 0) {
            if (this.field4806 < arg0 && arg0 <= this.field4806 + arg1 || arg0 < this.field4806 && this.field4806 - arg1 <= arg0) {
                this.field4806 = arg0;
                return false;
            }
            var6 = true;
        } else if (this.field4802 > 0 && this.field4806 < arg0) {
            int var7 = this.field4802 * this.field4802 / (arg1 * 2);
            int var8 = this.field4806 + var7;
            if (var8 < arg0 && this.field4806 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field4802 < 0 && arg0 < this.field4806) {
            int var9 = this.field4802 * this.field4802 / (arg1 * 2);
            int var10 = this.field4806 - var9;
            if (arg0 < var10 && this.field4806 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field4806 < arg0) {
                this.field4802 += arg1;
                if (arg3 != 0 && arg3 < this.field4802) {
                    this.field4802 = arg3;
                }
            } else {
                this.field4802 -= arg1;
                if (arg3 != 0 && this.field4802 < (-arg3)) {
                    this.field4802 = -arg3;
                }
            }
            if (this.field4802 != var5) {
                int var11 = this.field4802 * this.field4802 / (arg1 * 2);
                if (arg0 > this.field4806) {
                    if (arg0 < (this.field4806 + var11)) {
                        this.field4802 = var5;
                    }
                } else if (arg0 < this.field4806 && this.field4806 - var11 < arg0) {
                    this.field4802 = var5;
                }
            }
        } else if (this.field4802 <= 0) {
            this.field4802 += arg1;
            if (this.field4802 > 0) {
                this.field4802 = 0;
            }
        } else {
            this.field4802 -= arg1;
            if (this.field4802 < 0) {
                this.field4802 = 0;
            }
        }
        this.field4806 += this.field4802 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lae;IBZI[B[Lp;)V")
    public static final void method2174(class134 arg0, int arg1, byte arg2, boolean arg3, int arg4, byte[] arg5, class119[] arg6) {
        field4798++;
        if (arg2 != -117) {
            field4799 = 93;
        }
        class236 var7 = new class236(arg5);
        int var8 = -1;
        while (true) {
            int var9 = var7.method1601(true);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1594(-29);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method1574(-5);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg1 + var13;
                int var19 = arg4 + var12;
                if (var18 > 0 && var19 > 0 && (class176.field2403 - 1) > var18 && (class383.field5395 - 1) > var19) {
                    class119 var20 = null;
                    if (!arg3) {
                        int var21 = var14;
                        if ((class399.field5699[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg6[var21];
                        }
                    }
                    class311.method2052(var16, (byte) 79, var18, true, arg3, var8, var20, var14, -1, var14, arg0, var17, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method2175(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4797++;
        int var8 = arg3 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class92.field1121 - class158.field2061) * var8 / 100 + class158.field2061;
        int var10 = arg5 * var9 >> 8;
        if (arg0 != 41) {
            method2174((class134) null, -113, (byte) 15, false, -10, (byte[]) null, (class119[]) null);
        }
        int var11 = 16384 - arg2 & 0x3FFF;
        int var12 = 16384 - arg1 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class158.field2055[var11] * -var10 >> 15;
            var15 = class158.field2059[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class158.field2055[var12] * var15 >> 15;
            var15 = class158.field2059[var12] * var15 >> 15;
        }
        class232.field3265 = 0;
        class265.field3774 = arg7 - var15;
        class138.field1722 = arg2;
        class276.field3925 = arg6 - var14;
        class334.field4730 = arg4 - var13;
        class377.field5324 = arg1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public final void method2176(int arg0) {
        field4807++;
        this.field4806 &= 0x3FFF;
        if (arg0 <= 91) {
            field4800 = 97;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)I")
    public final int method2177(byte arg0) {
        field4804++;
        if (arg0 >= -118) {
            field4800 = 56;
        }
        return this.field4806 & 0x3FFF;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V")
    public final void method2178(int arg0, int arg1) {
        this.field4806 = arg0;
        field4805++;
        if (arg1 > -17) {
            this.method2178(-71, -45);
        }
        this.field4802 = 0;
    }
}
