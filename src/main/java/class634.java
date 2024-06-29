import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class634 {

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
    public int field8641 = 128;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
    public int field8643 = 128;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    public int field8645;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    public int field8646;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    public int field8648;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
    public int field8636;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public int field8637;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public int field8639;

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
    public int field8640;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public int field8642;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
    public int field8647;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
    public static final void method3457(int arg0) {
        field8638++;
        if (class91.field1112 != null) {
            return;
        }
        class91.field1112 = new int[65536];
        if (arg0 >= -116) {
            return;
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFEE6) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) - (-(var33 << 8) - var34);
            class91.field1112[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)Lrea;")
    public final class634 method3458(int arg0) {
        field8649++;
        return arg0 == 65536 ? new class634(this.field8645, this.field8643, this.field8641, this.field8646, this.field8636, this.field8648) : null;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lfca;B)V")
    public static final void method3459(class188 arg0, byte arg1) {
        int var2 = -125 % ((arg1 - 53) / 55);
        field8650++;
        if (class410.field5758 != arg0.field2412) {
            return;
        }
        if (class596.field8164.field7191 == null) {
            arg0.field2302 = 0;
            arg0.field2317 = 0;
            return;
        }
        arg0.field2408 = 150;
        arg0.field2329 = (int) (Math.sin((double) class430.field5984 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field2301 = 5;
        arg0.field2302 = class224.field2907;
        arg0.field2317 = class304.method1828(-123, class596.field8164.field7191);
        arg0.field2386 = class596.field8164.field454;
        arg0.field2316 = 0;
        arg0.field2343 = class596.field8164.field432;
        arg0.field2368 = class596.field8164.field513;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lrea;I)V")
    public final void method3460(class634 arg0, int arg1) {
        if (arg1 < 34) {
            return;
        }
        this.field8636 = arg0.field8636;
        field8644++;
        this.field8641 = arg0.field8641;
        this.field8648 = arg0.field8648;
        this.field8646 = arg0.field8646;
        this.field8645 = arg0.field8645;
        this.field8643 = arg0.field8643;
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(I)V")
    public class634(int arg0) {
        this.field8645 = arg0;
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(IIIIII)V")
    private class634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8646 = arg3;
        this.field8648 = arg5;
        this.field8636 = arg4;
        this.field8643 = arg1;
        this.field8645 = arg0;
        this.field8641 = arg2;
    }
}
