import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class491 extends class260 {

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field6814 = 0;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public static int field6815 = 0;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field6811 = 0;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Laj;")
    public static class333 field6807;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ch", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field6818;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2855(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)I", line = 3)
    public final int method4(int arg0, byte arg1) {
        ++field6809;
        if (super.field3867.method740((byte) -107)) {
            return 3;
        } else if (super.field3867.field1307.method1209(110) == 0) {
            return 3;
        } else {
            int var3 = 112 % ((-53 - arg1) / 50);
            return 1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IB)V", line = 27)
    public final void method9(int arg0, byte arg1) {
        if (arg1 != -107) {
            field6815 = 48;
        }
        ++field6813;
        super.field3868 = arg0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I", line = 38)
    public final int method8(byte arg0) {
        ++field6812;
        return arg0 != 4 ? 29 : 2;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 51)
    public static void method2851(int arg0) {
        if (arg0 != 0) {
            method2853(true, (Component) null, 33);
        }
        field6807 = null;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)Z", line = 61)
    public final boolean method2852(int arg0) {
        int var2 = -57 % ((56 - arg0) / 53);
        ++field6817;
        if (super.field3867.method740((byte) -102)) {
            return false;
        } else {
            return super.field3867.field1307.method1209(103) != 0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lfca;)V", line = 79)
    public class491(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLjava/awt/Component;I)Lji;", line = 82)
    public static final class637 method2853(boolean arg0, Component arg1, int arg2) {
        ++field6816;
        if (arg2 >= -1) {
            field6815 = -88;
        }
        try {
            Constructor var3 = Class.forName("ns").getDeclaredConstructor(field6818 != null ? field6818 : (field6818 = method2855("java.awt.Component")), Boolean.TYPE);
            return (class637) var3.newInstance(arg1, new Boolean(arg0));
        } catch (Throwable var4) {
            return new class99(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V", line = 103)
    public final void method2(boolean arg0) {
        ++field6810;
        if (super.field3867.method740((byte) -110)) {
            super.field3868 = 0;
        }
        if (super.field3867.field1307.method1209(35) == 0) {
            super.field3868 = 0;
        }
        if (arg0) {
            this.method9(25, (byte) 65);
        }
        if (super.field3868 < 0 || super.field3868 > 2) {
            super.field3868 = this.method8((byte) 4);
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)I", line = 132)
    public final int method2854(int arg0) {
        if (arg0 < 3) {
            return -103;
        } else {
            ++field6808;
            return super.field3868;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(ILfca;)V", line = 143)
    public class491(int arg0, class92 arg1) {
        super(arg0, arg1);
    }
}
