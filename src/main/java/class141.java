import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class141 {

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Ltg;")
    public static class184 field2560 = class135.method812(")3", 3);

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Ltg;")
    public static class184 field2563 = class135.method812("oder ung-Ultiges Passwort)3", 3);

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Ltg;")
    private static class184 field2561 = class135.method812("Too many incorrect logins from your address)3", 3);

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2565 = 0;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Ltg;")
    private static class184 field2562 = class135.method812("Connecting to update server", 3);

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2566 = 0;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Ltg;")
    public static class184 field2568 = field2562;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Ltg;")
    public static class184 field2569 = field2561;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lpf;")
    public static class147 field2559;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lsc;")
    public static class171 field2564;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class19.field372[arg0][var8][var14] == -class103.field1884) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class131.field2380[arg0][arg1][arg3] + arg5;
            if (!class127.method766(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class127.method766(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class127.method766(var9, var11, var13)) {
                return false;
            } else if (class127.method766(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class127.method777(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class127.method766(var6 + 1, class131.field2380[arg0][arg1][arg3] + arg5, var7 + 1) && class127.method766(var6 + 128 - 1, class131.field2380[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class127.method766(var6 + 128 - 1, class131.field2380[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class127.method766(var6 + 1, class131.field2380[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
    public static final Object method873(byte[] arg0, boolean arg1, boolean arg2) {
        field2570++;
        if (arg0 == null) {
            return null;
        }
        if (arg1) {
            field2562 = null;
        }
        if (arg0.length > 136 && !class10.field190) {
            try {
                class198 var3 = (class198) Class.forName("pg").getDeclaredConstructor().newInstance();
                var3.method909((byte) -12, arg0);
                return var3;
            } catch (Throwable var4) {
                class10.field190 = true;
            }
        }
        return arg2 ? class29.method181(arg0, 32768000) : arg0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Z")
    public static final boolean method874(int arg0, int arg1) {
        field2567++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            int var2 = -112 % ((-arg0 - 17) / 34);
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static void method875(int arg0) {
        field2559 = null;
        field2561 = null;
        if (arg0 > -10) {
            return;
        }
        field2562 = null;
        field2560 = null;
        field2563 = null;
        field2564 = null;
        field2569 = null;
        field2568 = null;
    }
}
