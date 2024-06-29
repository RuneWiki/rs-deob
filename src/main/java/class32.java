import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class32 {

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field598 = -1;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
    public static int[] field599 = new int[1000];

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lha;")
    public static class46 field602 = class271.method1828("<col=00ff80>", -46);

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field601 = 0;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lij;")
    public static class242 field600 = new class242();

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lha;")
    public static class46 field605 = class271.method1828("Ladevorgang )2 bitte warten Sie)3", -46);

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lha;")
    public static class46 field606 = null;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lpi;")
    public static class181 field604;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Lkg;")
    public static class21 field603;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIZIII)V")
    public static final void method210(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field596++;
        int var6 = arg0 - arg5;
        int var7 = arg3 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class102.method774(arg1, arg4, arg0, 1, arg5);
            }
        } else if (var6 == 0) {
            class264.method1778(arg4, arg3, arg1, 1878, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg4;
                arg4 = arg5;
                arg5 = var9;
                int var10 = arg3;
                arg3 = arg0;
                arg0 = var10;
            }
            if (!arg2) {
                if (arg4 > arg3) {
                    int var11 = arg4;
                    int var12 = arg5;
                    arg5 = arg0;
                    arg0 = var12;
                    arg4 = arg3;
                    arg3 = var11;
                }
                int var13 = arg5;
                int var14 = arg0 - arg5;
                if (var14 < 0) {
                    var14 = -var14;
                }
                int var15 = arg3 - arg4;
                int var16 = arg5 >= arg0 ? -1 : 1;
                int var17 = -(var15 >> 1);
                if (var8) {
                    for (int var18 = arg4; var18 <= arg3; var18++) {
                        class6.field100[var18][var13] = arg1;
                        var17 += var14;
                        if (var17 > 0) {
                            var17 -= var15;
                            var13 += var16;
                        }
                    }
                } else {
                    for (int var19 = arg4; var19 <= arg3; var19++) {
                        var17 += var14;
                        class6.field100[var13][var19] = arg1;
                        if (var17 > 0) {
                            var13 += var16;
                            var17 -= var15;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public static final void method211(int arg0, int arg1, int arg2) {
        field595++;
        if (arg2 != 31083) {
            method212(33, -91, -107, -118, 36, true, -48, -20, -57);
        }
        if (class175.method1259(arg1, (byte) 68)) {
            class272.method1833(class215.field3809[arg1], arg0, false);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIZIII)V")
    public static final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (!arg5) {
            method210(6, 122, false, -38, -35, 50);
        }
        int var9 = arg6 - arg1;
        int var10 = (arg3 - arg4 << 16) / var9;
        field597++;
        int var11 = arg0 - arg2;
        int var12 = (arg7 - arg8 << 16) / var11;
        class225.method1540(arg8, (byte) 89, arg0, arg4, arg1, var10, arg2, 0, var12, 0, arg6);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method213(int arg0) {
        field603 = null;
        if (arg0 != -21901) {
            return;
        }
        field600 = null;
        field599 = null;
        field606 = null;
        field602 = null;
        field604 = null;
        field605 = null;
    }
}
