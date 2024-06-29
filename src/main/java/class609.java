import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class609 {

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field8519 = 2;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public int field8518;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    private int field8523;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "[I")
    public static int[] field8517;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public final void method3389(int arg0) {
        this.field8518 &= arg0;
        field8524++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Let;Z)V")
    public static final void method3390(class613 arg0, boolean arg1) {
        for (int var2 = arg0.field8635; var2 <= arg0.field8634; var2++) {
            for (int var3 = arg0.field8627; var3 <= arg0.field8630; var3++) {
                class499 var4 = class487.field7044[arg0.field5166][var2][var3];
                if (var4 != null) {
                    class245 var5 = var4.field7215;
                    class245 var6 = null;
                    while (var5 != null) {
                        if (var5.field3029 == arg0) {
                            if (var6 == null) {
                                var4.field7215 = var5.field3027;
                            } else {
                                var6.field3027 = var5.field3027;
                            }
                            var5.method1445(-1);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field3027;
                    }
                }
            }
        }
        if (!arg1) {
            class220.method1274(arg0);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I")
    public final int method3391(int arg0) {
        if (arg0 <= 88) {
            this.method3394(113, -74);
        }
        field8521++;
        return this.field8518 & 0x3FFF;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
    public static void method3392(int arg0) {
        field8517 = null;
        if (arg0 != 1784588801) {
            method3392(118);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)Z")
    public final boolean method3393(int arg0, int arg1, int arg2, int arg3) {
        field8516++;
        int var5 = this.field8523;
        if (this.field8518 == arg2 && this.field8523 == 0) {
            return false;
        }
        boolean var6;
        if (~this.field8523 == arg1) {
            if (arg2 > this.field8518 && this.field8518 + arg0 >= arg2 || this.field8518 > arg2 && arg2 >= this.field8518 - arg0) {
                this.field8518 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field8523 > 0 && arg2 > this.field8518) {
            int var7 = this.field8523 * this.field8523 / (arg0 * 2);
            int var8 = this.field8518 + var7;
            if (var8 < arg2 && var8 >= this.field8518) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field8523 < 0 && arg2 < this.field8518) {
            int var9 = this.field8523 * this.field8523 / (arg0 * 2);
            int var10 = this.field8518 - var9;
            if (var10 > arg2 && var10 <= this.field8518) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg2 <= this.field8518) {
                this.field8523 -= arg0;
                if (arg3 != 0 && this.field8523 < (-arg3)) {
                    this.field8523 = -arg3;
                }
            } else {
                this.field8523 += arg0;
                if (arg3 != 0 && this.field8523 > arg3) {
                    this.field8523 = arg3;
                }
            }
            if (this.field8523 != var5) {
                int var11 = this.field8523 * this.field8523 / (arg0 * 2);
                if (arg2 > this.field8518) {
                    if ((this.field8518 + var11) > arg2) {
                        this.field8523 = var5;
                    }
                } else if (this.field8518 > arg2 && this.field8518 - var11 < arg2) {
                    this.field8523 = var5;
                }
            }
        } else if (this.field8523 <= 0) {
            this.field8523 += arg0;
            if (this.field8523 > 0) {
                this.field8523 = 0;
            }
        } else {
            this.field8523 -= arg0;
            if (this.field8523 < 0) {
                this.field8523 = 0;
            }
        }
        this.field8518 += this.field8523 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
    public final void method3394(int arg0, int arg1) {
        this.field8523 = 0;
        field8522++;
        if (arg0 == 21382) {
            this.field8518 = arg1;
        }
    }
}
