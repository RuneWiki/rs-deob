import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class143 {

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    private int field1891 = 0;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "[Lo;")
    public class393[] field1876;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1875 = 0;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1893 = "Attack";

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "J")
    private long field1886;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lo;")
    private class393 field1878;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Lo;")
    private class393 field1890;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[Lme;")
    public static class361[] field1881;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Lo;", line = 9)
    public final class393 method949(int arg0) {
        field1882++;
        if (this.field1878 == null) {
            return null;
        }
        class393 var2 = this.field1876[(int) ((long) (this.field1888 + arg0) & this.field1886)];
        while (this.field1878 != var2) {
            if (this.field1878.field5903 == this.field1886) {
                class393 var3 = this.field1878;
                this.field1878 = this.field1878.field5895;
                return var3;
            }
            this.field1878 = this.field1878.field5895;
        }
        this.field1878 = null;
        return null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)I", line = 39)
    public static final int method950(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -15543) {
            field1875 = 75;
        }
        field1889++;
        if (arg3 < arg2) {
            return arg2;
        } else if (arg1 >= arg3) {
            return arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Lo;", line = 57)
    public final class393 method951(int arg0) {
        field1880++;
        if (this.field1891 > arg0 && this.field1876[this.field1891 - 1] != this.field1890) {
            class393 var2 = this.field1890;
            this.field1890 = var2.field5895;
            return var2;
        }
        while (this.field1888 > this.field1891) {
            class393 var3 = this.field1876[this.field1891++].field5895;
            if (this.field1876[this.field1891 - 1] != var3) {
                this.field1890 = var3.field5895;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V", line = 87)
    public final void method952(int arg0) {
        int var2 = 0;
        int var3 = -27 % ((46 - arg0) / 43);
        while (this.field1888 > var2) {
            class393 var4 = this.field1876[var2];
            while (true) {
                class393 var5 = var4.field5895;
                if (var4 == var5) {
                    var2++;
                    break;
                }
                var5.method2574((byte) 124);
            }
        }
        field1874++;
        this.field1878 = null;
        this.field1890 = null;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Lo;", line = 123)
    public final class393 method953(int arg0) {
        field1884++;
        this.field1891 = arg0;
        return this.method951(arg0);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IJ)Lo;", line = 134)
    public final class393 method954(int arg0, long arg1) {
        field1887++;
        this.field1886 = arg1;
        class393 var4 = this.field1876[(int) (arg1 & (long) (this.field1888 - 1))];
        this.field1878 = var4.field5895;
        int var5 = 87 / (arg0 / 42);
        while (this.field1878 != var4) {
            if (this.field1878.field5903 == arg1) {
                class393 var6 = this.field1878;
                this.field1878 = this.field1878.field5895;
                return var6;
            }
            this.field1878 = this.field1878.field5895;
        }
        this.field1878 = null;
        return null;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)I", line = 164)
    public final int method955(int arg0) {
        if (arg0 != 17167) {
            return -14;
        }
        field1879++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1888; var3++) {
            class393 var4 = this.field1876[var3];
            for (class393 var5 = var4.field5895; var5 != var4; var5 = var5.field5895) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZJLo;)V", line = 198)
    public final void method956(boolean arg0, long arg1, class393 arg2) {
        field1892++;
        if (arg2.field5898 != null) {
            arg2.method2574((byte) 117);
        }
        class393 var5 = this.field1876[(int) ((long) (this.field1888 - 1) & arg1)];
        arg2.field5895 = var5;
        arg2.field5898 = var5.field5898;
        arg2.field5898.field5895 = arg2;
        arg2.field5903 = arg1;
        arg2.field5895.field5898 = arg2;
        if (arg0) {
            this.method953(-94);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIII)V", line = 219)
    public static final void method957(int arg0, int arg1, int arg2, int arg3) {
        if (class274.field4030 != null) {
            class274.field4030[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)I", line = 224)
    public final int method958(int arg0) {
        field1885++;
        int var2 = -26 / ((27 - arg0) / 45);
        return this.field1888;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(IIII)I", line = 234)
    public static final int method959(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 243) {
            arg0 >>= 0x4;
        } else if (arg1 > 217) {
            arg0 >>= 0x3;
        } else if (arg1 > 192) {
            arg0 >>= 0x2;
        } else if (arg1 > 179) {
            arg0 >>= 0x1;
        }
        if (arg3 != 13552) {
            method962((byte) -27);
        }
        field1883++;
        return ((arg2 & 0xFF) >> 2 << 10) + ((arg0 >> 5 << 7) + (arg1 >> 1));
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I)V", line = 265)
    public class143(int arg0) {
        this.field1876 = new class393[arg0];
        this.field1888 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class393 var3 = this.field1876[var2] = new class393();
            var3.field5898 = var3;
            var3.field5895 = var3;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lqj;I)V", line = 290)
    public static final void method960(class238 arg0, int arg1) {
        class390.field5851 = 0;
        class419.field6225 = arg1;
        field1894++;
        class175.field2291 = new class146();
        class291.field4206 = new class341[1024];
        class307.method1924(arg0, 16383);
        class452.method2826(46, arg0);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([Lo;I)I", line = 303)
    public final int method961(class393[] arg0, int arg1) {
        field1877++;
        int var3 = arg1;
        for (int var4 = 0; var4 < this.field1888; var4++) {
            class393 var5 = this.field1876[var4];
            for (class393 var6 = var5.field5895; var6 != var5; var6 = var6.field5895) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 332)
    public static void method962(byte arg0) {
        field1881 = null;
        if (arg0 == 87) {
            field1893 = null;
        }
    }
}
