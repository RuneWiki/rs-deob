import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class316 extends class422 {

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field4599 = -1;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "S")
    public static short field4601 = 32767;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "[I")
    public static int[] field4603;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIIIII)I")
    public static final int method2036(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg5;
            arg5 = var7;
        }
        int var8 = arg4 & 0x3;
        field4600++;
        if (arg1 < 126) {
            method2039(null, null, -19, 43);
        }
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 7 + 1 - (arg0 + arg2);
        } else {
            return 1 + 7 - arg5 - arg6;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method2037(int arg0) {
        field4603 = null;
        if (arg0 != 26764) {
            method2036(126, (byte) 53, 43, 109, 32, 32, 106);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Ljv;")
    public final class606 method472(byte arg0) {
        if (arg0 == -110) {
            field4598++;
            return class226.field2935;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public static final void method2038(int arg0) {
        field4602++;
        if (arg0 != 0) {
            field4601 = 49;
        }
        if (class571.field7908 != null) {
            class571.field7908.method3596(arg0 + 15821);
        }
        if (class304.field4096 != null) {
            class304.field4096.method3596(15821);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lmc;[BII)Lwaa;")
    public static final class536 method2039(class381 arg0, byte[] arg1, int arg2, int arg3) {
        field4604++;
        if (arg1 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramRawARB(arg3, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class607.field8284, 0);
        if (class607.field8284[0] == -1) {
            OpenGL.glBindProgramARB(arg3, arg2);
            return new class536(arg0, arg3, var4);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Loa;Lbo;IIIII)V")
    public static final void method2040(class689 arg0, class631 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class87.field1079 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class149.field1872) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class334.field4887 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class651 var15 = class145.field1841[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class397.field5666[var12].method150(var13, var14) + class397.field5666[var12].method150(var13 + 1, var14) + class397.field5666[var12].method150(var13, var14 + 1) + class397.field5666[var12].method150(var13 + 1, var14 + 1)) / 4 - (class397.field5666[arg2].method150(arg3, arg4) + class397.field5666[arg2].method150(arg3 + 1, arg4) + class397.field5666[arg2].method150(arg3, arg4 + 1) + class397.field5666[arg2].method150(arg3 + 1, arg4 + 1)) / 4;
                                    class142 var17 = var15.field9220;
                                    class142 var18 = var15.field9224;
                                    if (var17 != null && var17.method135(0)) {
                                        arg1.method133(var17, var16, arg0, (var13 - arg3) * class33.field327 + (1 - arg5) * class49.field656, -8763, (var14 - arg4) * class33.field327 + (1 - arg6) * class49.field656, var7);
                                    }
                                    if (var18 != null && var18.method135(0)) {
                                        arg1.method133(var18, var16, arg0, (var13 - arg3) * class33.field327 + (1 - arg5) * class49.field656, -8763, (var14 - arg4) * class33.field327 + (1 - arg6) * class49.field656, var7);
                                    }
                                    for (class82 var19 = var15.field9228; var19 != null; var19 = var19.field1024) {
                                        class293 var20 = var19.field1027;
                                        if (var20 != null && var20.method135(0) && (var20.field3921 == var13 || var8 == var13) && (var20.field3920 == var14 || var10 == var14)) {
                                            int var21 = var20.field3928 + 1 - var20.field3921;
                                            int var22 = var20.field3923 + 1 - var20.field3920;
                                            arg1.method133(var20, var16, arg0, (var20.field3921 - arg3) * class33.field327 + (var21 - arg5) * class49.field656, -8763, (var20.field3920 - arg4) * class33.field327 + (var22 - arg6) * class49.field656, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(ILrn;Lhv;III)V")
    public class316(int arg0, class380 arg1, class97 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4605 = arg5;
    }
}
