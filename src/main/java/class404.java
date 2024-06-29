import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class404 extends class298 {

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    private int field5742 = 4096;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    private int field5741 = 4096;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    private int field5743 = 4096;

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field5749 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "I")
    public static int field5750 = -1;

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "[[S")
    public static short[][] field5752 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "Lec;")
    public static class40 field5744 = new class40("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!kk", name = "Y", descriptor = "Lkd;")
    public static class355 field5753;

    static {
        new class40("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[Lrg;)V", line = 4)
    public static final void method2412(int arg0, class395[] arg1) {
        ++field5746;
        class231.field3209 = arg1.length;
        class298.field4460 = new int[class231.field3209 - -10];
        if (arg0 > -7) {
            field5739 = 1;
        }
        class430.field6222 = new class395[class231.field3209 - -10];
        class268.method1626(arg1, 0, class430.field6222, 0, class231.field3209);
        for (int var2 = 0; ~var2 > ~class231.field3209; ++var2) {
            class298.field4460[var2] = class430.field6222[var2].method222();
        }
        for (int var3 = class231.field3209; ~class430.field6222.length < ~var3; ++var3) {
            class298.field4460[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V", line = 32)
    public static final void method2413(boolean arg0, int arg1) {
        ++field5748;
        if (arg0) {
            field5752 = null;
        }
        if (~class453.field6415 != ~arg1) {
            if (class453.field6415 == 0) {
                class390.method2349(31739);
            }
            if (arg1 == 40) {
                class126.method600(128);
            }
            if (~arg1 != -41 && class79.field951 != null) {
                class79.field951.method669(5000);
                class79.field951 = null;
            }
            if (class453.field6415 == 25 || class453.field6415 == 28) {
                class198.field2753.field6602 = 2;
                class349.field5018.field6602 = 2;
                class83.field1012.field6602 = 2;
                class438.field6283.field6602 = 2;
                class78.field936.field6602 = 2;
                class160.field1929.field6602 = 2;
                class443.field6325.field6602 = 2;
            }
            if (~arg1 == -26 || ~arg1 == -29) {
                class27.field363 = 1;
                class262.field3774 = 0;
                class148.field1808 = 0;
                client.field3928 = 0;
                class349.field5015 = 1;
                class137.method649(111, true);
                class198.field2753.field6602 = 1;
                class349.field5018.field6602 = 1;
                class83.field1012.field6602 = 1;
                class438.field6283.field6602 = 1;
                class78.field936.field6602 = 1;
                class160.field1929.field6602 = 1;
                class443.field6325.field6602 = 1;
            }
            if (arg1 == 25 || ~arg1 == -11) {
                class325.method1979((byte) -102);
            }
            if (arg1 == 5) {
                class36.method184(class231.field3205, class171.field2022, 2);
            } else {
                class369.method2233(9776);
            }
            boolean var2 = arg1 == 5 || ~arg1 == -11 || arg1 == 28;
            boolean var3 = class453.field6415 == 5 || ~class453.field6415 == -11 || class453.field6415 == 28;
            if (var2 != var3) {
                if (var2) {
                    class46.field593 = class364.field5233;
                    if (~class224.field3102 == -1) {
                        class437.method2595(103, 2);
                    } else {
                        class45.method235(false, 255, class364.field5233, class93.field1162, -47, 2, 0);
                    }
                    class331.field4766.method1030(false, (byte) -123);
                } else {
                    class437.method2595(112, 2);
                    class331.field4766.method1030(true, (byte) -122);
                }
            }
            if (~arg1 == -26 || ~arg1 == -29 || ~arg1 == -41) {
                class231.field3205.method1374();
            }
            class453.field6415 = arg1;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILvt;)V", line = 135)
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field5751;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field5743 = arg2.method916(21933);
                }
            } else {
                this.field5742 = arg2.method916(21933);
            }
        } else {
            this.field5741 = arg2.method916(21933);
        }
        if (arg0 > -44) {
            this.method157(42, 40);
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 181)
    public class404() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)V", line = 191)
    public static void method2414(byte arg0) {
        field5749 = null;
        field5752 = null;
        if (arg0 != 104) {
            field5752 = null;
        }
        field5744 = null;
        field5753 = null;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(B)V", line = 204)
    public static final void method2415(byte arg0) {
        class274.field3912.method1388(((float) class283.field4124 * 0.1F + 0.7F) * 1.1523438F);
        ++field5740;
        class274.field3912.method1449(class172.field2065, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class274.field3912.method1417(class481.field6798, -1);
        if (arg0 >= -127) {
            field5750 = 107;
        }
        class274.field3912.method1424(class12.field180);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[[I", line = 233)
    public final int[][] method157(int arg0, int arg1) {
        if (arg0 != -24032) {
            field5750 = 35;
        }
        ++field5747;
        int[][] var3 = super.field4454.method1638((byte) -15, arg1);
        if (super.field4454.field3886) {
            int[][] var4 = this.method1878(0, arg1, 71);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class158.field1877 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field5741 * var12 >> 12;
                    var9[var11] = this.field5742 * var13 >> 12;
                    var10[var11] = this.field5743 * var14 >> 12;
                } else {
                    var8[var11] = this.field5741;
                    var9[var11] = this.field5742;
                    var10[var11] = this.field5743;
                }
            }
        }
        return var3;
    }
}
