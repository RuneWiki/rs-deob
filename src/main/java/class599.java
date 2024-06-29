import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class599 {

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "[I")
    public static int[] field8484 = new int[120];

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "[C")
    private static char[] field8487;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "Leda;")
    public static class14 field8488;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public static final void method3441(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field8486++;
        for (class248 var1 = (class248) class641.field9057.method3463((byte) -50); var1 != null; var1 = (class248) class641.field9057.method3469((byte) 107)) {
            if (var1.field3966 == -1) {
                var1.field3975 = 0;
                if (var1.field3971 >= 0 && var1.field3964 >= 0 && class191.field3229 > var1.field3971 && class314.field4720 > var1.field3964) {
                    class254.method1724(-18620, var1);
                }
            } else {
                var1.method636((byte) 97);
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILbfa;)V")
    public static final void method3442(int arg0, class573 arg1) {
        if (arg0 < 44) {
            field8487 = null;
        }
        field8483++;
        class447 var2 = (class447) class261.field4063.method3512(true, (long) arg1.field1628);
        if (var2 == null) {
            return;
        }
        if (var2.field6518 != null) {
            class324.field4793.method2223(var2.field6518);
            var2.field6518 = null;
        }
        var2.method636((byte) 97);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
    public static final void method3443(boolean arg0) {
        field8481++;
        if (arg0) {
            class519.field7506.method76(19);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V")
    public static void method3444(boolean arg0) {
        field8488 = null;
        field8484 = null;
        if (!arg0) {
            field8488 = null;
        }
        field8487 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/net/Socket;I)Ljaa;")
    public static final class747 method3445(int arg0, Socket arg1, int arg2) throws IOException {
        field8482++;
        if (arg2 != 2036970792) {
            field8488 = null;
        }
        return new class524(arg1, arg0);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var5 = var1 + 1;
            int var6 = (int) (Math.pow(2.0D, (double) var5 / 7.0D) * 300.0D + (double) var5);
            var0 += var6;
            field8484[var1] = var0 / 4;
        }
        field8487 = new char[64];
        for (int var2 = 0; var2 < 26; var2++) {
            field8487[var2] = (char) (var2 + 65);
        }
        for (int var3 = 26; var3 < 52; var3++) {
            field8487[var3] = (char) (var3 + 97 - 26);
        }
        for (int var4 = 52; var4 < 62; var4++) {
            field8487[var4] = (char) (var4 + 48 - 52);
        }
        field8487[63] = '/';
        field8487[62] = '+';
        field8488 = new class14(32);
    }
}
