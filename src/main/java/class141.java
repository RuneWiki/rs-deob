import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class141 extends class54 {

    @OriginalMember(owner = "client!n", name = "t", descriptor = "[[I")
    public static int[][] field2726 = new int[5][5000];

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public int field2721;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public int field2731;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Ldc;")
    public class37 field2727;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "[Ldc;")
    public class37[] field2724;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public static void method983(int arg0) {
        field2726 = null;
        if (arg0 != 2) {
            method985(18);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
    public static final void method984(byte arg0) {
        field2730++;
        if (arg0 <= 78) {
            field2726 = null;
        }
        class19.field314.method93(0);
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public static final void method985(int arg0) {
        if (arg0 != 1) {
            field2726 = null;
        }
        field2725++;
        while (true) {
            class203 var1 = class160.field3015;
            class83 var2;
            synchronized (class160.field3015) {
                var2 = (class83) class199.field3713.method1337(-109);
            }
            if (var2 == null) {
                return;
            }
            var2.field1464.method385(false, (int) var2.field1066, var2.field1465, var2.field1476, -102);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 0) {
            method984((byte) -19);
        }
        field2729++;
        if (arg0 < 1 || arg2 < 1 || arg0 > 102 || arg2 > 102) {
            return;
        }
        if (class16.field259 && (class193.field3602[0][arg0][arg2] & 0x2) == 0) {
            int var8 = arg6;
            if ((class193.field3602[arg6][arg0][arg2] & 0x8) != 0) {
                var8 = 0;
            }
            if (class41.field859 != var8) {
                return;
            }
        }
        int var9 = arg6;
        if (arg6 < 3 && (class193.field3602[1][arg0][arg2] & 0x2) == 2) {
            var9 = arg6 + 1;
        }
        class224.method1475(arg0, class11.field143[arg6], -99, arg5, var9, arg2, arg6);
        if (arg1 >= 0) {
            class82.method565(arg2, class11.field143[arg6], arg7, false, arg6, false, arg3, -117, var9, arg0, false, arg1);
            return;
        }
    }
}
