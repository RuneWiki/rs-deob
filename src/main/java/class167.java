import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class167 extends class181 {

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field2455 = 0;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2466 = "Loaded input handler";

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field2461 = -1;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field2465 = 0;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "Ljava/awt/Frame;")
    public static Frame field2459;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "[[[B")
    public static byte[][][] field2460;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lca;I)Lw;")
    public static final class250 method1132(class54 arg0, int arg1) {
        field2463++;
        if (arg1 != 0) {
            method1134(-53, 105);
        }
        return new class250(arg0.method457((byte) 123), arg0.method457((byte) 82), arg0.method457((byte) 37), arg0.method457((byte) 126), arg0.method408(8), arg0.method407(255));
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
    public static void method1133(int arg0) {
        field2460 = null;
        field2466 = null;
        if (arg0 == 0) {
            field2459 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)Llk;")
    public static final class232 method1134(int arg0, int arg1) {
        field2464++;
        class232 var2 = (class232) class151.field2206.method945((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -1) {
            method1132((class54) null, -67);
        }
        byte[] var3 = class216.field3316.method1605(-128, arg1, 34);
        class232 var4 = new class232();
        if (var3 != null) {
            var4.method1583(new class54(var3), (byte) -102, arg1);
        }
        class151.field2206.method941(var4, (long) arg1, -8447);
        return var4;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(II)V")
    public class167(int arg0, int arg1) {
        this.field2456 = arg0;
        this.field2462 = arg1;
    }
}
