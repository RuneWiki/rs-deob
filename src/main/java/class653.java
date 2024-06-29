import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class653 extends class69 {

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "Ljava/lang/String;")
    public String field9115;

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "Z")
    public static boolean field9112 = false;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "[I")
    public static int[] field9111 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "I")
    public static int field9116 = 0;

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "Ljn;")
    public static class134 field9114 = new class134(127, -1);

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "([[BLtf;B)V")
    public static final void method3733(byte[][] arg0, class245 arg1, byte arg2) {
        field9113++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        int var5 = -121 / ((16 - arg2) / 46);
        for (int var6 = 0; var6 < var4; var6++) {
            byte[] var11 = arg0[var6];
            if (var11 != null) {
                class511 var12 = new class511(var11);
                int var13 = class611.field8607[var6] >> 8;
                int var14 = class611.field8607[var6] & 0xFF;
                int var15 = var13 * 64 - class444.field6151;
                int var16 = var14 * 64 - class236.field3535;
                class482.method2865(23105);
                arg1.method4053(var16, class236.field3535, class444.field6151, var12, client.field1305, 152, var15);
                arg1.method1635(-4, var15, class111.field1332, var12, var3, var16);
                if (!arg1.field10088 && class728.field10063 / 8 == var13 && (class372.field5352 / 8) == var14 && var3[0] != -1) {
                    class516.field7081 = class72.field790.method670(29, var3[0], var3[3], var3[2], var3[1], class651.field9101);
                    class759.field10435 = var3[4];
                }
            }
        }
        for (int var7 = 0; var7 < var4; var7++) {
            int var8 = (class611.field8607[var7] >> 8) * 64 - class444.field6151;
            int var9 = (class611.field8607[var7] & 0xFF) * 64 - class236.field3535;
            byte[] var10 = arg0[var7];
            if (var10 == null && class372.field5352 < 800) {
                class482.method2865(23105);
                arg1.method4056(64, var8, false, var9, 64);
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
    public class653() {
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(III[IIIII)Z")
    public static final boolean method3734(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 < 0) {
            arg6 = 0;
        }
        if (class516.field7079 < arg4) {
            arg4 = class516.field7079;
        }
        field9110++;
        if (arg1 != 2) {
            field9116 = 33;
        }
        if (arg6 >= arg4) {
            return true;
        }
        int var8 = arg4 - arg6 >> 2;
        int var9 = arg2 * arg6 + arg7;
        int var10 = arg6 + arg5 - 1;
        int var10000;
        if (class635.field8859 == 1) {
            class380.field5448 += var8;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var11 = arg4 - arg6 & 0x3;
                    while (true) {
                        var11--;
                        if (var11 < 0) {
                            return true;
                        }
                        var10++;
                        if (var9 < arg3[var10]) {
                            arg3[var10] = var9;
                        }
                        var9 += arg2;
                    }
                }
                var10000 = ~var9;
                var10++;
                if (var10000 > ~arg3[var10]) {
                    arg3[var10] = var9;
                }
                int var12 = arg2 + var9;
                var10++;
                if (arg3[var10] > var12) {
                    arg3[var10] = var12;
                }
                int var13 = arg2 + var12;
                var10++;
                if (arg3[var10] > var13) {
                    arg3[var10] = var13;
                }
                int var14 = arg2 + var13;
                var10++;
                if (arg3[var10] > var14) {
                    arg3[var10] = var14;
                }
                var9 = arg2 + var14;
            }
        } else {
            int var15 = var9 - 38400;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var16 = arg4 - arg6 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var10000 = ~var15;
                        var10++;
                        if (var10000 > ~arg3[var10]) {
                            return false;
                        }
                        var15 += arg2;
                    }
                }
                var10++;
                if (arg3[var10] > var15) {
                    return false;
                }
                int var17 = arg2 + var15;
                var10++;
                if (var17 < arg3[var10]) {
                    return false;
                }
                int var18 = arg2 + var17;
                var10++;
                if (arg3[var10] > var18) {
                    return false;
                }
                int var19 = arg2 + var18;
                var10++;
                if (arg3[var10] > var19) {
                    return false;
                }
                var15 = arg2 + var19;
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class653(String arg0, int arg1) {
        this.field9115 = arg0;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public static void method3735(int arg0) {
        field9111 = null;
        if (arg0 == 0) {
            field9114 = null;
        }
    }
}
