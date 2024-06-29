import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class17 extends class144 {

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    private int field206 = 1;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    private int field210 = 1;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field202 = 1;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "Ljava/lang/String;")
    public static String field211 = null;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field212;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field2059 = ~arg1.method1407(arg2 ^ 20731) == -2;
                }
            } else {
                this.field206 = arg1.method1407(117);
            }
        } else {
            this.field210 = arg1.method1407(126);
        }
        if (arg2 != 20630) {
            this.method9(-54, (class216) null, 2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(B)V")
    public static void method100(byte arg0) {
        field211 = null;
        if (arg0 != -104) {
            method100((byte) -61);
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)Z")
    public static final boolean method101(int arg0, int arg1) {
        int var2 = -44 / ((-41 - arg1) / 59);
        ++field201;
        return arg0 >= 0 && ~arg0 > ~class24.field290.length ? class24.field290[arg0] : false;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        int[] var3 = super.field2069.method425(true, arg0);
        if (arg1 != 255) {
            return null;
        } else {
            ++field205;
            if (super.field2069.field820) {
                int var4 = this.field206 + 1 + this.field206;
                int var5 = 65536 / var4;
                int var6 = this.field210 + 1 + this.field210;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field206 + arg0; var9 <= arg0 - -this.field206; ++var9) {
                    int[] var13 = this.method934(arg1 + -19132, 0, var9 & class166.field2391);
                    int[] var14 = new int[class104.field1411];
                    int var15 = 0;
                    for (int var16 = -this.field210; ~var16 >= ~this.field210; ++var16) {
                        var15 += var13[var16 & class112.field1487];
                    }
                    int var17 = 0;
                    while (class104.field1411 > var17) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[class112.field1487 & -this.field210 + var17];
                        ++var17;
                        var15 = var13[class112.field1487 & this.field210 + var17] + var18;
                    }
                    var8[-arg0 + this.field206 + var9] = var14;
                }
                for (int var10 = 0; var10 < class104.field1411; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var12 < var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILqi;)Lfg;")
    public static final class71 method102(int arg0, int arg1, class216 arg2) {
        ++field214;
        class71 var3 = new class71(arg0, arg2.method1352((byte) -91), arg2.method1352((byte) -102), arg2.method1358(105), arg2.method1358(arg1 ^ -72), ~arg2.method1407(107) == -2, arg2.method1407(arg1 + 122));
        int var4 = arg2.method1407(arg1 ^ -115);
        if (arg1 != -3) {
            field202 = 70;
        }
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            var3.field830.method1522(new class112(arg2.method1407(104), arg2.method1407(112), arg2.method1380(true), arg2.method1380(true), arg2.method1380(true), arg2.method1380(true), arg2.method1380(true), arg2.method1380(true), arg2.method1380(true), arg2.method1380(true)), -26);
        }
        var3.method433(119);
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(B)I")
    public static final int method103(byte arg0) {
        ++field208;
        if (arg0 <= 5) {
            return -29;
        } else if (class200.field2840 == null) {
            return -1;
        } else {
            while (class200.field2840.field2238 > field213) {
                if (class200.field2840.method1011(false, field213)) {
                    return field213++;
                }
                ++field213;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)Z")
    public static final boolean method104(boolean arg0, int arg1) {
        ++field203;
        class176 var2 = class60.method371(arg1, 128);
        if (var2 == null) {
            return false;
        } else if (~class56.field659 != -2 && class56.field659 != 2 && ~class200.field2851 != -3) {
            String var3 = "";
            if (~class200.field2851 != -1) {
                var3 = ":" + (var2.field2503 - -7000);
            }
            String var4 = "";
            if (client.field4449 != null) {
                var4 = "/p=" + client.field4449;
            }
            String var5 = "http://" + var2.field2495 + var3 + "/l=" + class146.field2156 + "/a=" + class133.field1939 + var4 + "/j" + (class270.field3939 ? "1" : "0") + ",o" + (class146.field2157 ? "1" : "0") + ",a2,m" + (!class255.field3681 ? "0" : "1");
            if (arg0) {
                return true;
            } else {
                try {
                    class210.field2953.getAppletContext().showDocument(new URL(var5), "_self");
                    return true;
                } catch (Exception var6) {
                    return false;
                }
            }
        } else {
            class210.field2952 = var2.field2503;
            class151.field2198 = var2.field2495;
            if (~class200.field2851 != -1) {
                class267.field3851 = 40000 - -class210.field2952;
                class182.field2601 = class267.field3851;
                class263.field3811 = 50000 - -class210.field2952;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)V")
    public static final void method105(int arg0, byte arg1) {
        ++field209;
        if (~class141.field2034 != ~arg0) {
            int var2 = -70 / ((arg1 - 5) / 43);
            if (class141.field2034 == 0) {
                class76.method465(-85);
            }
            if (arg0 == 40) {
                class6.method38(-25444);
            }
            if (~arg0 != -41 && class77.field923 != null) {
                class77.field923.method1199(-37);
                class77.field923 = null;
            }
            if (~arg0 == -26 || arg0 == 28) {
                class168.field2423 = 0;
                class196.field2796 = 1;
                class121.field1722 = 0;
                class80.field946 = 0;
                class163.field2348 = 1;
                class222.method1444((byte) -127, true);
            }
            if (arg0 == 25 || arg0 == 10) {
                class219.method1425((byte) -59);
            }
            boolean var3 = ~arg0 == -6 || arg0 == 10 || arg0 == 28;
            if (~arg0 == -6) {
                class229.method1490(class120.field1705, 105);
            } else {
                class153.method1001(-27477);
            }
            boolean var4 = ~class141.field2034 == -6 || ~class141.field2034 == -11 || class141.field2034 == 28;
            if (!var3 == var4) {
                if (!var3) {
                    class71.method435(false, 2);
                    class80.field950.method1051(0, true);
                } else {
                    class34.field400 = class161.field2321;
                    if (class137.field1989 != 0) {
                        class79.method477(false, 1, class161.field2321, 255, class163.field2346, 2, 0);
                    } else {
                        class71.method435(false, 2);
                    }
                    class80.field950.method1051(0, false);
                }
            }
            class141.field2034 = arg0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        ++field207;
        if (arg0 != 5) {
            this.method12(-75, -79);
        }
        int[][] var3 = super.field2053.method1542(103, arg1);
        if (super.field2053.field3408) {
            int var4 = this.field206 + 1 + this.field206;
            int var5 = 65536 / var4;
            int var6 = this.field210 + this.field210 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field206 + arg1; ~(arg1 - -this.field206) <= ~var9; ++var9) {
                int var19 = 0;
                int[][] var20 = this.method927(class166.field2391 & var9, true, 0);
                int[][] var21 = new int[3][class104.field1411];
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var20[0];
                int[] var25 = var20[1];
                int[] var26 = var20[2];
                for (int var27 = -this.field210; this.field210 >= var27; ++var27) {
                    int var37 = var27 & class112.field1487;
                    var23 += var26[var37];
                    var22 += var25[var37];
                    var19 += var24[var37];
                }
                int[] var28 = var21[0];
                int[] var29 = var21[1];
                int[] var30 = var21[2];
                int var31 = 0;
                while (~class104.field1411 < ~var31) {
                    var28[var31] = var7 * var19 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field210 & class112.field1487;
                    ++var31;
                    int var33 = var23 - var26[var32];
                    int var34 = var19 - var24[var32];
                    int var35 = var22 - var25[var32];
                    int var36 = this.field210 + var31 & class112.field1487;
                    var19 = var24[var36] + var34;
                    var23 = var26[var36] + var33;
                    var22 = var25[var36] + var35;
                }
                var8[-arg1 + var9 + this.field206] = var21;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class104.field1411 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V")
    public static final void method106(int arg0) {
        ++class151.field2197;
        class94.field1259.method592(76, false);
        int var1 = -45 / ((arg0 - -80) / 39);
        ++field204;
        class94.field1259.method1379(-47, 0L);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class17() {
        super(1, false);
    }
}
