import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class663 {

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILjava/lang/String;ILwd;)Lnga;")
    public static final class477 method3747(int arg0, String arg1, int arg2, class248 arg3) {
        field9393++;
        if (arg2 != -29792) {
            method3748((byte) 103, 123, -11);
        }
        if (arg0 == 0) {
            return arg3.method1522(arg1, -90);
        } else if (arg0 == 1) {
            try {
                class140.method924(class627.field8991, "openjs", 24093, new Object[] { (new URL(class627.field8991.getCodeBase(), arg1)).toString() });
                class477 var4 = new class477();
                var4.field6693 = 1;
                return var4;
            } catch (Throwable var10) {
                class477 var5 = new class477();
                var5.field6693 = 2;
                return var5;
            }
        } else if (arg0 == 2) {
            try {
                class627.field8991.getAppletContext().showDocument(new URL(class627.field8991.getCodeBase(), arg1), "_blank");
                class477 var6 = new class477();
                var6.field6693 = 1;
                return var6;
            } catch (Exception var11) {
                class477 var7 = new class477();
                var7.field6693 = 2;
                return var7;
            }
        } else if (arg0 == 3) {
            try {
                class140.method923(class627.field8991, (byte) -66, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                class627.field8991.getAppletContext().showDocument(new URL(class627.field8991.getCodeBase(), arg1), "_top");
                class477 var8 = new class477();
                var8.field6693 = 1;
                return var8;
            } catch (Exception var12) {
                class477 var9 = new class477();
                var9.field6693 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BII)Z")
    public static final boolean method3748(byte arg0, int arg1, int arg2) {
        field9392++;
        if (arg0 >= -3) {
            return true;
        } else {
            return class569.method3339(arg1, arg2, true) || class637.method3637(arg2, 2, arg1);
        }
    }
}
