import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class282 extends class424 {

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "Z")
    private boolean field3783 = false;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    private int field3784 = 0;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    private int field3809 = 0;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    private int field3810 = 0;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    private int field3805 = 0;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    private int field3788;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "Lsv;")
    private class312 field3789;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    private int field3807;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "Lsd;")
    private class595 field3812;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "Z")
    private boolean field3797;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "Z")
    private boolean field3794;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "Z")
    private boolean field3800;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "Z")
    private boolean field3811;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Llp;")
    public static class270 field3785 = new class270(10, 2, 2, 0);

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "Lek;")
    public static class540 field3781;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V", line = 3)
    public static final void method1694(String arg0, byte arg1, Throwable arg2) {
        field3801++;
        try {
            if (arg1 == 47) {
                String var3 = "";
                if (arg2 != null) {
                    var3 = class253.method1583(0, arg2);
                }
                if (arg0 != null) {
                    if (arg2 != null) {
                        var3 = var3 + " | ";
                    }
                    var3 = var3 + arg0;
                }
                class208.method1302(16, var3);
                String var4 = class453.method2575(":", "%3a", var3, (byte) -21);
                String var5 = class453.method2575("@", "%40", var4, (byte) -21);
                String var6 = class453.method2575("&", "%26", var5, (byte) -21);
                String var7 = class453.method2575("#", "%23", var6, (byte) -21);
                if (class157.field1974 != null) {
                    class280 var8 = class340.field4968.method613((byte) 110, new URL(class157.field1974.getCodeBase(), "clienterror.ws?c=" + class523.field7245 + "&u=" + class620.field8422 + "&v1=" + class112.field1345 + "&v2=" + class112.field1363 + "&e=" + var7));
                    while (var8.field3773 == 0) {
                        class660.method3668(arg1 ^ 0xFFFFFFD0, 1L);
                    }
                    if (var8.field3773 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field3772;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!gr", name = "GA", descriptor = "(IIIIII)V", line = 54)
    public final void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3787++;
        int[] var7 = this.field3789.method797(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class288.method1722(var7[var8], -16777216);
            }
            this.method1698(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIB)V", line = 76)
    public static final void method1695(int arg0, int arg1, int arg2, byte arg3) {
        field3803++;
        String var4 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        if (arg3 == 48) {
            class401.method2363(true, var4, -72, false);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILfa;II)V", line = 93)
    public final void method63(int arg0, int arg1, class185 arg2, int arg3, int arg4) {
        field3786++;
        class305 var6 = (class305) arg2;
        int var7 = this.field3809 + arg1;
        int var8 = this.field3805 + arg0;
        class595 var9 = var6.field4100;
        this.field3812.method172(class428.field5951, (byte) 88);
        this.field3789.method1925(70);
        this.field3789.method1884(this.field3812, -2);
        this.field3789.method1881(126, 1);
        this.field3789.method1995(1, 1);
        class492 var10 = this.field3789.method2004((byte) -47);
        var10.method2772((float) this.field3788, 0.0F, (byte) 123, (float) this.field3807);
        var10.method595(var8, var7, 0);
        this.field3789.method1959(false);
        class492 var11 = this.field3789.method1993((byte) -26);
        var11.method2772(this.field3812.method170((float) this.field3788, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) this.field3807));
        this.field3789.method1896(class248.field3341, (byte) -6);
        this.field3789.method1969(1, -26328);
        this.field3789.method1884(var9, -2);
        this.field3789.method1917(false, class594.field8145, class66.field868);
        this.field3789.method1997(class668.field9495, 0, -123);
        class492 var12 = this.field3789.method1993((byte) -26);
        var12.method2772(var9.method170((float) this.field3788, -17968), 1.0F, (byte) 123, var9.method168(31688, (float) this.field3807));
        var12.method2776(var9.method168(31688, (float) (var8 - arg3)), -65, var9.method170((float) (var7 - arg4), -17968), 0.0F);
        this.field3789.method1896(class248.field3341, (byte) -6);
        this.field3789.method2021(2);
        this.field3789.method1928(-9396);
        this.field3789.method1997(class322.field4722, 0, -60);
        this.field3789.method1917(false, class594.field8145, class594.field8145);
        this.field3789.method1884(null, -2);
        this.field3789.method1969(0, -26328);
        this.field3789.method1928(-9396);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Loa;B)V", line = 136)
    public static final void method1696(class689 arg0, byte arg1) {
        class426.field5926 = class517.method2939(true, arg0, class213.field2765, (byte) 40);
        field3808++;
        class641.field8904 = class124.method762(arg0, class213.field2765, true);
        class395.field5658 = class517.method2939(true, arg0, class627.field8529, (byte) 40);
        if (arg1 <= 42) {
            method1699(-59);
        }
        class278.field3769 = class124.method762(arg0, class627.field8529, true);
        class622.field8452 = class517.method2939(true, arg0, class290.field3886, (byte) 40);
        class446.field6129 = class124.method762(arg0, class290.field3886, true);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "()I", line = 153)
    public final int method1157() {
        field3804++;
        return this.field3788 + this.field3810 + this.field3809;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lfca;I)V", line = 165)
    public static final void method1697(class188 arg0, int arg1) {
        field3780++;
        if (!class613.field8378) {
            return;
        }
        class75.field950++;
        if (arg0.field2312 != null) {
            class188 var2 = class630.method3443(class68.field898, arg1 - 30805, class59.field828);
            if (var2 != null) {
                class425 var3 = new class425();
                var3.field5911 = arg0;
                var3.field5916 = var2;
                var3.field5913 = arg0.field2312;
                class317.method2051(var3);
            }
        }
        class389.method2326((byte) 118, class501.field6768);
        class253.field3491.method906(-1, arg0.field2387);
        if (arg1 != 30804) {
            return;
        }
        class253.field3491.method896(1464076016, class59.field828);
        class253.field3491.method927(arg0.field2324, arg1 ^ 0x78AB);
        class253.field3491.method913(arg0.field2361, 58);
        class253.field3491.method896(arg1 ^ 0x57447EA4, class443.field6115);
        class253.field3491.method917((byte) 28, class68.field898);
    }

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "(IIIII)V", line = 204)
    public final void method67(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3795++;
        class492 var6 = this.field3789.method2004((byte) -45);
        class492 var7 = this.field3789.method1993((byte) -26);
        int var8 = this.field3805 + arg0;
        int var9 = this.field3809 + arg1;
        this.field3812.method172(class428.field5951, (byte) -121);
        this.field3789.method1925(-106);
        this.field3789.method1884(this.field3812, -2);
        this.field3789.method1881(126, arg4);
        this.field3789.method1995(arg2, 1);
        this.field3789.method1997(class577.field7974, 1, -96);
        this.field3789.method1914(class577.field7974, 1, (byte) 115);
        this.field3789.method1883(arg3, (byte) 87);
        var6.method2772((float) this.field3788, 0.0F, (byte) 123, (float) this.field3807);
        var6.method595(var8, var9, 0);
        var7.method2772(this.field3812.method170((float) this.field3788, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) this.field3807));
        this.field3789.method1896(class248.field3341, (byte) -6);
        this.field3789.method1959(false);
        this.field3789.method2021(2);
        this.field3789.method1928(-9396);
        this.field3789.method1997(class668.field9495, 1, -82);
        this.field3789.method1914(class668.field9495, 1, (byte) 115);
    }

    @OriginalMember(owner = "client!gr", name = "KA", descriptor = "(IIIIIII)V", line = 236)
    public final void method65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3802++;
        class492 var8 = this.field3789.method2004((byte) -102);
        class492 var9 = this.field3789.method1993((byte) -26);
        this.field3812.method172(this.field3797 || this.field3794 ? class428.field5951 : class627.field8525, (byte) 76);
        this.field3789.method1925(91);
        this.field3789.method1884(this.field3812, -2);
        this.field3789.method1881(127, arg6);
        this.field3789.method1995(arg4, 1);
        this.field3789.method1997(class577.field7974, 1, -61);
        this.field3789.method1914(class577.field7974, 1, (byte) 115);
        this.field3789.method1883(arg5, (byte) 115);
        var9.method2772(this.field3812.method170((float) this.field3788, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) this.field3807));
        if (this.field3783) {
            arg2 = this.field3807 * arg2 / this.method1160();
            arg3 = this.field3788 * arg3 / this.method1157();
            arg0 += this.field3805 * arg2 / this.field3807;
            arg1 += this.field3809 * arg3 / this.field3788;
        }
        var8.method2772((float) arg3, 0.0F, (byte) 123, (float) arg2);
        var8.method595(arg0, arg1, 0);
        this.field3789.method1896(class248.field3341, (byte) -6);
        this.field3789.method1959(false);
        this.field3789.method2021(2);
        this.field3789.method1928(-9396);
        this.field3789.method1997(class668.field9495, 1, -71);
        this.field3789.method1914(class668.field9495, 1, (byte) 115);
    }

    @OriginalMember(owner = "client!gr", name = "AA", descriptor = "()I", line = 273)
    public final int method1160() {
        field3782++;
        return this.field3807 + this.field3784 + this.field3805;
    }

    @OriginalMember(owner = "client!gr", name = "EA", descriptor = "(IIII)V", line = 282)
    public final void method1155(int arg0, int arg1, int arg2, int arg3) {
        this.field3784 = arg2;
        this.field3809 = arg1;
        this.field3810 = arg3;
        this.field3805 = arg0;
        field3799++;
        this.field3783 = this.field3805 != 0 || this.field3809 != 0 || this.field3784 != 0 || this.field3810 != 0;
    }

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "(III)V", line = 295)
    public final void method66(int arg0, int arg1, int arg2) {
        field3791++;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIII[III)V", line = 309)
    private final void method1698(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field3792++;
        this.field3812.method171(arg5, 27729, arg6, arg1, arg4, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 317)
    public final void method1156(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class185 arg6, int arg7, int arg8) {
        field3790++;
        class492 var10 = this.field3789.method2004((byte) -116);
        class492 var11 = this.field3789.method1993((byte) -26);
        class305 var12 = (class305) arg6;
        class595 var13 = var12.field4100;
        this.field3812.method172(class627.field8525, (byte) -81);
        this.field3789.method1925(26);
        this.field3789.method1884(this.field3812, -2);
        this.field3789.method1881(120, 1);
        this.field3789.method1995(1, 1);
        if (this.field3783) {
            float var14 = (float) this.field3807 / (float) this.method1160();
            float var15 = (float) this.field3788 / (float) this.method1157();
            var10.method2771((arg5 - arg1) * var15, (arg4 - arg0) * var15, (arg2 - arg0) * var14, 0.0F, 0.0F, (byte) -122, 0.0F, 1.0F, 0.0F, (arg3 - arg1) * var14);
            var10.method2776(((float) this.field3805 + arg0) * var14, -96, ((float) this.field3809 + arg1) * var15, 0.0F);
        } else {
            var10.method2771(arg5 - arg1, arg4 - arg0, arg2 - arg0, 0.0F, 0.0F, (byte) 18, 0.0F, 1.0F, 0.0F, arg3 - arg1);
            var10.method2776(arg0, -78, arg1, 0.0F);
        }
        var11.method2772(this.field3812.method170((float) this.field3788, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) this.field3807));
        this.field3789.method1896(class248.field3341, (byte) -6);
        this.field3789.method1969(1, -26328);
        this.field3789.method1884(var13, -2);
        this.field3789.method1917(false, class594.field8145, class66.field868);
        this.field3789.method1997(class668.field9495, 0, -98);
        class492 var16 = this.field3789.method1993((byte) -26);
        var16.method597(var10);
        var16.method595(-arg7, -arg8, 0);
        var16.method2781(var13.method170(1.0F, -17968), 1.0F, (byte) 73, var13.method168(31688, 1.0F));
        this.field3789.method1896(class248.field3341, (byte) -6);
        this.field3789.method1959(false);
        this.field3789.method2021(2);
        this.field3789.method1928(-9396);
        this.field3789.method1997(class322.field4722, 0, -84);
        this.field3789.method1917(false, class594.field8145, class594.field8145);
        this.field3789.method1884(null, -2);
        this.field3789.method1969(0, -26328);
        this.field3789.method1928(-9396);
    }

    @OriginalMember(owner = "client!gr", name = "QA", descriptor = "()I", line = 372)
    public final int method1159() {
        field3798++;
        return this.field3807;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 381)
    public static void method1699(int arg0) {
        if (arg0 != 1) {
            field3781 = null;
        }
        field3785 = null;
        field3781 = null;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lsv;IIZ)V", line = 705)
    public class282(class312 arg0, int arg1, int arg2, boolean arg3) {
        this.field3788 = arg2;
        this.field3789 = arg0;
        this.field3807 = arg1;
        this.field3812 = arg0.method804(arg1, class680.field9664, 106, arg2, arg3 ? class420.field5862 : class426.field5922);
        this.field3797 = arg1 != this.field3812.method164(1994);
        this.field3794 = arg2 != this.field3812.method166(8281);
        this.field3800 = !this.field3797 && this.field3812.method167(30117);
        this.field3811 = !this.field3794 && this.field3812.method167(30117);
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lsv;II[III)V", line = 719)
    public class282(class312 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3789 = arg0;
        this.field3807 = arg1;
        this.field3788 = arg2;
        this.field3812 = arg0.method844(arg3, arg2, arg5, arg1, false, 0, arg4);
        this.field3797 = arg1 != this.field3812.method164(1994);
        this.field3794 = this.field3812.method166(8281) != arg2;
        this.field3800 = !this.field3797 && this.field3812.method167(30117);
        this.field3811 = !this.field3794 && this.field3812.method167(30117);
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "()I", line = 401)
    public final int method1154() {
        field3796++;
        return this.field3788;
    }

    @OriginalMember(owner = "client!gr", name = "sa", descriptor = "(FFFFFFIII)V", line = 427)
    public final void method1158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field3806++;
        class492 var10 = this.field3789.method2004((byte) -28);
        class492 var11 = this.field3789.method1993((byte) -26);
        this.field3812.method172(this.field3797 || this.field3794 ? class428.field5951 : class627.field8525, (byte) 85);
        this.field3789.method1925(30);
        this.field3789.method1884(this.field3812, -2);
        this.field3789.method1881(126, arg8);
        this.field3789.method1995(arg6, 1);
        this.field3789.method1997(class577.field7974, 1, -108);
        this.field3789.method1914(class577.field7974, 1, (byte) 115);
        this.field3789.method1883(arg7, (byte) 93);
        if (this.field3783) {
            float var12 = (float) this.method1160();
            float var13 = (float) this.method1157();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field3809 * var16;
            float var19 = (float) this.field3809 * var17;
            float var20 = (float) this.field3805 * var14;
            float var21 = (float) this.field3805 * var15;
            float var22 = (float) this.field3784 * -var14;
            float var23 = (float) this.field3784 * -var15;
            float var24 = (float) this.field3810 * -var16;
            arg4 = arg4 + var20 + var24;
            float var25 = (float) this.field3810 * -var17;
            arg2 = arg2 + var22 + var18;
            arg3 = arg3 + var23 + var19;
            arg1 = arg1 + var21 + var19;
            arg0 = arg0 + var20 + var18;
            arg5 = arg5 + var21 + var25;
        }
        var10.method2771(arg5 - arg1, -arg0 + arg4, arg2 - arg0, 0.0F, 0.0F, (byte) 46, 0.0F, 1.0F, 0.0F, arg3 - arg1);
        var10.method2776(arg0, -91, arg1, 0.0F);
        var11.method2772(this.field3812.method170((float) this.field3788, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) this.field3807));
        this.field3789.method1896(class248.field3341, (byte) -6);
        this.field3789.method1959(false);
        this.field3789.method2021(2);
        this.field3789.method1928(-9396);
        this.field3789.method1997(class668.field9495, 1, -70);
        this.field3789.method1914(class668.field9495, 1, (byte) 115);
    }

    @OriginalMember(owner = "client!gr", name = "ba", descriptor = "(IIIIIII)V", line = 498)
    public final void method1161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3793++;
        class492 var8 = this.field3789.method2004((byte) -47);
        class492 var9 = this.field3789.method1993((byte) -26);
        this.field3812.method172(class428.field5951, (byte) 63);
        this.field3789.method1925(-122);
        this.field3789.method1884(this.field3812, -2);
        this.field3789.method1881(120, arg6);
        this.field3789.method1995(arg4, 1);
        this.field3789.method1997(class577.field7974, 1, -106);
        this.field3789.method1914(class577.field7974, 1, (byte) 115);
        this.field3789.method1883(arg5, (byte) 98);
        boolean var10 = this.field3811 && this.field3809 == 0 && this.field3810 == 0;
        boolean var11 = this.field3800 && this.field3805 == 0 && this.field3784 == 0;
        if ((var10 & var11)) {
            var9.method2772(this.field3812.method170((float) arg3, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) arg2));
            var8.method2772((float) arg3, 0.0F, (byte) 123, (float) arg2);
            var8.method595(arg0, arg1, 0);
            this.field3789.method1896(class248.field3341, (byte) -6);
            this.field3789.method1959(false);
            this.field3789.method2021(2);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method1157();
            var9.method2772(this.field3812.method170((float) this.field3788, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) arg2));
            this.field3789.method1896(class248.field3341, (byte) -6);
            int var14 = arg1 + this.field3809;
            int var15 = this.field3788 + var14;
            while (var12 >= var15) {
                var8.method2772((float) this.field3788, 0.0F, (byte) 123, (float) arg2);
                var8.method595(arg0, var14, 0);
                this.field3789.method1959(false);
                var15 += var13;
                var14 += var13;
                this.field3789.method2021(2);
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method2772(this.field3812.method170((float) var16, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) arg2));
                this.field3789.method1896(class248.field3341, (byte) -6);
                var8.method2772((float) var16, 0.0F, (byte) 123, (float) arg2);
                var8.method595(arg0, var14, 0);
                this.field3789.method1959(false);
                this.field3789.method2021(2);
            }
        } else if (var10) {
            int var17 = arg0 + arg2;
            int var18 = this.method1160();
            var9.method2772(this.field3812.method170((float) arg3, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) this.field3807));
            this.field3789.method1896(class248.field3341, (byte) -6);
            int var19 = arg0 + this.field3805;
            for (int var20 = this.field3807 + var19; var20 <= var17; var20 += var18) {
                var8.method2772((float) arg3, 0.0F, (byte) 123, (float) this.field3807);
                var8.method595(var19, arg1, 0);
                this.field3789.method1959(false);
                var19 += var18;
                this.field3789.method2021(2);
            }
            if (var17 > var19) {
                int var21 = var17 - var19;
                var9.method2772(this.field3812.method170((float) arg3, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) var21));
                this.field3789.method1896(class248.field3341, (byte) -6);
                var8.method2772((float) arg3, 0.0F, (byte) 123, (float) var21);
                var8.method595(var19, arg1, 0);
                this.field3789.method1959(false);
                this.field3789.method2021(2);
            }
        } else {
            int var22 = arg1 + arg3;
            int var23 = arg0 + arg2;
            int var24 = this.method1160();
            int var25 = this.method1157();
            int var26 = arg1 + this.field3809;
            for (int var27 = var26 + this.field3788; var27 <= var22; var27 += var25) {
                var9.method2772(this.field3812.method170((float) this.field3788, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) this.field3807));
                this.field3789.method1896(class248.field3341, (byte) -6);
                int var32 = this.field3805 + arg0;
                int var33 = this.field3807 + var32;
                while (var23 >= var33) {
                    var8.method2772((float) this.field3788, 0.0F, (byte) 123, (float) this.field3807);
                    var8.method595(var32, var26, 0);
                    this.field3789.method1959(false);
                    var33 += var24;
                    var32 += var24;
                    this.field3789.method2021(2);
                }
                if (var23 > var32) {
                    int var34 = var23 - var32;
                    var9.method2772(this.field3812.method170((float) this.field3788, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) var34));
                    this.field3789.method1896(class248.field3341, (byte) -6);
                    var8.method2772((float) this.field3788, 0.0F, (byte) 123, (float) var34);
                    var8.method595(var32, var26, 0);
                    this.field3789.method1959(false);
                    this.field3789.method2021(2);
                }
                var26 += var25;
            }
            if (var26 < var22) {
                int var28 = var22 - var26;
                var9.method2772(this.field3812.method170((float) var28, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) this.field3807));
                this.field3789.method1896(class248.field3341, (byte) -6);
                int var29 = this.field3805 + arg0;
                for (int var30 = var29 + this.field3807; var30 <= var23; var30 += var24) {
                    var8.method2772((float) var28, 0.0F, (byte) 123, (float) this.field3807);
                    var8.method595(var29, var26, 0);
                    this.field3789.method1959(false);
                    var29 += var24;
                    this.field3789.method2021(2);
                }
                if (var29 < var23) {
                    int var31 = var23 - var29;
                    var9.method2772(this.field3812.method170((float) var28, -17968), 1.0F, (byte) 123, this.field3812.method168(31688, (float) var31));
                    this.field3789.method1896(class248.field3341, (byte) -6);
                    var8.method2772((float) var28, 0.0F, (byte) 123, (float) var31);
                    var8.method595(var29, var26, 0);
                    this.field3789.method1959(false);
                    this.field3789.method2021(2);
                }
            }
        }
        this.field3789.method1928(-9396);
        this.field3789.method1997(class668.field9495, 1, -72);
        this.field3789.method1914(class668.field9495, 1, (byte) 115);
    }
}
