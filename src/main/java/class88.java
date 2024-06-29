import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class88 extends class264 {

    @OriginalMember(owner = "client!tg", name = "kb", descriptor = "I")
    private int field1319 = 585;

    @OriginalMember(owner = "client!tg", name = "ib", descriptor = "I")
    public static int field1317 = 0;

    @OriginalMember(owner = "client!tg", name = "nb", descriptor = "Lma;")
    public static class5 field1322 = class12.method119(":trade:", (byte) 104);

    @OriginalMember(owner = "client!tg", name = "fb", descriptor = "[I")
    public static int[] field1314 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!tg", name = "hb", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!tg", name = "lb", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!tg", name = "mb", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!tg", name = "ob", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!tg", name = "gb", descriptor = "[I")
    public static int[] field1315;

    @OriginalMember(owner = "client!tg", name = "jb", descriptor = "[[[I")
    public static int[][][] field1318;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILii;)V", line = 6)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 >= -27) {
            field1322 = (class5) null;
        }
        field1323++;
        if (arg0 == 0) {
            this.field1319 = arg2.method1524((byte) 87);
        }
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)V", line = 33)
    public static void method579(int arg0) {
        if (arg0 != 4707) {
            field1318 = (int[][][]) ((int[][][]) null);
        }
        field1322 = null;
        field1315 = null;
        field1314 = null;
        field1318 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)I", line = 53)
    public static final int method580(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        field1320++;
        if (arg0 > -111) {
            field1318 = (int[][][]) ((int[][][]) null);
        }
        return (arg3 >> 2 << 10) + (arg1 >> 1) + (arg2 >> 5 << 7);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)[I", line = 81)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 > -58) {
            this.method4(-1, 70, (class221) null);
        }
        field1321++;
        int[] var3 = this.field4501.method1176(arg1, 127);
        if (this.field4501.field2741) {
            int var4 = class116.field1726[arg1];
            for (int var5 = 0; var5 < class226.field3716; var5++) {
                int var6 = class251.field4159[var5];
                if (var6 > this.field1319 && var6 < 4096 - this.field1319 && 2048 - this.field1319 < var4 && this.field1319 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1319);
                    var3[var5] = 4096 - var10;
                } else if (2048 - this.field1319 < var6 && var6 < this.field1319 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1319;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1319);
                } else if (var4 < this.field1319 || var4 > 4096 - this.field1319) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field1319;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1319);
                } else if (this.field1319 <= var6 && 4096 - this.field1319 >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field1319);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V", line = 163)
    public static final void method581(byte arg0) {
        field1316++;
        class212.field3377.method523(123);
        class192.field2986.method523(124);
        if (arg0 > -102) {
            method580(-12, 120, 67, -8);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 186)
    public class88() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "(I)V", line = 192)
    public static final void method582(int arg0) {
        class225.field3700 = new class198[arg0][class115.field1721][class179.field2708];
        class150.field2162 = new int[class115.field1721][class179.field2708];
        class181.field2769 = new int[arg0][class115.field1721 + 1][class179.field2708 + 1];
        class234.field3864 = new class56[arg0][];
    }
}
