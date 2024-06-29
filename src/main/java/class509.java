import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class509 extends class172 {

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "I")
    private int field6897 = 0;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "Z")
    private boolean field6889 = false;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "I")
    private int field6896 = 0;

    @OriginalMember(owner = "client!bi", name = "Ab", descriptor = "I")
    private int field6923 = 0;

    @OriginalMember(owner = "client!bi", name = "yb", descriptor = "I")
    private int field6921 = 0;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "Z")
    private boolean field6887 = false;

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "I")
    private int field6900 = -1;

    @OriginalMember(owner = "client!bi", name = "mb", descriptor = "I")
    public int field6909;

    @OriginalMember(owner = "client!bi", name = "tb", descriptor = "I")
    public int field6916;

    @OriginalMember(owner = "client!bi", name = "qb", descriptor = "I")
    private int field6913;

    @OriginalMember(owner = "client!bi", name = "ub", descriptor = "I")
    public int field6917;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
    private int field6898;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    private int field6885;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    private int field6881;

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "I")
    public int field6906;

    @OriginalMember(owner = "client!bi", name = "pb", descriptor = "Z")
    private boolean field6912;

    @OriginalMember(owner = "client!bi", name = "Hb", descriptor = "Ldr;")
    private class395 field6930;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "[I")
    public static int[] field6892 = new int[13];

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "S")
    public static short field6891 = 1;

    @OriginalMember(owner = "client!bi", name = "nb", descriptor = "Lqfa;")
    public static class372 field6910 = new class372("", 13);

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "D")
    private double field6899;

    @OriginalMember(owner = "client!bi", name = "ib", descriptor = "D")
    private double field6905;

    @OriginalMember(owner = "client!bi", name = "lb", descriptor = "D")
    private double field6908;

    @OriginalMember(owner = "client!bi", name = "sb", descriptor = "D")
    private double field6915;

    @OriginalMember(owner = "client!bi", name = "wb", descriptor = "D")
    private double field6919;

    @OriginalMember(owner = "client!bi", name = "xb", descriptor = "D")
    private double field6920;

    @OriginalMember(owner = "client!bi", name = "Cb", descriptor = "D")
    private double field6925;

    @OriginalMember(owner = "client!bi", name = "Fb", descriptor = "D")
    private double field6928;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    private int field6888;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!bi", name = "hb", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!bi", name = "kb", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!bi", name = "ob", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!bi", name = "rb", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!bi", name = "vb", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!bi", name = "zb", descriptor = "I")
    private int field6922;

    @OriginalMember(owner = "client!bi", name = "Bb", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!bi", name = "Eb", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!bi", name = "Gb", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!bi", name = "Db", descriptor = "Ltq;")
    private class93 field6926;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bi", name = "Ib", descriptor = "Ljava/lang/Class;")
    public static Class field6931;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2752(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLr;)Log;", line = 8)
    public final class101 method73(boolean arg0, class566 arg1) {
        if (arg0) {
            return null;
        } else {
            ++field6902;
            class474 var3 = this.method2745((byte) 111, 2048, arg1);
            if (var3 == null) {
                return null;
            } else {
                class491 var4 = arg1.method995();
                var4.method911(this.field6922);
                var4.method910(this.field6888);
                var4.method903((int) this.field6908, (int) this.field6928, (int) this.field6915);
                this.method2747(-113, arg1, var4, var3);
                if (!class36.field498) {
                    var3.method717(var4, (class151) null, 0);
                } else {
                    var3.method751(var4, (class151) null, class432.field5406, 0);
                }
                if (this.field6926 != null) {
                    class27 var5 = this.field6926.method545();
                    if (class36.field498) {
                        arg1.method999(var5, class432.field5406);
                    } else {
                        arg1.method993(var5);
                    }
                }
                this.field6889 = var3.method740();
                this.field6896 = var3.method757();
                this.field6923 = var3.method704();
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BILr;)Lda;", line = 51)
    private final class474 method2745(byte arg0, int arg1, class566 arg2) {
        if (arg0 != 111) {
            this.field6913 = -62;
        }
        ++field6924;
        class388 var4 = class370.field4686.method3943((byte) 12, this.field6885);
        return var4.method2084(this.field6900, arg2, -36, class583.field8149, this.field6921, arg1, this.field6897);
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)Z", line = 68)
    public final boolean method83(byte arg0) {
        if (arg0 != 23) {
            this.field6926 = null;
        }
        ++field6911;
        return this.field6889;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 87)
    public final void method2746(byte arg0) {
        ++field6927;
        if (this.field6926 != null) {
            this.field6926.method543();
        }
        if (arg0 != 105) {
            this.field6922 = -28;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILr;Lq;Lda;)V", line = 104)
    private final void method2747(int arg0, class566 arg1, class491 arg2, class474 arg3) {
        arg3.method720(arg2);
        ++field6893;
        class64[] var5 = arg3.method728();
        if (arg0 < -106) {
            class214[] var6 = arg3.method706();
            if ((this.field6926 == null || this.field6926.field1293) && (var5 != null || var6 != null)) {
                this.field6926 = class93.method540(class133.field1735, true);
            }
            if (this.field6926 != null) {
                this.field6926.method533(arg1, (long) class133.field1735, var5, var6, false);
                this.field6926.method544(super.field6470, super.field2247, super.field2254, super.field2243, super.field2244);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(ZLr;)V", line = 130)
    public final void method67(boolean arg0, class566 arg1) {
        ++field6883;
        if (arg0) {
            this.method2746((byte) 38);
        }
        class474 var3 = this.method2745((byte) 111, 0, arg1);
        if (var3 != null) {
            class491 var4 = arg1.method995();
            var4.method911(this.field6922);
            var4.method910(this.field6888);
            var4.method903((int) this.field6908, (int) this.field6928, (int) this.field6915);
            this.field6896 = var3.method757();
            this.field6923 = var3.method704();
            this.method2747(-120, arg1, var4, var3);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILr;I)Z", line = 156)
    public final boolean method75(int arg0, int arg1, class566 arg2, int arg3) {
        ++field6886;
        if (arg3 != 9678) {
            this.method2749(-112, -86, -40, -59, 54);
        }
        return false;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V", line = 170)
    public final void method2748(int arg0, int arg1) {
        ++field6929;
        this.field6915 += (double) arg0 * this.field6920;
        this.field6887 = true;
        this.field6908 += (double) arg0 * this.field6919;
        if (!this.field6912) {
            if (~this.field6913 != 0) {
                this.field6928 += this.field6899 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field6925;
                this.field6925 += (double) arg0 * this.field6899;
            } else {
                this.field6928 += (double) arg0 * this.field6925;
            }
        } else {
            this.field6928 = (double) (class467.method2469((int) this.field6908, super.field6470, -20214, (int) this.field6915) + -this.field6898);
        }
        this.field6888 = (int) (Math.atan2(this.field6919, this.field6920) * 2607.5945876176133D) + 8192 & 16383;
        this.field6922 = (int) (Math.atan2(this.field6925, this.field6905) * 2607.5945876176133D) & 16383;
        if (arg1 == 0) {
            if (this.field6930 != null) {
                this.field6897 += arg0;
                while (true) {
                    do {
                        do {
                            if (~this.field6930.field4991[this.field6921] <= ~this.field6897) {
                                return;
                            }
                            this.field6897 -= this.field6930.field4991[this.field6921];
                            ++this.field6921;
                            if (this.field6930.field4979.length <= this.field6921) {
                                this.field6921 -= this.field6930.field4988;
                                if (this.field6921 < 0 || this.field6930.field4979.length <= this.field6921) {
                                    this.field6921 = 0;
                                }
                            }
                            this.field6900 = this.field6921 + 1;
                        } while (~this.field6930.field4979.length < ~this.field6900);
                        this.field6900 -= this.field6930.field4988;
                    } while (this.field6900 >= 0 && ~this.field6900 > ~this.field6930.field4979.length);
                    this.field6900 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V", line = 401)
    public class509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        super(arg1, arg2, arg3, class467.method2469(arg3, arg1, -20214, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
        this.field6909 = arg7;
        this.field6887 = false;
        this.field6916 = arg6;
        this.field6913 = arg8;
        this.field6917 = arg10;
        this.field6898 = arg5;
        this.field6885 = arg0;
        this.field6881 = arg9;
        this.field6906 = arg11;
        this.field6912 = arg12;
        int var14 = class370.field4686.method3943((byte) 12, this.field6885).field4895;
        if (~var14 != 0) {
            this.field6930 = class583.field8149.method1844(64, var14);
        } else {
            this.field6930 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "finalize", descriptor = "()V", line = 234)
    protected final void finalize() {
        if (this.field6926 != null) {
            this.field6926.method543();
        }
        ++field6882;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V", line = 245)
    public final void method2749(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field6887) {
            double var6 = (double) (-super.field6461 + arg1);
            double var8 = (double) (-super.field6464 + arg0);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field6908 = (double) this.field6881 * var6 / var10 + (double) super.field6461;
            this.field6915 = (double) this.field6881 * var8 / var10 + (double) super.field6464;
            if (!this.field6912) {
                this.field6928 = (double) super.field6458;
            } else {
                this.field6928 = (double) (class467.method2469((int) this.field6908, super.field6470, -20214, (int) this.field6915) - this.field6898);
            }
        }
        ++field6894;
        double var12 = (double) (this.field6909 + 1 + -arg3);
        this.field6920 = ((double) arg0 + -this.field6915) / var12;
        this.field6919 = ((double) arg1 - this.field6908) / var12;
        this.field6905 = Math.sqrt(this.field6920 * this.field6920 + this.field6919 * this.field6919);
        if (~this.field6913 == arg2) {
            this.field6925 = ((double) arg4 - this.field6928) / var12;
        } else {
            if (!this.field6887) {
                this.field6925 = -this.field6905 * Math.tan((double) this.field6913 * 0.02454369D);
            }
            this.field6899 = ((double) arg4 + -this.field6928 - this.field6925 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(B)Z", line = 284)
    public final boolean method79(byte arg0) {
        if (arg0 > -26) {
            this.method82((class566) null, 33);
        }
        ++field6895;
        return false;
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(B)Z", line = 297)
    public final boolean method68(byte arg0) {
        ++field6890;
        if (arg0 <= 114) {
            this.method66(-21);
        }
        return false;
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)V", line = 308)
    public final void method1092(int arg0) {
        if (arg0 == 0) {
            super.field2247 = super.field2254 = (short) ((int) (this.field6908 / 512.0D));
            ++field6914;
            super.field2243 = super.field2244 = (short) ((int) (this.field6915 / 512.0D));
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIBLr;Llo;II)V", line = 321)
    public final void method77(boolean arg0, int arg1, byte arg2, class566 arg3, class488 arg4, int arg5, int arg6) {
        ++field6907;
        int var8 = -64 % ((arg2 - -50) / 55);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lr;I)Lsd;", line = 337)
    public final class362 method82(class566 arg0, int arg1) {
        if (arg1 != -1660704056) {
            this.method79((byte) -109);
        }
        ++field6918;
        return null;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)I", line = 348)
    public final int method72(int arg0) {
        if (arg0 != -22496) {
            this.method79((byte) 6);
        }
        ++field6903;
        return this.field6923;
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)I", line = 365)
    public final int method71(int arg0) {
        ++field6901;
        int var2 = 40 / ((-43 - arg0) / 59);
        return this.field6896;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V", line = 390)
    public final void method66(int arg0) {
        if (arg0 == -1) {
            ++field6904;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V", line = 430)
    public static void method2750(byte arg0) {
        if (arg0 <= 115) {
            field6892 = null;
        }
        field6892 = null;
        field6910 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Z", line = 454)
    public static final boolean method2751(String arg0, int arg1, Class arg2) {
        ++field6884;
        if (arg1 < 95) {
            method2751((String) null, -107, (Class) null);
        }
        Class var3 = (Class) class281.field3524.get(arg0);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        } else {
            File var4 = null;
            if (var4 == null) {
                var4 = (File) class39.field526.get(arg0);
            }
            if (var4 != null) {
                try {
                    var4 = new File(var4.getCanonicalPath());
                    Class var5 = Class.forName("java.lang.Runtime");
                    Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var7.invoke(var8, Boolean.TRUE);
                    var8.invoke(Runtime.getRuntime(), arg2, var4.getPath());
                    var7.invoke(var8, Boolean.FALSE);
                    class281.field3524.put(arg0, arg2);
                    return true;
                } catch (NoSuchMethodException var9) {
                    System.load(var4.getPath());
                    class281.field3524.put(arg0, field6931 != null ? field6931 : (field6931 = method2752("ka")));
                    return true;
                } catch (Throwable var10) {
                }
            }
            return false;
        }
    }
}
