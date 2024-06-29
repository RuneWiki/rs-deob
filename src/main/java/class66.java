import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class66 extends class89 {

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1337 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!g", name = "u", descriptor = "[Lqe;")
    public static class179[] field1344 = new class179[100];

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Lqe;")
    public static class179 field1341 = class206.method1380("null", (byte) -126);

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field1342 = 0;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "Lqe;")
    private static class179 field1347 = class206.method1380("You have only just left another world)3", (byte) -46);

    @OriginalMember(owner = "client!g", name = "v", descriptor = "Lqe;")
    public static class179 field1345 = field1347;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "Lee;")
    public static class49 field1346;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "[[[B")
    public static byte[][][] field1340;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([B[Ldg;IIIIIIII)V")
    public static final void method428(byte[] arg0, class40[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg9 + var10 > 0 && arg9 + var10 < 103 && arg6 + var15 > 0 && arg6 + var15 < 103) {
                    arg1[arg2].field855[arg9 + var10][arg6 + var15] = class107.method696(arg1[arg2].field855[arg9 + var10][arg6 + var15], -16777217);
                }
            }
        }
        field1352++;
        class185 var11 = new class185(arg0);
        int var12 = 0;
        if (arg8 != 23711) {
            field1340 = null;
        }
        while (var12 < 4) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg7 && var13 < arg7 + 8 && var14 >= arg3 && var14 < arg3 + 8) {
                        class179.method1163(0, arg5, arg9 + class229.method1505(var14 & 0x7, -13417, arg5, var13 & 0x7), arg6 - -class223.method1444(arg5, var14 & 0x7, var13 & 0x7, (byte) 122), (byte) -68, var11, 0, arg2);
                    } else {
                        class179.method1163(0, 0, -1, -1, (byte) -68, var11, 0, 0);
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLqe;)V")
    public static final void method429(byte arg0, class179 arg1) {
        field1349++;
        if (class25.field588.field7 == null) {
            return;
        }
        try {
            class179 var2 = class211.field3934.method1164(116, class25.field588.field7);
            class179 var3 = class9.field261.method1164(70, class25.field588.field7);
            class179 var4 = class78.method502((byte) -106, new class179[] { var2, class108.field2008, arg1, class60.field1289, var3 });
            class179 var5;
            if (arg1.method1168(true) == 0) {
                var5 = class78.method502((byte) -88, new class179[] { var4, class31.field672 });
            } else {
                var5 = class78.method502((byte) -82, new class179[] { var4, class223.field4103, class2.method16(class80.method504(-1) + 94608000000L, (byte) -46), class217.field4022, class121.method774(10, 94608000L) });
            }
            class78.method502((byte) -126, new class179[] { class237.field4359, var5, class112.field2106 }).method1148(class25.field588.field7, 0);
        } catch (Throwable var7) {
        }
        int var6 = 90 % ((-arg0 - 13) / 43);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static void method430(int arg0) {
        field1337 = null;
        field1340 = null;
        if (arg0 != 21558) {
            field1346 = null;
        }
        field1347 = null;
        field1346 = null;
        field1341 = null;
        field1345 = null;
        field1344 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V")
    public static final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -65) {
            return;
        }
        field1339++;
        int var7 = arg2 + arg3;
        int var8 = arg6 - arg3;
        int var9 = arg3 + arg4;
        for (int var10 = arg4; var10 < var9; var10++) {
            class23.method161(arg0, arg5 ^ 0x40, arg1, arg2, class14.field331[var10]);
        }
        int var11 = arg0 - arg3;
        for (int var12 = arg6; var12 > var8; var12--) {
            class23.method161(arg0, -1, arg1, arg2, class14.field331[var12]);
        }
        for (int var13 = var9; var13 <= var8; var13++) {
            int[] var14 = class14.field331[var13];
            class23.method161(var7, arg5 + 64, arg1, arg2, var14);
            class23.method161(arg0, -1, arg1, var11, var14);
        }
    }
}
