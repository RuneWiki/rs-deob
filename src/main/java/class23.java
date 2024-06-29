import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 extends class8 {

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "Z")
    private boolean field391 = true;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    private int field389 = 4096;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public static int field390 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field387 = 0;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field391 = arg1.method1517((byte) -96) == 1;
            }
        } else {
            this.field389 = arg1.method1521((byte) 113);
        }
        if (arg0 <= 62) {
            this.field391 = false;
        }
        ++field393;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)Lcb;")
    public static final class243 method218(byte arg0) {
        ++field392;
        class243 var1 = new class243(class27.field432, class155.field2513, class152.field2464[0], class74.field1202[0], class148.field2385[0], class236.field3847[0], class145.field2332[0], class194.field3113);
        class287.method1923(0);
        if (arg0 != 10) {
            field386 = -115;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        ++field388;
        int[][] var3 = super.field93.method248(arg0, 17416);
        int var4 = 123 / ((arg1 - -48) / 46);
        if (super.field93.field470) {
            int[] var5 = this.method61(class92.field1523 & arg0 + -1, -4, 0);
            int[] var6 = this.method61(arg0, -112, 0);
            int[] var7 = this.method61(class92.field1523 & arg0 + 1, -65, 0);
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; class231.field3798 > var11; ++var11) {
                int var12 = (var6[var11 + 1 & class287.field4537] - var6[class287.field4537 & var11 + -1]) * this.field389;
                int var13 = (var7[var11] - var5[var11]) * this.field389;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = var14 * var14 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var16 - -var17 + 4096) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (~var18 != -1) {
                    var19 = 16777216 / var18;
                    var20 = var12 / var18;
                    var21 = var13 / var18;
                } else {
                    var21 = 0;
                    var19 = 0;
                    var20 = 0;
                }
                if (this.field391) {
                    var21 = (var21 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                }
                var10[var11] = var20;
                var9[var11] = var21;
                var8[var11] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class23() {
        super(1, false);
    }
}
