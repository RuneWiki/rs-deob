import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class434 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lvh;")
    public static class125 field6241 = new class125(4, 0);

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "[I")
    public static int[] field6251 = new int[4096];

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Z")
    public static boolean field6250 = true;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field6252 = 0;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Luea;")
    public static class256 field6248 = new class256("LOCAL", 4);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public int field6240;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Ljava/lang/String;")
    public String field6242;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2544(boolean arg0) {
        field6248 = null;
        field6241 = null;
        field6251 = null;
        if (arg0) {
            field6248 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILek;)Lju;", line = 16)
    public static final class352 method2545(int arg0, class465 arg1) {
        if (arg0 == 18072) {
            field6243++;
            int var2 = arg1.method2755((byte) -100);
            return new class352(var2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)Ljava/net/Socket;", line = 35)
    public final Socket method2547(int arg0) throws IOException {
        if (arg0 < 49) {
            return null;
        } else {
            field6244++;
            return new Socket(this.field6242, this.field6240);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I", line = 50)
    public static final int method2548(int arg0, int arg1) {
        field6246++;
        if (arg0 > -122) {
            method2545(105, null);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method2546(int arg0) throws IOException;
}
