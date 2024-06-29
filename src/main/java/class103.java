import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class103 {

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field1888 = 0;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Ldj;")
    public static class44 field1885 = class89.method650(255, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!je", name = "d", descriptor = "[Ldj;")
    public static class44[] field1876 = new class44[1000];

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Ldj;")
    private static class44 field1889 = class89.method650(255, "Hidden");

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Ldj;")
    public static class44 field1881 = field1889;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Ldj;")
    public static class44 field1890 = null;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Ldj;")
    public static class44 field1883 = class89.method650(255, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lle;")
    public static class125 field1878;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lnf;")
    public static class147 field1874;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1886;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "[I")
    public static int[] field1880;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public static final void method756(boolean arg0) {
        field1873++;
        if (!class181.field3135) {
            return;
        }
        class70.field1324 = null;
        field1878 = null;
        class75.field1435 = null;
        class210.field3757 = null;
        class196.field3468 = null;
        class106.field1954 = null;
        class94.field1737 = null;
        class166.field2849 = null;
        class152.field2648 = null;
        class104.field1895 = null;
        class62.field1166 = null;
        class71.field1351 = null;
        class151.field2636 = null;
        class207.field3722 = null;
        class80.field1545 = null;
        class84.field1639 = null;
        class87.field1666 = null;
        class72.field1377 = null;
        class219.field3964 = null;
        class181.field3152 = null;
        class53.field956 = null;
        class57.field1072 = null;
        class136.method914(2, 111);
        class173.method1102(arg0, (byte) -90);
        class181.field3135 = false;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class103() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I")
    public static final int method757(int arg0, int arg1) {
        field1875++;
        return arg0 == -10 ? arg1 >> 17 & 0x7 : -117;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBII)V")
    public static final void method758(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1882++;
        int var6 = 56 / ((-arg3 - 26) / 60);
        if (arg0 == arg4) {
            class117.method819(arg0, arg2, -2, arg1, arg5);
        } else if (arg1 - arg0 >= class70.field1337 && class70.field1321 >= arg0 + arg1 && arg2 - arg4 >= class14.field267 && class57.field1068 >= arg2 + arg4) {
            class136.method915(arg0, arg1, 1760071777, arg5, arg4, arg2);
        } else {
            class53.method383(arg5, arg2, arg4, arg1, arg0, 96);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method759(byte arg0) {
        field1890 = null;
        field1889 = null;
        field1880 = null;
        field1878 = null;
        field1876 = null;
        if (arg0 != -56) {
            method756(false);
        }
        field1885 = null;
        field1883 = null;
        field1874 = null;
        field1881 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lfj;[BB)V")
    public final void method760(class66 arg0, byte[] arg1, byte arg2) {
        field1884++;
        if (arg0.field1219[arg0.field1195] != 31 || arg0.field1219[arg0.field1195 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1886 == null) {
            this.field1886 = new Inflater(true);
        }
        try {
            int var4 = 21 % (-arg2 / 45);
            this.field1886.setInput(arg0.field1219, arg0.field1195 + 10, -arg0.field1195 + -10 - (8 - arg0.field1219.length));
            this.field1886.inflate(arg1);
        } catch (Exception var5) {
            this.field1886.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1886.reset();
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILld;I)V")
    public static final void method761(int arg0, class124 arg1, int arg2) {
        if (arg2 != -16934) {
            field1889 = null;
        }
        field1879++;
        if (class46.field868 < arg1.field2198) {
            class27.method197(false, arg1);
        } else if (class46.field868 <= arg1.field2199) {
            class78.method597(arg1, arg2 ^ 0x4225);
        } else {
            class189.method1181(2, arg1);
        }
        if (arg1.field2260 < 128 || arg1.field2195 < 128 || arg1.field2260 >= 13184 || arg1.field2195 >= 13184) {
            arg1.field2260 = arg1.field2240[0] * 128 + arg1.field2231 * 64;
            arg1.field2243 = -1;
            arg1.field2198 = 0;
            arg1.field2205 = -1;
            arg1.field2199 = 0;
            arg1.field2195 = arg1.field2235[0] * 128 + arg1.field2231 * 64;
            arg1.method852(-32768);
        }
        if (class96.field1774 == arg1 && (arg1.field2260 < 1536 || arg1.field2195 < 1536 || arg1.field2260 >= 11776 || arg1.field2195 >= 11776)) {
            arg1.field2205 = -1;
            arg1.field2195 = arg1.field2235[0] * 128 + arg1.field2231 * 64;
            arg1.field2243 = -1;
            arg1.field2199 = 0;
            arg1.field2198 = 0;
            arg1.field2260 = arg1.field2240[0] * 128 + arg1.field2231 * 64;
            arg1.method852(-32768);
        }
        class212.method1372(arg1, -12649);
        class61.method459(arg1, 13019);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(III)V")
    private class103(int arg0, int arg1, int arg2) {
    }
}
