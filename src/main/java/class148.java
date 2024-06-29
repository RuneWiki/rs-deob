import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class148 implements class357 {

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Z")
    private boolean field1923 = false;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Luq;")
    public class313 field1926;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Z")
    private boolean field1905;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    private int field1919;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field1909 = new String[5];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
    private final void method803(int arg0, byte arg1) {
        this.field1926.field4214 -= arg0;
        field1910++;
        if (arg1 <= -41) {
            this.field1926.field4214 += this.method815((byte) 124);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljj;I)V")
    public static final void method804(class66 arg0, int arg1) {
        field1904++;
        int var2 = 0;
        arg0.method373(arg1 + 101);
        for (int var3 = 0; var3 < class512.field7133; var3++) {
            int var15 = class514.field7144[var3];
            if ((class66.field880[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class66.field880[var15] = (byte) class292.method1790(class66.field880[var15], 2);
                    var2--;
                } else {
                    int var16 = arg0.method377(8, 1);
                    if (var16 == 0) {
                        var2 = class89.method496(true, arg0);
                        class66.field880[var15] = (byte) class292.method1790(class66.field880[var15], 2);
                    } else {
                        class40.method235(arg0, 2, var15);
                    }
                }
            }
        }
        arg0.method378(7);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method373(-126);
        for (int var4 = 0; var4 < class512.field7133; var4++) {
            int var13 = class514.field7144[var4];
            if ((class66.field880[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class66.field880[var13] = (byte) class292.method1790(class66.field880[var13], 2);
                } else {
                    int var14 = arg0.method377(8, 1);
                    if (var14 == 0) {
                        var2 = class89.method496(true, arg0);
                        class66.field880[var13] = (byte) class292.method1790(class66.field880[var13], 2);
                    } else {
                        class40.method235(arg0, 2, var13);
                    }
                }
            }
        }
        arg0.method378(7);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method373(95);
        for (int var5 = 0; var5 < class44.field633; var5++) {
            int var11 = class362.field5036[var5];
            if ((class66.field880[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class66.field880[var11] = (byte) class292.method1790(class66.field880[var11], 2);
                    var2--;
                } else {
                    int var12 = arg0.method377(8, 1);
                    if (var12 == 0) {
                        var2 = class89.method496(true, arg0);
                        class66.field880[var11] = (byte) class292.method1790(class66.field880[var11], 2);
                    } else if (class49.method272(arg0, 6493, var11)) {
                        class66.field880[var11] = (byte) class292.method1790(class66.field880[var11], 2);
                    }
                }
            }
        }
        arg0.method378(7);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method373(112);
        for (int var6 = 0; var6 < class44.field633; var6++) {
            int var9 = class362.field5036[var6];
            if ((class66.field880[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class66.field880[var9] = (byte) class292.method1790(class66.field880[var9], 2);
                } else {
                    int var10 = arg0.method377(8, 1);
                    if (var10 == 0) {
                        var2 = class89.method496(true, arg0);
                        class66.field880[var9] = (byte) class292.method1790(class66.field880[var9], 2);
                    } else if (class49.method272(arg0, 6493, var9)) {
                        class66.field880[var9] = (byte) class292.method1790(class66.field880[var9], 2);
                    }
                }
            }
        }
        arg0.method378(7);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class44.field633 = 0;
        class512.field7133 = arg1;
        for (int var7 = 1; var7 < 2048; var7++) {
            class66.field880[var7] = (byte) (class66.field880[var7] >> 1);
            class20 var8 = class364.field5092[var7];
            if (var8 == null) {
                class362.field5036[class44.field633++] = var7;
            } else {
                class514.field7144[class512.field7133++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
    public final void method805(boolean arg0, int arg1) {
        field1913++;
        if (this.field1923 != arg0) {
            this.field1923 = arg0;
            this.method813(9728);
        }
        int var3 = 2 % ((arg1 + 43) / 34);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lld;Lld;B)V")
    public static final void method806(class561 arg0, class561 arg1, byte arg2) {
        if (arg2 > -97) {
            method812(108);
        }
        field1911++;
        if (arg1.field7834 != null) {
            arg1.method3149(-18724);
        }
        arg1.field7831 = arg0.field7831;
        arg1.field7834 = arg0;
        arg1.field7834.field7831 = arg1;
        arg1.field7831.field7834 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lqa;B)V")
    public static final void method807(class167 arg0, byte arg1) {
        field1912++;
        class309 var2 = (class309) class2.field18.method1876((byte) -99);
        if (arg1 < -29) {
            while (var2 != null) {
                var2.method1857(arg0);
                var2 = (class309) class2.field18.method1877(0);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method811(1);
        field1918++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lge;Z)Ltp;")
    public static final class178 method808(class551 arg0, boolean arg1) {
        field1920++;
        if (!arg1) {
            field1917 = -95;
        }
        return new class178(arg0.method3087(true), arg0.method3087(true), arg0.method3087(true), arg0.method3087(arg1), arg0.method3043((byte) 49), arg0.method3043((byte) 49), arg0.method3045(-125));
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(ZI)V")
    public final void method809(boolean arg0, int arg1) {
        field1906++;
        if (arg1 > 52 && arg0 != this.field1905) {
            int var3 = this.method815((byte) 91);
            this.field1905 = true;
            this.method813(9728);
            this.method803(var3, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)Z")
    public final boolean method810(boolean arg0) {
        field1922++;
        if (!arg0) {
            this.method811(28);
        }
        if (!this.field1926.field4336) {
            return false;
        }
        int var2 = this.method815((byte) 87);
        this.field1926.method1884(this, -2);
        OpenGL.glGenerateMipmapEXT(this.field1907);
        this.field1905 = true;
        this.method813(9728);
        this.method803(var2, (byte) -70);
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public final void method811(int arg0) {
        field1914++;
        if (arg0 != 1) {
            field1917 = 31;
        }
        if (this.field1925 > 0) {
            this.field1926.method1912(this.method815((byte) 112), this.field1925, false);
            this.field1925 = 0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public static void method812(int arg0) {
        int var1 = 16 / ((14 - arg0) / 34);
        field1909 = null;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    private final void method813(int arg0) {
        field1915++;
        this.field1926.method1884(this, -2);
        if (arg0 != 9728) {
            this.method814((byte) 119);
        }
        if (this.field1923) {
            OpenGL.glTexParameteri(this.field1907, 10241, this.field1905 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field1907, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field1907, 10241, this.field1905 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field1907, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)I")
    public final int method814(byte arg0) {
        int var2 = 98 % ((-arg0 - 71) / 49);
        field1908++;
        return this.field1925;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)I")
    private final int method815(byte arg0) {
        if (arg0 <= 82) {
            this.field1926 = null;
        }
        field1921++;
        int var2 = this.field1926.method1900(this.field1916, 4611) * this.field1919;
        return this.field1905 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Luq;IIIZ)V")
    public class148(class313 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1907 = arg1;
        this.field1926 = arg0;
        this.field1905 = arg4;
        this.field1916 = arg2;
        this.field1919 = arg3;
        OpenGL.glGenTextures(1, class196.field2561, 0);
        this.field1925 = class196.field2561[0];
        this.method803(0, (byte) -68);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public abstract void method157(byte arg0);
}
