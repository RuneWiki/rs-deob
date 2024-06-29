import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class54 extends class242 {

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "Z")
    public static boolean field888 = false;

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "Z")
    public static boolean field886 = false;

    @OriginalMember(owner = "client!nh", name = "gb", descriptor = "I")
    public static int field891 = -1;

    @OriginalMember(owner = "client!nh", name = "ib", descriptor = "Z")
    public static boolean field893 = false;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "[I")
    public static int[] field879 = new int[2];

    @OriginalMember(owner = "client!nh", name = "hb", descriptor = "I")
    public static int field892 = 127;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!nh", name = "jb", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "Lkk;")
    public static class229 field885;

    @OriginalMember(owner = "client!nh", name = "fb", descriptor = "Ltd;")
    public static class72 field890;

    @OriginalMember(owner = "client!nh", name = "kb", descriptor = "Ljava/lang/String;")
    public static String field895;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "[Lsf;")
    private class94[] field884;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "[[[B")
    public static byte[][][] field882;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BI)V")
    public static final void method394(byte[] arg0, int arg1) {
        ++field881;
        class25 var2 = new class25(arg0);
        var2.field481 = arg0.length + -2;
        class149.field2579 = var2.method193((byte) 77);
        class261.field4615 = new boolean[class149.field2579];
        if (arg1 != 10961) {
            method398(20);
        }
        class182.field3178 = new byte[class149.field2579][];
        class124.field2172 = new int[class149.field2579];
        class57.field915 = new int[class149.field2579];
        class97.field1562 = new int[class149.field2579];
        class262.field4637 = new byte[class149.field2579][];
        class243.field4263 = new int[class149.field2579];
        var2.field481 = -(class149.field2579 * 8) + -7 + arg0.length;
        class93.field1512 = var2.method193((byte) 77);
        class221.field3828 = var2.method193((byte) 77);
        int var3 = (255 & var2.method189((byte) -103)) - -1;
        for (int var4 = 0; ~var4 > ~class149.field2579; ++var4) {
            class243.field4263[var4] = var2.method193((byte) 77);
        }
        for (int var5 = 0; var5 < class149.field2579; ++var5) {
            class124.field2172[var5] = var2.method193((byte) 77);
        }
        for (int var6 = 0; class149.field2579 > var6; ++var6) {
            class97.field1562[var6] = var2.method193((byte) 77);
        }
        for (int var7 = 0; class149.field2579 > var7; ++var7) {
            class57.field915[var7] = var2.method193((byte) 77);
        }
        var2.field481 = arg0.length - 7 + -(class149.field2579 * 8) + -((var3 - 1) * 3);
        class16.field309 = new int[var3];
        for (int var8 = 1; var8 < var3; ++var8) {
            class16.field309[var8] = var2.method230(15046);
            if (~class16.field309[var8] == -1) {
                class16.field309[var8] = 1;
            }
        }
        var2.field481 = 0;
        for (int var9 = 0; class149.field2579 > var9; ++var9) {
            int var10 = class97.field1562[var9];
            int var11 = class57.field915[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class182.field3178[var9] = var13;
            byte[] var14 = new byte[var12];
            class262.field4637[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method189((byte) -103);
            if (~(1 & var16) != -1) {
                int var17 = 0;
                label92: while (true) {
                    if (~var17 <= ~var10) {
                        if ((2 & var16) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (~var18 <= ~var10) {
                                break label92;
                            }
                            for (int var19 = 0; ~var11 < ~var19; ++var19) {
                                byte var20 = var14[var10 * var19 + var18] = var2.method200(32768);
                                var15 |= ~var20 != 0;
                            }
                            ++var18;
                        }
                    }
                    for (int var21 = 0; var11 > var21; ++var21) {
                        var13[var10 * var21 + var17] = var2.method200(arg1 + 21807);
                    }
                    ++var17;
                }
            } else {
                for (int var22 = 0; var12 > var22; ++var22) {
                    var13[var22] = var2.method200(32768);
                }
                if ((2 & var16) != 0) {
                    for (int var23 = 0; ~var12 < ~var23; ++var23) {
                        byte var24 = var14[var23] = var2.method200(32768);
                        var15 |= ~var24 != 0;
                    }
                }
            }
            class261.field4615[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        ++field894;
        if (~arg1 == -1) {
            this.field884 = new class94[arg2.method189((byte) -103)];
            for (int var4 = 0; this.field884.length > var4; ++var4) {
                int var5 = arg2.method189((byte) -103);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field884[var4] = class259.method1755(95, arg2);
                            }
                        } else {
                            this.field884[var4] = class86.method619(arg2, 57);
                        }
                    } else {
                        this.field884[var4] = class189.method1319(arg2, -126);
                    }
                } else {
                    this.field884[var4] = class96.method675(-125, arg2);
                }
            }
        } else if (~arg1 == -2) {
            super.field4248 = arg2.method189((byte) -103) == 1;
        }
        if (arg0 >= -119) {
            method399(true);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lob;IIBI)V")
    public static final void method395(class130 arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field889;
        if (arg3 != 99) {
            field890 = null;
        }
        for (class23 var5 = (class23) class13.field259.method651(arg3 ^ 12823); var5 != null; var5 = (class23) class13.field259.method643(11066)) {
            if (var5.field420 == arg4 && ~(arg1 * 128) == ~var5.field424 && arg2 * 128 == var5.field430 && var5.field428.field2290 == arg0.field2290) {
                if (var5.field411 != null) {
                    class234.field4082.method1823(var5.field411);
                    var5.field411 = null;
                }
                if (var5.field408 != null) {
                    class234.field4082.method1823(var5.field408);
                    var5.field408 = null;
                }
                var5.method1146(26159);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B[[I)V")
    private final void method396(byte arg0, int[][] arg1) {
        if (arg0 >= -124) {
            this.method49(41, 27, (class25) null);
        }
        ++field876;
        int var3 = class264.field4654;
        int var4 = class25.field486;
        class278.method1846(false, arg1);
        class194.method1340(118, 0, class230.field3968, class29.field540, 0);
        if (this.field884 != null) {
            for (int var5 = 0; ~var5 > ~this.field884.length; ++var5) {
                class94 var6 = this.field884[var5];
                int var7 = var6.field1521;
                int var8 = var6.field1520;
                if (~var7 <= -1) {
                    if (var8 >= 0) {
                        var6.method597(var4, var3, (byte) 70);
                    } else {
                        var6.method602((byte) 74, var4, var3);
                    }
                } else if (var8 >= 0) {
                    var6.method601(var4, (byte) 77, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int var3 = -43 / ((73 - arg1) / 41);
        int[] var4 = super.field4251.method1417((byte) 82, arg0);
        if (super.field4251.field3655) {
            this.method396((byte) -128, super.field4251.method1420(0));
        }
        ++field883;
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class54() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "(I)V")
    public static final void method397(int arg0) {
        if (arg0 <= -13) {
            class264.field4653.method1481(false);
            ++field880;
        }
    }

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "(I)V")
    public static final void method398(int arg0) {
        if (arg0 <= -64) {
            ++field877;
            for (int var1 = -1; var1 < class205.field3554; ++var1) {
                int var5;
                if (~var1 == 0) {
                    var5 = 2047;
                } else {
                    var5 = class250.field4376[var1];
                }
                class142 var6 = class280.field4940[var5];
                if (var6 != null && ~var6.field4789 < -1) {
                    --var6.field4789;
                    if (~var6.field4789 == -1) {
                        var6.field4797 = null;
                    }
                }
            }
            for (int var2 = 0; class112.field1845 > var2; ++var2) {
                int var3 = class46.field767[var2];
                class61 var4 = class46.field756[var3];
                if (var4 != null && ~var4.field4789 < -1) {
                    --var4.field4789;
                    if (var4.field4789 == 0) {
                        var4.field4797 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
    public static void method399(boolean arg0) {
        if (arg0) {
            field893 = true;
        }
        field879 = null;
        field882 = null;
        field885 = null;
        field890 = null;
        field895 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        ++field887;
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (!arg0) {
            this.method54(106, 7);
        }
        if (super.field4257.field2357) {
            int var4 = class264.field4654;
            int var5 = class25.field486;
            int[][][] var6 = super.field4257.method918((byte) -2);
            int[][] var7 = new int[var5][var4];
            this.method396((byte) -127, var7);
            for (int var8 = 0; ~class25.field486 < ~var8; ++var8) {
                int[][] var9 = var6[var8];
                int[] var10 = var7[var8];
                int[] var11 = var9[1];
                int[] var12 = var9[0];
                int[] var13 = var9[2];
                for (int var14 = 0; var14 < class264.field4654; ++var14) {
                    int var15 = var10[var14];
                    var13[var14] = class214.method1432(var15, 255) << 4;
                    var11[var14] = class214.method1432(4080, var15 >> 4);
                    var12[var14] = class214.method1432(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }
}
