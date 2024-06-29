import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class440 extends class40 {

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    private int field6294 = 4096;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    private int field6293 = 4096;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    private int field6290 = 4096;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Lpp;")
    public static class222 field6296 = null;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "J")
    public static long field6299;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "[Lao;")
    public static class158[] field6295;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "[[B")
    public static byte[][] field6292;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "[[I")
    public static int[][] field6288;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILlf;)V", line = 8)
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (arg1 > 79) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        this.field6294 = arg2.method798(false);
                    }
                } else {
                    this.field6290 = arg2.method798(false);
                }
            } else {
                this.field6293 = arg2.method798(false);
            }
            ++field6287;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lsf;)V", line = 58)
    public static final void method2741(class306 arg0) {
        for (int var1 = arg0.field4465; var1 <= arg0.field4460; ++var1) {
            for (int var2 = arg0.field4462; var2 <= arg0.field4471; ++var2) {
                class74 var3 = class385.field5449[arg0.field4464][var1][var2];
                if (var3 != null) {
                    class353 var4 = var3.field970;
                    class353 var5 = null;
                    while (var4 != null) {
                        if (var4.field5125 == arg0) {
                            if (var5 != null) {
                                var5.field5127 = var4.field5127;
                            } else {
                                var3.field970 = var4.field5127;
                            }
                            var4.method2311(0);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field5127;
                    }
                    var3.field956 = 0;
                    for (class353 var6 = var3.field970; var6 != null; var6 = var6.field5127) {
                        var3.field956 = (byte) (var3.field956 | var6.field5119);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 117)
    public static void method2742(int arg0) {
        if (arg0 > -110) {
            field6292 = null;
        }
        field6296 = null;
        field6288 = null;
        field6295 = null;
        field6292 = null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 243)
    public class440() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lkn;IIZLvq;)V", line = 143)
    public static final void method2743(class442 arg0, int arg1, int arg2, boolean arg3, class269 arg4) {
        class301.field4388.method2755(0);
        ++field6298;
        if (!arg3) {
            method2742(58);
        }
        if (!class312.field4611) {
            for (class194 var5 = (class194) arg0.method2752(-111); var5 != null; var5 = (class194) arg0.method2754(-1)) {
                class297 var6 = class379.method2417(3144, var5.field2794);
                if (class239.method1628(true, var6)) {
                    boolean var7 = class175.method1238(var6, arg1, arg4, arg2, (byte) 16, var5);
                    if (var7) {
                        class120.method735((byte) 85, var5, arg4, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[[I", line = 176)
    public final int[][] method112(int arg0, int arg1) {
        ++field6291;
        int[][] var3 = super.field555.method2070(0, arg1);
        if (arg0 != 1) {
            field6295 = null;
        }
        if (super.field555.field4489) {
            int[][] var4 = this.method261(0, 28552, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class410.field5886; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field6293 * var12 >> 12;
                    var9[var11] = this.field6290 * var13 >> 12;
                    var10[var11] = this.field6294 * var14 >> 12;
                } else {
                    var8[var11] = this.field6293;
                    var9[var11] = this.field6290;
                    var10[var11] = this.field6294;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)Lao;", line = 246)
    public static final class158 method2744(int arg0) {
        ++field6289;
        if (class241.field3561.length > class226.field3374) {
            return class241.field3561[class226.field3374++];
        } else {
            return arg0 != -21860 ? null : null;
        }
    }
}
