import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class class73 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lqe;")
    public static class179 field1432 = null;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field1434 = 0;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lqe;")
    public static class179 field1440 = class206.method1380("Hidden)2use", (byte) -127);

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "[I")
    public static int[] field1441 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Lkh;")
    public static class116 field1439;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field1438;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "[I")
    public int[] field1433;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public final void method462(int arg0) {
        if (arg0 == 38) {
            class145.method930(this.field1433, this.field1437, this.field1431);
            field1435++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
    public abstract void method463(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
    public static final void method464(int arg0, int arg1) {
        if (class148.field2668 == null || arg1 > class148.field2668.length) {
            class148.field2668 = new int[arg1];
        }
        if (arg0 == -5833) {
            field1430++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method465(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public abstract void method466(int arg0, int arg1, Graphics arg2, byte arg3);

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    protected class73() {
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method467(byte arg0) {
        field1432 = null;
        field1441 = null;
        field1439 = null;
        field1440 = null;
        if (arg0 != -105) {
            field1436 = 9;
        }
    }
}
