import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class512 extends class145 {

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "Z")
    private boolean field7478 = true;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    private int field7477 = 4096;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "Lea;")
    public static class474 field7480 = new class474("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "S")
    public static short field7484 = 1;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class512() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(Z)V")
    public static void method3042(boolean arg0) {
        field7480 = null;
        if (arg0) {
            field7479 = 70;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field7478 = arg2.method1177(255) == 1;
            }
        } else {
            this.field7477 = arg2.method1220(-116);
        }
        if (arg1 >= -67) {
            method3043(-87, -108, -40, -11, 36, 112, -86);
        }
        ++field7481;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3043(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7483;
        class142.method859(arg1 + -87, arg3);
        int var7 = 0;
        if (arg1 != 2) {
            method3044((String) null, (char) 65496, false);
        }
        int var8 = arg3 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class402.field6087[arg6];
        int var16 = arg4 - var8;
        int var17 = arg4 + var8;
        class645.method3675(arg1 ^ 109, var15, arg0, -arg3 + arg4, var16);
        class645.method3675(123, var15, arg2, var16, var17);
        class645.method3675(118, var15, arg0, var17, arg3 + arg4);
        while (~var9 < ~var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && ~var11 <= -2) {
                class452.field6746[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                if (~var9 > ~var8) {
                    int[] var18 = class402.field6087[arg6 - -var9];
                    int[] var19 = class402.field6087[-var9 + arg6];
                    int var20 = class452.field6746[var9];
                    int var21 = arg4 + var7;
                    int var22 = arg4 - var7;
                    int var23 = arg4 + var20;
                    int var24 = -var20 + arg4;
                    class645.method3675(117, var18, arg0, var22, var24);
                    class645.method3675(arg1 ^ 88, var18, arg2, var24, var23);
                    class645.method3675(102, var18, arg0, var23, var21);
                    class645.method3675(119, var19, arg0, var22, var24);
                    class645.method3675(115, var19, arg2, var24, var23);
                    class645.method3675(118, var19, arg0, var23, var21);
                } else {
                    int[] var25 = class402.field6087[arg6 - -var9];
                    int[] var26 = class402.field6087[-var9 + arg6];
                    int var27 = arg4 + var7;
                    int var28 = -var7 + arg4;
                    class645.method3675(93, var25, arg0, var28, var27);
                    class645.method3675(107, var26, arg0, var28, var27);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class402.field6087[arg6 + var7];
            int[] var30 = class402.field6087[-var7 + arg6];
            int var31 = arg4 + var9;
            int var32 = -var9 + arg4;
            if (~var8 < ~var7) {
                int var33 = ~var7 < ~var11 ? class452.field6746[var7] : var11;
                int var34 = arg4 + var33;
                int var35 = -var33 + arg4;
                class645.method3675(117, var29, arg0, var32, var35);
                class645.method3675(110, var29, arg2, var35, var34);
                class645.method3675(110, var29, arg0, var34, var31);
                class645.method3675(117, var30, arg0, var32, var35);
                class645.method3675(127, var30, arg2, var35, var34);
                class645.method3675(arg1 + 118, var30, arg0, var34, var31);
            } else {
                class645.method3675(112, var29, arg0, var32, var31);
                class645.method3675(arg1 + 96, var30, arg0, var32, var31);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;CZ)I")
    public static final int method3044(String arg0, char arg1, boolean arg2) {
        ++field7482;
        int var3 = 0;
        int var4 = arg0.length();
        if (arg2) {
            return -69;
        } else {
            for (int var5 = 0; ~var4 < ~var5; ++var5) {
                if (~arg1 == ~arg0.charAt(var5)) {
                    ++var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)[[I")
    public final int[][] method75(byte arg0, int arg1) {
        ++field7476;
        if (arg0 >= -28) {
            this.field7477 = 28;
        }
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (super.field1792.field3917) {
            int[] var4 = this.method865(0, arg1 - 1 & class444.field6649, (byte) -41);
            int[] var5 = this.method865(0, arg1, (byte) 104);
            int[] var6 = this.method865(0, arg1 + 1 & class444.field6649, (byte) -89);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class647.field9368; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field7477;
                int var12 = (var5[class619.field8980 & var10 + 1] + -var5[class619.field8980 & var10 + -1]) * this.field7477;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 - -4096 + var15) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                    var18 = var12 / var17;
                }
                if (this.field7478) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }
}
