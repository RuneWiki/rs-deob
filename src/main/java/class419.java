import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class419 {

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "Lmc;")
    public static class234 field5520 = new class234(1350);

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "D")
    public static double field5524;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "J")
    public static long field5522;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IB)V")
    public static final void method2414(int arg0, byte arg1) {
        field5523++;
        class614 var2 = class497.method2759(14, 5977, (long) arg0);
        var2.method3279(false);
        if (arg1 > -114) {
            field5520 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lha;I)V")
    public static final void method2415(class570 arg0, int arg1) {
        class773.field10527 = new class25[class207.field2852.length];
        field5521++;
        if (arg1 != 11717) {
            field5524 = 0.3945731997645094D;
        }
        for (int var2 = 0; var2 < class207.field2852.length; var2++) {
            int var3 = class207.field2852[var2];
            class166 var4 = class663.method3610(class633.field8028, var3, -122);
            class420 var5 = arg0.method1002(var4, class388.method2237(class467.field6057, var3), true);
            class773.field10527[var2] = new class25(var5, var4);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILjava/util/Random;B)I")
    public static final int method2416(int arg0, Random arg1, byte arg2) {
        field5519++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class735.method3997(arg0, (byte) -85)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            if (arg2 <= 28) {
                method2417(118);
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class679.method3654(var4, arg0, -4595);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
    public static void method2417(int arg0) {
        if (arg0 < 119) {
            field5520 = null;
        }
        field5520 = null;
    }
}
