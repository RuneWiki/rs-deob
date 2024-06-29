import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class446 {

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lqk;")
    public static class148 field6092 = new class148(52, 0);

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Low;")
    public static class747 field6098 = new class747("", 18);

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lju;")
    public static class102 field6099 = new class102(58, 4);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    private int field6091;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public int field6095;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public final void method2656(byte arg0) {
        field6094++;
        this.field6095 &= 0x3FFF;
        if (arg0 != 47) {
            this.method2657(5, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V")
    public final void method2657(int arg0, byte arg1) {
        field6097++;
        this.field6091 = 0;
        this.field6095 = arg0;
        if (arg1 != -79) {
            method2659(111);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)Z")
    public final boolean method2658(int arg0, int arg1, int arg2, int arg3) {
        field6089++;
        int var5 = this.field6091;
        if (this.field6095 == arg2 && this.field6091 == 0) {
            return false;
        }
        if (arg1 != -1) {
            this.method2657(79, (byte) 101);
        }
        boolean var8;
        if (this.field6091 == 0) {
            if (this.field6095 < arg2 && this.field6095 + arg3 >= arg2 || arg2 < this.field6095 && arg2 >= this.field6095 - arg3) {
                this.field6095 = arg2;
                return false;
            }
            var8 = true;
        } else if (this.field6091 > 0 && this.field6095 < arg2) {
            int var6 = this.field6091 * this.field6091 / (arg3 * 2);
            int var7 = this.field6095 + var6;
            if (var7 < arg2 && this.field6095 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field6091 < 0 && arg2 < this.field6095) {
            int var9 = this.field6091 * this.field6091 / (arg3 * 2);
            int var10 = this.field6095 - var9;
            if (var10 > arg2 && this.field6095 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg2 > this.field6095) {
                this.field6091 += arg3;
                if (arg0 != 0 && arg0 < this.field6091) {
                    this.field6091 = arg0;
                }
            } else {
                this.field6091 -= arg3;
                if (arg0 != 0 && (-arg0) > this.field6091) {
                    this.field6091 = -arg0;
                }
            }
            if (this.field6091 != var5) {
                int var11 = this.field6091 * this.field6091 / (arg3 * 2);
                if (this.field6095 < arg2) {
                    if (this.field6095 + var11 > arg2) {
                        this.field6091 = var5;
                    }
                } else if (arg2 < this.field6095 && arg2 > this.field6095 - var11) {
                    this.field6091 = var5;
                }
            }
        } else if (this.field6091 > 0) {
            this.field6091 -= arg3;
            if (this.field6091 < 0) {
                this.field6091 = 0;
            }
        } else {
            this.field6091 += arg3;
            if (this.field6091 > 0) {
                this.field6091 = 0;
            }
        }
        this.field6095 += this.field6091 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static final void method2659(int arg0) {
        field6096++;
        class590.field8471 = null;
        class701.field9767 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public static void method2660(int arg0) {
        if (arg0 == 0) {
            field6099 = null;
            field6092 = null;
            field6098 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)I")
    public final int method2661(int arg0) {
        int var2 = 83 / ((72 - arg0) / 46);
        field6093++;
        return this.field6095 & 0x3FFF;
    }
}
