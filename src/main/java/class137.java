import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class137 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Z")
    public static boolean field2141 = false;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "F")
    public static float field2144 = 0.0F;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2145 = 1;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILtk;)V", line = 7)
    public static final void method1002(int arg0, int arg1, int arg2, class191 arg3) {
        if (class423.field6252[arg0][arg1][arg2] == null) {
            class362.method2345(arg0, arg1, arg2);
        }
        class423.field6252[arg0][arg1][arg2].field3864 = arg3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lfa;", line = 16)
    public static final class127 method1003(int arg0, int arg1) {
        if (arg1 != -30796) {
            field2142 = -54;
        }
        field2140++;
        class52 var2 = class381.field5758;
        class127 var3;
        synchronized (class381.field5758) {
            var3 = (class127) class381.field5758.method331((byte) 69, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class9.field110.method2771(class33.method220(arg0, arg1 + 54969), class281.method1916(255, arg0), 3);
        class127 var5 = new class127();
        var5.field2016 = arg0;
        if (var4 != null) {
            var5.method946(new class186(var4), (byte) -3);
        }
        var5.method943(arg1 ^ 0x7830);
        if (!class68.field857 && var5.field1985) {
            var5.field1955 = null;
            var5.field1959 = null;
        }
        if (var5.field1989) {
            var5.field2027 = 0;
            var5.field1993 = false;
        }
        class52 var6 = class381.field5758;
        synchronized (class381.field5758) {
            class381.field5758.method341(125, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)I", line = 75)
    public static final int method1005(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -30) {
            return -72;
        }
        field2143++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)I")
    public abstract int method1000(boolean arg0);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1001(int arg0, Component arg1);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method1004(Component arg0, boolean arg1);
}
