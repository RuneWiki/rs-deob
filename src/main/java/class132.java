import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class132 extends class64 {

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    private int field2723 = 4096;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "Z")
    private boolean field2735 = true;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "[I")
    public static int[] field2724 = new int[5];

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field2726 = -1;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "Lcd;")
    public static class23 field2731 = class54.method414("blinken1:", -1);

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "Z")
    public static volatile boolean field2734 = false;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "Lgd;")
    public static class58 field2733;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class132() {
        super(1, false);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        if (!arg1) {
            field2734 = false;
        }
        ++field2736;
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (super.field1508.field2757) {
            int[] var4 = this.method479(-1, class81.field1760 & arg0 + -1, 0);
            int[] var5 = this.method479(-1, arg0, 0);
            int[] var6 = this.method479(-1, class81.field1760 & arg0 + 1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class168.field3367; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2723;
                int var12 = var11 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (var5[var10 + 1 & class163.field3266] - var5[class163.field3266 & var10 + -1]) * this.field2723;
                int var15 = var14 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((var13 + var16 - -4096) / 4096)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                    var18 = var14 / var17;
                }
                if (this.field2735) {
                    var20 = 2048 - -(var20 >> 1);
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field2735 = ~arg2.method1202(-63) == -2;
            }
        } else {
            this.field2723 = arg2.method1197(-1);
        }
        ++field2729;
        int var5 = -29 % ((arg0 - 7) / 43);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lkh;I)V")
    public static final void method843(class97 arg0, int arg1) {
        class95.field2000 = arg0;
        if (arg1 == 0) {
            ++field2728;
        }
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
    public static void method844(int arg0) {
        field2733 = null;
        if (arg0 > 93) {
            field2724 = null;
            field2731 = null;
        }
    }
}
