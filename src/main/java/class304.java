import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class304 extends class27 {

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "Z")
    private boolean field4563 = true;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "Z")
    private boolean field4562 = true;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field4559 = 0;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field4560 = 0;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "Z")
    public static boolean field4564 = false;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!cm", name = "U", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 3)
    public class304() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)[I", line = 11)
    public final int[] method18(int arg0, byte arg1) {
        if (arg1 != -62) {
            this.field4562 = false;
        }
        int[] var3 = this.field375.method2087(-115, arg0);
        field4566++;
        if (this.field375.field4382) {
            int[] var4 = this.method164(this.field4563 ? class214.field3080 - arg0 : arg0, 68, 0);
            if (this.field4562) {
                for (int var5 = 0; var5 < class209.field3053; var5++) {
                    var3[var5] = var4[class150.field2180 - var5];
                }
            } else {
                class84.method689(var4, 0, var3, 0, class209.field3053);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;", line = 48)
    public static final String[] method2141(String arg0, char arg1, int arg2) {
        field4558++;
        int var3 = class281.method2049(500, arg0, arg1);
        int var4 = 0;
        String[] var5 = new String[var3 + 1];
        int var6 = 0;
        int var7 = 0;
        if (arg2 >= -37) {
            field4560 = -75;
        }
        while (var7 < var3) {
            int var8;
            for (var8 = var6; arg1 != arg0.charAt(var8); var8++) {
            }
            var5[var4++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
            var7++;
        }
        var5[var3] = arg0.substring(var6);
        return var5;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)I", line = 94)
    public static final int method2142(int arg0, int arg1) {
        field4565++;
        if (arg0 != -1) {
            method2142(105, 124);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILsb;I)V", line = 106)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg0 != -5836) {
            return;
        }
        if (arg2 == 0) {
            this.field4562 = arg1.method1319(255) == 1;
        } else if (arg2 == 1) {
            this.field4563 = arg1.method1319(255) == 1;
        } else if (arg2 == 2) {
            this.field376 = arg1.method1319(255) == 1;
        }
        field4567++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)[[I", line = 160)
    public final int[][] method19(int arg0, int arg1) {
        field4557++;
        if (arg0 != -28941) {
            method2142(-12, 12);
        }
        int[][] var3 = this.field379.method668(arg1, 0);
        if (this.field379.field1171) {
            int[][] var4 = this.method168(0, -116, this.field4563 ? class214.field3080 - arg1 : arg1);
            int[] var5 = var3[0];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field4562) {
                for (int var11 = 0; var11 < class209.field3053; var11++) {
                    var5[var11] = var7[class150.field2180 - var11];
                    var9[var11] = var6[class150.field2180 - var11];
                    var10[var11] = var8[class150.field2180 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class209.field3053; var12++) {
                    var5[var12] = var7[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var8[var12];
                }
            }
        }
        return var3;
    }
}
