import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class253 extends class683 {

    @OriginalMember(owner = "client!rga", name = "r", descriptor = "Ljava/lang/String;")
    private String field3714 = null;

    @OriginalMember(owner = "client!rga", name = "v", descriptor = "J")
    private long field3718 = -1L;

    @OriginalMember(owner = "client!rga", name = "u", descriptor = "Lmw;")
    public static class517 field3717 = new class517(21, 8);

    @OriginalMember(owner = "client!rga", name = "w", descriptor = "I")
    public static int field3719 = 0;

    @OriginalMember(owner = "client!rga", name = "s", descriptor = "B")
    private byte field3715;

    @OriginalMember(owner = "client!rga", name = "p", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!rga", name = "q", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!rga", name = "t", descriptor = "I")
    private int field3716;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Ldt;I)V")
    public final void method1666(class254 arg0, int arg1) {
        if (arg1 > -81) {
            this.field3714 = null;
        }
        field3712++;
        if (arg0.method1731((byte) 64) != 255) {
            arg0.field3725--;
            this.field3718 = arg0.method1723(21795);
        }
        this.field3714 = arg0.method1694(0);
        this.field3716 = arg0.method1728((byte) 81);
        this.field3715 = arg0.method1737(true);
        arg0.method1723(21795);
        if (class632.field8552) {
            System.out.println("memberhash:" + this.field3718 + " membername:" + this.field3714);
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)V")
    public static void method1667(int arg0) {
        if (arg0 != 21) {
            method1667(-12);
        }
        field3717 = null;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lhr;B)V")
    public final void method1668(class551 arg0, byte arg1) {
        field3713++;
        class85 var3 = new class85();
        if (arg1 != -60) {
            field3719 = -51;
        }
        var3.field1210 = this.field3716;
        var3.field1209 = this.field3715;
        var3.field1206 = this.field3714;
        arg0.method3164((byte) 78, var3);
    }
}
