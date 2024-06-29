import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class34 extends class304 implements class375 {

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "B")
    public static byte field525;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZII)V")
    public static final void method310(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            ++field526;
            class548 var4 = class696.method3872(arg3, 9, -1633381944);
            var4.method3130(65);
            var4.field7726 = arg0;
            var4.field7725 = arg2;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILtn;I)Ljava/lang/String;")
    public static final String method311(int arg0, class179 arg1, int arg2) {
        ++field528;
        try {
            int var3 = arg1.method1158(-32768);
            if (arg2 != 4) {
                field524 = -61;
            }
            if (~arg0 > ~var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field2354 += class704.field9937.method3458(arg1.field2325, var3, var4, arg1.field2354, 0, false);
            return class324.method1916(var4, 0, (byte) -97, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)Z")
    public static final boolean method312(int arg0, int arg1, int arg2) {
        if (arg2 != 16080) {
            field525 = -31;
        }
        ++field523;
        return ~(arg0 & 2048) != -1 && (arg1 & 55) != 0;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([II[III)V")
    public static final void method313(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 < arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var8;
            int var9 = ~var7 != Integer.MIN_VALUE ? 1 : 0;
            for (int var10 = arg4; ~arg1 < ~var10; ++var10) {
                if (~((var9 & var10) + var7) < ~arg0[var10]) {
                    int var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var8;
            method313(arg0, var6 + -1, arg2, -124, arg4);
            method313(arg0, arg1, arg2, -117, var6 + 1);
        }
        ++field520;
        int var13 = 7 % ((arg3 - -48) / 50);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ltn;B)Lqs;")
    public static final class710 method314(class179 arg0, byte arg1) {
        if (arg1 != 8) {
            method315(26, 0, (byte) -58);
        }
        ++field530;
        return new class710(arg0.method1137((byte) -74), arg0.method1137((byte) -111), arg0.method1137((byte) -121), arg0.method1137((byte) -82), arg0.method1137((byte) -83), arg0.method1137((byte) -87), arg0.method1137((byte) -85), arg0.method1137((byte) -71), arg0.method1114(81), arg0.method1094(255));
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIB)Z")
    public static final boolean method315(int arg0, int arg1, byte arg2) {
        ++field527;
        if (!class523.method3006((byte) 31, arg0, arg1)) {
            return false;
        } else if ((36864 & arg1) != 0 | class24.method263(arg0, -2814, arg1) | class117.method788(arg1, 23807, arg0)) {
            return true;
        } else {
            return arg2 >= -5 ? false : ~(55 & arg0) == -1 & (~(arg1 & 8192) != -1 | class327.method1934(arg1, arg0, -72) | class552.method3142(arg0, arg1, 65536));
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lck;Lem;III[B)V")
    public class34(class221 arg0, class610 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class240.field3093, arg2 * arg3 * arg4, false);
        this.field521 = arg4;
        this.field529 = arg2;
        this.field522 = arg3;
        super.field3921.method3711(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3911, 0, this.method1798(-50), this.field529, this.field522, this.field521, 0, class436.method2578(6145, super.field3923), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lda;)V")
    public static final void method316(class423 arg0) {
        class738.field10331 = arg0;
    }
}
