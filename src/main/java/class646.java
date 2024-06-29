import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class646 {

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "Lmfa;")
    public static class562 field9145 = new class562();

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field9148 = 0;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public int field9142;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public int field9143;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public int field9144;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public int field9147;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IILpe;Ljava/lang/String;)Lsba;", line = 6)
    public static final class199 method3628(int arg0, int arg1, class556 arg2, String arg3) {
        field9146++;
        if (arg0 == 0) {
            return arg2.method3151(arg3, 2);
        } else if (arg0 == 1) {
            try {
                class432.method2310("openjs", new Object[] { (new URL(class485.field7068.getCodeBase(), arg3)).toString() }, arg1 + 17634, class485.field7068);
                class199 var4 = new class199();
                var4.field2437 = 1;
                return var4;
            } catch (Throwable var10) {
                class199 var5 = new class199();
                var5.field2437 = 2;
                return var5;
            }
        } else if (arg0 == 2) {
            try {
                class485.field7068.getAppletContext().showDocument(new URL(class485.field7068.getCodeBase(), arg3), "_blank");
                class199 var6 = new class199();
                var6.field2437 = 1;
                return var6;
            } catch (Exception var11) {
                class199 var7 = new class199();
                var7.field2437 = 2;
                return var7;
            }
        } else {
            if (arg1 != 1) {
                method3629(100);
            }
            if (arg0 != 3) {
                throw new IllegalArgumentException();
            }
            try {
                class432.method2311(4975, "loggedout", class485.field7068);
            } catch (Throwable var13) {
            }
            try {
                class485.field7068.getAppletContext().showDocument(new URL(class485.field7068.getCodeBase(), arg3), "_top");
                class199 var8 = new class199();
                var8.field2437 = 1;
                return var8;
            } catch (Exception var12) {
                class199 var9 = new class199();
                var9.field2437 = 2;
                return var9;
            }
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V", line = 83)
    public static void method3629(int arg0) {
        field9145 = null;
        if (arg0 != -31281) {
            method3629(-77);
        }
    }
}
