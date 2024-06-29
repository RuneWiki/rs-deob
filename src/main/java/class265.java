import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class265 extends class196 {

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    private int field4634 = 4096;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    private int field4641 = 4096;

    @OriginalMember(owner = "client!li", name = "eb", descriptor = "I")
    private int field4645 = 4096;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    private int field4640 = 409;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "[I")
    private int[] field4638 = new int[3];

    @OriginalMember(owner = "client!li", name = "S", descriptor = "[I")
    public static int[] field4633 = new int[256];

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "Ldf;")
    public static class51 field4643 = class46.method233(" (X", 100);

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
    public static int field4642 = 0;

    @OriginalMember(owner = "client!li", name = "fb", descriptor = "Ldf;")
    public static class51 field4646 = class46.method233(" )2> ", 100);

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "Lqa;")
    public static class142 field4631 = new class142();

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!li", name = "db", descriptor = "Lvc;")
    public static class180 field4644;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method1797(boolean arg0) {
        field4644 = null;
        if (arg0) {
            method1797(true);
        }
        field4643 = null;
        field4633 = null;
        field4646 = null;
        field4631 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[BB)I")
    public static final int method1798(int arg0, byte[] arg1, byte arg2) {
        if (arg2 <= 87) {
            field4631 = null;
        }
        ++field4635;
        return class170.method1195(arg1, 0, arg0, 6915);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZB)V")
    public static final void method1799(boolean arg0, byte arg1) {
        byte[][] var2 = class257.field4498;
        if (arg1 == -90) {
            int var3 = class105.field1732.length;
            ++field4632;
            for (int var4 = 0; ~var4 > ~var3; ++var4) {
                byte[] var5 = var2[var4];
                if (var5 != null) {
                    int var6 = (class101.field1681[var4] >> 8) * 64 - class11.field160;
                    int var7 = (255 & class101.field1681[var4]) * 64 + -class241.field4179;
                    class190.method1361(205);
                    class34.method167(var5, var7, class159.field2605, var6, (byte) 95, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class265() {
        super(1, false);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        if (arg0 != 11) {
            field4643 = null;
        }
        ++field4636;
        int[][] var3 = super.field3285.method1548(arg1, (byte) -36);
        if (super.field3285.field3963) {
            int[][] var4 = this.method1387(arg0 + 112, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class49.field767; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field4638[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (var13 > this.field4640) {
                    var8[var11] = var12;
                    var10[var11] = var6[var11];
                    var9[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field4638[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field4640 < var15) {
                        var8[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4638[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field4640 < var17) {
                            var8[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var8[var11] = this.field4634 * var12 >> 12;
                            var10[var11] = this.field4645 * var14 >> 12;
                            var9[var11] = this.field4641 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            int var5 = arg1.method891((byte) -126);
                            this.field4638[1] = class191.method1366(65280, var5) >> 4;
                            this.field4638[2] = class191.method1366(var5, 255) >> 12;
                            this.field4638[0] = class191.method1366(var5, 16711680) << 4;
                        }
                    } else {
                        this.field4634 = arg1.method876(false);
                    }
                } else {
                    this.field4645 = arg1.method876(false);
                }
            } else {
                this.field4641 = arg1.method876(false);
            }
        } else {
            this.field4640 = arg1.method876(false);
        }
        if (arg2 != 82) {
            method1797(true);
        }
        ++field4637;
    }
}
