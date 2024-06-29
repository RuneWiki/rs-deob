import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class82 extends class212 {

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    private int field1312 = 4096;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    private int field1306 = 409;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "[I")
    private int[] field1310 = new int[3];

    @OriginalMember(owner = "client!gi", name = "hb", descriptor = "I")
    private int field1319 = 4096;

    @OriginalMember(owner = "client!gi", name = "jb", descriptor = "I")
    private int field1321 = 4096;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    public static int field1311 = 0;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "Lsc;")
    public static class181 field1309 = class149.method967(255, "(U4");

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "Lsc;")
    public static class181 field1313 = class149.method967(255, "titlebg");

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "Lsc;")
    public static class181 field1314 = class149.method967(255, "headicons_pk");

    @OriginalMember(owner = "client!gi", name = "gb", descriptor = "[I")
    public static int[] field1318 = new int[1000];

    @OriginalMember(owner = "client!gi", name = "ib", descriptor = "Lsc;")
    public static class181 field1320 = class149.method967(255, " ");

    @OriginalMember(owner = "client!gi", name = "fb", descriptor = "Z")
    public static boolean field1317 = true;

    @OriginalMember(owner = "client!gi", name = "lb", descriptor = "Lsc;")
    private static class181 field1323 = class149.method967(255, "Continue");

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "Lsc;")
    public static class181 field1315 = field1323;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!gi", name = "eb", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!gi", name = "kb", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg0.method1508(true);
                            this.field1310[1] = class5.method43(4080, var5 >> 4);
                            this.field1310[2] = class5.method43(0, var5 >> 12);
                            this.field1310[0] = class5.method43(var5 << 4, 267386880);
                        }
                    } else {
                        this.field1319 = arg0.method1535(2);
                    }
                } else {
                    this.field1321 = arg0.method1535(arg2 + 5);
                }
            } else {
                this.field1312 = arg0.method1535(arg2 + 5);
            }
        } else {
            this.field1306 = arg0.method1535(2);
        }
        ++field1316;
        if (arg2 != -3) {
            field1322 = 77;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        ++field1308;
        if (arg1 != 16383) {
            field1315 = null;
        }
        int[][] var3 = super.field3645.method1352(arg0, -127);
        if (super.field3645.field3477) {
            int[][] var4 = this.method1410(arg0, 0, (byte) -61);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class26.field452 > var11; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field1310[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field1306) {
                    var9[var11] = var12;
                    var8[var11] = var5[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = var14 - this.field1310[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field1306 < var15) {
                        var9[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field1310[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field1306) {
                            var9[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var9[var11] = this.field1319 * var12 >> 12;
                            var8[var11] = this.field1321 * var14 >> 12;
                            var10[var11] = this.field1312 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)V")
    public static void method561(byte arg0) {
        field1315 = null;
        if (arg0 == -108) {
            field1313 = null;
            field1309 = null;
            field1320 = null;
            field1314 = null;
            field1323 = null;
            field1318 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class82() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(Z)I")
    public static final int method562(boolean arg0) {
        ++field1307;
        return arg0 ? -93 : 16;
    }
}
