import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class202 extends class419 {

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Luv;")
    public static class2 field2936 = new class2(32, 2);

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public int field2939;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public int field2943;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2946;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Z")
    public boolean field2941;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BII)I")
    public static final int method1330(byte arg0, int arg1, int arg2) {
        field2942++;
        if (arg2 == -1) {
            return 12345678;
        }
        if (arg0 < 33) {
            method1331(-122);
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)Z")
    public final boolean method230(int arg0) {
        if (arg0 != -22611) {
            field2936 = null;
        }
        field2945++;
        return false;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)Lhr;")
    public static final class459 method1331(int arg0) {
        field2937++;
        if (arg0 != -488640729) {
            return null;
        }
        try {
            return (class459) Class.forName("nd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public final void method239(int arg0) {
        if (arg0 >= -38) {
            this.method230(99);
        }
        field2940++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method1332(byte arg0) {
        field2946 = null;
        if (arg0 != -40) {
            field2944 = 45;
        }
        field2936 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lya;IIILqj;IZ)V")
    public final void method224(class11 arg0, int arg1, int arg2, int arg3, class419 arg4, int arg5, boolean arg6) {
        field2938++;
        int var8 = -91 / ((arg5 - 24) / 62);
        throw new IllegalStateException();
    }
}
