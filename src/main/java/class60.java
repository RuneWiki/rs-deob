import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class60 extends class70 {

    @OriginalMember(owner = "client!ja", name = "Jb", descriptor = "Lbe;")
    private static class283 field820 = class153.method941(-4, "scroll:");

    @OriginalMember(owner = "client!ja", name = "Ob", descriptor = "Lbe;")
    public static class283 field825 = class153.method941(126, "Standort");

    @OriginalMember(owner = "client!ja", name = "Rb", descriptor = "Lbe;")
    public static class283 field828 = field820;

    @OriginalMember(owner = "client!ja", name = "Tb", descriptor = "I")
    public static int field830 = 128;

    @OriginalMember(owner = "client!ja", name = "Nb", descriptor = "Lbe;")
    public static class283 field824 = field820;

    @OriginalMember(owner = "client!ja", name = "Sb", descriptor = "Lbe;")
    private static class283 field829 = class153.method941(126, "Started 3d library");

    @OriginalMember(owner = "client!ja", name = "Mb", descriptor = "Lbe;")
    public static class283 field823 = field829;

    @OriginalMember(owner = "client!ja", name = "Kb", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ja", name = "Pb", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ja", name = "Ub", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ja", name = "Vb", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ja", name = "Wb", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ja", name = "Xb", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ja", name = "Lb", descriptor = "Lbm;")
    public class129 field822;

    @OriginalMember(owner = "client!ja", name = "Qb", descriptor = "Lof;")
    public static class225 field827;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIIIJ)V", line = 9)
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field831++;
        if (this.field822 == null) {
            return;
        }
        class157 var11 = this.field1192 != -1 && this.field1200 == 0 ? class132.method821(128, this.field1192) : null;
        class157 var12 = this.field1219 == -1 || this.field1219 == this.field1203 && var11 != null ? null : class132.method821(128, this.field1219);
        class289 var13 = this.field822.method802(var12, this.field1220, (byte) 121, var11, this.field1205);
        if (var13 == null) {
            return;
        }
        this.field1188 = var13.method40();
        class129 var14 = this.field822;
        if (var14.field2193 != null) {
            var14 = var14.method806((byte) -128);
        }
        if (class91.field1541 && var14.field2165) {
            class289 var15 = class169.method1069(this.field822.field2171, this.field1180, var12 == null ? var11 : var12, arg0, this.field1210, this.field822.field2143, 1, this.field1176, this.field822.field2144, this.field822.field2157, var13, this.field822.field2155, this.field1193, var12 == null ? this.field1220 : this.field1205);
            float var16 = class167.method1056();
            float var17 = class167.method1048();
            class167.method1041();
            class167.method1052(var16, var17 - 150.0F);
            var15.method41(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            class167.method1037();
            class167.method1052(var16, var17);
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field822.field2177 != 0 || this.field822.field2195 != 0) {
            short var21 = this.field822.field2177;
            int var22 = class139.field2309[arg0];
            short var23 = this.field822.field2195;
            int var24 = class139.field2316[arg0];
            int var25 = -var21 / 2;
            int var26 = -var23 / 2;
            int var27 = var24 * var26 - (var22 * var25) >> 16;
            int var28 = var22 * var26 + var24 * var25 >> 16;
            int var29 = class42.method254(class61.field850, this.field1210 + var27, this.field1193 + var28, -20341);
            int var30 = -var23 / 2;
            int var31 = var21 / 2;
            int var32 = var24 * var30 - (var22 * var31) >> 16;
            int var33 = var22 * var30 + (var24 * var31) >> 16;
            int var34 = -var21 / 2;
            int var35 = class42.method254(class61.field850, this.field1210 + var32, this.field1193 - -var33, -20341);
            int var36 = var23 / 2;
            int var37 = var22 * var36 + (var24 * var34) >> 16;
            int var38 = var24 * var36 - (var22 * var34) >> 16;
            int var39 = class42.method254(class61.field850, this.field1210 + var38, this.field1193 + var37, -20341);
            int var40 = var23 / 2;
            int var41 = var21 / 2;
            int var42 = var24 * var40 - var22 * var41 >> 16;
            int var43 = var22 * var40 + var24 * var41 >> 16;
            int var44 = class42.method254(class61.field850, this.field1210 + var42, this.field1193 - -var43, -20341);
            int var45 = var29 + var44;
            if (var45 > (var35 + var39)) {
                var45 = var35 + var39;
            }
            int var46 = var29 >= var35 ? var35 : var29;
            int var47 = var35 >= var44 ? var44 : var35;
            int var48 = var29 >= var39 ? var39 : var29;
            int var49 = var44 <= var39 ? var44 : var39;
            if (var23 != 0) {
                var18 = (int) (Math.atan2((double) (var46 - var49), (double) var23) * 325.95D) & 0x7FF;
                if (var18 != 0) {
                    var13.method1362(var18);
                }
            }
            if (var21 != 0) {
                var19 = (int) (Math.atan2((double) (var48 - var47), (double) var21) * 325.95D) & 0x7FF;
                if (var19 != 0) {
                    var13.method1331(var19);
                }
            }
            var20 = (var45 >> 1) - this.field1180;
            if (var20 != 0) {
                var13.method1325(0, var20, 0);
            }
        }
        class289 var50 = null;
        if (this.field1211 != -1 && this.field1206 != -1) {
            class169 var51 = class259.method1750((byte) 121, this.field1211);
            var50 = var51.method1074(this.field1206, 64);
            if (var50 != null) {
                var50.method1325(0, -this.field1175, 0);
                if (var51.field2839) {
                    if (var18 != 0) {
                        var50.method1362(var18);
                    }
                    if (var19 != 0) {
                        var50.method1331(var19);
                    }
                    if (var20 != 0) {
                        var50.method1325(0, var20, 0);
                    }
                }
            }
        }
        if (this.field822.field2157 == 1) {
            var13.field4906 = true;
        }
        var13.method41(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field822.field2157 == 1) {
                var50.field4906 = true;
            }
            var50.method41(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 198)
    public static void method393(int arg0) {
        field824 = null;
        if (arg0 != 2047) {
            return;
        }
        field823 = null;
        field828 = null;
        field829 = null;
        field820 = null;
        field827 = null;
        field825 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I", line = 223)
    public final int method40() {
        field826++;
        return this.field1188;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILbe;Lbe;B)V", line = 235)
    public static final void method394(int arg0, class283 arg1, class283 arg2, byte arg3) {
        class252.method1716(-1, arg0, (class283) null, 47, arg1, arg2);
        if (arg3 < 21) {
            field830 = -112;
        }
        field821++;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)Z", line = 260)
    public final boolean method395(boolean arg0) {
        if (!arg0) {
            method393(85);
        }
        field833++;
        return this.field822 != null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Frame;Lui;I)V", line = 279)
    public static final void method396(Frame arg0, class251 arg1, int arg2) {
        field834++;
        while (true) {
            class310 var3 = arg1.method1701(arg0, 1);
            while (var3.field5293 == 0) {
                class2.method11((byte) -20, 10L);
            }
            if (var3.field5293 == 1) {
                arg0.setVisible(false);
                if (arg2 != -29204) {
                    field820 = (class283) null;
                }
                arg0.dispose();
                return;
            }
            class2.method11((byte) -20, 100L);
        }
    }
}
