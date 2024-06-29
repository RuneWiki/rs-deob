import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class273 {

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3963 = "";

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "Z")
    public static boolean field3964 = true;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "Z")
    public static boolean field3969 = false;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    private int field3966;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public int field3970;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field3967;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public final void method1845(int arg0) {
        field3965++;
        this.field3970 &= 0x3FFF;
        if (arg0 != -32596) {
            field3963 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIB)I")
    public static final int method1846(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3968++;
        int var5 = 65536 - class319.field4504[arg1 * 8192 / arg2] >> 1;
        if (arg4 != 121) {
            method1846(38, 59, -46, 119, (byte) -9);
        }
        return ((65536 - var5) * arg3 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIII)Z")
    public final boolean method1847(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 12 % ((arg3 - 6) / 41);
        field3962++;
        int var6 = this.field3966;
        if (this.field3970 == arg0 && this.field3966 == 0) {
            return false;
        }
        boolean var9;
        if (this.field3966 == 0) {
            if (arg0 > this.field3970 && (this.field3970 + arg1) >= arg0 || this.field3970 > arg0 && (this.field3970 - arg1) <= arg0) {
                this.field3970 = arg0;
                return false;
            }
            var9 = true;
        } else if (this.field3966 > 0 && this.field3970 < arg0) {
            int var7 = this.field3966 * this.field3966 / (arg1 * 2);
            int var8 = this.field3970 + var7;
            if (arg0 > var8 && var8 >= this.field3970) {
                var9 = true;
            } else {
                var9 = false;
            }
        } else if (this.field3966 < 0 && this.field3970 > arg0) {
            int var10 = this.field3966 * this.field3966 / (arg1 * 2);
            int var11 = this.field3970 - var10;
            if (arg0 < var11 && this.field3970 >= var11) {
                var9 = true;
            } else {
                var9 = false;
            }
        } else {
            var9 = false;
        }
        if (var9) {
            if (arg0 > this.field3970) {
                this.field3966 += arg1;
                if (arg2 != 0 && arg2 < this.field3966) {
                    this.field3966 = arg2;
                }
            } else {
                this.field3966 -= arg1;
                if (arg2 != 0 && this.field3966 < (-arg2)) {
                    this.field3966 = -arg2;
                }
            }
            if (this.field3966 != var6) {
                int var12 = this.field3966 * this.field3966 / (arg1 * 2);
                if (this.field3970 < arg0) {
                    if (this.field3970 + var12 > arg0) {
                        this.field3966 = var6;
                    }
                } else if (this.field3970 > arg0 && arg0 > (this.field3970 - var12)) {
                    this.field3966 = var6;
                }
            }
        } else if (this.field3966 <= 0) {
            this.field3966 += arg1;
            if (this.field3966 > 0) {
                this.field3966 = 0;
            }
        } else {
            this.field3966 -= arg1;
            if (this.field3966 < 0) {
                this.field3966 = 0;
            }
        }
        this.field3970 += this.field3966 + var6 >> 1;
        return var9;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public static void method1848(int arg0) {
        field3967 = null;
        if (arg0 == -1) {
            field3963 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)I")
    public final int method1849(int arg0) {
        if (arg0 != -10543) {
            field3963 = null;
        }
        field3959++;
        return this.field3970 & 0x3FFF;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
    public static final void method1850(byte arg0) {
        int var1 = 126 / ((arg0 - 73) / 50);
        field3961++;
        class225.field3249.method2109(-1);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)V")
    public final void method1851(int arg0, byte arg1) {
        if (arg1 >= -42) {
            this.field3966 = -8;
        }
        field3960++;
        this.field3970 = arg0;
        this.field3966 = 0;
    }
}
