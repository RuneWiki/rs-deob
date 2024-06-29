import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class53 {

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[Z")
    public static boolean[] field665;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lvq;")
    public static class24 field661;

    static {
        new class409("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field665 = new boolean[200];
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[[I)V", line = 3)
    public static final void method406(int arg0, int[][] arg1) {
        field664++;
        if (arg0 == -13) {
            class323.field4774 = arg1;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 18)
    public static void method409(int arg0) {
        field665 = null;
        if (arg0 != -2734) {
            method406(59, (int[][]) null);
        }
        field661 = null;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)Z", line = 42)
    public final boolean method413(int arg0) {
        field663++;
        if (arg0 == -1) {
            return this.method407((byte) -126) || this.method408(-79) || this.method412(-13);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lgt;Z)V", line = 53)
    public static final void method414(class341 arg0, boolean arg1) {
        field662++;
        class101 var2 = null;
        try {
            class350 var3 = arg0.method2217(-124);
            while (var3.field5134 == 0) {
                class418.method2587(!arg1, 1L);
            }
            if (var3.field5134 == 1) {
                var2 = (class101) var3.field5129;
                class256 var4 = client.method1804(true);
                var2.method684(0, var4.field3762, 34, var4.field3764);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method681((byte) 65);
            }
        } catch (Exception var5) {
        }
        if (!arg1) {
            method417((byte) 34, 109, 117, -38, -101);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BIIII)I", line = 95)
    public static final int method417(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field660++;
        int var5 = arg2 & 0xF;
        int var6 = 29 / ((arg0 + 62) / 39);
        int var7 = var5 >= 8 ? arg1 : arg3;
        int var8 = var5 < 4 ? arg1 : (var5 == 12 || var5 == 14 ? arg3 : arg4);
        return ((var5 & 0x2) == 0 ? var8 : -var8) + ((var5 & 0x1) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Z")
    public abstract boolean method407(byte arg0);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Z")
    public abstract boolean method408(int arg0);

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
    public abstract void method410(int arg0);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)I")
    public abstract int method411(int arg0);

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)Z")
    public abstract boolean method412(int arg0);

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(I)I")
    public abstract int method415(int arg0);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public abstract void method416(byte arg0);

    @OriginalMember(owner = "client!na", name = "h", descriptor = "(I)Lrb;")
    public abstract class436 method418(int arg0);
}
