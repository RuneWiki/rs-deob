import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class60 {

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lkn;")
    public static class530 field738 = new class530("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "Z")
    public static boolean field746 = false;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field744;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tn", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field747;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Z")
    public static boolean field745;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "[Lya;")
    public static class38[] field743;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static void method486(int arg0) {
        if (arg0 != 531) {
            field746 = true;
        }
        field738 = null;
        field743 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/net/Socket;II)Lhp;")
    public static final class219 method487(Socket arg0, int arg1, int arg2) throws IOException {
        field737++;
        return arg2 > -86 ? null : new class505(arg0, arg1);
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)Z")
    public static final boolean method488(int arg0) {
        field740++;
        if (arg0 >= -2) {
            field738 = null;
        }
        if (class190.field2712) {
            try {
                if ((Boolean) class297.method1826("showingVideoAd", -14648, class268.field3914.field2165)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field741++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLhj;)V")
    public static final void method489(byte arg0, class408 arg1) {
        field744++;
        if (class268.field3910 == null || arg0 != 7) {
            return;
        }
        class21 var2 = null;
        if (arg1.field5771 == 0) {
            var2 = (class21) class38.method211(arg1.field5777, arg1.field5770, arg1.field5773);
        }
        if (arg1.field5771 == 1) {
            var2 = (class21) class335.method2002(arg1.field5777, arg1.field5770, arg1.field5773);
        }
        if (arg1.field5771 == 2) {
            var2 = (class21) class248.method1622(arg1.field5777, arg1.field5770, arg1.field5773, field747 == null ? (field747 = method491("nc")) : field747);
        }
        if (arg1.field5771 == 3) {
            var2 = (class21) class87.method628(arg1.field5777, arg1.field5770, arg1.field5773);
        }
        if (var2 == null) {
            arg1.field5769 = 0;
            arg1.field5774 = 0;
            arg1.field5768 = -1;
        } else {
            arg1.field5768 = var2.method110((byte) 115);
            arg1.field5769 = var2.method112(106);
            arg1.field5774 = var2.method114(-9772);
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)I")
    public final int method490(int arg0) {
        field739++;
        if (arg0 > -74) {
            field745 = false;
        }
        return this.field742;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(II)V")
    public class60(int arg0, int arg1) {
        this.field742 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method491(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
