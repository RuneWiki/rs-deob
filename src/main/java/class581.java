import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class581 extends class198 {

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "Lsaa;")
    public static class657 field8361 = new class657();

    @OriginalMember(owner = "client!vaa", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field8364 = new String[100];

    @OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
    private int field8360;

    @OriginalMember(owner = "client!vaa", name = "t", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!vaa", name = "u", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!vaa", name = "x", descriptor = "I")
    private int field8366;

    @OriginalMember(owner = "client!vaa", name = "w", descriptor = "[Lmq;")
    public static class85[] field8365;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZLol;)V")
    public final void method855(boolean arg0, class431 arg1) {
        field8362++;
        this.field8360 = arg1.method2526(17);
        if (!arg0) {
            method3412((byte) 116);
        }
        this.field8366 = arg1.method2526(17);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V")
    public static void method3412(byte arg0) {
        field8365 = null;
        field8361 = null;
        if (arg0 <= 95) {
            field8361 = null;
        }
        field8364 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILlm;)V")
    public final void method858(int arg0, class50 arg1) {
        arg1.method405(4, this.field8366, this.field8360);
        field8363++;
        if (arg0 != 3) {
            field8364 = null;
        }
    }
}
