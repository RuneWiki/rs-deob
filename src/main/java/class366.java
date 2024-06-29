import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class366 extends class513 {

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "S")
    public short field4701;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "[I")
    public static int[] field4703 = new int[4096];

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "[I")
    public static int[] field4705;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "D")
    public static double field4704;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public static int field4702;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4703[var0] = class396.method2413(var0, (byte) -69);
        }
        field4705 = new int[2];
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 3)
    public static void method2053(int arg0) {
        field4705 = null;
        field4703 = null;
        if (arg0 > -33) {
            method2056((byte) -97, '[', 38);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lpaa;ZII)V", line = 19)
    public static final void method2054(class712 arg0, boolean arg1, int arg2, int arg3) {
        field4699++;
        if (class740.field10315 != null || class484.field6549 || arg0 == null || class327.method1911(arg0, 127) == null) {
            return;
        }
        class740.field10315 = arg0;
        class316.field4062 = class327.method1911(arg0, 107);
        class662.field9335 = false;
        class281.field3737 = arg2;
        class223.field3142 = 0;
        if (!arg1) {
            field4704 = -0.26362568177480333D;
        }
        class138.field1900 = arg3;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V", line = 43)
    public static final void method2055(int arg0, int arg1, int arg2) {
        int var3 = 65 / ((-arg2 - 21) / 53);
        field4702++;
        class625.field8930++;
        class120 var4 = class292.method1716(class608.field8668, true, class594.field8556);
        var4.field1653.method199(true, arg0);
        var4.field1653.method154(false, arg1);
        class471.method2805(97, var4);
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V", line = 75)
    public class366() {
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(S)V", line = 77)
    public class366(short arg0) {
        this.field4701 = arg0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BCI)I", line = 85)
    public static final int method2056(byte arg0, char arg1, int arg2) {
        field4700++;
        int var3 = 28 % ((arg0 + 15) / 61);
        int var4 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var5 = Character.toLowerCase(arg1);
            var4 = (var5 << 4) + 1;
        }
        return var4;
    }
}
