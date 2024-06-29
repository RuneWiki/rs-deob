import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class159 extends class247 {

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public int field2081 = -1;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field2080 = 0;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "[Z")
    public static boolean[] field2084 = new boolean[100];

    @OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
    public static int[] field2085 = new int[250];

    @OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
    public static int[] field2082 = new int[14];

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public int field2088;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Lqj;")
    public static class238 field2078;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Ldb;")
    public static class26 field2079;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Ljava/lang/String;")
    public String field2083;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Ljava/lang/String;")
    public String field2086;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
    public static final void method1004(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class232.field3279.method756(0, 112);
        ++field2087;
        ++class407.field6103;
        class232.field3279.method1704(arg0, (byte) 127);
        class232.field3279.method1693(arg4, (byte) 74);
        if (arg3 <= 19) {
            field2078 = null;
        }
        class232.field3279.method1718(arg1, (byte) -127);
        class232.field3279.method1716((byte) -55, arg2);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
    public static final void method1005(int arg0, int arg1) {
        class10 var2 = class343.field5032[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class10 var4 = class343.field5032[var3][arg0][arg1] = class343.field5032[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field113;
                for (class39 var5 = var4.field109; var5 != null; var5 = var5.field627) {
                    class361 var6 = var5.field621;
                    if (var6.field5296 == arg0 && var6.field5288 == arg1) {
                        --var6.field5291;
                    }
                }
            }
        }
        if (class343.field5032[0][arg0][arg1] == null) {
            class343.field5032[0][arg0][arg1] = new class10(0, arg0, arg1);
            class343.field5032[0][arg0][arg1].field116 = 1;
        }
        class343.field5032[0][arg0][arg1].field103 = var2;
        class343.field5032[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
    public static void method1006(byte arg0) {
        field2082 = null;
        field2084 = null;
        field2085 = null;
        if (arg0 == 4) {
            field2078 = null;
            field2079 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)Lja;")
    public final class90 method1007(int arg0) {
        ++field2089;
        if (arg0 != 20203) {
            this.field2086 = null;
        }
        return class411.field6149[super.field3451];
    }
}
