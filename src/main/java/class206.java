import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class206 extends class335 {

    @OriginalMember(owner = "client!pw", name = "D", descriptor = "I")
    private int field2755 = 585;

    @OriginalMember(owner = "client!pw", name = "F", descriptor = "Luf;")
    public static class380 field2757 = new class380(3000000, 200);

    @OriginalMember(owner = "client!pw", name = "B", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!pw", name = "C", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!pw", name = "E", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!pw", name = "G", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!pw", name = "H", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(BLjava/lang/String;)I", line = 3)
    public static final int method1313(byte arg0, String arg1) {
        ++field2756;
        int var2 = 58 % ((21 - arg0) / 59);
        return arg1.length() - -1;
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V", line = 24)
    public class206() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILio;I)V", line = 27)
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field2753;
        if (arg2 != -66) {
            method1314((byte) 18);
        }
        if (~arg0 == -1) {
            this.field2755 = arg1.method963(-124);
        }
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(B)V", line = 58)
    public static void method1314(byte arg0) {
        field2757 = null;
        if (arg0 <= 42) {
            method1314((byte) 74);
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZI)[I", line = 68)
    public final int[] method3(boolean arg0, int arg1) {
        ++field2758;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int var4 = class686.field9697[arg1];
            for (int var5 = 0; var5 < class649.field8968; ++var5) {
                int var6 = class376.field4981[var5];
                if (this.field2755 < var6 && -this.field2755 + 4096 > var6 && -this.field2755 + 2048 < var4 && ~(this.field2755 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2755 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(-this.field2755 + 2048) && var6 < this.field2755 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2755;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2755 + 2048);
                } else if (~var4 <= ~this.field2755 && var4 <= -this.field2755 + 4096) {
                    if (var6 >= this.field2755 && ~(-this.field2755 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2755 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field2755;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2755 + 2048);
                }
            }
        }
        if (!arg0) {
            field2757 = null;
        }
        return var3;
    }
}
