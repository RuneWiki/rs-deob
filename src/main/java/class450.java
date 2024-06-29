import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class450 {

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public int field6568 = class370.method2265(0);

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "Ljava/lang/String;")
    public String field6572;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "Ljava/lang/String;")
    public String field6567;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public int field6570;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public int field6566;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "Ljava/lang/String;")
    public String field6565;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public int field6569;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "Ljava/lang/String;")
    public String field6571;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public int field6564;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "Lub;")
    public static class18 field6574 = new class18();

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6576 = new Rectangle[100];

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "Lqt;")
    public static class459 field6578 = new class459(51, 0);

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "Ljk;")
    public static class456 field6577;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)I")
    public static final int method2680(int arg0, int arg1) {
        field6573++;
        if (arg0 != 27197) {
            field6574 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
    public final void method2681(String arg0, int arg1, String arg2, int arg3, String arg4, int arg5, String arg6, int arg7) {
        field6575++;
        this.field6568 = class370.method2265(arg5 ^ arg5);
        this.field6570 = arg7;
        this.field6565 = arg2;
        this.field6569 = arg1;
        this.field6572 = arg6;
        this.field6567 = arg0;
        this.field6566 = arg3;
        this.field6564 = class24.field349;
        this.field6571 = arg4;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    public static void method2682(int arg0) {
        if (arg0 != 51) {
            method2682(33);
        }
        field6577 = null;
        field6576 = null;
        field6578 = null;
        field6574 = null;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class450(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6) {
        this.field6572 = arg3;
        this.field6567 = arg4;
        this.field6570 = arg0;
        this.field6566 = arg1;
        this.field6565 = arg6;
        this.field6569 = arg5;
        this.field6571 = arg2;
        this.field6564 = class24.field349;
    }
}
