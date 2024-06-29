import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class331 {

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public int field4760 = -1;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
    public int field4764 = -1;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "Lea;")
    public static class474 field4759 = new class474("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "Lea;")
    public static class474 field4761 = new class474("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "Lig;")
    public static class206 field4765 = new class206(114, 8);

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    public static int field4767 = -1;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "Los;")
    public static class379 field4766 = new class379();

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "[I")
    public int[] field4763;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method2155(int arg0, int arg1, int arg2, Class arg3) {
        class99 var4 = class431.field6408[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class104 var5 = var4.field1167; var5 != null; var5 = var5.field1251) {
            class144 var6 = var5.field1253;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1773 == arg1 && var6.field1758 == arg2) {
                class290.method1877(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lrt;I)V")
    public final void method2156(class194 arg0, int arg1) {
        if (arg1 != -15143) {
            field4761 = null;
        }
        while (true) {
            int var3 = arg0.method1177(255);
            if (var3 == 0) {
                field4762++;
                return;
            }
            this.method2157((byte) -126, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BILrt;)V")
    private final void method2157(byte arg0, int arg1, class194 arg2) {
        if (arg0 > -15) {
            this.method2157((byte) 126, 87, null);
        }
        field4758++;
        if (arg1 == 1) {
            this.field4764 = arg2.method1220(-99);
        } else if (arg1 == 2) {
            this.field4763 = new int[arg2.method1177(255)];
            for (int var4 = 0; var4 < this.field4763.length; var4++) {
                this.field4763[var4] = arg2.method1220(116);
            }
        } else if (arg1 == 3) {
            this.field4760 = arg2.method1177(255);
            return;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
    public static void method2158(byte arg0) {
        field4766 = null;
        field4765 = null;
        field4759 = null;
        if (arg0 > -84) {
            method2155(-57, -15, 8, null);
        }
        field4761 = null;
    }
}
