import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class230 {

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Lqd;")
    public static class173 field3726 = new class173(30);

    @OriginalMember(owner = "client!li", name = "k", descriptor = "[[B")
    public static byte[][] field3730 = new byte[1000][];

    @OriginalMember(owner = "client!li", name = "j", descriptor = "[I")
    public static int[] field3729 = new int[25];

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field3731 = 0;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public int field3723;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Lbg;")
    public static class172 field3720;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1551(String arg0, byte arg1) {
        field3728++;
        if (arg1 != -87) {
            field3731 = 123;
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method1552(int arg0) {
        field3729 = null;
        field3726 = null;
        field3720 = null;
        if (arg0 > -71) {
            field3729 = null;
        }
        field3730 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Lqi;")
    public final class232 method1553(boolean arg0) {
        if (arg0) {
            this.method1553(false);
        }
        field3722++;
        class232 var2 = (class232) class49.field811.method1261(0, (long) this.field3721);
        if (var2 != null) {
            return var2;
        }
        class232 var3 = class177.method1300(-28957, this.field3721, class82.field1370, 0);
        if (var3 != null) {
            class49.field811.method1264(-1, (long) this.field3721, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLwd;II)V")
    private final void method1554(boolean arg0, class162 arg1, int arg2, int arg3) {
        if (arg0) {
            field3726 = null;
        }
        if (arg2 == 1) {
            this.field3721 = arg1.method1142(-18970);
        } else if (arg2 == 2) {
            this.field3723 = arg1.method1133((byte) 53);
            this.field3724 = arg1.method1133((byte) 53);
        }
        field3732++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILwd;)V")
    public final void method1555(int arg0, int arg1, class162 arg2) {
        if (arg1 > -95) {
            return;
        }
        while (true) {
            int var4 = arg2.method1133((byte) 53);
            if (var4 == 0) {
                field3727++;
                return;
            }
            this.method1554(false, arg2, var4, arg0);
        }
    }
}
