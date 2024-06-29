import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class314 extends class297 {

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
    private int field4347 = 4;

    @OriginalMember(owner = "client!vn", name = "O", descriptor = "I")
    private int field4352 = 4;

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "I")
    public static int field4350 = 0;

    @OriginalMember(owner = "client!vn", name = "Q", descriptor = "I")
    public static int field4354 = 0;

    @OriginalMember(owner = "client!vn", name = "P", descriptor = "I")
    public static int field4353 = 0;

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!vn", name = "N", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!vn", name = "R", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V", line = 4)
    public class314() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(II)[[I", line = 21)
    public final int[][] method18(int arg0, int arg1) {
        ++field4349;
        if (arg1 != -1564599039) {
            return null;
        } else {
            int[][] var3 = super.field4166.method2180(-111, arg0);
            if (super.field4166.field4849) {
                int var4 = class525.field7275 / this.field4347;
                int var5 = class128.field2169 / this.field4352;
                int[][] var7;
                if (var5 > 0) {
                    int var6 = arg0 % var5;
                    var7 = this.method1948((byte) -86, class128.field2169 * var6 / var5, 0);
                } else {
                    var7 = this.method1948((byte) 105, 0, 0);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; ~class525.field7275 < ~var14; ++var14) {
                    int var15;
                    if (~var4 >= -1) {
                        var15 = 0;
                    } else {
                        int var16 = var14 % var4;
                        var15 = class525.field7275 * var16 / var4;
                    }
                    var11[var14] = var8[var15];
                    var12[var14] = var9[var15];
                    var13[var14] = var10[var15];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lcea;II)V", line = 96)
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg2 == 31015) {
            if (arg1 != 0) {
                if (arg1 == 1) {
                    this.field4352 = arg0.method1535(255);
                }
            } else {
                this.field4347 = arg0.method1535(255);
            }
            ++field4355;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 131)
    public static final boolean method2038(byte arg0, String arg1) {
        if (arg0 != 50) {
            method2038((byte) -33, (String) null);
        }
        ++field4346;
        return class598.field8210.containsKey(arg1);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(II)[I", line = 142)
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            ++field4351;
            int[] var3 = super.field4165.method127(0, arg0);
            if (super.field4165.field266) {
                int var4 = class525.field7275 / this.field4347;
                int var5 = class128.field2169 / this.field4352;
                int[] var7;
                if (~var5 < -1) {
                    int var6 = arg0 % var5;
                    var7 = this.method1951(class128.field2169 * var6 / var5, 633706337, 0);
                } else {
                    var7 = this.method1951(0, 633706337, 0);
                }
                for (int var8 = 0; class525.field7275 > var8; ++var8) {
                    if (var4 <= 0) {
                        var3[var8] = var7[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class525.field7275 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }
}
