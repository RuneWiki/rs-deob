import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!sa")
public class class36 {

    @OriginalMember(owner = "mapview!sa", name = "e", descriptor = "Lu;")
    public static class38 field467 = class28.method177("Hunter Training", (byte) -84);

    @OriginalMember(owner = "mapview!sa", name = "f", descriptor = "Lu;")
    public static class38 field468 = class28.method177("Chainmail Shop", (byte) -84);

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "Lu;")
    public static class38 field463 = class28.method177("???", (byte) -84);

    @OriginalMember(owner = "mapview!sa", name = "i", descriptor = "Lu;")
    public static class38 field471 = class28.method177("Mini)2Game", (byte) -84);

    @OriginalMember(owner = "mapview!sa", name = "d", descriptor = "Z")
    public static boolean field466 = false;

    @OriginalMember(owner = "mapview!sa", name = "g", descriptor = "Lu;")
    public static class38 field469 = class28.method177("Makeover Mage", (byte) -84);

    @OriginalMember(owner = "mapview!sa", name = "h", descriptor = "Lu;")
    public static class38 field470 = class28.method177("Please wait)3)3)3 Rendering Map", (byte) -84);

    @OriginalMember(owner = "mapview!sa", name = "j", descriptor = "Lu;")
    public static class38 field472 = class28.method177("Brewery", (byte) -84);

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field465;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Lj;[BZ)V", line = 19)
    public final void method210(class19 arg0, byte[] arg1, boolean arg2) {
        if (arg0.field193[arg0.field196] != 31 || arg0.field193[arg0.field196 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field465 == null) {
            this.field465 = new Inflater(true);
        }
        try {
            this.field465.setInput(arg0.field193, arg0.field196 + 10, -arg0.field196 + -18 + arg0.field193.length);
            this.field465.inflate(arg1);
        } catch (Exception var5) {
            this.field465.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (!arg2) {
            field463 = null;
        }
        this.field465.reset();
    }

    @OriginalMember(owner = "mapview!sa", name = "<init>", descriptor = "()V", line = 53)
    public class36() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(I)V", line = 61)
    public static void method211(int arg0) {
        field471 = null;
        field463 = null;
        field470 = null;
        field469 = null;
        field472 = null;
        field467 = null;
        if (arg0 == -1) {
            field468 = null;
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "<init>", descriptor = "(III)V", line = 112)
    private class36(int arg0, int arg1, int arg2) {
    }
}
