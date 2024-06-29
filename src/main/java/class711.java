import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class711 {

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lmga;")
    public static class739 field9954 = new class739(89, 18);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field9949;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    private int field9950;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field9951;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field9952;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field9953;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public int field9955;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field9956;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method3975(int arg0) {
        if (arg0 >= 23) {
            field9954 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)Z")
    public static final boolean method3976(byte arg0, int arg1) {
        field9949++;
        if (arg0 <= 76) {
            return true;
        } else {
            return arg1 >= 12 && arg1 <= 17;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public final void method3977(int arg0) {
        if (arg0 >= 71) {
            this.field9955 &= 0x3FFF;
            field9951++;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIB)Z")
    public final boolean method3978(int arg0, int arg1, int arg2, byte arg3) {
        field9956++;
        int var5 = this.field9950;
        if (this.field9955 == arg1 && this.field9950 == 0) {
            return false;
        }
        boolean var8;
        if (this.field9950 == 0) {
            if (arg1 > this.field9955 && (this.field9955 + arg0) >= arg1 || this.field9955 > arg1 && arg1 >= this.field9955 - arg0) {
                this.field9955 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field9950 > 0 && this.field9955 < arg1) {
            int var6 = this.field9950 * this.field9950 / (arg0 * 2);
            int var7 = this.field9955 + var6;
            if (var7 < arg1 && var7 >= this.field9955) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field9950 < 0 && this.field9955 > arg1) {
            int var9 = this.field9950 * this.field9950 / (arg0 * 2);
            int var10 = this.field9955 - var9;
            if (var10 > arg1 && var10 <= this.field9955) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg1 <= this.field9955) {
                this.field9950 -= arg0;
                if (arg2 != 0 && this.field9950 < (-arg2)) {
                    this.field9950 = -arg2;
                }
            } else {
                this.field9950 += arg0;
                if (arg2 != 0 && arg2 < this.field9950) {
                    this.field9950 = arg2;
                }
            }
            if (this.field9950 != var5) {
                int var11 = this.field9950 * this.field9950 / (arg0 * 2);
                if (this.field9955 < arg1) {
                    if ((this.field9955 + var11) > arg1) {
                        this.field9950 = var5;
                    }
                } else if (arg1 < this.field9955 && (this.field9955 - var11) < arg1) {
                    this.field9950 = var5;
                }
            }
        } else if (this.field9950 > 0) {
            this.field9950 -= arg0;
            if (this.field9950 < 0) {
                this.field9950 = 0;
            }
        } else {
            this.field9950 += arg0;
            if (this.field9950 > 0) {
                this.field9950 = 0;
            }
        }
        int var12 = 37 % ((arg3 + 39) / 53);
        this.field9955 += this.field9950 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V")
    public final void method3979(int arg0, byte arg1) {
        if (arg1 > 29) {
            field9953++;
            this.field9950 = 0;
            this.field9955 = arg0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)I")
    public final int method3980(int arg0) {
        if (arg0 == 2) {
            field9952++;
            return this.field9955 & 0x3FFF;
        } else {
            return 10;
        }
    }
}
