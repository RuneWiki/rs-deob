import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class175 extends class57 {

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field3280 = 0;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "[Lo;")
    public static class148[] field3284 = new class148[4];

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Lvd;")
    public static class222 field3283 = class212.method1357("::autoshadow on", 10731);

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Lvd;")
    private static class222 field3288 = class212.method1357("Choose Option", 10731);

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lvd;")
    public static class222 field3282 = field3288;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "[I")
    public static int[] field3281;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([BBII)I")
    public static final int method1104(byte[] arg0, byte arg1, int arg2, int arg3) {
        int var4 = -1;
        field3286++;
        if (arg1 != -76) {
            field3288 = null;
        }
        for (int var5 = arg3; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class36.field778[(var4 ^ arg0[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
    public static final int method1105(int arg0, int arg1) {
        field3290++;
        int var8 = arg0 - 1;
        int var2 = 2 % ((-arg1 - 45) / 34);
        int var3 = var8 | var8 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static void method1106(boolean arg0) {
        if (!arg0) {
            method1104(null, (byte) 114, 58, -99);
        }
        field3283 = null;
        field3281 = null;
        field3284 = null;
        field3282 = null;
        field3288 = null;
    }
}
