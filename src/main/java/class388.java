import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class388 {

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public int field5921 = 1;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "F")
    public static float field5918 = 0.0F;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field5923 = 0;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "C")
    public char field5914;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Lfk;")
    public static class244 field5915;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Lpt;")
    public static class403 field5919;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IILhw;)V")
    private final void method2488(int arg0, int arg1, class208 arg2) {
        if (arg1 == 1) {
            this.field5914 = class167.method1058(arg2.method1427(false), arg0 + 256);
        } else if (arg1 == 2) {
            this.field5921 = 0;
        }
        field5924++;
        if (arg0 != -1) {
            method2491((byte) 12);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)I")
    public static final int method2489(int arg0, int arg1, int arg2) {
        if (arg2 < 125) {
            return -44;
        } else {
            field5913++;
            return arg1 == 1 || arg1 == 3 ? class520.field7711[arg0 & 0x3] : class541.field7903[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public static void method2490(int arg0) {
        field5915 = null;
        if (arg0 == 1) {
            field5919 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
    public static final void method2491(byte arg0) {
        if (arg0 > -92) {
            return;
        }
        field5917++;
        class328 var1 = class473.field7252;
        synchronized (class473.field7252) {
            class473.field7252.method2187(-1);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lhw;B)V")
    public final void method2492(class208 arg0, byte arg1) {
        field5916++;
        while (true) {
            int var3 = arg0.method1445(90);
            if (var3 == 0) {
                int var4 = 70 % ((arg1 - 56) / 42);
                return;
            }
            this.method2488(-1, var3, arg0);
        }
    }
}
