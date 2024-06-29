import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class205 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Lvh;")
    public static class328 field3010 = new class328(32);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public int field3008;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public int field3011;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public int field3012;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public int field3013;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public int field3019;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public int field3027;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    public int field3029;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    public int field3030;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "Loaa;")
    public static class260 field3023;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "[[I")
    public static int[][] field3022;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1360(boolean arg0) {
        if (!arg0) {
            field3023 = null;
            field3010 = null;
            field3022 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BIII)I", line = 21)
    public static final int method1361(byte arg0, int arg1, int arg2, int arg3) {
        field3014++;
        if (arg0 != -117) {
            field3022 = null;
        }
        int var4 = arg3 / arg1;
        int var5 = arg1 - 1 & arg3;
        int var6 = arg2 / arg1;
        int var7 = arg2 & arg1 - 1;
        int var8 = class652.method3625(-1, var6, var4);
        int var9 = class652.method3625(-1, var6, var4 + 1);
        int var10 = class652.method3625(-1, var6 + 1, var4);
        int var11 = class652.method3625(-1, var6 + 1, var4 + 1);
        int var12 = class628.method3492(var5, false, arg1, var9, var8);
        int var13 = class628.method3492(var5, false, arg1, var11, var10);
        return class628.method3492(var7, false, arg1, var13, var12);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IILpj;I)Lmj;", line = 53)
    public static final class599 method1362(int arg0, int arg1, class132 arg2, int arg3) {
        if (arg0 != 22121) {
            field3023 = null;
        }
        field3031++;
        byte[] var4 = arg2.method940(arg3, arg1, 0);
        return var4 == null ? null : new class599(var4);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZ)V", line = 81)
    public static final void method1363(boolean arg0, boolean arg1) {
        if (arg0) {
            if (class677.field9551 != -1) {
                class78.method611(class677.field9551, -18954);
            }
            for (class198 var2 = (class198) class368.field5262.method2066(false); var2 != null; var2 = (class198) class368.field5262.method2062(-19704)) {
                if (!var2.method2972(1)) {
                    var2 = (class198) class368.field5262.method2066(arg1);
                    if (var2 == null) {
                        break;
                    }
                }
                class258.method1594(false, -118, true, var2);
            }
            class677.field9551 = -1;
            class368.field5262 = new class346(8);
            class561.method3109((byte) -120);
            class677.field9551 = class21.field291;
            class22.method112(false, 29);
            class336.method2026(100);
            class523.method2894(class677.field9551);
        }
        if (arg1) {
            field3010 = null;
        }
        field3026++;
        class302.field4467 = true;
    }
}
