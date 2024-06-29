import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class39 implements class5 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lnk;")
    public static class2 field568 = new class2();

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([IJII)Ljava/lang/String;", line = 5)
    public final String method32(int[] arg0, long arg1, int arg2, int arg3) {
        field569++;
        if (arg2 == 0) {
            class225 var6 = class303.method2029(arg0[0], arg3 ^ 0x7D);
            return var6.method1536((byte) -110, (int) arg1);
        } else if (arg2 == 1 || arg2 == 10) {
            class291 var7 = class160.method1106((int) arg1, arg3 ^ 0xFFFFFFB4);
            return var7.field4468;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class303.method2029(arg0[0], arg3 - 116).method1536((byte) -110, (int) arg1);
        } else if (arg3 == -11) {
            return null;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBII)I", line = 43)
    public static final int method286(int arg0, byte arg1, int arg2, int arg3) {
        field570++;
        if (client.field2034 == null) {
            return 0;
        }
        if (arg1 != 82) {
            field571 = -26;
        }
        int var4 = arg2 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0;
        int var7 = arg2 & 0x7F;
        if (arg0 < 3 && (class305.field4784[1][var4][var5] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var8 = arg3 & 0x7F;
        int var9 = (128 - var7) * client.field2034[var6][var4][var5 + 1] + client.field2034[var6][var4 + 1][var5 + 1] * var7 >> 7;
        int var10 = (128 - var7) * client.field2034[var6][var4][var5] + (client.field2034[var6][var4 + 1][var5] * var7) >> 7;
        return (128 - var8) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 86)
    public static void method287(int arg0) {
        if (arg0 != 3) {
            field571 = -79;
        }
        field568 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIBIIIIII)V", line = 100)
    public static final void method288(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 <= 110) {
            field571 = 113;
        }
        if (arg1 == arg4 && arg0 == arg7 && arg6 == arg9 && arg5 == arg8) {
            class38.method285(arg4, true, arg6, arg2, arg0, arg8);
        } else {
            int var10 = arg4;
            int var11 = arg0 * 3;
            int var12 = arg4 * 3;
            int var13 = arg0;
            int var14 = arg7 * 3;
            int var15 = arg5 * 3;
            int var16 = arg1 * 3;
            int var17 = arg9 * 3;
            int var18 = arg6 + var16 - arg4 - var17;
            int var19 = var17 + var12 - var16 - var16;
            int var20 = arg8 + var14 - var15 - arg0;
            int var21 = var15 - (var14 - var11) - var14;
            int var22 = var14 - var11;
            int var23 = var16 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var20 * var26;
                int var29 = var21 * var25;
                int var30 = var23 * var24;
                int var31 = var22 * var24;
                int var32 = var19 * var25;
                int var33 = (var27 + var32 + var30 >> 12) + arg4;
                int var34 = arg0 + (var28 + var29 + var31 >> 12);
                class38.method285(var10, true, var33, arg2, var13, var34);
                var13 = var34;
                var10 = var33;
            }
        }
        field567++;
    }
}
