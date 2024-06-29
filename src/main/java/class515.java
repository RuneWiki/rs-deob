import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class515 {

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field7281 = 0;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public int field7276;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    private int field7282;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "[Lf;")
    public static class702[] field7284;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V", line = 3)
    public final void method2944(int arg0, int arg1) {
        this.field7276 = arg0;
        this.field7282 = arg1;
        field7275++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lvg;Lvg;Z)V", line = 16)
    public static final void method2945(class49 arg0, class49 arg1, boolean arg2) {
        if (!arg2) {
            method2950((byte) 120);
        }
        field7278++;
        class386.field5436++;
        class135 var3 = class688.method3794(class243.field3787, class583.field8198, (byte) 38);
        var3.field1978.method3868(arg0.field977, -318419336);
        var3.field1978.method3852(false, arg1.field914);
        var3.field1978.method3852(false, arg0.field1023);
        var3.field1978.method3865(-1449382360, arg1.field1023);
        var3.field1978.method3849(arg1.field977, (byte) -39);
        var3.field1978.method3816(arg0.field914, -54);
        class19.method223(var3, 0);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLvq;)V", line = 38)
    public static final void method2946(byte arg0, class425 arg1) {
        field7280++;
        boolean var2 = false;
        if (class564.field7962 == arg1.field6203 || arg1.field6218 == -1 || arg1.field6175 != 0) {
            var2 = true;
        } else {
            class30 var3 = class188.field2708.method2140(arg1.field6218, 124);
            if (var3.field452 || var3.field450[arg1.field6194] < (arg1.field6251 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field6203 - arg1.field6169;
            int var5 = class564.field7962 - arg1.field6169;
            int var6 = arg1.field6249 * 512 + (arg1.method2553((byte) 93) * 256);
            int var7 = arg1.field6187 * 512 + arg1.method2553((byte) 103) * 256;
            int var8 = arg1.field6183 * 512 + arg1.method2553((byte) 119) * 256;
            int var9 = arg1.field6178 * 512 + arg1.method2553((byte) 124) * 256;
            arg1.field3024 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field3029 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field6264 = 0;
        if (arg1.field6179 == 0) {
            arg1.method2554(8192, (byte) 85, false);
        }
        if (arg0 != 18) {
            return;
        }
        if (arg1.field6179 == 1) {
            arg1.method2554(12288, (byte) 85, false);
        }
        if (arg1.field6179 == 2) {
            arg1.method2554(0, (byte) 85, false);
        }
        if (arg1.field6179 == 3) {
            arg1.method2554(4096, (byte) 85, false);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V", line = 95)
    public final void method2947(byte arg0) {
        if (arg0 == -50) {
            field7277++;
            this.field7276 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)I", line = 108)
    public final int method2948(byte arg0) {
        field7283++;
        return arg0 > -36 ? -82 : this.field7276 & 0x3FFF;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIII)Z", line = 129)
    public final boolean method2949(int arg0, int arg1, int arg2, int arg3) {
        field7279++;
        int var5 = this.field7282;
        if (this.field7276 == arg1 && this.field7282 == 0) {
            return false;
        }
        boolean var6;
        if (this.field7282 == arg0) {
            if (arg1 > this.field7276 && (this.field7276 + arg2) >= arg1 || arg1 < this.field7276 && arg1 >= this.field7276 - arg2) {
                this.field7276 = arg1;
                return false;
            }
            var6 = true;
        } else if (this.field7282 > 0 && this.field7276 < arg1) {
            int var7 = this.field7282 * this.field7282 / (arg2 * 2);
            int var8 = this.field7276 + var7;
            if (var8 < arg1 && this.field7276 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field7282 < 0 && this.field7276 > arg1) {
            int var9 = this.field7282 * this.field7282 / (arg2 * 2);
            int var10 = this.field7276 - var9;
            if (var10 > arg1 && var10 <= this.field7276) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field7276 < arg1) {
                this.field7282 += arg2;
                if (arg3 != 0 && this.field7282 > arg3) {
                    this.field7282 = arg3;
                }
            } else {
                this.field7282 -= arg2;
                if (arg3 != 0 && -arg3 > this.field7282) {
                    this.field7282 = -arg3;
                }
            }
            if (this.field7282 != var5) {
                int var11 = this.field7282 * this.field7282 / (arg2 * 2);
                if (arg1 <= this.field7276) {
                    if (this.field7276 > arg1 && arg1 > this.field7276 - var11) {
                        this.field7282 = var5;
                    }
                } else if (arg1 < (this.field7276 + var11)) {
                    this.field7282 = var5;
                }
            }
        } else if (this.field7282 > 0) {
            this.field7282 -= arg2;
            if (this.field7282 < 0) {
                this.field7282 = 0;
            }
        } else {
            this.field7282 += arg2;
            if (this.field7282 > 0) {
                this.field7282 = 0;
            }
        }
        this.field7276 += this.field7282 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)V", line = 262)
    public static void method2950(byte arg0) {
        field7284 = null;
        if (arg0 <= 49) {
            field7281 = 85;
        }
    }
}
