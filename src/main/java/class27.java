import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class27 extends class766 {

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "Lsv;")
    public static class570 field280 = new class570(48, -1);

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "Lin;")
    public static class380 field287 = new class380(35, 6);

    @OriginalMember(owner = "client!cv", name = "x", descriptor = "Lbw;")
    public static class29 field290 = new class29(16);

    @OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
    public static int field291 = 0;

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "[I")
    public static int[] field292 = new int[3];

    @OriginalMember(owner = "client!cv", name = "w", descriptor = "F")
    public static float field289;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "Ljd;")
    public static class624 field288;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "Lmq;")
    public static class85 field281;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cv", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field293;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method224(int arg0, String arg1) {
        if (arg0 <= 84) {
            return false;
        } else {
            field283++;
            return class735.method4062(field293 == null ? (field293 = method227("sw")) : field293, arg1, -59);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
    public static void method225(byte arg0) {
        field287 = null;
        field280 = null;
        field290 = null;
        field292 = null;
        field288 = null;
        int var1 = 123 / ((48 - arg0) / 50);
        field281 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ltd;Z)V")
    public static final void method226(class551 arg0, boolean arg1) {
        field282++;
        boolean var2 = arg1;
        arg0.method2665(24902);
        for (class551 var3 = (class551) class496.field6807.method249(18371); var3 != null; var3 = (class551) class496.field6807.method254((byte) -64)) {
            if (class278.method1777(var3.method3182(11569), -121, arg0.method3182(11569))) {
                class490.method2865(var3, arg0, 5);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class496.field6807.method248((byte) 102, arg0);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method227(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
