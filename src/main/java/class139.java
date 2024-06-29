import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public abstract class class139 {

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "[Lv;")
    public static class75[] field2172 = new class75[14];

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field2169 = 0;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field2173 = 0;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Ll;")
    public static class133 field2168;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Lsf;")
    public static class197 field2171;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Ljava/awt/Image;")
    public static Image field2174;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Z")
    public static boolean field2170;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 31)
    public static void method1005(byte arg0) {
        if (arg0 < 35) {
            method1005((byte) 112);
        }
        field2171 = null;
        field2174 = null;
        field2168 = null;
        field2172 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1004(int arg0);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[B)V")
    public abstract void method1006(int arg0, byte[] arg1);
}
