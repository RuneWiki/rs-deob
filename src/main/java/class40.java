import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class40 {

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Lhj;")
    public static class69 field569 = class181.method1318("name_icons", (byte) -114);

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field574 = 0;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "[Z")
    public static boolean[] field576 = new boolean[100];

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lhj;")
    public static class69 field572 = class181.method1318("welle2:", (byte) -110);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "[I")
    public static int[] field570;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "[I")
    public static int[] field571;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[[B")
    public static byte[][] field568;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
    public abstract void method110(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)V")
    public static final void method223(boolean arg0, int arg1) {
        class136.method1017(arg0, class20.field287, class35.field483, class66.field1278, (byte) 27);
        if (arg1 != 0) {
            field569 = null;
        }
        field566++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BII)V")
    public abstract void method111(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILhj;)V")
    public static final void method224(int arg0, class69 arg1) {
        class152.field2835 = arg1;
        field573++;
        if (class36.field508.field601 == null) {
            return;
        }
        try {
            if (arg0 == 100) {
                class69 var2 = class224.field4076.method437(true, class36.field508.field601);
                class69 var3 = class95.field1770.method437(true, class36.field508.field601);
                class69 var4 = class9.method42(-127, new class69[] { var2, class252.field4548, arg1, class212.field3865, var3 });
                class69 var5;
                if (arg1.method441((byte) 73) == 0) {
                    var5 = class9.method42(114, new class69[] { var4, class229.field4203 });
                } else {
                    var5 = class9.method42(-98, new class69[] { var4, class148.field2754, class3.method14((byte) 124, class223.method1584(-25392) + 94608000000L), class216.field3913, class194.method1408(94608000L, 0) });
                }
                class9.method42(-80, new class69[] { class153.field2844, var5, class60.field1106 }).method476(0, class36.field508.field601);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method225(int arg0) {
        field568 = null;
        field572 = null;
        if (arg0 != 0) {
            method226((class128) null, 87);
        }
        field571 = null;
        field570 = null;
        field569 = null;
        field576 = null;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(BII)V")
    public abstract void method106(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lfh;I)Ldb;")
    public static final class17 method226(class128 arg0, int arg1) {
        if (arg1 == 0) {
            field577++;
            return new class17(arg0.method955((byte) 101), arg0.method955((byte) 98), arg0.method955((byte) 78), arg0.method955((byte) 76), arg0.method952((byte) -75), arg0.method952((byte) -71), arg0.method937(false));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(III)V")
    public class40(int arg0, int arg1, int arg2) {
        this.field575 = arg0;
        this.field567 = arg1;
        this.field565 = arg2;
    }
}
