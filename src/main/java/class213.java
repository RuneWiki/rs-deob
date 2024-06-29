import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class213 extends class85 {

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "Ljava/lang/Object;")
    private Object field3081;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "Lbe;")
    public static class41 field3080 = new class41();

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method598(byte arg0) {
        if (arg0 != 104) {
            this.method599(-53);
        }
        field3079++;
        return false;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 18)
    public final Object method599(int arg0) {
        if (arg0 != 27585) {
            this.field3081 = null;
        }
        field3078++;
        return this.field3081;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIZII)I", line = 29)
    public static final int method1492(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3077++;
        class685 var5 = class26.method198(arg0, (byte) -19, arg4);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = arg1; var7 < var5.field9723.length; var7++) {
            if (var5.field9723[var7] >= 0 && class526.field7490.field8812 > var5.field9723[var7]) {
                class501 var8 = class526.field7490.method3567(var5.field9723[var7], true);
                int var9 = var8.method2914(0, class788.field10824.method1609(arg3, arg1 ^ 0xFFFFFFA3).field4920, arg3);
                if (arg2) {
                    var6 += var5.field9721[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 68)
    public class213(Object arg0, int arg1) {
        super(arg1);
        this.field3081 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V", line = 77)
    public static void method1493(int arg0) {
        if (arg0 != -3034) {
            field3080 = null;
        }
        field3080 = null;
    }
}
