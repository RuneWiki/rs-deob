import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class231 {

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lmu;")
    public static class303 field3336 = new class303(112, 4);

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Lmu;")
    public static class303 field3339 = new class303(63, 5);

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3341 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    private int field3333;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public int field3338;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "[Lmi;")
    public static class496[] field3346;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z", line = 10)
    public static final boolean method1607(int arg0, int arg1, int arg2) {
        field3343++;
        return arg2 == 7 ? (class49.method565(arg1, arg0, arg2 ^ 0x7) | class175.method1311(115, arg0, arg1) | class566.method3278(arg1, arg0, (byte) 50)) & class670.method3760(arg0, -9301, arg1) : false;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V", line = 27)
    public final void method1608(int arg0, int arg1) {
        if (arg0 != 15615) {
            this.method1611((byte) 98);
        }
        this.field3333 = 0;
        this.field3338 = arg1;
        field3345++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILhg;I)V", line = 39)
    public static final void method1609(int arg0, class691 arg1, int arg2) {
        field3335++;
        if (class649.field8920 >= 50 || arg1 == null || arg1.field9354 == null || arg0 >= arg1.field9354.length || arg1.field9354[arg0] == null) {
            return;
        }
        int var3 = arg1.field9354[arg0][0];
        int var4 = var3 >> 8;
        if (arg1.field9354[arg0].length > 1) {
            int var5 = (int) (Math.random() * (double) arg1.field9354[arg0].length);
            if (var5 > 0) {
                var4 = arg1.field9354[arg0][var5];
            }
        }
        int var6 = var3 >> 5 & 0x7;
        if (arg2 <= 8) {
            return;
        }
        int var7 = 256;
        if (arg1.field9326 != null && arg1.field9355 != null) {
            var7 = class3.method10(arg1.field9355[arg0], arg1.field9326[arg0], (byte) -125);
        }
        if (arg1.field9358) {
            class550.method3171(var6, var7, false, (byte) -35, 255, 0, var4);
        } else {
            class717.method3991(true, 255, var4, var6, 0, var7);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 83)
    public static void method1610(int arg0) {
        field3346 = null;
        field3339 = null;
        field3336 = null;
        if (arg0 != 0) {
            method1607(30, 1, -62);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)I", line = 95)
    public final int method1611(byte arg0) {
        if (arg0 >= -18) {
            field3341 = 32;
        }
        field3337++;
        return this.field3338 & 0x3FFF;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIB)Z", line = 107)
    public final boolean method1612(int arg0, int arg1, int arg2, byte arg3) {
        field3334++;
        int var5 = this.field3333;
        if (this.field3338 == arg1 && this.field3333 == 0) {
            return false;
        } else if (arg3 > -8) {
            return true;
        } else {
            boolean var8;
            if (this.field3333 == 0) {
                if (this.field3338 < arg1 && arg1 <= this.field3338 + arg2 || arg1 < this.field3338 && arg1 >= (this.field3338 - arg2)) {
                    this.field3338 = arg1;
                    return false;
                }
                var8 = true;
            } else if (this.field3333 > 0 && arg1 > this.field3338) {
                int var6 = this.field3333 * this.field3333 / (arg2 * 2);
                int var7 = this.field3338 + var6;
                if (arg1 > var7 && var7 >= this.field3338) {
                    var8 = true;
                } else {
                    var8 = false;
                }
            } else if (this.field3333 < 0 && this.field3338 > arg1) {
                int var9 = this.field3333 * this.field3333 / (arg2 * 2);
                int var10 = this.field3338 - var9;
                if (var10 > arg1 && var10 <= this.field3338) {
                    var8 = true;
                } else {
                    var8 = false;
                }
            } else {
                var8 = false;
            }
            if (var8) {
                if (arg1 <= this.field3338) {
                    this.field3333 -= arg2;
                    if (arg0 != 0 && this.field3333 < -arg0) {
                        this.field3333 = -arg0;
                    }
                } else {
                    this.field3333 += arg2;
                    if (arg0 != 0 && this.field3333 > arg0) {
                        this.field3333 = arg0;
                    }
                }
                if (this.field3333 != var5) {
                    int var11 = this.field3333 * this.field3333 / (arg2 * 2);
                    if (this.field3338 < arg1) {
                        if ((this.field3338 + var11) > arg1) {
                            this.field3333 = var5;
                        }
                    } else if (arg1 < this.field3338 && arg1 > this.field3338 - var11) {
                        this.field3333 = var5;
                    }
                }
            } else if (this.field3333 <= 0) {
                this.field3333 += arg2;
                if (this.field3333 > 0) {
                    this.field3333 = 0;
                }
            } else {
                this.field3333 -= arg2;
                if (this.field3333 < 0) {
                    this.field3333 = 0;
                }
            }
            this.field3338 += this.field3333 + var5 >> 1;
            return var8;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V", line = 243)
    public final void method1613(byte arg0) {
        field3332++;
        this.field3338 &= 0x3FFF;
        if (arg0 < 77) {
            this.method1613((byte) 36);
        }
    }
}
