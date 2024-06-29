import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class131 {

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    private int field1931 = -1;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    private int field1936 = 0;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field1930 = 0;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "[J")
    public static long[] field1926 = new long[200];

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Z")
    public static boolean field1939 = false;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "[J")
    public static long[] field1942 = new long[32];

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public int field1929;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
    public static final void method897(int arg0, int arg1) {
        if (arg1 < -40) {
            field1927++;
            class105 var2 = class9.method72(7, -1, arg0);
            var2.method764((byte) -128);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILca;I)V")
    private final void method898(int arg0, int arg1, class54 arg2, int arg3) {
        field1937++;
        if (arg3 == 1) {
            this.field1936 = arg2.method408(8);
            this.method901(-127, this.field1936);
        } else if (arg3 == 2) {
            this.field1931 = arg2.method423(arg0 ^ 0x39);
            if (this.field1931 == 65535) {
                this.field1931 = -1;
            }
        } else if (arg3 == 3) {
            arg2.method423(-112);
        }
        if (arg0 != 0) {
            field1939 = true;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V")
    public static final void method899(int arg0, int arg1) {
        field1941++;
        if (arg0 > -6) {
            method902(2);
        }
        class141.field2030.method938(arg1, (byte) -123);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method900(int arg0) {
        if (arg0 != 87) {
            method902(53);
        }
        field1926 = null;
        field1942 = null;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(II)V")
    private final void method901(int arg0, int arg1) {
        field1935++;
        double var3 = (double) ((arg1 & 0xFF8156) >> 16) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (var3 > var9) {
            var7 = var9;
        }
        if (var7 > var5) {
            var7 = var5;
        }
        double var11 = var3;
        if (var9 > var3) {
            var11 = var9;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var5 > var11) {
            var11 = var5;
        }
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var7) / (2.0D - var11 - var7);
            }
            if (var3 == var11) {
                var15 = (var9 - var5) / (var11 - var7);
            } else if (var9 == var11) {
                var15 = (var5 - var3) / (var11 - var7) + 2.0D;
            } else if (var5 == var11) {
                var15 = (var3 - var9) / (var11 - var7) + 4.0D;
            }
        }
        this.field1940 = (int) (var17 * 256.0D);
        if (this.field1940 < 0) {
            this.field1940 = 0;
        } else if (this.field1940 > 255) {
            this.field1940 = 255;
        }
        double var19 = var15 / 6.0D;
        int var21 = 70 % ((arg0 + 62) / 37);
        if ((var17 > 0.5D)) {
            this.field1925 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field1925 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field1925 < 1) {
            this.field1925 = 1;
        }
        this.field1938 = (int) (var13 * 256.0D);
        if (this.field1938 < 0) {
            this.field1938 = 0;
        } else if (this.field1938 > 255) {
            this.field1938 = 255;
        }
        this.field1929 = (int) ((double) this.field1925 * var19);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static final void method902(int arg0) {
        class39.field693 = 0;
        class125.field1846 = false;
        class73.field1190 = 1;
        field1934++;
        class167.field2455 = 0;
        class147.field2132 = -3;
        class152.field2225 = arg0;
        class29.field539 = 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static final void method903(byte arg0) {
        if (class42.field738 != null) {
            class9 var1 = class42.field738;
            synchronized (class42.field738) {
                class42.field738 = null;
            }
        }
        field1933++;
        if (arg0 > -108) {
            field1930 = -1;
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(II)I")
    public static int method904(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBLca;)V")
    public final void method905(int arg0, byte arg1, class54 arg2) {
        if (arg1 != 95) {
            return;
        }
        while (true) {
            int var4 = arg2.method407(255);
            if (var4 == 0) {
                field1928++;
                return;
            }
            this.method898(0, arg0, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLjava/lang/String;IZ)Z")
    public static final boolean method906(boolean arg0, String arg1, int arg2, boolean arg3) {
        field1932++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (!arg3) {
            field1939 = false;
        }
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg2) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }
}
