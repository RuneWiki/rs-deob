import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class306 implements class96 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4626 = "wave:";

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Le;")
    public static class342 field4627 = new class342(16);

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
    public static int[] field4630 = new int[] { 10, 0, 0, 0, -1, 0, 0, 6, 0, 0, 28, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 6, 0, 0, 0, 6, -2, 0, 2, 0, 0, 0, 3, 0, -1, 0, 0, 0, 0, 0, 8, 0, 2, 3, 0, 0, 0, 0, -2, 4, 0, -1, 4, 0, -2, -2, 0, 0, 5, 0, 10, 0, 0, 3, 0, 0, 6, 0, 0, 14, 3, 0, 0, 0, -1, 0, 0, 5, 0, 0, -1, 1, 8, 6, 0, 0, -1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 2, -1, 0, -1, 0, 0, 0, 0, 0, 2, 0, 0, -1, 7, 0, 10, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 12, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 6, 0, 0, 5, 0, 0, 0, -2, 10, 0, 0, 8, 8, 0, 11, 0, 2, 0, -1, 0, 1, 0, 8, 0, 8, 2, 0, -2, 15, 0, 7, 0, 0, 0, -2, 9, 1, 6, 6, 0, 0, 0, 0, -1, -2, 0, 0, 8, 12, 0, 7, 0, 0, 3, 0, 3, 0, 20, 12, -1, 0, 3, 0, 0, -2, 0, 0, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 17, 0, -2, 0, 0, 0, 0, 15, 0, 0, 0, -1, 0, 0, 0, 0, 0, 7, 12, 0, 0, 4, 0, -2, 6, 8, 8, 0, 2, -2, 0, 14, 0, 0 };

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "[I")
    public static int[] field4633 = new int[200];

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lh;")
    public static class107 field4628;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 8)
    public static void method2025(int arg0) {
        int var1 = 69 / ((-arg0 - 55) / 53);
        field4628 = null;
        field4630 = null;
        field4626 = null;
        field4627 = null;
        field4633 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IJI[I)Ljava/lang/String;", line = 20)
    public final String method639(int arg0, long arg1, int arg2, int[] arg3) {
        field4625++;
        if (arg2 == 0) {
            class125 var6 = class208.method1408((byte) 17, arg3[0]);
            return var6.method825((int) arg1, -9614);
        }
        if (arg0 != -3459) {
            method2026(-72, 61, -10, 81, -124, 89);
        }
        if (arg2 == 1 || arg2 == 10) {
            class337 var7 = class95.method636(22111, (int) arg1);
            return var7.field5227;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class208.method1408((byte) 17, arg3[0]).method825((int) arg1, arg0 - 6155);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIII)Z", line = 51)
    public static final boolean method2026(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class244.field3791[arg0][var8][var9] == -class186.field3020) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class45.field923[arg0][arg1][arg3] + arg5;
            if (!class168.method1065(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class168.method1065(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class168.method1065(var10, var12, var14)) {
                return false;
            } else if (class168.method1065(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class2.method8(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class168.method1065(var6 + 1, class45.field923[arg0][arg1][arg3] + arg5, var7 + 1) && class168.method1065(var6 + 128 - 1, class45.field923[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class168.method1065(var6 + 128 - 1, class45.field923[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class168.method1065(var6 + 1, class45.field923[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I[Lkl;I)V", line = 120)
    public static final void method2027(int arg0, class68[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class68 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field1358 == 0) {
                    if (var4.field1372 != null) {
                        method2027(arg0, var4.field1372, arg2);
                    }
                    class222 var5 = (class222) class185.field3013.method303((long) var4.field1284, (byte) 106);
                    if (var5 != null) {
                        class127.method839(arg0, var5.field3514, (byte) -78);
                    }
                }
                if (arg0 == 0 && var4.field1305 != null) {
                    class106 var6 = new class106();
                    var6.field1823 = var4;
                    var6.field1841 = var4.field1305;
                    class156.method1008(true, var6);
                }
                if (arg0 == 1 && var4.field1449 != null) {
                    if (var4.field1365 >= 0) {
                        class68 var7 = class319.method2196(arg2 ^ 0x5091DE6E, var4.field1284);
                        if (var7 == null || var7.field1372 == null || var4.field1365 >= var7.field1372.length || var7.field1372[var4.field1365] != var4) {
                            continue;
                        }
                    }
                    class106 var8 = new class106();
                    var8.field1823 = var4;
                    var8.field1841 = var4.field1449;
                    class156.method1008(true, var8);
                }
            }
        }
        if (arg2 != -2) {
            method2025(-60);
        }
        field4631++;
    }
}
