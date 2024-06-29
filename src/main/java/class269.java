import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class269 {

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "Lui;")
    private class251 field3809 = new class251(64);

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "Lui;")
    public class251 field3819 = new class251(64);

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "Llga;")
    public class47 field3806;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "Llga;")
    private class47 field3810;

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3820 = new String[] { method2210(method2209("\u001bBHqu")), method2210(method2209("\u001bBHsu")), method2210(method2209("\u001bBHtu")), method2210(method2209("\u001bBHuu")), method2210(method2209("\u001bBHwu")), method2210(method2209("\u001bBHru")), method2210(method2209("\u001bBHvu")), method2210(method2209("\u0011\u0018H\u001e ")), method2210(method2209("\u001bBH\f4\u0004_\u0012\u000eu")), method2210(method2209("\u0004C\n\\")) };

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3808 = null;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "Z")
    public static boolean field3818 = false;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "Lsb;")
    public static class261 field3815 = new class261(78, 8);

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)V", line = 8)
    public final void method2202(int arg0, int arg1) {
        try {
            class251 var3 = this.field3809;
            synchronized (this.field3809) {
                if (arg0 != 1000) {
                    return;
                }
                this.field3809.method2038(0, arg1);
            }
            field3813++;
            class251 var4 = this.field3819;
            synchronized (this.field3819) {
                this.field3819.method2038(0, arg1);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3820[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZI)V", line = 30)
    public final void method2203(int arg0, boolean arg1, int arg2) {
        try {
            this.field3809 = new class251(arg2);
            field3807++;
            this.field3819 = new class251(arg0);
            if (!arg1) {
                field3818 = false;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3820[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 48)
    public static void method2204(int arg0) {
        try {
            if (arg0 > -26) {
                field3808 = null;
            }
            field3808 = null;
            field3815 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3820[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Lri;", line = 61)
    public final class596 method2205(int arg0, int arg1) {
        try {
            int var3 = -65 / ((11 - arg0) / 38);
            field3816++;
            class251 var4 = this.field3809;
            class596 var5;
            synchronized (this.field3809) {
                var5 = (class596) this.field3809.method2053(0, (long) arg1);
            }
            if (var5 != null) {
                return var5;
            }
            class47 var6 = this.field3810;
            byte[] var7;
            synchronized (this.field3810) {
                var7 = this.field3810.method512(arg1, 34, (byte) -35);
            }
            class596 var8 = new class596();
            var8.field8574 = this;
            if (var7 != null) {
                var8.method4398(-19727, new class711(var7));
            }
            class251 var9 = this.field3809;
            synchronized (this.field3809) {
                this.field3809.method2051((long) arg1, var8, 93);
                return var8;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field3820[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)Z", line = 94)
    public static final boolean method2206(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 > -21) {
                method2204(110);
            }
            field3817++;
            if (arg1 >= 1000 && arg0 < 1000) {
                return true;
            } else if (arg1 >= 1000 || arg0 >= 1000) {
                return arg1 >= 1000 && arg0 >= 1000;
            } else if (class446.method3464(-49, arg0)) {
                return true;
            } else {
                return !class446.method3464(-49, arg1);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3820[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V", line = 124)
    public final void method2207(int arg0) {
        try {
            class251 var2 = this.field3809;
            synchronized (this.field3809) {
                this.field3809.method2047(11914);
            }
            field3814++;
            if (arg0 >= -61) {
                this.method2208(true);
            }
            class251 var3 = this.field3819;
            synchronized (this.field3819) {
                this.field3819.method2047(11914);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3820[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V", line = 141)
    public final void method2208(boolean arg0) {
        try {
            field3811++;
            class251 var2 = this.field3809;
            synchronized (this.field3809) {
                this.field3809.method2043(arg0);
            }
            class251 var3 = this.field3819;
            synchronized (this.field3819) {
                this.field3819.method2043(arg0);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3820[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lfs;ILlga;Llga;)V", line = 173)
    public class269(class796 arg0, int arg1, class47 arg2, class47 arg3) {
        try {
            this.field3806 = arg3;
            this.field3810 = arg2;
            this.field3810.method509(true, 34);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3820[8] + (arg0 == null ? field3820[9] : field3820[7]) + ',' + arg1 + ',' + (arg2 == null ? field3820[9] : field3820[7]) + ',' + (arg3 == null ? field3820[9] : field3820[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2209(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2210(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
