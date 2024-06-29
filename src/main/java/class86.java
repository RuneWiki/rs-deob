import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public abstract class class86 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Lbd;")
    public static class162 field1523 = class17.method142(0, "M");

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field1524 = 0;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1527 = -1;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Lli;")
    public static class18 field1525 = new class18();

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field1533 = -1;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Lbd;")
    public static class162 field1534 = class17.method142(0, "");

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field1535 = 0;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field1531;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[I")
    public int[] field1526;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "[[[Lnm;")
    public static class225[][][] field1528;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V", line = 23)
    public final void method654(boolean arg0) {
        if (!arg0) {
            class316.method2154(this.field1526, this.field1529, this.field1532);
            field1530++;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 42)
    public static void method655(byte arg0) {
        field1525 = null;
        field1528 = (class225[][][]) null;
        field1523 = null;
        if (arg0 != 1) {
            method655((byte) 34);
        }
        field1534 = null;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 78)
    protected class86() {
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public abstract void method10(byte arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method11(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V")
    public abstract void method12(int arg0, Graphics arg1, int arg2, int arg3, byte arg4, int arg5);
}
