import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class class11 {

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "Lka;")
    public static class473 field127;

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "Lkc;")
    public static class157 field128;

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)V")
    public abstract void method71(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V")
    public static void method72(int arg0) {
        field128 = null;
        field127 = null;
        if (arg0 != 2) {
            method80(5);
        }
    }

    @OriginalMember(owner = "client!ya", name = "ba", descriptor = "(Li;IIIIZ)V")
    public abstract void method73(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Li;IIIIZ)Z")
    public abstract boolean method74(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lsa;[I)V")
    public abstract void method75(class447 arg0, int[] arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method76(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!ya", name = "qa", descriptor = "(III)V")
    public abstract void method77(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method78(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ya", name = "ca", descriptor = "(II)I")
    public abstract int method79(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
    public static final void method80(int arg0) {
        if (arg0 != 2) {
            method72(-55);
        }
        field123++;
        if (class494.field7155 == 8) {
            class63.method421(4, true);
        } else if (class494.field7155 == 4 || class494.field7155 == 5) {
            class63.method421(2, true);
        } else if (class494.field7155 == 11) {
            class63.method421(2, true);
            return;
        }
    }

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "()V")
    public abstract void method81();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method82(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(Li;IIIIZ)V")
    public abstract void method84(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "ua", descriptor = "(II)I")
    public abstract int method85(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IILi;)Li;")
    public abstract class197 method86(int arg0, int arg1, class197 arg2);

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(III)V")
    public class11(int arg0, int arg1, int arg2) {
        this.field124 = arg1;
        while (arg2 > 1) {
            this.field126++;
            arg2 >>= 0x1;
        }
        this.field125 = arg0;
        this.field121 = 0x1 << this.field126;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(FFZF)I")
    public static final int method87(float arg0, float arg1, boolean arg2, float arg3) {
        field122++;
        float var4 = (arg3 < 0.0F) ? -arg3 : arg3;
        float var5 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (arg2) {
            return 4;
        } else if (var5 > var4 && var5 > var6) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return arg0 > 0.0F ? 2 : 3;
        } else if (arg3 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    static {
        new class157("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
        field127 = new class473(32);
        field128 = new class157("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");
    }
}
