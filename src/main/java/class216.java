import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class216 extends class392 {

    @OriginalMember(owner = "client!afa", name = "l", descriptor = "Lsv;")
    public static class570 field3148 = new class570(82, -1);

    @OriginalMember(owner = "client!afa", name = "m", descriptor = "Lin;")
    public static class380 field3149 = new class380(16, 6);

    @OriginalMember(owner = "client!afa", name = "o", descriptor = "[I")
    public static int[] field3151 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!afa", name = "q", descriptor = "Lsv;")
    public static class570 field3153 = new class570(36, 8);

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!afa", name = "k", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!afa", name = "n", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!afa", name = "p", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!afa", name = "r", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!afa", name = "s", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!afa", name = "t", descriptor = "Lgga;")
    public static class513 field3156;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V")
    public static void method1482(byte arg0) {
        field3151 = null;
        field3148 = null;
        if (arg0 != -27) {
            field3148 = null;
        }
        field3149 = null;
        field3156 = null;
        field3153 = null;
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        ++field3154;
        if (super.field5454.method3782((byte) 122)) {
            return 3;
        } else {
            return arg1 >= -124 ? 25 : 1;
        }
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lw;)V")
    public class216(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        super.field5452 = arg1;
        int var3 = -103 / ((arg0 - -80) / 38);
        ++field3146;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(III)Z")
    public static final boolean method1483(int arg0, int arg1, int arg2) {
        ++field3143;
        if (!(~(arg1 & 65536) != arg0 | class637.method3628(true, arg2, arg1)) && !class547.method3163((byte) -99, arg2, arg1)) {
            return (55 & arg2) == 0 && class518.method3033(arg1, arg0 + -124, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
    public static final void method1484(int arg0, int arg1, Rectangle[] arg2) throws class684 {
        ++field3144;
        if (~class388.field5420 != -2) {
            class390.field5440.method86(arg2, arg0, 0, 0);
        } else {
            class390.field5440.method86(arg2, arg0, class743.field10329, class65.field982);
        }
        if (arg1 < 101) {
            method1483(-28, -50, -56);
        }
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(ILw;)V")
    public class216(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        if (super.field5454.method3782((byte) -72)) {
            super.field5452 = 2;
        }
        ++field3150;
        if (~super.field5452 > -1 || super.field5452 > 2) {
            super.field5452 = this.method292(true);
        }
        if (arg0) {
            method1482((byte) 102);
        }
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)Z")
    public final boolean method1485(int arg0) {
        if (arg0 != 0) {
            this.method286((byte) -41, -41);
        }
        ++field3155;
        return !super.field5454.method3782((byte) 61);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        ++field3145;
        if (!arg0) {
            this.method286((byte) 47, 18);
        }
        if (super.field5454.method3782((byte) 61)) {
            return 2;
        } else {
            return super.field5454.field9482.method2337((byte) 82) && class693.method3894((byte) -124, super.field5454.field9482.method2338(17539)) ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)I")
    public final int method1486(int arg0) {
        if (arg0 != 17539) {
            field3148 = null;
        }
        ++field3147;
        return super.field5452;
    }
}
