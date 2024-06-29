import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class85 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lce;")
    public static class126 field1345 = null;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1355 = 0;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1347 = -1;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "[Lcj;")
    public static class301[] field1352 = new class301[2048];

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lce;")
    public static class126 field1356 = class206.method1445(-7923, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lce;")
    public static class126 field1358 = class206.method1445(-7923, "<col=c0ff00>");

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lhl;")
    public class220 field1346;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[I")
    public int[] field1351;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "[[[B")
    public static byte[][][] field1353;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBIII)V", line = 5)
    public static final void method593(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1354++;
        if (arg1 != 17) {
            return;
        }
        if (arg2 > arg3) {
            class94.method647(class314.field5393[arg4], arg3, -7, arg2, arg0);
        } else {
            class94.method647(class314.field5393[arg4], arg2, -7, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIII)Z", line = 30)
    public static final boolean method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 59)
    public static void method595(int arg0) {
        field1345 = null;
        field1353 = (byte[][][]) null;
        field1358 = null;
        if (arg0 > -13) {
            field1355 = 103;
        }
        field1352 = null;
        field1356 = null;
    }
}
