import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class16 {

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "I")
    public static volatile int field251 = 0;

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "Lj;")
    public static class17 field252 = class30.method190(-123, "Spinning Wheel");

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "Lj;")
    public static class17 field255 = class30.method190(-103, "world");

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "Z")
    public static boolean field256 = false;

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B[B)[B", line = 17)
    public static final byte[] method109(byte arg0, byte[] arg1) {
        class33 var2 = new class33(arg1);
        if (arg0 != -27) {
            field253 = -58;
        }
        int var3 = var2.method212(-105);
        int var4 = var2.method219(0);
        if (var4 < 0 || class24.field318 != 0 && class24.field318 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method215(var4, arg0 ^ 0x20B2, 0, var5);
            return var5;
        } else {
            int var6 = var2.method219(0);
            if (var6 < 0 || class24.field318 != 0 && var6 > class24.field318) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class9.method80(var7, var6, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var10) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(BI)Lj;", line = 91)
    public static final class17 method110(byte arg0, int arg1) {
        if (arg0 >= -9) {
            field252 = null;
        }
        class17 var2 = new class17();
        var2.field268 = 0;
        var2.field263 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Z)B", line = 109)
    public static final byte method111(boolean arg0) {
        if (!arg0) {
            field255 = null;
        }
        return class23.field309 == null ? 0 : class23.field309[class13.field234];
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(I)V", line = 126)
    public static void method112(int arg0) {
        field255 = null;
        field252 = null;
        if (arg0 != -9775) {
            field254 = 30;
        }
    }
}
