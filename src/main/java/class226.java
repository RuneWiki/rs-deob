import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class226 {

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "Lui;")
    private class251 field3285 = new class251(64);

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "Lui;")
    private class251 field3288 = new class251(100);

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "Llga;")
    private class47 field3279;

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3289 = new String[] { method1894(method1893("k;il0'")), method1894(method1893("k;il7'")), method1894(method1893("k;il3'")), method1894(method1893("k;il<'")), method1894(method1893("k;il='")), method1894(method1893("k;il1'")), method1894(method1893("k;il2'")), method1894(method1893("k;il6'")), method1894(method1893("k;il5'")), method1894(method1893("tt&l\t")), method1894(method1893("a/d.")), method1894(method1893("k;ilHf4a6J'")) };

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "Lu;")
    public static class741 field3284 = new class741(method1894(method1893("X\u000eZ\u0001")), method1894(method1893("`<n+\u0017j")), method1894(method1893("P(k")), 1);

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "Lvo;")
    public static class782 field3277;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V")
    public static void method1884(int arg0) {
        try {
            field3284 = null;
            field3277 = null;
            if (arg0 != 100) {
                field3284 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3289[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
    public final void method1885(int arg0) {
        try {
            class251 var2 = this.field3285;
            synchronized (this.field3285) {
                this.field3285.method2043(false);
                if (arg0 != 127) {
                    field3284 = null;
                }
            }
            field3276++;
            class251 var3 = this.field3288;
            synchronized (this.field3288) {
                this.field3288.method2043(false);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3289[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BIII)I")
    public static final int method1886(byte arg0, int arg1, int arg2, int arg3) {
        try {
            field3278++;
            if (arg1 == arg3) {
                return arg3;
            }
            int var4 = 128 - arg2;
            int var5 = (arg1 & 0x7F) * arg2 + (arg3 & 0x7F) * var4 >> 7;
            int var6 = (arg1 & 0x380) * arg2 + (arg3 & 0x380) * var4 >> 7;
            int var7 = (arg1 & 0xFC00) * arg2 + (arg3 & 0xFC00) * var4 >> 7;
            if (arg0 >= -5) {
                field3277 = null;
            }
            return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3289[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V")
    public final void method1887(boolean arg0) {
        try {
            if (!arg0) {
                this.method1885(-101);
            }
            class251 var2 = this.field3285;
            synchronized (this.field3285) {
                this.field3285.method2047(11914);
            }
            field3286++;
            class251 var3 = this.field3288;
            synchronized (this.field3288) {
                this.field3288.method2047(11914);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3289[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI)Ldt;")
    public final class669 method1888(byte arg0, int arg1) {
        try {
            field3280++;
            class251 var3 = this.field3288;
            class669 var4;
            synchronized (this.field3288) {
                var4 = (class669) this.field3288.method2053(0, (long) arg1);
                if (var4 == null) {
                    var4 = new class669(arg1);
                    this.field3288.method2051((long) arg1, var4, 93);
                }
                if (!var4.method4818(0)) {
                    return null;
                }
            }
            if (arg0 != -54) {
                this.method1887(true);
            }
            return var4;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3289[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZ)Lkn;")
    public final class437 method1889(int arg0, boolean arg1) {
        try {
            field3281++;
            class251 var3 = this.field3285;
            class437 var4;
            synchronized (this.field3285) {
                var4 = (class437) this.field3285.method2053(0, (long) arg0);
            }
            if (!arg1) {
                field3277 = null;
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field3279;
            byte[] var6;
            synchronized (this.field3279) {
                var6 = this.field3279.method512(class1.method6(arg0, 25637), class376.method2973(-107, arg0), (byte) -54);
            }
            class437 var7 = new class437();
            var7.field6430 = arg0;
            if (var6 != null) {
                var7.method3410((byte) 53, new class711(var6));
            }
            var7.method3407(0);
            class251 var8 = this.field3285;
            synchronized (this.field3285) {
                this.field3285.method2051((long) arg0, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field3289[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)V")
    public final void method1890(boolean arg0, int arg1) {
        try {
            class251 var3 = this.field3285;
            synchronized (this.field3285) {
                this.field3285.method2038(0, arg1);
            }
            field3282++;
            class251 var4 = this.field3288;
            synchronized (this.field3288) {
                this.field3288.method2038(0, arg1);
                if (!arg0) {
                    method1891(-66, 109);
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3289[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)V")
    public static final void method1891(int arg0, int arg1) {
        try {
            field3287++;
            class294 var2 = class146.method1261((long) arg1, -50, arg0);
            var2.method2376(124);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3289[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(BI)Z")
    public static final boolean method1892(byte arg0, int arg1) {
        try {
            int var2 = 96 % ((arg0 - 65) / 48);
            field3283++;
            return arg1 == 0 || arg1 == 2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3289[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lfs;ILlga;Llga;Llga;)V")
    public class226(class796 arg0, int arg1, class47 arg2, class47 arg3, class47 arg4) {
        try {
            this.field3279 = arg2;
            if (this.field3279 != null) {
                int var6 = this.field3279.method535((byte) -110) - 1;
                this.field3279.method509(true, var6);
            }
            class322.method2552(arg4, arg3, 2, true);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3289[11] + (arg0 == null ? field3289[10] : field3289[9]) + ',' + arg1 + ',' + (arg2 == null ? field3289[10] : field3289[9]) + ',' + (arg3 == null ? field3289[10] : field3289[9]) + ',' + (arg4 == null ? field3289[10] : field3289[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1893(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1894(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 15;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 8;
                    break;
                case 3:
                    var10005 = 66;
                    break;
                default:
                    var10005 = 116;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
