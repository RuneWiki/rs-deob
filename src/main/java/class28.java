import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class28 {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lli;")
    private static class185 field467 = class245.method1649("en", -98);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Lli;")
    private static class185 field463 = class245.method1649(")3fr", 126);

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lli;")
    private static class185 field469 = class245.method1649("German", -113);

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lli;")
    private static class185 field468 = class245.method1649("fr", 126);

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Lli;")
    private static class185 field465 = class245.method1649("English", -28);

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field475 = -1;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Lli;")
    private static class185 field477 = class245.method1649("French", -55);

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Lli;")
    private static class185 field478 = class245.method1649(")3de", 122);

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Lli;")
    private static class185 field481 = class245.method1649(")3en", -122);

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "Lli;")
    private static class185 field483 = class245.method1649(")3pt", 127);

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Lli;")
    private static class185 field474 = class245.method1649("pt", 122);

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lli;")
    private static class185 field476 = class245.method1649("Portuguese", -93);

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Lli;")
    private static class185 field485 = class245.method1649("de", 127);

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "[Lli;")
    private static class185[] field473 = new class185[] { field481, field478, field463, field483 };

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "[Lli;")
    public static class185[] field472 = new class185[] { field467, field485, field468, field474 };

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "[Lli;")
    private static class185[] field482 = new class185[] { field465, field469, field477, field476 };

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "[Ldd;")
    public static class211[] field471;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
    public abstract void method175(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)V")
    public abstract void method176(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIIIII)V")
    public static final void method177(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class198 var6 = class153.field2896[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class267 var7 = var6.field3648;
        if (var7 != null) {
            int var8 = var7.field4721;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class219 var10 = var6.field3633;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3990;
        int var12 = var10.field3992;
        int var13 = var10.field3991;
        int var14 = var10.field4001;
        int[] var15 = class202.field3703[var11];
        int[] var16 = class141.field2642[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lhi;B)V")
    public static final void method178(class250 arg0, byte arg1) {
        field470++;
        class44.field703 = arg0;
        if (arg1 != 47) {
            field485 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZZ)V")
    public static final void method179(boolean arg0, boolean arg1) {
        byte[][] var2 = class87.field1713;
        field484++;
        if (arg1) {
            method181(70);
        }
        int var3 = class149.field2815.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class141.field2640[var4] >> 8) * 64 - class77.field1339;
                int var7 = (class141.field2640[var4] & 0xFF) * 64 - class107.field1933;
                class125.method907((byte) -21);
                class144.method1035(var5, class165.field3090, arg0, arg1, var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILhi;I)Ldd;")
    public static final class211 method180(int arg0, class250 arg1, int arg2) {
        field479++;
        return class207.method1467(arg1, arg2, arg0) ? class58.method400(12101) : null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method181(int arg0) {
        field477 = null;
        if (arg0 < 41) {
            method181(-1);
        }
        field469 = null;
        field478 = null;
        field482 = null;
        field472 = null;
        field476 = null;
        field468 = null;
        field465 = null;
        field474 = null;
        field483 = null;
        field485 = null;
        field471 = null;
        field473 = null;
        field463 = null;
        field467 = null;
        field481 = null;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(III)V")
    public abstract void method182(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V")
    public class28(int arg0, int arg1, int arg2) {
        this.field466 = arg1;
        this.field480 = arg2;
        this.field464 = arg0;
    }
}
