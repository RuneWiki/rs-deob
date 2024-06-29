import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class86 extends class65 {

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "[I")
    public int[] field1943 = new int[5];

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    public int field1966 = 0;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "[Lne;")
    public class83[] field1961 = new class83[5];

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    public int field1954;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Lrc;")
    private static class105 field1936 = class43.method374("Loading ignore list", 0);

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field1947 = 0;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field1937 = 0;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "Lrc;")
    private static class105 field1952 = class43.method374("Login server offline)3", 0);

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "Lrc;")
    public static class105 field1940 = field1952;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "Lrc;")
    public static class105 field1958 = field1936;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Lrc;")
    public static class105 field1939 = class43.method374("@or3@", 0);

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "Z")
    public static boolean field1956 = false;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "Lrc;")
    public static class105 field1967 = class43.method374("::errortest", 0);

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "[I")
    public static int[] field1953 = new int[2000];

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "[Lrc;")
    public static class105[] field1938 = new class105[200];

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public int field1950;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    public int field1957;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "Lr;")
    public class102 field1964;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "Ldd;")
    public class23 field1945;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "Lg;")
    public class37 field1949;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "Lja;")
    public class55 field1963;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "Ln;")
    public class78 field1970;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "Lob;")
    public class86 field1972;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "Lpa;")
    public class91 field1946;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "Z")
    public boolean field1955;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "Z")
    public boolean field1962;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "Z")
    public boolean field1965;

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(III)V", line = 9)
    public class86(int arg0, int arg1, int arg2) {
        this.field1968 = this.field1951 = arg0;
        this.field1971 = arg1;
        this.field1954 = arg2;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIILjava/awt/Component;)Lfc;", line = 20)
    public static final class34 method712(int arg0, int arg1, int arg2, Component arg3) {
        field1948++;
        try {
            int var4 = 5 % ((34 - arg0) / 42);
            Class var5 = Class.forName("pd");
            class34 var6 = (class34) var5.getDeclaredConstructor().newInstance();
            var6.method321(arg1, arg2, 50, arg3);
            return var6;
        } catch (Throwable var8) {
            class66 var7 = new class66();
            var7.method321(arg1, arg2, 50, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V", line = 93)
    public static final void method713(int arg0, int arg1, int arg2) {
        field1959++;
        class3 var3 = class126.field3060[class73.field1619][arg1][arg0];
        if (var3 == null) {
            class130.field3161.method522(class73.field1619, arg1, arg0);
            return;
        }
        class98 var4 = null;
        int var5 = -99999999;
        for (class98 var6 = (class98) var3.method31(arg2 - 1610611456); var6 != null; var6 = (class98) var3.method26((byte) 108)) {
            class31 var11 = class75.method636(var6.field2255, 0);
            int var12 = var11.field699;
            if (var11.field725 == 1) {
                var12 = (var6.field2265 + 1) * var12;
            }
            if (var5 < var12) {
                var5 = var12;
                var4 = var6;
            }
        }
        if (var4 == null) {
            class130.field3161.method522(class73.field1619, arg1, arg0);
            return;
        }
        class98 var7 = null;
        var3.method29(var4, true);
        class98 var8 = (class98) var3.method31(arg2 - 1610611456);
        class98 var9 = null;
        int var10 = (arg0 << 7) + arg2 + arg1;
        while (var8 != null) {
            if (var4.field2255 != var8.field2255) {
                if (var9 == null) {
                    var9 = var8;
                }
                if (var8.field2255 != var9.field2255 && var7 == null) {
                    var7 = var8;
                }
            }
            var8 = (class98) var3.method26((byte) 108);
        }
        class130.field3161.method496(class73.field1619, arg1, arg0, class134.method1061(11387, class73.field1619, arg1 * 128 + 64, arg0 * 128 - -64), var4, var10, var9, var7);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILpb;BI)[Leb;", line = 169)
    public static final class27[] method714(int arg0, class92 arg1, byte arg2, int arg3) {
        field1942++;
        if (class58.method466(arg3, arg0, (byte) 108, arg1)) {
            if (arg2 != -48) {
                method713(-128, 111, -11);
            }
            return class9.method115(-89);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 194)
    public static void method715(int arg0) {
        field1939 = null;
        field1958 = null;
        field1936 = null;
        field1967 = null;
        field1940 = null;
        field1953 = null;
        field1938 = null;
        if (arg0 == 0) {
            field1952 = null;
        }
    }
}
