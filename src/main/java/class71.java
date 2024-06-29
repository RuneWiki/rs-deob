import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class71 {

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lhga;")
    private class182 field999 = new class182();

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1002 = new String[] { method753(method752("@=+M-")), method753(method752("Ufi\u000f")), method753(method752("Lp++x")), method753(method752("Lp+'x")), method753(method752("Lp+*x")), method753(method752("Lp+_9Uzq]x")), method753(method752("Lp+%x")), method753(method752("Lp+&x")), method753(method752("Lp+\"x")), method753(method752("Lp+ x")), method753(method752("Lp+$x")), method753(method752("Lp+!x")) };

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
    public static int[] field995 = new int[5];

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[J")
    public static long[] field997 = new long[32];

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lhga;")
    private class182 field1001;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lhga;", line = 4)
    public final class182 method743(byte arg0) {
        try {
            field1000++;
            class182 var2 = this.field999.field2895;
            if (this.field999 == var2) {
                this.field1001 = null;
                return null;
            }
            this.field1001 = var2.field2895;
            if (arg0 > -54) {
                this.method746(36);
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1002[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)Lhga;", line = 27)
    public final class182 method744(int arg0) {
        try {
            if (arg0 != 32) {
                method750(-39);
            }
            field998++;
            class182 var2 = this.field999.field2896;
            if (this.field999 == var2) {
                return null;
            } else {
                var2.method1715(-20685);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1002[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V", line = 48)
    public final void method745(int arg0) {
        try {
            field994++;
            while (true) {
                class182 var2 = this.field999.field2896;
                if (this.field999 == var2) {
                    if (arg0 < 60) {
                        this.field999 = null;
                    }
                    this.field1001 = null;
                    return;
                }
                var2.method1715(-20685);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1002[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I", line = 74)
    public final int method746(int arg0) {
        try {
            field992++;
            int var2 = arg0;
            for (class182 var3 = this.field999.field2896; var3 != this.field999; var3 = var3.field2896) {
                var2++;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1002[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)Lhga;", line = 94)
    public final class182 method747(byte arg0) {
        try {
            if (arg0 != 21) {
                this.field1001 = null;
            }
            field993++;
            class182 var2 = this.field1001;
            if (this.field999 == var2) {
                this.field1001 = null;
                return null;
            } else {
                this.field1001 = var2.field2896;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1002[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILhga;)V", line = 116)
    public final void method748(int arg0, class182 arg1) {
        try {
            if (arg1.field2895 != null) {
                arg1.method1715(-20685);
            }
            int var3 = -69 / ((arg0 + 4) / 47);
            field990++;
            arg1.field2896 = this.field999;
            arg1.field2895 = this.field999.field2895;
            arg1.field2895.field2896 = arg1;
            arg1.field2896.field2895 = arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1002[2] + arg0 + ',' + (arg1 == null ? field1002[1] : field1002[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)Lhga;", line = 132)
    public final class182 method749(int arg0) {
        try {
            field996++;
            class182 var2 = this.field999.field2896;
            if (this.field999 == var2) {
                this.field1001 = null;
                return null;
            } else if (arg0 == 0) {
                this.field1001 = var2.field2896;
                return var2;
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1002[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 152)
    public static void method750(int arg0) {
        try {
            if (arg0 > 115) {
                field995 = null;
                field997 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1002[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Z", line = 171)
    public final boolean method751(boolean arg0) {
        try {
            field991++;
            if (!arg0) {
                this.field1001 = null;
            }
            return this.field999.field2896 == this.field999;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1002[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 192)
    public class71() {
        try {
            this.field999.field2895 = this.field999;
            this.field999.field2896 = this.field999;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1002[5] + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method752(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method753(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
