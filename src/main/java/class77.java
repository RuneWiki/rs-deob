import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class77 extends class8 {

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    private int field1239 = 4;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    private int field1240 = 4;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field1236 = 0;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "Ld;")
    public static class238 field1242;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Ljava/awt/Frame;")
    public static Frame field1234;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "[I")
    public static int[] field1235;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
    public static final void method541(byte arg0) {
        ++field1243;
        class285 var1 = (class285) class206.field3310.method843(126);
        if (arg0 != 53) {
            field1234 = null;
        }
        while (var1 != null) {
            if (var1.field4498 > 0) {
                --var1.field4498;
            }
            if (var1.field4498 != 0) {
                if (var1.field4493 > 0) {
                    --var1.field4493;
                }
                if (var1.field4493 == 0 && ~var1.field4501 <= -2 && ~var1.field4509 <= -2 && ~var1.field4501 >= -103 && var1.field4509 <= 102 && (~var1.field4494 > -1 || class231.method1621(var1.field4511, -120, var1.field4494))) {
                    class20.method194(var1.field4509, var1.field4494, var1.field4502, var1.field4497, var1.field4511, var1.field4505, var1.field4501, (byte) 42);
                    var1.field4493 = -1;
                    if (var1.field4499 == var1.field4494 && var1.field4499 == -1) {
                        var1.method1388(-99);
                    } else if (~var1.field4499 == ~var1.field4494 && var1.field4502 == var1.field4496 && ~var1.field4511 == ~var1.field4510) {
                        var1.method1388(-106);
                    }
                }
            } else if (var1.field4499 < 0 || class231.method1621(var1.field4510, -126, var1.field4499)) {
                class20.method194(var1.field4509, var1.field4499, var1.field4496, var1.field4497, var1.field4510, var1.field4505, var1.field4501, (byte) 42);
                var1.method1388(arg0 ^ -107);
            }
            var1 = (class285) class206.field3310.method852((byte) 123);
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(Z)V")
    public static final void method542(boolean arg0) {
        ++field1244;
        if (!class60.field993 && class205.field3287 != 2) {
            try {
                if (arg0) {
                    class160.method1116("tbrefresh", class105.field1689, (byte) 73);
                }
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class77() {
        super(1, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        int var3 = 37 % ((-48 - arg1) / 46);
        ++field1241;
        int[][] var4 = super.field93.method248(arg0, 17416);
        if (super.field93.field470) {
            int var5 = class231.field3798 / this.field1240;
            int var6 = class259.field4118 / this.field1239;
            int[][] var7;
            if (~var6 >= -1) {
                var7 = this.method60(0, 0, 98);
            } else {
                int var8 = arg0 % var6;
                var7 = this.method60(class259.field4118 * var8 / var6, 0, 104);
            }
            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var4[0];
            int[] var12 = var7[2];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; class231.field3798 > var15; ++var15) {
                int var17;
                if (~var5 < -1) {
                    int var16 = var15 % var5;
                    var17 = class231.field3798 * var16 / var5;
                } else {
                    var17 = 0;
                }
                var11[var15] = var9[var17];
                var13[var15] = var10[var17];
                var14[var15] = var12[var17];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field1237;
        if (arg0 != 3) {
            field1236 = -49;
        }
        int[] var3 = super.field110.method1585(0, arg1);
        if (super.field110.field3734) {
            int var4 = class259.field4118 / this.field1239;
            int var5 = class231.field3798 / this.field1240;
            int[] var7;
            if (~var4 < -1) {
                int var6 = arg1 % var4;
                var7 = this.method61(class259.field4118 * var6 / var4, 127, 0);
            } else {
                var7 = this.method61(0, 3, 0);
            }
            for (int var8 = 0; ~class231.field3798 < ~var8; ++var8) {
                if (~var5 < -1) {
                    int var9 = var8 % var5;
                    var3[var8] = var7[class231.field3798 * var9 / var5];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        ++field1238;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field1239 = arg1.method1517((byte) -96);
            }
        } else {
            this.field1240 = arg1.method1517((byte) -96);
        }
        if (arg0 <= 62) {
            this.field1239 = -37;
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V")
    public static void method543(byte arg0) {
        field1234 = null;
        field1242 = null;
        if (arg0 != -101) {
            method543((byte) -8);
        }
        field1235 = null;
    }
}
