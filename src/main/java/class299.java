import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class299 {

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field4097 = 0;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Lhi;")
    public static class45 field4100 = new class45(12, 3);

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "Lhi;")
    public static class45 field4101 = new class45(17, 3);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    private int field4096;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public int field4099;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BIII)Z", line = 3)
    public final boolean method1741(byte arg0, int arg1, int arg2, int arg3) {
        field4093++;
        int var5 = this.field4096;
        if (this.field4099 == arg2 && this.field4096 == 0) {
            return false;
        }
        boolean var6;
        if (this.field4096 == 0) {
            if (this.field4099 < arg2 && (this.field4099 + arg3) >= arg2 || this.field4099 > arg2 && (this.field4099 - arg3) <= arg2) {
                this.field4099 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field4096 > 0 && this.field4099 < arg2) {
            int var7 = this.field4096 * this.field4096 / (arg3 * 2);
            int var8 = this.field4099 + var7;
            if (arg2 > var8 && this.field4099 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field4096 < 0 && arg2 < this.field4099) {
            int var9 = this.field4096 * this.field4096 / (arg3 * 2);
            int var10 = this.field4099 - var9;
            if (var10 > arg2 && this.field4099 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field4099 >= arg2) {
                this.field4096 -= arg3;
                if (arg1 != 0 && this.field4096 < (-arg1)) {
                    this.field4096 = -arg1;
                }
            } else {
                this.field4096 += arg3;
                if (arg1 != 0 && arg1 < this.field4096) {
                    this.field4096 = arg1;
                }
            }
            if (this.field4096 != var5) {
                int var11 = this.field4096 * this.field4096 / (arg3 * 2);
                if (this.field4099 >= arg2) {
                    if (this.field4099 > arg2 && this.field4099 - var11 < arg2) {
                        this.field4096 = var5;
                    }
                } else if (arg2 < (this.field4099 + var11)) {
                    this.field4096 = var5;
                }
            }
        } else if (this.field4096 > 0) {
            this.field4096 -= arg3;
            if (this.field4096 < 0) {
                this.field4096 = 0;
            }
        } else {
            this.field4096 += arg3;
            if (this.field4096 > 0) {
                this.field4096 = 0;
            }
        }
        this.field4099 += this.field4096 + var5 >> 1;
        if (arg0 < 40) {
            this.method1745(-14, -59);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 144)
    public final void method1742(int arg0) {
        field4091++;
        this.field4099 &= arg0;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 159)
    public static void method1743(int arg0) {
        field4100 = null;
        if (arg0 != -866) {
            field4101 = null;
        }
        field4101 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)I", line = 173)
    public final int method1744(boolean arg0) {
        if (arg0) {
            this.method1744(true);
        }
        field4095++;
        return this.field4099 & 0x3FFF;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V", line = 184)
    public final void method1745(int arg0, int arg1) {
        if (arg0 < 20) {
            this.field4099 = 127;
        }
        field4098++;
        this.field4096 = 0;
        this.field4099 = arg1;
    }
}
