import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class415 {

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Lui;")
    private class251 field5979 = new class251(64);

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Lui;")
    public class251 field5989 = new class251(50);

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lfia;")
    public class351 field5990 = new class351(250);

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lrba;")
    private class150 field5991 = new class150();

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public int field5973;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Llga;")
    private class47 field5981;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lfs;")
    private class796 field5968;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Llga;")
    public class47 field5969;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
    private boolean field5974;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lam;")
    private class57 field5993;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public int field5971;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field5995;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field5996;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field5997 = new String[] { method3249(method3248("m\tNxg")), method3249(method3248("xR\f:")), method3249(method3248("xEN\u00172")), method3249(method3248("xEN\u00102")), method3249(method3248("xENjsxN\u0014h2")), method3249(method3248("xEN\u001e2")), method3249(method3248("xEN\u001d2")), method3249(method3248("xEN\u00112")), method3249(method3248("xEN\u00122")), method3249(method3248("xEN\u00132")), method3249(method3248("xEN\u001a2")), method3249(method3248("xEN\u00152")), method3249(method3248("xEN\u001f2")), method3249(method3248("xEN\u00142")), method3249(method3248("xEN\u001c2")) };

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lhj;")
    public static class671 field5982 = new class671(15, 0, 1, 0);

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Z")
    public static boolean field5987 = false;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Lsb;")
    public static class261 field5986 = new class261(131, 2);

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lmv;")
    public static class125 field5992 = new class125(9, 16);

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public int field5994;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(II)V")
    public final void method3236(int arg0, int arg1) {
        try {
            this.field5994 = arg1;
            field5983++;
            class251 var3 = this.field5989;
            synchronized (this.field5989) {
                this.field5989.method2043(false);
                if (arg0 != 250) {
                    this.field5990 = null;
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5997[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lpga;")
    public final class371 method3237(int arg0, int arg1) {
        try {
            field5980++;
            class251 var3 = this.field5979;
            class371 var4;
            synchronized (this.field5979) {
                var4 = (class371) this.field5979.method2053(arg1, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field5981;
            byte[] var6;
            synchronized (this.field5981) {
                var6 = this.field5981.method512(class316.method2513(3, arg0), class195.method1694(1438, arg0), (byte) -78);
            }
            class371 var7 = new class371();
            var7.field5359 = this;
            var7.field5437 = arg0;
            var7.field5420 = (String[]) this.field5995.clone();
            var7.field5361 = (String[]) this.field5996.clone();
            if (var6 != null) {
                var7.method2946(new class711(var6), (byte) -48);
            }
            var7.method2933(0);
            if (var7.field5386 != -1) {
                var7.method2940(this.method3237(var7.field5386, 0), this.method3237(var7.field5389, arg1), 10370);
            }
            if (var7.field5427 != -1) {
                var7.method2931(this.method3237(var7.field5427, 0), arg1, this.method3237(var7.field5388, 0));
            }
            if (var7.field5369 != -1) {
                var7.method2942(this.method3237(var7.field5369, 0), (byte) 110, this.method3237(var7.field5370, arg1));
            }
            if (!this.field5974 && var7.field5365) {
                var7.field5421 = class537.field7835.method4068((byte) -96, this.field5973);
                var7.field5399 = 0;
                var7.field5420 = this.field5995;
                var7.field5361 = this.field5996;
                var7.field5428 = null;
                var7.field5431 = false;
                if (var7.field5432 != null) {
                    boolean var8 = false;
                    for (class578 var9 = var7.field5432.method3696(arg1); var9 != null; var9 = var7.field5432.method3697(-121)) {
                        class573 var10 = this.field5993.method611(false, (int) var9.field8378);
                        if (var10.field8299) {
                            var9.method4294(0);
                        } else {
                            var8 = true;
                        }
                    }
                    if (!var8) {
                        var7.field5432 = null;
                    }
                }
            }
            class251 var11 = this.field5979;
            synchronized (this.field5979) {
                this.field5979.method2051((long) arg0, var7, arg1 ^ 0x5D);
                return var7;
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field5997[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIILdea;ILha;)Ltb;")
    public final class392 method3238(int arg0, int arg1, int arg2, int arg3, int arg4, class471 arg5, int arg6, class18 arg7) {
        try {
            this.field5991.field1912 = arg1;
            field5985++;
            this.field5991.field1915 = arg7.field240;
            this.field5991.field1918 = arg0;
            if (arg3 <= 106) {
                this.method3247(109);
            }
            this.field5991.field1914 = arg6;
            this.field5991.field1909 = arg5 != null;
            this.field5991.field1919 = arg4;
            this.field5991.field1920 = arg2;
            return (class392) this.field5990.method2810((byte) 11, this.field5991);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5997[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field5997[1] : field5997[0]) + ',' + arg6 + ',' + (arg7 == null ? field5997[1] : field5997[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
    public final void method3239(int arg0, int arg1) {
        try {
            field5977++;
            class251 var3 = this.field5979;
            synchronized (this.field5979) {
                this.field5979.method2038(0, arg1);
            }
            if (arg0 != -1) {
                this.field5994 = 27;
            }
            class251 var4 = this.field5989;
            synchronized (this.field5989) {
                this.field5989.method2038(arg0 + 1, arg1);
            }
            class351 var5 = this.field5990;
            synchronized (this.field5990) {
                this.field5990.method2801(arg1, (byte) 83);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5997[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
    public final void method3240(boolean arg0) {
        try {
            class251 var2 = this.field5979;
            synchronized (this.field5979) {
                this.field5979.method2047(11914);
            }
            if (!arg0) {
                this.method3245(-54);
            }
            field5978++;
            class251 var3 = this.field5989;
            synchronized (this.field5989) {
                this.field5989.method2047(11914);
            }
            class351 var4 = this.field5990;
            synchronized (this.field5990) {
                this.field5990.method2805(9);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5997[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
    public final void method3241(int arg0) {
        try {
            if (arg0 != 9) {
                this.field5989 = null;
            }
            class251 var2 = this.field5979;
            synchronized (this.field5979) {
                this.field5979.method2043(false);
            }
            field5970++;
            class251 var3 = this.field5989;
            synchronized (this.field5989) {
                this.field5989.method2043(false);
            }
            class351 var4 = this.field5990;
            synchronized (this.field5990) {
                this.field5990.method2806((byte) 49);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5997[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method3242(int arg0) {
        try {
            field5992 = null;
            field5982 = null;
            field5986 = null;
            if (arg0 < 0) {
                field5982 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5997[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILha;BZZLdea;Lda;Lha;IIII)Ltb;")
    public final class392 method3243(int arg0, class18 arg1, byte arg2, boolean arg3, boolean arg4, class471 arg5, class216 arg6, class18 arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            field5984++;
            class392 var13 = this.method3238(arg8, arg10, arg11, 123, arg0, arg5, arg9, arg7);
            if (var13 != null) {
                return var13;
            }
            class371 var14 = this.method3237(arg8, arg2 ^ 0x6D);
            if (arg10 > 1 && var14.field5377 != null) {
                int var15 = -1;
                for (int var16 = 0; var16 < 10; var16++) {
                    if (arg10 >= var14.field5397[var16] && var14.field5397[var16] != 0) {
                        var15 = var14.field5377[var16];
                    }
                }
                if (var15 != -1) {
                    var14 = this.method3237(var15, 0);
                }
            }
            if (arg2 != 109) {
                return null;
            }
            int[] var17 = var14.method2932(arg11, arg1, arg6, arg9, arg10, 0, arg4, arg0, arg7, arg5);
            if (var17 == null) {
                return null;
            }
            class392 var18;
            if (arg3) {
                var18 = arg1.method201(32, 36, var17, 36, (byte) -96, 0);
            } else {
                var18 = arg7.method201(32, 36, var17, 36, (byte) 27, 0);
            }
            if (!arg3) {
                class150 var19 = new class150();
                var19.field1912 = arg10;
                var19.field1920 = arg11;
                var19.field1914 = arg9;
                var19.field1915 = arg7.field240;
                var19.field1918 = arg8;
                var19.field1909 = arg5 != null;
                var19.field1919 = arg0;
                this.field5990.method2800(var19, var18, (byte) 28);
            }
            return var18;
        } catch (RuntimeException var21) {
            throw class665.method4799(var21, field5997[13] + arg0 + ',' + (arg1 == null ? field5997[1] : field5997[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field5997[1] : field5997[0]) + ',' + (arg6 == null ? field5997[1] : field5997[0]) + ',' + (arg7 == null ? field5997[1] : field5997[0]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BZ)V")
    public final void method3244(byte arg0, boolean arg1) {
        try {
            field5972++;
            if (arg0 != -112) {
                this.method3247(108);
            }
            if (arg1 != this.field5974) {
                this.field5974 = arg1;
                this.method3241(9);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5997[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public final void method3245(int arg0) {
        try {
            class251 var2 = this.field5989;
            synchronized (this.field5989) {
                this.field5989.method2043(false);
            }
            field5975++;
            if (arg0 != 0) {
                this.method3247(46);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5997[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method3246(boolean arg0, byte[] arg1) {
        try {
            field5976++;
            if (arg1 == null) {
                return null;
            } else if (arg0) {
                return null;
            } else {
                byte[] var2 = new byte[arg1.length];
                class569.method4247(arg1, 0, var2, 0, arg1.length);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5997[14] + arg0 + ',' + (arg1 == null ? field5997[1] : field5997[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public final void method3247(int arg0) {
        try {
            field5988++;
            class351 var2 = this.field5990;
            synchronized (this.field5990) {
                this.field5990.method2806((byte) 70);
            }
            if (arg0 != -30376) {
                field5982 = null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5997[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lfs;IZLam;Llga;Llga;)V")
    public class415(class796 arg0, int arg1, boolean arg2, class57 arg3, class47 arg4, class47 arg5) {
        try {
            this.field5973 = arg1;
            this.field5981 = arg4;
            this.field5968 = arg0;
            this.field5969 = arg5;
            this.field5974 = arg2;
            this.field5993 = arg3;
            if (this.field5981 == null) {
                this.field5971 = 0;
            } else {
                int var7 = this.field5981.method535((byte) -110) - 1;
                this.field5971 = var7 * 256 + this.field5981.method509(true, var7);
            }
            if (class378.field5530 == this.field5968) {
                this.field5995 = new String[] { null, null, class537.field7838.method4068((byte) -62, this.field5973), null, null, class537.field7852.method4068((byte) -62, this.field5973) };
            } else {
                this.field5995 = new String[] { null, null, class537.field7838.method4068((byte) -57, this.field5973), null, null, null };
            }
            this.field5996 = new String[] { null, null, null, null, class537.field7839.method4068((byte) -106, this.field5973) };
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5997[4] + (arg0 == null ? field5997[1] : field5997[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5997[1] : field5997[0]) + ',' + (arg4 == null ? field5997[1] : field5997[0]) + ',' + (arg5 == null ? field5997[1] : field5997[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3248(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3249(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 96;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 26;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
