import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class275 implements class749 {

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "Leo;")
    private class312 field4406;

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "[Lbka;")
    private class175[] field4411;

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4417 = new String[] { method2366(method2365("\u007f>\bRY:")), method2366(method2365("\u007f>\bRV:")), method2366(method2365("\u007f>\bRX:")), method2366(method2365("|/\u0005\u0010")), method2366(method2365("itGRl")), method2366(method2365("\u007f>\bRW:")), method2366(method2365("\u007f>\bRR:")), method2366(method2365("\u007f>\bRS:")), method2366(method2365("\u007f>\bR-{4\u0000\b/:")), method2366(method2365("z3\u0007\bN\u007f;\u0019\u0011p`1\f\u000eb")), method2366(method2365("z3\u001d\u001ep`\u0005\r\u0019ws/\u0005\b")), method2366(method2365("}.\u0001\u0019c~?\u001f\u0019}")), method2366(method2365("q5\u0004\fpa)")), method2366(method2365("\u007f;\u0019\u0018~f)")), method2366(method2365("z3\u001d\u0011p`1\u001a")), method2366(method2365("z3\u0007\bNz?\b\u0018xq5\u0007\u000f")), method2366(method2365("f3\u0004\u0019cp;\u001b#uw<\b\t}f")), method2366(method2365("\u007f>\bRU:")), method2366(method2365("z?\b\u0018xq5\u0007\u000fNb1")), method2366(method2365("z3\u0007\bN\u007f;\u0019\u0019uu?")), method2366(method2365("a9\u001b\u0013}~8\b\u000e")), method2366(method2365("q(\u0006\u000fb")), method2366(method2365("z?\b\u0018xq5\u0007\u000fNb(\b\u0005t`")), method2366(method2365("|;\u0004\u0019N{9\u0006\u0012b")), method2366(method2365("\u007f;\u0019\u001a}s=")), method2366(method2365("t6\u0006\u0013ca2\b\u0018~e)")), method2366(method2365("\u007f>\bRT:")), method2366(method2365("\u007f>\bRP:")) };

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "Z")
    public static boolean field4413 = false;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "Lha;")
    private class63 field4410;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "Ltl;")
    public static class648 field4407;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "Z")
    private boolean field4404;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
    public final void method2356(int arg0) {
        try {
            if (class662.field9437 != this.field4410) {
                this.field4410 = class662.field9437;
                this.field4404 = true;
            }
            field4405++;
            this.field4410.method182(0);
            int var2 = -75 % ((-arg0 - 10) / 34);
            class175[] var3 = this.field4411;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class175 var5 = var3[var4];
                if (var5 != null) {
                    var5.method459((byte) -13);
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4417[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)I")
    public final int method2357(boolean arg0) {
        try {
            if (arg0) {
                this.method2358(-122);
            }
            field4416++;
            return this.field4406.field5109;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4417[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)I")
    public final int method2358(int arg0) {
        try {
            field4409++;
            int var2 = 0;
            if (arg0 < 36) {
                this.method2362(true, (byte) -40);
            }
            class175[] var3 = this.field4411;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class175 var5 = var3[var4];
                if (var5 == null || var5.method457((byte) 39)) {
                    var2++;
                }
            }
            return var2 * 100 / this.field4411.length;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4417[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILgda;)V")
    public static final void method2359(int arg0, class58 arg1) {
        try {
            field4408++;
            class58.field751 = arg1.method585(-1, field4417[14]);
            class44.field494 = arg1.method585(-1, field4417[10]);
            class622.field8981 = arg1.method585(-1, field4417[16]);
            class196.field3118 = arg1.method585(-1, field4417[18]);
            class7.field82 = arg1.method585(-1, field4417[22]);
            if (arg0 == 0) {
                class350.field5659 = arg1.method585(-1, field4417[15]);
                class176.field2855 = arg1.method585(~arg0, field4417[9]);
                class276.field4419 = arg1.method585(arg0 - 1, field4417[24]);
                class531.field7805 = arg1.method585(-1, field4417[21]);
                class187.field2975 = arg1.method585(-1, field4417[13]);
                class597.field8642 = arg1.method585(-1, field4417[20]);
                class719.field10518 = arg1.method585(-1, field4417[23]);
                class239.field3683 = arg1.method585(arg0 - 1, field4417[25]);
                class544.field8009 = arg1.method585(-1, field4417[12]);
                class68.field967 = arg1.method585(-1, field4417[11]);
                class182.field2899 = arg1.method585(-1, field4417[19]);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4417[17] + arg0 + ',' + (arg1 == null ? field4417[3] : field4417[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)V")
    public static void method2360(int arg0) {
        try {
            field4407 = null;
            if (arg0 >= -25) {
                field4407 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4417[26] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
    public final void method2361(byte arg0) {
        try {
            field4412++;
            if (arg0 <= 30) {
                field4407 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4417[27] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZB)V")
    public final void method2362(boolean arg0, byte arg1) {
        try {
            field4414++;
            if (arg1 < -20) {
                boolean var8 = true;
                class175[] var3 = this.field4411;
                for (int var4 = 0; var4 < var3.length; var4++) {
                    class175 var5 = var3[var4];
                    if (var5 != null) {
                        var5.method1618(true, var8 || this.field4404);
                    }
                }
                this.field4404 = false;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4417[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(JI)Z")
    public final boolean method2363(long arg0, int arg1) {
        try {
            field4403++;
            if (arg1 == 31960) {
                return class712.method5167(-2334) >= (long) this.field4406.field5112 + arg0;
            } else {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4417[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Leo;Lfc;)V")
    public class275(class312 arg0, class270 arg1) {
        try {
            this.field4406 = arg0;
            this.field4411 = new class175[this.field4406.field5107.length];
            for (int var3 = 0; var3 < this.field4411.length; var3++) {
                this.field4411[var3] = arg1.method2331(-8662, this.field4406.field5107[var3]);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4417[8] + (arg0 == null ? field4417[3] : field4417[4]) + ',' + (arg1 == null ? field4417[3] : field4417[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method2364(byte arg0, String arg1, int arg2) {
        try {
            if (arg0 < -7) {
                field4415++;
                class551 var3 = class380.method3113(-120, (long) arg2, 3);
                var3.method4086(76);
                var3.field8072 = arg1;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4417[5] + arg0 + ',' + (arg1 == null ? field4417[3] : field4417[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2365(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2366(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 105;
                    break;
                case 3:
                    var10005 = 124;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
