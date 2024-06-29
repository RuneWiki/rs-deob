import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class149 extends class108 {

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "S")
    public short field1928;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Luda;")
    public static class509 field1929 = new class509(3);

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field1934 = 50;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "[I")
    public static int[] field1932 = new int[field1934];

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "[I")
    public static int[] field1937 = new int[field1934];

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "[I")
    public static int[] field1933 = new int[field1934];

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "[I")
    public static int[] field1936 = new int[field1934];

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "[C")
    public static char[] field1935 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[I")
    public static int[] field1930 = new int[field1934];

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "[I")
    public static int[] field1938 = new int[field1934];

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field1939 = new String[field1934];

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Lim;")
    public static class353 field1931 = new class353(9, 0);

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIZII)Lof;")
    public static final class496 method816(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1927++;
        class496 var5 = new class496();
        var5.field6914 = arg1;
        var5.field6912 = arg0;
        if (arg3 != 1) {
            field1938 = null;
        }
        class523.field7289.method3475(-110, var5, (long) arg4);
        class53.method298(arg1, 0);
        class447 var6 = class609.method3486(arg4, 983030160);
        if (var6 != null) {
            class90.method501(var6, -1);
        }
        if (class168.field2123 != null) {
            class90.method501(class168.field2123, arg3 ^ 0xFFFFFFFE);
            class168.field2123 = null;
        }
        class422.method2489(arg3 ^ 0xFFFFFF92);
        if (var6 != null) {
            class558.method3136((byte) 116, var6, !arg2);
        }
        if (!arg2) {
            class218.method1409(arg1);
        }
        if (!arg2 && class126.field1565 != -1) {
            class562.method3154((byte) 125, 1, class126.field1565);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static void method817(int arg0) {
        field1935 = null;
        field1937 = null;
        field1936 = null;
        field1930 = null;
        if (arg0 != 8225) {
            field1932 = null;
        }
        field1933 = null;
        field1929 = null;
        field1938 = null;
        field1932 = null;
        field1931 = null;
        field1939 = null;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class149() {
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(S)V")
    public class149(short arg0) {
        this.field1928 = arg0;
    }
}
