import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class429 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Z")
    private static boolean field5987 = false;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    private static int field5988 = 0;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lgca;")
    private static class227 field5989 = new class227();

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZB)V")
    public static final synchronized void method2462(boolean arg0, byte arg1) {
        if (arg1 <= 94) {
            field5987 = true;
        }
        field5987 = arg0;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static final synchronized void method2463(byte arg0) {
        while (true) {
            class153 var1 = (class153) field5989.method1442(-10011);
            if (var1 == null) {
                if (arg0 != -35) {
                    method2463((byte) -29);
                    return;
                }
                return;
            }
            var1.field2228.method188(true);
            var1.method2340(114);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILp;)V")
    public static final synchronized void method2464(int arg0, class200 arg1) {
        if (field5987 || arg0 >= -5) {
            return;
        }
        if (field5988 <= 0) {
            arg1.method188(false);
        } else {
            class153 var2 = new class153();
            var2.field2228 = arg1;
            field5989.method1441(var2, 0);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static final synchronized void method2465(int arg0) {
        field5988++;
        if (arg0 > -18) {
            field5987 = false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static final synchronized void method2466(int arg0) {
        int var1 = 20 / ((arg0 + 84) / 32);
        field5988--;
        if (field5988 == 0) {
            method2463((byte) -35);
        }
    }
}
