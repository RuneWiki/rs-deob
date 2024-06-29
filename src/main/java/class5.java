import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class5 {

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "Lta;")
    public static class37 field55 = class20.method87(-83, "Candle Shop");

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "Lta;")
    public static class37 field56 = class20.method87(-119, "world");

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "I")
    public static volatile int field54 = -1;

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "Lta;")
    public static class37 field58 = class20.method87(-87, "Fur Trader");

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Lta;")
    public static class37 field57 = class20.method87(-115, "Farming patch");

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "Lta;")
    public static class37 field60 = class20.method87(-93, "Food Shop");

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "Lta;")
    public static class37 field62 = class20.method87(-117, "Helmet Shop");

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field59;

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "[I")
    public static int[] field61;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(B[B)Loa;", line = 9)
    public static final class29 method18(byte arg0, byte[] arg1) {
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -73) {
            field61 = null;
        }
        class29 var2 = new class29(arg1, class37.field507, class11.field121, class12.field138, class20.field231, class7.field78, class38.field517);
        class33.method193((byte) -106);
        return var2;
    }

    @OriginalMember(owner = "mapview!ca", name = "<init>", descriptor = "()V", line = 44)
    public class5() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Z)V", line = 72)
    public static void method19(boolean arg0) {
        field60 = null;
        field57 = null;
        field61 = null;
        field58 = null;
        field55 = null;
        if (arg0) {
            field54 = 119;
        }
        field62 = null;
        field56 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I[Lta;)Lta;", line = 110)
    public static final class37 method20(int arg0, class37[] arg1) {
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg0 > -103) {
            method18((byte) -119, null);
        }
        return class7.method31(472, 0, arg1, arg1.length);
    }

    @OriginalMember(owner = "mapview!ca", name = "<init>", descriptor = "(III)V", line = 126)
    private class5(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(ILka;[B)V", line = 145)
    public final void method21(int arg0, class21 arg1, byte[] arg2) {
        if (~arg1.field234[arg1.field235] != arg0 || arg1.field234[arg1.field235 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field59 == null) {
            this.field59 = new Inflater(true);
        }
        try {
            this.field59.setInput(arg1.field234, arg1.field235 + 10, -8 - (arg1.field235 - (arg1.field234.length + -10)));
            this.field59.inflate(arg2);
        } catch (Exception var5) {
            this.field59.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field59.reset();
    }
}
