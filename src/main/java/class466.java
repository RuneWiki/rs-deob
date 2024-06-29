import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public abstract class class466 extends class668 {

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "S")
    public short field6791;

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "S")
    public short field6798;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6792 = new Rectangle[100];

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "Lwk;")
    public static class430 field6797;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "[Lit;")
    public static class34[] field6800;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(B)Z")
    public final boolean method1468(byte arg0) {
        if (arg0 > -82) {
            return false;
        } else {
            ++field6789;
            return class52.field838[(super.field9477 >> class662.field9425) - -class155.field2405 + -class336.field4923][(super.field9475 >> class662.field9425) + -class63.field996 + class155.field2405];
        }
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(B)V")
    public static void method2857(byte arg0) {
        field6792 = null;
        field6797 = null;
        field6800 = null;
        if (arg0 != -80) {
            field6800 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZILha;Lov;IIZ)V")
    public final void method104(boolean arg0, int arg1, class544 arg2, class668 arg3, int arg4, int arg5, boolean arg6) {
        if (arg0) {
            this.method92(110);
        }
        ++field6790;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "(I)Z")
    public final boolean method92(int arg0) {
        ++field6795;
        return arg0 != 2 ? false : false;
    }

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "(I)V")
    public final void method102(int arg0) {
        if (arg0 != 0) {
            this.method1469((class759[]) null, -44);
        }
        ++field6796;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([Lvt;I)I")
    public final int method1469(class759[] arg0, int arg1) {
        ++field6793;
        if (arg1 < 104) {
            this.method1469((class759[]) null, -38);
        }
        return this.method3746(super.field9477 >> class662.field9425, 0, arg0, super.field9475 >> class662.field9425);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILha;)Z")
    public final boolean method1467(int arg0, class544 arg1) {
        if (arg0 > -26) {
            this.method1468((byte) 68);
        }
        ++field6794;
        return class16.method90(true, super.field9477 >> class662.field9425, super.field9469, super.field9475 >> class662.field9425, this.method100((byte) 95));
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(IIIIIII)V")
    public class466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field9469 = (byte) arg4;
        super.field9477 = arg0;
        super.field9474 = arg1;
        super.field9475 = arg2;
        this.field6791 = (short) arg5;
        this.field6798 = (short) arg6;
        super.field9470 = (byte) arg3;
    }

    static {
        for (int var0 = 0; var0 < 100; ++var0) {
            field6792[var0] = new Rectangle();
        }
        field6797 = new class430(10, 19);
    }
}
