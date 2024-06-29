import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class329 extends class125 {

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "[I")
    public static int[] field4455 = new int[200];

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BI)V", line = 4)
    public final void method157(byte arg0, int arg1) {
        if (arg0 >= -32) {
            method2024((byte) 47);
        }
        ++field4457;
        super.field1732 = arg1;
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lgp;)V", line = 16)
    public class329(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(BI)V", line = 19)
    public static final void method2022(byte arg0, int arg1) {
        ++field4453;
        if (arg0 <= -49) {
            if (class416.method2507(arg1, -2113733296)) {
                class146[] var2 = class600.field8524[arg1];
                for (int var3 = 0; var2.length > var3; ++var3) {
                    class146 var4 = var2[var3];
                    if (var4 != null) {
                        var4.field2007 = 0;
                        var4.field1986 = 0;
                        var4.field2070 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZI)I", line = 58)
    public final int method155(boolean arg0, int arg1) {
        ++field4461;
        if (!arg0) {
            method2022((byte) -93, -84);
        }
        return 3;
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)V", line = 69)
    public static void method2023(int arg0) {
        field4455 = null;
        if (arg0 > -36) {
            field4455 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(ILgp;)V", line = 81)
    public class329(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)V", line = 84)
    public static final void method2024(byte arg0) {
        ++field4456;
        if (arg0 != -86) {
            field4455 = null;
        }
        class348 var1 = class675.field9603;
        synchronized (class675.field9603) {
            class675.field9603.method2219(-5300);
        }
        class348 var2 = class201.field2992;
        synchronized (class201.field2992) {
            class201.field2992.method2219(-5300);
        }
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(BI)V", line = 100)
    public static final void method2025(byte arg0, int arg1) {
        ++field4458;
        if (arg0 != 6) {
            method2022((byte) -65, -63);
        }
        class100.field1440.method2207(arg1, arg0 ^ 7);
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(Z)V", line = 118)
    public final void method156(boolean arg0) {
        super.field1732 = this.method158((byte) 38);
        if (!arg0) {
            field4455 = null;
        }
        ++field4459;
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(Z)I", line = 131)
    public final int method2026(boolean arg0) {
        if (arg0) {
            field4455 = null;
        }
        ++field4454;
        return super.field1732;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)I", line = 142)
    public final int method158(byte arg0) {
        ++field4460;
        int var2 = 24 / ((-63 - arg0) / 49);
        return super.field1733.method3309((byte) -22) == class391.field5635 && super.field1733.method3308(-89) ? 0 : 1;
    }
}
