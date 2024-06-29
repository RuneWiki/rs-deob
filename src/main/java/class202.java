import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class202 {

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "[I")
    public static int[] field3063 = new int[32];

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field3062;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vp", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field3064;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vp", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field3065;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1452(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Ljava/lang/String;", line = 4)
    public static final String method1448(int arg0) {
        field3060++;
        if (arg0 >= -37) {
            field3059 = 66;
        }
        return class611.field8532 || class603.field8440 == null ? "" : class603.field8440.field7226;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 18)
    public static final void method1449(String arg0, byte arg1) {
        field3062++;
        if (class502.field6862 == null) {
            return;
        }
        class528.field7174++;
        class537 var2 = class476.method2729(class707.field9712, (byte) -46, class551.field7498);
        var2.field7295.method754(class703.method3926(120, arg0), 28);
        int var3 = 6 % ((6 - arg1) / 40);
        var2.field7295.method783((byte) -106, arg0);
        class173.method1314(false, var2);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I", line = 40)
    public static final int method1450(int arg0) {
        field3061++;
        int var1 = arg0;
        Field[] var2 = (field3064 == null ? (field3064 = method1452("eka")) : field3064).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field3065 == null ? (field3065 = method1452("gk")) : field3065).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)V", line = 67)
    public static void method1451(int arg0) {
        field3063 = null;
        if (arg0 != -12872) {
            method1448(113);
        }
    }
}
