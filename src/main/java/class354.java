import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class354 {

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Llaa;")
    private class101 field4637 = new class101();

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Lcea;")
    public static class180 field4640 = new class180("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lcea;")
    public static class180 field4641 = new class180("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field4642 = 0;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Llaa;")
    private class101 field4638;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 9)
    public final void method1985(int arg0) {
        while (true) {
            class101 var2 = this.field4637.field1249;
            if (this.field4637 == var2) {
                if (arg0 != 0) {
                    this.method1987(true);
                }
                field4635++;
                this.field4638 = null;
                return;
            }
            var2.method610((byte) -80);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILg;)I", line = 36)
    public static final int method1986(int arg0, class135 arg1) {
        if (arg0 > -56) {
            field4640 = null;
        }
        field4639++;
        if (class147.field1765 == arg1) {
            return 6407;
        } else if (class10.field80 == arg1) {
            return 6408;
        } else if (class37.field293 == arg1) {
            return 6406;
        } else if (class638.field9183 == arg1) {
            return 6409;
        } else if (class127.field1570 == arg1) {
            return 6410;
        } else if (class101.field1252 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)Llaa;", line = 71)
    public final class101 method1987(boolean arg0) {
        field4636++;
        class101 var2 = this.field4637.field1249;
        if (this.field4637 == var2) {
            this.field4638 = null;
            return null;
        } else {
            this.field4638 = var2.field1249;
            return arg0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Llaa;", line = 91)
    public final class101 method1988(byte arg0) {
        field4631++;
        class101 var2 = this.field4637.field1249;
        if (this.field4637 == var2) {
            return null;
        }
        var2.method610((byte) -90);
        if (arg0 != -46) {
            field4641 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)Z", line = 108)
    public final boolean method1989(byte arg0) {
        if (arg0 != 93) {
            field4640 = null;
        }
        field4628++;
        return this.field4637.field1249 == this.field4637;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLet;)V", line = 119)
    public static final void method1990(byte arg0, class509 arg1) {
        field4633++;
        if (!class449.field6225) {
            return;
        }
        if (arg1.field7109 != null) {
            class509 var2 = class369.method2071(class588.field8538, class592.field8606, -20190);
            if (var2 != null) {
                class503 var3 = new class503();
                var3.field6983 = var2;
                var3.field6973 = arg1;
                var3.field6975 = arg1.field7109;
                class630.method3608(var3);
            }
        }
        if (arg0 != 4) {
            return;
        }
        class377.field5019++;
        class418.method2378(arg0 ^ 0x4644, class636.field9142);
        class136.field1663.method2131(arg1.field7045, -1495157560);
        class136.field1663.method2115(class110.field1361, 3324);
        class136.field1663.method2115(class592.field8606, 3324);
        class136.field1663.method2111((byte) -62, class588.field8538);
        class136.field1663.method2101(false, arg1.field7082);
        class136.field1663.method2101(false, arg1.field7086);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Llaa;I)V", line = 160)
    public final void method1991(class101 arg0, int arg1) {
        field4632++;
        if (arg0.field1253 != null) {
            arg0.method610((byte) -108);
        }
        int var3 = -98 / ((-arg1 - 33) / 32);
        arg0.field1253 = this.field4637.field1253;
        arg0.field1249 = this.field4637;
        arg0.field1253.field1249 = arg0;
        arg0.field1249.field1253 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 181)
    public static void method1992(int arg0) {
        if (arg0 != 5743) {
            method1992(-7);
        }
        field4640 = null;
        field4641 = null;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)I", line = 193)
    public final int method1993(int arg0) {
        field4629++;
        int var2 = 0;
        class101 var3 = this.field4637.field1249;
        while (this.field4637 != var3) {
            var3 = var3.field1249;
            var2++;
        }
        int var4 = -88 % ((arg0 + 29) / 49);
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 273)
    public class354() {
        this.field4637.field1249 = this.field4637;
        this.field4637.field1253 = this.field4637;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)Llaa;", line = 220)
    public final class101 method1994(int arg0) {
        field4630++;
        if (arg0 != 6408) {
            return null;
        }
        class101 var2 = this.field4638;
        if (this.field4637 == var2) {
            this.field4638 = null;
            return null;
        } else {
            this.field4638 = var2.field1249;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)Llaa;", line = 242)
    public final class101 method1995(int arg0) {
        field4634++;
        if (arg0 != 0) {
            return null;
        }
        class101 var2 = this.field4637.field1253;
        if (this.field4637 == var2) {
            this.field4638 = null;
            return null;
        } else {
            this.field4638 = var2.field1253;
            return var2;
        }
    }
}
