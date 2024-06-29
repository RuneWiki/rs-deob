import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class58 {

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
    private int field679 = 0;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "Llk;")
    private class638 field677;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "Lsja;")
    private class69 field676;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field674;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)Lsja;", line = 5)
    public final class69 method476(int arg0) {
        field675++;
        if (~this.field679 < arg0 && this.field677.field8962[this.field679 - 1] != this.field676) {
            class69 var2 = this.field676;
            this.field676 = var2.field767;
            return var2;
        }
        while (this.field679 < this.field677.field8960) {
            class69 var3 = this.field677.field8962[this.field679++].field767;
            if (this.field677.field8962[this.field679 - 1] != var3) {
                this.field676 = var3.field767;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V", line = 34)
    public static void method477(int arg0) {
        field674 = null;
        if (arg0 != -22919) {
            method477(-58);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIIILns;)V", line = 45)
    public static final void method478(int arg0, int arg1, int arg2, int arg3, class654 arg4) {
        if (arg3 >= -126) {
            method477(53);
        }
        field678++;
        class148 var5 = arg4.method3736((byte) 118);
        int var6 = arg4.field9171 - arg4.field9128.field7662 & 0x3FFF;
        if (arg0 == -1) {
            if (var6 != 0 || arg4.field9155 > 25) {
                if (arg1 < 0 && var5.field1901 != -1) {
                    arg4.field9198 = var5.field1901;
                    arg4.field9207 = false;
                } else if (arg1 <= 0 || var5.field1927 == -1) {
                    arg4.field9198 = var5.field1939;
                } else {
                    arg4.field9198 = var5.field1927;
                }
                arg4.field9207 = false;
            } else if (!arg4.field9207 || !var5.method985(arg4.field9198, -15219)) {
                arg4.field9198 = var5.method982(-116);
                arg4.field9207 = arg4.field9198 != -1;
            }
        } else if (arg4.field9137 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class390.field5562[arg2] - arg4.field9128.field7662 & 0x3FFF;
            arg4.field9207 = false;
            if (arg0 == 2 && var5.field1915 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1920 != -1) {
                    arg4.field9198 = var5.field1920;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1886 != -1) {
                    arg4.field9198 = var5.field1886;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1930 == -1) {
                    arg4.field9198 = var5.field1915;
                } else {
                    arg4.field9198 = var5.field1930;
                }
            } else if (arg0 == 0 && var5.field1916 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1938 != -1) {
                    arg4.field9198 = var5.field1938;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1931 != -1) {
                    arg4.field9198 = var5.field1931;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1896 == -1) {
                    arg4.field9198 = var5.field1916;
                } else {
                    arg4.field9198 = var5.field1896;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field1911 != -1) {
                arg4.field9198 = var5.field1911;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field1897 != -1) {
                arg4.field9198 = var5.field1897;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field1921 == -1) {
                arg4.field9198 = var5.field1939;
            } else {
                arg4.field9198 = var5.field1921;
            }
        } else if (var6 == 0 && arg4.field9155 <= 25) {
            arg4.field9207 = false;
            if (arg0 == 2 && var5.field1915 != -1) {
                arg4.field9198 = var5.field1915;
            } else if (arg0 == 0 && var5.field1916 != -1) {
                arg4.field9198 = var5.field1916;
            } else {
                arg4.field9198 = var5.field1939;
            }
        } else {
            if (arg0 == 2 && var5.field1915 != -1) {
                if (arg1 < 0 && var5.field1925 != -1) {
                    arg4.field9198 = var5.field1925;
                } else if (arg1 <= 0 || var5.field1914 == -1) {
                    arg4.field9198 = var5.field1915;
                } else {
                    arg4.field9198 = var5.field1914;
                }
            } else if (arg0 == 0 && var5.field1916 != -1) {
                if (arg1 < 0 && var5.field1941 != -1) {
                    arg4.field9198 = var5.field1941;
                } else if (arg1 <= 0 || var5.field1918 == -1) {
                    arg4.field9198 = var5.field1916;
                } else {
                    arg4.field9198 = var5.field1918;
                }
            } else if (arg1 < 0 && var5.field1891 != -1) {
                arg4.field9198 = var5.field1891;
            } else if (arg1 <= 0 || var5.field1936 == -1) {
                arg4.field9198 = var5.field1939;
            } else {
                arg4.field9198 = var5.field1936;
            }
            arg4.field9207 = false;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)Lsja;", line = 209)
    public final class69 method479(byte arg0) {
        this.field679 = 0;
        field680++;
        int var2 = 126 / ((arg0 - 27) / 53);
        return this.method476(-1);
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "()V", line = 227)
    public class58() {
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Llk;)V", line = 229)
    public class58(class638 arg0) {
        this.field677 = arg0;
    }
}
