import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class348 extends class310 {

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "Z")
    public static boolean field5530 = false;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "Z")
    public static boolean field5529 = false;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "Ljl;")
    public static class332 field5536 = new class332(50);

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "F")
    public static float field5538;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "Lth;")
    public static class57 field5533;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lqm;II)V", line = 5)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4940 = arg0.method1720((byte) -119) == 1;
        }
        if (arg1 == -2470) {
            field5535++;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BJ)V", line = 19)
    public static final void method2436(byte arg0, long arg1) {
        field5534++;
        class36.field520.field3760 = 0;
        if (arg0 > -26) {
            return;
        }
        class36.field520.method1712(21, -119);
        class36.field520.method1714(0, arg1);
        class20.field231 = 1;
        class138.field2278 = -3;
        class201.field3207 = 0;
        class247.field4040 = 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lth;Lth;Lth;Lth;Z)V", line = 36)
    public static final void method2437(class57 arg0, class57 arg1, class57 arg2, class57 arg3, boolean arg4) {
        field5531++;
        class258.field4344 = arg0;
        if (arg4) {
            field5530 = false;
        }
        class129.field2175 = arg3;
        class196.field3137 = arg1;
        class277.field4566 = arg2;
        class163.field2587 = new class250[class258.field4344.method489(17752)][];
        class78.field1348 = new boolean[class258.field4344.method489(17752)];
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILhd;IJ)Z", line = 52)
    public static final boolean method2438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class161 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class130.method993(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V", line = 63)
    public static void method2439(int arg0) {
        field5536 = null;
        field5533 = null;
        if (arg0 != 26097) {
            field5533 = (class57) null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)[[I", line = 75)
    public final int[][] method391(int arg0, boolean arg1) {
        field5528++;
        if (!arg1) {
            method2437((class57) null, (class57) null, (class57) null, (class57) null, true);
        }
        int[][] var3 = this.field4942.method10((byte) -115, arg0);
        if (this.field4942.field30) {
            int[][] var4 = this.method2199(21101, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class261.field4405; var11++) {
                var7[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var8[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 129)
    public class348() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V", line = 134)
    public static final void method2440(int arg0) {
        field5527++;
        if (arg0 <= 15) {
            field5536 = (class332) null;
        }
        class336.field5311.method37((byte) -105);
        for (int var1 = 0; var1 < 32; var1++) {
            class194.field3098[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class173.field2764[var2] = 0L;
        }
        class339.field5409 = 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I", line = 164)
    public final int[] method77(int arg0, int arg1) {
        field5537++;
        int[] var3 = this.field4950.method930(arg0, 0);
        if (arg1 != -13093) {
            return (int[]) null;
        }
        if (this.field4950.field2001) {
            int[] var4 = this.method2200(0, arg0, (byte) 74);
            for (int var5 = 0; var5 < class261.field4405; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZC)Z", line = 197)
    public static final boolean method2441(boolean arg0, char arg1) {
        if (arg0) {
            field5536 = (class332) null;
        }
        field5532++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }
}
