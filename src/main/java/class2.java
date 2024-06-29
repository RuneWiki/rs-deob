import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "Lni;")
    public static class367 field11 = new class367(50, 18);

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "[I")
    public static int[] field16 = new int[14];

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Lni;")
    public static class367 field17 = new class367(81, -1);

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "[I")
    public static int[] field18 = new int[14];

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIZIIII)V")
    public static final void method4(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5) {
            method9((byte) 82);
        }
        field12++;
        if (arg3 == arg6 && arg4 == arg8 && arg0 == arg2 && arg1 == arg9) {
            class121.method738((byte) 56, arg7, arg4, arg0, arg6, arg1);
            return;
        }
        int var10 = arg6;
        int var11 = arg4;
        int var12 = arg6 * 3;
        int var13 = arg4 * 3;
        int var14 = arg3 * 3;
        int var15 = arg8 * 3;
        int var16 = arg2 * 3;
        int var17 = arg9 * 3;
        int var18 = arg0 + var14 - var16 - arg6;
        int var19 = arg1 + (var15 - arg4) - var17;
        int var20 = var16 + var12 - var14 - var14;
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
            int var33 = (var27 + var29 + var31 >> 12) + arg6;
            int var34 = (var28 + var32 + var30 >> 12) + arg4;
            class121.method738((byte) 67, arg7, var11, var33, var10, var34);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IC)Z")
    public static final boolean method5(int arg0, char arg1) {
        field14++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class447.method2719((byte) -11, arg1)) {
            return true;
        } else {
            char[] var2 = class309.field4504;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            if (arg0 > -18) {
                field17 = null;
            }
            char[] var4 = class426.field6482;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIILjw;)V")
    public static final void method6(int arg0, int arg1, int arg2, class394 arg3) {
        class452 var4 = method8(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field6801 = arg3;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static void method7(int arg0) {
        field16 = null;
        field11 = null;
        if (arg0 != -1) {
            field18 = null;
        }
        field17 = null;
        field18 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)Lsn;")
    public static final class452 method8(int arg0, int arg1, int arg2) {
        if (class443.field6672[arg0][arg1][arg2] == null) {
            boolean var3 = class443.field6672[0][arg1][arg2] != null && class443.field6672[0][arg1][arg2].field6795 != null;
            if (var3 && arg0 >= class141.field1892 - 1) {
                return null;
            }
            class106.method678(arg0, arg1, arg2);
        }
        return class443.field6672[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)[Lfg;")
    public static final class84[] method9(byte arg0) {
        field15++;
        int var1 = -42 / ((arg0 + 19) / 44);
        return new class84[] { class175.field2347, class303.field4428, class282.field4115, class49.field698, class455.field6842, class173.field2328, class511.field7513, class81.field1179, class423.field6452, class254.field3526, class490.field7242, class126.field1717, class484.field7127, class107.field1519 };
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)Z")
    public static final boolean method10(int arg0, byte arg1) {
        if (arg1 == -71) {
            field13++;
            return arg0 == 0 || arg0 == 1;
        } else {
            return false;
        }
    }
}
