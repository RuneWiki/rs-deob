import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class655 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Ldb;")
    public static class298 field8873 = new class298(76, 2);

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field8877 = 0;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lgt;")
    public static class425 field8876 = new class425();

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public int field8875;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    private int field8879;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)Z")
    public final boolean method3583(int arg0, int arg1, int arg2, int arg3) {
        field8870++;
        int var5 = this.field8879;
        if (this.field8875 == arg0 && this.field8879 == 0) {
            return false;
        }
        boolean var8;
        if (this.field8879 == arg2) {
            if (this.field8875 < arg0 && arg0 <= this.field8875 + arg3 || this.field8875 > arg0 && arg0 >= (this.field8875 - arg3)) {
                this.field8875 = arg0;
                return false;
            }
            var8 = true;
        } else if (this.field8879 > 0 && this.field8875 < arg0) {
            int var6 = this.field8879 * this.field8879 / (arg3 * 2);
            int var7 = this.field8875 + var6;
            if (var7 < arg0 && var7 >= this.field8875) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field8879 < 0 && this.field8875 > arg0) {
            int var9 = this.field8879 * this.field8879 / (arg3 * 2);
            int var10 = this.field8875 - var9;
            if (arg0 < var10 && var10 <= this.field8875) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg0 <= this.field8875) {
                this.field8879 -= arg3;
                if (arg1 != 0 && this.field8879 < (-arg1)) {
                    this.field8879 = -arg1;
                }
            } else {
                this.field8879 += arg3;
                if (arg1 != 0 && this.field8879 > arg1) {
                    this.field8879 = arg1;
                }
            }
            if (this.field8879 != var5) {
                int var11 = this.field8879 * this.field8879 / (arg3 * 2);
                if (arg0 <= this.field8875) {
                    if (arg0 < this.field8875 && arg0 > this.field8875 - var11) {
                        this.field8879 = var5;
                    }
                } else if (arg0 < (this.field8875 + var11)) {
                    this.field8879 = var5;
                }
            }
        } else if (this.field8879 > 0) {
            this.field8879 -= arg3;
            if (this.field8879 < 0) {
                this.field8879 = 0;
            }
        } else {
            this.field8879 += arg3;
            if (this.field8879 > 0) {
                this.field8879 = 0;
            }
        }
        this.field8875 += this.field8879 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public final void method3584(byte arg0) {
        this.field8875 &= 0x3FFF;
        field8878++;
        if (arg0 >= -107) {
            field8876 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
    public final int method3585(int arg0) {
        field8872++;
        return arg0 <= 99 ? 10 : this.field8875 & 0x3FFF;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    public final void method3586(int arg0, int arg1) {
        if (arg1 != 2) {
            field8871 = -54;
        }
        this.field8875 = arg0;
        this.field8879 = 0;
        field8874++;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static void method3587(int arg0) {
        field8876 = null;
        if (arg0 != 13964) {
            method3587(-98);
        }
        field8873 = null;
    }
}
