import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class208 extends class406 {

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Ljava/lang/String;")
    private String field3120 = null;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "J")
    private long field3122 = -1L;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Ljia;")
    public static class645 field3119 = new class645();

    @OriginalMember(owner = "client!me", name = "l", descriptor = "B")
    private byte field3116;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    private int field3117;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lfca;Z)V")
    public final void method1292(class93 arg0, boolean arg1) {
        if (arg0.method793((byte) 100) != 255) {
            arg0.field1442--;
            this.field3122 = arg0.method770((byte) 109);
        }
        field3118++;
        this.field3120 = arg0.method802(arg1);
        this.field3117 = arg0.method763(76);
        this.field3116 = arg0.method766((byte) 122);
        arg0.method770((byte) 127);
        if (class678.field9441) {
            System.out.println("memberhash:" + this.field3122 + " membername:" + this.field3120);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLgca;)V")
    public final void method1291(boolean arg0, class265 arg1) {
        if (!arg0) {
            this.method1292(null, false);
        }
        field3121++;
        class692 var3 = new class692();
        var3.field9601 = this.field3120;
        var3.field9610 = this.field3116;
        var3.field9599 = this.field3117;
        arg1.method1734(1038085672, var3);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method1466(int arg0) {
        field3119 = null;
        if (arg0 != -256) {
            field3119 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static final void method1467(int arg0) {
        class35.field576 = arg0;
    }
}
