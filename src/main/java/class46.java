import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class46 extends class11 {

    @OriginalMember(owner = "client!wba", name = "v", descriptor = "Llj;")
    public static class570 field656 = new class570(8, 0, 4, 1);

    @OriginalMember(owner = "client!wba", name = "x", descriptor = "Lgj;")
    public static class593 field658 = new class593();

    @OriginalMember(owner = "client!wba", name = "t", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!wba", name = "u", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!wba", name = "w", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!wba", name = "A", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!wba", name = "B", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!wba", name = "C", descriptor = "Lbi;")
    public static class449 field663;

    @OriginalMember(owner = "client!wba", name = "E", descriptor = "Lbi;")
    public static class449 field665;

    @OriginalMember(owner = "client!wba", name = "y", descriptor = "Ljw;")
    private class520 field659;

    @OriginalMember(owner = "client!wba", name = "D", descriptor = "[[I")
    public static int[][] field664;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IILeh;)V", line = 4)
    private final void method315(int arg0, int arg1, class335 arg2) {
        field662++;
        int var4 = -1 % ((-arg1 - 52) / 34);
        if (arg0 != 249) {
            return;
        }
        int var5 = arg2.method2034(255);
        if (this.field659 == null) {
            int var6 = class587.method3231(true, var5);
            this.field659 = new class520(var6);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            boolean var8 = arg2.method2034(255) == 1;
            int var9 = arg2.method2042((byte) 53);
            class504 var10;
            if (var8) {
                var10 = new class319(arg2.method2029((byte) -64));
            } else {
                var10 = new class704(arg2.method2045(-98));
            }
            this.field659.method2911((long) var9, var10, (byte) -28);
        }
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(B)V", line = 48)
    public static void method316(byte arg0) {
        if (arg0 >= -107) {
            field656 = null;
        }
        field658 = null;
        field664 = null;
        field663 = null;
        field656 = null;
        field665 = null;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Leh;I)V", line = 63)
    public final void method317(class335 arg0, int arg1) {
        if (arg1 <= 63) {
            field658 = null;
        }
        field661++;
        while (true) {
            int var3 = arg0.method2034(255);
            if (var3 == 0) {
                return;
            }
            this.method315(var3, -111, arg0);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;", line = 89)
    public final String method318(String arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            return null;
        }
        field657++;
        if (this.field659 == null) {
            return arg0;
        } else {
            class319 var4 = (class319) this.field659.method2918((long) arg2, (byte) 66);
            return var4 == null ? arg0 : var4.field4371;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)V", line = 110)
    public static final void method319(byte arg0, int arg1) {
        field655++;
        if (arg0 != 124) {
            field658 = null;
        }
        class374.field5050 = 1000000000L / (long) arg1;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BII)I", line = 123)
    public final int method320(byte arg0, int arg1, int arg2) {
        field654++;
        if (this.field659 == null) {
            return arg2;
        }
        if (arg0 != -33) {
            field665 = null;
        }
        class704 var4 = (class704) this.field659.method2918((long) arg1, (byte) -126);
        return var4 == null ? arg2 : var4.field9905;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(Z)V", line = 145)
    public static final void method321(boolean arg0) {
        field660++;
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < class105.field1570.length; var1++) {
            for (int var2 = 0; var2 < class105.field1570[var1].length; var2++) {
                class105.field1570[var1][var2] = class10.field199;
            }
        }
    }
}
