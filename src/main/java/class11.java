import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class11 extends class167 {

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "I")
    public static int field372 = 500;

    @OriginalMember(owner = "client!aj", name = "eb", descriptor = "Lkh;")
    public static class117 field377 = class224.method1450((byte) -42, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "Lff;")
    public static class62 field371 = new class62(8);

    @OriginalMember(owner = "client!aj", name = "gb", descriptor = "I")
    public static volatile int field379 = 0;

    @OriginalMember(owner = "client!aj", name = "hb", descriptor = "Lkh;")
    public static class117 field380 = class224.method1450((byte) -69, "m");

    @OriginalMember(owner = "client!aj", name = "ib", descriptor = "[[S")
    public static short[][] field381 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!aj", name = "cb", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "Lai;")
    public static class10 field366;

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "Lai;")
    public static class10 field374;

    @OriginalMember(owner = "client!aj", name = "fb", descriptor = "Luf;")
    public static class225 field378;

    @OriginalMember(owner = "client!aj", name = "db", descriptor = "[I")
    public static int[] field376;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "[S")
    public static short[] field369;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method114(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field367;
        if (arg3 != 66) {
            method115(3);
        }
        if (~arg2 == ~arg4) {
            class125.method869(arg1, arg3 + -66, arg4, arg5, arg7, arg0, arg6);
        } else if (~class240.field4355 >= ~(arg5 - arg4) && ~class146.field2678 <= ~(arg5 - -arg4) && ~(-arg2 + arg7) <= ~class159.field2910 && ~(arg7 - -arg2) >= ~class224.field4040) {
            class143.method966(arg1, arg2, arg7, arg5, arg6, arg4, -69, arg0);
        } else {
            class31.method274(arg7, arg0, 8311, arg1, arg5, arg6, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)V")
    public static void method115(int arg0) {
        if (arg0 != 0) {
            field378 = null;
        }
        field369 = null;
        field378 = null;
        field371 = null;
        field374 = null;
        field380 = null;
        field366 = null;
        field377 = null;
        field381 = null;
        field376 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        if (arg1 != -9179) {
            method117(true);
        }
        ++field370;
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        if (super.field3022.field2957) {
            int[] var4 = this.method1186(arg0, 0, 2);
            int[][] var5 = this.method1180(arg0, arg1 ^ -19258, 0);
            int[][] var6 = this.method1180(arg0, arg1 ^ -19258, 1);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[2];
            int[] var15 = var6[0];
            for (int var16 = 0; ~class115.field2146 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var8[var16] = var10[var16];
                    var7[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var8[var16] = var10[var16] * var17 - -(var15[var16] * var18) >> 12;
                    var7[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 - -(var14[var16] * var18) >> 12;
                } else {
                    var8[var16] = var15[var16];
                    var7[var16] = var13[var16];
                    var9[var16] = var14[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)Z")
    public static final boolean method117(boolean arg0) {
        if (arg0) {
            field377 = null;
        }
        ++field373;
        try {
            return class221.method1435(-1);
        } catch (IOException var4) {
            class141.method961(-1);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class195.field3487 + "," + class56.field1161 + "," + class8.field131 + " - " + class30.field722 + "," + (class93.field1712.field4259[0] + class143.field2591) + "," + (class184.field3319 - -class93.field1712.field4266[0]) + " - ";
            for (int var3 = 0; ~var3 > ~class30.field722 && ~var3 > -51; ++var3) {
                var2 = var2 + class18.field511.field2613[var3] + ",";
            }
            class147.method1055(6678, var2, var5);
            class212.method1393(2);
            return true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class11() {
        super(3, false);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method114(72, -98, 126, (byte) 122, 7, 41, -65, 10);
        }
        if (~arg2 == -1) {
            super.field3009 = arg0.method998(118) == 1;
        }
        ++field375;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        ++field368;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int[] var4 = this.method1186(arg1, 0, 0);
            int[] var5 = this.method1186(arg1, 0, 1);
            int[] var6 = this.method1186(arg1, 0, 2);
            for (int var7 = 0; ~var7 > ~class115.field2146; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return arg0 != -96 ? null : var3;
    }
}
