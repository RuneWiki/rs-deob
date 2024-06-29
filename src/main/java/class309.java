import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class309 {

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Lhfa;")
    public static class329 field4419 = new class329();

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "Lfga;")
    public static class267 field4422 = new class267();

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field4423 = 0;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public static final void method1990(byte arg0) {
        if (arg0 != -16) {
            return;
        }
        field4421++;
        if (class391.field5388 == null) {
            return;
        }
        class130[] var1 = class391.field5388;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class130 var3 = var1[var2];
            var3.method969((byte) 89);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static void method1991(int arg0) {
        field4422 = null;
        field4419 = null;
        int var1 = -111 / ((58 - arg0) / 61);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z")
    public static final boolean method1992(int arg0, int arg1, int arg2) {
        field4418++;
        if (((arg1 & 0x10000) != 0 | class747.method4161(arg1, (byte) -116, arg0)) || class176.method1279(arg0, arg1, 0)) {
            return true;
        } else {
            if (arg2 != 55) {
                field4420 = 35;
            }
            return (arg0 & 0x37) == 0 && class346.method2194(arg0, arg1, (byte) -102);
        }
    }
}
