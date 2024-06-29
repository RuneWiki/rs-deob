import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class761 extends class758 {

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
    private int field11029;

    @OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
    private int field11016;

    @OriginalMember(owner = "client!ww", name = "t", descriptor = "I")
    private int field11024;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "Lffa;")
    private class197 field11027;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
    private int field11021;

    @OriginalMember(owner = "client!ww", name = "r", descriptor = "I")
    private int field11019;

    @OriginalMember(owner = "client!ww", name = "u", descriptor = "I")
    private int field11015;

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11030 = new String[] { method5513(method5512("a\f\u0017\u0014\t")), method5513(method5512("a\f\u0017\u0017\t")), method5513(method5512("a\f\u0017\u001b\t")), method5513(method5512("mU\u0017s\\")), method5513(method5512("x\u000eU1")), method5513(method5512("a\f\u0017aHx\u0012Mc\t")), method5513(method5512("a\f\u0017\u001c\t")), method5513(method5512("a\f\u0017\u0015\t")), method5513(method5512("a\f\u0017\u001a\t")), method5513(method5512("a\f\u0017\u0016\t")), method5513(method5512("a\f\u0017\u0018\t")) };

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "Lqha;")
    public static class112 field11026 = new class112(16);

    @OriginalMember(owner = "client!ww", name = "s", descriptor = "I")
    public static int field11014;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "I")
    public static int field11017;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "I")
    public static int field11018;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    public static int field11020;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "I")
    public static int field11023;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public static int field11025;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "I")
    public static int field11028;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "Lod;")
    private class532 field11022;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "(I)V")
    public static final void method5505(int arg0) {
        try {
            class178 var1 = class245.field3750;
            synchronized (class245.field3750) {
                class245.field3750.method1569(arg0 ^ 0x2962);
            }
            if (arg0 != 44) {
                field11026 = null;
            }
            field11018++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11030[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "(I)V")
    public static final void method5506(int arg0) {
        try {
            class429.field6309 = 1;
            field11023++;
            class591.field8684 = -1;
            String var1 = null;
            if (class752.field10946 != null) {
                class163 var2 = new class163(class752.field10946);
                var1 = class762.method5520(false, var2.method1435(-126));
                class422.field6215 = var2.method1435(69);
            }
            if (arg0 >= 64) {
                if (var1 == null) {
                    class20.method134(false, 35);
                } else {
                    class28.method193(false, true, 1, "", var1);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11030[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V")
    public static void method5507(byte arg0) {
        try {
            field11026 = null;
            if (arg0 >= -57) {
                method5507((byte) -93);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11030[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)Lod;")
    public final class532 method1814(int arg0) {
        try {
            int var2 = -50 / ((-arg0 - 67) / 39);
            field11025++;
            if (this.field11022 == null) {
                class412.field6080[5] = this.field11019;
                class412.field6080[2] = this.field11021;
                class412.field6080[0] = this.field11015;
                class412.field6080[4] = this.field11024;
                class412.field6080[3] = this.field11029;
                class412.field6080[1] = this.field11016;
                class160 var3 = this.field11027.field679;
                boolean var4 = false;
                int var5 = 0;
                for (int var6 = 0; var6 < 6; var6++) {
                    if (!var3.method1363(class412.field6080[var6], (byte) 92)) {
                        return null;
                    }
                    class439 var7 = var3.method1366((byte) -64, class412.field6080[var6]);
                    int var8 = var7.field6481 ? 64 : 128;
                    if (var7.field6469 > 0) {
                        var4 = true;
                    }
                    if (var8 > var5) {
                        var5 = var8;
                    }
                }
                for (int var9 = 0; var9 < 6; var9++) {
                    class167.field2303[var9] = var3.method1364(-25656, false, class412.field6080[var9], var5, var5, 1.0F);
                }
                this.field11022 = new class532(this.field11027, 6407, var5, var4, class167.field2303);
            }
            return this.field11022;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field11030[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IJIIZ)Ljava/lang/String;")
    public static final String method5508(int arg0, long arg1, int arg2, int arg3, boolean arg4) {
        try {
            field11017++;
            char var6 = ',';
            char var7 = '.';
            if (arg2 == 0) {
                var7 = ',';
                var6 = '.';
            }
            if (arg2 == 2) {
                var7 = ' ';
            }
            boolean var8 = false;
            if (arg1 < 0L) {
                arg1 = -arg1;
                var8 = true;
            }
            StringBuffer var9 = new StringBuffer(26);
            if (arg0 > 0) {
                for (int var10 = 0; var10 < arg0; var10++) {
                    int var11 = (int) arg1;
                    arg1 /= 10L;
                    var9.append((char) (var11 + 48 - ((int) arg1 * 10)));
                }
                var9.append(var6);
            }
            if (arg3 != -575) {
                field11026 = null;
            }
            int var12 = 0;
            while (true) {
                int var13 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (var13 + 48 - ((int) arg1 * 10)));
                if (arg1 == 0L) {
                    if (var8) {
                        var9.append('-');
                    }
                    return var9.reverse().toString();
                }
                if (arg4) {
                    var12++;
                    if ((var12 % 3) == 0) {
                        var9.append(var7);
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field11030[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "(I)Z")
    public static final boolean method5509(int arg0) {
        try {
            if (arg0 != -13078) {
                method5511(41, 15, 64);
            }
            field11020++;
            return class593.field8707 > 0;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11030[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIB)Z")
    public static final boolean method5510(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 < 119) {
                return true;
            } else {
                field11014++;
                return (arg0 & 0xC580) != 0;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11030[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)I")
    public static final int method5511(int arg0, int arg1, int arg2) {
        try {
            if (arg0 == 3) {
                field11028++;
                return arg1 == 1 || arg1 == 3 ? class547.field8161[arg2 & 0x3] : class606.field8880[arg2 & 0x3];
            } else {
                return -24;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11030[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lffa;IIIIII)V")
    public class761(class197 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.field11029 = arg4;
            this.field11016 = arg2;
            this.field11024 = arg5;
            this.field11027 = arg0;
            this.field11021 = arg3;
            this.field11019 = arg6;
            this.field11015 = arg1;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field11030[5] + (arg0 == null ? field11030[4] : field11030[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5512(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5513(char[] arg0) {
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
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 57;
                    break;
                case 3:
                    var10005 = 93;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
