import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class346 extends class431 {

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Lhn;")
    public static class509 field5115 = new class509(54, -1);

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Lhn;")
    public static class509 field5119 = new class509(14, 4);

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public int field5117;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public int field5118;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "[I")
    public int[] field5114;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V")
    public static final void method2155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 > -13) {
            method2155(54, -112, -102, 48, 79);
        }
        if (arg2 > arg1) {
            class359.method2255((byte) -119, class416.field6200[arg0], arg2, arg1, arg3);
        } else {
            class359.method2255((byte) -115, class416.field6200[arg0], arg1, arg2, arg3);
        }
        field5116++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method1904(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
    public static final void method2156(int arg0, int arg1) {
        field5122++;
        int var2 = -68 / ((52 - arg0) / 40);
        class28.field335 = arg1;
        class508.field7441.method93((byte) 87);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static final void method2157(byte arg0) {
        if (arg0 <= -78) {
            class245.field3854 = false;
            class475.field6865 = null;
            field5121++;
            class152.method1044((byte) -126);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method2158(int arg0) {
        if (arg0 == 4) {
            field5119 = null;
            field5115 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Luq;ILuq;)V")
    public static final void method2159(class114 arg0, int arg1, class114 arg2) {
        field5120++;
        class74.method640(-29627, class308.field4640);
        class36.field434++;
        class71.field1020.method1566(true, arg2.field1644);
        if (arg1 != 14) {
            return;
        }
        class71.field1020.method1524(arg2.field1670, 128);
        class71.field1020.method1522(arg0.field1644, (byte) 107);
        class71.field1020.method1524(arg0.field1670, 128);
        class71.field1020.method1508(-128, arg0.field1630);
        class71.field1020.method1539((byte) -103, arg2.field1630);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method1905(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public abstract void method1903(Canvas arg0, boolean arg1);
}
