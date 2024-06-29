import java.util.Calendar;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 {

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1971 = 0;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1974 = new CRC32();

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field1977 = 127;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field1978 = 0;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field1981 = 0;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Lja;")
    public static class62 field1982 = class30.method243(43, "Script error in: ");

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Z")
    public static boolean field1984 = false;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Lja;")
    public static class62 field1983 = class30.method243(43, "<)4col>");

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1985 = Calendar.getInstance();

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "Lpd;")
    public static class108 field1979;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lib;")
    public static class57 field1980;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1970;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "[[B")
    public static byte[][] field1986;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ls;[BI)V")
    public final void method639(class128 arg0, byte[] arg1, int arg2) {
        field1972++;
        if (arg0.field2874[arg0.field2873] != 31 || arg0.field2874[arg0.field2873 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1970 == null) {
            this.field1970 = new Inflater(true);
        }
        try {
            this.field1970.setInput(arg0.field2874, arg0.field2873 + 10, -arg0.field2873 + -18 + arg0.field2874.length);
            this.field1970.inflate(arg1);
            if (arg2 != 13120) {
                method641(13);
            }
        } catch (Exception var4) {
            this.field1970.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1970.reset();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static final void method640(boolean arg0) {
        field1969++;
        if (arg0) {
            class134.field3057 = null;
            class100.field2325 = null;
            class53.field1224 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method641(int arg0) {
        field1980 = null;
        field1985 = null;
        field1982 = null;
        field1983 = null;
        field1986 = null;
        field1974 = null;
        int var1 = -126 % ((arg0 - 69) / 47);
        field1979 = null;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class82() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static final void method642(int arg0) {
        field1975++;
        class113.field2613.method750(127);
        if (arg0 != -23891) {
            return;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class8.field220[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class113.field2616[var2] = 0L;
        }
        class155.field3577 = 0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)Z")
    public static final boolean method643(int arg0, boolean arg1) {
        field1976++;
        if (!arg1) {
            method641(44);
        }
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
    public static final void method644(int arg0, byte arg1) {
        if (arg1 >= 2) {
            field1973++;
            if (class29.method241(arg0, -1)) {
                client.method157(class131.field2990[arg0], -106, -1);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V")
    private class82(int arg0, int arg1, int arg2) {
    }
}
