import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class class140 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lte;")
    public class527 field1984;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Lh;")
    public static class572 field1986 = new class572("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Lbu;")
    public static class19 field1988 = new class19();

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 4)
    public static void method968(int arg0) {
        field1986 = null;
        int var1 = -116 / ((-arg0 - 44) / 55);
        field1988 = null;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lte;)V", line = 21)
    public class140(class527 arg0) {
        this.field1984 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII[I)V", line = 35)
    public static final void method969(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        arg0--;
        field1985++;
        int var13 = arg3 - 1;
        int var5 = var13 - 7;
        if (arg1 != 15888) {
            field1986 = null;
        }
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg4[var6] = arg2;
            int var7 = var6 + 1;
            arg4[var7] = arg2;
            int var8 = var7 + 1;
            arg4[var8] = arg2;
            int var9 = var8 + 1;
            arg4[var9] = arg2;
            int var10 = var9 + 1;
            arg4[var10] = arg2;
            int var11 = var10 + 1;
            arg4[var11] = arg2;
            int var12 = var11 + 1;
            arg4[var12] = arg2;
            arg0 = var12 + 1;
            arg4[arg0] = arg2;
        }
        while (var13 > arg0) {
            arg0++;
            arg4[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Z")
    public abstract boolean method149(int arg0);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZB)V")
    public abstract void method148(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V")
    public abstract void method145(int arg0, boolean arg1);

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
    public abstract void method143(int arg0);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
    public abstract void method144(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILjl;)V")
    public abstract void method146(int arg0, int arg1, class228 arg2);
}
