import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public abstract class class74 {

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "Z")
    public static boolean field843 = false;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!sga", name = "h", descriptor = "Ljava/lang/String;")
    public String field849;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method585(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field848 = -8;
        }
        field845++;
        return new Socket(this.field849, this.field848);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V")
    public static final void method586(byte arg0) {
        class95.field1079 = null;
        class273.field3936 = null;
        class639.field8966 = null;
        class182.field2809 = null;
        class205.field3183 = null;
        class758.field10461 = null;
        class772.field10606 = null;
        if (arg0 != -64) {
            field843 = true;
        }
        field846++;
        class132.field1980 = null;
        class78.field888 = null;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljs;B)V")
    public static final void method587(class349 arg0, byte arg1) {
        arg0.method2959(class22.field364.method4361((byte) 117), (byte) -35);
        field842++;
        arg0.method2959(class525.field7435.method4361((byte) 125), (byte) 116);
        arg0.method2959(class564.field8000.method4361((byte) -48), (byte) -76);
        arg0.method2959(class588.field8298.method4361((byte) 119), (byte) -91);
        arg0.method2959(class602.field8436.method4361((byte) 108), (byte) -76);
        arg0.method2959(class168.field2640.method4361((byte) 115), (byte) -90);
        arg0.method2959(class488.field6899.method4361((byte) -120), (byte) -74);
        arg0.method2959(class286.field4217.method4361((byte) -17), (byte) 98);
        arg0.method2959(class152.field2163.method4361((byte) -55), (byte) -93);
        arg0.method2959(class280.field4070.method4361((byte) 115), (byte) -82);
        arg0.method2959(class384.field5284.method4361((byte) 119), (byte) 126);
        arg0.method2959(class65.field790.method4361((byte) 122), (byte) -103);
        arg0.method2959(class520.field7346.method4361((byte) 120), (byte) -90);
        arg0.method2959(class124.field1928.method4361((byte) 125), (byte) 99);
        arg0.method2959(class486.field6846.method4361((byte) 126), (byte) 83);
        arg0.method2959(class36.field474.method4361((byte) 119), (byte) -47);
        arg0.method2959(class305.field4397.method4361((byte) 127), (byte) -43);
        arg0.method2959(class784.field10769.method4361((byte) -70), (byte) -120);
        arg0.method2959(class243.field3621.method4361((byte) 126), (byte) 78);
        arg0.method2959(class253.field3722.method4361((byte) -128), (byte) -103);
        arg0.method2959(class352.field4936.method4361((byte) 112), (byte) 114);
        arg0.method2959(class46.field577.method4361((byte) 122), (byte) 103);
        arg0.method2959(class401.field5499.method4361((byte) 104), (byte) 109);
        arg0.method2959(class249.field3679.method4361((byte) 117), (byte) 86);
        arg0.method2959(class153.field2167.method4361((byte) 107), (byte) -76);
        arg0.method2959(class62.field746.method4361((byte) 121), (byte) -89);
        arg0.method2959(class751.field10394.method4361((byte) 109), (byte) 96);
        if (arg1 != 5) {
            return;
        }
        arg0.method2959(class471.field6609.method4361((byte) -81), (byte) -82);
        arg0.method2959(class251.field3710.method4361((byte) -103), (byte) 96);
        arg0.method2959(class42.field550.method4361((byte) 109), (byte) 124);
        arg0.method2959(class5.field36.method4361((byte) 119), (byte) -110);
        arg0.method2959(class48.field610.method4361((byte) -41), (byte) -67);
        arg0.method2959(class649.method3718(arg1 - 4), (byte) 124);
        arg0.method2959(class522.method3147(arg1 - 18023), (byte) -103);
        arg0.method2959(class194.field2993.method4361((byte) 126), (byte) 105);
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method588(int arg0) throws IOException;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method589(byte[] arg0, int arg1, int arg2, int arg3) {
        field844++;
        char[] var4 = new char[arg3];
        int var5 = arg2;
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg0[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class242.field3616[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)V")
    public static final void method590(boolean arg0) {
        class650.field9082 = (int) ((double) class768.field10571 * 34.46D);
        field847++;
        class349.field4881 = 200;
        class650.field9082 <<= 0x2;
        if (class37.field491.method516()) {
            class650.field9082 += 512;
        }
        class740.method4120(1, arg0);
    }
}
