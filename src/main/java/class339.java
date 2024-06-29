import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class339 {

    @OriginalMember(owner = "client!on", name = "e", descriptor = "J")
    public long field4566;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "Lhl;")
    private class529 field4575;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field4568 = 50;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "[I")
    public static int[] field4567 = new int[field4568];

    @OriginalMember(owner = "client!on", name = "l", descriptor = "[I")
    public static int[] field4573 = new int[field4568];

    @OriginalMember(owner = "client!on", name = "k", descriptor = "[I")
    public static int[] field4572 = new int[field4568];

    @OriginalMember(owner = "client!on", name = "j", descriptor = "[I")
    public static int[] field4571 = new int[field4568];

    @OriginalMember(owner = "client!on", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4562 = new String[field4568];

    @OriginalMember(owner = "client!on", name = "h", descriptor = "[I")
    public static int[] field4569 = new int[field4568];

    @OriginalMember(owner = "client!on", name = "b", descriptor = "[I")
    public static int[] field4563 = new int[field4568];

    @OriginalMember(owner = "client!on", name = "i", descriptor = "Llga;")
    public static class712 field4570 = new class712(62, 1);

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field4577 = 1;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public static final void method2000(int arg0) {
        int var1 = -17 / ((-arg0 - 9) / 48);
        for (class227 var2 = (class227) class139.field1783.method724(32); var2 != null; var2 = (class227) class139.field1783.method723(101)) {
            if (class404.method2339(var2.field2948, 255)) {
                class268.method1602(var2, -32612);
            }
        }
        field4564++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
    public static final void method2001(byte arg0) {
        field4576++;
        class395.field5617.method434(((float) class11.field68.field5523.method746((byte) 125) * 0.1F + 0.7F) * class357.field4745);
        class395.field5617.method380(class324.field4353, class274.field3665, class406.field5730, (float) (class456.field6318 << 2), (float) (class128.field1671 << 2), (float) (class410.field5780 << 2));
        class395.field5617.method387(class464.field6427);
        if (arg0 != -74) {
            field4569 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4565++;
        this.field4575.method2929(0, this.field4566);
        super.finalize();
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
    public static final void method2002(int arg0) {
        class166.method972(false);
        field4574++;
        int var1 = class11.field68.field5543.method1144((byte) 120);
        if (var1 == 2) {
            class565.method3182((byte) 17, class21.field142, class512.field6932, class546.field7710, 100, 100);
        } else if (var1 == 3) {
            class341.method2011(-120, 2, class546.field7710, class277.field3698, class21.field142, class13.field80, 2, class512.field6932);
        }
        if (arg0 >= -30) {
            method2000(-126);
        }
        if (class11.field68.field5543.method1142((byte) -77)) {
            class218.method1238(class725.field10121, 0);
        }
        if (class21.field142 != null) {
            class214.method1191(99);
        }
        class670.field9312 = class11.field68.field5543.method1144((byte) 122) != 0;
        class247.field3206 = class11.field68.field5543.method1142((byte) -58);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
    public static void method2003(byte arg0) {
        field4570 = null;
        field4571 = null;
        field4562 = null;
        if (arg0 > -70) {
            return;
        }
        field4573 = null;
        field4572 = null;
        field4563 = null;
        field4569 = null;
        field4567 = null;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lhl;JI)V")
    public class339(class529 arg0, long arg1, int arg2) {
        this.field4566 = arg1;
        this.field4575 = arg0;
    }
}
