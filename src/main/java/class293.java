import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class293 {

    @OriginalMember(owner = "client!re", name = "f", descriptor = "J")
    public long field4596 = 0L;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4602 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public int field4592;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public int field4598;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public int field4600;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public int field4603;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public int field4606;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Leh;")
    public class179 field4593;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Leh;")
    public class179 field4595;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(JZ)Ljava/lang/String;", line = 7)
    public static final String method2055(long arg0, boolean arg1) {
        class176.field2809.setTime(new Date(arg0));
        field4594++;
        int var3 = class176.field2809.get(7);
        int var4 = class176.field2809.get(5);
        if (arg1) {
            field4602 = 39;
        }
        int var5 = class176.field2809.get(2);
        int var6 = class176.field2809.get(1);
        int var7 = class176.field2809.get(11);
        int var8 = class176.field2809.get(12);
        int var9 = class176.field2809.get(13);
        return class130.field2078[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class12.field270[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 33)
    public static final void method2056(byte arg0) {
        field4604++;
        if (arg0 < 29) {
            return;
        }
        while (class80.field1248.method1799(class128.field2060, (byte) -71) >= 27) {
            int var1 = class80.field1248.method1800(-76, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class197.field3029[var1] == null) {
                var2 = true;
                class197.field3029[var1] = new class86();
            }
            class86 var3 = class197.field3029[var1];
            class76.field1192[class83.field1290++] = var1;
            var3.field4673 = class307.field4869;
            if (var3.field1381 != null && var3.field1381.method673(false)) {
                class207.method1527(var3, (byte) -116);
            }
            int var4 = class80.field1248.method1800(105, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class309.field4890[class80.field1248.method1800(126, 3)];
            if (var2) {
                var3.field4630 = var3.field4682 = var5;
            }
            int var6 = class80.field1248.method1800(-33, 1);
            var3.method682(32090, class310.method2191(class80.field1248.method1800(-5, 14), 120));
            int var7 = class80.field1248.method1800(85, 5);
            int var8 = class80.field1248.method1800(-85, 1);
            if (var7 > 15) {
                var7 -= 32;
            }
            if (var8 == 1) {
                class251.field3708[class88.field1420++] = var1;
            }
            var3.method2069(var3.field1381.field1363, (byte) 96);
            var3.field4683 = var3.field1381.field1315;
            var3.field4632 = var3.field1381.field1365;
            if (var3.field4683 == 0) {
                var3.field4682 = 0;
            }
            var3.method2070(class345.field5363.field4643[0] + var7, var3.method738(-6421), -97, class345.field5363.field4619[0] + var4, var6 == 1);
            if (var3.field1381.method673(false)) {
                class158.method1167(var3.field4619[0], 0, var3, (class92) null, (class101) null, 107, var3.field4643[0], class75.field1153);
            }
        }
        class80.field1248.method1801((byte) -100);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([Ljava/lang/Object;B[I)V", line = 117)
    public static final void method2057(Object[] arg0, byte arg1, int[] arg2) {
        if (arg1 >= 94) {
            class10.method152(arg0, 0, arg2.length - 1, 113, arg2);
            field4591++;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILjava/lang/String;)V", line = 129)
    public static final void method2058(int arg0, int arg1, String arg2) {
        class266.field4038++;
        class209.field3305.method1808((byte) -74, 67);
        class209.field3305.method21(-127, arg1);
        int var3 = -10 / ((arg0 + 84) / 34);
        field4597++;
        class209.field3305.method43(class106.method851(arg2, -108), true);
    }
}
