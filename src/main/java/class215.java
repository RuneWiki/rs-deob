import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class215 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Loc;")
    private static class151 field3760 = class137.method873(2, "Prepared sound engine");

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Loc;")
    public static class151 field3759 = class137.method873(2, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Loc;")
    public static class151 field3763 = class137.method873(2, "<col=ffff00>");

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3761 = -1;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Loc;")
    public static class151 field3765 = class137.method873(2, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3766 = 0;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Loc;")
    public static class151 field3768 = field3760;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Loc;")
    public static class151 field3767 = null;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lsd;")
    public static class192 field3758;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lse;")
    public static class193 field3764;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1345(int arg0) {
        field3767 = null;
        field3765 = null;
        field3758 = null;
        if (arg0 > -2) {
            return;
        }
        field3760 = null;
        field3763 = null;
        field3768 = null;
        field3759 = null;
        field3764 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[II[II[Lad;)V")
    public static final void method1346(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, class5[] arg5) {
        if (arg4 <= 113) {
            method1346(-3, null, -61, null, 82, null);
        }
        if (arg0 < arg2) {
            int var6 = arg0 - 1;
            int var7 = (arg0 + arg2) / 2;
            class5 var8 = arg5[var7];
            int var9 = arg2 + 1;
            arg5[var7] = arg5[arg0];
            arg5[arg0] = var8;
            while (var9 > var6) {
                boolean var10 = true;
                do {
                    var9--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg3[var11] == 2) {
                            var12 = arg5[var9].field89;
                            var13 = var8.field89;
                        } else if (arg3[var11] == 1) {
                            var12 = arg5[var9].field88;
                            var13 = var8.field88;
                            if (var12 == -1 && arg1[var11] == 1) {
                                var12 = 2001;
                            }
                            if (var13 == -1 && arg1[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg3[var11] == 3) {
                            var12 = arg5[var9].field92 ? 1 : 0;
                            var13 = var8.field92 ? 1 : 0;
                        } else {
                            var13 = var8.field90;
                            var12 = arg5[var9].field90;
                        }
                        if (var12 != var13) {
                            if ((arg1[var11] != 1 || var12 <= var13) && (arg1[var11] != 0 || var12 >= var13)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var6++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg3[var15] == 2) {
                            var16 = arg5[var6].field89;
                            var17 = var8.field89;
                        } else if (arg3[var15] == 1) {
                            var17 = var8.field88;
                            if (var17 == -1 && arg1[var15] == 1) {
                                var17 = 2001;
                            }
                            var16 = arg5[var6].field88;
                            if (var16 == -1 && arg1[var15] == 1) {
                                var16 = 2001;
                            }
                        } else if (arg3[var15] == 3) {
                            var17 = var8.field92 ? 1 : 0;
                            var16 = arg5[var6].field92 ? 1 : 0;
                        } else {
                            var17 = var8.field90;
                            var16 = arg5[var6].field90;
                        }
                        if (var16 != var17) {
                            if ((arg1[var15] != 1 || var17 <= var16) && (arg1[var15] != 0 || var17 >= var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var6 < var9) {
                    class5 var18 = arg5[var6];
                    arg5[var6] = arg5[var9];
                    arg5[var9] = var18;
                }
            }
            method1346(arg0, arg1, var9, arg3, 115, arg5);
            method1346(var9 + 1, arg1, arg2, arg3, 118, arg5);
        }
        field3762++;
    }
}
