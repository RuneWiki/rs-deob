import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class386 extends class121 {

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Lfj;")
    public static class437 field5688 = new class437(14, 1);

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "Lfj;")
    public static class437 field5691 = new class437(15, 4);

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "Lfj;")
    public static class437 field5692 = new class437(16, -2);

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "Lfj;")
    public static class437 field5693 = new class437(17, 0);

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "Lfj;")
    public static class437 field5694 = new class437(18, -2);

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "Lfj;")
    public static class437 field5695 = new class437(20, 6);

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "Lfj;")
    public static class437 field5696 = new class437(21, 8);

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "Lfj;")
    public static class437 field5697 = new class437(22, -2);

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Lfj;")
    public static class437 field5698 = new class437(23, 4);

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "Lfj;")
    public static class437 field5699 = new class437(24, -1);

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "[Lfj;")
    private static class437[] field5700 = new class437[32];

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "Lpf;")
    public static class425 field5701;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "Lpf;")
    public static class425 field5704;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "Ljg;")
    public static class241 field5705;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "Lbl;")
    public static class211 field5702;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
    public static void method2383(byte arg0) {
        field5695 = null;
        field5702 = null;
        field5698 = null;
        field5700 = null;
        field5693 = null;
        field5696 = null;
        field5691 = null;
        field5692 = null;
        field5697 = null;
        field5694 = null;
        field5705 = null;
        field5688 = null;
        field5701 = null;
        if (arg0 < 100) {
            method2385(91, -8, 56);
        }
        field5699 = null;
        field5704 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2384(int arg0, String arg1) {
        if (arg0 == -4580) {
            field5690++;
            return arg1.length() + 1;
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Lo;")
    public static final class316 method2385(int arg0, int arg1, int arg2) {
        class13 var3 = class277.field4216[arg0][arg1][arg2];
        return var3 == null || var3.field166 == null ? null : var3.field166;
    }

    static {
        class437[] var0 = class90.method592(true);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field5700[var0[var1].field6435] = var0[var1];
        }
        field5703 = -1;
        field5701 = new class425(5, -1);
        field5704 = new class425(52, -1);
        field5705 = new class241(260);
    }
}
