import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class170 extends class194 {

    @OriginalMember(owner = "client!js", name = "I", descriptor = "I")
    private int field1984 = 4;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "I")
    private int field1985 = 4;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "Lcq;")
    public static class72 field1990 = new class72(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!js", name = "K", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!js", name = "P", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!js", name = "R", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!js", name = "S", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!js", name = "U", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!js", name = "V", descriptor = "J")
    public static long field1997;

    @OriginalMember(owner = "client!js", name = "T", descriptor = "Lwo;")
    public static class285 field1995;

    @OriginalMember(owner = "client!js", name = "Q", descriptor = "[Lc;")
    public static class436[] field1992;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field1984 = arg2.method1563(-128);
            }
        } else {
            this.field1985 = arg2.method1563(-128);
        }
        int var5 = 64 / ((arg1 - 52) / 61);
        ++field1993;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIII)V")
    public static final void method1080(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class295.field3937 >= ~(-arg4 + arg1) && class427.field5844 >= arg1 + arg4 && ~(-arg4 + arg2) <= ~class53.field624 && ~class118.field1356 <= ~(arg2 + arg4)) {
            class55.method310(arg1, arg2, arg4, -1, arg3);
        } else {
            class41.method257(arg4, arg2, arg3, arg1, (byte) -122);
        }
        int var5 = 31 / ((arg0 - -70) / 44);
        ++field1986;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(Z)V")
    public static void method1081(boolean arg0) {
        field1992 = null;
        field1995 = null;
        field1990 = null;
        if (!arg0) {
            method1085((class285) null, -117, (class285) null, (class285) null);
        }
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(II)V")
    public static final void method1082(int arg0, int arg1) {
        ++field1989;
        class286.field3776 = arg0;
        class392.field5344.method2298(arg1);
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(II)V")
    public static final void method1083(int arg0, int arg1) {
        ++field1987;
        class225.field2845.method2286(arg1, (byte) 36);
        if (arg0 != 0) {
            method1082(48, 77);
        }
        class298.field3973.method2286(arg1, (byte) 36);
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(Z)V")
    public static final void method1084(boolean arg0) {
        class365 var1 = class383.field5247;
        synchronized (class383.field5247) {
            class383.field5247.method2298(0);
        }
        if (arg0) {
            field1990 = null;
        }
        ++field1994;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
    public class170() {
        super(1, false);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        int var3 = -42 % ((arg1 - 57) / 46);
        ++field1996;
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int var5 = class138.field1579 / this.field1985;
            int var6 = class250.field3286 / this.field1984;
            int[] var7;
            if (~var6 >= -1) {
                var7 = this.method1203(0, 124, 0);
            } else {
                int var8 = arg0 % var6;
                var7 = this.method1203(0, 98, class250.field3286 * var8 / var6);
            }
            for (int var9 = 0; ~var9 > ~class138.field1579; ++var9) {
                if (var5 <= 0) {
                    var4[var9] = var7[0];
                } else {
                    int var10 = var9 % var5;
                    var4[var9] = var7[class138.field1579 * var10 / var5];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field1988;
        int[][] var3 = super.field2283.method1667(arg1, -104);
        if (arg0 != -730) {
            this.field1984 = -121;
        }
        if (super.field2283.field3451) {
            int var4 = class138.field1579 / this.field1985;
            int var5 = class250.field3286 / this.field1984;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method1200(60, class250.field3286 * var6 / var5, 0);
            } else {
                var7 = this.method1200(60, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class138.field1579 > var14; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class138.field1579 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lwo;ILwo;Lwo;)V")
    public static final void method1085(class285 arg0, int arg1, class285 arg2, class285 arg3) {
        class184.field2138 = arg3;
        ++field1991;
        if (arg1 <= -81) {
            class367.method2317((byte) 93, arg0, arg2);
        }
    }
}
