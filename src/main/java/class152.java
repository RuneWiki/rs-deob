import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class152 extends class379 {

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1895 = 0;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "J")
    public long field1894;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lhc;")
    public class152 field1893;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Lhc;")
    public class152 field1903;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
    public static int[] field1900;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "[I")
    public static int[] field1904;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "[[Z")
    public static boolean[][] field1896;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BZ)I")
    public static final int method1086(byte arg0, boolean arg1) {
        field1892++;
        int var2 = class727.field10184;
        if (var2 == 0) {
            return arg1 ? 0 : class533.field7512;
        } else if (var2 == 1) {
            return class533.field7512;
        } else if (var2 == 2) {
            return 0;
        } else {
            if (arg0 >= -123) {
                method1086((byte) -71, false);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;II)I")
    public static final int method1087(String arg0, int arg1, int arg2) {
        field1905++;
        if (arg1 != 0) {
            field1904 = null;
        }
        return class7.method137(arg2, true, 0, arg0);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public final void method1088(int arg0) {
        field1899++;
        if (this.field1893 == null) {
            return;
        }
        this.field1893.field1903 = this.field1903;
        if (arg0 != 4) {
            method1090(4, -16, 42, null);
        }
        this.field1903.field1893 = this.field1893;
        this.field1893 = null;
        this.field1903 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method1089(byte arg0) {
        if (arg0 != -99) {
            method1087(null, 10, 109);
        }
        field1896 = null;
        field1900 = null;
        field1904 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1090(int arg0, int arg1, int arg2, String[] arg3) {
        field1897++;
        if (arg2 == 0) {
            return "";
        } else if (~arg2 == arg1) {
            String var4 = arg3[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg2;
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Z")
    public static final boolean method1091(int arg0, int arg1) {
        field1902++;
        if (arg1 > -2) {
            return true;
        } else {
            return (-arg0 & arg0) == arg0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Z")
    public final boolean method1092(int arg0) {
        field1898++;
        if (this.field1893 == null) {
            return false;
        } else {
            return arg0 < -2;
        }
    }
}
