import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class177 extends class747 {

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    private int field2422 = 4;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    private int field2423 = 4;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method1114(byte arg0, int arg1, String arg2) {
        ++class110.field1481;
        ++field2427;
        class583 var3 = class54.method400(class213.field2800, (byte) -118, class70.field1063);
        if (arg0 > -100) {
            method1114((byte) 7, -52, (String) null);
        }
        var3.field7963.method444(class712.method4007(arg2, 4927) + 1, 128);
        var3.field7963.method510(arg2, (byte) 61);
        var3.field7963.method507(arg1, 114);
        class463.method2838(var3, (byte) 125);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field2423 = arg0.method505((byte) -119);
            }
        } else {
            this.field2422 = arg0.method505((byte) -119);
        }
        if (arg1 == 11608) {
            ++field2424;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[[I")
    public final int[][] method688(int arg0, int arg1) {
        int var3 = -48 % ((arg0 - 35) / 58);
        ++field2426;
        int[][] var4 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int var5 = class73.field1095 / this.field2422;
            int var6 = class414.field5865 / this.field2423;
            int[][] var7;
            if (var6 <= 0) {
                var7 = this.method4158(0, 0, 2);
            } else {
                int var8 = arg1 % var6;
                var7 = this.method4158(0, class414.field5865 * var8 / var6, 2);
            }
            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; ~var15 > ~class73.field1095; ++var15) {
                int var17;
                if (var5 > 0) {
                    int var16 = var15 % var5;
                    var17 = class73.field1095 * var16 / var5;
                } else {
                    var17 = 0;
                }
                var12[var15] = var9[var17];
                var13[var15] = var10[var17];
                var14[var15] = var11[var17];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class177() {
        super(1, false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILuv;I)V")
    public static final void method1115(int arg0, int arg1, class755 arg2, int arg3) {
        ++field2421;
        if (class731.field10159 == null && !class25.field320) {
            if (arg2 != null && class634.method3557(arg2, arg3 + 2) != null) {
                class731.field10159 = arg2;
                class344.field4904 = class634.method3557(arg2, arg3 ^ 2);
                class647.field8685 = arg3;
                class445.field6184 = arg1;
                class650.field8720 = false;
                class481.field6706 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        if (arg1 > -89) {
            this.method688(-36, 104);
        }
        ++field2425;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int var4 = class73.field1095 / this.field2422;
            int var5 = class414.field5865 / this.field2423;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method4156(-118, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method4156(39, class414.field5865 * var7 / var5, 0);
            }
            for (int var8 = 0; ~var8 > ~class73.field1095; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class73.field1095 * var9 / var4];
                }
            }
        }
        return var3;
    }
}
