import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class239 extends class202 {

    @OriginalMember(owner = "client!s", name = "q", descriptor = "[I")
    public int[] field3880 = new int[] { -1 };

    @OriginalMember(owner = "client!s", name = "p", descriptor = "[I")
    public int[] field3879 = new int[1];

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field3875 = 0;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "[I")
    public static int[] field3882 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!s", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3878 = new String[200];

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field3881 = 0;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
    public static void method1654(int arg0) {
        field3882 = null;
        field3878 = null;
        if (arg0 != -14386) {
            method1654(-127);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)[B")
    public static final byte[] method1655(int arg0, boolean arg1) {
        if (arg1) {
            method1654(-30);
        }
        field3876++;
        class157 var2 = (class157) class132.field2117.method1832((long) arg0, (byte) 125);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class142.method982(-396321952, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class157(var3);
            class132.field2117.method1831((long) arg0, var2, 128);
        }
        return var2.field2547;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZIIB[Lwd;[BIIII)V")
    public static final void method1656(int arg0, boolean arg1, int arg2, int arg3, byte arg4, class22[] arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        field3874++;
        int var11 = -1;
        int var12 = 1 / ((-arg4 - 13) / 37);
        class221 var13 = new class221(arg6);
        while (true) {
            int var14 = var13.method1562((byte) 39);
            if (var14 == 0) {
                return;
            }
            var11 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var13.method1528(19380);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 >> 12;
                int var18 = (var15 & 0xFCA) >> 6;
                int var19 = var15 & 0x3F;
                int var20 = var13.method1517((byte) -96);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg2 == var17 && var18 >= arg7 && var18 < arg7 + 8 && var19 >= arg9 && (arg9 + 8) > var19) {
                    class135 var23 = class209.method1447(var11, -6653);
                    int var24 = arg10 + class136.method959(var22, var19 & 0x7, arg8, var23.field2175, 1, var23.field2225, var18 & 0x7);
                    int var25 = arg3 + class260.method1779(var23.field2175, var18 & 0x7, var22, arg8, var23.field2225, false, var19 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        class22 var26 = null;
                        if (!arg1) {
                            int var27 = arg0;
                            if ((class201.field3198[1][var24][var25] & 0x2) == 2) {
                                var27 = arg0 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg5[var27];
                            }
                        }
                        class56.method416(var26, arg1, var11, true, arg0, var21, arg0, !arg1, var25, var24, var22 + arg8 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIILqh;)Z")
    public static final boolean method1657(int arg0, int arg1, int arg2, class201 arg3) {
        int var4 = 84 % ((arg1 + 16) / 60);
        field3883++;
        byte[] var5 = arg3.method1357(arg0, arg2, -1);
        if (var5 == null) {
            return false;
        } else {
            class197.method1335(var5, false);
            return true;
        }
    }
}
