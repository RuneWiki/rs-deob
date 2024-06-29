import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class47 {

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "[I")
    private int[] field791;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "[I")
    private int[] field786;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Leg;")
    private class228 field784;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Leg;")
    private class228 field789;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[Leg;")
    private class228[] field783;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Loa;")
    public static class99 field785 = class221.method1463(2844, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Loa;")
    public static class99 field782 = class221.method1463(2844, "::noclip");

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method338(int arg0) {
        if (arg0 != -1) {
            field782 = null;
        }
        field782 = null;
        field785 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([BB)V")
    public static final void method339(byte[] arg0, byte arg1) {
        field794++;
        class261 var2 = new class261(arg0);
        var2.field4587 = arg0.length - 2;
        class201.field3495 = var2.method1740((byte) 90);
        class223.field3885 = new int[class201.field3495];
        class11.field94 = new int[class201.field3495];
        class272.field4798 = new byte[class201.field3495][];
        class181.field3151 = new byte[class201.field3495][];
        class232.field3996 = new boolean[class201.field3495];
        class193.field3395 = new int[class201.field3495];
        class290.field5082 = new int[class201.field3495];
        var2.field4587 = arg0.length - (class201.field3495 * 8) - 7;
        class164.field2883 = var2.method1740((byte) 107);
        class88.field1520 = var2.method1740((byte) 50);
        int var3 = (var2.method1693((byte) -106) & 0xFF) + 1;
        for (int var4 = 0; var4 < class201.field3495; var4++) {
            class290.field5082[var4] = var2.method1740((byte) 103);
        }
        for (int var5 = 0; var5 < class201.field3495; var5++) {
            class11.field94[var5] = var2.method1740((byte) 108);
        }
        for (int var6 = 0; var6 < class201.field3495; var6++) {
            class223.field3885[var6] = var2.method1740((byte) 75);
        }
        for (int var7 = 0; var7 < class201.field3495; var7++) {
            class193.field3395[var7] = var2.method1740((byte) 89);
        }
        var2.field4587 = arg0.length + 3 - (var3 * 3) - (class201.field3495 * 8) - 7;
        class173.field3062 = new int[var3];
        int var8 = 1;
        if (arg1 != -12) {
            return;
        }
        while (var8 < var3) {
            class173.field3062[var8] = var2.method1747(false);
            if (class173.field3062[var8] == 0) {
                class173.field3062[var8] = 1;
            }
            var8++;
        }
        var2.field4587 = 0;
        for (int var9 = 0; var9 < class201.field3495; var9++) {
            int var10 = class193.field3395[var9];
            boolean var11 = false;
            int var12 = class223.field3885[var9];
            int var13 = var10 * var12;
            byte[] var14 = new byte[var13];
            byte[] var15 = new byte[var13];
            class181.field3151[var9] = var14;
            class272.field4798[var9] = var15;
            int var16 = var2.method1693((byte) 107);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var13; var22++) {
                    var14[var22] = var2.method1706(class28.method249(arg1, -10825));
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var13; var23++) {
                        byte var24 = var15[var23] = var2.method1706(10819);
                        var11 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label90: while (true) {
                    if (var12 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var12 <= var18) {
                                break label90;
                            }
                            for (int var19 = 0; var19 < var10; var19++) {
                                byte var20 = var15[var12 * var19 + var18] = var2.method1706(10819);
                                var11 |= var20 != -1;
                            }
                            var18++;
                        }
                    }
                    for (int var21 = 0; var21 < var10; var21++) {
                        var14[var12 * var21 + var17] = var2.method1706(10819);
                    }
                    var17++;
                }
            }
            class232.field3996[var9] = var11;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ltg;ZLq;)Z")
    public final boolean method340(class182 arg0, boolean arg1, class126 arg2) {
        field787++;
        if (class234.field4042 > 0) {
            for (int var4 = 0; var4 < this.field786.length; var4++) {
                if (!arg0.method1239(class234.field4042, (byte) -119, this.field786[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field786.length; var5++) {
                if (!arg0.method1229(this.field786[var5], -1)) {
                    return false;
                }
            }
        }
        if (arg1) {
            method338(30);
        }
        for (int var6 = 0; var6 < this.field791.length; var6++) {
            if (!arg2.method837(this.field791[var6], (byte) -128)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZDZIILtg;ILq;)[I")
    public final int[] method341(boolean arg0, double arg1, boolean arg2, int arg3, int arg4, class182 arg5, int arg6, class126 arg7) {
        field788++;
        class247.method1605((byte) 77, arg1);
        class210.field3649 = arg7;
        int[] var10 = new int[arg3 * arg6];
        class55.field905 = arg5;
        class278.method1834(1380607564, arg3, arg6);
        int var11 = 76 / ((arg4 + 9) / 38);
        for (int var12 = 0; var12 < this.field783.length; var12++) {
            this.field783[var12].method1501(255, arg3, arg6);
        }
        int var13 = 0;
        int var14;
        byte var15;
        int var16;
        if (arg0) {
            var14 = arg6 - 1;
            var15 = -1;
            var16 = -1;
        } else {
            var16 = arg6;
            var15 = 1;
            var14 = 0;
        }
        for (int var17 = 0; var17 < arg3; var17++) {
            if (arg2) {
                var13 = var17;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field784.field3943) {
                int[] var19 = this.field784.method106(var17, -3);
                var20 = var19;
                var21 = var19;
                var22 = var19;
            } else {
                int[][] var23 = this.field784.method19((byte) -27, var17);
                var20 = var23[1];
                var21 = var23[0];
                var22 = var23[2];
            }
            for (int var24 = var14; var24 != var16; var24 += var15) {
                int var25 = var21[var24] >> 4;
                int var26 = var20[var24] >> 4;
                int var27 = var22[var24] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class146.field2591[var25];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class146.field2591[var26];
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var30 = class146.field2591[var27];
                var10[var13++] = (var29 << 8) + (var28 << 16) + var30;
                if (arg2) {
                    var13 += arg6 - 1;
                }
            }
        }
        for (int var18 = 0; var18 < this.field783.length; var18++) {
            this.field783[var18].method852(0);
        }
        return var10;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class47() {
        this.field791 = new int[0];
        this.field786 = new int[0];
        this.field784 = new class59();
        this.field784.field3937 = 1;
        this.field789 = new class59();
        this.field783 = new class228[] { this.field784, this.field789 };
        this.field789.field3937 = 1;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lik;)V")
    public class47(class261 arg0) {
        int var2 = arg0.method1693((byte) 46);
        int var3 = 0;
        int var4 = 0;
        this.field783 = new class228[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class228 var16 = class111.method768(arg0, (byte) -128);
            if (var16.method881((byte) 91) >= 0) {
                var4++;
            }
            if (var16.method856((byte) 124) >= 0) {
                var3++;
            }
            int var17 = var16.field3935.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1693((byte) -120);
            }
            this.field783[var6] = var16;
        }
        this.field791 = new int[var3];
        int var7 = 0;
        this.field786 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class228 var11 = this.field783[var9];
            int var12 = var11.field3935.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3935[var13] = this.field783[var5[var9][var13]];
            }
            int var14 = var11.method881((byte) 83);
            int var15 = var11.method856((byte) 126);
            if (var14 > 0) {
                this.field786[var8++] = var14;
            }
            if (var15 > 0) {
                this.field791[var7++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field784 = this.field783[arg0.method1693((byte) 69)];
        this.field789 = this.field783[arg0.method1693((byte) -107)];
    }
}
