import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class465 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "[Lnp;")
    public static class213[] field6846 = new class213[14];

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "[Le;")
    public static class100[] field6850 = new class100[4];

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Ldq;")
    public static class90 field6847 = new class90(8);

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "[I")
    public static int[] field6852 = new int[2048];

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILge;)V")
    public static final void method2867(int arg0, class108 arg1) {
        if (arg0 <= 37) {
            field6846 = null;
        }
        for (int var2 = 0; var2 < class367.field5309; var2++) {
            int var3 = class178.field2491[var2];
            class380 var4 = class455.field6731[var3];
            int var5 = arg1.method1738((byte) 87);
            if ((var5 & 0x20) != 0) {
                var5 += arg1.method1738((byte) 80) << 8;
            }
            class184.method1268(arg1, var3, var4, -42, var5);
        }
        field6848++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lrc;")
    public static final class103 method2868(int arg0, int arg1) {
        field6845++;
        if (arg0 >= -7) {
            field6850 = null;
        }
        class103 var2 = (class103) class417.field6024.method2310((byte) -126, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class404.field5849.method715(arg1, (byte) 91, 4);
        class103 var4 = new class103();
        if (var3 != null) {
            var4.method694(arg1, new class256(var3), -74);
        }
        var4.method691((byte) -93, arg1);
        class417.field6024.method2299(true, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lgn;BIII)V")
    public static final void method2869(class178 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field6844++;
        if (arg1 < 37) {
            return;
        }
        for (class138 var5 = (class138) class208.field2940.method2478(1603); var5 != null; var5 = (class138) class208.field2940.method2486((byte) -82)) {
            if (var5.field1894 == arg2 && arg4 * 128 == var5.field1897 && (arg3 * 128) == var5.field1900 && var5.field1890.field2455 == arg0.field2455) {
                if (var5.field1898 != null) {
                    class452.field6671.method278(var5.field1898);
                    var5.field1898 = null;
                }
                if (var5.field1886 != null) {
                    class452.field6671.method278(var5.field1886);
                    var5.field1886 = null;
                }
                var5.method1820(-25246);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method2870(int arg0) {
        field6850 = null;
        field6846 = null;
        field6847 = null;
        if (arg0 > 62) {
            field6852 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIILkg;)V")
    public static final void method2871(int arg0, int arg1, int arg2, class223 arg3) {
        field6849++;
        if (class157.field2113 != null || class286.field4210 || arg3 == null || class279.method1893(arg3, 116) == null) {
            return;
        }
        class157.field2113 = arg3;
        class42.field567 = class279.method1893(arg3, arg0 - 31);
        class195.field2743 = arg0;
        class155.field2082 = arg1;
        class322.field4760 = false;
        class133.field1834 = arg2;
    }
}
