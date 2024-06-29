import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class33 extends class159 {

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "Lcr;")
    public static class189 field469 = new class189(30);

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "Llm;")
    public static class347 field471;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public static final void method219(byte arg0) {
        field470++;
        class162[] var1 = class380.field5529;
        synchronized (class380.field5529) {
            int var2 = 0;
            while (true) {
                if (var2 >= class380.field5529.length) {
                    break;
                }
                class380.field5529[var2] = new class162();
                class92.field1298[var2] = 0;
                var2++;
            }
        }
        if (arg0 != 90) {
            method219((byte) -111);
        }
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)V")
    public static final void method220(int arg0) {
        class26.field362.method1141(256);
        int var1 = 48 % ((-arg0 - 23) / 47);
        field467++;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)Lrj;")
    public static final class12 method221(byte arg0, int arg1) {
        field466++;
        class189 var2 = class329.field4793;
        class12 var4;
        synchronized (class329.field4793) {
            if (arg0 != 102) {
                return null;
            }
            var4 = (class12) class329.field4793.method1137((long) arg1, 2108653711);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = class185.field2501.method2261(class447.method2812(arg1, (byte) -51), class129.method815(true, arg1), arg0 - 32);
        class12 var6 = new class12();
        var6.field200 = arg1;
        if (var5 != null) {
            var6.method85(new class228(var5), 31731);
        }
        var6.method82(65535);
        class189 var7 = class329.field4793;
        synchronized (class329.field4793) {
            class329.field4793.method1144((long) arg1, var6, arg0 - 3582);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)I")
    public static final int method222(int arg0, int arg1, int arg2) {
        if (arg2 >= -38) {
            return 122;
        } else {
            field468++;
            return arg0 == 1 || arg0 == 3 ? class69.field882[arg1 & 0x3] : class201.field2702[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "(I)V")
    public static void method223(int arg0) {
        if (arg0 > 22) {
            field471 = null;
            field469 = null;
        }
    }
}
