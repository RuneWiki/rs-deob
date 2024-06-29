import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class94 extends class53 {

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    private int field1532 = 4096;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    private int field1528 = 4096;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "[I")
    private int[] field1531 = new int[3];

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
    private int field1536 = 4096;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
    private int field1537 = 409;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "[Lwa;")
    public static class75[] field1521 = new class75[500];

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "Lwa;")
    private static class75 field1530 = class66.method560("green:", false);

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "Lwa;")
    public static class75 field1523 = class66.method560("AUS", false);

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "Lwa;")
    public static class75 field1535 = field1530;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lwa;")
    public static class75 field1534 = field1530;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "J")
    public static long field1533 = 0L;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "Lwi;")
    public static class248 field1527;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "Lbh;")
    public static class258 field1526;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method729(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= arg2) {
            class150.method1151(7, class63.field1096[arg0], arg4, arg1, arg2);
        } else {
            class150.method1151(7, class63.field1096[arg0], arg2, arg1, arg4);
        }
        if (arg3 == 2) {
            field1520++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(I)V", line = 28)
    public static final void method730(int arg0) {
        class194.field3225.method1200(false);
        class221.field3764.method1200(false);
        class154.field2640.method1200(false);
        field1529++;
        int var1 = 126 % ((arg0 + 10) / 52);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[[I", line = 45)
    public final int[][] method66(int arg0, int arg1) {
        field1524++;
        int[][] var3 = this.field882.method874(false, arg0);
        if (this.field882.field1935) {
            int[][] var4 = this.method388(103, 0, arg0);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class269.field4644; var11++) {
                int var12 = var7[var11];
                int var13 = var12 - this.field1531[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field1537 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var5[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field1531[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field1537 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var5[var11];
                    } else {
                        int var16 = var5[var11];
                        int var17 = var16 - this.field1531[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field1537) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field1532 * var12 >> 12;
                            var9[var11] = this.field1536 * var14 >> 12;
                            var10[var11] = this.field1528 * var16 >> 12;
                        }
                    }
                }
            }
        }
        int var18 = 91 / ((76 - arg1) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 159)
    public class94() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "(I)V", line = 167)
    public static void method731(int arg0) {
        field1526 = null;
        field1521 = null;
        field1527 = null;
        field1523 = null;
        field1535 = null;
        field1530 = null;
        if (arg0 != -16535) {
            method730(124);
        }
        field1534 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILja;Z)V", line = 186)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field1522++;
        if (arg0 == 0) {
            this.field1537 = arg1.method485((byte) -2);
        } else if (arg0 == 1) {
            this.field1528 = arg1.method485((byte) -2);
        } else if (arg0 == 2) {
            this.field1536 = arg1.method485((byte) -2);
        } else if (arg0 == 3) {
            this.field1532 = arg1.method485((byte) -2);
        } else if (arg0 == 4) {
            int var5 = arg1.method489(-115);
            this.field1531[1] = class235.method1710(4080, var5 >> 4);
            this.field1531[2] = class235.method1710(var5 >> 12, 0);
            this.field1531[0] = class235.method1710(16711680, var5) << 4;
        }
        if (!arg2) {
            method731(123);
        }
    }
}
