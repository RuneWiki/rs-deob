import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 extends class170 {

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "Z")
    private boolean field88 = true;

    @OriginalMember(owner = "client!wj", name = "db", descriptor = "I")
    private int field94 = 4096;

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!wj", name = "bb", descriptor = "[I")
    public static int[] field92 = new int[] { 0, 0, -2, 0, 0, 0, 0, 12, 0, 0, 0, -2, -1, 0, 2, 0, 8, 0, 1, 0, 0, 0, 8, 0, 9, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 8, 0, 2, 0, 10, 0, 0, 0, 0, 3, 0, 0, 14, 0, 15, -1, 0, 0, 0, 0, 5, 0, 2, 0, 0, 0, -2, 0, 0, 6, -2, 7, 12, 0, 2, 0, 1, 0, 0, 4, 0, 0, 0, -1, 6, 0, -1, 20, 0, 0, 0, 0, 0, 8, 0, 0, 8, 0, 7, 0, 0, 3, 0, 0, 0, 0, 0, 0, 1, 0, 0, 14, 5, 0, 0, 8, 0, -2, 0, 0, 10, -1, 0, 0, 0, 10, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 2, -1, 10, 0, -2, 3, -1, 7, 0, 4, 0, 0, 0, -1, -1, 0, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 5, 2, 0, 3, 0, 4, 24, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 5, 5, 6, 5, 6, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 3, 4, 0, -2, -2, 0, -1, 6, 0, 8, 0, 0, 0, 1, -2, -1, 0, 12, -2, 8, 0, 2, 0, 7, 0, 0, 0, 0, 6, 0, 0, 0, -1, 0, 0, 0, 0, -1, -2, 0, -2, 0, 6, 0, 0, 3, 0, 0 };

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "I")
    public static int field89 = 0;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!wj", name = "ab", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!wj", name = "cb", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!wj", name = "eb", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!wj", name = "fb", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class6() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        ++field87;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field88 = ~arg0.method1045((byte) 75) == -2;
            }
        } else {
            this.field94 = arg0.method1050(1272006568);
        }
        if (arg1 != 5877) {
            this.method32(-126, false);
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
    public static void method37(byte arg0) {
        int var1 = -59 / ((arg0 - 32) / 59);
        field92 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILqk;I)V")
    public static final void method38(int arg0, class207 arg1, int arg2) {
        ++class219.field3872;
        ++field95;
        class261.field4645.method767(218, (byte) 111);
        class261.field4645.method1086((byte) 43, arg1.method1428(0));
        if (arg2 != 10233) {
            method39((byte) 105);
        }
        class261.field4645.method1077(164652616, arg0);
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)Z")
    public static final boolean method39(byte arg0) {
        int var1 = 119 % ((arg0 - 6) / 55);
        ++field96;
        if (class24.field460) {
            try {
                class132.field2282.method1465(63, class20.field326.field4207);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field91;
            int[][] var3 = super.field3002.method427(arg0, 239);
            if (super.field3002.field1077) {
                int[] var4 = this.method1226(0, class233.field4294 & arg0 - 1, 117);
                int[] var5 = this.method1226(0, arg0, -127);
                int[] var6 = this.method1226(0, class233.field4294 & arg0 + 1, -120);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; class88.field1595 > var10; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field94;
                    int var12 = (var5[class94.field1684 & var10 + 1] + -var5[var10 + -1 & class94.field1684]) * this.field94;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var15 - -4096 + var16) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (~var17 != -1) {
                        var18 = var12 / var17;
                        var19 = var11 / var17;
                        var20 = 16777216 / var17;
                    } else {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    }
                    if (this.field88) {
                        var20 = (var20 >> 1) + 2048;
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
    }
}
