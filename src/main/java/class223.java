import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class class223 {

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "I")
    public int field3752;

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "I")
    public int field3753;

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "Lcg;")
    public static class10 field3756 = new class10(8, 0, 4, 1);

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "Z")
    public static boolean field3757 = false;

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(Li;IIIIZ)V")
    public abstract void method698(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Las;[I)V")
    public abstract void method694(class415 arg0, int[] arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(B)V")
    public static void method1620(byte arg0) {
        field3756 = null;
        int var1 = -54 / ((arg0 - 47) / 62);
    }

    @OriginalMember(owner = "client!ya", name = "qa", descriptor = "(III)V")
    public abstract void method684(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Li;IIIIZ)Z")
    public abstract boolean method696(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IILza;Lgi;I)V")
    public static final void method1621(int arg0, int arg1, class497 arg2, class437 arg3, int arg4) {
        field3751++;
        class453 var5 = arg3.method2761(arg2, (byte) 39);
        if (var5 == null) {
            return;
        }
        arg2.method1307(arg1, arg4, arg1 + arg3.field6615, arg3.field6730 + arg4);
        if (arg0 != 32) {
            field3756 = null;
        }
        if (class148.field1999 == 2 || class148.field1999 == 5 || class256.field4148 == null) {
            arg2.method1323(-16777216, var5, arg1, arg4);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class334.field5222 == 4) {
            var9 = (int) (-class388.field5918) & 0x3FFF;
            var8 = class433.field6538;
            var6 = 4096;
            var7 = class5.field61;
        } else {
            var6 = 4096 - (class326.field5126 * 16);
            var7 = class358.field5565.field6410;
            var8 = class358.field5565.field6417;
            var9 = (int) (-class388.field5918) + class386.field5903 & 0x3FFF;
        }
        int var10 = var8 / 32 + 48 - (class135.field1839 + -104) * 2;
        int var11 = class197.field3038 * 4 + 48 - (var7 / 32) - (class197.field3038 + -104) * 2;
        class256.field4148.method848((float) arg3.field6615 / 2.0F + (float) arg1, (float) arg3.field6730 / 2.0F + (float) arg4, (float) var10, (float) var11, var6, var9 << 2, var5, arg1, arg4);
        for (class330 var12 = (class330) class61.field952.method2123(-34); var12 != null; var12 = (class330) class61.field952.method2126((byte) 61)) {
            int var58 = var12.field5185;
            int var59 = ((class76.field1130.field3706[var58] & 0xFFFD8B2) >> 14) - class453.field7018;
            int var60 = (class76.field1130.field3706[var58] & 0x3FFF) - class126.field1718;
            int var61 = var59 * 4 + 2 - var8 / 32;
            int var62 = var60 * 4 + 2 - (var7 / 32);
            class341.method2264(var5, arg2, 74, var62, class76.field1130.field3705[var58], var61, arg1, arg3, arg4);
        }
        for (int var13 = 0; var13 < class388.field5923; var13++) {
            int var55 = class31.field323[var13] * 4 + 2 - (var8 / 32);
            int var56 = class305.field4792[var13] * 4 + 2 - (var7 / 32);
            class156 var57 = class454.field7029.method3002(arg0 ^ 0xFFFFFFDF, class55.field819[var13]);
            if (var57.field2134 != null) {
                var57 = var57.method962((byte) 81, class96.field1394);
                if (var57 == null || var57.field2127 == -1) {
                    continue;
                }
            }
            class341.method2264(var5, arg2, 89, var56, var57.field2127, var55, arg1, arg3, arg4);
        }
        for (class257 var14 = (class257) class328.field5157.method1119(false); var14 != null; var14 = (class257) class328.field5157.method1121((byte) -10)) {
            int var50 = (int) (var14.field7780 >> 28 & 0x3L);
            if (class12.field121 == var50) {
                int var51 = (int) (var14.field7780 & 0x3FFFL) - class453.field7018;
                int var52 = (int) (var14.field7780 >> 14 & 0x3FFFL) - class126.field1718;
                int var53 = var51 * 4 + 2 - (var8 / 32);
                int var54 = var52 * 4 + 2 - (var7 / 32);
                class299.method2010(arg4, class522.field7725[0], var53, arg3, arg1, 29, var54, var5);
            }
        }
        for (int var15 = 0; var15 < class378.field5815; var15++) {
            class38 var45 = (class38) class365.field5659.method1122((byte) 59, (long) class81.field1198[var15]);
            if (var45 != null) {
                class378 var46 = var45.field378;
                if (var46.method2444(false) && class358.field5565.field6419 == var46.field6419) {
                    class191 var47 = var46.field5809;
                    if (var47 != null && var47.field2798 != null) {
                        var47 = var47.method1190(-1, class96.field1394);
                    }
                    if (var47 != null && var47.field2802 && var47.field2813) {
                        int var48 = var46.field6417 / 32 - var8 / 32;
                        int var49 = var46.field6410 / 32 - (var7 / 32);
                        if (var47.field2815 == -1) {
                            class299.method2010(arg4, class522.field7725[1], var48, arg3, arg1, 98, var49, var5);
                        } else {
                            class341.method2264(var5, arg2, -60, var49, var47.field2815, var48, arg1, arg3, arg4);
                        }
                    }
                }
            }
        }
        int var16 = class234.field3861;
        int[] var17 = class21.field245;
        for (int var18 = 0; var18 < var16; var18++) {
            class350 var37 = class264.field4276[var17[var18]];
            if (var37 != null && var37.method2310(false) && class358.field5565 != var37 && class358.field5565.field6419 == var37.field6419) {
                int var38 = var37.field6417 / 32 - (var8 / 32);
                int var39 = var37.field6410 / 32 - (var7 / 32);
                boolean var40 = false;
                for (int var41 = 0; var41 < class162.field2352; var41++) {
                    if (var37.field5443.equals(class401.field6038[var41]) && class214.field3648[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class314.field4918; var43++) {
                    if (var37.field5443.equals(class183.field2658[var43].field7442)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class358.field5565.field5455 != 0 && var37.field5455 != 0 && class358.field5565.field5455 == var37.field5455) {
                    var44 = true;
                }
                if (var37.field5425) {
                    class299.method2010(arg4, class522.field7725[6], var38, arg3, arg1, 51, var39, var5);
                } else if (var40) {
                    class299.method2010(arg4, class522.field7725[3], var38, arg3, arg1, arg0 + 46, var39, var5);
                } else if (var42) {
                    class299.method2010(arg4, class522.field7725[5], var38, arg3, arg1, 93, var39, var5);
                } else if (var44) {
                    class299.method2010(arg4, class522.field7725[4], var38, arg3, arg1, 97, var39, var5);
                } else {
                    class299.method2010(arg4, class522.field7725[2], var38, arg3, arg1, 67, var39, var5);
                }
            }
        }
        class402[] var19 = class323.field5076;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class402 var23 = var19[var20];
            if (var23 != null && var23.field6058 != 0 && (class88.field1278 % 20) < 10) {
                if (var23.field6058 == 1) {
                    class38 var24 = (class38) class365.field5659.method1122((byte) 59, (long) var23.field6053);
                    if (var24 != null) {
                        class378 var25 = var24.field378;
                        int var26 = var25.field6417 / 32 - var8 / 32;
                        int var27 = var25.field6410 / 32 - (var7 / 32);
                        class541.method3193((byte) -74, var5, var23.field6049, arg4, var27, 360000L, var26, arg1, arg3);
                    }
                }
                if (var23.field6058 == 2) {
                    int var28 = var23.field6050 / 32 - var8 / 32;
                    int var29 = var23.field6045 / 32 - (var7 / 32);
                    long var30 = (long) (var23.field6055 << 5);
                    long var32 = var30 * var30;
                    class541.method3193((byte) -74, var5, var23.field6049, arg4, var29, var32, var28, arg1, arg3);
                }
                if (var23.field6058 == 10 && var23.field6053 >= 0 && class264.field4276.length > var23.field6053) {
                    class350 var34 = class264.field4276[var23.field6053];
                    if (var34 != null) {
                        int var35 = var34.field6417 / 32 - (var8 / 32);
                        int var36 = var34.field6410 / 32 - (var7 / 32);
                        class541.method3193((byte) -74, var5, var23.field6049, arg4, var36, 360000L, var35, arg1, arg3);
                    }
                }
            }
        }
        if (class334.field5222 == 4) {
            return;
        }
        if (class454.field7026 != 0) {
            int var21 = class454.field7026 * 4 + class358.field5565.method415(-4) * 2 + 2 - (var8 / 32) - 2;
            int var22 = class535.field7842 * 4 + class358.field5565.method415(-4) * 2 + 2 - (var7 / 32) - 2;
            class299.method2010(arg4, class38.field381[class253.field4100 ? 1 : 0], var21, arg3, arg1, arg0 ^ 0x40, var22, var5);
        }
        arg2.method3042(3, (byte) -118, arg3.field6730 / 2 + arg4 - 1, -1, arg3.field6615 / 2 + arg1 - 1, 3);
    }

    @OriginalMember(owner = "client!ya", name = "ba", descriptor = "(Li;IIIIZ)V")
    public abstract void method685(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method687(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ya", name = "ca", descriptor = "(II)I")
    public abstract int method692(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "()V")
    public abstract void method700();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method686(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!ya", name = "ua", descriptor = "(II)I")
    public abstract int method688(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(III)V")
    public class223(int arg0, int arg1, int arg2) {
        while (arg2 > 1) {
            this.field3753++;
            arg2 >>= 0x1;
        }
        this.field3755 = arg0;
        this.field3752 = arg1;
        this.field3754 = 0x1 << this.field3753;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)V")
    public abstract void method699(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method689(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IILi;)Li;")
    public abstract class521 method697(int arg0, int arg1, class521 arg2);
}
