import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class295 {

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "[Liq;")
    public static class562[] field4329;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(BI)V")
    public static final void method1857(byte arg0, int arg1) {
        field4330++;
        class329.method2071(16711680);
        int var2 = class692.field9733.method3137(16, arg1).field9612;
        if (var2 == 0) {
            return;
        }
        int var3 = 59 / ((arg0 + 10) / 56);
        int var4 = class61.field1163.field4002[arg1];
        if (var2 == 6) {
            class190.field2749 = var4;
        }
        if (var2 == 5) {
            class330.field4877 = var4;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lrga;[Lrc;)V")
    public static final void method1858(class215 arg0, class498[] arg1) {
        if (class443.field6452) {
            int var2 = arg0.method950(65535, arg1);
            class682.field9618.method134(var2, arg1);
        }
        if (class499.field7071 == class296.field4340) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class454) {
                var5 = ((class454) arg0).field6524;
                var6 = ((class454) arg0).field6521;
            } else {
                var5 = arg0.field3024 >> class310.field4593;
                var6 = arg0.field3029 >> class310.field4593;
            }
            class682.field9618.method195(class420.field6108[0].method442(arg0.field3024, true, arg0.field3029), class642.method3578(var5, var6), class437.method2599(var5, var6), class640.method3567(var5, var6));
        }
        class549 var7 = arg0.method1173(class682.field9618, true);
        if (var7 == null) {
            return;
        }
        var7.field7712 = arg0;
        if (class520.field7337) {
            class392 var8 = class380.field5378;
            synchronized (class380.field5378) {
                boolean var9 = false;
                for (class549 var10 = (class549) class380.field5378.method2417(false); var10 != null; var10 = (class549) class380.field5378.method2414(true)) {
                    if (arg0.field3026 >= var10.field7712.field3026) {
                        class569.method3238(var7, -1777914136, var10);
                        var9 = true;
                        break;
                    }
                }
                if (!var9) {
                    class380.field5378.method2413(var7, (byte) 97);
                }
                return;
            }
        }
        boolean var11 = false;
        for (class549 var12 = (class549) class380.field5378.method2417(false); var12 != null; var12 = (class549) class380.field5378.method2414(true)) {
            if (arg0.field3026 >= var12.field7712.field3026) {
                class569.method3238(var7, -1777914136, var12);
                var11 = true;
                break;
            }
        }
        if (!var11) {
            class380.field5378.method2413(var7, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V")
    public static void method1859(byte arg0) {
        if (arg0 != 88) {
            field4328 = 43;
        }
        field4329 = null;
    }
}
