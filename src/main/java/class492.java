import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class492 {

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public int field6961;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public int field6962;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public int field6963;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public int field6957;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "Lkn;")
    public static class530 field6964 = new class530("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field6965 = 0;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Loi;")
    public static class53 field6958;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "[I")
    public static int[] field6966;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 12)
    public static void method2858(byte arg0) {
        if (arg0 == 113) {
            field6958 = null;
            field6966 = null;
            field6964 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)Lvm;", line = 25)
    public final class492 method2859(int arg0, int arg1) {
        if (arg1 != 0) {
            field6964 = null;
        }
        field6959++;
        return new class492(this.field6963, arg0, this.field6957, this.field6961);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIBI)V", line = 37)
    public static final void method2860(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg4 <= arg2) {
            for (int var5 = arg4; var5 < arg2; var5++) {
                class112.field1523[var5][arg1] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg4; var6++) {
                class112.field1523[var6][arg1] = arg0;
            }
        }
        if (arg3 > -82) {
            field6958 = null;
        }
        field6960++;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(IIII)V", line = 74)
    public class492(int arg0, int arg1, int arg2, int arg3) {
        this.field6961 = arg3;
        this.field6962 = arg1;
        this.field6963 = arg0;
        this.field6957 = arg2;
    }
}
