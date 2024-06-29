import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class318 {

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "J")
    private long field5041 = -1L;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "Lef;")
    private class513 field5036 = new class513();

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5045 = new String[] { method2695(method2694("N}\fd")), method2695(method2694("Ci\u0001&\u001f\b")), method2695(method2694("[&N&$")), method2695(method2694("\u0000}\u0010l8Tm.}4\u001a")), method2695(method2694("cd\u0001f\u001aHi\u000ef<LL\u0005d-A&\u0001x)Lq4g\u001aLi\u000eK1Af\u000em5\b!Z(\u001aRm\u0004m7Ta\u0001d*\u0000l\u000f(7O|@e8Tk\b)yCkNk5Af(i*H2")), method2695(method2694("\u0000l\u0005d-A&\u0003d8N@\u0001{1\u001a")), method2695(method2694("Ci\u0001&\u001c\b")), method2695(method2694("Ci\u0001&eIf\t|g\b")), method2695(method2694("Ci\u0001&\u0018\b")), method2695(method2694("Ci\u0001&\u001a\b")), method2695(method2694("uf\u0012m:Oo\u000ea*El@K5Af#`8Nf\u0005d\u001dEd\u0014iyTq\u0010myIf@l<Cg\u0004mq\t")), method2695(method2694("Ci\u0001&\u001b\b")), method2695(method2694("Ci\u0001&\u001d\b")) };

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public static int field5032 = 0;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
    public static int field5034 = 0;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "[I")
    public static int[] field5037 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "[I")
    public static int[] field5039 = new int[25];

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "J")
    private long field5042;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "Ljava/lang/Object;")
    public static Object field5035;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)Z", line = 14)
    public static final boolean method2688(boolean arg0) {
        try {
            field5038++;
            class132 var1 = (class132) class598.field8804.method3863((byte) 64);
            if (var1 == null) {
                return false;
            }
            int var2 = 0;
            if (!arg0) {
                field5032 = 120;
            }
            while (var1.field1547 > var2) {
                if (var1.field1540[var2] != null && var1.field1540[var2].field503 == 0) {
                    return false;
                }
                if (var1.field1538[var2] != null && var1.field1538[var2].field503 == 0) {
                    return false;
                }
                var2++;
            }
            return true;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5045[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILib;)V", line = 61)
    private final void method2689(int arg0, class163 arg1) {
        try {
            this.field5042 = arg1.method1435(-127);
            if (arg0 != -4269) {
                this.field5036 = null;
            }
            field5044++;
            this.field5041 = arg1.method1435(113);
            for (int var3 = arg1.method1455((byte) 62); var3 != 0; var3 = arg1.method1455((byte) 62)) {
                class755 var4;
                if (var3 == 1) {
                    var4 = new class551();
                } else if (var3 == 4) {
                    var4 = new class572();
                } else if (var3 == 3) {
                    var4 = new class472();
                } else if (var3 == 2) {
                    var4 = new class233();
                } else {
                    throw new RuntimeException(field5045[10]);
                }
                var4.method1992((byte) -98, arg1);
                this.field5036.method3868(arg0 + 4171, var4);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5045[11] + arg0 + ',' + (arg1 == null ? field5045[0] : field5045[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BII)Z", line = 103)
    public static final boolean method2690(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 != 79) {
                field5035 = null;
            }
            field5043++;
            return (class561.method4191(arg2, true, arg1) | class578.method4318(arg0 ^ 0x32, arg2, arg1) | class199.method1787(arg2, arg1, true)) & class598.method4450((byte) -126, arg1, arg2);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5045[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V", line = 114)
    public static final void method2691(int arg0) {
        try {
            field5033++;
            if (class646.field9353 != null) {
                class646.field9353.method4053(arg0 + 87);
            }
            if (arg0 != 1) {
                method2693(-2);
            }
            if (class417.field6140 != null) {
                class417.field6140.method4053(105);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5045[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILwca;)V", line = 134)
    public final void method2692(int arg0, class705 arg1) {
        try {
            field5040++;
            if (this.field5042 != arg1.field3177 || this.field5041 != arg1.field10239) {
                throw new RuntimeException(field5045[4] + arg1.field3177 + field5045[3] + arg1.field10239 + field5045[5] + this.field5042 + field5045[3] + this.field5041);
            }
            class755 var3 = (class755) this.field5036.method3863((byte) 64);
            if (arg0 != 4) {
                field5035 = null;
            }
            while (var3 != null) {
                var3.method1990(arg0 - 5, arg1);
                var3 = (class755) this.field5036.method3862(-353);
            }
            arg1.field10239++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5045[1] + arg0 + ',' + (arg1 == null ? field5045[0] : field5045[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lib;)V", line = 181)
    public class318(class163 arg0) {
        try {
            this.method2689(-4269, arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5045[7] + (arg0 == null ? field5045[0] : field5045[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V", line = 164)
    public static void method2693(int arg0) {
        try {
            field5037 = null;
            if (arg0 != 0) {
                method2691(109);
            }
            field5039 = null;
            field5035 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5045[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2694(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2695(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 96;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
