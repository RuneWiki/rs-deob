import java.awt.Frame;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class25 {

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "I")
    public static int field225 = 0;

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "I")
    public static int field228 = 0;

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "Lu;")
    public static class38 field223 = class9.method45(-41, "Hunter Store");

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Lu;")
    public static class38 field226 = class9.method45(-41, "Skirt Shop");

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field227;

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field222;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B)V", line = 5)
    public static void method120(byte arg0) {
        field223 = null;
        field226 = null;
        if (arg0 != 67) {
            field225 = 92;
        }
        field227 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "(III)V", line = 29)
    private class25(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "()V", line = 49)
    public class25() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(ILr;[B)V", line = 53)
    public final void method121(int arg0, class33 arg1, byte[] arg2) {
        if (arg1.field429[arg1.field427] != 31 || arg1.field429[arg1.field427 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field222 == null) {
            this.field222 = new Inflater(true);
        }
        try {
            this.field222.setInput(arg1.field429, arg1.field427 + 10, arg1.field429.length - 10 - (arg1.field427 - -8));
            this.field222.inflate(arg2);
            if (arg0 != 0) {
                this.method121(-108, null, null);
            }
        } catch (Exception var5) {
            this.field222.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field222.reset();
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IB[BI)I", line = 104)
    public static final int method122(int arg0, byte arg1, byte[] arg2, int arg3) {
        int var4 = -1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = class14.field132[(arg2[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        if (arg1 != -15) {
            field228 = -41;
        }
        return ~var4;
    }
}
