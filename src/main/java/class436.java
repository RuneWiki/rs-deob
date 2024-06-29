import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class436 {

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    private int field6034 = 0;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "[Lsf;")
    public class28[] field6018;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public int field6022;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field6025 = -1;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "F")
    public static float field6017;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "J")
    private long field6029;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "Lsf;")
    private class28 field6031;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "Lsf;")
    private class28 field6035;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "Lek;")
    public static class540 field6033;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Lsf;")
    public final class28 method2499(int arg0) {
        this.field6034 = 0;
        if (arg0 >= -7) {
            return null;
        } else {
            field6019++;
            return this.method2503(0);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I[Lsf;)I")
    public final int method2500(int arg0, class28[] arg1) {
        field6027++;
        int var3 = 0;
        if (arg0 != 23557) {
            this.method2500(-118, null);
        }
        for (int var4 = 0; var4 < this.field6022; var4++) {
            class28 var5 = this.field6018[var4];
            for (class28 var6 = var5.field276; var6 != var5; var6 = var6.field276) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/String;Lpea;Z)Lvl;")
    public static final class139 method2501(int arg0, String arg1, class641 arg2, boolean arg3) {
        field6032++;
        if (arg3) {
            field6033 = null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class641.field8799, 0);
        if (class641.field8799[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class139(arg2, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZIILuca;)V")
    public static final void method2502(int arg0, boolean arg1, int arg2, int arg3, class252 arg4) {
        field6030++;
        class9 var5 = (class9) class638.field8704.method374((byte) 67);
        if (arg1) {
            field6017 = 0.4181216F;
        }
        while (var5 != null) {
            if (var5.field105 == arg0 && (arg2 << 9) == var5.field89 && arg3 << 9 == var5.field102 && var5.field92.field3456 == arg4.field3456) {
                if (var5.field106 != null) {
                    class285.field3866.method3203(var5.field106);
                    var5.field106 = null;
                }
                if (var5.field82 != null) {
                    class285.field3866.method3203(var5.field82);
                    var5.field82 = null;
                }
                var5.method175(30604);
                return;
            }
            var5 = (class9) class638.field8704.method372(-20740);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Lsf;")
    public final class28 method2503(int arg0) {
        field6024++;
        if (this.field6034 > arg0 && this.field6018[this.field6034 - 1] != this.field6035) {
            class28 var2 = this.field6035;
            this.field6035 = var2.field276;
            return var2;
        }
        while (this.field6034 < this.field6022) {
            class28 var3 = this.field6018[this.field6034++].field276;
            if (this.field6018[this.field6034 - 1] != var3) {
                this.field6035 = var3.field276;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(JILsf;)V")
    public final void method2504(long arg0, int arg1, class28 arg2) {
        if (arg2.field275 != null) {
            arg2.method175(30604);
        }
        field6028++;
        class28 var5 = this.field6018[(int) (arg0 & (long) (this.field6022 - 1))];
        arg2.field276 = var5;
        arg2.field275 = var5.field275;
        arg2.field275.field276 = arg2;
        arg2.field272 = arg0;
        int var6 = 42 / ((arg1 - 58) / 45);
        arg2.field276.field275 = arg2;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)I")
    public final int method2505(int arg0) {
        field6013++;
        if (arg0 != -5643) {
            this.method2499(82);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field6022; var3++) {
            class28 var4 = this.field6018[var3];
            for (class28 var5 = var4.field276; var5 != var4; var5 = var5.field276) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IJ)Lsf;")
    public final class28 method2506(int arg0, long arg1) {
        this.field6029 = arg1;
        field6023++;
        if (arg0 < 5) {
            field6012 = -106;
        }
        class28 var4 = this.field6018[(int) ((long) (this.field6022 - 1) & arg1)];
        for (this.field6031 = var4.field276; this.field6031 != var4; this.field6031 = this.field6031.field276) {
            if (this.field6031.field272 == arg1) {
                class28 var5 = this.field6031;
                this.field6031 = this.field6031.field276;
                return var5;
            }
        }
        this.field6031 = null;
        return null;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)Lsf;")
    public final class28 method2507(int arg0) {
        field6026++;
        if (this.field6031 == null) {
            return null;
        }
        class28 var2 = this.field6018[(int) (this.field6029 & (long) (this.field6022 + arg0))];
        while (this.field6031 != var2) {
            if (this.field6031.field272 == this.field6029) {
                class28 var3 = this.field6031;
                this.field6031 = this.field6031.field276;
                return var3;
            }
            this.field6031 = this.field6031.field276;
        }
        this.field6031 = null;
        return null;
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)I")
    public final int method2508(int arg0) {
        field6021++;
        if (arg0 != 0) {
            field6017 = -0.26824525F;
        }
        return this.field6022;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method2509(byte arg0) {
        field6033 = null;
        if (arg0 >= -121) {
            field6017 = -0.68146646F;
        }
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V")
    public final void method2510(int arg0) {
        field6014++;
        for (int var2 = 0; var2 < this.field6022; var2++) {
            class28 var3 = this.field6018[var2];
            while (true) {
                class28 var4 = var3.field276;
                if (var3 == var4) {
                    break;
                }
                var4.method175(30604);
            }
        }
        if (arg0 != -1) {
            this.field6022 = -15;
        }
        this.field6031 = null;
        this.field6035 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I[I)Ljava/lang/String;")
    public static final String method2511(int arg0, int[] arg1) {
        field6016++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class520.field7217;
        for (int var4 = arg0; var4 < arg1.length; var4++) {
            class363 var5 = class559.field7615.method2314(64, arg1[var4]);
            if (var5.field5231 != -1) {
                class424 var6 = (class424) class326.field4747.method3134((long) var5.field5231, -53);
                if (var6 == null) {
                    class366 var7 = class366.method2245(class39.field510, var5.field5231, 0);
                    if (var7 != null) {
                        var6 = class9.field103.method1951(var7, true);
                        class326.field4747.method3130((long) var5.field5231, true, var6);
                    }
                }
                if (var6 != null) {
                    class367.field5293[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V")
    public class436(int arg0) {
        this.field6018 = new class28[arg0];
        this.field6022 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class28 var3 = this.field6018[var2] = new class28();
            var3.field276 = var3;
            var3.field275 = var3;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(JIIIZ)Ljava/lang/String;")
    public static final String method2512(long arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6015++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        if (arg1 != -8426) {
            method2511(-37, null);
        }
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (48 - (((int) arg0 * 10) - var13)));
            if (arg0 == 0L) {
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
    }
}
