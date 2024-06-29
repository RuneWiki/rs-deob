import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class565 extends class424 {

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public int field7563 = (int) (class302.method1910(0) / 1000L);

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Ljava/lang/String;")
    public String field7564;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "S")
    public short field7566;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "[[I")
    public static int[][] field7568 = new int[6][];

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "Ljw;")
    public static class581 field7565 = new class581(68, 12);

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "[I")
    public static int[] field7570;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static void method3161(int arg0) {
        field7570 = null;
        if (arg0 != 6) {
            method3163(true, (byte) -89);
        }
        field7565 = null;
        field7568 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
    public static final void method3162(int arg0, int arg1, Rectangle[] arg2) throws class566 {
        field7569++;
        if (~class669.field9399 == arg0) {
            class86.field1200.method487(arg2, arg1, class109.field1510, class107.field1479);
        } else {
            class86.field1200.method487(arg2, arg1, 0, 0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class565(String arg0, int arg1) {
        this.field7564 = arg0;
        this.field7566 = (short) arg1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZB)V")
    public static final void method3163(boolean arg0, byte arg1) {
        field7567++;
        if (arg1 != -102) {
            field7570 = null;
        }
        int var2 = class156.field2150;
        int var3 = class632.field8831;
        if (arg0 && class200.field2658) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class379.field5542.method466(var3, var2);
    }
}
