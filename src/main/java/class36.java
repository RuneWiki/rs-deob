import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class36 {

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field430 = -2;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[I")
    public static int[] field429 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "[B")
    public byte[] field435;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[S")
    public short[] field426;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "[S")
    public short[] field431;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "[S")
    public short[] field437;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method313(int arg0, int arg1) {
        if (arg1 == 11041) {
            field432++;
            return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILac;)Lhfa;", line = 20)
    public static final class282 method314(int arg0, class501 arg1) {
        field434++;
        if (arg0 != -23765) {
            field429 = null;
        }
        int var2 = arg1.method2845(-1);
        class594 var3 = class154.method1103((byte) 125)[arg1.method2874((byte) -75)];
        class12 var4 = class568.method3248(-1)[arg1.method2874((byte) -75)];
        int var5 = arg1.method2875(false);
        int var6 = arg1.method2875(false);
        return new class282(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIIIII)V", line = 41)
    public static final void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 >= -125) {
            method313(-125, 121);
        }
        if (arg0 == arg6 && arg2 == arg9 && arg3 == arg5 && arg4 == arg7) {
            class25.method247(arg7, arg6, arg9, arg8, arg3, 91);
        } else {
            int var10 = arg6;
            int var11 = arg9;
            int var12 = arg6 * 3;
            int var13 = arg9 * 3;
            int var14 = arg0 * 3;
            int var15 = arg2 * 3;
            int var16 = arg5 * 3;
            int var17 = arg4 * 3;
            int var18 = var14 + arg3 - arg6 - var16;
            int var19 = arg7 + var15 - (arg9 + var17);
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg6 + (var27 + var29 + var31 >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg9;
                class25.method247(var34, var10, var11, arg8, var33, 81);
                var10 = var33;
                var11 = var34;
            }
        }
        field427++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 125)
    public static void method316(int arg0) {
        if (arg0 == 2) {
            field429 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V", line = 141)
    public static final void method317(int arg0, int arg1, int arg2) {
        field433++;
        class51 var3 = class703.method3938(-1989279584, arg0, arg2);
        var3.method402((byte) 100);
        var3.field603 = arg1;
    }
}
