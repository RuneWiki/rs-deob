import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class129 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "S")
    public short field1737;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lms;")
    public class541 field1742;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "B")
    public byte field1738;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "B")
    public byte field1740;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lps;")
    public static class63 field1739 = new class63();

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1744;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public static final void method875(int arg0, int arg1) {
        class423 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class23 var4 = class414.field6317[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class475.field7051; var5++) {
                    for (int var6 = 0; var6 < class533.field7842; var6++) {
                        var2 = var4.method215(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class10.field179;
                            int var8 = var5 << class10.field179;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class23 var10 = class414.field6317[var9];
                                if (var10 != null) {
                                    int var11 = var4.method222(var6, var5) - var10.method222(var6, var5);
                                    int var12 = var4.method222(var6 + 1, var5) - var10.method222(var6 + 1, var5);
                                    int var13 = var4.method222(var6 + 1, var5 + 1) - var10.method222(var6 + 1, var5 + 1);
                                    int var14 = var4.method222(var6, var5 + 1) - var10.method222(var6, var5 + 1);
                                    var10.method223(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method876(int arg0) {
        field1744 = null;
        if (arg0 != 1) {
            field1741 = 75;
        }
        field1739 = null;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lms;III)V")
    public class129(class541 arg0, int arg1, int arg2, int arg3) {
        this.field1737 = (short) arg1;
        this.field1742 = arg0;
        this.field1738 = (byte) arg2;
        this.field1740 = (byte) arg3;
    }

    static {
        new class446("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
    }
}
