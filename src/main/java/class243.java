import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class243 extends class115 {

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    private int field3655 = 4096;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    private int field3658 = 4096;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    private int field3657 = 4096;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public static int field3661 = 0;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Lve;")
    public static class233 field3659;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public static final void method1579(int arg0) {
        class138.field1999.method260(0);
        ++field3654;
        if (arg0 >= -49) {
            method1580(-88);
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
    public static void method1580(int arg0) {
        field3659 = null;
        if (arg0 != 0) {
            field3661 = -50;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        ++field3662;
        int[][] var3 = super.field1716.method6(arg1, (byte) -124);
        if (arg0 >= -33) {
            method1583(-1, 50, 37, (byte) 76, -19, -37, 19);
        }
        if (super.field1716.field23) {
            int[][] var4 = this.method798(0, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class77.field1178; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field3655 * var12 >> 12;
                    var9[var11] = this.field3658 * var13 >> 12;
                    var10[var11] = this.field3657 * var14 >> 12;
                } else {
                    var8[var11] = this.field3655;
                    var9[var11] = this.field3658;
                    var10[var11] = this.field3657;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILha;)V")
    public static final void method1581(int arg0, int arg1, int arg2, class267 arg3) {
        ++field3653;
        if (class283.field4508 >= 2 || class204.field2963 != 0 || class275.field4406) {
            if (arg2 != 31076) {
                method1580(-120);
            }
            String var4 = class168.method1116(2);
            if (arg3 == null) {
                int var5 = class179.field2556.method1273(var4, arg0 + 4, arg1 - -15, 16777215, 0, class25.field334, class118.field1731);
                class237.method1556(arg0 - -4, arg1, 15, -22059, class179.field2556.method1278(var4) - -var5);
            } else {
                class198 var6 = arg3.method1784(class158.field2290, (byte) 44);
                if (var6 == null) {
                    var6 = class179.field2556;
                }
                var6.method1277(var4, arg0, arg1, arg3.field4177, arg3.field4051, arg3.field4084, arg3.field4175, arg3.field4114, arg3.field4047, class25.field334, class118.field1731, class9.field161);
                class237.method1556(class9.field161[0], class9.field161[1], class9.field161[3], -22059, class9.field161[2]);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method1582(boolean arg0, String arg1, int arg2) {
        ++field3656;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = arg2;
        int var6 = !arg0 ? 0 : 32768;
        int var7 = (arg0 ? class217.field3197 : class248.field3723) + var6;
        for (int var8 = var6; var8 < var7; ++var8) {
            class213 var11 = class162.method1087(1, var8);
            if (var11.field3067 && var11.method1361((byte) -87).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class124.field1803 = -1;
                    class24.field322 = null;
                    return;
                }
                if (~var5 <= ~var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var5 > var13; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class154.field2252 = 0;
        class124.field1803 = var5;
        class24.field322 = var4;
        String[] var9 = new String[class124.field1803];
        for (int var10 = 0; var10 < class124.field1803; ++var10) {
            var9[var10] = class162.method1087(1, var4[var10]).method1361((byte) -72);
        }
        class222.method1447(class24.field322, var9, arg2 ^ -4);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1583(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field3652;
        int var7 = arg2 + arg5;
        int var8 = -arg5 + arg1;
        int var9 = arg4 + arg5;
        if (arg3 == 103) {
            for (int var10 = arg2; var10 < var7; ++var10) {
                class183.method1181(arg0, (byte) -69, arg6, class163.field2370[var10], arg4);
            }
            int var11 = arg6 - arg5;
            for (int var12 = arg1; ~var12 < ~var8; --var12) {
                class183.method1181(arg0, (byte) -69, arg6, class163.field2370[var12], arg4);
            }
            for (int var13 = var7; var13 <= var8; ++var13) {
                int[] var14 = class163.field2370[var13];
                class183.method1181(arg0, (byte) -69, var9, var14, arg4);
                class183.method1181(arg0, (byte) -69, arg6, var14, var11);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field3660;
        if (arg0 == -1) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        this.field3657 = arg1.method756(arg0 ^ 29900);
                    }
                } else {
                    this.field3658 = arg1.method756(-29901);
                }
            } else {
                this.field3655 = arg1.method756(-29901);
            }
        }
    }
}
