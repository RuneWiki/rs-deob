import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class341 extends class359 {

    @OriginalMember(owner = "client!im", name = "r", descriptor = "S")
    public short field5024;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public static int field5018 = 0;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Lls;")
    public static class74 field5017 = null;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field5022 = 2;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "J")
    public static long field5025 = 0L;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "B")
    public static byte field5023;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Ltp;")
    public static class314 field5015;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "Lra;")
    public static class57 field5016;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
    public static void method2188(boolean arg0) {
        field5017 = null;
        field5015 = null;
        if (arg0) {
            field5016 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
    public static final void method2189(int arg0) {
        field5019++;
        if (arg0 == 2) {
            class251.field3396.method2043(-66);
            class97.field1094.method2043(-116);
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V")
    public static final void method2190(byte arg0) {
        field5021++;
        class331 var1 = class437.field6410;
        synchronized (class437.field6410) {
            class437.field6410.method2043(arg0 ^ 0xFFFFFF83);
        }
        if (arg0 != 1) {
            field5022 = 17;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
    public class341() {
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(S)V")
    public class341(short arg0) {
        this.field5024 = arg0;
    }
}
