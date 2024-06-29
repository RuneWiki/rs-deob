import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class338 extends class739 {

    @OriginalMember(owner = "client!tda", name = "z", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!tda", name = "C", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!tda", name = "D", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!tda", name = "E", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!tda", name = "F", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!tda", name = "G", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!tda", name = "B", descriptor = "[Lpu;")
    private class738[] field4664;

    @OriginalMember(owner = "client!tda", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field4663;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)[I", line = 3)
    public final int[] method445(boolean arg0, int arg1) {
        if (arg0) {
            method2081((class543) null, -23, 63, 74, -95, 104, 21, true, false);
        }
        ++field4667;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            this.method2083(super.field10317.method1041((byte) -103), 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)V", line = 26)
    public static final void method2080(byte arg0) {
        if (arg0 != 74) {
            field4663 = null;
        }
        ++field4665;
        if (class537.field7799 != null) {
            class537.field7799 = null;
            class517.method3144(class90.field1279, -121, class702.field9898, class666.field9521, class327.field4441);
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(II)[[I", line = 41)
    public final int[][] method113(int arg0, int arg1) {
        ++field4666;
        if (arg1 != 8213) {
            field4663 = null;
        }
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727) {
            int var4 = class399.field5703;
            int var5 = class505.field7350;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field10328.method2101(-98);
            this.method2083(var6, 0);
            for (int var8 = 0; ~class505.field7350 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class399.field5703; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class368.method2314(var15, 255) << 4;
                    var12[var14] = class368.method2314(var15 >> 4, 4080);
                    var11[var14] = class368.method2314(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V", line = 107)
    public class338() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lha;IIIIIIZZ)V", line = 110)
    public static final void method2081(class543 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class391.field5644 = arg0;
        class482.field6920 = arg1;
        class564.field8170 = class482.field6920 > 1 && class391.field5644.method343();
        class639.field9095 = arg2;
        class150.field2190 = 1 << class639.field9095;
        class231.field3477 = class150.field2190 >> 1;
        Math.sqrt((double) (class231.field3477 * class231.field3477 + class231.field3477 * class231.field3477));
        class433.field6202 = arg3;
        class439.field6264 = arg4;
        class408.field5806 = arg5;
        class430.field6190 = arg6;
        class127.field1759 = class702.method3947((byte) 68);
        class319.method1984(-32769);
        class386.field5587 = new class375[arg3][class439.field6264][class408.field5806];
        class491.field7079 = new class339[arg3];
        if (arg7) {
            class346.field4951 = new int[class439.field6264][class408.field5806];
            class609.field8690 = new byte[class439.field6264][class408.field5806];
            class167.field2372 = new short[class439.field6264][class408.field5806];
            class643.field9177 = new class375[1][class439.field6264][class408.field5806];
            class25.field221 = new class339[1];
        } else {
            class346.field4951 = null;
            class609.field8690 = null;
            class167.field2372 = null;
            class643.field9177 = null;
            class25.field221 = null;
        }
        if (arg8) {
            class72.field1096 = new long[arg3][arg4][arg5];
            class62.field1000 = new class187[65535];
            class714.field10080 = new boolean[65535];
            class5.field56 = 0;
        } else {
            class72.field1096 = null;
            class62.field1000 = null;
            class714.field10080 = null;
            class5.field56 = 0;
        }
        class496.method3016(false);
        class132.field1818 = new class280[2][];
        class132.field1818[0] = new class280[class717.field10119[0]];
        class132.field1818[1] = new class280[class717.field10119[1]];
        class355.field5248 = new int[2];
        class499.field7174 = new class280[2][];
        class499.field7174[0] = new class280[class732.field10255[0]];
        class499.field7174[1] = new class280[class732.field10255[1]];
        class575.field8273 = new int[2];
        class399.field5714 = new class280[2][];
        class399.field5714[0] = new class280[class460.field6536[0]];
        class399.field5714[1] = new class280[class460.field6536[1]];
        class145.field1963 = new int[2];
        class386.field5582 = new class280[10000];
        class423.field6033 = 0;
        class393.field5647 = new class280[5000];
        class610.field8707 = 0;
        class356.field5256 = new class638[5000];
        class594.field8445 = 0;
        class437.field6237 = new boolean[class430.field6190 + class430.field6190 + 1][class430.field6190 + class430.field6190 + 1];
        class402.field5754 = new boolean[class430.field6190 + class430.field6190 + 2][class430.field6190 + class430.field6190 + 2];
        class624.field8879 = new int[class430.field6190 + class430.field6190 + 2];
        class465.field6628 = class465.field6627;
        if (class564.field8170) {
            class35.field315 = new boolean[arg3][class430.field6190 + class430.field6190 + 1][class430.field6190 + class430.field6190 + 1];
            class174.field2449 = new boolean[arg3][][];
            if (class186.field2604 != null) {
                class113.method815();
            }
            class186.field2604 = new class117[class482.field6920];
            class391.field5644.method340(class186.field2604.length + 1);
            class391.field5644.method383(0);
            for (int var9 = 0; var9 < class186.field2604.length; ++var9) {
                class186.field2604[var9] = new class117(var9 + 1, class391.field5644);
                (new Thread(class186.field2604[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class482.field6920 == 2) {
                var10 = 4;
                class143.field1943 = 2;
            } else if (class482.field6920 == 3) {
                var10 = 6;
                class143.field1943 = 3;
            } else {
                var10 = 8;
                class143.field1943 = 4;
            }
            class618.field8804 = new class277[var10];
            for (int var11 = 0; var11 < var10; ++var11) {
                class618.field8804[var11] = new class277(class672.field9574[class482.field6920 - 2][var11]);
            }
        } else {
            class143.field1943 = 1;
        }
        class62.field999 = new int[class143.field1943 - 1];
        class451.field6454 = new int[class143.field1943 - 1];
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lhga;ILjava/lang/String;I)Lsca;", line = 238)
    public static final class432 method2082(class300 arg0, int arg1, String arg2, int arg3) {
        ++field4669;
        if (arg1 == 0) {
            return arg0.method1870(arg2, arg3 ^ -15453);
        } else if (~arg1 == -2) {
            try {
                class665.method3805(class486.field6999, new Object[] { (new URL(class486.field6999.getCodeBase(), arg2)).toString() }, "openjs", (byte) -2);
                class432 var4 = new class432();
                var4.field6198 = 1;
                return var4;
            } catch (Throwable var10) {
                class432 var5 = new class432();
                var5.field6198 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                class486.field6999.getAppletContext().showDocument(new URL(class486.field6999.getCodeBase(), arg2), "_blank");
                class432 var6 = new class432();
                var6.field6198 = 1;
                return var6;
            } catch (Exception var11) {
                class432 var7 = new class432();
                var7.field6198 = 2;
                return var7;
            }
        } else {
            if (arg3 != -15453) {
                field4663 = null;
            }
            if (arg1 == 3) {
                try {
                    class665.method3803(class486.field6999, "loggedout", (byte) 91);
                } catch (Throwable var13) {
                }
                try {
                    class486.field6999.getAppletContext().showDocument(new URL(class486.field6999.getCodeBase(), arg2), "_top");
                    class432 var8 = new class432();
                    var8.field6198 = 1;
                    return var8;
                } catch (Exception var12) {
                    class432 var9 = new class432();
                    var9.field6198 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "([[II)V", line = 317)
    private final void method2083(int[][] arg0, int arg1) {
        ++field4662;
        int var3 = class399.field5703;
        int var4 = class505.field7350;
        class48.method462(arg0, 5121);
        class545.method3282(class311.field4223, 0, class423.field6029, arg1, true);
        if (this.field4664 != null) {
            for (int var5 = 0; ~var5 > ~this.field4664.length; ++var5) {
                class738 var6 = this.field4664[var5];
                int var7 = var6.field10312;
                int var8 = var6.field10305;
                if (~var7 <= -1) {
                    if (var8 < 0) {
                        var6.method83((byte) 81, var3, var4);
                    } else {
                        var6.method85(var3, true, var4);
                    }
                } else if (var8 >= 0) {
                    var6.method84(var4, var3, 34065);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lsl;IB)V", line = 366)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            method2080((byte) -74);
        }
        if (arg1 == 0) {
            this.field4664 = new class738[arg0.method2886(true)];
            for (int var4 = 0; ~var4 > ~this.field4664.length; ++var4) {
                int var5 = arg0.method2886(true);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field4664[var4] = class416.method2514(-113, arg0);
                            }
                        } else {
                            this.field4664[var4] = class546.method3284(arg0, true);
                        }
                    } else {
                        this.field4664[var4] = class12.method63(true, arg0);
                    }
                } else {
                    this.field4664[var4] = class390.method2391(32, arg0);
                }
            }
        } else if (~arg1 == -2) {
            super.field10320 = ~arg0.method2886(true) == -2;
        }
        ++field4668;
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "(I)V", line = 440)
    public static void method2084(int arg0) {
        field4663 = null;
        if (arg0 > -112) {
            field4663 = null;
        }
    }
}
