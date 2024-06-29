import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class697 extends class88 {

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    private int field9593 = 0;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
    private int field9606 = 0;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    private int field9600 = 0;

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "I")
    private int field9614 = 0;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "Z")
    private boolean field9610 = false;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "Lsr;")
    private class251 field9608;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
    private int field9609;

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
    private int field9615;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "Ldh;")
    private class320 field9592;

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "Z")
    private boolean field9612;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "Z")
    private boolean field9603;

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "Z")
    private boolean field9618;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "Z")
    private boolean field9604;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
    public static int field9607 = 0;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field9594 = 13156520;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "F")
    public static float field9591;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field9596;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII)V", line = 3)
    public final void method655(int arg0, int arg1, int arg2, int arg3) {
        this.field9600 = arg1;
        this.field9593 = arg2;
        this.field9606 = arg0;
        this.field9614 = arg3;
        field9595++;
        this.field9610 = this.field9606 != 0 || this.field9600 != 0 || this.field9593 != 0 || this.field9614 != 0;
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "()I", line = 15)
    public final int method670() {
        field9598++;
        return this.field9615 + this.field9614 + this.field9600;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII[III)V", line = 27)
    private final void method3922(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field9616++;
        this.field9592.method1320(arg3, arg6, arg4, arg0, true, arg5, arg2, arg1);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILaa;II)V", line = 38)
    public final void method660(int arg0, int arg1, class486 arg2, int arg3, int arg4) {
        field9601++;
        class173 var6 = (class173) arg2;
        int var7 = this.field9600 + arg1;
        class320 var8 = var6.field2352;
        int var9 = this.field9606 + arg0;
        this.field9592.method81(class497.field7145, -21969);
        this.field9608.method1669(false);
        this.field9608.method1663(this.field9592, -2);
        this.field9608.method1602(-1, 1);
        this.field9608.method1628((byte) 117, 1);
        class328 var10 = this.field9608.method1587(3);
        var10.method2144((float) this.field9615, 0, (float) this.field9609, 0.0F);
        var10.method360(var9, var7, 0);
        this.field9608.method1662(2);
        class328 var11 = this.field9608.method1593(-118);
        var11.method2144(this.field9592.method1318(true, (float) this.field9615), 0, this.field9592.method1322((byte) 116, (float) this.field9609), 1.0F);
        this.field9608.method1600((byte) 95, class184.field2497);
        this.field9608.method1648(1, (byte) 66);
        this.field9608.method1663(var8, -2);
        this.field9608.method1613(-30, class719.field9987, class502.field7202);
        this.field9608.method1664((byte) -43, class240.field3203, 0);
        class328 var12 = this.field9608.method1593(24);
        var12.method2144(var8.method1318(true, (float) this.field9615), 0, var8.method1322((byte) -59, (float) this.field9609), 1.0F);
        var12.method2132(var8.method1322((byte) 125, (float) (var9 - arg3)), 0.0F, (byte) 86, var8.method1318(true, (float) (var7 - arg4)));
        this.field9608.method1600((byte) 95, class184.field2497);
        this.field9608.method1616(83);
        this.field9608.method1632((byte) -120);
        this.field9608.method1664((byte) -119, class597.field8397, 0);
        this.field9608.method1613(-30, class502.field7202, class502.field7202);
        this.field9608.method1663(null, -2);
        this.field9608.method1648(0, (byte) 66);
        this.field9608.method1632((byte) -94);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIIII)V", line = 81)
    public final void method674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9602++;
        class328 var9 = this.field9608.method1587(3);
        class328 var10 = this.field9608.method1593(106);
        this.field9592.method81(this.field9612 || this.field9603 || (arg7 & 0x1) == 0 ? class497.field7145 : class601.field8433, -21969);
        this.field9608.method1669(false);
        this.field9608.method1663(this.field9592, -2);
        this.field9608.method1602(-1, arg6);
        this.field9608.method1628((byte) -20, arg4);
        this.field9608.method1664((byte) -45, class679.field9315, 1);
        this.field9608.method1601(class679.field9315, 1, 256);
        this.field9608.method1640(true, arg5);
        var10.method2144(this.field9592.method1318(true, (float) this.field9615), 0, this.field9592.method1322((byte) -22, (float) this.field9609), 1.0F);
        if (this.field9610) {
            arg2 = this.field9609 * arg2 / this.method656();
            arg3 = this.field9615 * arg3 / this.method670();
            arg0 += this.field9606 * arg2 / this.field9609;
            arg1 += this.field9600 * arg3 / this.field9615;
        }
        var9.method2144((float) arg3, 0, (float) arg2, 0.0F);
        var9.method360(arg0, arg1, 0);
        this.field9608.method1600((byte) 95, class184.field2497);
        this.field9608.method1662(2);
        this.field9608.method1616(-69);
        this.field9608.method1632((byte) -128);
        this.field9608.method1664((byte) -114, class240.field3203, 1);
        this.field9608.method1601(class240.field3203, 1, 256);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIII)V", line = 122)
    public final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9590++;
        int[] var7 = this.field9608.method409(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class325.method2116(var7[var8], -16777216);
            }
            this.method3922(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIII)V", line = 144)
    public final void method672(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9613++;
        class328 var6 = this.field9608.method1587(3);
        class328 var7 = this.field9608.method1593(-116);
        int var8 = this.field9600 + arg1;
        int var9 = this.field9606 + arg0;
        this.field9592.method81(class497.field7145, -21969);
        this.field9608.method1669(false);
        this.field9608.method1663(this.field9592, -2);
        this.field9608.method1602(-1, arg4);
        this.field9608.method1628((byte) -128, arg2);
        this.field9608.method1664((byte) -73, class679.field9315, 1);
        this.field9608.method1601(class679.field9315, 1, 256);
        this.field9608.method1640(true, arg3);
        var6.method2144((float) this.field9615, 0, (float) this.field9609, 0.0F);
        var6.method360(var9, var8, 0);
        var7.method2144(this.field9592.method1318(true, (float) this.field9615), 0, this.field9592.method1322((byte) 122, (float) this.field9609), 1.0F);
        this.field9608.method1600((byte) 95, class184.field2497);
        this.field9608.method1662(2);
        this.field9608.method1616(-116);
        this.field9608.method1632((byte) -110);
        this.field9608.method1664((byte) -123, class240.field3203, 1);
        this.field9608.method1601(class240.field3203, 1, 256);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)V", line = 177)
    public final void method661(int arg0, int arg1, int arg2) {
        field9596++;
        int[] var4 = this.field9608.method409(arg0, arg1, this.field9609, this.field9615);
        int[] var5 = new int[this.field9615 * this.field9609];
        this.field9592.method1321(0, this.field9615, 0, this.field9609, 0, -115, var5);
        if (arg2 == 0) {
            for (int var6 = 0; var6 < this.field9615; var6++) {
                int var7 = this.field9609 * var6;
                for (int var8 = 0; var8 < this.field9609; var8++) {
                    var5[var7 + var8] = class325.method2116(class286.method1877(-654376960, var4[var7 + var8]) << 8, class286.method1877(var5[var7 + var8], 16777215));
                }
            }
        } else if (arg2 == 1) {
            for (int var15 = 0; var15 < this.field9615; var15++) {
                int var16 = this.field9609 * var15;
                for (int var17 = 0; var17 < this.field9609; var17++) {
                    var5[var16 + var17] = class325.method2116(class286.method1877(var4[var16 + var17], -1371537664) << 16, class286.method1877(var5[var16 + var17], 16777215));
                }
            }
        } else if (arg2 == 2) {
            for (int var9 = 0; var9 < this.field9615; var9++) {
                int var10 = this.field9609 * var9;
                for (int var11 = 0; var11 < this.field9609; var11++) {
                    var5[var10 + var11] = class325.method2116(class286.method1877(var4[var10 + var11] << 24, -9354638), class286.method1877(var5[var10 + var11], 16777215));
                }
            }
        } else if (arg2 == 3) {
            for (int var12 = 0; var12 < this.field9615; var12++) {
                int var13 = this.field9609 * var12;
                for (int var14 = 0; var14 < this.field9609; var14++) {
                    var5[var13 + var14] = class325.method2116(var4[var13 + var14] == 0 ? 0 : -16777216, class286.method1877(var5[var13 + var14], 16777215));
                }
            }
        }
        this.method3922(0, 0, this.field9609, this.field9615, var5, 0, this.field9609);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "()I", line = 288)
    public final int method657() {
        field9599++;
        return this.field9609;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 304)
    public final void method676(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class486 arg7, int arg8, int arg9) {
        field9597++;
        class328 var11 = this.field9608.method1587(3);
        class328 var12 = this.field9608.method1593(-80);
        class173 var13 = (class173) arg7;
        class320 var14 = var13.field2352;
        this.field9592.method81(this.field9612 || this.field9603 || (arg6 & 0x1) == 0 ? class497.field7145 : class601.field8433, -21969);
        this.field9608.method1669(false);
        this.field9608.method1663(this.field9592, -2);
        this.field9608.method1602(-1, 1);
        this.field9608.method1628((byte) 111, 1);
        if (this.field9610) {
            float var15 = (float) this.field9609 / (float) this.method656();
            float var16 = (float) this.field9615 / (float) this.method670();
            var11.method2145(false, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, (arg5 - arg1) * var16, (arg3 - arg1) * var15, (arg2 - arg0) * var15, (arg4 - arg0) * var16);
            var11.method2132(((float) this.field9606 + arg0) * var15, 0.0F, (byte) 86, ((float) this.field9600 + arg1) * var16);
        } else {
            var11.method2145(false, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, arg5 - arg1, arg3 - arg1, arg2 - arg0, arg4 - arg0);
            var11.method2132(arg0, 0.0F, (byte) 86, arg1);
        }
        var12.method2144(this.field9592.method1318(true, (float) this.field9615), 0, this.field9592.method1322((byte) 123, (float) this.field9609), 1.0F);
        this.field9608.method1600((byte) 95, class184.field2497);
        this.field9608.method1648(1, (byte) 66);
        this.field9608.method1663(var14, -2);
        this.field9608.method1613(-30, class719.field9987, class502.field7202);
        this.field9608.method1664((byte) -104, class240.field3203, 0);
        class328 var17 = this.field9608.method1593(117);
        var17.method344(var11);
        var17.method360(-arg8, -arg9, 0);
        var17.method2138(var14.method1322((byte) -118, 1.0F), var14.method1318(true, 1.0F), 16383, 1.0F);
        this.field9608.method1600((byte) 95, class184.field2497);
        this.field9608.method1662(2);
        this.field9608.method1616(-77);
        this.field9608.method1632((byte) -118);
        this.field9608.method1664((byte) -119, class597.field8397, 0);
        this.field9608.method1613(-30, class502.field7202, class502.field7202);
        this.field9608.method1663(null, -2);
        this.field9608.method1648(0, (byte) 66);
        this.field9608.method1632((byte) -96);
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "()I", line = 359)
    public final int method663() {
        field9617++;
        return this.field9615;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lsr;IIZ)V", line = 673)
    public class697(class251 arg0, int arg1, int arg2, boolean arg3) {
        this.field9608 = arg0;
        this.field9609 = arg1;
        this.field9615 = arg2;
        this.field9592 = arg0.method1473(arg1, arg2, arg3 ? class165.field2263 : class499.field7165, -20634, class309.field4305);
        this.field9592.method1317(28970, true, true);
        this.field9612 = this.field9592.method1323((byte) -72) != arg1;
        this.field9603 = arg2 != this.field9592.method1316((byte) -12);
        this.field9618 = !this.field9612 && this.field9592.method1324(-4111);
        this.field9604 = !this.field9603 && this.field9592.method1324(-4111);
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lsr;II[III)V", line = 688)
    public class697(class251 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field9615 = arg2;
        this.field9608 = arg0;
        this.field9609 = arg1;
        this.field9592 = arg0.method1458(arg5, -103, arg1, arg2, arg4, arg3, false);
        this.field9592.method1317(28970, true, true);
        this.field9612 = this.field9592.method1323((byte) -76) != arg1;
        this.field9603 = arg2 != this.field9592.method1316((byte) -47);
        this.field9618 = !this.field9612 && this.field9592.method1324(-4111);
        this.field9604 = !this.field9603 && this.field9592.method1324(-4111);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(IIIIIII)V", line = 376)
    public final void method673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9605++;
        class328 var8 = this.field9608.method1587(3);
        class328 var9 = this.field9608.method1593(120);
        this.field9592.method81(class497.field7145, -21969);
        this.field9608.method1669(false);
        this.field9608.method1663(this.field9592, -2);
        this.field9608.method1602(-1, arg6);
        this.field9608.method1628((byte) -7, arg4);
        this.field9608.method1664((byte) -86, class679.field9315, 1);
        this.field9608.method1601(class679.field9315, 1, 256);
        this.field9608.method1640(true, arg5);
        boolean var10 = this.field9604 && this.field9600 == 0 && this.field9614 == 0;
        boolean var11 = this.field9618 && this.field9606 == 0 && this.field9593 == 0;
        if (var10 & var11) {
            var9.method2144(this.field9592.method1318(true, (float) arg3), 0, this.field9592.method1322((byte) -84, (float) arg2), 1.0F);
            var8.method2144((float) arg3, 0, (float) arg2, 0.0F);
            var8.method360(arg0, arg1, 0);
            this.field9608.method1600((byte) 95, class184.field2497);
            this.field9608.method1662(2);
            this.field9608.method1616(78);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method670();
            var9.method2144(this.field9592.method1318(true, (float) this.field9615), 0, this.field9592.method1322((byte) 121, (float) arg2), 1.0F);
            this.field9608.method1600((byte) 95, class184.field2497);
            int var32 = this.field9600 + arg1;
            int var33 = this.field9615 + var32;
            while (var30 >= var33) {
                var8.method2144((float) this.field9615, 0, (float) arg2, 0.0F);
                var8.method360(arg0, var32, 0);
                this.field9608.method1662(2);
                var33 += var31;
                this.field9608.method1616(109);
                var32 += var31;
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method2144(this.field9592.method1318(true, (float) var34), 0, this.field9592.method1322((byte) -98, (float) arg2), 1.0F);
                this.field9608.method1600((byte) 95, class184.field2497);
                var8.method2144((float) var34, 0, (float) arg2, 0.0F);
                var8.method360(arg0, var32, 0);
                this.field9608.method1662(2);
                this.field9608.method1616(75);
            }
        } else if (var10) {
            int var25 = arg0 + arg2;
            int var26 = this.method656();
            var9.method2144(this.field9592.method1318(true, (float) arg3), 0, this.field9592.method1322((byte) 117, (float) this.field9609), 1.0F);
            this.field9608.method1600((byte) 95, class184.field2497);
            int var27 = this.field9606 + arg0;
            for (int var28 = this.field9609 + var27; var28 <= var25; var28 += var26) {
                var8.method2144((float) arg3, 0, (float) this.field9609, 0.0F);
                var8.method360(var27, arg1, 0);
                this.field9608.method1662(2);
                var27 += var26;
                this.field9608.method1616(57);
            }
            if (var27 < var25) {
                int var29 = var25 - var27;
                var9.method2144(this.field9592.method1318(true, (float) arg3), 0, this.field9592.method1322((byte) -125, (float) var29), 1.0F);
                this.field9608.method1600((byte) 95, class184.field2497);
                var8.method2144((float) arg3, 0, (float) var29, 0.0F);
                var8.method360(var27, arg1, 0);
                this.field9608.method1662(2);
                this.field9608.method1616(113);
            }
        } else {
            int var12 = arg1 + arg3;
            int var13 = arg0 + arg2;
            int var14 = this.method656();
            int var15 = this.method670();
            int var16 = arg1 + this.field9600;
            int var17 = this.field9615 + var16;
            while (var12 >= var17) {
                var9.method2144(this.field9592.method1318(true, (float) this.field9615), 0, this.field9592.method1322((byte) 121, (float) this.field9609), 1.0F);
                this.field9608.method1600((byte) 95, class184.field2497);
                int var22 = this.field9606 + arg0;
                for (int var23 = this.field9609 + var22; var23 <= var13; var23 += var14) {
                    var8.method2144((float) this.field9615, 0, (float) this.field9609, 0.0F);
                    var8.method360(var22, var16, 0);
                    this.field9608.method1662(2);
                    this.field9608.method1616(69);
                    var22 += var14;
                }
                if (var22 < var13) {
                    int var24 = var13 - var22;
                    var9.method2144(this.field9592.method1318(true, (float) this.field9615), 0, this.field9592.method1322((byte) 1, (float) var24), 1.0F);
                    this.field9608.method1600((byte) 95, class184.field2497);
                    var8.method2144((float) this.field9615, 0, (float) var24, 0.0F);
                    var8.method360(var22, var16, 0);
                    this.field9608.method1662(2);
                    this.field9608.method1616(-39);
                }
                var17 += var15;
                var16 += var15;
            }
            if (var16 < var12) {
                int var18 = var12 - var16;
                var9.method2144(this.field9592.method1318(true, (float) var18), 0, this.field9592.method1322((byte) 119, (float) this.field9609), 1.0F);
                this.field9608.method1600((byte) 95, class184.field2497);
                int var19 = this.field9606 + arg0;
                int var20 = var19 + this.field9609;
                while (var13 >= var20) {
                    var8.method2144((float) var18, 0, (float) this.field9609, 0.0F);
                    var8.method360(var19, var16, 0);
                    this.field9608.method1662(2);
                    this.field9608.method1616(-42);
                    var20 += var14;
                    var19 += var14;
                }
                if (var19 < var13) {
                    int var21 = var13 - var19;
                    var9.method2144(this.field9592.method1318(true, (float) var18), 0, this.field9592.method1322((byte) -75, (float) var21), 1.0F);
                    this.field9608.method1600((byte) 95, class184.field2497);
                    var8.method2144((float) var18, 0, (float) var21, 0.0F);
                    var8.method360(var19, var16, 0);
                    this.field9608.method1662(2);
                    this.field9608.method1616(-25);
                }
            }
        }
        this.field9608.method1632((byte) -118);
        this.field9608.method1664((byte) -59, class240.field3203, 1);
        this.field9608.method1601(class240.field3203, 1, 256);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "()I", line = 588)
    public final int method656() {
        field9619++;
        return this.field9609 + this.field9606 + this.field9593;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(FFFFFFIIII)V", line = 601)
    public final void method665(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field9611++;
        class328 var11 = this.field9608.method1587(3);
        class328 var12 = this.field9608.method1593(127);
        this.field9592.method81(this.field9612 || this.field9603 || (arg9 & 0x1) == 0 ? class497.field7145 : class601.field8433, -21969);
        this.field9608.method1669(false);
        this.field9608.method1663(this.field9592, -2);
        this.field9608.method1602(-1, arg8);
        this.field9608.method1628((byte) -32, arg6);
        this.field9608.method1664((byte) -87, class679.field9315, 1);
        this.field9608.method1601(class679.field9315, 1, 256);
        this.field9608.method1640(true, arg7);
        if (this.field9610) {
            float var13 = (float) this.method656();
            float var14 = (float) this.method670();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field9600 * var17;
            float var20 = (float) this.field9600 * var18;
            float var21 = (float) this.field9606 * var15;
            float var22 = (float) this.field9606 * var16;
            float var23 = (float) this.field9593 * -var15;
            float var24 = (float) this.field9593 * -var16;
            float var25 = (float) this.field9614 * -var17;
            arg4 = arg4 + var21 + var25;
            arg0 = arg0 + var21 + var19;
            arg3 = arg3 + var24 + var20;
            float var26 = (float) this.field9614 * -var18;
            arg2 = arg2 + var23 + var19;
            arg1 = arg1 + var22 + var20;
            arg5 = arg5 + var22 + var26;
        }
        var11.method2145(false, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, arg5 - arg1, -arg1 + arg3, arg2 - arg0, -arg0 + arg4);
        var11.method2132(arg0, 0.0F, (byte) 86, arg1);
        var12.method2144(this.field9592.method1318(true, (float) this.field9615), 0, this.field9592.method1322((byte) -69, (float) this.field9609), 1.0F);
        this.field9608.method1600((byte) 95, class184.field2497);
        this.field9608.method1662(2);
        this.field9608.method1616(102);
        this.field9608.method1632((byte) -118);
        this.field9608.method1664((byte) -59, class240.field3203, 1);
        this.field9608.method1601(class240.field3203, 1, 256);
    }
}
