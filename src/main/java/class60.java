import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class60 extends class23 {

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    private int field1129 = 32768;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "Li;")
    public static class88 field1124 = class208.method1425(105, " loggt sich ein)3");

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "[Lhe;")
    public static class82[] field1127 = new class82[4];

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "Li;")
    public static class88 field1133 = class208.method1425(105, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "Lca;")
    public static class24 field1123 = new class24(500);

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field369 = ~arg0.method347(arg1 ^ -26118) == -2;
            }
        } else {
            this.field1129 = arg0.method301(48) << 4;
        }
        if (arg1 != -3) {
            method433(-92, false, 56, -26, 45, (class109) null);
        }
        ++field1121;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class60() {
        super(3, false);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Li;IBLi;Li;)V")
    public static final void method428(class88 arg0, int arg1, byte arg2, class88 arg3, class88 arg4) {
        ++field1122;
        if (arg2 >= -68) {
            method432(-100);
        }
        class118.method803(arg3, (byte) 28, -1, arg0, arg1, arg4);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        ++field1132;
        class108.method742(-10798);
        if (arg0 != -69) {
            method431((byte) -90, 53);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lnb;Lnb;Li;ILi;)Lcc;")
    public static final class26 method429(class144 arg0, class144 arg1, class88 arg2, int arg3, class88 arg4) {
        ++field1131;
        int var5 = arg1.method966(arg4, (byte) -3);
        if (arg3 > -67) {
            return null;
        } else {
            int var6 = arg1.method968(arg2, var5, 104);
            return class106.method737(var6, arg0, var5, 61, arg1);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        int[] var3 = super.field379.method1080(false, arg0);
        if (arg1 <= 19) {
            this.method11((class46) null, -69, 111);
        }
        if (super.field379.field3100) {
            int[] var4 = this.method120(arg0, false, 1);
            int[] var5 = this.method120(arg0, false, 2);
            for (int var6 = 0; class70.field1276 > var6; ++var6) {
                int var7 = var5[var6] * this.field1129 >> 12;
                int var8 = 255 & var4[var6] >> 4;
                int var9 = class150.field2922[var8] * var7 >> 12;
                int var10 = class92.field1735[var8] * var7 >> 12;
                int var11 = var6 - -(var9 >> 12) & class45.field789;
                int var12 = class220.field4160 & (var10 >> 12) + arg0;
                int[] var13 = this.method120(var12, false, 0);
                var3[var6] = var13[var11];
            }
        }
        ++field1125;
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public static void method430(int arg0) {
        field1133 = null;
        if (arg0 != 500) {
            field1123 = null;
        }
        field1124 = null;
        field1123 = null;
        field1127 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Z")
    public static final boolean method431(byte arg0, int arg1) {
        int var2 = -31 % ((arg0 - 59) / 61);
        ++field1134;
        return (1575538951 & arg1) >> 30 != 0;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
    public static final void method432(int arg0) {
        ++field1128;
        class223.field4198 = 0;
        class192.field3704 = 0;
        class2.method9((byte) -12);
        class88.method633(arg0 + 31096);
        class196.method1361(true);
        for (int var1 = arg0; var1 < class223.field4198; ++var1) {
            int var3 = class53.field999[var1];
            if (class117.field2115 != class225.field4225[var3].field4083) {
                class225.field4225[var3].field3684 = null;
                class225.field4225[var3] = null;
            }
        }
        if (~class228.field4272 != ~class230.field4314.field831) {
            throw new RuntimeException("gnp1 pos:" + class230.field4314.field831 + " psize:" + class228.field4272);
        } else {
            for (int var2 = 0; ~class55.field1041 < ~var2; ++var2) {
                if (class225.field4225[class25.field402[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class55.field1041);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZIIILk;)V")
    public static final void method433(int arg0, boolean arg1, int arg2, int arg3, int arg4, class109 arg5) {
        ++field1130;
        int var6 = 26 % ((-49 - arg0) / 59);
        if (~class174.field3447 > -51) {
            if (arg5.field2003 != null && arg5.field2003.length >= 1 && ~arg3 > ~arg5.field2003.length && arg5.field2003[arg3] != null) {
                int var7 = arg5.field2003[arg3][0];
                int var8 = var7 >> 8;
                int var9 = var7 >> 4 & 7;
                int var10 = var7 & 15;
                if (arg5.field2003[arg3].length > 1) {
                    int var11 = (int) (Math.random() * (double) arg5.field2003[arg3].length);
                    if (var11 > 0) {
                        var8 = arg5.field2003[arg3][var11];
                    }
                }
                if (var10 == 0) {
                    if (arg1) {
                        class92.method669(var9, 0, var8, 0);
                    }
                } else if (class223.field4213 != 0) {
                    class25.field397[class174.field3447] = var8;
                    class110.field2018[class174.field3447] = var9;
                    class8.field116[class174.field3447] = 0;
                    int var12 = (arg4 + -64) / 128;
                    class237.field4419[class174.field3447] = null;
                    int var13 = (arg2 + -64) / 128;
                    class145.field2728[class174.field3447] = (var12 << 16) - -(var13 << 8) + var10;
                    ++class174.field3447;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        ++field1126;
        if (arg1 != 13) {
            method429((class144) null, (class144) null, (class88) null, -119, (class88) null);
        }
        int[][] var3 = super.field364.method1541(true, arg0);
        if (super.field364.field4312) {
            int[] var4 = this.method120(arg0, false, 1);
            int[] var5 = this.method120(arg0, false, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class70.field1276; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field1129 >> 12;
                int var12 = class150.field2922[var10] * var11 >> 12;
                int var13 = class92.field1735[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class45.field789;
                int var15 = arg0 - -(var13 >> 12) & class220.field4160;
                int[][] var16 = this.method121(0, (byte) -117, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
