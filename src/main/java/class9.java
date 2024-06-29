import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field214 = -1;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Lgj;")
    public static class447 field217 = new class447();

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Z")
    public static boolean field219 = false;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "[Lf;")
    public static class529[] field220;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lcr;III)V", line = 6)
    public static final void method102(class403 arg0, int arg1, int arg2, int arg3) {
        field211++;
        class513.field7558 = arg2;
        class74.field1119 = arg0;
        if (arg1 != 13132) {
            method104(-94);
        }
        class34.field552 = arg3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIBII)V", line = 20)
    public static final void method103(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field213++;
        if (arg3 >= -50) {
            field214 = 23;
        }
        if (arg1 >= class308.field4055 && class71.field1077 >= arg5 && class353.field4777 <= arg4 && arg2 <= class300.field3971) {
            class358.method2089(arg2, arg5, arg4, arg1, -1, arg0);
        } else {
            class514.method3025(arg2, arg0, arg1, arg4, (byte) 123, arg5);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 38)
    public static final void method104(int arg0) {
        field212++;
        class32.field523.method309((byte) 72);
        class267.field3526.method1299(0);
        if (class298.field3942 != null) {
            class298.field3942.method1491(class518.field7663, arg0 + 47);
        }
        class170.field2476.method2167((byte) 75);
        class518.field7663.setBackground(Color.black);
        class400.field5373 = arg0;
        class32.field523 = class314.method1820((byte) 66, class518.field7663);
        class267.field3526 = class18.method184(0, true, class518.field7663);
        if (class298.field3942 != null) {
            class298.field3942.method1490((byte) 122, class518.field7663);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 61)
    public static void method105(byte arg0) {
        if (arg0 == 60) {
            field217 = null;
            field220 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "toString", descriptor = "()Ljava/lang/String;", line = 75)
    public final String toString() {
        field215++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I", line = 89)
    public final int method106(int arg0) {
        field210++;
        if (arg0 < 71) {
            method105((byte) 11);
        }
        return this.field218;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(II)V", line = 99)
    public class9(int arg0, int arg1) {
        this.field218 = arg0;
        this.field216 = arg1;
    }
}
