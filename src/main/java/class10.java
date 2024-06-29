import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class10 extends class325 {

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field139 = -1;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[I")
    public static int[] field140 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "[B")
    public static byte[] field143 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Ls;")
    public static class186 field141 = new class186(27, 0);

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static void method57(boolean arg0) {
        field141 = null;
        field143 = null;
        field140 = null;
        if (!arg0) {
            field143 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(JZILjava/lang/String;)V")
    public static final void method58(long arg0, boolean arg1, int arg2, String arg3) {
        field138++;
        if (arg1) {
            class439.method2618(arg2 ^ 0x1);
            if (class236.field3643.equals("")) {
                class393.field6007 = 39;
                return;
            }
        }
        class289 var5 = new class289(128);
        var5.method1814(10, true);
        var5.method1865((int) (Math.random() * 65535.0D), 812856296);
        var5.method1826(arg0, 252);
        var5.method1865(class242.field3745, 812856296);
        var5.method1862((byte) -115, (int) (Math.random() * 9.9999999E7D));
        var5.method1821(arg3, 56);
        var5.method1862((byte) -115, (int) (Math.random() * 9.9999999E7D));
        if (arg1) {
            var5.method1826(class410.method2539((byte) 12, class236.field3643), arg2 ^ 0xDB);
            try {
                var5.method1826(Long.parseLong(class397.field6030), 252);
            } catch (Exception var6) {
                class393.field6007 = 39;
                return;
            }
        } else {
            var5.method1862((byte) -115, (int) (Math.random() * 9.9999999E7D));
            var5.method1862((byte) -115, (int) (Math.random() * 9.9999999E7D));
            var5.method1862((byte) -115, (int) (Math.random() * 9.9999999E7D));
            var5.method1862((byte) -115, (int) (Math.random() * 9.9999999E7D));
        }
        var5.method1862((byte) -115, (int) (Math.random() * 9.9999999E7D));
        var5.method1845(arg2 ^ 0x42, class60.field1239, class395.field6016);
        class335.field5062.field4399 = 0;
        class335.field5062.method1814(arg1 ? class316.field4795.field2207 : class316.field4792.field2207, true);
        class335.field5062.method1865(var5.field4399 + 28, 812856296);
        class335.field5062.method1865(597, 812856296);
        class335.field5062.method1814(class146.field2452, true);
        class335.field5062.method1814(class424.field6366.field5121, true);
        class290.method1881(true, class335.field5062);
        class335.field5062.method1813(var5.field4399, 0, var5.field4408, arg2 ^ 0x2409);
        class522.field7580 = 0;
        class393.field6007 = -3;
        if (arg2 != 39) {
            field143 = null;
        }
        class505.field7373 = 0;
        class210.field3355 = 1;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)Ldl;")
    public abstract class46 method59(byte arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static final void method60(int arg0) {
        class276.field4170 = new class387[50];
        if (arg0 >= -32) {
            method60(-71);
        }
        class218.field3439 = 0;
        field142++;
    }

    static {
        new class309("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
    }
}
