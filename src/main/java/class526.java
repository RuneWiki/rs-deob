import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class526 extends class55 {

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "Lea;")
    public static class547 field7063 = new class547(88, -2);

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "Lns;")
    public static class406 field7066 = new class406();

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public static int field7069 = 0;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "F")
    public static float field7065;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public int field7062;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public int field7064;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "Ljava/awt/Frame;")
    public static Frame field7067;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 3)
    public static void method2918(int arg0) {
        field7063 = null;
        field7066 = null;
        if (arg0 != 0) {
            method2918(-120);
        }
        field7067 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 17)
    public static final void method2919(int arg0, int arg1, int arg2, Class arg3) {
        class624 var4 = class77.field947[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class603 var5 = var4.field8729; var5 != null; var5 = var5.field8413) {
            class752 var6 = var5.field8410;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field10422 == arg1 && var6.field10421 == arg2) {
                class709.method3983(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZZ)Z", line = 54)
    public static boolean method2920(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
