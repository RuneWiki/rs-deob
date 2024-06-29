import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class68 extends class21 {

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "Z")
    private boolean field948 = false;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    private int field968 = 0;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
    private int field973 = 0;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    private int field966 = 0;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
    private int field970 = 0;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "Lpga;")
    private class492 field967;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
    private int field974;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Loia;")
    private class51 field961;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "Z")
    private boolean field972;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "Z")
    private boolean field971;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Z")
    private boolean field951;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "Z")
    private boolean field964;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "()I", line = 4)
    public final int method117() {
        field956++;
        return this.field959;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIII)V", line = 12)
    public final void method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field977++;
        int[] var7 = this.field967.method590(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class747.method4153(var7[var8], -16777216);
            }
            this.method441(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILaa;II)V", line = 34)
    public final void method119(int arg0, int arg1, class571 arg2, int arg3, int arg4) {
        field965++;
        class82 var6 = (class82) arg2;
        class51 var7 = var6.field1111;
        int var8 = this.field970 + arg1;
        int var9 = this.field968 + arg0;
        this.field961.method521((byte) -118, class482.field6532);
        this.field967.method2902((byte) -96);
        this.field967.method2933((byte) 88, this.field961);
        this.field967.method2945(1, 22630);
        this.field967.method2881(1, -1);
        class173 var10 = this.field967.method2891(-125);
        var10.method1091((float) this.field959, 0.0F, (float) this.field974, 1);
        var10.method851(var9, var8, 0);
        this.field967.method2901((byte) 53);
        class173 var11 = this.field967.method2872((byte) 44);
        var11.method1091(this.field961.method354(-23477, (float) this.field959), 1.0F, this.field961.method353((byte) 123, (float) this.field974), 1);
        this.field967.method2925(class643.field9115, (byte) 104);
        this.field967.method2949(1, 7544);
        this.field967.method2933((byte) 104, var7);
        this.field967.method2878(class369.field4717, 28768, class253.field3501);
        this.field967.method2946(0, class214.field3017, (byte) 127);
        class173 var12 = this.field967.method2872((byte) 102);
        var12.method1091(var7.method354(-23477, (float) this.field959), 1.0F, var7.method353((byte) 96, (float) this.field974), 1);
        var12.method1093(var7.method354(-23477, (float) (var8 - arg4)), 0.0F, (byte) -46, var7.method353((byte) 110, (float) (var9 - arg3)));
        this.field967.method2925(class643.field9115, (byte) 115);
        this.field967.method2879((byte) 3);
        this.field967.method2928(false);
        this.field967.method2946(0, class186.field2725, (byte) 127);
        this.field967.method2878(class369.field4717, 28768, class369.field4717);
        this.field967.method2933((byte) -109, null);
        this.field967.method2949(0, 7544);
        this.field967.method2928(false);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(III)V", line = 77)
    public static final void method439(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field954 = -28;
        }
        field960++;
        if (class424.field5889 != arg1) {
            class237.field3298 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class237.field3298[var3] = (var3 << 12) / arg1;
            }
            class424.field5889 = arg1;
            class354.field4552 = arg1 - 1;
            class752.field10444 = arg1 * 32;
        }
        if (class245.field3400 == arg2) {
            return;
        }
        if (class424.field5889 == arg2) {
            class370.field4727 = class237.field3298;
        } else {
            class370.field4727 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class370.field4727[var4] = (var4 << 12) / arg2;
            }
        }
        class245.field3400 = arg2;
        class150.field2077 = arg2 - 1;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIII)V", line = 123)
    public final void method104(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field949++;
        class173 var6 = this.field967.method2891(-39);
        class173 var7 = this.field967.method2872((byte) -113);
        int var8 = this.field970 + arg1;
        int var9 = this.field968 + arg0;
        this.field961.method521((byte) -99, class482.field6532);
        this.field967.method2902((byte) -82);
        this.field967.method2933((byte) 91, this.field961);
        this.field967.method2945(arg4, 22630);
        this.field967.method2881(arg2, -1);
        this.field967.method2946(1, class123.field1675, (byte) 127);
        this.field967.method2923(-96, 1, class123.field1675);
        this.field967.method2912((byte) 9, arg3);
        var6.method1091((float) this.field959, 0.0F, (float) this.field974, 1);
        var6.method851(var9, var8, 0);
        var7.method1091(this.field961.method354(-23477, (float) this.field959), 1.0F, this.field961.method353((byte) 103, (float) this.field974), 1);
        this.field967.method2925(class643.field9115, (byte) 111);
        this.field967.method2901((byte) 53);
        this.field967.method2879((byte) 3);
        this.field967.method2928(false);
        this.field967.method2946(1, class214.field3017, (byte) 127);
        this.field967.method2923(-95, 1, class214.field3017);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(FFFFFFIIII)V", line = 154)
    public final void method123(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field962++;
        class173 var11 = this.field967.method2891(-57);
        class173 var12 = this.field967.method2872((byte) 115);
        this.field961.method521((byte) -127, this.field972 || this.field971 || (arg9 & 0x1) == 0 ? class482.field6532 : class48.field711);
        this.field967.method2902((byte) -87);
        this.field967.method2933((byte) 110, this.field961);
        this.field967.method2945(arg8, 22630);
        this.field967.method2881(arg6, -1);
        this.field967.method2946(1, class123.field1675, (byte) 127);
        this.field967.method2923(-95, 1, class123.field1675);
        this.field967.method2912((byte) 9, arg7);
        if (this.field948) {
            float var13 = (float) this.method116();
            float var14 = (float) this.method108();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field970 * var17;
            float var20 = (float) this.field970 * var18;
            float var21 = (float) this.field968 * var15;
            float var22 = (float) this.field968 * var16;
            float var23 = (float) this.field973 * -var15;
            float var24 = (float) this.field973 * -var16;
            float var25 = (float) this.field966 * -var17;
            arg0 = arg0 + var21 + var19;
            float var26 = (float) this.field966 * -var18;
            arg2 = arg2 + var23 + var19;
            arg3 = arg3 + var24 + var20;
            arg1 = arg1 + var22 + var20;
            arg4 = arg4 + var21 + var25;
            arg5 = arg5 + var22 + var26;
        }
        var11.method1080(arg5 - arg1, -arg1 + arg3, 0.0F, 0.0F, (byte) 116, 1.0F, arg2 - arg0, 0.0F, arg4 - arg0, 0.0F);
        var11.method1093(arg1, 0.0F, (byte) -46, arg0);
        var12.method1091(this.field961.method354(-23477, (float) this.field959), 1.0F, this.field961.method353((byte) 95, (float) this.field974), 1);
        this.field967.method2925(class643.field9115, (byte) 116);
        this.field967.method2901((byte) 53);
        this.field967.method2879((byte) 3);
        this.field967.method2928(false);
        this.field967.method2946(1, class214.field3017, (byte) 127);
        this.field967.method2923(-117, 1, class214.field3017);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "()I", line = 229)
    public final int method108() {
        field955++;
        return this.field970 + this.field966 + this.field959;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lpga;IIZ)V", line = 3911)
    public class68(class492 arg0, int arg1, int arg2, boolean arg3) {
        this.field959 = arg2;
        this.field967 = arg0;
        this.field974 = arg1;
        this.field961 = arg0.method636(arg1, arg2, class720.field10164, arg3 ? class4.field10 : class126.field1742, 97);
        this.field961.method355(true, (byte) -123, true);
        this.field972 = this.field961.method351(false) != arg1;
        this.field971 = arg2 != this.field961.method350(-88);
        this.field951 = !this.field972 && this.field961.method348((byte) 117);
        this.field964 = !this.field971 && this.field961.method348((byte) 117);
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lpga;II[III)V", line = 3926)
    public class68(class492 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field959 = arg2;
        this.field974 = arg1;
        this.field967 = arg0;
        this.field961 = arg0.method601(arg4, arg1, -24364, arg5, arg2, false, arg3);
        this.field961.method355(true, (byte) -124, true);
        this.field972 = this.field961.method351(false) != arg1;
        this.field971 = arg2 != this.field961.method350(-98);
        this.field951 = !this.field972 && this.field961.method348((byte) 117);
        this.field964 = !this.field971 && this.field961.method348((byte) 117);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIII)V", line = 243)
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field950++;
        class173 var8 = this.field967.method2891(-99);
        class173 var9 = this.field967.method2872((byte) -108);
        this.field961.method521((byte) -66, class482.field6532);
        this.field967.method2902((byte) -85);
        this.field967.method2933((byte) -41, this.field961);
        this.field967.method2945(arg6, 22630);
        this.field967.method2881(arg4, -1);
        this.field967.method2946(1, class123.field1675, (byte) 127);
        this.field967.method2923(-114, 1, class123.field1675);
        this.field967.method2912((byte) 9, arg5);
        boolean var10 = this.field964 && this.field970 == 0 && this.field966 == 0;
        boolean var11 = this.field951 && this.field968 == 0 && this.field973 == 0;
        if (var11 & var10) {
            var9.method1091(this.field961.method354(-23477, (float) arg3), 1.0F, this.field961.method353((byte) 118, (float) arg2), 1);
            var8.method1091((float) arg3, 0.0F, (float) arg2, 1);
            var8.method851(arg0, arg1, 0);
            this.field967.method2925(class643.field9115, (byte) 114);
            this.field967.method2901((byte) 53);
            this.field967.method2879((byte) 3);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method108();
            var9.method1091(this.field961.method354(-23477, (float) this.field959), 1.0F, this.field961.method353((byte) 107, (float) arg2), 1);
            this.field967.method2925(class643.field9115, (byte) 112);
            int var14 = this.field970 + arg1;
            int var15 = this.field959 + var14;
            while (var12 >= var15) {
                var8.method1091((float) this.field959, 0.0F, (float) arg2, 1);
                var8.method851(arg0, var14, 0);
                this.field967.method2901((byte) 53);
                var14 += var13;
                var15 += var13;
                this.field967.method2879((byte) 3);
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method1091(this.field961.method354(-23477, (float) var16), 1.0F, this.field961.method353((byte) 111, (float) arg2), 1);
                this.field967.method2925(class643.field9115, (byte) 117);
                var8.method1091((float) var16, 0.0F, (float) arg2, 1);
                var8.method851(arg0, var14, 0);
                this.field967.method2901((byte) 53);
                this.field967.method2879((byte) 3);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method116();
            var9.method1091(this.field961.method354(-23477, (float) arg3), 1.0F, this.field961.method353((byte) 101, (float) this.field974), 1);
            this.field967.method2925(class643.field9115, (byte) 120);
            int var32 = this.field968 + arg0;
            int var33 = this.field974 + var32;
            while (var30 >= var33) {
                var8.method1091((float) arg3, 0.0F, (float) this.field974, 1);
                var8.method851(var32, arg1, 0);
                this.field967.method2901((byte) 53);
                var32 += var31;
                var33 += var31;
                this.field967.method2879((byte) 3);
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method1091(this.field961.method354(-23477, (float) arg3), 1.0F, this.field961.method353((byte) 127, (float) var34), 1);
                this.field967.method2925(class643.field9115, (byte) 119);
                var8.method1091((float) arg3, 0.0F, (float) var34, 1);
                var8.method851(var32, arg1, 0);
                this.field967.method2901((byte) 53);
                this.field967.method2879((byte) 3);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method116();
            int var20 = this.method108();
            int var21 = this.field970 + arg1;
            for (int var22 = var21 + this.field959; var22 <= var17; var22 += var20) {
                var9.method1091(this.field961.method354(-23477, (float) this.field959), 1.0F, this.field961.method353((byte) 114, (float) this.field974), 1);
                this.field967.method2925(class643.field9115, (byte) 116);
                int var27 = arg0 + this.field968;
                for (int var28 = this.field974 + var27; var28 <= var18; var28 += var19) {
                    var8.method1091((float) this.field959, 0.0F, (float) this.field974, 1);
                    var8.method851(var27, var21, 0);
                    this.field967.method2901((byte) 53);
                    this.field967.method2879((byte) 3);
                    var27 += var19;
                }
                if (var18 > var27) {
                    int var29 = var18 - var27;
                    var9.method1091(this.field961.method354(-23477, (float) this.field959), 1.0F, this.field961.method353((byte) 110, (float) var29), 1);
                    this.field967.method2925(class643.field9115, (byte) 112);
                    var8.method1091((float) this.field959, 0.0F, (float) var29, 1);
                    var8.method851(var27, var21, 0);
                    this.field967.method2901((byte) 53);
                    this.field967.method2879((byte) 3);
                }
                var21 += var20;
            }
            if (var17 > var21) {
                int var23 = var17 - var21;
                var9.method1091(this.field961.method354(-23477, (float) var23), 1.0F, this.field961.method353((byte) 110, (float) this.field974), 1);
                this.field967.method2925(class643.field9115, (byte) 123);
                int var24 = arg0 + this.field968;
                int var25 = this.field974 + var24;
                while (var25 <= var18) {
                    var8.method1091((float) var23, 0.0F, (float) this.field974, 1);
                    var8.method851(var24, var21, 0);
                    this.field967.method2901((byte) 53);
                    var24 += var19;
                    var25 += var19;
                    this.field967.method2879((byte) 3);
                }
                if (var18 > var24) {
                    int var26 = var18 - var24;
                    var9.method1091(this.field961.method354(-23477, (float) var23), 1.0F, this.field961.method353((byte) 126, (float) var26), 1);
                    this.field967.method2925(class643.field9115, (byte) 113);
                    var8.method1091((float) var23, 0.0F, (float) var26, 1);
                    var8.method851(var24, var21, 0);
                    this.field967.method2901((byte) 53);
                    this.field967.method2879((byte) 3);
                }
            }
        }
        this.field967.method2928(false);
        this.field967.method2946(1, class214.field3017, (byte) 127);
        this.field967.method2923(-98, 1, class214.field3017);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)Z", line = 451)
    public static final boolean method440(byte arg0) throws IOException {
        field975++;
        if (class275.field3699 == null) {
            return false;
        }
        if (class108.field1547 == null) {
            if (class602.field8613) {
                if (!class275.field3699.method2459(2, 1)) {
                    return false;
                }
                class275.field3699.method2463(1, 0, 11909, class150.field2065.field279);
                class628.field8976++;
                class708.field9899 = 0;
                class602.field8613 = false;
            }
            class150.field2065.field330 = 0;
            if (class150.field2065.method3463(123)) {
                if (!class275.field3699.method2459(2, 1)) {
                    return false;
                }
                class275.field3699.method2463(1, 1, 11909, class150.field2065.field279);
                class708.field9899 = 0;
                class628.field8976++;
            }
            class602.field8613 = true;
            class148[] var1 = class461.method2760(-26198);
            int var2 = class150.field2065.method3461(-78);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class150.field2065.field330);
            }
            class108.field1547 = var1[var2];
            class542.field7582 = class108.field1547.field2047;
        }
        if (class542.field7582 == -1) {
            if (!class275.field3699.method2459(2, 1)) {
                return false;
            }
            class275.field3699.method2463(1, 0, 11909, class150.field2065.field279);
            class542.field7582 = class150.field2065.field279[0] & 0xFF;
            class628.field8976++;
            class708.field9899 = 0;
        }
        if (class542.field7582 == -2) {
            if (!class275.field3699.method2459(2, 2)) {
                return false;
            }
            class275.field3699.method2463(2, 0, 11909, class150.field2065.field279);
            class150.field2065.field330 = 0;
            class542.field7582 = class150.field2065.method193(2);
            class628.field8976 += 2;
            class708.field9899 = 0;
        }
        if (class542.field7582 > 0) {
            if (!class275.field3699.method2459(2, class542.field7582)) {
                return false;
            }
            class150.field2065.field330 = 0;
            class275.field3699.method2463(class542.field7582, 0, 11909, class150.field2065.field279);
            class708.field9899 = 0;
            class628.field8976 += class542.field7582;
        }
        class545.field7701 = class23.field262;
        class23.field262 = class669.field9418;
        class669.field9418 = class108.field1547;
        if (class380.field5352 == class108.field1547) {
            int var3 = class150.field2065.method174(0);
            int var4 = class150.field2065.method174(0);
            int var5 = class150.field2065.method143(false);
            int var6 = class150.field2065.method174(0);
            int var7 = class150.field2065.method167((byte) 93) << 2;
            class558.method3344(-25520);
            class294.method1724(var3, -3582, var7, var4, true, var5, var6);
            class108.field1547 = null;
            return true;
        } else if (class529.field7385 == class108.field1547) {
            class464.method2773(class497.field6964, -5709);
            class108.field1547 = null;
            return true;
        } else if (class256.field3511 == class108.field1547) {
            class724.field10195 = class564.field8023;
            if (class542.field7582 == 0) {
                class265.field3618 = null;
                class453.field6244 = null;
                class540.field7552 = null;
                class108.field1547 = null;
                class656.field9289 = 0;
                return true;
            }
            class453.field6244 = class150.field2065.method196((byte) -92);
            boolean var8 = class150.field2065.method194((byte) 119) == 1;
            if (var8) {
                class150.field2065.method196((byte) -92);
            }
            long var9 = class150.field2065.method153(96);
            class540.field7552 = class423.method2579(var9, true);
            class5.field37 = class150.field2065.method195(128);
            int var11 = class150.field2065.method194((byte) 119);
            if (var11 == 255) {
                class108.field1547 = null;
                return true;
            }
            class656.field9289 = var11;
            class199[] var12 = new class199[100];
            for (int var13 = 0; var13 < class656.field9289; var13++) {
                var12[var13] = new class199();
                var12[var13].field2879 = class150.field2065.method196((byte) -92);
                boolean var19 = class150.field2065.method194((byte) 119) == 1;
                if (var19) {
                    var12[var13].field2884 = class150.field2065.method196((byte) -92);
                } else {
                    var12[var13].field2884 = var12[var13].field2879;
                }
                var12[var13].field2883 = class53.method357(var12[var13].field2884, 1);
                var12[var13].field2880 = class150.field2065.method193(2);
                var12[var13].field2882 = class150.field2065.method195(128);
                var12[var13].field2885 = class150.field2065.method196((byte) -92);
                if (var12[var13].field2884.equals(class473.field6483.field9272)) {
                    class207.field2950 = var12[var13].field2882;
                }
            }
            boolean var14 = false;
            int var15 = class656.field9289;
            while (var15 > 0) {
                boolean var16 = true;
                var15--;
                for (int var17 = 0; var17 < var15; var17++) {
                    if (var12[var17].field2883.compareTo(var12[var17 + 1].field2883) > 0) {
                        class199 var18 = var12[var17];
                        var12[var17] = var12[var17 + 1];
                        var12[var17 + 1] = var18;
                        var16 = false;
                    }
                }
                if (var16) {
                    break;
                }
            }
            class265.field3618 = var12;
            class108.field1547 = null;
            return true;
        } else if (class30.field424 == class108.field1547) {
            int var20 = class150.field2065.method202(-120);
            class558.method3344(-25520);
            class388.method2360(5, 4, var20, class471.field6467, 0);
            class108.field1547 = null;
            return true;
        } else if (class676.field9515 == class108.field1547) {
            class464.method2773(class91.field1236, -5709);
            class108.field1547 = null;
            return true;
        } else if (class408.field5685 == class108.field1547) {
            boolean var21 = class150.field2065.method194((byte) 119) == 1;
            String var22 = class150.field2065.method196((byte) -92);
            String var23 = var22;
            if (var21) {
                var23 = class150.field2065.method196((byte) -92);
            }
            int var24 = class150.field2065.method194((byte) 119);
            int var25 = class150.field2065.method193(2);
            boolean var26 = false;
            if (var24 <= 1 && class640.method3721(var23, (byte) 117)) {
                var26 = true;
            }
            if (!var26 && class535.field7502 == 0) {
                String var27 = class225.field3151.method3658((byte) -45, var25).method2381((byte) 105, class150.field2065);
                if (var24 == 2) {
                    class362.method2039(0, var22, -123, var27, "<img=1>" + var23, "<img=1>" + var22, var25, null, 25);
                } else if (var24 == 1) {
                    class362.method2039(0, var22, -120, var27, "<img=0>" + var23, "<img=0>" + var22, var25, null, 25);
                } else {
                    class362.method2039(0, var22, -107, var27, var23, var22, var25, null, 25);
                }
            }
            class108.field1547 = null;
            return true;
        } else if (class475.field6490 == class108.field1547) {
            class490.method2862(120);
            class108.field1547 = null;
            return true;
        } else if (class379.field5318 == class108.field1547) {
            int var28 = class150.field2065.method189(255);
            int var29 = class150.field2065.method193(2);
            int var30 = class150.field2065.method192(99);
            class558.method3344(-25520);
            class14 var31 = (class14) class426.field5894.method1381(true, (long) var28);
            if (var31 != null) {
                class197.method1325(var31, (byte) 74, false, var31.field194 != var29);
            }
            class442.method2641(Integer.MAX_VALUE, var28, false, var30, var29);
            class108.field1547 = null;
            return true;
        } else if (class260.field3533 == class108.field1547) {
            int var32 = class150.field2065.method167((byte) 111);
            class558.method3344(-25520);
            class12.method65(471, var32);
            class108.field1547 = null;
            return true;
        } else if (class65.field902 == class108.field1547) {
            int var33 = class150.field2065.method167((byte) 76);
            int var34 = class150.field2065.method141(0);
            class558.method3344(-25520);
            class748.method4160(1, var33, var34);
            class108.field1547 = null;
            return true;
        } else if (class228.field3171 == class108.field1547) {
            int var35 = class150.field2065.method194((byte) 119);
            int var36 = class150.field2065.method174(0);
            int var37 = class150.field2065.method174(0);
            int var38 = class150.field2065.method174(0);
            int var39 = class150.field2065.method191(false) << 2;
            class558.method3344(-25520);
            class652.method3771(var39, var38, 200, var37, var36, var35);
            class108.field1547 = null;
            return true;
        } else if (class292.field3821 == class108.field1547) {
            String var40 = class150.field2065.method196((byte) -92);
            int var41 = class150.field2065.method193(2);
            String var42 = class225.field3151.method3658((byte) -45, var41).method2381((byte) 26, class150.field2065);
            class362.method2039(0, var40, -110, var42, var40, var40, var41, null, 19);
            class108.field1547 = null;
            return true;
        } else if (class144.field1988 == class108.field1547) {
            class529.method3148(0, false);
            class108.field1547 = null;
            return false;
        } else if (class430.field5921 == class108.field1547) {
            int var43 = class150.field2065.method192(67);
            int var44 = class150.field2065.method168(-16785);
            int var45 = class150.field2065.method194((byte) 119);
            int var46 = class150.field2065.method192(109);
            int var47 = class150.field2065.method192(94);
            class558.method3344(-25520);
            class400.field5549[var43] = true;
            class459.field6316[var43] = var47;
            class692.field9687[var43] = var46;
            class708.field9888[var43] = var45;
            class511.field7132[var43] = var44;
            class108.field1547 = null;
            return true;
        } else if (class589.field8459 == class108.field1547) {
            class458.field6302 = class150.field2065.method194((byte) 119);
            for (int var48 = 0; var48 < class458.field6302; var48++) {
                class46.field674[var48] = class150.field2065.method196((byte) -92);
                class144.field1996[var48] = class150.field2065.method196((byte) -92);
                if (class144.field1996[var48].equals("")) {
                    class144.field1996[var48] = class46.field674[var48];
                }
                class270.field3639[var48] = class150.field2065.method196((byte) -92);
                class545.field7697[var48] = class150.field2065.method196((byte) -92);
                if (class545.field7697[var48].equals("")) {
                    class545.field7697[var48] = class270.field3639[var48];
                }
                class272.field3671[var48] = false;
            }
            class666.field9387 = class564.field8023;
            class108.field1547 = null;
            return true;
        } else if (class638.field9066 == class108.field1547) {
            int var49 = class150.field2065.method194((byte) 119);
            int var50 = var49 >> 5;
            int var51 = var49 & 0x1F;
            if (var51 == 0) {
                class349.field4441[var50] = null;
                class108.field1547 = null;
                return true;
            }
            class729 var52 = new class729();
            var52.field10216 = var51;
            var52.field10215 = class150.field2065.method194((byte) 119);
            if (var52.field10215 >= 0 && class370.field4731.length > var52.field10215) {
                if (var52.field10216 == 1 || var52.field10216 == 10) {
                    var52.field10224 = class150.field2065.method193(2);
                    class150.field2065.field330 += 6;
                } else if (var52.field10216 >= 2 && var52.field10216 <= 6) {
                    if (var52.field10216 == 2) {
                        var52.field10221 = 256;
                        var52.field10217 = 256;
                    }
                    if (var52.field10216 == 3) {
                        var52.field10221 = 256;
                        var52.field10217 = 0;
                    }
                    if (var52.field10216 == 4) {
                        var52.field10217 = 512;
                        var52.field10221 = 256;
                    }
                    if (var52.field10216 == 5) {
                        var52.field10217 = 256;
                        var52.field10221 = 0;
                    }
                    if (var52.field10216 == 6) {
                        var52.field10221 = 512;
                        var52.field10217 = 256;
                    }
                    var52.field10216 = 2;
                    var52.field10222 = class150.field2065.method194((byte) 119);
                    var52.field10217 += class150.field2065.method193(2) - class179.field2535 << 9;
                    var52.field10221 += class150.field2065.method193(2) - class510.field7109 << 9;
                    var52.field10214 = class150.field2065.method194((byte) 119) << 2;
                    var52.field10212 = class150.field2065.method193(2);
                }
                var52.field10225 = class150.field2065.method193(2);
                if (var52.field10225 == 65535) {
                    var52.field10225 = -1;
                }
                class349.field4441[var50] = var52;
            }
            class108.field1547 = null;
            return true;
        } else if (class691.field9674 == class108.field1547) {
            int var53 = class150.field2065.method144(-127);
            int var54 = class150.field2065.method144(-71);
            int var55 = class150.field2065.method191(false);
            class558.method3344(-25520);
            if (var55 == 65535) {
                var55 = -1;
            }
            class293.method1718(var54, var53, (byte) 127, var55);
            class544 var56 = class487.field6572.method3054(var55, (byte) -99);
            class234.method1499((byte) 85, var56.field7660, var56.field7622, var56.field7673, var54);
            class275.method1665(var56.field7671, var56.field7621, var54, (byte) 79, var56.field7650);
            class108.field1547 = null;
            return true;
        } else if (class710.field9909 == class108.field1547) {
            int var57 = class150.field2065.method193(2);
            int var58 = class150.field2065.method193(2);
            int var59 = class150.field2065.method193(2);
            class558.method3344(-25520);
            if (class491.field6599[var57] != null) {
                for (int var60 = var58; var60 < var59; var60++) {
                    int var61 = class150.field2065.method186((byte) 117);
                    if (var60 < class491.field6599[var57].length && class491.field6599[var57][var60] != null) {
                        class491.field6599[var57][var60].field10071 = var61;
                    }
                }
            }
            class108.field1547 = null;
            return true;
        } else if (class524.field7348 == class108.field1547) {
            class511.field7117 = class542.field7582 <= 2 ? class138.field1862.method891(-2041650704, class369.field4721) : class150.field2065.method196((byte) -92);
            class401.field5551 = class542.field7582 <= 0 ? -1 : class150.field2065.method193(2);
            class108.field1547 = null;
            if (class401.field5551 == 65535) {
                class401.field5551 = -1;
            }
            return true;
        } else if (class735.field10288 == class108.field1547) {
            int var62 = class150.field2065.method167((byte) 66);
            int var63 = class150.field2065.method189(255);
            class558.method3344(-25520);
            class86.method525(-93, var62, var63);
            class108.field1547 = null;
            return true;
        } else if (class245.field3412 == class108.field1547) {
            int var64 = class150.field2065.method193(2);
            if (var64 == 65535) {
                var64 = -1;
            }
            int var65 = class150.field2065.method191(false);
            if (var65 == 65535) {
                var65 = -1;
            }
            int var66 = class150.field2065.method189(255);
            int var67 = class150.field2065.method144(-96);
            class558.method3344(-25520);
            for (int var68 = var64; var68 <= var65; var68++) {
                long var69 = ((long) var66 << 32) + (long) var68;
                class94 var71 = (class94) class331.field4247.method1381(true, var69);
                class94 var72;
                if (var71 != null) {
                    var72 = new class94(var67, var71.field1376);
                    var71.method3065(-17363);
                } else if (var68 == -1) {
                    var72 = new class94(var67, class733.method4073(true, var66).field10104.field1376);
                } else {
                    var72 = new class94(var67, -1);
                }
                class331.field4247.method1387(var72, var69, (byte) -112);
            }
            class108.field1547 = null;
            return true;
        } else if (class164.field2252 == class108.field1547) {
            int var73 = class150.field2065.method167((byte) 123);
            String var74 = class150.field2065.method196((byte) -92);
            class558.method3344(-25520);
            class501.method2996(-111, var73, var74);
            class108.field1547 = null;
            return true;
        } else if (class437.field6013 == class108.field1547) {
            class464.method2773(class321.field4139, -5709);
            class108.field1547 = null;
            return true;
        } else if (class714.field10130 == class108.field1547) {
            int var75 = class150.field2065.method189(255);
            int var76 = class150.field2065.method193(2);
            class558.method3344(-25520);
            if (var76 == 65535) {
                var76 = -1;
            }
            class741.method4130(var76, var75, (byte) 34);
            class108.field1547 = null;
            return true;
        } else if (class290.field3800 == class108.field1547) {
            class464.method2773(class224.field3150, -5709);
            class108.field1547 = null;
            return true;
        } else if (class330.field4227 == class108.field1547) {
            class464.method2773(class453.field6240, -5709);
            class108.field1547 = null;
            return true;
        } else if (class463.field6338 == class108.field1547) {
            int var77 = class150.field2065.method193(2);
            if (var77 == 65535) {
                var77 = -1;
            }
            int var78 = class150.field2065.method194((byte) 119);
            int var79 = class150.field2065.method193(2);
            int var80 = class150.field2065.method194((byte) 119);
            int var81 = class150.field2065.method193(2);
            class167.method1060(var79, (byte) 123, false, var77, var81, var78, var80);
            class108.field1547 = null;
            return true;
        } else if (class527.field7370 == class108.field1547) {
            byte var82 = class150.field2065.method146(true);
            int var83 = class150.field2065.method191(false);
            class554.field7826.method4086((byte) 44, var82, var83);
            class108.field1547 = null;
            return true;
        } else if (class50.field740 == class108.field1547) {
            class231.field3219 = class150.field2065.method150(true);
            class378.field5266 = class150.field2065.method194((byte) 119) == 1;
            class108.field1547 = null;
            return true;
        } else if (class492.field6799 == class108.field1547) {
            while (class542.field7582 > class150.field2065.field330) {
                boolean var94 = class150.field2065.method194((byte) 119) == 1;
                String var95 = class150.field2065.method196((byte) -92);
                String var96 = class150.field2065.method196((byte) -92);
                int var97 = class150.field2065.method193(2);
                int var98 = class150.field2065.method194((byte) 119);
                String var99 = "";
                boolean var100 = false;
                if (var97 > 0) {
                    var99 = class150.field2065.method196((byte) -92);
                    var100 = class150.field2065.method194((byte) 119) == 1;
                }
                for (int var101 = 0; var101 < class713.field10110; var101++) {
                    if (var94) {
                        if (var96.equals(class570.field8079[var101])) {
                            class570.field8079[var101] = var95;
                            var95 = null;
                            class82.field1117[var101] = var96;
                            break;
                        }
                    } else if (var95.equals(class570.field8079[var101])) {
                        if (class139.field1905[var101] != var97) {
                            boolean var102 = true;
                            for (class101 var103 = (class101) class367.field4709.method1945(false); var103 != null; var103 = (class101) class367.field4709.method1944(9408)) {
                                if (var103.field1448.equals(var95)) {
                                    if (var97 != 0 && var103.field1453 == 0) {
                                        var103.method1(-123);
                                        var102 = false;
                                    } else if (var97 == 0 && var103.field1453 != 0) {
                                        var103.method1(90);
                                        var102 = false;
                                    }
                                }
                            }
                            if (var102) {
                                class367.field4709.method1946(-124, new class101(var95, var97));
                            }
                            class139.field1905[var101] = var97;
                        }
                        class82.field1117[var101] = var96;
                        class370.field4735[var101] = var99;
                        class652.field9212[var101] = var98;
                        class669.field9419[var101] = var100;
                        var95 = null;
                        break;
                    }
                }
                if (var95 != null && class713.field10110 < 200) {
                    class570.field8079[class713.field10110] = var95;
                    class82.field1117[class713.field10110] = var96;
                    class139.field1905[class713.field10110] = var97;
                    class370.field4735[class713.field10110] = var99;
                    class652.field9212[class713.field10110] = var98;
                    class669.field9419[class713.field10110] = var100;
                    class713.field10110++;
                }
            }
            class693.field9691 = 2;
            class666.field9387 = class564.field8023;
            boolean var84 = false;
            int var85 = class713.field10110;
            while (var85 > 0) {
                boolean var86 = true;
                var85--;
                for (int var87 = 0; var87 < var85; var87++) {
                    if (class139.field1905[var87] != class396.field5504.field812 && class139.field1905[var87 + 1] == class396.field5504.field812 || class139.field1905[var87] == 0 && class139.field1905[var87 + 1] != 0) {
                        int var88 = class139.field1905[var87];
                        class139.field1905[var87] = class139.field1905[var87 + 1];
                        class139.field1905[var87 + 1] = var88;
                        String var89 = class370.field4735[var87];
                        class370.field4735[var87] = class370.field4735[var87 + 1];
                        class370.field4735[var87 + 1] = var89;
                        String var90 = class570.field8079[var87];
                        class570.field8079[var87] = class570.field8079[var87 + 1];
                        class570.field8079[var87 + 1] = var90;
                        String var91 = class82.field1117[var87];
                        class82.field1117[var87] = class82.field1117[var87 + 1];
                        class82.field1117[var87 + 1] = var91;
                        int var92 = class652.field9212[var87];
                        class652.field9212[var87] = class652.field9212[var87 + 1];
                        class652.field9212[var87 + 1] = var92;
                        boolean var93 = class669.field9419[var87];
                        class669.field9419[var87] = class669.field9419[var87 + 1];
                        class669.field9419[var87 + 1] = var93;
                        var86 = false;
                    }
                }
                if (var86) {
                    break;
                }
            }
            class108.field1547 = null;
            return true;
        } else if (class556.field7848 == class108.field1547) {
            class464.method2773(class175.field2381, -5709);
            class108.field1547 = null;
            return true;
        } else if (class265.field3617 == class108.field1547) {
            class346.field4404 = class150.field2065.method172(6849) << 3;
            class363.field4648 = class150.field2065.method138((byte) -62) << 3;
            class217.field3071 = class150.field2065.method143(false);
            while (class542.field7582 > class150.field2065.field330) {
                class640 var104 = class450.method2701((byte) -57)[class150.field2065.method194((byte) 119)];
                class464.method2773(var104, -5709);
            }
            class108.field1547 = null;
            return true;
        } else if (class163.field2251 == class108.field1547) {
            int var105 = class150.field2065.method194((byte) 119);
            if (class150.field2065.method194((byte) 119) == 0) {
                class293.field3827[var105] = new class469();
            } else {
                class150.field2065.field330--;
                class293.field3827[var105] = new class469(class150.field2065);
            }
            class144.field1991 = class564.field8023;
            class108.field1547 = null;
            return true;
        } else if (class369.field4719 == class108.field1547) {
            class193.method1277((byte) 57);
            class108.field1547 = null;
            return false;
        } else if (class142.field1964 == class108.field1547) {
            int var106 = class150.field2065.method143(false);
            int var107 = class150.field2065.method174(0);
            int var108 = class150.field2065.method191(false);
            if (var108 == 65535) {
                var108 = -1;
            }
            String var109 = class150.field2065.method196((byte) -92);
            if (var107 >= 1 && var107 <= 8) {
                if (var109.equalsIgnoreCase("null")) {
                    var109 = null;
                }
                class186.field2734[var107 - 1] = var109;
                class568.field8061[var107 - 1] = var108;
                class42.field591[var107 - 1] = var106 == 0;
            }
            class108.field1547 = null;
            return true;
        } else if (class41.field578 == class108.field1547) {
            class464.method2773(class47.field695, -5709);
            class108.field1547 = null;
            return true;
        } else if (class231.field3206 == class108.field1547) {
            class452.method2726(11);
            class108.field1547 = null;
            return false;
        } else if (class545.field7704 == class108.field1547) {
            class529.method3148(0, class457.field6283);
            class108.field1547 = null;
            return false;
        } else if (class644.field9141 == class108.field1547) {
            if (class275.method1670(-97, class213.field3004)) {
                class658.field9294 = (int) ((float) class150.field2065.method193(2) * 2.5F);
            } else {
                class658.field9294 = class150.field2065.method193(2) * 30;
            }
            class108.field1547 = null;
            class269.field3632 = class564.field8023;
            return true;
        } else if (class656.field9283 == class108.field1547) {
            class176.field2397 = class164.method1019(class150.field2065.method194((byte) 119), false);
            class108.field1547 = null;
            return true;
        } else if (class62.field835 == class108.field1547) {
            class558.method3344(-25520);
            class345.method1981(-82);
            class108.field1547 = null;
            return true;
        } else if (class440.field6033 == class108.field1547) {
            class150.field2065.field330 += 28;
            if (class150.field2065.method151(-40)) {
                class700.method3948((byte) 41, class150.field2065, class150.field2065.field330 - 28);
            }
            class108.field1547 = null;
            return true;
        } else if (class589.field8462 == class108.field1547) {
            if (class455.field6257 != null) {
                class518.method3079(false, -1, -1, true, class674.field9500.field5133.method1962(0));
            }
            byte[] var110 = new byte[class542.field7582];
            class150.field2065.method3462(0, 0, var110, class542.field7582);
            String var111 = class748.method4161(0, var110, class542.field7582, true);
            class592.method3516(9834, class674.field9500.field5158.method1006(0) == 1, true, var111, class379.field5339);
            class108.field1547 = null;
            return true;
        } else if (class99.field1432 == class108.field1547) {
            boolean var112 = class150.field2065.method194((byte) 119) == 1;
            String var113 = class150.field2065.method196((byte) -92);
            String var114 = var113;
            if (var112) {
                var114 = class150.field2065.method196((byte) -92);
            }
            int var115 = class150.field2065.method194((byte) 119);
            boolean var116 = false;
            if (var115 <= 1) {
                if (!(!class378.field5266 || class234.field3249) || class330.field4240) {
                    var116 = true;
                } else if (var115 <= 1 && class640.method3721(var114, (byte) 117)) {
                    var116 = true;
                }
            }
            if (!var116 && class535.field7502 == 0) {
                String var117 = class287.method1705(class66.method431(115, class150.field2065), (byte) 48);
                if (var115 == 2) {
                    class362.method2039(0, var113, -88, var117, "<img=1>" + var114, "<img=1>" + var113, -1, null, 24);
                } else if (var115 == 1) {
                    class362.method2039(0, var113, -116, var117, "<img=0>" + var114, "<img=0>" + var113, -1, null, 24);
                } else {
                    class362.method2039(0, var113, -110, var117, var114, var113, -1, null, 24);
                }
            }
            class108.field1547 = null;
            return true;
        } else if (class562.field7994 == class108.field1547) {
            class554.field7826.method4093(true);
            class151.field2087 += 32;
            class108.field1547 = null;
            return true;
        } else if (class611.field8692 == class108.field1547) {
            class316.method1828(class150.field2065, class542.field7582, class379.field5339, (byte) -47);
            class108.field1547 = null;
            return true;
        } else {
            int var118 = 85 / ((arg0 + 11) / 62);
            if (class40.field554 == class108.field1547) {
                int var119 = class150.field2065.method202(54);
                int var120 = class150.field2065.method167((byte) 102);
                if (var120 == 65535) {
                    var120 = -1;
                }
                class558.method3344(-25520);
                class388.method2360(1, 4, var119, var120, -1);
                class108.field1547 = null;
                return true;
            } else if (class31.field472 == class108.field1547) {
                int var121 = class150.field2065.method143(false);
                int var122 = class150.field2065.method193(2);
                class558.method3344(-25520);
                class632.method3675(var122, (byte) 115, var121, true);
                class108.field1547 = null;
                return true;
            } else if (class651.field9205 == class108.field1547) {
                class574.method3422(3, class150.field2065.method196((byte) -92));
                class108.field1547 = null;
                return true;
            } else if (class614.field8738 == class108.field1547) {
                class464.method2773(class710.field9911, -5709);
                class108.field1547 = null;
                return true;
            } else if (class621.field8842 == class108.field1547) {
                int var123 = class150.field2065.method143(false);
                int var124 = class150.field2065.method194((byte) 119);
                if (var123 == 255) {
                    var123 = -1;
                    var124 = -1;
                }
                class753.method4177(var124, var123, true);
                class108.field1547 = null;
                return true;
            } else if (class676.field9529 == class108.field1547) {
                int var125 = class150.field2065.method189(255);
                class558.method3344(-25520);
                if (var125 == -1) {
                    class374.field5167 = -1;
                    class13.field180 = -1;
                } else {
                    int var126 = (var125 & 0xFFFC1E5) >> 14;
                    int var127 = var126 - class179.field2535;
                    int var128 = var125 & 0x3FFF;
                    int var129 = var128 - class510.field7109;
                    if (var127 < 0) {
                        var127 = 0;
                    } else if (var127 >= class514.field7179) {
                        var127 = class514.field7179;
                    }
                    if (var129 < 0) {
                        var129 = 0;
                    } else if (var129 >= class456.field6281) {
                        var129 = class456.field6281;
                    }
                    class13.field180 = (var127 << 9) + 256;
                    class374.field5167 = (var129 << 9) + 256;
                }
                class108.field1547 = null;
                return true;
            } else if (class72.field1001 == class108.field1547) {
                int var130 = class150.field2065.method144(-72);
                int var131 = class150.field2065.method174(0);
                class558.method3344(-25520);
                class483.method2843((byte) 75, var130, var131);
                class108.field1547 = null;
                return true;
            } else if (class446.field6092 == class108.field1547) {
                class108.field1547 = null;
                return false;
            } else if (class13.field190 == class108.field1547) {
                class464.method2773(class714.field10126, -5709);
                class108.field1547 = null;
                return true;
            } else if (class635.field9037 == class108.field1547) {
                class558.method3344(-25520);
                class396.method2412(40960);
                class108.field1547 = null;
                return true;
            } else if (class676.field9522 == class108.field1547) {
                int var132 = class150.field2065.method143(false);
                int var133 = var132 >> 2;
                int var134 = var132 & 0x3;
                int var135 = class197.field2850[var133];
                int var136 = class150.field2065.method189(255);
                int var137 = var136 >> 28 & 0x3;
                int var138 = var136 >> 14 & 0x3FFF;
                int var139 = var136 & 0x3FFF;
                int var140 = class150.field2065.method168(-16785);
                if (var140 == 65535) {
                    var140 = -1;
                }
                int var141 = var139 - class510.field7109;
                int var142 = var138 - class179.field2535;
                class248.method1571(var135, var137, var142, var133, 20, var140, var134, var141);
                class108.field1547 = null;
                return true;
            } else if (class165.field2261 == class108.field1547) {
                int var143 = class150.field2065.method167((byte) 74);
                int[] var144 = new int[4];
                for (int var145 = 0; var145 < 4; var145++) {
                    var144[var145] = class150.field2065.method167((byte) 127);
                }
                int var146 = class150.field2065.method174(0);
                class15 var147 = (class15) class403.field5587.method1381(true, (long) var143);
                if (var147 != null) {
                    class81.method485(var147.field204, var144, (byte) -82, var146);
                }
                class108.field1547 = null;
                return true;
            } else if (class680.field9577 == class108.field1547) {
                boolean var148 = class150.field2065.method194((byte) 119) == 1;
                String var149 = class150.field2065.method196((byte) -92);
                String var150 = var149;
                if (var148) {
                    var150 = class150.field2065.method196((byte) -92);
                }
                long var151 = class150.field2065.method153(-65);
                long var153 = (long) class150.field2065.method193(2);
                long var155 = (long) class150.field2065.method186((byte) 103);
                int var157 = class150.field2065.method194((byte) 119);
                long var158 = (var153 << 32) + var155;
                boolean var160 = false;
                int var161 = 0;
                while (true) {
                    if (var161 >= 100) {
                        if (var157 <= 1) {
                            if (!(!class378.field5266 || class234.field3249) || class330.field4240) {
                                var160 = true;
                            } else if (class640.method3721(var150, (byte) 117)) {
                                var160 = true;
                            }
                        }
                        break;
                    }
                    if (class748.field10417[var161] == var158) {
                        var160 = true;
                        break;
                    }
                    var161++;
                }
                if (!var160 && class535.field7502 == 0) {
                    class748.field10417[class616.field8774] = var158;
                    class616.field8774 = (class616.field8774 + 1) % 100;
                    String var162 = class287.method1705(class66.method431(99, class150.field2065), (byte) 48);
                    if (var157 == 2 || var157 == 3) {
                        class362.method2039(0, var149, -119, var162, "<img=1>" + var150, "<img=1>" + var149, -1, class75.method465((byte) 106, var151), 9);
                    } else if (var157 == 1) {
                        class362.method2039(0, var149, -92, var162, "<img=0>" + var150, "<img=0>" + var149, -1, class75.method465((byte) 124, var151), 9);
                    } else {
                        class362.method2039(0, var149, -121, var162, var150, var149, -1, class75.method465((byte) 106, var151), 9);
                    }
                }
                class108.field1547 = null;
                return true;
            } else if (class616.field8773 == class108.field1547) {
                class157.field2141 = class150.field2065.method173(-3);
                class269.field3632 = class564.field8023;
                class108.field1547 = null;
                return true;
            } else if (class278.field3708 == class108.field1547) {
                int var163 = class150.field2065.method192(54);
                class558.method3344(-25520);
                class6.field54 = var163;
                class108.field1547 = null;
                return true;
            } else if (class205.field2939 == class108.field1547) {
                boolean var164 = class150.field2065.method194((byte) 119) == 1;
                String var165 = class150.field2065.method196((byte) -92);
                String var166 = var165;
                if (var164) {
                    var166 = class150.field2065.method196((byte) -92);
                }
                long var167 = class150.field2065.method153(-100);
                long var169 = (long) class150.field2065.method193(2);
                long var171 = (long) class150.field2065.method186((byte) 116);
                int var173 = class150.field2065.method194((byte) 119);
                int var174 = class150.field2065.method193(2);
                long var175 = (var169 << 32) + var171;
                boolean var177 = false;
                int var178 = 0;
                while (true) {
                    if (var178 >= 100) {
                        if (var173 <= 1 && class640.method3721(var166, (byte) 117)) {
                            var177 = true;
                        }
                        break;
                    }
                    if (class748.field10417[var178] == var175) {
                        var177 = true;
                        break;
                    }
                    var178++;
                }
                if (!var177 && class535.field7502 == 0) {
                    class748.field10417[class616.field8774] = var175;
                    class616.field8774 = (class616.field8774 + 1) % 100;
                    String var179 = class225.field3151.method3658((byte) -45, var174).method2381((byte) 55, class150.field2065);
                    if (var173 == 2) {
                        class362.method2039(0, var165, -114, var179, "<img=1>" + var166, "<img=1>" + var165, var174, class75.method465((byte) 75, var167), 20);
                    } else if (var173 == 1) {
                        class362.method2039(0, var165, -90, var179, "<img=0>" + var166, "<img=0>" + var165, var174, class75.method465((byte) 90, var167), 20);
                    } else {
                        class362.method2039(0, var165, -90, var179, var166, var165, var174, class75.method465((byte) 54, var167), 20);
                    }
                }
                class108.field1547 = null;
                return true;
            } else if (class413.field5752 == class108.field1547) {
                int var180 = class150.field2065.method192(83);
                int var181 = class150.field2065.method141(0);
                int var182 = class150.field2065.method194((byte) 119);
                class253.field3504[var182] = var181;
                class149.field2061[var182] = var180;
                class260.field3534[var182] = 1;
                int var183 = class55.field768[var182] - 1;
                for (int var184 = 0; var184 < var183; var184++) {
                    if (class80.field1099[var184] <= var181) {
                        class260.field3534[var182] = var184 + 2;
                    }
                }
                class491.field6607[class136.method878(31, class404.field5616++)] = var182;
                class108.field1547 = null;
                return true;
            } else if (class244.field3389 == class108.field1547) {
                class486.field6561 = class150.field2065.method194((byte) 119);
                class108.field1547 = null;
                return true;
            } else if (class153.field2111 == class108.field1547) {
                String var185 = class150.field2065.method196((byte) -92);
                String var186 = class287.method1705(class66.method431(102, class150.field2065), (byte) 48);
                class441.method2638(var185, 0, (byte) 17, var185, var186, var185, 6);
                class108.field1547 = null;
                return true;
            } else if (class480.field6523 == class108.field1547) {
                int var187 = class150.field2065.method193(2);
                int var188 = class150.field2065.method167((byte) 127);
                int var189 = class150.field2065.method168(-16785);
                int var190 = class150.field2065.method141(0);
                class558.method3344(-25520);
                class388.method2360(7, 4, var190, var189 | var188 << 16, var187);
                class108.field1547 = null;
                return true;
            } else if (class702.field9779 == class108.field1547) {
                for (int var191 = 0; var191 < class40.field563.length; var191++) {
                    if (class40.field563[var191] != null) {
                        class40.field563[var191].field8348 = null;
                        class40.field563[var191].field8317 = -1;
                    }
                }
                for (int var192 = 0; var192 < class287.field3776; var192++) {
                    class312.field4003[var192].field204.field8348 = null;
                    class312.field4003[var192].field204.field8317 = -1;
                }
                class108.field1547 = null;
                return true;
            } else if (class233.field3238 == class108.field1547) {
                int var193 = class150.field2065.method193(2);
                class655 var194;
                if (class471.field6467 == var193) {
                    var194 = class473.field6483;
                } else {
                    var194 = class40.field563[var193];
                }
                if (var194 == null) {
                    class108.field1547 = null;
                    return true;
                }
                int var195 = class150.field2065.method193(2);
                int var196 = class150.field2065.method194((byte) 119);
                boolean var197 = (var195 & 0x8000) != 0;
                if (var194.field9272 != null && var194.field9257 != null) {
                    boolean var198 = false;
                    if (var196 <= 1) {
                        if (!var197 && !(!class378.field5266 || class234.field3249) || class330.field4240) {
                            var198 = true;
                        } else if (class640.method3721(var194.field9272, (byte) 117)) {
                            var198 = true;
                        }
                    }
                    if (!var198 && class535.field7502 == 0) {
                        int var199 = -1;
                        String var200;
                        if (var197) {
                            var195 &= 0x7FFF;
                            class449 var201 = class149.method958(class150.field2065, (byte) 117);
                            var199 = var201.field6173;
                            var200 = var201.field6174.method2381((byte) 27, class150.field2065);
                        } else {
                            var200 = class287.method1705(class66.method431(83, class150.field2065), (byte) 48);
                        }
                        var194.field8314 = var200.trim();
                        var194.field8338 = 150;
                        var194.field8351 = var195 & 0xFF;
                        var194.field8346 = var195 >> 8;
                        int var202;
                        if (var196 == 1 || var196 == 2) {
                            var202 = var197 ? 17 : 1;
                        } else {
                            var202 = var197 ? 17 : 2;
                        }
                        if (var196 == 2) {
                            class362.method2039(0, var194.field9250, -95, var200, "<img=1>" + var194.method3791(-73, false), "<img=1>" + var194.method3790(true, -1), var199, null, var202);
                        } else if (var196 == 1) {
                            class362.method2039(0, var194.field9250, -95, var200, "<img=0>" + var194.method3791(-101, false), "<img=0>" + var194.method3790(true, -1), var199, null, var202);
                        } else {
                            class362.method2039(0, var194.field9250, -84, var200, var194.method3791(-95, false), var194.method3790(true, -1), var199, null, var202);
                        }
                    }
                }
                class108.field1547 = null;
                return true;
            } else if (class687.field9636 == class108.field1547) {
                int var203 = class150.field2065.method191(false);
                String var204 = class150.field2065.method196((byte) -92);
                class558.method3344(-25520);
                class501.method2996(-119, var203, var204);
                class108.field1547 = null;
                return true;
            } else if (class333.field4266 == class108.field1547) {
                class464.method2773(class345.field4396, -5709);
                class108.field1547 = null;
                return true;
            } else if (class592.field8543 == class108.field1547) {
                byte var205 = class150.field2065.method172(6849);
                int var206 = class150.field2065.method143(false);
                class558.method3344(-25520);
                class543.method3229(var205, var206, (byte) -82);
                class108.field1547 = null;
                return true;
            } else if (class494.field6938 == class108.field1547) {
                int var207 = class150.field2065.method189(255);
                int var208 = class150.field2065.method202(48);
                int var209 = class150.field2065.method191(false);
                class558.method3344(-25520);
                class388.method2360(5, 4, var207, var209, var208);
                class108.field1547 = null;
                return true;
            } else if (class426.field5901 == class108.field1547) {
                class464.method2773(class497.field6968, -5709);
                class108.field1547 = null;
                return true;
            } else if (class517.field7225 == class108.field1547) {
                int var210 = class150.field2065.method168(-16785);
                int var211 = class150.field2065.method202(113);
                class554.field7826.method4086((byte) 28, var211, var210);
                class108.field1547 = null;
                return true;
            } else if (class537.field7513 == class108.field1547) {
                class346.field4404 = class150.field2065.method146(true) << 3;
                class217.field3071 = class150.field2065.method194((byte) 119);
                class363.field4648 = class150.field2065.method172(6849) << 3;
                for (class731 var212 = (class731) class118.field1631.method1382(27901); var212 != null; var212 = (class731) class118.field1631.method1383(false)) {
                    int var214 = (int) (var212.field7166 >> 28 & 0x3L);
                    int var215 = (int) (var212.field7166 & 0x3FFFL);
                    int var216 = var215 - class179.field2535;
                    int var217 = (int) (var212.field7166 >> 14 & 0x3FFFL);
                    int var218 = var217 - class510.field7109;
                    if (class217.field3071 == var214 && class363.field4648 <= var216 && class363.field4648 + 8 > var216 && var218 >= class346.field4404 && var218 < class346.field4404 + 8) {
                        var212.method3065(-17363);
                        if (var216 >= 0 && var218 >= 0 && var216 < class514.field7179 && class456.field6281 > var218) {
                            class123.method791(var218, -27930, var216, class217.field3071);
                        }
                    }
                }
                for (class200 var213 = (class200) class503.field7030.method3118((byte) 73); var213 != null; var213 = (class200) class503.field7030.method3111(126)) {
                    if (class363.field4648 <= var213.field2900 && class363.field4648 + 8 > var213.field2900 && var213.field2895 >= class346.field4404 && (class346.field4404 + 8) > var213.field2895 && class217.field3071 == var213.field2893) {
                        var213.field2899 = 0;
                    }
                }
                class108.field1547 = null;
                return true;
            } else if (class108.field1547 == class105.field1535) {
                String var219 = class150.field2065.method196((byte) -92);
                Object[] var220 = new Object[var219.length() + 1];
                for (int var221 = var219.length() - 1; var221 >= 0; var221--) {
                    if (var219.charAt(var221) == 's') {
                        var220[var221 + 1] = class150.field2065.method196((byte) -92);
                    } else {
                        var220[var221 + 1] = Integer.valueOf(class150.field2065.method189(255));
                    }
                }
                var220[0] = Integer.valueOf(class150.field2065.method189(255));
                class558.method3344(-25520);
                class700 var222 = new class700();
                var222.field9757 = var220;
                class318.method1840(var222);
                class108.field1547 = null;
                return true;
            } else if (class114.field1606 == class108.field1547) {
                int var223 = class150.field2065.method167((byte) 73);
                int var224 = class150.field2065.method168(-16785);
                int var225 = class150.field2065.method144(-110);
                int var226 = class150.field2065.method168(-16785);
                int var227 = class150.field2065.method192(77);
                boolean var228 = (var227 & 0x80) != 0;
                int var229 = var227 & 0x7;
                int var230 = var227 >> 3 & 0xF;
                if (var230 == 15) {
                    var230 = -1;
                }
                if ((var225 >> 30) != 0) {
                    int var231 = (var225 & 0x3D12E9BC) >> 28;
                    int var232 = ((var225 & 0xFFFD6DD) >> 14) - class179.field2535;
                    int var233 = (var225 & 0x3FFF) - class510.field7109;
                    if (var232 >= 0 && var233 >= 0 && class514.field7179 > var232 && var233 < class456.field6281) {
                        int var234 = var232 * 512 + 256;
                        int var235 = var233 * 512 + 256;
                        int var236 = var231;
                        if (var231 < 3 && class753.method4175(-12388, var233, var232)) {
                            var236 = var231 + 1;
                        }
                        class236 var237 = new class236(var226, var223, class245.field3409, var231, var236, var234, class438.method2628(var234, var231, var235, (byte) -104) - var224, var235, var232, var232, var233, var233, var229);
                        class450.field6178.method3116(29066, new class677(var237));
                    }
                } else if (var225 >> 29 != 0) {
                    int var238 = var225 & 0xFFFF;
                    class15 var239 = (class15) class403.field5587.method1381(true, (long) var238);
                    if (var239 != null) {
                        if (var226 == 65535) {
                            var226 = -1;
                        }
                        class55 var240 = var239.field204;
                        boolean var241 = true;
                        int var242 = var228 ? var240.field8393 : var240.field8313;
                        if (var226 != -1 && var242 != -1) {
                            if (var226 == var242) {
                                class42 var243 = class267.field3625.method3986(-1, var226);
                                if (var243.field594 && var243.field585 != -1) {
                                    class103 var244 = class274.field3684.method1881((byte) -80, var243.field585);
                                    int var245 = var244.field1476;
                                    if (var245 == 0 || var245 == 2) {
                                        var241 = false;
                                    } else if (var245 == 1) {
                                        var241 = true;
                                    }
                                }
                            } else {
                                class42 var246 = class267.field3625.method3986(-1, var226);
                                class42 var247 = class267.field3625.method3986(-1, var242);
                                if (var246.field585 != -1 && var247.field585 != -1) {
                                    class103 var248 = class274.field3684.method1881((byte) -80, var246.field585);
                                    class103 var249 = class274.field3684.method1881((byte) -80, var247.field585);
                                    if (var248.field1490 < var249.field1490) {
                                        var241 = false;
                                    }
                                }
                            }
                        }
                        if (var241) {
                            if (var228) {
                                var240.field8318 = var224;
                                var240.field8398 = class245.field3409 + var223;
                                var240.field8358 = 0;
                                var240.field8316 = var230;
                                var240.field8393 = var226;
                                var240.field8320 = 0;
                                var240.field8369 = 1;
                                var240.field8406 = var229;
                                if (var240.field8398 > class245.field3409) {
                                    var240.field8358 = -1;
                                }
                                if (var240.field8393 != -1 && class245.field3409 == var240.field8398) {
                                    int var252 = class267.field3625.method3986(-1, var240.field8393).field585;
                                    if (var252 != -1) {
                                        class103 var253 = class274.field3684.method1881((byte) -80, var252);
                                        if (var253 != null && var253.field1472 != null && !var240.field8312) {
                                            class694.method3941(0, var253, var240, true);
                                        }
                                    }
                                }
                            } else {
                                var240.field8375 = 0;
                                var240.field8321 = var224;
                                var240.field8331 = class245.field3409 + var223;
                                var240.field8313 = var226;
                                var240.field8401 = 0;
                                var240.field8362 = var230;
                                var240.field8337 = 1;
                                var240.field8397 = var229;
                                if (class245.field3409 < var240.field8331) {
                                    var240.field8375 = -1;
                                }
                                if (var240.field8313 != -1 && class245.field3409 == var240.field8331) {
                                    int var250 = class267.field3625.method3986(-1, var240.field8313).field585;
                                    if (var250 != -1) {
                                        class103 var251 = class274.field3684.method1881((byte) -80, var250);
                                        if (var251 != null && var251.field1472 != null && !var240.field8312) {
                                            class694.method3941(0, var251, var240, true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if ((var225 >> 28) != 0) {
                    int var254 = var225 & 0xFFFF;
                    class655 var255;
                    if (class471.field6467 == var254) {
                        var255 = class473.field6483;
                    } else {
                        var255 = class40.field563[var254];
                    }
                    if (var255 != null) {
                        if (var226 == 65535) {
                            var226 = -1;
                        }
                        boolean var256 = true;
                        int var257 = var228 ? var255.field8393 : var255.field8313;
                        if (var226 != -1 && var257 != -1) {
                            if (var226 == var257) {
                                class42 var262 = class267.field3625.method3986(-1, var226);
                                if (var262.field594 && var262.field585 != -1) {
                                    class103 var263 = class274.field3684.method1881((byte) -80, var262.field585);
                                    int var264 = var263.field1476;
                                    if (var264 == 0 || var264 == 2) {
                                        var256 = false;
                                    } else if (var264 == 1) {
                                        var256 = true;
                                    }
                                }
                            } else {
                                class42 var258 = class267.field3625.method3986(-1, var226);
                                class42 var259 = class267.field3625.method3986(-1, var257);
                                if (var258.field585 != -1 && var259.field585 != -1) {
                                    class103 var260 = class274.field3684.method1881((byte) -80, var258.field585);
                                    class103 var261 = class274.field3684.method1881((byte) -80, var259.field585);
                                    if (var260.field1490 < var261.field1490) {
                                        var256 = false;
                                    }
                                }
                            }
                        }
                        if (var256) {
                            if (var228) {
                                var255.field8406 = var229;
                                var255.field8318 = var224;
                                var255.field8358 = 0;
                                var255.field8398 = class245.field3409 + var223;
                                var255.field8320 = 0;
                                var255.field8393 = var226;
                                var255.field8369 = 1;
                                var255.field8316 = var230;
                                if (class245.field3409 < var255.field8398) {
                                    var255.field8358 = -1;
                                }
                                if (var255.field8393 == 65535) {
                                    var255.field8393 = -1;
                                }
                                if (var255.field8393 != -1 && class245.field3409 == var255.field8398) {
                                    int var267 = class267.field3625.method3986(-1, var255.field8393).field585;
                                    if (var267 != -1) {
                                        class103 var268 = class274.field3684.method1881((byte) -80, var267);
                                        if (var268 != null && var268.field1472 != null && !var255.field8312) {
                                            class694.method3941(0, var268, var255, true);
                                        }
                                    }
                                }
                            } else {
                                var255.field8321 = var224;
                                var255.field8375 = 0;
                                var255.field8331 = class245.field3409 + var223;
                                var255.field8362 = var230;
                                var255.field8337 = 1;
                                var255.field8401 = 0;
                                var255.field8397 = var229;
                                var255.field8313 = var226;
                                if (var255.field8331 > class245.field3409) {
                                    var255.field8375 = -1;
                                }
                                if (var255.field8313 == 65535) {
                                    var255.field8313 = -1;
                                }
                                if (var255.field8313 != -1 && class245.field3409 == var255.field8331) {
                                    int var265 = class267.field3625.method3986(-1, var255.field8313).field585;
                                    if (var265 != -1) {
                                        class103 var266 = class274.field3684.method1881((byte) -80, var265);
                                        if (var266 != null && var266.field1472 != null && !var255.field8312) {
                                            class694.method3941(0, var266, var255, true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class108.field1547 = null;
                return true;
            } else if (class513.field7160 == class108.field1547) {
                int var269 = class150.field2065.method189(255);
                class156.field2134 = class379.field5339.method3583(var269, 2);
                class108.field1547 = null;
                return true;
            } else if (class70.field989 == class108.field1547) {
                int var270 = class150.field2065.method141(0);
                int var271 = class150.field2065.method168(-16785);
                class558.method3344(-25520);
                class399.method2420((byte) 110, var270, var271);
                class108.field1547 = null;
                return true;
            } else if (class265.field3616 == class108.field1547) {
                class721.field10183 = class150.field2065.method143(false);
                class431.field5933 = class150.field2065.method194((byte) 119);
                class108.field1547 = null;
                return true;
            } else if (class237.field3297 == class108.field1547) {
                boolean var272 = class150.field2065.method194((byte) 119) == 1;
                class558.method3344(-25520);
                class735.field10289 = var272;
                class108.field1547 = null;
                return true;
            } else if (class350.field4452 == class108.field1547) {
                int var273 = class150.field2065.method144(-116);
                int var274 = class150.field2065.method193(2);
                class558.method3344(-25520);
                class175.method1101(var274, -125, var273);
                class108.field1547 = null;
                return true;
            } else if (class748.field10426 == class108.field1547) {
                String var275 = class150.field2065.method196((byte) -92);
                boolean var276 = class150.field2065.method194((byte) 119) == 1;
                String var277;
                if (var276) {
                    var277 = class150.field2065.method196((byte) -92);
                } else {
                    var277 = var275;
                }
                int var278 = class150.field2065.method193(2);
                byte var279 = class150.field2065.method195(128);
                boolean var280 = false;
                if (var279 == -128) {
                    var280 = true;
                }
                if (var280) {
                    if (class656.field9289 == 0) {
                        class108.field1547 = null;
                        return true;
                    }
                    boolean var281 = false;
                    int var282;
                    for (var282 = 0; var282 < class656.field9289 && (!class265.field3618[var282].field2884.equals(var277) || class265.field3618[var282].field2880 != var278); var282++) {
                    }
                    if (var282 < class656.field9289) {
                        while (var282 < (class656.field9289 - 1)) {
                            class265.field3618[var282] = class265.field3618[var282 + 1];
                            var282++;
                        }
                        class656.field9289--;
                        class265.field3618[class656.field9289] = null;
                    }
                } else {
                    String var283 = class150.field2065.method196((byte) -92);
                    class199 var284 = new class199();
                    var284.field2879 = var275;
                    var284.field2884 = var277;
                    var284.field2883 = class53.method357(var284.field2884, 1);
                    var284.field2885 = var283;
                    var284.field2880 = var278;
                    var284.field2882 = var279;
                    int var285;
                    for (var285 = class656.field9289 - 1; var285 >= 0; var285--) {
                        int var286 = class265.field3618[var285].field2883.compareTo(var284.field2883);
                        if (var286 == 0) {
                            class265.field3618[var285].field2880 = var278;
                            class265.field3618[var285].field2882 = var279;
                            class265.field3618[var285].field2885 = var283;
                            if (var277.equals(class473.field6483.field9272)) {
                                class207.field2950 = var279;
                            }
                            class724.field10195 = class564.field8023;
                            class108.field1547 = null;
                            return true;
                        }
                        if (var286 < 0) {
                            break;
                        }
                    }
                    if (class265.field3618.length <= class656.field9289) {
                        class108.field1547 = null;
                        return true;
                    }
                    for (int var287 = class656.field9289 - 1; var287 > var285; var287--) {
                        class265.field3618[var287 + 1] = class265.field3618[var287];
                    }
                    if (class656.field9289 == 0) {
                        class265.field3618 = new class199[100];
                    }
                    class265.field3618[var285 + 1] = var284;
                    class656.field9289++;
                    if (var277.equals(class473.field6483.field9272)) {
                        class207.field2950 = var279;
                    }
                }
                class108.field1547 = null;
                class724.field10195 = class564.field8023;
                return true;
            } else if (class517.field7201 == class108.field1547) {
                class464.method2773(class53.field744, -5709);
                class108.field1547 = null;
                return true;
            } else if (class47.field677 == class108.field1547) {
                class393.method2394(-15586);
                class108.field1547 = null;
                return true;
            } else if (class45.field657 == class108.field1547) {
                int var288 = class150.field2065.method168(-16785);
                int var289 = class150.field2065.method191(false);
                int var290 = class150.field2065.method202(-117);
                class558.method3344(-25520);
                class471.method2810(var290, (var288 << 16) + var289, 11);
                class108.field1547 = null;
                return true;
            } else if (class352.field4546 == class108.field1547) {
                byte var291 = class150.field2065.method146(true);
                int var292 = class150.field2065.method168(-16785);
                class558.method3344(-25520);
                class748.method4160(1, var292, var291);
                class108.field1547 = null;
                return true;
            } else if (class667.field9395 == class108.field1547) {
                boolean var293 = class150.field2065.method194((byte) 119) == 1;
                String var294 = class150.field2065.method196((byte) -92);
                String var295 = var294;
                if (var293) {
                    var295 = class150.field2065.method196((byte) -92);
                }
                long var296 = (long) class150.field2065.method193(2);
                long var298 = (long) class150.field2065.method186((byte) 114);
                int var300 = class150.field2065.method194((byte) 119);
                long var301 = (var296 << 32) + var298;
                boolean var303 = false;
                int var304 = 0;
                while (true) {
                    if (var304 >= 100) {
                        if (var300 <= 1) {
                            if (!(!class378.field5266 || class234.field3249) || class330.field4240) {
                                var303 = true;
                            } else if (class640.method3721(var295, (byte) 117)) {
                                var303 = true;
                            }
                        }
                        break;
                    }
                    if (class748.field10417[var304] == var301) {
                        var303 = true;
                        break;
                    }
                    var304++;
                }
                if (!var303 && class535.field7502 == 0) {
                    class748.field10417[class616.field8774] = var301;
                    class616.field8774 = (class616.field8774 + 1) % 100;
                    String var305 = class287.method1705(class66.method431(116, class150.field2065), (byte) 48);
                    if (var300 == 2) {
                        class362.method2039(0, var294, -126, var305, "<img=1>" + var295, "<img=1>" + var294, -1, null, 7);
                    } else if (var300 == 1) {
                        class362.method2039(0, var294, -108, var305, "<img=0>" + var295, "<img=0>" + var294, -1, null, 7);
                    } else {
                        class362.method2039(0, var294, -88, var305, var295, var294, -1, null, 3);
                    }
                }
                class108.field1547 = null;
                return true;
            } else if (class256.field3512 == class108.field1547) {
                int var306 = class150.field2065.method141(0);
                int var307 = class150.field2065.method193(2);
                int var308 = class150.field2065.method193(2);
                int var309 = class150.field2065.method168(-16785);
                class558.method3344(-25520);
                class234.method1499((byte) 89, var309, var308, var307, var306);
                class108.field1547 = null;
                return true;
            } else if (class62.field834 == class108.field1547) {
                int var310 = class150.field2065.method202(123);
                String var311 = class150.field2065.method196((byte) -92);
                class558.method3344(-25520);
                class753.method4176(var311, var310, 3);
                class108.field1547 = null;
                return true;
            } else if (class742.field10342 == class108.field1547) {
                int var312 = class150.field2065.method193(2);
                if (var312 == 65535) {
                    var312 = -1;
                }
                int var313 = class150.field2065.method194((byte) 119);
                int var314 = class150.field2065.method193(2);
                int var315 = class150.field2065.method194((byte) 119);
                int var316 = class150.field2065.method193(2);
                class151.method967(0, var315, var313, var312, var316, var314);
                class108.field1547 = null;
                return true;
            } else if (class77.field1057 == class108.field1547) {
                if (class312.field4004 != -1) {
                    class217.method1420(class312.field4004, 0, -6248);
                }
                class108.field1547 = null;
                return true;
            } else if (class675.field9506 == class108.field1547) {
                boolean var317 = class150.field2065.method194((byte) 119) == 1;
                byte[] var318 = new byte[class542.field7582 - 1];
                class150.field2065.method149(var318, 0, (byte) -50, class542.field7582 - 1);
                class197.method1330((byte) 65, var318, var317);
                class108.field1547 = null;
                return true;
            } else if (class616.field8777 == class108.field1547) {
                boolean var319 = class150.field2065.method194((byte) 119) == 1;
                String var320 = class150.field2065.method196((byte) -92);
                String var321 = var320;
                if (var319) {
                    var321 = class150.field2065.method196((byte) -92);
                }
                long var322 = (long) class150.field2065.method193(2);
                long var324 = (long) class150.field2065.method186((byte) 115);
                int var326 = class150.field2065.method194((byte) 119);
                int var327 = class150.field2065.method193(2);
                long var328 = (var322 << 32) + var324;
                boolean var330 = false;
                int var331 = 0;
                while (true) {
                    if (var331 >= 100) {
                        if (var326 <= 1 && class640.method3721(var321, (byte) 117)) {
                            var330 = true;
                        }
                        break;
                    }
                    if (class748.field10417[var331] == var328) {
                        var330 = true;
                        break;
                    }
                    var331++;
                }
                if (!var330 && class535.field7502 == 0) {
                    class748.field10417[class616.field8774] = var328;
                    class616.field8774 = (class616.field8774 + 1) % 100;
                    String var332 = class225.field3151.method3658((byte) -45, var327).method2381((byte) 40, class150.field2065);
                    if (var326 == 2) {
                        class362.method2039(0, var320, -125, var332, "<img=1>" + var321, "<img=1>" + var320, var327, null, 18);
                    } else if (var326 == 1) {
                        class362.method2039(0, var320, -94, var332, "<img=0>" + var321, "<img=0>" + var320, var327, null, 18);
                    } else {
                        class362.method2039(0, var320, -116, var332, var321, var320, var327, null, 18);
                    }
                }
                class108.field1547 = null;
                return true;
            } else if (class672.field9449 == class108.field1547) {
                int var333 = class150.field2065.method167((byte) 95);
                int var334 = class150.field2065.method143(false);
                class558.method3344(-25520);
                if (var334 == 2) {
                    class501.method2997((byte) 5);
                }
                class312.field4004 = var333;
                class191.method1271(var333, (byte) -124);
                class636.method3700(false, 1);
                class318.method1836(class312.field4004);
                for (int var335 = 0; var335 < 100; var335++) {
                    class142.field1966[var335] = true;
                }
                class108.field1547 = null;
                return true;
            } else if (class384.field5396 == class108.field1547) {
                class666.field9387 = class564.field8023;
                class693.field9691 = 1;
                class108.field1547 = null;
                return true;
            } else if (class468.field6396 == class108.field1547) {
                class432.field5938 = class150.field2065.method194((byte) 119);
                class269.field3632 = class564.field8023;
                class108.field1547 = null;
                return true;
            } else if (class253.field3502 == class108.field1547) {
                int var336 = class150.field2065.method193(2);
                if (var336 == 65535) {
                    var336 = -1;
                }
                int var337 = class150.field2065.method194((byte) 119);
                int var338 = class150.field2065.method193(2);
                int var339 = class150.field2065.method194((byte) 119);
                class167.method1060(var338, (byte) 126, true, var336, 256, var337, var339);
                class108.field1547 = null;
                return true;
            } else if (class705.field9801 == class108.field1547) {
                class464.method2773(class710.field9912, -5709);
                class108.field1547 = null;
                return true;
            } else if (class399.field5522 == class108.field1547) {
                int var340 = class150.field2065.method193(2);
                int var341 = class150.field2065.method194((byte) 119);
                boolean var342 = (var341 & 0x1) == 1;
                while (class542.field7582 > class150.field2065.field330) {
                    int var343 = class150.field2065.method190(-27226);
                    int var344 = class150.field2065.method193(2);
                    int var345 = 0;
                    if (var344 != 0) {
                        var345 = class150.field2065.method194((byte) 119);
                        if (var345 == 255) {
                            var345 = class150.field2065.method189(255);
                        }
                    }
                    class12.method66(var344 - 1, var345, var343, 0, var342, var340);
                }
                class712.field10100[class136.method878(class663.field9360++, 31)] = var340;
                class108.field1547 = null;
                return true;
            } else if (class413.field5759 == class108.field1547) {
                int var346 = class150.field2065.method144(-87);
                int var347 = class150.field2065.method167((byte) 125);
                if (var347 == 65535) {
                    var347 = -1;
                }
                class558.method3344(-25520);
                class388.method2360(2, 4, var346, var347, -1);
                class108.field1547 = null;
                return true;
            } else if (class416.field5796 == class108.field1547) {
                int var348 = class150.field2065.method169(255);
                int var349 = class150.field2065.method189(255);
                int var350 = class150.field2065.method173(-3);
                class558.method3344(-25520);
                class375.method2261(var350, var348, var349, false);
                class108.field1547 = null;
                return true;
            } else if (class231.field3212 == class108.field1547) {
                int var351 = class150.field2065.method165(true);
                int var352 = class150.field2065.method141(0);
                class558.method3344(-25520);
                class458.method2750(var352, var351, 5);
                class108.field1547 = null;
                return true;
            } else if (class230.field3199 == class108.field1547) {
                class139.method896(class542.field7582, (byte) -102, class150.field2065);
                class108.field1547 = null;
                return true;
            } else if (class47.field691 == class108.field1547) {
                class363.field4648 = class150.field2065.method146(true) << 3;
                class346.field4404 = class150.field2065.method172(6849) << 3;
                class217.field3071 = class150.field2065.method192(101);
                class108.field1547 = null;
                return true;
            } else if (class734.field10278 == class108.field1547) {
                int var353 = class150.field2065.method144(-73);
                int var354 = class150.field2065.method189(255);
                class558.method3344(-25520);
                class14 var355 = (class14) class426.field5894.method1381(true, (long) var354);
                class14 var356 = (class14) class426.field5894.method1381(true, (long) var353);
                if (var356 != null) {
                    class197.method1325(var356, (byte) 100, false, var355 == null || var355.field194 != var356.field194);
                }
                if (var355 != null) {
                    var355.method3065(-17363);
                    class426.field5894.method1387(var355, (long) var353, (byte) -103);
                }
                class712 var357 = class733.method4073(true, var354);
                if (var357 != null) {
                    class116.method764(var357, -1176833464);
                }
                class712 var358 = class733.method4073(true, var353);
                if (var358 != null) {
                    class116.method764(var358, -1176833464);
                    class645.method3740(true, (byte) 87, var358);
                }
                if (class312.field4004 != -1) {
                    class217.method1420(class312.field4004, 1, -6248);
                }
                class108.field1547 = null;
                return true;
            } else if (class54.field755 == class108.field1547) {
                int var359 = class150.field2065.method174(0);
                int var360 = class150.field2065.method191(false);
                if (var360 == 65535) {
                    var360 = -1;
                }
                int var361 = class150.field2065.method143(false);
                class692.method3938(var359, (byte) -68, var360, var361);
                class108.field1547 = null;
                return true;
            } else if (class652.field9220 == class108.field1547) {
                int var362 = class150.field2065.method201((byte) -100);
                int var363 = class150.field2065.method174(0);
                int var364 = class150.field2065.method168(-16785);
                if (var364 == 65535) {
                    var364 = -1;
                }
                class69.method442(false, var364, var362, var363);
                class108.field1547 = null;
                return true;
            } else if (class261.field3561 == class108.field1547) {
                int var365 = class150.field2065.method174(0);
                int var366 = class150.field2065.method191(false);
                class554.field7826.method4090(0, var366, var365);
                class108.field1547 = null;
                return true;
            } else if (class459.field6312 == class108.field1547) {
                int var367 = class150.field2065.method193(2);
                int var368 = class150.field2065.method167((byte) 99);
                class558.method3344(-25520);
                class747.method4151(0, var367, var368, (byte) -108);
                class108.field1547 = null;
                return true;
            } else if (class375.field5200 == class108.field1547) {
                int var369 = class150.field2065.method191(false);
                int var370 = class150.field2065.method144(-103);
                class558.method3344(-25520);
                class375.method2262((byte) 24, var369, var370);
                class108.field1547 = null;
                return true;
            } else if (class599.field8596 == class108.field1547) {
                int var371 = class150.field2065.method144(-98);
                class558.method3344(-25520);
                class388.method2360(3, 4, var371, -1, -1);
                class108.field1547 = null;
                return true;
            } else if (class456.field6278 == class108.field1547) {
                int var372 = class150.field2065.method202(-120);
                class558.method3344(-25520);
                class14 var373 = (class14) class426.field5894.method1381(true, (long) var372);
                if (var373 != null) {
                    class197.method1325(var373, (byte) 42, false, true);
                }
                if (class240.field3352 != null) {
                    class116.method764(class240.field3352, -1176833464);
                    class240.field3352 = null;
                }
                class108.field1547 = null;
                return true;
            } else if (class8.field69 == class108.field1547) {
                int var374 = class150.field2065.method193(2);
                int var375 = class150.field2065.method167((byte) 97);
                if (var375 == 65535) {
                    var375 = -1;
                }
                int var376 = class150.field2065.method141(0);
                int var377 = class150.field2065.method167((byte) 90);
                class558.method3344(-25520);
                if (var377 == 65535) {
                    var377 = -1;
                }
                for (int var378 = var377; var378 <= var375; var378++) {
                    long var379 = ((long) var376 << 32) + (long) var378;
                    class94 var381 = (class94) class331.field4247.method1381(true, var379);
                    class94 var382;
                    if (var381 != null) {
                        var382 = new class94(var381.field1372, var374);
                        var381.method3065(-17363);
                    } else if (var378 == -1) {
                        var382 = new class94(class733.method4073(true, var376).field10104.field1372, var374);
                    } else {
                        var382 = new class94(0, var374);
                    }
                    class331.field4247.method1387(var382, var379, (byte) -120);
                }
                class108.field1547 = null;
                return true;
            } else if (class158.field2145 == class108.field1547) {
                int var383 = class150.field2065.method202(105);
                int var384 = class150.field2065.method193(2);
                class554.field7826.method4090(0, var384, var383);
                class108.field1547 = null;
                return true;
            } else if (class209.field2977 == class108.field1547) {
                int var385 = class150.field2065.method194((byte) 119);
                boolean var386 = (var385 & 0x1) == 1;
                String var387 = class150.field2065.method196((byte) -92);
                String var388 = class150.field2065.method196((byte) -92);
                if (var388.equals("")) {
                    var388 = var387;
                }
                String var389 = class150.field2065.method196((byte) -92);
                String var390 = class150.field2065.method196((byte) -92);
                if (var390.equals("")) {
                    var390 = var389;
                }
                if (var386) {
                    for (int var391 = 0; var391 < class458.field6302; var391++) {
                        if (class144.field1996[var391].equals(var390)) {
                            class46.field674[var391] = var387;
                            class144.field1996[var391] = var388;
                            class270.field3639[var391] = var389;
                            class545.field7697[var391] = var390;
                            break;
                        }
                    }
                } else {
                    class46.field674[class458.field6302] = var387;
                    class144.field1996[class458.field6302] = var388;
                    class270.field3639[class458.field6302] = var389;
                    class545.field7697[class458.field6302] = var390;
                    class272.field3671[class458.field6302] = class136.method878(var385, 2) == 2;
                    class458.field6302++;
                }
                class666.field9387 = class564.field8023;
                class108.field1547 = null;
                return true;
            } else if (class539.field7538 == class108.field1547) {
                int var392 = class150.field2065.method193(2);
                int var393 = class150.field2065.method194((byte) 119);
                boolean var394 = (var393 & 0x1) == 1;
                class504.method3020(114, var392, var394);
                int var395 = class150.field2065.method193(2);
                for (int var396 = 0; var396 < var395; var396++) {
                    int var397 = class150.field2065.method143(false);
                    if (var397 == 255) {
                        var397 = class150.field2065.method141(0);
                    }
                    int var398 = class150.field2065.method168(-16785);
                    class12.method66(var398 - 1, var397, var396, 0, var394, var392);
                }
                class712.field10100[class136.method878(class663.field9360++, 31)] = var392;
                class108.field1547 = null;
                return true;
            } else if (class399.field5525 == class108.field1547) {
                int var399 = class150.field2065.method168(-16785);
                class558.method3344(-25520);
                class49.method334((byte) -53, var399);
                class108.field1547 = null;
                return true;
            } else if (class169.field2309 == class108.field1547) {
                int var400 = class150.field2065.method190(-27226);
                int var401 = class150.field2065.method189(255);
                int var402 = class150.field2065.method194((byte) 119);
                String var403 = "";
                String var404 = var403;
                if ((var402 & 0x1) != 0) {
                    var403 = class150.field2065.method196((byte) -92);
                    if ((var402 & 0x2) == 0) {
                        var404 = var403;
                    } else {
                        var404 = class150.field2065.method196((byte) -92);
                    }
                }
                String var405 = class150.field2065.method196((byte) -92);
                if (var400 == 99) {
                    class645.method3738(var405, (byte) -49);
                } else if (var404.equals("") || !class640.method3721(var404, (byte) 117)) {
                    class441.method2638(var404, var401, (byte) 17, var403, var405, var403, var400);
                } else {
                    class108.field1547 = null;
                    return true;
                }
                class108.field1547 = null;
                return true;
            } else if (class699.field9741 == class108.field1547) {
                class464.method2773(class499.field6985, -5709);
                class108.field1547 = null;
                return true;
            } else if (class690.field9669 == class108.field1547) {
                int var406 = class150.field2065.method167((byte) 101);
                int var407 = class150.field2065.method194((byte) 119);
                boolean var408 = (var407 & 0x1) == 1;
                class267.method1638(35, var406, var408);
                class712.field10100[class136.method878(31, class663.field9360++)] = var406;
                class108.field1547 = null;
                return true;
            } else {
                class233.method1495((byte) -78, null, "T1 - " + (class108.field1547 == null ? -1 : class108.field1547.method956((byte) 27)) + "," + (class23.field262 == null ? -1 : class23.field262.method956((byte) 27)) + "," + (class545.field7701 == null ? -1 : class545.field7701.method956((byte) 27)) + " - " + class542.field7582);
                class529.method3148(0, false);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V", line = 3650)
    public final void method120(int arg0, int arg1, int arg2) {
        field963++;
        int[] var4 = this.field967.method590(arg0, arg1, this.field974, this.field959);
        int[] var5 = new int[this.field974 * this.field959];
        this.field961.method349(this.field959, this.field974, (byte) 122, 0, 0, var5, 0);
        if (arg2 == 0) {
            for (int var6 = 0; var6 < this.field959; var6++) {
                int var7 = this.field974 * var6;
                for (int var8 = 0; var8 < this.field974; var8++) {
                    var5[var7 + var8] = class747.method4153(class136.method878(var4[var7 + var8], 721354752) << 8, class136.method878(var5[var7 + var8], 16777215));
                }
            }
        } else if (arg2 == 1) {
            for (int var15 = 0; var15 < this.field959; var15++) {
                int var16 = this.field974 * var15;
                for (int var17 = 0; var17 < this.field974; var17++) {
                    var5[var16 + var17] = class747.method4153(class136.method878(var5[var16 + var17], 16777215), class136.method878(var4[var16 + var17] << 16, -16772918));
                }
            }
        } else if (arg2 == 2) {
            for (int var12 = 0; var12 < this.field959; var12++) {
                int var13 = this.field974 * var12;
                for (int var14 = 0; var14 < this.field974; var14++) {
                    var5[var13 + var14] = class747.method4153(class136.method878(var5[var13 + var14], 16777215), class136.method878(var4[var13 + var14] << 24, -12877514));
                }
            }
        } else if (arg2 == 3) {
            for (int var9 = 0; var9 < this.field959; var9++) {
                int var10 = this.field974 * var9;
                for (int var11 = 0; var11 < this.field974; var11++) {
                    var5[var10 + var11] = class747.method4153(class136.method878(var5[var10 + var11], 16777215), var4[var10 + var11] == 0 ? 0 : -16777216);
                }
            }
        }
        this.method441(0, 0, this.field974, this.field959, var5, 0, this.field974);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "()I", line = 3772)
    public final int method115() {
        field969++;
        return this.field974;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(IIII)V", line = 3782)
    public final void method106(int arg0, int arg1, int arg2, int arg3) {
        this.field973 = arg2;
        this.field966 = arg3;
        this.field968 = arg0;
        field957++;
        this.field970 = arg1;
        this.field948 = this.field968 != 0 || this.field970 != 0 || this.field973 != 0 || this.field966 != 0;
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "()I", line = 3799)
    public final int method116() {
        field953++;
        return this.field974 + this.field968 + this.field973;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIIII)V", line = 3807)
    public final void method107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field976++;
        class173 var9 = this.field967.method2891(-111);
        class173 var10 = this.field967.method2872((byte) 31);
        this.field961.method521((byte) -73, this.field972 || this.field971 || (arg7 & 0x1) == 0 ? class482.field6532 : class48.field711);
        this.field967.method2902((byte) -115);
        this.field967.method2933((byte) 84, this.field961);
        this.field967.method2945(arg6, 22630);
        this.field967.method2881(arg4, -1);
        this.field967.method2946(1, class123.field1675, (byte) 127);
        this.field967.method2923(-95, 1, class123.field1675);
        this.field967.method2912((byte) 9, arg5);
        var10.method1091(this.field961.method354(-23477, (float) this.field959), 1.0F, this.field961.method353((byte) 94, (float) this.field974), 1);
        if (this.field948) {
            arg2 = this.field974 * arg2 / this.method116();
            arg3 = this.field959 * arg3 / this.method108();
            arg0 += this.field968 * arg2 / this.field974;
            arg1 += this.field970 * arg3 / this.field959;
        }
        var9.method1091((float) arg3, 0.0F, (float) arg2, 1);
        var9.method851(arg0, arg1, 0);
        this.field967.method2925(class643.field9115, (byte) 117);
        this.field967.method2901((byte) 53);
        this.field967.method2879((byte) 3);
        this.field967.method2928(false);
        this.field967.method2946(1, class214.field3017, (byte) 127);
        this.field967.method2923(-105, 1, class214.field3017);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIII[III)V", line = 3846)
    private final void method441(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field961.method347(arg0, arg6, arg1, -2668, arg5, arg2, arg4, arg3);
        field952++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 3854)
    public final void method103(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class571 arg7, int arg8, int arg9) {
        field958++;
        class173 var11 = this.field967.method2891(-121);
        class173 var12 = this.field967.method2872((byte) -115);
        class82 var13 = (class82) arg7;
        class51 var14 = var13.field1111;
        this.field961.method521((byte) -93, this.field972 || this.field971 || (arg6 & 0x1) == 0 ? class482.field6532 : class48.field711);
        this.field967.method2902((byte) -81);
        this.field967.method2933((byte) 98, this.field961);
        this.field967.method2945(1, 22630);
        this.field967.method2881(1, -1);
        if (this.field948) {
            float var15 = (float) this.field974 / (float) this.method116();
            float var16 = (float) this.field959 / (float) this.method108();
            var11.method1080((arg5 - arg1) * var16, (arg3 - arg1) * var15, 0.0F, 0.0F, (byte) 20, 1.0F, (arg2 - arg0) * var15, 0.0F, (arg4 - arg0) * var16, 0.0F);
            var11.method1093(((float) this.field970 + arg1) * var16, 0.0F, (byte) -46, ((float) this.field968 + arg0) * var15);
        } else {
            var11.method1080(arg5 - arg1, arg3 - arg1, 0.0F, 0.0F, (byte) 64, 1.0F, arg2 - arg0, 0.0F, arg4 - arg0, 0.0F);
            var11.method1093(arg1, 0.0F, (byte) -46, arg0);
        }
        var12.method1091(this.field961.method354(-23477, (float) this.field959), 1.0F, this.field961.method353((byte) 118, (float) this.field974), 1);
        this.field967.method2925(class643.field9115, (byte) 116);
        this.field967.method2949(1, 7544);
        this.field967.method2933((byte) -81, var14);
        this.field967.method2878(class369.field4717, 28768, class253.field3501);
        this.field967.method2946(0, class214.field3017, (byte) 127);
        class173 var17 = this.field967.method2872((byte) 60);
        var17.method864(var11);
        var17.method851(-arg8, -arg9, 0);
        var17.method1086(1.0F, true, var14.method353((byte) 123, 1.0F), var14.method354(-23477, 1.0F));
        this.field967.method2925(class643.field9115, (byte) 117);
        this.field967.method2901((byte) 53);
        this.field967.method2879((byte) 3);
        this.field967.method2928(false);
        this.field967.method2946(0, class186.field2725, (byte) 127);
        this.field967.method2878(class369.field4717, 28768, class369.field4717);
        this.field967.method2933((byte) 98, null);
        this.field967.method2949(0, 7544);
        this.field967.method2928(false);
    }
}
