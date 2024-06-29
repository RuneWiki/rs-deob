import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class438 extends class585 {

    @OriginalMember(owner = "client!vaa", name = "y", descriptor = "Lno;")
    private class658 field6036;

    @OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
    private int field6029;

    @OriginalMember(owner = "client!vaa", name = "n", descriptor = "I")
    private int field6025;

    @OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
    private int field6026;

    @OriginalMember(owner = "client!vaa", name = "q", descriptor = "I")
    private int field6028;

    @OriginalMember(owner = "client!vaa", name = "u", descriptor = "I")
    private int field6032;

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "I")
    private int field6037;

    @OriginalMember(owner = "client!vaa", name = "v", descriptor = "Ldb;")
    public static class298 field6033 = new class298(90, 8);

    @OriginalMember(owner = "client!vaa", name = "p", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!vaa", name = "w", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!vaa", name = "x", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!vaa", name = "t", descriptor = "Ljk;")
    private class592 field6031;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)Ljk;", line = 8)
    public final class592 method963(int arg0) {
        if (arg0 != 1) {
            method2491(false);
        }
        field6030++;
        if (this.field6031 == null) {
            class498 var2 = this.field6036.field8808;
            class531.field7079[2] = this.field6029;
            class531.field7079[4] = this.field6028;
            class531.field7079[0] = this.field6037;
            class531.field7079[5] = this.field6026;
            class531.field7079[1] = this.field6032;
            class531.field7079[3] = this.field6025;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2759(32700, class531.field7079[var5])) {
                    return null;
                }
                class364 var7 = var2.method2760(class531.field7079[var5], 21351);
                int var8 = var7.field4933 ? 64 : 128;
                if (var7.field4942 > 0) {
                    var3 = 1;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class569.field7565[var6] = var2.method2761((byte) 98, var4, false, class531.field7079[var6], 1.0F, var4);
            }
            this.field6031 = new class592(this.field6036, 6407, var4, var3 != 0, class569.field7565);
        }
        return this.field6031;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)V", line = 76)
    public static void method2491(boolean arg0) {
        if (arg0) {
            method2493(79, null, true);
        }
        field6033 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V", line = 87)
    public static final void method2492(byte arg0) {
        field6027++;
        if (class143.field2307 == -1 || class407.field5480 == -1) {
            return;
        }
        int var1 = ((class270.field3759 - class705.field9908) * class669.field9499 >> 16) + class705.field9908;
        class669.field9499 += var1;
        if (class669.field9499 >= 65535) {
            if (class227.field3195) {
                class570.field7574 = false;
            } else {
                class570.field7574 = true;
            }
            class669.field9499 = 65535;
            class227.field3195 = true;
        } else {
            class227.field3195 = false;
            class570.field7574 = false;
        }
        float var2 = (float) class669.field9499 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class179.field2741 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class303.field4207[class143.field2307][var4][var5] * 3;
            int var22 = class303.field4207[class143.field2307][var4 + 1][var5] * 3;
            int var23 = (class303.field4207[class143.field2307][var4 + 2][var5] + class303.field4207[class143.field2307][var4 - -2][var5] - class303.field4207[class143.field2307][var4 + 3][var5]) * 3;
            int var24 = class303.field4207[class143.field2307][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = var22 + class303.field4207[class143.field2307][var4 + 2][var5] - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class259.field3563 = (int) var3[0] - (class473.field6334 * 512);
        class643.field8632 = (int) var3[2] - (class233.field3269 * 512);
        class553.field7350 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class313.field4300 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class303.field4207[class407.field5480][var7][var8] * 3;
            int var15 = class303.field4207[class407.field5480][var7 + 1][var8] * 3;
            int var16 = (class303.field4207[class407.field5480][var7 + 2][var8] + class303.field4207[class407.field5480][var7 - -2][var8] - class303.field4207[class407.field5480][var7 + 3][var8]) * 3;
            int var17 = class303.field4207[class407.field5480][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class303.field4207[class407.field5480][var7 + 2][var8] - (var17 + var16 - var15);
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        if (arg0 > -66) {
            method2493(108, null, false);
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class510.field6806 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class331.field4539 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class370.field4993 = class303.field4207[class143.field2307][var4][3] + ((class303.field4207[class143.field2307][var4 + 2][3] - class303.field4207[class143.field2307][var4][3]) * class669.field9499 >> 16);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I[Lgba;Z)V", line = 190)
    public static final void method2493(int arg0, class625[] arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class625 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field8421 == 0) {
                    if (var4.field8420 != null) {
                        method2493(arg0, var4.field8420, arg2);
                    }
                    class140 var5 = (class140) class264.field3667.method2918((long) var4.field8327, (byte) 93);
                    if (var5 != null) {
                        class294.method1810(-54, arg0, var5.field2256);
                    }
                }
                if (arg0 == 0 && var4.field8436 != null) {
                    class48 var6 = new class48();
                    var6.field692 = var4;
                    var6.field681 = var4.field8436;
                    class544.method3013(var6);
                }
                if (arg0 == 1 && var4.field8318 != null) {
                    if (var4.field8418 >= 0) {
                        class625 var7 = class153.method1078(65535, var4.field8327);
                        if (var7 == null || var7.field8420 == null || var4.field8418 >= var7.field8420.length || var7.field8420[var4.field8418] != var4) {
                            continue;
                        }
                    }
                    class48 var8 = new class48();
                    var8.field681 = var4.field8318;
                    var8.field692 = var4;
                    class544.method3013(var8);
                }
            }
        }
        if (arg2) {
            method2492((byte) 50);
        }
        field6034++;
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lno;IIIIII)V", line = 265)
    public class438(class658 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6036 = arg0;
        this.field6029 = arg3;
        this.field6025 = arg4;
        this.field6026 = arg6;
        this.field6028 = arg5;
        this.field6032 = arg2;
        this.field6037 = arg1;
    }
}
