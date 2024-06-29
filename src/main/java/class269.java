import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class269 {

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "J")
    public long field4601 = 0L;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Lke;")
    public static class256 field4580 = class316.method2202(" )2> ", 27626);

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Lke;")
    public static class256 field4586 = class316.method2202("Eingabeprozedur geladen)3", 27626);

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field4588 = 0;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Lke;")
    public static class256 field4598 = class316.method2202("", 27626);

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public int field4587;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public int field4591;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public int field4592;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public int field4594;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public int field4595;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public int field4597;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public int field4599;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public int field4600;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public int field4603;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lj;")
    public static class227 field4584;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lmc;")
    public class51 field4590;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)V", line = 7)
    public static final void method1859(int arg0, byte arg1) {
        field4583++;
        if (arg0 == -1 || !class298.method2087(arg0, 20330)) {
            return;
        }
        if (arg1 <= 92) {
            method1862(-106, 104, -33, (class188) null);
        }
        class188[] var2 = class50.field921[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class188 var4 = var2[var3];
            if (var4.field3303 != null) {
                class119 var5 = new class119();
                var5.field2114 = var4.field3303;
                var5.field2116 = var4;
                class303.method2119(2000000, -2605, var5);
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Log;I)I", line = 52)
    public static final int method1860(class279 arg0, int arg1) {
        field4602++;
        class74 var2 = arg0.field4860;
        if (var2.field1381 != null) {
            var2 = var2.method553(4175);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 <= 91) {
            field4580 = (class256) null;
        }
        int var3 = var2.field1375;
        if (arg0.field1238 == arg0.field1236) {
            var3 = var2.field1347;
        } else if (arg0.field1236 == arg0.field1218) {
            var3 = var2.field1348;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 92)
    public static void method1861(int arg0) {
        if (arg0 != -1) {
            field4584 = (class227) null;
        }
        field4580 = null;
        field4598 = null;
        field4584 = null;
        field4586 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIILla;)V", line = 126)
    public static final void method1862(int arg0, int arg1, int arg2, class188 arg3) {
        if (arg1 >= -50) {
            field4580 = (class256) null;
        }
        field4582++;
        if (class17.field244 < 2 && class21.field273 == 0 && !class320.field5489) {
            return;
        }
        class256 var4 = class180.method1322(113);
        if (arg3 == null) {
            int var6 = class17.field215.method2036(var4, arg0 + 4, arg2 + 15, 16777215, 0, class290.field5023, class156.field2777);
            class320.method2229(arg0 + 4, 15, class17.field215.method2045(var4) + var6, arg2, (byte) 90);
            return;
        }
        class293 var5 = arg3.method1357(class102.field1846, 65535);
        if (var5 == null) {
            var5 = class17.field215;
        }
        var5.method2040(var4, arg0, arg2, arg3.field3391, arg3.field3343, arg3.field3332, arg3.field3411, arg3.field3381, arg3.field3319, class290.field5023, class156.field2777, class164.field2902);
        class320.method2229(class164.field2902[0], class164.field2902[3], class164.field2902[2], class164.field2902[1], (byte) 90);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIII)I", line = 175)
    public static final int method1863(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field4589++;
        if (arg1 == var4) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }
}
