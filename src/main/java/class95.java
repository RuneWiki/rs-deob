import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class95 {

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "[I")
    public static int[] field1461 = new int[1000];

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V", line = 3)
    public final void method699(int arg0, int arg1) {
        if (arg0 >= -114) {
            this.method700(-47, 89, 33, 1);
        }
        this.field1457 = 0;
        field1454++;
        this.field1453 = arg1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)Z", line = 20)
    public final boolean method700(int arg0, int arg1, int arg2, int arg3) {
        field1460++;
        int var5 = this.field1457;
        if (this.field1453 == arg2 && this.field1457 == 0) {
            return false;
        }
        boolean var6;
        if (this.field1457 == 0) {
            if (this.field1453 < arg2 && (this.field1453 + arg3) >= arg2 || this.field1453 > arg2 && arg2 >= this.field1453 - arg3) {
                this.field1453 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field1457 > 0 && this.field1453 < arg2) {
            int var7 = this.field1457 * this.field1457 / (arg3 * 2);
            int var8 = this.field1453 + var7;
            if (arg2 > var8 && this.field1453 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field1457 < 0 && arg2 < this.field1453) {
            int var9 = this.field1457 * this.field1457 / (arg3 * 2);
            int var10 = this.field1453 - var9;
            if (arg2 < var10 && var10 <= this.field1453) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (arg1 >= -103) {
            field1461 = null;
        }
        if (var6) {
            if (this.field1453 < arg2) {
                this.field1457 += arg3;
                if (arg0 != 0 && arg0 < this.field1457) {
                    this.field1457 = arg0;
                }
            } else {
                this.field1457 -= arg3;
                if (arg0 != 0 && -arg0 > this.field1457) {
                    this.field1457 = -arg0;
                }
            }
            if (this.field1457 != var5) {
                int var11 = this.field1457 * this.field1457 / (arg3 * 2);
                if (this.field1453 >= arg2) {
                    if (arg2 < this.field1453 && arg2 > this.field1453 - var11) {
                        this.field1457 = var5;
                    }
                } else if (arg2 < (this.field1453 + var11)) {
                    this.field1457 = var5;
                }
            }
        } else if (this.field1457 <= 0) {
            this.field1457 += arg3;
            if (this.field1457 > 0) {
                this.field1457 = 0;
            }
        } else {
            this.field1457 -= arg3;
            if (this.field1457 < 0) {
                this.field1457 = 0;
            }
        }
        this.field1453 += this.field1457 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I", line = 155)
    public final int method701(byte arg0) {
        if (arg0 == 17) {
            field1458++;
            return this.field1453 & 0x3FFF;
        } else {
            return 16;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZI)I", line = 172)
    public static final int method702(int arg0, boolean arg1, int arg2) {
        field1455++;
        if (arg1) {
            return 0;
        }
        class128 var3 = class507.method3024(arg2, arg1, Integer.MIN_VALUE);
        if (var3 == null) {
            return class154.field2359.method2275(arg2, (byte) -11).field3333;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 < 44) {
            return -105;
        }
        while (var3.field1893.length > var5) {
            if (var3.field1893[var5] == -1) {
                var4++;
            }
            var5++;
        }
        return var4 + (class154.field2359.method2275(arg2, (byte) -11).field3333 - var3.field1893.length);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 207)
    public final void method703(int arg0) {
        if (arg0 == -13489) {
            this.field1453 &= 0x3FFF;
            field1459++;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V", line = 221)
    public static void method704(byte arg0) {
        int var1 = -31 % ((-arg0 - 54) / 41);
        field1461 = null;
    }
}
