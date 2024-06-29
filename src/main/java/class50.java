import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class50 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[I")
    public static int[] field1350 = new int[2048];

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "La;")
    public static class1 field1347 = class113.method934(-11538, "Freund hinzuf-Ugen");

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[Lu;")
    public static class120[] field1352 = new class120[256];

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "[I")
    public static int[] field1353 = new int[4000];

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[I")
    public static int[] field1355 = new int[] { 0, 15, 6, 8, 0, 0, 1, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 1, 7, 0, 0, 0, -2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 4, 0, -1, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 0, 1, -1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 4, 0, 0, 0, 1, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 5, 2, 8, 2, 0, 8, 0, 0, 0, 0, 0, 0, 0, -2, 3, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 10, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 6, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 2, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 6, 4, 3, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 2, 0, 4, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 3, -1, 0, 0, 0, 0, 0, 14, 0, 6, 0, 0, 6, 1, 0, 2, 0, 0, -2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 2, 4 };

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
    public static int[] field1349;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILbd;II)[Le;", line = 27)
    public static final class25[] method520(int arg0, class11 arg1, int arg2, int arg3) {
        field1354++;
        if (class105.method888(arg2, arg3, arg1, arg0 ^ 0xFFFFEECD)) {
            if (arg0 != 7729) {
                field1355 = null;
            }
            return class123.method997(arg0 ^ 0x1E31);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZII)I", line = 43)
    public static final int method521(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg1) {
            return 68;
        }
        field1357++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 69)
    public static void method522(byte arg0) {
        field1349 = null;
        field1355 = null;
        field1350 = null;
        field1352 = null;
        if (arg0 != -41) {
            field1352 = null;
        }
        field1353 = null;
        field1347 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Z", line = 84)
    public static final boolean method523(int arg0) {
        int var1 = -98 % ((-arg0 - 50) / 51);
        field1356++;
        return class9.field312 != null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILab;IIII[BI[Lad;II)V", line = 105)
    public static final void method524(int arg0, class3 arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, class5[] arg8, int arg9, int arg10) {
        field1351++;
        class8 var11 = new class8(arg6);
        int var12 = -1;
        while (true) {
            int var13 = var11.method179((byte) 126);
            if (var13 == 0) {
                if (arg2 != 0) {
                    field1352 = null;
                    return;
                }
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method179((byte) -76);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 12;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var11.method145(false);
                int var19 = var18 >> 2;
                int var20 = var14 & 0x3F;
                int var21 = var18 & 0x3;
                if (arg5 == var16 && arg0 <= var17 && var17 < arg0 + 8 && arg9 <= var20 && arg9 + 8 > var20) {
                    class49 var22 = class32.method390(var12, (byte) 125);
                    int var23 = client.method288(arg2 ^ 0x1, var21, var22.field1288, var17 & 0x7, var22.field1300, arg4, var20 & 0x7) + arg10;
                    int var24 = class35.method405(var20 & 0x7, var22.field1300, var17 & 0x7, var22.field1288, arg4, var21, (byte) -123) + arg7;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class5 var25 = null;
                        int var26 = arg3;
                        if ((class34.field899[1][var23][var24] & 0x2) == 2) {
                            var26 = arg3 - 1;
                        }
                        if (var26 >= 0) {
                            var25 = arg8[var26];
                        }
                        class19.method302(arg4 + var21 & 0x3, var25, var23, arg1, -127, var19, var12, var24, arg3);
                    }
                }
            }
        }
    }
}
