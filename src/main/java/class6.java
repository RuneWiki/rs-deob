import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static volatile int field115 = -1;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field106 = 0;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lmb;")
    private static class84 field118 = class79.method672(true, "The server is being updated)3");

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Lmb;")
    private static class84 field114 = class79.method672(true, "Loading game screen )2 ");

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lmb;")
    public static class84 field110 = class79.method672(true, "0(U");

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lmb;")
    public static class84 field102 = field118;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Lmb;")
    public static class84 field108 = field114;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field119 = 0;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Ljava/awt/Image;")
    public static Image field109;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method35(int arg0) {
        field108 = null;
        if (arg0 != -23978) {
            method36(true, null, null, null);
        }
        field118 = null;
        field109 = null;
        field114 = null;
        field102 = null;
        field110 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLmb;Lmb;Lmb;)V")
    public static final void method36(boolean arg0, class84 arg1, class84 arg2, class84 arg3) {
        class52.field1186 = arg1;
        field104++;
        class52.field1159 = arg3;
        class52.field1179 = arg2;
        if (arg0) {
            field115 = 122;
        }
    }
}
