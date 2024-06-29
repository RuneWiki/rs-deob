import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class class540 extends class69 {

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field7468 = -60;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public int field7465;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public int field7470;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lae;")
    public static class283 field7466;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "[I")
    public int[] field7471;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLd;Lae;)V", line = 6)
    public static final void method3209(byte arg0, class101 arg1, class283 arg2) {
        class785.field10772 = arg1;
        class130.field1675 = arg2;
        int var3 = 82 / ((arg0 + 35) / 36);
        field7464++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 30)
    public static void method3210(byte arg0) {
        if (arg0 != 21) {
            method3209((byte) 38, null, null);
        }
        field7466 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILpq;III)Liq;", line = 41)
    public static final class227 method3211(int arg0, int arg1, class194 arg2, int arg3, int arg4, int arg5) {
        if (arg0 >= -106) {
            method3210((byte) -104);
        }
        field7472++;
        if (!arg2.field2735 && (!class65.method506(arg1, 30440) || !class65.method506(arg3, 30440))) {
            return arg2.field2736 ? new class227(arg2, 34037, arg4, arg5, arg1, arg3, true) : new class227(arg2, arg4, arg5, arg1, arg3, class179.method1142(arg1, -52), class179.method1142(arg3, 86), true);
        } else {
            return new class227(arg2, 3553, arg4, arg5, arg1, arg3, true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIBIILjava/awt/Graphics;)V")
    public abstract void method1622(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, Graphics arg7);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Canvas;IIB)V")
    public abstract void method1621(Canvas arg0, int arg1, int arg2, byte arg3);
}
