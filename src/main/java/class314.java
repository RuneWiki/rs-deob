import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class314 extends class219 {

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "Llja;")
    public static class744 field3863 = new class744(15, 15);

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V", line = 5)
    public final void method986(int arg0, OggPacket arg1) {
        field3862++;
        if (arg0 != -1) {
            method1854(86, null, -77);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)Z", line = 16)
    public static final boolean method1850(int arg0, int arg1, int arg2) {
        field3865++;
        int var3 = -123 % ((64 - arg1) / 36);
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V", line = 26)
    public static void method1851(int arg0) {
        if (arg0 == 0) {
            field3863 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 37)
    public final void method987(int arg0) {
        field3866++;
        if (arg0 != 0) {
            method1853(-87, -109, -1);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(III)Z", line = 48)
    public static final boolean method1852(int arg0, int arg1, int arg2) {
        field3860++;
        if (arg2 == 384) {
            return (arg1 & 0x180) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 59)
    public class314(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(III)V", line = 69)
    public static final void method1853(int arg0, int arg1, int arg2) {
        field3864++;
        if (class647.method3652(arg0, 0)) {
            if (arg2 >= -14) {
                field3863 = null;
            }
            class192.method1255(arg1, class316.field3880[arg0], 0);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjava/io/File;I)[B", line = 85)
    public static final byte[] method1854(int arg0, File arg1, int arg2) {
        field3861++;
        try {
            byte[] var3 = new byte[arg0];
            class479.method2841((byte) -126, var3, arg1, arg0);
            if (arg2 != -1) {
                method1853(-92, -61, -120);
            }
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }
}
