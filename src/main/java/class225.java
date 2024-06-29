import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class225 {

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lob;")
    public static class141 field4242 = class175.method1195(40, "sl_button");

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lob;")
    public static class141 field4248 = class175.method1195(40, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field4246 = 0;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Lpi;")
    public static class158 field4245 = new class158();

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field4249 = 0;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4241;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIII)V")
    public static final void method1443(boolean arg0, int arg1, int arg2, int arg3) {
        field4243++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class108.field2080 = arg2;
        if (arg3 != 0) {
            field4242 = null;
        }
        class16.field290 = arg0;
        class41.field804 = arg1;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class225() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([BLog;B)V")
    public final void method1444(byte[] arg0, class146 arg1, byte arg2) {
        field4247++;
        if (arg1.field2859[arg1.field2865] != 31 || arg1.field2859[arg1.field2865 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4241 == null) {
            this.field4241 = new Inflater(true);
        }
        try {
            if (arg2 <= 88) {
                this.field4241 = null;
            }
            this.field4241.setInput(arg1.field2859, arg1.field2865 + 10, arg1.field2859.length + -8 + -arg1.field2865 + -10);
            this.field4241.inflate(arg0);
        } catch (Exception var4) {
            this.field4241.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4241.reset();
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lpe;II)[Lfa;")
    public static final class52[] method1445(class154 arg0, int arg1, int arg2) {
        field4244++;
        if (class12.method76((byte) 98, arg0, arg2)) {
            if (arg1 != -23023) {
                field4242 = null;
            }
            return class24.method168(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method1446(byte arg0) {
        field4242 = null;
        field4248 = null;
        if (arg0 == 51) {
            field4245 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(III)V")
    private class225(int arg0, int arg1, int arg2) {
    }
}
