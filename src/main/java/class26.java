import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class26 extends class346 {

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field376;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Lkea;")
    private class247 field373;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Lpu;")
    private class586 field380;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Liw;")
    public static class331 field371 = new class331(15000);

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field379 = 0;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Z")
    public static boolean field382 = false;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZILjava/lang/String;)Z")
    public static final boolean method195(int arg0, boolean arg1, int arg2, String arg3) {
        field375++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        if (arg0 != -46) {
            method197((byte) -116);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(III[B)V")
    public final void method196(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 == 24405) {
            this.field380.method3400(-1, arg3, arg0, arg1);
            field374++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
    public static void method197(byte arg0) {
        if (arg0 == 12) {
            field371 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZBI)Lsv;")
    public static final class685 method198(boolean arg0, byte arg1, int arg2) {
        field372++;
        long var3 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
        if (arg1 != -19) {
            method195(-127, true, 58, null);
        }
        return (class685) class203.field2970.method380((byte) -3, var3);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Z")
    public final boolean method199(int arg0, byte arg1) throws IOException {
        if (arg1 != 101) {
            method195(43, true, -111, null);
        }
        field381++;
        return this.field373.method1662(arg0, (byte) 116);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[B)I")
    public final int method200(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 == -30359) {
            field377++;
            return this.field373.method1660(arg2, arg3, arg0, -104);
        } else {
            return 113;
        }
    }

    @OriginalMember(owner = "client!nc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field370++;
        this.method201(37);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public final void method201(int arg0) {
        int var2 = 93 % ((arg0 + 26) / 35);
        try {
            this.field376.close();
        } catch (IOException var3) {
        }
        field378++;
        this.field373.method1665(-109);
        this.field380.method3399((byte) 127);
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class26(Socket arg0, int arg1) throws IOException {
        this.field376 = arg0;
        this.field376.setSoTimeout(30000);
        this.field376.setTcpNoDelay(true);
        this.field373 = new class247(this.field376.getInputStream(), arg1);
        this.field380 = new class586(this.field376.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public final void method202(byte arg0) {
        if (arg0 == -59) {
            field369++;
            this.field373.method1663((byte) -117);
            this.field380.method3396(41);
        }
    }
}
