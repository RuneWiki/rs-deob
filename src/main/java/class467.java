import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class467 extends class134 {

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    private int field7167 = -1;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field7179 = new String[] { method3610(method3609("\u000f\u0013:Ro")), method3610(method3609("\u0015\u000fx}")), method3610(method3609("\u0000T:?:")), method3610(method3609("\u000f\u0013:Po")), method3610(method3609("\u000f\u0013:Uo")), method3610(method3609("\u000f\u0013:Yo")), method3610(method3609("\u000f\u0013:Vo")), method3610(method3609("\u000f\u0013:So")) };

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "Lvn;")
    public static class330 field7166 = new class330(88, 0);

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Z")
    public static boolean field7173 = false;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "[[F")
    public static float[][] field7176 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "[I")
    public static int[] field7177 = new int[8];

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "B")
    private byte field7168;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "F")
    public static float field7174;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "J")
    public static long field7175;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V", line = 5)
    public static void method3605(int arg0) {
        try {
            field7166 = null;
            int var1 = -97 / ((arg0 + 1) / 42);
            field7177 = null;
            field7176 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7179[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([[FI[[S)[[S", line = 18)
    public static final short[][] method3606(float[][] arg0, int arg1, short[][] arg2) {
        try {
            field7169++;
            for (int var3 = 0; var3 < arg0.length; var3++) {
                for (int var4 = 0; var4 < arg2[var3].length; var4++) {
                    arg2[var3][var4] = (short) ((int) (arg0[var3][var4] * 16383.0F));
                }
            }
            if (arg1 != 16383) {
                field7177 = null;
            }
            return arg2;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7179[6] + (arg0 == null ? field7179[1] : field7179[2]) + ',' + arg1 + ',' + (arg2 == null ? field7179[1] : field7179[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB[I[II)V", line = 48)
    public static final void method3607(int arg0, byte arg1, int[] arg2, int[] arg3, int arg4) {
        try {
            if (arg0 < arg4) {
                int var5 = (arg0 + arg4) / 2;
                int var6 = arg0;
                int var7 = arg2[var5];
                arg2[var5] = arg2[arg4];
                arg2[arg4] = var7;
                int var8 = arg3[var5];
                arg3[var5] = arg3[arg4];
                arg3[arg4] = var8;
                int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
                for (int var10 = arg0; var10 < arg4; var10++) {
                    if (arg2[var10] < var7 + (var10 & var9)) {
                        int var11 = arg2[var10];
                        arg2[var10] = arg2[var6];
                        arg2[var6] = var11;
                        int var12 = arg3[var10];
                        arg3[var10] = arg3[var6];
                        arg3[var6++] = var12;
                    }
                }
                arg2[arg4] = arg2[var6];
                arg2[var6] = var7;
                arg3[arg4] = arg3[var6];
                arg3[var6] = var8;
                method3607(arg0, (byte) 114, arg2, arg3, var6 - 1);
                method3607(var6 + 1, (byte) 123, arg2, arg3, arg4);
            }
            if (arg1 >= 112) {
                field7172++;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field7179[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7179[1] : field7179[2]) + ',' + (arg3 == null ? field7179[1] : field7179[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB[BIII)V", line = 106)
    public static final void method3608(int arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        try {
            field7165++;
            if (arg4 < arg0) {
                arg5 += arg4;
                int var14 = arg0 - arg4 >> 2;
                if (arg1 == 1) {
                    while (true) {
                        var14--;
                        if (var14 < 0) {
                            var14 = arg0 - arg4 & 0x3;
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                arg2[arg5++] = 1;
                            }
                        }
                        int var8 = arg5 + 1;
                        arg2[arg5] = 1;
                        int var9 = var8 + 1;
                        arg2[var8] = 1;
                        int var10 = var9 + 1;
                        arg2[var9] = 1;
                        arg5 = var10 + 1;
                        arg2[var10] = 1;
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7179[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7179[1] : field7179[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lsca;I)V", line = 146)
    public final void method100(class47 arg0, int arg1) {
        try {
            arg0.method476(this.field7168, this.field7167, -19299);
            field7171++;
            if (arg1 >= -81) {
                this.method102(-64, null);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7179[0] + (arg0 == null ? field7179[1] : field7179[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILwq;)V", line = 158)
    public final void method102(int arg0, class176 arg1) {
        try {
            this.field7167 = arg1.method1687((byte) -116);
            field7170++;
            int var3 = 71 / ((83 - arg0) / 34);
            this.field7168 = arg1.method1672(102);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7179[4] + arg0 + ',' + (arg1 == null ? field7179[1] : field7179[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3609(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x47);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3610(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 71;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
