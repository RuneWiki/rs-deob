import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class705 extends class234 {

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
    public int field9925;

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "I")
    public int field9926;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
    public static int field9922 = 0;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "Lsh;")
    public static class62 field9924 = new class62();

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "[I")
    public static int[] field9927 = new int[1000];

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "Lsk;")
    public static class578 field9921;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZ)V")
    public static final void method3936(int arg0, boolean arg1) {
        field9918++;
        if (arg1) {
            return;
        }
        if (class37.field1050 == 1) {
            class637.field9183 = arg0;
        } else if (class37.field1050 == 2 || class37.field1050 == 3) {
            class642.field9234 = arg0;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)Lph;")
    public final class598 method474(int arg0) {
        field9923++;
        return arg0 == 6686 ? class654.field9411 : null;
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V")
    public static void method3937(int arg0) {
        field9921 = null;
        field9924 = null;
        field9927 = null;
        if (arg0 >= -47) {
            field9924 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lsc;Lia;IIIIIIIII)V")
    public class705(class320 arg0, class547 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field9925 = arg10;
        this.field9926 = arg9;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIII[I)V")
    public static final void method3938(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        arg3--;
        if (arg2 != 30336) {
            method3936(-76, true);
        }
        field9920++;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (arg3 < var5) {
            int var7 = arg3 + 1;
            arg4[var7] = arg1;
            int var8 = var7 + 1;
            arg4[var8] = arg1;
            int var9 = var8 + 1;
            arg4[var9] = arg1;
            int var10 = var9 + 1;
            arg4[var10] = arg1;
            int var11 = var10 + 1;
            arg4[var11] = arg1;
            int var12 = var11 + 1;
            arg4[var12] = arg1;
            int var13 = var12 + 1;
            arg4[var13] = arg1;
            arg3 = var13 + 1;
            arg4[arg3] = arg1;
        }
        while (var6 > arg3) {
            arg3++;
            arg4[arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B[SI)[S")
    public static final short[] method3939(byte arg0, short[] arg1, int arg2) {
        field9919++;
        short[] var3 = new short[arg2];
        class692.method3876(arg1, 0, var3, 0, arg2);
        int var4 = -89 / ((-arg0 - 19) / 39);
        return var3;
    }
}
