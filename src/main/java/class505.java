import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class505 extends class219 {

    @OriginalMember(owner = "client!no", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field7485;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "Lue;")
    private class158 field7478;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "Loe;")
    private class137 field7480;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "Z")
    public static boolean field7476 = true;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "Ltn;")
    public static class60 field7479 = new class60(35, -1);

    @OriginalMember(owner = "client!no", name = "o", descriptor = "Z")
    public static boolean field7486;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "[I")
    public static int[] field7488;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([BBII)V")
    public final void method1357(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        this.field7480.method860(arg3, arg0, arg2, (byte) 100);
        field7477++;
        if (arg1 != 40) {
            this.method1360((byte) -32);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lwm;BLjava/lang/String;)I")
    public static final int method3007(class403 arg0, byte arg1, String arg2) {
        field7484++;
        int var3 = arg0.field5665;
        byte[] var4 = class431.method2550(arg2, -8251);
        arg0.method2337(var4.length, -4);
        arg0.field5665 += class256.field3814.method1535(var4, 119, var4.length, 0, arg0.field5665, arg0.field5663);
        int var5 = 89 / ((-arg1 - 43) / 36);
        return arg0.field5665 - var3;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
    public final void method1360(byte arg0) {
        try {
            int var2 = 101 / ((arg0 + 19) / 60);
            this.field7485.close();
        } catch (IOException var3) {
        }
        field7473++;
        this.field7478.method1015((byte) -24);
        this.field7480.method861(1);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
    public static void method3008(int arg0) {
        if (arg0 != 0) {
            field7479 = null;
        }
        field7479 = null;
        field7488 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IB[BI)I")
    public final int method1358(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 >= -52) {
            field7486 = true;
        }
        field7483++;
        return this.field7478.method1017(arg3, arg2, true, arg0);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method3009(int arg0, long arg1) {
        field7481++;
        if (arg0 != -9697) {
            field7479 = null;
        }
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class467.field6520[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public final void method1361(int arg0) {
        this.field7478.method1012((byte) 97);
        field7487++;
        if (arg0 < -35) {
            this.field7480.method859((byte) 58);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)Z")
    public final boolean method1356(int arg0, int arg1) throws IOException {
        if (arg1 < 84) {
            return false;
        } else {
            field7475++;
            return this.field7478.method1013(arg0, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!no", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1360((byte) 49);
        field7482++;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class505(Socket arg0, int arg1) throws IOException {
        this.field7485 = arg0;
        this.field7485.setSoTimeout(30000);
        this.field7485.setTcpNoDelay(true);
        this.field7478 = new class158(this.field7485.getInputStream(), arg1);
        this.field7480 = new class137(this.field7485.getOutputStream(), arg1);
    }

    static {
        new class530("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field7486 = false;
        field7488 = new int[200];
    }
}
