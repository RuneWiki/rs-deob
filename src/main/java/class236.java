import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class236 {

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    private int field3408 = 0;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    private int field3410 = -1;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "Ltf;")
    private class524 field3405 = new class524();

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Z")
    public boolean field3416 = false;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    private int field3404;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    private int field3411;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "[Lru;")
    private class62[] field3413;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "[[[I")
    private int[][][] field3409;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3420 = new String[] { method1960(method1959("\u00152\u0010|\u001f")), method1960(method1959("\u00152\u0010\u0002^\u001c5J\u0000\u001f")), method1960(method1959("\u00152\u0010x\u001f")), method1960(method1959("\u00152\u0010v\u001f")), method1960(method1959("\u001c)RR")), method1960(method1959("\tr\u0010\u0010J")), method1960(method1959("\u00152\u0010{\u001f")), method1960(method1959("\u00152\u0010y\u001f")), method1960(method1959("\u00152\u0010\u007f\u001f")), method1960(method1959("\u00152\u0010}\u001f")), method1960(method1959("\u00152\u0010z\u001f")), method1960(method1959("1=P\u001eX\u001c0G\u001eE\u0017(LWR\u00049\u001e_\u0017\u0014)RR\u0017\u001b1_YRR?_]_\u0017")) };

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "[Lvs;")
    public static class470[] field3400 = new class470[5];

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Lmv;")
    public static class125 field3415;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "[I")
    public static int[] field3417;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Lmv;")
    public static class125 field3419;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "Lha;")
    public static class18 field3418;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILdm;)[I")
    public static final int[] method1951(int arg0, class274 arg1) {
        try {
            field3414++;
            class711 var2 = new class711(518);
            int[] var3 = new int[arg0];
            for (int var4 = 0; var4 < 4; var4++) {
                var3[var4] = (int) (Math.random() * 9.9999999E7D);
            }
            var2.method5114(arg0 + 251, 10);
            var2.method5127(var3[0], 26108);
            var2.method5127(var3[1], 26108);
            var2.method5127(var3[2], arg0 ^ 0x65F8);
            var2.method5127(var3[3], 26108);
            for (int var5 = 0; var5 < 10; var5++) {
                var2.method5127((int) (Math.random() * 9.9999999E7D), arg0 + 26104);
            }
            var2.method5138((byte) -113, (int) (Math.random() * 9.9999999E7D));
            var2.method5136(0, class297.field4152, class317.field4346);
            arg1.field3885.method5086(0, var2.field9996, var2.field9945, -2);
            return var3;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3420[8] + arg0 + ',' + (arg1 == null ? field3420[4] : field3420[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(Z)[[[I")
    public final int[][][] method1952(boolean arg0) {
        try {
            field3412++;
            if (!arg0) {
                this.field3413 = null;
            }
            if (this.field3411 != this.field3404) {
                throw new RuntimeException(field3420[11]);
            }
            for (int var2 = 0; var2 < this.field3411; var2++) {
                this.field3413[var2] = class380.field5548;
            }
            return this.field3409;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3420[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V")
    public final void method1953(boolean arg0) {
        try {
            for (int var2 = 0; var2 < this.field3411; var2++) {
                this.field3409[var2][0] = null;
                this.field3409[var2][1] = null;
                this.field3409[var2][2] = null;
                this.field3409[var2] = null;
            }
            field3402++;
            this.field3409 = null;
            this.field3413 = null;
            if (!arg0) {
                this.field3413 = null;
            }
            this.field3405.method3982(-119);
            this.field3405 = null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3420[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1954(int arg0, String arg1) {
        try {
            field3407++;
            return arg0 > -106 ? 48 : arg1.length() + 2;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3420[6] + arg0 + ',' + (arg1 == null ? field3420[4] : field3420[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)[[I")
    public final int[][] method1955(int arg0, int arg1) {
        try {
            field3401++;
            if (arg1 != -2) {
                field3400 = null;
            }
            if (this.field3411 == this.field3404) {
                this.field3416 = this.field3413[arg0] == null;
                this.field3413[arg0] = class380.field5548;
                return this.field3409[arg0];
            } else if (this.field3411 == 1) {
                this.field3416 = this.field3410 != arg0;
                this.field3410 = arg0;
                return this.field3409[0];
            } else {
                class62 var3 = this.field3413[arg0];
                if (var3 == null) {
                    this.field3416 = true;
                    if (this.field3408 < this.field3411) {
                        var3 = new class62(arg0, this.field3408);
                        this.field3408++;
                    } else {
                        class62 var4 = (class62) this.field3405.method3986(false);
                        var3 = new class62(arg0, var4.field947);
                        this.field3413[var4.field943] = null;
                        var4.method4294(0);
                    }
                    this.field3413[arg0] = var3;
                } else {
                    this.field3416 = false;
                }
                this.field3405.method3983(74, var3);
                return this.field3409[var3.field947];
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3420[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
    public static void method1956(int arg0) {
        try {
            field3415 = null;
            field3418 = null;
            field3400 = null;
            field3417 = null;
            if (arg0 != 1) {
                field3419 = null;
            }
            field3419 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3420[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static final void method1957(int arg0) {
        try {
            field3403++;
            if (arg0 == 12936) {
                class294 var1 = class146.method1261(0L, arg0 - 12862, 15);
                var1.method2376(5);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3420[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Z)V")
    public static final void method1958(boolean arg0) {
        try {
            field3406++;
            if (arg0) {
                class246.method2007((byte) 71);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3420[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(III)V")
    public class236(int arg0, int arg1, int arg2) {
        try {
            this.field3404 = arg1;
            this.field3411 = arg0;
            this.field3413 = new class62[this.field3404];
            this.field3409 = new int[this.field3411][3][arg2];
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3420[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    static {
        for (int var0 = 0; var0 < field3400.length; var0++) {
            field3400[var0] = new class470();
        }
        field3415 = new class125(34, 2);
        field3417 = new int[120];
        int var1 = 0;
        for (int var2 = 0; var2 < 120; var2++) {
            int var3 = var2 + 1;
            int var4 = (int) ((double) var3 + Math.pow(2.0D, (double) var3 / 7.0D) * 300.0D);
            var1 += var4;
            field3417[var2] = var1 / 4;
        }
        field3419 = new class125(84, 4);
    }

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1959(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1960(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 62;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
