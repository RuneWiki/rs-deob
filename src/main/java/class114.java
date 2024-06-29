import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class114 {

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "Luj;")
    public class324 field1413 = new class324();

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "Lkca;")
    public static class73 field1414 = new class73(60, 7);

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "J")
    public static long field1426 = 20000000L;

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "Z")
    public static boolean field1429 = false;

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "[I")
    public static int[] field1432 = new int[14];

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!eea", name = "r", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "Luj;")
    private class324 field1425;

    @OriginalMember(owner = "client!eea", name = "t", descriptor = "Ljava/awt/Frame;")
    public static Frame field1430;

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "[[Lqf;")
    public static class593[][] field1431;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Luj;Z)V")
    public final void method706(class324 arg0, boolean arg1) {
        if (arg0.field4677 != null) {
            arg0.method2108(true);
        }
        if (!arg1) {
            return;
        }
        field1415++;
        arg0.field4677 = this.field1413.field4677;
        arg0.field4681 = this.field1413;
        arg0.field4677.field4681 = arg0;
        arg0.field4681.field4677 = arg0;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)I")
    public final int method707(byte arg0) {
        if (arg0 != -106) {
            field1430 = null;
        }
        field1417++;
        int var2 = 0;
        for (class324 var3 = this.field1413.field4681; var3 != this.field1413; var3 = var3.field4681) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V")
    public static void method708(int arg0) {
        field1431 = null;
        if (arg0 == -27281) {
            field1432 = null;
            field1414 = null;
            field1430 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Luj;ZLeea;)V")
    private final void method709(class324 arg0, boolean arg1, class114 arg2) {
        if (arg1) {
            method717((byte) -92, -55);
        }
        field1421++;
        class324 var4 = this.field1413.field4677;
        this.field1413.field4677 = arg0.field4677;
        arg0.field4677.field4681 = this.field1413;
        if (this.field1413 != arg0) {
            arg0.field4677 = arg2.field1413.field4677;
            arg0.field4677.field4681 = arg0;
            var4.field4681 = arg2.field1413;
            arg2.field1413.field4677 = var4;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Luj;I)V")
    public final void method710(class324 arg0, int arg1) {
        field1420++;
        if (arg0.field4677 != null) {
            arg0.method2108(true);
        }
        arg0.field4681 = this.field1413.field4681;
        arg0.field4677 = this.field1413;
        arg0.field4677.field4681 = arg0;
        arg0.field4681.field4677 = arg0;
        if (arg1 != 60) {
            this.field1413 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)Luj;")
    public final class324 method711(int arg0) {
        field1416++;
        if (arg0 != -31729) {
            return null;
        }
        class324 var2 = this.field1413.field4677;
        if (this.field1413 == var2) {
            this.field1425 = null;
            return null;
        } else {
            this.field1425 = var2.field4677;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)Luj;")
    public final class324 method712(byte arg0) {
        field1428++;
        class324 var2 = this.field1425;
        if (this.field1413 == var2) {
            this.field1425 = null;
            return null;
        } else {
            this.field1425 = var2.field4677;
            return arg0 > -110 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Leea;B)V")
    public final void method713(class114 arg0, byte arg1) {
        field1418++;
        this.method709(this.field1413.field4681, false, arg0);
        if (arg1 != 123) {
            field1430 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)Luj;")
    public final class324 method714(boolean arg0) {
        field1422++;
        class324 var2 = this.field1413.field4681;
        if (this.field1413 == var2) {
            return null;
        } else {
            var2.method2108(arg0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(Z)Z")
    public final boolean method715(boolean arg0) {
        if (!arg0) {
            this.method706(null, false);
        }
        field1411++;
        return this.field1413.field4681 == this.field1413;
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(I)Luj;")
    public final class324 method716(int arg0) {
        field1419++;
        if (arg0 != 14) {
            return null;
        }
        class324 var2 = this.field1425;
        if (this.field1413 == var2) {
            this.field1425 = null;
            return null;
        } else {
            this.field1425 = var2.field4681;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BI)I")
    public static final int method717(byte arg0, int arg1) {
        field1423++;
        if (arg0 < 25) {
            field1430 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "(I)V")
    public final void method718(int arg0) {
        field1412++;
        if (arg0 > -106) {
            return;
        }
        while (true) {
            class324 var2 = this.field1413.field4681;
            if (this.field1413 == var2) {
                this.field1425 = null;
                return;
            }
            var2.method2108(true);
        }
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(Z)Luj;")
    public final class324 method719(boolean arg0) {
        if (arg0) {
            this.method710(null, 92);
        }
        field1427++;
        class324 var2 = this.field1413.field4681;
        if (this.field1413 == var2) {
            this.field1425 = null;
            return null;
        } else {
            this.field1425 = var2.field4681;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "()V")
    public class114() {
        this.field1413.field4681 = this.field1413;
        this.field1413.field4677 = this.field1413;
    }
}
