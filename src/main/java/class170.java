import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class170 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Lma;")
    public static class5 field2610 = class12.method119("<br>(X100(U(Y", (byte) 65);

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Z")
    public static volatile boolean field2613 = false;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field2617 = -1;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field2619 = 0;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2621;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "[[[B")
    public static byte[][][] field2614;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILeb;)Lma;", line = 24)
    public static final class5 method1128(int arg0, class253 arg1) {
        field2611++;
        if (class8.method89(100, client.method767(arg1)) == 0) {
            return null;
        } else if (arg1.field4242 == null || arg1.field4242.method40((byte) -114).method36(30673) == 0) {
            return class184.field2833 ? class104.field1553 : null;
        } else {
            if (arg0 <= 85) {
                field2619 = 116;
            }
            return arg1.field4242;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lii;B[B)V", line = 58)
    public final void method1129(class221 arg0, byte arg1, byte[] arg2) {
        field2623++;
        if (arg0.field3617[arg0.field3610] != 31 || arg0.field3617[arg0.field3610 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (arg1 >= -92) {
            field2618 = 58;
        }
        if (this.field2621 == null) {
            this.field2621 = new Inflater(true);
        }
        try {
            this.field2621.setInput(arg0.field3617, arg0.field3610 + 10, -8 - (arg0.field3610 + 10) + arg0.field3617.length);
            this.field2621.inflate(arg2);
        } catch (Exception var5) {
            this.field2621.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2621.reset();
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 82)
    public class170() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 104)
    public static void method1130(byte arg0) {
        field2610 = null;
        if (arg0 >= 108) {
            field2614 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lec;I)I", line = 117)
    public static final int method1131(class91 arg0, int arg1) {
        field2615++;
        if (arg1 != -4) {
            field2618 = -62;
        }
        int var2 = arg0.field1372;
        if (arg0.field202 == arg0.field173) {
            var2 = arg0.field1371;
        } else if (arg0.field184 == arg0.field173) {
            var2 = arg0.field1379;
        }
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(III)V", line = 142)
    private class170(int arg0, int arg1, int arg2) {
    }
}
