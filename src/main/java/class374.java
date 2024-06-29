import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class374 extends class472 {

    @OriginalMember(owner = "client!te", name = "F", descriptor = "Lu;")
    public class349 field5529;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Ldv;")
    public class508 field5532;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "Lfi;")
    public static class38 field5527 = null;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "Lpu;")
    public static class179 field5528 = new class179("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!te", name = "M", descriptor = "Ljp;")
    public static class55 field5536 = new class55(76, -1);

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public int field5524;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public int field5525;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public int field5530;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public int field5531;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public int field5535;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
    public static void method2395(byte arg0) {
        if (arg0 < 31) {
            method2395((byte) -38);
        }
        field5527 = null;
        field5528 = null;
        field5536 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public final void method2396(int arg0) {
        this.field5525 = this.field5529.field5202;
        field5526++;
        this.field5531 = this.field5529.field5203;
        this.field5530 = this.field5529.field5210;
        if (this.field5529.field5200 != null) {
            this.field5529.field5200.method965(this.field5532.field7386, this.field5532.field7400, this.field5532.field7384, class86.field1404);
        }
        this.field5524 = class86.field1404[2];
        if (arg0 != 15793) {
            this.field5524 = -67;
        }
        this.field5535 = class86.field1404[0];
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lu;Ltd;)V")
    public class374(class349 arg0, class382 arg1) {
        this.field5529 = arg0;
        this.field5532 = this.field5529.method2242(-124);
        this.method2396(15793);
    }
}
