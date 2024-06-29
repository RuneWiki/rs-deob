import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class318 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[Lmu;")
    public static class317[] field4518 = new class317[14];

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
    public static int[] field4517 = new int[250];

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field4520 = 0;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field4525 = -1;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Ljb;")
    public static class519 field4522 = new class519(60, 0);

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Lqw;")
    public static class84 field4527 = new class84();

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lgi;")
    public static class705 field4528 = new class705();

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field4529 = 0;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lbr;")
    public static class414 field4526;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lep;")
    public static class442 field4521;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILofa;)V")
    public static final void method2060(int arg0, class347 arg1) {
        if (arg0 != -1) {
            field4528 = null;
        }
        field4519++;
        if (!class506.field7094) {
            return;
        }
        class742.field10043++;
        if (arg1.field4976 != null) {
            class347 var2 = class90.method717(class294.field4170, class658.field8875, (byte) -42);
            if (var2 != null) {
                class158 var3 = new class158();
                var3.field2137 = arg1;
                var3.field2128 = arg1.field4976;
                var3.field2127 = var2;
                class727.method4005(var3);
            }
        }
        class43 var4 = class492.method2903(class478.field6715, 0, class73.field983);
        var4.field457.method1686(-104, arg1.field5003);
        var4.field457.method1713((byte) -126, class658.field8875);
        var4.field457.method1718((byte) -34, arg1.field4955);
        var4.field457.method1718((byte) -34, arg1.field4956);
        var4.field457.method1690(-516533072, class294.field4170);
        var4.field457.method1718((byte) -34, class634.field8567);
        class409.method2457((byte) -100, var4);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([BI)Z")
    public static final boolean method2061(byte[] arg0, int arg1) {
        if (arg1 <= 60) {
            method2062(-80);
        }
        field4524++;
        class254 var2 = new class254(arg0);
        int var3 = var2.method1731((byte) 64);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method1731((byte) 64) == 1;
        if (var4) {
            class441.method2636(16, var2);
        }
        class34.method198(var2, (byte) -55);
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method2062(int arg0) {
        field4521 = null;
        field4518 = null;
        field4522 = null;
        int var1 = -10 / ((-arg0 - 6) / 60);
        field4526 = null;
        field4527 = null;
        field4528 = null;
        field4517 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Z")
    public static final boolean method2063(int arg0, int arg1, int arg2) {
        field4523++;
        if (arg1 >= 1000 && arg0 < 1000) {
            return true;
        } else if (arg1 >= 1000 || arg0 >= 1000) {
            if (arg2 != 17229) {
                method2060(-92, null);
            }
            return arg1 >= 1000 && arg0 >= 1000;
        } else if (class191.method1268(arg0, (byte) -74)) {
            return true;
        } else {
            return !class191.method1268(arg1, (byte) -72);
        }
    }
}
