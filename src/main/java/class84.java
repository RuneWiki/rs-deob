import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class84 {

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lp;")
    private class292 field1387 = new class292();

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field1390 = 0;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lp;")
    private class292 field1391;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lf;BI)Lli;")
    public static final class297 method679(class37 arg0, byte arg1, int arg2) {
        field1383++;
        class297 var3 = new class297(arg2, arg0.method331(16312), arg0.method331(16312), arg0.method307(-99), arg0.method307(arg1 ^ 0x52), arg0.method333((byte) -59) == 1, arg0.method333((byte) -59));
        if (arg1 != -21) {
            field1385 = -105;
        }
        int var4 = arg0.method333((byte) -59);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field4683.method1013(312991604, new class244(arg0.method333((byte) -59), arg0.method333((byte) -59), arg0.method293(-20), arg0.method293(89), arg0.method293(1), arg0.method293(-47), arg0.method293(-97), arg0.method293(-48), arg0.method293(-89), arg0.method293(98)));
        }
        var3.method1989(66);
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Lp;")
    public final class292 method680(int arg0) {
        field1378++;
        int var2 = 93 / ((arg0 - 55) / 49);
        class292 var3 = this.field1391;
        if (this.field1387 == var3) {
            this.field1391 = null;
            return null;
        } else {
            this.field1391 = var3.field4599;
            return var3;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)Lp;")
    public final class292 method681(int arg0) {
        if (arg0 != 2) {
            field1390 = 104;
        }
        field1386++;
        class292 var2 = this.field1387.field4599;
        if (this.field1387 == var2) {
            this.field1391 = null;
            return null;
        } else {
            this.field1391 = var2.field4599;
            return var2;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)I")
    public final int method682(byte arg0) {
        field1388++;
        int var2 = 0;
        class292 var3 = this.field1387.field4599;
        if (arg0 != 64) {
            return -101;
        }
        while (this.field1387 != var3) {
            var2++;
            var3 = var3.field4599;
        }
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lp;I)V")
    public final void method683(class292 arg0, int arg1) {
        if (arg0.field4596 != null) {
            arg0.method1964(12213);
        }
        if (arg1 <= 109) {
            method687(-124, (class176) null);
        }
        field1379++;
        arg0.field4599 = this.field1387;
        arg0.field4596 = this.field1387.field4596;
        arg0.field4596.field4599 = arg0;
        arg0.field4599.field4596 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public final void method684(int arg0) {
        while (true) {
            class292 var2 = this.field1387.field4599;
            if (this.field1387 == var2) {
                field1382++;
                this.field1391 = null;
                if (arg0 < 121) {
                    field1390 = 46;
                    return;
                }
                return;
            }
            var2.method1964(12213);
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)Lp;")
    public final class292 method685(int arg0) {
        field1380++;
        class292 var2 = this.field1387.field4599;
        if (this.field1387 == var2) {
            return null;
        }
        var2.method1964(arg0 ^ 0x2FB5);
        if (arg0 != 0) {
            this.field1391 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)I")
    public static final int method686(byte arg0, int arg1) {
        field1381++;
        return arg0 <= 77 ? 46 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILuf;)V")
    public static final void method687(int arg0, class176 arg1) {
        field1384++;
        if (class245.field3801) {
            return;
        }
        class201.method1339();
        class264.field4163 = class156.method1047(arg1, -116, class45.field718);
        int var2 = class277.field4369;
        int var3 = var2 * 956 / arg0;
        class264.field4163.method39((class35.field573 - var3) / 2, 0, var3, var2);
        class83.field1370 = class70.method546(class255.field3910, arg1, arg0 ^ 0x1F7);
        class83.field1370.method1117(class35.field573 / 2 - (class83.field1370.field2670 / 2), 18);
        class245.field3801 = true;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class84() {
        this.field1387.field4599 = this.field1387;
        this.field1387.field4596 = this.field1387;
    }
}
