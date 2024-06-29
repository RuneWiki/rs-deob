import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class103 {

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    private int field1895 = -1;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    private int field1898 = 0;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Len;")
    private class49 field1883 = new class49();

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Z")
    public boolean field1903 = false;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    private int field1891;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[Lke;")
    private class130[] field1882;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    private int field1897;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[[I")
    private int[][] field1890;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1887 = " has logged in.";

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1888 = "red:";

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lke;")
    private static class130 field1893 = new class130(0, 0);

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Llj;")
    public static class59 field1896 = new class59(64);

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1899 = new CRC32();

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field1900 = 0;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Lek;")
    public static class206 field1902;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method775(int arg0, int arg1) {
        if (arg1 <= 123) {
            this.method780(-52);
        }
        field1889++;
        if (this.field1897 == this.field1891) {
            this.field1903 = this.field1882[arg0] == null;
            this.field1882[arg0] = field1893;
            return this.field1890[arg0];
        } else if (this.field1897 == 1) {
            this.field1903 = this.field1895 != arg0;
            this.field1895 = arg0;
            return this.field1890[0];
        } else {
            class130 var3 = this.field1882[arg0];
            if (var3 == null) {
                this.field1903 = true;
                if (this.field1898 >= this.field1897) {
                    class130 var4 = (class130) this.field1883.method429(-111);
                    var3 = new class130(arg0, var4.field2255);
                    this.field1882[var4.field2251] = null;
                    var4.method535(-2801);
                } else {
                    var3 = new class130(arg0, this.field1898);
                    this.field1898++;
                }
                this.field1882[arg0] = var3;
            } else {
                this.field1903 = false;
            }
            this.field1883.method434(0, var3);
            return this.field1890[var3.field2255];
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)[[I", line = 74)
    public final int[][] method776(int arg0) {
        field1884++;
        if (arg0 <= 95) {
            method777(3);
        }
        if (this.field1897 != this.field1891) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1897; var2++) {
            this.field1882[var2] = field1893;
        }
        return this.field1890;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(III)V", line = 225)
    public class103(int arg0, int arg1, int arg2) {
        this.field1891 = arg1;
        this.field1882 = new class130[this.field1891];
        this.field1897 = arg0;
        this.field1890 = new int[this.field1897][arg2];
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 125)
    public static void method777(int arg0) {
        if (arg0 != -16378) {
            method777(-121);
        }
        field1902 = null;
        field1893 = null;
        field1899 = null;
        field1887 = null;
        field1896 = null;
        field1888 = null;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Ljava/lang/String;", line = 141)
    public static final String method778(int arg0) {
        field1894++;
        String var1;
        if (class222.field3674 == 1 && class137.field2343 < 2) {
            var1 = class363.field5744 + class145.field2430 + class147.field2511 + " ->";
        } else if (class52.field1046 && class137.field2343 < 2) {
            var1 = class112.field2047 + class145.field2430 + class10.field287 + " ->";
        } else if (class274.field4473 && class261.field4307[81] && class137.field2343 > 2) {
            var1 = class142.method972(class137.field2343 - 2, (byte) 37);
        } else {
            var1 = class142.method972(class137.field2343 - 1, (byte) 37);
        }
        if (class137.field2343 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class137.field2343 - 2) + class78.field1385;
        }
        if (arg0 <= 68) {
            method778(32);
        }
        return var1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 183)
    public static final void method779(boolean arg0) {
        field1885++;
        if (arg0) {
            class23.field565.method895(128);
            class125.field2200.method895(128);
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V", line = 211)
    public final void method780(int arg0) {
        for (int var2 = arg0; var2 < this.field1897; var2++) {
            this.field1890[var2] = null;
        }
        this.field1882 = null;
        field1886++;
        this.field1890 = (int[][]) null;
        this.field1883.method440(-45);
        this.field1883 = null;
    }
}
