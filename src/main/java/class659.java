import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class659 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lvi;")
    private class560 field9284 = new class560(256);

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Le;")
    private class479 field9293;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Lpea;")
    private class641 field9285;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field9288 = 1403;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "[S")
    public static short[] field9294 = new short[] { 18, 11, 9, 25, 15, 21, 10, 30 };

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lcb;")
    public static class318 field9287 = new class318(110, -1);

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "[S")
    public static short[] field9296 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field9283;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field9289;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Lpq;")
    public static class159 field9290;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "[[I")
    public static int[][] field9291;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 5)
    public static void method3646(int arg0) {
        field9291 = null;
        if (arg0 >= 124) {
            field9296 = null;
            field9287 = null;
            field9294 = null;
            field9290 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 19)
    public final void method3647(byte arg0) {
        if (arg0 == 102) {
            this.field9284.method3142(false);
            field9286++;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Lqw;", line = 30)
    public final class379 method3648(int arg0, int arg1) {
        field9289++;
        Object var3 = this.field9284.method3134((long) arg0, -67);
        if (var3 != null) {
            return (class379) var3;
        } else if (this.field9293.method1732(arg0, 82)) {
            if (arg1 != 6602) {
                this.method3650(-39);
            }
            class568 var4 = this.field9293.method1728(-127, arg0);
            int var5 = var4.field7853 ? 64 : this.field9285.field8934;
            class379 var7;
            if (var4.field7851 && this.field9285.method811()) {
                float[] var6 = this.field9293.method1736(arg0, 8171, var5, var5, false, 0.7F);
                var7 = new class379(this.field9285, 3553, 34842, var5, var5, var4.field7852 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field7868) {
                    var8 = this.field9293.method1734(true, var5, 0.7F, var5, arg0, false);
                } else {
                    var8 = this.field9293.method1731(true, 0.7F, arg1 ^ 0x7EE3, var5, var5, arg0);
                }
                var7 = new class379(this.field9285, 3553, 6408, var5, var5, var4.field7852 != 0, var8, false);
            }
            var7.method2299(arg1 - 6691, var4.field7861, var4.field7854);
            this.field9284.method3130((long) arg0, true, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[B[BIIIII)V", line = 90)
    public static final void method3649(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field9292++;
        int var9 = -(arg1 >> 2);
        if (arg0 != 18) {
            method3646(18);
        }
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg3[var10001] = (byte) (arg3[var10001] - arg2[arg7++]);
                int var14 = arg8++;
                arg3[var14] = (byte) (arg3[var14] - arg2[arg7++]);
                int var15 = arg8++;
                arg3[var15] = (byte) (arg3[var15] - arg2[arg7++]);
                int var16 = arg8++;
                arg3[var16] = (byte) (arg3[var16] - arg2[arg7++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg3[var10001] = (byte) (arg3[var10001] - arg2[arg7++]);
            }
            arg7 += arg6;
            arg8 += arg5;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 134)
    public final void method3650(int arg0) {
        field9283++;
        this.field9284.method3129(5, 14583);
        if (arg0 < 115) {
            field9291 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lpea;Le;)V", line = 152)
    public class659(class641 arg0, class479 arg1) {
        this.field9293 = arg1;
        this.field9285 = arg0;
    }
}
