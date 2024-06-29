import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class188 extends class21 {

    @OriginalMember(owner = "client!id", name = "X", descriptor = "[S")
    private short[] field3050 = new short[257];

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    private int field3044 = 0;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field3043 = 0;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "Z")
    public static boolean field3047 = false;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "[I")
    private int[] field3042;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "[I")
    private int[] field3045;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "[[I")
    private int[][] field3049;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)[I", line = 5)
    private final int[] method1197(byte arg0, int arg1) {
        field3057++;
        if (arg1 < 0) {
            return this.field3042;
        } else {
            if (arg0 != -70) {
                this.field3049 = (int[][]) ((int[][]) null);
            }
            return arg1 < this.field3049.length ? this.field3049[arg1] : this.field3045;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[I", line = 31)
    public final int[] method177(int arg0, int arg1) {
        int var3 = -62 % ((arg0 - 33) / 36);
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int[] var5 = this.method171(0, -75, arg1);
            for (int var6 = 0; var6 < class294.field4489; var6++) {
                int var7 = var5[var6] >> 4;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var4[var6] = this.field3050[var7];
            }
        }
        field3041++;
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V", line = 75)
    public static final void method1198(int arg0) {
        field3055++;
        class148.method963(1);
        class341.method2362(64);
        class95.method637(60);
        class146.method950(32);
        class150.method980(true);
        class209.method1418(1);
        class122.method793(70);
        class176.method1106(true);
        class43.method322(true);
        class121.method785((byte) 112);
        class112.method720(-71);
        class85.method594(123);
        int var1 = 56 / ((-arg0 - 43) / 58);
        class294.method1973((byte) -110);
        class180.method1137(0);
        class142.method920((byte) -59);
        class28.method228(false);
        class286.method1934((byte) -86);
        class146.method944((byte) 46);
        if (class201.field3204 != 0) {
            for (int var2 = 0; var2 < class325.field4974.length; var2++) {
                class325.field4974[var2] = null;
            }
            class219.field3482 = 0;
        }
        class282.method1897(16388);
        class343.method2379(26407);
        class21.field445.method1884(-22054);
        if (!class249.field3893) {
            ((class52) class284.field4393).method386(77);
        }
        class133.field2248.method2376(0);
        class84.field1592.method2041(8711);
        class186.field3026.method2041(8711);
        class331.field5069.method2041(8711);
        class221.field3508.method2041(8711);
        class138.field2304.method2041(8711);
        class75.field1530.method2041(8711);
        class136.field2278.method2041(8711);
        class154.field2514.method2041(8711);
        class259.field4026.method2041(8711);
        class118.field2060.method2041(8711);
        class84.field1596.method2041(8711);
        class269.field4156.method1884(-22054);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lve;I)I", line = 135)
    public static final int method1199(class278 arg0, int arg1) {
        if (arg1 != 259336492) {
            method1200(false, (String) null, false);
        }
        int var2 = arg0.field4263;
        field3046++;
        class322 var3 = arg0.method698(-114);
        if (arg0.field1893 == var3.field4907) {
            var2 = arg0.field4266;
        } else if (arg0.field1893 == var3.field4936 || arg0.field1893 == var3.field4918 || arg0.field1893 == var3.field4902 || arg0.field1893 == var3.field4928) {
            var2 = arg0.field4260;
        } else if (arg0.field1893 == var3.field4910 || arg0.field1893 == var3.field4920 || arg0.field1893 == var3.field4931 || arg0.field1893 == var3.field4934) {
            var2 = arg0.field4277;
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILag;)V", line = 165)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg1 == 0) {
            this.field3044 = arg2.method1317((byte) -76);
            this.field3049 = new int[arg2.method1317((byte) -89)][2];
            for (int var4 = 0; var4 < this.field3049.length; var4++) {
                this.field3049[var4][0] = arg2.method1315(14289);
                this.field3049[var4][1] = arg2.method1315(class331.method2296(arg0, -14061));
            }
        }
        field3051++;
        if (arg0 != -318) {
            this.method1204((byte) 29);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZLjava/lang/String;Z)V", line = 195)
    public static final void method1200(boolean arg0, String arg1, boolean arg2) {
        field3052++;
        byte var3 = 4;
        int var4 = var3 + 6;
        if (arg0) {
            field3043 = 59;
        }
        int var5 = var3 + 6;
        int var6 = class33.field674.method2129(arg1, 250);
        int var7 = class33.field674.method2115(arg1, 250) * 13;
        if (class249.field3893) {
            class115.method755(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 - -var3, 0);
            class115.method756(var5 - var3, var4 - var3, var6 + var3 + var3, var3 + var3 + var7, 16777215);
        } else {
            class270.method1811(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 - -var3, 0);
            class270.method1802(var5 - var3, var4 - var3, var3 + var6 + var3, var3 + var7 - -var3, 16777215);
        }
        class33.field674.method2110(arg1, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class25.method204((byte) -85, var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3);
        if (!arg2) {
            class328.method2273(var6, (byte) 127, var4, var7, var5);
        } else if (class249.field3893) {
            class249.method1686();
        } else {
            try {
                Graphics var8 = class216.field3456.getGraphics();
                class330.field5055.method265(0, var8, 0, (byte) -112);
            } catch (Exception var10) {
                class216.field3456.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 249)
    public class188() {
        super(1, true);
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V", line = 259)
    private final void method1201(int arg0) {
        int[] var2 = this.field3049[this.field3049.length - 2];
        int[] var3 = this.field3049[0];
        int[] var4 = this.field3049[1];
        field3053++;
        if (arg0 == 69) {
            int[] var5 = this.field3049[this.field3049.length - 1];
            this.field3042 = new int[] { var3[0] - (var4[0] - var3[0]), var3[1] + var3[1] + -var4[1] };
            this.field3045 = new int[] { var2[0] + var2[0] - var5[0], -var5[1] - (-var2[1] - var2[1]) };
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILbm;)V", line = 282)
    public static final void method1202(int arg0, class307 arg1) {
        field3048++;
        class235.field3690 = arg1;
        int var2 = 38 % ((arg0 - 62) / 39);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(CB)C", line = 292)
    public static final char method1203(char arg0, byte arg1) {
        field3056++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else {
            if (arg1 < 94) {
                method1202(-64, (class307) null);
            }
            if (arg0 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg0 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V", line = 323)
    public final void method183(byte arg0) {
        if (arg0 <= 82) {
            this.method1197((byte) 13, 60);
        }
        field3040++;
        if (this.field3049 == null) {
            this.field3049 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field3049.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3044 == 2) {
            this.method1201(69);
        }
        class233.method1546(17431);
        this.method1204((byte) -114);
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(B)V", line = 345)
    private final void method1204(byte arg0) {
        field3054++;
        if (arg0 != -114) {
            return;
        }
        int var2 = this.field3044;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; (this.field3049.length - 1) > var5 && this.field3049[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field3049[var5];
                int[] var7 = this.field3049[var5 - 1];
                int var8 = this.method1197((byte) -70, var5 - 2)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var12 = var9 - var8;
                int var13 = this.method1197((byte) -70, var5 + 1)[1];
                int var14 = var13 + var10 - var8 - var9;
                int var15 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var16 = var15 * var15 >> 12;
                int var17 = var12 * var15 >> 12;
                int var18 = var8 - var10 - var14;
                int var19 = var16 * var18 >> 12;
                int var20 = (var14 * var15 >> 12) * var16 >> 12;
                int var21 = var10 + var20 + var19 + var17;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3050[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var30 = 0; var30 < 257; var30++) {
                int var31 = var30 << 4;
                int var32;
                for (var32 = 1; var32 < (this.field3049.length - 1) && this.field3049[var32][0] <= var31; var32++) {
                }
                int[] var33 = this.field3049[var32];
                int[] var34 = this.field3049[var32 - 1];
                int var35 = (var31 - var34[0] << 12) / (var33[0] - var34[0]);
                int var36 = 4096 - class122.field2117[(var35 & 0x1FF5) >> 5] >> 1;
                int var37 = 4096 - var36;
                int var38 = var34[1] * var37 + (var33[1] * var36) >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3050[var30] = (short) var38;
            }
        } else {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; var24 < this.field3049.length - 1 && this.field3049[var24][0] <= var23; var24++) {
                }
                int[] var25 = this.field3049[var24];
                int[] var26 = this.field3049[var24 - 1];
                int var27 = (var23 - var26[0] << 12) / (var25[0] - var26[0]);
                int var28 = 4096 - var27;
                int var29 = var25[1] * var27 + var26[1] * var28 >> 12;
                if (var29 <= -32768) {
                    var29 = -32767;
                }
                if (var29 >= 32768) {
                    var29 = 32767;
                }
                this.field3050[var22] = (short) var29;
            }
        }
    }
}
