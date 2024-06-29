import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class85 extends class67 {

    @OriginalMember(owner = "client!me", name = "M", descriptor = "[I")
    public int[] field1898 = new int[5];

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "[Lla;")
    public class75[] field1918 = new class75[5];

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "I")
    public int field1913 = 0;

    @OriginalMember(owner = "client!me", name = "jb", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "Lrd;")
    public static class114 field1885 = class84.method656("@gre@", (byte) 119);

    @OriginalMember(owner = "client!me", name = "E", descriptor = "Lrd;")
    public static class114 field1890 = class84.method656("backright1", (byte) 115);

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field1897 = 0;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    public static int field1893 = 0;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "Lrd;")
    public static class114 field1894 = class84.method656("Verbindung mit", (byte) 123);

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field1888 = 78;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "Lrd;")
    private static class114 field1892 = class84.method656("Error connecting to server)3", (byte) 124);

    @OriginalMember(owner = "client!me", name = "J", descriptor = "Z")
    public static volatile boolean field1895 = true;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field1902 = 0;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Lrd;")
    public static class114 field1886 = field1892;

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "Lrd;")
    public static class114 field1914 = class84.method656("Icons redrawn", (byte) 119);

    @OriginalMember(owner = "client!me", name = "lb", descriptor = "I")
    public static int field1923 = 0;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!me", name = "kb", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Lra;")
    public class111 field1906;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "Lbc;")
    public class11 field1917;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "Lt;")
    public class122 field1903;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "Lmb;")
    public class82 field1910;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "Lme;")
    public class85 field1901;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "Lnb;")
    public class88 field1904;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "Lob;")
    public class94 field1907;

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "Z")
    public boolean field1911;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "Z")
    public boolean field1915;

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "Z")
    public boolean field1919;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public static void method657(int arg0) {
        field1890 = null;
        field1892 = null;
        int var1 = -73 / ((arg0 + 75) / 47);
        field1885 = null;
        field1894 = null;
        field1914 = null;
        field1886 = null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(III)V")
    public class85(int arg0, int arg1, int arg2) {
        this.field1921 = arg2;
        this.field1899 = arg1;
        this.field1916 = this.field1900 = arg0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILpb;ZLpb;I)La;")
    public static final class1 method658(int arg0, class100 arg1, boolean arg2, class100 arg3, int arg4) {
        field1891++;
        boolean var5 = true;
        int[] var6 = arg1.method751(arg0, false);
        for (int var7 = arg4; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method774(arg0, -1, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg3.method774(0, -1, var9);
                } else {
                    var10 = arg3.method774(var9, ~arg4, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class1(arg1, arg3, arg0, arg2);
        } catch (Exception var11) {
            return null;
        }
    }
}
