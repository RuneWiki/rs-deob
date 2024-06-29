import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class278 {

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "B")
    private byte field3716;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field3706 = -1;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Z")
    public static boolean field3717 = true;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Liia;")
    public static class89 field3705 = new class89();

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Lhh;")
    public static class131 field3718;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1654(boolean arg0) {
        field3718 = null;
        field3705 = null;
        if (!arg0) {
            method1660(27, true, false);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ltm;BLtm;)V", line = 20)
    public static final void method1655(class392 arg0, byte arg1, class392 arg2) {
        field3708++;
        if (arg1 != 37) {
            return;
        }
        if (arg2.field5560 != null) {
            arg2.method2287((byte) -90);
        }
        arg2.field5555 = arg0.field5555;
        arg2.field5560 = arg0;
        arg2.field5560.field5555 = arg2;
        arg2.field5555.field5560 = arg2;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)I", line = 42)
    public final int method1656(boolean arg0) {
        field3712++;
        if (!arg0) {
            method1654(false);
        }
        return (this.field3716 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 56)
    public static final void method1657(Canvas arg0, int arg1) {
        field3714++;
        Dimension var2 = arg0.getSize();
        class702.method3957(var2.height, var2.width, 2);
        if (arg1 != 7) {
            method1657(null, -101);
        }
        if (class392.field5553 == 1) {
            class603.field8409.method340(arg0, class582.field8155, class569.field8021);
        } else {
            class603.field8409.method340(arg0, class460.field6372, class135.field1726);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I", line = 78)
    public final int method1658(int arg0) {
        if (arg0 != 7) {
            this.field3709 = 29;
        }
        field3703++;
        return this.field3716 & 0x7;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Lwo;", line = 92)
    public static final class744 method1659(int arg0, int arg1, int arg2) {
        class624 var3 = class77.field947[arg0][arg1][arg2];
        return var3 == null ? null : var3.field8738;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 101)
    public class278() {
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZZ)V", line = 104)
    public static final void method1660(int arg0, boolean arg1, boolean arg2) {
        field3713++;
        if (arg1) {
            class526.field7069++;
            class663.method3748(false);
        }
        if (arg2) {
            class595.field8284++;
            class424.method2427((byte) -110);
        }
        if (arg0 != 8) {
            field3718 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lji;)V", line = 127)
    public class278(class611 arg0) {
        this.field3716 = arg0.method3390((byte) -19);
        this.field3710 = arg0.method3402((byte) 127);
        this.field3704 = arg0.method3418(-2);
        this.field3711 = arg0.method3418(-2);
        this.field3709 = arg0.method3418(-2);
        this.field3707 = arg0.method3418(-2);
    }
}
