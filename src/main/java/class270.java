import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class270 extends InputStream {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "[I")
    public static int[] field4348 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4351 = "Unable to find ";

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[Lbc;")
    public static class299[] field4355 = new class299[2048];

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Ldk;")
    public static class251 field4352;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "[I")
    public static int[] field4353;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method1812(byte arg0) {
        if (arg0 != 100) {
            field4355 = null;
        }
        field4355 = null;
        field4348 = null;
        field4351 = null;
        field4353 = null;
        field4352 = null;
    }

    @OriginalMember(owner = "client!v", name = "read", descriptor = "()I")
    public final int read() {
        field4347++;
        class262.method1758(30000L, 29552);
        return -1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZI)I")
    public static final int method1813(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field4355 = null;
        }
        int var3 = 0;
        while (arg0 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg0--;
        }
        field4354++;
        return var3;
    }
}
