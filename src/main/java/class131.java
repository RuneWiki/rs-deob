import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class131 extends class381 {

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    private int field1900;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Z")
    private boolean field1881;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    private int field1898;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    private int field1903;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    private int field1892;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    private int field1896;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    private int field1888;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    private int field1891;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Z")
    private boolean field1890;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    private int field1894;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Ljava/lang/String;")
    private String field1884;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Ljava/lang/String;")
    private String field1906;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Ljava/lang/String;")
    private String field1897;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Ljava/lang/String;")
    private String field1883;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field1901 = 0;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Lvg;")
    public static class622 field1899 = new class622(105, 12);

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    private int field1882;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    private int field1887;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    private int field1889;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    private int field1893;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    private int field1902;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    private int field1908;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLgk;)V", line = 12)
    public final void method933(boolean arg0, class540 arg1) {
        arg1.method3110(5, 66);
        field1904++;
        arg1.method3110(this.field1900, 114);
        arg1.method3110(this.field1881 ? 1 : 0, 105);
        arg1.method3110(this.field1886, 40);
        arg1.method3110(this.field1898, 95);
        arg1.method3110(this.field1903, 37);
        arg1.method3110(this.field1892, 93);
        arg1.method3110(this.field1891, 103);
        arg1.method3110(this.field1890 ? 1 : 0, 76);
        arg1.method3162(-2003712696, this.field1888);
        arg1.method3110(this.field1896, 65);
        arg1.method3113(this.field1894, arg0);
        arg1.method3162(-2003712696, this.field1882);
        arg1.method3110(this.field1908, 97);
        arg1.method3110(this.field1889, 100);
        arg1.method3110(this.field1902, 59);
        arg1.method3161((byte) -90, this.field1884);
        arg1.method3161((byte) -22, this.field1883);
        arg1.method3161((byte) -53, this.field1906);
        arg1.method3161((byte) -61, this.field1897);
        arg1.method3110(this.field1887, 36);
        arg1.method3162(-2003712696, this.field1893);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 41)
    public static final String method934(byte arg0, String arg1) {
        field1895++;
        String var2 = null;
        int var3 = arg1.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg1.substring(0, var3 + 4);
            arg1 = arg1.substring(var3 + 4);
        }
        int var4 = 5 / ((arg0 + 14) / 62);
        if (arg1.startsWith("directlogin ")) {
            int var5 = arg1.indexOf(" ", "directlogin ".length());
            if (var5 >= 0) {
                int var6 = arg1.length();
                arg1 = arg1.substring(0, var5) + " ";
                for (int var7 = var5 + 1; var7 < var6; var7++) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var2 == null ? arg1 : var2 + arg1;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 86)
    public static void method935(int arg0) {
        field1899 = null;
        if (arg0 != 48) {
            method937(false);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I", line = 106)
    public final int method936(int arg0) {
        field1907++;
        byte var2 = 23;
        int var3 = -29 / ((arg0 - 68) / 50);
        int var4 = var2 + class530.method3074(this.field1884, 106);
        int var5 = var4 + class530.method3074(this.field1883, -122);
        int var6 = var5 + class530.method3074(this.field1906, 101);
        return var6 + class530.method3074(this.field1897, 93);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 123)
    public static final void method937(boolean arg0) {
        field1885++;
        class338.field4907 = -1;
        class180.field2494 = -1;
        class65.field1038 = 0;
        if (!arg0) {
            method935(-116);
        }
        class373.field5521 = -1;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V", line = 143)
    private final void method938(int arg0) {
        if (this.field1884.length() > 40) {
            this.field1884 = this.field1884.substring(0, 40);
        }
        field1905++;
        if (this.field1883.length() > 40) {
            this.field1883 = this.field1883.substring(0, 40);
        }
        if (arg0 != -48) {
            return;
        }
        if (this.field1906.length() > 10) {
            this.field1906 = this.field1906.substring(0, 10);
        }
        if (this.field1897.length() > 10) {
            this.field1897 = this.field1897.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 178)
    public class131() {
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(ZLew;)V", line = 180)
    public class131(boolean arg0, class226 arg1) {
        if (arg0) {
            if (class226.field2996.startsWith("win")) {
                this.field1900 = 1;
            } else if (class226.field2996.startsWith("mac")) {
                this.field1900 = 2;
            } else if (class226.field2996.startsWith("linux")) {
                this.field1900 = 3;
            } else {
                this.field1900 = 4;
            }
            if (class226.field2984.startsWith("amd64") || class226.field2984.startsWith("x86_64")) {
                this.field1881 = true;
            } else {
                this.field1881 = false;
            }
            if (this.field1900 == 1) {
                if (class226.field2998.indexOf("4.0") != -1) {
                    this.field1886 = 1;
                } else if (class226.field2998.indexOf("4.1") != -1) {
                    this.field1886 = 2;
                } else if (class226.field2998.indexOf("4.9") != -1) {
                    this.field1886 = 3;
                } else if (class226.field2998.indexOf("5.0") != -1) {
                    this.field1886 = 4;
                } else if (class226.field2998.indexOf("5.1") != -1) {
                    this.field1886 = 5;
                } else if (class226.field2998.indexOf("6.0") != -1) {
                    this.field1886 = 6;
                } else if (class226.field2998.indexOf("6.1") != -1) {
                    this.field1886 = 7;
                }
            } else if (this.field1900 == 2) {
                if (class226.field2998.indexOf("10.4") != -1) {
                    this.field1886 = 20;
                } else if (class226.field2998.indexOf("10.5") != -1) {
                    this.field1886 = 21;
                } else if (class226.field2998.indexOf("10.6") != -1) {
                    this.field1886 = 22;
                }
            }
            if (class226.field3006.toLowerCase().indexOf("sun") != -1) {
                this.field1898 = 1;
            } else if (class226.field3006.toLowerCase().indexOf("microsoft") != -1) {
                this.field1898 = 2;
            } else if (class226.field3006.toLowerCase().indexOf("apple") == -1) {
                this.field1898 = 4;
            } else {
                this.field1898 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class226.field2986.length()) {
                    char var5 = class226.field2986.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + (var5 - 48);
                }
            } catch (Exception var15) {
            }
            this.field1903 = var4;
            int var6 = class226.field2986.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class226.field2986.length() > var6) {
                    char var8 = class226.field2986.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6++;
                    var7 = var7 * 10 + var8 - 48;
                }
            } catch (Exception var14) {
            }
            this.field1892 = var7;
            int var9 = class226.field2986.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class226.field2986.length() > var9) {
                    char var11 = class226.field2986.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = -(-var11 - var10 * 10) - 48;
                }
            } catch (Exception var13) {
            }
            if (this.field1903 > 3) {
                this.field1896 = class318.field4624;
            } else {
                this.field1896 = 0;
            }
            this.field1888 = class190.field2576;
            this.field1891 = var10;
            if (arg1.field3004) {
                this.field1890 = false;
            } else {
                this.field1890 = true;
            }
            try {
                this.field1894 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field1894 = 0;
            }
        }
        if (this.field1884 == null) {
            this.field1884 = "";
        }
        if (this.field1906 == null) {
            this.field1906 = "";
        }
        if (this.field1897 == null) {
            this.field1897 = "";
        }
        if (this.field1883 == null) {
            this.field1883 = "";
        }
        this.method938(-48);
    }
}
