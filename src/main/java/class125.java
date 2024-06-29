import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public abstract class class125 extends class513 {

    @OriginalMember(owner = "client!sfa", name = "m", descriptor = "S")
    public static short field1702 = 1;

    @OriginalMember(owner = "client!sfa", name = "o", descriptor = "Lju;")
    public static class102 field1704 = new class102(7, 8);

    @OriginalMember(owner = "client!sfa", name = "k", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "client!sfa", name = "l", descriptor = "I")
    public int field1701;

    @OriginalMember(owner = "client!sfa", name = "p", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!sfa", name = "q", descriptor = "Lca;")
    public static class610 field1706;

    @OriginalMember(owner = "client!sfa", name = "n", descriptor = "[I")
    public int[] field1703;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V", line = 4)
    public static void method799(int arg0) {
        field1706 = null;
        field1704 = null;
        if (arg0 != 1) {
            method799(-51);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIBLjava/awt/Graphics;IIII)V")
    public abstract void method798(int arg0, int arg1, byte arg2, Graphics arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILjava/awt/Canvas;IB)V")
    public abstract void method800(int arg0, Canvas arg1, int arg2, byte arg3);
}
