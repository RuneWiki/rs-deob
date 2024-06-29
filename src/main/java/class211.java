import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public abstract class class211 extends class206 {

    @OriginalMember(owner = "client!rfa", name = "A", descriptor = "[Lrfa;")
    public class211[] field3240;

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "Z")
    public boolean field3235;

    @OriginalMember(owner = "client!rfa", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field3244 = new String[] { method1860(method1859("\r`.:")), method1860(method1859("\u0018;lx-")), method1860(method1859("\u0011s#x\u0013K")), method1860(method1859("\u0011s#x\u0012\"=")), method1860(method1859("\u0011s#x\u0011\"=")), method1860(method1859("\u0011s#x\u0004K")), method1860(method1859("\u0011s#x\u0014\"=")), method1860(method1859("\u0011s#x\u001bK")), method1860(method1859("\u0011s#x\u0001K")), method1860(method1859("\u0011s#x\u0015\"=")), method1860(method1859("7}+%p\fe'$1\u0017|-8p\u0007z'%p\rz6v8\u0002c'v1Cv-:?\u0016gb9%\u0017e7\"")), method1860(method1859("\u0011s#x\u0019K")), method1860(method1859("\u0011s#x\u0012K")), method1860(method1859("7}+%p\fe'$1\u0017|-8p\u0007z'%p\rz6v8\u0002c'v1Cx-8?\u0000}09=\u00065-#$\u0013`6")), method1860(method1859("\u0011s#x\u0007K")), method1860(method1859("\u0011s#x\u0013\"=")), method1860(method1859("\u0011s#xl\n{+\"nK")) };

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "Ljh;")
    public static class169 field3233 = new class169();

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "[I")
    public static int[] field3243 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!rfa", name = "x", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!rfa", name = "B", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!rfa", name = "y", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!rfa", name = "v", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!rfa", name = "u", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!rfa", name = "w", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!rfa", name = "t", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "Ldc;")
    public class5 field3231;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "Lrl;")
    public class751 field3230;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)I", line = 10)
    public int method681(byte arg0) {
        try {
            field3226++;
            if (arg0 != -36) {
                field3233 = null;
            }
            return -1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3244[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(III)[[I", line = 24)
    public final int[][] method1853(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != 0) {
                field3243 = null;
            }
            field3239++;
            if (this.field3240[arg0].field3235) {
                int[] var4 = this.field3240[arg0].method197(8217, arg2);
                return new int[][] { var4, var4, var4 };
            } else {
                return this.field3240[arg0].method234(arg2, -124);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3244[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V", line = 66)
    public void method437(int arg0) {
        try {
            field3232++;
            if (arg0 != 27132) {
                this.field3230 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3244[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)[[I", line = 76)
    public int[][] method234(int arg0, int arg1) {
        try {
            field3229++;
            if (arg1 < -38) {
                throw new IllegalStateException(field3244[10]);
            }
            return null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3244[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIZ)Lcn;", line = 91)
    public static final class541 method1854(int arg0, int arg1, boolean arg2) {
        try {
            field3236++;
            class541 var3 = class461.method3513(arg0, 122);
            if (arg1 == -1) {
                return var3;
            } else if (arg2) {
                return null;
            } else if (var3 == null || var3.field7945 == null || arg1 >= var3.field7945.length) {
                return null;
            } else {
                return var3.field7945[arg1];
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3244[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V", line = 112)
    public void method679(byte arg0) {
        try {
            field3225++;
            if (this.field3235) {
                this.field3231.method33(-105);
                this.field3231 = null;
            } else {
                this.field3230.method5461((byte) 57);
                this.field3230 = null;
            }
            if (arg0 != 65) {
                this.field3230 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3244[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V", line = 137)
    public static void method1855(boolean arg0) {
        try {
            field3243 = null;
            field3233 = null;
            if (!arg0) {
                field3243 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3244[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BILib;)V", line = 152)
    public void method201(byte arg0, int arg1, class163 arg2) {
        try {
            field3237++;
            if (arg0 < 67) {
                this.field3240 = null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3244[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3244[0] : field3244[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(III)[I", line = 164)
    public final int[] method1856(int arg0, int arg1, int arg2) {
        try {
            field3242++;
            if (arg2 <= 10) {
                return null;
            } else if (this.field3240[arg0].field3235) {
                return this.field3240[arg0].method197(8217, arg1);
            } else {
                return this.field3240[arg0].method234(arg1, -104)[0];
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3244[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)I", line = 186)
    public int method1857(int arg0) {
        try {
            field3228++;
            int var2 = -70 / ((arg0 + 30) / 41);
            return -1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3244[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)[I", line = 196)
    public int[] method197(int arg0, int arg1) {
        try {
            field3227++;
            if (arg0 != 8217) {
                this.field3238 = -56;
            }
            throw new IllegalStateException(field3244[13]);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3244[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)V", line = 210)
    public void method1858(int arg0, int arg1, int arg2) {
        try {
            field3241++;
            int var4 = this.field3238 == 255 ? arg1 : this.field3238;
            if (this.field3235) {
                this.field3231 = new class5(var4, arg1, arg2);
            } else {
                this.field3230 = new class751(var4, arg1, arg2);
            }
            if (arg0 < 12) {
                method1855(false);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3244[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(IZ)V", line = 233)
    public class211(int arg0, boolean arg1) {
        try {
            this.field3240 = new class211[arg0];
            this.field3235 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3244[16] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1859(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1860(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
