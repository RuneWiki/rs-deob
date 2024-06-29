import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class423 {

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Lui;")
    public static class375 field6306 = new class375("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "Lcm;")
    public static class449 field6308 = new class449(47, 3);

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "[[I")
    public static int[][] field6310 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "Lhs;")
    public static class94 field6309;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "[Lmg;")
    public static class168[] field6311;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIII)I")
    public static final int method2548(int arg0, int arg1, int arg2, int arg3) {
        field6307++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else {
            if (arg1 != 2) {
                method2551((byte) -64);
            }
            return var4 == 2 ? 1023 - arg0 : -arg3 + 1023;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBZI)I")
    public static final int method2549(int arg0, byte arg1, boolean arg2, int arg3) {
        field6305++;
        if (arg1 < 126) {
            method2551((byte) 20);
        }
        class410 var4 = class261.method1684(arg3, 25, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field6166.length; var6++) {
                if (var4.field6169[var6] == arg0) {
                    var5 += var4.field6166[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIILkq;)V")
    public static final void method2550(int arg0, int arg1, int arg2, int arg3, class523 arg4) {
        class420 var5 = class422.method2542(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field7728 = (arg1 << class386.field5882) + class380.field5804;
        arg4.field7732 = arg3;
        arg4.field7731 = (arg2 << class386.field5882) + class380.field5804;
        for (class115 var7 = var5.field6273; var7 != null; var7 = var7.field1600) {
            if (var7.field1594.field2207) {
                int var8 = var7.field1594.method779((byte) 9);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field7732 += var6;
            arg4.field7733 = true;
        }
        var5.field6268 = arg4;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public static void method2551(byte arg0) {
        field6308 = null;
        field6306 = null;
        field6309 = null;
        if (arg0 != -19) {
            method2550(-53, 92, -65, 90, null);
        }
        field6310 = null;
        field6311 = null;
    }
}
