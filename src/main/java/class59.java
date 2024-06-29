import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class59 extends class325 {

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    private int field820 = -1;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "Ltja;")
    public static class288 field815 = new class288(0, 16);

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "Lhv;")
    public static class546 field818 = new class546(6, 1);

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    private int field809;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "Z")
    public static boolean field807;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "[I")
    private int[] field810;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZIIIII)V", line = 5)
    public static final void method413(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1) {
            field815 = null;
        }
        if (~class174.field2335 >= ~(-arg2 + arg0) && arg0 + arg2 <= class751.field10402 && ~class523.field7178 >= ~(-arg2 + arg3) && class495.field6845 >= arg2 + arg3) {
            class403.method2511(arg2, arg5, 0, arg3, arg4, arg0, arg6);
        } else {
            class254.method1694(arg3, arg6, (byte) 114, arg2, arg5, arg4, arg0);
        }
        ++field817;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V", line = 23)
    public final void method414(int arg0, int arg1, int arg2) {
        super.method414(arg0, arg1, arg2);
        ++field808;
        if (~this.field820 <= -1 && class2.field5 != null) {
            int var4 = class2.field5.method1174(this.field820, true).field9143 ? 64 : 128;
            this.field810 = class2.field5.method1177(var4, false, var4, 1.0F, this.field820, (byte) -104);
            this.field809 = var4;
            this.field814 = var4;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)V", line = 41)
    public static final void method415(boolean arg0) {
        ++field816;
        if (class632.field8832 == null) {
            int var1 = class719.field10029;
            int var2 = class239.field3220;
            if (!arg0) {
                field818 = null;
            }
            int var3 = -class593.field8019 + class482.field6666 - var1;
            int var4 = -class140.field2048 + class655.field9076 + -var2;
            if (var1 > 0 || ~var3 < -1 || var2 > 0 || ~var4 < -1) {
                try {
                    Container var5;
                    if (class388.field5642 == null) {
                        if (class735.field10183 != null) {
                            var5 = class735.field10183;
                        } else {
                            var5 = class189.field2512;
                        }
                    } else {
                        var5 = class388.field5642;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    if (class388.field5642 == var5) {
                        Insets var8 = class388.field5642.getInsets();
                        var7 = var8.top;
                        var6 = var8.left;
                    }
                    Graphics var9 = var5.getGraphics();
                    var9.setColor(Color.black);
                    if (var1 > 0) {
                        var9.fillRect(var6, var7, var1, class655.field9076);
                    }
                    if (var2 > 0) {
                        var9.fillRect(var6, var7, class482.field6666, var2);
                    }
                    if (~var3 < -1) {
                        var9.fillRect(class482.field6666 + var6 + -var3, var7, var3, class655.field9076);
                    }
                    if (var4 > 0) {
                        var9.fillRect(var6, class655.field9076 + var7 - var4, class482.field6666, var4);
                        return;
                    }
                } catch (Exception var10) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V", line = 115)
    public class59() {
        super(0, false);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljp;IB)V", line = 120)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg2 >= -41) {
            method413(60, true, -109, 95, 89, 83, 30);
        }
        if (arg1 == 0) {
            this.field820 = arg0.method2359(-1);
        }
        ++field812;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)I", line = 134)
    public final int method416(byte arg0) {
        if (arg0 >= -74) {
            this.method414(-82, -1, -90);
        }
        ++field811;
        return this.field820;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[[I", line = 145)
    public final int[][] method360(int arg0, byte arg1) {
        if (arg1 != -9) {
            this.method416((byte) 64);
        }
        ++field806;
        int[][] var3 = super.field4733.method1251((byte) 106, arg0);
        if (super.field4733.field2369) {
            int var4 = (class657.field9077 == this.field809 ? arg0 : this.field809 * arg0 / class657.field9077) * this.field814;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class261.field3874 == ~this.field814) {
                for (int var8 = 0; var8 < class261.field3874; ++var8) {
                    int var9 = this.field810[var4++];
                    var7[var8] = class440.method2643(var9 << 4, 4080);
                    var6[var8] = class440.method2643(65280, var9) >> 4;
                    var5[var8] = class440.method2643(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~class261.field3874 < ~var10; ++var10) {
                    int var11 = this.field814 * var10 / class261.field3874;
                    int var12 = this.field810[var4 + var11];
                    var7[var10] = class440.method2643(255, var12) << 4;
                    var6[var10] = class440.method2643(4080, var12 >> 4);
                    var5[var10] = class440.method2643(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 210)
    public final void method417(int arg0) {
        ++field819;
        super.method417(arg0);
        this.field810 = null;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(Z)V", line = 222)
    public static void method418(boolean arg0) {
        field818 = null;
        field815 = null;
        if (arg0) {
            method413(123, false, 55, -82, 81, 118, -127);
        }
    }
}
