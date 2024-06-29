import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class580 extends class241 {

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    private int field8166 = 0;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    private int field8177 = 0;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    private int field8176 = 0;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "Z")
    private boolean field8179 = false;

    @OriginalMember(owner = "client!fs", name = "E", descriptor = "I")
    private int field8193 = 0;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    private int field8172;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "Lpj;")
    private class156 field8178;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    private int field8181;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "Loga;")
    private class498 field8175;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "Z")
    private boolean field8174;

    @OriginalMember(owner = "client!fs", name = "F", descriptor = "Z")
    private boolean field8194;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "Z")
    private boolean field8182;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "Z")
    private boolean field8170;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field8171 = -1;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field8165;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!fs", name = "D", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!fs", name = "G", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!fs", name = "H", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!fs", name = "J", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "()I", line = 4)
    public final int method1505() {
        field8180++;
        return this.field8176 + this.field8166 + this.field8172;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V", line = 17)
    public final void method365(int arg0, int arg1, int arg2) {
        field8192++;
        int[] var4 = this.field8178.method467(arg0, arg1, this.field8181, this.field8172);
        int[] var5 = new int[this.field8181 * this.field8172];
        this.field8175.method2018(0, 0, (byte) -102, this.field8181, var5, 0, this.field8172);
        if (arg2 == 0) {
            for (int var6 = 0; var6 < this.field8172; var6++) {
                int var7 = this.field8181 * var6;
                for (int var8 = 0; var8 < this.field8181; var8++) {
                    var5[var7 + var8] = class746.method4158(class702.method3977(var5[var7 + var8], 16777215), class702.method3977(var4[var7 + var8], 1140785152) << 8);
                }
            }
        } else if (arg2 == 1) {
            for (int var15 = 0; var15 < this.field8172; var15++) {
                int var16 = this.field8181 * var15;
                for (int var17 = 0; var17 < this.field8181; var17++) {
                    var5[var16 + var17] = class746.method4158(class702.method3977(-2126446848, var4[var16 + var17]) << 16, class702.method3977(var5[var16 + var17], 16777215));
                }
            }
        } else if (arg2 == 2) {
            for (int var12 = 0; var12 < this.field8172; var12++) {
                int var13 = this.field8181 * var12;
                for (int var14 = 0; var14 < this.field8181; var14++) {
                    var5[var13 + var14] = class746.method4158(class702.method3977(16777215, var5[var13 + var14]), class702.method3977(var4[var13 + var14], 1023715071) << 24);
                }
            }
        } else if (arg2 == 3) {
            for (int var9 = 0; var9 < this.field8172; var9++) {
                int var10 = this.field8181 * var9;
                for (int var11 = 0; var11 < this.field8181; var11++) {
                    var5[var10 + var11] = class746.method4158(class702.method3977(var5[var10 + var11], 16777215), var4[var10 + var11] == 0 ? 0 : -16777216);
                }
            }
        }
        this.method3398(0, 0, this.field8181, this.field8172, var5, 0, this.field8181);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 126)
    public static final void method3396(String arg0, int arg1) {
        field8186++;
        class312 var2 = class45.method326((byte) -66);
        var2.field4445.method2952(arg1, class763.field10515.field7314);
        var2.field4445.method2957(0, 1267307848);
        int var3 = var2.field4445.field7042;
        var2.field4445.method2957(650, 1267307848);
        int[] var4 = class17.method160(var2, (byte) 89);
        int var5 = var2.field4445.field7042;
        var2.field4445.method2953(arg0, -28136);
        var2.field4445.method2952(arg1, class140.field2081);
        var2.field4445.field7042 += 7;
        var2.field4445.method2963(var4, var5, 599866564, var2.field4445.field7042);
        var2.field4445.method2937(var2.field4445.field7042 - var3, (byte) 124);
        class208.method1440(var2, 109);
        class617.field8633 = -3;
        class339.field4745 = 1;
        class96.field1095 = 0;
        class335.field4720 = 0;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V", line = 155)
    public static final void method3397(byte arg0) {
        field8183++;
        class23 var1 = null;
        try {
            if (arg0 != 13) {
                method3400(93, -101, 66, 35, -90);
            }
            class141 var2 = class519.field7328.method2839(true, "", 0);
            while (var2.field2089 == 0) {
                class107.method828(1L, (byte) -97);
            }
            if (var2.field2089 == 1) {
                var1 = (class23) var2.field2092;
                class494 var3 = class21.field353.method4075(24);
                var1.method236(var3.field7042, 0, 1, var3.field7050);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method230((byte) 127);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILaa;II)V", line = 193)
    public final void method359(int arg0, int arg1, class511 arg2, int arg3, int arg4) {
        field8191++;
        class259 var6 = (class259) arg2;
        int var7 = this.field8176 + arg1;
        class498 var8 = var6.field3823;
        int var9 = this.field8177 + arg0;
        this.field8175.method2563(-1764, class439.field5927);
        this.field8178.method1089(-1);
        this.field8178.method1118(0, this.field8175);
        this.field8178.method1101(false, 1);
        this.field8178.method1189(90, 1);
        class385 var10 = this.field8178.method1117((byte) 115);
        var10.method2398((float) this.field8181, (float) this.field8172, 0.0F, 0);
        var10.method1878(var9, var7, 0);
        this.field8178.method1147(true);
        class385 var11 = this.field8178.method1161(256);
        var11.method2398(this.field8175.method2024((float) this.field8181, -23091), this.field8175.method2022((float) this.field8172, 16678), 1.0F, 0);
        this.field8178.method1152(127, class448.field6129);
        this.field8178.method1192(-22137, 1);
        this.field8178.method1118(0, var8);
        this.field8178.method1080(class776.field10666, class463.field6532, -30);
        this.field8178.method1180(0, (byte) 91, class639.field8962);
        class385 var12 = this.field8178.method1161(256);
        var12.method2398(var8.method2024((float) this.field8181, -23091), var8.method2022((float) this.field8172, 16678), 1.0F, 0);
        var12.method2405(-47, var8.method2024((float) (var9 - arg3), -23091), 0.0F, var8.method2022((float) (var7 - arg4), 16678));
        this.field8178.method1152(114, class448.field6129);
        this.field8178.method1079((byte) -25);
        this.field8178.method1182((byte) 73);
        this.field8178.method1180(0, (byte) 91, class605.field8453);
        this.field8178.method1080(class463.field6532, class463.field6532, -30);
        this.field8178.method1118(0, null);
        this.field8178.method1192(-22137, 0);
        this.field8178.method1182((byte) 102);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFFFFFIIII)V", line = 242)
    public final void method1503(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field8164++;
        class385 var11 = this.field8178.method1117((byte) 106);
        class385 var12 = this.field8178.method1161(256);
        this.field8175.method2563(-1764, this.field8174 || this.field8194 || ~(arg9 & 0x1) == -1 ? class439.field5927 : class399.field5476);
        this.field8178.method1089(-1);
        this.field8178.method1118(0, this.field8175);
        this.field8178.method1101(false, arg8);
        this.field8178.method1189(59, arg6);
        this.field8178.method1180(1, (byte) 91, class683.field9465);
        this.field8178.method1082(1, class683.field9465, (byte) -112);
        this.field8178.method1159((byte) 124, arg7);
        if (this.field8179) {
            float var13 = (float) this.method1507();
            float var14 = (float) this.method1505();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field8176 * var17;
            float var20 = (float) this.field8176 * var18;
            float var21 = (float) this.field8177 * var15;
            float var22 = (float) this.field8177 * var16;
            float var23 = (float) this.field8193 * -var15;
            float var24 = (float) this.field8193 * -var16;
            float var25 = (float) this.field8166 * -var17;
            arg0 = arg0 + var21 + var19;
            float var26 = (float) this.field8166 * -var18;
            arg2 = arg2 + var23 + var19;
            arg4 = arg4 + var21 + var25;
            arg1 = arg1 + var22 + var20;
            arg3 = arg3 + var24 + var20;
            arg5 = arg5 + var22 + var26;
        }
        var11.method2392(0.0F, 0.0F, 1, arg2 - arg0, -arg1 + arg3, 1.0F, 0.0F, 0.0F, arg5 - arg1, -arg0 + arg4);
        var11.method2405(94, arg0, 0.0F, arg1);
        var12.method2398(this.field8175.method2024((float) this.field8181, -23091), this.field8175.method2022((float) this.field8172, 16678), 1.0F, 0);
        this.field8178.method1152(116, class448.field6129);
        this.field8178.method1147(true);
        this.field8178.method1079((byte) -25);
        this.field8178.method1182((byte) 118);
        this.field8178.method1180(1, (byte) 91, class639.field8962);
        this.field8178.method1082(1, class639.field8962, (byte) -112);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIII[III)V", line = 311)
    private final void method3398(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field8175.method2020(arg2, arg6, arg1, (byte) -72, arg0, arg4, arg3, arg5);
        field8173++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILjava/lang/String;)I", line = 320)
    public static final int method3399(int arg0, String arg1) {
        field8197++;
        for (int var2 = arg0; var2 < class65.field795.length; var2++) {
            if (class65.field795[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(IIIIIII)V", line = 338)
    public final void method1510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8185++;
        class385 var8 = this.field8178.method1117((byte) 101);
        class385 var9 = this.field8178.method1161(256);
        this.field8175.method2563(-1764, class439.field5927);
        this.field8178.method1089(-1);
        this.field8178.method1118(0, this.field8175);
        this.field8178.method1101(false, arg6);
        this.field8178.method1189(22, arg4);
        this.field8178.method1180(1, (byte) 91, class683.field9465);
        this.field8178.method1082(1, class683.field9465, (byte) -112);
        this.field8178.method1159((byte) 113, arg5);
        boolean var10 = this.field8170 && this.field8176 == 0 && this.field8166 == 0;
        boolean var11 = this.field8182 && this.field8177 == 0 && this.field8193 == 0;
        if (var11 & var10) {
            var9.method2398(this.field8175.method2024((float) arg2, -23091), this.field8175.method2022((float) arg3, 16678), 1.0F, 0);
            var8.method2398((float) arg2, (float) arg3, 0.0F, 0);
            var8.method1878(arg0, arg1, 0);
            this.field8178.method1152(119, class448.field6129);
            this.field8178.method1147(true);
            this.field8178.method1079((byte) -25);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method1505();
            var9.method2398(this.field8175.method2024((float) arg2, -23091), this.field8175.method2022((float) this.field8172, 16678), 1.0F, 0);
            this.field8178.method1152(121, class448.field6129);
            int var14 = this.field8176 + arg1;
            int var15 = var14 + this.field8172;
            while (var15 <= var12) {
                var8.method2398((float) arg2, (float) this.field8172, 0.0F, 0);
                var8.method1878(arg0, var14, 0);
                this.field8178.method1147(true);
                var15 += var13;
                var14 += var13;
                this.field8178.method1079((byte) -25);
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method2398(this.field8175.method2024((float) arg2, -23091), this.field8175.method2022((float) var16, 16678), 1.0F, 0);
                this.field8178.method1152(119, class448.field6129);
                var8.method2398((float) arg2, (float) var16, 0.0F, 0);
                var8.method1878(arg0, var14, 0);
                this.field8178.method1147(true);
                this.field8178.method1079((byte) -25);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method1507();
            var9.method2398(this.field8175.method2024((float) this.field8181, -23091), this.field8175.method2022((float) arg3, 16678), 1.0F, 0);
            this.field8178.method1152(124, class448.field6129);
            int var32 = this.field8177 + arg0;
            int var33 = this.field8181 + var32;
            while (var30 >= var33) {
                var8.method2398((float) this.field8181, (float) arg3, 0.0F, 0);
                var8.method1878(var32, arg1, 0);
                this.field8178.method1147(true);
                var33 += var31;
                this.field8178.method1079((byte) -25);
                var32 += var31;
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method2398(this.field8175.method2024((float) var34, -23091), this.field8175.method2022((float) arg3, 16678), 1.0F, 0);
                this.field8178.method1152(123, class448.field6129);
                var8.method2398((float) var34, (float) arg3, 0.0F, 0);
                var8.method1878(var32, arg1, 0);
                this.field8178.method1147(true);
                this.field8178.method1079((byte) -25);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method1507();
            int var20 = this.method1505();
            int var21 = this.field8176 + arg1;
            int var22 = this.field8172 + var21;
            while (var17 >= var22) {
                var9.method2398(this.field8175.method2024((float) this.field8181, -23091), this.field8175.method2022((float) this.field8172, 16678), 1.0F, 0);
                this.field8178.method1152(116, class448.field6129);
                int var27 = arg0 + this.field8177;
                for (int var28 = this.field8181 + var27; var28 <= var18; var28 += var19) {
                    var8.method2398((float) this.field8181, (float) this.field8172, 0.0F, 0);
                    var8.method1878(var27, var21, 0);
                    this.field8178.method1147(true);
                    var27 += var19;
                    this.field8178.method1079((byte) -25);
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method2398(this.field8175.method2024((float) var29, -23091), this.field8175.method2022((float) this.field8172, 16678), 1.0F, 0);
                    this.field8178.method1152(119, class448.field6129);
                    var8.method2398((float) var29, (float) this.field8172, 0.0F, 0);
                    var8.method1878(var27, var21, 0);
                    this.field8178.method1147(true);
                    this.field8178.method1079((byte) -25);
                }
                var22 += var20;
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method2398(this.field8175.method2024((float) this.field8181, -23091), this.field8175.method2022((float) var23, 16678), 1.0F, 0);
                this.field8178.method1152(117, class448.field6129);
                int var24 = this.field8177 + arg0;
                for (int var25 = var24 + this.field8181; var25 <= var18; var25 += var19) {
                    var8.method2398((float) this.field8181, (float) var23, 0.0F, 0);
                    var8.method1878(var24, var21, 0);
                    this.field8178.method1147(true);
                    var24 += var19;
                    this.field8178.method1079((byte) -25);
                }
                if (var18 > var24) {
                    int var26 = var18 - var24;
                    var9.method2398(this.field8175.method2024((float) var26, -23091), this.field8175.method2022((float) var23, 16678), 1.0F, 0);
                    this.field8178.method1152(127, class448.field6129);
                    var8.method2398((float) var26, (float) var23, 0.0F, 0);
                    var8.method1878(var24, var21, 0);
                    this.field8178.method1147(true);
                    this.field8178.method1079((byte) -25);
                }
            }
        }
        this.field8178.method1182((byte) 127);
        this.field8178.method1180(1, (byte) 91, class639.field8962);
        this.field8178.method1082(1, class639.field8962, (byte) -112);
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "()I", line = 543)
    public final int method1508() {
        field8195++;
        return this.field8181;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIII)V", line = 551)
    public final void method364(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8190++;
        class385 var6 = this.field8178.method1117((byte) 104);
        class385 var7 = this.field8178.method1161(256);
        int var8 = this.field8177 + arg0;
        int var9 = this.field8176 + arg1;
        this.field8175.method2563(-1764, class439.field5927);
        this.field8178.method1089(-1);
        this.field8178.method1118(0, this.field8175);
        this.field8178.method1101(false, arg4);
        this.field8178.method1189(109, arg2);
        this.field8178.method1180(1, (byte) 91, class683.field9465);
        this.field8178.method1082(1, class683.field9465, (byte) -112);
        this.field8178.method1159((byte) 94, arg3);
        var6.method2398((float) this.field8181, (float) this.field8172, 0.0F, 0);
        var6.method1878(var8, var9, 0);
        var7.method2398(this.field8175.method2024((float) this.field8181, -23091), this.field8175.method2022((float) this.field8172, 16678), 1.0F, 0);
        this.field8178.method1152(123, class448.field6129);
        this.field8178.method1147(true);
        this.field8178.method1079((byte) -25);
        this.field8178.method1182((byte) -67);
        this.field8178.method1180(1, (byte) 91, class639.field8962);
        this.field8178.method1082(1, class639.field8962, (byte) -112);
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lpj;IIZ)V", line = 814)
    public class580(class156 arg0, int arg1, int arg2, boolean arg3) {
        this.field8172 = arg2;
        this.field8178 = arg0;
        this.field8181 = arg1;
        this.field8175 = arg0.method1103(arg3 ? class691.field9659 : class306.field4412, class34.field457, arg1, arg2, -2);
        this.field8175.method2021(true, true, (byte) 23);
        this.field8174 = this.field8175.method2019((byte) 61) != arg1;
        this.field8194 = this.field8175.method2015(95) != arg2;
        this.field8182 = !this.field8174 && this.field8175.method2016(true);
        this.field8170 = !this.field8194 && this.field8175.method2016(true);
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lpj;II[III)V", line = 829)
    public class580(class156 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field8178 = arg0;
        this.field8172 = arg2;
        this.field8181 = arg1;
        this.field8175 = arg0.method1186(arg4, arg3, arg5, arg1, arg2, (byte) -103, false);
        this.field8175.method2021(true, true, (byte) 23);
        this.field8174 = this.field8175.method2019((byte) 61) != arg1;
        this.field8194 = arg2 != this.field8175.method2015(116);
        this.field8182 = !this.field8174 && this.field8175.method2016(true);
        this.field8170 = !this.field8194 && this.field8175.method2016(true);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 586)
    public final void method1501(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class511 arg7, int arg8, int arg9) {
        field8165++;
        class385 var11 = this.field8178.method1117((byte) 111);
        class385 var12 = this.field8178.method1161(256);
        class259 var13 = (class259) arg7;
        class498 var14 = var13.field3823;
        this.field8175.method2563(-1764, this.field8174 || this.field8194 || ~(arg6 & 0x1) == -1 ? class439.field5927 : class399.field5476);
        this.field8178.method1089(-1);
        this.field8178.method1118(0, this.field8175);
        this.field8178.method1101(false, 1);
        this.field8178.method1189(106, 1);
        if (this.field8179) {
            float var15 = (float) this.field8181 / (float) this.method1507();
            float var16 = (float) this.field8172 / (float) this.method1505();
            var11.method2392(0.0F, 0.0F, 1, (arg2 - arg0) * var15, (arg3 - arg1) * var15, 1.0F, 0.0F, 0.0F, (arg5 - arg1) * var16, (arg4 - arg0) * var16);
            var11.method2405(-52, ((float) this.field8177 + arg0) * var15, 0.0F, ((float) this.field8176 + arg1) * var16);
        } else {
            var11.method2392(0.0F, 0.0F, 1, arg2 - arg0, -arg1 + arg3, 1.0F, 0.0F, 0.0F, arg5 - arg1, -arg0 + arg4);
            var11.method2405(126, arg0, 0.0F, arg1);
        }
        var12.method2398(this.field8175.method2024((float) this.field8181, -23091), this.field8175.method2022((float) this.field8172, 16678), 1.0F, 0);
        this.field8178.method1152(123, class448.field6129);
        this.field8178.method1192(-22137, 1);
        this.field8178.method1118(0, var14);
        this.field8178.method1080(class776.field10666, class463.field6532, -30);
        this.field8178.method1180(0, (byte) 91, class639.field8962);
        class385 var17 = this.field8178.method1161(256);
        var17.method1884(var11);
        var17.method1878(-arg8, -arg9, 0);
        var17.method2411(var14.method2024(1.0F, -23091), var14.method2022(1.0F, 16678), 1.0F, (byte) -64);
        this.field8178.method1152(126, class448.field6129);
        this.field8178.method1147(true);
        this.field8178.method1079((byte) -25);
        this.field8178.method1182((byte) 116);
        this.field8178.method1180(0, (byte) 91, class605.field8453);
        this.field8178.method1080(class463.field6532, class463.field6532, -30);
        this.field8178.method1118(0, null);
        this.field8178.method1192(-22137, 0);
        this.field8178.method1182((byte) -104);
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(IIIII)Z", line = 649)
    public static final boolean method3400(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8189++;
        if ((class190.field2932[0][arg0][arg2] & 0x2) != 0) {
            return true;
        } else if ((class190.field2932[arg1][arg0][arg2] & 0x10) == 0) {
            if (arg4 < 31) {
                field8171 = -39;
            }
            return arg3 == class713.method4008(arg1, arg0, arg2, 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZIB)V", line = 673)
    public static final void method3401(boolean arg0, int arg1, byte arg2) {
        if (arg0) {
            class312 var3 = class353.method2245(class87.field971, class653.field9127, (byte) 99);
            var3.field4445.method2957(arg1, 1267307848);
            class208.method1440(var3, 81);
        } else {
            class379.method2352(class104.field1202, arg1, -1);
        }
        if (arg2 > -88) {
            method3397((byte) -79);
        }
        field8168++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIII)V", line = 698)
    public final void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8167++;
        class385 var9 = this.field8178.method1117((byte) 120);
        class385 var10 = this.field8178.method1161(256);
        this.field8175.method2563(-1764, this.field8174 || this.field8194 || (arg7 & 0x1) == 0 ? class439.field5927 : class399.field5476);
        this.field8178.method1089(-1);
        this.field8178.method1118(0, this.field8175);
        this.field8178.method1101(false, arg6);
        this.field8178.method1189(69, arg4);
        this.field8178.method1180(1, (byte) 91, class683.field9465);
        this.field8178.method1082(1, class683.field9465, (byte) -112);
        this.field8178.method1159((byte) -82, arg5);
        var10.method2398(this.field8175.method2024((float) this.field8181, -23091), this.field8175.method2022((float) this.field8172, 16678), 1.0F, 0);
        if (this.field8179) {
            arg2 = this.field8181 * arg2 / this.method1507();
            arg3 = this.field8172 * arg3 / this.method1505();
            arg1 += this.field8176 * arg3 / this.field8172;
            arg0 += this.field8177 * arg2 / this.field8181;
        }
        var9.method2398((float) arg2, (float) arg3, 0.0F, 0);
        var9.method1878(arg0, arg1, 0);
        this.field8178.method1152(119, class448.field6129);
        this.field8178.method1147(true);
        this.field8178.method1079((byte) -25);
        this.field8178.method1182((byte) 116);
        this.field8178.method1180(1, (byte) 91, class639.field8962);
        this.field8178.method1082(1, class639.field8962, (byte) -112);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIII)V", line = 734)
    public final void method360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8188++;
        int[] var7 = this.field8178.method467(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class746.method4158(var7[var8], -16777216);
            }
            this.method3398(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "()I", line = 757)
    public final int method1502() {
        field8184++;
        return this.field8172;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "()I", line = 768)
    public final int method1507() {
        field8169++;
        return this.field8181 + this.field8177 + this.field8193;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(IIII)V", line = 784)
    public final void method1506(int arg0, int arg1, int arg2, int arg3) {
        field8187++;
        this.field8176 = arg1;
        this.field8177 = arg0;
        this.field8193 = arg2;
        this.field8166 = arg3;
        this.field8179 = this.field8177 != 0 || this.field8176 != 0 || this.field8193 != 0 || this.field8166 != 0;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "([I)V", line = 800)
    public final void method1499(int[] arg0) {
        arg0[0] = this.field8177;
        arg0[3] = this.field8166;
        field8163++;
        arg0[2] = this.field8193;
        arg0[1] = this.field8176;
    }
}
