import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class517 extends class263 {

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "S")
    public short field6544;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "[[Z")
    public static boolean[][] field6543 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "[B")
    public static byte[] field6545 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lfu;Lfu;I)V", line = 7)
    public static final void method2804(class363 arg0, class363 arg1, int arg2) {
        if (arg0.field4647 != null) {
            arg0.method2110(126);
        }
        if (arg2 >= -9) {
            method2804(null, null, 121);
        }
        field6546++;
        arg0.field4647 = arg1;
        arg0.field4652 = arg1.field4652;
        arg0.field4647.field4652 = arg0;
        arg0.field4652.field4647 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Llh;", line = 29)
    public static final class492 method2805(int arg0, int arg1) {
        field6547++;
        class492[] var2 = class522.method2819(true);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class492 var4 = var2[var3];
            if (var4.field6138 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 53)
    public class517() {
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 56)
    public static void method2806(byte arg0) {
        field6545 = null;
        if (arg0 != 47) {
            method2805(-63, 40);
        }
        field6543 = null;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(S)V", line = 68)
    public class517(short arg0) {
        this.field6544 = arg0;
    }
}
