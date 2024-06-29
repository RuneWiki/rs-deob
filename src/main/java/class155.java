import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class155 extends class44 {

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lkb;")
    public static class93 field3046 = class76.method390(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 0);

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field3054 = 0;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lkb;")
    public static class93 field3050 = class76.method390("null", 0);

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field3048 = 0;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "[I")
    public static int[] field3058 = new int[5];

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "Lme;")
    public class114 field3057;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Lna;")
    public static class119 field3051;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Lge;")
    public class61 field3053;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "[B")
    public byte[] field3045;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([SBII[Lkb;)V")
    public static final void method992(short[] arg0, byte arg1, int arg2, int arg3, class93[] arg4) {
        field3049++;
        if (arg1 != 36) {
            method992(null, (byte) -122, 45, -107, null);
        }
        if (arg3 >= arg2) {
            return;
        }
        int var5 = (arg3 + arg2) / 2;
        int var6 = arg3;
        class93 var7 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var7;
        short var8 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var8;
        for (int var9 = arg3; var9 < arg2; var9++) {
            if (var7 == null || arg4[var9] != null && arg4[var9].method512(arg1 ^ 0xFFFFFFBB, var7) < (var9 & 0x1)) {
                class93 var10 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6] = var10;
                short var11 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6++] = var11;
            }
        }
        arg4[arg2] = arg4[var6];
        arg4[var6] = var7;
        arg0[arg2] = arg0[var6];
        arg0[var6] = var8;
        method992(arg0, (byte) 36, var6 - 1, arg3, arg4);
        method992(arg0, (byte) 36, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public static void method993(int arg0) {
        if (arg0 == 0) {
            field3046 = null;
            field3050 = null;
            field3058 = null;
            field3051 = null;
        }
    }
}
