import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class57 {

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "[Lww;")
    public class592[] field756 = new class592[8];

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[I")
    public int[] field752 = new int[100];

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "[I")
    public int[] field755 = new int[3];

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[Lfu;")
    public class450[] field754 = new class450[100];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field751 = 0;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Lbv;")
    public static class568 field760 = new class568();

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "Lim;")
    public static class353 field761 = new class353(113, 5);

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "F")
    public static float field758;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field757;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lgaa;IILjava/lang/String;)Ljr;")
    public static final class441 method309(class279 arg0, int arg1, int arg2, String arg3) {
        if (arg1 <= 77) {
            field758 = 0.6225935F;
        }
        field753++;
        if (arg2 == 0) {
            return arg0.method1724(false, arg3);
        } else if (arg2 == 1) {
            try {
                class499.method2791(81, arg0.field3644, "openjs", new Object[] { (new URL(arg0.field3644.getCodeBase(), arg3)).toString() });
                class441 var4 = new class441();
                var4.field6001 = 1;
                return var4;
            } catch (Throwable var10) {
                class441 var5 = new class441();
                var5.field6001 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                arg0.field3644.getAppletContext().showDocument(new URL(arg0.field3644.getCodeBase(), arg3), "_blank");
                class441 var6 = new class441();
                var6.field6001 = 1;
                return var6;
            } catch (Exception var11) {
                class441 var7 = new class441();
                var7.field6001 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class499.method2793("loggedout", (byte) 49, arg0.field3644);
            } catch (Throwable var13) {
            }
            try {
                arg0.field3644.getAppletContext().showDocument(new URL(arg0.field3644.getCodeBase(), arg3), "_top");
                class441 var8 = new class441();
                var8.field6001 = 1;
                return var8;
            } catch (Exception var12) {
                class441 var9 = new class441();
                var9.field6001 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method310(int arg0) {
        field761 = null;
        int var1 = 109 % ((arg0 - 15) / 52);
        field760 = null;
    }
}
