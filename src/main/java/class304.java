import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class304 extends class447 {

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "Lnn;")
    public static class151 field4591 = new class151("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "Lpf;")
    public static class425 field4596 = new class425(22, -1);

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "Ldp;")
    public class304 field4597;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "Ldp;")
    public class304 field4598;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "[Lkr;")
    public static class234[] field4590;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)I")
    public static final int method1866(int arg0, int arg1) {
        field4589++;
        return arg1 <= 100 ? -39 : arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIILje;)V")
    public static final void method1867(int arg0, int arg1, int arg2, class169 arg3) {
        if (arg3.field1955 == arg2 && arg2 != -1) {
            class379 var4 = class98.method629(arg2, (byte) -115);
            int var5 = var4.field5531;
            if (var5 == 1) {
                arg3.field1948 = 0;
                arg3.field1941 = 1;
                arg3.field1962 = 0;
                arg3.field1928 = 0;
                arg3.field1935 = arg1;
                class251.method1528(class113.field1500 == arg3, arg3.field1928, arg3.field1892, arg3.field1900, var4, arg3.field1902, (byte) -118);
            }
            if (var5 == 2) {
                arg3.field1948 = 0;
            }
        } else if (arg2 == -1 || arg3.field1955 == -1 || class98.method629(arg2, (byte) -115).field5536 >= class98.method629(arg3.field1955, (byte) -115).field5536) {
            arg3.field1941 = 1;
            arg3.field2014 = arg3.field2013;
            arg3.field1955 = arg2;
            arg3.field1935 = arg1;
            arg3.field1928 = 0;
            arg3.field1948 = 0;
            arg3.field1962 = 0;
            if (arg3.field1955 != -1) {
                class251.method1528(class113.field1500 == arg3, arg3.field1928, arg3.field1892, arg3.field1900, class98.method629(arg3.field1955, (byte) -115), arg3.field1902, (byte) -118);
            }
        }
        field4592++;
        if (arg0 < 68) {
            field4591 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V")
    public static final void method1868(int arg0) {
        field4595++;
        if (arg0 >= class121.field1593) {
            class271.field4157 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class314.field4766.length; var2++) {
            if (class314.field4766[var2].startsWith("--> ")) {
                var1++;
                if (class121.field1593 == var1) {
                    class271.field4157 = class314.field4766[var2].substring(4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZI)V")
    public static final void method1869(boolean arg0, int arg1) {
        if (arg0) {
            field4590 = null;
        }
        class17.field231 = new class241(arg1);
        field4588++;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Liq;I)V")
    public static final void method1870(class134 arg0, int arg1) {
        class43.field543 = arg0;
        field4593++;
        if (arg1 != -1786) {
            field4591 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)V")
    public static void method1871(int arg0) {
        if (arg0 <= 76) {
            method1866(-99, -122);
        }
        field4590 = null;
        field4591 = null;
        field4596 = null;
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)V")
    public final void method1872(byte arg0) {
        field4594++;
        if (this.field4598 == null) {
            return;
        }
        if (arg0 >= -20) {
            method1868(-49);
        }
        this.field4598.field4597 = this.field4597;
        this.field4597.field4598 = this.field4598;
        this.field4597 = null;
        this.field4598 = null;
    }
}
