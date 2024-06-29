import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class608 extends class8 {

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public static int field8560 = 0;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field8561 = new String[100];

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "Lfp;")
    public static class323 field8562;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pe", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field8563;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3428(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 6)
    public static final boolean method3425(String arg0, boolean arg1) {
        if (!arg1) {
            return true;
        } else {
            ++field8557;
            return class524.method3064(-128, field8563 != null ? field8563 : (field8563 = method3428("hea")), arg0);
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 17)
    public static void method3426(int arg0) {
        field8561 = null;
        field8562 = null;
        if (arg0 > -95) {
            field8561 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lfp;Lfp;Lra;)V", line = 29)
    public class608(class323 arg0, class323 arg1, class108 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V", line = 40)
    public static final void method3427(int arg0, int arg1) {
        ++field8559;
        class287.field4061.method4016(arg0, (byte) -73);
        if (arg1 != 15700) {
            field8560 = -125;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V", line = 51)
    public final void method53(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8558;
        if (arg1 == 11) {
            int var6 = super.field113.method656();
            int var7 = ((class108) super.field2256).field1308 * class103.method733((byte) -117) / 10 % var6;
            super.field113.method666(-var6 + arg4 + var7, arg0, arg3 + var6 + -var7, arg2);
        }
    }
}
