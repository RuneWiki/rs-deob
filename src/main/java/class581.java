import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class581 {

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field8274 = -2;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Lpj;")
    public static class132 field8273;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "Lmv;")
    public static class343 field8277;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static void method3410(byte arg0) {
        field8273 = null;
        if (arg0 != -72) {
            field8274 = -110;
        }
        field8277 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/net/Socket;ZI)Lnr;")
    public static final class53 method3411(Socket arg0, boolean arg1, int arg2) throws IOException {
        field8275++;
        return arg1 ? new class292(arg0, arg2) : null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IB[Lpca;)V")
    public static final void method3412(int arg0, byte arg1, class665[] arg2) {
        field8276++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class665 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field9309 == 0) {
                    if (var4.field9296 != null) {
                        method3412(arg0, (byte) -114, var4.field9296);
                    }
                    class102 var5 = (class102) class486.field7115.method1558((long) var4.field9400, (byte) -93);
                    if (var5 != null) {
                        class281.method1994(arg1 + 222, arg0, var5.field1687);
                    }
                }
                if (arg0 == 0 && var4.field9310 != null) {
                    class438 var6 = new class438();
                    var6.field6677 = var4;
                    var6.field6684 = var4.field9310;
                    class142.method1201(var6);
                }
                if (arg0 == 1 && var4.field9378 != null) {
                    if (var4.field9380 >= 0) {
                        class665 var7 = class326.method2197(false, var4.field9400);
                        if (var7 == null || var7.field9296 == null || var4.field9380 >= var7.field9296.length || var7.field9296[var4.field9380] != var4) {
                            continue;
                        }
                    }
                    class438 var8 = new class438();
                    var8.field6684 = var4.field9378;
                    var8.field6677 = var4;
                    class142.method1201(var8);
                }
            }
        }
        if (arg1 != -114) {
            field8273 = null;
        }
    }
}
