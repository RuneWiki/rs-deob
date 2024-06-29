import java.awt.Canvas;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class530 extends Canvas {

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field7622;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "[I")
    public static int[] field7620 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "[I")
    public static int[] field7624 = new int[4096];

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "[I")
    public static int[] field7625 = new int[6];

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field7619;

    @OriginalMember(owner = "client!gr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field7617++;
        this.field7622.paint(arg0);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILraa;)V")
    public static final void method3139(int arg0, int arg1, int arg2, class353 arg3) {
        if (arg0 != 4) {
            return;
        }
        field7623++;
        if (arg3.field5248 == 0) {
            arg3.field5296 = arg3.field5203;
        } else if (arg3.field5248 == 1) {
            arg3.field5296 = (arg1 - arg3.field5280) / 2 + arg3.field5203;
        } else if (arg3.field5248 == 2) {
            arg3.field5296 = arg1 - arg3.field5203 - arg3.field5280;
        } else if (arg3.field5248 == 3) {
            arg3.field5296 = arg3.field5203 * arg1 >> 14;
        } else if (arg3.field5248 == 4) {
            arg3.field5296 = (arg3.field5203 * arg1 >> 14) + (arg1 - arg3.field5280) / 2;
        } else {
            arg3.field5296 = arg1 - (arg3.field5203 * arg1 >> 14) - arg3.field5280;
        }
        if (arg3.field5357 == 0) {
            arg3.field5359 = arg3.field5240;
        } else if (arg3.field5357 == 1) {
            arg3.field5359 = (arg2 - arg3.field5230) / 2 + arg3.field5240;
        } else if (arg3.field5357 == 2) {
            arg3.field5359 = arg2 - arg3.field5230 - arg3.field5240;
        } else if (arg3.field5357 == 3) {
            arg3.field5359 = arg3.field5240 * arg2 >> 14;
        } else if (arg3.field5357 == 4) {
            arg3.field5359 = (arg2 - arg3.field5230) / 2 + (arg3.field5240 * arg2 >> 14);
        } else {
            arg3.field5359 = arg2 - arg3.field5230 - (arg3.field5240 * arg2 >> 14);
        }
        if (!class107.field1563 || client.method2735(arg3).field4391 == 0 && arg3.field5306 != 0) {
            return;
        }
        if (arg3.field5296 < 0) {
            arg3.field5296 = 0;
        } else if (arg3.field5296 + arg3.field5280 > arg1) {
            arg3.field5296 = arg1 - arg3.field5280;
        }
        if (arg3.field5359 < 0) {
            arg3.field5359 = 0;
        } else if (arg2 < (arg3.field5359 + arg3.field5230)) {
            arg3.field5359 = arg2 - arg3.field5230;
            return;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method3140(int arg0) {
        if (arg0 != 99) {
            method3139(-87, 73, 88, null);
        }
        field7620 = null;
        field7619 = null;
        field7625 = null;
        field7624 = null;
    }

    @OriginalMember(owner = "client!gr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field7622.update(arg0);
        field7621++;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class530(Component arg0) {
        this.field7622 = arg0;
    }
}
