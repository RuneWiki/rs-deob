import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class200 extends class264 {

    @OriginalMember(owner = "client!dk", name = "fb", descriptor = "I")
    private int field3171 = 4096;

    @OriginalMember(owner = "client!dk", name = "mb", descriptor = "I")
    private int field3178 = 4096;

    @OriginalMember(owner = "client!dk", name = "kb", descriptor = "I")
    private int field3176 = 4096;

    @OriginalMember(owner = "client!dk", name = "hb", descriptor = "[J")
    public static long[] field3173 = new long[32];

    @OriginalMember(owner = "client!dk", name = "jb", descriptor = "Lma;")
    public static class5 field3175 = class12.method119(" )2> <col=00ffff>", (byte) 77);

    @OriginalMember(owner = "client!dk", name = "nb", descriptor = "I")
    public static int field3179 = 0;

    @OriginalMember(owner = "client!dk", name = "rb", descriptor = "Lma;")
    public static class5 field3183 = class12.method119("null", (byte) 57);

    @OriginalMember(owner = "client!dk", name = "sb", descriptor = "Lrc;")
    public static class210 field3184 = new class210(5000);

    @OriginalMember(owner = "client!dk", name = "tb", descriptor = "[I")
    public static int[] field3185 = new int[5];

    @OriginalMember(owner = "client!dk", name = "gb", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!dk", name = "ib", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!dk", name = "lb", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!dk", name = "ob", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!dk", name = "pb", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!dk", name = "qb", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([IIIIII)V", line = 5)
    public static final void method1311(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class198 var6 = class43.field646[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class96 var7 = var6.field3161;
        if (var7 != null) {
            int var8 = var7.field1435;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class220 var10 = var6.field3154;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3569;
        int var12 = var10.field3565;
        int var13 = var10.field3561;
        int var14 = var10.field3577;
        int[] var15 = class23.field401[var11];
        int[] var16 = class284.field4812[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIII)Z", line = 97)
    public static final boolean method1312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class74.field1167[arg0][var8][var9] == -class172.field2645) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class208.field3304[arg0][arg1][arg3] + arg5;
            if (!class232.method1653(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class232.method1653(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class232.method1653(var10, var12, var14)) {
                return false;
            } else if (class232.method1653(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class24.method188(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class232.method1653(var6 + 1, class208.field3304[arg0][arg1][arg3] + arg5, var7 + 1) && class232.method1653(var6 + 128 - 1, class208.field3304[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class232.method1653(var6 + 128 - 1, class208.field3304[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class232.method1653(var6 + 1, class208.field3304[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(BI)[[I", line = 161)
    public final int[][] method138(byte arg0, int arg1) {
        int var3 = -67 / ((-arg0 - 43) / 55);
        int[][] var4 = this.field4524.method1462(-15077, arg1);
        if (this.field4524.field3506) {
            int[][] var5 = this.method1817(-87, 0, arg1);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var5[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class226.field3716; var12++) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var10[var12];
                if (var13 == var14 && var14 == var15) {
                    var8[var12] = this.field3178 * var13 >> 12;
                    var9[var12] = this.field3176 * var14 >> 12;
                    var11[var12] = this.field3171 * var15 >> 12;
                } else {
                    var8[var12] = this.field3178;
                    var9[var12] = this.field3176;
                    var11[var12] = this.field3171;
                }
            }
        }
        field3174++;
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)I", line = 219)
    public static final int method1313(int arg0) {
        if (arg0 != 0) {
            field3179 = 101;
        }
        field3177++;
        if (client.field1747) {
            return 0;
        } else if (class152.method956((byte) -86)) {
            return class264.field4522 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZIZZ)Lje;", line = 239)
    public static final class158 method1314(boolean arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        field3172++;
        if (arg4) {
            return (class158) null;
        }
        class211 var5 = null;
        if (class272.field4653 != null) {
            var5 = new class211(arg2, class272.field4653, class98.field1471[arg2], 1000000);
        }
        return new class158(var5, class41.field619, arg2, arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V", line = 384)
    public class200() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILii;)V", line = 270)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg0 == 0) {
            this.field3178 = arg2.method1524((byte) 80);
        } else if (arg0 == 1) {
            this.field3176 = arg2.method1524((byte) 86);
        } else if (arg0 == 2) {
            this.field3171 = arg2.method1524((byte) 90);
        }
        if (arg1 >= -27) {
            field3184 = (class210) null;
        }
        field3181++;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V", line = 306)
    public static final void method1315(byte arg0) {
        int var1 = -42 % ((56 - arg0) / 49);
        field3180++;
        boolean var2 = false;
        while (!var2) {
            var2 = true;
            for (int var3 = 0; var3 < class282.field4794 - 1; var3++) {
                if (class104.field1554[var3] < 1000 && class104.field1554[var3 + 1] > 1000) {
                    var2 = false;
                    class5 var4 = class20.field344[var3];
                    class20.field344[var3] = class20.field344[var3 + 1];
                    class20.field344[var3 + 1] = var4;
                    class5 var5 = class118.field1786[var3];
                    class118.field1786[var3] = class118.field1786[var3 + 1];
                    class118.field1786[var3 + 1] = var5;
                    int var6 = class294.field4963[var3];
                    class294.field4963[var3] = class294.field4963[var3 + 1];
                    class294.field4963[var3 + 1] = var6;
                    int var7 = class240.field3989[var3];
                    class240.field3989[var3] = class240.field3989[var3 + 1];
                    class240.field3989[var3 + 1] = var7;
                    short var8 = class104.field1554[var3];
                    class104.field1554[var3] = class104.field1554[var3 + 1];
                    class104.field1554[var3 + 1] = var8;
                    long var9 = class213.field3392[var3];
                    class213.field3392[var3] = class213.field3392[var3 + 1];
                    class213.field3392[var3 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)V", line = 359)
    public static void method1316(byte arg0) {
        field3183 = null;
        field3173 = null;
        field3184 = null;
        if (arg0 != 110) {
            field3179 = -103;
        }
        field3175 = null;
        field3185 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZIII)V", line = 388)
    public static final void method1317(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field3182++;
        if (arg0 >= class57.field899 && arg1 <= class301.field5073 && class294.field4956 <= arg4 && class101.field1505 >= arg3) {
            class78.method540(arg4, arg0, 0, arg3, arg5, arg1);
        } else {
            class155.method995(arg0, arg1, arg3, arg5, arg4, 1004);
        }
        if (!arg2) {
            field3185 = (int[]) null;
        }
    }
}
