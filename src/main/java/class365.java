import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class365 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field5574 = 0;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[[Z")
    public static boolean[][] field5578 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Ldp;")
    public static class347 field5575 = new class347(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field5580 = 2;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V", line = 5)
    public static final void method2179(int arg0, int arg1) {
        if (arg0 == -22799) {
            field5573++;
            class506 var2 = class14.method185(-1304589728, arg1, 3);
            var2.method2986(49);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 22)
    public static void method2180(int arg0) {
        field5575 = null;
        field5578 = null;
        if (arg0 != 1) {
            field5574 = -41;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V", line = 33)
    public static final void method2181(String arg0, byte arg1, String arg2) {
        class516.field7574 = 1;
        field5579++;
        class42.field553 = -1;
        if (arg1 <= 106) {
            field5575 = null;
        }
        class478.method2844(arg2, 23238, arg0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIBIII)V", line = 46)
    public static final void method2182(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5577++;
        int var6 = class375.method2223(false, arg0, class286.field4290, class305.field4555);
        int var7 = 10 % ((arg2 - 8) / 35);
        int var8 = class375.method2223(false, arg3, class286.field4290, class305.field4555);
        int var9 = class375.method2223(false, arg1, class102.field1544, class297.field4427);
        int var10 = class375.method2223(false, arg5, class102.field1544, class297.field4427);
        for (int var11 = var6; var11 <= var8; var11++) {
            class94.method740(class306.field4574[var11], var9, var10, arg4, false);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lya;ILut;)I", line = 74)
    public static final int method2183(class11 arg0, int arg1, class148 arg2) {
        field5576++;
        if (~arg2.field2239 != arg1) {
            return arg2.field2239;
        }
        if (arg2.field2240 != -1) {
            class161 var3 = arg0.field101.method1480(arg0.method112() ? arg2.field2240 : arg2.field2231, 14270);
            if (!var3.field2405) {
                return var3.field2409;
            }
        }
        return arg2.field2232;
    }
}
