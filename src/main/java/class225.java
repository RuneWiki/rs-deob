import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class225 implements class512 {

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[F")
    public float[] field3312;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public int field3307;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
    public static int[] field3309 = new int[25];

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[F")
    public static float[] field3311 = new float[16];

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "F")
    public static float field3313;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method1519(int arg0) {
        field3309 = null;
        field3311 = null;
        if (arg0 != 25) {
            field3311 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lvs;II)V")
    public static final void method1520(class593[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class593 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field8425;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field8425 < (var7 & 0x1) + var6) {
                class593 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1520(arg0, arg1, var4 - 1);
        method1520(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static final void method1521(int arg0) {
        if (arg0 != 32259) {
            field3311 = null;
        }
        field3310++;
        if (class711.field10023.toLowerCase().indexOf("microsoft") != -1) {
            class427.field6336[189] = 26;
            class427.field6336[190] = 72;
            class427.field6336[219] = 42;
            class427.field6336[221] = 43;
            class427.field6336[191] = 73;
            class427.field6336[187] = 27;
            class427.field6336[223] = 28;
            class427.field6336[188] = 71;
            class427.field6336[192] = 58;
            class427.field6336[220] = 74;
            class427.field6336[186] = 57;
            class427.field6336[222] = 59;
            return;
        }
        class427.field6336[91] = 42;
        if (class711.field10017 == null) {
            class427.field6336[222] = 59;
            class427.field6336[192] = 58;
        } else {
            class427.field6336[222] = 58;
            class427.field6336[192] = 28;
            class427.field6336[520] = 59;
        }
        class427.field6336[93] = 43;
        class427.field6336[92] = 74;
        class427.field6336[46] = 72;
        class427.field6336[47] = 73;
        class427.field6336[59] = 57;
        class427.field6336[45] = 26;
        class427.field6336[44] = 71;
        class427.field6336[61] = 27;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(II)V")
    public class225(int arg0, int arg1) {
        this.field3312 = new float[arg0 * arg1];
        this.field3307 = arg1;
        this.field3308 = arg0;
    }
}
