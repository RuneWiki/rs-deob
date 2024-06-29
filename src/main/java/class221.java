import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class221 extends class258 {

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3005 = null;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "B")
    private byte field3002;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "B")
    private byte field3006;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "B")
    private byte field3007;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "B")
    private byte field3008;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "Ljava/lang/Object;")
    public static Object field3009;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Z")
    private boolean field3010;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLmc;)V")
    public final void method546(byte arg0, class234 arg1) {
        this.field3010 = arg1.method1509(true) == 1;
        field3004++;
        this.field3002 = arg1.method1554(27806);
        this.field3008 = arg1.method1554(27806);
        this.field3007 = arg1.method1554(27806);
        this.field3006 = arg1.method1554(27806);
        int var3 = 111 % ((7 - arg0) / 41);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method1437(byte arg0) {
        int var1 = -12 % ((arg0 + 21) / 42);
        field3005 = null;
        field3009 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lim;B)V")
    public final void method547(class652 arg0, byte arg1) {
        field3003++;
        arg0.field8319 = this.field3007;
        arg0.field8324 = this.field3006;
        arg0.field8321 = this.field3010;
        arg0.field8320 = this.field3002;
        if (arg1 >= 123) {
            arg0.field8317 = this.field3008;
        }
    }
}
