import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class213 {

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field3635;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public static int field3642 = 0;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "Lqu;")
    public static class219 field3638 = new class219(71, 8);

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field3643 = 0;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public static void method1580(byte arg0) {
        field3638 = null;
        if (arg0 > 0) {
            field3643 = -112;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIII)V")
    public static final void method1581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 0) {
            return;
        }
        field3640++;
        if (class178.field2609 <= arg5 && class460.field7096 >= arg4 && class462.field7105 <= arg0 && class222.field3750 >= arg3) {
            class171.method1079(arg3, arg0, arg5, 0, arg2, arg4);
        } else {
            class146.method889(arg2, arg0, arg4, -1, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1582(int arg0, int arg1, byte arg2) {
        field3641++;
        int var3 = 82 / ((52 - arg2) / 46);
        return (arg0 & 0x60000) != 0 | class60.method451(arg0, arg1, (byte) 108) || class449.method2830(-1, arg1, arg0) || class266.method1818(arg1, arg0, -127);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1583(int arg0, int arg1) {
        field3637++;
        if (arg0 <= 77) {
            this.field3635 = null;
        }
        return this.field3635[arg1];
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIII)V")
    public static final void method1584(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= arg3) {
            class280.method1888(arg0, arg3, (byte) 82, class103.field1521[arg4], arg1);
        } else {
            class280.method1888(arg3, arg0, (byte) 82, class103.field1521[arg4], arg1);
        }
        field3634++;
        if (arg2 > -52) {
            field3642 = 51;
        }
    }

    @OriginalMember(owner = "client!ss", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3639++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class213(String arg0, String arg1, String arg2, String arg3) {
        this.field3635 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
