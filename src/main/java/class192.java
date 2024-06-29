import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class192 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field3366 = 0;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Z")
    public static boolean field3371 = true;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field3370 = 0;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lqj;")
    public static class196 field3368 = class80.method502("blinken2:", -48);

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lqj;")
    public static class196 field3373 = class80.method502("b12_full", -48);

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Z")
    public static boolean field3378 = false;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lnb;")
    public static class95 field3377;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZ)V")
    public static final void method1268(boolean arg0, boolean arg1) {
        if (!arg0) {
            method1270((byte) -71, -11);
        }
        field3374++;
        byte var2 = 4;
        byte[][] var3 = class214.field3825;
        for (int var4 = 0; var4 < var2; var4++) {
            class181.method1187((byte) 113);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class13.field147[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class181.field3191.length; var13++) {
                                if (class181.field3191[var13] == var12 && var3[var13] != null) {
                                    class27.method151(var3[var13], var5 * 8, var8, (var11 & 0x7) * 8, var9, (var10 & 0x7) * 8, var6 * 8, class188.field3298, var4, arg1, false);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method1269(byte arg0) {
        field3368 = null;
        field3373 = null;
        if (arg0 <= 104) {
            field3372 = -15;
        }
        field3377 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Z")
    public static final boolean method1270(byte arg0, int arg1) {
        field3367++;
        if (arg0 == -20) {
            return (arg1 >> 29 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3376++;
        if (arg1 >= class188.field3296 && arg1 <= class95.field1388) {
            int var5 = class186.method1217(class93.field1361, class23.field291, arg4, arg0 ^ 0x4773);
            int var6 = class186.method1217(class93.field1361, class23.field291, arg3, 18291);
            class31.method167(var5, var6, arg0 ^ 0xFFFFFFB2, arg1, arg2);
        }
        if (arg0 != 0) {
            field3371 = true;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(BI)V")
    public static final void method1272(byte arg0, int arg1) {
        class66.field933.method130(68, arg1);
        if (arg0 == -23) {
            field3369++;
        }
    }
}
