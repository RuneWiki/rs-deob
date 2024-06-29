import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class408 extends class200 {

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field5784;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "[I")
    public static int[] field5785 = new int[2];

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "[I")
    public static int[] field5787 = new int[5];

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "Z")
    public static boolean field5788;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method2426(String arg0, byte arg1, int arg2) {
        field5786++;
        class275 var3 = class213.method1433((byte) 50, 3, arg2);
        var3.method1778(arg1 + 98);
        var3.field4102 = arg0;
        if (arg1 != -98) {
            method2426(null, (byte) -65, -53);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
    public static void method2427(boolean arg0) {
        field5785 = null;
        field5787 = null;
        if (arg0) {
            method2427(false);
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(I)V")
    public class408(int arg0) {
        this.field5784 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
    public final void method2428(byte arg0) {
        this.field5784.method2653();
        field5789++;
        if (arg0 != 60) {
            method2426(null, (byte) -78, 43);
        }
    }

    static {
        new class44("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
