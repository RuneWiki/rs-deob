import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class class556 extends class154 {

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lfja;")
    public static class783 field7852 = new class783(125, -1);

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field7853 = 0;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Lrja;")
    public static class116 field7849;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Lrha;")
    public static class235 field7850;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)I")
    public abstract int method2731(int arg0);

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public static void method3200(int arg0) {
        if (arg0 <= -41) {
            field7850 = null;
            field7852 = null;
            field7849 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)J")
    public abstract long method2735(int arg0);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZLlu;Ljava/lang/String;)Lfo;")
    public static final class545 method3201(int arg0, boolean arg1, class742 arg2, String arg3) {
        field7851++;
        if (arg0 == 0) {
            return arg2.method4103(arg3, true);
        } else if (arg0 == 1) {
            try {
                class729.method4043(new Object[] { (new URL(class286.field3936.getCodeBase(), arg3)).toString() }, 105, "openjs", class286.field3936);
                class545 var4 = new class545();
                var4.field7412 = 1;
                return var4;
            } catch (Throwable var10) {
                class545 var5 = new class545();
                var5.field7412 = 2;
                return var5;
            }
        } else if (arg0 == 2) {
            try {
                class286.field3936.getAppletContext().showDocument(new URL(class286.field3936.getCodeBase(), arg3), "_blank");
                class545 var6 = new class545();
                var6.field7412 = 1;
                return var6;
            } catch (Exception var11) {
                class545 var7 = new class545();
                var7.field7412 = 2;
                return var7;
            }
        } else {
            if (!arg1) {
                method3200(-9);
            }
            if (arg0 != 3) {
                throw new IllegalArgumentException();
            }
            try {
                class729.method4044(class286.field3936, 26693, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                class286.field3936.getAppletContext().showDocument(new URL(class286.field3936.getCodeBase(), arg3), "_top");
                class545 var8 = new class545();
                var8.field7412 = 1;
                return var8;
            } catch (Exception var12) {
                class545 var9 = new class545();
                var9.field7412 = 2;
                return var9;
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)I")
    public abstract int method2734(boolean arg0);

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)I")
    public abstract int method2732(int arg0);

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)I")
    public abstract int method2733(int arg0);
}
