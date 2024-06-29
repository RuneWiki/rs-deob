import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class353 implements class450 {

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lvd;")
    private class39 field5136;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lvd;")
    private class39 field5138;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Llca;")
    private class647 field5131;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lmia;")
    public static class63 field5135 = new class63(71, 8);

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "[I")
    public static int[] field5141 = new int[8];

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lqe;")
    public static class469 field5139 = new class469(23, 28);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lda;")
    private class61 field5132;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)I")
    public static final int method2215(boolean arg0, int arg1) {
        field5133++;
        double var2 = (double) ((arg1 & 0xFFDEEF) >> 16) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        if (!arg0) {
            field5141 = null;
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + (((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7));
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Z")
    public final boolean method1251(int arg0) {
        field5137++;
        boolean var2 = true;
        if (!this.field5136.method208(this.field5131.field9118, (byte) 70)) {
            var2 = false;
        }
        if (arg0 != -24346) {
            method2215(true, -88);
        }
        if (!this.field5138.method208(this.field5131.field9118, (byte) 70)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static void method2216(byte arg0) {
        field5139 = null;
        field5141 = null;
        if (arg0 >= 21) {
            field5135 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)V")
    public final void method1249(int arg0, boolean arg1) {
        if (arg0 != 7620) {
            method2215(true, 99);
        }
        if (arg1) {
            int var3 = this.field5131.field9132.method3778(class291.field4165, this.field5131.field9120, false) + this.field5131.field9131;
            int var4 = this.field5131.field9128.method4065((byte) -128, this.field5131.field9126, class344.field4988) + this.field5131.field9129;
            this.field5132.method551(0, null, -1, var4, this.field5131.field9119, this.field5131.field9135, null, this.field5131.field9115, this.field5131.field9121, 0, this.field5131.field9123, this.field5131.field9126, this.field5131.field9120, var3, this.field5131.field9117, null);
        }
        field5140++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public final void method1253(int arg0) {
        field5134++;
        class66 var2 = class647.method3764(this.field5131.field9118, this.field5138, 0);
        if (arg0 != 27444) {
            this.method1251(-121);
        }
        this.field5132 = class736.field10316.method474(var2, class129.method918(this.field5136, this.field5131.field9118), true);
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lvd;Lvd;Llca;)V")
    public class353(class39 arg0, class39 arg1, class647 arg2) {
        this.field5136 = arg0;
        this.field5138 = arg1;
        this.field5131 = arg2;
    }
}
