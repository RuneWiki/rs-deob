import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class69 extends class23 {

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "Llc;")
    public static class143 field1313 = class66.method374("ondulation:", -1);

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "[J")
    public static long[] field1321 = new long[500];

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "[Z")
    public static boolean[] field1323 = new boolean[100];

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "Llc;")
    public static class143 field1325 = class66.method374("comp-Btence ", -1);

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "[Lol;")
    private class203[] field1324;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
    public static void method398(int arg0) {
        field1321 = null;
        field1313 = null;
        if (arg0 != 65280) {
            method398(124);
        }
        field1323 = null;
        field1325 = null;
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)I")
    public static final int method399(int arg0) {
        ++field1314;
        int var1 = 61 % ((arg0 - -63) / 63);
        return 0;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class69() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([[II)V")
    private final void method400(int[][] arg0, int arg1) {
        ++field1318;
        int var3 = class9.field179;
        int var4 = class72.field1359;
        class76.method438(true, arg0);
        class152.method1008(class79.field1426, 0, arg1, class172.field3077, (byte) 1);
        if (this.field1324 != null) {
            for (int var5 = 0; this.field1324.length > var5; ++var5) {
                class203 var6 = this.field1324[var5];
                int var7 = var6.field3696;
                int var8 = var6.field3688;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method497(var3, (byte) -90, var4);
                    }
                } else if (var8 >= 0) {
                    var6.method498(-13349, var4, var3);
                } else {
                    var6.method500((byte) 103, var3, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lh;Llc;I)I")
    public static final int method401(class190 arg0, class143 arg1, int arg2) {
        ++field1316;
        if (arg2 != -22682) {
            method402((byte) -6, 41);
        }
        int var3 = arg0.field3487;
        arg0.method1279((byte) 116, arg1.field2548);
        arg0.field3487 += class246.field4421.method1108(0, 4562, arg0.field3487, arg1.field2503, arg1.field2548, arg0.field3465);
        return -var3 + arg0.field3487;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field1320;
        if (arg2) {
            if (~arg1 != -1) {
                if (~arg1 == -2) {
                    super.field373 = arg0.method1265(113) == 1;
                    return;
                }
            } else {
                this.field1324 = new class203[arg0.method1265(125)];
                for (int var4 = 0; this.field1324.length > var4; ++var4) {
                    int var5 = arg0.method1265(117);
                    if (~var5 != -1) {
                        if (~var5 != -2) {
                            if (var5 != 2) {
                                if (~var5 == -4) {
                                    this.field1324[var4] = class279.method1842(arg0, 13613);
                                }
                            } else {
                                this.field1324[var4] = class211.method1476((byte) -117, arg0);
                            }
                        } else {
                            this.field1324[var4] = class162.method1069(103, arg0);
                        }
                    } else {
                        this.field1324[var4] = class49.method297(arg0, -11324);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(BI)I")
    public static final int method402(byte arg0, int arg1) {
        ++field1322;
        return arg0 >= -69 ? 21 : 255 & arg1;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        int[][] var3 = super.field366.method209(0, arg0);
        ++field1319;
        if (super.field366.field508) {
            int var4 = class72.field1359;
            int var5 = class9.field179;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field366.method205(-20966);
            this.method400(var6, 0);
            for (int var8 = 0; ~class9.field179 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; class72.field1359 > var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class129.method777(255, var15) << 4;
                    var12[var14] = class129.method777(65280, var15) >> 4;
                    var11[var14] = class129.method777(16711680, var15) >> 12;
                }
            }
        }
        if (arg1 != 1) {
            method401((class190) null, (class143) null, -106);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        if (arg0 >= -13) {
            this.field1324 = null;
        }
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            this.method400(super.field369.method301(-107), 0);
        }
        ++field1315;
        return var3;
    }
}
