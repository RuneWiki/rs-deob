import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class114 {

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "S")
    public short field1508;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "B")
    public byte field1502;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "S")
    public short field1503;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public int field1510;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Z")
    public boolean field1507;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "S")
    public short field1512;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "[[[B")
    public static byte[][][] field1506;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLjava/awt/Frame;Lfl;)V", line = 3)
    public static final void method757(boolean arg0, Frame arg1, class739 arg2) {
        field1513++;
        while (true) {
            class107 var3 = arg2.method4130(-3470, arg1);
            while (var3.field1419 == 0) {
                class267.method1599(0, 10L);
            }
            if (var3.field1419 == 1) {
                arg1.setVisible(arg0);
                arg1.dispose();
                return;
            }
            class267.method1599(0, 100L);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 35)
    public static void method758(int arg0) {
        if (arg0 != 22011) {
            field1506 = null;
        }
        field1506 = null;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 51)
    public class114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1508 = (short) arg5;
        this.field1504 = arg3;
        this.field1511 = arg1;
        this.field1502 = (byte) arg8;
        this.field1503 = (short) arg6;
        this.field1510 = arg0;
        this.field1507 = arg10;
        this.field1512 = (short) arg4;
        this.field1509 = arg2;
        this.field1505 = arg11;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Lic;", line = 74)
    public static final class699 method759(int arg0, int arg1, int arg2) {
        class624 var3 = class77.field947[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class699 var4 = var3.field8735;
            var3.field8735 = null;
            class440.method2487(var4);
            return var4;
        }
    }
}
