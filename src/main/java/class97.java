import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class97 extends class680 {

    @OriginalMember(owner = "client!pia", name = "o", descriptor = "I")
    private int field1268 = 0;

    @OriginalMember(owner = "client!pia", name = "t", descriptor = "Z")
    private boolean field1273 = false;

    @OriginalMember(owner = "client!pia", name = "q", descriptor = "I")
    private int field1270 = 0;

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "I")
    private int field1264 = 0;

    @OriginalMember(owner = "client!pia", name = "x", descriptor = "I")
    private int field1277 = 0;

    @OriginalMember(owner = "client!pia", name = "m", descriptor = "Luv;")
    private class367 field1266;

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "client!pia", name = "r", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client!pia", name = "D", descriptor = "Ljs;")
    private class334 field1283;

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "Z")
    private boolean field1259;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "Z")
    private boolean field1260;

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "Z")
    private boolean field1263;

    @OriginalMember(owner = "client!pia", name = "p", descriptor = "Z")
    private boolean field1269;

    @OriginalMember(owner = "client!pia", name = "w", descriptor = "I")
    public static int field1276 = 0;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!pia", name = "s", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!pia", name = "u", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!pia", name = "v", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!pia", name = "y", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!pia", name = "z", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!pia", name = "A", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!pia", name = "B", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!pia", name = "C", descriptor = "Lni;")
    public static class522 field1282;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIIII)V", line = 4)
    public final void method662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1279++;
        int[] var7 = this.field1266.method460(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class344.method2020(var7[var8], -16777216);
            }
            this.method665(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "()I", line = 31)
    public final int method663() {
        field1272++;
        return this.field1271 + this.field1270 + this.field1268;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V", line = 43)
    public static void method664(int arg0) {
        if (arg0 == -14320) {
            field1282 = null;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIII[III)V", line = 53)
    private final void method665(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field1283.method1697(17779, arg1, arg3, arg4, arg0, arg5, arg6, arg2);
        field1257++;
    }

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "()I", line = 65)
    public final int method666() {
        field1281++;
        return this.field1277 + this.field1262 + this.field1264;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "([I)V", line = 73)
    public final void method667(int[] arg0) {
        field1261++;
        arg0[3] = this.field1270;
        arg0[2] = this.field1277;
        arg0[1] = this.field1268;
        arg0[0] = this.field1264;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(FFFFFFIIII)V", line = 85)
    public final void method668(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field1274++;
        class648 var11 = this.field1266.method2130((byte) -47);
        class648 var12 = this.field1266.method2119((byte) 63);
        this.field1283.method272((byte) -81, this.field1259 || this.field1260 || (arg9 & 0x1) == 0 ? class163.field2049 : class705.field9884);
        this.field1266.method2175(false);
        this.field1266.method2148(this.field1283, 118);
        this.field1266.method2145(arg8, 69);
        this.field1266.method2153(arg6, (byte) -115);
        this.field1266.method2174(1, -93, class421.field5897);
        this.field1266.method2116(-92, class421.field5897, 1);
        this.field1266.method2134(2, arg7);
        if (this.field1273) {
            float var13 = (float) this.method666();
            float var14 = (float) this.method663();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field1268 * var17;
            float var20 = (float) this.field1268 * var18;
            float var21 = (float) this.field1264 * var15;
            float var22 = (float) this.field1264 * var16;
            float var23 = (float) this.field1277 * -var15;
            float var24 = (float) this.field1277 * -var16;
            float var25 = (float) this.field1270 * -var17;
            arg0 = arg0 + var21 + var19;
            arg1 = arg1 + var22 + var20;
            arg4 = arg4 + var21 + var25;
            arg3 = arg3 + var24 + var20;
            arg2 = arg2 + var23 + var19;
            float var26 = (float) this.field1270 * -var18;
            arg5 = arg5 + var22 + var26;
        }
        var11.method3651(1.0F, arg4 - arg0, -arg1 + arg3, 0.0F, 0.0F, 0.0F, arg5 - arg1, -arg0 + arg2, 0.0F, (byte) 123);
        var11.method3669(-99, arg1, 0.0F, arg0);
        var12.method3665(this.field1283.method1688(-8473, (float) this.field1271), (byte) -123, this.field1283.method1692((byte) 53, (float) this.field1262), 1.0F);
        this.field1266.method2149(class536.field7270, (byte) 98);
        this.field1266.method2103(1);
        this.field1266.method2146((byte) -88);
        this.field1266.method2135(2);
        this.field1266.method2174(1, -107, class547.field7717);
        this.field1266.method2116(-89, class547.field7717, 1);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(III)V", line = 151)
    public final void method669(int arg0, int arg1, int arg2) {
        field1254++;
        int[] var4 = this.field1266.method460(arg0, arg1, this.field1262, this.field1271);
        int[] var5 = new int[this.field1271 * this.field1262];
        this.field1283.method1695(this.field1262, 0, (byte) 87, this.field1271, 0, var5, 0);
        if (arg2 == 0) {
            for (int var15 = 0; var15 < this.field1271; var15++) {
                int var16 = this.field1262 * var15;
                for (int var17 = 0; var17 < this.field1262; var17++) {
                    var5[var16 + var17] = class344.method2020(class321.method1919(-16776984, var4[var16 + var17] << 8), class321.method1919(16777215, var5[var16 + var17]));
                }
            }
        } else if (arg2 == 1) {
            for (int var12 = 0; var12 < this.field1271; var12++) {
                int var13 = this.field1262 * var12;
                for (int var14 = 0; var14 < this.field1262; var14++) {
                    var5[var13 + var14] = class344.method2020(class321.method1919(16777215, var5[var13 + var14]), class321.method1919(1304231680, var4[var13 + var14]) << 16);
                }
            }
        } else if (arg2 == 2) {
            for (int var6 = 0; var6 < this.field1271; var6++) {
                int var7 = this.field1262 * var6;
                for (int var8 = 0; var8 < this.field1262; var8++) {
                    var5[var7 + var8] = class344.method2020(class321.method1919(var4[var7 + var8], -1286409473) << 24, class321.method1919(16777215, var5[var7 + var8]));
                }
            }
        } else if (arg2 == 3) {
            for (int var9 = 0; var9 < this.field1271; var9++) {
                int var10 = this.field1262 * var9;
                for (int var11 = 0; var11 < this.field1262; var11++) {
                    var5[var10 + var11] = class344.method2020(var4[var10 + var11] == 0 ? 0 : -16777216, class321.method1919(16777215, var5[var10 + var11]));
                }
            }
        }
        this.method665(0, 0, this.field1262, this.field1271, var5, 0, this.field1262);
    }

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "(IIII)V", line = 260)
    public final void method670(int arg0, int arg1, int arg2, int arg3) {
        this.field1270 = arg3;
        this.field1264 = arg0;
        this.field1277 = arg2;
        field1275++;
        this.field1268 = arg1;
        this.field1273 = this.field1264 != 0 || this.field1268 != 0 || this.field1277 != 0 || this.field1270 != 0;
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(IIIIIII)V", line = 272)
    public final void method671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1265++;
        class648 var8 = this.field1266.method2130((byte) 111);
        class648 var9 = this.field1266.method2119((byte) -88);
        this.field1283.method272((byte) -81, class163.field2049);
        this.field1266.method2175(false);
        this.field1266.method2148(this.field1283, -115);
        this.field1266.method2145(arg6, 110);
        this.field1266.method2153(arg4, (byte) 77);
        this.field1266.method2174(1, -98, class421.field5897);
        this.field1266.method2116(-67, class421.field5897, 1);
        this.field1266.method2134(2, arg5);
        boolean var10 = this.field1269 && this.field1268 == 0 && this.field1270 == 0;
        boolean var11 = this.field1263 && this.field1264 == 0 && this.field1277 == 0;
        if ((var11 & var10)) {
            var9.method3665(this.field1283.method1688(-8473, (float) arg3), (byte) -123, this.field1283.method1692((byte) 119, (float) arg2), 1.0F);
            var8.method3665((float) arg3, (byte) -120, (float) arg2, 0.0F);
            var8.method39(arg0, arg1, 0);
            this.field1266.method2149(class536.field7270, (byte) 53);
            this.field1266.method2103(1);
            this.field1266.method2146((byte) -100);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method663();
            var9.method3665(this.field1283.method1688(-8473, (float) this.field1271), (byte) -119, this.field1283.method1692((byte) -69, (float) arg2), 1.0F);
            this.field1266.method2149(class536.field7270, (byte) 49);
            int var32 = this.field1268 + arg1;
            int var33 = var32 + this.field1271;
            while (var33 <= var30) {
                var8.method3665((float) this.field1271, (byte) -114, (float) arg2, 0.0F);
                var8.method39(arg0, var32, 0);
                this.field1266.method2103(1);
                var33 += var31;
                this.field1266.method2146((byte) -108);
                var32 += var31;
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method3665(this.field1283.method1688(-8473, (float) var34), (byte) -122, this.field1283.method1692((byte) 79, (float) arg2), 1.0F);
                this.field1266.method2149(class536.field7270, (byte) 97);
                var8.method3665((float) var34, (byte) -118, (float) arg2, 0.0F);
                var8.method39(arg0, var32, 0);
                this.field1266.method2103(1);
                this.field1266.method2146((byte) -117);
            }
        } else if (var10) {
            int var12 = arg0 + arg2;
            int var13 = this.method666();
            var9.method3665(this.field1283.method1688(-8473, (float) arg3), (byte) -128, this.field1283.method1692((byte) 111, (float) this.field1262), 1.0F);
            this.field1266.method2149(class536.field7270, (byte) 69);
            int var14 = this.field1264 + arg0;
            int var15 = this.field1262 + var14;
            while (var12 >= var15) {
                var8.method3665((float) arg3, (byte) -119, (float) this.field1262, 0.0F);
                var8.method39(var14, arg1, 0);
                this.field1266.method2103(1);
                var14 += var13;
                var15 += var13;
                this.field1266.method2146((byte) -124);
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method3665(this.field1283.method1688(-8473, (float) arg3), (byte) -121, this.field1283.method1692((byte) -86, (float) var16), 1.0F);
                this.field1266.method2149(class536.field7270, (byte) 107);
                var8.method3665((float) arg3, (byte) -125, (float) var16, 0.0F);
                var8.method39(var14, arg1, 0);
                this.field1266.method2103(1);
                this.field1266.method2146((byte) -119);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method666();
            int var20 = this.method663();
            int var21 = this.field1268 + arg1;
            int var22 = this.field1271 + var21;
            while (var17 >= var22) {
                var9.method3665(this.field1283.method1688(-8473, (float) this.field1271), (byte) -114, this.field1283.method1692((byte) -85, (float) this.field1262), 1.0F);
                this.field1266.method2149(class536.field7270, (byte) 64);
                int var27 = this.field1264 + arg0;
                int var28 = var27 + this.field1262;
                while (var18 >= var28) {
                    var8.method3665((float) this.field1271, (byte) -125, (float) this.field1262, 0.0F);
                    var8.method39(var27, var21, 0);
                    this.field1266.method2103(1);
                    var28 += var19;
                    this.field1266.method2146((byte) -128);
                    var27 += var19;
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method3665(this.field1283.method1688(-8473, (float) this.field1271), (byte) -110, this.field1283.method1692((byte) -55, (float) var29), 1.0F);
                    this.field1266.method2149(class536.field7270, (byte) 26);
                    var8.method3665((float) this.field1271, (byte) -115, (float) var29, 0.0F);
                    var8.method39(var27, var21, 0);
                    this.field1266.method2103(1);
                    this.field1266.method2146((byte) 53);
                }
                var22 += var20;
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method3665(this.field1283.method1688(-8473, (float) var23), (byte) -122, this.field1283.method1692((byte) -100, (float) this.field1262), 1.0F);
                this.field1266.method2149(class536.field7270, (byte) 105);
                int var24 = arg0 + this.field1264;
                for (int var25 = var24 + this.field1262; var25 <= var18; var25 += var19) {
                    var8.method3665((float) var23, (byte) -119, (float) this.field1262, 0.0F);
                    var8.method39(var24, var21, 0);
                    this.field1266.method2103(1);
                    this.field1266.method2146((byte) -113);
                    var24 += var19;
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method3665(this.field1283.method1688(-8473, (float) var23), (byte) -109, this.field1283.method1692((byte) 101, (float) var26), 1.0F);
                    this.field1266.method2149(class536.field7270, (byte) 125);
                    var8.method3665((float) var23, (byte) -123, (float) var26, 0.0F);
                    var8.method39(var24, var21, 0);
                    this.field1266.method2103(1);
                    this.field1266.method2146((byte) -105);
                }
            }
        }
        this.field1266.method2135(2);
        this.field1266.method2174(1, -79, class547.field7717);
        this.field1266.method2116(-86, class547.field7717, 1);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IILaa;II)V", line = 482)
    public final void method672(int arg0, int arg1, class487 arg2, int arg3, int arg4) {
        field1280++;
        class133 var6 = (class133) arg2;
        int var7 = this.field1268 + arg1;
        int var8 = this.field1264 + arg0;
        class334 var9 = var6.field1705;
        this.field1283.method272((byte) -81, class163.field2049);
        this.field1266.method2175(false);
        this.field1266.method2148(this.field1283, 43);
        this.field1266.method2145(1, 117);
        this.field1266.method2153(1, (byte) -122);
        class648 var10 = this.field1266.method2130((byte) 123);
        var10.method3665((float) this.field1271, (byte) -109, (float) this.field1262, 0.0F);
        var10.method39(var8, var7, 0);
        this.field1266.method2103(1);
        class648 var11 = this.field1266.method2119((byte) -96);
        var11.method3665(this.field1283.method1688(-8473, (float) this.field1271), (byte) -123, this.field1283.method1692((byte) -62, (float) this.field1262), 1.0F);
        this.field1266.method2149(class536.field7270, (byte) 30);
        this.field1266.method2114((byte) 120, 1);
        this.field1266.method2148(var9, 102);
        this.field1266.method2156(class199.field2365, class365.field4838, 22831);
        this.field1266.method2174(0, -86, class547.field7717);
        class648 var12 = this.field1266.method2119((byte) 93);
        var12.method3665(var9.method1688(-8473, (float) this.field1271), (byte) -125, var9.method1692((byte) 103, (float) this.field1262), 1.0F);
        var12.method3669(-118, var9.method1688(-8473, (float) (var7 - arg4)), 0.0F, var9.method1692((byte) 58, (float) (var8 - arg3)));
        this.field1266.method2149(class536.field7270, (byte) 57);
        this.field1266.method2146((byte) -120);
        this.field1266.method2135(2);
        this.field1266.method2174(0, -121, class71.field769);
        this.field1266.method2156(class199.field2365, class199.field2365, 22831);
        this.field1266.method2148(null, 104);
        this.field1266.method2114((byte) 120, 0);
        this.field1266.method2135(2);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 526)
    public final void method673(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class487 arg7, int arg8, int arg9) {
        field1258++;
        class648 var11 = this.field1266.method2130((byte) 102);
        class648 var12 = this.field1266.method2119((byte) -80);
        class133 var13 = (class133) arg7;
        class334 var14 = var13.field1705;
        this.field1283.method272((byte) -81, this.field1259 || this.field1260 || (arg6 & 0x1) == 0 ? class163.field2049 : class705.field9884);
        this.field1266.method2175(false);
        this.field1266.method2148(this.field1283, -120);
        this.field1266.method2145(1, 83);
        this.field1266.method2153(1, (byte) 118);
        if (this.field1273) {
            float var15 = (float) this.field1262 / (float) this.method666();
            float var16 = (float) this.field1271 / (float) this.method663();
            var11.method3651(1.0F, (arg4 - arg0) * var16, (arg3 - arg1) * var15, 0.0F, 0.0F, 0.0F, (arg5 - arg1) * var16, (arg2 - arg0) * var15, 0.0F, (byte) 92);
            var11.method3669(-118, ((float) this.field1268 + arg1) * var16, 0.0F, ((float) this.field1264 + arg0) * var15);
        } else {
            var11.method3651(1.0F, arg4 - arg0, -arg1 + arg3, 0.0F, 0.0F, 0.0F, arg5 - arg1, -arg0 + arg2, 0.0F, (byte) 104);
            var11.method3669(-97, arg1, 0.0F, arg0);
        }
        var12.method3665(this.field1283.method1688(-8473, (float) this.field1271), (byte) -110, this.field1283.method1692((byte) -128, (float) this.field1262), 1.0F);
        this.field1266.method2149(class536.field7270, (byte) 39);
        this.field1266.method2114((byte) 120, 1);
        this.field1266.method2148(var14, 73);
        this.field1266.method2156(class199.field2365, class365.field4838, 22831);
        this.field1266.method2174(0, -59, class547.field7717);
        class648 var17 = this.field1266.method2119((byte) -128);
        var17.method25(var11);
        var17.method39(-arg8, -arg9, 0);
        var17.method3666(1.0F, var14.method1688(-8473, 1.0F), var14.method1692((byte) 62, 1.0F), -76);
        this.field1266.method2149(class536.field7270, (byte) 89);
        this.field1266.method2103(1);
        this.field1266.method2146((byte) 88);
        this.field1266.method2135(2);
        this.field1266.method2174(0, -63, class71.field769);
        this.field1266.method2156(class199.field2365, class199.field2365, 22831);
        this.field1266.method2148(null, 2);
        this.field1266.method2114((byte) 120, 0);
        this.field1266.method2135(2);
    }

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Luv;IIZ)V", line = 689)
    public class97(class367 arg0, int arg1, int arg2, boolean arg3) {
        this.field1266 = arg0;
        this.field1262 = arg1;
        this.field1271 = arg2;
        this.field1283 = arg0.method1307(arg2, arg1, arg3 ? class758.field10567 : class450.field6286, (byte) 45, class594.field8277);
        this.field1283.method1694(true, true, 116);
        this.field1259 = this.field1283.method1690(12941) != arg1;
        this.field1260 = this.field1283.method1693(116) != arg2;
        this.field1263 = !this.field1259 && this.field1283.method1696(-62);
        this.field1269 = !this.field1260 && this.field1283.method1696(-33);
    }

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Luv;II[III)V", line = 704)
    public class97(class367 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1271 = arg2;
        this.field1262 = arg1;
        this.field1266 = arg0;
        this.field1283 = arg0.method1317(arg4, (byte) 124, arg3, false, arg1, arg2, arg5);
        this.field1283.method1694(true, true, 102);
        this.field1259 = arg1 != this.field1283.method1690(12941);
        this.field1260 = this.field1283.method1693(124) != arg2;
        this.field1263 = !this.field1259 && this.field1283.method1696(-116);
        this.field1269 = !this.field1260 && this.field1283.method1696(-111);
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "()I", line = 599)
    public final int method674() {
        field1267++;
        return this.field1262;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIIIIII)V", line = 610)
    public final void method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1256++;
        class648 var9 = this.field1266.method2130((byte) 4);
        class648 var10 = this.field1266.method2119((byte) 103);
        this.field1283.method272((byte) -81, this.field1259 || this.field1260 || (arg7 & 0x1) == 0 ? class163.field2049 : class705.field9884);
        this.field1266.method2175(false);
        this.field1266.method2148(this.field1283, -123);
        this.field1266.method2145(arg6, 96);
        this.field1266.method2153(arg4, (byte) 28);
        this.field1266.method2174(1, -121, class421.field5897);
        this.field1266.method2116(-111, class421.field5897, 1);
        this.field1266.method2134(2, arg5);
        var10.method3665(this.field1283.method1688(-8473, (float) this.field1271), (byte) -112, this.field1283.method1692((byte) -52, (float) this.field1262), 1.0F);
        if (this.field1273) {
            arg2 = this.field1262 * arg2 / this.method666();
            arg3 = this.field1271 * arg3 / this.method663();
            arg0 += this.field1264 * arg2 / this.field1262;
            arg1 += this.field1268 * arg3 / this.field1271;
        }
        var9.method3665((float) arg3, (byte) -113, (float) arg2, 0.0F);
        var9.method39(arg0, arg1, 0);
        this.field1266.method2149(class536.field7270, (byte) 52);
        this.field1266.method2103(1);
        this.field1266.method2146((byte) -104);
        this.field1266.method2135(2);
        this.field1266.method2174(1, -84, class547.field7717);
        this.field1266.method2116(-69, class547.field7717, 1);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "()I", line = 646)
    public final int method676() {
        field1278++;
        return this.field1271;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIII)V", line = 655)
    public final void method677(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1255++;
        class648 var6 = this.field1266.method2130((byte) 95);
        class648 var7 = this.field1266.method2119((byte) -94);
        int var8 = this.field1268 + arg1;
        int var9 = this.field1264 + arg0;
        this.field1283.method272((byte) -81, class163.field2049);
        this.field1266.method2175(false);
        this.field1266.method2148(this.field1283, 57);
        this.field1266.method2145(arg4, 91);
        this.field1266.method2153(arg2, (byte) -119);
        this.field1266.method2174(1, -73, class421.field5897);
        this.field1266.method2116(-107, class421.field5897, 1);
        this.field1266.method2134(2, arg3);
        var6.method3665((float) this.field1271, (byte) -120, (float) this.field1262, 0.0F);
        var6.method39(var9, var8, 0);
        var7.method3665(this.field1283.method1688(-8473, (float) this.field1271), (byte) -111, this.field1283.method1692((byte) 52, (float) this.field1262), 1.0F);
        this.field1266.method2149(class536.field7270, (byte) 28);
        this.field1266.method2103(1);
        this.field1266.method2146((byte) -113);
        this.field1266.method2135(2);
        this.field1266.method2174(1, -112, class547.field7717);
        this.field1266.method2116(-102, class547.field7717, 1);
    }
}
