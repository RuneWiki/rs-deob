import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class145 {

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    private int field6 = 0;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    private int field7 = 4096;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field8 = 0;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "[I")
    public static int[] field4;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILap;)V")
    public static final void method1(int arg0, class289 arg1) {
        ++field9;
        byte[] var2 = new byte[24];
        if (class315.field4275 != null) {
            try {
                class315.field4275.method40(0L, 31788);
                class315.field4275.method43(-15413, var2);
                int var3;
                for (var3 = 0; var3 < 24 && ~var2[var3] == -1; ++var3) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg0 < 79) {
            field4 = null;
        }
        arg1.method1870(0, var2, 24, (byte) 104);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        int var4 = 121 % ((arg1 - 11) / 52);
        ++field10;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field2205 = arg0.method1861((byte) -72) == 1;
                }
            } else {
                this.field7 = arg0.method1853(122);
            }
        } else {
            this.field6 = arg0.method1853(-28);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field2;
        int var3 = 87 / ((arg1 - 16) / 49);
        int[] var4 = super.field2218.method1614(98, arg0);
        if (super.field2218.field3396) {
            int[] var5 = this.method1119(0, 0, arg0);
            for (int var6 = 0; class156.field2364 > var6; ++var6) {
                int var7 = var5[var6];
                if (var7 >= this.field6) {
                    if (var7 > this.field7) {
                        var4[var6] = this.field7;
                    } else {
                        var4[var6] = var7;
                    }
                } else {
                    var4[var6] = this.field6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class1() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method4(boolean arg0, int arg1) {
        ++field1;
        if (!arg0) {
            field4 = null;
        }
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771) {
            int[][] var4 = this.method1121(arg1, 0, 2);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class156.field2364; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field6 > var12) {
                    var8[var11] = this.field6;
                } else if (var12 <= this.field7) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field7;
                }
                if (~var13 <= ~this.field6) {
                    if (~this.field7 > ~var13) {
                        var9[var11] = this.field7;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field6;
                }
                if (this.field6 <= var14) {
                    if (~this.field7 <= ~var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field7;
                    }
                } else {
                    var10[var11] = this.field6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lpe;I)V")
    public static final void method5(class391 arg0, int arg1) {
        ++field3;
        if (class260.field3509.method1242(0) != 0) {
            if (class243.field3355 != 0 && class243.field3355 != 2) {
                if (class335.field4541 == null) {
                    Canvas var2 = new Canvas();
                    var2.setSize(36, 32);
                    class335.field4541 = class232.method1548(0, class356.field4840, class30.field502, var2, 0, -2099013940);
                    class295.field3976 = class335.field4541.method89(class77.method667(0, (byte) -50, class49.field829, class14.field107), class214.method1455(class187.field2705, class14.field107, 0), true);
                }
                for (class200 var3 = (class200) class260.field3509.method1240((byte) -121); var3 != null; var3 = (class200) class260.field3509.method1245(arg1 + 9119)) {
                    class338.method2148(false, false, var3.field2852, false, class335.field4541, var3.field2856, arg0, var3.field2851, class295.field3976, var3.field2847, var3.field2854, !var3.field2853 ? null : class95.field1379.field4608);
                    var3.method2367(5);
                }
            } else {
                for (class200 var4 = (class200) class260.field3509.method1240((byte) -114); var4 != null; var4 = (class200) class260.field3509.method1245(arg1 ^ -9117)) {
                    class338.method2148(false, false, var4.field2852, false, arg0, var4.field2856, arg0, var4.field2851, class43.field650, var4.field2847, var4.field2854, var4.field2853 ? class95.field1379.field4608 : null);
                    var4.method2367(arg1 + 9123);
                }
                class125.method973(arg1 + 9118);
            }
            if (arg1 != -9118) {
                field4 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(B)V")
    public static void method6(byte arg0) {
        if (arg0 == 32) {
            field4 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
    public static final void method7(String[] arg0, int arg1, short[] arg2) {
        if (arg1 < -41) {
            ++field5;
            class278.method1775(arg0.length + -1, arg0, 503, 0, arg2);
        }
    }
}
