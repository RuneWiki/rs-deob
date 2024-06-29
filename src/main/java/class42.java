import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class42 {

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "B")
    private byte field896;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lcd;")
    public static class23 field900 = class54.method414("<col=ffffff> )4 ", -1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field891 = new CRC32();

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lcd;")
    public static class23 field903 = class54.method414("k", -1);

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lcd;")
    private static class23 field902 = class54.method414("Loaded update list", -1);

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lcd;")
    public static class23 field904 = field902;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
    public final int method338(int arg0) {
        field899++;
        return arg0 == 1 ? this.field896 & 0x7 : -126;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static void method339(int arg0) {
        field903 = null;
        if (arg0 == 7) {
            field891 = null;
            field904 = null;
            field902 = null;
            field900 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)I")
    public final int method340(byte arg0) {
        if (arg0 != 95) {
            method339(3);
        }
        field893++;
        return (this.field896 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class42() {
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lva;)V")
    public class42(class189 arg0) {
        this.field896 = arg0.method1204(true);
        this.field901 = arg0.method1197(-1);
        this.field892 = arg0.method1190(-4);
        this.field898 = arg0.method1190(-4);
        this.field895 = arg0.method1190(-4);
        arg0.method1190(-4);
    }
}
