import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class303 {

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "Lea;")
    public static class547 field4085 = new class547(72, 0);

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field4093 = 0;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "Llga;")
    public static class712 field4088 = new class712(81, 7);

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "Lni;")
    public static class522 field4094;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "Lsk;")
    public static class622 field4090;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZLkt;)I", line = 11)
    public static final int method1814(boolean arg0, class159 arg1) {
        field4089++;
        if (class450.field6286 == arg1) {
            return 6407;
        } else if (class758.field10567 == arg1) {
            return 6408;
        } else if (class695.field9710 == arg1) {
            return 6406;
        } else if (class431.field6067 == arg1) {
            return 6409;
        } else if (class423.field5926 == arg1) {
            return 6410;
        } else if (class268.field3544 == arg1) {
            return 6145;
        } else {
            if (arg0) {
                field4085 = null;
            }
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZLhr;Z)V", line = 54)
    public static final void method1815(int arg0, boolean arg1, class526 arg2, boolean arg3) {
        field4087++;
        int var4 = arg2.field7062;
        int var5 = (int) arg2.field556;
        arg2.method315(arg0 - 16284);
        if (arg3) {
            class166.method974(false, var4);
        }
        class465.method2585(arg0 ^ 0x4016, var4);
        class218 var6 = class357.method2056(var5, -9820);
        if (var6 != null) {
            class277.method1652(1, var6);
        }
        class339.method2000(106);
        if (!arg1 && class116.field1543 != -1) {
            class522.method2904(1, class116.field1543, -44);
        }
        class237 var7 = new class237(class520.field6994);
        for (class526 var8 = (class526) var7.method1432(0); var8 != null; var8 = (class526) var7.method1430(arg0 - 16396)) {
            if (!var8.method314((byte) 78)) {
                var8 = (class526) var7.method1432(0);
                if (var8 == null) {
                    break;
                }
            }
            if (var8.field7064 == 3) {
                int var9 = (int) var8.field556;
                if ((var9 >>> 16) == var4) {
                    method1815(16398, arg1, var8, true);
                }
            }
        }
        if (arg0 != 16398) {
            method1815(-42, true, null, true);
        }
    }

    @OriginalMember(owner = "client!mu", name = "toString", descriptor = "()Ljava/lang/String;", line = 114)
    public final String toString() {
        field4086++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V", line = 122)
    public static void method1816(byte arg0) {
        field4094 = null;
        field4088 = null;
        field4090 = null;
        if (arg0 == -112) {
            field4085 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/net/Socket;BI)Lida;", line = 141)
    public static final class238 method1817(Socket arg0, byte arg1, int arg2) throws IOException {
        if (arg1 != 11) {
            method1816((byte) 24);
        }
        field4091++;
        return new class305(arg0, arg2);
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 157)
    public class303(String arg0, String arg1, String arg2, int arg3) {
        this.field4092 = arg3;
    }
}
