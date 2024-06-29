import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public abstract class class116 extends class291 {

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "S")
    public short field1736;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "S")
    public short field1742;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "S")
    public short field1730;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "B")
    public byte field1733;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "B")
    public byte field1738;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public int field1732;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "S")
    public short field1729;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Z")
    public boolean field1731;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1739 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field1743 = 0;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 5)
    public static void method827(boolean arg0) {
        field1739 = null;
        if (!arg0) {
            field1741 = -112;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V", line = 20)
    public static final void method828(int arg0, int arg1, int arg2) {
        class486 var3 = class89.field1305[arg0][arg1][arg2];
        if (var3 != null && var3.field7100 != null) {
            var3.field7100 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "(I)V", line = 36)
    public void method610(int arg0) {
        field1737++;
        if (arg0 != 7) {
            this.method610(-64);
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 56)
    public class116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field1736 = (short) arg5;
        this.field1742 = (short) arg7;
        this.field1730 = (short) arg6;
        this.field1733 = arg9;
        this.field1735 = arg3;
        this.field1738 = (byte) arg0;
        this.field1732 = arg1;
        this.field1729 = (short) arg4;
        this.field1734 = arg2;
        this.field1731 = arg8;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)I")
    public abstract int method792(boolean arg0);
}
