import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class195 extends class251 {

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "[I")
    public static int[] field3075 = new int[16384];

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "[I")
    public static int[] field3077 = new int[16384];

    @OriginalMember(owner = "client!wt", name = "G", descriptor = "[Luj;")
    public static class249[] field3085;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!wt", name = "E", descriptor = "I")
    public int field3083;

    @OriginalMember(owner = "client!wt", name = "H", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!wt", name = "I", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!wt", name = "F", descriptor = "Loq;")
    public class231 field3084;

    @OriginalMember(owner = "client!wt", name = "J", descriptor = "Ljava/lang/String;")
    public String field3088;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "[I")
    public int[] field3074;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "[I")
    public int[] field3078;

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "[Lke;")
    public class407[] field3080;

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field3079;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    public static void method1215(byte arg0) {
        field3085 = null;
        field3075 = null;
        int var1 = 0 % ((arg0 - 31) / 40);
        field3077 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILtq;)Ljava/lang/String;")
    public static final String method1216(int arg0, int arg1, class427 arg2) {
        field3072++;
        if (!client.method1176(arg2).method374(797621697, arg0) && arg2.field6226 == null) {
            return null;
        } else if (arg2.field6129 == null || arg2.field6129.length <= arg0 || arg2.field6129[arg0] == null || arg2.field6129[arg0].trim().length() == 0) {
            return class483.field7373 ? "Hidden-" + arg0 : null;
        } else {
            if (arg1 != 32768) {
                field3077 = null;
            }
            return arg2.field6129[arg0];
        }
    }

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V")
    public static final void method1217(int arg0) {
        field3087++;
        class296.method1796((long) class369.field5424, (byte) -13, class345.field5116);
        if (class375.field5475 != -1) {
            class388.method2307(class375.field5475, (byte) -128);
        }
        for (int var1 = 0; var1 < class413.field5993; var1++) {
            if (class77.field1376[var1]) {
                class400.field5832[var1] = true;
            }
            class78.field1386[var1] = class77.field1376[var1];
            class77.field1376[var1] = false;
        }
        class476.field7258 = class369.field5424;
        if (class345.field5116.method1893()) {
            class431.field6351 = true;
        }
        if (class375.field5475 != -1) {
            class413.field5993 = 0;
            class197.method1222(-15611);
        }
        class345.field5116.method1966();
        class349.method2128(class392.field5740, (byte) 12);
        class115.field1951 = 0;
        if (arg0 != -1008) {
            field3077 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILqq;)V")
    public static final void method1218(int arg0, class318 arg1) {
        if (arg0 != 36) {
            field3075 = null;
        }
        field3076++;
        if (class507.field7655.method6(18328) == 0) {
            return;
        }
        if (class30.field395 == 0) {
            for (class148 var2 = (class148) class507.field7655.method8((byte) -98); var2 != null; var2 = (class148) class507.field7655.method17((byte) 120)) {
                class288.field4362.method3034(var2.field2394 ? class286.field4329.field696 : null, var2.field2392, var2.field2389, var2.field2395, class266.field4026, var2.field2393, false, (byte) -62, var2.field2391, false, arg1, arg1);
                var2.method1121(false);
            }
            class119.method831(0);
            return;
        }
        if (class359.field5318 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class359.field5318 = class318.method1989(1, 0, 0, class218.field3349, class7.field86, var3);
            class401.field5845 = class359.field5318.method1888(class206.method1265(class123.field2027, class12.field145, 0, 88), class351.method2137(class472.field7225, class12.field145, 0), true);
        }
        for (class148 var4 = (class148) class507.field7655.method8((byte) -98); var4 != null; var4 = (class148) class507.field7655.method17((byte) -95)) {
            class288.field4362.method3034(var4.field2394 ? class286.field4329.field696 : null, var4.field2392, var4.field2389, var4.field2395, class401.field5845, var4.field2393, false, (byte) -126, var4.field2391, false, arg1, class359.field5318);
            var4.method1121(false);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BI)Z")
    public static final boolean method1219(byte arg0, int arg1) {
        if (arg0 == 5) {
            field3086++;
            return arg1 == 18 || arg1 == 48 || arg1 == 1007 || arg1 == 15 || arg1 == 3;
        } else {
            return true;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3075[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field3077[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field3085 = new class249[32768];
    }
}
