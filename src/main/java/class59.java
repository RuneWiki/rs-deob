import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public abstract class class59 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Lsb;")
    public static class266 field1335 = new class266(58, 16);

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "J")
    public static long field1336 = 0L;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "[Log;")
    public static class602[] field1341 = new class602[2048];

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "[I")
    public static int[] field1338 = new int[8];

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field1340 = 0;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Z")
    public static boolean field1339 = false;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "[S")
    public static short[] field1337;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    public abstract void method481(boolean arg0);

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "([BBII)I")
    public abstract int method480(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Z")
    public abstract boolean method479(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II[BB)V")
    public abstract void method485(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    public static void method681(byte arg0) {
        field1338 = null;
        field1335 = null;
        field1337 = null;
        field1341 = null;
        if (arg0 >= -40) {
            method681((byte) -80);
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
    public abstract void method482(byte arg0);
}
