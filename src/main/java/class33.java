import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class33 extends class154 {

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "S")
    public short field560;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "Lot;")
    public static class617 field562 = new class617(1);

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
    public static void method196(int arg0) {
        if (arg0 != 1) {
            method199(true, null);
        }
        field562 = null;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V")
    public static final void method197(int arg0, int arg1, int arg2) {
        class549 var3 = class325.field4448[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class9.method60(var3.field7464);
        class9.method60(var3.field7467);
        if (var3.field7464 != null) {
            var3.field7464 = null;
        }
        if (var3.field7467 != null) {
            var3.field7467 = null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "()V")
    public class33() {
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(S)V")
    public class33(short arg0) {
        this.field560 = arg0;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)V")
    public static final void method198(boolean arg0) {
        class789.field10821.method1529(false);
        field564++;
        class420.field5727.method1321((byte) -47);
        class594.field8348.method2017(29560);
        class558.field7896.setBackground(Color.black);
        class110.field1715 = -1;
        class789.field10821 = class644.method3583(102, class558.field7896);
        class420.field5727 = class271.method1758(class558.field7896, (byte) -111, arg0);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZLwda;)V")
    public static final void method199(boolean arg0, class666 arg1) {
        if (!arg0) {
            field562 = null;
        }
        field563++;
        for (class570 var2 = (class570) class536.field7294.method3589((byte) -127); var2 != null; var2 = (class570) class536.field7294.method3591(0)) {
            if (var2.field8104 == arg1) {
                if (var2.field8114 != null) {
                    class456.field6213.method352(var2.field8114);
                    var2.field8114 = null;
                }
                var2.method1207(89);
                return;
            }
        }
    }
}
