import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class742 {

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "Lqaa;")
    public static class27 field10405 = new class27(8, 2);

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "Lpu;")
    public static class559 field10407 = new class559(7, 7);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field10401;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field10402;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field10403;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field10404;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field10406;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "Llb;")
    public static class539 field10408;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BII)I")
    public static final int method4127(byte arg0, int arg1, int arg2) {
        int var3 = -119 % ((15 - arg0) / 54);
        field10404++;
        int var4 = arg1 >> 31 & arg2 - 1;
        return (arg1 + (arg1 >>> 31)) % arg2 + var4;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)J")
    public static final synchronized long method4128(int arg0) {
        field10406++;
        long var1 = System.currentTimeMillis();
        if (class458.field6609 > var1) {
            class439.field6124 += class458.field6609 - var1;
        }
        if (arg0 != 1) {
            method4129(37);
        }
        class458.field6609 = var1;
        return class439.field6124 + var1;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)I")
    public static final int method4129(int arg0) {
        if (arg0 != 1) {
            field10408 = null;
        }
        field10403++;
        return class750.field10477.method2267(-1);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method4130(String arg0, String arg1, int arg2) {
        field10402++;
        class683.field9617 = 1;
        class595.field8697 = -1;
        class592.method3398(false, arg0, arg1, (byte) 53);
        if (arg2 <= 58) {
            method4130(null, null, 97);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
    public static void method4131(byte arg0) {
        if (arg0 <= -43) {
            field10408 = null;
            field10405 = null;
            field10407 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII[BII[B)V")
    public static final void method4132(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, byte[] arg8) {
        field10401++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg3 & arg4);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg5[var10001] += arg8[arg6++];
                int var14 = arg0++;
                arg5[var14] += arg8[arg6++];
                int var15 = arg0++;
                arg5[var15] += arg8[arg6++];
                int var16 = arg0++;
                arg5[var16] += arg8[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg5[var10001] += arg8[arg6++];
            }
            arg6 += arg1;
            arg0 += arg2;
        }
    }
}
