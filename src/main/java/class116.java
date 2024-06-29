import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class116 extends class316 {

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field1453 = -1;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "B")
    private byte field1456;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "B")
    private byte field1457;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "Ljava/lang/String;")
    private String field1452;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILrv;)V")
    public final void method818(int arg0, class120 arg1) {
        this.field1452 = arg1.method891(arg0 + 18542);
        if (arg0 != -2) {
            this.method818(78, null);
        }
        field1454++;
        if (this.field1452 != null) {
            arg1.method842(2384);
            this.field1456 = arg1.method877(-252);
            this.field1457 = arg1.method877(-252);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lua;I)V")
    public final void method819(class692 arg0, int arg1) {
        if (this.field1452 != null) {
            arg0.field9785 = this.field1456;
            arg0.field9772 = this.field1457;
        }
        if (arg1 == 0) {
            arg0.field9771 = this.field1452;
            field1455++;
        }
    }
}
