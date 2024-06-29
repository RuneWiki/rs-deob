import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class17 extends RuntimeException {

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field182;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Ljava/lang/String;")
    public String field177;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lpi;")
    public static class201 field175 = new class201(16);

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field187 = 0;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lie;")
    public static class2 field178 = new class2();

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lea;")
    public static class224 field184;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
    public static final void method116(int arg0, int arg1) {
        class279 var2 = class111.method844(arg0, 8, -1780180960);
        field181++;
        var2.method1934((byte) -114);
        if (arg1 != -214748365) {
            field178 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)V")
    public static final void method117(int arg0, int arg1) {
        field183++;
        class141.field2274.method1416(arg0, arg1);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ltl;Ltl;I)V")
    public static final void method118(class259 arg0, class259 arg1, int arg2) {
        if (arg1.field4014 != null) {
            arg1.method1781(5250);
        }
        arg1.field4014 = arg0.field4014;
        field176++;
        arg1.field4013 = arg0;
        if (arg2 <= 81) {
            field187 = -109;
        }
        arg1.field4014.field4013 = arg1;
        arg1.field4013.field4014 = arg1;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method119(int arg0, int arg1) {
        if (arg0 >= -121) {
            method118((class259) null, (class259) null, 106);
        }
        field179++;
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF4815) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Llc;B)V")
    public static final void method120(class270 arg0, byte arg1) {
        field186++;
        class230.field3382 = arg0;
        if (arg1 > -13) {
            method117(90, 35);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method121(byte arg0) {
        field178 = null;
        if (arg0 == -23) {
            field175 = null;
            field184 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class17(Throwable arg0, String arg1) {
        this.field182 = arg0;
        this.field177 = arg1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZB)I")
    public static final int method122(boolean arg0, byte arg1) {
        long var2 = class3.method14(29853);
        field180++;
        for (class292 var4 = arg0 ? (class292) class170.field2574.method1071(-128) : (class292) class170.field2574.method1069(-123); var4 != null; var4 = (class292) class170.field2574.method1069(-123)) {
            if ((var4.field4645 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field4645 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4008;
                    class303.field4900[var5] = class9.field103[var5];
                    var4.method1781(5250);
                    return var5;
                }
                var4.method1781(5250);
            }
        }
        if (arg1 < 115) {
            field187 = -100;
        }
        return -1;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)I")
    public static final int method123(int arg0, int arg1) {
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        field185++;
        int var3 = (var2 >>> 2 & 0xF3333333) + (arg0 & var2);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
