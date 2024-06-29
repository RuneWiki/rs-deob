import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class108 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field1894 = 1;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field1893 = 0;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1891 = new CRC32();

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[[Z")
    public static boolean[][] field1896 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lqd;")
    public static class40 field1895 = class147.method1106(":", (byte) -45);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "[Lcm;")
    public static class185[] field1898;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "[[[S")
    public static short[][][] field1892;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Lqd;", line = 4)
    public static final class40 method819(int arg0, byte arg1) {
        field1897++;
        int var2 = -22 % ((60 - arg1) / 54);
        return class3.field37[arg0].method350(true) > 0 ? class153.method1192(new class40[] { class246.field4079[arg0], class276.field4599, class3.field37[arg0] }, (byte) 127) : class246.field4079[arg0];
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 34)
    public static void method820(int arg0) {
        field1895 = null;
        field1898 = null;
        field1896 = (boolean[][]) null;
        field1892 = (short[][][]) null;
        field1891 = null;
        if (arg0 != 18986) {
            method819(-29, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqd;B)I", line = 62)
    public static final int method821(class40 arg0, byte arg1) {
        field1890++;
        int var2 = -25 % ((-arg1 - 52) / 45);
        for (int var3 = 0; var3 < class8.field115.length; var3++) {
            if (class8.field115[var3].method327(arg0, -21581)) {
                return var3;
            }
        }
        return -1;
    }
}
