import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class81 extends class219 {

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "Lbd;")
    public static class162 field1403 = class17.method142(0, "Okay");

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "Lbe;")
    public static class235 field1408 = new class235(16);

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "Lbd;")
    private static class162 field1411 = class17.method142(0, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "Lbd;")
    public static class162 field1416 = field1411;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "Lbd;")
    public static class162 field1415 = class17.method142(0, "");

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "Lbd;")
    private static class162 field1409 = class17.method142(0, " from your friend list first)3");

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "Lbd;")
    public static class162 field1414 = field1409;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "[Lbd;")
    public static class162[] field1412;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBII)I", line = 5)
    public static final int method619(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        int var5 = 80 % ((55 - arg1) / 45);
        field1406++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(B)V", line = 27)
    public static void method620(byte arg0) {
        field1416 = null;
        field1414 = null;
        field1403 = null;
        field1408 = null;
        if (arg0 != -109) {
            field1409 = (class162) null;
        }
        field1411 = null;
        field1409 = null;
        field1415 = null;
        field1412 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lb;Z)Ldb;", line = 44)
    public static final class96 method621(class94 arg0, boolean arg1) {
        if (arg1) {
            method619(-5, (byte) -40, -96, 81);
        }
        field1407++;
        return new class96(arg0.method750((byte) -24), arg0.method750((byte) -24), arg0.method750((byte) -24), arg0.method750((byte) -24), arg0.method732(-1), arg0.method732(-1), arg0.method756(915905888));
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 58)
    public class81() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILb;)V", line = 64)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg0 == 0) {
            this.field3647 = arg2.method756(915905888) == 1;
        }
        field1417++;
        if (arg1 != 0) {
            field1412 = (class162[]) null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)[I", line = 85)
    public final int[] method41(boolean arg0, int arg1) {
        field1405++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (!arg0) {
            method622(68, true, false, 54, 24);
        }
        if (this.field3654.field4967) {
            int[] var4 = this.method1585(0, arg1, -6606);
            int[] var5 = this.method1585(1, arg1, -6606);
            int[] var6 = this.method1585(2, arg1, -6606);
            for (int var7 = 0; var7 < class128.field2326; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZZII)V", line = 145)
    public static final void method622(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        class95.method767(0, arg3, arg2, arg1, (byte) 52, arg0, class13.field220.length + arg4);
        field1410++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)[[I", line = 155)
    public final int[][] method219(int arg0, byte arg1) {
        int[][] var3 = this.field3651.method406(false, arg0);
        if (arg1 != 83) {
            field1414 = (class162) null;
        }
        if (this.field3651.field917) {
            int[] var4 = this.method1585(2, arg0, -6606);
            int[][] var5 = this.method1583(arg0, true, 0);
            int[][] var6 = this.method1583(arg0, true, 1);
            int[] var7 = var3[0];
            int[] var8 = var5[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class128.field2326; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var8[var16];
                    var9[var16] = var11[var16];
                    var10[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var9[var16] = var14[var16];
                    var10[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var8[var16] * var17 + var13[var16] * var18 >> 12;
                    var9[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var10[var16] = var12[var16] * var17 + (var15[var16] * var18) >> 12;
                }
            }
        }
        field1413++;
        return var3;
    }
}
