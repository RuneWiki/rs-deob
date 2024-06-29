import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class53 extends class435 {

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Ljava/lang/String;")
    public String field618;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "[[I")
    public static int[][] field616 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "Ljc;")
    public static class305 field613 = new class305("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "Loq;")
    public static class242 field622;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "F")
    public static float field619;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "Lla;")
    public static class316 field621;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static void method318(byte arg0) {
        field621 = null;
        field616 = null;
        field613 = null;
        if (arg0 > -120) {
            method318((byte) -26);
        }
        field622 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method319(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field617++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg7 - arg0;
        int var12 = arg3 - arg0;
        int var13 = arg7 * arg7;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        if (arg4 >= -83) {
            method318((byte) 7);
        }
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (arg5 >= class169.field2184 && class386.field5620 >= arg5) {
            int[] var39 = class5.field54[arg5];
            int var40 = class406.method2491(class307.field4111, false, class91.field1086, arg6 - arg7);
            int var41 = class406.method2491(class307.field4111, false, class91.field1086, arg6 + arg7);
            int var42 = class406.method2491(class307.field4111, false, class91.field1086, arg6 - var11);
            int var43 = class406.method2491(class307.field4111, false, class91.field1086, arg6 + var11);
            class476.method2907(var42, 42, arg2, var39, var40);
            class476.method2907(var43, 68, arg1, var39, var42);
            class476.method2907(var41, 61, arg2, var39, var43);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (var46 >= class169.field2184 && class386.field5620 >= var45) {
                int var47 = class406.method2491(class307.field4111, false, class91.field1086, arg6 + var8);
                int var48 = class406.method2491(class307.field4111, false, class91.field1086, arg6 - var8);
                if (var44) {
                    int var49 = class406.method2491(class307.field4111, false, class91.field1086, arg6 + var10);
                    int var50 = class406.method2491(class307.field4111, false, class91.field1086, arg6 - var10);
                    if (class169.field2184 <= var45) {
                        int[] var51 = class5.field54[var45];
                        class476.method2907(var50, 77, arg2, var51, var48);
                        class476.method2907(var49, 46, arg1, var51, var50);
                        class476.method2907(var47, 127, arg2, var51, var49);
                    }
                    if (class386.field5620 >= var46) {
                        int[] var52 = class5.field54[var46];
                        class476.method2907(var50, 66, arg2, var52, var48);
                        class476.method2907(var49, 123, arg1, var52, var50);
                        class476.method2907(var47, 118, arg2, var52, var49);
                    }
                } else {
                    if (class169.field2184 <= var45) {
                        class476.method2907(var47, 31, arg2, class5.field54[var45], var48);
                    }
                    if (class386.field5620 >= var46) {
                        class476.method2907(var47, 79, arg2, class5.field54[var46], var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class53() {
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class53(String arg0) {
        this.field618 = arg0;
    }

    static {
        new class305("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field622 = new class242("", 10);
    }
}
