import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class98 {

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
    public static int[] field1454 = new int[256];

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "[Z")
    public static boolean[] field1450 = new boolean[100];

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field1452 = 0;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIII)V", line = 19)
    public static final void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg3 + arg5;
        field1455++;
        int var9 = arg0 + arg5;
        int var10 = arg1 - arg5;
        int var11 = arg4 - arg5;
        int var12 = arg3;
        if (arg2 >= -119) {
            method773(64);
        }
        while (var8 > var12) {
            class138.method1047(arg6, arg4, arg0, 7, class320.field4990[var12]);
            var12++;
        }
        for (int var13 = arg1; var13 > var10; var13--) {
            class138.method1047(arg6, arg4, arg0, 7, class320.field4990[var13]);
        }
        for (int var14 = var8; var14 <= var10; var14++) {
            int[] var15 = class320.field4990[var14];
            class138.method1047(arg6, var9, arg0, 7, var15);
            class138.method1047(arg7, var11, var9, 7, var15);
            class138.method1047(arg6, arg4, var11, 7, var15);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 65)
    public static void method773(int arg0) {
        field1450 = null;
        field1454 = null;
        if (arg0 != -998) {
            method772(0, -54, 18, 32, 112, -37, -62, -100);
        }
    }
}
