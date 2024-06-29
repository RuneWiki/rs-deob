import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class146 implements class18 {

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    private int field1939 = 0;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "[Ltk;")
    private class233[] field1946 = new class233[9];

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    private int field1931 = -1;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lih;")
    private class503 field1925;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field1919;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field1941 = 0;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "[I")
    public static int[] field1940 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Leh;")
    public static class246 field1923 = new class246(24, -1);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    private int field1918;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    private int field1924;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    private int field1933;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "Les;")
    public static class263 field1952;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public final void method97(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field1919);
        field1922++;
        this.field1939 |= 0x2;
        if (arg0 != 14638) {
            this.method93(-112);
        }
        this.field1931 = this.method912((byte) 123);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Law;III)V")
    public final void method901(class55 arg0, int arg1, int arg2, int arg3) {
        field1927++;
        this.method908(arg1 + 103, arg1, arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IJ)V")
    public static final void method902(int arg0, long arg1) {
        field1944++;
        int var3 = class360.field5144 + class246.field3587.field1896;
        int var4 = class294.field4314 + class246.field3587.field1899;
        if (arg0 != 22134) {
            return;
        }
        if ((class267.field3903 - var3) < -500 || (class267.field3903 - var3) > 500 || (class220.field3175 - var4) < -500 || (class220.field3175 - var4) > 500) {
            class220.field3175 = var4;
            class267.field3903 = var3;
        }
        if (class267.field3903 != var3) {
            int var5 = var3 - class267.field3903;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class267.field3903 += var6;
        }
        if (class220.field3175 != var4) {
            int var7 = var4 - class220.field3175;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class220.field3175 += var8;
        }
        if (!class4.field81.field1437) {
            class327.field4768 += (float) arg1 * class325.field4750 / 6.0F;
            class153.field2204 += (float) arg1 * class431.field6092 / 6.0F;
        }
        class97.method688(arg0 - 38637);
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
    public static void method903(int arg0) {
        field1952 = null;
        if (arg0 != 0) {
            method903(-39);
        }
        field1940 = null;
        field1923 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lhm;I)Lhm;")
    public static final class150 method904(class150 arg0, int arg1) {
        int var2 = -96 % ((77 - arg1) / 36);
        field1934++;
        if (arg0.field2071 != -1) {
            return client.method1276(127, arg0.field2071);
        }
        int var3 = arg0.field2134 >>> 16;
        class469 var4 = new class469(class255.field3763);
        for (class489 var5 = (class489) var4.method2722(0); var5 != null; var5 = (class489) var4.method2720(123)) {
            if (var5.field6840 == var3) {
                return client.method1276(93, (int) var5.field7060);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public final void method94(byte arg0) {
        field1930++;
        if (arg0 > -127) {
            this.field1946 = null;
        }
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field1939 &= 0xFFFFFFFB;
        this.field1931 = this.method912((byte) 123);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)I")
    public static final int method905(byte arg0, int arg1) {
        field1935++;
        int var2 = 19 / ((arg0 - 13) / 63);
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(BI)V")
    public final void method906(byte arg0, int arg1) {
        field1942++;
        if (this.field1946[arg1] != null) {
            this.field1946[arg1].method462(-1259451258);
        }
        if (arg0 == 87) {
            this.field1933 &= ~(0x1 << arg1);
            this.field1946[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public final void method92(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field1929++;
        this.field1939 &= 0xFFFFFFFE;
        if (arg0 != -40) {
            field1940 = null;
        }
        this.field1931 = this.method912((byte) 123);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lgu;IB)V")
    public final void method907(class417 arg0, int arg1, byte arg2) {
        int var4 = -29 % ((arg2 + 7) / 54);
        this.method910(arg1, 0, arg0, 120);
        field1945++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILaw;I)V")
    private final void method908(int arg0, int arg1, int arg2, class55 arg3, int arg4) {
        field1937++;
        if (this.field1931 == -1) {
            throw new RuntimeException();
        }
        if (arg0 <= 69) {
            field1923 = null;
        }
        int var6 = 0x1 << arg4;
        if ((~var6 & this.field1933) == 0) {
            this.field1924 = arg3.field695;
            this.field1918 = arg3.field695;
        } else if (this.field1918 != arg3.field695 || this.field1924 != arg3.field695) {
            throw new RuntimeException();
        }
        arg3.method459(arg1, -117, this.field1931, arg2, class503.field7221[arg4]);
        this.field1946[arg4] = arg3;
        this.field1933 |= var6;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
    public final void method909(int arg0, int arg1) {
        if (arg1 >= -36) {
            this.method95(-85);
        }
        field1932++;
        if (this.field1931 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class503.field7221[arg0]);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILgu;I)V")
    private final void method910(int arg0, int arg1, class417 arg2, int arg3) {
        field1950++;
        if (this.field1931 == -1) {
            throw new RuntimeException();
        } else if (arg3 >= 110) {
            int var5 = 0x1 << arg0;
            if ((this.field1933 & ~var5) == 0) {
                this.field1918 = arg2.field5869;
                this.field1924 = arg2.field5873;
            } else if (this.field1918 != arg2.field5869 || this.field1924 != arg2.field5873) {
                throw new RuntimeException();
            }
            arg2.method2469(this.field1931, (byte) -2, class503.field7221[arg0], arg1);
            this.field1946[arg0] = arg2;
            this.field1933 |= var5;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public final void method95(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field1919);
        field1948++;
        if (arg0 > -86) {
            field1952 = null;
        }
        this.field1939 |= 0x4;
        this.field1931 = this.method912((byte) 123);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
    public final void method96(byte arg0) {
        field1938++;
        if (arg0 == -82) {
            OpenGL.glBindFramebufferEXT(36008, this.field1919);
            this.field1939 |= 0x1;
            this.field1931 = this.method912((byte) 123);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public final void method93(int arg0) {
        if (arg0 == -6068) {
            field1947++;
            OpenGL.glBindFramebufferEXT(36009, 0);
            this.field1939 &= 0xFFFFFFFD;
            this.field1931 = this.method912((byte) 123);
        }
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)I")
    public final int method911(int arg0) {
        int var2 = -11 % ((arg0 - 63) / 55);
        field1920++;
        return this.field1924;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)I")
    private final int method912(byte arg0) {
        if (arg0 != 123) {
            field1941 = -89;
        }
        field1928++;
        if ((this.field1939 & 0x4) != 0) {
            return 36160;
        } else if ((this.field1939 & 0x2) == 0) {
            return (this.field1939 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILlc;)V")
    public final void method913(int arg0, int arg1, class466 arg2) {
        field1921++;
        if (this.field1931 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field1933 & ~var4) == 0) {
            this.field1918 = arg2.field6512;
            this.field1924 = arg2.field6509;
        } else if (this.field1918 != arg2.field6512 || this.field1924 != arg2.field6509) {
            throw new RuntimeException();
        }
        arg2.method2704(12150, this.field1931, class503.field7221[arg0]);
        this.field1946[arg0] = arg2;
        this.field1933 |= var4;
        if (arg1 != -1) {
            this.method906((byte) -73, -110);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method914(String arg0, int arg1, String arg2) {
        class449.field6287 = arg2;
        class153.field2198 = arg0;
        field1953++;
        if (class32.field370 != 3 && class153.field2198.equals("") || class449.field6287.equals("")) {
            class183.method1148(3, -104);
            return;
        }
        class498.field7050 = false;
        if (class32.field370 != 1) {
            class384.field5400 = 0;
            class347.field5023 = -1;
        }
        class183.method1148(-3, arg1 ^ 0x28);
        class149.field1980 = arg1;
        class63.field786 = 1;
        class431.field6094 = 0;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lih;)V")
    public class146(class503 arg0) {
        if (!arg0.field7432) {
            throw new IllegalStateException("");
        }
        this.field1925 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class440.field6152, 0);
        this.field1919 = class440.field6152[0];
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)V")
    public final void method915(int arg0, int arg1) {
        if (arg1 >= -37) {
            return;
        }
        field1943++;
        if (this.field1931 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class503.field7221[arg0]);
    }

    @OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1925.method2917((byte) -46, this.field1919);
        field1936++;
        super.finalize();
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)Z")
    public final boolean method916(byte arg0) {
        field1949++;
        if (arg0 <= 117) {
            method914(null, 84, null);
        }
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1931);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method917(String arg0, int arg1, boolean arg2) {
        class61.method498(class353.field5073, 1);
        if (!arg2) {
            return;
        }
        field1951++;
        class213.field3076++;
        class30.field357.method2376((byte) 122, class540.method3175(arg0, 1) + 1);
        class30.field357.method2377((byte) -53, arg0);
        class30.field357.method2375(arg1, 3457);
    }
}
