import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class37 extends class3 {

    @OriginalMember(owner = "client!k", name = "K", descriptor = "Lok;")
    private static class41 field573 = class137.method956("Opened title screen", 45);

    @OriginalMember(owner = "client!k", name = "J", descriptor = "Lok;")
    public static class41 field572 = field573;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "Lok;")
    public static class41 field576 = class137.method956("<col=00ffff>", 45);

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public static int field578 = 1;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "Lok;")
    public class41 field570;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)Z", line = 9)
    public final boolean method252(int arg0) {
        if (arg0 != 37) {
            this.method255((class112) null, -56, (byte) -124);
        }
        field580++;
        return this.field571 == 115;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V", line = 20)
    public static final void method253(int arg0, int arg1) {
        field575++;
        if (arg1 != -76) {
            field573 = (class41) null;
        }
        if (arg0 == 37) {
            class129.field1915 = 3.0F;
        } else if (arg0 == 50) {
            class129.field1915 = 4.0F;
        } else if (arg0 == 75) {
            class129.field1915 = 6.0F;
        } else {
            class129.field1915 = 8.0F;
        }
        class296.field4788 = -1;
        class296.field4788 = -1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([BZ)Z", line = 53)
    public static final boolean method254(byte[] arg0, boolean arg1) {
        field574++;
        if (arg1) {
            return false;
        }
        class112 var2 = new class112(arg0);
        int var3 = var2.method792(2);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method792(2) == 1;
        if (var4) {
            class203.method1437(4, var2);
        }
        class65.method475(-2892, var2);
        return true;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Llb;IB)V", line = 86)
    private final void method255(class112 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field571 = arg0.method792(2);
        } else if (arg1 == 2) {
            this.field577 = arg0.method779(-27100);
        } else if (arg1 == 5) {
            this.field570 = arg0.method763(true);
        }
        field579++;
        if (arg2 < 89) {
            this.field577 = 97;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILlb;)V", line = 118)
    public final void method256(int arg0, class112 arg1) {
        while (true) {
            int var3 = arg1.method792(2);
            if (var3 == 0) {
                if (arg0 != 2) {
                    this.field570 = (class41) null;
                }
                field569++;
                return;
            }
            this.method255(arg1, var3, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V", line = 146)
    public static void method257(int arg0) {
        field576 = null;
        field572 = null;
        field573 = null;
        if (arg0 != 1) {
            field576 = (class41) null;
        }
    }
}
