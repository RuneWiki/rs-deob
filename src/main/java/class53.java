import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class53 extends class518 {

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    private int field736 = 4096;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
    private int field742 = 4096;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    private int field739 = 4096;

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
    private int field743 = 409;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "[I")
    private int[] field744 = new int[3];

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field745 = new String[] { method567(method566("l6q,^")), method567(method566("yiqC\u000b")), method567(method566("l23\u0001")), method567(method566("l6q.^")), method567(method566("l6q/^")) };

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "[[I")
    public static int[][] field741 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (arg0 != 3) {
                            if (~arg0 == -5) {
                                int var5 = arg1.method5085(true);
                                this.field744[0] = class434.method3377(267386880, var5 << 4);
                                this.field744[1] = class434.method3377(var5, 65280) >> 4;
                                this.field744[2] = class434.method3377(var5, 255) >> 12;
                            }
                        } else {
                            this.field742 = arg1.method5116((byte) -108);
                        }
                    } else {
                        this.field739 = arg1.method5116((byte) -117);
                    }
                } else {
                    this.field736 = arg1.method5116((byte) -116);
                }
            } else {
                this.field743 = arg1.method5116((byte) -126);
            }
            if (arg2 != -3) {
                field741 = null;
            }
            ++field738;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field745[3] + arg0 + ',' + (arg1 != null ? field745[1] : field745[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[[I")
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field737;
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (super.field7575.field3416) {
                int[][] var4 = this.method3943(0, arg1, -23583);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class110.field1436; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field744[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (~var13 < ~this.field743) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field744[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~this.field743 > ~var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = var16 - this.field744[2];
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (this.field743 < var17) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field742 * var12 >> 12;
                                var9[var11] = this.field739 * var14 >> 12;
                                var10[var11] = this.field736 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            if (arg0 != 0) {
                field740 = -10;
            }
            return var3;
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field745[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(B)V")
    public static void method564(byte arg0) {
        try {
            if (arg0 != -39) {
                field740 = -64;
            }
            field741 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field745[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
    public class53() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([Lrfa;II)V")
    public static final void method565(class202[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class202 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field2970;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field2970 < (var7 & 1) + var6) {
                    class202 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method565(arg0, arg1, var4 - 1);
            method565(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method566(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 118);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method567(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 118;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
