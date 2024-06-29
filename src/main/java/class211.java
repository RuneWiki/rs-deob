import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class211 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[Ljd;")
    public static class92[] field4082 = new class92[100];

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Ljd;")
    private static class92 field4085 = class202.method1325((byte) 90, "FULL");

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Ljd;")
    private static class92 field4088 = class202.method1325((byte) 90, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Ljd;")
    public static class92 field4087 = field4085;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Ljd;")
    public static class92 field4089 = field4088;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lbg;")
    public static class18 field4080 = new class18();

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lrf;")
    public static class167 field4086;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4081;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B[BLh;)V")
    public final void method1372(byte arg0, byte[] arg1, class70 arg2) {
        field4083++;
        if (arg2.field1493[arg2.field1472] != 31 || arg2.field1493[arg2.field1472 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4081 == null) {
            this.field4081 = new Inflater(true);
        }
        try {
            this.field4081.setInput(arg2.field1493, arg2.field1472 + 10, -arg2.field1472 - 10 + arg2.field1493.length + -8);
            this.field4081.inflate(arg1);
        } catch (Exception var5) {
            this.field4081.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4081.reset();
        int var4 = 97 % ((arg0 - 78) / 34);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static void method1373(boolean arg0) {
        field4086 = null;
        if (arg0) {
            field4089 = null;
        }
        field4089 = null;
        field4085 = null;
        field4087 = null;
        field4082 = null;
        field4080 = null;
        field4088 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class211() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(III)V")
    private class211(int arg0, int arg1, int arg2) {
    }
}
