import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class121 {

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "[I")
    public static int[] field1696 = new int[14];

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Lkn;")
    public static class442 field1695 = new class442("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Laq;")
    public static class90 field1699 = new class90();

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "[Lba;")
    public static class218[] field1700;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZLnq;I)Lbr;", line = 4)
    public static final class223 method823(int arg0, boolean arg1, class268 arg2, int arg3) {
        field1693++;
        if (arg1) {
            method824((byte) 23);
        }
        byte[] var4 = arg2.method1745(arg0, (byte) -95, arg3);
        return var4 == null ? null : new class223(var4);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 21)
    public static final void method824(byte arg0) {
        if (class64.field949.method52()) {
            class263.method1720(true);
            class64.field949.method81(class304.field4191);
            class386.method2450((byte) -24);
        } else {
            class412.method2588(class326.field4462, 96);
        }
        field1692++;
        int var1 = 68 % ((arg0 + 83) / 38);
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V", line = 40)
    public static final void method825(byte arg0) {
        if (arg0 != -110) {
            method824((byte) -34);
        }
        for (int var1 = 0; var1 < class125.field1758; var1++) {
            int var2 = class135.field1967[var1];
            class198 var3 = class98.field1358[var2];
            if (var3 != null) {
                class260.method1709(var3.field2737.field4488, var3, -60);
            }
        }
        field1698++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)I", line = 70)
    public static final int method826(boolean arg0) {
        field1694++;
        if (arg0) {
            return 29;
        } else {
            class131 var1 = class206.field2830;
            synchronized (class206.field2830) {
                return class206.field2830.method909(-118);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 86)
    public static void method827(int arg0) {
        field1696 = null;
        field1699 = null;
        int var1 = 63 % ((10 - arg0) / 38);
        field1695 = null;
        field1700 = null;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 107)
    public static final void method828(int arg0) {
        if (arg0 != 360) {
            method826(false);
        }
        field1697++;
        class131 var1 = class99.field1365;
        synchronized (class99.field1365) {
            class99.field1365.method905((byte) 15);
        }
    }
}
