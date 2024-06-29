import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class100 extends class62 {

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "[I")
    public int[] field1552 = new int[] { -1 };

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "[I")
    public int[] field1553 = new int[1];

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field1548 = -1;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "Leg;")
    public static class37 field1554 = class174.method1167("Chargement des fichiers config )2 ", -114);

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "Ljl;")
    public static class101 field1555;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(BI)I")
    public static final int method646(byte arg0, int arg1) {
        field1551++;
        int var2 = 53 / ((-arg0 - 65) / 52);
        int var3 = arg1 & 0x3F;
        int var4 = arg1 >> 6 & 0x3;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)[Lni;")
    public static final class195[] method647(byte arg0) {
        class195[] var1 = new class195[class5.field91];
        if (arg0 != -87) {
            field1549 = 113;
        }
        field1556++;
        for (int var2 = 0; var2 < class5.field91; var2++) {
            int var3 = class224.field3852[var2] * class125.field2101[var2];
            byte[] var4 = class170.field2848[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class262.field4617[class96.method626(var4[var6], 255)];
            }
            var1[var2] = new class195(class257.field4567, class126.field2118, class249.field4476[var2], class158.field2636[var2], class224.field3852[var2], class125.field2101[var2], var5);
        }
        class5.method33(24094);
        return var1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIII)V")
    public static final void method648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1550++;
        class254.field4520[0].method109(arg4, arg2);
        class254.field4520[1].method109(arg4, arg2 + arg3 - 16);
        int var6 = (arg3 - 32) * arg3 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg3 - var6 - 32) * arg0 / (arg1 - arg3);
        class122.method873(arg4, arg2 + 16, arg5, arg3 - 32, class93.field1474);
        class122.method873(arg4, arg2 + var7 + 16, 16, var6, class210.field3620);
        class122.method882(arg4, arg2 + var7 + 16, var6, class132.field2222);
        class122.method882(arg4 + 1, arg2 + 16 + var7, var6, class132.field2222);
        class122.method865(arg4, arg2 + var7 + 16, 16, class132.field2222);
        class122.method865(arg4, arg2 + var7 + 17, 16, class132.field2222);
        class122.method882(arg4 + 15, var7 + 16 + arg2, var6, class51.field790);
        class122.method882(arg4 + 14, arg2 + var7 - -17, var6 - 1, class51.field790);
        class122.method865(arg4, var6 + arg2 + var7 + 15, 16, class51.field790);
        class122.method865(arg4 + 1, arg2 + 14 + var6 + var7, 15, class51.field790);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILei;Lei;)V")
    public static final void method649(int arg0, class62 arg1, class62 arg2) {
        field1547++;
        if (arg1.field1026 != null) {
            arg1.method441(16773377);
        }
        arg1.field1013 = arg2;
        arg1.field1026 = arg2.field1026;
        arg1.field1026.field1013 = arg1;
        if (arg0 != -17487) {
            field1548 = -45;
        }
        arg1.field1013.field1026 = arg1;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V")
    public static void method650(byte arg0) {
        field1555 = null;
        if (arg0 < 32) {
            field1548 = -62;
        }
        field1554 = null;
    }
}
