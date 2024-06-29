import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class241 extends class197 {

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "Z")
    public boolean field3867 = false;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    private int field3865 = -1;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    private int field3872 = 0;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    private int field3866 = -32768;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    private int field3880 = 0;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public int field3871;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    private int field3860;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public int field3861;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "Lni;")
    private class21 field3877;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "[I")
    public static int[] field3870 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "[I")
    public static int[] field3873 = new int[128];

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Lqc;")
    private class4 field3859;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Lue;")
    private final class13 method1586(int arg0) {
        int var2 = 4 / ((27 - arg0) / 34);
        class66 var3 = class271.method1826(this.field3860, (byte) 102);
        field3875++;
        class13 var4;
        if (this.field3867) {
            var4 = var3.method526(-1, 0, false, -1);
        } else {
            var4 = var3.method526(this.field3872, this.field3880, false, this.field3865);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
    public static void method1587(int arg0) {
        field3870 = null;
        field3873 = null;
        if (arg0 >= -100) {
            method1587(-18);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()I")
    public final int method88() {
        field3878++;
        return this.field3866;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
    public static final void method1588(int arg0) {
        field3863++;
        int var1 = class105.field1825;
        int var2 = class18.field213;
        int var3 = class207.field3337 - class107.field1856 - var1;
        int var4 = -60 % ((54 - arg0) / 32);
        int var5 = class7.field107 - class97.field1469 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var5 <= 0) {
            return;
        }
        try {
            Container var6;
            if (class87.field1188 != null) {
                var6 = class87.field1188;
            } else if (class284.field4537 == null) {
                var6 = class250.field4006.field4090;
            } else {
                var6 = class284.field4537;
            }
            int var7 = 0;
            int var8 = 0;
            if (class284.field4537 == var6) {
                Insets var9 = class284.field4537.getInsets();
                var7 = var9.left;
                var8 = var9.top;
            }
            Graphics var10 = var6.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
                var10.fillRect(var7, var8, var1, class7.field107);
            }
            if (var2 > 0) {
                var10.fillRect(var7, var8, class207.field3337, var2);
            }
            if (var3 > 0) {
                var10.fillRect(class207.field3337 + var7 - var3, var8, var3, class7.field107);
            }
            if (var5 > 0) {
                var10.fillRect(var7, var8 + class7.field107 - var5, class207.field3337, var5);
                return;
            }
        } catch (Exception var11) {
            return;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method1589(boolean arg0, int arg1, String arg2) {
        if (arg0) {
            field3862++;
            class283 var3 = class46.method360(2, -118, arg1);
            var3.method1893(0);
            var3.field4510 = arg2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V")
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3864++;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)V")
    public final void method1590(int arg0, int arg1) {
        field3869++;
        if (this.field3867) {
            return;
        }
        this.field3880 += arg1;
        while (this.field3877.field240[this.field3872] < this.field3880) {
            this.field3880 -= this.field3877.field240[this.field3872];
            this.field3872++;
            if (this.field3872 >= this.field3877.field237.length) {
                this.field3867 = true;
                break;
            }
        }
        if (arg0 < -39 && !this.field3867) {
            class150.method1022(this.field3877, (byte) -119, this.field3872, this.field3868, false, this.field3861);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIIJILqc;)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class4 arg10) {
        field3858++;
        class13 var13 = this.method1586(-125);
        if (var13 != null) {
            var13.method85(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3859);
            this.field3866 = var13.method88();
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIII)V")
    public class241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3871 = arg4;
        this.field3874 = arg5 + arg6;
        this.field3868 = arg3;
        this.field3876 = arg1;
        this.field3860 = arg0;
        this.field3861 = arg2;
        int var8 = class271.method1826(this.field3860, (byte) 98).field929;
        if (var8 == -1) {
            this.field3867 = true;
        } else {
            this.field3867 = false;
            this.field3877 = class267.method1812((byte) 89, var8);
        }
        if (this.field3874 == arg6) {
            class150.method1022(this.field3877, (byte) 126, this.field3872, this.field3868, false, this.field3861);
        }
    }
}
