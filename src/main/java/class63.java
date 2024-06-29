import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class63 extends class272 {

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public static int field1100 = 0;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "Lgf;")
    public static class7 field1103 = new class7(50);

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field1106 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field1107 = 0;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        field1105++;
        if (arg1 != 4421) {
            field1100 = 30;
        }
        return class38.field598;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class63() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljd;I)V")
    public static final void method426(class118 arg0, int arg1) {
        if (arg1 != -14530) {
            field1107 = 68;
        }
        field1102++;
        while (true) {
            while (arg0.field2115.length > arg0.field2155) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method867(false) == 1) {
                    var3 = true;
                    var2 = arg0.method867(false);
                    var4 = arg0.method867(false);
                }
                int var5 = arg0.method867(false);
                int var6 = arg0.method867(false);
                int var7 = var5 * 64 - class252.field4481;
                int var8 = class125.field2246 + class264.field4679 - var6 * 64 - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && (var7 + 63) < class56.field971 && class125.field2246 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || (var2 * 8) <= var11 && var11 < var2 * 8 + 8 && var12 >= (var4 * 8) && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method838(1275919136);
                                if (var13 != 0) {
                                    if (class165.field3091[var9][var10] == null) {
                                        class165.field3091[var9][var10] = new byte[4096];
                                    }
                                    class165.field3091[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method838(1275919136);
                                    if (class199.field3662[var9][var10] == null) {
                                        class199.field3662[var9][var10] = new byte[4096];
                                    }
                                    class199.field3662[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method838(1275919136);
                        if (var16 != 0) {
                            arg0.field2155++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
    public static void method427(int arg0) {
        if (arg0 > 67) {
            field1103 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILhi;I)Lcg;")
    public static final class34 method428(int arg0, int arg1, class250 arg2, int arg3) {
        field1099++;
        if (class224.method1551(arg0, arg3, arg2, (byte) -94)) {
            return arg1 == -5387 ? class264.method1805(true) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
    public static final void method429(int arg0, int arg1) {
        if (arg0 != 13047) {
            field1106 = -105;
        }
        class109.field1964.method85((byte) 75, arg1);
        field1104++;
        class242.field4325.method85((byte) 75, arg1);
    }
}
