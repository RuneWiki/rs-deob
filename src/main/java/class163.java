import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class163 extends OutputStream {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2597 = new String[8];

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Leh;")
    public static class137 field2596;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Laf;")
    public static final class167 method1131(int arg0) {
        field2598++;
        try {
            return arg0 == 255 ? (class167) Class.forName("rf").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static void method1132(boolean arg0) {
        if (!arg0) {
            field2597 = null;
            field2596 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ID)V")
    public static final void method1133(int arg0, double arg1) {
        field2594++;
        if (arg0 != -23755) {
            method1131(-106);
        }
        if (class235.field3890 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class297.field4700[var3] = var4 <= 255 ? var4 : 255;
        }
        class235.field3890 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2593++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)I")
    public static final int method1134(int arg0, int arg1) {
        field2592++;
        if (arg0 != 8570) {
            field2597 = null;
        }
        return arg1 >>> 7;
    }
}
