import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class76 {

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lij;")
    public static class50 field1435 = class78.method578(125, "Ablegen");

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lij;")
    private static class50 field1434 = class78.method578(123, "Cancel");

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lij;")
    public static class50 field1432 = class78.method578(123, "VOLL");

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lij;")
    private static class50 field1433 = class78.method578(125, " has logged out)3");

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "[[[I")
    public static int[][][] field1437 = new int[4][13][13];

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lij;")
    public static class50 field1431 = field1434;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lij;")
    public static class50 field1439 = field1433;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Z")
    public static boolean field1440 = true;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lag;")
    public static class235 field1436 = new class235(5000);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method571(byte arg0) {
        field1433 = null;
        field1434 = null;
        field1436 = null;
        field1431 = null;
        field1437 = null;
        field1432 = null;
        if (arg0 != 97) {
            method574(14);
        }
        field1439 = null;
        field1435 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1438++;
        if (arg5 != 3) {
            field1434 = null;
        }
        if (arg3 < 1 || arg2 < 1 || arg3 > 102 || arg2 > 102) {
            return;
        }
        if (!class174.method1198(0) && (class210.field3495[0][arg3][arg2] & 0x2) == 0) {
            int var8 = arg6;
            if ((class210.field3495[arg6][arg3][arg2] & 0x8) != 0) {
                var8 = 0;
            }
            if (class93.field1746 != var8) {
                return;
            }
        }
        int var9 = arg6;
        if (arg6 < 3 && (class210.field3495[1][arg3][arg2] & 0x2) == 2) {
            var9 = arg6 + 1;
        }
        class54.method432(class45.field826[arg6], arg2, var9, arg6, arg3, arg0, true);
        if (arg7 < 0) {
            return;
        }
        boolean var10 = class172.field2878;
        class172.field2878 = true;
        class24.method237(arg6, arg1, false, var9, arg7, arg2, -52, false, arg3, arg4, class45.field826[arg6]);
        class172.field2878 = var10;
        return;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILpi;)Lpi;")
    public abstract class68 method573(int arg0, class68 arg1);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method574(int arg0) {
        class203.field3368 = arg0;
        for (int var1 = 0; var1 < class139.field2421; var1++) {
            for (int var2 = 0; var2 < class54.field978; var2++) {
                if (class59.field1089[arg0][var1][var2] == null) {
                    class59.field1089[arg0][var1][var2] = new class65(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)I")
    public static final int method575(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & arg3;
        field1441++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }
}
