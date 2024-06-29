import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class541 {

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "Les;")
    public static class403 field7601;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Liaa;IBIB)V", line = 3)
    public static final void method3202(class521 arg0, int arg1, byte arg2, int arg3, byte arg4) {
        field7605++;
        int var5 = arg0.field3453[0];
        int var6 = arg0.field3455[0];
        if (var5 < 0 || var5 >= class596.field8090 || var6 < 0 || var6 >= class107.field1350 || arg1 < 0 || class596.field8090 <= arg1 || arg3 < 0 || class107.field1350 <= arg3) {
            return;
        }
        int var7 = class482.method2863(arg3, class633.field8649[arg0.field808], 0, false, true, var6, var5, 0, -4, class716.field10030, arg1, 0, arg0.method1665(1720746760), 0, class199.field2384);
        if (var7 >= 1 && arg2 == 50 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg0.method3127(class716.field10030[var8], class199.field2384[var8], arg4, -1241);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 42)
    public static final void method3203(String arg0, int arg1) {
        field7600++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class87.method803(arg0, false);
        if (var2 == null) {
            return;
        }
        int var3 = -14 % ((arg1 - 19) / 55);
        for (int var4 = 0; var4 < class651.field8992; var4++) {
            String var5 = class375.field4702[var4];
            if (var5.startsWith("*")) {
                var5 = var5.substring(1);
            }
            String var6 = class87.method803(var5, false);
            if (var6 != null && var6.equals(var2)) {
                class651.field8992--;
                for (int var7 = var4; var7 < class651.field8992; var7++) {
                    class375.field4702[var7] = class375.field4702[var7 + 1];
                    class156.field1942[var7] = class156.field1942[var7 + 1];
                    class340.field4225[var7] = class340.field4225[var7 + 1];
                    class208.field2471[var7] = class208.field2471[var7 + 1];
                    class347.field4340[var7] = class347.field4340[var7 + 1];
                    class111.field1396[var7] = class111.field1396[var7 + 1];
                }
                class462.field6489 = class87.field1156;
                class38.field561++;
                class336 var8 = class512.method3076(class622.field8545, class591.field8030, (byte) 94);
                var8.field4150.method2353(82, class615.method3482(arg0, 1));
                var8.field4150.method2388(255, arg0);
                class578.method3334(4, var8);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILkq;)V", line = 108)
    public static final void method3204(int arg0, int arg1, int arg2, class620 arg3) {
        field7602++;
        if (arg3 == null) {
            return;
        }
        if (arg3.field8356 != null) {
            class529 var4 = new class529();
            var4.field7477 = arg3.field8356;
            var4.field7473 = arg3;
            class142.method1045(var4);
        }
        class667.field9161 = arg2;
        class748.field10390 = arg3.field8419;
        class104.field1336 = true;
        class680.field9309 = arg3.field8477;
        class215.field2531 = arg3.field8515;
        if (arg0 != 1) {
            method3202(null, -32, (byte) -118, -37, (byte) -42);
        }
        class351.field4370 = arg3.field8445;
        class520.field7344 = arg3.field8438;
        class348.field4348 = arg1;
        class576.method3330(arg3, -1);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLkq;Lkq;)V", line = 145)
    public static final void method3205(boolean arg0, class620 arg1, class620 arg2) {
        class291.field3499++;
        field7604++;
        class336 var3 = class512.method3076(class120.field1540, class591.field8030, (byte) 111);
        if (!arg0) {
            method3206(126);
        }
        var3.field4150.method2391(-104, arg2.field8515);
        var3.field4150.method2424(arg1.field8515, false);
        var3.field4150.method2369(-18090, arg2.field8445);
        var3.field4150.method2369(-18090, arg1.field8438);
        var3.field4150.method2407(arg1.field8445, (byte) 95);
        var3.field4150.method2422(29933, arg2.field8438);
        class578.method3334(4, var3);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 166)
    public static void method3206(int arg0) {
        field7601 = null;
        int var1 = -15 % ((arg0 - 10) / 35);
    }
}
