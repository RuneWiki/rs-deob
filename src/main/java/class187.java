import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class187 extends class123 {

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "Z")
    private boolean field3275 = true;

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "I")
    private int field3279 = 4096;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "S")
    public static short field3276 = 256;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "Leb;")
    public static class230 field3274 = class68.method589(0, "Benutzen");

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
    public static int field3277 = 0;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)V")
    public static void method1335(int arg0) {
        if (arg0 != 0) {
            method1336((byte) 104, 79);
        }
        field3274 = null;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field3272;
        int[][] var3 = super.field2152.method1106(arg0, -7034);
        if (arg1 != 26080) {
            return null;
        } else {
            if (super.field2152.field2616) {
                int[] var4 = this.method965(0, arg0 + -1 & class79.field1431, (byte) 49);
                int[] var5 = this.method965(0, arg0, (byte) 108);
                int[] var6 = this.method965(0, class79.field1431 & arg0 + 1, (byte) 73);
                int[] var7 = var3[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                for (int var10 = 0; ~class140.field2505 < ~var10; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field3279;
                    int var12 = (var5[var10 + 1 & class217.field3743] + -var5[var10 + -1 & class217.field3743]) * this.field3279;
                    int var13 = var12 >> 12;
                    int var14 = var13 * var13 >> 12;
                    int var15 = var11 >> 12;
                    int var16 = var15 * var15 >> 12;
                    int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var14) / 4096.0F)));
                    int var18;
                    int var19;
                    int var20;
                    if (var17 == 0) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    } else {
                        var19 = 16777216 / var17;
                        var20 = var11 / var17;
                        var18 = var12 / var17;
                    }
                    if (this.field3275) {
                        var19 = (var19 >> 1) + 2048;
                        var18 = (var18 >> 1) + 2048;
                        var20 = (var20 >> 1) + 2048;
                    }
                    var8[var10] = var18;
                    var9[var10] = var20;
                    var7[var10] = var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)Z")
    public static final boolean method1336(byte arg0, int arg1) {
        if (arg0 != 29) {
            field3274 = null;
        }
        ++field3273;
        return ~(arg1 >> 21 & 1) != -1;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class187() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field3275 = ~arg1.method200(255) == -2;
            }
        } else {
            this.field3279 = arg1.method161(4);
        }
        ++field3278;
        if (arg2 != 1876195788) {
            this.method2(50, -46);
        }
    }
}
