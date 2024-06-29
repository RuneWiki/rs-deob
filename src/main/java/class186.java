import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class186 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Ldj;")
    private static class44 field3208 = class89.method650(255, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Ldj;")
    private static class44 field3210 = class89.method650(255, "Please try again)3");

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field3209 = 1;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3212 = 0;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Ldj;")
    public static class44 field3213 = field3208;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Ldj;")
    public static class44 field3214 = field3210;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lri;")
    public static class189 field3211 = new class189(64);

    @OriginalMember(owner = "client!re", name = "i", descriptor = "J")
    public static volatile long field3216 = 0L;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Ll;")
    public static class120 field3215 = new class120(4096);

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Ldj;")
    public static class44 field3218 = class89.method650(255, "(U0a )2 via: ");

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Ls;")
    public static class190 field3217 = new class190();

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljh;)V")
    public static final void method1157(class106 arg0) {
        for (int var1 = arg0.field1945; var1 <= arg0.field1939; var1++) {
            for (int var2 = arg0.field1955; var2 <= arg0.field1936; var2++) {
                class68 var3 = class32.field567[arg0.field1952][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1300; var4++) {
                        if (var3.field1314[var4] == arg0) {
                            var3.field1300--;
                            for (int var5 = var4; var5 < var3.field1300; var5++) {
                                var3.field1314[var5] = var3.field1314[var5 + 1];
                                var3.field1308[var5] = var3.field1308[var5 + 1];
                            }
                            var3.field1314[var3.field1300] = null;
                            break;
                        }
                    }
                    var3.field1293 = 0;
                    for (int var6 = 0; var6 < var3.field1300; var6++) {
                        var3.field1293 |= var3.field1308[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method1158(byte arg0) {
        if (arg0 < 38) {
            return;
        }
        field3215 = null;
        field3211 = null;
        field3218 = null;
        field3214 = null;
        field3217 = null;
        field3208 = null;
        field3213 = null;
        field3210 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class170.field2972[arg0][var8][var14] == -class188.field3248) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class205.field3675[arg0][arg1][arg3] + arg5;
            if (!class57.method439(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class57.method439(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class57.method439(var9, var11, var13)) {
                return false;
            } else if (class57.method439(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class94.method668(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class57.method439(var6 + 1, class205.field3675[arg0][arg1][arg3] + arg5, var7 + 1) && class57.method439(var6 + 128 - 1, class205.field3675[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class57.method439(var6 + 128 - 1, class205.field3675[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class57.method439(var6 + 1, class205.field3675[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
