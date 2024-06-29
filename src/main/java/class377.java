import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class377 {

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lpj;")
    public static class79 field5375 = new class79(64);

    @OriginalMember(owner = "client!am", name = "i", descriptor = "Lng;")
    public static class190 field5379 = new class190(16);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    private int field5371;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public int field5373;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V", line = 5)
    public final void method2461(int arg0, byte arg1) {
        this.field5373 = arg0;
        field5378++;
        int var3 = -70 % ((arg1 - 17) / 34);
        this.field5371 = 0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 16)
    public final void method2462(int arg0) {
        this.field5373 &= 0x3FFF;
        int var2 = 25 / ((-arg0 - 21) / 42);
        field5372++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lod;I)V", line = 26)
    public static final void method2463(class293 arg0, int arg1) {
        class81.field1249 = arg0;
        field5381++;
        if (arg1 != 2) {
            method2466(38);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)I", line = 41)
    public final int method2464(int arg0) {
        field5377++;
        int var2 = 45 / ((71 - arg0) / 46);
        return this.field5373 & 0x3FFF;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 52)
    public static final void method2465(byte arg0) {
        field5374++;
        if (arg0 != 22) {
            method2463((class293) null, -112);
        }
        class190 var1 = class26.field422;
        synchronized (class26.field422) {
            class26.field422.method1243(arg0 ^ 0x3FE);
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V", line = 65)
    public static void method2466(int arg0) {
        field5379 = null;
        field5375 = null;
        if (arg0 > -82) {
            field5379 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)Z", line = 83)
    public final boolean method2467(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 5 / ((arg1 + 19) / 50);
        field5376++;
        int var6 = this.field5371;
        if (this.field5373 == arg2 && this.field5371 == 0) {
            return false;
        }
        boolean var9;
        if (this.field5371 == 0) {
            if (this.field5373 < arg2 && (this.field5373 + arg3) >= arg2 || this.field5373 > arg2 && arg2 >= (this.field5373 - arg3)) {
                this.field5373 = arg2;
                return false;
            }
            var9 = true;
        } else if (this.field5371 > 0 && this.field5373 < arg2) {
            int var7 = this.field5371 * this.field5371 / (arg3 * 2);
            int var8 = this.field5373 + var7;
            if (var8 < arg2 && this.field5373 <= var8) {
                var9 = true;
            } else {
                var9 = false;
            }
        } else if (this.field5371 < 0 && arg2 < this.field5373) {
            int var10 = this.field5371 * this.field5371 / (arg3 * 2);
            int var11 = this.field5373 - var10;
            if (arg2 < var11 && this.field5373 >= var11) {
                var9 = true;
            } else {
                var9 = false;
            }
        } else {
            var9 = false;
        }
        if (var9) {
            if (arg2 <= this.field5373) {
                this.field5371 -= arg3;
                if (arg0 != 0 && (-arg0) > this.field5371) {
                    this.field5371 = -arg0;
                }
            } else {
                this.field5371 += arg3;
                if (arg0 != 0 && this.field5371 > arg0) {
                    this.field5371 = arg0;
                }
            }
            if (this.field5371 != var6) {
                int var12 = this.field5371 * this.field5371 / (arg3 * 2);
                if (this.field5373 >= arg2) {
                    if (this.field5373 > arg2 && arg2 > this.field5373 - var12) {
                        this.field5371 = var6;
                    }
                } else if ((this.field5373 + var12) > arg2) {
                    this.field5371 = var6;
                }
            }
        } else if (this.field5371 <= 0) {
            this.field5371 += arg3;
            if (this.field5371 > 0) {
                this.field5371 = 0;
            }
        } else {
            this.field5371 -= arg3;
            if (this.field5371 < 0) {
                this.field5371 = 0;
            }
        }
        this.field5373 += this.field5371 + var6 >> 1;
        return var9;
    }
}
