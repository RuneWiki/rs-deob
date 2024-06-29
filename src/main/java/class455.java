import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class455 {

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field6840;

    // $FF: synthetic field
    @OriginalMember(owner = "client!np", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field6841;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field6839;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BLjava/awt/Component;)Ltda;")
    public static final class591 method2861(byte arg0, Component arg1) {
        field6838++;
        if (arg0 < 25) {
            field6839 = null;
        }
        return new class188(arg1);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
    public static void method2862(byte arg0) {
        field6839 = null;
        if (arg0 <= 49) {
            method2861((byte) -75, null);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljm;I)V")
    public static final void method2863(class640 arg0, int arg1) {
        field6840++;
        if (class454.field6818 == null) {
            return;
        }
        class302 var2 = null;
        if (arg0.field8971 == 0) {
            var2 = (class302) class681.method3880(arg0.field8972, arg0.field8975, arg0.field8980);
        }
        if (arg0.field8971 == 1) {
            var2 = (class302) class351.method2360(arg0.field8972, arg0.field8975, arg0.field8980);
        }
        if (arg0.field8971 == 2) {
            var2 = (class302) class618.method3589(arg0.field8972, arg0.field8975, arg0.field8980, field6841 == null ? (field6841 = method2864("ofa")) : field6841);
        }
        if (arg0.field8971 == 3) {
            var2 = (class302) class643.method3728(arg0.field8972, arg0.field8975, arg0.field8980);
        }
        if (var2 == null) {
            arg0.field8974 = 0;
            arg0.field8973 = -1;
            arg0.field8976 = 0;
        } else {
            arg0.field8973 = var2.method394((byte) -110);
            arg0.field8974 = var2.method413((byte) 11);
            arg0.field8976 = var2.method401((byte) 89);
        }
        if (arg1 > -67) {
            method2862((byte) 90);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2864(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
