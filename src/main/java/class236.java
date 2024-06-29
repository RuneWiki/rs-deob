import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class236 extends class183 {

    @OriginalMember(owner = "client!kk", name = "ab", descriptor = "[I")
    public static int[] field4081 = new int[25];

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!kk", name = "Y", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!kk", name = "Z", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!kk", name = "bb", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!kk", name = "cb", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!kk", name = "eb", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!kk", name = "db", descriptor = "[[[B")
    public static byte[][][] field4084;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lkh;I)Loc;", line = 4)
    public static final class144 method1684(class14 arg0, int arg1) {
        field4079++;
        if (arg1 != 2) {
            field4081 = (int[]) null;
        }
        return new class144(arg0.method113((byte) 122), arg0.method113((byte) -113), arg0.method113((byte) -119), arg0.method113((byte) -127), arg0.method114(0), arg0.method114(0), arg0.method93(false));
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)[[I", line = 16)
    public final int[][] method12(int arg0, int arg1) {
        int var3 = 40 / ((arg0 - 18) / 61);
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[] var5 = this.method1253(2, arg1, 85);
            int[][] var6 = this.method1250(arg1, 0, (byte) 85);
            int[][] var7 = this.method1250(arg1, 1, (byte) 113);
            int[] var8 = var4[1];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[2];
            int[] var13 = var6[1];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; var17 < class22.field393; var17++) {
                int var18 = var5[var17];
                if (var18 == 4096) {
                    var9[var17] = var11[var17];
                    var8[var17] = var13[var17];
                    var10[var17] = var12[var17];
                } else if (var18 == 0) {
                    var9[var17] = var14[var17];
                    var8[var17] = var15[var17];
                    var10[var17] = var16[var17];
                } else {
                    int var19 = 4096 - var18;
                    var9[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                    var8[var17] = var13[var17] * var18 + (var15[var17] * var19) >> 12;
                    var10[var17] = var12[var17] * var18 + var16[var17] * var19 >> 12;
                }
            }
        }
        field4085++;
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)V", line = 92)
    public static final void method1685(byte arg0) {
        field4075++;
        if (arg0 >= -106) {
            field4081 = (int[]) null;
        }
        byte var1 = 8;
        int var2 = (class243.field4301 >> 10) + (class213.field3649 >> 3);
        byte var3 = 18;
        class282.field4841 = new int[var3];
        class175.field3053 = new int[var3];
        class270.field4631 = new int[var3];
        int var4 = (class97.field1721 >> 10) + (class258.field4503 >> 3);
        class267.field4583 = new int[var3];
        class89.field1627 = new byte[var3][];
        byte var5 = 0;
        class203.field3553 = new byte[var3][];
        class328.field5535 = new byte[var3][];
        byte var6 = 8;
        class270.field4638 = new byte[var3][];
        class29.field511 = new int[var3];
        class321.field5435 = new int[var3][4];
        class117.field2089 = new byte[var3][];
        class220.field3749 = new int[var3];
        int var7 = 0;
        for (int var8 = (var4 - 6) / 8; var8 <= (var4 + 6) / 8; var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= ((var2 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class29.field511[var7] = var10;
                class220.field3749[var7] = class20.field332.method1292(class142.method989(new class229[] { class95.field1693, class84.method607(106, var8), class313.field5319, class84.method607(87, var9) }, -64), (byte) 104);
                class175.field3053[var7] = class20.field332.method1292(class142.method989(new class229[] { class270.field4643, class84.method607(85, var8), class313.field5319, class84.method607(87, var9) }, -34), (byte) 82);
                class267.field4583[var7] = class20.field332.method1292(class142.method989(new class229[] { class106.field1824, class84.method607(-59, var8), class313.field5319, class84.method607(77, var9) }, -91), (byte) 75);
                class282.field4841[var7] = class20.field332.method1292(class142.method989(new class229[] { class102.field1781, class84.method607(105, var8), class313.field5319, class84.method607(126, var9) }, -86), (byte) 115);
                class270.field4631[var7] = class20.field332.method1292(class142.method989(new class229[] { class331.field5646, class84.method607(100, var8), class313.field5319, class84.method607(120, var9) }, -82), (byte) 80);
                if (class267.field4583[var7] == -1) {
                    class220.field3749[var7] = -1;
                    class175.field3053[var7] = -1;
                    class282.field4841[var7] = -1;
                    class270.field4631[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class267.field4583.length; var11++) {
            class267.field4583[var11] = -1;
            class220.field3749[var11] = -1;
            class175.field3053[var11] = -1;
            class282.field4841[var11] = -1;
            class270.field4631[var11] = -1;
        }
        class161.method1085(var1, var6, (byte) -122, var2, true, var4, var5);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIII)V", line = 175)
    public static final void method1686(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4078++;
        if (arg4 < arg1) {
            class34.method306(arg4, class173.field3021[arg3], (byte) 125, arg1, arg2);
        } else {
            class34.method306(arg1, class173.field3021[arg3], (byte) 125, arg4, arg2);
        }
        if (arg0 != -1306783965) {
            field4081 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 199)
    public class236() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V", line = 206)
    public static final void method1687(int arg0) {
        field4082++;
        for (int var1 = -1; var1 < class132.field2323; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class90.field1652[var1];
            }
            class33 var3 = class192.field3334[var2];
            if (var3 != null && var3.field1977 > 0) {
                var3.field1977--;
                if (var3.field1977 == 0) {
                    var3.field1967 = null;
                }
            }
        }
        int var4 = -108 % ((-arg0 - 60) / 49);
        for (int var5 = 0; var5 < class126.field2238; var5++) {
            int var6 = class283.field4858[var5];
            class331 var7 = class331.field5637[var6];
            if (var7 != null && var7.field1977 > 0) {
                var7.field1977--;
                if (var7.field1977 == 0) {
                    var7.field1967 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V", line = 263)
    public static void method1688(int arg0) {
        if (arg0 == 128) {
            field4084 = (byte[][][]) null;
            field4081 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lpk;BI)V", line = 277)
    public static final void method1689(class112 arg0, byte arg1, int arg2) {
        field4074++;
        if (class199.field3475 < arg0.field1998) {
            class8.method46(1536, arg0);
        } else if (arg0.field1982 >= class199.field3475) {
            class202.method1414(arg0, (byte) 9);
        } else {
            class30.method256(false, arg0);
        }
        if (arg0.field1983 < 128 || arg0.field2028 < 128 || arg0.field1983 >= 13184 || arg0.field2028 >= 13184) {
            arg0.field1999 = -1;
            arg0.field2000 = -1;
            arg0.field1998 = 0;
            arg0.field1982 = 0;
            arg0.field1983 = arg0.field2018[0] * 128 + (arg0.method299(true) * 64);
            arg0.field2028 = arg0.field2017[0] * 128 + arg0.method299(true) * 64;
            arg0.method796(-29738);
        }
        if (class301.field5124 == arg0 && (arg0.field1983 < 1536 || arg0.field2028 < 1536 || arg0.field1983 >= 11776 || arg0.field2028 >= 11776)) {
            arg0.field1999 = -1;
            arg0.field1982 = 0;
            arg0.field2000 = -1;
            arg0.field1998 = 0;
            arg0.field1983 = arg0.field2018[0] * 128 + arg0.method299(true) * 64;
            arg0.field2028 = arg0.field2017[0] * 128 + (arg0.method299(true) * 64);
            arg0.method796(-29738);
        }
        if (arg1 >= 35) {
            class208.method1442((byte) 115, arg0);
            class160.method1080((byte) 112, arg0);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)[I", line = 334)
    public final int[] method10(int arg0, int arg1) {
        int[] var3 = this.field3161.method664(arg0, 0);
        if (arg1 != -1) {
            field4081 = (int[]) null;
        }
        if (this.field3161.field1736) {
            int[] var4 = this.method1253(0, arg0, 90);
            int[] var5 = this.method1253(1, arg0, arg1 + 90);
            int[] var6 = this.method1253(2, arg0, 113);
            for (int var7 = 0; var7 < class22.field393; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        field4080++;
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILkh;I)V", line = 388)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field4076++;
        if (arg2 == 0) {
            this.field3166 = arg1.method93(false) == 1;
        }
        if (arg0 > -43) {
            method1690(false);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(Z)V", line = 403)
    public static final void method1690(boolean arg0) {
        field4083++;
        class18.method176((byte) 81, 5);
        class282.method1976(5, 87);
        class224.method1539(127, 5);
        class223.method1535(5, -14398);
        class69.method515(1, 5);
        class238.method1702(5, 0);
        class186.method1300(1, 5);
        class232.method1664(113, 5);
        class93.method652(5, (byte) -55);
        class232.method1669(5, -17367);
        class307.method2093(5, (byte) 82);
        if (!arg0) {
            method1687(-124);
        }
        class51.method416(50, 0);
        class329.method2244(5, 127);
        class235.method1683(-8826, 5);
        class122.field2165.method231((byte) 113, 5);
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V", line = 428)
    public static final void method1691(int arg0) {
        if (arg0 == 2) {
            class118.field2101.method226((byte) -121);
            field4077++;
        }
    }
}
