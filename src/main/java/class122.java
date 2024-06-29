import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class122 extends class139 {

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    private int field1741;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lhh;")
    public static class297 field1734 = new class297(0, -1);

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(ZII)V")
    public final void method786(boolean arg0, int arg1, int arg2) {
        ++field1736;
        if (!arg0) {
            this.method786(false, -89, -42);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public static final void method787(int arg0) {
        if (arg0 != 29110) {
            method792(-68);
        }
        ++field1737;
        for (int var1 = 0; class306.field4921 > var1; ++var1) {
            int var2 = class131.field1834[var1];
            class310 var3 = class88.field1274[var2];
            if (var3 != null) {
                class195.method1234((byte) 66, var3, var3.field4993.field3122);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIII)V")
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1739 = arg2;
        this.field1730 = arg0;
        this.field1741 = arg1;
        this.field1738 = arg3;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
    public static final void method788(byte arg0) {
        int var1 = 14 % ((arg0 - -27) / 50);
        ++field1731;
        class112.field1604 = new class58();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)V")
    public static final void method789(int arg0, boolean arg1) {
        ++field1740;
        if (!arg1 == class212.field3197) {
            class212.field3197 = arg1;
            if (arg0 != -26132) {
                field1734 = null;
            }
            class129.method827((byte) 103);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BII)V")
    public final void method790(byte arg0, int arg1, int arg2) {
        int var4 = this.field1739 * arg2 >> 12;
        ++field1735;
        if (arg0 >= 93) {
            int var5 = this.field1730 * arg2 >> 12;
            int var6 = this.field1741 * arg1 >> 12;
            int var7 = this.field1738 * arg1 >> 12;
            class312.method2113(var6, var7, var5, false, super.field1926, var4);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZII)V")
    public final void method791(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.field1738 = -8;
        }
        ++field1732;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public static void method792(int arg0) {
        field1734 = null;
        int var1 = 86 / ((arg0 - -53) / 46);
    }
}
