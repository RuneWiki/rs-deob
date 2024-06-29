import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class751 {

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field10701;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field10703;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field10690;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[[I")
    public int[][] field10693;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public int field10692;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10704 = new String[] { method5444(method5443("\u0001\u00118?")), method5444(method5443("\t\u0011F9B")), method5444(method5443("\u001cJ\u0004{")), method5444(method5443("\u0001\u0011??")), method5444(method5443("\u0001\u0011<?")), method5444(method5443("\u0001\u0011;?")), method5444(method5443("\u0001\u0011)V\u0017")), method5444(method5443("\u0001\u0011:?")), method5444(method5443("\u0001\u0011T~Q\u001bKV?")), method5444(method5443("\u0001\u00119?")) };

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field10694 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    public static int[] field10698 = new int[2048];

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field10691;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field10695;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field10696;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field10697;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field10699;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field10700;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field10702;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method2477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method5436(int arg0, String arg1) {
        try {
            field10700++;
            if (arg1 == null) {
                return -1;
            }
            if (arg0 <= 61) {
                method5437((byte) -14, true, false, null, -42, null, 15);
            }
            for (int var2 = 0; var2 < class210.field3062; var2++) {
                if (arg1.equalsIgnoreCase(class591.field8497[var2])) {
                    return var2;
                }
            }
            return -1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10704[9] + arg0 + ',' + (arg1 == null ? field10704[2] : field10704[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method2470(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method2473(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class412 method2475(int arg0, int arg1, class412 arg2);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method2479(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method2469();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BZZLjava/lang/String;ILjava/lang/String;I)V")
    public static final void method5437(byte arg0, boolean arg1, boolean arg2, String arg3, int arg4, String arg5, int arg6) {
        try {
            class691.field9674.field700 = 1;
            field10695++;
            String var20 = arg3.toLowerCase();
            short[] var7 = new short[16];
            int var8 = -1;
            String var9 = null;
            if (arg4 != -1) {
                class573 var10 = class202.field2972.method611(false, arg4);
                if (var10 == null || var10.method4264((byte) 124) != arg2) {
                    return;
                }
                if (var10.method4264((byte) 93)) {
                    var9 = var10.field8298;
                } else {
                    var8 = var10.field8295;
                }
            }
            int var11 = 0;
            int var12 = 0;
            if (arg0 != -24) {
                field10698 = null;
            }
            while (var12 < class153.field1955.field5971) {
                class371 var13 = class153.field1955.method3237(var12, 0);
                if ((!arg1 || var13.field5431) && var13.field5386 == -1 && var13.field5427 == -1 && var13.field5369 == -1 && var13.field5381 == 0 && var13.field5421.toLowerCase().indexOf(var20) != -1) {
                    label139: {
                        if (arg4 != -1) {
                            if (arg2) {
                                if (!arg5.equals(var13.method2939(var9, arg4, arg0 ^ 0xFFFFFFDE))) {
                                    break label139;
                                }
                            } else if (arg6 != var13.method2934(-941655645, arg4, var8)) {
                                break label139;
                            }
                        }
                        if (var11 >= 250) {
                            class14.field186 = -1;
                            class694.field9694 = null;
                            return;
                        }
                        if (var11 >= var7.length) {
                            short[] var14 = new short[var7.length * 2];
                            for (int var15 = 0; var15 < var11; var15++) {
                                var14[var15] = var7[var15];
                            }
                            var7 = var14;
                        }
                        var7[var11++] = (short) var12;
                    }
                }
                var12++;
            }
            class694.field9694 = var7;
            class583.field8419 = 0;
            class14.field186 = var11;
            String[] var16 = new String[class14.field186];
            for (int var17 = 0; var17 < class14.field186; var17++) {
                var16[var17] = class153.field1955.method3237(var7[var17], arg0 + 24).field5421;
            }
            class714.method5173(arg0 - 1433, class694.field9694, var16);
            class691.field9674.method513((byte) 22);
            class691.field9674.field700 = 2;
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field10704[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10704[2] : field10704[1]) + ',' + arg4 + ',' + (arg5 == null ? field10704[2] : field10704[1]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method5438(int arg0) {
        try {
            field10698 = null;
            if (arg0 != 0) {
                field10698 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10704[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method2472(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lta;[I)V")
    public abstract void method2481(class330 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIZ)V")
    public static final void method5439(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            field10702++;
            int var5 = class214.field3132;
            if (!arg4) {
                field10694 = -33;
            }
            int var6 = class200.field2958;
            if (class212.field3119) {
                var5 += class784.method5647((byte) 105);
                var6 += class30.method328(-17233);
            }
            if (class737.field10501 == 1) {
                class392 var7 = class525.field7648[class544.field7953 / 100];
                var7.method3074(var5 - 8, var6 - 8);
                class232.method1925(var6 - 8, var5 + -8, var7.method1380() + var6 - 8, (var5 - -var7.method1378()) + -8, (byte) -50);
            }
            if (class737.field10501 == 2) {
                class392 var8 = class525.field7648[class544.field7953 / 100 + 4];
                var8.method3074(var5 - 8, var6 + -8);
                class232.method1925(var6 - 8, var5 + -8, var6 + (var8.method1380() - 8), var8.method1378() + -8 + var5, (byte) 90);
            }
            class396.method3095((byte) -126);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field10704[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I")
    public final int method5440(byte arg0, int arg1, int arg2) {
        try {
            field10699++;
            int var4 = arg1 >> this.field10692;
            int var5 = arg2 >> this.field10692;
            if (var4 < 0 || var5 < 0 || (this.field10701 - 1) < var4 || (this.field10703 - 1) < var5) {
                return 0;
            }
            int var6 = arg1 & this.field10690 - 1;
            if (arg0 != 15) {
                this.method2478(109, 94, 45);
            }
            int var7 = arg2 & this.field10690 - 1;
            int var8 = (this.field10690 - var6) * this.field10693[var4][var5] + this.field10693[var4 + 1][var5] * var6 >> this.field10692;
            int var9 = (this.field10690 - var6) * this.field10693[var4][var5 + 1] + this.field10693[var4 + 1][var5 + 1] * var6 >> this.field10692;
            return (this.field10690 - var7) * var8 + var7 * var9 >> this.field10692;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field10704[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/String;IIJZLjava/lang/String;IZIZIJ)V")
    public static final void method5441(int arg0, String arg1, int arg2, int arg3, long arg4, boolean arg5, String arg6, int arg7, boolean arg8, int arg9, boolean arg10, int arg11, long arg12) {
        try {
            field10697++;
            if (!class86.field1217 && class72.field1049 < 500) {
                int var18 = arg0 == arg3 ? class670.field9445 : arg0;
                class228 var15 = new class228(arg6, arg1, var18, arg11, arg7, arg12, arg2, arg9, arg5, arg10, arg4, arg8);
                class507.method3877(var15, (byte) -11);
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field10704[0] + arg0 + ',' + (arg1 == null ? field10704[2] : field10704[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field10704[2] : field10704[1]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method2471(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method2478(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method2480(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
    public final int method5442(int arg0, int arg1, int arg2) {
        try {
            field10691++;
            return arg2 == 31844 ? this.field10693[arg0][arg1] : 95;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10704[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method2474(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method2476(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
    public class751(int arg0, int arg1, int arg2, int[][] arg3) {
        try {
            this.field10701 = arg0;
            this.field10703 = arg1;
            int var5 = 0;
            while (arg2 > 1) {
                var5++;
                arg2 >>= 0x1;
            }
            this.field10690 = 0x1 << var5;
            this.field10693 = arg3;
            this.field10692 = var5;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10704[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10704[2] : field10704[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5443(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!s", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5444(char[] arg0) {
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
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
