import java.awt.Canvas;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class49 {

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "J")
    public long field575;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "Leea;")
    private class131 field572;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIILjava/awt/Canvas;)Lkq;", line = 3)
    public static final class593 method310(int arg0, int arg1, int arg2, Canvas arg3) {
        field574++;
        try {
            Class var4 = Class.forName("jo");
            if (arg2 != 4380) {
                method311(null, null, -106, true);
            }
            class593 var5 = (class593) var4.getDeclaredConstructor().newInstance();
            var5.method1281(arg1, arg0, false, arg3);
            return var5;
        } catch (Throwable var7) {
            class209 var6 = new class209();
            var6.method1281(arg1, arg0, false, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!aea", name = "finalize", descriptor = "()V", line = 30)
    protected final void finalize() throws Throwable {
        field573++;
        this.field572.method930(this.field575, -1);
        super.finalize();
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lvc;Ljava/lang/String;IZ)Lgca;", line = 43)
    public static final class249 method311(class316 arg0, String arg1, int arg2, boolean arg3) {
        field571++;
        if (arg2 == 0) {
            return arg0.method2044(126, arg1);
        } else if (arg2 == 1) {
            try {
                class113.method795(class213.field2800, 23131, "openjs", new Object[] { (new URL(class213.field2800.getCodeBase(), arg1)).toString() });
                class249 var4 = new class249();
                var4.field3310 = 1;
                return var4;
            } catch (Throwable var10) {
                class249 var5 = new class249();
                var5.field3310 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                class213.field2800.getAppletContext().showDocument(new URL(class213.field2800.getCodeBase(), arg1), "_blank");
                class249 var6 = new class249();
                var6.field3310 = 1;
                return var6;
            } catch (Exception var11) {
                class249 var7 = new class249();
                var7.field3310 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class113.method797("loggedout", 93, class213.field2800);
            } catch (Throwable var13) {
            }
            try {
                class213.field2800.getAppletContext().showDocument(new URL(class213.field2800.getCodeBase(), arg1), "_top");
                class249 var8 = new class249();
                var8.field3310 = 1;
                return var8;
            } catch (Exception var12) {
                class249 var9 = new class249();
                var9.field3310 = 2;
                return var9;
            }
        } else if (arg3) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Leea;J[Lbu;)V", line = 118)
    public class49(class131 arg0, long arg1, class19[] arg2) {
        this.field575 = arg1;
        this.field572 = arg0;
    }
}
