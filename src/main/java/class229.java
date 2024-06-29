import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class229 {

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[I")
    public static int[] field3439 = new int[500];

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3441;

    static {
        new class44("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field3440 = 0;
        field3442 = 0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIIII)V", line = 5)
    public static final void method1530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3441++;
        if (arg4 < arg1 || arg8 < 128 || arg4 > ((class69.field1139 - 2) * 128) || class255.field3763 * 128 - 256 < arg8) {
            class452.field6599[0] = class452.field6599[1] = -1;
            return;
        }
        int var10 = class224.method1515(arg4, arg8, arg7, -631749433) - arg6;
        class289.field4283.method37(arg3, 0, 0);
        class76.field1256.method209(class289.field4283);
        class76.field1256.method359(arg4, var10, arg8, class452.field6599);
        class289.field4283.method37(-arg3, 0, 0);
        class76.field1256.method209(class289.field4283);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 27)
    public static void method1531(int arg0) {
        field3439 = null;
        if (arg0 <= 49) {
            field3440 = -4;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILul;Ljava/lang/String;)Lgm;", line = 52)
    public static final class81 method1532(int arg0, int arg1, class411 arg2, String arg3) {
        field3438++;
        if (arg1 == 0) {
            return arg2.method2454(16, arg3);
        } else if (arg0 != 1) {
            return null;
        } else if (arg1 == 1) {
            try {
                class325.method2068("openjs", arg2.field5824, new Object[] { (new URL(arg2.field5824.getCodeBase(), arg3)).toString() }, (byte) 72);
                class81 var4 = new class81();
                var4.field1314 = 1;
                return var4;
            } catch (Throwable var10) {
                class81 var5 = new class81();
                var5.field1314 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                arg2.field5824.getAppletContext().showDocument(new URL(arg2.field5824.getCodeBase(), arg3), "_blank");
                class81 var6 = new class81();
                var6.field1314 = 1;
                return var6;
            } catch (Exception var11) {
                class81 var7 = new class81();
                var7.field1314 = 2;
                return var7;
            }
        } else if (arg1 == 3) {
            try {
                class325.method2066(arg2.field5824, (byte) -103, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg2.field5824.getAppletContext().showDocument(new URL(arg2.field5824.getCodeBase(), arg3), "_top");
                class81 var8 = new class81();
                var8.field1314 = 1;
                return var8;
            } catch (Exception var12) {
                class81 var9 = new class81();
                var9.field1314 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
