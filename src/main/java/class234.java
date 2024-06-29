import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public abstract class class234 {

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "Lhn;")
    public static class83 field3508 = new class83();

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "Laf;")
    public static class13 field3509 = new class13();

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I[B)V")
    public abstract void method1632(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIBI[B)V")
    public static final void method1633(int arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5) {
        field3506++;
        if (arg2 <= arg0) {
            return;
        }
        int var6 = arg2 - arg0 >> 2;
        int var7 = arg0 + arg4;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg2 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg3 >= -31) {
                            field3509 = null;
                            return;
                        } else {
                            return;
                        }
                    }
                    arg5[var7++] = 1;
                }
            }
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BII)[B")
    public abstract byte[] method1634(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILsl;)V")
    public static final void method1635(int arg0, class479 arg1) {
        field3507++;
        int var2 = arg1.method2889(-18098);
        class340.field4682 = new class731[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class340.field4682[var3] = new class731();
            class340.field4682[var3].field10245 = arg1.method2889(-18098);
            class340.field4682[var3].field10249 = arg1.method2876(-1);
        }
        class536.field7790 = arg1.method2889(-18098);
        class560.field8127 = arg1.method2889(-18098);
        class243.field3581 = arg1.method2889(-18098);
        class142.field1940 = new class592[class560.field8127 + 1 - class536.field7790];
        int var4 = 123 % ((arg0 + 24) / 49);
        for (int var5 = 0; var5 < class243.field3581; var5++) {
            int var6 = arg1.method2889(-18098);
            class592 var7 = class142.field1940[var6] = new class592();
            var7.field4073 = arg1.method2886(true);
            var7.field4069 = arg1.method2868(-40);
            var7.field8417 = var6 + class536.field7790;
            var7.field8416 = arg1.method2876(-1);
            var7.field8412 = arg1.method2876(-1);
        }
        class364.field5327 = arg1.method2868(-82);
        class615.field8768 = true;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
    public static void method1636(int arg0) {
        field3509 = null;
        field3508 = null;
        int var1 = -124 / ((arg0 + 57) / 61);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1637(int arg0);
}
