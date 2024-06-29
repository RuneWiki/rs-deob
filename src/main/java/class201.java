import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class201 extends InputStream {

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lok;")
    public static class146 field3350 = class235.method1724(-12908, ")3)3)3");

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lok;")
    public static class146 field3355 = class235.method1724(-12908, "Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3");

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Lok;")
    public static class146 field3356 = class235.method1724(-12908, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field3358 = 0;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Lok;")
    public static class146 field3359 = class235.method1724(-12908, "mem=");

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field3360 = 0;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field3352 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!o", name = "read", descriptor = "()I", line = 14)
    public final int read() {
        field3354++;
        class281.method2041((byte) 105, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 26)
    public static void method1541(byte arg0) {
        if (arg0 >= 74) {
            field3355 = null;
            field3350 = null;
            field3359 = null;
            field3356 = null;
        }
    }
}
